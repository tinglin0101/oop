import java.util.*;
import java.io.*;

class Student{
    int number;
    int eng;
    int math;
    int java;
    public void show(){
        System.out.printf("number:%d \neng:%d math:%d java:%d\n",this.number,this.eng,this.math,this.java);
    }
    public String write(){
        return "座號:"+this.number+" 數學成績:"+this.math+" 程式成績:"+this.java+" 英文成績:"+this.eng;
    }
    public int num(){
        return this.number;
    }

}
public class hw {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        Student[] stu = new Student[100];
        for(int i=0;i<100;i++){
            System.out.print("輸入學生座號(結束為-1):");
            int number = input.nextInt();
            stu[i] = new Student();
            stu[i].number = number;
            if(number==-1){
                break;
            }
            System.out.printf("%d號的英文成績:",number);
            stu[i].eng = input.nextInt();
            System.out.printf("%d號的數學成績:",number);
            stu[i].math = input.nextInt();
            System.out.printf("%d號的程式成績:",number);
            stu[i].java = input.nextInt();
        }       
        File f= new File("hw.txt");
        PrintWriter pw = new PrintWriter(new PrintWriter(f));
        for(int i=0;i<100;i++){
            if(stu[i].num()==-1){
                break;
            }
            pw.printf("%s\n",stu[i].write());
        }
        pw.flush();
        pw.close();
    }
}
