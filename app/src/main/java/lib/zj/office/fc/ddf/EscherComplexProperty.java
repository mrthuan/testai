package lib.zj.office.fc.ddf;

import java.util.Arrays;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public class EscherComplexProperty extends EscherProperty {
    protected byte[] _complexData;

    public EscherComplexProperty(short s4, byte[] bArr) {
        super(s4);
        this._complexData = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof EscherComplexProperty) && Arrays.equals(this._complexData, ((EscherComplexProperty) obj)._complexData)) {
            return true;
        }
        return false;
    }

    public byte[] getComplexData() {
        return this._complexData;
    }

    @Override // lib.zj.office.fc.ddf.EscherProperty
    public int getPropertySize() {
        return this._complexData.length + 6;
    }

    public int hashCode() {
        return getId() * 11;
    }

    @Override // lib.zj.office.fc.ddf.EscherProperty
    public int serializeComplexPart(byte[] bArr, int i10) {
        byte[] bArr2 = this._complexData;
        System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
        return this._complexData.length;
    }

    @Override // lib.zj.office.fc.ddf.EscherProperty
    public int serializeSimplePart(byte[] bArr, int i10) {
        LittleEndian.putShort(bArr, i10, getId());
        LittleEndian.putInt(bArr, i10 + 2, this._complexData.length);
        return 6;
    }

    public String toString() {
        String hex = HexDump.toHex(this._complexData, 32);
        return "propNum: " + ((int) getPropertyNumber()) + ", propName: " + EscherProperties.getPropertyName(getPropertyNumber()) + ", complex: " + isComplex() + ", blipId: " + isBlipId() + ", data: " + System.getProperty("line.separator") + hex;
    }

    public EscherComplexProperty(short s4, boolean z10, byte[] bArr) {
        super(s4, true, z10);
        this._complexData = bArr;
    }
}
