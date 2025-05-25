package d9;

import am.v0;
import am.w0;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;
import androidx.lifecycle.w;
import com.google.android.material.search.SearchView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import k9.n;
import kotlin.collections.m;
import kotlinx.coroutines.flow.StateFlowImpl;
import pdf.pdfreader.viewer.editor.free.billing.SubscriptionType;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIAnswerView;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseAISubscriptionActivity;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionBlackFridayActivity;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionDarkTestFActivity;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionDarkTestJActivity;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRPreviewFragment;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRResultFragment;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustPayload;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.repo.convert.ImageConvertDataRepository;
import pdf.pdfreader.viewer.editor.free.ui.act.LanguageChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergeChooserActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderSplitPdfActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFConvertActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderSelectImagePreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenDefaultDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PreviewAddTextDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.f0;
import pdf.pdfreader.viewer.editor.free.ui.dialog.g0;
import pdf.pdfreader.viewer.editor.free.ui.dialog.j3;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugIAPConfigFragment;
import pdf.pdfreader.viewer.editor.free.utils.event.OCREventCenter;
import pdf.pdfreader.viewer.editor.free.utils.event.ScanEventCenter;
import pdf.pdfreader.viewer.editor.free.utils.s1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16157a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f16158b;

    public /* synthetic */ f(Object obj, int i10) {
        this.f16157a = i10;
        this.f16158b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        um.a aVar;
        int i10;
        EditText editText;
        int i11 = this.f16157a;
        Object obj = this.f16158b;
        switch (i11) {
            case 0:
                SearchView searchView = (SearchView) obj;
                searchView.f12811j.setText("");
                searchView.d();
                return;
            case 1:
                ((n) obj).u();
                return;
            case 2:
                AIAnswerView aIAnswerView = (AIAnswerView) obj;
                int i12 = AIAnswerView.f24728g;
                kotlin.jvm.internal.g.e(aIAnswerView, ea.a.p("R2gic1cw", "tzpU1358"));
                AIAnswerView.a aVar2 = aIAnswerView.f24729b;
                if (aVar2 != null) {
                    aVar2.e(false);
                    return;
                }
                return;
            case 3:
                pdf.pdfreader.viewer.editor.free.feature.billing.dialog.b bVar = (pdf.pdfreader.viewer.editor.free.feature.billing.dialog.b) obj;
                int i13 = pdf.pdfreader.viewer.editor.free.feature.billing.dialog.b.B;
                kotlin.jvm.internal.g.e(bVar, ea.a.p("O2hYc10w", "FMZb36CR"));
                oo.a aVar3 = bVar.f23542t;
                if (aVar3 != null) {
                    aVar3.cancel();
                }
                bVar.dismiss();
                return;
            case 4:
                BaseAISubscriptionActivity baseAISubscriptionActivity = (BaseAISubscriptionActivity) obj;
                String str = BaseAISubscriptionActivity.U;
                kotlin.jvm.internal.g.e(baseAISubscriptionActivity, ea.a.p("R2gic1cw", "K2pk1jH5"));
                baseAISubscriptionActivity.o2();
                return;
            case 5:
                SubscriptionBlackFridayActivity subscriptionBlackFridayActivity = (SubscriptionBlackFridayActivity) obj;
                int i14 = SubscriptionBlackFridayActivity.f24898a0;
                kotlin.jvm.internal.g.e(subscriptionBlackFridayActivity, ea.a.p("R2gic1cw", "3Yz5ebXZ"));
                subscriptionBlackFridayActivity.j2().d(SubscriptionType.YEAR);
                return;
            case 6:
                SubscriptionDarkTestFActivity subscriptionDarkTestFActivity = (SubscriptionDarkTestFActivity) obj;
                int i15 = SubscriptionDarkTestFActivity.f24900a0;
                kotlin.jvm.internal.g.e(subscriptionDarkTestFActivity, ea.a.p("Q2gqc3Aw", "Z87CT8kz"));
                if (!subscriptionDarkTestFActivity.W) {
                    subscriptionDarkTestFActivity.p2();
                    return;
                }
                return;
            case 7:
                SubscriptionDarkTestJActivity subscriptionDarkTestJActivity = (SubscriptionDarkTestJActivity) obj;
                SubscriptionDarkTestJActivity.a aVar4 = SubscriptionDarkTestJActivity.f24905b0;
                kotlin.jvm.internal.g.e(subscriptionDarkTestJActivity, ea.a.p("O2hYc10w", "nmQeo3xM"));
                subscriptionDarkTestJActivity.r2();
                return;
            case 8:
                OCRPreviewFragment oCRPreviewFragment = (OCRPreviewFragment) obj;
                OCRPreviewFragment.a aVar5 = OCRPreviewFragment.f25168p0;
                kotlin.jvm.internal.g.e(oCRPreviewFragment, ea.a.p("O2hYc10w", "2ksDjNOf"));
                tn.a.b(ScanEventCenter.a(), ea.a.p("CnIjcA==", "XHiLqm1f"), ea.a.p("UHIkcCxkB2wXX1dsAGNr", "5FqcYWRc"));
                w<List<um.a>> wVar = pdf.pdfreader.viewer.editor.free.feature.ocr.helper.a.f25068a;
                VB vb2 = oCRPreviewFragment.Y;
                kotlin.jvm.internal.g.b(vb2);
                int currentItem = ((v0) vb2).f1547s.getCurrentItem();
                List<um.a> d10 = pdf.pdfreader.viewer.editor.free.feature.ocr.helper.a.f25068a.d();
                ul.b bVar2 = null;
                if (d10 != null) {
                    aVar = (um.a) m.t0(currentItem, d10);
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    ImageConvertDataRepository.f26536a.getClass();
                    ArrayList arrayList = (ArrayList) ImageConvertDataRepository.f26546l.d();
                    if (arrayList != null) {
                        bVar2 = (ul.b) m.t0(aVar.c, arrayList);
                    }
                    if (bVar2 != null) {
                        ImageConvertDataRepository.l(bVar2);
                    }
                    List list = (List) pdf.pdfreader.viewer.editor.free.feature.ocr.helper.a.f25069b.d();
                    if (list != null) {
                        list.remove(aVar);
                    }
                }
                pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.a x02 = oCRPreviewFragment.x0();
                VB vb3 = oCRPreviewFragment.Y;
                kotlin.jvm.internal.g.b(vb3);
                int currentItem2 = ((v0) vb3).f1547s.getCurrentItem();
                if (currentItem2 >= 0) {
                    if (currentItem2 < x02.h().size()) {
                        x02.h().remove(currentItem2);
                        x02.notifyItemRemoved(currentItem2);
                        x02.notifyItemRangeChanged(currentItem2, x02.h().size() - currentItem2);
                    }
                } else {
                    x02.getClass();
                }
                VB vb4 = oCRPreviewFragment.Y;
                kotlin.jvm.internal.g.b(vb4);
                ((v0) vb4).f1547s.post(new b1.e(oCRPreviewFragment, 18));
                VB vb5 = oCRPreviewFragment.Y;
                kotlin.jvm.internal.g.b(vb5);
                oCRPreviewFragment.z0(((v0) vb5).f1547s.getCurrentItem(), oCRPreviewFragment.x0().getItemCount());
                pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.a x03 = oCRPreviewFragment.x0();
                VB vb6 = oCRPreviewFragment.Y;
                kotlin.jvm.internal.g.b(vb6);
                um.a aVar6 = (um.a) m.t0(((v0) vb6).f1547s.getCurrentItem(), x03.h());
                if (aVar6 != null) {
                    oCRPreviewFragment.u0(aVar6.f30437f);
                    return;
                }
                return;
            case 9:
                OCRResultFragment oCRResultFragment = (OCRResultFragment) obj;
                OCRResultFragment.a aVar7 = OCRResultFragment.f25189r0;
                kotlin.jvm.internal.g.e(oCRResultFragment, ea.a.p("O2hYc10w", "s3bLJ64d"));
                tf.c cVar = OCREventCenter.f28670a;
                OCREventCenter.o(ea.a.p("GG0RbGw=", "XXkp71nH"));
                VB vb7 = oCRResultFragment.Y;
                kotlin.jvm.internal.g.b(vb7);
                ((w0) vb7).f1585l.setVisibility(8);
                return;
            case 10:
                pdf.pdfreader.viewer.editor.free.feature.scan.dialog.c cVar2 = (pdf.pdfreader.viewer.editor.free.feature.scan.dialog.c) obj;
                int i16 = pdf.pdfreader.viewer.editor.free.feature.scan.dialog.c.C;
                kotlin.jvm.internal.g.e(cVar2, ea.a.p("O2hYc10w", "Jex2yuhy"));
                cVar2.B = true;
                cVar2.cancel();
                return;
            case 11:
                CameraActivity cameraActivity = (CameraActivity) obj;
                int i17 = CameraActivity.H0;
                kotlin.jvm.internal.g.e(cameraActivity, ea.a.p("O2hYc10w", "1nGgsRtb"));
                cameraActivity.f25722n0 = true;
                StateFlowImpl stateFlowImpl = cameraActivity.s2().f23509d;
                boolean z10 = !((mn.a) stateFlowImpl.b()).f22147d;
                stateFlowImpl.setValue(mn.a.a((mn.a) stateFlowImpl.b(), false, false, false, z10, false, 23));
                jn.a.c.getClass();
                jn.a.f19328i.c(jn.a.f19323d[4], Boolean.valueOf(z10));
                return;
            case 12:
                ImageAdjustActivity imageAdjustActivity = (ImageAdjustActivity) obj;
                ImageAdjustActivity.a aVar8 = ImageAdjustActivity.f25741u0;
                kotlin.jvm.internal.g.e(imageAdjustActivity, ea.a.p("O2hYc10w", "EQIATFWl"));
                tf.c cVar3 = ScanEventCenter.f28674a;
                ScanEventCenter.f(imageAdjustActivity.b2());
                on.b C2 = imageAdjustActivity.C2();
                ul.c k10 = C2.k();
                if (k10 == null) {
                    i10 = -1;
                } else {
                    int i18 = k10.f30426b + 90;
                    k10.f30426b = i18;
                    if (i18 % 360 == 0) {
                        k10.f30426b = 0;
                    }
                    i10 = C2.f23518k;
                }
                if (i10 >= 0) {
                    imageAdjustActivity.B2().notifyItemChanged(i10, ImageAdjustPayload.ROTATE_CLOCK_WISE);
                    return;
                }
                return;
            case 13:
                ReaderPreviewActivity readerPreviewActivity = (ReaderPreviewActivity) obj;
                ExecutorService executorService = ReaderPreviewActivity.U5;
                readerPreviewActivity.n3();
                ViewGroup viewGroup = readerPreviewActivity.X3;
                if (viewGroup != null) {
                    viewGroup.performClick();
                    return;
                }
                return;
            case 14:
                pdf.pdfreader.viewer.editor.free.ui.act.e eVar = (pdf.pdfreader.viewer.editor.free.ui.act.e) obj;
                String str2 = pdf.pdfreader.viewer.editor.free.ui.act.e.f26901p;
                kotlin.jvm.internal.g.e(eVar, ea.a.p("Rmgxcxww", "M72X86Vw"));
                eVar.finish();
                return;
            case 15:
                LanguageChooseActivity languageChooseActivity = (LanguageChooseActivity) obj;
                int i19 = LanguageChooseActivity.H;
                kotlin.jvm.internal.g.e(languageChooseActivity, ea.a.p("O2hYc10w", "MCb8knFe"));
                languageChooseActivity.a2();
                return;
            case 16:
                ReaderMergeChooserActivity readerMergeChooserActivity = (ReaderMergeChooserActivity) obj;
                ReaderMergeChooserActivity.a aVar9 = ReaderMergeChooserActivity.f26759n0;
                kotlin.jvm.internal.g.e(readerMergeChooserActivity, ea.a.p("IGgOc1Iw", "HuTgvMEN"));
                readerMergeChooserActivity.onBackPressed();
                return;
            case 17:
                ReaderSplitPdfActivity readerSplitPdfActivity = (ReaderSplitPdfActivity) obj;
                ReaderSplitPdfActivity.a aVar10 = ReaderSplitPdfActivity.f26822q0;
                kotlin.jvm.internal.g.e(readerSplitPdfActivity, ea.a.p("EWgkc0Mw", "lyeMg7sy"));
                readerSplitPdfActivity.onBackPressed();
                return;
            case 18:
                ReaderImg2PDFChooseActivity.a aVar11 = ReaderImg2PDFChooseActivity.M0;
                ((ReaderImg2PDFChooseActivity) obj).onClick(view);
                return;
            case 19:
                ReaderImg2PDFConvertActivity.a aVar12 = ReaderImg2PDFConvertActivity.f27381i0;
                ((ReaderImg2PDFConvertActivity) obj).onClick(view);
                return;
            case 20:
                String str3 = ReaderSelectImagePreviewActivity.U;
                ((ReaderSelectImagePreviewActivity) obj).onClick(view);
                return;
            case 21:
                pdf.pdfreader.viewer.editor.free.ui.dialog.c cVar4 = (pdf.pdfreader.viewer.editor.free.ui.dialog.c) obj;
                int i20 = pdf.pdfreader.viewer.editor.free.ui.dialog.c.A;
                kotlin.jvm.internal.g.e(cVar4, ea.a.p("IGhfc14w", "dlT6zP9k"));
                cVar4.dismiss();
                return;
            case 22:
                f0 f0Var = (f0) obj;
                if (!f0Var.K && !f0Var.J) {
                    if (f0Var.G) {
                        f0Var.G = false;
                        f0Var.R0();
                        f0Var.F.b();
                        return;
                    } else if (f0Var.f23532h != null && !TextUtils.isEmpty(f0Var.B())) {
                        f0Var.f23532h.a();
                        return;
                    } else {
                        if (f0Var.f27551o == null && (editText = f0Var.f27550n) != null) {
                            f0Var.f27551o = s1.a(editText);
                        }
                        ObjectAnimator objectAnimator = f0Var.f27551o;
                        if (objectAnimator != null) {
                            objectAnimator.start();
                            return;
                        }
                        return;
                    }
                }
                return;
            case 23:
                int i21 = g0.A;
                ((g0) obj).dismiss();
                return;
            case 24:
                PdfReaderOpenDefaultDialog pdfReaderOpenDefaultDialog = (PdfReaderOpenDefaultDialog) obj;
                PdfReaderOpenDefaultDialog.a aVar13 = PdfReaderOpenDefaultDialog.J;
                kotlin.jvm.internal.g.e(pdfReaderOpenDefaultDialog, ea.a.p("R2gic1cw", "s074PsqK"));
                pdfReaderOpenDefaultDialog.E = true;
                pdfReaderOpenDefaultDialog.dismiss();
                Context context = pdfReaderOpenDefaultDialog.getContext();
                kotlin.jvm.internal.g.d(context, ea.a.p("LG9fdBx4dA==", "kEJ2rKWA"));
                PdfReaderOpenDefaultDialog.J.getClass();
                int i22 = pdfReaderOpenDefaultDialog.f27449y;
                PdfReaderOpenDefaultDialog.a.h(context, i22, pdfReaderOpenDefaultDialog.f27450z);
                PdfReaderOpenDefaultDialog.L = i22;
                return;
            case 25:
                PreviewAddTextDialog previewAddTextDialog = (PreviewAddTextDialog) obj;
                int i23 = PreviewAddTextDialog.f27451o;
                kotlin.jvm.internal.g.e(previewAddTextDialog, ea.a.p("O2hYc10w", "XxMIkGs3"));
                tn.a.b(view.getContext(), ea.a.p("LmRVXw1lT3Q=", "AYd3vlpN"), ea.a.p("O2VJdCZpWXAvdBVjGW8bZWpjAmkmaw==", "ElylYwxr"));
                previewAddTextDialog.q();
                return;
            case 26:
                j3 j3Var = (j3) obj;
                int i24 = j3.f27640y;
                kotlin.jvm.internal.g.e(j3Var, ea.a.p("OGghc3Aw", "42LHT18X"));
                j3Var.dismiss();
                return;
            default:
                DebugIAPConfigFragment debugIAPConfigFragment = (DebugIAPConfigFragment) obj;
                int i25 = DebugIAPConfigFragment.f27857e0;
                kotlin.jvm.internal.g.e(debugIAPConfigFragment, ea.a.p("O2hYc10w", "DYx4hctG"));
                BillingConfigImpl.c.getClass();
                BillingConfigImpl.f24865s.c(BillingConfigImpl.f24850d[3], Boolean.FALSE);
                Toast.makeText(debugIAPConfigFragment.r(), ea.a.p("q7-f5u250YjK5cCf", "dXTsIJTF"), 0).show();
                return;
        }
    }
}
