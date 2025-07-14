import java.util.Scanner;

public class home3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of dealerships
        int n = scanner.nextInt();
        
        // Process each dealership
        for (int i = 0; i < n; i++) {
            int cars = scanner.nextInt();
            int bikes = scanner.nextInt();
            
            // Calculate total tyres (4 per car and 2 per bike)
            int totalTyres = (cars * 4) + (bikes * 2);
            System.out.println(totalTyres);
        }
        
        scanner.close();
    }
}