package com.facebook.appevents;

import am.v2;
import android.content.Context;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Process;
import android.os.StrictMode;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C1761p5;
import com.inmobi.media.C1812t5;
import com.inmobi.media.C1834v1;
import com.inmobi.media.D5;
import com.inmobi.media.Kb;
import com.inmobi.media.W7;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import lib.zj.pdfeditor.PDFPageView;
import lib.zj.pdfeditor.ReaderPDFCore;
import mj.b0;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.ai.db.AIDataBase;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity;
import pdf.pdfreader.viewer.editor.free.repo.data.FileReadProgressChecker;
import pdf.pdfreader.viewer.editor.free.thumb.ThumbLoadCenter;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergeChooserActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderSplitPdfActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.e1;
import pdf.pdfreader.viewer.editor.free.ui.act.g0;
import pdf.pdfreader.viewer.editor.free.ui.act.g1;
import pdf.pdfreader.viewer.editor.free.ui.act.w;
import pdf.pdfreader.viewer.editor.free.ui.dialog.f0;
import pdf.pdfreader.viewer.editor.free.ui.dialog.n3;
import pdf.pdfreader.viewer.editor.free.ui.widget.TextEditorChangeColorBottomSheetView;
import pdf.pdfreader.viewer.editor.free.ui.widget.act.BasePdfEditActivity;
import pdf.pdfreader.viewer.editor.free.utils.a0;
import pdf.pdfreader.viewer.editor.free.utils.d0;
import pdf.pdfreader.viewer.editor.free.utils.n0;
import pdf.pdfreader.viewer.editor.free.utils.q0;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import pdf.pdfreader.viewer.editor.free.utils.u0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9520a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9521b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(int i10, Object obj, Object obj2) {
        this.f9520a = i10;
        this.f9521b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        boolean z10 = false;
        switch (this.f9520a) {
            case 0:
                AccessTokenAppIdPair accessTokenAppId = (AccessTokenAppIdPair) this.f9521b;
                s appEvents = (s) this.c;
                if (!k6.a.b(i.class)) {
                    try {
                        kotlin.jvm.internal.g.e(accessTokenAppId, "$accessTokenAppId");
                        kotlin.jvm.internal.g.e(appEvents, "$appEvents");
                        j.a(accessTokenAppId, appEvents);
                        return;
                    } catch (Throwable th2) {
                        k6.a.a(i.class, th2);
                        return;
                    }
                }
                return;
            case 1:
                ga.n nVar = (ga.n) this.f9521b;
                db.b bVar = (db.b) this.c;
                synchronized (nVar) {
                    if (nVar.f17736b == null) {
                        nVar.f17735a.add(bVar);
                    } else {
                        nVar.f17736b.add(bVar.get());
                    }
                }
                return;
            case 2:
                ha.a aVar = (ha.a) this.f9521b;
                Runnable runnable = (Runnable) this.c;
                Process.setThreadPriority(aVar.c);
                StrictMode.ThreadPolicy threadPolicy = aVar.f18117d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 3:
                D5.a((Map) this.f9521b, (String) this.c);
                return;
            case 4:
                Kb.b((Kb) this.f9521b, (InMobiAdRequestStatus) this.c);
                return;
            case 5:
                Kb.b((Kb) this.f9521b, (Map) this.c);
                return;
            case 6:
                C1761p5.a((C1761p5) this.f9521b, (String) this.c);
                return;
            case 7:
                C1812t5.a((C1812t5) this.f9521b, (W7) this.c);
                return;
            case 8:
                C1834v1.z((C1834v1) this.f9521b, (AdMetaInfo) this.c);
                return;
            case 9:
                ((oi.f) this.f9521b).j((ei.a) this.c);
                return;
            case 10:
                lib.zj.pdfeditor.text.editor.a aVar2 = (lib.zj.pdfeditor.text.editor.a) this.f9521b;
                PDFPageView pDFPageView = aVar2.f21687f;
                RectF rectF = aVar2.M;
                pDFPageView.getClass();
                pDFPageView.j2(new com.google.android.tools.d(rectF, 12));
                aVar2.F = (ReaderPDFCore.FontInfo) this.c;
                aVar2.l();
                aVar2.f21687f.invalidate();
                return;
            case 11:
                mj.p pVar = (mj.p) this.f9521b;
                pVar.f22126d.f21697o = (ArrayList) this.c;
                pVar.f22126d.f21687f.invalidate();
                return;
            case 12:
                String str2 = (String) this.c;
                b0 b0Var = ((mj.t) this.f9521b).f22133b.f21689g;
                if (b0Var != null) {
                    b0Var.r(str2);
                    return;
                }
                return;
            case 13:
                bm.c cVar = (bm.c) this.f9521b;
                PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) this.c;
                bm.c cVar2 = bm.c.f5478e;
                cVar.getClass();
                if (pdfPreviewEntity != null) {
                    pdfPreviewEntity.reset();
                    pdfPreviewEntity.setDeleted(1);
                    pdfPreviewEntity.setDeletedTime(System.currentTimeMillis());
                    cVar.i(pdfPreviewEntity);
                    ea.a.p("XmE5azdlDmUGZXJpBWVsIA==", "1Bu6p0c3");
                    pdfPreviewEntity.getId();
                    String str3 = n0.f28727a;
                    return;
                }
                return;
            case 14:
                cg.l lVar = (cg.l) this.f9521b;
                AIDataBase aIDataBase = km.e.f19907a;
                kotlin.jvm.internal.g.e(lVar, ea.a.p("F28lRxZ0JGkcaUdoDGQ=", "vIWD0BJR"));
                lVar.invoke((List) this.c);
                return;
            case 15:
                PDFPageManagerActivity pDFPageManagerActivity = (PDFPageManagerActivity) this.f9521b;
                List list = (List) this.c;
                PDFPageManagerActivity.a aVar3 = PDFPageManagerActivity.H0;
                kotlin.jvm.internal.g.e(pDFPageManagerActivity, ea.a.p("O2hYc10w", "NEROlBj4"));
                kotlin.jvm.internal.g.e(list, ea.a.p("F3AqZxZMC3N0", "v564kJeu"));
                long currentTimeMillis = System.currentTimeMillis();
                o9.d.s(pDFPageManagerActivity.G, androidx.appcompat.view.menu.d.c(" start extract currentTime(ms) ", currentTimeMillis));
                pDFPageManagerActivity.F0 = currentTimeMillis;
                File H1 = jl.a.H1(a0.a.h("Extracted_PDF", new SimpleDateFormat(ea.a.p("bHkyeQpNL2QWX3xIBG0=", "xQG0pcL5"), a0.d(pDFPageManagerActivity)).format(Long.valueOf(currentTimeMillis))) + ".pdf");
                pDFPageManagerActivity.f25264c0 = H1;
                try {
                    String absolutePath = H1.getAbsolutePath();
                    String[] strArr = new String[1];
                    PdfPreviewEntity pdfPreviewEntity2 = pDFPageManagerActivity.Q;
                    if (pdfPreviewEntity2 != null) {
                        str = pdfPreviewEntity2.getPath();
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    strArr[0] = str;
                    List<Number> list2 = list;
                    ArrayList arrayList = new ArrayList(kotlin.collections.g.h0(list2, 10));
                    for (Number number : list2) {
                        arrayList.add(Integer.valueOf(number.intValue() + 1));
                    }
                    if (ReaderPDFCore.mergePdf(absolutePath, strArr, t0.f0(arrayList), pDFPageManagerActivity) <= 0) {
                        pDFPageManagerActivity.y2(null);
                        return;
                    } else if (pDFPageManagerActivity.E0.contains(Long.valueOf(currentTimeMillis))) {
                        File file = pDFPageManagerActivity.f25264c0;
                        if (file != null) {
                            file.delete();
                        }
                        pDFPageManagerActivity.f25270i0.sendEmptyMessage(pDFPageManagerActivity.Y);
                        return;
                    } else {
                        File file2 = pDFPageManagerActivity.f25264c0;
                        if (file2 != null && file2.exists()) {
                            z10 = true;
                        }
                        if (z10) {
                            sn.d d10 = sn.d.d();
                            Context m10 = ReaderPdfApplication.m();
                            File file3 = pDFPageManagerActivity.f25264c0;
                            String p10 = ea.a.p("KnhFchhjdA==", "Iz4JxJEt");
                            PDFPageManagerActivity.b bVar2 = new PDFPageManagerActivity.b(list, currentTimeMillis);
                            d10.getClass();
                            sn.d.j(m10, file3, p10, bVar2);
                            return;
                        }
                        return;
                    }
                } catch (Throwable th3) {
                    pDFPageManagerActivity.y2(th3);
                    return;
                }
            case 16:
                PDFPageManagerActivity pDFPageManagerActivity2 = (PDFPageManagerActivity) this.f9521b;
                PdfPreviewEntity pdfPreviewEntity3 = (PdfPreviewEntity) this.c;
                PDFPageManagerActivity.a aVar4 = PDFPageManagerActivity.H0;
                kotlin.jvm.internal.g.e(pDFPageManagerActivity2, ea.a.p("O2hYc10w", "zUWVcidw"));
                kotlin.jvm.internal.g.e(pdfPreviewEntity3, ea.a.p("F2l0", "P6ubSA8X"));
                wn.b.f31387b.j(1);
                q0.x(pDFPageManagerActivity2, 5, "home_page_last_index");
                qo.l lVar2 = new qo.l(pDFPageManagerActivity2.f25316w, pdfPreviewEntity3.getFile().getPath());
                long id2 = pdfPreviewEntity3.getId();
                ge.a aVar5 = new ge.a();
                FileRepository.f24155a.getClass();
                FileRepository.k().execute(new pdf.pdfreader.viewer.editor.free.data.b(0, id2, aVar5));
                wk.b.b().e(lVar2);
                return;
            case 17:
                Size size = (Size) this.f9521b;
                CameraActivity cameraActivity = (CameraActivity) this.c;
                int i10 = CameraActivity.H0;
                kotlin.jvm.internal.g.e(cameraActivity, ea.a.p("O2hYc10w", "AXJGMbjA"));
                int width = cameraActivity.q2().f906d.getWidth();
                int height = cameraActivity.q2().f906d.getHeight();
                float f10 = width;
                float height2 = (size.getHeight() * 1.0f) / size.getWidth();
                if (height2 > (f10 * 1.0f) / height) {
                    height = (int) (f10 / height2);
                }
                if (!cameraActivity.f25730v0) {
                    View view = cameraActivity.q2().f911i;
                    kotlin.jvm.internal.g.d(view, ea.a.p("W2kNZDluMy4rYQtlRmEBaV13AGUobH5lHWcZdA==", "6N9cPTq7"));
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        ConstraintLayout.b bVar3 = (ConstraintLayout.b) layoutParams;
                        ((ViewGroup.MarginLayoutParams) bVar3).height = height;
                        view.setLayoutParams(bVar3);
                        cameraActivity.q2().f911i.post(new pdf.pdfreader.viewer.editor.free.feature.scan.ui.i(cameraActivity, 1));
                        return;
                    }
                    throw new NullPointerException(ea.a.p("HnUAbGVjB24mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiAEeRxlZWEIZDpvD2RMLjRvVnMmcihpWHQYYQhvJHRsdxlkC2UxLiVvJnMSclVpOXR0YStvPHQYTBV5HnUlUCNyEW1z", "r9plEfhG"));
                }
                return;
            case 18:
                Context context = (Context) this.f9521b;
                nl.b bVar4 = (nl.b) this.c;
                tf.c cVar3 = FileReadProgressChecker.f26553a;
                kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "5Aik9x6l"));
                kotlin.jvm.internal.g.e(bVar4, ea.a.p("fml0", "EJZqhbPp"));
                yn.b.f32194o.i0(context, bVar4);
                return;
            case 19:
                ThumbLoadCenter thumbLoadCenter = (ThumbLoadCenter) this.f9521b;
                lo.a aVar6 = (lo.a) this.c;
                tf.c<ThreadPoolExecutor> cVar4 = ThumbLoadCenter.f26575e;
                kotlin.jvm.internal.g.e(thumbLoadCenter, ea.a.p("R2gic1cw", "08q9riCS"));
                if (!thumbLoadCenter.b().get()) {
                    lo.b bVar5 = thumbLoadCenter.f26576a;
                    if (bVar5 != null) {
                        bVar5.a(aVar6.f21783a, aVar6.c, aVar6.f21785d, aVar6.f21784b, aVar6.f21787f, aVar6.f21786e);
                    }
                    thumbLoadCenter.a().remove(Integer.valueOf(aVar6.f21783a));
                    if (!thumbLoadCenter.b().get()) {
                        try {
                            Thread.sleep(20L);
                        } catch (Exception unused) {
                        }
                        if (!thumbLoadCenter.b().get()) {
                            ThumbLoadCenter.f26575e.getValue().execute(new b1.e(thumbLoadCenter, 25));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 20:
                ReaderHomeActivity readerHomeActivity = (ReaderHomeActivity) this.f9521b;
                qo.g gVar = (qo.g) this.c;
                Handler handler = readerHomeActivity.O;
                try {
                    ReaderPDFCore readerPDFCore = new ReaderPDFCore(readerHomeActivity, gVar.f29402b.getPath());
                    int countPages = readerPDFCore.countPages();
                    readerPDFCore.onDestroy();
                    if (countPages > 0) {
                        handler.post(new w(readerHomeActivity, 1));
                    } else {
                        handler.post(new pdf.pdfreader.viewer.editor.free.ui.act.s(readerHomeActivity, 2));
                    }
                    return;
                } catch (Exception unused2) {
                    int i11 = d0.f28617a;
                    ea.a.p("I29WRQFjUnAuaSVuTyA=", "1dz1nGIW");
                    handler.post(new pdf.pdfreader.viewer.editor.free.ui.act.m(readerHomeActivity, 1));
                    return;
                }
            case 21:
                cg.l lVar3 = (cg.l) this.f9521b;
                ReaderMergeChooserActivity readerMergeChooserActivity = (ReaderMergeChooserActivity) this.c;
                ReaderMergeChooserActivity.a aVar7 = ReaderMergeChooserActivity.f26759n0;
                kotlin.jvm.internal.g.e(readerMergeChooserActivity, ea.a.p("R2gic1cw", "5hKLZsyi"));
                if (lVar3 != null) {
                    lVar3.invoke(readerMergeChooserActivity.r2());
                    return;
                }
                return;
            case 22:
                e1.c((ReaderSplitPdfActivity) this.f9521b, (List) this.c);
                return;
            case 23:
                RecentAddedActivity recentAddedActivity = (RecentAddedActivity) this.f9521b;
                qo.g gVar2 = (qo.g) this.c;
                RecentAddedActivity.a aVar8 = RecentAddedActivity.f26850l0;
                kotlin.jvm.internal.g.e(recentAddedActivity, ea.a.p("B2hdc1Aw", "pys4txlH"));
                try {
                    ReaderPDFCore readerPDFCore2 = new ReaderPDFCore(recentAddedActivity, gVar2.f29402b.getPath());
                    int countPages2 = readerPDFCore2.countPages();
                    readerPDFCore2.onDestroy();
                    if (countPages2 > 0) {
                        ((Handler) recentAddedActivity.f26861j0.getValue()).post(new b7.g(recentAddedActivity, 29));
                    } else {
                        ((Handler) recentAddedActivity.f26861j0.getValue()).post(new g0(recentAddedActivity, 2));
                    }
                    return;
                } catch (Exception unused3) {
                    int i12 = d0.f28617a;
                    ea.a.p("I29WRQFjUnAuaSVuTyA=", "1dz1nGIW");
                    ((Handler) recentAddedActivity.f26861j0.getValue()).post(new g1(recentAddedActivity, 1));
                    return;
                }
            case 24:
                ((f0) this.f9521b).F.a((List) this.c);
                return;
            case 25:
                n3 n3Var = (n3) this.f9521b;
                View view2 = (View) this.c;
                kotlin.jvm.internal.g.e(n3Var, ea.a.p("R2gic1cw", "aCYSJKjE"));
                int measuredWidth = view2.getMeasuredWidth();
                int measuredHeight = view2.getMeasuredHeight();
                int i13 = n3.f27703k;
                n3Var.a(view2, measuredWidth, measuredHeight);
                return;
            case 26:
                int i14 = TextEditorChangeColorBottomSheetView.C;
                pdf.pdfreader.viewer.editor.free.utils.extension.g.c(((v2) ((TextEditorChangeColorBottomSheetView) this.f9521b).f28172y).f1552b, (View) this.c);
                return;
            case 27:
                BasePdfEditActivity basePdfEditActivity = (BasePdfEditActivity) this.f9521b;
                List<? extends PdfPreviewEntity> list3 = (List) this.c;
                int i15 = BasePdfEditActivity.f28296v;
                kotlin.jvm.internal.g.e(basePdfEditActivity, ea.a.p("O2hYc10w", "dvAeUuZx"));
                kotlin.jvm.internal.g.e(list3, ea.a.p("F2l0", "oQCora3c"));
                basePdfEditActivity.a2(list3);
                return;
            default:
                u0 u0Var = (u0) this.f9521b;
                File file4 = (File) this.c;
                kotlin.jvm.internal.g.e(u0Var, ea.a.p("a2xYcw1lWWVy", "RMtYB8rj"));
                kotlin.jvm.internal.g.e(file4, ea.a.p("a3RUbQlGXmxl", "zuOi8diT"));
                u0Var.a(file4);
                return;
        }
    }
}
