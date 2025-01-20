import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {

    @Test
    @DisplayName("Проверка имени с одним пробелом внутри строки")
    public void checkNameToEmbossWithOneSpaceReturnTrue() {
        String name = "Юрий Ермаков";
        Account account = new Account(name);
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Проверка имени с двумя пробелами внутри строки")
    public void checkNameToEmbossWithTwoSpaceReturnFalse() {
        String name = "Юрий Ер маков";
        Account account = new Account(name);
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Проверка имени, которое начинается с пробела")
    public void checkNameToEmbossStartsWithSpaceReturnFalse() {
        String name = " Юрий Ермаков";
        Account account = new Account(name);
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Проверка имени, которое заканчивается пробелом")
    public void checkNameToEmbossEndsWithSpaceReturnFalse() {
        String name = "Юрий Ермаков ";
        Account account = new Account(name);
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Проверка имени без пробела")
    public void checkNameToEmbossWithoutSpaceReturnFalse() {
        String name = "ЮрийЕрмаков";
        Account account = new Account(name);
        assertFalse(account.checkNameToEmboss());
    }
}
