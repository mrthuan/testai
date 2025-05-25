package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class TabIdRecord extends StandardRecord {
    private static final short[] EMPTY_SHORT_ARRAY = new short[0];
    public static final short sid = 317;
    public short[] _tabids;

    public TabIdRecord() {
        this._tabids = EMPTY_SHORT_ARRAY;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return this._tabids.length * 2;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 317;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        for (short s4 : this._tabids) {
            littleEndianOutput.writeShort(s4);
        }
    }

    public void setTabIdArray(short[] sArr) {
        this._tabids = sArr;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[TABID]\n    .elements        = ");
        stringBuffer.append(this._tabids.length);
        stringBuffer.append("\n");
        for (int i10 = 0; i10 < this._tabids.length; i10++) {
            stringBuffer.append("    .element_");
            stringBuffer.append(i10);
            stringBuffer.append(" = ");
            stringBuffer.append((int) this._tabids[i10]);
            stringBuffer.append("\n");
        }
        stringBuffer.append("[/TABID]\n");
        return stringBuffer.toString();
    }

    public TabIdRecord(RecordInputStream recordInputStream) {
        this._tabids = new short[recordInputStream.remaining() / 2];
        int i10 = 0;
        while (true) {
            short[] sArr = this._tabids;
            if (i10 >= sArr.length) {
                return;
            }
            sArr[i10] = recordInputStream.readShort();
            i10++;
        }
    }
}
