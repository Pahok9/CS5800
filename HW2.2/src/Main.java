import AirplanePackage.AirbusFactory;
import AirplanePackage.BoeingFactory;
import AirplanePackage.EmbraerFactory;
import BoatPackage.BertramFactory;
import BoatPackage.MastercraftFactory;
import BoatPackage.SeaRayFactory;
import CarPackage.HondaFactory;
import CarPackage.PorscheFactory;
import CarPackage.TeslaFactory;

public class Main {

    public static void main(String[] args) {
	    TeslaFactory teslaCar1 = new TeslaFactory();
        teslaCar1.build();
        HondaFactory hondaCar = new HondaFactory();
        hondaCar.build();
        PorscheFactory porscheCar = new PorscheFactory();
        porscheCar.build();

        AirbusFactory airbusPlane = new AirbusFactory();
        airbusPlane.build();
        BoeingFactory boeingPlane = new BoeingFactory();
        boeingPlane.build();
        EmbraerFactory embraerPlane = new EmbraerFactory();
        embraerPlane.build();

        SeaRayFactory seaRayBoat = new SeaRayFactory();
        seaRayBoat.build();
        MastercraftFactory mastercraftBoat = new MastercraftFactory();
        mastercraftBoat.build();
        BertramFactory bertramBoat = new BertramFactory();
        bertramBoat.build();
    }
}
