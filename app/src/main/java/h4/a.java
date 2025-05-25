package h4;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import t3.e;
import v3.l;

/* compiled from: BitmapBytesTranscoder.java */
/* loaded from: classes.dex */
public final class a implements b<Bitmap, byte[]> {

    /* renamed from: a  reason: collision with root package name */
    public final Bitmap.CompressFormat f18002a = Bitmap.CompressFormat.JPEG;

    /* renamed from: b  reason: collision with root package name */
    public final int f18003b = 100;

    @Override // h4.b
    public final l<byte[]> e(l<Bitmap> lVar, e eVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        lVar.get().compress(this.f18002a, this.f18003b, byteArrayOutputStream);
        lVar.a();
        return new d4.b(byteArrayOutputStream.toByteArray());
    }
}
