import java.util.Scanner;


public class VendingMachine{
    private int[] deposit_bill = new int[4]; // 0:1 , 1:5 , 2:10 , 3:20 dollars
    private int[] deposit_coin = new int[3]; // 0:5 , 1:10 , 2:25 cents
    private double deposit_total = 0; // deposit total

    private int[] orders = new int[8]; // stores the number of each item ordered
    private double order_total = 0; // order total

    private double[] prices = {1.65, 3.50, 2.80, 1.50, 1.85, 1.00, 3.25, 3.40}; // prices of each item

    private void deposit(){
        // write your code here
    }


    private void refund(){
        // write your code here
    }

    private void printMenu(){
        // A: Coca Cola, unit price US $1.65
        // B: Minute Maid Orange Juice, unit price US $3.50
        // C: Evian Mineral Water, unit price US $2.80
        // D: M&M's Chocolate, unit price US $1.50
        // E: Hershey's Chocolate Bar, unit price US $1.85 F: Oreo Cookies, unit price US $1.00
        // G: Doritos Tortilla Chips, unit price US $3.25
        // H: Pringles Potato Chips, unit price US $3.40

        // write your code here
    }


    private void selectProduct(){
        // write your code here
    }


    private void cancelProduct(){
        // write your code here
    }


    private void change(){
        // write your code here
    }

    private void printCustomerOrder(){
        // write your code here
    }


    private int purchaseOrder(){
        // write your code here
    }


    private void initOrder(){
        // write your code here
    }


    public void run(){
        System.out.println("\n\nWelcome to the vending machine!");

        String op;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println();
            System.out.println("a. Deposit money");
            System.out.println("b. Select product");
            System.out.println("c. Cancel product");
            System.out.println("d. Purchase order");
            System.out.println("e. Abort transaction");
            System.out.printf("Deposit: %.2f\n", this.deposit_total);
            System.out.printf("Order: %.2f\n", this.order_total);
            System.out.print("Please select an option: ");
            op = sc.next();

            System.out.println();

            if(op.equals("a")){
                System.out.println("Please deposit your money.");
                this.deposit();
            }
            else if(op.equals("b")){
                System.out.println("Please select your product.");
                this.selectProduct();
            }
            else if(op.equals("c")){
                System.out.println("Please cancel your product.");
                this.cancelProduct();
            }
            else if(op.equals("d")){
                System.out.println("Purchasing order...");
                if(this.purchaseOrder() == 1){
                    break;
                }
            }
            else if(op.equals("e")){
                System.out.println("Abort transaction.");
                this.refund();
                break;
            }
        }

        this.initOrder();

        System.out.println("\n\nThank you for using the vending machine!");
    }
}