public class AggregationMain {

    public static void main(String[] args) {
        Instructor instructor1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook textbook1 = new Textbook("Clean Code", "Robert C. Martin");
        Course course1 = new Course("Advanced Software Engineering", instructor1, textbook1);
        course1.print();
        System.out.println();
        Instructor instructor2 = new Instructor("David", "Johannsen", "8-348");
        Textbook textbook2 = new Textbook("Computer Architecture", "John L. Hennessy");
        Course course2 = new Course("Advanced Computer Architecture", instructor2, textbook2);
        course2.print();
        System.out.println();
        Instructor instructor3 = new Instructor("Markus", "Eger", "8-438");
        Textbook textbook3 = new Textbook("Artificial Intelligence and Games", "Georgios N. Yannakakis");
        Course course3 = new Course("AI in Interactive Digital Entertainment", instructor3, textbook3);
        course3.print();
    }

}
