package pdf.pdfreader.viewer.editor.free.pdfview;

import com.google.android.play.core.assetpacks.b1;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.utils.event.AppCoreFilterEvent;
import pdf.pdfreader.viewer.editor.free.utils.event.AppOpenSource;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class c implements zn.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26416a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f26417b;

    /* compiled from: ReaderPreviewActivity.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* compiled from: ReaderPreviewActivity.java */
        /* renamed from: pdf.pdfreader.viewer.editor.free.pdfview.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class RunnableC0349a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ boolean f26419a;

            public RunnableC0349a(boolean z10) {
                this.f26419a = z10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                if (!c.this.f26417b.isFinishing()) {
                    c cVar = c.this;
                    if (!cVar.f26417b.isDestroyed()) {
                        ReaderPreviewActivity readerPreviewActivity = cVar.f26417b;
                        readerPreviewActivity.x1(readerPreviewActivity.f26274w);
                        ReaderPDFCore readerPDFCore = cVar.f26417b.f26256t1;
                        if (readerPDFCore != null) {
                            readerPDFCore.setSavingPdf(false);
                        }
                        ReaderPreviewActivity.b0 b0Var = cVar.f26417b.f26276w1;
                        if (b0Var != null) {
                            b0Var.setSavingPdf(false);
                        }
                        cVar.f26417b.u3();
                        boolean z10 = this.f26419a;
                        if (z10) {
                            ReaderPreviewActivity readerPreviewActivity2 = cVar.f26417b;
                            readerPreviewActivity2.f26273v5 = false;
                            readerPreviewActivity2.f26280w5 = false;
                            readerPreviewActivity2.f26286x5 = false;
                            b1.Y();
                            cVar.f26417b.getClass();
                            ReaderPreviewActivity.a5();
                            AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
                            if (kotlin.jvm.internal.g.a(AppCoreFilterEvent.c.get(ea.a.p("QGksbixhBmQ=", "lRHCbL0m")), Boolean.TRUE)) {
                                AppCoreFilterEvent.g(ea.a.p("QGksbixzA3Zl", "66WCSy0B"));
                            }
                            AppCoreFilterEvent.a(ea.a.p("PGlWbiZzX293", "EyyREQzc"), ea.a.p("QGksbixhBmQ=", "YSQ9H1S3"));
                            cVar.f26417b.Y4(ea.a.p("JG8KZSxlIGk8XwJvWmU=", "A7GxsDTE"), ea.a.p("L29AZWhzMGcmXwJvWmU=", "dPL27YUO"));
                            cVar.f26417b.S3();
                            if (cVar.f26416a != 3) {
                                ReaderPreviewActivity readerPreviewActivity3 = cVar.f26417b;
                                readerPreviewActivity3.h(readerPreviewActivity3.getString(R.string.arg_res_0x7f1303e5));
                            }
                            cVar.f26417b.S0(false, false);
                            ReaderPreviewActivity.b0 b0Var2 = cVar.f26417b.f26276w1;
                            if (b0Var2 != null) {
                                b0Var2.u0(true);
                            }
                        } else {
                            if (cVar.f26416a == 3) {
                                cVar.f26417b.S3();
                                cVar.f26417b.S0(false, false);
                                ReaderPreviewActivity.b0 b0Var3 = cVar.f26417b.f26276w1;
                                if (b0Var3 != null) {
                                    b0Var3.u0(true);
                                }
                            }
                            tn.a.d(cVar.f26417b, ea.a.p("KmRYdCZzVnZl", "vtur3V2h"), ea.a.p("KmRYdAphQWUFcyt2EF8OYVxs", "oJc8wrJG"), ea.a.p("PGlWbjE=", "dI8nWLnZ"), false);
                            ReaderPreviewActivity readerPreviewActivity4 = cVar.f26417b;
                            readerPreviewActivity4.D4(R.drawable.ic_fail_warning, readerPreviewActivity4.getString(R.string.arg_res_0x7f13044c));
                        }
                        if (cVar.f26416a == 1) {
                            ReaderPreviewActivity readerPreviewActivity5 = cVar.f26417b;
                            readerPreviewActivity5.B1(readerPreviewActivity5.f26274w);
                            if (z10) {
                                cVar.f26417b.H2();
                            }
                        }
                    }
                }
            }
        }

        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 910
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.pdfview.c.a.run():void");
        }
    }

    public c(ReaderPreviewActivity readerPreviewActivity, int i10) {
        this.f26417b = readerPreviewActivity;
        this.f26416a = i10;
    }

    @Override // zn.d
    public final void a() {
        ReaderPreviewActivity readerPreviewActivity = this.f26417b;
        if (readerPreviewActivity.f26256t1 == null || readerPreviewActivity.f26272v4) {
            return;
        }
        readerPreviewActivity.f26272v4 = true;
        readerPreviewActivity.B4 = 0L;
        this.f26417b.A4 = false;
        this.f26417b.f26256t1.setSavingPdf(true);
        ReaderPreviewActivity.b0 b0Var = this.f26417b.f26276w1;
        if (b0Var != null) {
            b0Var.setSavingPdf(true);
        }
        this.f26417b.v3();
        if (this.f26416a == 2) {
            ReaderPreviewActivity readerPreviewActivity2 = this.f26417b;
            readerPreviewActivity2.D.postDelayed(new ao.c(readerPreviewActivity2, 1), 200L);
        }
        t0.V().execute(new a());
    }
}
