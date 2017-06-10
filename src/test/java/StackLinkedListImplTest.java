import org.junit.Assert;
import org.junit.Test;

/**
 * Created by apandian on 6/9/2017.
 */
public class StackLinkedListImplTest {
    @Test
    public void verifyStackWithOneElement(){
        StackLinkedListImpl<Integer> data = new StackLinkedListImpl<>();
        data.push(4);
        Assert.assertEquals(new Integer(4), data.peek());
    }

    @Test
    public void verifyStackWithMultipleElements(){
        StackLinkedListImpl<Integer> data = new StackLinkedListImpl<>();
        data.push(4);
        data.push(2);
        data.push(1);

        Assert.assertEquals(new Integer(1), data.peek());
        data.pop();
        Assert.assertEquals(new Integer(2), data.peek());
        data.pop();
        Assert.assertEquals(new Integer(4), data.peek());
    }

    @Test
    public void verifyStackByRemovingAndAddingElements(){
        StackLinkedListImpl<Integer> data = new StackLinkedListImpl<>();
        data.push(4);
        data.push(2);
        data.push(1);

        Assert.assertEquals(new Integer(1), data.peek());
        data.pop();

        data.push(3);
        Assert.assertEquals(new Integer(3), data.peek());
        data.pop();
        Assert.assertEquals(new Integer(2), data.peek());
        data.pop();
        Assert.assertEquals(new Integer(4), data.peek());
    }
}
