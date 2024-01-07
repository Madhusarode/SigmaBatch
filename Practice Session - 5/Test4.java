import java.util.*;
public class Test4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int table = 1;
        for(int i=1;i<=10;i++){
            table = N * i;
            System.out.println(N + "*" + i + "=" + table);
        }
    }
}