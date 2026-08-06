package HungerBox;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

interface Orderable{
    public double getPrice();
    public String getDescription();
    public void prepare();

}
interface Discounts{
    public double applyDiscounts(double discounts);
}
abstract class MenuItem implements Orderable,Discounts{
    private String name;
    private double price;
    static int totalOrders=0;
    private String category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String getDescription(){
        return "The MenuItem" +getName()+"Of Price"+getPrice()+"And the category is"+getCategory();
    }
    @Override
    public double applyDiscounts(double discount){

        return discount/100*price;
    }

    @Override
    public abstract void prepare();

    public MenuItem(String name, double price, String category){
        this.name=name;
        this.price=price;
        this.category=category;
    }
}

class VegItem extends MenuItem{
    boolean isJain;

    public VegItem(String name,double price){
        super(name,price,"Veg");
        isJain=false;
    }
    public VegItem(String name,double price,boolean isJain){
        super(name,price,"Veg");
        this.isJain=isJain;
    }
    @Override
    public void prepare(){
        System.out.println("The veg item "+getName()+"is on the price "+getPrice());
        totalOrders++;
    }
}
class NonVegItems extends MenuItem{
    String meatType;
    public NonVegItems(String name,double price,String meatType){
        super(name,price,"NonVeg");
        this.meatType=meatType;
    }
    @Override
    public void prepare(){
        System.out.println("The Non veg Item"+getName()+"is on the price"+getPrice());
        totalOrders++;
    }
    @Override
    public String getDescription(){
        return super.getDescription()+meatType;
    }
}
class Orders{
    private int orderId;
    private String customerName;
    private static int orderCount=0;
    private String status;
    ArrayList<MenuItem> items;

    public Orders(String customerName){
        this.customerName=customerName;
        this.items=new ArrayList<MenuItem>();
        this.status="Order Placed";
        this.orderId=++orderCount;
    }
    void addItems(MenuItem items){
        this.items.add(items);
        System.out.println(items.getDescription()+"has been added");
    }
    void prepareOrder(){
        this.status="Preparing Order";
        for(MenuItem item:items){
            item.prepare();
        }
        this.status="Order Prepared";
    }
    double totalPrice(){
        double price=0;
        for (MenuItem item:items){
            price+=item.getPrice();
        }
        return price;
    }
    void generateBill(double discount){
        System.out.println("Generating Bill");
        double discountPrice= totalPrice()-discount;
        System.out.println("Final Total :"+discountPrice);
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    //private String customerName;

    public static int getOrderCount() {
        return orderCount;
    }

    public static void setOrderCount(int orderCount) {
        Orders.orderCount = orderCount;
    }

    //private static int orderCount=0;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    //private String status;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

}
class Restaurant {
    private String name;
    private String address;
    ArrayList<MenuItem> items;
    ArrayList<Orders> orders;

    public Restaurant(String name, String address){
        this.name=name;
        this.address=address;
        items=new ArrayList<>();
        orders=new ArrayList<>();
    }
    void addToMenu(MenuItem item){
        items.add(item);
    }
    void showMenu(){
        for (MenuItem item:items){
            System.out.println(item.getDescription());
        }
    }
    Orders placeOrder(String customerName){
        Orders o=new Orders(customerName);
        orders.add(o);
        return o;
    }
    void showOrder(){
        for (Orders o:orders){
            System.out.println("Order Placed by"+o.getCustomerName()+o.getOrderId()+o.getStatus());
        }
    }
    MenuItem getItem(int index){
        return items.get(index);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

   // public Restaurant(String name, String address){
   //     this.name=name;
   //     this.address=address;
  //  }
}
public class HungerBox {
    public static void main(String[] args){
        Restaurant r=new Restaurant("Bubble","sathya sai");
        r.addToMenu(new VegItem("Dosa",50.00));
        r.addToMenu(new VegItem("Idli",20.00,true));
        r.addToMenu(new NonVegItems("Chicken dum Biryani",200.00,"Chicken"));
        r.addToMenu(new NonVegItems("MuttonBiryani",300.00,"Sheep"));
        r.showMenu();


        System.out.println("Orders for Arun");

        Orders o=r.placeOrder("Indu");
        o.addItems(r.getItem(1));
        o.addItems(r.getItem(2));
        o.prepareOrder();
        r.showOrder();
        o.generateBill(20);



    }
}
