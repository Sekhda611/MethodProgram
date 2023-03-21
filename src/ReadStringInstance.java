import java.util.Scanner;
public class ReadStringInstance {
    Scanner sc;  //instance variable for the scanner type object
    //instance variable must be  called by the object
    //instance variable must be invoked by the object
    public static void main(String[] args) {
        ReadStringInstance rsi = new ReadStringInstance();
        rsi.sc = new Scanner(System.in);
        String str = rsi.readString();
        System.out.println(str);


    }
    public String readString(){
        System.out.print("Enter a string ");
        String str = sc.nextLine();
        return str;
    }
}
