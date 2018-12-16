package ua.org.oa.TaisKotliar;

public interface SimpleList {

    void add(String s);

    String get();

    String get(int id);

    String remove();

    String remove(int id);

    boolean delete();
}
