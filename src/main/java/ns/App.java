package ns;

import java.util.Scanner;

public final class App {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Please enter a number: ");

        int number = 0;

        while (!input.hasNextInt()) {
            
            System.out.println("It isn't a numeric value");
            System.out.print("Please enter a number: ");
            input.nextLine();
        }

        number = input.nextInt();

        
        System.out.println("The number is: "+number);



        input.close();

    }
}
