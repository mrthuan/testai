package kotlin.enums;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.jvm.internal.g;

/* compiled from: EnumEntriesSerializationProxy.kt */
/* loaded from: classes.dex */
public final class EnumEntriesSerializationProxy<E extends Enum<E>> implements Serializable {
    private static final long serialVersionUID = 0;
    private final Class<E> c;

    public EnumEntriesSerializationProxy(E[] entries) {
        g.e(entries, "entries");
        Class<E> cls = (Class<E>) entries.getClass().getComponentType();
        g.b(cls);
        this.c = cls;
    }

    private final Object readResolve() {
        E[] enumConstants = this.c.getEnumConstants();
        g.d(enumConstants, "c.enumConstants");
        return a.a(enumConstants);
    }
}
