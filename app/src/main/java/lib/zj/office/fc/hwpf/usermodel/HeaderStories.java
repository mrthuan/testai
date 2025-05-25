package lib.zj.office.fc.hwpf.usermodel;

import lib.zj.office.fc.hwpf.HWPFDocument;
import lib.zj.office.fc.hwpf.model.FileInformationBlock;
import lib.zj.office.fc.hwpf.model.GenericPropertyNode;
import lib.zj.office.fc.hwpf.model.PlexOfCps;
import lib.zj.office.fc.hwpf.model.SubdocumentType;

/* loaded from: classes3.dex */
public final class HeaderStories {
    private Range headerStories;
    private PlexOfCps plcfHdd;
    private boolean stripFields = false;

    public HeaderStories(HWPFDocument hWPFDocument) {
        this.headerStories = hWPFDocument.getHeaderStoryRange();
        FileInformationBlock fileInformationBlock = hWPFDocument.getFileInformationBlock();
        if (fileInformationBlock.getSubdocumentTextStreamLength(SubdocumentType.HEADER) == 0 || fileInformationBlock.getPlcfHddSize() == 0) {
            return;
        }
        this.plcfHdd = new PlexOfCps(hWPFDocument.getTableStream(), fileInformationBlock.getPlcfHddOffset(), fileInformationBlock.getPlcfHddSize(), 0);
    }

    @Deprecated
    private String getAt(int i10) {
        PlexOfCps plexOfCps = this.plcfHdd;
        if (plexOfCps == null) {
            return null;
        }
        GenericPropertyNode property = plexOfCps.getProperty(i10);
        if (property.getStart() == property.getEnd() || property.getEnd() < property.getStart()) {
            return "";
        }
        String text = this.headerStories.text();
        String substring = text.substring(Math.min(property.getStart(), text.length()), Math.min(property.getEnd(), text.length()));
        if (this.stripFields) {
            return Range.stripFields(substring);
        }
        if (substring.equals("\r\r")) {
            return "";
        }
        return substring;
    }

    private Range getSubrangeAt(int i10) {
        PlexOfCps plexOfCps = this.plcfHdd;
        if (plexOfCps == null) {
            return null;
        }
        GenericPropertyNode property = plexOfCps.getProperty(i10);
        if (property.getStart() == property.getEnd() || property.getEnd() < property.getStart()) {
            return null;
        }
        int endOffset = this.headerStories.getEndOffset() - this.headerStories.getStartOffset();
        return new Range(this.headerStories.getStartOffset() + Math.min(property.getStart(), endOffset), this.headerStories.getStartOffset() + Math.min(property.getEnd(), endOffset), this.headerStories);
    }

    public boolean areFieldsStripped() {
        return this.stripFields;
    }

    @Deprecated
    public String getEndnoteContNote() {
        return getAt(5);
    }

    public Range getEndnoteContNoteSubrange() {
        return getSubrangeAt(5);
    }

    @Deprecated
    public String getEndnoteContSeparator() {
        return getAt(4);
    }

    public Range getEndnoteContSeparatorSubrange() {
        return getSubrangeAt(4);
    }

    @Deprecated
    public String getEndnoteSeparator() {
        return getAt(3);
    }

    public Range getEndnoteSeparatorSubrange() {
        return getSubrangeAt(3);
    }

    @Deprecated
    public String getEvenFooter() {
        return getAt(8);
    }

    public Range getEvenFooterSubrange() {
        return getSubrangeAt(8);
    }

    @Deprecated
    public String getEvenHeader() {
        return getAt(6);
    }

    public Range getEvenHeaderSubrange() {
        return getSubrangeAt(6);
    }

    @Deprecated
    public String getFirstFooter() {
        return getAt(11);
    }

    public Range getFirstFooterSubrange() {
        return getSubrangeAt(11);
    }

    @Deprecated
    public String getFirstHeader() {
        return getAt(10);
    }

    public Range getFirstHeaderSubrange() {
        return getSubrangeAt(10);
    }

    public String getFooter(int i10) {
        if (i10 == 1 && getFirstFooter().length() > 0) {
            return getFirstFooter();
        }
        if (i10 % 2 == 0 && getEvenFooter().length() > 0) {
            return getEvenFooter();
        }
        return getOddFooter();
    }

    @Deprecated
    public String getFootnoteContNote() {
        return getAt(2);
    }

    public Range getFootnoteContNoteSubrange() {
        return getSubrangeAt(2);
    }

    @Deprecated
    public String getFootnoteContSeparator() {
        return getAt(1);
    }

    public Range getFootnoteContSeparatorSubrange() {
        return getSubrangeAt(1);
    }

    @Deprecated
    public String getFootnoteSeparator() {
        return getAt(0);
    }

    public Range getFootnoteSeparatorSubrange() {
        return getSubrangeAt(0);
    }

    public String getHeader(int i10) {
        if (i10 == 1 && getFirstHeader().length() > 0) {
            return getFirstHeader();
        }
        if (i10 % 2 == 0 && getEvenHeader().length() > 0) {
            return getEvenHeader();
        }
        return getOddHeader();
    }

    @Deprecated
    public String getOddFooter() {
        return getAt(9);
    }

    public Range getOddFooterSubrange() {
        return getSubrangeAt(9);
    }

    @Deprecated
    public String getOddHeader() {
        return getAt(7);
    }

    public Range getOddHeaderSubrange() {
        return getSubrangeAt(7);
    }

    public PlexOfCps getPlcfHdd() {
        return this.plcfHdd;
    }

    public Range getRange() {
        return this.headerStories;
    }

    public void setAreFieldsStripped(boolean z10) {
        this.stripFields = z10;
    }
}
