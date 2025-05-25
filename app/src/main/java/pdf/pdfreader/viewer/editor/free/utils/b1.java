package pdf.pdfreader.viewer.editor.free.utils;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ReaderSplashActivity;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;

/* compiled from: ReaderUriManager.java */
/* loaded from: classes3.dex */
public final class b1 {

    /* renamed from: a  reason: collision with root package name */
    public static volatile b1 f28552a;

    /* renamed from: b  reason: collision with root package name */
    public static final ConcurrentHashMap<String, PdfPreviewEntity> f28553b;
    public static final Handler c;

    /* compiled from: ReaderUriManager.java */
    /* loaded from: classes3.dex */
    public interface a {
        void a(String str, PdfPreviewEntity pdfPreviewEntity);
    }

    /* compiled from: ReaderUriManager.java */
    /* loaded from: classes3.dex */
    public static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f28554a;

        /* renamed from: b  reason: collision with root package name */
        public final a f28555b;
        public final Intent c;

        /* compiled from: ReaderUriManager.java */
        /* loaded from: classes3.dex */
        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ PdfPreviewEntity f28556a;

            public a(PdfPreviewEntity pdfPreviewEntity) {
                this.f28556a = pdfPreviewEntity;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String path;
                String p10 = ea.a.p("17jC5uW5hInh5YiAjrvF5tmfMg==", "wO3gb970");
                ReaderSplashActivity.f23873s.getClass();
                ReaderSplashActivity.a.b(p10);
                a aVar = b.this.f28555b;
                PdfPreviewEntity pdfPreviewEntity = this.f28556a;
                if (pdfPreviewEntity == null) {
                    path = "";
                } else {
                    path = pdfPreviewEntity.getPath();
                }
                aVar.a(path, pdfPreviewEntity);
            }
        }

        public b(Intent intent, Uri uri, a aVar) {
            this.f28554a = uri;
            this.f28555b = aVar;
            this.c = intent;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            boolean z11;
            File file;
            boolean z12;
            boolean z13;
            String p10;
            a aVar = this.f28555b;
            Uri uri = this.f28554a;
            if (uri == null) {
                t1.b(ea.a.p("HWVQZBxyY2gzci5NFG4JZ1ByTi1oLRFoLXINIBF0EHB_IERyED0Kbi9sJixVcg10QHJu", "QwMEDibu"));
                String p11 = ea.a.p("objq5v25jInb5dqA0aTT56iGt6T46IKlWHUDaXFpMSAgbRN0eQ==", "VqEckjPZ");
                ReaderSplashActivity.f23873s.getClass();
                ReaderSplashActivity.a.b(p11);
                if (aVar != null) {
                    b1.c.post(new pdf.pdfreader.viewer.editor.free.ui.act.tools.h(this, 6));
                    return;
                }
                return;
            }
            Intent intent = this.c;
            if (intent != null) {
                ea.a.p("HWVQZBxyY2gzci5NFG4JZ1ByTi1oLRFoOHINIDZ0MnB_IFxpFGVjeSplPQ==", "UrilQiEW");
                intent.getType();
            }
            t1.b(ea.a.p("ImUiZC9yI2ghcgJNVW42Z11yci1kLUJoHXIVLXwtYiAlcipUJUYebC1FCHRddC5STW48YStsUyABchg6", "dspCJwU9") + uri.toString());
            long currentTimeMillis = System.currentTimeMillis();
            String s4 = v.s(ReaderPdfApplication.m(), uri);
            t1.b(ea.a.p("YWUqZBZyNmgbclBNCG43ZyFyEi1rLTdoBXJTICJ0LXACIB5yGlQNRhtsUUUHdD90PVJHbihhIWwJIEJyODo=", "l7QHd5Mc") + uri + ea.a.p("HyA7YQdoPQ==", "Z8LJIGh5") + s4);
            if (!TextUtils.isEmpty(s4) && new File(s4).exists() && new File(s4).isFile()) {
                z10 = true;
            } else {
                z10 = false;
            }
            PdfPreviewEntity pdfPreviewEntity = null;
            if (z10) {
                String p12 = ea.a.p("24785fyWhJb15I-2gbf55fqE1IjW5cmf", "0dPKNob8");
                ReaderSplashActivity.f23873s.getClass();
                ReaderSplashActivity.a.a(p12);
                file = new File(s4);
                boolean g10 = pdf.pdfreader.viewer.editor.free.utils.extension.c.g(ReaderPdfApplication.m());
                try {
                    if (!g10 || !com.google.android.play.core.assetpacks.b1.P(file)) {
                        t1.b(ea.a.p("YWUqZBZyNmgbclBNCG43ZyFyEi1rLTdoC3JSIBJ0M3ACLnogHW8yZQBtXXMaaTluZG9AIDNuEHUScFlyFSw-YUBQLnIeaRFzG29aPQ==", "b6aVMGsp") + g10);
                        File k10 = v.k(ReaderPdfApplication.m());
                        String q5 = v.q(ReaderPdfApplication.m(), uri, intent);
                        if (q5.endsWith(ea.a.p("EXI8b3I=", "rVtN7jcj"))) {
                            z11 = true;
                            new FileInputStream(file);
                            t1.b(ea.a.p("YWUqZBZyNmgbclBNCG43ZyFyEi1rLTdoPXIjIAR0EXACLnkgNWkOZTtuRHUdUyJyIWFfICVhLSAmZSZk", "TGwtA0L8"));
                        } else if (!g10 || aj.b.H(q5)) {
                            ReaderSplashActivity.a.a(ea.a.p("qqS85fG20Zbd5PG2", "8LjobJAd"));
                            file = v.f(ReaderPdfApplication.m(), uri, q5, k10);
                            ea.a.p("YWUqZBZyNmgbclBNCG43ZyFyIA==", "mdhSG3Yu");
                            ea.a.p("Yi0cdBFpRWR6cz5lBTFGMhVuASA1ZRdtE3M-aVduFHM7YUN0WWNYcCMsamYcbA09", "FQMuzM84");
                            Objects.toString(file);
                            if (file == null) {
                                file = new File(s4);
                            }
                        }
                    }
                    new FileInputStream(file);
                    t1.b(ea.a.p("YWUqZBZyNmgbclBNCG43ZyFyEi1rLTdoPXIjIAR0EXACLnkgNWkOZTtuRHUdUyJyIWFfICVhLSAmZSZk", "TGwtA0L8"));
                } catch (Exception e10) {
                    t1.b(ea.a.p("YWUqZBZyNmgbclBNCG43ZyFyEi1rLTdoPXIFIEp0EXACLnkgNWkOZTtuRHUdUyJyIWFfICN4IGUkdAhvVyA=", "Ta9t0Ws3") + e10);
                }
                z11 = false;
            } else {
                z11 = false;
                file = null;
            }
            if (file == null) {
                file = v.m(ReaderPdfApplication.m(), uri, intent, false);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(ea.a.p("HWVQZBxyY2gzci5NFG4JZ1ByTi1oLRFoK3JSIB50CnB9IFdpFWUKPTR1JmxVcxxlRSxOcCR0DSB_IA==", "FOsXB6mo"));
                if (file != null) {
                    p10 = file.getAbsolutePath();
                } else {
                    p10 = ea.a.p("IXVdbA==", "lOnQgFG6");
                }
                sb2.append(p10);
                t1.b(sb2.toString());
                if (file != null && file.getName().endsWith(ea.a.p("KnJDb3I=", "WfNuhCkZ"))) {
                    if (file.exists()) {
                        file.delete();
                    }
                    z11 = true;
                }
            } else {
                String p13 = ea.a.p("qZy46M6v0r7e7_aMkpvc5ruliInW5dmA", "hlg1bOvx");
                ReaderSplashActivity.f23873s.getClass();
                ReaderSplashActivity.a.a(p13);
            }
            t1.b(ea.a.p("amUQZAhyBWghcgJNVW42Z11yci1kLUJoHXIVICJ0J3AKIBZlGSA3aSRlNmFAaHdjV24hdSRlFnQdbRQ9", "ho8qmQK9") + (System.currentTimeMillis() - currentTimeMillis) + ea.a.p("b2ZYbBwgCiA=", "E44LACjN") + file);
            if (file != null && file.exists() && file.isFile()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 && !z11) {
                String p14 = ea.a.p("pZPg5M6cqpX45uuu0bqT", "7eCmsLUj");
                ReaderSplashActivity.f23873s.getClass();
                ReaderSplashActivity.a.a(p14);
                boolean P = com.google.android.play.core.assetpacks.b1.P(file);
                String path = file.getPath();
                if (P) {
                    pdfPreviewEntity = bm.c.b(ReaderPdfApplication.m()).d(path);
                }
                if (pdfPreviewEntity == null) {
                    pdfPreviewEntity = new PdfPreviewEntity();
                    ea.a.p("Hi1mdBtpEGRSc0BlGTJ2ZSp0W3Q_ICpkPQ==", "a32XRc6E");
                    pdfPreviewEntity.getId();
                    String str = n0.f28727a;
                    pdfPreviewEntity.setPath(path);
                    pdfPreviewEntity.setName(v.r(path.substring(pdfPreviewEntity.getPath().lastIndexOf(ea.a.p("Lw==", "tg9esNDg")) + 1)));
                    File file2 = new File(path);
                    pdfPreviewEntity.setSize(file2.length());
                    pdfPreviewEntity.setDate(file2.lastModified());
                    t1.b(ea.a.p("HWVQZBxyY2gzci5NFG4JZ1ByTi1oLRFoXXITIB90L3B8IFhuCmVFdHpkYg==", "YglF4wlJ"));
                    z13 = true;
                } else {
                    t1.b(ea.a.p("P2UtZDFyEWghcgJNVW42Z11yciBkLRt0HGkDZHFzNmUdM2xkNiAmbyZ0B2lac3d0UGVyZiBsUyxUbhBtNCB_IA==", "fVmLTEHQ") + pdfPreviewEntity.getPath());
                    z13 = false;
                }
                pdfPreviewEntity.setOtherStrOne(w.a(path));
                if (TextUtils.equals(pdfPreviewEntity.getOtherStrOne(), ea.a.p("Y0RG", "afEH4uQ6"))) {
                    pdfPreviewEntity.setOtherBoolOne(v.H(ReaderPdfApplication.m(), path));
                    pdfPreviewEntity.setOtherIntOne(1);
                }
                pdfPreviewEntity.setDeleted(0);
                pdfPreviewEntity.setRecent(1);
                pdfPreviewEntity.setRecentDate(System.currentTimeMillis());
                if (P) {
                    if (z13) {
                        bm.c.b(ReaderPdfApplication.m()).g(pdfPreviewEntity);
                        pdfPreviewEntity = bm.c.b(ReaderPdfApplication.m()).d(pdfPreviewEntity.getPath());
                    } else {
                        bm.c.b(ReaderPdfApplication.m()).i(pdfPreviewEntity);
                    }
                }
            }
            String p15 = ea.a.p("1ZPG5M6chJXC5rmujLrF5eqM1IiQ", "MV3j6axt");
            ReaderSplashActivity.f23873s.getClass();
            ReaderSplashActivity.a.a(p15);
            t1.b(ea.a.p("PWUuZDxyO2ghcgJNVW42Z11yci1kLUJoHXIVICJ0J3BcIDtveWUBdCF0HyBXbzlzTW03ID1pW2VOIA==", "NOoOYoq9") + (System.currentTimeMillis() - currentTimeMillis) + ea.a.p("E2YibBYgXyA=", "uKWN5eTy") + file);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(ea.a.p("YWUqZBZyNmgbclBNCG43ZyFyEi1rLTdoMXIqIDV0VnB2bi8gEGEObBBhV2s6", "XNF3d1x5"));
            sb3.append(aVar);
            t1.b(sb3.toString());
            if (uri.getPath() != null && pdfPreviewEntity != null) {
                ConcurrentHashMap<String, PdfPreviewEntity> concurrentHashMap = b1.f28553b;
                if (!concurrentHashMap.containsKey(uri.getPath())) {
                    concurrentHashMap.put(uri.getPath(), pdfPreviewEntity);
                    t1.b(ea.a.p("HWVQZBxyY2gzci5NFG4JZ1ByTi1oLRFoWHIhIEB0NXAKblUgHmVDLHpuJXQcZnk=", "sCRn1E3P"));
                } else {
                    t1.b(ea.a.p("YWUqZBZyNmgbclBNCG43ZyFyEi1rLTdoWXIiIDd0EXB2bi8gHkUMdBt0TUEbcjd5CWFCICVvLXRRaShzD2UNOg==", "0FDtefyv") + concurrentHashMap.get(uri.getPath()));
                }
            }
            if (aVar != null) {
                b1.c.post(new a(pdfPreviewEntity));
            }
        }
    }

    static {
        ea.a.p("HWVQZBxyY2gzci5NFG4JZ1ByIA==", "biBvJT6n");
        f28553b = new ConcurrentHashMap<>();
        c = new Handler(Looper.getMainLooper());
    }

    public static b1 a() {
        if (f28552a == null) {
            synchronized (b1.class) {
                if (f28552a == null) {
                    f28552a = new b1();
                }
            }
        }
        return f28552a;
    }

    public static Uri b(Intent intent) {
        Uri uri;
        Uri uri2 = null;
        if (intent != null) {
            String action = intent.getAction();
            String type = intent.getType();
            if (ea.a.p("Um4vchxpBi4bbkBlB3R4YSd0W28oLhVJFFc=", "QSBjqq4a").equals(action)) {
                uri = intent.getData();
            } else {
                if (TextUtils.equals(action, ea.a.p("Lm5VchZpUy4zbj5lG3RGYVZ0B28rLjZFGEQ=", "wtiMV8un"))) {
                    uri = (Uri) intent.getParcelableExtra(ea.a.p("Lm5VchZpUy4zbj5lG3RGZU10HGFrUzFSBEFN", "MKOQAgEC"));
                }
                t1.b(ea.a.p("YWUqZBZyNmgbclBNCG43ZyFyEi1rLTdoOHIqLX0tb3BScjhlJnILIBNjQGkGbnY9IA==", "QNPOmChS") + action + ea.a.p("b3RIcBwgCiA=", "pINgtGiO") + type + ea.a.p("E3U5aVM9IA==", "deC5L1FP") + uri2);
            }
            uri2 = uri;
            t1.b(ea.a.p("YWUqZBZyNmgbclBNCG43ZyFyEi1rLTdoOHIqLX0tb3BScjhlJnILIBNjQGkGbnY9IA==", "QNPOmChS") + action + ea.a.p("b3RIcBwgCiA=", "pINgtGiO") + type + ea.a.p("E3U5aVM9IA==", "deC5L1FP") + uri2);
        }
        return uri2;
    }
}
