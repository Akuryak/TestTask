import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);

        while (true){
            System.out.print("Введите математическое выражение: ");
            System.out.println(Calc(scannerInput.nextLine()));
        }

    }

    public static String Calc(String input){
        String[] masInput = input.split(" ");
        int numOne = Integer.parseInt(masInput[0]);
        int numTwo = Integer.parseInt(masInput[2]);

        if (numOne < 1 || numOne > 10 || numTwo < 1 || numTwo > 10) {
            return "Ошибка! Введите значения от 1 до 10";
        }

        String res = switch (masInput[1]) {
            case "+" -> String.valueOf(numOne + numTwo);
            case "-" -> String.valueOf(numOne - numTwo);
            case "*" -> String.valueOf(numOne * numTwo);
            case "/" -> String.valueOf(numOne / numTwo);
            default -> "Ошибка! Такого оператора нет";
        };
        return res;
    }
}