import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Data> dataList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("What do you want to do?");
            System.out.println("1. Add new data");
            System.out.println("2. Get data by ID");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("Enter name:");
                String name = scanner.nextLine();
                Data newData = new Data(name);
                dataList.add(newData);
            } else if (choice == 2) {
                System.out.println("Enter ID:");
                int id = scanner.nextInt();
                scanner.nextLine();

                boolean found = false;
                for (Data data : dataList) {
                    if (data.getId() == id) {
                        System.out.println("Name: " + data.getName());
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("ID doesn't exist");
                }
            }

            System.out.println();
        }
    }
}
