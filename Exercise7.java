package Chapter16.exercise7;

/*
Write a method called deleteBack that deletes the last value (the value at the back of the list) and returns the
deleted value. If the list is empty, throw a NoSuchElementException.
 */
public class Exercise7 {

    private ListNode front;

    public int countDublicates()
    {
        if (this.front == null) return 0;
        else
        {
            ListNode current = this.front;
            int dublicates = 0;

            while (current.next != null)
            {
                if (current.getData() == current.next.getData()) dublicates++;
                current = current.next;
            }
            return dublicates;
        }
    }

    public Exercise7()
    {
        this.front = null;
    }

    public void add(int value)
    {
        if(this.front == null)
            this.front = new ListNode(value);
        else
        {
            ListNode current = this.front;

            while (current.next != null)
            {
                current = current.next;
            }

            current.next = new ListNode(value);
        }
    }

    @Override
    public String toString()
    {
        if (this.front == null)
        {
            return "[]";
        }
        else
        {
            String result = "[" + front.getData();
            ListNode current = this.front.next;

            while (current != null)
            {
                result += ", " + current.getData();
                current = current.next;
            }
            result += "]";
            return result;
        }
    }
}
