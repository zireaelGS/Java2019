package Chapter10.Task1017;

/*
0.17 tonnes:	1000 km на Average Car Diesel Car Average diesel car average value
https://www.carbonfootprint.com/calculator.aspx
*/
public class Car implements CarbonFootprint {

    private static double tonnesPerKm = 0.00017;
    private double mileage;//Километраж

    public Car(double mileage) {
        setMileage(mileage);
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getMileage() {
        return mileage;
    }

    @Override
    public double getCarbonFootprint() {
        return mileage * tonnesPerKm;
    }

    @Override
    public String toString() {
        return String.format("Car%nIdentifying information:%nMileage: %.3f", getMileage());
    }
}
