package lib.zj.office.fc.ddf;

import androidx.appcompat.view.menu.d;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class EscherArrayProperty extends EscherComplexProperty {
    private static final int FIXED_SIZE = 6;
    private boolean emptyComplexPart;
    private boolean sizeIncludesHeaderSize;

    public EscherArrayProperty(short s4, byte[] bArr) {
        super(s4, checkComplexData(bArr));
        this.sizeIncludesHeaderSize = true;
        this.emptyComplexPart = false;
        this.emptyComplexPart = bArr.length == 0;
    }

    private static byte[] checkComplexData(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            return bArr;
        }
        return new byte[6];
    }

    public static int getActualSizeOfElements(short s4) {
        if (s4 < 0) {
            return (short) ((-s4) >> 2);
        }
        return s4;
    }

    public byte[] getElement(int i10) {
        int actualSizeOfElements = getActualSizeOfElements(getSizeOfElements());
        byte[] bArr = new byte[actualSizeOfElements];
        int i11 = (i10 * actualSizeOfElements) + 6;
        int i12 = i11 + actualSizeOfElements;
        byte[] bArr2 = this._complexData;
        if (i12 <= bArr2.length) {
            System.arraycopy(bArr2, i11, bArr, 0, actualSizeOfElements);
        }
        return bArr;
    }

    public int getNumberOfElementsInArray() {
        byte[] checkComplexData = checkComplexData(this._complexData);
        this._complexData = checkComplexData;
        return LittleEndian.getUShort(checkComplexData, 0);
    }

    public int getNumberOfElementsInMemory() {
        byte[] checkComplexData = checkComplexData(this._complexData);
        this._complexData = checkComplexData;
        return LittleEndian.getUShort(checkComplexData, 2);
    }

    public short getSizeOfElements() {
        byte[] checkComplexData = checkComplexData(this._complexData);
        this._complexData = checkComplexData;
        return LittleEndian.getShort(checkComplexData, 4);
    }

    @Override // lib.zj.office.fc.ddf.EscherComplexProperty, lib.zj.office.fc.ddf.EscherProperty
    public int serializeSimplePart(byte[] bArr, int i10) {
        LittleEndian.putShort(bArr, i10, getId());
        int length = this._complexData.length;
        if (!this.sizeIncludesHeaderSize) {
            length -= 6;
        }
        LittleEndian.putInt(bArr, i10 + 2, length);
        return 6;
    }

    public int setArrayData(byte[] bArr, int i10) {
        if (this.emptyComplexPart) {
            this._complexData = new byte[0];
        } else {
            short s4 = LittleEndian.getShort(bArr, i10);
            LittleEndian.getShort(bArr, i10 + 2);
            int actualSizeOfElements = getActualSizeOfElements(LittleEndian.getShort(bArr, i10 + 4)) * s4;
            if (actualSizeOfElements == this._complexData.length) {
                this._complexData = new byte[actualSizeOfElements + 6];
                this.sizeIncludesHeaderSize = false;
            }
            byte[] bArr2 = this._complexData;
            System.arraycopy(bArr, i10, bArr2, 0, bArr2.length);
        }
        return this._complexData.length;
    }

    public void setElement(int i10, byte[] bArr) {
        int actualSizeOfElements = getActualSizeOfElements(getSizeOfElements());
        System.arraycopy(bArr, 0, this._complexData, (i10 * actualSizeOfElements) + 6, actualSizeOfElements);
    }

    public void setNumberOfElementsInArray(int i10) {
        int actualSizeOfElements = (getActualSizeOfElements(getSizeOfElements()) * i10) + 6;
        byte[] bArr = this._complexData;
        if (actualSizeOfElements != bArr.length) {
            byte[] bArr2 = new byte[actualSizeOfElements];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this._complexData = bArr2;
        }
        LittleEndian.putShort(this._complexData, 0, (short) i10);
    }

    public void setNumberOfElementsInMemory(int i10) {
        int actualSizeOfElements = (getActualSizeOfElements(getSizeOfElements()) * i10) + 6;
        byte[] bArr = this._complexData;
        if (actualSizeOfElements != bArr.length) {
            byte[] bArr2 = new byte[actualSizeOfElements];
            System.arraycopy(bArr, 0, bArr2, 0, actualSizeOfElements);
            this._complexData = bArr2;
        }
        LittleEndian.putShort(this._complexData, 2, (short) i10);
    }

    public void setSizeOfElements(int i10) {
        LittleEndian.putShort(this._complexData, 4, (short) i10);
        int actualSizeOfElements = (getActualSizeOfElements(getSizeOfElements()) * getNumberOfElementsInArray()) + 6;
        byte[] bArr = this._complexData;
        if (actualSizeOfElements != bArr.length) {
            byte[] bArr2 = new byte[actualSizeOfElements];
            System.arraycopy(bArr, 0, bArr2, 0, 6);
            this._complexData = bArr2;
        }
    }

    @Override // lib.zj.office.fc.ddf.EscherComplexProperty
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("    {EscherArrayProperty:\n");
        stringBuffer.append("     Num Elements: " + getNumberOfElementsInArray() + '\n');
        stringBuffer.append("     Num Elements In Memory: " + getNumberOfElementsInMemory() + '\n');
        stringBuffer.append("     Size of elements: " + ((int) getSizeOfElements()) + '\n');
        for (int i10 = 0; i10 < getNumberOfElementsInArray(); i10++) {
            StringBuilder e10 = d.e("     Element ", i10, ": ");
            e10.append(HexDump.toHex(getElement(i10)));
            e10.append('\n');
            stringBuffer.append(e10.toString());
        }
        stringBuffer.append("}\n");
        return "propNum: " + ((int) getPropertyNumber()) + ", propName: " + EscherProperties.getPropertyName(getPropertyNumber()) + ", complex: " + isComplex() + ", blipId: " + isBlipId() + ", data: \n" + stringBuffer.toString();
    }

    public EscherArrayProperty(short s4, boolean z10, byte[] bArr) {
        super(s4, z10, checkComplexData(bArr));
        this.sizeIncludesHeaderSize = true;
        this.emptyComplexPart = false;
    }
}
