package snackBar;

public class VendingMachine
{
  // fields
  private static int maxId = 0;
  private int id;
  private String name;

  // constructor
  public VendingMachine(String name)
  {
    maxId++;
    id = maxId;
    this.name = name;
  }

  // methods
  public void getId()
  {
    return id;
  }

  public void getName()
  {
    return name;
  }

  public setName(String name)
  {
    this.name = name;
  }
}