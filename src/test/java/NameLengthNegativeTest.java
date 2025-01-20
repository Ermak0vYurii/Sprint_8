import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertFalse;

@RunWith(Parameterized.class)
public class NameLengthNegativeTest {

    String name;

    public NameLengthNegativeTest(String name) {
        this.name = name;
    }

    @Parameterized.Parameters
    public static Object[][] testData() {
        return new Object[][]{
                {" "}, // 1 символ
                {"Юр"}, // 2 символа
                {"Юрий Ермаковермакове"}, // 20 символов
                {"Юрий Ермаковермаковер"}, // 21 символ
                {"Юрий Ермаковермаковермаковерма"} //30 символов
        };
    }

    @Test
    @DisplayName("Проверка имени длиной 1, 2, 20, 21, 30 символов")
    public void nameLengthNegativeTest() {
        Account account = new Account(name);
        assertFalse(account.checkNameToEmboss());
    }
}
