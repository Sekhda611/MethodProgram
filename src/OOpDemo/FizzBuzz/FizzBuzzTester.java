package OOpDemo.FizzBuzz;

public class FizzBuzzTester {
    public static void main(String[] args) {
        FizzBuzz test = new FizzBuzz();
        int sn = test.getStartNum();
        System.out.println("starting point is: " + sn);
        int en = test.getStartNum();
        System.out.println("Ending num is: " + en);
         test.countWithoutAnyParameter();
        System.out.println("////////");

      FizzBuzz test1 = new FizzBuzz(1,25);
        test1.count(1,10);
    }
}
