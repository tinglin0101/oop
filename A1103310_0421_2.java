import java.io.*;
import java.util.*;
public class A1103310_0421_2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("輸入日期(/分隔)");
        String date = input.nextLine();
        if(date.matches("[0-9]{4}/[0-9]{1,}/[0-9]{1,}")){
            System.out.printf("年:%s\n月:%s\n日:%s\n",date.substring(0,3),date.substring(5,7),date.substring(8,10));
        }
        else if(date.matches("[0-9]{1,}/[0-9]{1,}/[0-9]{4}")){
            System.out.printf("年:%s\n月:%s\n日:%s\n",date.substring(6,10),date.substring(0,2),date.substring(3,5));

        }
        else{
            System.out.println("格式錯誤");
        }
    }
}