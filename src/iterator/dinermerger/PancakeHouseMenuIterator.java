package iterator.dinermerger;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenuIterator implements Iterator<MenuItem>{
    private List<MenuItem> items;
    private int position;

    public PancakeHouseMenuIterator(List<MenuItem> items) {
        this.items = items; 
        position = 0;
    }
    
    public boolean hasNext() {
        return position < items.size();
    }

    public MenuItem next() {
        return items.get(position++);
    }
}
