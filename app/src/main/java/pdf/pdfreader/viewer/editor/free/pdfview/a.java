package pdf.pdfreader.viewer.editor.free.pdfview;

import pdf.pdfreader.viewer.editor.free.pdfview.b;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.data.SignAction;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.data.SignActionInfo;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.db.SignPathActionInfo;
import xo.g;
import yo.c;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b.a f26412a;

    public a(b.a aVar) {
        this.f26412a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b.a aVar = this.f26412a;
        b.this.c.Q3();
        b bVar = b.this;
        SignActionInfo signActionInfo = bVar.c.q5;
        if (signActionInfo != null && signActionInfo.getStampAnnotData() != null) {
            long j10 = bVar.c.q5.getStampAnnotData().f19799a;
            if (bVar.f26414b != null) {
                bVar.c.f26259t5.put(Long.valueOf(j10), Integer.valueOf(bVar.f26414b.getSize()));
                bVar.c.f26266u5.put(Long.valueOf(j10), Integer.valueOf(bVar.f26414b.getColor()));
            }
            xo.g gVar = g.a.f31902a;
            SignPathActionInfo signPathActionInfo = bVar.f26414b;
            if (signPathActionInfo != null) {
                gVar.f31901a.put(Long.valueOf(j10), signPathActionInfo);
            } else {
                gVar.getClass();
            }
            SignActionInfo signActionInfo2 = new SignActionInfo(bVar.c.q5);
            signActionInfo2.setAction(SignAction.Remove);
            signActionInfo2.setSignPathActionInfo(bVar.f26414b);
            SignActionInfo signActionInfo3 = new SignActionInfo(bVar.c.q5);
            signActionInfo3.setAction(SignAction.Add);
            signActionInfo2.setSignPathActionInfo(bVar.f26414b);
            c.a.f32211a.a(signActionInfo2, signActionInfo3);
            bVar.c.q5 = new SignActionInfo(signActionInfo3);
        }
    }
}
