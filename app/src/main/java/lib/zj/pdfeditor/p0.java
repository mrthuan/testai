package lib.zj.pdfeditor;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Message;
import android.widget.ProgressBar;
import java.lang.ref.WeakReference;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;

/* compiled from: SearchTask.java */
/* loaded from: classes3.dex */
public abstract class p0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f21553a;

    /* renamed from: b  reason: collision with root package name */
    public ReaderPDFCore f21554b;
    public final b c;

    /* renamed from: d  reason: collision with root package name */
    public e f21555d;

    /* renamed from: e  reason: collision with root package name */
    public int f21556e;

    /* renamed from: f  reason: collision with root package name */
    public a f21557f;

    /* compiled from: SearchTask.java */
    /* loaded from: classes3.dex */
    public class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public final String f21558a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f21559b;
        public final int c;

        /* compiled from: SearchTask.java */
        /* renamed from: lib.zj.pdfeditor.p0$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class RunnableC0286a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ q0 f21561a;

            public RunnableC0286a(q0 q0Var) {
                this.f21561a = q0Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                q0 q0Var = this.f21561a;
                if (q0Var != null) {
                    p0.this.b(q0Var, aVar.f21559b);
                } else {
                    p0.this.b(null, aVar.f21559b);
                }
            }
        }

        public a(String str, boolean z10, int i10) {
            this.f21558a = str;
            this.f21559b = z10;
            this.c = i10;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            q0 q0Var;
            p0 p0Var = p0.this;
            boolean hasMessages = p0Var.c.hasMessages(10);
            b bVar = p0Var.c;
            if (hasMessages) {
                bVar.removeMessages(10);
            }
            bVar.sendEmptyMessageDelayed(10, 200L);
            int i10 = p0Var.f21556e;
            int i11 = i10;
            while (i11 >= 0 && i11 < p0Var.f21554b.countPages() && !Thread.currentThread().isInterrupted()) {
                Message obtainMessage = bVar.obtainMessage();
                obtainMessage.what = 11;
                int i12 = this.c;
                if (i12 == -1) {
                    int i13 = i10 - i11;
                    if (i13 < 0) {
                        i13 = 0;
                    }
                    obtainMessage.arg1 = i13;
                    obtainMessage.arg2 = i11;
                } else {
                    obtainMessage.arg1 = i11;
                }
                obtainMessage.sendToTarget();
                ReaderPDFCore readerPDFCore = p0Var.f21554b;
                String str = this.f21558a;
                RectF[] searchPage = readerPDFCore.searchPage(i11, str);
                if (searchPage != null && searchPage.length > 0) {
                    q0Var = new q0(str, i11, searchPage);
                    break;
                }
                boolean z10 = this.f21559b;
                if (!z10) {
                    i11 += i12;
                    continue;
                }
                if (z10) {
                    break;
                }
            }
            q0Var = null;
            Context context = p0Var.f21553a;
            if (context != null && (context instanceof Activity) && !Thread.currentThread().isInterrupted()) {
                if (bVar.hasMessages(10)) {
                    bVar.removeMessages(10);
                }
                bVar.sendEmptyMessage(13);
                ((Activity) context).runOnUiThread(new RunnableC0286a(q0Var));
            }
            if (bVar.hasMessages(10)) {
                bVar.removeMessages(10);
            }
            if (bVar.hasMessages(13)) {
                bVar.sendEmptyMessage(13);
            }
        }
    }

    /* compiled from: SearchTask.java */
    /* loaded from: classes3.dex */
    public class b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<Context> f21563a;

        public b(Context context) {
            this.f21563a = new WeakReference<>(context);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            WeakReference<Context> weakReference;
            e eVar;
            if (message != null && (weakReference = this.f21563a) != null && weakReference.get() != null) {
                Context context = weakReference.get();
                int i10 = message.what;
                p0 p0Var = p0.this;
                if (10 == i10) {
                    e eVar2 = p0Var.f21555d;
                    if (eVar2 != null && !eVar2.isShowing()) {
                        ((ReaderPreviewActivity.l0) p0Var).getClass();
                        tn.a.d(context, ea.a.p("RWkudw==", "VyS6qSij"), ea.a.p("OWlUdyZzUmEoYyJfGW8JZGpzBm93", "CORrDrBA"), ea.a.p("P2Rm", "TFZhtQAA"), false);
                        p0Var.f21555d.show();
                        p0Var.f21555d.t(p0Var.f21556e, -1);
                    }
                } else if (11 == i10) {
                    e eVar3 = p0Var.f21555d;
                    if (eVar3 != null && eVar3.isShowing()) {
                        p0Var.f21555d.t(message.arg1, message.arg2);
                    }
                } else if (13 == i10 && (eVar = p0Var.f21555d) != null) {
                    eVar.cancel();
                    removeCallbacksAndMessages(null);
                }
            }
        }
    }

    public p0(Context context, ReaderPDFCore readerPDFCore) {
        this.f21553a = context;
        this.f21554b = readerPDFCore;
        this.c = new b(context);
        new AlertDialog.Builder(context);
    }

    public final void a(String str, int i10, int i11, int i12, boolean z10) {
        if (this.f21554b == null) {
            return;
        }
        a aVar = this.f21557f;
        if (aVar != null) {
            try {
                aVar.interrupt();
            } catch (Exception unused) {
            }
        }
        if (i12 != -1) {
            i11 = i12 + i10;
        }
        this.f21556e = i11;
        boolean z11 = false;
        if (this.f21555d == null) {
            e eVar = new e(this.f21553a);
            this.f21555d = eVar;
            eVar.f21475h = 1;
            eVar.setTitle(ReaderPdfApplication.m().getResources().getString(R.string.arg_res_0x7f130459));
            this.f21555d.setOnCancelListener(null);
            this.f21555d.setOnCancelListener(new o0(this, 0));
            e eVar2 = this.f21555d;
            int countPages = this.f21554b.countPages();
            ProgressBar progressBar = eVar2.f21474g;
            if (progressBar != null) {
                progressBar.setMax(countPages);
                eVar2.s();
            } else {
                eVar2.f21480m = countPages;
            }
        }
        e eVar3 = this.f21555d;
        if (i10 == -1) {
            z11 = true;
        }
        eVar3.f21492y = z11;
        a aVar2 = new a(str, z10, i10);
        this.f21557f = aVar2;
        aVar2.start();
    }

    public abstract void b(q0 q0Var, boolean z10);
}
