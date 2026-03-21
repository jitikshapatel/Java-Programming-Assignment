import java.util.*;

class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        HashMap<Integer, String> map = new HashMap<>();
        TreeMap<Integer, String> tmap = new TreeMap<>();

        int choice;

        do {
            System.out.println("\n1.Create  2.Read  3.Update  4.Delete  5.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    list.add(name);
                    map.put(id, name);
                    tmap.put(id, name);

                    System.out.println("Data Added");
                    break;

                case 2:
                    System.out.println("ArrayList: " + list);
                    System.out.println("HashMap: " + map);
                    System.out.println("TreeMap: " + tmap);
                    break;

                case 3:
                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new Name: ");
                    String newName = sc.nextLine();

                    if (map.containsKey(uid)) {
                        map.put(uid, newName);
                        tmap.put(uid, newName);
                        System.out.println("Updated in Map");
                    } else {
                        System.out.println("ID not found");
                    }

                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    int did = sc.nextInt();

                    map.remove(did);
                    tmap.remove(did);

                    System.out.println("Deleted from Map");
                    break;

                case 5:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);
    }
}
