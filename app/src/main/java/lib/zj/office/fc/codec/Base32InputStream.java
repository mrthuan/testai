package lib.zj.office.fc.codec;

import java.io.InputStream;

/* loaded from: classes3.dex */
public class Base32InputStream extends BaseNCodecInputStream {
    public Base32InputStream(InputStream inputStream) {
        this(inputStream, false);
    }

    public Base32InputStream(InputStream inputStream, boolean z10) {
        super(inputStream, new Base32(false), z10);
    }

    public Base32InputStream(InputStream inputStream, boolean z10, int i10, byte[] bArr) {
        super(inputStream, new Base32(i10, bArr), z10);
    }
}
