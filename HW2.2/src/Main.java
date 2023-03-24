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
	    TeslaFactory teslaCar1 = TeslaFactory.getInstance();
        teslaCar1.build();
        HondaFactory hondaCar = HondaFactory.getInstance();
        hondaCar.build();
        PorscheFactory porscheCar = PorscheFactory.getInstance();
        porscheCar.build();

        AirbusFactory airbusPlane = AirbusFactory.getInstance();
        airbusPlane.build();
        BoeingFactory boeingPlane = BoeingFactory.getInstance();
        boeingPlane.build();
        EmbraerFactory embraerPlane = EmbraerFactory.getInstance();
        embraerPlane.build();

        SeaRayFactory seaRayBoat = SeaRayFactory.getInstance();
        seaRayBoat.build();
        MastercraftFactory mastercraftBoat = MastercraftFactory.getInstance();
        mastercraftBoat.build();
        BertramFactory bertramBoat = BertramFactory.getInstance();
        bertramBoat.build();
    }
}
