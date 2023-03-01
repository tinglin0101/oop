import java.util.*;
public class A1103310_0224_2{
    public static void main(String[] args){
        int num;
        float num2;
        Scanner input = new Scanner (System.in);
        System.out.print  ( "輸入攝氏溫度:");
        num = input.nextInt();
        num2 = (float) num*9/5;
        num2 += 32;
        System.out.println  ( "華氏溫度:"+num2);
        
    }
}
