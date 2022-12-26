
import java.io.*;
public class Class08
{
   public static void main(String args[]) throws IOException
   {
      FileInputStream fi=new FileInputStream("c:\\Java\\aaa.txt");
      FileInputStream fa=new FileInputStream("c:\\Java\\bbb.txt");
      FileOutputStream fo=new FileOutputStream("c:\\Java\\ccc.gif");

      byte data[]=new byte[fi.available()];  // 建立byte型態的陣列data
      byte data2[]=new byte[fa.available()];  // 建立byte型態的陣列data2
      fi.read(data);       // 將文檔讀入data陣列
      fa.read(data2);

      fo.write(data);      // 將data陣列裡的資料寫入新檔
      fo.write(data2);

      fi.close();
      fa.close();
      fo.close();
   }
}
