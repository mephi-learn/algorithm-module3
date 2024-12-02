package alg.module3;

import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class Collections {
    private static <T> T search(ListIterator<T> iterator, int index) {
        T value = null;
        int current = iterator.nextIndex();
        if (current <= index) {
            do {
                value = iterator.next();
            } while (current++ < index);
        } else {
            do {
                value = iterator.previous();
            } while (--current > index);
        }
        return value;
    }

    static <T> int binarySearch(List<T> list, T key) {
        int from = 0;
        int to = list.size() - 1;
        ListIterator<T> i = list.listIterator();

        while (from <= to) {
            int mid = (from + to) / 2;
            @SuppressWarnings("unchecked")
            int value = ((Comparable<T>) search(i, mid)).compareTo(key);
            if (value < 0) {
                from = mid + 1;
            } else if (value > 0) {
                to = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static <T> int binarySearch(List<T> list, T key, Comparator<T> c) {
        // Если сравнивалка не указана, то будем считать, что это обычный поиск
        if (c == null) {
            return binarySearch((List<T>) list, key);
        }

        int from = 0;
        int to = list.size() - 1;
        ListIterator<T> iterator = list.listIterator();

        while (from <= to) {
            int mid = (from + to) / 2;
            int value = c.compare(search(iterator, mid), key);
            if (value < 0) {
                from = mid + 1;
            } else if (value > 0) {
                to = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
