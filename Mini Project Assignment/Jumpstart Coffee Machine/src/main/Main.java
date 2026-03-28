package main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoffeeMachine coffeeMachine = new CoffeeMachine(400, 540, 120, 9, 550); 
        Coffee espresso = new Coffee("Espresso", 50, 0, 16, 4); 
        Coffee latte = new Coffee("Latte", 350, 75, 20, 7); 
        Coffee cappuccino = new Coffee("Cappuccino", 200, 100, 12, 6); 
 
        coffeeMachine.printContents(); 
 
        coffeeMachine.makeCoffee(espresso); 
        coffeeMachine.makeCoffee(latte); 
        coffeeMachine.makeCoffee(cappuccino); 
 
        coffeeMachine.emptyCashRegister(); 
        coffeeMachine.fillMachine(200, 100, 50, 5); 
        coffeeMachine.printContents(); 
        coffeeMachine.printTransactionHistory(); 
	}

}
