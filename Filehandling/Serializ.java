package undefined.Filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serial;
import java.io.*;
import java.io.IOException;

public class Serializ implements Serializable {
    int id;
    String name;
    Serializ(int id,String name){
        this.id=id;
        this.name=name;

    }
    void display(){
        System.out.println(id+" "+name);
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException{
       Serializ s=new Serializ(1,"Indu");
      // s.display();
      //  FileOutputStream fo=new FileOutputStream("C:\\Users\\indu\\IdeaProjects\\InduApplication\\src\\undefined\\Filehandling\\ser.txt");
    //    ObjectOutputStream oos=new ObjectOutputStream(fo);
     //   oos.writeObject(s);
      //  oos.close();
      //  fo.close();

        FileInputStream fis=new FileInputStream("C:\\Users\\indu\\IdeaProjects\\InduApplication\\src\\undefined\\Filehandling\\ser.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Serializ res=(Serializ) ois.readObject();
        res.display();
        ois.close();
        fis.close();

    }

}
