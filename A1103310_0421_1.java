import java.io.*;
import java.util.*;
public class A1103310_0421_1{
    public static void main(String[] args) {
        System.out.print("input email:");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        if(str.matches("[a-zA-Z0-9.]+@[a-zA-Z0-9.].[a-zA-Z0-9.]+")){
            System.out.println("correct");
        }
        else{
            System.out.println("wrong");
        }
        //System.out.println(str.contains("@"));
    }

}