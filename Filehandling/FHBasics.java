package undefined.Filehandling;
import java.io.*;
import java.util.Scanner;

public class FHBasics {
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
       // String path="C:\\Users\\indu\\IdeaProjects\\InduApplication\\src\\undefined\\Filehandling\\FH.txt";
    //    File f=new File(path);
       // FileWriter fw=new FileWriter(f,true);
     //   BufferedWriter bw=new BufferedWriter(fw);
       // bw.write("hello world");
    //    System.out.println("Enter some words:");
        String data=sc.nextLine();
      //  bw.write(data);
        //bw.close();
      //  fw.close();

     //   File f=new File(path);
      //  FileReader fr=new FileReader(f);
      //  BufferedReader br=new BufferedReader(fr);
      //  int ch;
      //  while((ch=br.read())!=-1){
      //      System.out.print((char)ch);
      //  }
     //   br.close();;
       // fr.close();
        String path="C:\\Users\\indu\\IdeaProjects\\InduApplication\\src\\undefined\\Filehandling\\FH.txt";
String outpath="C:\\Users\\indu\\IdeaProjects\\InduApplication\\src\\undefined\\Filehandling\\FO.txt";
FileInputStream fis=new FileInputStream(path);
FileOutputStream fos=new FileOutputStream(outpath);
 int ch;
 while((ch=fis.read())!=-1){
     fos.write(ch);
 }
 fis.close();
 fos.close();


    }

}
