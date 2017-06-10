import org.junit.Assert;
import org.junit.Test;

/**
 * Created by apandian on 6/9/2017.
 */
public class QueueArrayImplTest {
    @Test
    public void verifyQueueWithOneElement(){
        QueueArrayImpl<Integer> data = new QueueArrayImpl<>();
        data.add(4);
        Assert.assertEquals(new Integer(4), data.examine());
    }

    @Test
    public void verifyQueueWithMultipleElements(){
        QueueArrayImpl<Integer> data = new QueueArrayImpl<>();
        data.add(4);
        data.add(2);
        data.add(1);

        Assert.assertEquals(new Integer(4), data.examine());
        data.remove();
        Assert.assertEquals(new Integer(2), data.examine());
        data.remove();
        Assert.assertEquals(new Integer(1), data.examine());
    }

    @Test
    public void verifyQueueByRemovingAndAddingElements(){
        QueueArrayImpl<Integer> data = new QueueArrayImpl<>();
        data.add(4);
        data.add(2);
        data.add(1);

        Assert.assertEquals(new Integer(4), data.examine());
        data.remove();

        data.add(3);
        Assert.assertEquals(new Integer(2), data.examine());
        data.remove();
        Assert.assertEquals(new Integer(1), data.examine());
        data.remove();
        Assert.assertEquals(new Integer(3), data.examine());


    }
}
