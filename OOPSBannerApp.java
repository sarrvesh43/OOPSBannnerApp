import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // UC8: Map to store character patterns
    static Map<Character, String[]> patternMap = new HashMap<>();

    // Initialize patterns
    static void initializePatterns() {

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });
    }

    // UC8: Function to render banner
    static void printBanner(String text) {

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : text.toCharArray()) {
                line.append(patternMap.get(ch)[i]).append("  ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        initializePatterns();     // Load patterns
        printBanner("OOPS");      // Render banner

    }
}