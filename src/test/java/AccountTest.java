import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {

    @Test
    public void checkNameToEmbossWithOneSpaceReturnTrue() {
        String name = "Юрий Ермаков"; //имя с одним пробелом внутри строки
        Account account = new Account(name);
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    public void checkNameToEmbossWithTwoSpaceReturnFalse() {
        String name = "Юрий Ер маков"; //имя с двумя пробелами внутри строки
        Account account = new Account(name);
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void checkNameToEmbossStartsWithSpaceReturnFalse() {
        String name = " Юрий Ермаков"; //имя с пробелом в начале строки
        Account account = new Account(name);
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void checkNameToEmbossEndsWithSpaceReturnFalse() {
        String name = "Юрий Ермаков "; //имя с пробелом в конце строки
        Account account = new Account(name);
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void checkNameToEmbossWithoutSpaceReturnFalse() {
        String name = "ЮрийЕрмаков"; //имя без пробела
        Account account = new Account(name);
        assertFalse(account.checkNameToEmboss());
    }
}
