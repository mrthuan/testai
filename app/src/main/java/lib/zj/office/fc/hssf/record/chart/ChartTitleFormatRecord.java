package lib.zj.office.fc.hssf.record.chart;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public class ChartTitleFormatRecord extends StandardRecord {
    public static final short sid = 4176;
    private CTFormat[] _formats;

    public ChartTitleFormatRecord(RecordInputStream recordInputStream) {
        int readUShort = recordInputStream.readUShort();
        this._formats = new CTFormat[readUShort];
        for (int i10 = 0; i10 < readUShort; i10++) {
            this._formats[i10] = new CTFormat(recordInputStream);
        }
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return (this._formats.length * 4) + 2;
    }

    public int getFormatCount() {
        return this._formats.length;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    public void modifyFormatRun(short s4, short s10) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            CTFormat[] cTFormatArr = this._formats;
            if (i10 < cTFormatArr.length) {
                CTFormat cTFormat = cTFormatArr[i10];
                if (i11 != 0) {
                    cTFormat.setOffset(cTFormat.getOffset() + i11);
                } else if (s4 == cTFormat.getOffset()) {
                    CTFormat[] cTFormatArr2 = this._formats;
                    if (i10 < cTFormatArr2.length - 1) {
                        i11 = s10 - (cTFormatArr2[i10 + 1].getOffset() - cTFormat.getOffset());
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this._formats.length);
        int i10 = 0;
        while (true) {
            CTFormat[] cTFormatArr = this._formats;
            if (i10 < cTFormatArr.length) {
                cTFormatArr[i10].serialize(littleEndianOutput);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[CHARTTITLEFORMAT]\n    .format_runs       = ");
        stringBuffer.append(this._formats.length);
        stringBuffer.append("\n");
        int i10 = 0;
        while (true) {
            CTFormat[] cTFormatArr = this._formats;
            if (i10 < cTFormatArr.length) {
                CTFormat cTFormat = cTFormatArr[i10];
                stringBuffer.append("       .char_offset= ");
                stringBuffer.append(cTFormat.getOffset());
                stringBuffer.append(",.fontidx= ");
                stringBuffer.append(cTFormat.getFontIndex());
                stringBuffer.append("\n");
                i10++;
            } else {
                stringBuffer.append("[/CHARTTITLEFORMAT]\n");
                return stringBuffer.toString();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class CTFormat {
        public static final int ENCODED_SIZE = 4;
        private int _fontIndex;
        private int _offset;

        public CTFormat(short s4, short s10) {
            this._offset = s4;
            this._fontIndex = s10;
        }

        public int getFontIndex() {
            return this._fontIndex;
        }

        public int getOffset() {
            return this._offset;
        }

        public void serialize(LittleEndianOutput littleEndianOutput) {
            littleEndianOutput.writeShort(this._offset);
            littleEndianOutput.writeShort(this._fontIndex);
        }

        public void setOffset(int i10) {
            this._offset = i10;
        }

        public CTFormat(RecordInputStream recordInputStream) {
            this._offset = recordInputStream.readShort();
            this._fontIndex = recordInputStream.readShort();
        }
    }
}
