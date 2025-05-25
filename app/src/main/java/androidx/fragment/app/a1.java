package androidx.fragment.app;

import am.z1;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.libconvert.helper.NativeSoLoaderHelper;
import androidx.fragment.app.SpecialEffectsController;
import androidx.recyclerview.widget.RecyclerView;
import ao.j1;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.media.AbstractC1846w0;
import com.inmobi.media.B6;
import com.inmobi.media.C1694k5;
import com.inmobi.media.C1780qb;
import com.inmobi.media.H1;
import com.inmobi.media.Kb;
import com.inmobi.media.M6;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.sdk.SdkInitializationListener;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import lib.zj.pdfeditor.ReaderPDFCore;
import lib.zj.pdfeditor.text.editor.a;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.decrypt.ReaderDecryptAndCopyExecutor;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageLongPicPreviewActivity;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderFeedbackActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderSplitPdfActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.e1;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.PDFChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.widget.AddTextChangeColorBottomSheetView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3739a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3740b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a1(int i10, Object obj, Object obj2) {
        this.f3739a = i10;
        this.f3740b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        Bitmap bitmap2;
        int i10;
        List<Integer> list;
        WeakReference<Bitmap> weakReference;
        Bitmap bitmap3;
        WeakReference<Bitmap> weakReference2;
        Bitmap bitmap4;
        Runnable bVar;
        ArrayList arrayList;
        RecyclerView.m layoutManager;
        switch (this.f3739a) {
            case 0:
                SpecialEffectsController this$0 = (SpecialEffectsController) this.f3740b;
                SpecialEffectsController.a operation = (SpecialEffectsController.a) this.c;
                kotlin.jvm.internal.g.e(this$0, "this$0");
                kotlin.jvm.internal.g.e(operation, "$operation");
                if (this$0.f3718b.contains(operation)) {
                    SpecialEffectsController.Operation.State state = operation.f3721a;
                    View view = operation.c.H;
                    kotlin.jvm.internal.g.d(view, "operation.fragment.mView");
                    state.applyState(view);
                    return;
                }
                return;
            case 1:
                View view2 = (View) this.f3740b;
                u5.e this$02 = (u5.e) this.c;
                HashMap hashMap = u5.e.f30226e;
                if (!k6.a.b(u5.e.class)) {
                    try {
                        kotlin.jvm.internal.g.e(view2, "$view");
                        kotlin.jvm.internal.g.e(this$02, "this$0");
                        if (view2 instanceof EditText) {
                            this$02.b(view2);
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        k6.a.a(u5.e.class, th2);
                        return;
                    }
                }
                return;
            case 2:
                String applicationId = (String) this.f3740b;
                AppEvent event = (AppEvent) this.c;
                com.facebook.appevents.ondeviceprocessing.a aVar = com.facebook.appevents.ondeviceprocessing.a.f9651a;
                if (!k6.a.b(com.facebook.appevents.ondeviceprocessing.a.class)) {
                    try {
                        kotlin.jvm.internal.g.e(applicationId, "$applicationId");
                        kotlin.jvm.internal.g.e(event, "$event");
                        List<AppEvent> H = ge.a.H(event);
                        RemoteServiceWrapper remoteServiceWrapper = RemoteServiceWrapper.f9645a;
                        if (!k6.a.b(RemoteServiceWrapper.class)) {
                            RemoteServiceWrapper.f9645a.b(RemoteServiceWrapper.EventType.CUSTOM_APP_EVENTS, applicationId, H);
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        k6.a.a(com.facebook.appevents.ondeviceprocessing.a.class, th3);
                        return;
                    }
                }
                return;
            case 3:
                B6.a((H1) this.f3740b, (B6) this.c);
                return;
            case 4:
                Kb.a((Kb) this.f3740b, (AdMetaInfo) this.c);
                return;
            case 5:
                M6.a((Map) this.f3740b, (String) this.c);
                return;
            case 6:
                C1694k5.A((C1694k5) this.f3740b, (AdMetaInfo) this.c);
                return;
            case 7:
                AbstractC1846w0.a((AbstractC1846w0) this.f3740b, (C1780qb) this.c);
                return;
            case 8:
                InMobiSdk.c((SdkInitializationListener) this.f3740b, (String) this.c);
                return;
            case 9:
                ((oi.f) this.f3740b).j((ei.a) this.c);
                return;
            case 10:
                a.b bVar2 = (a.b) this.f3740b;
                lib.zj.pdfeditor.text.editor.a.this.f21701s = (ReaderPDFCore.SelectInfo) this.c;
                lib.zj.pdfeditor.text.editor.a.this.k();
                return;
            case 11:
                Runnable runnable = (Runnable) this.f3740b;
                pdf.pdfreader.viewer.editor.free.data.c cVar = (pdf.pdfreader.viewer.editor.free.data.c) this.c;
                FileRepository fileRepository = FileRepository.f24155a;
                kotlin.jvm.internal.g.e(runnable, ea.a.p("a3RQc2s=", "GMhwuxz1"));
                kotlin.jvm.internal.g.e(cVar, ea.a.p("YWwZc0ZlLGVy", "PHEp2Bcp"));
                FileRepository.f24155a.getClass();
                FileRepository.H();
                try {
                    try {
                        SystemClock.elapsedRealtime();
                        runnable.run();
                        SystemClock.elapsedRealtime();
                    } finally {
                        List E0 = kotlin.collections.m.E0(FileRepository.n());
                        FileRepository.f24155a.getClass();
                        FileRepository.k().execute(new g(15, E0, cVar));
                        ((ThreadPoolExecutor) FileRepository.c.getValue()).execute(new qb.v0(kotlin.collections.m.E0(E0), 2));
                        FileRepository.i().set(false);
                    }
                } catch (Exception unused) {
                    int i11 = pdf.pdfreader.viewer.editor.free.utils.d0.f28617a;
                    ea.a.p("I29WRQFjUnAuaSVuTyA=", "1dz1nGIW");
                }
                return;
            case 12:
                ReaderDecryptAndCopyExecutor readerDecryptAndCopyExecutor = (ReaderDecryptAndCopyExecutor) this.f3740b;
                File file = (File) this.c;
                kotlin.jvm.internal.g.e(readerDecryptAndCopyExecutor, ea.a.p("OWgYc3Ew", "UvMqU28k"));
                kotlin.jvm.internal.g.e(file, ea.a.p("F3QubQNGC2xl", "DxyEGazd"));
                readerDecryptAndCopyExecutor.c(file.getAbsolutePath(), true);
                return;
            case 13:
                ij.e eVar = (ij.e) this.f3740b;
                PDFPageManagerActivity pDFPageManagerActivity = (PDFPageManagerActivity) this.c;
                PDFPageManagerActivity.a aVar2 = PDFPageManagerActivity.H0;
                kotlin.jvm.internal.g.e(pDFPageManagerActivity, ea.a.p("O2hYc10w", "vrEQerpx"));
                int i12 = eVar.f18535a;
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if ((i12 == 4 || i12 == 5) && (list = eVar.f18537d) != null) {
                                ea.a.p("LmNFaRZuGXA1cyN0HG8GTFxzdA==", "3NFrtOCY");
                                for (Integer num : list) {
                                    kotlin.jvm.internal.g.d(num, ea.a.p("Jm8GaUBpWG4=", "HoVu478H"));
                                    if (num.intValue() >= 0 && num.intValue() < pDFPageManagerActivity.q2().getItemCount()) {
                                        bn.a h10 = pDFPageManagerActivity.q2().h(num.intValue());
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
                                        pDFPageManagerActivity.q2().notifyItemChanged(num.intValue());
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        int i13 = eVar.f18536b;
                        if (i13 >= 0 && i13 < pDFPageManagerActivity.q2().getItemCount() && (i10 = eVar.c) >= 0 && i10 < pDFPageManagerActivity.q2().getItemCount() && eVar.c != eVar.f18536b) {
                            pDFPageManagerActivity.q2().j(eVar.f18536b, eVar.c);
                            pDFPageManagerActivity.q2().l();
                            pDFPageManagerActivity.x2();
                            return;
                        }
                        return;
                    }
                    List<Integer> list2 = eVar.f18537d;
                    if (list2 != null) {
                        int size = list2.size() - 1;
                        if (size >= 0) {
                            while (true) {
                                int i14 = size - 1;
                                Integer num2 = eVar.f18537d.get(size);
                                kotlin.jvm.internal.g.d(num2, ea.a.p("IGMhaSZuGXAncw90XW85TFFzJlsgXQ==", "WDAUI7Nb"));
                                if (num2.intValue() >= 0) {
                                    Integer num3 = eVar.f18537d.get(size);
                                    kotlin.jvm.internal.g.d(num3, ea.a.p("LmNFaRZuGXA1cyN0HG8GTFxzGlssXQ==", "yUNtWTZI"));
                                    if (num3.intValue() < pDFPageManagerActivity.q2().getItemCount()) {
                                        vm.i q22 = pDFPageManagerActivity.q2();
                                        Integer num4 = eVar.f18537d.get(size);
                                        kotlin.jvm.internal.g.d(num4, ea.a.p("LmNFaRZuGXA1cyN0HG8GTFxzGlssXQ==", "D6tTuvMP"));
                                        int intValue = num4.intValue();
                                        bn.a remove = q22.f30865e.remove(intValue);
                                        kotlin.jvm.internal.g.d(remove, ea.a.p("JnRUbQouRWU3bzxlNHRAcFpzB3Qsbwsp", "rVg8VB4G"));
                                        bn.a aVar3 = remove;
                                        WeakReference<Bitmap> weakReference3 = aVar3.f5488a;
                                        if (weakReference3 != null && (bitmap2 = weakReference3.get()) != null) {
                                            bitmap2.recycle();
                                        }
                                        aVar3.f5488a = null;
                                        WeakReference<Bitmap> weakReference4 = aVar3.f5489b;
                                        if (weakReference4 != null && (bitmap = weakReference4.get()) != null) {
                                            bitmap.recycle();
                                        }
                                        aVar3.f5489b = null;
                                        q22.notifyItemRemoved(intValue);
                                    }
                                }
                                if (i14 >= 0) {
                                    size = i14;
                                }
                            }
                        }
                        pDFPageManagerActivity.q2().l();
                        pDFPageManagerActivity.I2(pDFPageManagerActivity.q2().getItemCount());
                        pDFPageManagerActivity.z2();
                        pDFPageManagerActivity.x2();
                        return;
                    }
                    return;
                }
                int i15 = eVar.f18538e;
                if (i15 >= 0 && i15 <= pDFPageManagerActivity.q2().getItemCount() && eVar.f18539f > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    int i16 = eVar.f18538e;
                    int i17 = eVar.f18539f + i16;
                    while (i16 < i17) {
                        bn.a aVar4 = new bn.a();
                        aVar4.f5491e = i16;
                        arrayList2.add(aVar4);
                        i16++;
                    }
                    pDFPageManagerActivity.q2().i(eVar.f18538e, arrayList2);
                    pDFPageManagerActivity.z2();
                    pDFPageManagerActivity.I2(pDFPageManagerActivity.q2().getItemCount());
                    pDFPageManagerActivity.x2();
                    return;
                }
                return;
            case 14:
                BasePdf2ImageActivity basePdf2ImageActivity = (BasePdf2ImageActivity) this.f3740b;
                String str = (String) this.c;
                String str2 = BasePdf2ImageActivity.f25476k0;
                kotlin.jvm.internal.g.e(basePdf2ImageActivity, ea.a.p("R2gic1cw", "RIEM5PyR"));
                Handler handler = basePdf2ImageActivity.H;
                kotlin.jvm.internal.g.e(str, ea.a.p("HXBSdGg=", "Yr93vEIH"));
                try {
                    try {
                        try {
                            ReaderPDFCore readerPDFCore = new ReaderPDFCore(basePdf2ImageActivity, str);
                            basePdf2ImageActivity.M = readerPDFCore;
                            readerPDFCore.countPages();
                            String str3 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                            bVar = new pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.f(basePdf2ImageActivity, 0);
                        } catch (Exception e10) {
                            e10.getMessage();
                            String str4 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                            bVar = new pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.b(basePdf2ImageActivity, 1);
                        }
                    } catch (OutOfMemoryError e11) {
                        e11.getMessage();
                        String str5 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                        bVar = new pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.g(basePdf2ImageActivity, 0);
                    }
                    handler.post(bVar);
                    return;
                } catch (Throwable th4) {
                    handler.post(new pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.c(basePdf2ImageActivity, 1));
                    throw th4;
                }
            case 15:
                Pdf2ImageLongPicPreviewActivity pdf2ImageLongPicPreviewActivity = (Pdf2ImageLongPicPreviewActivity) this.f3740b;
                ReaderPDFCore readerPDFCore2 = (ReaderPDFCore) this.c;
                int i18 = Pdf2ImageLongPicPreviewActivity.f25506w0;
                kotlin.jvm.internal.g.e(pdf2ImageLongPicPreviewActivity, ea.a.p("O2hYc10w", "Oo43OYk4"));
                kotlin.jvm.internal.g.e(readerPDFCore2, ea.a.p("F2MkcmU=", "0bzH9W9y"));
                if (pdf.pdfreader.viewer.editor.free.utils.extension.a.c(pdf2ImageLongPicPreviewActivity) && (arrayList = (ArrayList) en.a.f16817d.d()) != null) {
                    pdf2ImageLongPicPreviewActivity.a3().f25460e = readerPDFCore2;
                    pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.b a32 = pdf2ImageLongPicPreviewActivity.a3();
                    a32.getClass();
                    ArrayList<bn.a> arrayList3 = a32.f25459d;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList);
                    a32.notifyDataSetChanged();
                    if (pdf2ImageLongPicPreviewActivity.f25511s0 != null && (layoutManager = pdf2ImageLongPicPreviewActivity.Z2().f1088k.getLayoutManager()) != null) {
                        layoutManager.q0(pdf2ImageLongPicPreviewActivity.f25511s0);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                ReaderPreviewActivity readerPreviewActivity = ((j1) this.f3740b).f5081a;
                readerPreviewActivity.f26170d4.c();
                if (((Integer) this.c).intValue() == NativeSoLoaderHelper.f1936e && readerPreviewActivity.O5) {
                    readerPreviewActivity.O5 = false;
                    pdf.pdfreader.viewer.editor.free.utils.t0.V().execute(new pdf.pdfreader.viewer.editor.free.pdfview.f(readerPreviewActivity));
                    return;
                }
                return;
            case 17:
                ReaderFeedbackActivity readerFeedbackActivity = (ReaderFeedbackActivity) this.f3740b;
                View view3 = (View) this.c;
                int i19 = ReaderFeedbackActivity.F;
                kotlin.jvm.internal.g.e(readerFeedbackActivity, ea.a.p("R2gic1cw", "Y28eWT0a"));
                EditText editText = readerFeedbackActivity.f26634y;
                if (editText != null) {
                    editText.setImeOptions(268435456);
                    EditText editText2 = readerFeedbackActivity.f26634y;
                    if (editText2 != null) {
                        editText2.setMinHeight(view3.getMeasuredHeight());
                        return;
                    } else {
                        kotlin.jvm.internal.g.i(ea.a.p("Jm5BdQ1FVA==", "Z6OEYZJg"));
                        throw null;
                    }
                }
                kotlin.jvm.internal.g.i(ea.a.p("Wm4AdTZFVA==", "go3pBzmq"));
                throw null;
            case 18:
                e1.c((ReaderSplitPdfActivity) this.f3740b, (List) this.c);
                return;
            case 19:
                PDFChooseActivity pDFChooseActivity = (PDFChooseActivity) this.f3740b;
                PDFChooseActivity.a aVar5 = PDFChooseActivity.f27008u0;
                kotlin.jvm.internal.g.e(pDFChooseActivity, ea.a.p("O2hYc10w", "ouyXhRjs"));
                pdf.pdfreader.viewer.editor.free.utils.v.O(no.f.b(pDFChooseActivity).f22632f, pDFChooseActivity.t2());
                pDFChooseActivity.runOnUiThread(new f0.s(28, (cg.l) this.c, pDFChooseActivity));
                return;
            default:
                int i20 = AddTextChangeColorBottomSheetView.D;
                pdf.pdfreader.viewer.editor.free.utils.extension.g.c(((z1) ((AddTextChangeColorBottomSheetView) this.f3740b).f28172y).f1696b, (View) this.c);
                return;
        }
    }
}
