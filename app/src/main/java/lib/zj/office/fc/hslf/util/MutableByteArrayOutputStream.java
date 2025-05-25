package lib.zj.office.fc.hslf.util;

import java.io.ByteArrayOutputStream;

/* loaded from: classes3.dex */
public final class MutableByteArrayOutputStream extends ByteArrayOutputStream {
    public int getBytesWritten() {
        return -1;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public void write(int i10) {
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
    }

    public void overwrite(byte[] bArr, int i10) {
    }
}
