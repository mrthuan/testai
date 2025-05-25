package c4;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.resource.bitmap.b;

/* compiled from: ParcelFileDescriptorBitmapDecoder.java */
/* loaded from: classes.dex */
public final class q implements t3.f<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final com.bumptech.glide.load.resource.bitmap.a f5543a;

    public q(com.bumptech.glide.load.resource.bitmap.a aVar) {
        this.f5543a = aVar;
    }

    @Override // t3.f
    public final boolean a(ParcelFileDescriptor parcelFileDescriptor, t3.e eVar) {
        this.f5543a.getClass();
        return true;
    }

    @Override // t3.f
    public final v3.l<Bitmap> b(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, t3.e eVar) {
        com.bumptech.glide.load.resource.bitmap.a aVar = this.f5543a;
        return aVar.a(new b.C0056b(parcelFileDescriptor, aVar.f7061d, aVar.c), i10, i11, eVar, com.bumptech.glide.load.resource.bitmap.a.f7057k);
    }
}
