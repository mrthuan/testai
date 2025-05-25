package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.hssf.util.RKUtil;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class MulRKRecord extends StandardRecord {
    public static final short sid = 189;
    private int field_1_row;
    private short field_2_first_col;
    private RkRec[] field_3_rks;
    private short field_4_last_col;

    /* loaded from: classes3.dex */
    public static final class RkRec {
        public static final int ENCODED_SIZE = 6;

        /* renamed from: rk  reason: collision with root package name */
        public final int f20666rk;

        /* renamed from: xf  reason: collision with root package name */
        public final short f20667xf;

        private RkRec(RecordInputStream recordInputStream) {
            this.f20667xf = recordInputStream.readShort();
            this.f20666rk = recordInputStream.readInt();
        }

        public static RkRec[] parseRKs(RecordInputStream recordInputStream) {
            int remaining = (recordInputStream.remaining() - 2) / 6;
            RkRec[] rkRecArr = new RkRec[remaining];
            for (int i10 = 0; i10 < remaining; i10++) {
                rkRecArr[i10] = new RkRec(recordInputStream);
            }
            return rkRecArr;
        }
    }

    public MulRKRecord(RecordInputStream recordInputStream) {
        this.field_1_row = recordInputStream.readUShort();
        this.field_2_first_col = recordInputStream.readShort();
        this.field_3_rks = RkRec.parseRKs(recordInputStream);
        this.field_4_last_col = recordInputStream.readShort();
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        throw new RecordFormatException("Sorry, you can't serialize MulRK in this release");
    }

    public short getFirstColumn() {
        return this.field_2_first_col;
    }

    public short getLastColumn() {
        return this.field_4_last_col;
    }

    public int getNumColumns() {
        return (this.field_4_last_col - this.field_2_first_col) + 1;
    }

    public double getRKNumberAt(int i10) {
        return RKUtil.decodeNumber(this.field_3_rks[i10].f20666rk);
    }

    public int getRow() {
        return this.field_1_row;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 189;
    }

    public short getXFAt(int i10) {
        return this.field_3_rks[i10].f20667xf;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        throw new RecordFormatException("Sorry, you can't serialize MulRK in this release");
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[MULRK]\n\t.row\t = ");
        stringBuffer.append(HexDump.shortToHex(getRow()));
        stringBuffer.append("\n\t.firstcol= ");
        stringBuffer.append(HexDump.shortToHex(getFirstColumn()));
        stringBuffer.append("\n\t.lastcol = ");
        stringBuffer.append(HexDump.shortToHex(getLastColumn()));
        stringBuffer.append("\n");
        for (int i10 = 0; i10 < getNumColumns(); i10++) {
            stringBuffer.append("\txf[");
            stringBuffer.append(i10);
            stringBuffer.append("] = ");
            stringBuffer.append(HexDump.shortToHex(getXFAt(i10)));
            stringBuffer.append("\n\trk[");
            stringBuffer.append(i10);
            stringBuffer.append("] = ");
            stringBuffer.append(getRKNumberAt(i10));
            stringBuffer.append("\n");
        }
        stringBuffer.append("[/MULRK]\n");
        return stringBuffer.toString();
    }
}
