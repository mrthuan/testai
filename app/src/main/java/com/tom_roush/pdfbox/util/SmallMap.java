package com.tom_roush.pdfbox.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class SmallMap<K, V> implements Map<K, V> {
    private Object[] mapArr;

    /* loaded from: classes2.dex */
    public class SmallMapEntry implements Map.Entry<K, V> {
        private final int keyIdx;

        public SmallMapEntry(int i10) {
            this.keyIdx = i10;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof SmallMapEntry)) {
                return false;
            }
            SmallMapEntry smallMapEntry = (SmallMapEntry) obj;
            if (!getKey().equals(smallMapEntry.getKey()) || !getValue().equals(smallMapEntry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return (K) SmallMap.this.mapArr[this.keyIdx];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return (V) SmallMap.this.mapArr[this.keyIdx + 1];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return getKey().hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            if (v10 != null) {
                V v11 = (V) getValue();
                SmallMap.this.mapArr[this.keyIdx + 1] = v10;
                return v11;
            }
            throw new NullPointerException("Key or value must not be null.");
        }
    }

    public SmallMap() {
    }

    private int findKey(Object obj) {
        if (!isEmpty() && obj != null) {
            int i10 = 0;
            while (true) {
                Object[] objArr = this.mapArr;
                if (i10 >= objArr.length) {
                    break;
                } else if (obj.equals(objArr[i10])) {
                    return i10;
                } else {
                    i10 += 2;
                }
            }
        }
        return -1;
    }

    private int findValue(Object obj) {
        if (!isEmpty() && obj != null) {
            int i10 = 1;
            while (true) {
                Object[] objArr = this.mapArr;
                if (i10 >= objArr.length) {
                    break;
                } else if (obj.equals(objArr[i10])) {
                    return i10;
                } else {
                    i10 += 2;
                }
            }
        }
        return -1;
    }

    @Override // java.util.Map
    public void clear() {
        this.mapArr = null;
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (findKey(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        if (findValue(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i10 = 0; i10 < this.mapArr.length; i10 += 2) {
            linkedHashSet.add(new SmallMapEntry(i10));
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    @Override // java.util.Map
    public V get(Object obj) {
        int findKey = findKey(obj);
        if (findKey < 0) {
            return null;
        }
        return (V) this.mapArr[findKey + 1];
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        Object[] objArr = this.mapArr;
        if (objArr != null && objArr.length != 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i10 = 0;
        while (true) {
            Object[] objArr = this.mapArr;
            if (i10 < objArr.length) {
                linkedHashSet.add(objArr[i10]);
                i10 += 2;
            } else {
                return Collections.unmodifiableSet(linkedHashSet);
            }
        }
    }

    @Override // java.util.Map
    public V put(K k10, V v10) {
        if (k10 != null && v10 != null) {
            if (this.mapArr == null) {
                this.mapArr = new Object[]{k10, v10};
                return null;
            }
            int findKey = findKey(k10);
            if (findKey < 0) {
                Object[] objArr = this.mapArr;
                int length = objArr.length;
                Object[] objArr2 = new Object[length + 2];
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr2[length] = k10;
                objArr2[length + 1] = v10;
                this.mapArr = objArr2;
                return null;
            }
            Object[] objArr3 = this.mapArr;
            int i10 = findKey + 1;
            V v11 = (V) objArr3[i10];
            objArr3[i10] = v10;
            return v11;
        }
        throw new NullPointerException("Key or value must not be null.");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        Object[] objArr = this.mapArr;
        int i10 = 0;
        if (objArr != null && objArr.length != 0) {
            int length = objArr.length;
            int size = (map.size() << 1) + length;
            Object[] objArr2 = new Object[size];
            System.arraycopy(this.mapArr, 0, objArr2, 0, length);
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    int findKey = findKey(entry.getKey());
                    if (findKey >= 0) {
                        objArr2[findKey + 1] = entry.getValue();
                    } else {
                        int i11 = length + 1;
                        objArr2[length] = entry.getKey();
                        length = i11 + 1;
                        objArr2[i11] = entry.getValue();
                    }
                } else {
                    throw new NullPointerException("Key or value must not be null.");
                }
            }
            if (length < size) {
                Object[] objArr3 = new Object[length];
                System.arraycopy(objArr2, 0, objArr3, 0, length);
                objArr2 = objArr3;
            }
            this.mapArr = objArr2;
            return;
        }
        this.mapArr = new Object[map.size() << 1];
        for (Map.Entry<? extends K, ? extends V> entry2 : map.entrySet()) {
            if (entry2.getKey() != null && entry2.getValue() != null) {
                int i12 = i10 + 1;
                this.mapArr[i10] = entry2.getKey();
                this.mapArr[i12] = entry2.getValue();
                i10 = i12 + 1;
            } else {
                throw new NullPointerException("Key or value must not be null.");
            }
        }
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        int findKey = findKey(obj);
        if (findKey < 0) {
            return null;
        }
        Object[] objArr = this.mapArr;
        V v10 = (V) objArr[findKey + 1];
        int length = objArr.length;
        if (length == 2) {
            this.mapArr = null;
        } else {
            Object[] objArr2 = new Object[length - 2];
            System.arraycopy(objArr, 0, objArr2, 0, findKey);
            System.arraycopy(this.mapArr, findKey + 2, objArr2, findKey, (length - findKey) - 2);
            this.mapArr = objArr2;
        }
        return v10;
    }

    @Override // java.util.Map
    public int size() {
        Object[] objArr = this.mapArr;
        if (objArr == null) {
            return 0;
        }
        return objArr.length >> 1;
    }

    @Override // java.util.Map
    public Collection<V> values() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        int i10 = 1;
        ArrayList arrayList = new ArrayList(this.mapArr.length >> 1);
        while (true) {
            Object[] objArr = this.mapArr;
            if (i10 < objArr.length) {
                arrayList.add(objArr[i10]);
                i10 += 2;
            } else {
                return Collections.unmodifiableList(arrayList);
            }
        }
    }

    public SmallMap(Map<? extends K, ? extends V> map) {
        putAll(map);
    }
}
