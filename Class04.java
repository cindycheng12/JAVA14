import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;

public class Class04 {
    public static void main(String[] args) throws IOError{
       char data[]=new char[120];
       FileReader fr;
        fr = new FileReader("c:\\JAVA\\donkey.txt");
        int num=fr.read(data);//記錄檔案有幾個字元
        String str=new String(data,0,num);
        System.out.println("字元數:"+num);
        System.out.println(str);

    
    }
}
