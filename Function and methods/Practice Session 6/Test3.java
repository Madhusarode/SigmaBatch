import java.util.*;
public class Test3{

    public static int Reverse(int num){
        int rev = 0;
        while(num > 0){
            int lastDigit = num % 10;
            rev = (rev * 10) + lastDigit;
            num = num/10;
        }
        return rev;
    }

    public static boolean Palindrome(int num){
        if(Reverse(num) == num){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(Palindrome(num));

    }

}