public class Main {
    public static void main(String[] args) {
        int money = 0; //денег на счету
        int refill = 1500; //пополнение счета
        int bonus = 0;


        if (refill >= 1000) {
            bonus = refill / 100;
        }

        int summa = money + refill + bonus;


        System.out.println("На вашем счету " + summa);
        if (bonus > 0) {
            System.out.println("Бонусных рублей " + bonus);
        }
    }
}
