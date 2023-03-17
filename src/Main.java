public class Main {
    static float coat = 70;
    static float coatDiscount = 77;

    static float hat = 25;
    static float hatDiscount = 37;

    static float suit = 53;
    static float suitDiscount = 44;

    static float shirt = 19;

    static float shoes = 41;
    static float shoesDiscount = 32;

    static float balance = 312;

    private static float calculate() {
        // создание и инициализация переменной подсчёта стоимости
        return (coat * (100 - coatDiscount) + hat * (100 - hatDiscount)
                + suit * (100 - suitDiscount) + shirt
                + shoes * (100 - shoesDiscount)) / 100;
    }

    private static boolean possibility() {
        return calculate() < balance;
    }
    public static void main(String[] args) {

        System.out.println("Хватит денег или нет?");

        if (possibility()) {
            System.out.println("Да, хватит");
        }else{
            System.out.println("Нет, не хватит");
        }
    }
}
