package com.inmobi.media;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.inmobi.media.b1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1564b1 {

    /* renamed from: a  reason: collision with root package name */
    public final cg.a f14945a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f14946b;
    public volatile Object c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f14947d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f14948e;

    public /* synthetic */ C1564b1(Integer num, cg.a aVar, boolean z10, int i10) {
        this((Object) num, aVar, (i10 & 4) != 0 ? false : z10, false);
    }

    public final void a() {
        if (this.f14947d.compareAndSet(false, true)) {
            this.f14948e = true;
            ((ScheduledThreadPoolExecutor) G3.f14268b.getValue()).submit(new androidx.appcompat.widget.z0(this, 9));
        }
    }

    public final Object getValue(Object obj, ig.h property) {
        kotlin.jvm.internal.g.e(property, "property");
        if (this.f14946b || !this.f14948e) {
            a();
        }
        return this.c;
    }

    public C1564b1(Object obj, cg.a refreshLogic, boolean z10, boolean z11) {
        kotlin.jvm.internal.g.e(refreshLogic, "refreshLogic");
        this.f14945a = refreshLogic;
        this.f14946b = z10;
        this.c = obj;
        this.f14947d = new AtomicBoolean(false);
        if (z11) {
            a();
        }
    }

    public static final void a(C1564b1 this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        try {
            this$0.c = this$0.f14945a.invoke();
        } catch (Exception unused) {
        } catch (Throwable th2) {
            this$0.f14947d.set(false);
            throw th2;
        }
        this$0.f14947d.set(false);
    }
}
