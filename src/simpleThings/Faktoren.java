package simpleThings;

/**
 * Created by Roman on 22.12.2015.
 */
public class Faktoren {
    private final int ergebnis;
    private Primzahlen prim;

    public Faktoren(int ergebnis) {
        this.ergebnis = ergebnis;
        this.prim = new Primzahlen((int)Math.sqrt(ergebnis));
    }

    public void work() {
        /*
        Schreibe ein Programm, welches alle möglichen Zahlenpaare auflistet, die miteinander multipliziert this.ergebnis
        ergeben.
        Beispiel: this.ergebnis sei 12. Dann sind die möglichen Paare 2 * 6 und 3 * 4.

        Du darfst hierfür die bestehende Klasse 'Primzahlen' verwenden. Primzahlen.getPrimzahlen() könnte von Nutzen
        sein, um in einer Schleife verschiedene Teiler (Primfaktoren) durchzuprobieren.
         */

        // -- Pseudo Code --

        // Erstelle Primzahlenliste von 2 bis Wurzel aus 'ergebnis'

        // Zerlege 'ergebnis' in seine Primfaktoren

        // Bilde alle möglichen Kombinationen für die Multiplikation mit Hilfe der Primfaktoren und gebe sie mittels
        // System.out.println() aus.

        /* Beispiel mit this.ergebnis=120
            Erstelle Primzahlenliste von 2 bis Wurzel aus 120, also von 2 bis 10. Das ergibt die Liste: (2, 3, 5, 7)
            Ermittle Primfaktoren von 120 mittels Durchprobieren : 2 * 2 * 2 * 3 * 5.
            Ob eine Division aufgeht, erfährst du in Java mit dem Modulo-Operator '%'. Er berechnet den Rest einer Teilung.
               if(120 % 2 == 0)
                  Lies: 120 geteilt durch 2 ergibt Rest 0. Teilung ist also möglich.

            Finde alle möglichen Paare mit Hilfe der Primfaktoren, um zwei Zahlen zu multiplizieren, die 120 ergeben:
               2, 2*2*3*5
               3, 2*2*2*5
               5, 2*2*2*3
               2*2, 2*3*5
               2*3, 2*2*5
               2*5, 2*2*3
               3*5, 2*2*2

            Hinweis: teste deinen Code zunächst mit 120 und prüfe, ob du die gleichen Ergebnisse erhälst wie in diesen
            Kommentaren.
         */
    }
}
