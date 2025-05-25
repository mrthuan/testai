package pdf.pdfreader.viewer.editor.free.merge;

import android.content.Context;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.g;
import kotlin.text.j;
import lib.zj.pdfeditor.PDFListener;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.observer.StorageFileObserver;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.utils.h1;
import pdf.pdfreader.viewer.editor.free.utils.n0;
import pdf.pdfreader.viewer.editor.free.utils.t1;
import qb.f;
import tf.d;

/* compiled from: ReaderMergeManager.kt */
/* loaded from: classes3.dex */
public final class ReaderMergeManager implements sn.a, PDFListener {

    /* renamed from: a  reason: collision with root package name */
    public final Context f25888a;

    /* renamed from: b  reason: collision with root package name */
    public final List<PdfPreviewEntity> f25889b;
    public final tf.c c;

    /* renamed from: d  reason: collision with root package name */
    public b f25890d;

    /* renamed from: e  reason: collision with root package name */
    public ExecutorService f25891e;

    /* renamed from: f  reason: collision with root package name */
    public int f25892f;

    /* renamed from: g  reason: collision with root package name */
    public int f25893g;

    /* renamed from: h  reason: collision with root package name */
    public final SparseIntArray f25894h;

    /* renamed from: i  reason: collision with root package name */
    public volatile boolean f25895i;

    public ReaderMergeManager(Context context, ArrayList arrayList) {
        g.e(context, ea.a.p("UG8ldBZ4dA==", "DfuBCq0K"));
        ea.a.p("W2lHdA==", "Qs74GL8B");
        this.f25888a = context;
        this.f25889b = arrayList;
        this.c = kotlin.a.a(new cg.a<Handler>() { // from class: pdf.pdfreader.viewer.editor.free.merge.ReaderMergeManager$mainHandler$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final Handler invoke() {
                return new Handler(Looper.getMainLooper());
            }
        });
        this.f25894h = new SparseIntArray();
    }

    public static void d(File file, String str, final ReaderMergeManager readerMergeManager) {
        boolean isExternalStorageManager;
        g.e(file, ea.a.p("F3QubQNGC2xl", "SVFIJGqF"));
        g.e(str, ea.a.p("dWYkbC1ODW1l", "poQMHlud"));
        g.e(readerMergeManager, ea.a.p("R2gic1cw", "JwNCGSI8"));
        Context context = readerMergeManager.f25888a;
        try {
            bg.b.z0(file);
            file.mkdirs();
            final File file2 = new File(file.getAbsoluteFile() + File.separator + str);
            if (file2.exists()) {
                file2.delete();
            }
            file2.createNewFile();
            t1.b("start merge origin file : " + file2.getAbsolutePath() + " , tempFile : " + file.getAbsolutePath());
            ArrayList arrayList = new ArrayList();
            readerMergeManager.f25893g = 0;
            for (PdfPreviewEntity pdfPreviewEntity : readerMergeManager.f25889b) {
                try {
                    ReaderPDFCore readerPDFCore = new ReaderPDFCore(context, pdfPreviewEntity.getPath());
                    readerMergeManager.f25893g += readerPDFCore.countPages();
                    readerPDFCore.onDestroy();
                } catch (Exception e10) {
                    dp.a.a().getClass();
                    dp.a.d(context, e10);
                }
                String path = pdfPreviewEntity.getPath();
                g.d(path, ea.a.p("JnQfcBh0aA==", "hWYounx8"));
                arrayList.add(path);
            }
            ReaderHomeActivity.f26656t2 = true;
            if (ReaderPDFCore.mergePdf(file2.getAbsolutePath(), (String[]) arrayList.toArray(new String[0]), readerMergeManager) <= 0) {
                ReaderHomeActivity.f26656t2 = false;
                return;
            }
            t1.b("query onMergeStart skipSilentScanWithMergeOrSplit:" + ReaderHomeActivity.f26656t2);
            if (h1.c()) {
                isExternalStorageManager = Environment.isExternalStorageManager();
                if (!isExternalStorageManager) {
                    readerMergeManager.e(new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.merge.ReaderMergeManager$start$1$2
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
                            t1.b(ea.a.p("ImVDZxwgUWEzbGpuGiAYZUdtB3M2aQpu", "jUuocRWx"));
                            ReaderMergeManager.this.c(file2.getAbsolutePath());
                        }
                    });
                    return;
                }
            }
            if (readerMergeManager.f25890d == null) {
                t1.b(ea.a.p("JGUZZ1wgBWEhbEZwRm8veRg9byAndVps", "IRIk9c6O"));
                file2.delete();
                return;
            }
            t1.b(ea.a.p("XmU5ZxYgEXURY1FzGiAldCVyRiAlbzN5", "axTyFEes"));
            sn.d d10 = sn.d.d();
            String p10 = ea.a.p("ImVDZxxk", "YBznbXRk");
            d10.getClass();
            sn.d.k(context, file2, p10, readerMergeManager);
        } catch (Throwable th2) {
            readerMergeManager.e(new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.merge.ReaderMergeManager$start$1$3
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
                    b bVar = ReaderMergeManager.this.f25890d;
                    if (bVar != null) {
                        bVar.s(th2);
                    }
                    ReaderMergeManager.this.f();
                }
            });
            t1.c(ea.a.p("XmU5ZxYgEmQUIERyBmMzczcgV3I0bzE6", "UHpOK5fh"), th2);
            dp.a.a().getClass();
            dp.a.d(context, th2);
            o9.d.r("ReaderMergeManager merge pdf process error: " + th2);
        }
    }

    @Override // sn.a
    public final void a(final Exception exc) {
        e(new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.merge.ReaderMergeManager$copyError$1
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
                b bVar = ReaderMergeManager.this.f25890d;
                if (bVar != null) {
                    Exception exc2 = exc;
                    if (exc2 == null) {
                        exc2 = new Exception(ea.a.p("NW9BeVVFL2MtcBJpW24=", "K6V1uW7f"));
                    }
                    bVar.s(exc2);
                }
                ReaderMergeManager.this.f();
            }
        });
        t1.c(ea.a.p("XmU5ZxYgAW8CeRRlG3I5cjo=", "TDYb5ZOz"), exc);
        o9.d.r("ReaderMergeManager copy pdf error: " + exc);
        dp.a.a().getClass();
        dp.a.d(this.f25888a, exc);
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
    public final void c(final String str) {
        e(new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.merge.ReaderMergeManager$copyFinished$1
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
                b bVar = ReaderMergeManager.this.f25890d;
                if (bVar != null) {
                    bVar.p(100, 100);
                }
                final ReaderMergeManager readerMergeManager = ReaderMergeManager.this;
                final String str2 = str;
                ((Handler) ReaderMergeManager.this.c.getValue()).postDelayed(new Runnable() { // from class: pdf.pdfreader.viewer.editor.free.merge.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        String p10 = ea.a.p("O2hYc10w", "uLBhgUGJ");
                        ReaderMergeManager readerMergeManager2 = ReaderMergeManager.this;
                        g.e(readerMergeManager2, p10);
                        b bVar2 = readerMergeManager2.f25890d;
                        if (bVar2 != null) {
                            String str3 = str2;
                            if (str3 == null) {
                                str3 = "";
                            }
                            bVar2.F(str3);
                        }
                    }
                }, 200L);
            }
        });
    }

    public final void e(cg.a<d> aVar) {
        ((Handler) this.c.getValue()).post(new f(aVar, 2));
    }

    public final void f() {
        try {
            this.f25890d = null;
            ExecutorService executorService = this.f25891e;
            if (executorService != null) {
                executorService.shutdownNow();
            }
            t1.b(ea.a.p("XmU5ZxYgEGUeZVVzZQ==", "ktxzSWjR"));
            ea.a.p("YWUqZBZyL2UAZ1FNCG43ZyFyEnIjbCZhIGVLcyVjFGVAcw==", "SkPwL5lE");
            String str = n0.f28727a;
        } catch (Exception e10) {
            t1.c(ea.a.p("ImVDZxwgRWU2ZStzECANeFZlHnQsb24=", "XrLG6rFo"), e10);
            ea.a.p("H2UNZBxyI2U6ZwNNVW42Z11ycnIsbFNhB2VRZjBpbA==", "71MlynQd");
            String str2 = n0.f28727a;
            e10.printStackTrace();
        }
    }

    @Override // lib.zj.pdfeditor.PDFListener
    public void onPdfEvent(int i10, int i11, Object obj) {
        if (obj instanceof String) {
            Objects.toString(obj);
            String str = n0.f28727a;
            if (g.a(ea.a.p("QHQqcnQ=", "0njwL42k"), obj)) {
                this.f25894h.clear();
                e(new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.merge.ReaderMergeManager$onUpdateTaskProgress$1
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
                        b bVar = ReaderMergeManager.this.f25890d;
                        if (bVar != null) {
                            int i12 = r2;
                            if (i12 > 0) {
                                i12--;
                            }
                            bVar.p(i12, r3);
                        }
                    }
                });
                e(new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.merge.ReaderMergeManager$onPdfEvent$1
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
                        b bVar = ReaderMergeManager.this.f25890d;
                        if (bVar != null) {
                            bVar.b0();
                        }
                    }
                });
                return;
            }
            String str2 = (String) obj;
            if (j.M(str2, ea.a.p("KnJDb3I=", "fEN8phRX"), false)) {
                final Error error = new Error(str2);
                e(new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.merge.ReaderMergeManager$onMergeError$1
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
                        b bVar = ReaderMergeManager.this.f25890d;
                        if (bVar != null) {
                            Throwable th2 = error;
                            if (th2 == null) {
                                th2 = new Exception(ea.a.p("XmU5ZxYgJ3gRZUR0AG9u", "Mx0pbtw6"));
                            }
                            bVar.s(th2);
                        }
                        ReaderMergeManager.this.f();
                    }
                });
                t1.c(ea.a.p("ImVDZxwgR2Q8IC9yB28aOg==", "tODPGCWD"), error);
                o9.d.r("ReaderMergeManager merge pdf error: " + error);
                dp.a a10 = dp.a.a();
                Context context = this.f25888a;
                a10.getClass();
                dp.a.d(context, error);
                return;
            }
            try {
                this.f25894h.put(i10, Integer.parseInt((String) obj));
            } catch (Exception unused) {
            }
            if (!this.f25895i) {
                this.f25895i = true;
                if (this.f25893g == 0) {
                    final int i12 = (int) (((i10 + 1) / i11) * 100);
                    e(new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.merge.ReaderMergeManager$onUpdateTaskProgress$1
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
                            b bVar = ReaderMergeManager.this.f25890d;
                            if (bVar != null) {
                                int i122 = i12;
                                if (i122 > 0) {
                                    i122--;
                                }
                                bVar.p(i122, r3);
                            }
                        }
                    });
                } else {
                    SparseIntArray sparseIntArray = this.f25894h;
                    int size = sparseIntArray.size();
                    int i13 = 0;
                    for (int i14 = 0; i14 < size; i14++) {
                        sparseIntArray.keyAt(i14);
                        i13 += sparseIntArray.valueAt(i14);
                    }
                    int i15 = (int) ((i13 / this.f25893g) * 100);
                    if (this.f25892f != i15) {
                        if (i15 >= 100) {
                            i15 = 100;
                        }
                        this.f25892f = i15;
                    }
                    final int i16 = this.f25892f;
                    e(new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.merge.ReaderMergeManager$onUpdateTaskProgress$1
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
                            b bVar = ReaderMergeManager.this.f25890d;
                            if (bVar != null) {
                                int i122 = i16;
                                if (i122 > 0) {
                                    i122--;
                                }
                                bVar.p(i122, r3);
                            }
                        }
                    });
                }
                ((Handler) this.c.getValue()).postDelayed(new pdf.pdfreader.viewer.editor.free.feature.scan.ui.f(this, 1), 100L);
            }
        }
    }
}
