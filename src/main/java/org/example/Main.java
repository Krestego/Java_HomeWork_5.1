public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        long amount = 6_500;
        boolean registred = true;
        long milles = (long) service.calculate(amount, registred);
        System.out.println("Количество бонусов : " + milles);
    }
}