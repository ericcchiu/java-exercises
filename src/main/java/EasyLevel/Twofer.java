package EasyLevel;

public class Twofer {
    public String twofer(String name) {
        if(name == null) {
            return "One for you, one for me.";
        } else if(name == "") {
            return "One for you, one for me.";
        } else {
            return String.format("One for %s, one for me.", name);
        }
    }
}
