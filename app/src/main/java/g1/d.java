package g1;

import a9.g;
import android.os.Looper;
import android.util.AndroidRuntimeException;

/* compiled from: SpringAnimation.java */
/* loaded from: classes.dex */
public final class d extends b<d> {

    /* renamed from: r  reason: collision with root package name */
    public e f17400r;

    /* renamed from: s  reason: collision with root package name */
    public float f17401s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f17402t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Object obj) {
        super(obj);
        g.a aVar = g.f420q;
        this.f17400r = null;
        this.f17401s = Float.MAX_VALUE;
        this.f17402t = false;
    }

    public final void c() {
        boolean z10;
        if (this.f17400r.f17404b > 0.0d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.f17391f) {
                    this.f17402t = true;
                    return;
                }
                return;
            }
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
    }
}
