import sample.BonusMilesService;

public class Main {

    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 100000;
        int numberPerMile = 50;
        int miles = service.calculate(price, numberPerMile);
        System.out.println("Количество бонусных миль: " + miles);
    }
}
