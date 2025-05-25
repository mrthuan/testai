package pdf.pdfreader.viewer.editor.free.pdfview;

import android.os.Bundle;
import android.os.Handler;
import java.util.concurrent.ExecutorService;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.utils.t1;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f26436a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bundle f26437b;
    public final /* synthetic */ ReaderPreviewActivity c;

    /* compiled from: ReaderPreviewActivity.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            j jVar = j.this;
            if (!jVar.c.isFinishing() && !jVar.c.isDestroyed()) {
                ReaderPreviewActivity readerPreviewActivity = jVar.c;
                Bundle bundle = jVar.f26437b;
                ExecutorService executorService = ReaderPreviewActivity.U5;
                readerPreviewActivity.F3(bundle);
            }
        }
    }

    public j(ReaderPreviewActivity readerPreviewActivity, String str, Bundle bundle) {
        this.c = readerPreviewActivity;
        this.f26436a = str;
        this.f26437b = bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.Context, qg.i, pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.Handler] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // java.lang.Runnable
    public final void run() {
        a aVar;
        ReaderPreviewActivity readerPreviewActivity = this.c;
        try {
            try {
                readerPreviewActivity.f26256t1 = new ReaderPDFCore(readerPreviewActivity, this.f26436a);
                readerPreviewActivity.f26256t1.setStateListener(readerPreviewActivity);
                readerPreviewActivity.f26256t1.countPages();
                t1.b(ea.a.p("XHAubjVpDmVSc0FjCmUlc34g", "lKCwdzT0") + readerPreviewActivity.f26262u1);
                Handler handler = readerPreviewActivity.D;
                aVar = new a();
                readerPreviewActivity = handler;
            } catch (Exception | OutOfMemoryError e10) {
                t1.c(ea.a.p("XHAubjVpDmVSZUZyBnJsIA==", "iKjF4R0t") + readerPreviewActivity.f26262u1, e10);
                Handler handler2 = readerPreviewActivity.D;
                aVar = new a();
                readerPreviewActivity = handler2;
            }
            readerPreviewActivity.post(aVar);
        } catch (Throwable th2) {
            readerPreviewActivity.D.post(new a());
            throw th2;
        }
    }
}
