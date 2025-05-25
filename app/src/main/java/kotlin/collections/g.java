package kotlin.collections;

import java.util.Collection;

/* compiled from: Iterables.kt */
/* loaded from: classes.dex */
public class g extends ge.a {
    public static final <T> int h0(Iterable<? extends T> iterable, int i10) {
        kotlin.jvm.internal.g.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i10;
    }
}
