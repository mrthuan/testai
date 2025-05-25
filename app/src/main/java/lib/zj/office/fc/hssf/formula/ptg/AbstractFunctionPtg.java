package lib.zj.office.fc.hssf.formula.ptg;

import a0.a;
import a6.h;
import lib.zj.office.fc.hssf.formula.function.FunctionMetadata;
import lib.zj.office.fc.hssf.formula.function.FunctionMetadataRegistry;

/* loaded from: classes3.dex */
public abstract class AbstractFunctionPtg extends OperationPtg {
    private static final short FUNCTION_INDEX_EXTERNAL = 255;
    public static final String FUNCTION_NAME_IF = "IF";
    private final short _functionIndex;
    private final byte _numberOfArgs;
    private final byte[] paramClass;
    private final byte returnClass;

    public AbstractFunctionPtg(int i10, int i11, byte[] bArr, int i12) {
        this._numberOfArgs = (byte) i12;
        this._functionIndex = (short) i10;
        this.returnClass = (byte) i11;
        this.paramClass = bArr;
    }

    private static void appendArgs(StringBuilder sb2, int i10, String[] strArr) {
        sb2.append('(');
        for (int i11 = i10; i11 < strArr.length; i11++) {
            if (i11 > i10) {
                sb2.append(',');
            }
            sb2.append(strArr[i11]);
        }
        sb2.append(")");
    }

    public static final boolean isBuiltInFunctionName(String str) {
        if (FunctionMetadataRegistry.lookupIndexByName(str.toUpperCase()) >= 0) {
            return true;
        }
        return false;
    }

    public static short lookupIndex(String str) {
        short lookupIndexByName = FunctionMetadataRegistry.lookupIndexByName(str.toUpperCase());
        if (lookupIndexByName < 0) {
            return (short) 255;
        }
        return lookupIndexByName;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.OperationPtg, lib.zj.office.fc.hssf.formula.ptg.Ptg
    public byte getDefaultOperandClass() {
        return this.returnClass;
    }

    public final short getFunctionIndex() {
        return this._functionIndex;
    }

    public final String getName() {
        return lookupName(this._functionIndex);
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.OperationPtg
    public final int getNumberOfOperands() {
        return this._numberOfArgs;
    }

    public final byte getParameterClass(int i10) {
        byte[] bArr = this.paramClass;
        if (i10 >= bArr.length) {
            return bArr[bArr.length - 1];
        }
        return bArr[i10];
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public abstract int getSize();

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public final boolean isBaseToken() {
        return false;
    }

    public final boolean isExternalFunction() {
        if (this._functionIndex == 255) {
            return true;
        }
        return false;
    }

    public final String lookupName(short s4) {
        if (s4 == 255) {
            return "#external#";
        }
        FunctionMetadata functionByIndex = FunctionMetadataRegistry.getFunctionByIndex(s4);
        if (functionByIndex != null) {
            return functionByIndex.getName();
        }
        throw new RuntimeException(a.g("bad function index (", s4, ")"));
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public final String toFormulaString() {
        return getName();
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(getClass().getName());
        sb2.append(" [");
        sb2.append(lookupName(this._functionIndex));
        sb2.append(" nArgs=");
        return h.g(sb2, this._numberOfArgs, "]");
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.OperationPtg
    public String toFormulaString(String[] strArr) {
        StringBuilder sb2 = new StringBuilder();
        if (isExternalFunction()) {
            sb2.append(strArr[0]);
            appendArgs(sb2, 1, strArr);
        } else {
            sb2.append(getName());
            appendArgs(sb2, 0, strArr);
        }
        return sb2.toString();
    }
}
