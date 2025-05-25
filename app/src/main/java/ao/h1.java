package ao;

import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.db.SignPathActionInfo;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class h1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f5061a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SignPathActionInfo f5062b;
    public final /* synthetic */ i1 c;

    public h1(i1 i1Var, String str, SignPathActionInfo signPathActionInfo) {
        this.c = i1Var;
        this.f5061a = str;
        this.f5062b = signPathActionInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ReaderPreviewActivity.c2(this.c.f5073a, this.f5061a, this.f5062b.clone());
    }
}
