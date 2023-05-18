import java.util.Scanner;
class Timer extends Thread{
    Eating e;
    public Timer (Eating e){
        this.e=e;
    }
    public void run(){
        try{
            e.eat();
            this.sleep(3000);
        }
        catch(InterruptedException e){
            ;
        }
    }
}

class Eating{
    static int porkDump = 5000;
    static int beefDump = 3000;
    static int VegeDump = 1000;
    int type;
    int amount;
    int num;
    public Eating(int num,int type,int amount){
        this.num=num;
        this.type=type;
        this.amount=amount;
    }
    public synchronized void eat(){
        if(setting.state==0){
            System.out.println("---------\n下一位\n---------\n");
            System.out.printf("剩餘:\n豬肉水餃%d份\n牛肉水餃%d份\n蔬菜水餃%d份\n---------\n",porkDump,beefDump,VegeDump);

        }
        if(porkDump<10 && VegeDump<10 && beefDump<10){
            System.out.println("全部售完");
            System.exit(0);
        }
        
    }
    public void start(){
        
            System.out.printf("第%d位:",num);
            if(this.type==0){
                if(this.amount>porkDump){
                    System.out.printf("豬肉水餃不足%d份，請重新點餐\n",this.amount);
                    setting.state=1;
                }
                else{
                    porkDump-=this.amount;
                    System.out.printf("購買豬肉水餃%d份\n",this.amount);
                }
            }
            else if(this.type==1){
                if(this.amount>beefDump){
                    System.out.printf("牛肉水餃不足%d份，請重新點餐\n",this.amount);
                    setting.state=1;
                }
                else{
                    beefDump-=this.amount;
                    System.out.printf("購買牛肉水餃%d份\n",this.amount);
                }
            }
            else if(this.type==2){
                if(this.amount>VegeDump){
                    System.out.printf("蔬菜水餃不足%d份，請重新點餐\n",this.amount);
                    setting.state=1;
                }
                else{
                    VegeDump-=this.amount;
                    System.out.printf("購買蔬菜水餃%d份\n",this.amount);
                }
            
        }
        Timer t = new Timer(this);
        t.run();
    }
}

class setting{
    static int state = 0;
}
public class du2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("輸入客人數:");
        int num = input.nextInt();
        for(int i=0;i<num;i++){
           
            int type =(int)(Math.random()*3);
            int amount =(int)(Math.random()*40)+11;
            Eating e = new Eating(i+1,type,amount);
            e.start();
            if(setting.state==1){
                i-=1;
                setting.state=0;
            }
            
        }
    }
}
