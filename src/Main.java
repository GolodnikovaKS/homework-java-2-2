
public class Main {
    public static void main(String[] args) {
        double initialSum = 23.5;
        double addition = 1100;
        double present;
        if (addition >= 1000) {
            present = addition / 100;
        } else present = 0;

        System.out.printf("Спасибо за пополнение!" +
                "\nНа вашем счету: " + (initialSum + addition + present) + " рублей" +
                "\nВнесено: " + addition + " рублей" +
                "\nПодарок составил: " + present + " рублей");
    }
}