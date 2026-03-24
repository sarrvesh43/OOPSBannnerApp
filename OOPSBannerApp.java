import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // UC7: Inner class to store character + pattern
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Map to store all patterns
    static class CharacterPatternMap {
        private static final Map<Character, CharacterPattern> patternMap = new HashMap<>();

        static {
            patternMap.put('O', new CharacterPattern('O', new String[]{
                    " ***** ",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    "*     *",
                    " ***** "
            }));

            patternMap.put('P', new CharacterPattern('P', new String[]{
                    " ***** ",
                    "*     *",
                    "*     *",
                    " ***** ",
                    "*      ",
                    "*      ",
                    "*      "
            }));

            patternMap.put('S', new CharacterPattern('S', new String[]{
                    " ***** ",
                    "*      ",
                    "*      ",
                    " ***** ",
                    "      *",
                    "      *",
                    " ***** "
            }));
        }

        public static String[] getPattern(char c) {
            return patternMap.get(c).getPattern();
        }
    }

    public static void main(String[] args) {

        String text = "OOPS";

        // Loop through each row
        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            // Loop through each character
            for (char ch : text.toCharArray()) {
                line.append(CharacterPatternMap.getPattern(ch)[i]).append("  ");
            }

            System.out.println(line);
        }
    }
}