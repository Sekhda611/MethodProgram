package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        arr[0] = 6;
        ArrayList<Integer> aList = new ArrayList<Integer>();
        aList.add(5);
        aList.add(10);
        ///aList.add(15);
        //aList.add("strawberry");

        System.out.println(aList);
        System.out.println( Arrays.toString(aList.toArray()));
        String[] fruits = {"banana", "apple", "grapes"};

        List<String> fruitList = Arrays.asList(fruits);
        int[] arrList = {1, 2, 3};
        //List<Integer> nList = Arrays.asList() // type mismatch so this won't work
        List<Integer> nList =  new ArrayList<Integer>();
        for (int x: arrList){
            nList.add(x);
        }
        System.out.println(nList);

    }
}
