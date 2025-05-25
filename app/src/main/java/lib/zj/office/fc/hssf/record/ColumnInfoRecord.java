package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class ColumnInfoRecord extends StandardRecord {
    public static final short sid = 125;
    private int _colWidth;
    private int _firstCol;
    private int _lastCol;
    private int _options;
    private int _xfIndex;
    private int colPixelWidth = 74;
    private int field_6_reserved;
    private static final BitField hidden = BitFieldFactory.getInstance(1);
    private static final BitField outlevel = BitFieldFactory.getInstance(1792);
    private static final BitField collapsed = BitFieldFactory.getInstance(4096);

    public ColumnInfoRecord() {
        setColumnWidth(2275);
        this._options = 2;
        this._xfIndex = 15;
        this.field_6_reserved = 2;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        ColumnInfoRecord columnInfoRecord = new ColumnInfoRecord();
        columnInfoRecord._firstCol = this._firstCol;
        columnInfoRecord._lastCol = this._lastCol;
        columnInfoRecord._colWidth = this._colWidth;
        columnInfoRecord._xfIndex = this._xfIndex;
        columnInfoRecord._options = this._options;
        columnInfoRecord.field_6_reserved = this.field_6_reserved;
        return columnInfoRecord;
    }

    public boolean containsColumn(int i10) {
        if (this._firstCol <= i10 && i10 <= this._lastCol) {
            return true;
        }
        return false;
    }

    public boolean formatMatches(ColumnInfoRecord columnInfoRecord) {
        if (this._xfIndex != columnInfoRecord._xfIndex || this._options != columnInfoRecord._options || this._colWidth != columnInfoRecord._colWidth) {
            return false;
        }
        return true;
    }

    public int getColPixelWidth() {
        return this.colPixelWidth;
    }

    public boolean getCollapsed() {
        return collapsed.isSet(this._options);
    }

    public int getColumnWidth() {
        return this._colWidth;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 12;
    }

    public int getFirstColumn() {
        return this._firstCol;
    }

    public boolean getHidden() {
        return hidden.isSet(this._options);
    }

    public int getLastColumn() {
        return this._lastCol;
    }

    public int getOutlineLevel() {
        return outlevel.getValue(this._options);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 125;
    }

    public int getXFIndex() {
        return this._xfIndex;
    }

    public boolean isAdjacentBefore(ColumnInfoRecord columnInfoRecord) {
        if (this._lastCol == columnInfoRecord._firstCol - 1) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(getFirstColumn());
        littleEndianOutput.writeShort(getLastColumn());
        littleEndianOutput.writeShort(getColumnWidth());
        littleEndianOutput.writeShort(getXFIndex());
        littleEndianOutput.writeShort(this._options);
        littleEndianOutput.writeShort(this.field_6_reserved);
    }

    public void setColPixelWidth(int i10) {
        this.colPixelWidth = i10;
    }

    public void setCollapsed(boolean z10) {
        this._options = collapsed.setBoolean(this._options, z10);
    }

    public void setColumnWidth(int i10) {
        this._colWidth = i10;
    }

    public void setFirstColumn(int i10) {
        this._firstCol = i10;
    }

    public void setHidden(boolean z10) {
        this._options = hidden.setBoolean(this._options, z10);
    }

    public void setLastColumn(int i10) {
        this._lastCol = i10;
    }

    public void setOutlineLevel(int i10) {
        this._options = outlevel.setValue(this._options, i10);
    }

    public void setXFIndex(int i10) {
        this._xfIndex = i10;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        return "[COLINFO]\n  colfirst = " + getFirstColumn() + "\n  collast  = " + getLastColumn() + "\n  colwidth = " + getColumnWidth() + "\n  xfindex  = " + getXFIndex() + "\n  options  = " + HexDump.shortToHex(this._options) + "\n    hidden   = " + getHidden() + "\n    olevel   = " + getOutlineLevel() + "\n    collapsed= " + getCollapsed() + "\n[/COLINFO]\n";
    }

    public ColumnInfoRecord(RecordInputStream recordInputStream) {
        this._firstCol = recordInputStream.readUShort();
        this._lastCol = recordInputStream.readUShort();
        this._colWidth = recordInputStream.readUShort();
        this._xfIndex = recordInputStream.readUShort();
        this._options = recordInputStream.readUShort();
        int remaining = recordInputStream.remaining();
        if (remaining == 0) {
            this.field_6_reserved = 0;
        } else if (remaining == 1) {
            this.field_6_reserved = recordInputStream.readByte();
        } else if (remaining == 2) {
            this.field_6_reserved = recordInputStream.readUShort();
        } else {
            throw new RuntimeException("Unusual record size remaining=(" + recordInputStream.remaining() + ")");
        }
    }
}
