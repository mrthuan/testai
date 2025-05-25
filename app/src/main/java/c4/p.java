package c4;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* compiled from: LazyBitmapDrawableResource.java */
/* loaded from: classes.dex */
public final class p implements v3.l<BitmapDrawable>, v3.i {

    /* renamed from: a  reason: collision with root package name */
    public final Resources f5541a;

    /* renamed from: b  reason: collision with root package name */
    public final v3.l<Bitmap> f5542b;

    public p(Resources resources, v3.l<Bitmap> lVar) {
        com.google.android.play.core.assetpacks.c.l(resources);
        this.f5541a = resources;
        com.google.android.play.core.assetpacks.c.l(lVar);
        this.f5542b = lVar;
    }

    @Override // v3.l
    public final void a() {
        this.f5542b.a();
    }

    @Override // v3.l
    public final Class<BitmapDrawable> c() {
        return BitmapDrawable.class;
    }

    @Override // v3.l
    public final BitmapDrawable get() {
        return new BitmapDrawable(this.f5541a, this.f5542b.get());
    }

    @Override // v3.l
    public final int getSize() {
        return this.f5542b.getSize();
    }

    @Override // v3.i
    public final void initialize() {
        v3.l<Bitmap> lVar = this.f5542b;
        if (lVar instanceof v3.i) {
            ((v3.i) lVar).initialize();
        }
    }
}
