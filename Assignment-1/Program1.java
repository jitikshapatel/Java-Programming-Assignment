import java.util.Scanner;

class ArrayOperations {
    int[] arr;
    int n;

    ArrayOperations(int size) {
        n = size;
        arr = new int[n];
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void display() {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void reverse() {
        System.out.println("Reversed Array:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void sort() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array:");
        display();
    }

    void search(int key) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at position: " + (i + 1));
                return;
            }
        }
        System.out.println("Element not found");
    }

    void average() {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println("Average = " + (double) sum / n);
    }

    void maximum() {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum = " + max);
    }
}

class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        ArrayOperations obj = new ArrayOperations(size);

        obj.input();

        System.out.println("Original Array:");
        obj.display();

        obj.reverse();
        obj.sort();

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        obj.search(key);

        obj.average();
        obj.maximum();
    }
}
