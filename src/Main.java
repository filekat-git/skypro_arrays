import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("task 1");
        int[] arr1 = new int[]{1, 2, 3};
        double[] arr2 = new double[]{1.57, 7.654, 9.986};
        boolean[] arr3 = new boolean[4];
        arr3[2] = true;

        System.out.println("task 2");
        for (int i = 0; i < arr1.length; i++) {
            if (i == arr1.length - 1) {
                System.out.print(arr1[i]);
                System.out.println();
                break;
            }
            System.out.print(arr1[i] + ", ");
        }
        for (int i = 0; i < arr2.length; i++) {
            if (i == arr2.length - 1) {
                System.out.print(arr2[i]);
                System.out.println();
                break;
            }
            System.out.print(arr2[i] + ", ");
        }
        for (int i = 0; i < arr3.length; i++) {
            if (i == arr3.length - 1) {
                System.out.print(arr3[i]);
                System.out.println();
                break;
            }
            System.out.print(arr3[i] + ", ");
        }

        System.out.println("task 3");
        for (int i = arr1.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr1[i]);
                System.out.println();
                break;
            }
            System.out.print(arr1[i] + ", ");
        }
        for (int i = arr2.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr2[i]);
                System.out.println();
                break;
            }
            System.out.print(arr2[i] + ", ");
        }
        for (int i = arr3.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr3[i]);
                System.out.println();
                break;
            }
            System.out.print(arr3[i] + ", ");
        }

        System.out.println("task 4");
        System.out.println("before: " + Arrays.toString(arr1));
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 1) {
                arr1[i] += 1;
            }
        }
        System.out.println("after: " + Arrays.toString(arr1));

    }
}