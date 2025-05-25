package com.apm.insight.k;

import android.content.Context;
import com.apm.insight.l.o;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.p;
import com.apm.insight.runtime.s;

/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private Context f6622a;

    private i(Context context) {
        this.f6622a = context;
    }

    public static void a(Context context) {
        a(context, 0);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.apm.insight.b.g.a(this.f6622a).a().f();
        } catch (Throwable unused) {
        }
        try {
            if (com.apm.insight.l.a.b(this.f6622a)) {
                b.a().a(o.b(this.f6622a));
            } else {
                NativeImpl.i();
            }
            s.a().a(com.apm.insight.i.a().b(), com.apm.insight.entity.b.b());
            if (p.b().a() == null) {
            }
        } catch (Throwable th2) {
            try {
                com.apm.insight.l.p.b(th2);
            } finally {
                s.a().a(com.apm.insight.i.a().b(), com.apm.insight.entity.b.b());
                if (p.b().a() != null) {
                    com.apm.insight.j.d.a(p.b().a(), this.f6622a).a();
                }
            }
        }
    }

    public static void a(Context context, int i10) {
        p.b().a(new i(context), i10);
    }

    public static boolean a() {
        return b.a().c() || !com.apm.insight.l.a.b(com.apm.insight.i.g());
    }
}
