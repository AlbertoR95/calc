import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculatorf f = new Calculatorf();
        CalculatorInt i = new CalculatorInt();

        System.out.println("Welcome to my calculator");
        System.out.println("");
        System.out.println("Float insert f");
        System.out.println("");
        System.out.println("Integer insert i");
        String choose = sc.next().toLowerCase();

        while(!choose.equals("i") & !choose.equals("f")) {
            System.out.println("Ops");
            System.out.println("Float insert f");
            System.out.println("");
            System.out.println("Integer insert i");
            choose = sc.next().toLowerCase();
        }

        if (choose.equals("i")) {
            i.letStart();
        } else if (choose.equals("f")) {
            f.letStart();
        }

    }
}
