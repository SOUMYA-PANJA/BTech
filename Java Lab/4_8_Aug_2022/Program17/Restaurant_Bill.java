public class Restaurant_Bill {

  public static void main(String args[]) {
    double subtotal = 10000;
    double GST = subtotal * .08;
    double tax = subtotal * .15;
    double total = subtotal + GST + tax;
    System.out.printf("Subtotal: Rs. %.2f \n", subtotal);
    System.out.printf("GST: Rs. %.2f \n", GST);
    System.out.printf("Tax: Rs. %.2f \n", tax);
    System.out.printf("Total: Rs. %.2f \n", total);
  }
}
