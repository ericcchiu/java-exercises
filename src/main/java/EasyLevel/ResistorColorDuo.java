package EasyLevel;

import java.util.ArrayList;
import java.util.Arrays;

public class ResistorColorDuo {
    private static final ArrayList<String> resistorCode = new ArrayList<String>(Arrays.asList("black","brown","red","orange","yellow","green","blue","violet","grey","white"));
    public int value(String[] colors) {

        String codeValStr = "";
        for(int i = 0; i < 2; i++) {
            String val = colors[i];
            codeValStr += colorCode(colors[i]);
        }
        Integer output = Integer.parseInt(codeValStr);
        return output != -1 ? output : -1;
    }

    public int colorCode(String color) {
        for (int i = 0; i < resistorCode.size(); i++) {
            if ( color.equals(resistorCode.get(i)) ) {
                return i;
            }
        }
        return -1;
    }
}
