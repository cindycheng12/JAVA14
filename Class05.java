import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;

public class Class05 {
    public static void main(String[] args) throws IOError, IOException{
       char data[]=new char[120];
       FileReader fr;
        fr = new FileReader("c:\\JAVA\\donkey.txt");
        fr.skip(8);
        int num=fr.read(data);//記錄檔案有幾個字元
        
        String str=new String(data,0,num);
        System.out.println(str);    
    }
}
