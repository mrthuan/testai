package c4;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* compiled from: ResourceBitmapDecoder.java */
/* loaded from: classes.dex */
public final class r implements t3.f<Uri, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final e4.d f5544a;

    /* renamed from: b  reason: collision with root package name */
    public final w3.c f5545b;

    public r(e4.d dVar, w3.c cVar) {
        this.f5544a = dVar;
        this.f5545b = cVar;
    }

    @Override // t3.f
    public final boolean a(Uri uri, t3.e eVar) {
        return "android.resource".equals(uri.getScheme());
    }

    @Override // t3.f
    public final v3.l<Bitmap> b(Uri uri, int i10, int i11, t3.e eVar) {
        v3.l c = this.f5544a.c(uri);
        if (c == null) {
            return null;
        }
        return j.a(this.f5545b, (Drawable) ((e4.b) c).get(), i10, i11);
    }
}
