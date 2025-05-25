package l;

import android.content.Context;
import android.content.Intent;
import android.database.SQLException;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Log;
import android.view.ViewGroup;
import androidx.room.RoomDatabase;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.gps.ara.GpsAraTriggersManager;
import com.facebook.appevents.iap.InAppPurchaseUtils;
import com.facebook.h;
import com.facebook.internal.FetchedAppSettingsManager;
import com.google.android.datatransport.Priority;
import com.inmobi.media.AbstractC1846w0;
import com.inmobi.media.C1565b2;
import com.inmobi.media.C1761p5;
import com.inmobi.media.C1877y5;
import com.inmobi.media.Gb;
import com.inmobi.media.J1;
import com.inmobi.media.Kb;
import com.inmobi.media.N0;
import db.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import l.s;
import lib.zj.pdfeditor.PDFPageView;
import lib.zj.pdfeditor.PDFReaderView;
import lib.zj.pdfeditor.PageView;
import lib.zj.pdfeditor.ReaderPDFCore;
import mj.a0;
import oa.b0;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.ai.db.AIDataBase;
import pdf.pdfreader.viewer.editor.free.feature.ai.db.AIFileEntity;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.data.ImageFileInfo;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity;
import pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity;
import pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergeChooserActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.f0;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.SignCreateView;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.db.SignPathActionInfo;
import pdf.pdfreader.viewer.editor.free.utils.w0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f20369a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f20370b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r(int i10, Object obj, Object obj2) {
        this.f20369a = i10;
        this.f20370b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.InterfaceC0196a<T> interfaceC0196a;
        Bitmap bitmap;
        Bitmap bitmap2;
        int i10;
        List<Integer> list;
        WeakReference<Bitmap> weakReference;
        Bitmap bitmap3;
        WeakReference<Bitmap> weakReference2;
        Bitmap bitmap4;
        int i11 = 0;
        switch (this.f20369a) {
            case 0:
                s.a aVar = (s.a) this.f20370b;
                Runnable runnable = (Runnable) this.c;
                aVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    aVar.a();
                }
            case 1:
                h.a callback = (h.a) this.f20370b;
                com.facebook.l this$0 = (com.facebook.l) this.c;
                int i12 = com.facebook.l.f9835h;
                kotlin.jvm.internal.g.e(callback, "$callback");
                kotlin.jvm.internal.g.e(this$0, "this$0");
                ((h.b) callback).a();
                return;
            case 2:
                String applicationId = (String) this.f20370b;
                AppEvent event = (AppEvent) this.c;
                GpsAraTriggersManager gpsAraTriggersManager = GpsAraTriggersManager.f9522a;
                if (!k6.a.b(GpsAraTriggersManager.class)) {
                    try {
                        kotlin.jvm.internal.g.e(applicationId, "$applicationId");
                        kotlin.jvm.internal.g.e(event, "$event");
                        GpsAraTriggersManager.f9522a.b(applicationId, event);
                        return;
                    } catch (Throwable th2) {
                        k6.a.a(GpsAraTriggersManager.class, th2);
                        return;
                    }
                }
                return;
            case 3:
                InAppPurchaseUtils.BillingClientVersion billingClientVersion = (InAppPurchaseUtils.BillingClientVersion) this.f20370b;
                Context context = (Context) this.c;
                com.facebook.appevents.iap.b bVar = com.facebook.appevents.iap.b.f9542a;
                if (!k6.a.b(com.facebook.appevents.iap.b.class)) {
                    try {
                        kotlin.jvm.internal.g.e(billingClientVersion, "$billingClientVersion");
                        kotlin.jvm.internal.g.e(context, "$context");
                        com.facebook.appevents.iap.b bVar2 = com.facebook.appevents.iap.b.f9542a;
                        String packageName = context.getPackageName();
                        kotlin.jvm.internal.g.d(packageName, "context.packageName");
                        bVar2.a(billingClientVersion, packageName);
                        return;
                    } catch (Throwable th3) {
                        k6.a.a(com.facebook.appevents.iap.b.class, th3);
                        return;
                    }
                }
                return;
            case 4:
                FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f9737a;
                ((FetchedAppSettingsManager.a) this.f20370b).onSuccess();
                return;
            case 5:
                ga.p pVar = (ga.p) this.f20370b;
                db.b<T> bVar3 = (db.b) this.c;
                if (pVar.f17739b == ga.p.f17737d) {
                    synchronized (pVar) {
                        interfaceC0196a = pVar.f17738a;
                        pVar.f17738a = null;
                        pVar.f17739b = bVar3;
                    }
                    interfaceC0196a.g(bVar3);
                    return;
                }
                throw new IllegalStateException("provide() can be called only once.");
            case 6:
                sa.c cVar = (sa.c) this.f20370b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                cVar.getClass();
                try {
                    s6.e<b0> eVar = cVar.f29768h;
                    Priority priority = Priority.HIGHEST;
                    if (eVar instanceof v6.u) {
                        v6.w.a().f30735d.a(((v6.u) eVar).f30728a.e(priority), 1);
                    } else if (Log.isLoggable(z6.a.b("ForcedSender"), 5)) {
                        String.format("Expected instance of `TransportImpl`, got `%s`.", eVar);
                    }
                } catch (SQLException unused) {
                }
                countDownLatch.countDown();
                return;
            case 7:
                ((jb.k) this.f20370b).getClass();
                jb.k.a((Intent) this.c);
                return;
            case 8:
                Gb.a((Gb) this.f20370b, this.c);
                return;
            case 9:
                Kb.a((Kb) this.f20370b, (Map) this.c);
                return;
            case 10:
                Kb.a((Kb) this.f20370b, (String) this.c);
                return;
            case 11:
                N0.a((Context) this.f20370b, (N0) this.c);
                return;
            case 12:
                C1565b2.a((C1565b2) this.f20370b, (ViewGroup) this.c);
                return;
            case 13:
                C1761p5.c((C1761p5) this.f20370b, (String) this.c);
                return;
            case 14:
                AbstractC1846w0.a((Context) this.f20370b, (AbstractC1846w0) this.c);
                return;
            case 15:
                C1877y5.a((C1877y5) this.f20370b, (J1) this.c);
                return;
            case 16:
                PDFReaderView pDFReaderView = (PDFReaderView) this.f20370b;
                PageView pageView = (PageView) this.c;
                if (pageView != null) {
                    if (!pDFReaderView.F0(pDFReaderView.Y1)) {
                        pDFReaderView.setSelectTextLocation(pDFReaderView.z0(pageView));
                        return;
                    } else {
                        pDFReaderView.setSelectTextLocation(pDFReaderView.b1());
                        return;
                    }
                }
                int i13 = PDFReaderView.f21220m2;
                pDFReaderView.getClass();
                return;
            case 17:
                lib.zj.pdfeditor.text.editor.a aVar2 = (lib.zj.pdfeditor.text.editor.a) this.f20370b;
                mj.a aVar3 = (mj.a) this.c;
                aVar2.f21698p = aVar3;
                aVar2.f21707y.setEmpty();
                float editorSourceScale = 3.0f / aVar2.f21687f.getEditorSourceScale();
                RectF rectF = aVar2.f21708z;
                RectF rectF2 = aVar3.f22045b;
                float f10 = rectF2.left - (aVar2.f21702t * editorSourceScale);
                float centerY = rectF2.centerY();
                float f11 = aVar2.f21702t * editorSourceScale;
                RectF rectF3 = aVar3.f22045b;
                rectF.set(f10, centerY - f11, f11 + rectF3.left, (aVar2.f21702t * editorSourceScale) + rectF3.centerY());
                RectF rectF4 = aVar2.A;
                RectF rectF5 = aVar3.f22045b;
                float f12 = rectF5.right - (aVar2.f21702t * editorSourceScale);
                float centerY2 = rectF5.centerY();
                float f13 = aVar2.f21702t * editorSourceScale;
                RectF rectF6 = aVar3.f22045b;
                rectF4.set(f12, centerY2 - f13, f13 + rectF6.right, (aVar2.f21702t * editorSourceScale) + rectF6.centerY());
                aVar2.u(new a0(aVar2, aVar2.f21685e, aVar3, true));
                PDFPageView pDFPageView = aVar2.f21687f;
                pDFPageView.invalidate();
                pDFPageView.q1();
                return;
            case 18:
                lib.zj.pdfeditor.text.editor.a aVar4 = (lib.zj.pdfeditor.text.editor.a) this.f20370b;
                aVar4.f21701s = (ReaderPDFCore.SelectInfo) this.c;
                aVar4.k();
                return;
            case 19:
                String str = (String) this.c;
                mj.b0 b0Var = ((mj.s) this.f20370b).f22132b.f21689g;
                if (b0Var != null) {
                    b0Var.x(str);
                    return;
                }
                return;
            case 20:
                mj.y yVar = (mj.y) this.f20370b;
                yVar.c.f21697o = (ArrayList) this.c;
                yVar.c.f21687f.invalidate();
                return;
            case 21:
                List<AIFileEntity> list2 = (List) this.f20370b;
                cg.a aVar5 = (cg.a) this.c;
                AIDataBase aIDataBase = km.e.f19907a;
                kotlin.jvm.internal.g.e(list2, ea.a.p("VWwAc3Q=", "ptqi6l7X"));
                ArrayList arrayList = new ArrayList();
                for (AIFileEntity aIFileEntity : list2) {
                    arrayList.add(Long.valueOf(aIFileEntity.getId()));
                }
                AIDataBase aIDataBase2 = km.e.f19907a;
                RoomDatabase roomDatabase = ((km.c) aIDataBase2.k()).f19897a;
                roomDatabase.b();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(ea.a.p("EkV7RTxFTEYaTysgVWkIZlFsN3NpV35FJkVRaTUgK252KA==", "mhV7hlWW"));
                b.b.i(sb2, arrayList.size());
                sb2.append(ea.a.p("KQ==", "SWbnsS1E"));
                b2.e d10 = roomDatabase.d(sb2.toString());
                Iterator it = arrayList.iterator();
                int i14 = 1;
                while (it.hasNext()) {
                    Long l10 = (Long) it.next();
                    if (l10 == null) {
                        d10.d(i14);
                    } else {
                        d10.c(i14, l10.longValue());
                    }
                    i14++;
                }
                roomDatabase.c();
                try {
                    d10.h();
                    roomDatabase.j();
                    roomDatabase.g();
                    roomDatabase = ((km.c) aIDataBase2.k()).f19897a;
                    roomDatabase.b();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(ea.a.p("d0UHRSdFQkYgT3kgCGkJYyxhRl8vbiVvE1d5RRZFbGZabC5JFyALblIo", "31DLr10D"));
                    b.b.i(sb3, arrayList.size());
                    sb3.append(ea.a.p("KQ==", "LY4PckxB"));
                    b2.e d11 = roomDatabase.d(sb3.toString());
                    Iterator it2 = arrayList.iterator();
                    int i15 = 1;
                    while (it2.hasNext()) {
                        Long l11 = (Long) it2.next();
                        if (l11 == null) {
                            d11.d(i15);
                        } else {
                            d11.c(i15, l11.longValue());
                        }
                        i15++;
                    }
                    roomDatabase.c();
                    try {
                        d11.h();
                        roomDatabase.j();
                        roomDatabase.g();
                        roomDatabase = ((km.c) aIDataBase2.k()).f19897a;
                        roomDatabase.b();
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(ea.a.p("L0UvRRpFaEYaTysgVWkIYVZzJWU7X1VvGnQUbiUgFUguUiYgKGkkZQFkRmlaICg=", "eskcNHjz"));
                        b.b.i(sb4, arrayList.size());
                        sb4.append(ea.a.p("KQ==", "Qelwsfbh"));
                        b2.e d12 = roomDatabase.d(sb4.toString());
                        Iterator it3 = arrayList.iterator();
                        int i16 = 1;
                        while (it3.hasNext()) {
                            Long l12 = (Long) it3.next();
                            if (l12 == null) {
                                d12.d(i16);
                            } else {
                                d12.c(i16, l12.longValue());
                            }
                            i16++;
                        }
                        roomDatabase.c();
                        try {
                            d12.h();
                            roomDatabase.j();
                            roomDatabase.g();
                            w0.a().f28791b.execute(new qb.f(aVar5, 1));
                            return;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            case 22:
                ArrayList<bn.a> arrayList2 = (ArrayList) this.f20370b;
                PDFPageManagerActivity pDFPageManagerActivity = (PDFPageManagerActivity) this.c;
                PDFPageManagerActivity.a aVar6 = PDFPageManagerActivity.H0;
                kotlin.jvm.internal.g.e(arrayList2, ea.a.p("F3MubBZjFkQTdGE=", "PUV2oae5"));
                kotlin.jvm.internal.g.e(pDFPageManagerActivity, ea.a.p("AWgOcx0w", "1Qug9ITx"));
                for (bn.a aVar7 : arrayList2) {
                    WeakReference<Bitmap> weakReference3 = aVar7.f5488a;
                    if (weakReference3 != null && (bitmap2 = weakReference3.get()) != null) {
                        bitmap2.recycle();
                    }
                    aVar7.f5488a = null;
                    WeakReference<Bitmap> weakReference4 = aVar7.f5489b;
                    if (weakReference4 != null && (bitmap = weakReference4.get()) != null) {
                        bitmap.recycle();
                    }
                    aVar7.f5489b = null;
                    pDFPageManagerActivity.q2().notifyItemChanged(aVar7.f5491e);
                }
                return;
            case 23:
                ij.e eVar2 = (ij.e) this.f20370b;
                PDFPageManagerActivity pDFPageManagerActivity2 = (PDFPageManagerActivity) this.c;
                PDFPageManagerActivity.a aVar8 = PDFPageManagerActivity.H0;
                kotlin.jvm.internal.g.e(pDFPageManagerActivity2, ea.a.p("R2gic1cw", "fcw8aIsc"));
                int i17 = eVar2.f18535a;
                if (i17 != 1) {
                    if (i17 != 2) {
                        if (i17 != 3) {
                            if ((i17 == 4 || i17 == 5) && (list = eVar2.f18537d) != null) {
                                ea.a.p("UmM_aRxuTHAdc110AG84TC1zdA==", "tas1NZxb");
                                for (Integer num : list) {
                                    kotlin.jvm.internal.g.d(num, ea.a.p("JW8caRppLW4=", "HBUonBv1"));
                                    if (num.intValue() >= 0 && num.intValue() < pDFPageManagerActivity2.q2().getItemCount()) {
                                        bn.a h10 = pDFPageManagerActivity2.q2().h(num.intValue());
                                        if (h10 != null && (weakReference2 = h10.f5488a) != null && (bitmap4 = weakReference2.get()) != null) {
                                            bitmap4.recycle();
                                        }
                                        if (h10 != null) {
                                            h10.f5488a = null;
                                        }
                                        if (h10 != null && (weakReference = h10.f5489b) != null && (bitmap3 = weakReference.get()) != null) {
                                            bitmap3.recycle();
                                        }
                                        if (h10 != null) {
                                            h10.f5489b = null;
                                        }
                                        pDFPageManagerActivity2.q2().notifyItemChanged(num.intValue());
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        int i18 = eVar2.f18536b;
                        if (i18 >= 0 && i18 < pDFPageManagerActivity2.q2().getItemCount() && (i10 = eVar2.c) >= 0 && i10 < pDFPageManagerActivity2.q2().getItemCount() && eVar2.c != eVar2.f18536b) {
                            pDFPageManagerActivity2.q2().j(eVar2.c, eVar2.f18536b);
                            pDFPageManagerActivity2.q2().l();
                            pDFPageManagerActivity2.x2();
                            return;
                        }
                        return;
                    }
                    List<Integer> list3 = eVar2.f18537d;
                    if (list3 != null) {
                        ea.a.p("FmM8aSBuZXAncw90XW85TFFzdA==", "fuwHOKWo");
                        for (Integer num2 : list3) {
                            kotlin.jvm.internal.g.d(num2, ea.a.p("Q284aQdpDW4=", "mQSxwxVT"));
                            if (num2.intValue() >= 0 && num2.intValue() <= pDFPageManagerActivity2.q2().getItemCount()) {
                                bn.a aVar9 = new bn.a();
                                aVar9.f5491e = num2.intValue();
                                vm.i q22 = pDFPageManagerActivity2.q2();
                                int intValue = num2.intValue();
                                q22.getClass();
                                q22.f30865e.add(intValue, aVar9);
                                q22.notifyItemInserted(intValue);
                            }
                        }
                        pDFPageManagerActivity2.q2().l();
                        pDFPageManagerActivity2.I2(pDFPageManagerActivity2.q2().getItemCount());
                        pDFPageManagerActivity2.z2();
                        pDFPageManagerActivity2.x2();
                        return;
                    }
                    return;
                }
                int i19 = eVar2.f18538e;
                if (i19 >= 0 && i19 <= pDFPageManagerActivity2.q2().getItemCount() && eVar2.f18539f > 0) {
                    vm.i q23 = pDFPageManagerActivity2.q2();
                    int i20 = eVar2.f18538e;
                    int i21 = eVar2.f18539f;
                    q23.getClass();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator<bn.a> it4 = q23.f30865e.iterator();
                    kotlin.jvm.internal.g.d(it4, ea.a.p("WnQubQAuC3QXclV0BnJ-KQ==", "jvWGi9aH"));
                    int i22 = 0;
                    while (it4.hasNext()) {
                        bn.a next = it4.next();
                        kotlin.jvm.internal.g.d(next, ea.a.p("WnQuchJ0DXJcblF4HSgp", "P2brs03V"));
                        bn.a aVar10 = next;
                        if (i11 >= i20 && i22 < i21 && i11 < i20 + i21) {
                            it4.remove();
                            i22++;
                            arrayList3.add(aVar10);
                            q23.notifyItemRemoved(i11);
                        } else {
                            aVar10.f5491e = i11;
                            i11++;
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        pDFPageManagerActivity2.x2();
                    } else {
                        Iterator it5 = arrayList3.iterator();
                        while (it5.hasNext()) {
                            pDFPageManagerActivity2.s2().g((bn.a) it5.next());
                        }
                    }
                    pDFPageManagerActivity2.I2(pDFPageManagerActivity2.q2().getItemCount());
                    return;
                }
                return;
            case 24:
                BasePdf2ImageActivity basePdf2ImageActivity = (BasePdf2ImageActivity) this.f20370b;
                ArrayList<ImageFileInfo> arrayList4 = (ArrayList) this.c;
                kotlin.jvm.internal.g.e(basePdf2ImageActivity, ea.a.p("R2gic1cw", "wIGaEK22"));
                if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(basePdf2ImageActivity)) {
                    basePdf2ImageActivity.N2(arrayList4);
                    BasePdf2ImageActivity.n2(basePdf2ImageActivity);
                    basePdf2ImageActivity.B2();
                    return;
                }
                return;
            case 25:
                OfficeReaderActivity officeReaderActivity = (OfficeReaderActivity) this.f20370b;
                String str2 = OfficeReaderActivity.D2;
                kotlin.jvm.internal.g.e(officeReaderActivity, ea.a.p("R2gic1cw", "WO02EcgI"));
                PdfPreviewEntity d13 = bm.c.b(officeReaderActivity).d((String) this.c);
                if (d13 != null) {
                    d13.setRecent(1);
                    d13.setRecentDate(System.currentTimeMillis());
                    bm.c.b(officeReaderActivity).i(d13);
                    return;
                }
                return;
            case 26:
                Word2PDFConvertActivity word2PDFConvertActivity = (Word2PDFConvertActivity) this.f20370b;
                Word2PDFConvertActivity.a aVar11 = Word2PDFConvertActivity.f26020p1;
                kotlin.jvm.internal.g.e(word2PDFConvertActivity, ea.a.p("MWgfc1Yw", "fwEvrqrW"));
                PdfPreviewEntity d14 = bm.c.b(word2PDFConvertActivity).d((String) this.c);
                if (d14 != null) {
                    d14.setRecent(1);
                    d14.setRecentDate(System.currentTimeMillis());
                    bm.c.b(word2PDFConvertActivity).i(d14);
                    return;
                }
                return;
            case 27:
                ReaderMergeChooserActivity readerMergeChooserActivity = (ReaderMergeChooserActivity) this.f20370b;
                ReaderMergeChooserActivity.a aVar12 = ReaderMergeChooserActivity.f26759n0;
                kotlin.jvm.internal.g.e(readerMergeChooserActivity, ea.a.p("R2gic1cw", "tWltSS2e"));
                pdf.pdfreader.viewer.editor.free.utils.v.O(no.f.b(readerMergeChooserActivity).f22632f, readerMergeChooserActivity.r2());
                readerMergeChooserActivity.runOnUiThread(new com.facebook.appevents.g(21, (cg.l) this.c, readerMergeChooserActivity));
                return;
            case 28:
                int i23 = f0.L;
                ((f0) this.f20370b).A((List) this.c);
                return;
            default:
                SignPathActionInfo signPathActionInfo = (SignPathActionInfo) this.c;
                pdf.pdfreader.viewer.editor.free.ui.widget.adapter.f fVar = ((SignCreateView) this.f20370b).f28439b;
                if (signPathActionInfo != null) {
                    fVar.f28371f.remove(signPathActionInfo);
                    fVar.notifyDataSetChanged();
                    return;
                }
                fVar.getClass();
                return;
        }
    }
}
