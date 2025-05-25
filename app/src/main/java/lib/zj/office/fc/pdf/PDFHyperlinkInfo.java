package lib.zj.office.fc.pdf;

import android.graphics.RectF;

/* loaded from: classes3.dex */
public class PDFHyperlinkInfo extends RectF {
    private int pageNumber;
    private String strURI;

    public PDFHyperlinkInfo(float f10, float f11, float f12, float f13, int i10, String str) {
        super(f10, f11, f12, f13);
        this.pageNumber = i10;
        this.strURI = str;
    }

    public int getPageNumber() {
        return this.pageNumber;
    }

    public String getURL() {
        return this.strURI;
    }
}
