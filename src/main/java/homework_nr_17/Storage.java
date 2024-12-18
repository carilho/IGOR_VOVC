package homework_nr_17;
import java.util.List;
import java.util.ArrayList;

public class Storage<T> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}

