package lib.zj.office.fc.hssf.formula;

import java.util.Arrays;
import lib.zj.office.fc.hssf.formula.ptg.Ptg;
import lib.zj.office.fc.ss.util.CellReference;
import lib.zj.office.fc.util.LittleEndian;
import lib.zj.office.fc.util.LittleEndianByteArrayInputStream;
import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public class Formula {
    private static final Formula EMPTY = new Formula(new byte[0], 0);
    private final byte[] _byteEncoding;
    private final int _encodedTokenLen;

    private Formula(byte[] bArr, int i10) {
        this._byteEncoding = bArr;
        this._encodedTokenLen = i10;
    }

    public static Formula create(Ptg[] ptgArr) {
        if (ptgArr != null && ptgArr.length >= 1) {
            byte[] bArr = new byte[Ptg.getEncodedSize(ptgArr)];
            Ptg.serializePtgs(ptgArr, bArr, 0);
            return new Formula(bArr, Ptg.getEncodedSizeWithoutArrayData(ptgArr));
        }
        return EMPTY;
    }

    public static Formula read(int i10, LittleEndianInput littleEndianInput) {
        return read(i10, littleEndianInput, i10);
    }

    public int getEncodedSize() {
        return this._byteEncoding.length + 2;
    }

    public int getEncodedTokenSize() {
        return this._encodedTokenLen;
    }

    public CellReference getExpReference() {
        byte[] bArr = this._byteEncoding;
        if (bArr.length != 5) {
            return null;
        }
        byte b10 = bArr[0];
        if (b10 != 1 && b10 != 2) {
            return null;
        }
        return new CellReference(LittleEndian.getUShort(bArr, 1), LittleEndian.getUShort(bArr, 3));
    }

    public Ptg[] getTokens() {
        return Ptg.readTokens(this._encodedTokenLen, new LittleEndianByteArrayInputStream(this._byteEncoding));
    }

    public boolean isSame(Formula formula) {
        return Arrays.equals(this._byteEncoding, formula._byteEncoding);
    }

    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this._encodedTokenLen);
        littleEndianOutput.write(this._byteEncoding);
    }

    public void serializeArrayConstantData(LittleEndianOutput littleEndianOutput) {
        byte[] bArr = this._byteEncoding;
        int length = bArr.length;
        int i10 = this._encodedTokenLen;
        littleEndianOutput.write(bArr, i10, length - i10);
    }

    public void serializeTokens(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.write(this._byteEncoding, 0, this._encodedTokenLen);
    }

    public static Formula read(int i10, LittleEndianInput littleEndianInput, int i11) {
        byte[] bArr = new byte[i11];
        littleEndianInput.readFully(bArr);
        return new Formula(bArr, i10);
    }

    public static Ptg[] getTokens(Formula formula) {
        if (formula == null) {
            return null;
        }
        return formula.getTokens();
    }

    public Formula copy() {
        return this;
    }
}
