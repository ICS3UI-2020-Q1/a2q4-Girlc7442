import java.util.Scanner;

/**
 * Determines the discount a customer will get depending on how much they spend
 * @author Cole G.
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create scanner for user input
    Scanner input = new Scanner(System.in);

    //Ask how much the customer spent
    System.out.println("Please enter the amount the customer spent");
    //get the amount the customer spent
    double customerSpent = input.nextDouble();

    //Check to see which discount the customer will get
    if(customerSpent <= 40.00){
      System.out.println("They will receive 10% off.");
      //calculates the discount for under $40.01 spent
      double customerDiscount1 = customerSpent * 0.1;
      //displays the discount
      System.out.println("They will save $" + customerDiscount1 + ".");
      //calculates the customer total
      double customerTotal1 = customerSpent - customerDiscount1;
      //displays the customer total
      System.out.println("The new total is $" + customerTotal1 + ".");
    }else if(customerSpent <= 80.00 && customerSpent >= 40.01){
      System.out.println("They will receive 20% off.");
      //calculates the discount for under $80.01 spent
      double customerDiscount2 = customerSpent * 0.2;
      //displays the discount
      System.out.println("They will save $" + customerDiscount2 + ".");
      //calculates the customer total
      double customerTotal2 = customerSpent - customerDiscount2;
      //displays the customer total
      System.out.println("The new total is $" + customerTotal2 + ".");
    }else if(customerSpent <= 120.00 && customerSpent >= 80.01){
      System.out.println("They will receive 30% off.");
      //calculates the discount for under 120.01 spent
      double customerDiscount3 = customerSpent * 0.3;
      //displays the discount
      System.out.println("They will save $" + customerDiscount3 + ".");
      //calculates the customer total
      double customerTotal3 = customerSpent - customerDiscount3;
      //displays the customer total
      System.out.println("The new total is $" + customerTotal3 + ".");
    }else if(customerSpent >= 120.01){
      System.out.println("They will receive 40% off.");
      //calculates the discount for over $120 spent
      double customerDiscount4 = customerSpent * 0.4;
      //displays the discount
      System.out.println("They will save $" + customerDiscount4 + ".");
      //calculates the customer total
      double customerTotal4 = customerSpent - customerDiscount4;
      //displays the customer total
      System.out.println("The new total is $" + customerTotal4 + ".");
    }
    
  }
}
