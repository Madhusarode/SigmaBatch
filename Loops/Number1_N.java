import java.util.*;
public class Number1_N{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number = 1;
        int N = sc.nextInt();
        while(number <= N){
          System.out.println(number);
          number++;
        }
    }
}