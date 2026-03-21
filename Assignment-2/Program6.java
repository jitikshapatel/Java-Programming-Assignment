import java.io.File;
import java.util.Scanner;

class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter directory path: ");
        String path = sc.nextLine();

        File dir = new File(path);

        if (dir.exists() && dir.isDirectory()) {
            String[] files = dir.list();

            System.out.println("Files in directory:");
            for (String f : files) {
                System.out.println(f);
            }
        } else {
            System.out.println("Invalid directory path");
        }
    }
}