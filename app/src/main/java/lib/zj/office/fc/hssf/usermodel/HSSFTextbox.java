package lib.zj.office.fc.hssf.usermodel;

import androidx.activity.s;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.ss.usermodel.RichTextString;

/* loaded from: classes3.dex */
public class HSSFTextbox extends HSSFSimpleShape {
    public static final short HORIZONTAL_ALIGNMENT_CENTERED = 2;
    public static final short HORIZONTAL_ALIGNMENT_DISTRIBUTED = 7;
    public static final short HORIZONTAL_ALIGNMENT_JUSTIFIED = 4;
    public static final short HORIZONTAL_ALIGNMENT_LEFT = 1;
    public static final short HORIZONTAL_ALIGNMENT_RIGHT = 3;
    public static final short OBJECT_TYPE_TEXT = 6;
    public static final short VERTICAL_ALIGNMENT_BOTTOM = 3;
    public static final short VERTICAL_ALIGNMENT_CENTER = 2;
    public static final short VERTICAL_ALIGNMENT_DISTRIBUTED = 7;
    public static final short VERTICAL_ALIGNMENT_JUSTIFY = 4;
    public static final short VERTICAL_ALIGNMENT_TOP = 1;
    private int fontColor;
    private short halign;
    private boolean isWordArt;
    private boolean isWrapLine;
    private int marginBottom;
    private int marginLeft;
    private int marginRight;
    private int marginTop;
    HSSFRichTextString string;
    private short valign;

    public HSSFTextbox(EscherContainerRecord escherContainerRecord, HSSFShape hSSFShape, HSSFAnchor hSSFAnchor) {
        super(escherContainerRecord, hSSFShape, hSSFAnchor);
        this.string = new HSSFRichTextString("");
        setShapeType(6);
        this.halign = (short) 1;
        this.valign = (short) 1;
        this.marginLeft = Math.round(s.c0(escherContainerRecord));
        this.marginTop = Math.round(s.e0(escherContainerRecord));
        this.marginRight = Math.round(s.d0(escherContainerRecord));
        this.marginBottom = Math.round(s.b0(escherContainerRecord));
        this.isWrapLine = s.m0(escherContainerRecord);
    }

    public int getFontColor() {
        return this.fontColor;
    }

    public short getHorizontalAlignment() {
        return this.halign;
    }

    public int getMarginBottom() {
        return this.marginBottom;
    }

    public int getMarginLeft() {
        return this.marginLeft;
    }

    public int getMarginRight() {
        return this.marginRight;
    }

    public int getMarginTop() {
        return this.marginTop;
    }

    public HSSFRichTextString getString() {
        return this.string;
    }

    public short getVerticalAlignment() {
        return this.valign;
    }

    public boolean isTextboxWrapLine() {
        return this.isWrapLine;
    }

    public boolean isWordArt() {
        return this.isWordArt;
    }

    public void setFontColor(int i10) {
        this.fontColor = i10;
    }

    public void setHorizontalAlignment(short s4) {
        this.halign = s4;
    }

    public void setMarginBottom(int i10) {
        this.marginBottom = i10;
    }

    public void setMarginLeft(int i10) {
        this.marginLeft = i10;
    }

    public void setMarginRight(int i10) {
        this.marginRight = i10;
    }

    public void setMarginTop(int i10) {
        this.marginTop = i10;
    }

    public void setString(RichTextString richTextString) {
        HSSFRichTextString hSSFRichTextString = (HSSFRichTextString) richTextString;
        if (hSSFRichTextString.numFormattingRuns() == 0) {
            hSSFRichTextString.applyFont((short) 0);
        }
        this.string = hSSFRichTextString;
    }

    public void setVerticalAlignment(short s4) {
        this.valign = s4;
    }

    public void setWordArt(boolean z10) {
        this.isWordArt = z10;
    }
}
