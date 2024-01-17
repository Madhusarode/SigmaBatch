public class Prod{
    public static int multiply(int num1,int num2){
        int result = num1 * num2;
        return result;

    }
    public static void main(String args[]){
        int a=3;
        int b=5;
        int product = multiply(a,b);
        System.out.println("product of a and b:"+product);
    }
}