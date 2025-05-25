package c4;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* compiled from: BitmapDrawableDecoder.java */
/* loaded from: classes.dex */
public final class a<DataType> implements t3.f<DataType, BitmapDrawable> {

    /* renamed from: a  reason: collision with root package name */
    public final t3.f<DataType, Bitmap> f5519a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f5520b;

    public a(Resources resources, t3.f<DataType, Bitmap> fVar) {
        this.f5520b = resources;
        this.f5519a = fVar;
    }

    @Override // t3.f
    public final boolean a(DataType datatype, t3.e eVar) {
        return this.f5519a.a(datatype, eVar);
    }

    @Override // t3.f
    public final v3.l<BitmapDrawable> b(DataType datatype, int i10, int i11, t3.e eVar) {
        v3.l<Bitmap> b10 = this.f5519a.b(datatype, i10, i11, eVar);
        if (b10 == null) {
            return null;
        }
        return new p(this.f5520b, b10);
    }
}
