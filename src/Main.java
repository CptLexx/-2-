public class Main {

    public static void main(String[] arcs) {
        int initialAccount = 11_000;
        int payment = 345;

        int bonus;
        if (payment > 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }
        //int bonus = payment > 1000 ? payment / 100 : 0;

        int finalAccount = initialAccount + payment + bonus;
        System.out.println("На счёте " + finalAccount);
        System.out.println("Бонус: " + bonus);
    }

}