package pdf.pdfreader.viewer.editor.free.utils.share;

import a6.e;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.h;
import android.text.TextUtils;
import androidx.lifecycle.w;
import com.google.android.play.core.assetpacks.b1;
import ea.a;
import ip.c;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.collections.q;
import kotlin.jvm.internal.g;
import kotlin.text.k;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ReaderSplashActivity;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.office.l0;
import pdf.pdfreader.viewer.editor.free.utils.n0;
import pdf.pdfreader.viewer.editor.free.utils.t1;
import pdf.pdfreader.viewer.editor.free.utils.v;
import tf.d;

/* compiled from: ThirdOpenParseManager.kt */
/* loaded from: classes3.dex */
public final class ThirdOpenParseManager {

    /* renamed from: e  reason: collision with root package name */
    public static final w<Map<Uri, c>> f28763e;

    /* renamed from: f  reason: collision with root package name */
    public static final w f28764f;

    /* renamed from: g  reason: collision with root package name */
    public static final ConcurrentHashMap<Uri, c> f28765g;

    /* renamed from: b  reason: collision with root package name */
    public static final String f28761b = a.p("AmgocjBPB2UmUAdyR2UaYVZhNWVy", "MqVATw7D");

    /* renamed from: a  reason: collision with root package name */
    public static final ThirdOpenParseManager f28760a = new ThirdOpenParseManager();
    public static final tf.c c = kotlin.a.a(new cg.a<ThreadPoolExecutor>() { // from class: pdf.pdfreader.viewer.editor.free.utils.share.ThirdOpenParseManager$thirdParseThreadPool$2
        @Override // cg.a
        public final ThreadPoolExecutor invoke() {
            return new ThreadPoolExecutor(0, 2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadPoolExecutor.CallerRunsPolicy());
        }
    });

    /* renamed from: d  reason: collision with root package name */
    public static final tf.c f28762d = kotlin.a.a(new cg.a<Handler>() { // from class: pdf.pdfreader.viewer.editor.free.utils.share.ThirdOpenParseManager$mainHandler$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    });

    static {
        w<Map<Uri, c>> wVar = new w<>(q.y0());
        f28763e = wVar;
        f28764f = wVar;
        f28765g = new ConcurrentHashMap<>();
    }

    public static void a(File file, Uri uri) {
        byte b10;
        d dVar = null;
        PdfPreviewEntity pdfPreviewEntity = null;
        if (file != null) {
            ReaderSplashActivity.a aVar = ReaderSplashActivity.f23873s;
            String p10 = a.p("qZO85MSc0ZXq5seukLqT", "xMiJrZ1Z");
            aVar.getClass();
            ReaderSplashActivity.a.a(p10);
            boolean P = b1.P(file);
            String absolutePath = file.getAbsolutePath();
            if (P) {
                pdfPreviewEntity = bm.c.b(ReaderPdfApplication.m()).d(absolutePath);
            }
            if (pdfPreviewEntity == null) {
                pdfPreviewEntity = new PdfPreviewEntity();
                pdfPreviewEntity.getId();
                String str = n0.f28727a;
                pdfPreviewEntity.setPath(absolutePath);
                g.d(absolutePath, a.p("B2gjcgtQUnRo", "qVsJo3bT"));
                String path = pdfPreviewEntity.getPath();
                g.d(path, a.p("Q2QtLgNhFmg=", "WUqSol1l"));
                String substring = absolutePath.substring(k.Y(path, a.p("Lw==", "qXrwYgHA"), 6) + 1);
                g.d(substring, a.p("N2g4c2NhCiAiYRBhGmw2bl8uAXQ7aVhnXS4CdTNzNnIqbjYoMHQYcjxJCGRReCk=", "HECQCyOV"));
                pdfPreviewEntity.setName(v.r(substring));
                File file2 = new File(absolutePath);
                pdfPreviewEntity.setSize(file2.length());
                pdfPreviewEntity.setDate(file2.lastModified());
                t1.b(a.p("G2hYch1PR2U0UCtyBmUlYVthCWU3LUgtN2gtci8gC3QqcAIgEG5EZSh0amRi", "Gcy3CDKx"));
                b10 = 1;
            } else {
                t1.b("ThirdOpenParseManager ---third step3 db contains the file, name = " + pdfPreviewEntity.getPath());
                b10 = (byte) 0;
            }
            pdfPreviewEntity.setOtherStrOne(pdf.pdfreader.viewer.editor.free.utils.w.a(absolutePath));
            if (TextUtils.equals(pdfPreviewEntity.getOtherStrOne(), a.p("H0RG", "2BldRide"))) {
                pdfPreviewEntity.setOtherBoolOne(v.H(ReaderPdfApplication.m(), absolutePath));
                pdfPreviewEntity.setOtherIntOne(1);
            }
            pdfPreviewEntity.setDeleted(0);
            pdfPreviewEntity.setRecent(1);
            pdfPreviewEntity.setRecentDate(System.currentTimeMillis());
            if (P) {
                if (b10 != 0) {
                    bm.c.b(ReaderPdfApplication.m()).g(pdfPreviewEntity);
                    PdfPreviewEntity d10 = bm.c.b(ReaderPdfApplication.m()).d(pdfPreviewEntity.getPath());
                    if (d10 != null) {
                        FileRepository.c(d10);
                        pdfPreviewEntity = d10;
                    }
                } else {
                    bm.c.b(ReaderPdfApplication.m()).i(pdfPreviewEntity);
                    FileRepository.I(pdfPreviewEntity);
                }
            }
            ReaderSplashActivity.a.a(a.p("qZO85MSc0ZXq5seukLr75ZuMiIiQ", "rIInR8eJ"));
            f28760a.getClass();
            c(uri, pdfPreviewEntity);
            dVar = d.f30009a;
        }
        if (dVar == null) {
            ReaderSplashActivity.a aVar2 = ReaderSplashActivity.f23873s;
            String p11 = a.p("1Yn15MuNh4jC5qKHjbu2", "BBSppUMp");
            aVar2.getClass();
            ReaderSplashActivity.a.a(p11);
            b(uri);
        }
    }

    public static void b(Uri uri) {
        ReaderSplashActivity.a aVar = ReaderSplashActivity.f23873s;
        String p10 = a.p("qri-5qS5o4jO5Nyr27zb6ayZuq-v", "I6N72FwW");
        aVar.getClass();
        ReaderSplashActivity.a.b(p10);
        ConcurrentHashMap<Uri, c> concurrentHashMap = f28765g;
        concurrentHashMap.put(uri, new c(uri, ThirdOpenStatus.ERROR, null));
        f28763e.k(concurrentHashMap);
    }

    public static void c(Uri uri, PdfPreviewEntity pdfPreviewEntity) {
        g.e(uri, "uri");
        ReaderSplashActivity.a aVar = ReaderSplashActivity.f23873s;
        String p10 = a.p("17jC5uW5h4j05I6rhrza5eqM1IiQ", "6xfy2F5R");
        aVar.getClass();
        ReaderSplashActivity.a.b(p10);
        pdfPreviewEntity.getPath();
        ConcurrentHashMap<Uri, c> concurrentHashMap = f28765g;
        concurrentHashMap.put(uri, new c(uri, ThirdOpenStatus.DONE, pdfPreviewEntity));
        f28763e.k(concurrentHashMap);
    }

    public static void d(Uri uri) {
        ReaderSplashActivity.a aVar = ReaderSplashActivity.f23873s;
        String p10 = a.p("17jC5uW5h4j05I6rhrza5Pyt1Jat", "TeTsanX9");
        aVar.getClass();
        ReaderSplashActivity.a.b(p10);
        ConcurrentHashMap<Uri, c> concurrentHashMap = f28765g;
        concurrentHashMap.put(uri, new c(uri, ThirdOpenStatus.INTERRUPT, null));
        f28763e.k(concurrentHashMap);
    }

    public static void e(Uri uri) {
        ReaderSplashActivity.a aVar = ReaderSplashActivity.f23873s;
        String p10 = a.p("q7i45u-50ojc5PCrmrzk5I2NiJTq5umB", "KvYsYsr3");
        aVar.getClass();
        ReaderSplashActivity.a.b(p10);
        ConcurrentHashMap<Uri, c> concurrentHashMap = f28765g;
        concurrentHashMap.put(uri, new c(uri, ThirdOpenStatus.NOT_SUPPORT, null));
        f28763e.k(concurrentHashMap);
    }

    public static final Uri f(Intent intent) {
        Uri uri = null;
        if (intent == null) {
            return null;
        }
        String action = intent.getAction();
        String type = intent.getType();
        if (g.a(a.p("Um4vchxpBi4bbkBlB3R4YSd0W28oLhVJdFc=", "1XpSxiTQ"), action)) {
            uri = intent.getData();
        } else if (TextUtils.equals(action, a.p("M24NclZpPS4hbhJlWnR5YVt0O28nLmVFOkQ=", "tzRi9Y7P"))) {
            uri = (Uri) intent.getParcelableExtra(a.p("MW4CchlpFS4hbhJlWnR5ZUB0IGFnU2JSMUFN", "d6Pfvquu"));
        }
        StringBuilder f10 = h.f("ThirdOpenParseManager---third--- parseUri action = ", action, " type = ", type, " uri = ");
        f10.append(uri);
        t1.b(f10.toString());
        return uri;
    }

    public static final void g(Activity activity, Uri uri, Intent intent) {
        boolean z10;
        g.e(activity, "activity");
        ReaderPdfApplication.k().g(null);
        f28760a.getClass();
        ConcurrentHashMap<Uri, c> concurrentHashMap = f28765g;
        c cVar = concurrentHashMap.get(uri);
        tf.c cVar2 = c;
        if (cVar != null) {
            if (cVar.f18970b == ThirdOpenStatus.DONE && cVar.c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                cVar = null;
            }
            if (cVar != null) {
                ((ThreadPoolExecutor) cVar2.getValue()).execute(new l0(6, cVar, uri));
                ((ThreadPoolExecutor) cVar2.getValue()).execute(new k0.a(activity, 2));
            }
        }
        concurrentHashMap.put(uri, new c(uri, ThirdOpenStatus.PARSE, null));
        ReaderSplashActivity.a aVar = ReaderSplashActivity.f23873s;
        String p10 = a.p("q7i45u-50ojc5PCr", "nTkwMJzL");
        aVar.getClass();
        ReaderSplashActivity.a.c(p10);
        if (intent != null) {
            f28763e.j(concurrentHashMap);
            if (pdf.pdfreader.viewer.editor.free.utils.extension.a.b(activity)) {
                d(uri);
            } else {
                ((ThreadPoolExecutor) cVar2.getValue()).execute(new e(6, activity, uri, intent));
            }
        }
        ((ThreadPoolExecutor) cVar2.getValue()).execute(new k0.a(activity, 2));
    }

    public static void h(Activity activity, Uri uri, File file) {
        g.e(activity, "activity");
        if (uri == null) {
            return;
        }
        ConcurrentHashMap<Uri, c> concurrentHashMap = f28765g;
        concurrentHashMap.put(uri, new c(uri, ThirdOpenStatus.PARSE, null));
        ReaderSplashActivity.a aVar = ReaderSplashActivity.f23873s;
        String p10 = a.p("1r_g5v63hJbL5YiPj4nF5fiA", "kjKTNF5A");
        aVar.getClass();
        ReaderSplashActivity.a.c(p10);
        f28763e.j(concurrentHashMap);
        if (pdf.pdfreader.viewer.editor.free.utils.extension.a.b(activity)) {
            d(uri);
        } else {
            ((ThreadPoolExecutor) c.getValue()).execute(new androidx.emoji2.text.h(11, file, uri, activity));
        }
    }
}
