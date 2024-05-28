package ns;


import java.util.Scanner;

public final class App {
    
    
    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);


        System.out.print("Ingrese el tamaño de la array: ");
        int size = input.nextInt();


        int[] array = new int[size];

        for(int i=0; i<array.length; i++){

            System.out.print("Ingrese el valor: "+(i+1)+" ");
            array[i] = input.nextInt();

        }

       
        for (int iPrint=0; iPrint < array.length; iPrint++){

            System.out.print(array[iPrint] + "  ");

        }

/*
        int[] array  = {6, 3, 1, 43, 9, 10, 45, 4, 8};
        boolean condition = true;
        int arrayCopy;


        System.out.print("Ingresa 1 o 2 para ascendente o descendente: ");
        int upDown = input.nextInt();




      
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

     




       if (upDown==1) {
        
        for (int iPrint=0; iPrint < array.length; iPrint++){

            System.out.print(array[iPrint] + "  ");

        }


       }else{


        for (int iPrint=array.length-1; iPrint >= 0 ; iPrint--){

            System.out.print(array[iPrint] + "  ");
        
        }


       }

        
*/
    


        
        



      

        

        input.close();
        
    }
}
