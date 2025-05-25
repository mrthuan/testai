package lib.zj.office.fc.hssf.record;

import a0.a;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class EndSubRecord extends SubRecord {
    private static final int ENCODED_SIZE = 0;
    public static final short sid = 0;

    public EndSubRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.SubRecord
    public Object clone() {
        return new EndSubRecord();
    }

    @Override // lib.zj.office.fc.hssf.record.SubRecord
    public int getDataSize() {
        return 0;
    }

    public short getSid() {
        return (short) 0;
    }

    @Override // lib.zj.office.fc.hssf.record.SubRecord
    public boolean isTerminating() {
        return true;
    }

    @Override // lib.zj.office.fc.hssf.record.SubRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(0);
        littleEndianOutput.writeShort(0);
    }

    public String toString() {
        return "[ftEnd]\n[/ftEnd]\n";
    }

    public EndSubRecord(LittleEndianInput littleEndianInput, int i10) {
        if ((i10 & FunctionEval.FunctionID.EXTERNAL_FUNC) != 0) {
            throw new RecordFormatException(a.g("Unexpected size (", i10, ")"));
        }
    }
}
