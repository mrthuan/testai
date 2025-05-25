package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.hssf.util.CellRangeAddress8Bit;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class SelectionRecord extends StandardRecord {
    public static final short sid = 29;
    private byte field_1_pane;
    private int field_2_row_active_cell;
    private int field_3_col_active_cell;
    private int field_4_active_cell_ref_index;
    private CellRangeAddress8Bit[] field_6_refs;

    public SelectionRecord(int i10, int i11) {
        this.field_1_pane = (byte) 3;
        this.field_2_row_active_cell = i10;
        this.field_3_col_active_cell = i11;
        this.field_4_active_cell_ref_index = 0;
        this.field_6_refs = new CellRangeAddress8Bit[]{new CellRangeAddress8Bit(i10, i10, i11, i11)};
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        SelectionRecord selectionRecord = new SelectionRecord(this.field_2_row_active_cell, this.field_3_col_active_cell);
        selectionRecord.field_1_pane = this.field_1_pane;
        selectionRecord.field_4_active_cell_ref_index = this.field_4_active_cell_ref_index;
        selectionRecord.field_6_refs = this.field_6_refs;
        return selectionRecord;
    }

    public int getActiveCellCol() {
        return this.field_3_col_active_cell;
    }

    public int getActiveCellRef() {
        return this.field_4_active_cell_ref_index;
    }

    public int getActiveCellRow() {
        return this.field_2_row_active_cell;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return CellRangeAddress8Bit.getEncodedSize(this.field_6_refs.length) + 9;
    }

    public byte getPane() {
        return this.field_1_pane;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 29;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeByte(getPane());
        littleEndianOutput.writeShort(getActiveCellRow());
        littleEndianOutput.writeShort(getActiveCellCol());
        littleEndianOutput.writeShort(getActiveCellRef());
        littleEndianOutput.writeShort(this.field_6_refs.length);
        int i10 = 0;
        while (true) {
            CellRangeAddress8Bit[] cellRangeAddress8BitArr = this.field_6_refs;
            if (i10 < cellRangeAddress8BitArr.length) {
                cellRangeAddress8BitArr[i10].serialize(littleEndianOutput);
                i10++;
            } else {
                return;
            }
        }
    }

    public void setActiveCellCol(short s4) {
        this.field_3_col_active_cell = s4;
    }

    public void setActiveCellRef(short s4) {
        this.field_4_active_cell_ref_index = s4;
    }

    public void setActiveCellRow(int i10) {
        this.field_2_row_active_cell = i10;
    }

    public void setPane(byte b10) {
        this.field_1_pane = b10;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[SELECTION]\n    .pane            = ");
        stringBuffer.append(HexDump.byteToHex(getPane()));
        stringBuffer.append("\n    .activecellrow   = ");
        stringBuffer.append(HexDump.shortToHex(getActiveCellRow()));
        stringBuffer.append("\n    .activecellcol   = ");
        stringBuffer.append(HexDump.shortToHex(getActiveCellCol()));
        stringBuffer.append("\n    .activecellref   = ");
        stringBuffer.append(HexDump.shortToHex(getActiveCellRef()));
        stringBuffer.append("\n    .numrefs         = ");
        stringBuffer.append(HexDump.shortToHex(this.field_6_refs.length));
        stringBuffer.append("\n[/SELECTION]\n");
        return stringBuffer.toString();
    }

    public SelectionRecord(RecordInputStream recordInputStream) {
        this.field_1_pane = recordInputStream.readByte();
        this.field_2_row_active_cell = recordInputStream.readUShort();
        this.field_3_col_active_cell = recordInputStream.readShort();
        this.field_4_active_cell_ref_index = recordInputStream.readShort();
        this.field_6_refs = new CellRangeAddress8Bit[recordInputStream.readUShort()];
        int i10 = 0;
        while (true) {
            CellRangeAddress8Bit[] cellRangeAddress8BitArr = this.field_6_refs;
            if (i10 >= cellRangeAddress8BitArr.length) {
                return;
            }
            cellRangeAddress8BitArr[i10] = new CellRangeAddress8Bit(recordInputStream);
            i10++;
        }
    }
}
