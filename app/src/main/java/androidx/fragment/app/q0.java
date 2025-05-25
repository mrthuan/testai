package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import y.h;

/* compiled from: FragmentTransition.kt */
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a  reason: collision with root package name */
    public static final s0 f3921a = new s0();

    /* renamed from: b  reason: collision with root package name */
    public static final w0 f3922b;

    static {
        w0 w0Var;
        try {
            w0Var = (w0) f2.f.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            w0Var = null;
        }
        f3922b = w0Var;
    }

    public static final String a(y.b<String, String> bVar, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = ((h.b) bVar.entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (kotlin.jvm.internal.g.a(entry.getValue(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            arrayList.add((String) entry2.getKey());
        }
        return (String) kotlin.collections.m.s0(arrayList);
    }

    public static final void b(int i10, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i10);
        }
    }
}
