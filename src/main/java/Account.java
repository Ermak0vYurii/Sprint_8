public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {

        //проверка длины строки
        if (name.length() < 3 || name.length() > 19) {
            return false;
        }

        //проверка наличия пробела
        int spaceIndex = name.indexOf(" ");
        if (spaceIndex == -1 || spaceIndex == 0 || spaceIndex == name.length() - 1) {
            return false;
        }

        // Проверка, что пробел только один
        int spaceCount = 0;
        while (spaceIndex != -1) {
            spaceIndex = name.indexOf(" ", spaceIndex + 1);
            spaceCount += 1;
        }
        if (spaceCount > 1) {
            return false;
        }
        return true;
    }
}
