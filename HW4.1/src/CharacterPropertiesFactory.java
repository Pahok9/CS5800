import java.util.HashMap;
import java.util.Map;

public class CharacterPropertiesFactory {
    private static Map<String, CharacterProperties> propertiesMap = new HashMap<>();

    public static CharacterProperties getCharacterProperties(String font, int size, String color) {
        String key = font + size + color;
        if (!propertiesMap.containsKey(key)) {
            propertiesMap.put(key, new CharacterProperties(font, size, color));
        }
        return propertiesMap.get(key);
    }
}