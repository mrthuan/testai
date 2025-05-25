package c4;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.a;
import com.bumptech.glide.load.resource.bitmap.b;
import java.nio.ByteBuffer;
import p4.a;

/* compiled from: ByteBufferBitmapDecoder.java */
/* loaded from: classes.dex */
public final class e implements t3.f<ByteBuffer, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final com.bumptech.glide.load.resource.bitmap.a f5525a;

    public e(com.bumptech.glide.load.resource.bitmap.a aVar) {
        this.f5525a = aVar;
    }

    @Override // t3.f
    public final boolean a(ByteBuffer byteBuffer, t3.e eVar) {
        this.f5525a.getClass();
        return true;
    }

    @Override // t3.f
    public final v3.l<Bitmap> b(ByteBuffer byteBuffer, int i10, int i11, t3.e eVar) {
        int i12 = p4.a.f23684a;
        a.C0324a c0324a = new a.C0324a(byteBuffer);
        a.C0055a c0055a = com.bumptech.glide.load.resource.bitmap.a.f7057k;
        com.bumptech.glide.load.resource.bitmap.a aVar = this.f5525a;
        return aVar.a(new b.a(aVar.c, c0324a, aVar.f7061d), i10, i11, eVar, c0055a);
    }
}
