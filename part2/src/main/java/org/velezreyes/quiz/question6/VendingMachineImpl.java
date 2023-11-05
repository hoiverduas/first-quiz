package org.velezreyes.quiz.question6;

public class VendingMachineImpl implements VendingMachine {

  private Integer insertedMoney;
  private static VendingMachine instance;

  public static VendingMachine getInstance() {
    if (instance == null) {
      instance = new VendingMachineImpl();
    }
    return instance;
  }

  public VendingMachineImpl() {
    this.insertedMoney = 0; // Initialize insertedMoney to 0 when a new vending machine instance is created.
  }

  @Override
  public void insertQuarter() {
    insertedMoney += 25;  // Add 25 cents when a coin is inserted.
  }

  @Override
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
    if ("ScottCola".equals(name)) {
      if (insertedMoney >= 75) {
        insertedMoney -= 75;  // Deduce 75 centavos por ScottCola.
        return new Beverage("ScottCola", true);  // Crea y devuelve una nueva bebida ScottCola con gas.
      } else {
        throw new NotEnoughMoneyException();  // Lanza una excepción si no hay suficiente dinero para ScottCola.
      }
    } else if ("KarenTea".equals(name)) {
      if (insertedMoney >= 100) {
        insertedMoney -= 100;  // Deduce 100 centavos por KarenTea.
        return new Beverage("KarenTea", false);  // Crea y devuelve una nueva bebida KarenTea sin gas.
      } else {
        throw new NotEnoughMoneyException();  // Lanza una excepción si no hay suficiente dinero para KarenTea.
      }
    } else {
      throw new UnknownDrinkException();  // Lanza una excepción si se presiona un botón de bebida desconocida.
    }
  }

}
