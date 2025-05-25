package lib.zj.office.fc.hssf.formula.ptg;

import a0.a;
import a6.h;
import java.util.ArrayList;
import java.util.List;
import lib.zj.office.fc.hssf.formula.ptg.ArrayPtg;
import lib.zj.office.fc.util.LittleEndianByteArrayOutputStream;
import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public abstract class Ptg {
    public static final byte CLASS_ARRAY = 64;
    public static final byte CLASS_REF = 0;
    public static final byte CLASS_VALUE = 32;
    public static final Ptg[] EMPTY_PTG_ARRAY = new Ptg[0];
    private byte ptgClass = 0;

    private static Ptg createBasePtg(byte b10, LittleEndianInput littleEndianInput) {
        switch (b10) {
            case 0:
                return new UnknownPtg(b10);
            case 1:
                return new ExpPtg(littleEndianInput);
            case 2:
                return new TblPtg(littleEndianInput);
            case 3:
                return AddPtg.instance;
            case 4:
                return SubtractPtg.instance;
            case 5:
                return MultiplyPtg.instance;
            case 6:
                return DividePtg.instance;
            case 7:
                return PowerPtg.instance;
            case 8:
                return ConcatPtg.instance;
            case 9:
                return LessThanPtg.instance;
            case 10:
                return LessEqualPtg.instance;
            case 11:
                return EqualPtg.instance;
            case 12:
                return GreaterEqualPtg.instance;
            case 13:
                return GreaterThanPtg.instance;
            case 14:
                return NotEqualPtg.instance;
            case 15:
                return IntersectionPtg.instance;
            case 16:
                return UnionPtg.instance;
            case 17:
                return RangePtg.instance;
            case 18:
                return UnaryPlusPtg.instance;
            case 19:
                return UnaryMinusPtg.instance;
            case 20:
                return PercentPtg.instance;
            case 21:
                return ParenthesisPtg.instance;
            case 22:
                return MissingArgPtg.instance;
            case 23:
                return new StringPtg(littleEndianInput);
            case 24:
            case 26:
            case 27:
            default:
                throw new RuntimeException(a.g("Unexpected base token id (", b10, ")"));
            case 25:
                return new AttrPtg(littleEndianInput);
            case 28:
                return ErrPtg.read(littleEndianInput);
            case 29:
                return BoolPtg.read(littleEndianInput);
            case 30:
                return new IntPtg(littleEndianInput);
            case 31:
                return new NumberPtg(littleEndianInput);
        }
    }

    private static Ptg createClassifiedPtg(byte b10, LittleEndianInput littleEndianInput) {
        int i10 = (b10 & 31) | 32;
        switch (i10) {
            case 32:
                return new ArrayPtg.Initial(littleEndianInput);
            case 33:
                return FuncPtg.create(littleEndianInput);
            case 34:
                return FuncVarPtg.create(littleEndianInput);
            case 35:
                return new NamePtg(littleEndianInput);
            case 36:
                return new RefPtg(littleEndianInput);
            case 37:
                return new AreaPtg(littleEndianInput);
            case 38:
                return new MemAreaPtg(littleEndianInput);
            case 39:
                return new MemErrPtg(littleEndianInput);
            default:
                switch (i10) {
                    case 41:
                        return new MemFuncPtg(littleEndianInput);
                    case 42:
                        return new RefErrorPtg(littleEndianInput);
                    case 43:
                        return new AreaErrPtg(littleEndianInput);
                    case 44:
                        return new RefNPtg(littleEndianInput);
                    case 45:
                        return new AreaNPtg(littleEndianInput);
                    default:
                        switch (i10) {
                            case 57:
                                return new NameXPtg(littleEndianInput);
                            case 58:
                                return new Ref3DPtg(littleEndianInput);
                            case 59:
                                return new Area3DPtg(littleEndianInput);
                            case 60:
                                return new DeletedRef3DPtg(littleEndianInput);
                            case 61:
                                return new DeletedArea3DPtg(littleEndianInput);
                            default:
                                throw new UnsupportedOperationException(" Unknown Ptg in Formula: 0x" + Integer.toHexString(b10) + " (" + ((int) b10) + ")");
                        }
                }
        }
    }

    public static Ptg createPtg(LittleEndianInput littleEndianInput) {
        byte readByte = littleEndianInput.readByte();
        if (readByte < 32) {
            return createBasePtg(readByte, littleEndianInput);
        }
        Ptg createClassifiedPtg = createClassifiedPtg(readByte, littleEndianInput);
        if (readByte >= 96) {
            createClassifiedPtg.setClass((byte) 64);
        } else if (readByte >= 64) {
            createClassifiedPtg.setClass((byte) 32);
        } else {
            createClassifiedPtg.setClass((byte) 0);
        }
        return createClassifiedPtg;
    }

    public static boolean doesFormulaReferToDeletedCell(Ptg[] ptgArr) {
        for (Ptg ptg : ptgArr) {
            if (isDeletedCellRef(ptg)) {
                return true;
            }
        }
        return false;
    }

    public static int getEncodedSize(Ptg[] ptgArr) {
        int i10 = 0;
        for (Ptg ptg : ptgArr) {
            i10 += ptg.getSize();
        }
        return i10;
    }

    public static int getEncodedSizeWithoutArrayData(Ptg[] ptgArr) {
        int i10 = 0;
        for (Ptg ptg : ptgArr) {
            if (ptg instanceof ArrayPtg) {
                i10 += 8;
            } else {
                i10 = ptg.getSize() + i10;
            }
        }
        return i10;
    }

    private static boolean isDeletedCellRef(Ptg ptg) {
        if (ptg == ErrPtg.REF_INVALID || (ptg instanceof DeletedArea3DPtg) || (ptg instanceof DeletedRef3DPtg) || (ptg instanceof AreaErrPtg) || (ptg instanceof RefErrorPtg)) {
            return true;
        }
        return false;
    }

    public static Ptg[] readTokens(int i10, LittleEndianInput littleEndianInput) {
        ArrayList arrayList = new ArrayList((i10 / 2) + 4);
        int i11 = 0;
        boolean z10 = false;
        while (i11 < i10) {
            Ptg createPtg = createPtg(littleEndianInput);
            if (createPtg instanceof ArrayPtg.Initial) {
                z10 = true;
            }
            i11 += createPtg.getSize();
            arrayList.add(createPtg);
        }
        if (i11 == i10) {
            if (z10) {
                Ptg[] ptgArray = toPtgArray(arrayList);
                for (int i12 = 0; i12 < ptgArray.length; i12++) {
                    Ptg ptg = ptgArray[i12];
                    if (ptg instanceof ArrayPtg.Initial) {
                        ptgArray[i12] = ((ArrayPtg.Initial) ptg).finishReading(littleEndianInput);
                    }
                }
                return ptgArray;
            }
            return toPtgArray(arrayList);
        }
        throw new RuntimeException("Ptg array size mismatch");
    }

    public static int serializePtgs(Ptg[] ptgArr, byte[] bArr, int i10) {
        LittleEndianByteArrayOutputStream littleEndianByteArrayOutputStream = new LittleEndianByteArrayOutputStream(bArr, i10);
        ArrayList arrayList = null;
        for (Ptg ptg : ptgArr) {
            ptg.write(littleEndianByteArrayOutputStream);
            if (ptg instanceof ArrayPtg) {
                if (arrayList == null) {
                    arrayList = new ArrayList(5);
                }
                arrayList.add(ptg);
            }
        }
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((ArrayPtg) arrayList.get(i11)).writeTokenValueBytes(littleEndianByteArrayOutputStream);
            }
        }
        return littleEndianByteArrayOutputStream.getWriteIndex() - i10;
    }

    private static Ptg[] toPtgArray(List<Ptg> list) {
        if (list.isEmpty()) {
            return EMPTY_PTG_ARRAY;
        }
        Ptg[] ptgArr = new Ptg[list.size()];
        list.toArray(ptgArr);
        return ptgArr;
    }

    public abstract byte getDefaultOperandClass();

    public final byte getPtgClass() {
        return this.ptgClass;
    }

    public final char getRVAType() {
        if (isBaseToken()) {
            return '.';
        }
        byte b10 = this.ptgClass;
        if (b10 != 0) {
            if (b10 != 32) {
                if (b10 == 64) {
                    return 'A';
                }
                throw new RuntimeException(h.g(new StringBuilder("Unknown operand class ("), this.ptgClass, ")"));
            }
            return 'V';
        }
        return 'R';
    }

    public abstract int getSize();

    public abstract boolean isBaseToken();

    public final void setClass(byte b10) {
        if (!isBaseToken()) {
            this.ptgClass = b10;
            return;
        }
        throw new RuntimeException("setClass should not be called on a base token");
    }

    public abstract String toFormulaString();

    public String toString() {
        return getClass().toString();
    }

    public abstract void write(LittleEndianOutput littleEndianOutput);
}
