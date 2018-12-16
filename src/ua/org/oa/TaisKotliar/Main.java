package ua.org.oa.TaisKotliar;

public class Main {

    public static void main(String[] args) {
        SimpleList sl = new DynamicStringList();
        sl.add("test");
        sl.add("test1");
        sl.add("test2");
        sl.add("test3");
        sl.add("test4");

        System.out.println(sl);

        System.out.println(sl.get() + "\n");

        System.out.println(sl.get(1) + "\n");

        sl.remove();
        System.out.println(sl);

        sl.remove(2);
        System.out.println(sl);

        sl.delete();
        System.out.println(sl);
    }
}
