package lib.zj.office.fc.hssf.record.pivottable;

import androidx.activity.r;
import b.a;
import lib.zj.office.fc.hssf.record.RecordFormatException;
import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class PageItemRecord extends StandardRecord {
    public static final short sid = 182;
    private final FieldInfo[] _fieldInfos;

    /* loaded from: classes3.dex */
    public static final class FieldInfo {
        public static final int ENCODED_SIZE = 6;
        private int _idObj;
        private int _isxvd;
        private int _isxvi;

        public FieldInfo(RecordInputStream recordInputStream) {
            this._isxvi = recordInputStream.readShort();
            this._isxvd = recordInputStream.readShort();
            this._idObj = recordInputStream.readShort();
        }

        public void appendDebugInfo(StringBuffer stringBuffer) {
            stringBuffer.append('(');
            stringBuffer.append("isxvi=");
            r.j(this._isxvi, stringBuffer, " isxvd=");
            r.j(this._isxvd, stringBuffer, " idObj=");
            stringBuffer.append(HexDump.shortToHex(this._idObj));
            stringBuffer.append(')');
        }

        public void serialize(LittleEndianOutput littleEndianOutput) {
            littleEndianOutput.writeShort(this._isxvi);
            littleEndianOutput.writeShort(this._isxvd);
            littleEndianOutput.writeShort(this._idObj);
        }
    }

    public PageItemRecord(RecordInputStream recordInputStream) {
        int remaining = recordInputStream.remaining();
        if (remaining % 6 == 0) {
            int i10 = remaining / 6;
            FieldInfo[] fieldInfoArr = new FieldInfo[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                fieldInfoArr[i11] = new FieldInfo(recordInputStream);
            }
            this._fieldInfos = fieldInfoArr;
            return;
        }
        throw new RecordFormatException(a.c("Bad data size ", remaining));
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return this._fieldInfos.length * 6;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        int i10 = 0;
        while (true) {
            FieldInfo[] fieldInfoArr = this._fieldInfos;
            if (i10 < fieldInfoArr.length) {
                fieldInfoArr[i10].serialize(littleEndianOutput);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[SXPI]\n");
        for (int i10 = 0; i10 < this._fieldInfos.length; i10++) {
            stringBuffer.append("    item[");
            stringBuffer.append(i10);
            stringBuffer.append("]=");
            this._fieldInfos[i10].appendDebugInfo(stringBuffer);
            stringBuffer.append('\n');
        }
        stringBuffer.append("[/SXPI]\n");
        return stringBuffer.toString();
    }
}
