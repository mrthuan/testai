package lib.zj.office.fc.hssf.record.pivottable;

import androidx.activity.r;
import lib.zj.office.fc.hssf.record.RecordFormatException;
import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;
import lib.zj.office.fc.util.StringUtil;

/* loaded from: classes3.dex */
public final class ExtendedPivotTableViewFieldsRecord extends StandardRecord {
    private static final int STRING_NOT_PRESENT_LEN = 65535;
    public static final short sid = 256;
    private int _citmShow;
    private int _grbit1;
    private int _grbit2;
    private int _isxdiShow;
    private int _isxdiSort;
    private int _reserved1;
    private int _reserved2;
    private String _subtotalName;

    public ExtendedPivotTableViewFieldsRecord(RecordInputStream recordInputStream) {
        this._grbit1 = recordInputStream.readInt();
        this._grbit2 = recordInputStream.readUByte();
        this._citmShow = recordInputStream.readUByte();
        this._isxdiSort = recordInputStream.readUShort();
        this._isxdiShow = recordInputStream.readUShort();
        int remaining = recordInputStream.remaining();
        if (remaining != 0) {
            if (remaining == 10) {
                int readUShort = recordInputStream.readUShort();
                this._reserved1 = recordInputStream.readInt();
                this._reserved2 = recordInputStream.readInt();
                if (readUShort != 65535) {
                    this._subtotalName = recordInputStream.readUnicodeLEString(readUShort);
                    return;
                }
                return;
            }
            throw new RecordFormatException("Unexpected remaining size (" + recordInputStream.remaining() + ")");
        }
        this._reserved1 = 0;
        this._reserved2 = 0;
        this._subtotalName = null;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        int length;
        String str = this._subtotalName;
        if (str == null) {
            length = 0;
        } else {
            length = str.length() * 2;
        }
        return length + 20;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 256;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeInt(this._grbit1);
        littleEndianOutput.writeByte(this._grbit2);
        littleEndianOutput.writeByte(this._citmShow);
        littleEndianOutput.writeShort(this._isxdiSort);
        littleEndianOutput.writeShort(this._isxdiShow);
        String str = this._subtotalName;
        if (str == null) {
            littleEndianOutput.writeShort(65535);
        } else {
            littleEndianOutput.writeShort(str.length());
        }
        littleEndianOutput.writeInt(this._reserved1);
        littleEndianOutput.writeInt(this._reserved2);
        String str2 = this._subtotalName;
        if (str2 != null) {
            StringUtil.putUnicodeLE(str2, littleEndianOutput);
        }
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[SXVDEX]\n    .grbit1 =");
        stringBuffer.append(HexDump.intToHex(this._grbit1));
        stringBuffer.append("\n    .grbit2 =");
        stringBuffer.append(HexDump.byteToHex(this._grbit2));
        stringBuffer.append("\n    .citmShow =");
        stringBuffer.append(HexDump.byteToHex(this._citmShow));
        stringBuffer.append("\n    .isxdiSort =");
        r.j(this._isxdiSort, stringBuffer, "\n    .isxdiShow =");
        r.j(this._isxdiShow, stringBuffer, "\n    .subtotalName =");
        stringBuffer.append(this._subtotalName);
        stringBuffer.append("\n[/SXVDEX]\n");
        return stringBuffer.toString();
    }
}
