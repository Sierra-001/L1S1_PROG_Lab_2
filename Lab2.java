import java.io.*;
import java.util.*;

public class Lab2 {
    public static void clearConsole() {
        try {
            String os =  System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (IOException | InterruptedException e) {
            System.out.println("Could not clear terminal: " + e.getMessage());
        }
    }

    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        int userInput;

        while (userInput != 7) {
            System.out.print("1: Right Angle Triangle\n");
            System.out.print("2: Rectangle\n");
            System.out.print("3: Circle\n");
            System.out.print("4: Cylinder\n");
            System.out.print("5: Cuboid\n");
            System.out.print("6: Sphere\n");
            System.out.print("7: Exit\n");
            System.out.print("Enter Choice: ");

            switch (userInput) {
                case 1: {
                    clearConsole();
                    R_A_T();
                    clearConsole();
                    break;
                }
                case 2: {
                    clearConsole();
                    Rectangle();
                    clearConsole();
                    break;
                }
                case 3: {
                    clearConsole();
                    Circle();
                    clearConsole();
                    break;
                }
                case 4: {
                    clearConsole();
                    Cylinder();
                    clearConsole();
                    break;
                }
                case 5: {
                    clearConsole();
                    Cuboid();
                    clearConsole();
                    break;
                }
                case 6: {
                    clearConsole();
                    Sphere();
                    clearConsole();
                    break;
                }
                case 7: {
                    System.out.println("\nExiting Program...");
                    input.close();
                    break;
                }
                default: {
                    System.out.println("\nInvalid Choice!\nEnter Choice between 1 and 7 Only!\n");
                    break;
                }
            }
        }

        static void  R_A_T() {
            Scanner scanner = new Scanner(System.in);

            double base;
            double height;
            double hypotenuse;
            double perimeter;
            double area;

            System.out.print("Enter the base: ");
            base = scanner.nextDouble();

            System.out.print("Enter the height: ");
            height = scanner.nextDouble();

            hypotenuse = Math.sqrt(Math.pow(base,2) + Math.pow(height,2));
            perimeter = base + height + hypotenuse;
            area = 0.5 * base * height;

            System.out.printf("The hypotenuse is: %.2f\n", hypotenuse);
            System.out.printf("The perimeter is: %.2f\n", perimeter);
            System.out.printf("The area is: %.2f", area);

            scanner.close();
        }

        static void  Rectangle() {}

        static void  Circle() {}

        static void  Cylinder() {}

        static void  Cuboid() {}

        static void  Sphere() {}
    }
}