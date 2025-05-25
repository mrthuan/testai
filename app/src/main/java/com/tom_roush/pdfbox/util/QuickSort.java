package com.tom_roush.pdfbox.util;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes2.dex */
public final class QuickSort {
    private static final Comparator<? extends Comparable> OBJCOMP = new Comparator<Comparable>() { // from class: com.tom_roush.pdfbox.util.QuickSort.1
        @Override // java.util.Comparator
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };

    private QuickSort() {
    }

    private static <T> int partition(List<T> list, Comparator<T> comparator, int i10, int i11, int i12) {
        int i13 = i12 - 2;
        T t4 = list.get(i10);
        int i14 = i12 - 1;
        swap(list, i10, i14);
        while (i11 < i13) {
            if (comparator.compare(list.get(i11), t4) <= 0) {
                i11++;
            } else if (comparator.compare(t4, list.get(i13)) <= 0) {
                i13--;
            } else {
                swap(list, i11, i13);
            }
        }
        if (comparator.compare(list.get(i13), t4) < 0) {
            i13++;
        }
        swap(list, i14, i13);
        return i13;
    }

    private static <T> void quicksort(List<T> list, Comparator<T> comparator) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(0);
        arrayDeque.push(Integer.valueOf(list.size()));
        while (!arrayDeque.isEmpty()) {
            int intValue = ((Integer) arrayDeque.pop()).intValue();
            int intValue2 = ((Integer) arrayDeque.pop()).intValue();
            int i10 = intValue - intValue2;
            if (i10 >= 2) {
                int partition = partition(list, comparator, (i10 / 2) + intValue2, intValue2, intValue);
                arrayDeque.push(Integer.valueOf(partition + 1));
                arrayDeque.push(Integer.valueOf(intValue));
                arrayDeque.push(Integer.valueOf(intValue2));
                arrayDeque.push(Integer.valueOf(partition));
            }
        }
    }

    public static <T> void sort(List<T> list, Comparator<T> comparator) {
        if (list.size() < 2) {
            return;
        }
        quicksort(list, comparator);
    }

    private static <T> void swap(List<T> list, int i10, int i11) {
        T t4 = list.get(i10);
        list.set(i10, list.get(i11));
        list.set(i11, t4);
    }

    public static <T extends Comparable> void sort(List<T> list) {
        sort(list, OBJCOMP);
    }
}
