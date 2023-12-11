import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        System.out.print("Enter a number (1-7): ");

        try {
            int x = Integer.parseInt(sca.nextLine());

            switch (x) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid input. Enter a number between 1 and 7.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            sca.close();
        }
    }
}
