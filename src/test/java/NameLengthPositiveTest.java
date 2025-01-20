import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class NameLengthPositiveTest {

    String name;

    public NameLengthPositiveTest(String name) {
        this.name = name;
    }

    @Parameterized.Parameters
    public static Object[][] testData() {
        return new Object[][]{
                {"Ю а"},
                {"Юр a"},
                {"Юрий Ермаков"},
                {"Юрий Ермаковермако"},
                {"Юрий Ермаковермаков"}
        };
    }

    @Test
    @DisplayName("Проверка имени длиной 3, 4, 12, 18, 19 символов")
    public void nameLengthPositiveTest() {
        Account account = new Account(name);
        assertTrue(account.checkNameToEmboss());
    }
}
