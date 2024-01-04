import java.util.*;
public class SumOfNatural{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number = 1;
        int N = sc.nextInt();
        int sum = 0;
        while(number <= N){
          sum += number;
          number++;
        }
        System.out.println(sum);
    }
}