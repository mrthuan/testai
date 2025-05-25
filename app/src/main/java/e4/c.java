package e4;

import android.graphics.drawable.Drawable;

/* compiled from: NonOwnedDrawableResource.java */
/* loaded from: classes.dex */
public final class c extends b<Drawable> {
    @Override // v3.l
    public final Class<Drawable> c() {
        return this.f16451a.getClass();
    }

    @Override // v3.l
    public final int getSize() {
        T t4 = this.f16451a;
        return Math.max(1, t4.getIntrinsicHeight() * t4.getIntrinsicWidth() * 4);
    }

    @Override // v3.l
    public final void a() {
    }
}
