public class StringUtils {

    public static int countOccurrences(String text, String pattern) {
        if (text == null || pattern == null || pattern.isEmpty()) {
            return 0;
        }
        int count = 0;
        int index = 0;
        while ((index = text.indexOf(pattern, index)) != -1) {
            count++;
            index += pattern.length();
        }
        return count;
    }

}