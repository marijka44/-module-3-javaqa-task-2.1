public class Main {
    public static void main(String[] args) {
        int ONE_MILE_BONUS_RATE = 20;
        int amount = 2400;
        int bonusMiles;

        bonusMiles = amount / ONE_MILE_BONUS_RATE;

        System.out.println("Количество бонусных миль: " + bonusMiles);
    }
}