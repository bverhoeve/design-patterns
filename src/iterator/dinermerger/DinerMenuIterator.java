package iterator.dinermerger;

public class DinerMenuIterator implements Iterator  {
    private MenuItem[] items;
    int position;
    
    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
        this.position = 0;
    }

    public MenuItem next() {
        MenuItem temp = items[position];
        position++;
        return temp;
    }

    public boolean hasNext() {
       return position < items.length;        
    }
}
