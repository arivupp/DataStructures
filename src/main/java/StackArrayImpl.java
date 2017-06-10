import java.util.Objects;
import java.util.Stack;

/**
 * Created by apandian on 6/9/2017.
 */
public class StackArrayImpl<Item> {
    private Item[] elements;
    private int total = 0;

    public StackArrayImpl(){
        elements = (Item[])new Object[20];
    }

    public void push(Item element){
        elements[total] = element;
        total++;
    }

    public Item pop(){
        total--;
        return(elements[total]);
    }

    public Item peek(){
        return elements[total-1];
    }
}
