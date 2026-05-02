class HospitalUI {

    static final String RESET = "\u001B[0m";

    static final String RED = "\u001B[31m";
    static final String GREEN = "\u001B[32m";
    static final String YELLOW = "\u001B[33m";
    static final String BLUE = "\u001B[34m";
    static final String PURPLE = "\u001B[35m";
    static final String CYAN = "\u001B[36m";
    static final String ORANGE = "\u001B[38;5;208m";

    static void showLogo() {

        System.out.println(CYAN + "====================================================");
        System.out.println("          HOSPITAL MANAGEMENT SYSTEM         ");
        System.out.println("====================================================" + RESET);
    }

    static void loading() {
        try {
            System.out.print("Loading System");
            for(int i=0;i<3;i++) {
                System.out.print(".");
                Thread.sleep(400);
            }
            System.out.println("\nSystem Ready ✔\n");
        } catch(Exception e) {}
    }
}