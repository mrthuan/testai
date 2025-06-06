package lib.zj.office.fc.hssf.record;

import di.c;
import di.e;
import lib.zj.office.fc.hpsf.Variant;
import lib.zj.office.fc.hslf.record.SlideAtom;
import lib.zj.office.fc.hssf.formula.Formula;
import lib.zj.office.fc.hssf.formula.ptg.Ptg;
import lib.zj.office.fc.hssf.model.HSSFFormulaParser;
import lib.zj.office.fc.hssf.record.cf.BorderFormatting;
import lib.zj.office.fc.hssf.record.cf.FontFormatting;
import lib.zj.office.fc.hssf.record.cf.PatternFormatting;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class CFRuleRecord extends StandardRecord {
    public static final byte CONDITION_TYPE_CELL_VALUE_IS = 1;
    public static final byte CONDITION_TYPE_FORMULA = 2;
    public static final short sid = 433;
    private BorderFormatting _borderFormatting;
    private FontFormatting _fontFormatting;
    private PatternFormatting _patternFormatting;
    private Formula field_17_formula1;
    private Formula field_18_formula2;
    private byte field_1_condition_type;
    private byte field_2_comparison_operator;
    private int field_5_options;
    private short field_6_not_used;
    private static final BitField modificationBits = bf(4194303);
    private static final BitField alignHor = bf(1);
    private static final BitField alignVer = bf(2);
    private static final BitField alignWrap = bf(4);
    private static final BitField alignRot = bf(8);
    private static final BitField alignJustLast = bf(16);
    private static final BitField alignIndent = bf(32);
    private static final BitField alignShrin = bf(64);
    private static final BitField notUsed1 = bf(128);
    private static final BitField protLocked = bf(256);
    private static final BitField protHidden = bf(512);
    private static final BitField bordLeft = bf(1024);
    private static final BitField bordRight = bf(2048);
    private static final BitField bordTop = bf(4096);
    private static final BitField bordBot = bf(8192);
    private static final BitField bordTlBr = bf(16384);
    private static final BitField bordBlTr = bf(Variant.VT_RESERVED);
    private static final BitField pattStyle = bf(65536);
    private static final BitField pattCol = bf(131072);
    private static final BitField pattBgCol = bf(262144);
    private static final BitField notUsed2 = bf(3670016);
    private static final BitField undocumented = bf(62914560);
    private static final BitField fmtBlockBits = bf(2080374784);
    private static final BitField font = bf(67108864);
    private static final BitField align = bf(134217728);
    private static final BitField bord = bf(268435456);
    private static final BitField patt = bf(536870912);
    private static final BitField prot = bf(1073741824);
    private static final BitField alignTextDir = bf(SlideAtom.USES_MASTER_SLIDE_ID);

    /* loaded from: classes3.dex */
    public static final class ComparisonOperator {
        public static final byte BETWEEN = 1;
        public static final byte EQUAL = 3;
        public static final byte GE = 7;
        public static final byte GT = 5;
        public static final byte LE = 8;
        public static final byte LT = 6;
        public static final byte NOT_BETWEEN = 2;
        public static final byte NOT_EQUAL = 4;
        public static final byte NO_COMPARISON = 0;
    }

    private CFRuleRecord(byte b10, byte b11) {
        this.field_1_condition_type = b10;
        this.field_2_comparison_operator = b11;
        int value = modificationBits.setValue(this.field_5_options, -1);
        this.field_5_options = value;
        int value2 = fmtBlockBits.setValue(value, 0);
        this.field_5_options = value2;
        this.field_5_options = undocumented.clear(value2);
        this.field_6_not_used = (short) -32766;
        this._fontFormatting = null;
        this._borderFormatting = null;
        this._patternFormatting = null;
        Ptg[] ptgArr = Ptg.EMPTY_PTG_ARRAY;
        this.field_17_formula1 = Formula.create(ptgArr);
        this.field_18_formula2 = Formula.create(ptgArr);
    }

    private static BitField bf(int i10) {
        return BitFieldFactory.getInstance(i10);
    }

    public static CFRuleRecord create(c cVar, String str) {
        return new CFRuleRecord((byte) 2, (byte) 0, parseFormula(str, cVar), null);
    }

    private static int getFormulaSize(Formula formula) {
        return formula.getEncodedTokenSize();
    }

    private boolean getOptionFlag(BitField bitField) {
        return bitField.isSet(this.field_5_options);
    }

    private boolean isModified(BitField bitField) {
        return !bitField.isSet(this.field_5_options);
    }

    private static Ptg[] parseFormula(String str, c cVar) {
        if (str == null) {
            return null;
        }
        return HSSFFormulaParser.parse(str, (e) cVar.f16601a, 0, ((e) cVar.f16601a).r(cVar));
    }

    private void setModified(boolean z10, BitField bitField) {
        this.field_5_options = bitField.setBoolean(this.field_5_options, !z10);
    }

    private void setOptionFlag(boolean z10, BitField bitField) {
        this.field_5_options = bitField.setBoolean(this.field_5_options, z10);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        CFRuleRecord cFRuleRecord = new CFRuleRecord(this.field_1_condition_type, this.field_2_comparison_operator);
        cFRuleRecord.field_5_options = this.field_5_options;
        cFRuleRecord.field_6_not_used = this.field_6_not_used;
        if (containsFontFormattingBlock()) {
            cFRuleRecord._fontFormatting = (FontFormatting) this._fontFormatting.clone();
        }
        if (containsBorderFormattingBlock()) {
            cFRuleRecord._borderFormatting = (BorderFormatting) this._borderFormatting.clone();
        }
        if (containsPatternFormattingBlock()) {
            cFRuleRecord._patternFormatting = (PatternFormatting) this._patternFormatting.clone();
        }
        cFRuleRecord.field_17_formula1 = this.field_17_formula1.copy();
        cFRuleRecord.field_18_formula2 = this.field_17_formula1.copy();
        return cFRuleRecord;
    }

    public boolean containsAlignFormattingBlock() {
        return getOptionFlag(align);
    }

    public boolean containsBorderFormattingBlock() {
        return getOptionFlag(bord);
    }

    public boolean containsFontFormattingBlock() {
        return getOptionFlag(font);
    }

    public boolean containsPatternFormattingBlock() {
        return getOptionFlag(patt);
    }

    public boolean containsProtectionFormattingBlock() {
        return getOptionFlag(prot);
    }

    public BorderFormatting getBorderFormatting() {
        if (containsBorderFormattingBlock()) {
            return this._borderFormatting;
        }
        return null;
    }

    public byte getComparisonOperation() {
        return this.field_2_comparison_operator;
    }

    public byte getConditionType() {
        return this.field_1_condition_type;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        int i10;
        int i11;
        int i12 = 0;
        if (containsFontFormattingBlock()) {
            i10 = this._fontFormatting.getRawRecord().length;
        } else {
            i10 = 0;
        }
        int i13 = i10 + 12;
        if (containsBorderFormattingBlock()) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        int i14 = i13 + i11;
        if (containsPatternFormattingBlock()) {
            i12 = 4;
        }
        return i14 + i12 + getFormulaSize(this.field_17_formula1) + getFormulaSize(this.field_18_formula2);
    }

    public FontFormatting getFontFormatting() {
        if (containsFontFormattingBlock()) {
            return this._fontFormatting;
        }
        return null;
    }

    public int getOptions() {
        return this.field_5_options;
    }

    public Ptg[] getParsedExpression1() {
        return this.field_17_formula1.getTokens();
    }

    public Ptg[] getParsedExpression2() {
        return Formula.getTokens(this.field_18_formula2);
    }

    public PatternFormatting getPatternFormatting() {
        if (containsPatternFormattingBlock()) {
            return this._patternFormatting;
        }
        return null;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    public boolean isBottomBorderModified() {
        return isModified(bordBot);
    }

    public boolean isBottomLeftTopRightBorderModified() {
        return isModified(bordBlTr);
    }

    public boolean isLeftBorderModified() {
        return isModified(bordLeft);
    }

    public boolean isPatternBackgroundColorModified() {
        return isModified(pattBgCol);
    }

    public boolean isPatternColorModified() {
        return isModified(pattCol);
    }

    public boolean isPatternStyleModified() {
        return isModified(pattStyle);
    }

    public boolean isRightBorderModified() {
        return isModified(bordRight);
    }

    public boolean isTopBorderModified() {
        return isModified(bordTop);
    }

    public boolean isTopLeftBottomRightBorderModified() {
        return isModified(bordTlBr);
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        int formulaSize = getFormulaSize(this.field_17_formula1);
        int formulaSize2 = getFormulaSize(this.field_18_formula2);
        littleEndianOutput.writeByte(this.field_1_condition_type);
        littleEndianOutput.writeByte(this.field_2_comparison_operator);
        littleEndianOutput.writeShort(formulaSize);
        littleEndianOutput.writeShort(formulaSize2);
        littleEndianOutput.writeInt(this.field_5_options);
        littleEndianOutput.writeShort(this.field_6_not_used);
        if (containsFontFormattingBlock()) {
            littleEndianOutput.write(this._fontFormatting.getRawRecord());
        }
        if (containsBorderFormattingBlock()) {
            this._borderFormatting.serialize(littleEndianOutput);
        }
        if (containsPatternFormattingBlock()) {
            this._patternFormatting.serialize(littleEndianOutput);
        }
        this.field_17_formula1.serializeTokens(littleEndianOutput);
        this.field_18_formula2.serializeTokens(littleEndianOutput);
    }

    public void setAlignFormattingUnchanged() {
        setOptionFlag(false, align);
    }

    public void setBorderFormatting(BorderFormatting borderFormatting) {
        boolean z10;
        this._borderFormatting = borderFormatting;
        if (borderFormatting != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        setOptionFlag(z10, bord);
    }

    public void setBottomBorderModified(boolean z10) {
        setModified(z10, bordBot);
    }

    public void setBottomLeftTopRightBorderModified(boolean z10) {
        setModified(z10, bordBlTr);
    }

    public void setComparisonOperation(byte b10) {
        this.field_2_comparison_operator = b10;
    }

    public void setFontFormatting(FontFormatting fontFormatting) {
        boolean z10;
        this._fontFormatting = fontFormatting;
        if (fontFormatting != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        setOptionFlag(z10, font);
    }

    public void setLeftBorderModified(boolean z10) {
        setModified(z10, bordLeft);
    }

    public void setParsedExpression1(Ptg[] ptgArr) {
        this.field_17_formula1 = Formula.create(ptgArr);
    }

    public void setParsedExpression2(Ptg[] ptgArr) {
        this.field_18_formula2 = Formula.create(ptgArr);
    }

    public void setPatternBackgroundColorModified(boolean z10) {
        setModified(z10, pattBgCol);
    }

    public void setPatternColorModified(boolean z10) {
        setModified(z10, pattCol);
    }

    public void setPatternFormatting(PatternFormatting patternFormatting) {
        boolean z10;
        this._patternFormatting = patternFormatting;
        if (patternFormatting != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        setOptionFlag(z10, patt);
    }

    public void setPatternStyleModified(boolean z10) {
        setModified(z10, pattStyle);
    }

    public void setProtectionFormattingUnchanged() {
        setOptionFlag(false, prot);
    }

    public void setRightBorderModified(boolean z10) {
        setModified(z10, bordRight);
    }

    public void setTopBorderModified(boolean z10) {
        setModified(z10, bordTop);
    }

    public void setTopLeftBottomRightBorderModified(boolean z10) {
        setModified(z10, bordTlBr);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[CFRULE]\n");
        stringBuffer.append("    .condition_type   =" + ((int) this.field_1_condition_type));
        stringBuffer.append("    OPTION FLAGS=0x" + Integer.toHexString(getOptions()));
        return stringBuffer.toString();
    }

    public static CFRuleRecord create(c cVar, byte b10, String str, String str2) {
        return new CFRuleRecord((byte) 1, b10, parseFormula(str, cVar), parseFormula(str2, cVar));
    }

    private CFRuleRecord(byte b10, byte b11, Ptg[] ptgArr, Ptg[] ptgArr2) {
        this(b10, b11);
        this.field_17_formula1 = Formula.create(ptgArr);
        this.field_18_formula2 = Formula.create(ptgArr2);
    }

    public CFRuleRecord(RecordInputStream recordInputStream) {
        this.field_1_condition_type = recordInputStream.readByte();
        this.field_2_comparison_operator = recordInputStream.readByte();
        int readUShort = recordInputStream.readUShort();
        int readUShort2 = recordInputStream.readUShort();
        this.field_5_options = recordInputStream.readInt();
        this.field_6_not_used = recordInputStream.readShort();
        if (containsFontFormattingBlock()) {
            this._fontFormatting = new FontFormatting(recordInputStream);
        }
        if (containsBorderFormattingBlock()) {
            this._borderFormatting = new BorderFormatting(recordInputStream);
        }
        if (containsPatternFormattingBlock()) {
            this._patternFormatting = new PatternFormatting(recordInputStream);
        }
        this.field_17_formula1 = Formula.read(readUShort, recordInputStream);
        this.field_18_formula2 = Formula.read(readUShort2, recordInputStream);
    }
}
