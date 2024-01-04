import java.util.*;
public class ReverseMethod2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        int rev = 0;
        while(N > 0){
            int lastDigit = N % 10;
            rev = (rev * 10) + lastDigit;
            N /= 10;
        }
        System.out.println(rev);
    }
}