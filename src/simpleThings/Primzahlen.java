package simpleThings;

import java.util.ArrayList;

/**
 * Created by Roman on 19.12.2015.
 */
public class Primzahlen {
    private int max;
    private int[] primZahlen;

    public Primzahlen(int max) {
        // Dieser Konstruktor wendet das Sieb des Eratostenes an, um Primzahlen zwischen 0 und max zu ermitteln.
        this.max = max;

        int[] ungesiebt = new int[max-2];
        // fülle Array mit natürlichen Zahlen von 2 bis max
        for(int i=0; i<ungesiebt.length; i++)
            ungesiebt[i] = i+2;

        // lösche alle Zahlen der 2-er bis "Wurzel-aus-max"-Reihen
        int count = 0;
        for(int q=2; q <= Math.sqrt(max); q++) {
            // lösche alle Zahlen der momentanen q-Reihe
            for(int i=2*q-2; i<ungesiebt.length; i += q) {
                if (ungesiebt[i] >= 0) { // Manche Reihen überlappen sich. Z.B. löscht die 2er-Reihe alle Zahlen der 4er-Reihe.
                    count++;            // count zählt die gelöschten Zahlen (aber jede nur einmal), um die Länge des Arrays primZahlen festzustellen.
                    ungesiebt[i] = -1; // Löschen geschieht hier durch Setzen auf -1
                }
            }
        }

        // kopiere alle übrig gebliebenen Zahlen in ein Array ohne Lücken
        primZahlen = new int[max - 2 - count];
        for(int i=0, j=0; i<ungesiebt.length; i++) {
            if (ungesiebt[i] >= 0) {
                primZahlen[j++] = ungesiebt[i];
            }
        }
    }

    public void zeigeAllePrimzahlen() {
        System.out.print("Die Primzahlen von 0 bis " + max + ": ");
        for(int x: primZahlen) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    private boolean istPrim(int x) {
        // TODO programmiere hier einen echten Test, ob x im Array primZahlen vorkommt
        return false;
    }

    public void eingabeUndAnsage() {
        Eingabe ein = new Eingabe();
        System.out.print("Gib eine natürliche Zahl ein: ");
        int input = ein.zahlEingabe();
        if(input < 0) {
            System.out.println("Sorry. Ungültige Eingabe.");
            return;
        } else if(input > max) {
            System.out.println("Sorry. " + input + " ist zu gross. Ich habe nur die Primzahlen bis " + max + " bereit.");
            return;
        }

        System.out.print("Die Zahl " + input + " ist ");
        if(!istPrim(input))
            System.out.print("nicht ");
        System.out.println("prim.");
    }
}
