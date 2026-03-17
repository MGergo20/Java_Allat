package oop;

public class Program {

    public static void main(String[] args) {
        Allat allatElso = new Allat(3.5, 0.5, 1.3);
        System.out.println(allatElso.allapot());
        Allat.allatDarab();
        System.out.println("_________________________");

        /* Negatív */
        Allat allat1 = new Allat(-3, 5, 2);
        Allat allat2 = new Allat(-3, 5, 2);
        System.out.println(allat1.allapot());
        System.out.println(allat2.allapot());
        System.out.println("allat1 egyforma allat2 --> " + (allat1.egyenlo(allat2)));

        /* Tesztesetek */
        haHiba(!allat1.egyenlo(allat2), "Hiba: allat1 és allat2 nem egyforma!");
        haHiba(!allat2.egyenlo(allat1), "Hiba: allat2 és allat1 nem egyforma!");
        haHiba(!allat1.egyenlo(allat1), "Hiba: allat1 és önmaga nem egyforma!");

        /* Pozitív */
        Allat allat3 = new Allat(3, 5, 2);
        Allat allat4 = new Allat(3, 5, 3);
        System.out.println("\n" + allat3.allapot());
        System.out.println(allat4.allapot());
        System.out.println("allat3 egyforma allat4 --> " + (allat3.egyenlo(allat4)));

        /* Egyforma-e */
        haHiba(!allat3.egyenlo(allat4), "Hiba: allat3 és allat4 nem egyforma!");
        haHiba(!allat4.egyenlo(allat3), "Hiba: allat4 és allat3 nem egyforma!");
        haHiba(!allat3.egyenlo(allat3), "Hiba: allat3 és önmaga nem egyforma!");

        
        System.out.println("\nallatDarab() kiirás:");
        Allat.allatDarab();
    }

    public static void haHiba(boolean feltetel, String uzenet) {
        if (feltetel) {
            System.out.println(uzenet);
        }
    }
}
