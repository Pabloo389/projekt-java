import java.util.Scanner;

public class Main {
	System.out.println("=== HEADER A i B ===");
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Start");
            System.out.println("2. Pomoc");
            System.out.println("3. Wyjście");
            System.out.print("Wybierz opcję: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Uruchamianie aplikacji...");
                    break;
                case 2:
                    System.out.println("Tutaj będzie pomoc.");
                    break;
                case 3:
                    System.out.println("Do widzenia!");
                    running = false;
                    break;
                default:
                    System.out.println("Nieprawidłowa opcja, spróbuj ponownie.");
            }
        }

        scanner.close();
    }
}
