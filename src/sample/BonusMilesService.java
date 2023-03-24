package sample;

public class BonusMilesService {
    public int calculate(int price, int numberPerMile) {
        int miles = price / numberPerMile;
        return miles;
    }
}