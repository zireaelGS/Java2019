package Chapter10.Task1017;
/*FOR RUSSIAN FEDERATION
0.33 tonnes:	1000 kWh of electricity at 0.3302 kgCO2e/kWh
0.18 tonnes:	1000 kWh of natural gas
0.25 tonnes:	1000 kWh of heating oil
0.34 tonnes:	1000 kWh of coal
0.21 tonnes:	1000 kWh of LPG
1.52 tonnes:	1000 litres of propane
73.14 tonnes:	1000 tonnes of wood
https://www.carbonfootprint.com/calculator.aspx
*/

public class Building implements CarbonFootprint {

    private static double electricityPerOneKWh = 0.00033;
    private static double naturalGasPerOneKWh = 0.00018;
    private static double heatingOilPerOneKWh = 0.00025;
    private static double coalPerOneKWh = 0.00034;
    private static double lpgPerOneKWh = 0.00021;
    private static double propanePerOneLiter = 0.00152;
    private static double woodenPelletsPerOneTonne = 0.07314;

    private double electricity;//Электричество
    private double naturalGas;//Природный газ
    private double heatingOil;//Печное топливо:
    private double coal;//Уголь
    private double lpg;//Сжиженный газ
    private double propane;//Пропан
    private double woodenPellets;//Древесные гранулы

    public Building(double electricity, double naturalGas, double heatingOil, double coal, double lpg, double propane, double woodenPellets) {
        setCoal(coal);
        setElectricity(electricity);
        setHeatingOil(heatingOil);
        setLpg(lpg);
        setNaturalGas(naturalGas);
        setPropane(propane);
        setWoodenPellets(woodenPellets);
    }

    public void setCoal(double coal) {
        this.coal = coal;
    }

    public void setNaturalGas(double naturalGas) {
        this.naturalGas = naturalGas;
    }

    public void setElectricity(double electricity) {
        this.electricity = electricity;
    }

    public void setHeatingOil(double heatingOil) {
        this.heatingOil = heatingOil;
    }


    public void setPropane(double propane) {
        this.propane = propane;
    }

    public void setWoodenPellets(double woodenPellets) {
        this.woodenPellets = woodenPellets;
    }

    public double getCoal() {
        return coal;
    }

    public double getElectricity() {
        return electricity;
    }

    public double getHeatingOil() {
        return heatingOil;
    }

    public double getLpg() {
        return lpg;
    }

    public double getNaturalGas() {
        return naturalGas;
    }

    public double getPropane() {
        return propane;
    }

    public double getWoodenPellets() {
        return woodenPellets;
    }


    public void setLpg(double lpg) {
        this.lpg = lpg;
    }

    @Override
    public double getCarbonFootprint() {
        return getCoal() * coalPerOneKWh + getElectricity() * electricityPerOneKWh + getHeatingOil() * heatingOilPerOneKWh + getLpg() * lpgPerOneKWh
                + getNaturalGas() * naturalGasPerOneKWh + getPropane() * propanePerOneLiter + getWoodenPellets() * woodenPelletsPerOneTonne;
    }

    @Override
    public String toString() {
        return String.format("Building%nIdentifying information:%nElectricity: %.3f%nNaturalGas: %.3f%nHeatingOil: %.3f%n" +
                        "Coal: %.3f%nLpg: %.3f%nPropane: %.3f%nWoodenPellets: %.3f", getElectricity(), getNaturalGas(),
                getHeatingOil(), getCoal(), getLpg(), getPropane(), getWoodenPellets());
    }

}
