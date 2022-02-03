public class Main {
    public static void main(String[] args) {

        int deposit = 3000;
        int depositAmount = 4000;

        int bonus;
        if (depositAmount > 1000) {
            bonus = depositAmount / 100;
        } else {
            bonus = 0;
        }
        int balance = deposit + depositAmount + bonus;
        System.out.println("Ваш платеж зачислен.Сумма на счете: " + balance + "руб.");
        System.out.println("Бонусныe рубли: " + bonus + "руб.");


    }
}
