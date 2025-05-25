package lib.zj.office.fc.pdf;

/* loaded from: classes3.dex */
public class PDFOutlineItem {
    private final int level;
    private final int pageNumber;
    private final String title;

    public PDFOutlineItem(int i10, String str, int i11) {
        this.level = i10;
        this.title = str;
        this.pageNumber = i11;
    }

    public int getLevel() {
        return this.level;
    }

    public int getPageNumber() {
        return this.pageNumber;
    }

    public String getTitle() {
        return this.title;
    }
}
