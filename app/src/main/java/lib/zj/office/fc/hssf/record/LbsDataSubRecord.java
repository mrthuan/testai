package lib.zj.office.fc.hssf.record;

import a6.h;
import androidx.activity.r;
import lib.zj.office.fc.hssf.formula.ptg.Ptg;
import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;
import lib.zj.office.fc.util.StringUtil;

/* loaded from: classes3.dex */
public class LbsDataSubRecord extends SubRecord {
    public static final int sid = 19;
    private boolean[] _bsels;
    private int _cLines;
    private int _cbFContinued;
    private LbsDropData _dropData;
    private int _flags;
    private int _iSel;
    private int _idEdit;
    private Ptg _linkPtg;
    private String[] _rgLines;
    private Byte _unknownPostFormulaByte;
    private int _unknownPreFormulaInt;

    public LbsDataSubRecord(LittleEndianInput littleEndianInput, int i10, int i11) {
        this._cbFContinued = i10;
        int readUShort = littleEndianInput.readUShort();
        if (readUShort > 0) {
            int readUShort2 = littleEndianInput.readUShort();
            this._unknownPreFormulaInt = littleEndianInput.readInt();
            Ptg[] readTokens = Ptg.readTokens(readUShort2, littleEndianInput);
            if (readTokens.length == 1) {
                this._linkPtg = readTokens[0];
                int i12 = (readUShort - readUShort2) - 6;
                if (i12 == 0) {
                    this._unknownPostFormulaByte = null;
                } else if (i12 == 1) {
                    this._unknownPostFormulaByte = Byte.valueOf(littleEndianInput.readByte());
                } else {
                    throw new RecordFormatException("Unexpected leftover bytes");
                }
            } else {
                throw new RecordFormatException(h.g(new StringBuilder("Read "), readTokens.length, " tokens but expected exactly 1"));
            }
        }
        this._cLines = littleEndianInput.readUShort();
        this._iSel = littleEndianInput.readUShort();
        this._flags = littleEndianInput.readUShort();
        this._idEdit = littleEndianInput.readUShort();
        if (i11 == 20) {
            this._dropData = new LbsDropData(littleEndianInput);
        }
        if ((this._flags & 2) != 0) {
            this._rgLines = new String[this._cLines];
            for (int i13 = 0; i13 < this._cLines; i13++) {
                this._rgLines[i13] = StringUtil.readUnicodeString(littleEndianInput);
            }
        }
        if (((this._flags >> 4) & 2) != 0) {
            this._bsels = new boolean[this._cLines];
            for (int i14 = 0; i14 < this._cLines; i14++) {
                this._bsels[i14] = littleEndianInput.readByte() == 1;
            }
        }
    }

    public static LbsDataSubRecord newAutoFilterInstance() {
        LbsDataSubRecord lbsDataSubRecord = new LbsDataSubRecord();
        lbsDataSubRecord._cbFContinued = 8174;
        lbsDataSubRecord._iSel = 0;
        lbsDataSubRecord._flags = 769;
        LbsDropData lbsDropData = new LbsDropData();
        lbsDataSubRecord._dropData = lbsDropData;
        lbsDropData._wStyle = LbsDropData.STYLE_COMBO_SIMPLE_DROPDOWN;
        lbsDataSubRecord._dropData._cLine = 8;
        return lbsDataSubRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.SubRecord
    public int getDataSize() {
        int i10;
        Ptg ptg = this._linkPtg;
        if (ptg != null) {
            i10 = ptg.getSize() + 8;
            if (this._unknownPostFormulaByte != null) {
                i10++;
            }
        } else {
            i10 = 2;
        }
        int i11 = i10 + 8;
        LbsDropData lbsDropData = this._dropData;
        if (lbsDropData != null) {
            i11 += lbsDropData.getDataSize();
        }
        String[] strArr = this._rgLines;
        if (strArr != null) {
            for (String str : strArr) {
                i11 += StringUtil.getEncodedSize(str);
            }
        }
        boolean[] zArr = this._bsels;
        if (zArr != null) {
            return i11 + zArr.length;
        }
        return i11;
    }

    public Ptg getFormula() {
        return this._linkPtg;
    }

    public int getNumberOfItems() {
        return this._cLines;
    }

    @Override // lib.zj.office.fc.hssf.record.SubRecord
    public boolean isTerminating() {
        return true;
    }

    @Override // lib.zj.office.fc.hssf.record.SubRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(19);
        littleEndianOutput.writeShort(this._cbFContinued);
        Ptg ptg = this._linkPtg;
        if (ptg == null) {
            littleEndianOutput.writeShort(0);
        } else {
            int size = ptg.getSize();
            int i10 = size + 6;
            if (this._unknownPostFormulaByte != null) {
                i10++;
            }
            littleEndianOutput.writeShort(i10);
            littleEndianOutput.writeShort(size);
            littleEndianOutput.writeInt(this._unknownPreFormulaInt);
            this._linkPtg.write(littleEndianOutput);
            Byte b10 = this._unknownPostFormulaByte;
            if (b10 != null) {
                littleEndianOutput.writeByte(b10.intValue());
            }
        }
        littleEndianOutput.writeShort(this._cLines);
        littleEndianOutput.writeShort(this._iSel);
        littleEndianOutput.writeShort(this._flags);
        littleEndianOutput.writeShort(this._idEdit);
        LbsDropData lbsDropData = this._dropData;
        if (lbsDropData != null) {
            lbsDropData.serialize(littleEndianOutput);
        }
        String[] strArr = this._rgLines;
        if (strArr != null) {
            for (String str : strArr) {
                StringUtil.writeUnicodeString(littleEndianOutput, str);
            }
        }
        boolean[] zArr = this._bsels;
        if (zArr != null) {
            for (boolean z10 : zArr) {
                littleEndianOutput.writeByte(z10 ? 1 : 0);
            }
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(256);
        stringBuffer.append("[ftLbsData]\n    .unknownShort1 =");
        r.j(this._cbFContinued, stringBuffer, "\n    .formula        = \n");
        Ptg ptg = this._linkPtg;
        if (ptg != null) {
            stringBuffer.append(ptg.toString());
            stringBuffer.append(this._linkPtg.getRVAType());
            stringBuffer.append('\n');
        }
        stringBuffer.append("    .nEntryCount   =");
        r.j(this._cLines, stringBuffer, "\n    .selEntryIx    =");
        r.j(this._iSel, stringBuffer, "\n    .style         =");
        r.j(this._flags, stringBuffer, "\n    .unknownShort10=");
        r.j(this._idEdit, stringBuffer, "\n");
        if (this._dropData != null) {
            stringBuffer.append('\n');
            stringBuffer.append(this._dropData.toString());
        }
        stringBuffer.append("[/ftLbsData]\n");
        return stringBuffer.toString();
    }

    /* loaded from: classes3.dex */
    public static class LbsDropData {
        public static int STYLE_COMBO_DROPDOWN = 0;
        public static int STYLE_COMBO_EDIT_DROPDOWN = 1;
        public static int STYLE_COMBO_SIMPLE_DROPDOWN = 2;
        private int _cLine;
        private int _dxMin;
        private String _str;
        private Byte _unused;
        private int _wStyle;

        public LbsDropData() {
            this._str = "";
            this._unused = (byte) 0;
        }

        public int getDataSize() {
            int encodedSize = StringUtil.getEncodedSize(this._str) + 6;
            if (this._unused != null) {
                return encodedSize + 1;
            }
            return encodedSize;
        }

        public void serialize(LittleEndianOutput littleEndianOutput) {
            littleEndianOutput.writeShort(this._wStyle);
            littleEndianOutput.writeShort(this._cLine);
            littleEndianOutput.writeShort(this._dxMin);
            StringUtil.writeUnicodeString(littleEndianOutput, this._str);
            Byte b10 = this._unused;
            if (b10 != null) {
                littleEndianOutput.writeByte(b10.byteValue());
            }
        }

        public void setNumLines(int i10) {
            this._cLine = i10;
        }

        public void setStyle(int i10) {
            this._wStyle = i10;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer("[LbsDropData]\n  ._wStyle:  ");
            stringBuffer.append(this._wStyle);
            stringBuffer.append("\n  ._cLine:  ");
            stringBuffer.append(this._cLine);
            stringBuffer.append("\n  ._dxMin:  ");
            stringBuffer.append(this._dxMin);
            stringBuffer.append("\n  ._str:  ");
            stringBuffer.append(this._str);
            stringBuffer.append('\n');
            if (this._unused != null) {
                stringBuffer.append("  ._unused:  ");
                stringBuffer.append(this._unused);
                stringBuffer.append('\n');
            }
            stringBuffer.append("[/LbsDropData]\n");
            return stringBuffer.toString();
        }

        public LbsDropData(LittleEndianInput littleEndianInput) {
            this._wStyle = littleEndianInput.readUShort();
            this._cLine = littleEndianInput.readUShort();
            this._dxMin = littleEndianInput.readUShort();
            String readUnicodeString = StringUtil.readUnicodeString(littleEndianInput);
            this._str = readUnicodeString;
            if (StringUtil.getEncodedSize(readUnicodeString) % 2 != 0) {
                this._unused = Byte.valueOf(littleEndianInput.readByte());
            }
        }
    }

    @Override // lib.zj.office.fc.hssf.record.SubRecord
    public Object clone() {
        return this;
    }

    public LbsDataSubRecord() {
    }
}
