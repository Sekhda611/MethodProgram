//package MethodProgram;
import java.util.Scanner;
public class StringMehod {
    public static void main(String[] args){
        //String str = StringMehod.readString();
        System.out.println("output is " + readString());
    }
    public static String readString(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = input.nextLine();
        return str;
    }
}
