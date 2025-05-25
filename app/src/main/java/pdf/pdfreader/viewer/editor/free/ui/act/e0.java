package pdf.pdfreader.viewer.editor.free.ui.act;

import android.os.Build;
import android.os.Handler;

/* compiled from: ReaderHomeActivity.java */
/* loaded from: classes3.dex */
public final class e0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26922a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderHomeActivity f26923b;

    public e0(ReaderHomeActivity readerHomeActivity, int i10) {
        this.f26923b = readerHomeActivity;
        this.f26922a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        ReaderHomeActivity readerHomeActivity = this.f26923b;
        readerHomeActivity.R1 = this.f26922a;
        if (pdf.pdfreader.viewer.editor.free.utils.extension.a.b(readerHomeActivity)) {
            return;
        }
        pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.c cVar = readerHomeActivity.E0;
        boolean z11 = true;
        if (cVar != null && cVar.f27674h.d()) {
            readerHomeActivity.V1 = true;
        } else if (pdf.pdfreader.viewer.editor.free.utils.extension.c.g(readerHomeActivity)) {
            readerHomeActivity.W2();
        } else {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                z10 = true;
            } else {
                z10 = false;
            }
            androidx.activity.result.c<String[]> cVar2 = readerHomeActivity.U1;
            r rVar = readerHomeActivity.Q1;
            Handler handler = readerHomeActivity.O;
            if (z10) {
                if (!pdf.pdfreader.viewer.editor.free.utils.extension.c.e(readerHomeActivity) && !pdf.pdfreader.viewer.editor.free.utils.extension.c.d(readerHomeActivity)) {
                    handler.postDelayed(rVar, 500L);
                    cVar2.a(new String[]{ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFIAQSFfJUUFSSRfI00OR3RT", "yuTthAej"), ea.a.p("Km4OcilpHC44ZRRtXXMkaVdufFIMQXJfOUU1SRBfFEkYVStMGVUrRRpfNUV4RRRUfUQ=", "BmKjFxNq")});
                    return;
                }
                readerHomeActivity.W2();
                return;
            }
            if (i10 < 33) {
                z11 = false;
            }
            if (z11) {
                if (pdf.pdfreader.viewer.editor.free.utils.extension.c.d(readerHomeActivity)) {
                    readerHomeActivity.W2();
                    return;
                }
                handler.postDelayed(rVar, 500L);
                cVar2.a(new String[]{ea.a.p("Um4vchxpBi4CZUZtAHMlaStuHFIDQQdfCEUUSSdfcU1yRw5T", "EPf8lc2a")});
            } else if (pdf.pdfreader.viewer.editor.free.utils.extension.c.b(readerHomeActivity)) {
                readerHomeActivity.W2();
            } else {
                handler.postDelayed(rVar, 500L);
                readerHomeActivity.T1.a(new String[]{ea.a.p("Um4vchxpBi4CZUZtAHMlaStuHFIDQQdfFFgbRTtODUxsUx9PIUElRQ==", "QOiL9BK0"), ea.a.p("G24HcjtpUy44ZRRtXXMkaVdufFcbSWJFK0UpVBRSDEE2XzBUG1J2R0U=", "nFzcT7ij")});
            }
        }
    }
}
