import java.util.Scanner;
public class SciCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int calculationsCounter = 0; //initializes variables at the start of the program that should not be reset
        double totalCalculations = 0;
        int menuSelection = 1;
        double currentResult = 0.0;

        while (menuSelection != 0) { //while loop to show menu selection
            if (menuSelection >= 1 && menuSelection <= 6) {
                System.out.println();
                System.out.println("Current Result: " + currentResult);
                System.out.println();
                System.out.println("Calculator Menu");
                System.out.println("---------------");
                System.out.println("0. Exit Program");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exponentiation");
                System.out.println("6. Logarithm");
                System.out.println("7. Display Average");
            }
            System.out.println();
            System.out.print("Enter Menu Selection: ");
            menuSelection = scan.nextInt();

            switch (menuSelection) { //Switch to select the operations that the scientific calculator will do
                case 0:
                    System.out.println();
                    System.out.println("Thanks for using this calculator. Goodbye!");
                    menuSelection = 0;
                    break;

                case 1: //addition case
                    System.out.print("Enter first operand: ");
                    String firstNumberString = scan.next();
                    double firstNumber;
                    if (firstNumberString.equals("RESULT")) { //Test if the input is "RESULT"
                        double resultNumber = currentResult;
                        firstNumber = resultNumber;
                    }
                    else {
                        firstNumber = Double.parseDouble(firstNumberString);
                    }
                    System.out.print("Enter second operand: ");
                    String secondNumberString = scan.next();
                    double secondNumber;
                    if (secondNumberString.equals("RESULT")) { //Test if the second input is "RESULT"
                        double resultNumber = currentResult;
                        secondNumber = resultNumber;
                    }
                    else{
                        secondNumber = Double.parseDouble(secondNumberString);
                    }

                    currentResult= firstNumber + secondNumber;
                    calculationsCounter++;
                    totalCalculations += currentResult;
                    break;

                case 2: //subtraction case
                    System.out.print("Enter first operand: ");
                    firstNumberString = scan.next();
                    if (firstNumberString.equals("RESULT")) { //Test if the input is "RESULT"
                        double resultNumber = currentResult;
                        firstNumber = resultNumber;
                    }
                    else {
                        firstNumber = Double.parseDouble(firstNumberString);
                    }
                    System.out.print("Enter second operand: ");
                    secondNumberString = scan.next();
                    if (secondNumberString.equals("RESULT")) { //Test if the second input is "RESULT"
                        double resultNumber = currentResult;
                        secondNumber = resultNumber;
                    }
                    else{
                        secondNumber = Double.parseDouble(secondNumberString);
                    }
                    currentResult = firstNumber - secondNumber;
                    calculationsCounter++;
                    totalCalculations += currentResult;
                    break;

                case 3: //multiplication case
                    System.out.print("Enter first operand: ");
                    firstNumberString = scan.next();
                    if (firstNumberString.equals("RESULT")) { //Test if the input is "RESULT"
                        double resultNumber = currentResult;
                        firstNumber = resultNumber;
                    }
                    else {
                        firstNumber = Double.parseDouble(firstNumberString);
                    }
                    System.out.print("Enter second operand: ");
                    secondNumberString = scan.next();
                    if (secondNumberString.equals("RESULT")) { //Test if the second input is "RESULT"
                        double resultNumber = currentResult;
                        secondNumber = resultNumber;
                    }
                    else{
                        secondNumber = Double.parseDouble(secondNumberString);
                    }
                    currentResult = firstNumber * secondNumber;
                    calculationsCounter++;
                    totalCalculations += currentResult;
                    break;

                case 4: //division case
                    System.out.print("Enter first operand: ");
                    firstNumberString = scan.next();
                    if (firstNumberString.equals("RESULT")) { //Test if the input is "RESULT"
                        double resultNumber = currentResult;
                        firstNumber = resultNumber;
                    }
                    else {
                        firstNumber = Double.parseDouble(firstNumberString);
                    }
                    System.out.print("Enter second operand: ");
                    secondNumberString = scan.next();
                    if (secondNumberString.equals("RESULT")) { //Test if the second input is "RESULT"
                        double resultNumber = currentResult;
                        secondNumber = resultNumber;
                    }
                    else{
                        secondNumber = Double.parseDouble(secondNumberString);
                    }
                    currentResult = firstNumber / secondNumber;
                    calculationsCounter++;
                    totalCalculations += currentResult;
                    break;

                case 5: //exponentiation case
                    System.out.print("Enter first operand: ");
                    firstNumberString = scan.next();
                    if (firstNumberString.equals("RESULT")) { //Test if the input is "RESULT"
                        double resultNumber = currentResult;
                        firstNumber = resultNumber;
                    }
                    else {
                        firstNumber = Double.parseDouble(firstNumberString);
                    }
                    System.out.print("Enter second operand: ");
                    secondNumberString = scan.next();
                    if (secondNumberString.equals("RESULT")) { //Test if the second input is "RESULT"
                        double resultNumber = currentResult;
                        secondNumber = resultNumber;
                    }
                    else{
                        secondNumber = Double.parseDouble(secondNumberString);
                    }
                    currentResult = Math.pow(firstNumber, secondNumber);
                    calculationsCounter++;
                    totalCalculations += currentResult;
                    break;

                case 6: //logarithm case
                    System.out.print("Enter first operand: ");
                    firstNumberString = scan.next();
                    if (firstNumberString.equals("RESULT")) { //Test if the input is "RESULT"
                        double resultNumber = currentResult;
                        firstNumber = resultNumber;
                    }
                    else {
                        firstNumber = Double.parseDouble(firstNumberString);
                    }
                    System.out.print("Enter second operand: ");
                    secondNumberString = scan.next();
                    if (secondNumberString.equals("RESULT")) { //Test if the second input is "RESULT"
                        double resultNumber = currentResult;
                        secondNumber = resultNumber;
                    }
                    else{
                        secondNumber = Double.parseDouble(secondNumberString);
                    }
                    currentResult = (Math.log(secondNumber)) / (Math.log(firstNumber));
                    calculationsCounter++;
                    totalCalculations += currentResult;
                    break;

                case 7: //finding the average of the values
                    if (calculationsCounter == 0) {
                        System.out.println();
                        System.out.println("Error: No calculations yet to average!");
                    }
                    else {
                        System.out.println("Sum of calculations: " + totalCalculations);
                        System.out.println("Number of calculations: " + calculationsCounter);
                        double average = (Math.round((100.0 * totalCalculations) / calculationsCounter));
                        System.out.println("Average of calculations: " + average / 100);
                    }
                    break;

                default:
                    System.out.println();
                    System.out.println("Error: Invalid selection!");


            }
        }
    }
} //WOW AN UPDATE USING GITHUB HOLY SMOKES!

