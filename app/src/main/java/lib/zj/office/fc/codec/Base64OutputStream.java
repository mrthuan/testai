package lib.zj.office.fc.codec;

import java.io.OutputStream;

/* loaded from: classes3.dex */
public class Base64OutputStream extends BaseNCodecOutputStream {
    public Base64OutputStream(OutputStream outputStream) {
        this(outputStream, true);
    }

    public Base64OutputStream(OutputStream outputStream, boolean z10) {
        super(outputStream, new Base64(false), z10);
    }

    public Base64OutputStream(OutputStream outputStream, boolean z10, int i10, byte[] bArr) {
        super(outputStream, new Base64(i10, bArr), z10);
    }
}
