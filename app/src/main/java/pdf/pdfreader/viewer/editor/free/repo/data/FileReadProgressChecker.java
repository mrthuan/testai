package pdf.pdfreader.viewer.editor.free.repo.data;

import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.room.RoomDatabase;
import bm.e;
import f0.s;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.a;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.utils.c1;
import pdf.pdfreader.viewer.editor.free.utils.i1;
import pdf.pdfreader.viewer.editor.free.utils.q0;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import qb.v;
import tf.c;
import w1.h;
import yn.b;

/* compiled from: FileReadProgressChecker.kt */
/* loaded from: classes3.dex */
public final class FileReadProgressChecker {

    /* renamed from: a  reason: collision with root package name */
    public static final c f26553a = a.a(new cg.a<ExecutorService>() { // from class: pdf.pdfreader.viewer.editor.free.repo.data.FileReadProgressChecker$threadPool$2
        @Override // cg.a
        public final ExecutorService invoke() {
            return Executors.newFixedThreadPool(1);
        }
    });

    /* renamed from: b  reason: collision with root package name */
    public static final c f26554b = a.a(new cg.a<Handler>() { // from class: pdf.pdfreader.viewer.editor.free.repo.data.FileReadProgressChecker$mainHandler$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    });
    public static long c;

    public static void a(Context context, boolean z10) {
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
        ArrayList arrayList;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        g.e(context, "context");
        if (!g.a(Thread.currentThread(), Looper.getMainLooper().getThread()) && !z10) {
            if (b.f32194o.h0(context)) {
                return;
            }
            long m10 = q0.m(context, "new_file_notification_time_142");
            if (m10 < 0 || !i1.b(m10)) {
                e eVar = (e) bm.c.b(context).f5480b.k();
                eVar.getClass();
                ea.a.p("AmVaZRB0eipoZhRvWSAnZF5fNGklZUUgI0g0UhQgMGUSZVh0Uz1nIHkgJ05wIDh0UGUgUz1yeW4RIEw9cScSRDcnFm8BZD9yaGIfIEZlNGVWdBZhPWUWZBFzYw==", "pcq6sZPZ");
                h b10 = h.b(0, ea.a.p("NWU1ZRl0USpoZhRvWSAnZF5fNGklZUUgI0g0UhQgMGUlZTd0Wj1MIHkgJ05wIDh0UGUgUz1yeW4RIEw9cScSRAAneW8IZBRyaGIfIEZlNGVWdBZhPWUWZBFzYw==", "kpFYzqjA"));
                RoomDatabase roomDatabase = eVar.f5486a;
                roomDatabase.b();
                Cursor i11 = roomDatabase.i(b10);
                try {
                    N = t0.N(i11, ea.a.p("GmQ=", "sesP2uqs"));
                    N2 = t0.N(i11, ea.a.p("V2E_ZQ==", "iw5FyZxx"));
                    N3 = t0.N(i11, ea.a.p("FmEDbwBpGWU=", "ckpurmFq"));
                    N4 = t0.N(i11, ea.a.p("KWFHbwtpQ2UeYT5l", "3MeDV4Ey"));
                    N5 = t0.N(i11, ea.a.p("XWEmZQ==", "rSos3l1L"));
                    N6 = t0.N(i11, ea.a.p("P2FWZQ==", "K2VJFhNj"));
                    N7 = t0.N(i11, ea.a.p("KmEGaA==", "B3ZrqMEn"));
                    N8 = t0.N(i11, ea.a.p("PWVSZRd0", "hcmRhy6T"));
                    N9 = t0.N(i11, ea.a.p("PWVSZRd0c2EuZQ==", "Xd2l26YQ"));
                    N10 = t0.N(i11, ea.a.p("QGkxZQ==", "593lRJqI"));
                    N11 = t0.N(i11, ea.a.p("RnAvYQdlI3Q=", "55LH8niD"));
                    N12 = t0.N(i11, ea.a.p("XHQjZQFTFnI9bmU=", "A2H0CN5S"));
                    N13 = t0.N(i11, ea.a.p("HHQEZRBTDnIcd28=", "u9slbzn4"));
                    hVar = b10;
                } catch (Throwable th2) {
                    th = th2;
                    hVar = b10;
                }
                try {
                    int N14 = t0.N(i11, ea.a.p("XHQjZQFTFnImaEZlZQ==", "IgSfdItb"));
                    int N15 = t0.N(i11, ea.a.p("XHQjZQFTFnIzbGw=", "vuIsf5ve"));
                    int N16 = t0.N(i11, ea.a.p("XHQjZQFCDW8eT1pl", "0X1YfEC2"));
                    int N17 = t0.N(i11, ea.a.p("VnQLZQdCHm8kVBFv", "Wc9cuqcy"));
                    int N18 = t0.N(i11, ea.a.p("IHRZZQtCWG82VCJyEGU=", "8RKgUNJY"));
                    int N19 = t0.N(i11, ea.a.p("IHRZZQtCWG82RiV1cg==", "sVpEZnm2"));
                    int N20 = t0.N(i11, ea.a.p("IHRZZQtJWXQVbmU=", "AY4LKfFB"));
                    int N21 = t0.N(i11, ea.a.p("XHQjZQFJDHQmd28=", "4avgjdrn"));
                    int N22 = t0.N(i11, ea.a.p("HXQLZTtJAXQcaBRlZQ==", "NJrcIoq8"));
                    int N23 = t0.N(i11, ea.a.p("XHQjZQFJDHQ0b0Fy", "cx9W85am"));
                    int N24 = t0.N(i11, ea.a.p("IHRZZQtMWG49TyRl", "sNflw6ts"));
                    int N25 = t0.N(i11, ea.a.p("XHQjZQFMDW4VVENv", "cSbVu24L"));
                    int N26 = t0.N(i11, ea.a.p("XHQjZQFMDW4VVFxyDGU=", "iaT9Rs5b"));
                    int N27 = t0.N(i11, ea.a.p("IHRZZQtMWG49RiV1cg==", "rVDXGc8r"));
                    int N28 = t0.N(i11, ea.a.p("K2VdZQ1lZA==", "WL1FrYoW"));
                    int N29 = t0.N(i11, ea.a.p("V2UnZQdlBlQbbWU=", "Sz3tKA49"));
                    ArrayList arrayList2 = new ArrayList(i11.getCount());
                    while (true) {
                        arrayList = arrayList2;
                        if (!i11.moveToNext()) {
                            break;
                        }
                        PdfPreviewEntity pdfPreviewEntity = new PdfPreviewEntity();
                        int i12 = N12;
                        int i13 = N13;
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
                        pdfPreviewEntity.setUpdateAt(i11.getLong(N11));
                        pdfPreviewEntity.setOtherStrOne(i11.getString(i12));
                        pdfPreviewEntity.setOtherStrTwo(i11.getString(i13));
                        int i14 = N14;
                        pdfPreviewEntity.setOtherStrThree(i11.getString(i14));
                        int i15 = N15;
                        pdfPreviewEntity.setOtherStrAll(i11.getString(i15));
                        int i16 = N16;
                        if (i11.getInt(i16) != 0) {
                            N15 = i15;
                            z11 = true;
                        } else {
                            N15 = i15;
                            z11 = false;
                        }
                        pdfPreviewEntity.setOtherBoolOne(z11);
                        int i17 = N17;
                        N17 = i17;
                        if (i11.getInt(i17) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        pdfPreviewEntity.setOtherBoolTwo(z12);
                        int i18 = N18;
                        N18 = i18;
                        if (i11.getInt(i18) != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        pdfPreviewEntity.setOtherBoolThree(z13);
                        int i19 = N19;
                        N19 = i19;
                        if (i11.getInt(i19) != 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        pdfPreviewEntity.setOtherBoolFour(z14);
                        N16 = i16;
                        int i20 = N20;
                        pdfPreviewEntity.setOtherIntOne(i11.getInt(i20));
                        N20 = i20;
                        int i21 = N21;
                        pdfPreviewEntity.setOtherIntTwo(i11.getInt(i21));
                        N21 = i21;
                        int i22 = N22;
                        pdfPreviewEntity.setOtherIntThree(i11.getInt(i22));
                        N22 = i22;
                        int i23 = N23;
                        pdfPreviewEntity.setOtherIntFour(i11.getInt(i23));
                        int i24 = N;
                        int i25 = N24;
                        int i26 = N11;
                        pdfPreviewEntity.setOtherLongOne(i11.getLong(i25));
                        int i27 = N25;
                        pdfPreviewEntity.setOtherLongTwo(i11.getLong(i27));
                        int i28 = N26;
                        pdfPreviewEntity.setOtherLongThree(i11.getLong(i28));
                        int i29 = N27;
                        pdfPreviewEntity.setOtherLongFour(i11.getLong(i29));
                        int i30 = N28;
                        pdfPreviewEntity.setDeleted(i11.getInt(i30));
                        int i31 = N29;
                        pdfPreviewEntity.setDeletedTime(i11.getLong(i31));
                        arrayList.add(pdfPreviewEntity);
                        N = i24;
                        N23 = i23;
                        N26 = i28;
                        N29 = i31;
                        N13 = i13;
                        N28 = i30;
                        N12 = i12;
                        N14 = i14;
                        arrayList2 = arrayList;
                        N11 = i26;
                        N24 = i25;
                        N25 = i27;
                        N27 = i29;
                    }
                    i11.close();
                    hVar.i();
                    if (!arrayList.isEmpty()) {
                        ArrayList arrayList3 = new ArrayList();
                        ea.a.p("PWVSZRd0cWk2ZXM=", "QPwPbXQo");
                        Iterator it = arrayList.iterator();
                        nl.b bVar = null;
                        while (it.hasNext()) {
                            PdfPreviewEntity pdfPreviewEntity2 = (PdfPreviewEntity) it.next();
                            g.d(pdfPreviewEntity2, ea.a.p("JnQ=", "R1CuOVwT"));
                            nl.b w7 = com.google.android.play.core.assetpacks.c.w(pdfPreviewEntity2);
                            if (bVar == null && (i10 = w7.f22594o) != 0 && w7.f22595p < i10 && !w7.f22592m) {
                                w7.f22592m = true;
                                bVar = w7;
                            } else {
                                w7.f22592m = false;
                                com.google.android.play.core.assetpacks.c.P(w7, pdfPreviewEntity2);
                                arrayList3.add(pdfPreviewEntity2);
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                            bm.c.b(context).j(arrayList3);
                        }
                        if (bVar != null) {
                            q0.z(System.currentTimeMillis(), context, "new_file_notification_time_142");
                            ((Handler) f26554b.getValue()).post(new com.facebook.appevents.g(18, context, bVar));
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    i11.close();
                    hVar.i();
                    throw th;
                }
            }
            return;
        }
        ((ExecutorService) f26553a.getValue()).execute(new u1.c(context, 2));
    }

    public static void b(Context context, boolean z10) {
        long currentTimeMillis;
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
        long j10;
        int N12;
        int N13;
        Object obj;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        g.e(context, "context");
        if (!g.a(Thread.currentThread(), Looper.getMainLooper().getThread()) && !z10) {
            if (yn.c.f32199o.h0(context)) {
                return;
            }
            long m10 = q0.m(context, "new_file_notification_time_142");
            if (m10 < 0 || !i1.b(m10)) {
                int z16 = c1.z(context);
                int A = c1.A(context);
                int i10 = i1.f28707a;
                try {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(new Date());
                    calendar.set(11, z16);
                    calendar.set(12, A);
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                    calendar.add(5, -1);
                    currentTimeMillis = calendar.getTimeInMillis();
                } catch (Exception e10) {
                    e10.printStackTrace();
                    currentTimeMillis = System.currentTimeMillis() - 86400000;
                }
                e eVar = (e) bm.c.b(context).f5480b.k();
                eVar.getClass();
                ea.a.p("PGVdZRp0Fyp6ZjhvGCAYZFNfCGkpZRYgL0hzUi8gCmE7ZRE-RCA_", "in23x6jn");
                h b10 = h.b(1, ea.a.p("PWUUZVF0FypoZhRvWSAnZF5fNGklZUUgI0g0UhQgJmE6ZVg-DyA_", "72Nx27Af"));
                b10.d(1, currentTimeMillis);
                RoomDatabase roomDatabase = eVar.f5486a;
                roomDatabase.b();
                Cursor i11 = roomDatabase.i(b10);
                try {
                    N = t0.N(i11, ea.a.p("WmQ=", "0CEcIvBG"));
                    N2 = t0.N(i11, ea.a.p("V2E_ZQ==", "neSOnauU"));
                    N3 = t0.N(i11, ea.a.p("FWFAbztpPGU=", "BMs6IHWe"));
                    N4 = t0.N(i11, ea.a.p("VWE9bwFpFmU2YUBl", "Fov2m0QP"));
                    N5 = t0.N(i11, ea.a.p("JmE8ZQ==", "ciHQMAA1"));
                    N6 = t0.N(i11, ea.a.p("A2EAZQ==", "rJsgfutq"));
                    N7 = t0.N(i11, ea.a.p("GGERaA==", "j2he7iFH"));
                    N8 = t0.N(i11, ea.a.p("QGUGZQV0", "c92ekHyG"));
                    N9 = t0.N(i11, ea.a.p("H2VUZSh0BmE8ZQ==", "BEm7FBTO"));
                    N10 = t0.N(i11, ea.a.p("PGlLZQ==", "AJFIclVg"));
                    N11 = t0.N(i11, ea.a.p("RnAvYQdlI3Q=", "OdQlFtOa"));
                    j10 = currentTimeMillis;
                    N12 = t0.N(i11, ea.a.p("XXQcZR9TNXIHbmU=", "HG2tmAop"));
                    N13 = t0.N(i11, ea.a.p("IHRZZQtTQ3IOd28=", "UwOvecyI"));
                    hVar = b10;
                } catch (Throwable th2) {
                    th = th2;
                    hVar = b10;
                }
                try {
                    int N14 = t0.N(i11, ea.a.p("XHQjZQFTFnImaEZlZQ==", "YqiAitK5"));
                    int N15 = t0.N(i11, ea.a.p("XHQjZQFTFnIzbGw=", "skoDCptS"));
                    int N16 = t0.N(i11, ea.a.p("IHRZZQtCWG82TyRl", "ftRYU3W1"));
                    int N17 = t0.N(i11, ea.a.p("IHRZZQtCWG82VD1v", "Pe1MMWtP"));
                    int N18 = t0.N(i11, ea.a.p("CHQ_ZUZCLG8kVA5yUWU=", "89gW4CWe"));
                    int N19 = t0.N(i11, ea.a.p("XHQjZQFCDW8eRlt1cg==", "ZgSDIDNV"));
                    int N20 = t0.N(i11, ea.a.p("XHQjZQFJDHQ9bmU=", "gZhOzrSM"));
                    int N21 = t0.N(i11, ea.a.p("IHRZZQtJWXQOd28=", "JmvzJ6Mn"));
                    int N22 = t0.N(i11, ea.a.p("XHQjZQFJDHQmaEZlZQ==", "61TTfa6O"));
                    int N23 = t0.N(i11, ea.a.p("IHRZZQtJWXQcbz9y", "KYZtQe4o"));
                    int N24 = t0.N(i11, ea.a.p("HXRfZRVMFW4vTwhl", "MJr7gzkv"));
                    int N25 = t0.N(i11, ea.a.p("FXQ8ZTBMBG4vVBFv", "B9zTBkH2"));
                    int N26 = t0.N(i11, ea.a.p("IHRZZQtMWG49VCJyEGU=", "xklPKTYu"));
                    int N27 = t0.N(i11, ea.a.p("IXQQZQpMHm4vRgl1cg==", "XPNxxqAk"));
                    int N28 = t0.N(i11, ea.a.p("LGUhZTllZA==", "1qHMMDmr"));
                    int N29 = t0.N(i11, ea.a.p("K2VdZQ1lU1QzbWU=", "VmUWfZzD"));
                    ArrayList arrayList = new ArrayList(i11.getCount());
                    while (i11.moveToNext()) {
                        PdfPreviewEntity pdfPreviewEntity = new PdfPreviewEntity();
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
                        pdfPreviewEntity.setUpdateAt(i11.getLong(N11));
                        N12 = N12;
                        pdfPreviewEntity.setOtherStrOne(i11.getString(N12));
                        int i12 = N;
                        N13 = N13;
                        pdfPreviewEntity.setOtherStrTwo(i11.getString(N13));
                        int i13 = N14;
                        int i14 = N10;
                        pdfPreviewEntity.setOtherStrThree(i11.getString(i13));
                        int i15 = N15;
                        pdfPreviewEntity.setOtherStrAll(i11.getString(i15));
                        int i16 = N16;
                        if (i11.getInt(i16) != 0) {
                            N16 = i16;
                            z12 = true;
                        } else {
                            N16 = i16;
                            z12 = false;
                        }
                        pdfPreviewEntity.setOtherBoolOne(z12);
                        int i17 = N17;
                        if (i11.getInt(i17) != 0) {
                            N17 = i17;
                            z13 = true;
                        } else {
                            N17 = i17;
                            z13 = false;
                        }
                        pdfPreviewEntity.setOtherBoolTwo(z13);
                        int i18 = N18;
                        if (i11.getInt(i18) != 0) {
                            N18 = i18;
                            z14 = true;
                        } else {
                            N18 = i18;
                            z14 = false;
                        }
                        pdfPreviewEntity.setOtherBoolThree(z14);
                        int i19 = N19;
                        if (i11.getInt(i19) != 0) {
                            N19 = i19;
                            z15 = true;
                        } else {
                            N19 = i19;
                            z15 = false;
                        }
                        pdfPreviewEntity.setOtherBoolFour(z15);
                        int i20 = N20;
                        pdfPreviewEntity.setOtherIntOne(i11.getInt(i20));
                        int i21 = N21;
                        pdfPreviewEntity.setOtherIntTwo(i11.getInt(i21));
                        int i22 = N22;
                        pdfPreviewEntity.setOtherIntThree(i11.getInt(i22));
                        int i23 = N23;
                        pdfPreviewEntity.setOtherIntFour(i11.getInt(i23));
                        int i24 = N11;
                        int i25 = N24;
                        int i26 = N9;
                        pdfPreviewEntity.setOtherLongOne(i11.getLong(i25));
                        int i27 = N25;
                        pdfPreviewEntity.setOtherLongTwo(i11.getLong(i27));
                        int i28 = N26;
                        pdfPreviewEntity.setOtherLongThree(i11.getLong(i28));
                        int i29 = N27;
                        pdfPreviewEntity.setOtherLongFour(i11.getLong(i29));
                        int i30 = N28;
                        pdfPreviewEntity.setDeleted(i11.getInt(i30));
                        int i31 = N29;
                        pdfPreviewEntity.setDeletedTime(i11.getLong(i31));
                        arrayList.add(pdfPreviewEntity);
                        N9 = i26;
                        N24 = i25;
                        N25 = i27;
                        N27 = i29;
                        N11 = i24;
                        N28 = i30;
                        N = i12;
                        N29 = i31;
                        N10 = i14;
                        N14 = i13;
                        N15 = i15;
                        N20 = i20;
                        N21 = i21;
                        N22 = i22;
                        N23 = i23;
                        N26 = i28;
                    }
                    i11.close();
                    hVar.i();
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (((PdfPreviewEntity) obj).getRecentDate() >= j10) {
                                    z11 = true;
                                    continue;
                                } else {
                                    z11 = false;
                                    continue;
                                }
                                if (z11) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        if (obj == null) {
                            q0.z(System.currentTimeMillis(), context, "new_file_notification_time_142");
                            ((Handler) f26554b.getValue()).post(new s(26, context, arrayList));
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    i11.close();
                    hVar.i();
                    throw th;
                }
            }
            return;
        }
        ((ExecutorService) f26553a.getValue()).execute(new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.b(context, 5));
    }

    public static void c(Context context) {
        g.e(context, "context");
        if (Math.abs(SystemClock.elapsedRealtime() - c) < 10000) {
            return;
        }
        c = SystemClock.elapsedRealtime();
        d(context);
    }

    public static void d(Context context) {
        boolean z10 = true;
        if (g.a(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            ((ExecutorService) f26553a.getValue()).execute(new v(context, 1));
            return;
        }
        Calendar calendar = Calendar.getInstance();
        int i10 = calendar.get(11);
        int i11 = calendar.get(12);
        if (!b.f32194o.h0(context)) {
            int x4 = c1.x(context);
            int y10 = c1.y(context);
            if (x4 == i10 && y10 == i11) {
                a(context, false);
                if (yn.c.f32199o.h0(context) && !z10) {
                    int z11 = c1.z(context);
                    int A = c1.A(context);
                    if (z11 == i10 && A == i11) {
                        b(context, false);
                        return;
                    }
                    return;
                }
            }
        }
        z10 = false;
        if (yn.c.f32199o.h0(context)) {
        }
    }
}
