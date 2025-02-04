import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Name: " + name);

        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        System.out.println("Age: " + age);

        System.out.println("Enter weight(lbs): ");
        float weight = scanner.nextFloat();
        System.out.println("Weight(lbs): " + weight + "lbs");

        System.out.println("Are they a smoker(true/false)?: ");
        boolean smoker = scanner.nextBoolean();
        if (smoker) {
            System.out.println("They are a smoker");
        }
        else {
            System.out.println("They are not a smoker");
        }



        }

    }