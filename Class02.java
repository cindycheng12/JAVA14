import java.util.Scanner;

public class Class02 {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        String str; //處理的字串
        System.out.print("輸入字串");
        str=scn.nextLine();  //一行
        System.out.println("轉換成大寫:"+str.toUpperCase()); //str.toUpperCase() 大寫的函數
    }
}
