package lib.zj.office.fc.hssf.formula.ptg;

import androidx.activity.r;
import androidx.appcompat.view.menu.d;
import com.google.android.play.core.assetpacks.b1;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.lang.reflect.Array;
import lib.zj.office.fc.ss.util.NumberToTextConverter;
import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;
import nh.a;

/* loaded from: classes3.dex */
public final class ArrayPtg extends Ptg {
    public static final int PLAIN_TOKEN_SIZE = 8;
    private static final int RESERVED_FIELD_LEN = 7;
    public static final byte sid = 32;
    private final Object[] _arrayValues;
    private final int _nColumns;
    private final int _nRows;
    private final int _reserved0Int;
    private final int _reserved1Short;
    private final int _reserved2Byte;

    /* loaded from: classes3.dex */
    public static final class Initial extends Ptg {
        private final int _reserved0;
        private final int _reserved1;
        private final int _reserved2;

        public Initial(LittleEndianInput littleEndianInput) {
            this._reserved0 = littleEndianInput.readInt();
            this._reserved1 = littleEndianInput.readUShort();
            this._reserved2 = littleEndianInput.readUByte();
        }

        private static RuntimeException invalid() {
            throw new IllegalStateException("This object is a partially initialised tArray, and cannot be used as a Ptg");
        }

        public ArrayPtg finishReading(LittleEndianInput littleEndianInput) {
            int readUByte = littleEndianInput.readUByte() + 1;
            short readShort = (short) (littleEndianInput.readShort() + 1);
            ArrayPtg arrayPtg = new ArrayPtg(this._reserved0, this._reserved1, this._reserved2, readUByte, readShort, b1.U(littleEndianInput, readShort * readUByte));
            arrayPtg.setClass(getPtgClass());
            return arrayPtg;
        }

        @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
        public byte getDefaultOperandClass() {
            throw invalid();
        }

        @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
        public int getSize() {
            return 8;
        }

        @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
        public boolean isBaseToken() {
            return false;
        }

        @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
        public String toFormulaString() {
            throw invalid();
        }

        @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
        public void write(LittleEndianOutput littleEndianOutput) {
            throw invalid();
        }
    }

    public ArrayPtg(int i10, int i11, int i12, int i13, int i14, Object[] objArr) {
        this._reserved0Int = i10;
        this._reserved1Short = i11;
        this._reserved2Byte = i12;
        this._nColumns = i13;
        this._nRows = i14;
        this._arrayValues = objArr;
    }

    private static String getConstantText(Object obj) {
        if (obj != null) {
            if (obj instanceof String) {
                return r.g(new StringBuilder(OperatorName.SHOW_TEXT_LINE_AND_SPACE), (String) obj, OperatorName.SHOW_TEXT_LINE_AND_SPACE);
            }
            if (obj instanceof Double) {
                return NumberToTextConverter.toText(((Double) obj).doubleValue());
            }
            if (obj instanceof Boolean) {
                if (((Boolean) obj).booleanValue()) {
                    return "TRUE";
                }
                return "FALSE";
            } else if (obj instanceof a) {
                return ((a) obj).a();
            } else {
                throw new IllegalArgumentException("Unexpected constant class (" + obj.getClass().getName() + ")");
            }
        }
        throw new RuntimeException("Array item cannot be null");
    }

    public int getColumnCount() {
        return this._nColumns;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public byte getDefaultOperandClass() {
        return (byte) 64;
    }

    public int getRowCount() {
        return this._nRows;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public int getSize() {
        return b1.A(this._arrayValues) + 11;
    }

    public Object[][] getTokenArrayValues() {
        if (this._arrayValues != null) {
            Object[][] objArr = (Object[][]) Array.newInstance(Object.class, this._nRows, this._nColumns);
            for (int i10 = 0; i10 < this._nRows; i10++) {
                Object[] objArr2 = objArr[i10];
                for (int i11 = 0; i11 < this._nColumns; i11++) {
                    objArr2[i11] = this._arrayValues[getValueIndex(i11, i10)];
                }
            }
            return objArr;
        }
        throw new IllegalStateException("array values not read yet");
    }

    public int getValueIndex(int i10, int i11) {
        int i12;
        if (i10 >= 0 && i10 < (i12 = this._nColumns)) {
            if (i11 >= 0 && i11 < this._nRows) {
                return (i11 * i12) + i10;
            }
            StringBuilder e10 = d.e("Specified rowIx (", i11, ") is outside the allowed range (0..");
            e10.append(this._nRows - 1);
            e10.append(")");
            throw new IllegalArgumentException(e10.toString());
        }
        StringBuilder e11 = d.e("Specified colIx (", i10, ") is outside the allowed range (0..");
        e11.append(this._nColumns - 1);
        e11.append(")");
        throw new IllegalArgumentException(e11.toString());
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public boolean isBaseToken() {
        return false;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public String toFormulaString() {
        StringBuffer stringBuffer = new StringBuffer("{");
        for (int i10 = 0; i10 < getRowCount(); i10++) {
            if (i10 > 0) {
                stringBuffer.append(";");
            }
            for (int i11 = 0; i11 < getColumnCount(); i11++) {
                if (i11 > 0) {
                    stringBuffer.append(",");
                }
                stringBuffer.append(getConstantText(this._arrayValues[getValueIndex(i11, i10)]));
            }
        }
        stringBuffer.append("}");
        return stringBuffer.toString();
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[ArrayPtg]\nnRows = ");
        stringBuffer.append(getRowCount());
        stringBuffer.append("\nnCols = ");
        stringBuffer.append(getColumnCount());
        stringBuffer.append("\n");
        if (this._arrayValues == null) {
            stringBuffer.append("  #values#uninitialised#\n");
        } else {
            stringBuffer.append("  ");
            stringBuffer.append(toFormulaString());
        }
        return stringBuffer.toString();
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public void write(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeByte(getPtgClass() + 32);
        littleEndianOutput.writeInt(this._reserved0Int);
        littleEndianOutput.writeShort(this._reserved1Short);
        littleEndianOutput.writeByte(this._reserved2Byte);
    }

    public int writeTokenValueBytes(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeByte(this._nColumns - 1);
        littleEndianOutput.writeShort(this._nRows - 1);
        b1.u(littleEndianOutput, this._arrayValues);
        return b1.A(this._arrayValues) + 3;
    }

    public ArrayPtg(Object[][] objArr) {
        int length = objArr[0].length;
        int length2 = objArr.length;
        short s4 = (short) length;
        this._nColumns = s4;
        short s10 = (short) length2;
        this._nRows = s10;
        Object[] objArr2 = new Object[s4 * s10];
        for (int i10 = 0; i10 < length2; i10++) {
            Object[] objArr3 = objArr[i10];
            for (int i11 = 0; i11 < length; i11++) {
                objArr2[getValueIndex(i11, i10)] = objArr3[i11];
            }
        }
        this._arrayValues = objArr2;
        this._reserved0Int = 0;
        this._reserved1Short = 0;
        this._reserved2Byte = 0;
    }
}
