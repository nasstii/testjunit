import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {
    @Test
    public void testCountOccurrences() {
        // Тестирование на обычных входных данных
        String str1 = "Java - отличный язык программирования";
        String str2 = "язык";
        int expected = 1;
        int actual = StringUtils.countOccurrences(str1, str2);
        Assertions.assertEquals(expected, actual);

        // Тестирование на входных данных, где вторая строка не содержится в первой
        str1 = "Программирование на Java";
        str2 = "Python";
        expected = 0;
        actual = StringUtils.countOccurrences(str1, str2);
        Assertions.assertEquals(expected, actual);

        // Тестирование на входных данных, где вторая строка содержится в первой несколько раз
        str1 = "Java - отличный язык программирования. Java очень популярна.";
        str2 = "Java";
        expected = 2;
        actual = StringUtils.countOccurrences(str1, str2);
        Assertions.assertEquals(expected, actual);

        // Тестирование на входных данных, где первая строка пустая
        str1 = "";
        str2 = "Java";
        expected = 0;
        actual = StringUtils.countOccurrences(str1, str2);
        Assertions.assertEquals(expected, actual);

        // Тестирование на входных данных, где вторая строка пустая
        str1 = "Java - отличный язык программирования";
        str2 = "";
        expected = 0;
        actual = StringUtils.countOccurrences(str1, str2);
        Assertions.assertEquals(expected, actual);
    }
}