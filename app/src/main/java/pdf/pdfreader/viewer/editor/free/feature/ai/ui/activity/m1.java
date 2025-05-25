package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import android.os.Bundle;
import android.os.Handler;
import lib.zj.pdfeditor.ReaderPDFCore;

/* compiled from: ReaderAIPreviewActivity.java */
/* loaded from: classes3.dex */
public final class m1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f24623a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bundle f24624b;
    public final /* synthetic */ ReaderAIPreviewActivity c;

    /* compiled from: ReaderAIPreviewActivity.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            m1 m1Var = m1.this;
            if (!m1Var.c.isFinishing() && !m1Var.c.isDestroyed()) {
                m1Var.c.G2(m1Var.f24624b);
            }
        }
    }

    public m1(ReaderAIPreviewActivity readerAIPreviewActivity, String str, Bundle bundle) {
        this.c = readerAIPreviewActivity;
        this.f24623a = str;
        this.f24624b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        a aVar;
        ReaderAIPreviewActivity readerAIPreviewActivity = this.c;
        try {
            readerAIPreviewActivity.f24479c0 = new ReaderPDFCore(readerAIPreviewActivity, this.f24623a);
            readerAIPreviewActivity.f24479c0.setStateListener(readerAIPreviewActivity);
            readerAIPreviewActivity.f24479c0.countPages();
            handler = readerAIPreviewActivity.M;
            aVar = new a();
        } catch (Exception | OutOfMemoryError unused) {
            handler = readerAIPreviewActivity.M;
            aVar = new a();
        } catch (Throwable th2) {
            readerAIPreviewActivity.M.post(new a());
            throw th2;
        }
        handler.post(aVar);
    }
}
