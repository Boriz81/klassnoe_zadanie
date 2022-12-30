import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String action = scanner.nextLine();
        switch (action) {
            case "griffin-dor":
                System.out.println("смелость");
                break;
            case "puff-end":
                System.out.println("преданность");
                break;
            case "slizerin":
                System.out.println("хитрость");
                break;
            case "kogtevran":
                System.out.println("интеллект");
                break;
            default:
                System.out.println("bigger than or less than 1..4");

        }
    }
}