package g4;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import v3.l;

/* compiled from: StreamGifDecoder.java */
/* loaded from: classes.dex */
public final class i implements t3.f<InputStream, c> {

    /* renamed from: a  reason: collision with root package name */
    public final List<ImageHeaderParser> f17665a;

    /* renamed from: b  reason: collision with root package name */
    public final t3.f<ByteBuffer, c> f17666b;
    public final w3.b c;

    public i(List list, a aVar, w3.b bVar) {
        this.f17665a = list;
        this.f17666b = aVar;
        this.c = bVar;
    }

    @Override // t3.f
    public final boolean a(InputStream inputStream, t3.e eVar) {
        InputStream inputStream2 = inputStream;
        if (!((Boolean) eVar.c(h.f17664b)).booleanValue()) {
            if (com.bumptech.glide.load.a.b(this.c, inputStream2, this.f17665a) == ImageHeaderParser.ImageType.GIF) {
                return true;
            }
        }
        return false;
    }

    @Override // t3.f
    public final l<c> b(InputStream inputStream, int i10, int i11, t3.e eVar) {
        byte[] bArr;
        InputStream inputStream2 = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream2.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            Log.isLoggable("StreamGifDecoder", 5);
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.f17666b.b(ByteBuffer.wrap(bArr), i10, i11, eVar);
    }
}
