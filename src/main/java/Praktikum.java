public class Praktikum {

    public static void main(String[] args) {

        String name = "Юрий Ермаков";
        Account account = new Account(name);

        if (account.checkNameToEmboss()) {
            System.out.println("Имя и фамилию можно напечатать на карте.");
        } else {
            System.out.println("Имя и фамилию нельзя напечатать на карте.");
        }
    }
}
