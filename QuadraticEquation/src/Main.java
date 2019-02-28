import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a:");
        double a = scanner.nextDouble();
        System.out.println("Input b:");
        double b = scanner.nextDouble();
        System.out.println("Input c:");
        double c = scanner.nextDouble();


        Account account = new Account(a,b,c);
        double delta = account.getDiscriminant();

        if(delta < 0){
            System.out.println("Invalid!");
        } else if (delta == 0){
            System.out.println("The result is: " + account.getRootThree());
        } else {
            System.out.println("The result 1 is: " + account.getRootOne());
            System.out.println("The result 2 is: " +account.getRootTwo());
        }
    }
}
