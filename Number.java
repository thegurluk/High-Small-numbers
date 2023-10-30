import java.util.Scanner;
public class Number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("how much enter number:");
        int numbers= input.nextInt();

        int inp;

        System.out.print("Please enter number 1:");
        inp=input.nextInt();
        int high=inp;
        int small=inp;

        for (int i=2;i<=numbers;i++){
            System.out.print("Please enter number "+(i)+":");
            inp=input.nextInt();
            if (inp>high){
                high=inp;
            }
            if (inp<small){
                small=inp;
            }
        }
        System.out.println("High number:"+high);
        System.out.println("Small number:"+small);
    }
}
