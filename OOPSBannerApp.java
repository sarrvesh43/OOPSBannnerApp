class Banner {

    void displayBanner() {

        // UC5: Declare + initialize array in one step using String.join()
        String[] bannerLines = {

                String.join("", "*","*","*","*","*","*","*","*","*","*",
                                   "*","*","*","*","*","*","*","*","*","*",
                                   "*","*","*","*"),

                String.join("", "*", "                      ", "*"),

                String.join("", "*", "        OOPS          ", "*"),

                String.join("", "*", "                      ", "*"),

                String.join("", "*","*","*","*","*","*","*","*","*","*",
                                   "*","*","*","*","*","*","*","*","*","*",
                                   "*","*","*","*")
        };

        // Loop to print
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