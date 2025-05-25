package kotlin.enums;

import kotlin.jvm.internal.g;

/* compiled from: EnumEntries.kt */
/* loaded from: classes.dex */
public final class a {
    public static final <E extends Enum<E>> xf.a<E> a(E[] entries) {
        g.e(entries, "entries");
        return new EnumEntriesList(entries);
    }
}
