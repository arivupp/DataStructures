import org.junit.Assert;
import org.junit.Test;

public class LinkedListImplTest{
    @Test
    public void checkAddForOneElement() {
        LinkedListImpl<Integer> data = new LinkedListImpl();
        data.add(5);
        Assert.assertEquals(new Integer(5), data.get(0));

        Assert.assertEquals(new Integer(5), data.getFirst());
        Assert.assertEquals(new Integer(5), data.getLast());

        Assert.assertEquals(new Integer(1), data.size());
    }

    @Test
    public void checkAddForMultipleElement() {
        LinkedListImpl<Integer> data = new LinkedListImpl();
        data.add(5);
        data.add(3);
        data.add(10);
        Assert.assertEquals(new Integer(5), data.get(0));
        Assert.assertEquals(new Integer(3), data.get(1));
        Assert.assertEquals(new Integer(10), data.get(2));

        Assert.assertEquals(new Integer(5), data.getFirst());
        Assert.assertEquals(new Integer(10), data.getLast());

        Assert.assertEquals(new Integer(3), data.size());
    }

    @Test(expected = NullPointerException.class)
    public void verifyRemoveInTheFirstPositionThrowsNullPointerExceptionForGetFirst(){
        LinkedListImpl<Integer> data = new LinkedListImpl();
        data.add(3);
        data.remove(3);
        Assert.assertEquals(new Integer(0), data.size());
        Assert.assertEquals(new Integer(0), data.getFirst());
    }

    @Test(expected = NullPointerException.class)
    public void verifyRemoveInTheFirstPositionThrowsNullPointerExceptionForGetLast(){
        LinkedListImpl<Integer> data = new LinkedListImpl();
        data.add(3);
        data.remove(3);
        Assert.assertEquals(new Integer(0), data.size());
        Assert.assertEquals(new Integer(0), data.getLast());
    }

    @Test
    public void verifyRemoveInTheMiddlePosition(){
        LinkedListImpl<Integer> data = new LinkedListImpl();
        data.add(3);
        data.add(2);
        data.add(13);
        data.remove(2);
        Assert.assertEquals(new Integer(2), data.size());

        Assert.assertEquals(new Integer(3),data.get(0));
        Assert.assertEquals(new Integer(13),data.get(1));

        Assert.assertEquals(new Integer(3),data.getFirst());
        Assert.assertEquals(new Integer(13),data.getLast());
    }

    @Test
    public void verifyRemoveInTheLastPosition(){
        LinkedListImpl<Integer> data = new LinkedListImpl();
        data.add(3);
        data.add(2);
        data.add(13);
        data.remove(13);

        Assert.assertEquals(new Integer(2), data.size());

        Assert.assertEquals(new Integer(3),data.get(0));
        Assert.assertEquals(new Integer(2),data.get(1));

        Assert.assertEquals(new Integer(3),data.getFirst());
        Assert.assertEquals(new Integer(2),data.getLast());
    }

    @Test
    public void verifyRemoveDuplicatesInTheLastPosition(){
        LinkedListImpl<Integer> data = new LinkedListImpl();
        data.add(3);
        data.add(2);
        data.add(3);
        data.removeDuplicates();

        Assert.assertEquals(new Integer(2), data.size());

        Assert.assertEquals(new Integer(3),data.get(0));
        Assert.assertEquals(new Integer(2),data.get(1));
    }

    @Test
    public void verifyRemoveDuplicatesInTheMiddlePosition(){
        LinkedListImpl<Integer> data = new LinkedListImpl();
        data.add(3);
        data.add(3);
        data.add(2);
        data.removeDuplicates();

        Assert.assertEquals(new Integer(2), data.size());

        Assert.assertEquals(new Integer(3),data.get(0));
        Assert.assertEquals(new Integer(2),data.get(1));
    }

    @Test
    public void verifyRemovingMultipleDuplicates(){
        LinkedListImpl<Integer> data = new LinkedListImpl();
        data.add(3);
        data.add(3);
        data.add(2);
        data.add(1);
        data.add(1);
        data.add(10);
        data.removeDuplicates();

        Assert.assertEquals(new Integer(4), data.size());

        Assert.assertEquals(new Integer(3),data.get(0));
        Assert.assertEquals(new Integer(2),data.get(1));
        Assert.assertEquals(new Integer(1),data.get(2));
        Assert.assertEquals(new Integer(10),data.get(3));
    }

    @Test
    public void verifyRemovingSameDuplicateMultipleTimes(){
        LinkedListImpl<Integer> data = new LinkedListImpl();
        data.add(3);
        data.add(3);
        data.add(3);
        data.add(2);
        data.add(1);
        data.add(10);
        data.removeDuplicates();

        Assert.assertEquals(new Integer(4), data.size());

        Assert.assertEquals(new Integer(3),data.get(0));
        Assert.assertEquals(new Integer(2),data.get(1));
        Assert.assertEquals(new Integer(1),data.get(2));
        Assert.assertEquals(new Integer(10),data.get(3));
    }
}