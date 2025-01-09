package pl.krzysiek.javaClass;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.stream.Collectors;

public class MyList<E> implements Iterable<E> {
    private E[] data = (E[]) new Object[10];
    private int count = 0;

    public void add(E element) {
        data[count++] = element;
    }

    @Override
    public String toString() {
        return Arrays.stream(data)
                .limit(count)
                .map(Objects::toString)
                .collect(Collectors.joining(", ", "MyList[", "]"));
    }

    @Override
    public Iterator<E> iterator() {
        return new MyIterator();
    }

    public class MyIterator implements Iterator<E> {
        private int progress = 0;

        @Override
        public boolean hasNext() {
            return progress < count;
        }

        public E next() {
            return data[progress++];
        }
    }

    public static void main(String[] args) {
        MyList<String> mls = new MyList<>();
        MyList<String> mls2 = new MyList<>();
        mls.add("Hello");
        mls.add("Bonjour");
        mls.add("Guten tag");

        mls2.add("Monday");
        mls2.add("Lundi");
        mls2.add("Montag");

        System.out.println(mls);
        System.out.println(mls2);

        // two iterators on one data structure
        Iterator<String> is1 = mls.iterator();
        Iterator<String> is2 = mls.iterator();
        // another iterator from a different instance
        Iterator<String> is3 = mls2.iterator();
        System.out.println("is1 " + is1.next());
        System.out.println("is1 " + is1.next());
        System.out.println("is3                            " + is3.next());
        System.out.println("is2              " + is2.next());
        System.out.println("is2              " + is2.next());
        System.out.println("is1 " + is1.next());
        System.out.println("is3                            " + is3.next());
        System.out.println("is2              " + is2.next());
        System.out.println("is3                            " + is3.next());
    }


}
