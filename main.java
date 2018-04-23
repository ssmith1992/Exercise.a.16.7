package Chapter16.exercise7;

public class main
{
    public static void main(String[] args)
    {
        LinkedIntList list = new LinkedIntList();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(3);
        list.add(6);
        list.add(9);
        list.add(15);
        list.add(15);
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(40);
        list.add(40);

        System.out.println(list.countDublicates());
    }
}
