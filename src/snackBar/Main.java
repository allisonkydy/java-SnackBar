package snackBar;

public class Main
{
  public static void main(String[] args)
  {
    // instantiate customers
    Customer jane = new Customer("Jane", 45.25);
    Customer bob = new Customer("Bob", 33.14);

    // instantiate vending machines
    VendingMachine food = new VendingMachine("Food");
    VendingMachine drink = new VendingMachine("Drink");
    VendingMachine office = new VendingMachine("Office");

    // instantiate snacks
    // in Food
    Snack chips = new Snack("Chips", 36, 1.75, food.getId());
    Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, food.getId());
    Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());

    // in Drink
    Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
    Snack water = new Snack("Water", 20, 2.75, drink.getId());

    // processing
  }
}