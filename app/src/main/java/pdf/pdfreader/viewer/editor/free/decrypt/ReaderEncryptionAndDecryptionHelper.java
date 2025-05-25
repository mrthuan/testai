package pdf.pdfreader.viewer.editor.free.decrypt;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.i;
import java.io.File;
import java.io.IOException;
import lib.zj.pdfeditor.PDFListener;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ui.dialog.g2;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.t1;
import pdf.pdfreader.viewer.editor.free.utils.v;
import pdf.pdfreader.viewer.editor.free.utils.w0;
import pdf.pdfreader.viewer.editor.free.utils.y0;

/* loaded from: classes3.dex */
public class ReaderEncryptionAndDecryptionHelper implements xn.c, PDFListener {

    /* renamed from: a  reason: collision with root package name */
    public final xn.c f24235a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f24236b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public File f24237d;

    /* renamed from: e  reason: collision with root package name */
    public File f24238e;

    /* renamed from: f  reason: collision with root package name */
    public ReaderPDFCore f24239f;

    /* renamed from: g  reason: collision with root package name */
    public final Handler f24240g = new Handler(Looper.getMainLooper());

    /* renamed from: h  reason: collision with root package name */
    public int f24241h = 0;

    /* renamed from: i  reason: collision with root package name */
    public volatile boolean f24242i = false;

    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f24243a;

        /* renamed from: pdf.pdfreader.viewer.editor.free.decrypt.ReaderEncryptionAndDecryptionHelper$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class RunnableC0331a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ boolean f24245a;

            public RunnableC0331a(boolean z10) {
                this.f24245a = z10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                ReaderEncryptionAndDecryptionHelper.this.f24235a.V(100);
                boolean z10 = this.f24245a;
                boolean z11 = aVar.f24243a;
                ReaderEncryptionAndDecryptionHelper readerEncryptionAndDecryptionHelper = ReaderEncryptionAndDecryptionHelper.this;
                if (!z10) {
                    readerEncryptionAndDecryptionHelper.f24235a.c(readerEncryptionAndDecryptionHelper.f24238e.getAbsolutePath(), z11);
                    return;
                }
                readerEncryptionAndDecryptionHelper.f24235a.w0(new Throwable(ea.a.p("P24zcjJwPGknbkZGVWk7ZWQ=", "drzPKHAY")));
                if (z11) {
                    Context context = readerEncryptionAndDecryptionHelper.f24236b;
                    String string = context.getResources().getString(R.string.arg_res_0x7f130324);
                    readerEncryptionAndDecryptionHelper.getClass();
                    j1.e(context, string, true, null, -1);
                    return;
                }
                Context context2 = readerEncryptionAndDecryptionHelper.f24236b;
                String string2 = context2.getResources().getString(R.string.arg_res_0x7f130323);
                readerEncryptionAndDecryptionHelper.getClass();
                j1.e(context2, string2, true, null, -1);
            }
        }

        public a(boolean z10) {
            this.f24243a = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            ReaderEncryptionAndDecryptionHelper readerEncryptionAndDecryptionHelper = ReaderEncryptionAndDecryptionHelper.this;
            try {
                System.currentTimeMillis();
                t1.b(ea.a.p("HWVQZBxycm45cjNwAWkHbnRuCkQgYxd5HXQ8bz9IMmw_ZUMgGm9HeXpzPmEHdA==", "OUhFmUQW"));
                ea.a.p("aWobZBVUDW8ecw==", "lvuI5EPK");
                ea.a.p("UG87eVNzFmEAdA==", "tVnabPKR");
                boolean z11 = true;
                bg.b.y0(readerEncryptionAndDecryptionHelper.f24237d, readerEncryptionAndDecryptionHelper.f24238e, true, 8192);
                t1.b(ea.a.p("YWUqZBZyJ24Rck1wHWk5bgVuVkQjYzF5RnQ-bz5IImxDZTkgEG8SeVJlWmQ=", "6WPGSj16"));
                ea.a.p("aWobZBVUDW8ecw==", "GVbGbvSD");
                ea.a.p("UG87eVNlDGRSOiA=", "7iLnbxA5");
                System.currentTimeMillis();
                v.b();
                boolean needsPassword = new y0(ReaderPdfApplication.m(), readerEncryptionAndDecryptionHelper.f24238e.getAbsolutePath()).needsPassword();
                boolean z12 = this.f24243a;
                if (!needsPassword) {
                    z10 = false;
                } else {
                    z10 = z12;
                }
                if (z10 == z12) {
                    z11 = false;
                }
                readerEncryptionAndDecryptionHelper.f24240g.post(new RunnableC0331a(z11));
            } catch (Exception e10) {
                t1.c(ea.a.p("P2FCcw5vRWR6YyVwDCANckdvcg==", "3tOcFmlm"), e10);
                readerEncryptionAndDecryptionHelper.w0(e10);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Throwable f24247a;

        public b(Throwable th2) {
            this.f24247a = th2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReaderEncryptionAndDecryptionHelper readerEncryptionAndDecryptionHelper = ReaderEncryptionAndDecryptionHelper.this;
            readerEncryptionAndDecryptionHelper.f24235a.w0(this.f24247a);
            if (readerEncryptionAndDecryptionHelper.c) {
                Context context = readerEncryptionAndDecryptionHelper.f24236b;
                String string = context.getResources().getString(R.string.arg_res_0x7f130324);
                readerEncryptionAndDecryptionHelper.getClass();
                j1.e(context, string, true, null, -1);
                return;
            }
            Context context2 = readerEncryptionAndDecryptionHelper.f24236b;
            String string2 = context2.getResources().getString(R.string.arg_res_0x7f130323);
            readerEncryptionAndDecryptionHelper.getClass();
            j1.e(context2, string2, true, null, -1);
        }
    }

    public ReaderEncryptionAndDecryptionHelper(Context context, g2 g2Var) {
        this.f24236b = context;
        this.f24235a = g2Var;
    }

    @Override // xn.c
    public final void R0() {
        this.f24235a.R0();
    }

    public final void a(String str) {
        try {
            File file = new File(str);
            this.f24238e = file;
            if (file.exists()) {
                String E = v.E();
                File file2 = new File(E, this.f24238e.getName() + ea.a.p("SnAAZg==", "UtddOHyZ"));
                this.f24237d = file2;
                if (file2.exists()) {
                    this.f24237d.delete();
                }
                this.f24237d.createNewFile();
                return;
            }
            j1.e(this.f24236b, ea.a.p("KWldZVluWHR6ZTJpBnRz", "RmpZFeB2"), true, null, -1);
        } catch (IOException e10) {
            t1.c(ea.a.p("P2FCcw5vRWR6bStrECAcZVhwTmYsbGU=", "KBgjWF24"), e10);
            w0(e10);
        }
    }

    @Override // xn.c
    public final void c(String str, boolean z10) {
        this.f24239f = null;
        w0.a().f28790a.execute(new a(z10));
    }

    @Override // xn.c
    public final void g() {
        this.f24235a.g();
    }

    @Override // lib.zj.pdfeditor.PDFListener
    public void onPdfEvent(int i10, int i11, Object obj) {
        if (i11 != 0 && !this.f24242i) {
            this.f24242i = true;
            int i12 = (int) ((i10 / i11) * 100.0f);
            if (this.f24241h != i12) {
                if (i12 >= 100) {
                    this.f24241h = 99;
                } else {
                    this.f24241h = i12;
                }
            }
            this.f24240g.post(new i(this, 27));
            this.f24240g.postDelayed(new g(this, 0), 100L);
        }
    }

    @Override // xn.c
    public final void w0(Throwable th2) {
        dp.a.a().getClass();
        dp.a.d(this.f24236b, th2);
        this.f24240g.post(new b(th2));
    }

    @Override // xn.c
    public final void V(int i10) {
    }
}
