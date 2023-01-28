public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int check = 1000;
        int bonus;
        if (check < 1000) {
            bonus = 0;
        } else {
            bonus = check / 100;
        }
        balance = balance + check + bonus;

        System.out.println("Колличество бонусов: " + bonus);
        System.out.println(" Итоговый баланс: " + balance);

    }
}
