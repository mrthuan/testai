package com.facebook;

import android.os.Handler;
import com.facebook.e;
import com.facebook.internal.q;

/* compiled from: RequestProgress.kt */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f9842a;

    /* renamed from: b  reason: collision with root package name */
    public final e f9843b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public long f9844d;

    /* renamed from: e  reason: collision with root package name */
    public long f9845e;

    /* renamed from: f  reason: collision with root package name */
    public long f9846f;

    public m(Handler handler, e eVar) {
        this.f9842a = handler;
        this.f9843b = eVar;
        d dVar = d.f9685a;
        q.e();
        this.c = d.f9692i.get();
    }

    public final void a() {
        final long j10 = this.f9844d;
        if (j10 > this.f9845e) {
            final e.b bVar = this.f9843b.f9709g;
            final long j11 = this.f9846f;
            if (j11 > 0 && (bVar instanceof e.InterfaceC0145e)) {
                Handler handler = this.f9842a;
                if (handler != null) {
                    handler.post(new Runnable(j10, j11) { // from class: t5.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((e.InterfaceC0145e) e.b.this).a();
                        }
                    });
                } else {
                    ((e.InterfaceC0145e) bVar).a();
                }
                this.f9845e = this.f9844d;
            }
        }
    }
}
