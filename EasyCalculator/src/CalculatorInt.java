import java.util.Scanner;

class CalculatorInt extends CalculatorA {
    protected String op;
    protected int n1;
    protected int n2;

    public void letStart() {
        boolean err = true;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Insert first integer:");
            int n1 = Integer.parseInt(sc.next());
            this.n1 = n1;
            System.out.println("Insert second integer");
            int n2 = Integer.parseInt(sc.next());
            this.n2 = n2;
            System.out.println("Operation (+, -, /, *):");
            String op = sc.next().toLowerCase();
            this.op = op;
        } catch (Exception e) {
            System.out.println("Ops, apparently " + e + " happened");
            System.out.println("Please try again.");
            while (err) {
                letStart();
                err = false;
            }
        }
        try {
            switch (op) {
                case "+":
                    System.out.println("The result is: " + (n1 + n2) + ".");
                    break;
                case "-":
                    System.out.println("The result is:" + (n1 - n2) + ".");
                    break;
                case "*":
                    System.out.println("The result is:" + (n1 * n2) + ".");
                    break;
                case "/":
                    System.out.println("The result is:" + (n1 / n2) + ".");
                    break;
                default:
                    letStart();
                    break;
            }
        } catch (ArithmeticException e) {
            System.out.println("Ops, apparently " + e + " happened");
            System.out.println("Please try again.");
            while (err) {
                letStart();
                err = false;
            }
        }
    }
}
