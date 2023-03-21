import java.util.Scanner;
public class ReadStringStaticScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        readString(sc);
        System.out.println("output is :" +  readString(sc));

    }
    public static String readString(Scanner input){
        System.out.print("Enter a String :");
        String str = input.nextLine();
        return str;
    }
}
