package lib.zj.office.fc.hssf.record;

import androidx.activity.r;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class DrawingSelectionRecord extends StandardRecord {
    public static final short sid = 237;
    private int _cpsp;
    private int _dgslk;
    private OfficeArtRecordHeader _header;
    private int[] _shapeIds;
    private int _spidFocus;

    /* loaded from: classes3.dex */
    public static final class OfficeArtRecordHeader {
        public static final int ENCODED_SIZE = 8;
        private final int _length;
        private final int _type;
        private final int _verAndInstance;

        public OfficeArtRecordHeader(LittleEndianInput littleEndianInput) {
            this._verAndInstance = littleEndianInput.readUShort();
            this._type = littleEndianInput.readUShort();
            this._length = littleEndianInput.readInt();
        }

        public String debugFormatAsString() {
            StringBuffer stringBuffer = new StringBuffer(32);
            stringBuffer.append("ver+inst=");
            r.j(this._verAndInstance, stringBuffer, " type=");
            r.j(this._type, stringBuffer, " len=");
            stringBuffer.append(HexDump.intToHex(this._length));
            return stringBuffer.toString();
        }

        public void serialize(LittleEndianOutput littleEndianOutput) {
            littleEndianOutput.writeShort(this._verAndInstance);
            littleEndianOutput.writeShort(this._type);
            littleEndianOutput.writeInt(this._length);
        }
    }

    public DrawingSelectionRecord(RecordInputStream recordInputStream) {
        this._header = new OfficeArtRecordHeader(recordInputStream);
        this._cpsp = recordInputStream.readInt();
        this._dgslk = recordInputStream.readInt();
        this._spidFocus = recordInputStream.readInt();
        int available = recordInputStream.available() / 4;
        int[] iArr = new int[available];
        for (int i10 = 0; i10 < available; i10++) {
            iArr[i10] = recordInputStream.readInt();
        }
        this._shapeIds = iArr;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return (this._shapeIds.length * 4) + 20;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        this._header.serialize(littleEndianOutput);
        littleEndianOutput.writeInt(this._cpsp);
        littleEndianOutput.writeInt(this._dgslk);
        littleEndianOutput.writeInt(this._spidFocus);
        int i10 = 0;
        while (true) {
            int[] iArr = this._shapeIds;
            if (i10 < iArr.length) {
                littleEndianOutput.writeInt(iArr[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[MSODRAWINGSELECTION]\n    .rh       =(");
        stringBuffer.append(this._header.debugFormatAsString());
        stringBuffer.append(")\n    .cpsp     =");
        stringBuffer.append(HexDump.intToHex(this._cpsp));
        stringBuffer.append("\n    .dgslk    =");
        stringBuffer.append(HexDump.intToHex(this._dgslk));
        stringBuffer.append("\n    .spidFocus=");
        stringBuffer.append(HexDump.intToHex(this._spidFocus));
        stringBuffer.append("\n    .shapeIds =(");
        for (int i10 = 0; i10 < this._shapeIds.length; i10++) {
            if (i10 > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(HexDump.intToHex(this._shapeIds[i10]));
        }
        stringBuffer.append(")\n[/MSODRAWINGSELECTION]\n");
        return stringBuffer.toString();
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        return this;
    }
}
