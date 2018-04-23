package Chapter16.exercise7;

public class LinkedIntList
{
    /*
        Write a method called countDuplicates that returns the number of duplicates in a sorted list. The list will be in
        sorted order, so all of the duplicates will be grouped together. For example, if a variable list stores the values
        [1, 1, 1, 3, 3, 6, 9, 15, 15, 23, 23, 23, 40, 40], the call of list.countDuplicates() should
        return 7 because there are 2 duplicates of 1, 1 duplicate of 3, 1 duplicate of 15, 2 duplicates of 23 and 1 duplicate
        of 40.
   */

    private ListNode front;

    //  Exercise 7 ////////////////////////////////////////////////////////
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
    ////////////////////////////////////////////////////////

    public LinkedIntList()
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
