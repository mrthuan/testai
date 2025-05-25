package lib.zj.office.fc.hssf.formula.ptg;

import lib.zj.office.fc.hssf.formula.function.FunctionMetadata;
import lib.zj.office.fc.hssf.formula.function.FunctionMetadataRegistry;
import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class FuncVarPtg extends AbstractFunctionPtg {
    private static final int SIZE = 4;
    public static final OperationPtg SUM = create("SUM", 1);
    public static final byte sid = 34;

    private FuncVarPtg(int i10, int i11, byte[] bArr, int i12) {
        super(i10, i11, bArr, i12);
    }

    public static FuncVarPtg create(LittleEndianInput littleEndianInput) {
        return create(littleEndianInput.readByte(), littleEndianInput.readShort());
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.AbstractFunctionPtg, lib.zj.office.fc.hssf.formula.ptg.Ptg
    public int getSize() {
        return 4;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public void write(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeByte(getPtgClass() + 34);
        littleEndianOutput.writeByte(getNumberOfOperands());
        littleEndianOutput.writeShort(getFunctionIndex());
    }

    public static FuncVarPtg create(String str, int i10) {
        return create(i10, AbstractFunctionPtg.lookupIndex(str));
    }

    private static FuncVarPtg create(int i10, int i11) {
        FunctionMetadata functionByIndex = FunctionMetadataRegistry.getFunctionByIndex(i11);
        if (functionByIndex == null) {
            return new FuncVarPtg(i11, 32, new byte[]{32}, i10);
        }
        return new FuncVarPtg(i11, functionByIndex.getReturnClassCode(), functionByIndex.getParameterClassCodes(), i10);
    }
}
