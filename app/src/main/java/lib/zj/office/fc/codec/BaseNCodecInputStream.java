package lib.zj.office.fc.codec;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class BaseNCodecInputStream extends FilterInputStream {
    private final BaseNCodec baseNCodec;
    private final boolean doEncode;
    private final byte[] singleByte;

    public BaseNCodecInputStream(InputStream inputStream, BaseNCodec baseNCodec, boolean z10) {
        super(inputStream);
        this.singleByte = new byte[1];
        this.doEncode = z10;
        this.baseNCodec = baseNCodec;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int read = read(this.singleByte, 0, 1);
        while (read == 0) {
            read = read(this.singleByte, 0, 1);
        }
        if (read > 0) {
            byte b10 = this.singleByte[0];
            return b10 < 0 ? b10 + 256 : b10;
        }
        return -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        bArr.getClass();
        if (i10 >= 0 && i11 >= 0) {
            if (i10 > bArr.length || i10 + i11 > bArr.length) {
                throw new IndexOutOfBoundsException();
            }
            if (i11 == 0) {
                return 0;
            }
            int i12 = 0;
            while (i12 == 0) {
                if (!this.baseNCodec.hasData()) {
                    byte[] bArr2 = new byte[this.doEncode ? 4096 : 8192];
                    int read = ((FilterInputStream) this).in.read(bArr2);
                    if (this.doEncode) {
                        this.baseNCodec.encode(bArr2, 0, read);
                    } else {
                        this.baseNCodec.decode(bArr2, 0, read);
                    }
                }
                i12 = this.baseNCodec.readResults(bArr, i10, i11);
            }
            return i12;
        }
        throw new IndexOutOfBoundsException();
    }
}
