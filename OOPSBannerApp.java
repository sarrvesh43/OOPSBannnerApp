class Banner {

    void displayBanner() {

        String border = String.join("", 
                "*","*","*","*","*","*","*","*","*","*",
                "*","*","*","*","*","*","*","*","*","*",
                "*","*","*","*");

        String emptyLine = String.join("", "*",
                "                      ",
                "*");

        String textLine = String.join("", "*",
                "        OOPS          ",
                "*");

        // UC4: Store all lines inside an array
        String[] bannerLines = {
                border,
                emptyLine,
                textLine,
                emptyLine,
                border
        };

        // UC4: Loop through array and print
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}

public class OOPSBannerApp {

    public static void main(String[] args) {

        Banner banner = new Banner();
        banner.displayBanner();

    }
}