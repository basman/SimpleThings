package simpleThings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Roman on 19.12.2015.
 */
public class Eingabe {
    public void zahlEingeben() {
        System.out.print("Bitte eine positive ganze Zahl eingeben: ");
        int zahl = zahlEingabe();
        if(zahl < 0) {
            System.out.println("Sorry. Ungültige eingabe!");
            return;
        }
        System.out.println("Danke. Das Zehnfache deiner Eingabe ist " + 10*zahl);
    }

    public int zahlEingabe() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int inputZahl = 0;
        try {
            String input = in.readLine();           // lese eine Zeile als String ein
            inputZahl = Integer.parseInt(input);    // wandle String in Integer um. Falls das Format nicht stimmt, wird
                                                    // eine NumberFormatException geworfen und -1 zurückgegeben.
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException pe) {
            inputZahl = -1; // ungültige Eingabe
        }
        return inputZahl;
    }
}
