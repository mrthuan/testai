package w0;

import com.android.billingclient.api.b0;

/* compiled from: Pools.java */
/* loaded from: classes.dex */
public final class e<T> extends b0 {
    public final Object c;

    public e(int i10) {
        super(i10);
        this.c = new Object();
    }

    @Override // com.android.billingclient.api.b0, w0.d
    public final boolean a(T t4) {
        boolean a10;
        synchronized (this.c) {
            a10 = super.a(t4);
        }
        return a10;
    }

    @Override // com.android.billingclient.api.b0, w0.d
    public final T b() {
        T t4;
        synchronized (this.c) {
            t4 = (T) super.b();
        }
        return t4;
    }
}
