package homework_nr_17;
import java.util.List;
import java.util.function.Predicate;
import java.util.ArrayList;

public class FilterUtils {
    public static <T> List<T> filter(List<T> items, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T item : items) {
            if (predicate.test(item)) {
                result.add(item);
            }
        }
        return result;
    }
}

