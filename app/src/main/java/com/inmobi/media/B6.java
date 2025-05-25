package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public final class B6 {

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f14143a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final ExecutorService f14144b = Executors.newSingleThreadExecutor(new I4("MultiEventBus"));

    public static final void a(H1 event, B6 this$0) {
        kotlin.jvm.internal.g.e(event, "$event");
        kotlin.jvm.internal.g.e(this$0, "this$0");
        this$0.a(event);
    }

    public final void b(H1 event) {
        kotlin.jvm.internal.g.e(event, "event");
        try {
            this.f14144b.execute(new androidx.fragment.app.a1(3, event, this));
        } catch (InternalError unused) {
            a(event);
        }
    }

    public final void a(int[] eventIds, cg.l subscriber) {
        kotlin.jvm.internal.g.e(eventIds, "eventIds");
        kotlin.jvm.internal.g.e(subscriber, "subscriber");
        this.f14143a.put(new A6(eventIds), new WeakReference(subscriber));
    }

    public final void a(cg.l subscriber) {
        kotlin.jvm.internal.g.e(subscriber, "subscriber");
        Iterator it = this.f14143a.entrySet().iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.g.a(((WeakReference) ((Map.Entry) it.next()).getValue()).get(), subscriber)) {
                it.remove();
            }
        }
    }

    public final void a(H1 h12) {
        cg.l lVar;
        Set<Map.Entry> entrySet = this.f14143a.entrySet();
        kotlin.jvm.internal.g.d(entrySet, "<get-entries>(...)");
        for (Map.Entry entry : entrySet) {
            if (((WeakReference) entry.getValue()).get() == null) {
                this.f14143a.remove(entry.getKey());
            }
        }
        Set<Map.Entry> entrySet2 = this.f14143a.entrySet();
        kotlin.jvm.internal.g.d(entrySet2, "<get-entries>(...)");
        for (Map.Entry entry2 : entrySet2) {
            kotlin.jvm.internal.g.b(entry2);
            cg.l lVar2 = (cg.l) entry2.getKey();
            WeakReference weakReference = (WeakReference) entry2.getValue();
            try {
                if (((Boolean) lVar2.invoke(h12)).booleanValue() && (lVar = (cg.l) weakReference.get()) != null) {
                    lVar.invoke(h12);
                }
            } catch (Exception e10) {
                Q4 q42 = Q4.f14590a;
                Q4.c.a(AbstractC1863x4.a(e10, "event"));
            }
        }
    }
}
