package lib.zj.office.fc.hpsf;

import java.util.Date;

/* loaded from: classes3.dex */
public final class SummaryInformation extends SpecialPropertySet {
    public static final String DEFAULT_STREAM_NAME = "\u0005SummaryInformation";

    public SummaryInformation(PropertySet propertySet) {
        super(propertySet);
        if (isSummaryInformation()) {
            return;
        }
        throw new UnexpectedPropertySetTypeException("Not a ".concat(SummaryInformation.class.getName()));
    }

    public String getApplicationName() {
        return (String) getProperty(18);
    }

    public String getAuthor() {
        return (String) getProperty(4);
    }

    public int getCharCount() {
        return getPropertyIntValue(16);
    }

    public String getComments() {
        return (String) getProperty(6);
    }

    public Date getCreateDateTime() {
        return (Date) getProperty(12);
    }

    public long getEditTime() {
        Date date = (Date) getProperty(10);
        if (date == null) {
            return 0L;
        }
        return Util.dateToFileTime(date);
    }

    public String getKeywords() {
        return (String) getProperty(5);
    }

    public String getLastAuthor() {
        return (String) getProperty(8);
    }

    public Date getLastPrinted() {
        return (Date) getProperty(11);
    }

    public Date getLastSaveDateTime() {
        return (Date) getProperty(13);
    }

    public int getPageCount() {
        return getPropertyIntValue(14);
    }

    @Override // lib.zj.office.fc.hpsf.SpecialPropertySet
    public PropertyIDMap getPropertySetIDMap() {
        return PropertyIDMap.getSummaryInformationProperties();
    }

    public String getRevNumber() {
        return (String) getProperty(9);
    }

    public int getSecurity() {
        return getPropertyIntValue(19);
    }

    public String getSubject() {
        return (String) getProperty(3);
    }

    public String getTemplate() {
        return (String) getProperty(7);
    }

    public byte[] getThumbnail() {
        return (byte[]) getProperty(17);
    }

    public String getTitle() {
        return (String) getProperty(2);
    }

    public int getWordCount() {
        return getPropertyIntValue(15);
    }

    public void removeApplicationName() {
        ((MutableSection) getFirstSection()).removeProperty(18L);
    }

    public void removeAuthor() {
        ((MutableSection) getFirstSection()).removeProperty(4L);
    }

    public void removeCharCount() {
        ((MutableSection) getFirstSection()).removeProperty(16L);
    }

    public void removeComments() {
        ((MutableSection) getFirstSection()).removeProperty(6L);
    }

    public void removeCreateDateTime() {
        ((MutableSection) getFirstSection()).removeProperty(12L);
    }

    public void removeEditTime() {
        ((MutableSection) getFirstSection()).removeProperty(10L);
    }

    public void removeKeywords() {
        ((MutableSection) getFirstSection()).removeProperty(5L);
    }

    public void removeLastAuthor() {
        ((MutableSection) getFirstSection()).removeProperty(8L);
    }

    public void removeLastPrinted() {
        ((MutableSection) getFirstSection()).removeProperty(11L);
    }

    public void removeLastSaveDateTime() {
        ((MutableSection) getFirstSection()).removeProperty(13L);
    }

    public void removePageCount() {
        ((MutableSection) getFirstSection()).removeProperty(14L);
    }

    public void removeRevNumber() {
        ((MutableSection) getFirstSection()).removeProperty(9L);
    }

    public void removeSecurity() {
        ((MutableSection) getFirstSection()).removeProperty(19L);
    }

    public void removeSubject() {
        ((MutableSection) getFirstSection()).removeProperty(3L);
    }

    public void removeTemplate() {
        ((MutableSection) getFirstSection()).removeProperty(7L);
    }

    public void removeThumbnail() {
        ((MutableSection) getFirstSection()).removeProperty(17L);
    }

    public void removeTitle() {
        ((MutableSection) getFirstSection()).removeProperty(2L);
    }

    public void removeWordCount() {
        ((MutableSection) getFirstSection()).removeProperty(15L);
    }

    public void setApplicationName(String str) {
        ((MutableSection) getFirstSection()).setProperty(18, str);
    }

    public void setAuthor(String str) {
        ((MutableSection) getFirstSection()).setProperty(4, str);
    }

    public void setCharCount(int i10) {
        ((MutableSection) getFirstSection()).setProperty(16, i10);
    }

    public void setComments(String str) {
        ((MutableSection) getFirstSection()).setProperty(6, str);
    }

    public void setCreateDateTime(Date date) {
        ((MutableSection) getFirstSection()).setProperty(12, 64L, date);
    }

    public void setEditTime(long j10) {
        ((MutableSection) getFirstSection()).setProperty(10, 64L, Util.filetimeToDate(j10));
    }

    public void setKeywords(String str) {
        ((MutableSection) getFirstSection()).setProperty(5, str);
    }

    public void setLastAuthor(String str) {
        ((MutableSection) getFirstSection()).setProperty(8, str);
    }

    public void setLastPrinted(Date date) {
        ((MutableSection) getFirstSection()).setProperty(11, 64L, date);
    }

    public void setLastSaveDateTime(Date date) {
        ((MutableSection) getFirstSection()).setProperty(13, 64L, date);
    }

    public void setPageCount(int i10) {
        ((MutableSection) getFirstSection()).setProperty(14, i10);
    }

    public void setRevNumber(String str) {
        ((MutableSection) getFirstSection()).setProperty(9, str);
    }

    public void setSecurity(int i10) {
        ((MutableSection) getFirstSection()).setProperty(19, i10);
    }

    public void setSubject(String str) {
        ((MutableSection) getFirstSection()).setProperty(3, str);
    }

    public void setTemplate(String str) {
        ((MutableSection) getFirstSection()).setProperty(7, str);
    }

    public void setThumbnail(byte[] bArr) {
        ((MutableSection) getFirstSection()).setProperty(17, 30L, bArr);
    }

    public void setTitle(String str) {
        ((MutableSection) getFirstSection()).setProperty(2, str);
    }

    public void setWordCount(int i10) {
        ((MutableSection) getFirstSection()).setProperty(15, i10);
    }
}
