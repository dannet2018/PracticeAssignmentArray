import java.util.Scanner;

public class Task11 {




        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("How many favorite things do you have? ");
            int numFavorites = scanner.nextInt();
            scanner.nextLine();


            String[] favoriteThings = new String[numFavorites];


            for (int i = 0; i < numFavorites; i++) {
                System.out.print("Enter favorite thing " + (i + 1) + ": ");
                favoriteThings[i] = scanner.nextLine();
            }


            System.out.println("Your favorite things:");
            for (String thing : favoriteThings) {
                System.out.println(thing);
            }

            scanner.close(); // Close the scanner
        }
    }


