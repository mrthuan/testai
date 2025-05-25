package gf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: StringCodec.java */
/* loaded from: classes.dex */
public final class l implements f<String> {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f17804a = Charset.forName("UTF8");

    /* renamed from: b  reason: collision with root package name */
    public static final l f17805b = new l();

    public static String c(ByteBuffer byteBuffer) {
        byte[] bArr;
        int i10;
        if (byteBuffer == null) {
            return null;
        }
        int remaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            i10 = byteBuffer.arrayOffset();
        } else {
            bArr = new byte[remaining];
            byteBuffer.get(bArr);
            i10 = 0;
        }
        return new String(bArr, i10, remaining, f17804a);
    }

    public static ByteBuffer d(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(f17804a);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }

    @Override // gf.f
    public final /* bridge */ /* synthetic */ ByteBuffer a(String str) {
        return d(str);
    }

    @Override // gf.f
    public final /* bridge */ /* synthetic */ String b(ByteBuffer byteBuffer) {
        return c(byteBuffer);
    }
}
