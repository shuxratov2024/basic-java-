import java.util.Scanner;

public class User_Inputs {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

        System.out.println("What your name ?");
        String  name = String.format  (scanner.nextLine())    ;

//        System.out.println("s  How old are you", name);
        int age = scanner.nextInt();

        System.out.printf("d% is an excellent age for programming ",age);

        scanner.close();
    }
}
