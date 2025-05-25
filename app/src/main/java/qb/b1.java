package qb;

import android.content.Context;
import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import com.inmobi.media.C1761p5;
import com.inmobi.media.C1852w6;
import com.inmobi.media.C1878y6;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRSelectPDFPageActivity;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.OCRSelectPDFPageAdapter;
import pdf.pdfreader.viewer.editor.free.observer.StorageFileObserver;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29160a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f29161b;
    public final /* synthetic */ Object c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f29162d;

    public /* synthetic */ b1(C1761p5 c1761p5, boolean z10, String str) {
        this.f29160a = 0;
        this.c = c1761p5;
        this.f29161b = z10;
        this.f29162d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String p10;
        nl.b bVar;
        int i10;
        RecyclerView.m layoutManager;
        int i11 = this.f29160a;
        int i12 = 0;
        boolean z10 = this.f29161b;
        Object obj = this.f29162d;
        Object obj2 = this.c;
        switch (i11) {
            case 0:
                C1761p5.a((C1761p5) obj2, z10, (String) obj);
                return;
            case 1:
                C1852w6.a((C1852w6) obj2, (C1878y6) obj, z10);
                return;
            case 2:
                OCRSelectPDFPageActivity oCRSelectPDFPageActivity = (OCRSelectPDFPageActivity) obj2;
                ReaderPDFCore readerPDFCore = (ReaderPDFCore) obj;
                OCRSelectPDFPageActivity.a aVar = OCRSelectPDFPageActivity.P;
                kotlin.jvm.internal.g.e(oCRSelectPDFPageActivity, ea.a.p("R2gic1cw", "hXZm9Snw"));
                kotlin.jvm.internal.g.e(readerPDFCore, ea.a.p("F2MkcmU=", "xbPV5ZIO"));
                if (pdf.pdfreader.viewer.editor.free.utils.extension.a.c(oCRSelectPDFPageActivity)) {
                    Handler handler = oCRSelectPDFPageActivity.f25313t;
                    handler.removeCallbacks(oCRSelectPDFPageActivity.C);
                    handler.post(new pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.b(oCRSelectPDFPageActivity, 1));
                    ArrayList<bn.a> arrayList = oCRSelectPDFPageActivity.K;
                    if (arrayList.size() <= 40) {
                        oCRSelectPDFPageActivity.h2().f1053e.setVisibility(0);
                    } else {
                        oCRSelectPDFPageActivity.h2().f1053e.setVisibility(8);
                    }
                    Collection collection = (Collection) en.a.f16817d.d();
                    if (collection == null || collection.isEmpty()) {
                        i12 = 1;
                    }
                    if (i12 != 0) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<bn.a> it = arrayList.iterator();
                        while (it.hasNext()) {
                            bn.a next = it.next();
                            if (next.f5492f) {
                                arrayList2.add(next);
                            }
                        }
                        if (true ^ arrayList2.isEmpty()) {
                            oCRSelectPDFPageActivity.j2().e(arrayList2);
                        }
                    }
                    androidx.lifecycle.w<ArrayList<bn.a>> wVar = en.a.f16815a;
                    en.a.f16815a.j(arrayList);
                    oCRSelectPDFPageActivity.i2().f25119g = readerPDFCore;
                    OCRSelectPDFPageAdapter i22 = oCRSelectPDFPageActivity.i2();
                    i22.getClass();
                    ArrayList<bn.a> arrayList3 = i22.f25117e;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList);
                    i22.notifyDataSetChanged();
                    if (oCRSelectPDFPageActivity.M != null && (layoutManager = oCRSelectPDFPageActivity.h2().f1056h.getLayoutManager()) != null) {
                        layoutManager.q0(oCRSelectPDFPageActivity.M);
                    }
                    if (z10 && (i10 = oCRSelectPDFPageActivity.N) > 0 && i10 < arrayList.size()) {
                        oCRSelectPDFPageActivity.h2().f1056h.r0(oCRSelectPDFPageActivity.N);
                    }
                    handler.post(new b1.e(oCRSelectPDFPageActivity, 17));
                    boolean k22 = oCRSelectPDFPageActivity.k2();
                    if (oCRSelectPDFPageActivity.h2().f1053e.getVisibility() == 0) {
                        oCRSelectPDFPageActivity.h2().f1051b.setChecked(k22);
                        return;
                    }
                    return;
                }
                return;
            default:
                Context context = (Context) obj2;
                String str = (String) obj;
                pdf.pdfreader.viewer.editor.free.observer.a aVar2 = StorageFileObserver.f25899a;
                kotlin.jvm.internal.g.e(str, ea.a.p("HHATdGg=", "Q98rTNp2"));
                if (bm.c.b(context).d(str) == null || z10) {
                    File file = new File(str);
                    if (file.isFile()) {
                        if (aj.b.G(str)) {
                            i12 = 1;
                        } else if (aj.b.D(str)) {
                            i12 = 2;
                        } else if (aj.b.F(str)) {
                            i12 = 4;
                        } else if (aj.b.E(str) && !kotlin.text.j.F(str, ea.a.p("UHN2", "D08na12g"), false)) {
                            i12 = 3;
                        }
                        if (i12 != 0) {
                            kotlin.jvm.internal.g.d(context, ea.a.p("UnA7bBpjA3Qbb1pDBm4iZTx0", "ourr5Jxq"));
                            PdfPreviewEntity d10 = bm.c.b(context).d(file.getAbsolutePath());
                            if (d10 != null) {
                                d10.setDate(System.currentTimeMillis());
                                bVar = com.google.android.play.core.assetpacks.c.w(d10);
                            } else {
                                PdfPreviewEntity pdfPreviewEntity = new PdfPreviewEntity();
                                pdfPreviewEntity.setPath(file.getAbsolutePath());
                                pdfPreviewEntity.setName(bg.b.B0(file));
                                pdfPreviewEntity.setDate(System.currentTimeMillis());
                                if (i12 != 1) {
                                    if (i12 != 2) {
                                        if (i12 != 3) {
                                            if (i12 != 4) {
                                                p10 = ea.a.p("H0RG", "iyxpptQK");
                                            } else {
                                                p10 = ea.a.p("H1BU", "mj4LtNBI");
                                            }
                                        } else {
                                            p10 = ea.a.p("dlgIRUw=", "615nhgvg");
                                        }
                                    } else {
                                        p10 = ea.a.p("GE9jRA==", "vlWPpT6G");
                                    }
                                } else {
                                    p10 = ea.a.p("H0RG", "h4vgCDx4");
                                }
                                pdfPreviewEntity.setOtherStrOne(p10);
                                bm.c.b(context).g(pdfPreviewEntity);
                                PdfPreviewEntity d11 = bm.c.b(context).d(file.getAbsolutePath());
                                if (d11 != null) {
                                    bVar = com.google.android.play.core.assetpacks.c.w(d11);
                                } else {
                                    bVar = null;
                                }
                            }
                            pdf.pdfreader.viewer.editor.free.observer.a aVar3 = StorageFileObserver.f25899a;
                            ((Handler) StorageFileObserver.c.getValue()).post(new v4.u(context, i12, file, bVar));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ b1(Object obj, int i10, Object obj2, boolean z10) {
        this.f29160a = i10;
        this.c = obj;
        this.f29162d = obj2;
        this.f29161b = z10;
    }
}
