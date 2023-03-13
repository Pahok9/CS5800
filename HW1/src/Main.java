public class Main {

    public static void main(String[] args) {
//        inheritance();
//        polymorphism();
//        aggregation();
        composition();
    }

    public static void inheritance() {
        SalariedEmployee employee1 = new SalariedEmployee("Joe", "Jones", "111-11-111", 2500);
        HourlyEmployee employee2 = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        HourlyEmployee employee3 = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        CommissionEmployee employee4 = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 15, 50000);
        SalariedEmployee employee5 = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        BaseEmployee employee6 = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        CommissionEmployee employee7 = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 22, 40000);
    }

    public static void polymorphism() {
        Ship ship[] = new Ship[3];

        ship[0] = new Ship("Ship", "2000");
        ship[1] = new CruiseShip("Cruise", "2004", 1999);
        ship[2] = new CargoShip("Cargo", "2019", 20000);
        for (Ship s : ship) {
            s.print();
            System.out.println();
        }
    }

    public static void aggregation() {
        Instructor instructor1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook textbook1 = new Textbook("Clean Code", "Robert C. Martin");
        Course course1 = new Course("Advanced Software Engineering", instructor1, textbook1);
        course1.print();
        Instructor instructor2 = new Instructor("David", "Johannsen", "8-348");
        Textbook textbook2 = new Textbook("Computer Architecture", "John L. Hennessy");
        Course course2 = new Course("Advanced Computer Architecture", instructor2, textbook2);
        course2.print();
        Instructor instructor3 = new Instructor("Markus", "Eger", "8-438");
        Textbook textbook3 = new Textbook("Artificial Intelligence and Games", "Georgios N. Yannakakis");
        Course course3 = new Course("AI in Interactive Digital Entertainment", instructor3, textbook3);
        course3.print();
    }

    public static void composition() {
        Folder phpFolder = new Folder("php_demo1");
        Folder appFolder = new Folder("app");
        Folder publicFolder = new Folder("public");

        phpFolder.addSubFolder(appFolder);
        phpFolder.addSubFolder(publicFolder);

        File composerJson = new File("composer.json");
        File indexPhp = new File("index.php");
        File bootstrapPhp = new File("bootstrap.php");

        phpFolder.addFile(composerJson);
        phpFolder.addFile(indexPhp);
        phpFolder.addFile(bootstrapPhp);

        File indexHtml = new File("index.html");

        publicFolder.addFile(indexHtml);

        // Print the file system content
        System.out.println("Before deletion:");
        phpFolder.print();

        // Delete the app folder
        phpFolder.removeSubFolder(appFolder);

        // Print the file system content again
        System.out.println("After deleting the app folder:");
        phpFolder.print();

        // Delete the public folder
        phpFolder.removeSubFolder(publicFolder);

        // Print the file system content one more time
        System.out.println("After deleting the public folder:");
        phpFolder.print();
    }
}
