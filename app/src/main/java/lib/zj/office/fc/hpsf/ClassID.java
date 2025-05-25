package lib.zj.office.fc.hpsf;

import a6.h;
import lib.zj.office.fc.util.HexDump;

/* loaded from: classes3.dex */
public class ClassID {
    public static final int LENGTH = 16;
    protected byte[] bytes;

    public ClassID(byte[] bArr, int i10) {
        read(bArr, i10);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ClassID)) {
            return false;
        }
        ClassID classID = (ClassID) obj;
        if (this.bytes.length != classID.bytes.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            byte[] bArr = this.bytes;
            if (i10 < bArr.length) {
                if (bArr[i10] != classID.bytes[i10]) {
                    return false;
                }
                i10++;
            } else {
                return true;
            }
        }
    }

    public byte[] getBytes() {
        return this.bytes;
    }

    public int hashCode() {
        return new String(this.bytes).hashCode();
    }

    public int length() {
        return 16;
    }

    public byte[] read(byte[] bArr, int i10) {
        this.bytes = r1;
        byte[] bArr2 = {bArr[i10 + 3], bArr[i10 + 2], bArr[i10 + 1], bArr[i10 + 0], bArr[i10 + 5], bArr[i10 + 4], bArr[i10 + 7], bArr[i10 + 6]};
        for (int i11 = 8; i11 < 16; i11++) {
            this.bytes[i11] = bArr[i11 + i10];
        }
        return this.bytes;
    }

    public void setBytes(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = this.bytes;
            if (i10 < bArr2.length) {
                bArr2[i10] = bArr[i10];
                i10++;
            } else {
                return;
            }
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(38);
        stringBuffer.append('{');
        for (int i10 = 0; i10 < 16; i10++) {
            stringBuffer.append(HexDump.toHex(this.bytes[i10]));
            if (i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9) {
                stringBuffer.append('-');
            }
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public void write(byte[] bArr, int i10) {
        if (bArr.length >= 16) {
            byte[] bArr2 = this.bytes;
            bArr[i10 + 0] = bArr2[3];
            bArr[i10 + 1] = bArr2[2];
            bArr[i10 + 2] = bArr2[1];
            bArr[i10 + 3] = bArr2[0];
            bArr[i10 + 4] = bArr2[5];
            bArr[i10 + 5] = bArr2[4];
            bArr[i10 + 6] = bArr2[7];
            bArr[i10 + 7] = bArr2[6];
            for (int i11 = 8; i11 < 16; i11++) {
                bArr[i11 + i10] = this.bytes[i11];
            }
            return;
        }
        throw new ArrayStoreException(h.g(new StringBuilder("Destination byte[] must have room for at least 16 bytes, but has a length of only "), bArr.length, "."));
    }

    public ClassID() {
        this.bytes = new byte[16];
        for (int i10 = 0; i10 < 16; i10++) {
            this.bytes[i10] = 0;
        }
    }
}
