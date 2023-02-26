public class Main {
    public static void main(String[] args) {

        int start = 100; // текущий счёт
        int refill = 1100; // сумма пополнения
        int costbonus = 100; // сколько рублей стоит 1 бонус
        int bonus = refill / costbonus;
        if (refill > 1000) {
            System.out.println("Ваш балланс " + (start + refill + bonus));
            System.out.println("Количество бонусных рублей " + bonus);
        } else {
            System.out.println("Ваш балланс " + (start + refill));
        }
    }
}


/* public class Main {
    public static void main(String[] args) {

        int start = 100; // текущий счёт
        int refill = 1100; // сумма пополнения
        int costbonus = 100; // сколько рублей стоит 1 бонус
        int bonus = refill / costbonus;
        boolean b = refill > 1000;
        if (b) {
            System.out.println("Ваш балланс " + (start + refill + bonus));
            System.out.println("Количество бонусных рублей " + bonus);
        } else {
            System.out.println("Ваш балланс " + (start + refill));
        }
    }
}
*/

/* public class Main {
    public static void main(String[] args) {

        int start = 100; // текущий счёт
        int refill = 1100; // сумма пополнения
        int bonus = refill / 100;
        boolean b = refill > 1000;
        if (b) {
            System.out.println("Ваш балланс " + (start + refill + bonus));
            System.out.println("Количество бонусных рублей " + bonus);
        } else {
            System.out.println("Ваш балланс " + (start + refill));
        }
    }
}
*/
