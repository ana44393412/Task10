import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int modifier = scan.nextInt();
        int[] arr = getFilledArray(10, modifier, (int a, int b) -> a + b);
        for (int a : arr) {
            System.out.println(a);
        }
        System.out.println();
        int[] arr1 = getFilledArray(10, modifier, (int a, int b) -> a * b);
        for (int a : arr1) {
            System.out.println(a);
        }
        System.out.println();
        int[] arr2 = getFilledArray(10, modifier, (int a, int b) -> {
            if (a % 2 == 0) {
                return a / 2 + b;
            } else {
                return a * a - b;
            }
        });
        for (int a : arr2) {
            System.out.println(a);
        }
        System.out.println();
        // разность индекса и модификатора
        int[] arr3 = getFilledArray(10, modifier, (int a, int b) -> a - b);
        for (int a : arr3) {
            System.out.println(a);
        }
        System.out.println();
        // произведение суммы и разности индекса и модификатора
        int[] arr4 = getFilledArray(10, modifier, (int a, int b) -> (a + b) * (a - b));
        for (int a : arr4) {
            System.out.println(a);
        }
    }

    private static int[] getFilledArray(final int size, final int modifier, final Predicate predicate) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = predicate.process(i, modifier);
        }
        return arr;
    }
}
