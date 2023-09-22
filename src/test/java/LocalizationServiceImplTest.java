import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationServiceImpl;

public class LocalizationServiceImplTest {
    @DisplayName("Тест для проверки возвращаемого текста")
    @Test
    void test_locate_method() {
        var localizationService = new LocalizationServiceImpl();

        var expected1 = "Добро пожаловать";
        var actual1 = localizationService.locale(Country.RUSSIA);
        Assertions.assertEquals(actual1, expected1);

        var expected2 = "Welcome";
        var actual2 = localizationService.locale(Country.BRAZIL);
        Assertions.assertEquals(actual2, expected2);
    }
}
