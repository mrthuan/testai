package lib.zj.pdfeditor;

/* loaded from: classes3.dex */
public class LinkInfoRemote extends LinkInfo {
    public final String fileSpec;
    public final boolean newWindow;
    public final int pageNumber;

    public LinkInfoRemote(float f10, float f11, float f12, float f13, String str, int i10, boolean z10) {
        super(f10, f11, f12, f13);
        this.fileSpec = str;
        this.pageNumber = i10;
        this.newWindow = z10;
    }

    @Override // lib.zj.pdfeditor.LinkInfo
    public void acceptVisitor(f fVar) {
        fVar.getClass();
    }
}
