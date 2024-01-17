public class Test5{

    public static int sumDigits(int num){
       int sum = 0;
       while(num > 0){
          int lastDigit = num % 10;
          sum+=lastDigit;
          num /=10;
       }
       return sum;
    }
    public static void main(String args[]){
        System.out.println(sumDigits(1234));
    }
}