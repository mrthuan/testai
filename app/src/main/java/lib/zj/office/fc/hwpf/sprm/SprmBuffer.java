package lib.zj.office.fc.hwpf.sprm;

import java.util.Arrays;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;

@Internal
/* loaded from: classes3.dex */
public final class SprmBuffer implements Cloneable {
    byte[] _buf;
    boolean _istd;
    int _offset;
    private final int _sprmsStartOffset;

    @Deprecated
    public SprmBuffer() {
        this(0);
    }

    private void ensureCapacity(int i10) {
        int i11 = this._offset;
        int i12 = i11 + i10;
        byte[] bArr = this._buf;
        if (i12 >= bArr.length) {
            byte[] bArr2 = new byte[i11 + i10];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this._buf = bArr2;
        }
    }

    private int findSprmOffset(short s4) {
        SprmOperation findSprm = findSprm(s4);
        if (findSprm == null) {
            return -1;
        }
        return findSprm.getGrpprlOffset();
    }

    public void addSprm(short s4, byte b10) {
        ensureCapacity(3);
        LittleEndian.putShort(this._buf, this._offset, s4);
        int i10 = this._offset + 2;
        byte[] bArr = this._buf;
        this._offset = i10 + 1;
        bArr[i10] = b10;
    }

    public void append(byte[] bArr) {
        append(bArr, 0);
    }

    public Object clone() {
        SprmBuffer sprmBuffer = (SprmBuffer) super.clone();
        byte[] bArr = new byte[this._buf.length];
        sprmBuffer._buf = bArr;
        byte[] bArr2 = this._buf;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        return sprmBuffer;
    }

    public boolean equals(Object obj) {
        return Arrays.equals(this._buf, ((SprmBuffer) obj)._buf);
    }

    public SprmOperation findSprm(short s4) {
        int operationFromOpcode = SprmOperation.getOperationFromOpcode(s4);
        int typeFromOpcode = SprmOperation.getTypeFromOpcode(s4);
        SprmIterator sprmIterator = new SprmIterator(this._buf, 2);
        while (sprmIterator.hasNext()) {
            SprmOperation next = sprmIterator.next();
            if (next.getOperation() == operationFromOpcode && next.getType() == typeFromOpcode) {
                return next;
            }
        }
        return null;
    }

    public SprmIterator iterator() {
        return new SprmIterator(this._buf, this._sprmsStartOffset);
    }

    public byte[] toByteArray() {
        return this._buf;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Sprms (");
        sb2.append(this._buf.length);
        sb2.append(" byte(s)): ");
        SprmIterator it = iterator();
        while (it.hasNext()) {
            try {
                sb2.append(it.next());
            } catch (Exception unused) {
                sb2.append("error");
            }
            sb2.append("; ");
        }
        return sb2.toString();
    }

    public void updateSprm(short s4, byte b10) {
        int findSprmOffset = findSprmOffset(s4);
        if (findSprmOffset != -1) {
            this._buf[findSprmOffset] = b10;
        } else {
            addSprm(s4, b10);
        }
    }

    @Deprecated
    public SprmBuffer(byte[] bArr) {
        this(bArr, 0);
    }

    public void append(byte[] bArr, int i10) {
        ensureCapacity(bArr.length - i10);
        System.arraycopy(bArr, i10, this._buf, this._offset, bArr.length - i10);
        this._offset = (bArr.length - i10) + this._offset;
    }

    @Deprecated
    public SprmBuffer(byte[] bArr, boolean z10) {
        this(bArr, z10, 0);
    }

    public SprmBuffer(byte[] bArr, boolean z10, int i10) {
        this._offset = bArr.length;
        this._buf = bArr;
        this._istd = z10;
        this._sprmsStartOffset = i10;
    }

    public void updateSprm(short s4, boolean z10) {
        int findSprmOffset = findSprmOffset(s4);
        if (findSprmOffset != -1) {
            this._buf[findSprmOffset] = z10 ? (byte) 1 : (byte) 0;
        } else {
            addSprm(s4, z10 ? 1 : 0);
        }
    }

    public void addSprm(short s4, byte[] bArr) {
        ensureCapacity(bArr.length + 3);
        LittleEndian.putShort(this._buf, this._offset, s4);
        int i10 = this._offset + 2;
        byte[] bArr2 = this._buf;
        int i11 = i10 + 1;
        this._offset = i11;
        bArr2[i10] = (byte) bArr.length;
        System.arraycopy(bArr, 0, bArr2, i11, bArr.length);
    }

    public void updateSprm(short s4, int i10) {
        int findSprmOffset = findSprmOffset(s4);
        if (findSprmOffset != -1) {
            LittleEndian.putInt(this._buf, findSprmOffset, i10);
        } else {
            addSprm(s4, i10);
        }
    }

    public SprmBuffer(byte[] bArr, int i10) {
        this(bArr, false, i10);
    }

    public SprmBuffer(int i10) {
        this._buf = new byte[i10 + 4];
        this._offset = i10;
        this._sprmsStartOffset = i10;
    }

    public void updateSprm(short s4, short s10) {
        int findSprmOffset = findSprmOffset(s4);
        if (findSprmOffset != -1) {
            LittleEndian.putShort(this._buf, findSprmOffset, s10);
        } else {
            addSprm(s4, s10);
        }
    }

    public void addSprm(short s4, int i10) {
        ensureCapacity(6);
        LittleEndian.putShort(this._buf, this._offset, s4);
        int i11 = this._offset + 2;
        this._offset = i11;
        LittleEndian.putInt(this._buf, i11, i10);
        this._offset += 4;
    }

    public void addSprm(short s4, short s10) {
        ensureCapacity(4);
        LittleEndian.putShort(this._buf, this._offset, s4);
        int i10 = this._offset + 2;
        this._offset = i10;
        LittleEndian.putShort(this._buf, i10, s10);
        this._offset += 2;
    }
}
