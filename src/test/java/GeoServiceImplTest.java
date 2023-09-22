import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoService;
import ru.netology.geo.GeoServiceImpl;

public class GeoServiceImplTest {
    @DisplayName("Тест для проверки определения локации по ip")
    @Test
    void test_geoSrvice_byIp_method() {
        var geoService = new GeoServiceImpl();

        var expected1 = new Location("Moscow", Country.RUSSIA, "Lenina", 15).getCountry();
        var actual1 = geoService.byIp(GeoServiceImpl.MOSCOW_IP).getCountry();

        var expected2 = new Location(null, null, null, 0).getCountry();
        var actual2 = geoService.byIp(GeoServiceImpl.LOCALHOST).getCountry();

        Assertions.assertEquals(actual1, expected1);
        Assertions.assertEquals(actual2, expected2);
    }
}
