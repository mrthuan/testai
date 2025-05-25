package bm;

import android.content.Context;
import android.database.Cursor;
import android.os.Environment;
import android.text.TextUtils;
import androidx.room.RoomDatabase;
import bm.a;
import bm.e;
import com.facebook.appevents.g;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.db.ReaderAppDataBase;
import pdf.pdfreader.viewer.editor.free.utils.h1;
import pdf.pdfreader.viewer.editor.free.utils.l;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import pdf.pdfreader.viewer.editor.free.utils.t1;
import pdf.pdfreader.viewer.editor.free.utils.v;
import w1.h;

/* compiled from: DbManager.java */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: e  reason: collision with root package name */
    public static c f5478e;

    /* renamed from: a  reason: collision with root package name */
    public final z3.c f5479a;

    /* renamed from: b  reason: collision with root package name */
    public final ReaderAppDataBase f5480b;
    public final bm.a c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f5481d;

    /* compiled from: DbManager.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f5482a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ InterfaceC0042c f5483b;

        public a(List list, InterfaceC0042c interfaceC0042c) {
            this.f5482a = list;
            this.f5483b = interfaceC0042c;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c cVar = c.this;
            cVar.f5479a.getClass();
            List<PdfPreviewEntity> list = this.f5482a;
            if (list != null && !list.isEmpty()) {
                for (int i10 = 0; i10 < list.size(); i10++) {
                    PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) list.get(i10);
                    if (pdfPreviewEntity != null) {
                        z3.c.f(pdfPreviewEntity);
                    }
                }
            }
            for (PdfPreviewEntity pdfPreviewEntity2 : list) {
                PdfPreviewEntity d10 = c.f5478e.d(pdfPreviewEntity2.getPath());
                t1.b(ea.a.p("PnVUcgAgF3M_YThjHSAYYUFoOg==", "RKbkQ3xf") + pdfPreviewEntity2.getPath());
                ReaderAppDataBase readerAppDataBase = cVar.f5480b;
                if (d10 == null) {
                    t1.b(ea.a.p("PnVUcgAgWW96IDloGnUEZBVpAHMgcnQ=", "jNFfNp62"));
                    Iterator it = cVar.c(pdfPreviewEntity2.getName()).iterator();
                    boolean z10 = true;
                    while (it.hasNext()) {
                        PdfPreviewEntity pdfPreviewEntity3 = (PdfPreviewEntity) it.next();
                        if (pdfPreviewEntity2.getPath() != null && pdfPreviewEntity3.getPath() != null) {
                            t1.b(ea.a.p("FHVSchQgEWU8UAJmcmk7ZXp5HGEkZWFpAGg1ZT0gMmERaDo=", "fee7mvGb") + pdfPreviewEntity3.getPath() + ea.a.p("byARcxB6Ujo=", "wCQ1ykIK") + pdfPreviewEntity3.getSize() + ea.a.p("b2xeYxhsZGkgZTo=", "pj881Rj2") + new File(pdfPreviewEntity3.getPath()).length());
                            if (pdfPreviewEntity2.getPath().equalsIgnoreCase(pdfPreviewEntity3.getPath())) {
                                t1.b(ea.a.p("R3UrchogKmElZUZoVXN3bld0cmknc1NyACABYSVoOg==", "Hr6NcDNe") + pdfPreviewEntity2.getPath() + ea.a.p("byARcxB6Ujo=", "n3rYLR2G") + pdfPreviewEntity2.getSize() + ea.a.p("U2weYy5sG2kyZTo=", "1gsqOH4k") + new File(pdfPreviewEntity2.getPath()).length());
                                pdfPreviewEntity2.setPath(pdfPreviewEntity3.getPath());
                                pdfPreviewEntity3.setSize(pdfPreviewEntity2.getSize());
                                ((e) readerAppDataBase.k()).e(pdfPreviewEntity3);
                                z10 = false;
                            }
                        }
                    }
                    if (z10) {
                        ((e) readerAppDataBase.k()).b(pdfPreviewEntity2);
                        t1.b(ea.a.p("MnUzchwgK2ElZUZuWyAkaFd1PmRpaVhzEXIFICFhNmg6", "qVCVeEcf") + pdfPreviewEntity2.getPath() + ea.a.p("cSB6c1B6JDo=", "j1QZ9AZz") + pdfPreviewEntity2.getSize() + ea.a.p("E2wkYxJsMWkIZTo=", "TGR06qau") + new File(pdfPreviewEntity2.getPath()).length());
                    }
                } else {
                    d10.setSize(pdfPreviewEntity2.getSize());
                    ((e) readerAppDataBase.k()).e(d10);
                    t1.b(ea.a.p("PnVUcgAgTmUpIDphAWg6", "llAEogyQ") + d10.getPath());
                    t1.b(ea.a.p("QnUucgogQnMXYUZjASAmYTBoOg==", "PoFkkMKS") + pdfPreviewEntity2.getPath() + ea.a.p("byARcxB6Ujo=", "gVXwlFts") + d10.getSize() + ea.a.p("b2xeYxhsZGkgZTo=", "yLzIUcsF") + new File(d10.getPath()).length());
                    d10.setSize(pdfPreviewEntity2.getSize());
                    ((e) readerAppDataBase.k()).e(d10);
                }
            }
            ArrayList arrayList = new ArrayList();
            for (PdfPreviewEntity pdfPreviewEntity4 : list) {
                PdfPreviewEntity d11 = c.f5478e.d(pdfPreviewEntity4.getPath());
                t1.b(ea.a.p("GXU_cgsgH2U7dQp0FGQ2dFkgImE9aDo=", "7shZrmWF") + pdfPreviewEntity4.getPath());
                if (d11 != null) {
                    arrayList.add(d11);
                }
            }
            t1.b(ea.a.p("PnVUcgAgRWUpdSZ0VWwBc0EgHWk_ZTo=", "yciYVFCW") + list.size());
            InterfaceC0042c interfaceC0042c = this.f5483b;
            if (interfaceC0042c != null) {
                interfaceC0042c.b(arrayList);
            }
        }
    }

    /* compiled from: DbManager.java */
    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PdfPreviewEntity f5484a;

        public b(PdfPreviewEntity pdfPreviewEntity) {
            this.f5484a = pdfPreviewEntity;
        }

        @Override // java.lang.Runnable
        public final void run() {
            PdfPreviewEntity d10;
            dp.a a10 = dp.a.a();
            Context m10 = ReaderPdfApplication.m();
            String p10 = ea.a.p("OnBVYQ1hZ2Q8RiNsZQ==", "cuNsbYre");
            a10.getClass();
            dp.a.b(m10, p10);
            PdfPreviewEntity pdfPreviewEntity = this.f5484a;
            if (pdfPreviewEntity == null) {
                return;
            }
            c cVar = c.this;
            int e10 = ((e) cVar.f5480b.k()).e(pdfPreviewEntity);
            t1.b(ea.a.p("C2J8YRdhUGUoID9wEWEcYWVkCEYsbAA6IA==", "6GdZjsZX") + pdfPreviewEntity.getPath() + ea.a.p("E2QubBZ0ByAbcyA=", "a1xGhHGg") + pdfPreviewEntity.getDeleted() + ea.a.p("b2ZQdjo=", "joZYuEFZ") + pdfPreviewEntity.getFavorite() + ea.a.p("b3NEYxplRHM6", "e88TwIoO") + e10 + ea.a.p("EyAiczxwB24gZVJsBncg", "gcr4My0F") + pdfPreviewEntity.isOtherBoolThree());
            if (e10 == 0 && (d10 = cVar.d(pdfPreviewEntity.getPath())) != null) {
                d10.setFavorite(pdfPreviewEntity.getFavorite());
                d10.setDeleted(pdfPreviewEntity.getDeleted());
                d10.setDeletedTime(pdfPreviewEntity.getDeletedTime());
                d10.setFavoriteDate(pdfPreviewEntity.getFavoriteDate());
                d10.setRecent(pdfPreviewEntity.getRecent());
                d10.setRecentDate(pdfPreviewEntity.getRecentDate());
                d10.setSize(pdfPreviewEntity.getSize());
                d10.setOtherBoolOne(pdfPreviewEntity.isOtherBoolOne());
                d10.setOtherStrOne(pdfPreviewEntity.getOtherStrOne());
                d10.setOtherStrTwo(pdfPreviewEntity.getOtherStrTwo());
                ((e) cVar.f5480b.k()).e(d10);
            }
        }
    }

    /* compiled from: DbManager.java */
    /* renamed from: bm.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0042c {
        void a();

        void b(ArrayList arrayList);
    }

    static {
        ea.a.p("C2J8YRdhUGVy", "xzf1Qm6n");
    }

    public c(Context context) {
        if (bm.a.f5472e == null) {
            synchronized (bm.a.f5471d) {
                bm.a.f5472e = new bm.a(Executors.newSingleThreadExecutor(), Executors.newFixedThreadPool(3), new a.ExecutorC0041a());
            }
        }
        this.c = bm.a.f5472e;
        if (ReaderAppDataBase.f24212j == null) {
            ReaderAppDataBase.f24212j = (ReaderAppDataBase) androidx.room.b.a(context.getApplicationContext(), ReaderAppDataBase.class, ReaderAppDataBase.f24213k).b();
        }
        this.f5480b = ReaderAppDataBase.f24212j;
        this.f5479a = new z3.c(7);
        this.f5481d = context;
    }

    public static c b(Context context) {
        if (f5478e == null) {
            f5478e = new c(context.getApplicationContext());
        }
        return f5478e;
    }

    public final ArrayList a() {
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
        int N11;
        int N12;
        int N13;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean isExternalStorageManager;
        String str;
        String absolutePath = v.k(this.f5481d).getAbsolutePath();
        boolean c = h1.c();
        ReaderAppDataBase readerAppDataBase = this.f5480b;
        if (c) {
            isExternalStorageManager = Environment.isExternalStorageManager();
            if (!isExternalStorageManager) {
                try {
                    sn.d.d().getClass();
                    str = sn.d.e();
                } catch (Exception e10) {
                    e10.printStackTrace();
                    str = null;
                }
                ArrayList arrayList = new ArrayList();
                ArrayList c10 = ((e) readerAppDataBase.k()).c(absolutePath);
                if (c10.size() > 0) {
                    arrayList.addAll(c10);
                }
                if (!TextUtils.isEmpty(str)) {
                    ArrayList c11 = ((e) readerAppDataBase.k()).c(str);
                    if (c11.size() > 0) {
                        Iterator it = c11.iterator();
                        while (it.hasNext()) {
                            PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) it.next();
                            if (pdfPreviewEntity != null && !TextUtils.isEmpty(pdfPreviewEntity.getPath())) {
                                File file = new File(pdfPreviewEntity.getPath());
                                if (file.exists() && file.canRead()) {
                                    arrayList.add(pdfPreviewEntity);
                                }
                            }
                        }
                    }
                }
                return arrayList;
            }
        }
        e eVar = (e) readerAppDataBase.k();
        eVar.getClass();
        ea.a.p("QGUnZRB0QipSZkZvBCAmZCJfVGkqZTAgYkgjUiggJWVfZT9lFz1fMFJvRmQMcnZiPSBWYTJlY2RQc2M=", "5fmAYtf9");
        h b10 = h.b(0, ea.a.p("PGVdZRp0Fyp6ZjhvGCAYZFNfCGkpZRYgAEgwUiMgNGUjZUVlHT0KMHpvOGQQckhiTCAKYTFlRWQyc2M=", "F8CIWufP"));
        RoomDatabase roomDatabase = eVar.f5486a;
        roomDatabase.b();
        Cursor i11 = roomDatabase.i(b10);
        try {
            N = t0.N(i11, ea.a.p("JmQ=", "8tfjAz3X"));
            N2 = t0.N(i11, ea.a.p("K2FFZQ==", "hQ4ofTFn"));
            N3 = t0.N(i11, ea.a.p("VWE9bwFpFmU=", "Hd21735l"));
            N4 = t0.N(i11, ea.a.p("LWFPbwZpJWUMYRJl", "xPK9tQOU"));
            N5 = t0.N(i11, ea.a.p("IWFcZQ==", "r1bxngBQ"));
            N6 = t0.N(i11, ea.a.p("FmFVZQ==", "vef21O9g"));
            N7 = t0.N(i11, ea.a.p("Q2E_aA==", "0qKxGdJ0"));
            N8 = t0.N(i11, ea.a.p("RWUqZRh0", "lH7IvtnB"));
            N9 = t0.N(i11, ea.a.p("QWUoZR10JmEGZQ==", "3AKprmSp"));
            N10 = t0.N(i11, ea.a.p("RGkPZQ==", "Ys7uw2NA"));
            N11 = t0.N(i11, ea.a.p("OnBVYQ1ldnQ=", "WQbyAUM1"));
            N12 = t0.N(i11, ea.a.p("XHQjZQFTFnI9bmU=", "8aIuu22P"));
            N13 = t0.N(i11, ea.a.p("XHQjZQFTFnImd28=", "Of5y8bHF"));
            hVar = b10;
        } catch (Throwable th2) {
            th = th2;
            hVar = b10;
        }
        try {
            int N14 = t0.N(i11, ea.a.p("XHQjZQFTFnImaEZlZQ==", "0ZmqwyBp"));
            int N15 = t0.N(i11, ea.a.p("XHQjZQFTFnIzbGw=", "pf4QkNGa"));
            int N16 = t0.N(i11, ea.a.p("IHRZZQtCWG82TyRl", "2QYcctFn"));
            int N17 = t0.N(i11, ea.a.p("XHQjZQFCDW8eVENv", "yiX5rYdZ"));
            int N18 = t0.N(i11, ea.a.p("OnRcZQtCJW8kVA5yUWU=", "xMU4yJvq"));
            int N19 = t0.N(i11, ea.a.p("IHRZZQtCWG82RiV1cg==", "li3tKoOl"));
            int N20 = t0.N(i11, ea.a.p("IHRZZQtJWXQVbmU=", "I2D4y6DP"));
            int N21 = t0.N(i11, ea.a.p("XHQjZQFJDHQmd28=", "BSQkcBrF"));
            int N22 = t0.N(i11, ea.a.p("XHQjZQFJDHQmaEZlZQ==", "TEfiSC3u"));
            int N23 = t0.N(i11, ea.a.p("IHRZZQtJWXQcbz9y", "tdBfXhVg"));
            int N24 = t0.N(i11, ea.a.p("IHRZZQtMWG49TyRl", "V1UduUc2"));
            int N25 = t0.N(i11, ea.a.p("IHRZZQtMWG49VD1v", "6zCjEQDO"));
            int N26 = t0.N(i11, ea.a.p("A3QvZSpMIW4vVA5yUWU=", "HzlGXNTX"));
            int N27 = t0.N(i11, ea.a.p("OHQeZUtMDG4vRgl1cg==", "mWWv9c7J"));
            int N28 = t0.N(i11, ea.a.p("AmU-ZUZlZA==", "U7fR2EGn"));
            int N29 = t0.N(i11, ea.a.p("K2VdZQ1lU1QzbWU=", "NhPKVK6Y"));
            ArrayList arrayList2 = new ArrayList(i11.getCount());
            while (i11.moveToNext()) {
                PdfPreviewEntity pdfPreviewEntity2 = new PdfPreviewEntity();
                ArrayList arrayList3 = arrayList2;
                pdfPreviewEntity2.setId(i11.getLong(N));
                pdfPreviewEntity2.setDate(i11.getLong(N2));
                pdfPreviewEntity2.setFavorite(i11.getInt(N3));
                pdfPreviewEntity2.setFavoriteDate(i11.getLong(N4));
                pdfPreviewEntity2.setName(i11.getString(N5));
                pdfPreviewEntity2.setPage(i11.getInt(N6));
                pdfPreviewEntity2.setPath(i11.getString(N7));
                pdfPreviewEntity2.setRecent(i11.getInt(N8));
                pdfPreviewEntity2.setRecentDate(i11.getLong(N9));
                pdfPreviewEntity2.setSize(i11.getLong(N10));
                int i12 = N2;
                N11 = N11;
                int i13 = N3;
                pdfPreviewEntity2.setUpdateAt(i11.getLong(N11));
                pdfPreviewEntity2.setOtherStrOne(i11.getString(N12));
                pdfPreviewEntity2.setOtherStrTwo(i11.getString(N13));
                int i14 = N14;
                pdfPreviewEntity2.setOtherStrThree(i11.getString(i14));
                int i15 = N;
                int i16 = N15;
                pdfPreviewEntity2.setOtherStrAll(i11.getString(i16));
                int i17 = N16;
                if (i11.getInt(i17) != 0) {
                    i10 = i17;
                    z10 = true;
                } else {
                    i10 = i17;
                    z10 = false;
                }
                pdfPreviewEntity2.setOtherBoolOne(z10);
                int i18 = N17;
                if (i11.getInt(i18) != 0) {
                    N17 = i18;
                    z11 = true;
                } else {
                    N17 = i18;
                    z11 = false;
                }
                pdfPreviewEntity2.setOtherBoolTwo(z11);
                int i19 = N18;
                if (i11.getInt(i19) != 0) {
                    N18 = i19;
                    z12 = true;
                } else {
                    N18 = i19;
                    z12 = false;
                }
                pdfPreviewEntity2.setOtherBoolThree(z12);
                int i20 = N19;
                if (i11.getInt(i20) != 0) {
                    N19 = i20;
                    z13 = true;
                } else {
                    N19 = i20;
                    z13 = false;
                }
                pdfPreviewEntity2.setOtherBoolFour(z13);
                int i21 = N13;
                int i22 = N20;
                pdfPreviewEntity2.setOtherIntOne(i11.getInt(i22));
                N20 = i22;
                int i23 = N21;
                pdfPreviewEntity2.setOtherIntTwo(i11.getInt(i23));
                N21 = i23;
                int i24 = N22;
                pdfPreviewEntity2.setOtherIntThree(i11.getInt(i24));
                N22 = i24;
                int i25 = N23;
                pdfPreviewEntity2.setOtherIntFour(i11.getInt(i25));
                int i26 = N24;
                pdfPreviewEntity2.setOtherLongOne(i11.getLong(i26));
                int i27 = N25;
                pdfPreviewEntity2.setOtherLongTwo(i11.getLong(i27));
                int i28 = N26;
                pdfPreviewEntity2.setOtherLongThree(i11.getLong(i28));
                int i29 = N27;
                pdfPreviewEntity2.setOtherLongFour(i11.getLong(i29));
                int i30 = N28;
                pdfPreviewEntity2.setDeleted(i11.getInt(i30));
                int i31 = N29;
                pdfPreviewEntity2.setDeletedTime(i11.getLong(i31));
                arrayList3.add(pdfPreviewEntity2);
                N3 = i13;
                N28 = i30;
                N = i15;
                N14 = i14;
                N23 = i25;
                N26 = i28;
                N29 = i31;
                N13 = i21;
                N16 = i10;
                N15 = i16;
                N24 = i26;
                N25 = i27;
                N27 = i29;
                arrayList2 = arrayList3;
                N2 = i12;
            }
            ArrayList arrayList4 = arrayList2;
            i11.close();
            hVar.i();
            return arrayList4;
        } catch (Throwable th3) {
            th = th3;
            i11.close();
            hVar.i();
            throw th;
        }
    }

    public final ArrayList c(String str) {
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
        int N11;
        int N12;
        int N13;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        e eVar = (e) this.f5480b.k();
        eVar.getClass();
        ea.a.p("PGVdZRp0Fyp6ZjhvGCAYZFNfCGkpZRYgb0gKUgQgF2EiZRE9RCAIIDVyLmUHIAp5FWQPdCAgAWVLYw==", "bpPk8OAy");
        h b10 = h.b(1, ea.a.p("PGVdZRp0Fyp6ZjhvGCAYZFNfCGkpZRYgFkgjUgcgImEiZRE9RCAIIDVyLmUHIAp5FWQPdCAgAWUyYw==", "zzF3AfBL"));
        if (str == null) {
            b10.f(1);
        } else {
            b10.h(1, str);
        }
        RoomDatabase roomDatabase = eVar.f5486a;
        roomDatabase.b();
        Cursor i11 = roomDatabase.i(b10);
        try {
            N = t0.N(i11, ea.a.p("JmQ=", "6XnfxMEk"));
            N2 = t0.N(i11, ea.a.p("V2E_ZQ==", "J7251aGK"));
            N3 = t0.N(i11, ea.a.p("A2EmbyJpI2U=", "NBePPWJq"));
            N4 = t0.N(i11, ea.a.p("KWFHbwtpQ2UeYT5l", "ReecxoPu"));
            N5 = t0.N(i11, ea.a.p("XWEmZQ==", "jlsVC5JA"));
            N6 = t0.N(i11, ea.a.p("P2FWZQ==", "XJdyuxEn"));
            N7 = t0.N(i11, ea.a.p("P2FFaA==", "3iijMMZv"));
            N8 = t0.N(i11, ea.a.p("PWVSZRd0", "4Fh4hCNu"));
            N9 = t0.N(i11, ea.a.p("PWVSZRd0c2EuZQ==", "iRwC1Vs1"));
            N10 = t0.N(i11, ea.a.p("QGkxZQ==", "DfEmNfak"));
            N11 = t0.N(i11, ea.a.p("RnAvYQdlI3Q=", "AF1A45JL"));
            N12 = t0.N(i11, ea.a.p("IHRZZQtTQ3IVbmU=", "KuRmxIeu"));
            N13 = t0.N(i11, ea.a.p("XHQjZQFTFnImd28=", "qbtonSWo"));
            hVar = b10;
        } catch (Throwable th2) {
            th = th2;
            hVar = b10;
        }
        try {
            int N14 = t0.N(i11, ea.a.p("IHRZZQtTQ3IOaDhlZQ==", "RNdkvrDu"));
            int N15 = t0.N(i11, ea.a.p("IHRZZQtTQ3IbbGw=", "YNzwgsTL"));
            int N16 = t0.N(i11, ea.a.p("XHQjZQFCDW8eT1pl", "16yj95nv"));
            int N17 = t0.N(i11, ea.a.p("IHRZZQtCWG82VD1v", "2uFky3ld"));
            int N18 = t0.N(i11, ea.a.p("IHRZZQtCWG82VCJyEGU=", "ddNPsnVb"));
            int N19 = t0.N(i11, ea.a.p("XHQjZQFCDW8eRlt1cg==", "aPT1KQNq"));
            int N20 = t0.N(i11, ea.a.p("IHRZZQtJWXQVbmU=", "zZfLzPnC"));
            int N21 = t0.N(i11, ea.a.p("XHQjZQFJDHQmd28=", "5us23nXC"));
            int N22 = t0.N(i11, ea.a.p("HnQrZQRJInQcaBRlZQ==", "iTqCvLNg"));
            int N23 = t0.N(i11, ea.a.p("XHQjZQFJDHQ0b0Fy", "e6KwQjqS"));
            int N24 = t0.N(i11, ea.a.p("XHQjZQFMDW4VT1pl", "IQ7S3XjQ"));
            int N25 = t0.N(i11, ea.a.p("XHQjZQFMDW4VVENv", "eAupvOVa"));
            int N26 = t0.N(i11, ea.a.p("XHQjZQFMDW4VVFxyDGU=", "D00Nvdqf"));
            int N27 = t0.N(i11, ea.a.p("IHRZZQtMWG49RiV1cg==", "ueVkW4R2"));
            int N28 = t0.N(i11, ea.a.p("V2UnZQdlZA==", "htJ60rCj"));
            int N29 = t0.N(i11, ea.a.p("V2UnZQdlBlQbbWU=", "mgS0WJRp"));
            ArrayList arrayList = new ArrayList(i11.getCount());
            while (i11.moveToNext()) {
                PdfPreviewEntity pdfPreviewEntity = new PdfPreviewEntity();
                ArrayList arrayList2 = arrayList;
                pdfPreviewEntity.setId(i11.getLong(N));
                pdfPreviewEntity.setDate(i11.getLong(N2));
                pdfPreviewEntity.setFavorite(i11.getInt(N3));
                pdfPreviewEntity.setFavoriteDate(i11.getLong(N4));
                pdfPreviewEntity.setName(i11.getString(N5));
                pdfPreviewEntity.setPage(i11.getInt(N6));
                pdfPreviewEntity.setPath(i11.getString(N7));
                pdfPreviewEntity.setRecent(i11.getInt(N8));
                pdfPreviewEntity.setRecentDate(i11.getLong(N9));
                pdfPreviewEntity.setSize(i11.getLong(N10));
                int i12 = N2;
                N11 = N11;
                int i13 = N3;
                pdfPreviewEntity.setUpdateAt(i11.getLong(N11));
                pdfPreviewEntity.setOtherStrOne(i11.getString(N12));
                pdfPreviewEntity.setOtherStrTwo(i11.getString(N13));
                int i14 = N14;
                pdfPreviewEntity.setOtherStrThree(i11.getString(i14));
                int i15 = N;
                int i16 = N15;
                pdfPreviewEntity.setOtherStrAll(i11.getString(i16));
                int i17 = N16;
                if (i11.getInt(i17) != 0) {
                    i10 = i17;
                    z10 = true;
                } else {
                    i10 = i17;
                    z10 = false;
                }
                pdfPreviewEntity.setOtherBoolOne(z10);
                int i18 = N17;
                if (i11.getInt(i18) != 0) {
                    N17 = i18;
                    z11 = true;
                } else {
                    N17 = i18;
                    z11 = false;
                }
                pdfPreviewEntity.setOtherBoolTwo(z11);
                int i19 = N18;
                if (i11.getInt(i19) != 0) {
                    N18 = i19;
                    z12 = true;
                } else {
                    N18 = i19;
                    z12 = false;
                }
                pdfPreviewEntity.setOtherBoolThree(z12);
                int i20 = N19;
                if (i11.getInt(i20) != 0) {
                    N19 = i20;
                    z13 = true;
                } else {
                    N19 = i20;
                    z13 = false;
                }
                pdfPreviewEntity.setOtherBoolFour(z13);
                int i21 = N13;
                int i22 = N20;
                pdfPreviewEntity.setOtherIntOne(i11.getInt(i22));
                N20 = i22;
                int i23 = N21;
                pdfPreviewEntity.setOtherIntTwo(i11.getInt(i23));
                N21 = i23;
                int i24 = N22;
                pdfPreviewEntity.setOtherIntThree(i11.getInt(i24));
                N22 = i24;
                int i25 = N23;
                pdfPreviewEntity.setOtherIntFour(i11.getInt(i25));
                int i26 = N12;
                int i27 = N24;
                pdfPreviewEntity.setOtherLongOne(i11.getLong(i27));
                int i28 = N25;
                pdfPreviewEntity.setOtherLongTwo(i11.getLong(i28));
                int i29 = N26;
                pdfPreviewEntity.setOtherLongThree(i11.getLong(i29));
                int i30 = N27;
                pdfPreviewEntity.setOtherLongFour(i11.getLong(i30));
                int i31 = N28;
                pdfPreviewEntity.setDeleted(i11.getInt(i31));
                int i32 = N29;
                pdfPreviewEntity.setDeletedTime(i11.getLong(i32));
                arrayList2.add(pdfPreviewEntity);
                N2 = i12;
                arrayList = arrayList2;
                N12 = i26;
                N23 = i25;
                N26 = i29;
                N29 = i32;
                N13 = i21;
                N16 = i10;
                N15 = i16;
                N3 = i13;
                N = i15;
                N14 = i14;
                N24 = i27;
                N25 = i28;
                N27 = i30;
                N28 = i31;
            }
            ArrayList arrayList3 = arrayList;
            i11.close();
            hVar.i();
            return arrayList3;
        } catch (Throwable th3) {
            th = th3;
            i11.close();
            hVar.i();
            throw th;
        }
    }

    public final PdfPreviewEntity d(String str) {
        return ((e) this.f5480b.k()).d(str);
    }

    public final void e(String str, String str2, String str3, ArrayList<PdfPreviewEntity> arrayList) {
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
        int N11;
        int N12;
        int N13;
        PdfPreviewEntity pdfPreviewEntity;
        File b10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        ReaderAppDataBase readerAppDataBase = this.f5480b;
        e eVar = (e) readerAppDataBase.k();
        eVar.getClass();
        ea.a.p("QGUnZRB0QipSZkZvBCAmZCJfVGkqZTAgMkgJUgwgRWFHaGtsGmsHIFUlEyAVfHY_ZHxOIGElZCAkTgggJnRdZUFTP3I8bgcgTz0UPw==", "eLI5Et4m");
        h b11 = h.b(2, ea.a.p("RWU4ZVR0USpoZhRvWSAnZF5fNGklZUUgI0g0UhQgMmFCaHRsXmsUIG8lQSBIfHc_GHwuIG4lESA1TjUgPnQqZURTIHJ4bhQgdT1GPw==", "g86T7qqC"));
        if (str == null) {
            b11.f(1);
        } else {
            b11.h(1, str);
        }
        b11.h(2, str2);
        RoomDatabase roomDatabase = eVar.f5486a;
        roomDatabase.b();
        Cursor i10 = roomDatabase.i(b11);
        try {
            N = t0.N(i10, ea.a.p("XmQ=", "jI7qGtIy"));
            N2 = t0.N(i10, ea.a.p("V2E_ZQ==", "lfsSaNpP"));
            N3 = t0.N(i10, ea.a.p("VWE9bwFpFmU=", "86d1KUoa"));
            N4 = t0.N(i10, ea.a.p("FWEbbydpRmUMYRJl", "T7smU2uj"));
            N5 = t0.N(i10, ea.a.p("IWFcZQ==", "KLZMeYVf"));
            N6 = t0.N(i10, ea.a.p("R2ETZQ==", "T97t8vt2"));
            N7 = t0.N(i10, ea.a.p("AGENaA==", "8cpy7sgy"));
            N8 = t0.N(i10, ea.a.p("JGUKZTZ0", "HBViXAwq"));
            N9 = t0.N(i10, ea.a.p("QWUoZR10JmEGZQ==", "JXfaPTmT"));
            N10 = t0.N(i10, ea.a.p("PGlLZQ==", "NWfsM8OL"));
            N11 = t0.N(i10, ea.a.p("M3AqYR1lMnQ=", "gqFNisMh"));
            N12 = t0.N(i10, ea.a.p("XHQjZQFTFnI9bmU=", "SrLPNx2m"));
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            N13 = t0.N(i10, ea.a.p("PnQlZTNTB3Icd28=", "9UQMAs9o"));
            hVar = b11;
        } catch (Throwable th3) {
            th = th3;
            hVar = b11;
            i10.close();
            hVar.i();
            throw th;
        }
        try {
            int N14 = t0.N(i10, ea.a.p("XHQjZQFTFnImaEZlZQ==", "lx9taBdn"));
            int N15 = t0.N(i10, ea.a.p("IHRZZQtTQ3IbbGw=", "6LnXWndd"));
            int N16 = t0.N(i10, ea.a.p("XHQjZQFCDW8eT1pl", "ELqSPDBs"));
            int N17 = t0.N(i10, ea.a.p("XHQjZQFCDW8eVENv", "0WwwFEuB"));
            int N18 = t0.N(i10, ea.a.p("XHQjZQFCDW8eVFxyDGU=", "TWSDpCNR"));
            int N19 = t0.N(i10, ea.a.p("IHRZZQtCWG82RiV1cg==", "e11dGlFT"));
            int N20 = t0.N(i10, ea.a.p("DHQiZTpJWXQHbmU=", "qpcJH7eQ"));
            int N21 = t0.N(i10, ea.a.p("IHRZZQtJWXQOd28=", "4YAfReVL"));
            int N22 = t0.N(i10, ea.a.p("IHRZZQtJWXQOaDhlZQ==", "6cWx3hrn"));
            int N23 = t0.N(i10, ea.a.p("XHQjZQFJDHQ0b0Fy", "BWLLeqz0"));
            int N24 = t0.N(i10, ea.a.p("IHRZZQtMWG49TyRl", "WeRKIBub"));
            int N25 = t0.N(i10, ea.a.p("XHQjZQFMDW4VVENv", "vbmPaBch"));
            int N26 = t0.N(i10, ea.a.p("A3QRZTdMWG4vVA5yUWU=", "VvlyE7lg"));
            int N27 = t0.N(i10, ea.a.p("XHQjZQFMDW4VRlt1cg==", "7zbS3tt2"));
            int N28 = t0.N(i10, ea.a.p("V2UnZQdlZA==", "66ARAglS"));
            int N29 = t0.N(i10, ea.a.p("K2VdZQ1lU1QzbWU=", "dPxxIhEp"));
            if (i10.moveToFirst()) {
                pdfPreviewEntity = new PdfPreviewEntity();
                pdfPreviewEntity.setId(i10.getLong(N));
                pdfPreviewEntity.setDate(i10.getLong(N2));
                pdfPreviewEntity.setFavorite(i10.getInt(N3));
                pdfPreviewEntity.setFavoriteDate(i10.getLong(N4));
                pdfPreviewEntity.setName(i10.getString(N5));
                pdfPreviewEntity.setPage(i10.getInt(N6));
                pdfPreviewEntity.setPath(i10.getString(N7));
                pdfPreviewEntity.setRecent(i10.getInt(N8));
                pdfPreviewEntity.setRecentDate(i10.getLong(N9));
                pdfPreviewEntity.setSize(i10.getLong(N10));
                pdfPreviewEntity.setUpdateAt(i10.getLong(N11));
                pdfPreviewEntity.setOtherStrOne(i10.getString(N12));
                pdfPreviewEntity.setOtherStrTwo(i10.getString(N13));
                pdfPreviewEntity.setOtherStrThree(i10.getString(N14));
                pdfPreviewEntity.setOtherStrAll(i10.getString(N15));
                if (i10.getInt(N16) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                pdfPreviewEntity.setOtherBoolOne(z10);
                if (i10.getInt(N17) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                pdfPreviewEntity.setOtherBoolTwo(z11);
                if (i10.getInt(N18) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                pdfPreviewEntity.setOtherBoolThree(z12);
                if (i10.getInt(N19) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                pdfPreviewEntity.setOtherBoolFour(z13);
                pdfPreviewEntity.setOtherIntOne(i10.getInt(N20));
                pdfPreviewEntity.setOtherIntTwo(i10.getInt(N21));
                pdfPreviewEntity.setOtherIntThree(i10.getInt(N22));
                pdfPreviewEntity.setOtherIntFour(i10.getInt(N23));
                pdfPreviewEntity.setOtherLongOne(i10.getLong(N24));
                pdfPreviewEntity.setOtherLongTwo(i10.getLong(N25));
                pdfPreviewEntity.setOtherLongThree(i10.getLong(N26));
                pdfPreviewEntity.setOtherLongFour(i10.getLong(N27));
                pdfPreviewEntity.setDeleted(i10.getInt(N28));
                pdfPreviewEntity.setDeletedTime(i10.getLong(N29));
            } else {
                pdfPreviewEntity = null;
            }
            i10.close();
            hVar.i();
            if (pdfPreviewEntity == null && (b10 = l.b(this.f5481d, str3)) != null && b10.exists() && b10.length() > 0) {
                d k10 = readerAppDataBase.k();
                PdfPreviewEntity pdfPreviewEntity2 = new PdfPreviewEntity();
                pdfPreviewEntity2.setPath(b10.getAbsolutePath());
                pdfPreviewEntity2.setName(bg.b.B0(b10));
                pdfPreviewEntity2.setSize(b10.length());
                pdfPreviewEntity2.setDate(b10.lastModified());
                pdfPreviewEntity2.setOtherStrOne(v.y(b10));
                ((e) k10).b(pdfPreviewEntity2);
                PdfPreviewEntity d10 = ((e) readerAppDataBase.k()).d(b10.getAbsolutePath());
                if (d10 != null) {
                    arrayList.add(d10);
                }
            }
        } catch (Throwable th4) {
            th = th4;
            i10.close();
            hVar.i();
            throw th;
        }
    }

    public final void f(List<PdfPreviewEntity> list, InterfaceC0042c interfaceC0042c) {
        interfaceC0042c.a();
        this.c.f5473a.execute(new a(list, interfaceC0042c));
    }

    public final void g(PdfPreviewEntity pdfPreviewEntity) {
        this.f5479a.getClass();
        z3.c.f(pdfPreviewEntity);
        ((e) this.f5480b.k()).b(pdfPreviewEntity);
    }

    public final void h(PdfPreviewEntity pdfPreviewEntity) {
        this.c.f5473a.execute(new g(13, this, pdfPreviewEntity));
    }

    public final void i(PdfPreviewEntity pdfPreviewEntity) {
        this.c.f5473a.execute(new b(pdfPreviewEntity));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(ArrayList arrayList) {
        e eVar = (e) this.f5480b.k();
        RoomDatabase roomDatabase = eVar.f5486a;
        roomDatabase.b();
        roomDatabase.c();
        try {
            e.a aVar = eVar.f5487b;
            b2.e a10 = aVar.a();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                aVar.d(a10, it.next());
                a10.f5320b.executeInsert();
            }
            aVar.c(a10);
            roomDatabase.j();
        } finally {
            roomDatabase.g();
        }
    }
}
