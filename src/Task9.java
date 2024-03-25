public class Task9 {


        public static void main(String[] args) {
            int[] numbers = {4, 2, 9, 13, 1, 0};


            for (int i = 0; i < numbers.length - 1; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] > numbers[j]) {

                        int temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                    }
                }
            }


            System.out.print("Array in ascending order: ");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i]);
                if (i < numbers.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();


            System.out.println("The smallest number is " + numbers[0]);
            System.out.println("The biggest number is " + numbers[numbers.length - 1]);
        }
    }


