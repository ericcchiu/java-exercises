package EasyLevel;

public class Twofer {
    public String twofer(String name) {
        if(name == "" || name == null) {
            name = "you";
        }
        return String.format("One for %s, one for me.", name);
    }
}
