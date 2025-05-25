package lib.zj.office.fc.hwpf.model.io;

import java.io.ByteArrayOutputStream;
import lib.zj.office.fc.util.Internal;

@Internal
/* loaded from: classes3.dex */
public final class HWPFOutputStream extends ByteArrayOutputStream {
    int _offset;

    public int getOffset() {
        return this._offset;
    }

    @Override // java.io.ByteArrayOutputStream
    public synchronized void reset() {
        super.reset();
        this._offset = 0;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i10, int i11) {
        super.write(bArr, i10, i11);
        this._offset += i11;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i10) {
        super.write(i10);
        this._offset++;
    }
}
