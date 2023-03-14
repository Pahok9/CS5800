public class PolymorphismMain {

    public static void main(String[] args) {
        Ship[] ship = new Ship[3];

        ship[0] = new Ship("Mario", "2000");
        ship[1] = new CruiseShip("Zelda", "2004", 1999);
        ship[2] = new CargoShip("Pikachu", "2019", 20000);
        for (Ship s : ship) {
            s.print();
            System.out.println();
        }
    }

}
