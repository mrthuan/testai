package lib.zj.pdfeditor;

/* compiled from: PageView.java */
/* loaded from: classes3.dex */
public final class c0 extends AsyncTask<Void, Void, LinkInfo[]> {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ PageView f21471i;

    public c0(PageView pageView) {
        this.f21471i = pageView;
    }

    @Override // lib.zj.pdfeditor.AsyncTask
    public final LinkInfo[] b(Void[] voidArr) {
        return this.f21471i.getLinkInfo();
    }

    @Override // lib.zj.pdfeditor.AsyncTask
    public final void f(LinkInfo[] linkInfoArr) {
        LinkInfo[] linkInfoArr2 = linkInfoArr;
        if (linkInfoArr2 != null) {
            PageView pageView = this.f21471i;
            pageView.f21307v = linkInfoArr2;
            pageView.q1();
        }
    }
}
