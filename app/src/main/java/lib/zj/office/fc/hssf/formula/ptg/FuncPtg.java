package lib.zj.office.fc.hssf.formula.ptg;

import a0.a;
import lib.zj.office.fc.hssf.formula.function.FunctionMetadata;
import lib.zj.office.fc.hssf.formula.function.FunctionMetadataRegistry;
import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class FuncPtg extends AbstractFunctionPtg {
    public static final int SIZE = 3;
    public static final byte sid = 33;

    private FuncPtg(int i10, FunctionMetadata functionMetadata) {
        super(i10, functionMetadata.getReturnClassCode(), functionMetadata.getParameterClassCodes(), functionMetadata.getMinParams());
    }

    public static FuncPtg create(LittleEndianInput littleEndianInput) {
        return create(littleEndianInput.readUShort());
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.AbstractFunctionPtg, lib.zj.office.fc.hssf.formula.ptg.Ptg
    public int getSize() {
        return 3;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public void write(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeByte(getPtgClass() + 33);
        littleEndianOutput.writeShort(getFunctionIndex());
    }

    public static FuncPtg create(int i10) {
        FunctionMetadata functionByIndex = FunctionMetadataRegistry.getFunctionByIndex(i10);
        if (functionByIndex != null) {
            return new FuncPtg(i10, functionByIndex);
        }
        throw new RuntimeException(a.g("Invalid built-in function index (", i10, ")"));
    }
}
