package t0;

import android.os.Handler;
import o0.e;
import t0.k;

/* compiled from: CallbackWithHandler.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final aj.b f29873a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f29874b;

    public c(e.a aVar, Handler handler) {
        this.f29873a = aVar;
        this.f29874b = handler;
    }

    public final void a(k.a aVar) {
        boolean z10;
        int i10 = aVar.f29893b;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Handler handler = this.f29874b;
        aj.b bVar = this.f29873a;
        if (z10) {
            handler.post(new a(bVar, aVar.f29892a));
        } else {
            handler.post(new b(bVar, i10));
        }
    }
}
