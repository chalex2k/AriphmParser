import java.util.*;
/* код для исправления */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите балл за первую аттестацию: ");
        int att1 = scanner.nextInt();
        System.out.print("Введите балл за вторую аттестацию: ");
        int att2 = scanner.nextInt();
        System.out.print("Введите балл за первую аттестацию: ");
        int att3 = scanner.nextInt();

        System.out.println(getAverageAndPrintAverageAndMark(att1, att2, att3));

        scanner.close();
    }

    public static double getAverageAndPrintAverageAndMark(int att1, int att2, int att3) {
        double p = (att1 + att2 + att3) / 3.0;
        if (p < 25){ // если p меньше 25
            System.out.printf("Средний балл: %.2f%n", p);
            System.out.println("нет оценки");
            return p;
        } else {
            if (p < 35) {
                System.out.printf("Средний балл: %.2f%n", p);
                System.out.println("нет оценка 3");
            } else {
                if (p < 35) {
                    System.out.printf("Средний балл: %.2f%n", p);
                    System.out.println("оценка 4");
                } else {
                    System.out.printf("Средний балл: %.2f%n", p);
                    System.out.println("оценка 5");
                }
            }
        }
        return p;
    }

}