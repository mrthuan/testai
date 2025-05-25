package kotlin.enums;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.collections.b;
import kotlin.collections.f;
import kotlin.jvm.internal.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EnumEntries.kt */
/* loaded from: classes.dex */
public final class EnumEntriesList<T extends Enum<T>> extends b<T> implements xf.a<T>, Serializable {
    private final T[] entries;

    public EnumEntriesList(T[] entries) {
        g.e(entries, "entries");
        this.entries = entries;
    }

    private final Object writeReplace() {
        return new EnumEntriesSerializationProxy(this.entries);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return contains((EnumEntriesList<T>) ((Enum) obj));
        }
        return false;
    }

    @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.entries.length;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.b, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return indexOf((EnumEntriesList<T>) ((Enum) obj));
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.b, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return lastIndexOf((EnumEntriesList<T>) ((Enum) obj));
        }
        return -1;
    }

    public boolean contains(T element) {
        g.e(element, "element");
        return ((Enum) f.E(element.ordinal(), this.entries)) == element;
    }

    @Override // kotlin.collections.b, java.util.List
    public T get(int i10) {
        b.a aVar = b.Companion;
        int length = this.entries.length;
        aVar.getClass();
        b.a.a(i10, length);
        return this.entries[i10];
    }

    public int indexOf(T element) {
        g.e(element, "element");
        int ordinal = element.ordinal();
        if (((Enum) f.E(ordinal, this.entries)) == element) {
            return ordinal;
        }
        return -1;
    }

    public int lastIndexOf(T element) {
        g.e(element, "element");
        return indexOf((Object) element);
    }
}
