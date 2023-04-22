public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        addCharacterTest(document);
        System.out.println(document.getText());
        document.edit(15, '0', CharacterPropertiesFactory.getCharacterProperties("Arial", 22, "Red"));
        System.out.println("After edited:");
        System.out.println(document.getText());
        document.saveToFile("test.txt");
        document.loadToFile("test.txt");
    }

    public static void addCharacterTest(Document doc) {
        doc.addCharacter('H', CharacterPropertiesFactory.getCharacterProperties("Arial", 12, "Red"));
        doc.addCharacter('e', CharacterPropertiesFactory.getCharacterProperties("Abadi", 12, "Green"));
        doc.addCharacter('l', CharacterPropertiesFactory.getCharacterProperties("Calibri", 14, "Blue"));
        doc.addCharacter('l', CharacterPropertiesFactory.getCharacterProperties("Times New Roman", 14, "Gray"));
        doc.addCharacter('o', CharacterPropertiesFactory.getCharacterProperties("Times New Roman", 16, "Black"));
        doc.addCharacter('W', CharacterPropertiesFactory.getCharacterProperties("Arial", 16, "Violet"));
        doc.addCharacter('o', CharacterPropertiesFactory.getCharacterProperties("Calibri", 14, "Orange"));
        doc.addCharacter('r', CharacterPropertiesFactory.getCharacterProperties("Abadi", 14, "Yellow"));
        doc.addCharacter('l', CharacterPropertiesFactory.getCharacterProperties("Calibri", 12, "Pink"));
        doc.addCharacter('d', CharacterPropertiesFactory.getCharacterProperties("Arial", 12, "Red"));
        doc.addCharacter('C', CharacterPropertiesFactory.getCharacterProperties("Calibri", 14, "Red"));
        doc.addCharacter('S', CharacterPropertiesFactory.getCharacterProperties("Times New Roman", 14, "Blue"));
        doc.addCharacter('5', CharacterPropertiesFactory.getCharacterProperties("Abadi", 20, "Blue"));
        doc.addCharacter('8', CharacterPropertiesFactory.getCharacterProperties("Arial", 20, "Blue"));
        doc.addCharacter('0', CharacterPropertiesFactory.getCharacterProperties("Times New Roman", 22, "Black"));
        doc.addCharacter('9', CharacterPropertiesFactory.getCharacterProperties("Calibri", 22, "Green"));
    }
}
