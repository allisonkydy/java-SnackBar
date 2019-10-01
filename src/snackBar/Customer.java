package snackBar;

public class Customer
{
  // fields
  private static int maxId = 0;
  private int id;
  private String name;
  private double cash;

  // constructor
  public Customer(String name, double cash)
  {
    maxId++;
    id = maxId;
    this.name = name;
    this.cash = cash;
  }

  // methods
  public int getId()
  {
    return id;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public double getCash()
  {
    return cash;
  }

  public void addCash(double numToAdd)
  {
    cash += numToAdd;
  }

  public void buySnack(double total)
  {
    cash -= total;
  }
}