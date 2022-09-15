import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
    
        String Order = Name();
        String Order2 = Address();
        String Menu1 = List1();
        Double PriceA = Pa();
        String Menu2 = List2();   
        Double PriceB = Pb(); 
        String Menu3 = List3();
        Double PriceC = Pc();
        Double add = (PriceA + PriceB + PriceC);    
        System.out.println("\n" + "\n" + "--Order Summary---" + "\n" + Order + "\n" + Order2 + "\n" + "\n" + "Orders:" +"\n" + "1st Order: " + Menu1 + " --- Php " + PriceA + "\n" + "2nd Order: " + Menu2 + " --- Php " + PriceB + "\n" + "3rd Order: " + Menu3 + " --- Php " + PriceC + "\n" + "\n" + "Subtotal: Php " + add + "\n" + "\n" + "THANK YOU FOR! AND COME AGAIN!!");
        
    // int product = multiply();
    // System.out.println("The product is: " + product);

    // int quotient = division();
    // System.out.println("The quotient is: " + quotient);

    // String crushname = revealMyCrush();
    // System.out.print(crushname);
   
        scan.close();
}

    static String Name() {
        System.out.println("Provide your Informations");

        System.out.print("Name: ");
        String a = scan.nextLine();


        return "Name: " + a;

    }

    static String Address() {
        
        System.out.print(" Address: ");
        String b = scan.nextLine();

        return "Address: " + b;
    }

    static String List1() {
        System.out.println("\n" + "----Please enter your Order----");
        System.out.print("\n" +"Enter your 1st Order: ");
        String c = scan.nextLine();


        return c;    

    }

   static Double Pa() {
        System.out.print("\n" +"Enter the price: Php ");
        Double d = scan.nextDouble();
        
      return d;
    }

    static String List2() {
        System.out.print("\n" +"Enter your 2nd Order: ");
        String e = scan.next();


        return e;    
    }

    static Double Pb() {
        System.out.print("\n" +"Enter the price: Php ");
        Double f = scan.nextDouble();
        
      return f;
    }

    static String List3() {
        System.out.print("\n" +"Enter your 3rd Order: ");
        String g = scan.next();


        return g;    
    }

    static Double Pc() {
        System.out.print("\n" +"Enter the price: Php ");
        Double h = scan.nextDouble();
        
      return h;
    }
    
    
// static int multiply() {
//     System.out.println("Please enter the multiplication ");
//     System.out.print("Enter the Multiplicand: ");
//     int x = scan.nextInt();

//     System.out.print("Enter the Multiplier: ");
//     int y = scan.nextInt();
//     return x * y;
// }

// static int division() {
//     System.out.println("Please enter division numbers ");
//     System.out.print("Enter the Dividend: ");
//     int x = scan.nextInt();

//     System.out.print("Enter the Divisor: ");
//     int y = scan.nextInt();
//     return x / y;
// }

// static String revealMyCrush() {

//         System.out.println("This will reveal the name of your crush");
//         System.out.print("Kindly enter your name: ");
//         String x = scan.nextLine();

//         System.out.print("Enter your previous crush name: ");
//         String y = scan.nextLine();

//         System.out.print("Enter your current cursh name: ");
//         String z = scan.nextLine();

//         return x + " has a crush on " + y + "before." + "\n" + "But now, " + z + " is his crush.";
//     }
 

}
