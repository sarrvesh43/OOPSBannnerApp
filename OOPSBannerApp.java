class Banner {

    void displayBanner() {

        String border = String.join("", "*","*","*","*","*","*","*","*","*","*",
                                         "*","*","*","*","*","*","*","*","*","*","*","*","*","*");

        String emptyLine = String.join("", "*",
                "                      ",
                "*");

        String textLine = String.join("", "*",
                "        OOPS          ",
                "*");

        System.out.println(border);
        System.out.println(emptyLine);
        System.out.println(textLine);
        System.out.println(emptyLine);
        System.out.println(border);
    }
}

public class OOPSBannerApp {

    public static void main(String[] args) {

        Banner banner = new Banner();
        banner.displayBanner();

    }
}