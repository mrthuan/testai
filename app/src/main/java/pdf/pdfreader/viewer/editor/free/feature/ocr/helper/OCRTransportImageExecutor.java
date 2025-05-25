package pdf.pdfreader.viewer.editor.free.feature.ocr.helper;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.fragment.app.u;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.p;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.io.File;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ui.dialog.x;
import pdf.pdfreader.viewer.editor.free.utils.f0;
import pdf.pdfreader.viewer.editor.free.utils.v;
import pdf.pdfreader.viewer.editor.free.utils.w0;
import qb.f1;

/* compiled from: OCRTransportImageExecutor.kt */
/* loaded from: classes3.dex */
public final class OCRTransportImageExecutor implements k<um.a>, androidx.lifecycle.n {

    /* renamed from: a  reason: collision with root package name */
    public final Context f25061a;

    /* renamed from: b  reason: collision with root package name */
    public final cg.l<List<um.a>, tf.d> f25062b;
    public i c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f25063d;

    /* renamed from: e  reason: collision with root package name */
    public long f25064e;

    /* renamed from: f  reason: collision with root package name */
    public List<um.a> f25065f;

    /* renamed from: g  reason: collision with root package name */
    public final c f25066g;

    /* compiled from: OCRTransportImageExecutor.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f25067a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f25067a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OCRTransportImageExecutor(Context context, cg.l<? super List<um.a>, tf.d> lVar) {
        u uVar;
        Lifecycle lifecycle;
        kotlin.jvm.internal.g.e(context, ea.a.p("LG9fdBx4dA==", "cx1jCUh8"));
        ea.a.p("IG53aRdpRGg=", "nBhz8lxd");
        this.f25061a = context;
        this.f25062b = lVar;
        this.c = new DefaultOCRTransportLoading(context);
        this.f25063d = new Handler(Looper.getMainLooper());
        Activity l10 = pdf.pdfreader.viewer.editor.free.utils.extension.c.l(context);
        if (l10 instanceof u) {
            uVar = (u) l10;
        } else {
            uVar = null;
        }
        if (uVar != null && (lifecycle = uVar.getLifecycle()) != null) {
            lifecycle.a(this);
        }
        this.f25066g = new c(this, 0);
    }

    @Override // androidx.lifecycle.n
    public final void d(p pVar, Lifecycle.Event event) {
        if (a.f25067a[event.ordinal()] == 1) {
            this.f25063d.removeCallbacks(this.f25066g);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pdf.pdfreader.viewer.editor.free.feature.ocr.helper.k
    public final void g(List<? extends um.a> images) {
        kotlin.jvm.internal.g.e(images, "images");
        long currentTimeMillis = System.currentTimeMillis() - this.f25064e;
        if (currentTimeMillis < 500) {
            this.f25065f = images;
            this.f25063d.postDelayed(this.f25066g, ((long) OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM) - currentTimeMillis);
            return;
        }
        this.c.cancel();
        this.f25062b.invoke(images);
    }

    public final void j() {
        this.f25064e = System.currentTimeMillis();
        this.c.show();
    }

    public final void l(final l lVar) {
        int i10 = ((((((float) lVar.c()) * 2) / 1000.0f) / 1000.0f) > f0.a() ? 1 : ((((((float) lVar.c()) * 2) / 1000.0f) / 1000.0f) == f0.a() ? 0 : -1));
        Context context = this.f25061a;
        if (i10 > 0) {
            new x(context, context.getString(R.string.arg_res_0x7f1302ad), context.getString(R.string.arg_res_0x7f1304da), context.getString(R.string.arg_res_0x7f130421)).show();
            return;
        }
        final h hVar = new h();
        kotlin.jvm.internal.g.e(context, "context");
        hVar.c = this;
        j();
        hVar.f25086b.set(0);
        if (hVar.f25085a == null) {
            ge.a.z().getClass();
            int[] B = ge.a.B(context);
            hVar.f25085a = new ThreadPoolExecutor(B[0], B[1], 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadPoolExecutor.CallerRunsPolicy());
        }
        final Vector vector = new Vector();
        final int size = lVar.size();
        File file = new File(v.E());
        if (!file.exists()) {
            file.mkdirs();
        }
        final File file2 = new File(file, ea.a.p("LWM2SThhA2U=", "C7BDUdA4"));
        bg.b.z0(file2);
        if (!file2.exists()) {
            file2.mkdir();
        }
        for (int i11 = 0; i11 < size; i11++) {
            ThreadPoolExecutor threadPoolExecutor = hVar.f25085a;
            if (threadPoolExecutor != null) {
                final int i12 = i11;
                threadPoolExecutor.execute(new Runnable() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.helper.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        Runnable fVar;
                        Runnable f1Var;
                        boolean z10;
                        int incrementAndGet;
                        long elapsedRealtimeNanos;
                        l lVar2 = l.this;
                        File file3 = file2;
                        int i13 = i12;
                        h hVar2 = hVar;
                        Vector vector2 = vector;
                        int i14 = size;
                        k kVar = this;
                        kotlin.jvm.internal.g.e(lVar2, ea.a.p("F3ckchhlcg==", "vjiItV5z"));
                        kotlin.jvm.internal.g.e(file3, ea.a.p("a29Scj9vW2Q_cg==", "KOCFeXOb"));
                        kotlin.jvm.internal.g.e(hVar2, ea.a.p("RWhbc2Aw", "2t12DZD9"));
                        kotlin.jvm.internal.g.e(vector2, ea.a.p("F3IucwZsFkkfYVNlcw==", "ET9Apf5e"));
                        kotlin.jvm.internal.g.e(kVar, ea.a.p("a2NQbBViVmNr", "OQmVZuF2"));
                        try {
                            String b10 = lVar2.b(file3, i13);
                            if (b10.length() > 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                synchronized (hVar2) {
                                    elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                                    while (elapsedRealtimeNanos == hVar2.f25087d) {
                                        elapsedRealtimeNanos++;
                                    }
                                    hVar2.f25087d = elapsedRealtimeNanos;
                                }
                                um.a aVar = new um.a(elapsedRealtimeNanos, b10, i13);
                                ul.c a10 = lVar2.a(i13);
                                if (a10 != null) {
                                    ge.a.p(aVar.f30437f, a10);
                                }
                                vector2.add(aVar);
                            }
                            incrementAndGet = hVar2.f25086b.incrementAndGet();
                        } catch (Throwable th2) {
                            try {
                                w0.a().f28791b.execute(new androidx.fragment.app.g(19, hVar2, th2));
                                int incrementAndGet2 = hVar2.f25086b.incrementAndGet();
                                if (incrementAndGet2 == i14) {
                                    f1Var = new f1(kVar, i14, vector2, 3);
                                } else {
                                    fVar = new f(incrementAndGet2, kVar, i14, 0);
                                }
                            } catch (Throwable th3) {
                                int incrementAndGet3 = hVar2.f25086b.incrementAndGet();
                                if (incrementAndGet3 == i14) {
                                    w0.a().f28791b.execute(new pdf.pdfreader.viewer.editor.free.convert.opt.c(kVar, i14, vector2, 2));
                                } else {
                                    w0.a().f28791b.execute(new pdf.pdfreader.viewer.editor.free.convert.opt.d(incrementAndGet3, kVar, i14, 1));
                                }
                                throw th3;
                            }
                        }
                        if (incrementAndGet == i14) {
                            f1Var = new rh.g(kVar, i14, vector2, 1);
                            w0.a().f28791b.execute(f1Var);
                            return;
                        }
                        fVar = new e(incrementAndGet, kVar, i14, 0);
                        w0.a().f28791b.execute(fVar);
                    }
                });
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ocr.helper.k
    public final void c() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ocr.helper.k
    public final void f(Throwable th2) {
    }
}
