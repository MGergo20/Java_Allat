package oop;

public class Allat {

    private double sertes;
    private double kecske;
    private double juh;

    public Allat(double sertes, double kecske, double juh) {
        this.sertes = sertes;
        this.kecske = kecske;
        this.juh = juh;
    }

    public String allapot() {
        return "Sertés: " + sertes + " Kecske: " + kecske + " Juh: " + juh;
    }

    public static void allatDarab() {
        double arSertes = 3.5;
        double arKecske = 0.5;
        double arJuh = 4.0 / 3;

        int dbOssz = 0;
        int dbJo = 0;

        for (int x = 1; x <= 28; x++) {
            for (int y = 1; y <= 98 - x; y++) {
                for (int z = 3; z <= 72; z += 3) {
                    dbOssz++;
                    if (x + y + z == 100 && (arSertes * x + arKecske * y + arJuh * z) == 100) {
                        dbJo++;
                        Allat allat = new Allat(x, y, z);
                        System.out.println(allat.allapot());
                    }
                }
            }
        }

        System.out.println("Összes futás: " + dbOssz);
        System.out.println("Jó találatok: " + dbJo);
    }
}
