/**
 * Created by apandian on 6/9/2017.
 */
public class StackLinkedListImpl<Item> {
    private Node last = null;

    private class Node<Item>{
        private Item element;
        private Node prev;
    }

    public void push(Item element){
        Node newElement = new Node<Item>();
        newElement.element = element;
        newElement.prev = last;
        last = newElement;

    }

    public Item pop(){
        Node removedItem;
        if(last == null)
            return null;

        removedItem = last;
        last = last.prev;
        return (Item) removedItem.element;
    }

    public Item peek(){
        return (Item)last.element;
    }
}
