package lib.zj.office.fc.codec;

import java.io.InputStream;

/* loaded from: classes3.dex */
public class Base64InputStream extends BaseNCodecInputStream {
    public Base64InputStream(InputStream inputStream) {
        this(inputStream, false);
    }

    public Base64InputStream(InputStream inputStream, boolean z10) {
        super(inputStream, new Base64(false), z10);
    }

    public Base64InputStream(InputStream inputStream, boolean z10, int i10, byte[] bArr) {
        super(inputStream, new Base64(i10, bArr), z10);
    }
}
