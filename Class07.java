import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Class07 {
    public static void main(String[] args) throws IOException{
        String str;
        int count=0;
        FileReader fr= new FileReader("c:\\JAVA\\donkey.txt");
        BufferedReader bfr=new BufferedReader(fr); //�w�İϳB�z
        while ((str=bfr.readLine())!=null){
            if (count==1) {  //���bŪ�ĤG�C
                bfr.skip(14); //���L14(�X��)�r //�P�_��ĴX�C�N����X               
            }
            System.out.println(str);
            count++; //���ĴX�� 
        }
        fr.close();//����
    }
}