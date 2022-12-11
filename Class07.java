import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Class07 {
    public static void main(String[] args) throws IOException{
        String str;
        int count=0;
        FileReader fr= new FileReader("c:\\JAVA\\donkey.txt");
        BufferedReader bfr=new BufferedReader(fr); //緩衝區處理
        while ((str=bfr.readLine())!=null){
            if (count==1) {  //正在讀第二列
                bfr.skip(14); //跳過14(幾個)字 //判斷到第幾列就不輸出               
            }
            System.out.println(str);
            count++; //算到第幾行 
        }
        fr.close();//關檔
    }
}