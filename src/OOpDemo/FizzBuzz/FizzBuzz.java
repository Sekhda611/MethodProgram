package OOpDemo.FizzBuzz;

public class FizzBuzz {
     private int startNum;
     private int endNum;
     public FizzBuzz(){
         startNum = 1;
         endNum = 100;
     }
     public FizzBuzz(int s , int e){
         this.startNum = s;
         this.endNum = e;
     }
     //getter sn and en
     public int getStartNum(){
         return startNum;
     }

    public int getEndNum() {
        return endNum;
    }

    public void countWithoutAnyParameter(){
         int number = this.startNum;
         for(int i = startNum; i <= endNum; i++){
             if( i % 3 == 0 && i % 5 == 0){
                 System.out.println("FizzBuzz");
             } else if (i % 3 == 0) {
                 System.out.println("Fizz");
             } else if (i % 5 == 0) {
                 System.out.println("Buzz");
             }
             else{
                 System.out.println(i);
             }

         }
    }
    public void count(int startNum, int endNum){
         this.startNum = startNum;
         this.endNum = endNum;
         int number = this.startNum;
         /*for(int i = startNum; i <= endNum; i++){
             if(i % 3 == 0 && )
         }*/
        while(number <= this.endNum){
            if( number % 3 == 0 && number % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (number % 3 == 0) {
                System.out.println("Fizz");
            } else if (number % 5 == 0) {
                System.out.println("Buzz");
            }
            else{
                System.out.println(number);
            }
            number++;
        }
    }
    //public void count()
}
