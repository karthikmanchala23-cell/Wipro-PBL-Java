import java.util.Scanner;

public class VideoLauncher {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VideoStore store = new VideoStore();

        int choice;

        do {
            System.out.println("\nMAIN MENU");
            System.out.println("1. Add Videos");
            System.out.println("2. Check Out Video");
            System.out.println("3. Return Video");
            System.out.println("4. Receive Rating");
            System.out.println("5. List Inventory");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1..6): ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the video you want to add: ");
                    store.addVideo(sc.nextLine());
                    break;

                case 2:
                    System.out.print("Enter the name of the video you want to check out: ");
                    store.doCheckout(sc.nextLine());
                    break;

                case 3:
                    System.out.print("Enter the name of the video you want to return: ");
                    store.doReturn(sc.nextLine());
                    break;

                case 4:
                    System.out.print("Enter the name of the video you want to rate: ");
                    String name = sc.nextLine();
                    System.out.print("Enter rating: ");
                    int rating = sc.nextInt();
                    store.receiveRating(name, rating);
                    break;

                case 5:
                    store.listInventory();
                    break;

                case 6:
                    System.out.println("Exiting...!! Thanks for using the application.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}