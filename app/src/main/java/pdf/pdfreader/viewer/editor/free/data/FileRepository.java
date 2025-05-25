package pdf.pdfreader.viewer.editor.free.data;

import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.appcompat.widget.y0;
import androidx.appcompat.widget.z0;
import androidx.fragment.app.a1;
import androidx.lifecycle.w;
import androidx.room.RoomDatabase;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.EmptyList;
import kotlin.collections.m;
import kotlin.jvm.internal.g;
import kotlin.text.j;
import kotlinx.coroutines.flow.r;
import nl.e;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.db.ReaderAppDataBase;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import pdf.pdfreader.viewer.editor.free.utils.v;
import qb.u;
import w1.h;

/* compiled from: FileRepository.kt */
/* loaded from: classes3.dex */
public final class FileRepository {
    public static final r A;
    public static final r B;
    public static final tf.c C;
    public static final tf.c D;
    public static final tf.c E;
    public static final tf.c F;
    public static boolean G;
    public static boolean H;
    public static boolean I;
    public static boolean J;

    /* renamed from: a  reason: collision with root package name */
    public static final FileRepository f24155a;

    /* renamed from: b  reason: collision with root package name */
    public static final tf.c f24156b;
    public static final tf.c c;

    /* renamed from: d  reason: collision with root package name */
    public static final tf.c f24157d;

    /* renamed from: e  reason: collision with root package name */
    public static final tf.c f24158e;

    /* renamed from: f  reason: collision with root package name */
    public static final tf.c f24159f;

    /* renamed from: g  reason: collision with root package name */
    public static final tf.c f24160g;

    /* renamed from: h  reason: collision with root package name */
    public static final tf.c f24161h;

    /* renamed from: i  reason: collision with root package name */
    public static final tf.c f24162i;

    /* renamed from: j  reason: collision with root package name */
    public static final tf.c f24163j;

    /* renamed from: k  reason: collision with root package name */
    public static final tf.c f24164k;

    /* renamed from: l  reason: collision with root package name */
    public static final tf.c f24165l;

    /* renamed from: m  reason: collision with root package name */
    public static final tf.c f24166m;

    /* renamed from: n  reason: collision with root package name */
    public static final tf.c f24167n;

    /* renamed from: o  reason: collision with root package name */
    public static final tf.c f24168o;

    /* renamed from: p  reason: collision with root package name */
    public static c f24169p;

    /* renamed from: q  reason: collision with root package name */
    public static final w f24170q;

    /* renamed from: r  reason: collision with root package name */
    public static e f24171r;

    /* renamed from: s  reason: collision with root package name */
    public static final tf.c f24172s;

    /* renamed from: t  reason: collision with root package name */
    public static final tf.c f24173t;

    /* renamed from: u  reason: collision with root package name */
    public static final tf.c f24174u;

    /* renamed from: v  reason: collision with root package name */
    public static final tf.c f24175v;

    /* renamed from: w  reason: collision with root package name */
    public static final tf.c f24176w;

    /* renamed from: x  reason: collision with root package name */
    public static final r f24177x;

    /* renamed from: y  reason: collision with root package name */
    public static final r f24178y;

    /* renamed from: z  reason: collision with root package name */
    public static final r f24179z;

    static {
        ea.a.p("CWldZStlR28paT5vB3k=", "oeh48G4O");
        f24155a = new FileRepository();
        f24156b = kotlin.a.a(new cg.a<ThreadPoolExecutor>() { // from class: pdf.pdfreader.viewer.editor.free.data.FileRepository$scannerThread$2
            @Override // cg.a
            public final ThreadPoolExecutor invoke() {
                return new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.CallerRunsPolicy());
            }
        });
        c = kotlin.a.a(new cg.a<ThreadPoolExecutor>() { // from class: pdf.pdfreader.viewer.editor.free.data.FileRepository$checkFileStateThread$2
            @Override // cg.a
            public final ThreadPoolExecutor invoke() {
                return new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.CallerRunsPolicy());
            }
        });
        f24157d = kotlin.a.a(new cg.a<ThreadPoolExecutor>() { // from class: pdf.pdfreader.viewer.editor.free.data.FileRepository$operateThread$2
            @Override // cg.a
            public final ThreadPoolExecutor invoke() {
                return new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.CallerRunsPolicy());
            }
        });
        f24158e = kotlin.a.a(new cg.a<Handler>() { // from class: pdf.pdfreader.viewer.editor.free.data.FileRepository$mainHandler$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final Handler invoke() {
                return new Handler(Looper.getMainLooper());
            }
        });
        f24159f = kotlin.a.a(new cg.a<AtomicBoolean>() { // from class: pdf.pdfreader.viewer.editor.free.data.FileRepository$loadingFiles$2
            @Override // cg.a
            public final AtomicBoolean invoke() {
                return new AtomicBoolean(false);
            }
        });
        f24160g = kotlin.a.a(new cg.a<HashSet<String>>() { // from class: pdf.pdfreader.viewer.editor.free.data.FileRepository$pathCache$2
            @Override // cg.a
            public final HashSet<String> invoke() {
                return new HashSet<>();
            }
        });
        f24161h = kotlin.a.a(new cg.a<ArrayBlockingQueue<String>>() { // from class: pdf.pdfreader.viewer.editor.free.data.FileRepository$deletePathCache$2
            @Override // cg.a
            public final ArrayBlockingQueue<String> invoke() {
                return new ArrayBlockingQueue<>(1000);
            }
        });
        f24162i = kotlin.a.a(new cg.a<List<PdfPreviewEntity>>() { // from class: pdf.pdfreader.viewer.editor.free.data.FileRepository$scanFiles$2
            @Override // cg.a
            public final List<PdfPreviewEntity> invoke() {
                return new ArrayList();
            }
        });
        f24163j = kotlin.a.a(new cg.a<List<PdfPreviewEntity>>() { // from class: pdf.pdfreader.viewer.editor.free.data.FileRepository$_allFiles$2
            @Override // cg.a
            public final List<PdfPreviewEntity> invoke() {
                return new ArrayList();
            }
        });
        f24164k = kotlin.a.a(new cg.a<List<PdfPreviewEntity>>() { // from class: pdf.pdfreader.viewer.editor.free.data.FileRepository$_pdfFiles$2
            @Override // cg.a
            public final List<PdfPreviewEntity> invoke() {
                return new ArrayList();
            }
        });
        f24165l = kotlin.a.a(new cg.a<List<PdfPreviewEntity>>() { // from class: pdf.pdfreader.viewer.editor.free.data.FileRepository$_wordFiles$2
            @Override // cg.a
            public final List<PdfPreviewEntity> invoke() {
                return new ArrayList();
            }
        });
        f24166m = kotlin.a.a(new cg.a<List<PdfPreviewEntity>>() { // from class: pdf.pdfreader.viewer.editor.free.data.FileRepository$_excelFiles$2
            @Override // cg.a
            public final List<PdfPreviewEntity> invoke() {
                return new ArrayList();
            }
        });
        f24167n = kotlin.a.a(new cg.a<List<PdfPreviewEntity>>() { // from class: pdf.pdfreader.viewer.editor.free.data.FileRepository$_pptFiles$2
            @Override // cg.a
            public final List<PdfPreviewEntity> invoke() {
                return new ArrayList();
            }
        });
        tf.c a10 = kotlin.a.a(new cg.a<w<Boolean>>() { // from class: pdf.pdfreader.viewer.editor.free.data.FileRepository$innerCheckEntityStateFinish$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final w<Boolean> invoke() {
                return new w<>();
            }
        });
        f24168o = a10;
        f24170q = (w) a10.getValue();
        f24172s = kotlin.a.a(new cg.a<r<List<? extends PdfPreviewEntity>>>() { // from class: pdf.pdfreader.viewer.editor.free.data.FileRepository$_allFileFlow$2
            @Override // cg.a
            public final r<List<? extends PdfPreviewEntity>> invoke() {
                return t0.a(EmptyList.INSTANCE);
            }
        });
        f24173t = kotlin.a.a(new cg.a<r<List<? extends PdfPreviewEntity>>>() { // from class: pdf.pdfreader.viewer.editor.free.data.FileRepository$_pdfFileFlow$2
            @Override // cg.a
            public final r<List<? extends PdfPreviewEntity>> invoke() {
                return t0.a(EmptyList.INSTANCE);
            }
        });
        f24174u = kotlin.a.a(new cg.a<r<List<? extends PdfPreviewEntity>>>() { // from class: pdf.pdfreader.viewer.editor.free.data.FileRepository$_wordFileFlow$2
            @Override // cg.a
            public final r<List<? extends PdfPreviewEntity>> invoke() {
                return t0.a(EmptyList.INSTANCE);
            }
        });
        f24175v = kotlin.a.a(new cg.a<r<List<? extends PdfPreviewEntity>>>() { // from class: pdf.pdfreader.viewer.editor.free.data.FileRepository$_excelFileFlow$2
            @Override // cg.a
            public final r<List<? extends PdfPreviewEntity>> invoke() {
                return t0.a(EmptyList.INSTANCE);
            }
        });
        f24176w = kotlin.a.a(new cg.a<r<List<? extends PdfPreviewEntity>>>() { // from class: pdf.pdfreader.viewer.editor.free.data.FileRepository$_pptFileFlow$2
            @Override // cg.a
            public final r<List<? extends PdfPreviewEntity>> invoke() {
                return t0.a(EmptyList.INSTANCE);
            }
        });
        f24177x = q();
        f24178y = u();
        f24179z = y();
        A = s();
        B = w();
        C = kotlin.a.a(new cg.a<Object>() { // from class: pdf.pdfreader.viewer.editor.free.data.FileRepository$operateLock$2
            @Override // cg.a
            public final Object invoke() {
                return new Object();
            }
        });
        D = kotlin.a.a(new cg.a<List<PdfPreviewEntity>>() { // from class: pdf.pdfreader.viewer.editor.free.data.FileRepository$operateAddFiles$2
            @Override // cg.a
            public final List<PdfPreviewEntity> invoke() {
                return new ArrayList();
            }
        });
        E = kotlin.a.a(new cg.a<List<PdfPreviewEntity>>() { // from class: pdf.pdfreader.viewer.editor.free.data.FileRepository$operateRemoveFiles$2
            @Override // cg.a
            public final List<PdfPreviewEntity> invoke() {
                return new ArrayList();
            }
        });
        F = kotlin.a.a(new cg.a<List<PdfPreviewEntity>>() { // from class: pdf.pdfreader.viewer.editor.free.data.FileRepository$operateUpdateFiles$2
            @Override // cg.a
            public final List<PdfPreviewEntity> invoke() {
                return new ArrayList();
            }
        });
    }

    public static final void A(Context context, ge.a aVar) {
        g.e(context, "context");
        ea.a.p("Am82ZEhmDWwtc0ZmW3I6IFxi", "HInWhdmI");
        f24155a.getClass();
        g(new u1.d(context, 1), aVar);
    }

    public static final void B(Context context, ge.a aVar) {
        g.e(context, "context");
        G = true;
        ea.a.p("Dm8pZEhmO2wtc0ZmW3I6IFVlNmkoU0JvBmU=", "gebHhReN");
        f24155a.getClass();
        g(new u(context, 1), aVar);
    }

    public static final void C(Context context, ge.a aVar) {
        g.e(context, "context");
        I = true;
        ea.a.p("BW8JZFhmE2wtc0ZmW3I6IEt0PXIoZ2U=", "49ihxzqV");
        f24155a.getClass();
        g(new z0(context, 23), aVar);
    }

    public static void D(Context context) {
        boolean z10;
        boolean z11;
        boolean z12;
        bm.c b10 = bm.c.b(context);
        ReaderAppDataBase readerAppDataBase = b10.f5480b;
        boolean z13 = false;
        if (((bm.e) readerAppDataBase.k()).a(ea.a.p("IURG", "74qvmczW")) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (((bm.e) readerAppDataBase.k()).a(ea.a.p("GE9jRA==", "OkBPbZch")) != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (((bm.e) readerAppDataBase.k()).a(ea.a.p("NFBU", "tsd7TIE3")) != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (((bm.e) readerAppDataBase.k()).a(ea.a.p("ClhyRUw=", "vedAWhvi")) != null) {
            z13 = true;
        }
        String absolutePath = new File(v.k(b10.f5481d), ea.a.p("C2Vcbw==", "VRL1UwOx")).getAbsolutePath();
        ArrayList<PdfPreviewEntity> arrayList = new ArrayList<>();
        if (!z10) {
            b10.e(absolutePath, ea.a.p("H0RG", "2FdjMKye"), ea.a.p("V2Umb1xEB20dIGRELy4mZGY=", "0TVD0NGH"), arrayList);
        }
        if (!z11) {
            b10.e(absolutePath, ea.a.p("ZE8ZRA==", "hngarTF0"), ea.a.p("K2Vcb1ZEUm01IA5PNlhGZFpjeA==", "Mg8VicUX"), arrayList);
        }
        if (!z12) {
            b10.e(absolutePath, ea.a.p("Y1BU", "RIQZFSCF"), ea.a.p("V2Umb1xEB20dIGRQPS4mcDB4", "3rlE03BF"), arrayList);
        }
        if (!z13) {
            b10.e(absolutePath, ea.a.p("ClhyRUw=", "IwDfz4iQ"), ea.a.p("K2Vcb1ZEUm01IBJMJlhGeFlzeA==", "Ryxt6vkM"), arrayList);
        }
        ea.a.p("V2Umbz9pEXQ=", "XOXuL0Sq");
        if (!arrayList.isEmpty()) {
            n().addAll(arrayList);
            b(arrayList);
        }
    }

    public static void E(Context context, ArrayList arrayList) {
        Object obj;
        boolean z10;
        Iterator it;
        bm.c cVar;
        ArrayList arrayList2;
        boolean z11;
        h hVar;
        int N;
        int N2;
        int N3;
        int N4;
        int N5;
        int N6;
        int N7;
        int N8;
        int N9;
        int N10;
        ArrayList arrayList3;
        int N11;
        bm.c cVar2;
        int N12;
        int N13;
        PdfPreviewEntity pdfPreviewEntity;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        bm.c b10 = bm.c.b(context);
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            PdfPreviewEntity pdfPreviewEntity2 = (PdfPreviewEntity) it2.next();
            String path = pdfPreviewEntity2.getPath();
            if (path != null && path.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                String name = pdfPreviewEntity2.getName();
                if (name != null && name.length() != 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z11) {
                    String path2 = pdfPreviewEntity2.getPath();
                    bm.e eVar = (bm.e) b10.f5480b.k();
                    eVar.getClass();
                    ea.a.p("OWU6ZRR0ZCpoZhRvWSAnZF5fNGklZUUgI0g0UhQgMmE-aHY9SiA_", "owJVwDqb");
                    h b11 = h.b(1, ea.a.p("PGVdZRp0Fyp6ZjhvGCAYZFNfCGkpZRYgHkgtUiMgGWE7aBE9RCA_", "YxpfIhfi"));
                    if (path2 == null) {
                        b11.f(1);
                    } else {
                        b11.h(1, path2);
                    }
                    RoomDatabase roomDatabase = eVar.f5486a;
                    roomDatabase.b();
                    Cursor i10 = roomDatabase.i(b11);
                    try {
                        N = t0.N(i10, ea.a.p("WmQ=", "0K8GJQSG"));
                        N2 = t0.N(i10, ea.a.p("V2E_ZQ==", "bVReaWdV"));
                        N3 = t0.N(i10, ea.a.p("VWE9bwFpFmU=", "IRSCF5FZ"));
                        N4 = t0.N(i10, ea.a.p("F2EibzZpIGUMYRJl", "GWqTDTVK"));
                        N5 = t0.N(i10, ea.a.p("XWEmZQ==", "I3wSJeDw"));
                        N6 = t0.N(i10, ea.a.p("Q2EsZQ==", "0ftD9POe"));
                        N7 = t0.N(i10, ea.a.p("KWEbaA==", "MqYocUkq"));
                        N8 = t0.N(i10, ea.a.p("PGU0ZRt0", "8qNWuyLx"));
                        N9 = t0.N(i10, ea.a.p("OGUSZQh0dWE8ZQ==", "XXJqf1s2"));
                        it = it2;
                        N10 = t0.N(i10, ea.a.p("MGlOZQ==", "94C4sK2t"));
                        arrayList3 = arrayList4;
                        N11 = t0.N(i10, ea.a.p("OnBVYQ1ldnQ=", "BDRpio4X"));
                        cVar2 = b10;
                        N12 = t0.N(i10, ea.a.p("IHRZZQtTQ3IVbmU=", "YFTWNwhd"));
                        N13 = t0.N(i10, ea.a.p("XHQjZQFTFnImd28=", "D0uDEx9W"));
                        hVar = b11;
                    } catch (Throwable th2) {
                        th = th2;
                        hVar = b11;
                    }
                    try {
                        int N14 = t0.N(i10, ea.a.p("IHRZZQtTQ3IOaDhlZQ==", "LNmjLj1B"));
                        int N15 = t0.N(i10, ea.a.p("N3RRZRlTBHIJbGw=", "fcX9kpHn"));
                        int N16 = t0.N(i10, ea.a.p("XHQjZQFCDW8eT1pl", "0pGaOQdc"));
                        int N17 = t0.N(i10, ea.a.p("LnQlZSBCXW8kVBFv", "nWAMR276"));
                        int N18 = t0.N(i10, ea.a.p("XHQjZQFCDW8eVFxyDGU=", "2w05RvMo"));
                        int N19 = t0.N(i10, ea.a.p("IHRZZQtCWG82RiV1cg==", "YEYBfumB"));
                        int N20 = t0.N(i10, ea.a.p("XHQjZQFJDHQ9bmU=", "eMR0OYXX"));
                        int N21 = t0.N(i10, ea.a.p("XHQjZQFJDHQmd28=", "QR6QFCSw"));
                        int N22 = t0.N(i10, ea.a.p("A3QKZUFJH3QcaBRlZQ==", "Fulb3qCm"));
                        int N23 = t0.N(i10, ea.a.p("XHQjZQFJDHQ0b0Fy", "acrmP5ZV"));
                        int N24 = t0.N(i10, ea.a.p("XHQjZQFMDW4VT1pl", "wh2xmL5v"));
                        int N25 = t0.N(i10, ea.a.p("IHRZZQtMWG49VD1v", "pAtReyDF"));
                        int N26 = t0.N(i10, ea.a.p("XHQjZQFMDW4VVFxyDGU=", "NLawHuaO"));
                        int N27 = t0.N(i10, ea.a.p("IHRZZQtMWG49RiV1cg==", "LJN2UkJo"));
                        int N28 = t0.N(i10, ea.a.p("LGUvZTZlZA==", "InHCBrhm"));
                        int N29 = t0.N(i10, ea.a.p("K2VdZQ1lU1QzbWU=", "QUuMJGih"));
                        if (i10.moveToFirst()) {
                            PdfPreviewEntity pdfPreviewEntity3 = new PdfPreviewEntity();
                            pdfPreviewEntity3.setId(i10.getLong(N));
                            pdfPreviewEntity3.setDate(i10.getLong(N2));
                            pdfPreviewEntity3.setFavorite(i10.getInt(N3));
                            pdfPreviewEntity3.setFavoriteDate(i10.getLong(N4));
                            pdfPreviewEntity3.setName(i10.getString(N5));
                            pdfPreviewEntity3.setPage(i10.getInt(N6));
                            pdfPreviewEntity3.setPath(i10.getString(N7));
                            pdfPreviewEntity3.setRecent(i10.getInt(N8));
                            pdfPreviewEntity3.setRecentDate(i10.getLong(N9));
                            pdfPreviewEntity3.setSize(i10.getLong(N10));
                            pdfPreviewEntity3.setUpdateAt(i10.getLong(N11));
                            pdfPreviewEntity3.setOtherStrOne(i10.getString(N12));
                            pdfPreviewEntity3.setOtherStrTwo(i10.getString(N13));
                            pdfPreviewEntity3.setOtherStrThree(i10.getString(N14));
                            pdfPreviewEntity3.setOtherStrAll(i10.getString(N15));
                            if (i10.getInt(N16) != 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            pdfPreviewEntity3.setOtherBoolOne(z12);
                            if (i10.getInt(N17) != 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            pdfPreviewEntity3.setOtherBoolTwo(z13);
                            if (i10.getInt(N18) != 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            pdfPreviewEntity3.setOtherBoolThree(z14);
                            if (i10.getInt(N19) != 0) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            pdfPreviewEntity3.setOtherBoolFour(z15);
                            pdfPreviewEntity3.setOtherIntOne(i10.getInt(N20));
                            pdfPreviewEntity3.setOtherIntTwo(i10.getInt(N21));
                            pdfPreviewEntity3.setOtherIntThree(i10.getInt(N22));
                            pdfPreviewEntity3.setOtherIntFour(i10.getInt(N23));
                            pdfPreviewEntity3.setOtherLongOne(i10.getLong(N24));
                            pdfPreviewEntity3.setOtherLongTwo(i10.getLong(N25));
                            pdfPreviewEntity3.setOtherLongThree(i10.getLong(N26));
                            pdfPreviewEntity3.setOtherLongFour(i10.getLong(N27));
                            pdfPreviewEntity3.setDeleted(i10.getInt(N28));
                            pdfPreviewEntity3.setDeletedTime(i10.getLong(N29));
                            pdfPreviewEntity = pdfPreviewEntity3;
                        } else {
                            pdfPreviewEntity = null;
                        }
                        i10.close();
                        hVar.i();
                        if (pdfPreviewEntity == null) {
                            cVar = cVar2;
                            Iterator it3 = cVar.c(pdfPreviewEntity2.getName()).iterator();
                            boolean z16 = true;
                            while (it3.hasNext()) {
                                if (j.G(((PdfPreviewEntity) it3.next()).getPath(), pdfPreviewEntity2.getPath(), true)) {
                                    z16 = false;
                                }
                            }
                            arrayList2 = arrayList3;
                            if (z16) {
                                arrayList2.add(pdfPreviewEntity2);
                            }
                        } else {
                            arrayList2 = arrayList3;
                            cVar = cVar2;
                            if (pdfPreviewEntity.getDeleted() == 1) {
                                FileRepository fileRepository = f24155a;
                                fileRepository.getClass();
                                fileRepository.e((ArrayBlockingQueue) f24161h.getValue(), pdfPreviewEntity2.getPath());
                            }
                        }
                        it2 = it;
                        bm.c cVar3 = cVar;
                        arrayList4 = arrayList2;
                        b10 = cVar3;
                    } catch (Throwable th3) {
                        th = th3;
                        i10.close();
                        hVar.i();
                        throw th;
                    }
                }
            }
            it = it2;
            ArrayList arrayList5 = arrayList4;
            cVar = b10;
            arrayList2 = arrayList5;
            it2 = it;
            bm.c cVar32 = cVar;
            arrayList4 = arrayList2;
            b10 = cVar32;
        }
        ArrayList arrayList6 = arrayList4;
        bm.c cVar4 = b10;
        ArrayList arrayList7 = new ArrayList();
        if (!arrayList6.isEmpty()) {
            cVar4.j(arrayList6);
            ArrayList a10 = cVar4.a();
            Iterator it4 = arrayList6.iterator();
            while (it4.hasNext()) {
                PdfPreviewEntity pdfPreviewEntity4 = (PdfPreviewEntity) it4.next();
                ea.a.p("B2IuaUp0", "cbcb9B71");
                Iterator it5 = a10.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        obj = it5.next();
                        if (g.a(pdfPreviewEntity4.getPath(), ((PdfPreviewEntity) obj).getPath())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                PdfPreviewEntity pdfPreviewEntity5 = (PdfPreviewEntity) obj;
                if (pdfPreviewEntity5 != null) {
                    arrayList7.add(pdfPreviewEntity5);
                }
            }
        }
        if (!arrayList7.isEmpty()) {
            n().addAll(arrayList7);
            b(arrayList7);
            k().execute(new b1.e(arrayList7, 15));
        }
    }

    public static void F() {
        SystemClock.elapsedRealtime();
        ea.a.p("HHBUZR1UUnN0", "pUZCrB4x");
    }

    public static void G(String str) {
        boolean z10;
        SystemClock.elapsedRealtime();
        ea.a.p("YHAuZRdUB3N0", "5cWCYDTH");
        if (str.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ea.a.p("1rzL5dSLiq7T5qO2", "Wm9eS1Wu");
        }
    }

    public static void H() {
        synchronized (j()) {
            f24155a.getClass();
            tf.c cVar = D;
            if (!((List) cVar.getValue()).isEmpty()) {
                for (PdfPreviewEntity pdfPreviewEntity : (List) cVar.getValue()) {
                    FileRepository fileRepository = f24155a;
                    fileRepository.getClass();
                    if (t0.E(n(), pdfPreviewEntity) != null) {
                        ea.a.p("QHklYzxwB3ITdFFGAGwzVCtTUWEoRipsE3MY5Y6yiLu85teJl7qG", "v89oSF22");
                    } else {
                        n().add(pdfPreviewEntity);
                        fileRepository.d(pdfPreviewEntity.getPath(), l());
                    }
                }
                f24155a.getClass();
                ((List) D.getValue()).clear();
            }
            f24155a.getClass();
            tf.c cVar2 = E;
            if (!((List) cVar2.getValue()).isEmpty()) {
                n().removeAll((List) cVar2.getValue());
                for (PdfPreviewEntity pdfPreviewEntity2 : (List) cVar2.getValue()) {
                    FileRepository fileRepository2 = f24155a;
                    fileRepository2.getClass();
                    fileRepository2.e((ArrayBlockingQueue) f24161h.getValue(), pdfPreviewEntity2.getPath());
                }
            }
            f24155a.getClass();
            tf.c cVar3 = F;
            if (!((List) cVar3.getValue()).isEmpty()) {
                for (PdfPreviewEntity pdfPreviewEntity3 : (List) cVar3.getValue()) {
                    f24155a.getClass();
                    t0.v0(n(), pdfPreviewEntity3);
                }
                f24155a.getClass();
                ((List) F.getValue()).clear();
            }
            tf.d dVar = tf.d.f30009a;
        }
    }

    public static final void I(PdfPreviewEntity entity) {
        g.e(entity, "entity");
        f24155a.getClass();
        k().execute(new a(entity, 0));
    }

    public static void a(final c cVar, final List list) {
        g.e(list, ea.a.p("a2xYc3Q=", "KleJyfXV"));
        g.e(cVar, ea.a.p("a2xYcw1lWWVy", "MGent6xD"));
        f24155a.getClass();
        r().clear();
        r().addAll(list);
        v().clear();
        z().clear();
        t().clear();
        x().clear();
        for (PdfPreviewEntity pdfPreviewEntity : r()) {
            String otherStrOne = pdfPreviewEntity.getOtherStrOne();
            if (otherStrOne != null) {
                switch (otherStrOne.hashCode()) {
                    case 79058:
                        if (otherStrOne.equals(ea.a.p("H0RG", "VIfQsOxW"))) {
                            v().add(pdfPreviewEntity);
                            break;
                        } else {
                            continue;
                        }
                    case 79444:
                        if (otherStrOne.equals(ea.a.p("IlBU", "93rMPhgk"))) {
                            x().add(pdfPreviewEntity);
                            break;
                        } else {
                            continue;
                        }
                    case 2670346:
                        if (otherStrOne.equals(ea.a.p("OE9kRA==", "H4o6CcmF"))) {
                            z().add(pdfPreviewEntity);
                            break;
                        } else {
                            continue;
                        }
                    case 66411159:
                        if (otherStrOne.equals(ea.a.p("ClhyRUw=", "bNkG1fmI"))) {
                            t().add(pdfPreviewEntity);
                            break;
                        } else {
                            continue;
                        }
                }
            }
        }
        q().setValue(m.E0(r()));
        u().setValue(m.E0(v()));
        y().setValue(m.E0(z()));
        s().setValue(m.E0(t()));
        w().setValue(m.E0(x()));
        ((Handler) f24158e.getValue()).post(new b1.e(new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.data.FileRepository$classifyFiles$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // cg.a
            public /* bridge */ /* synthetic */ tf.d invoke() {
                invoke2();
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                c.this.b(list);
                c cVar2 = FileRepository.f24169p;
                if (cVar2 != null) {
                    cVar2.b(list);
                }
                FileRepository.f24169p = null;
            }
        }, 14));
    }

    public static void b(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            FileRepository fileRepository = f24155a;
            fileRepository.getClass();
            fileRepository.d(((PdfPreviewEntity) it.next()).getPath(), l());
        }
    }

    public static final void c(PdfPreviewEntity entity) {
        g.e(entity, "entity");
        f24155a.getClass();
        k().execute(new y0(entity, 22));
    }

    public static void f(PdfPreviewEntity pdfPreviewEntity) {
        String otherStrOne = pdfPreviewEntity.getOtherStrOne();
        if (otherStrOne != null) {
            switch (otherStrOne.hashCode()) {
                case 79058:
                    if (otherStrOne.equals(ea.a.p("H0RG", "Acm1X8vA"))) {
                        t0.v0(v(), pdfPreviewEntity);
                        u().setValue(m.E0(v()));
                        return;
                    }
                    return;
                case 79444:
                    if (otherStrOne.equals(ea.a.p("H1BU", "QmdYdQ3T"))) {
                        t0.v0(x(), pdfPreviewEntity);
                        w().setValue(m.E0(x()));
                        return;
                    }
                    return;
                case 2670346:
                    if (otherStrOne.equals(ea.a.p("GE9jRA==", "LpN3lrMd"))) {
                        t0.v0(z(), pdfPreviewEntity);
                        y().setValue(m.E0(z()));
                        return;
                    }
                    return;
                case 66411159:
                    if (otherStrOne.equals(ea.a.p("ClhyRUw=", "DWjEW2xd"))) {
                        t0.v0(t(), pdfPreviewEntity);
                        s().setValue(m.E0(t()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public static void g(Runnable runnable, final ge.a aVar) {
        if (i().get()) {
            ea.a.p("X28qZBpuZw==", "w5UjnwXi");
            f24169p = aVar;
            return;
        }
        i().set(true);
        ((Handler) f24158e.getValue()).post(new b1.e(new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.data.FileRepository$doLoad$1
            {
                super(0);
            }

            @Override // cg.a
            public /* bridge */ /* synthetic */ tf.d invoke() {
                invoke2();
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                c.this.i();
            }
        }, 14));
        o().execute(new a1(11, runnable, aVar));
    }

    public static List h() {
        return m.E0((Iterable) A.b());
    }

    public static AtomicBoolean i() {
        return (AtomicBoolean) f24159f.getValue();
    }

    public static Object j() {
        return C.getValue();
    }

    public static ThreadPoolExecutor k() {
        return (ThreadPoolExecutor) f24157d.getValue();
    }

    public static HashSet l() {
        return (HashSet) f24160g.getValue();
    }

    public static List m() {
        return m.E0((Iterable) f24178y.b());
    }

    public static List n() {
        return (List) f24162i.getValue();
    }

    public static ThreadPoolExecutor o() {
        return (ThreadPoolExecutor) f24156b.getValue();
    }

    public static List p() {
        return m.E0((Iterable) f24179z.b());
    }

    public static r q() {
        return (r) f24172s.getValue();
    }

    public static List r() {
        return (List) f24163j.getValue();
    }

    public static r s() {
        return (r) f24175v.getValue();
    }

    public static List t() {
        return (List) f24166m.getValue();
    }

    public static r u() {
        return (r) f24173t.getValue();
    }

    public static List v() {
        return (List) f24164k.getValue();
    }

    public static r w() {
        return (r) f24176w.getValue();
    }

    public static List x() {
        return (List) f24167n.getValue();
    }

    public static r y() {
        return (r) f24174u.getValue();
    }

    public static List z() {
        return (List) f24165l.getValue();
    }

    public final synchronized void d(String str, HashSet hashSet) {
        if (str == null) {
            return;
        }
        hashSet.add(str);
    }

    public final synchronized void e(ArrayBlockingQueue<String> arrayBlockingQueue, String str) {
        if (str == null) {
            return;
        }
        if (!arrayBlockingQueue.offer(str)) {
            arrayBlockingQueue.poll();
            arrayBlockingQueue.offer(str);
        }
    }
}
