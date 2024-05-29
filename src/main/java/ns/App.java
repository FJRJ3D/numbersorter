package ns;


import java.util.Scanner;

public final class App {
    
    
    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        System.out.println("==============================================================================");
        System.out.println("WELCOME TO NUMBER SORTER");
        System.out.println("==============================================================================");

        System.out.print("Enter the number of numbers: ");
        int size = input.nextInt();

        int number4 = 0;
                
        int[] array = new int[size];

        for(int i=0; i<array.length; i++){
            
            
            System.out.print("Enter the number "+(i+1)+": ");
            number4 = input.nextInt();
            

            while (number4==4) {
                
                System.out.println("El valor 4 no es aceptado.");
                System.out.print("Enter the number "+(i+1)+": ");
                array[i] = input.nextInt();
                number4=array[i];
            }

            if (number4 == 4) {

                System.out.println("El valor 4 no es aceptado.");
                System.out.print("Enter the number "+(i+1)+": ");
                array[i] = input.nextInt();             
            

            }else{

                array[i] = number4;

            }
            

        }
        
        
        System.out.println("==============================================================================");
           
        
        boolean condition = true;
        int arrayCopy;

    
        
        System.out.print("Write how you want to sort the numbers up/down: ");
        String upDown = input.next();

        

      
        while (true) {
            
        
            condition=false;
            for (int i=1; i < array.length; i++){
           
                if (array[i]<array[i-1]) {
            
                    arrayCopy=array[i];
                    array[i]=array[i-1];
                    array[i-1]=arrayCopy; 
                    condition=true;
                }


            }
            if (condition==false) {
                break;
            }


       }

     
       System.out.println("==============================================================================");


       System.out.print("Sortered numbers: ");

       if (upDown.equals("up")) {
        
        for (int iPrint=0; iPrint < array.length; iPrint++){

            System.out.print(array[iPrint] + "  ");

        }


       }
       else if (upDown.equals("down")) {


        for (int iPrint=array.length-1; iPrint >= 0 ; iPrint--){

            System.out.print(array[iPrint] + "  ");
        
        }
        
        

       }


       System.out.println(" ");
       System.out.println("==============================================================================");


        input.close();
        
    }
}
