package snackBar;

public class Main
{
  public static void main(String[] args)
  {
    // instantiate customers
    Customer c1 = new Customer("Jane", 45.25);
    Customer c2 = new Customer("Bob", 33.14);

    // instantiate vending machines
    VendingMachine food = new VendingMachine("Food");
    VendingMachine drink = new VendingMachine("Drink");
    VendingMachine office = new VendingMachine("Office");

    // instantiate snacks
    // in Food
    Snack snack1 = new Snack("Chips", 36, 1.75, food.getId());
    Snack snack2 = new Snack("Chocolate Bar", 36, 1.00, food.getId());
    Snack snack3 = new Snack("Pretzel", 30, 2.00, food.getId());

    // in Drink
    Snack snack4 = new Snack("Soda", 24, 2.50, drink.getId());
    Snack snack5 = new Snack("Water", 20, 2.75, drink.getId());

    // processing
    // 1 - Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity of snack 4.
    c1.buySnack(snack4.getTotalCost(4));
    snack4.buySnack(4);
    System.out.println("Customer 1 cash on hand: " + c1.getCash());
    System.out.println("Quantity of snack 4: " + snack4.getQuantity());

    // 2 - Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity of snack 3.
    c1.buySnack(snack3.getTotalCost(1));
    snack3.buySnack(1);
    System.out.println("Customer 1 cash on hand: " + c1.getCash());
    System.out.println("Quantity of snack 3: " + snack3.getQuantity());

    // 3 - Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity of snack 4.
    c2.buySnack(snack4.getTotalCost(2));
    snack4.buySnack(2);
    System.out.println("Customer 2 cash on hand: " + c2.getCash());
    System.out.println("Quantity of snack 4: " + snack4.getQuantity());

    // 4 - Customer 1 finds $10. Print Customer 1 Cash on Hand.
    c1.addCash(10.00);
    System.out.println("Customer 1 cash on hand: " + c1.getCash());

    // 5 - Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity of snack 2.

    // 6 - Add 12 more items to snack 3. Print quantity of snack 3.

    // 7 - Customer 2 buys 3 of snack 3. Print Customer 2 Cash on hand. Print quantity of snack 3.
  }
}