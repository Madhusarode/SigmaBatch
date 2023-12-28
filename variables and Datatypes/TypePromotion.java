public class TypePromotion{
    public static void main(String args[]){
        char x='m';
        char y ='g';
        
        System.out.println((int)x);
        System.out.println((int)y);
        System.out.println(x - y);

        short a=50;
        byte b=25;
        char c='c';
        byte bt = (byte)(a + b + c);
        System.out.println(bt);


    }
}