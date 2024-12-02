package alg.module3;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class Arrays {

    // Реализует защиту "от дурака"
    static void checkBorder(int from, int to, int length) {
        if (from > to) {
            throw new IllegalArgumentException("from more that to (" + from + " > " + to + ")");
        }
        if (from < 0 || to > length) {
            throw new ArrayIndexOutOfBoundsException("index out of border");
        }
    }

    // BYTE
    // Просто поиск, под капотом поиск по диапазону
    public static int binarySearch(byte[] array, byte key) {
        return binarySearchByteByRange(array, 0, array.length, key);
    }

    // Поиск по диапазону с предварительной проверкой "на дурака"
    public static int binarySearch(byte @NotNull [] array, int from, int to, byte key) {
        checkBorder(from, to, array.length);
        return binarySearchByteByRange(array, from, to, key);
    }

    // Реализация поиска по диапазону
    private static int binarySearchByteByRange(byte[] array, int from, int to, byte key) {
        to--;
        while (from <= to) {

            // Получаем середину массива между двумя индексами, смещённую влево, если диапазон чётный
            int mid = (from + to) / 2;
            byte value = array[mid];
            if (value < key) {
                from = mid + 1;
            } else if (value > key) {
                to = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // CHAR
    // Просто поиск, под капотом поиск по диапазону
    public static int binarySearch(char[] array, char key) {
        return binarySearchCharByRange(array, 0, array.length, key);
    }

    // Поиск по диапазону с предварительной проверкой "на дурака"
    public static int binarySearch(char @NotNull [] array, int from, int to, char key) {
        checkBorder(from, to, array.length);
        return binarySearchCharByRange(array, from, to, key);
    }

    // Реализация поиска по диапазону
    private static int binarySearchCharByRange(char[] array, int from, int to, char key) {
        to--;
        while (from <= to) {
            int mid = (from + to) / 2;
            char value = array[mid];
            if (value < key) {
                from = mid + 1;
            } else if (value > key) {
                to = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // DOUBLE
    // Просто поиск, под капотом поиск по диапазону
    public static int binarySearch(double[] array, double key) {
        return binarySearchDoubleByRange(array, 0, array.length, key);
    }

    // Поиск по диапазону с предварительной проверкой "на дурака"
    public static int binarySearch(double @NotNull [] array, int from, int to, double key) {
        checkBorder(from, to, array.length);
        return binarySearchDoubleByRange(array, from, to, key);
    }

    // Реализация поиска по диапазону
    private static int binarySearchDoubleByRange(double[] array, int from, int to, double key) {
        to--;
        while (from <= to) {
            int mid = (from + to) / 2;
            double value = array[mid];
            if (value < key) {
                from = mid + 1;
            } else if (value > key) {
                to = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // FLOAT
    // Просто поиск, под капотом поиск по диапазону
    public static int binarySearch(float[] array, float key) {
        return binarySearchFloatByRange(array, 0, array.length, key);
    }

    // Поиск по диапазону с предварительной проверкой "на дурака"
    public static int binarySearch(float @NotNull [] array, int from, int to, float key) {
        checkBorder(from, to, array.length);
        return binarySearchFloatByRange(array, from, to, key);
    }

    // Реализация поиска по диапазону
    private static int binarySearchFloatByRange(float[] array, int from, int to, float key) {
        to--;
        while (from <= to) {
            int mid = (from + to) / 2;
            float value = array[mid];
            if (value < key) {
                from = mid + 1;
            } else if (value > key) {
                to = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // INT
    // Просто поиск, под капотом поиск по диапазону
    public static int binarySearch(int[] array, int key) {
        return binarySearchIntByRange(array, 0, array.length, key);
    }

    // Поиск по диапазону с предварительной проверкой "на дурака"
    public static int binarySearch(int @NotNull [] array, int from, int to, int key) {
        checkBorder(from, to, array.length);
        return binarySearchIntByRange(array, from, to, key);
    }

    // Реализация поиска по диапазону
    private static int binarySearchIntByRange(int[] array, int from, int to, int key) {
        to--;
        while (from <= to) {
            int mid = (from + to) / 2;
            int value = array[mid];
            if (value < key) {
                from = mid + 1;
            } else if (value > key) {
                to = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // LONG
    // Просто поиск, под капотом поиск по диапазону
    public static int binarySearch(long[] array, long key) {
        return binarySearchLongByRange(array, 0, array.length, key);
    }

    // Поиск по диапазону с предварительной проверкой "на дурака"
    public static int binarySearch(long @NotNull [] array, int from, int to, long key) {
        checkBorder(from, to, array.length);
        return binarySearchLongByRange(array, from, to, key);
    }

    // Реализация поиска по диапазону
    private static int binarySearchLongByRange(long[] array, int from, int to, long key) {
        to--;
        while (from <= to) {
            int mid = (from + to) / 2;
            long value = array[mid];
            if (value < key) {
                from = mid + 1;
            } else if (value > key) {
                to = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // SHORT
    // Просто поиск, под капотом поиск по диапазону
    public static int binarySearch(short[] array, short key) {
        return binarySearchShortByRange(array, 0, array.length, key);
    }

    // Поиск по диапазону с предварительной проверкой "на дурака"
    public static int binarySearch(short @NotNull [] array, int from, int to, short key) {
        checkBorder(from, to, array.length);
        return binarySearchShortByRange(array, from, to, key);
    }

    // Реализация поиска по диапазону
    private static int binarySearchShortByRange(short[] array, int from, int to, short key) {
        to--;
        while (from <= to) {
            int mid = (from + to) / 2;
            short value = array[mid];
            if (value < key) {
                from = mid + 1;
            } else if (value > key) {
                to = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // GENERIC
    // Просто поиск, под капотом поиск по диапазону
    @SuppressWarnings("rawtypes")
    public static <T> int binarySearch(T[] array, T key, Comparator c) {
        return binarySearchGenericByRange(array, 0, array.length, key, c);
    }

    // Поиск по диапазону с предварительной проверкой "на дурака"
    @SuppressWarnings("rawtypes")
    public static <T> int binarySearch(T @NotNull [] a, int from, int to, T key, Comparator cmp) {
        checkBorder(from, to, a.length);
        return binarySearchGenericByRange(a, from, to, key, cmp);
    }

    // Реализация поиска по диапазону
    @SuppressWarnings("rawtypes")
    private static <T> int binarySearchGenericByRange(T[] a, int from, int to, T key, Comparator cmp) {
        to--;
        while (from <= to) {
            int mid = (from + to) / 2;
            @SuppressWarnings("unchecked")
            int value = cmp == null ? ((Comparable) a[mid]).compareTo(key) : cmp.compare(a[mid], key);
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
