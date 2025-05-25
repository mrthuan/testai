package pdf.pdfreader.viewer.editor.free.decrypt;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.i;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.collections.m;
import lib.zj.pdfeditor.PDFListener;
import pdf.pdfreader.viewer.editor.free.utils.n0;
import pdf.pdfreader.viewer.editor.free.utils.t1;

/* compiled from: ReaderDecryptAndCopyExecutor.kt */
/* loaded from: classes3.dex */
public final class ReaderDecryptAndCopyExecutor implements xn.c, PDFListener {

    /* renamed from: a  reason: collision with root package name */
    public final Context f24227a;

    /* renamed from: b  reason: collision with root package name */
    public final a f24228b;

    /* renamed from: d  reason: collision with root package name */
    public ExecutorService f24229d;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f24231f;

    /* renamed from: g  reason: collision with root package name */
    public volatile int f24232g;

    /* renamed from: h  reason: collision with root package name */
    public volatile boolean f24233h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f24234i;
    public final Handler c = new Handler(Looper.getMainLooper());

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f24230e = new ArrayList();

    public ReaderDecryptAndCopyExecutor(Context context, a aVar) {
        this.f24227a = context;
        this.f24228b = aVar;
    }

    public final void a(ArrayList targetList) {
        kotlin.jvm.internal.g.e(targetList, "targetList");
        ArrayList arrayList = this.f24230e;
        arrayList.clear();
        arrayList.addAll(targetList);
        this.f24228b.d();
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f24229d = newSingleThreadExecutor;
        if (newSingleThreadExecutor != null) {
            newSingleThreadExecutor.execute(new i(this, 26));
        }
    }

    @Override // xn.c
    public final void c(String str, boolean z10) {
        boolean z11;
        if (str != null && str.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            DecryptContainer decryptContainer = (DecryptContainer) m.t0(this.f24232g, this.f24230e);
            if (decryptContainer != null) {
                decryptContainer.setNewPath(str);
            }
            this.f24232g++;
            String str2 = n0.f28727a;
            if (this.f24232g >= this.f24230e.size()) {
                this.f24228b.b(this.f24230e.size(), this.f24230e.size());
                this.c.postDelayed(new f(this, 1), 50L);
                return;
            }
            return;
        }
        w0(new IllegalArgumentException(ea.a.p("P2FFaFlpRCA_bTp0DCE=", "tMk3Ffg4")));
    }

    @Override // xn.c
    public final void g() {
        this.f24233h = true;
        this.f24228b.a((DecryptContainer) this.f24230e.get(this.f24232g));
    }

    @Override // lib.zj.pdfeditor.PDFListener
    public void onPdfEvent(int i10, int i11, Object obj) {
        if (i11 != 0 && !this.f24234i) {
            this.f24234i = true;
            int size = this.f24230e.size();
            if (size > 0) {
                int i12 = (int) ((((i10 / i11) + this.f24232g) / size) * 100);
                if (i12 >= 100) {
                    i12 = 99;
                }
                this.c.post(new g9.e(this, i12, 1));
            }
            this.c.postDelayed(new f(this, 0), 100L);
        }
    }

    @Override // xn.c
    public final void w0(Throwable th2) {
        this.f24231f = true;
        t1.c(ea.a.p("BmVTZBNyPWUrch9wQEE5ZHtvInkMeFNjAXQecnFlMHI7cg==", "mrT2vyHz"), th2);
        dp.a a10 = dp.a.a();
        Context context = this.f24227a;
        a10.getClass();
        dp.a.d(context, th2);
        a aVar = this.f24228b;
        if (th2 == null) {
            th2 = new IllegalStateException(ea.a.p("JG88eRZhOGRoZANjRnkndBhmM2kldURl", "7xGL6VZ2"));
        }
        aVar.onError(th2);
    }

    @Override // xn.c
    public final void R0() {
    }

    @Override // xn.c
    public final void V(int i10) {
    }
}
