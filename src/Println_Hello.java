import java.util.Scanner;

public class Println_Hello {
    public static void main(String[] args) {
        System.out.println("Enter your name :");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello "+ name);
//        int number1 =sc.nextInt();
//        int number2 =sc.nextInt();
//        int expectedAnswer =sc.nextInt();
//        while(number1 +number2 !=expectedAnswer){
//            System.out.println("wrong answer");
//            expectedAnswer =sc.nextInt();
//        }
//        System.out.println("you got it!");
    }
}
