package qp;

import android.app.Activity;
import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import lib.zj.pdfeditor.ReaderPDFCore;

/* compiled from: PDFDoc.java */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f29413a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f29414b;
    public final String c;

    /* renamed from: e  reason: collision with root package name */
    public ReaderPDFCore f29416e;

    /* renamed from: h  reason: collision with root package name */
    public int f29419h;

    /* renamed from: i  reason: collision with root package name */
    public int f29420i;

    /* renamed from: d  reason: collision with root package name */
    public boolean f29415d = false;

    /* renamed from: f  reason: collision with root package name */
    public final HashMap<String, String> f29417f = new HashMap<>();

    /* renamed from: g  reason: collision with root package name */
    public int f29418g = 0;

    static {
        ea.a.p("Y0QNRBxj", "jddhS8Fb");
    }

    public b(Activity activity, String str, String str2) {
        this.f29416e = null;
        this.f29413a = str;
        this.f29414b = activity;
        this.c = str2;
        try {
            this.f29416e = new ReaderPDFCore(activity);
        } catch (Exception e10) {
            ea.a.p("Y0QNRBxj", "a97gTj7U");
            ea.a.p("E3JcYUVlGWYhbAMgUXIlb0o6IA==", "Pcp9194U");
            e10.getMessage();
        }
    }

    public final void a(c cVar, boolean z10) {
        boolean z11;
        ReaderPDFCore readerPDFCore = this.f29416e;
        if (readerPDFCore == null) {
            ea.a.p("UG85ZVNuF2weIENoDG52cCVnVyA=", "iQojIDP5");
            return;
        }
        ReaderPDFCore.b createPage = readerPDFCore.createPage(cVar.f29421a, cVar.f29422b);
        ArrayList<a> arrayList = cVar.f29423d;
        Iterator<a> it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!it.next().b(createPage)) {
                    z11 = false;
                    break;
                }
            } else {
                z11 = true;
                break;
            }
        }
        if (z11) {
            this.f29419h = this.f29418g;
            createPage.close();
            Iterator<a> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().a();
            }
            return;
        }
        long j10 = createPage.f21371a;
        if (j10 != 0) {
            ReaderPDFCore.this.abandonWriter(j10);
            createPage.f21371a = 0L;
        }
        if (z10) {
            d(true);
            a(cVar, false);
            Iterator<a> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                it3.next().a();
            }
            return;
        }
        ea.a.p("PGtYcFlwVmc_IA==", "3oAzLWy1");
    }

    public final void b() {
        File[] listFiles;
        File file = new File(this.f29413a);
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.getName().startsWith(ea.a.p("UW1w", "QW150twC")) && !file2.delete()) {
                    ea.a.p("V2UnZQdlQmMTY1xlSWY_bCEgVGEvbCZkeSA=", "ChznutL5");
                    file2.getAbsolutePath();
                }
            }
        }
    }

    public final void c() {
        HashMap<String, String> hashMap = this.f29417f;
        for (String str : hashMap.values()) {
            if (!new File(str).delete()) {
                ea.a.p("QXUlOlNkB2wXdFEgD2k6ZWRmU2kqZSc6IA==", "xhEwu5Us");
            }
        }
        hashMap.clear();
    }

    public final void d(boolean z10) {
        try {
            this.f29416e.setDocSaveOptions(true);
            boolean z11 = this.f29415d;
            String str = this.c;
            if (!z11) {
                this.f29416e.saveTo(str, null);
            } else {
                this.f29416e.save(null);
            }
            this.f29416e.onDestroy();
            this.f29416e = null;
            this.f29415d = true;
            this.f29420i = this.f29419h;
            if (z10) {
                this.f29416e = new ReaderPDFCore(this.f29414b, str);
            }
        } catch (Exception e10) {
            ea.a.p("QGE9ZVN3CmUcIFhvCGQzZD0=", "5Vlc1qJy");
            ea.a.p("GyAkYSpoAWQ9", "zY7GIdkz");
            ea.a.p("HyAOcgFvEDog", "Mtia2qyv");
            e10.getMessage();
        }
    }
}
