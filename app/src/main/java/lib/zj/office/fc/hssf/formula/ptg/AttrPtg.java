package lib.zj.office.fc.hssf.formula.ptg;

import androidx.activity.r;
import lib.zj.office.fc.hpsf.Variant;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class AttrPtg extends ControlPtg {
    private static final int SIZE = 4;
    public static final byte sid = 25;
    private final int _chooseFuncOffset;
    private final short _data;
    private final int[] _jumpTable;
    private final byte _options;
    private static final BitField semiVolatile = BitFieldFactory.getInstance(1);
    private static final BitField optiIf = BitFieldFactory.getInstance(2);
    private static final BitField optiChoose = BitFieldFactory.getInstance(4);
    private static final BitField optiSkip = BitFieldFactory.getInstance(8);
    private static final BitField optiSum = BitFieldFactory.getInstance(16);
    private static final BitField baxcel = BitFieldFactory.getInstance(32);
    private static final BitField space = BitFieldFactory.getInstance(64);
    public static final AttrPtg SUM = new AttrPtg(16, 0, null, -1);

    /* loaded from: classes3.dex */
    public static final class SpaceType {
        public static final int CR_BEFORE = 1;
        public static final int CR_BEFORE_CLOSE_PAREN = 5;
        public static final int CR_BEFORE_OPEN_PAREN = 3;
        public static final int SPACE_AFTER_EQUALITY = 6;
        public static final int SPACE_BEFORE = 0;
        public static final int SPACE_BEFORE_CLOSE_PAREN = 4;
        public static final int SPACE_BEFORE_OPEN_PAREN = 2;

        private SpaceType() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AttrPtg(LittleEndianInput littleEndianInput) {
        this._options = littleEndianInput.readByte();
        int readShort = littleEndianInput.readShort();
        this._data = readShort;
        if (isOptimizedChoose()) {
            int[] iArr = new int[readShort];
            for (int i10 = 0; i10 < readShort; i10++) {
                iArr[i10] = littleEndianInput.readUShort();
            }
            this._jumpTable = iArr;
            this._chooseFuncOffset = littleEndianInput.readUShort();
            return;
        }
        this._jumpTable = null;
        this._chooseFuncOffset = -1;
    }

    public static AttrPtg createIf(int i10) {
        return new AttrPtg(optiIf.set(0), i10, null, -1);
    }

    public static AttrPtg createSkip(int i10) {
        return new AttrPtg(optiSkip.set(0), i10, null, -1);
    }

    public static AttrPtg createSpace(int i10, int i11) {
        return new AttrPtg(space.set(0), (i10 & FunctionEval.FunctionID.EXTERNAL_FUNC) | ((i11 << 8) & Variant.VT_ILLEGAL), null, -1);
    }

    public static AttrPtg getSumSingle() {
        return new AttrPtg(optiSum.set(0), 0, null, -1);
    }

    private boolean isBaxcel() {
        return baxcel.isSet(this._options);
    }

    public int getChooseFuncOffset() {
        if (this._jumpTable != null) {
            return this._chooseFuncOffset;
        }
        throw new IllegalStateException("Not tAttrChoose");
    }

    public short getData() {
        return this._data;
    }

    public int[] getJumpTable() {
        return (int[]) this._jumpTable.clone();
    }

    public int getNumberOfOperands() {
        return 1;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public int getSize() {
        int[] iArr = this._jumpTable;
        if (iArr == null) {
            return 4;
        }
        return ((iArr.length + 1) * 2) + 4;
    }

    public int getType() {
        return -1;
    }

    public boolean isOptimizedChoose() {
        return optiChoose.isSet(this._options);
    }

    public boolean isOptimizedIf() {
        return optiIf.isSet(this._options);
    }

    public boolean isSemiVolatile() {
        return semiVolatile.isSet(this._options);
    }

    public boolean isSkip() {
        return optiSkip.isSet(this._options);
    }

    public boolean isSpace() {
        return space.isSet(this._options);
    }

    public boolean isSum() {
        return optiSum.isSet(this._options);
    }

    public String toFormulaString(String[] strArr) {
        if (space.isSet(this._options)) {
            return strArr[0];
        }
        if (optiIf.isSet(this._options)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(toFormulaString());
            sb2.append("(");
            return r.g(sb2, strArr[0], ")");
        } else if (optiSkip.isSet(this._options)) {
            return toFormulaString() + strArr[0];
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(toFormulaString());
            sb3.append("(");
            return r.g(sb3, strArr[0], ")");
        }
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(64);
        stringBuffer.append(AttrPtg.class.getName());
        stringBuffer.append(" [");
        if (isSemiVolatile()) {
            stringBuffer.append("volatile ");
        }
        if (isSpace()) {
            stringBuffer.append("space count=");
            stringBuffer.append((this._data >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC);
            stringBuffer.append(" type=");
            stringBuffer.append(this._data & 255);
            stringBuffer.append(" ");
        }
        if (isOptimizedIf()) {
            stringBuffer.append("if dist=");
            stringBuffer.append((int) this._data);
        } else if (isOptimizedChoose()) {
            stringBuffer.append("choose nCases=");
            stringBuffer.append((int) this._data);
        } else if (isSkip()) {
            stringBuffer.append("skip dist=");
            stringBuffer.append((int) this._data);
        } else if (isSum()) {
            stringBuffer.append("sum ");
        } else if (isBaxcel()) {
            stringBuffer.append("assign ");
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public void write(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeByte(getPtgClass() + 25);
        littleEndianOutput.writeByte(this._options);
        littleEndianOutput.writeShort(this._data);
        int[] iArr = this._jumpTable;
        if (iArr != null) {
            for (int i10 : iArr) {
                littleEndianOutput.writeShort(i10);
            }
            littleEndianOutput.writeShort(this._chooseFuncOffset);
        }
    }

    private AttrPtg(int i10, int i11, int[] iArr, int i12) {
        this._options = (byte) i10;
        this._data = (short) i11;
        this._jumpTable = iArr;
        this._chooseFuncOffset = i12;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public String toFormulaString() {
        return semiVolatile.isSet(this._options) ? "ATTR(semiVolatile)" : optiIf.isSet(this._options) ? "IF" : optiChoose.isSet(this._options) ? "CHOOSE" : optiSkip.isSet(this._options) ? "" : optiSum.isSet(this._options) ? "SUM" : baxcel.isSet(this._options) ? "ATTR(baxcel)" : space.isSet(this._options) ? "" : "UNKNOWN ATTRIBUTE";
    }
}
