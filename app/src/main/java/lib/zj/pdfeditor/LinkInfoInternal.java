package lib.zj.pdfeditor;

/* loaded from: classes3.dex */
public class LinkInfoInternal extends LinkInfo {
    public final int pageNumber;

    public LinkInfoInternal(float f10, float f11, float f12, float f13, int i10) {
        super(f10, f11, f12, f13);
        this.pageNumber = i10;
    }

    @Override // lib.zj.pdfeditor.LinkInfo
    public void acceptVisitor(f fVar) {
        PDFReaderView.this.setDisplayedViewIndex(this.pageNumber);
    }
}
