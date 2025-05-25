package lib.zj.office.fc.hwpf.usermodel;

import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class BorderCode implements Cloneable {
    public static final int SIZE = 4;
    private short _info;
    private short _info2;
    private static final BitField _dptLineWidth = BitFieldFactory.getInstance(FunctionEval.FunctionID.EXTERNAL_FUNC);
    private static final BitField _brcType = BitFieldFactory.getInstance(65280);
    private static final BitField _ico = BitFieldFactory.getInstance(FunctionEval.FunctionID.EXTERNAL_FUNC);
    private static final BitField _dptSpace = BitFieldFactory.getInstance(7936);
    private static final BitField _fShadow = BitFieldFactory.getInstance(8192);
    private static final BitField _fFrame = BitFieldFactory.getInstance(16384);

    public BorderCode() {
    }

    public Object clone() {
        return super.clone();
    }

    public boolean equals(Object obj) {
        BorderCode borderCode = (BorderCode) obj;
        if (this._info == borderCode._info && this._info2 == borderCode._info2) {
            return true;
        }
        return false;
    }

    public int getBorderType() {
        return _brcType.getShortValue(this._info);
    }

    public short getColor() {
        return _ico.getShortValue(this._info2);
    }

    public int getLineWidth() {
        return _dptLineWidth.getShortValue(this._info);
    }

    public int getSpace() {
        return _dptSpace.getShortValue(this._info2);
    }

    public boolean isEmpty() {
        if (this._info == 0 && this._info2 == 0) {
            return true;
        }
        return false;
    }

    public boolean isFrame() {
        if (_fFrame.getValue(this._info2) != 0) {
            return true;
        }
        return false;
    }

    public boolean isShadow() {
        if (_fShadow.getValue(this._info2) != 0) {
            return true;
        }
        return false;
    }

    public void serialize(byte[] bArr, int i10) {
        LittleEndian.putShort(bArr, i10, this._info);
        LittleEndian.putShort(bArr, i10 + 2, this._info2);
    }

    public void setBorderType(int i10) {
        _brcType.setValue(this._info, i10);
    }

    public void setColor(short s4) {
        _ico.setValue(this._info2, s4);
    }

    public void setFrame(boolean z10) {
        _fFrame.setValue(this._info2, z10 ? 1 : 0);
    }

    public void setLineWidth(int i10) {
        _dptLineWidth.setValue(this._info, i10);
    }

    public void setShadow(boolean z10) {
        _fShadow.setValue(this._info2, z10 ? 1 : 0);
    }

    public void setSpace(int i10) {
        _dptSpace.setValue(this._info2, i10);
    }

    public int toInt() {
        byte[] bArr = new byte[4];
        serialize(bArr, 0);
        return LittleEndian.getInt(bArr);
    }

    public String toString() {
        if (isEmpty()) {
            return "[BRC] EMPTY";
        }
        StringBuffer stringBuffer = new StringBuffer("[BRC]\n        .dptLineWidth         =  (");
        stringBuffer.append(getLineWidth());
        stringBuffer.append(" )\n        .brcType              =  (");
        stringBuffer.append(getBorderType());
        stringBuffer.append(" )\n        .ico                  =  (");
        stringBuffer.append((int) getColor());
        stringBuffer.append(" )\n        .dptSpace             =  (");
        stringBuffer.append(getSpace());
        stringBuffer.append(" )\n        .fShadow              =  (");
        stringBuffer.append(isShadow());
        stringBuffer.append(" )\n        .fFrame               =  (");
        stringBuffer.append(isFrame());
        stringBuffer.append(" )\n");
        return stringBuffer.toString();
    }

    public BorderCode(byte[] bArr, int i10) {
        this._info = LittleEndian.getShort(bArr, i10);
        this._info2 = LittleEndian.getShort(bArr, i10 + 2);
    }
}
