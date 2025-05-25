package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public abstract class E4 {

    /* renamed from: a  reason: collision with root package name */
    public static final CopyOnWriteArrayList f14222a = new CopyOnWriteArrayList();

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicBoolean f14223b = new AtomicBoolean(false);
    public static final D4 c = new D4();

    public static void a(X5 finishListener) {
        kotlin.jvm.internal.g.e(finishListener, "finishListener");
        if (!f14223b.getAndSet(true)) {
            b();
        }
        CopyOnWriteArrayList copyOnWriteArrayList = f14222a;
        copyOnWriteArrayList.add(new WeakReference(finishListener));
        try {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null) {
                    f14222a.remove(weakReference);
                }
            }
        } catch (Exception e10) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
        }
    }

    public static void b() {
        Vb.f14759a.execute(new d6.b(2));
    }

    public static final void c() {
        R5 d10 = AbstractC1882ya.d();
        D4 listener = c;
        d10.getClass();
        kotlin.jvm.internal.g.e(listener, "listener");
        d10.f14611b = listener;
    }

    public static ArrayList a() {
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList = AbstractC1569b6.f14964a;
        ArrayList arrayList2 = new ArrayList();
        try {
            Iterator it = AbstractC1569b6.f14964a.iterator();
            while (it.hasNext()) {
                C9 c92 = (C9) ((WeakReference) it.next()).get();
                if (c92 != null) {
                    arrayList2.add(c92);
                }
            }
        } catch (Exception e10) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
        }
        CopyOnWriteArrayList copyOnWriteArrayList2 = AbstractC1569b6.f14964a;
        arrayList2.toString();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C1779qa((C9) it2.next()));
        }
        return arrayList;
    }
}
