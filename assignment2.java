import java.util.Scanner;
public class App {
    public static void main (String [] args) {


        String Operator;
        String item1 = "Bucket of 10 with Super Platter";
        String item2 = "BBQ Bacon Snacker Combo";
        String item3 = "Large Shots";
        String result = item1 + item2 + item3;
        Double price1 = 1205.0;
        Double price2 = 175.0;
        Double price3 = 129.0;
        Double total = price1 + price2 + price3;
        
        System.out.println("Hello, welcome to KFC! May I take your order?");
        System.out.println("1 " + " Bucket of 10 with Super Platter");
        System.out.println("2 " + " BBQ Bacon Snacker Combo");
        System.out.println("3 " + " Large Shots");

        Scanner input = new Scanner (System.in);
        System.out.println("Hello, What is your name? ");
        Operator = input.nextLine();


        System.out.println("Enter first order");
        item1 = input.nextLine();
        System.out.println("Bucket of 10 with Super Platter");
        System.out.println(price1);
         
        System.out.println("Enter second order");
        item2 = input.nextLine();
        System.out.println("BBQ Bacon Snacker Combo");
        System.out.println(price2);

        System.out.println("Enter third order");
        item3 = input.nextLine();
        System.out.println("Large Shots");
        System.out.println(price3);


        switch (Operator) {
            case "one":
            result = item1;
            System.out.println(item1 + price1 + result);
            break;

            case "two":
            result = item2;
            System.out.println(item2 + price2 + result);
            break;

            case "three":
            result = item3;
            System.out.println(item3 + price3 + result);
            break;

            case "four":
            System.out.println(total);
            break;

            default:
            System.out.println("Thank you for ordering in KFC!");
            System.out.println("The total bill is "+ total);
            break;
        }

        input.close();
    }
}
