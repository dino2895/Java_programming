public class BillingDialog {
 public static void main(String[] args) {
  System.out.println("Welcome to the low offices of");
  System.out.println("Dewey, Cheothan, and Howe.");
  Bill yourBill=new Bill();
  yourBill.inputTimeWorked();
  yourBill.updateFee();
  yourBill.outputBill();
  System.out.println("We~ ");
  System.out.println("It~");
}