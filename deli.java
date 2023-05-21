import java.io.*;
public class main {
public static void main(String[] args) throws IOException
{
BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

String sandwich, bread, condiment, drink;
double tab;
System.out.println("Welcome To the Sandwich Corral\n\n"
+ "You will be given choices for building your sandwich\n"
+ "Please enter your selection after each prompt and press "
+ "the enter key.\n");
System.out.print("Please enter your sandwich choice.\n"
+ "Ham, Beef, Reuben, PBJ, Cheese, or Vegetarian: ");
sandwich = keyboard.readLine();

System.out.print("Please enter your bread selection.\n"
+ "Rye, Wheat, White, Sourdough, Pumpernickel: ");
bread = keyboard.readLine();

System.out.print("Please enter your choice of condiment (oneonly).\n"
+ "Mayo, Mustard, Ketchup, none: ");
condiment = keyboard.readLine();

System.out.print("Please enter your drink choice.\n"
+"Coke, Diet, Tea, Coffee, Water: ");
drink = keyboard.readLine();

System.out.print("Please enter 3.99 for a half sandwich or "
+ "5.99 for a whole sandwich: ");
tab = Double.parseDouble(keyboard.readLine());

System.out.print("You have entered the following information:\n"
+ "\nSandwich:\t" + sandwich
+ "\nBread:\t\t" + bread
+ "\nCondiment:\t" + condiment
+ "\nDrink:\t\t" + drink
+ "\n\nTab:\t\t" + tab);
}
}
