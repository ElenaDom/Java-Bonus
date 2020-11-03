public class Main {
    public static void main(String[] args) {
        int price = 300;
        int ammount = 1800;
        int percent = 1;
        int bonus = ammount / 100 * percent;
        int limit = 1000;
        if (ammount < limit) {
            bonus = 0;}
        System.out.println(bonus);
    }
}
