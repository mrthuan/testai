package lib.zj.office.fc.hssf.record.pivottable;

import androidx.activity.r;
import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.LittleEndianOutput;
import lib.zj.office.fc.util.StringUtil;

/* loaded from: classes3.dex */
public final class ViewFieldsRecord extends StandardRecord {
    private static final int BASE_SIZE = 10;
    private static final int STRING_NOT_PRESENT_LEN = 65535;
    public static final short sid = 177;
    private int _cItm;
    private int _cSub;
    private int _grbitSub;
    private String _name;
    private int _sxaxis;

    /* loaded from: classes3.dex */
    public static final class Axis {
        public static final int COLUMN = 2;
        public static final int DATA = 8;
        public static final int NO_AXIS = 0;
        public static final int PAGE = 4;
        public static final int ROW = 1;

        private Axis() {
        }
    }

    public ViewFieldsRecord(RecordInputStream recordInputStream) {
        this._sxaxis = recordInputStream.readShort();
        this._cSub = recordInputStream.readShort();
        this._grbitSub = recordInputStream.readShort();
        this._cItm = recordInputStream.readShort();
        int readUShort = recordInputStream.readUShort();
        if (readUShort != 65535) {
            if ((recordInputStream.readByte() & 1) != 0) {
                this._name = recordInputStream.readUnicodeLEString(readUShort);
            } else {
                this._name = recordInputStream.readCompressedUnicode(readUShort);
            }
        }
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        int i10;
        String str = this._name;
        if (str == null) {
            return 10;
        }
        int length = str.length();
        if (StringUtil.hasMultibyte(this._name)) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        return (length * i10) + 11;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this._sxaxis);
        littleEndianOutput.writeShort(this._cSub);
        littleEndianOutput.writeShort(this._grbitSub);
        littleEndianOutput.writeShort(this._cItm);
        String str = this._name;
        if (str != null) {
            StringUtil.writeUnicodeString(littleEndianOutput, str);
        } else {
            littleEndianOutput.writeShort(65535);
        }
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[SXVD]\n    .sxaxis    = ");
        r.j(this._sxaxis, stringBuffer, "\n    .cSub      = ");
        r.j(this._cSub, stringBuffer, "\n    .grbitSub  = ");
        r.j(this._grbitSub, stringBuffer, "\n    .cItm      = ");
        r.j(this._cItm, stringBuffer, "\n    .name      = ");
        stringBuffer.append(this._name);
        stringBuffer.append("\n[/SXVD]\n");
        return stringBuffer.toString();
    }
}
