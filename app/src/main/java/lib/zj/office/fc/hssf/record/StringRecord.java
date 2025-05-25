package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.hssf.record.cont.ContinuableRecord;
import lib.zj.office.fc.hssf.record.cont.ContinuableRecordOutput;
import lib.zj.office.fc.util.StringUtil;

/* loaded from: classes3.dex */
public final class StringRecord extends ContinuableRecord {
    public static final short sid = 519;
    private boolean _is16bitUnicode;
    private String _text;

    public StringRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        StringRecord stringRecord = new StringRecord();
        stringRecord._is16bitUnicode = this._is16bitUnicode;
        stringRecord._text = this._text;
        return stringRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 519;
    }

    public String getString() {
        return this._text;
    }

    @Override // lib.zj.office.fc.hssf.record.cont.ContinuableRecord
    public void serialize(ContinuableRecordOutput continuableRecordOutput) {
        continuableRecordOutput.writeShort(this._text.length());
        continuableRecordOutput.writeStringData(this._text);
    }

    public void setString(String str) {
        this._text = str;
        this._is16bitUnicode = StringUtil.hasMultibyte(str);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[STRING]\n    .string            = ");
        stringBuffer.append(this._text);
        stringBuffer.append("\n[/STRING]\n");
        return stringBuffer.toString();
    }

    public StringRecord(RecordInputStream recordInputStream) {
        int readUShort = recordInputStream.readUShort();
        boolean z10 = recordInputStream.readByte() != 0;
        this._is16bitUnicode = z10;
        if (z10) {
            this._text = recordInputStream.readUnicodeLEString(readUShort);
        } else {
            this._text = recordInputStream.readCompressedUnicode(readUShort);
        }
    }
}
