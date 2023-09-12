public class Main {
    public static void main(String[] args) {
        int a = 0; //денег на счету
        int b = 1500; //пополнение счета
        int bonus = 0;


        if (b >= 1000) {
            bonus = b / 100;
        }

        int i = a + b + bonus;


        System.out.println("На вашем счету " + i);
        if (bonus > 0) {
            System.out.println("Бонусных рублей " + bonus);
        }
    }
}