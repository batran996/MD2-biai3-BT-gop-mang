import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("gop mang");
        Scanner scanner = new Scanner(System.in);
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        int size3 = array1.length + array2.length;
        int[] array3 = new int[size3];
        int j = 0;
        for (int i = 0; i < array1.length; i++) {
            array3[j] = array1[i];
            j++;
        }
//        for (int i = 0; i < array3.length; i++) {
//            System.out.println(array3[i]);
//        }
        for (int i = 0; i < array2.length; i++) {
            array3[j] = array2[i];
            j++;
        }
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] +" ");
        }

//        int j = 0;
//        for (int elemen:array1) {
//            array3[j] = elemen;
//            j++;
//        }
//        for (int elemen:array2) {
//            array3[j] = elemen;
//            j++;
//        }
//        System.out.println(Arrays.toString(array3));
    }
}