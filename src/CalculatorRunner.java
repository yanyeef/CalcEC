import java.util.Scanner;
public class CalculatorRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an expression with *, /, +, -, %, or ^:" );
        String equ = scan.nextLine();

        String one = equ.substring(0, equ.indexOf(" "));
        double first = Double.parseDouble(one);
        String two = equ.substring(equ.indexOf(" ") + 2);
        double second = Double.parseDouble(two);
        String sign = equ.substring(equ.indexOf(" ")+ 1, equ.indexOf(" ") + 2);

        Calculator cal = new Calculator(first, second);
        if (sign.equals("/")) {
            System.out.println(cal.divide());
        } else if  (sign.equals("*")) {
            System.out.println(cal.multiply());
        }else if (sign.equals("+")) {
            System.out.println(cal.add());
        } else if (sign.equals("-")) {
            System.out.println(cal.sub());
        }else if (sign.equals("%")) {
            System.out.println(cal.mod());
        }else if (sign.equals("^")) {
            System.out.println(cal.sqrt());
        }

    }
}
