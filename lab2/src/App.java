import java.util.Scanner;

public class App {
    
    public static void ejercicio1(){
        System.out.println("Dime tu edad");

        Scanner scanner = new Scanner(System.in);
        int edad = scanner.nextInt();

        if (edad < 6 || edad > 120){
            System.out.println("Error");
            System.exit(1);
        } 

        if ( edad >= 6 && edad <= 12){
            System.out.println("Primaria");
        } else if (edad >= 13 && edad <= 15) {
            System.out.println("Secundaria");
        } else if (edad >= 16 && edad <= 22) {
            System.out.println("Universitario");
        } else {
            System.out.println("Trabajando");
        }

        scanner.close();

    }
    
    public static void ejercicio2() {
        
        for (int i = 20; i >= 10; i--) {
            System.out.printf("El cuadrado de %d es %d%n",i,(int) Math.pow(i, 2));
        }
 
    }

    public static void ejercicio3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dame el nombre de tu madre");
        String nombreMadre = scanner.nextLine();

        System.out.println("Dame la edad de tu madre");
        int edadMadre = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Dame el nombre de tu padre");
        String nombrePadre = scanner.nextLine();

        System.out.println("Dame la edad de tu padre");
        int edadPadre = scanner.nextInt();

        float mediaEdades = (float) (edadMadre + edadPadre)/2 ;

        System.out.printf("Tu madre se llama %s y tiene %d años \n" + 
                          "y tu padre se llama %s y tiene %d años \n" + 
                          "y la media de sus edades es %f",
        nombreMadre,edadMadre,nombrePadre,edadPadre,mediaEdades);

        scanner.close();

    }

    
    public static void extra() {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("De que contienente eres ?");
        String continente = scanner.nextLine();

        //continente = continente.substring(0, 1).toUpperCase() + continente.substring(1).toLowerCase();
        continente = continente.toLowerCase();
        
        switch (continente) {
            case "africa":
                System.out.println("Gran Continente");
                break;
            case "asia":
                System.out.println("Me gusta la comida Asiatica");
                break;
            case "europa":
                System.out.println("El viejo continente");
                break;
            case "america":
                System.out.println("El nuevo continente");
            case "oceania":
                System.out.println("Kanguroos ?");
                break;
            
            }
        
        scanner.close();

    }


    public static void main(String[] args) throws Exception {
        
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        extra();   
    }
}
