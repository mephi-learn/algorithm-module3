package alg.module3;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // Arrays
        testArraysByteBinarySearch();
        testArraysCharBinarySearch();
        testArraysDoubleBinarySearch();
        testArraysFloatBinarySearch();
        testArraysIntBinarySearch();
        testArraysLongBinarySearch();
        testArraysShortBinarySearch();
        testArraysGenericBinarySearch();

        // Collections
        testCollectionsBinarySearchWithComparator();
        testCollectionsBinarySearch();
    }

    public static void testArraysByteBinarySearch() {
        byte[] a = new byte[]{10, 20, 30, 40, 50};

        int index;

        // Ищем существующий граничный идентификатор слева
        index = Arrays.binarySearch(a, (byte)10);
        if (index != 0) {
            System.out.println("Arrays.binarySearch[byte/left]: Ошибка при поиске существующего элемента");
        }

        // Ищем существующий граничный идентификатор справа
        index = Arrays.binarySearch(a, (byte)50);
        if (index != 4) {
            System.out.println("Arrays.binarySearch[byte/right]: Ошибка при поиске существующего элемента");
        }

        // Ищем существующий идентификатор в середине
        index = Arrays.binarySearch(a, (byte)30);
        if (index != 2) {
            System.out.println("Arrays.binarySearch[byte/mid]: Ошибка при поиске существующего элемента");
        }

        // Ищем существующий идентификатор в середине отрезка
        index = Arrays.binarySearch(a, 1, 3, (byte)30);
        if (index != 2) {
            System.out.println("Arrays.binarySearch[byte/mid/limit]: Ошибка при поиске существующего элемента");
        }

        // Ищем несуществующий идентификатор
        index = Arrays.binarySearch(a, (byte)100);
        if (index != -1) {
            System.out.println("Arrays.binarySearch[byte/nop]: Ошибка при поиске не существующего элемента");
        }
    }

    public static void testArraysCharBinarySearch() {
        char[] a = new char[]{10, 20, 30, 40, 50};

        int index;

        // Ищем существующий граничный идентификатор слева
        index = Arrays.binarySearch(a, (char)10);
        if (index != 0) {
            System.out.println("Arrays.binarySearch[char/left]: Ошибка при поиске существующего элемента");
        }

        // Ищем существующий граничный идентификатор справа
        index = Arrays.binarySearch(a, (char)50);
        if (index != 4) {
            System.out.println("Arrays.binarySearch[char/right]: Ошибка при поиске существующего элемента");
        }

        // Ищем существующий идентификатор в середине
        index = Arrays.binarySearch(a, (char)30);
        if (index != 2) {
            System.out.println("Arrays.binarySearch[char/mid]: Ошибка при поиске существующего элемента");
        }

        // Ищем существующий идентификатор в середине отрезка
        index = Arrays.binarySearch(a, 1, 3, (char)30);
        if (index != 2) {
            System.out.println("Arrays.binarySearch[char/mid/limit]: Ошибка при поиске существующего элемента");
        }

        // Ищем несуществующий идентификатор
        index = Arrays.binarySearch(a, (char)100);
        if (index != -1) {
            System.out.println("Arrays.binarySearch[char/nop]: Ошибка при поиске не существующего элемента");
        }
    }

    public static void testArraysDoubleBinarySearch() {
        double[] a = new double[]{10, 20, 30, 40, 50};

        int index;

        // Ищем существующий граничный идентификатор слева
        index = Arrays.binarySearch(a, 10);
        if (index != 0) {
            System.out.println("Arrays.binarySearch[double/left]: Ошибка при поиске существующего элемента");
        }

        // Ищем существующий граничный идентификатор справа
        index = Arrays.binarySearch(a, 50);
        if (index != 4) {
            System.out.println("Arrays.binarySearch[double/right]: Ошибка при поиске существующего элемента");
        }

        // Ищем существующий идентификатор в середине
        index = Arrays.binarySearch(a, 30);
        if (index != 2) {
            System.out.println("Arrays.binarySearch[double/mid]: Ошибка при поиске существующего элемента");
        }

        // Ищем существующий идентификатор в середине отрезка
        index = Arrays.binarySearch(a, 1, 3, 30);
        if (index != 2) {
            System.out.println("Arrays.binarySearch[double/mid/limit]: Ошибка при поиске существующего элемента");
        }

        // Ищем несуществующий идентификатор
        index = Arrays.binarySearch(a, 100);
        if (index != -1) {
            System.out.println("Arrays.binarySearch[double/nop]: Ошибка при поиске не существующего элемента");
        }
    }

    public static void testArraysFloatBinarySearch() {
        float[] a = new float[]{10, 20, 30, 40, 50};

        int index;

        // Ищем существующий граничный идентификатор слева
        index = Arrays.binarySearch(a, 10);
        if (index != 0) {
            System.out.println("Arrays.binarySearch[float/left]: Ошибка при поиске существующего элемента");
        }

        // Ищем существующий граничный идентификатор справа
        index = Arrays.binarySearch(a, 50);
        if (index != 4) {
            System.out.println("Arrays.binarySearch[float/right]: Ошибка при поиске существующего элемента");
        }

        // Ищем существующий идентификатор в середине
        index = Arrays.binarySearch(a, 30);
        if (index != 2) {
            System.out.println("Arrays.binarySearch[float/mid]: Ошибка при поиске существующего элемента");
        }

        // Ищем существующий идентификатор в середине отрезка
        index = Arrays.binarySearch(a, 1, 3, 30);
        if (index != 2) {
            System.out.println("Arrays.binarySearch[float/mid/limit]: Ошибка при поиске существующего элемента");
        }

        // Ищем несуществующий идентификатор
        index = Arrays.binarySearch(a, 100);
        if (index != -1) {
            System.out.println("Arrays.binarySearch[float/nop]: Ошибка при поиске не существующего элемента");
        }
    }

    public static void testArraysIntBinarySearch() {
        int[] a = new int[]{10, 20, 30, 40, 50};

        int index;

        // Ищем существующий граничный идентификатор слева
        index = Arrays.binarySearch(a, 10);
        if (index != 0) {
            System.out.println("Arrays.binarySearch[int/left]: Ошибка при поиске существующего элемента");
        }

        // Ищем существующий граничный идентификатор справа
        index = Arrays.binarySearch(a, 50);
        if (index != 4) {
            System.out.println("Arrays.binarySearch[int/right]: Ошибка при поиске существующего элемента");
        }

        // Ищем существующий идентификатор в середине
        index = Arrays.binarySearch(a, 30);
        if (index != 2) {
            System.out.println("Arrays.binarySearch[int/mid]: Ошибка при поиске существующего элемента");
        }

        // Ищем существующий идентификатор в середине отрезка
        index = Arrays.binarySearch(a, 1, 3, 30);
        if (index != 2) {
            System.out.println("Arrays.binarySearch[int/mid/limit]: Ошибка при поиске существующего элемента");
        }

        // Ищем несуществующий идентификатор
        index = Arrays.binarySearch(a, 100);
        if (index != -1) {
            System.out.println("Arrays.binarySearch[int/nop]: Ошибка при поиске не существующего элемента");
        }
    }

    public static void testArraysLongBinarySearch() {
        long[] a = new long[]{10, 20, 30, 40, 50};

        int index;

        // Ищем существующий граничный идентификатор слева
        index = Arrays.binarySearch(a, 10);
        if (index != 0) {
            System.out.println("Arrays.binarySearch[long/left]: Ошибка при поиске существующего элемента");
        }

        // Ищем существующий граничный идентификатор справа
        index = Arrays.binarySearch(a, 50);
        if (index != 4) {
            System.out.println("Arrays.binarySearch[long/right]: Ошибка при поиске существующего элемента");
        }

        // Ищем существующий идентификатор в середине
        index = Arrays.binarySearch(a, 30);
        if (index != 2) {
            System.out.println("Arrays.binarySearch[long/mid]: Ошибка при поиске существующего элемента");
        }

        // Ищем существующий идентификатор в середине отрезка
        index = Arrays.binarySearch(a, 1, 3, 30);
        if (index != 2) {
            System.out.println("Arrays.binarySearch[long/mid/limit]: Ошибка при поиске существующего элемента");
        }

        // Ищем несуществующий идентификатор
        index = Arrays.binarySearch(a, 100);
        if (index != -1) {
            System.out.println("Arrays.binarySearch[long/nop]: Ошибка при поиске не существующего элемента");
        }
    }

    public static void testArraysShortBinarySearch() {
        short[] a = new short[]{10, 20, 30, 40, 50};

        int index;

        // Ищем существующий граничный идентификатор слева
        index = Arrays.binarySearch(a, (short)10);
        if (index != 0) {
            System.out.println("Arrays.binarySearch[short/left]: Ошибка при поиске существующего элемента");
        }

        // Ищем существующий граничный идентификатор справа
        index = Arrays.binarySearch(a, (short)50);
        if (index != 4) {
            System.out.println("Arrays.binarySearch[short/right]: Ошибка при поиске существующего элемента");
        }

        // Ищем существующий идентификатор в середине
        index = Arrays.binarySearch(a, (short)30);
        if (index != 2) {
            System.out.println("Arrays.binarySearch[short/mid]: Ошибка при поиске существующего элемента");
        }

        // Ищем существующий идентификатор в середине отрезка
        index = Arrays.binarySearch(a, 1, 3, (short)30);
        if (index != 2) {
            System.out.println("Arrays.binarySearch[short/mid/limit]: Ошибка при поиске существующего элемента");
        }

        // Ищем несуществующий идентификатор
        index = Arrays.binarySearch(a, (short)100);
        if (index != -1) {
            System.out.println("Arrays.binarySearch[short/nop]: Ошибка при поиске не существующего элемента");
        }
    }

    public static void testArraysGenericBinarySearch() {
        Integer[] a = new Integer[]{10, 20, 30, 40, 50};

        int index;

        // Будем меряться идентификаторами
        Comparator<Integer> c = new Comparator<>() {
            public int compare(@NotNull Integer u1, Integer u2) {
                return u1.compareTo(u2);
            }
        };

        // Ищем существующий граничный идентификатор слева
        index = Arrays.binarySearch(a, 10, c);
        if (index != 0) {
            System.out.println("Arrays.binarySearch[generic/left]: Ошибка при поиске существующего элемента");
        }

        // Ищем существующий граничный идентификатор справа
        index = Arrays.binarySearch(a, 50, c);
        if (index != 4) {
            System.out.println("Arrays.binarySearch[generic/right]: Ошибка при поиске существующего элемента");
        }

        // Ищем существующий идентификатор в середине
        index = Arrays.binarySearch(a, 30, c);
        if (index != 2) {
            System.out.println("Arrays.binarySearch[generic/mid]: Ошибка при поиске существующего элемента");
        }

        // Ищем существующий идентификатор в середине отрезка
        index = Arrays.binarySearch(a, 1, 3, 30, c);
        if (index != 2) {
            System.out.println("Arrays.binarySearch[generic/mid/limit]: Ошибка при поиске существующего элемента");
        }

        // Ищем несуществующий идентификатор
        index = Arrays.binarySearch(a, 100, c);
        if (index != -1) {
            System.out.println("Arrays.binarySearch[generic/nop]: Ошибка при поиске не существующего элемента");
        }
    }



    public static void testCollectionsBinarySearch() {
        // Создаём отсортированный список
        List<String> l = new ArrayList<>();
        l.add("yandex.ru");
        l.add("habr.com");
        l.add("google.com");
        l.add("stackoverflow.com");

        int index;

        // Ищем существующий идентификатор
        index = Collections.binarySearch(l, "habr.com");
        if (index != 1) {
            System.out.println("Ошибка при поиске существующего элемента");
        }

        // Ищем несуществующий идентификатор
        index = Collections.binarySearch(l, "www.ru");
        if (index != -1) {
            System.out.println("Ошибка при поиске не существующего элемента");
        }
    }

    public static void testCollectionsBinarySearchWithComparator() {

        // Простой класс с именем сайта и его идентификатором
        class Domain {
            private final int id;
            private final String url;

            public Domain(int id, String url) {
                this.id = id;
                this.url = url;
            }

            public Integer getId() {
                return id;
            }

            public String getUrl() {
                return url;
            }
        }

        // Создаём отсортированный список
        List<Domain> l = new ArrayList<>();
        l.add(new Domain(10, "yandex.ru"));
        l.add(new Domain(20, "habr.com"));
        l.add(new Domain(30, "google.com"));
        l.add(new Domain(40, "stackoverflow.com"));

        // Искать будем по идентификатору
        Comparator<Domain> c = new Comparator<>() {
            public int compare(Domain u1, Domain u2) {
                return u1.getId().compareTo(u2.getId());
            }
        };

        int index;

        // Ищем существующий идентификатор
        index = Collections.binarySearch(l, new Domain(30, null), c);
        if (index != 2) {
            System.out.println("Ошибка при поиске существующего элемента");
        }

        // Ищем несуществующий идентификатор
        index = Collections.binarySearch(l, new Domain(50, null), c);
        if (index != -1) {
            System.out.println("Ошибка при поиске не существующего элемента");
        }
    }
}
