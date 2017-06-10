import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by apandian on 6/6/2017.
 */
public class LinkedListImpl<Item> {
    private Integer size = 0;
    private Node first;
    private Node last;

    public Item get(Integer index){
        Node data = first;
        for(int i = 1; i <= index; i++){
            data = data.getNext();
        }
        return (Item)data.elem;
    }

    public Item getFirst(){
        return (Item)first.getValue();
    }

    public Item getLast(){
        return (Item)last.getValue();
    }

    public Integer size(){
       return size;
    }

    public void add(Item element){
        Node newElement = new Node<Item>(element);
        if(last == null){
            first = newElement;
            last = newElement;
        }
        else {
            last.setNext(newElement);
            last = newElement;
        }
        size++;
    }

    public void remove(Item element){
        Node current = first;
        Node previous = null;

        do{
            if(current.elem == element){
                if(current.next == null){
                    last = previous;
                }
                if(previous == null){
                    first = null;
                }
                else{
                    previous.next = current.next;
                }
                size--;
                return;
            }
            previous = current;
            current = current.next;
        }while(current != null);

    }


    public void removeDuplicates(){
        HashSet<Item> numbers = new HashSet<>();
        Node current = first;
        Node previous = null;
        // if linkedlist is empty, just return
        if(current == null){
            return;
        }
        do{
            if(numbers.contains(current.getValue())){
                previous.next = current.next;
                size--;
            }
            else {
                numbers.add((Item)current.getValue());
                previous = current;
            }
            current = current.getNext();
        }while(current !=null);
    }

    private class Node<Item>{
        private Item elem;
        private Node<Item> next;

        Node(Item elem){
            this.elem = elem;
        }

        public void setValue(Item elem){
            this.elem = elem;
        }

        public void setNext(Node next){
            this.next = next;
        }

        public Item getValue(){
            return elem;
        }

        public Node getNext(){
            return next;
        }
    }
}
