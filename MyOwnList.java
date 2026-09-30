package Generics;

class MyArrayList<T>{
    Object[] arr=new Object[20];
    int index=0;
    int size=0;

    void add(int value){
        arr[index++]=value;
        size++;
    }
    T get(int index){
        return (T) (arr[index]);
    }
}
public class MyOwnList {
    public static void main(String[] args){
        MyArrayList<Integer>MA=new MyArrayList<>();
        MA.add(1);
        MA.add(2);
        MA.add(3);

        for (int i=0;i<MA.size;i++){
            System.out.println(MA.get(i));
        }

    }
}
