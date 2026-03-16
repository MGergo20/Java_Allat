package main;

public class AllatVasarlasAranybol {

    public static void main(String[] args) {
        allatDarab();
    }

    private static void allatDarab() {
        double ertekX = 3.5;
        double ertekY = 0.5;
        double ertekZ = 4.0/3;

        int dbOssz = 0;
        int dbJo = 0;
        for (int x = 1; x <= 28; x++) {
            for (int y = 1; y <= 98-x; y++) {
                for (int z = 3; z <= 72; z+=3) {
                    if (x + y + z == 100 && (ertekX * x + ertekY * y + ertekZ * z) == 100) {
                        dbJo++;
                        System.out.println(
                                "Sertés: " + x + "db" + " "
                                + "Kecske: " + y + "db" + " "
                                + "Juh: " + z + "db");

                    }
                    dbOssz++;
                }
            }
        }
        System.out.println("Összes futás: " + dbOssz);
        System.out.println("Jó találatok: " + dbJo);
    }
}
