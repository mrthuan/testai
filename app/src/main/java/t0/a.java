package t0;

import android.graphics.Typeface;
import n0.f;
import o0.e;

/* compiled from: CallbackWithHandler.java */
/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ aj.b f29869a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Typeface f29870b;

    public a(aj.b bVar, Typeface typeface) {
        this.f29869a = bVar;
        this.f29870b = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f.e eVar = ((e.a) this.f29869a).f22647w;
        if (eVar != null) {
            eVar.d(this.f29870b);
        }
    }
}
