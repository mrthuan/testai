package kotlin.sequences;

import cg.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jg.d;
import jg.f;
import jg.k;
import jg.m;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.g;

/* compiled from: _Sequences.kt */
/* loaded from: classes.dex */
public class a extends k {
    public static String g0(f fVar, String str) {
        g.e(fVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int i10 = 0;
        for (Object obj : fVar) {
            i10++;
            if (i10 > 1) {
                sb2.append((CharSequence) str);
            }
            ea.a.i(sb2, obj, null);
        }
        sb2.append((CharSequence) "");
        String sb3 = sb2.toString();
        g.d(sb3, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb3;
    }

    public static final d h0(f fVar, l lVar) {
        m mVar = new m(fVar, lVar);
        SequencesKt___SequencesKt$filterNotNull$1 predicate = new l<Object, Boolean>() { // from class: kotlin.sequences.SequencesKt___SequencesKt$filterNotNull$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj == null);
            }
        };
        g.e(predicate, "predicate");
        return new d(mVar, predicate);
    }

    public static final <T> List<T> i0(f<? extends T> fVar) {
        Iterator<? extends T> it = fVar.iterator();
        if (!it.hasNext()) {
            return EmptyList.INSTANCE;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return ge.a.H(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
