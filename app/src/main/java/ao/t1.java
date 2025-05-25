package ao;

import android.content.Context;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class t1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u1 f5135a;

    public t1(u1 u1Var) {
        this.f5135a = u1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u1 u1Var = this.f5135a;
        ReaderPreviewActivity readerPreviewActivity = u1Var.f5138a;
        hp.e eVar = readerPreviewActivity.Z;
        if (eVar != null) {
            readerPreviewActivity.f26265u4 = true;
            Context a10 = eVar.a();
            if (a10 != null) {
                int i10 = a10.getResources().getConfiguration().orientation;
                ReaderPreviewActivity readerPreviewActivity2 = u1Var.f5138a;
                if (i10 == 1) {
                    eVar.b(0);
                    pdf.pdfreader.viewer.editor.free.utils.p.t(readerPreviewActivity2, readerPreviewActivity2.f26245r1, false, readerPreviewActivity2.M);
                    return;
                }
                eVar.b(1);
                pdf.pdfreader.viewer.editor.free.utils.p.t(readerPreviewActivity2, readerPreviewActivity2.f26245r1, true, readerPreviewActivity2.M);
            }
        }
    }
}
