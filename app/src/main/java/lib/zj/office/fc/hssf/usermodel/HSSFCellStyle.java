package lib.zj.office.fc.hssf.usermodel;

import lib.zj.office.fc.hssf.model.InternalWorkbook;
import lib.zj.office.fc.hssf.record.ExtendedFormatRecord;
import lib.zj.office.fc.hssf.record.FontRecord;
import lib.zj.office.fc.hssf.record.StyleRecord;
import lib.zj.office.fc.hssf.util.HSSFColor;
import lib.zj.office.fc.ss.usermodel.ICellStyle;
import lib.zj.office.fc.ss.usermodel.IFont;
import lib.zj.office.fc.ss.usermodel.Workbook;

/* loaded from: classes3.dex */
public final class HSSFCellStyle implements ICellStyle {
    private ExtendedFormatRecord _format;
    private short _index;
    private InternalWorkbook _workbook;

    public HSSFCellStyle(short s4, ExtendedFormatRecord extendedFormatRecord, HSSFWorkbook hSSFWorkbook) {
        this(s4, extendedFormatRecord, hSSFWorkbook.getWorkbook());
    }

    private void checkDefaultBackgroundFills() {
        if (this._format.getFillForeground() == 64) {
            if (this._format.getFillBackground() != 65) {
                setFillBackgroundColor((short) 65);
            }
        } else if (this._format.getFillBackground() == 65 && this._format.getFillForeground() != 64) {
            setFillBackgroundColor((short) 64);
        }
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public void cloneStyleFrom(ICellStyle iCellStyle) {
        if (iCellStyle instanceof HSSFCellStyle) {
            cloneStyleFrom((HSSFCellStyle) iCellStyle);
            return;
        }
        throw new IllegalArgumentException("Can only clone from one HSSFCellStyle to another, not between HSSFCellStyle and XSSFCellStyle");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof HSSFCellStyle)) {
            return false;
        }
        HSSFCellStyle hSSFCellStyle = (HSSFCellStyle) obj;
        ExtendedFormatRecord extendedFormatRecord = this._format;
        if (extendedFormatRecord == null) {
            if (hSSFCellStyle._format != null) {
                return false;
            }
        } else if (!extendedFormatRecord.equals(hSSFCellStyle._format)) {
            return false;
        }
        if (this._index == hSSFCellStyle._index) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public short getAlignment() {
        return this._format.getAlignment();
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public short getBorderBottom() {
        return this._format.getBorderBottom();
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public short getBorderLeft() {
        return this._format.getBorderLeft();
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public short getBorderRight() {
        return this._format.getBorderRight();
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public short getBorderTop() {
        return this._format.getBorderTop();
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public short getBottomBorderColor() {
        return this._format.getBottomBorderPaletteIdx();
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public short getDataFormat() {
        return this._format.getFormatIndex();
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public String getDataFormatString() {
        return getDataFormatString(this._workbook);
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public short getFillBackgroundColor() {
        short fillBackground = this._format.getFillBackground();
        if (fillBackground == 65) {
            return (short) 64;
        }
        return fillBackground;
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public short getFillForegroundColor() {
        return this._format.getFillForeground();
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public short getFillPattern() {
        return this._format.getAdtlFillPattern();
    }

    public HSSFFont getFont(Workbook workbook) {
        return ((HSSFWorkbook) workbook).getFontAt(getFontIndex());
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public short getFontIndex() {
        return this._format.getFontIndex();
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public boolean getHidden() {
        return this._format.isHidden();
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public short getIndention() {
        return this._format.getIndent();
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public short getIndex() {
        return this._index;
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public short getLeftBorderColor() {
        return this._format.getLeftBorderPaletteIdx();
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public boolean getLocked() {
        return this._format.isLocked();
    }

    public HSSFCellStyle getParentStyle() {
        short parentIndex = this._format.getParentIndex();
        if (parentIndex != 0 && parentIndex != 4095) {
            return new HSSFCellStyle(parentIndex, this._workbook.getExFormatAt(parentIndex), this._workbook);
        }
        return null;
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public short getRightBorderColor() {
        return this._format.getRightBorderPaletteIdx();
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public short getRotation() {
        short rotation = this._format.getRotation();
        if (rotation == 255) {
            return rotation;
        }
        if (rotation > 90) {
            return (short) (90 - rotation);
        }
        return rotation;
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public short getTopBorderColor() {
        return this._format.getTopBorderPaletteIdx();
    }

    public String getUserStyleName() {
        StyleRecord styleRecord = this._workbook.getStyleRecord(this._index);
        if (styleRecord == null || styleRecord.isBuiltin()) {
            return null;
        }
        return styleRecord.getName();
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public short getVerticalAlignment() {
        return this._format.getVerticalAlignment();
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public boolean getWrapText() {
        return this._format.getWrapText();
    }

    public int hashCode() {
        int hashCode;
        ExtendedFormatRecord extendedFormatRecord = this._format;
        if (extendedFormatRecord == null) {
            hashCode = 0;
        } else {
            hashCode = extendedFormatRecord.hashCode();
        }
        return ((hashCode + 31) * 31) + this._index;
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public void setAlignment(short s4) {
        this._format.setIndentNotParentAlignment(true);
        this._format.setAlignment(s4);
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public void setBorderBottom(short s4) {
        this._format.setIndentNotParentBorder(true);
        this._format.setBorderBottom(s4);
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public void setBorderLeft(short s4) {
        this._format.setIndentNotParentBorder(true);
        this._format.setBorderLeft(s4);
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public void setBorderRight(short s4) {
        this._format.setIndentNotParentBorder(true);
        this._format.setBorderRight(s4);
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public void setBorderTop(short s4) {
        this._format.setIndentNotParentBorder(true);
        this._format.setBorderTop(s4);
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public void setBottomBorderColor(short s4) {
        this._format.setBottomBorderPaletteIdx(s4);
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public void setDataFormat(short s4) {
        this._format.setFormatIndex(s4);
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public void setFillBackgroundColor(short s4) {
        this._format.setFillBackground(s4);
        checkDefaultBackgroundFills();
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public void setFillForegroundColor(short s4) {
        this._format.setFillForeground(s4);
        checkDefaultBackgroundFills();
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public void setFillPattern(short s4) {
        this._format.setAdtlFillPattern(s4);
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public void setFont(IFont iFont) {
        setFont((HSSFFont) iFont);
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public void setHidden(boolean z10) {
        this._format.setIndentNotParentCellOptions(true);
        this._format.setHidden(z10);
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public void setIndention(short s4) {
        this._format.setIndent(s4);
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public void setLeftBorderColor(short s4) {
        this._format.setLeftBorderPaletteIdx(s4);
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public void setLocked(boolean z10) {
        this._format.setIndentNotParentCellOptions(true);
        this._format.setLocked(z10);
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public void setRightBorderColor(short s4) {
        this._format.setRightBorderPaletteIdx(s4);
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public void setRotation(short s4) {
        if (s4 != 255) {
            if (s4 < 0 && s4 >= -90) {
                s4 = (short) (90 - s4);
            } else if (s4 < -90 || s4 > 90) {
                throw new IllegalArgumentException("The rotation must be between -90 and 90 degrees, or 0xff");
            }
        }
        this._format.setRotation(s4);
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public void setTopBorderColor(short s4) {
        this._format.setTopBorderPaletteIdx(s4);
    }

    public void setUserStyleName(String str) {
        StyleRecord styleRecord = this._workbook.getStyleRecord(this._index);
        if (styleRecord == null) {
            styleRecord = this._workbook.createStyleRecord(this._index);
        }
        if (styleRecord.isBuiltin() && this._index <= 20) {
            throw new IllegalArgumentException("Unable to set user specified style names for built in styles!");
        }
        styleRecord.setName(str);
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public void setVerticalAlignment(short s4) {
        this._format.setVerticalAlignment(s4);
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public void setWrapText(boolean z10) {
        this._format.setIndentNotParentAlignment(true);
        this._format.setWrapText(z10);
    }

    public void verifyBelongsToWorkbook(HSSFWorkbook hSSFWorkbook) {
        if (hSSFWorkbook.getWorkbook() == this._workbook) {
            return;
        }
        throw new IllegalArgumentException("This Style does not belong to the supplied Workbook. Are you trying to assign a style from one workbook to the cell of a differnt workbook?");
    }

    public HSSFCellStyle(short s4, ExtendedFormatRecord extendedFormatRecord, InternalWorkbook internalWorkbook) {
        this._workbook = internalWorkbook;
        this._index = s4;
        this._format = extendedFormatRecord;
    }

    public String getDataFormatString(Workbook workbook) {
        return getDataFormat() == -1 ? "General" : new HSSFDataFormat(((HSSFWorkbook) workbook).getWorkbook()).getFormat(getDataFormat());
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public HSSFColor getFillBackgroundColorColor() {
        return new HSSFPalette(this._workbook.getCustomPalette()).getColor(getFillBackgroundColor());
    }

    @Override // lib.zj.office.fc.ss.usermodel.ICellStyle
    public HSSFColor getFillForegroundColorColor() {
        return new HSSFPalette(this._workbook.getCustomPalette()).getColor(getFillForegroundColor());
    }

    public void setFont(HSSFFont hSSFFont) {
        this._format.setIndentNotParentFont(true);
        this._format.setFontIndex(hSSFFont.getIndex());
    }

    public void cloneStyleFrom(HSSFCellStyle hSSFCellStyle) {
        this._format.cloneStyleFrom(hSSFCellStyle._format);
        InternalWorkbook internalWorkbook = this._workbook;
        if (internalWorkbook != hSSFCellStyle._workbook) {
            setDataFormat((short) internalWorkbook.createFormat(hSSFCellStyle.getDataFormatString()));
            FontRecord createNewFont = this._workbook.createNewFont();
            createNewFont.cloneStyleFrom(hSSFCellStyle._workbook.getFontRecordAt(hSSFCellStyle.getFontIndex()));
            setFont(new HSSFFont((short) this._workbook.getFontIndex(createNewFont), createNewFont));
        }
    }

    public String getDataFormatString(InternalWorkbook internalWorkbook) {
        return HSSFDataFormat.getFormatCode(internalWorkbook, this._format.getFormatIndex());
    }
}
