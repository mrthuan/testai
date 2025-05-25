package pdf.pdfreader.viewer.editor.free.split;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.widget.z0;
import bg.b;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.g;
import kotlin.text.j;
import lib.zj.pdfeditor.PDFListener;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.observer.StorageFileObserver;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.utils.n0;
import pdf.pdfreader.viewer.editor.free.utils.t1;
import pdf.pdfreader.viewer.editor.free.utils.v;
import tf.c;
import tf.d;

/* compiled from: ReaderSplitPdfManager.kt */
/* loaded from: classes3.dex */
public final class ReaderSplitPdfManager implements sn.a, PDFListener {

    /* renamed from: a  reason: collision with root package name */
    public final Context f26568a;

    /* renamed from: b  reason: collision with root package name */
    public final List<SplitPdfData> f26569b;
    public volatile int c;

    /* renamed from: d  reason: collision with root package name */
    public ExecutorService f26570d;

    /* renamed from: e  reason: collision with root package name */
    public final c f26571e;

    /* renamed from: f  reason: collision with root package name */
    public a f26572f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f26573g;

    public ReaderSplitPdfManager(Context context, List<SplitPdfData> list) {
        g.e(context, ea.a.p("LG9fdBx4dA==", "ATY6tVBf"));
        g.e(list, ea.a.p("AmlCdA==", "W9n1v2MJ"));
        this.f26568a = context;
        this.f26569b = list;
        this.f26571e = kotlin.a.a(new cg.a<Handler>() { // from class: pdf.pdfreader.viewer.editor.free.split.ReaderSplitPdfManager$mainHandler$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final Handler invoke() {
                return new Handler(Looper.getMainLooper());
            }
        });
        this.f26573g = new ArrayList();
    }

    public static void d(final ReaderSplitPdfManager readerSplitPdfManager, String str) {
        g.e(readerSplitPdfManager, ea.a.p("O2hYc10w", "LCtygfkj"));
        g.e(str, ea.a.p("cG81aRRpH1AsZjZhQGg=", "fNTGsq1p"));
        try {
            ConcurrentHashMap<String, File> concurrentHashMap = v.f28781a;
            File file = new File(v.C(ea.a.p("YHAnaXQ=", "Psybk0aD")));
            b.z0(file);
            file.mkdirs();
            final int size = readerSplitPdfManager.f26569b.size();
            final int i10 = 0;
            for (Object obj : readerSplitPdfManager.f26569b) {
                int i11 = i10 + 1;
                if (i10 >= 0) {
                    SplitPdfData splitPdfData = (SplitPdfData) obj;
                    ((Handler) readerSplitPdfManager.f26571e.getValue()).post(new qb.g(new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.split.ReaderSplitPdfManager$start$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // cg.a
                        public /* bridge */ /* synthetic */ d invoke() {
                            invoke2();
                            return d.f30009a;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            ReaderSplitPdfManager readerSplitPdfManager2 = ReaderSplitPdfManager.this;
                            a aVar = readerSplitPdfManager2.f26572f;
                            if (aVar != null) {
                                aVar.i0(i10 - readerSplitPdfManager2.c, ReaderSplitPdfManager.this.c, size);
                            }
                        }
                    }, 1));
                    File absoluteFile = file.getAbsoluteFile();
                    String str2 = File.separator;
                    String fileName = splitPdfData.getFileName();
                    File file2 = new File(absoluteFile + str2 + fileName + ".pdf");
                    if (file2.exists()) {
                        file2.delete();
                    }
                    file2.createNewFile();
                    String absolutePath = file2.getAbsolutePath();
                    String[] strArr = {str};
                    List<Integer> pageList = splitPdfData.getPageList();
                    ArrayList arrayList = new ArrayList(kotlin.collections.g.h0(pageList, 10));
                    for (Number number : pageList) {
                        arrayList.add(Integer.valueOf(number.intValue() + 1));
                    }
                    if (ReaderPDFCore.mergePdf(absolutePath, strArr, e(arrayList), readerSplitPdfManager) > 0) {
                        ReaderHomeActivity.f26656t2 = true;
                        t1.b("query onSplitStart skipSilentScanWithMergeOrSplit:true");
                        sn.d d10 = sn.d.d();
                        Context context = readerSplitPdfManager.f26568a;
                        String p10 = ea.a.p("QHAnaXQ=", "baCGWQBd");
                        d10.getClass();
                        sn.d.k(context, file2, p10, readerSplitPdfManager);
                    }
                    i10 = i11;
                } else {
                    ge.a.c0();
                    throw null;
                }
            }
            ((Handler) readerSplitPdfManager.f26571e.getValue()).postDelayed(new z0(readerSplitPdfManager, 28), 200L);
        } catch (Throwable th2) {
            readerSplitPdfManager.f(th2);
            t1.c(ea.a.p("QHAnaQcgB3gXY0F0DCAzcjZvcg==", "yL551uv8"), th2);
            o9.d.r("ReaderSplitPdfManager split pdf error: " + th2);
        }
    }

    public static String[] e(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        StringBuilder sb2 = new StringBuilder();
        if (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            sb2.append(intValue);
            sb2.append(ea.a.p("LQ==", "AxXZJZrg"));
            while (it.hasNext()) {
                int intValue2 = ((Number) it.next()).intValue();
                if (intValue != intValue2 + 1) {
                    sb2.append(intValue);
                    sb2.append(ea.a.p("LA==", "olX324fN"));
                    sb2.append(intValue2);
                    sb2.append(ea.a.p("LQ==", "vwo1W711"));
                }
                intValue = intValue2;
            }
            sb2.append(intValue);
        }
        String sb3 = sb2.toString();
        g.d(sb3, ea.a.p("QWU4dR90IHUbbFBlGy4ibxd0QGkoZ2sp", "5dfuyI3Z"));
        return new String[]{sb3};
    }

    @Override // sn.a
    public final void a(Exception exc) {
        t1.c(ea.a.p("MXAIaUAgK284eUZlRnI4cg==", "KnBd4H1T"), exc);
        o9.d.s(ea.a.p("YWUqZBZyMXAeaUBQDWYbYSphVWU0IDBwFWkeIFZvBXkTZippbA==", "yj5uZFn6"), String.valueOf(exc));
        this.c++;
        f(exc);
    }

    @Override // sn.a
    public final void b(String str) {
        pdf.pdfreader.viewer.editor.free.observer.a aVar = StorageFileObserver.f25899a;
        if (str == null) {
            str = "";
        }
        StorageFileObserver.b(str);
    }

    @Override // sn.a
    public final void c(String str) {
        boolean z10;
        if (str.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.f26573g.add(str);
        }
    }

    public final void f(final Throwable th2) {
        ((Handler) this.f26571e.getValue()).post(new qb.g(new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.split.ReaderSplitPdfManager$postError$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cg.a
            public /* bridge */ /* synthetic */ d invoke() {
                invoke2();
                return d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                a aVar = ReaderSplitPdfManager.this.f26572f;
                if (aVar != null) {
                    aVar.o0(th2);
                }
                ReaderSplitPdfManager.this.g();
            }
        }, 1));
        dp.a.a().getClass();
        dp.a.d(this.f26568a, th2);
    }

    public final void g() {
        try {
            this.f26572f = null;
            ExecutorService executorService = this.f26570d;
            if (executorService != null) {
                executorService.shutdownNow();
            }
            t1.b(ea.a.p("QHAnaQcgEGUeZVVzZQ==", "f5lYJNeu"));
            ea.a.p("HWVQZBxyZHA2aT5QEWYlYVthCWU3IBdlLmUgcxIgNnUsY1Rzcw==", "4lh4BAwE");
            String str = n0.f28727a;
        } catch (Exception e10) {
            t1.c(ea.a.p("PHBdaQ0gRWU2ZStzECANeFZlHnQsb24=", "J6B2YTvo"), e10);
            ea.a.p("HWVQZBxyZHA2aT5QEWYlYVthCWU3IBdlLWUicx8gDmEmbA==", "OlnPACzh");
            String str2 = n0.f28727a;
            e10.printStackTrace();
        }
    }

    @Override // lib.zj.pdfeditor.PDFListener
    public void onPdfEvent(int i10, int i11, Object obj) {
        if (obj instanceof String) {
            Objects.toString(obj);
            String str = n0.f28727a;
            String str2 = (String) obj;
            if (j.M(str2, ea.a.p("KnJDb3I=", "ciN1TkyJ"), false)) {
                Error error = new Error(str2);
                t1.c(ea.a.p("PHBdaQ0gRGk0ZyZlVXMYbFx0TmU3cgpy", "wjvdh2Ut"), error);
                f(error);
                return;
            }
            j.M(str2, ea.a.p("Lw==", "SMRgczaH"), false);
        }
    }
}
