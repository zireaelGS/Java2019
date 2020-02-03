package Chapter10.Task1017;

import java.util.ArrayList;
import java.util.List;

public class Task17 {
    public static void main(String[] args) {
        //создаем коллекцию
        List<CarbonFootprint> carbonFootprints = new ArrayList<>();
        //помещаем ссылки на созданые объекты в ArrayList <CarbonFootprint>
        carbonFootprints.add(new Bicycle(50, 3));
        carbonFootprints.add(new Building(2, 4, 7, 4, 3, 6, 6));
        carbonFootprints.add(new Car(200));
        //перебираем коллекцию, полиморфно вызывая метод getCarbonFootprint каждого объекта,
        // а так же выводим некоторую информацию об объектах
        for (CarbonFootprint item : carbonFootprints) {
            //общая информация об объекте
            System.out.println(item);
            //углеродный след объекта
            System.out.println("Carbon footprint: " + item.getCarbonFootprint() + " Metric Tons of CO2\n");
        }
    }
}
