package ArrayDemo;
import java.util.Arrays;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int [] randomName = new int[4];
        randomName [0] = 1;
        randomName [1] = 2;
        randomName[2] = 3;
        randomName[3] = 4;
        System.out.println(randomName);
        System.out.println(Arrays.toString(randomName));
        for (int i = 0; i < randomName.length; i++){
            System.out.print(randomName[i] + " ");
        }
        System.out.println();
        //for each loop or enhanced for loop
        for(int number: randomName){
            System.out.print(number + " ");
        }
        //[1, 2, 3, 4]
        System.out.println();
        System.out.print("[");
        for (int i = 0; i < randomName.length; i++ ){
            if ( i != randomName.length -1) {
                System.out.print(randomName[i] + ", ");
            }
            else{
                System.out.print(randomName[i]);
            }

        }
        System.out.print("]");
    }
}
