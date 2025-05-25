package lib.zj.office.fc.dom4j.tree;

import com.google.android.gms.common.api.Api;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class ConcurrentReaderHashMap extends AbstractMap implements Map, Cloneable, Serializable {
    public static int DEFAULT_INITIAL_CAPACITY = 32;
    public static final float DEFAULT_LOAD_FACTOR = 0.75f;
    private static final int MAXIMUM_CAPACITY = 1073741824;
    private static final int MINIMUM_CAPACITY = 4;
    protected final BarrierLock barrierLock;
    protected transient int count;
    protected transient Set entrySet;
    protected transient Set keySet;
    protected transient Object lastWrite;
    protected float loadFactor;
    protected transient Entry[] table;
    protected int threshold;
    protected transient Collection values;

    /* loaded from: classes3.dex */
    public static class BarrierLock implements Serializable {
    }

    /* loaded from: classes3.dex */
    public static class Entry implements Map.Entry {
        protected final int hash;
        protected final Object key;
        protected final Entry next;
        protected volatile Object value;

        public Entry(int i10, Object obj, Object obj2, Entry entry) {
            this.hash = i10;
            this.key = obj;
            this.next = entry;
            this.value = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!this.key.equals(entry.getKey()) || !this.value.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.key.hashCode() ^ this.value.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            obj.getClass();
            Object obj2 = this.value;
            this.value = obj;
            return obj2;
        }

        public String toString() {
            return this.key + "=" + this.value;
        }
    }

    /* loaded from: classes3.dex */
    public class EntrySet extends AbstractSet {
        public /* synthetic */ EntrySet(ConcurrentReaderHashMap concurrentReaderHashMap, int i10) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            ConcurrentReaderHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = ConcurrentReaderHashMap.this.get(entry.getKey());
            if (obj2 == null || !obj2.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new HashIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            return ConcurrentReaderHashMap.this.findAndRemoveEntry((Map.Entry) obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ConcurrentReaderHashMap.this.size();
        }

        private EntrySet() {
        }
    }

    /* loaded from: classes3.dex */
    public class HashIterator implements Iterator, Enumeration {
        protected Object currentKey;
        protected Object currentValue;
        protected int index;
        protected final Entry[] tab;
        protected Entry entry = null;
        protected Entry lastReturned = null;

        public HashIterator() {
            Entry[] tableForReading = ConcurrentReaderHashMap.this.getTableForReading();
            this.tab = tableForReading;
            this.index = tableForReading.length - 1;
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return hasNext();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Entry entry;
            int i10;
            do {
                Entry entry2 = this.entry;
                if (entry2 != null) {
                    Object obj = entry2.value;
                    if (obj != null) {
                        this.currentKey = this.entry.key;
                        this.currentValue = obj;
                        return true;
                    }
                    this.entry = this.entry.next;
                }
                while (true) {
                    entry = this.entry;
                    if (entry == null && (i10 = this.index) >= 0) {
                        Entry[] entryArr = this.tab;
                        this.index = i10 - 1;
                        this.entry = entryArr[i10];
                    }
                }
            } while (entry != null);
            this.currentValue = null;
            this.currentKey = null;
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.currentKey == null && !hasNext()) {
                throw new NoSuchElementException();
            }
            Object returnValueOfNext = returnValueOfNext();
            Entry entry = this.entry;
            this.lastReturned = entry;
            this.currentValue = null;
            this.currentKey = null;
            this.entry = entry.next;
            return returnValueOfNext;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            return next();
        }

        @Override // java.util.Iterator
        public void remove() {
            Entry entry = this.lastReturned;
            if (entry != null) {
                ConcurrentReaderHashMap.this.remove(entry.key);
                this.lastReturned = null;
                return;
            }
            throw new IllegalStateException();
        }

        public Object returnValueOfNext() {
            return this.entry;
        }
    }

    /* loaded from: classes3.dex */
    public class KeyIterator extends HashIterator {
        public KeyIterator() {
            super();
        }

        @Override // lib.zj.office.fc.dom4j.tree.ConcurrentReaderHashMap.HashIterator
        public Object returnValueOfNext() {
            return this.currentKey;
        }
    }

    /* loaded from: classes3.dex */
    public class KeySet extends AbstractSet {
        public /* synthetic */ KeySet(ConcurrentReaderHashMap concurrentReaderHashMap, int i10) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            ConcurrentReaderHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return ConcurrentReaderHashMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new KeyIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (ConcurrentReaderHashMap.this.remove(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ConcurrentReaderHashMap.this.size();
        }

        private KeySet() {
        }
    }

    /* loaded from: classes3.dex */
    public class ValueIterator extends HashIterator {
        public ValueIterator() {
            super();
        }

        @Override // lib.zj.office.fc.dom4j.tree.ConcurrentReaderHashMap.HashIterator
        public Object returnValueOfNext() {
            return this.currentValue;
        }
    }

    /* loaded from: classes3.dex */
    public class Values extends AbstractCollection {
        public /* synthetic */ Values(ConcurrentReaderHashMap concurrentReaderHashMap, int i10) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            ConcurrentReaderHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return ConcurrentReaderHashMap.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new ValueIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return ConcurrentReaderHashMap.this.size();
        }

        private Values() {
        }
    }

    public ConcurrentReaderHashMap(int i10, float f10) {
        this.barrierLock = new BarrierLock();
        this.keySet = null;
        this.entrySet = null;
        this.values = null;
        if (f10 > 0.0f) {
            this.loadFactor = f10;
            int p2capacity = p2capacity(i10);
            this.table = new Entry[p2capacity];
            this.threshold = (int) (p2capacity * f10);
            return;
        }
        throw new IllegalArgumentException("Illegal Load factor: " + f10);
    }

    private static int hash(Object obj) {
        int hashCode = obj.hashCode();
        return ((hashCode << 7) - hashCode) + (hashCode >>> 9) + (hashCode >>> 17);
    }

    private int p2capacity(int i10) {
        int i11 = MAXIMUM_CAPACITY;
        if (i10 <= MAXIMUM_CAPACITY && i10 >= 0) {
            i11 = 4;
            while (i11 < i10) {
                i11 <<= 1;
            }
        }
        return i11;
    }

    private synchronized void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.table = new Entry[objectInputStream.readInt()];
        int readInt = objectInputStream.readInt();
        for (int i10 = 0; i10 < readInt; i10++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private synchronized void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.table.length);
        objectOutputStream.writeInt(this.count);
        for (int length = this.table.length - 1; length >= 0; length--) {
            for (Entry entry = this.table[length]; entry != null; entry = entry.next) {
                objectOutputStream.writeObject(entry.key);
                objectOutputStream.writeObject(entry.value);
            }
        }
    }

    public synchronized int capacity() {
        return this.table.length;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public synchronized void clear() {
        Entry[] entryArr = this.table;
        for (int i10 = 0; i10 < entryArr.length; i10++) {
            for (Entry entry = entryArr[i10]; entry != null; entry = entry.next) {
                entry.value = null;
            }
            entryArr[i10] = null;
        }
        this.count = 0;
        recordModification(entryArr);
    }

    @Override // java.util.AbstractMap
    public synchronized Object clone() {
        ConcurrentReaderHashMap concurrentReaderHashMap;
        try {
            concurrentReaderHashMap = (ConcurrentReaderHashMap) super.clone();
            concurrentReaderHashMap.keySet = null;
            concurrentReaderHashMap.entrySet = null;
            concurrentReaderHashMap.values = null;
            Entry[] entryArr = this.table;
            Entry[] entryArr2 = new Entry[entryArr.length];
            concurrentReaderHashMap.table = entryArr2;
            for (int i10 = 0; i10 < entryArr.length; i10++) {
                Entry entry = entryArr[i10];
                Entry entry2 = null;
                while (entry != null) {
                    Entry entry3 = new Entry(entry.hash, entry.key, entry.value, entry2);
                    entry = entry.next;
                    entry2 = entry3;
                }
                entryArr2[i10] = entry2;
            }
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
        return concurrentReaderHashMap;
    }

    public boolean contains(Object obj) {
        return containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Entry[] tableForReading;
        obj.getClass();
        for (Entry entry : getTableForReading()) {
            for (; entry != null; entry = entry.next) {
                if (obj.equals(entry.value)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Enumeration elements() {
        return new ValueIterator();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        Set set = this.entrySet;
        if (set == null) {
            EntrySet entrySet = new EntrySet(this, 0);
            this.entrySet = entrySet;
            return entrySet;
        }
        return set;
    }

    public boolean eq(Object obj, Object obj2) {
        if (obj != obj2 && !obj.equals(obj2)) {
            return false;
        }
        return true;
    }

    public synchronized boolean findAndRemoveEntry(Map.Entry entry) {
        Object key = entry.getKey();
        Object obj = get(key);
        if (obj != null && obj.equals(entry.getValue())) {
            remove(key);
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        int hash = hash(obj);
        Entry[] entryArr = this.table;
        int length = (entryArr.length - 1) & hash;
        Entry entry = entryArr[length];
        Entry entry2 = entry;
        while (true) {
            if (entry == null) {
                Entry[] tableForReading = getTableForReading();
                if (entryArr == tableForReading && entry2 == entryArr[length]) {
                    return null;
                }
                length = hash & (tableForReading.length - 1);
                entry2 = tableForReading[length];
                entryArr = tableForReading;
            } else if (entry.hash == hash && eq(obj, entry.key)) {
                Object obj2 = entry.value;
                if (obj2 != null) {
                    return obj2;
                }
                synchronized (this) {
                    entryArr = this.table;
                }
                length = (entryArr.length - 1) & hash;
                entry2 = entryArr[length];
            } else {
                entry = entry.next;
            }
            entry = entry2;
        }
    }

    public final Entry[] getTableForReading() {
        Entry[] entryArr;
        synchronized (this.barrierLock) {
            entryArr = this.table;
        }
        return entryArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public synchronized boolean isEmpty() {
        boolean z10;
        if (this.count == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.keySet;
        if (set == null) {
            KeySet keySet = new KeySet(this, 0);
            this.keySet = keySet;
            return keySet;
        }
        return set;
    }

    public Enumeration keys() {
        return new KeyIterator();
    }

    public float loadFactor() {
        return this.loadFactor;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        obj2.getClass();
        int hash = hash(obj);
        Entry[] entryArr = this.table;
        int length = (entryArr.length - 1) & hash;
        Entry entry = entryArr[length];
        Entry entry2 = entry;
        while (entry2 != null && (entry2.hash != hash || !eq(obj, entry2.key))) {
            entry2 = entry2.next;
        }
        synchronized (this) {
            if (entryArr == this.table) {
                if (entry2 == null) {
                    if (entry == entryArr[length]) {
                        Entry entry3 = new Entry(hash, obj, obj2, entry);
                        entryArr[length] = entry3;
                        int i10 = this.count + 1;
                        this.count = i10;
                        if (i10 >= this.threshold) {
                            rehash();
                        } else {
                            recordModification(entry3);
                        }
                        return null;
                    }
                } else {
                    Object obj3 = entry2.value;
                    if (entry == entryArr[length] && obj3 != null) {
                        entry2.value = obj2;
                        return obj3;
                    }
                }
            }
            return sput(obj, obj2, hash);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public synchronized void putAll(Map map) {
        int size = map.size();
        if (size == 0) {
            return;
        }
        while (size >= this.threshold) {
            rehash();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public final void recordModification(Object obj) {
        synchronized (this.barrierLock) {
            this.lastWrite = obj;
        }
    }

    public void rehash() {
        Entry[] entryArr = this.table;
        int length = entryArr.length;
        if (length >= MAXIMUM_CAPACITY) {
            this.threshold = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            return;
        }
        int i10 = length << 1;
        int i11 = i10 - 1;
        this.threshold = (int) (i10 * this.loadFactor);
        Entry[] entryArr2 = new Entry[i10];
        for (Entry entry : entryArr) {
            if (entry != null) {
                int i12 = entry.hash & i11;
                Entry entry2 = entry.next;
                if (entry2 == null) {
                    entryArr2[i12] = entry;
                } else {
                    Entry entry3 = entry;
                    while (entry2 != null) {
                        int i13 = entry2.hash & i11;
                        if (i13 != i12) {
                            entry3 = entry2;
                            i12 = i13;
                        }
                        entry2 = entry2.next;
                    }
                    entryArr2[i12] = entry3;
                    while (entry != entry3) {
                        int i14 = entry.hash;
                        int i15 = i14 & i11;
                        entryArr2[i15] = new Entry(i14, entry.key, entry.value, entryArr2[i15]);
                        entry = entry.next;
                    }
                }
            }
        }
        this.table = entryArr2;
        recordModification(entryArr2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        int hash = hash(obj);
        Entry[] entryArr = this.table;
        int length = (entryArr.length - 1) & hash;
        Entry entry = entryArr[length];
        Entry entry2 = entry;
        while (entry2 != null && (entry2.hash != hash || !eq(obj, entry2.key))) {
            entry2 = entry2.next;
        }
        synchronized (this) {
            if (entryArr == this.table) {
                if (entry2 == null) {
                    if (entry == entryArr[length]) {
                        return null;
                    }
                } else {
                    Object obj2 = entry2.value;
                    if (entry == entryArr[length] && obj2 != null) {
                        entry2.value = null;
                        this.count--;
                        Entry entry3 = entry2.next;
                        while (entry != entry2) {
                            Entry entry4 = new Entry(entry.hash, entry.key, entry.value, entry3);
                            entry = entry.next;
                            entry3 = entry4;
                        }
                        entryArr[length] = entry3;
                        recordModification(entry3);
                        return obj2;
                    }
                }
            }
            return sremove(obj, hash);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public synchronized int size() {
        return this.count;
    }

    public Object sput(Object obj, Object obj2, int i10) {
        Entry[] entryArr = this.table;
        int length = (entryArr.length - 1) & i10;
        Entry entry = entryArr[length];
        for (Entry entry2 = entry; entry2 != null; entry2 = entry2.next) {
            if (entry2.hash == i10 && eq(obj, entry2.key)) {
                Object obj3 = entry2.value;
                entry2.value = obj2;
                return obj3;
            }
        }
        Entry entry3 = new Entry(i10, obj, obj2, entry);
        entryArr[length] = entry3;
        int i11 = this.count + 1;
        this.count = i11;
        if (i11 >= this.threshold) {
            rehash();
            return null;
        }
        recordModification(entry3);
        return null;
    }

    public Object sremove(Object obj, int i10) {
        Entry[] entryArr = this.table;
        int length = (entryArr.length - 1) & i10;
        Entry entry = entryArr[length];
        for (Entry entry2 = entry; entry2 != null; entry2 = entry2.next) {
            if (entry2.hash == i10 && eq(obj, entry2.key)) {
                Object obj2 = entry2.value;
                entry2.value = null;
                this.count--;
                Entry entry3 = entry2.next;
                while (entry != entry2) {
                    Entry entry4 = new Entry(entry.hash, entry.key, entry.value, entry3);
                    entry = entry.next;
                    entry3 = entry4;
                }
                entryArr[length] = entry3;
                recordModification(entry3);
                return obj2;
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        Collection collection = this.values;
        if (collection == null) {
            Values values = new Values(this, 0);
            this.values = values;
            return values;
        }
        return collection;
    }

    public ConcurrentReaderHashMap(int i10) {
        this(i10, 0.75f);
    }

    public ConcurrentReaderHashMap() {
        this(DEFAULT_INITIAL_CAPACITY, 0.75f);
    }

    public ConcurrentReaderHashMap(Map map) {
        this(Math.max(((int) (map.size() / 0.75f)) + 1, 16), 0.75f);
        putAll(map);
    }
}
