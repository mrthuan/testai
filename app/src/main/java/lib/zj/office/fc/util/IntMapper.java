package lib.zj.office.fc.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class IntMapper<T> {
    private static final int _default_size = 10;
    private List<T> elements;
    private Map<T, Integer> valueKeyMap;

    public IntMapper() {
        this(10);
    }

    public boolean add(T t4) {
        int size = this.elements.size();
        this.elements.add(t4);
        this.valueKeyMap.put(t4, Integer.valueOf(size));
        return true;
    }

    public T get(int i10) {
        return this.elements.get(i10);
    }

    public int getIndex(T t4) {
        Integer num = this.valueKeyMap.get(t4);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public Iterator<T> iterator() {
        return this.elements.iterator();
    }

    public int size() {
        return this.elements.size();
    }

    public IntMapper(int i10) {
        this.elements = new ArrayList(i10);
        this.valueKeyMap = new HashMap(i10);
    }
}
