import java.util.*;
class Animal{
	
    String name;
	double height;
	int weight;
    int speed;

    Animal(String name, double height, int weight, int speed){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }
    

	void show(){
        System.out.printf("%s\t%f\t%d\t%d\t",this.name,this.height,this.weight,this.speed);
    }
    double distance(double x){
        return x*this.speed;
    }
    double distance(double x,double y){
        return x*y*this.speed;
    }
    public static void showinfo(){
        System.out.println("歡迎進入冰雪奇緣系統");
    }
}
class Human extends Animal{
    String gender;
    Human(String name, double height, int weight, int speed, String gender){
        super(name, height, weight, speed);
        this.gender = gender;
    }
    void show(){
        super.show();
        System.out.printf("%s\t",this.gender);
    }
}

class Snow extends Human{
    String ice;
    Snow(String name, double height, int weight, int speed, String gender, String ice){
        super(name, height, weight, speed, gender);
        this.ice=ice;

    }
    void show(){
        super.show();
        System.out.printf("%s",ice);
    }
    static double iceDistance(double z){
        return z*2;
    }
    
}
public class A1103310_0331{
    public static void main(String[] args){

        Animal.showinfo();
        Animal[] animals = new Animal[6];
        animals[0] = new Animal("雪寶", 1.1, 52, 100);
        animals[1] = new Animal("驢子", 1.5, 99, 200);
        animals[2] = new Human("阿克", 1.9, 80, 150,"男");
        animals[3] = new Human("漢斯", 1.8, 78, 130,"男");
        animals[4] = new Human("安那", 1.7, 48, 120,"女");
        animals[5] = new Snow("愛沙", 1.7, 50, 120,"女","yes");
        System.out.printf("name\theight\t\tweight\tspeed\tgender\tice\t\n");
        for(int i = 0;i < 6;i++){
			animals[i].show();
            System.out.println();
		}
        Scanner input = new Scanner(System.in);
        for(int i = 0;i < 6;i++){
            System.out.print("輸入x(時間):");
			int x = input.nextInt();
            System.out.print("輸入y(加速度):");
            double y = input.nextDouble();
            double distance;
            if(y == 0){
				distance = animals[i].distance(x);
			} 
            else {
				distance = animals[i].distance(x, y);
			}
            if(i==5){
                distance = Snow.iceDistance(distance);
            }
            System.out.println(animals[i].name + "距離= " + distance);
		}
    }
}