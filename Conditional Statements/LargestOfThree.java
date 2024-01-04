public class LargestOfThree{
    public static void main(String args[]){
        int A = 1397, B = 36526,C =66867;
        if(A >= B && A >=C){
            System.out.println("A is largest");
        }
        else if(B >= C){
            System.out.println("B is largest");
        }
        else{
            System.out.println("C is largest");
        }
    }
}