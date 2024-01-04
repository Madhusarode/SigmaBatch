import java.util.*;
public class ReverseNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        while(N > 0){
            int lastDigit = N % 10;
            System.out.print(lastDigit);
            N /= 10;
        }
        System.out.println();
    }
}