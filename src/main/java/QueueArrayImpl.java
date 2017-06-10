import java.util.NoSuchElementException;

/**
 * Created by apandian on 6/9/2017.
 */
public class QueueArrayImpl<Item> {
    private Integer MAX_ELEMENTS = 3;
    private Item[] elements = (Item[]) new Object[MAX_ELEMENTS];
    private Integer first =0;
    private Integer current = 0;
    private Integer size = 0;

    public void add(Item element){
        if(isQueueFull()) {
            throw new RuntimeException("Element cannot be added");
        }
        if(current == MAX_ELEMENTS){
            current = 0;
        }
        elements[current] = element;
        current++;
        size++;
    }

    public Item remove(){
        if(size == 0){
            throw new NoSuchElementException();
        }
        Item removedElement = elements[first];
        if(first + 1 == MAX_ELEMENTS){
            first = 0;
        }
        else{
            first++;
        }
        size--;
        return removedElement;
    }

    public Item examine(){
        return elements[first];
    }

    public boolean isQueueFull(){
        if(size >= MAX_ELEMENTS)
            return true;
        else
            return false;
    }
}
