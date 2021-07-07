package EasyLevel;

import java.util.ArrayList;
import java.util.Arrays;

public class ResistorColor {
    public int colorCode(String color) {
        ArrayList<String> colorCodeList = new ArrayList<String>(Arrays.asList("Black", "Brown", "Red", "Orange", "Yellow", "Green", "Blue", "Violet", "Grey", "White"));
        for (int i = 0; i < colorCodeList.size(); i++) {
            if ( color == colorCodeList.get(i) ) {
                return i;
            }
        }
        return -1;
    }

    public ArrayList<String> colors() {
        ArrayList<String> colors = new ArrayList<String>(Arrays.asList("Black", "Brown", "Red", "Orange", "Yellow", "Green", "Blue", "Violet", "Grey", "White"));
        return colors;
    }
}
