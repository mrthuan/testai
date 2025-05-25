package kotlin.collections;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: _MapsJvm.kt */
/* loaded from: classes.dex */
public class q extends t0 {
    public static final Map A0(Pair... pairArr) {
        if (pairArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(t0.g0(pairArr.length));
            C0(linkedHashMap, pairArr);
            return linkedHashMap;
        }
        return y0();
    }

    public static final LinkedHashMap B0(Pair... pairArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(t0.g0(pairArr.length));
        C0(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static final void C0(HashMap hashMap, Pair[] pairArr) {
        for (Pair pair : pairArr) {
            hashMap.put(pair.component1(), pair.component2());
        }
    }

    public static final Map D0(AbstractMap abstractMap) {
        kotlin.jvm.internal.g.e(abstractMap, "<this>");
        int size = abstractMap.size();
        if (size != 0) {
            if (size != 1) {
                return new LinkedHashMap(abstractMap);
            }
            return t0.u0(abstractMap);
        }
        return y0();
    }

    public static final Map E0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(t0.g0(arrayList.size()));
                F0(arrayList, linkedHashMap);
                return linkedHashMap;
            }
            return t0.h0((Pair) arrayList.get(0));
        }
        return y0();
    }

    public static final void F0(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            linkedHashMap.put(pair.component1(), pair.component2());
        }
    }

    public static final Map y0() {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        kotlin.jvm.internal.g.c(emptyMap, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return emptyMap;
    }

    public static final HashMap z0(Pair... pairArr) {
        HashMap hashMap = new HashMap(t0.g0(pairArr.length));
        C0(hashMap, pairArr);
        return hashMap;
    }
}
