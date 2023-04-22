import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Document {
    private List<Character> doc = new ArrayList<>();

    public void addCharacter(char character, CharacterProperties characterProperties) {
        doc.add(new Character(character, characterProperties));
    }

    public String getText() {
        StringBuilder docString = new StringBuilder();
        for (Character character : doc) {
            docString.append(character.getValue());
        }
        return docString.toString();
    }

    public void saveToFile(String filePath) {
        try {
            FileWriter writer = new FileWriter(filePath);
            for (Character character : doc) {
                CharacterProperties properties = character.getProperties();
                char characterValue = character.getValue();
                String font = properties.getFont();
                int size = properties.getSize();
                String color = properties.getColor();
                writer.write(String.format("%c, %s, %d, %s\n", characterValue, font, size, color));
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadToFile(String filePath) {
        try {
            Scanner reader = new Scanner(new File(filePath));
            while(reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] splitter = line.split(",");
                if (splitter.length == 4) {
                    char characterValue = splitter[0].charAt(0);
                    String font = splitter[1].trim();
                    int size = Integer.parseInt(splitter[2].trim());
                    String color = splitter[3].trim();
                    addCharacter(characterValue, CharacterPropertiesFactory.getCharacterProperties(font, size, color));
                }

            }
            reader.close();
        } catch(FileNotFoundException e) {
            System.out.println("Error occurred!");
            e.printStackTrace();
        }
    }

    public void edit(int index, char newChar, CharacterProperties characterProperties) {
        doc.set(index, new Character(newChar, characterProperties));
    }
}