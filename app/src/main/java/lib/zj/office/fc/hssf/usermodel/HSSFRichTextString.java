package lib.zj.office.fc.hssf.usermodel;

import java.util.Iterator;
import lib.zj.office.fc.hssf.model.InternalWorkbook;
import lib.zj.office.fc.hssf.record.LabelSSTRecord;
import lib.zj.office.fc.hssf.record.common.UnicodeString;
import lib.zj.office.fc.ss.usermodel.IFont;
import lib.zj.office.fc.ss.usermodel.RichTextString;

/* loaded from: classes3.dex */
public final class HSSFRichTextString implements Comparable<HSSFRichTextString>, RichTextString {
    public static final short NO_FONT = 0;
    private InternalWorkbook _book;
    private LabelSSTRecord _record;
    private UnicodeString _string;

    public HSSFRichTextString() {
        this("");
    }

    private void addToSSTIfRequired() {
        InternalWorkbook internalWorkbook = this._book;
        if (internalWorkbook != null) {
            int addSSTString = internalWorkbook.addSSTString(this._string);
            this._record.setSSTIndex(addSSTString);
            this._string = this._book.getSSTString(addSSTString);
        }
    }

    private UnicodeString cloneStringIfRequired() {
        if (this._book == null) {
            return this._string;
        }
        return (UnicodeString) this._string.clone();
    }

    @Override // lib.zj.office.fc.ss.usermodel.RichTextString
    public void applyFont(int i10, int i11, short s4) {
        if (i10 <= i11) {
            if (i10 < 0 || i11 > length()) {
                throw new IllegalArgumentException("Start and end index not in range.");
            }
            if (i10 == i11) {
                return;
            }
            short fontAtIndex = i11 != length() ? getFontAtIndex(i11) : (short) 0;
            UnicodeString cloneStringIfRequired = cloneStringIfRequired();
            this._string = cloneStringIfRequired;
            Iterator<UnicodeString.FormatRun> formatIterator = cloneStringIfRequired.formatIterator();
            if (formatIterator != null) {
                while (formatIterator.hasNext()) {
                    UnicodeString.FormatRun next = formatIterator.next();
                    if (next.getCharacterPos() >= i10 && next.getCharacterPos() < i11) {
                        formatIterator.remove();
                    }
                }
            }
            this._string.addFormatRun(new UnicodeString.FormatRun((short) i10, s4));
            if (i11 != length()) {
                this._string.addFormatRun(new UnicodeString.FormatRun((short) i11, fontAtIndex));
            }
            addToSSTIfRequired();
            return;
        }
        throw new IllegalArgumentException("Start index must be less than end index.");
    }

    @Override // lib.zj.office.fc.ss.usermodel.RichTextString
    public void clearFormatting() {
        UnicodeString cloneStringIfRequired = cloneStringIfRequired();
        this._string = cloneStringIfRequired;
        cloneStringIfRequired.clearFormatting();
        addToSSTIfRequired();
    }

    public boolean equals(Object obj) {
        if (obj instanceof HSSFRichTextString) {
            return this._string.equals(((HSSFRichTextString) obj)._string);
        }
        return false;
    }

    public short getFontAtIndex(int i10) {
        int formatRunCount = this._string.getFormatRunCount();
        UnicodeString.FormatRun formatRun = null;
        int i11 = 0;
        while (i11 < formatRunCount) {
            UnicodeString.FormatRun formatRun2 = this._string.getFormatRun(i11);
            if (formatRun2.getCharacterPos() > i10) {
                break;
            }
            i11++;
            formatRun = formatRun2;
        }
        if (formatRun == null) {
            return (short) 0;
        }
        return formatRun.getFontIndex();
    }

    public short getFontOfFormattingRun(int i10) {
        return this._string.getFormatRun(i10).getFontIndex();
    }

    @Override // lib.zj.office.fc.ss.usermodel.RichTextString
    public int getIndexOfFormattingRun(int i10) {
        return this._string.getFormatRun(i10).getCharacterPos();
    }

    public UnicodeString getRawUnicodeString() {
        return this._string;
    }

    public int getSSTIndex() {
        return this._record.getSSTIndex();
    }

    @Override // lib.zj.office.fc.ss.usermodel.RichTextString
    public String getString() {
        return this._string.getString();
    }

    public UnicodeString getUnicodeString() {
        return cloneStringIfRequired();
    }

    @Override // lib.zj.office.fc.ss.usermodel.RichTextString
    public int length() {
        return this._string.getCharCount();
    }

    @Override // lib.zj.office.fc.ss.usermodel.RichTextString
    public int numFormattingRuns() {
        return this._string.getFormatRunCount();
    }

    public void setUnicodeString(UnicodeString unicodeString) {
        this._string = unicodeString;
    }

    public void setWorkbookReferences(InternalWorkbook internalWorkbook, LabelSSTRecord labelSSTRecord) {
        this._book = internalWorkbook;
        this._record = labelSSTRecord;
    }

    public String toString() {
        return this._string.toString();
    }

    public HSSFRichTextString(String str) {
        if (str == null) {
            this._string = new UnicodeString("");
        } else {
            this._string = new UnicodeString(str);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(HSSFRichTextString hSSFRichTextString) {
        return this._string.compareTo(hSSFRichTextString._string);
    }

    public HSSFRichTextString(InternalWorkbook internalWorkbook, LabelSSTRecord labelSSTRecord) {
        setWorkbookReferences(internalWorkbook, labelSSTRecord);
        this._string = internalWorkbook.getSSTString(labelSSTRecord.getSSTIndex());
    }

    @Override // lib.zj.office.fc.ss.usermodel.RichTextString
    public void applyFont(int i10, int i11, IFont iFont) {
        applyFont(i10, i11, ((HSSFFont) iFont).getIndex());
    }

    @Override // lib.zj.office.fc.ss.usermodel.RichTextString
    public void applyFont(IFont iFont) {
        applyFont(0, this._string.getCharCount(), iFont);
    }

    @Override // lib.zj.office.fc.ss.usermodel.RichTextString
    public void applyFont(short s4) {
        applyFont(0, this._string.getCharCount(), s4);
    }
}
