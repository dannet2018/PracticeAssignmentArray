public class Task3 {

        public static void main(String[] args) {
            String[] originalArray = {"red", "green", "blue", "yellow"};


            System.out.println("Original array length: " + originalArray.length);


            String[] copiedArray = originalArray.clone();


            System.out.println("Copied array: " + java.util.Arrays.toString(copiedArray));
        }
    }



