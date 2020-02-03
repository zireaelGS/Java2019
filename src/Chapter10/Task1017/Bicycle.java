package Chapter10.Task1017;

/*Cycling is usually a low-carbon way to travel – but it depends on what you eat.
The carbon footprint of cycling a mile:
65g CO2e: powered by bananas
90g CO2e: powered by cereals with milk
200g CO2e: powered by bacon
260g CO2e: powered by cheeseburgers
2800g CO2e: powered by air-freighted asparagus
https://www.theguardian.com/environment/2010/jun/08/carbon-footprint-cycling
*/
public class Bicycle implements CarbonFootprint {
    private static double averageFootprintPerMile = 50;//default
    private static double bananasFootprintPerMile = 65;//1
    private static double milkFootprintPerMile = 90;//2
    private static double baconFootprintPerMile = 200;//3
    private static double cheeseburgersFootprintPerMile = 260;//4
    private static double airFreightedAsparagusFootprintPerMile = 2800;//5
    private static double multuplierGramToMetricTonnes = 0.000001;
    private double miles;
    private int food;


    public Bicycle(double miles, int food) {
        setMiles(miles);
        setFood(food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        if (food < 0 || food > 5) {
            throw new IllegalArgumentException("food must be between 1 and 6 (inclusive 6)");
        }
        this.food = food;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }

    public double getMiles() {
        return miles;
    }

    @Override
    public double getCarbonFootprint() {
        String choosedFoodName = "Average";
        double choosedFood;
        switch (food) {
            case 1:
                choosedFoodName = "Bananas";
                choosedFood = 65;
                break;
            case 2:
                choosedFoodName = "Milk";
                choosedFood = 90;
                break;
            case 3:
                choosedFoodName = "Bacon";
                choosedFood = 200;
                break;
            case 4:
                choosedFoodName = "Cheeseburgers";
                choosedFood = 260;
            case 5:
                choosedFoodName = "AirFreightedAsparagus";
                choosedFood = 2800;
                break;
            default:
                choosedFood = 50;
                break;
        }
        System.out.println("Powered by: " + choosedFoodName);
        return getMiles() * choosedFood * multuplierGramToMetricTonnes;
    }

    @Override
    public String toString() {
        return String.format("Bicycle%nIdentifying information:%nMiles: %.3f", getMiles());
    }

}
