package simpleThings;

/**
 * Created by Roman on 19.12.2015.
 */
public class MinMax {

    private int[] zahlenArray = new int[10];

    public MinMax() {
        // fülle zahlenArray mit zufälligen Zahlen zwischen 1 und 100
        for(int i=0; i<zahlenArray.length; i++)
            zahlenArray[i] = (int)(Math.random() * 100) + 1;
    }

    public int getMin() {
        int min = 0;
        // wenn man nur lesend über das Array laufen will, reicht diese verkürzte Form der for-Schleife
        for(int x: zahlenArray) {
            if (x < min)
                min = x;
        }
        return min;
    }

    public int getMax() {
        int max = 0;
        // wenn man nur lesend über das Array laufen will, reicht diese verkürzte Form der for-Schleife
        for(int x: zahlenArray) {
            if (x > max)
                max = x;
        }
        return max;
    }

    public void run() {
        System.out.println("Zahlenliste: " + toString());
        System.out.println("Grösste Zahl: " + getMax() + "; kleinste Zahl: " + getMin());
    }

    @Override
    public String toString() {
        String result = "" + zahlenArray[0];
        for(int i=1; i<zahlenArray.length; i++) {
            result += " " + zahlenArray[i];
        }
        return result;
    }
}
