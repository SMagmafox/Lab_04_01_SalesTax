//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        double purchasePrice = 350.50;
        double salesTax = 0;
        final double SALES_TAX_RATE = .05;

        salesTax = purchasePrice * SALES_TAX_RATE;

        System.out.println("The sales tax on a purchas of $" + purchasePrice + " is $" + salesTax);
    }
}