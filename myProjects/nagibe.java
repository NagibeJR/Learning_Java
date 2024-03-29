package myProjects;
import java.util.Scanner;

public class nagibe{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Write your name: ");
        String name = scan.next();
        System.out.print ("Wrile your age: ");
        int age = scan.nextInt();
        if (age > 0 && age < 12){
        System.out.println(name+", you are child.");
        }
        else if (age >= 12 && age < 18){
            System.out.println(name+", you are a teenager.");
        }
        else if (age >= 18 && age < 50 ){
            System.out.println(name+", you are an adult.");
        }
        else if (age >= 50 && age < 100){
            System.out.println(name+", you are old.");
        }
        else if ( age >= 100){
            System.out.println(name+", you are jurassic");
        }
        else if (age <= 0) {
            System.out.println(name+", you weren't even born");
        }
       scan.close();
    }
}