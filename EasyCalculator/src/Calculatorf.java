import java.util.Scanner;

class Calculatorf {
    protected String op;
    protected double n1;
    protected double n2;

    public void letStart() {
        boolean err = true;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Insert first float:");
            double n1 = Double.parseDouble(sc.next());
            this.n1 = n1;
            System.out.println("Insert second float");
            double n2 = Double.parseDouble(sc.next());
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
