package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: MutableCollectionsJVM.kt */
/* loaded from: classes.dex */
public class j extends i {
    public static final <T> void j0(List<T> list, Comparator<? super T> comparator) {
        kotlin.jvm.internal.g.e(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
