public class Task8 {

        public static void main(String[] args) {
            String[] myArray = {"red", "green", "blue", "yellow", "orange"};


            System.out.println("Original Array:");
            for (String element : myArray) {
                System.out.println(element);
            }


            String temp = myArray[0];
            myArray[0] = myArray[myArray.length / 2];
            myArray[myArray.length / 2] = temp;


            System.out.println("\nArray after swapping:");
            for (String element : myArray) {
                System.out.println(element);
            }
        }
    }


