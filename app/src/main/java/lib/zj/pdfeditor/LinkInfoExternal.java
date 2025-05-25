package lib.zj.pdfeditor;

/* loaded from: classes3.dex */
public class LinkInfoExternal extends LinkInfo {
    public final String url;

    public LinkInfoExternal(float f10, float f11, float f12, float f13, String str) {
        super(f10, f11, f12, f13);
        this.url = str;
    }

    @Override // lib.zj.pdfeditor.LinkInfo
    public void acceptVisitor(f fVar) {
        PDFReaderView.this.Z0(this.url);
    }
}
