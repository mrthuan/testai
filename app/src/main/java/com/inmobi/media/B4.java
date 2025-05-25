package com.inmobi.media;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class B4 implements A4 {

    /* renamed from: a  reason: collision with root package name */
    public C9 f14141a;

    /* renamed from: b  reason: collision with root package name */
    public final Za f14142b;

    public B4(Context context, double d10, S5 logLevel, boolean z10, boolean z11, int i10, long j10, boolean z12) {
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(logLevel, "logLevel");
        if (!z11) {
            this.f14142b = new Za();
        }
        if (!z10) {
            C9 c92 = new C9(context, d10, logLevel, j10, i10, z12);
            this.f14141a = c92;
            CopyOnWriteArrayList copyOnWriteArrayList = AbstractC1569b6.f14964a;
            Objects.toString(c92);
            AbstractC1569b6.f14964a.add(new WeakReference(c92));
        }
    }

    public final void a(String tag, String message) {
        kotlin.jvm.internal.g.e(tag, "tag");
        kotlin.jvm.internal.g.e(message, "message");
        C9 c92 = this.f14141a;
        if (c92 != null) {
            c92.a(S5.f14636b, tag, message);
        }
    }

    public final void b(String tag, String message) {
        kotlin.jvm.internal.g.e(tag, "tag");
        kotlin.jvm.internal.g.e(message, "message");
        C9 c92 = this.f14141a;
        if (c92 != null) {
            c92.a(S5.c, tag, message);
        }
    }

    public final void c(String tag, String message) {
        kotlin.jvm.internal.g.e(tag, "tag");
        kotlin.jvm.internal.g.e(message, "message");
        C9 c92 = this.f14141a;
        if (c92 != null) {
            c92.a(S5.f14635a, tag, message);
        }
    }

    public final void d(String tag, String message) {
        kotlin.jvm.internal.g.e(tag, "tag");
        kotlin.jvm.internal.g.e(message, "message");
        C9 c92 = this.f14141a;
        if (c92 != null) {
            c92.a(S5.f14637d, tag, message);
        }
        if (this.f14142b != null) {
            kotlin.jvm.internal.g.e("STATE_CHANGE: ".concat(message), "message");
        }
    }

    public final void e(String key, String value) {
        kotlin.jvm.internal.g.e(key, "key");
        kotlin.jvm.internal.g.e(value, "value");
        C9 c92 = this.f14141a;
        if (c92 != null) {
            Objects.toString(c92.f14171i);
            if (!c92.f14171i.get()) {
                c92.f14170h.put(key, value);
            }
        }
    }

    public final void a(String tag, String message, Exception error) {
        kotlin.jvm.internal.g.e(tag, "tag");
        kotlin.jvm.internal.g.e(message, "message");
        kotlin.jvm.internal.g.e(error, "error");
        C9 c92 = this.f14141a;
        if (c92 != null) {
            S5 s52 = S5.c;
            StringBuilder g10 = a0.d.g(message, "\nError: ");
            g10.append(com.google.android.play.core.assetpacks.b1.Z(error));
            c92.a(s52, tag, g10.toString());
        }
    }

    public final void b() {
        C9 c92 = this.f14141a;
        if (c92 != null) {
            c92.a();
        }
    }

    public final void a(boolean z10) {
        C9 c92 = this.f14141a;
        if (c92 != null) {
            Objects.toString(c92.f14171i);
            if (!c92.f14171i.get()) {
                c92.f14166d = z10;
            }
        }
        if (z10) {
            return;
        }
        C9 c93 = this.f14141a;
        if (c93 == null || !c93.f14168f.a()) {
            CopyOnWriteArrayList copyOnWriteArrayList = AbstractC1569b6.f14964a;
            AbstractC1555a6.a(this.f14141a);
            this.f14141a = null;
        }
    }

    public final void a() {
        C9 c92 = this.f14141a;
        if (c92 != null) {
            c92.b();
        }
        CopyOnWriteArrayList copyOnWriteArrayList = AbstractC1569b6.f14964a;
        AbstractC1555a6.a(this.f14141a);
    }
}
