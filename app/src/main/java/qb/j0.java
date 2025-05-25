package qb;

import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatEditText;
import com.inmobi.media.Y7;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import kotlinx.coroutines.flow.StateFlowImpl;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.billing.SubscriptionType;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIAnswerView;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseAISubscriptionActivity;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionDarkTestFActivity;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionDarkTestJActivity;
import pdf.pdfreader.viewer.editor.free.feature.ocr.dialog.OCRLoadingDialog;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRPreviewFragment;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRResultFragment;
import pdf.pdfreader.viewer.editor.free.feature.ocr.vm.OCRPreviewViewModel;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustFiltersAdapter;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.state.TurnPageMode;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderFeedbackActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderSplitPdfActivity;
import pdf.pdfreader.viewer.editor.free.ui.adapter.w;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFConvertActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderSelectImagePreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenDefaultDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PreviewAddTextDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.j3;
import pdf.pdfreader.viewer.editor.free.ui.frag.SplitPreviewFragment;
import pdf.pdfreader.viewer.editor.free.utils.event.OCREventCenter;
import pdf.pdfreader.viewer.editor.free.utils.event.ScanEventCenter;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class j0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29231a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f29232b;

    public /* synthetic */ j0(Object obj, int i10) {
        this.f29231a = i10;
        this.f29232b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String p10;
        boolean z10;
        String str;
        String str2;
        String obj;
        int i10 = this.f29231a;
        String str3 = null;
        int i11 = 0;
        Object obj2 = this.f29232b;
        switch (i10) {
            case 0:
                Y7.a((Y7) obj2, view);
                return;
            case 1:
                AIChatActivity aIChatActivity = (AIChatActivity) obj2;
                AIChatActivity.a aVar = AIChatActivity.f24356v0;
                kotlin.jvm.internal.g.e(aIChatActivity, ea.a.p("O2hYc10w", "tMEUofiL"));
                aIChatActivity.finish();
                return;
            case 2:
                AIAnswerView aIAnswerView = (AIAnswerView) obj2;
                int i12 = AIAnswerView.f24728g;
                kotlin.jvm.internal.g.e(aIAnswerView, ea.a.p("LWgFc14w", "oYYlzRqY"));
                AIAnswerView.a aVar2 = aIAnswerView.f24729b;
                if (aVar2 != null) {
                    aVar2.e(true);
                    return;
                }
                return;
            case 3:
                pdf.pdfreader.viewer.editor.free.feature.billing.dialog.b bVar = (pdf.pdfreader.viewer.editor.free.feature.billing.dialog.b) obj2;
                int i13 = pdf.pdfreader.viewer.editor.free.feature.billing.dialog.b.B;
                kotlin.jvm.internal.g.e(bVar, ea.a.p("Pmg_c0ow", "9xJVnrx2"));
                oo.a aVar3 = bVar.f23542t;
                if (aVar3 != null) {
                    aVar3.a();
                }
                bVar.dismiss();
                return;
            case 4:
                BaseAISubscriptionActivity baseAISubscriptionActivity = (BaseAISubscriptionActivity) obj2;
                String str4 = BaseAISubscriptionActivity.U;
                kotlin.jvm.internal.g.e(baseAISubscriptionActivity, ea.a.p("R2gic1cw", "SdwSr6Mm"));
                baseAISubscriptionActivity.n2();
                return;
            case 5:
                SubscriptionDarkTestFActivity subscriptionDarkTestFActivity = (SubscriptionDarkTestFActivity) obj2;
                int i14 = SubscriptionDarkTestFActivity.f24900a0;
                kotlin.jvm.internal.g.e(subscriptionDarkTestFActivity, ea.a.p("R2gic1cw", "5Dv9FeiP"));
                subscriptionDarkTestFActivity.r2();
                return;
            case 6:
                SubscriptionDarkTestJActivity subscriptionDarkTestJActivity = (SubscriptionDarkTestJActivity) obj2;
                SubscriptionDarkTestJActivity.a aVar4 = SubscriptionDarkTestJActivity.f24905b0;
                kotlin.jvm.internal.g.e(subscriptionDarkTestJActivity, ea.a.p("O2hYc10w", "3pgvJrbt"));
                BaseSubscriptionActivity.x2(subscriptionDarkTestJActivity, SubscriptionType.YEAR_TRIAL_3D);
                return;
            case 7:
                OCRLoadingDialog oCRLoadingDialog = (OCRLoadingDialog) obj2;
                int i15 = OCRLoadingDialog.f25056f;
                kotlin.jvm.internal.g.e(oCRLoadingDialog, ea.a.p("R2gic1cw", "1vd0WZva"));
                Context a10 = OCREventCenter.a();
                OCREventCenter.b(a10, a0.a.i("LnBBbBBjVnQzbyRDGm4cZU10", "ghoQNkUi", a10, "VmNy", "mB9OhoFT"), ea.a.p("WGMYXwFvEWQhbgFfV2w4c2U=", "zF7jmpeu"));
                oCRLoadingDialog.cancel();
                return;
            case 8:
                OCRPreviewFragment oCRPreviewFragment = (OCRPreviewFragment) obj2;
                OCRPreviewFragment.a aVar5 = OCRPreviewFragment.f25168p0;
                kotlin.jvm.internal.g.e(oCRPreviewFragment, ea.a.p("R2gic1cw", "yD7SqruV"));
                ((OCRPreviewViewModel) oCRPreviewFragment.f25170d0.getValue()).d();
                return;
            case 9:
                OCRResultFragment oCRResultFragment = (OCRResultFragment) obj2;
                OCRResultFragment.a aVar6 = OCRResultFragment.f25189r0;
                kotlin.jvm.internal.g.e(oCRResultFragment, ea.a.p("BWgHc0ww", "fvqnhQOo"));
                VB vb2 = oCRResultFragment.Y;
                kotlin.jvm.internal.g.b(vb2);
                int currentItem = ((am.w0) vb2).f1587n.getCurrentItem();
                if (currentItem != 0 && oCRResultFragment.B0()) {
                    VB vb3 = oCRResultFragment.Y;
                    kotlin.jvm.internal.g.b(vb3);
                    ((am.w0) vb3).f1587n.setCurrentItem(currentItem - 1);
                    return;
                }
                return;
            case 10:
                PDFPageManagerActivity pDFPageManagerActivity = (PDFPageManagerActivity) obj2;
                PDFPageManagerActivity.a aVar7 = PDFPageManagerActivity.H0;
                kotlin.jvm.internal.g.e(pDFPageManagerActivity, ea.a.p("O2hYc10w", "VlQxdfEI"));
                if (!pDFPageManagerActivity.i2()) {
                    tn.a.b(pDFPageManagerActivity, ea.a.p("Im5WcBhnZQ==", "UQUv1Cpf"), ea.a.p("Xm4scBJnB18AZVBvNmM6aSdr", "BaFzDQYi"));
                    pDFPageManagerActivity.f25269h0.execute(new pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.s(pDFPageManagerActivity, 0));
                    return;
                }
                return;
            case 11:
                pdf.pdfreader.viewer.editor.free.feature.scan.dialog.c cVar = (pdf.pdfreader.viewer.editor.free.feature.scan.dialog.c) obj2;
                int i16 = pdf.pdfreader.viewer.editor.free.feature.scan.dialog.c.C;
                kotlin.jvm.internal.g.e(cVar, ea.a.p("R2gic1cw", "4nQhsaxV"));
                cVar.cancel();
                return;
            case 12:
                CameraActivity cameraActivity = (CameraActivity) obj2;
                int i17 = CameraActivity.H0;
                kotlin.jvm.internal.g.e(cameraActivity, ea.a.p("O2hYc10w", "igRhQU2e"));
                StateFlowImpl stateFlowImpl = cameraActivity.s2().f23509d;
                boolean z11 = !((mn.a) stateFlowImpl.b()).f22148e;
                stateFlowImpl.setValue(mn.a.a((mn.a) stateFlowImpl.b(), false, false, false, false, z11, 15));
                jn.a.c.getClass();
                jn.a.f19329j.c(jn.a.f19323d[5], Boolean.valueOf(z11));
                return;
            case 13:
                ImageAdjustActivity imageAdjustActivity = (ImageAdjustActivity) obj2;
                ImageAdjustActivity.a aVar8 = ImageAdjustActivity.f25741u0;
                kotlin.jvm.internal.g.e(imageAdjustActivity, ea.a.p("EWgBc28w", "KEehK9Wc"));
                tf.c cVar2 = ScanEventCenter.f28674a;
                String d22 = imageAdjustActivity.d2();
                HashSet<String> hashSet = ScanEventCenter.f28675b;
                if (!hashSet.contains(ea.a.p("H2EgZQ5kXnU7dDlyUXQ2a11fMWwgY2s=", "IQoGo4W7"))) {
                    hashSet.add(ea.a.p("Q2EsZRJkCHUBdGtyDHQ3ayFfUWwvY2s=", "ZfLu5DhS"));
                    tn.a.d(ScanEventCenter.a(), ea.a.p("Q2EsZSxhBmoHc3Q=", "r9l5ikwc"), ea.a.p("Q2EsZRJkCHUBdGtyDHQ3ayFfUWwvY2s=", "bqYDRK2a"), d22, false);
                }
                ImageAdjustFiltersAdapter imageAdjustFiltersAdapter = imageAdjustActivity.f25743b0;
                if (imageAdjustFiltersAdapter != null) {
                    imageAdjustFiltersAdapter.i();
                }
                int currentItem2 = imageAdjustActivity.y2().f695z.getCurrentItem();
                String p11 = ea.a.p("QWU_YRhl", "R6Rm7d53");
                String workflow = imageAdjustActivity.f27001t;
                TurnPageMode e22 = imageAdjustActivity.e2();
                kotlin.jvm.internal.g.e(workflow, "workflow");
                Intent intent = new Intent(imageAdjustActivity, CameraActivity.class);
                intent.putExtra(ea.a.p("MHMcZShhHWx0", "C3YXNh47"), 0);
                intent.putExtra(ea.a.p("AW8HaT1pG24=", "wtqtItXy"), currentItem2);
                intent.putExtra(ea.a.p("X3IZbTVzPnU6Y2U=", "XT9vjQeZ"), p11);
                intent.putExtra(ea.a.p("KXJebSZ3WHIxZiZvdw==", "FkZAdTVy"), workflow);
                if (e22 != null) {
                    intent.putExtra(ea.a.p("O3VDbi15R2U=", "wDCxJYAp"), e22.ordinal());
                }
                intent.putExtra(ea.a.p("WGUyXxpzPWMTbVFyCF8waTZzRl8jbjdyCm4lZQ==", "kF5EMizP"), false);
                imageAdjustActivity.startActivity(intent);
                return;
            case 14:
                ExecutorService executorService = ReaderPreviewActivity.U5;
                ((ReaderPreviewActivity) obj2).Z2();
                return;
            case 15:
                ReaderFeedbackActivity readerFeedbackActivity = (ReaderFeedbackActivity) obj2;
                int i18 = ReaderFeedbackActivity.F;
                kotlin.jvm.internal.g.e(readerFeedbackActivity, ea.a.p("R2gic1cw", "z70ceLkz"));
                EditText editText = readerFeedbackActivity.f26634y;
                if (editText != null) {
                    Object systemService = readerFeedbackActivity.getSystemService(ea.a.p("Jm5BdQ1fWmUuaCVk", "1j1VE6JK"));
                    kotlin.jvm.internal.g.c(systemService, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuDG4YbkRsCCBHeTtlU2EMZABvXWRHdj9lMy5bbjZ1N20GdF1vVS4tbkN1P00WdApvFk1VbghnM3I=", "c51dQiJN"));
                    ((InputMethodManager) systemService).hideSoftInputFromWindow(editText.getWindowToken(), 0);
                    readerFeedbackActivity.finish();
                    return;
                }
                kotlin.jvm.internal.g.i(ea.a.p("Wm47dQdFVA==", "rL0d2PXr"));
                throw null;
            case 16:
                ReaderSplitPdfActivity readerSplitPdfActivity = (ReaderSplitPdfActivity) obj2;
                ReaderSplitPdfActivity.a aVar9 = ReaderSplitPdfActivity.f26822q0;
                kotlin.jvm.internal.g.e(readerSplitPdfActivity, ea.a.p("R2gic1cw", "L0xtWCB9"));
                if (readerSplitPdfActivity.f26831d0.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    tn.a.d(readerSplitPdfActivity, ea.a.p("PHBdaXQ=", "3DQFsbnN"), ea.a.p("W2gabyJlGG0vXwdsWF80bFFjaw==", "uR8uQqjR"), readerSplitPdfActivity.f26831d0, false);
                }
                SplitPreviewFragment o22 = readerSplitPdfActivity.o2();
                if (o22 != null) {
                    int i19 = readerSplitPdfActivity.X;
                    pdf.pdfreader.viewer.editor.free.ui.adapter.w wVar = o22.f27984g0;
                    if (wVar != null) {
                        ArrayList arrayList = wVar.f27315g;
                        int size = arrayList.size();
                        w.a aVar10 = wVar.f27314f;
                        if (size >= i19) {
                            arrayList.clear();
                            aVar10.l(false);
                        } else {
                            arrayList.clear();
                            while (i11 < i19) {
                                arrayList.add(Integer.valueOf(i11));
                                i11++;
                            }
                            aVar10.l(true);
                        }
                        wVar.notifyDataSetChanged();
                        return;
                    }
                    return;
                }
                return;
            case 17:
                ReaderImg2PDFConvertActivity.a aVar11 = ReaderImg2PDFConvertActivity.f27381i0;
                ((ReaderImg2PDFConvertActivity) obj2).onClick(view);
                return;
            case 18:
                String str5 = ReaderSelectImagePreviewActivity.U;
                ((ReaderSelectImagePreviewActivity) obj2).onClick(view);
                return;
            case 19:
                pdf.pdfreader.viewer.editor.free.ui.dialog.c cVar3 = (pdf.pdfreader.viewer.editor.free.ui.dialog.c) obj2;
                int i20 = pdf.pdfreader.viewer.editor.free.ui.dialog.c.A;
                kotlin.jvm.internal.g.e(cVar3, ea.a.p("O2hYc10w", "zV88rkEP"));
                cVar3.f27508y = true;
                Intent intent2 = new Intent(cVar3.getContext(), ReaderFeedbackActivity.class);
                intent2.putExtra(ea.a.p("R2Fn", "PAO5aIXW"), ea.a.p("O2UBdCxuZw==", "diHuE4Am"));
                pdf.pdfreader.viewer.editor.free.utils.h1.startActivity(cVar3.getContext(), intent2);
                cVar3.dismiss();
                tn.a.b(ReaderPdfApplication.m(), ea.a.p("UnNr", "oaPQIgVI"), ea.a.p("UnMgXx1vFnIXYVhsEF81bC1jaw==", "UfdOwTSN"));
                return;
            case 20:
                pdf.pdfreader.viewer.editor.free.ui.dialog.s sVar = (pdf.pdfreader.viewer.editor.free.ui.dialog.s) obj2;
                int i21 = pdf.pdfreader.viewer.editor.free.ui.dialog.s.f27735u;
                kotlin.jvm.internal.g.e(sVar, ea.a.p("O2hYc10w", "QdZvwgjU"));
                AppCompatEditText appCompatEditText = sVar.f27737o;
                if (appCompatEditText != null) {
                    appCompatEditText.setText("");
                    view.setVisibility(4);
                    return;
                }
                kotlin.jvm.internal.g.i(ea.a.p("VmQidCdlGnQ=", "YD3kpIy5"));
                throw null;
            case 21:
                PdfReaderOpenDefaultDialog pdfReaderOpenDefaultDialog = (PdfReaderOpenDefaultDialog) obj2;
                PdfReaderOpenDefaultDialog.a aVar12 = PdfReaderOpenDefaultDialog.J;
                kotlin.jvm.internal.g.e(pdfReaderOpenDefaultDialog, ea.a.p("AWgPc2ow", "7oufNM8o"));
                pdfReaderOpenDefaultDialog.dismiss();
                return;
            case 22:
                PreviewAddTextDialog previewAddTextDialog = (PreviewAddTextDialog) obj2;
                int i22 = PreviewAddTextDialog.f27451o;
                kotlin.jvm.internal.g.e(previewAddTextDialog, ea.a.p("O2hYc10w", "xcjyrz6L"));
                tn.a.b(previewAddTextDialog.getContext(), ea.a.p("LmRVXw1lT3Q=", "3PxDNTju"), ea.a.p("R2UzdCxpDHAHdGtuDHgiXydsW2Nr", "0aGFDM5I"));
                Editable text = previewAddTextDialog.p().c.getText();
                if (text != null) {
                    str = text.toString();
                } else {
                    str = null;
                }
                if (str == null || kotlin.text.j.H(str)) {
                    i11 = 1;
                }
                if (i11 != 0) {
                    long j10 = previewAddTextDialog.f27459k;
                    if (j10 > 0) {
                        pdf.pdfreader.viewer.editor.free.ui.dialog.a aVar13 = previewAddTextDialog.f27457i;
                        if (aVar13 != null) {
                            int i23 = previewAddTextDialog.f27453e;
                            int i24 = previewAddTextDialog.f27454f;
                            Editable text2 = previewAddTextDialog.p().c.getText();
                            if (text2 != null) {
                                str3 = text2.toString();
                            }
                            ((ReaderPreviewActivity) aVar13).I3("", i23, i24, j10, !kotlin.jvm.internal.g.a(str3, previewAddTextDialog.f27460l));
                        }
                        previewAddTextDialog.dismiss();
                        return;
                    }
                    previewAddTextDialog.q();
                    return;
                }
                pdf.pdfreader.viewer.editor.free.ui.dialog.a aVar14 = previewAddTextDialog.f27457i;
                if (aVar14 != null) {
                    Editable text3 = previewAddTextDialog.p().c.getText();
                    if (text3 == null || (obj = text3.toString()) == null) {
                        str2 = "";
                    } else {
                        str2 = obj;
                    }
                    int i25 = previewAddTextDialog.f27458j;
                    int i26 = previewAddTextDialog.f27454f;
                    long j11 = previewAddTextDialog.f27459k;
                    Editable text4 = previewAddTextDialog.p().c.getText();
                    if (text4 != null) {
                        str3 = text4.toString();
                    }
                    ((ReaderPreviewActivity) aVar14).I3(str2, i25, i26, j11, !kotlin.jvm.internal.g.a(str3, previewAddTextDialog.f27460l));
                }
                previewAddTextDialog.dismiss();
                return;
            case 23:
                j3 j3Var = (j3) obj2;
                int i27 = j3.f27640y;
                kotlin.jvm.internal.g.e(j3Var, ea.a.p("R2gic1cw", "OZaf0O6W"));
                j3Var.dismiss();
                return;
            case 24:
                oo.c cVar4 = (oo.c) obj2;
                int i28 = oo.c.B;
                kotlin.jvm.internal.g.e(cVar4, ea.a.p("O2hYc10w", "2xO8p6kk"));
                oo.a aVar15 = cVar4.f23542t;
                if (aVar15 != null) {
                    aVar15.cancel();
                }
                cVar4.dismiss();
                return;
            default:
                ap.d dVar = (ap.d) obj2;
                int i29 = ap.d.G;
                kotlin.jvm.internal.g.e(dVar, ea.a.p("N2g7c2gw", "6hCRL7PY"));
                f5.c cVar5 = dVar.f5160u;
                if (cVar5 != null) {
                    ((ReaderHomeActivity.k0) cVar5).X();
                }
                ap.d.x();
                try {
                    int i30 = dVar.f5159t;
                    if (i30 == 1 || i30 == 2) {
                        if (kotlin.jvm.internal.g.a(dVar.l(), ea.a.p("AG4=", "tkeLxX71"))) {
                            p10 = ea.a.p("Vm4=", "uAHT7a01");
                        } else {
                            p10 = ea.a.p("JnQZZXI=", "YMIqFIrp");
                        }
                        if (kotlin.jvm.internal.g.a(ea.a.p("QQ==", "yHutOBqZ"), dVar.F)) {
                            tn.a.d(dVar.getContext(), ea.a.p("RnAvYQdl", "H0sIYZZs"), ea.a.p("OnBVYQ1laG41cidhGWMEb2pjAmkmaw==", "QkRWgBQp"), p10, false);
                        } else if (kotlin.jvm.internal.g.a(ea.a.p("Qg==", "2NBxIBcA"), dVar.F)) {
                            tn.a.b(dVar.getContext(), ea.a.p("OnBVYQ1l", "8bPGZywG"), ea.a.p("RnAvYQdlPW0TaltyCmw5XydsW2Nr", "QqyfqSlz"));
                        }
                    }
                } catch (Exception unused) {
                }
                dVar.dismiss();
                return;
        }
    }
}
