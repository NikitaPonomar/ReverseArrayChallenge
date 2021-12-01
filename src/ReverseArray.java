import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    // Application helps to reverse elements of Array
    private static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter the quantity of elements");
        int count = scanner.nextInt();
        scanner.nextLine(); // to handle ENTER key
       int[] myArray= readIntegers(count);

        System.out.println("Entered array " + Arrays.toString(myArray));
        reverse(myArray);

        System.out.println("Reversed array " +Arrays.toString(myArray));


        scanner.close();

    }

    private static void reverse (int[] firstArray) {
        int temp;
        for (int i=0;i<firstArray.length/2;i++){
            temp=firstArray[i];
            firstArray[i]=firstArray[firstArray.length-i-1];
            firstArray[firstArray.length-i-1]=temp;

        }
    }

    private static int[] readIntegers(int count){
        int[] readArray = new int[count];
        String input="";
        System.out.println("Please enter " + count + " integer numbers");
        for (int i=0; i<count;i++) {

            while(!scanner.hasNextInt()){
                System.out.println("Wrong value, Please input integer number");
                input=scanner.nextLine(); //to avoid endless loop
            }
            readArray[i]=scanner.nextInt();
            scanner.nextLine(); // to handle ENTER key
        }
        return readArray;
    }



}
