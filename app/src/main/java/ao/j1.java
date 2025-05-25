package ao;

import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class j1 implements androidx.lifecycle.x<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f5081a;

    public j1(ReaderPreviewActivity readerPreviewActivity) {
        this.f5081a = readerPreviewActivity;
    }

    @Override // androidx.lifecycle.x
    public final void m(Integer num) {
        this.f5081a.D.post(new androidx.fragment.app.a1(16, this, num));
    }
}
