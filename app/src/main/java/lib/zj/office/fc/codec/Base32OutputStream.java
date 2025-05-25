package lib.zj.office.fc.codec;

import java.io.OutputStream;

/* loaded from: classes3.dex */
public class Base32OutputStream extends BaseNCodecOutputStream {
    public Base32OutputStream(OutputStream outputStream) {
        this(outputStream, true);
    }

    public Base32OutputStream(OutputStream outputStream, boolean z10) {
        super(outputStream, new Base32(false), z10);
    }

    public Base32OutputStream(OutputStream outputStream, boolean z10, int i10, byte[] bArr) {
        super(outputStream, new Base32(i10, bArr), z10);
    }
}
