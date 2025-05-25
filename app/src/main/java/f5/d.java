package f5;

import am.p2;
import am.t1;
import am.v0;
import am.w0;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.activity.r;
import ap.a;
import h5.m;
import java.util.ArrayList;
import java.util.HashSet;
import k9.t;
import lib.zj.office.system.p;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.billing.SubscriptionType;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryActivity;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.OfficeAIReaderActivity;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseAISubscriptionActivity;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionBlackFridayActivity;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionDarkTestFActivity;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionDarkTestJActivity;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRSelectPDFPageActivity;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRPreviewFragment;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRResultFragment;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRSelectTextFragment;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustFiltersAdapter;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustPayload;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity;
import pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity;
import pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity;
import pdf.pdfreader.viewer.editor.free.office.c0;
import pdf.pdfreader.viewer.editor.free.repo.convert.ImageConvertDataRepository;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderSelectImagePreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PreviewAddTextDialog;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.ReaderDebugActivity;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugIAPConfigFragment;
import pdf.pdfreader.viewer.editor.free.ui.widget.ReflowOpenGuideView;
import pdf.pdfreader.viewer.editor.free.utils.d1;
import pdf.pdfreader.viewer.editor.free.utils.event.OCREventCenter;
import pdf.pdfreader.viewer.editor.free.utils.event.ScanEventCenter;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import qb.g1;
import qn.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17098a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f17099b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f17098a = i10;
        this.f17099b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        boolean A;
        int i10 = this.f17098a;
        boolean z12 = true;
        lib.zj.office.system.h hVar = null;
        Object obj = this.f17099b;
        switch (i10) {
            case 0:
                i this$0 = (i) obj;
                kotlin.jvm.internal.g.e(this$0, "this$0");
                c cVar = this$0.f17110u;
                if (cVar != null) {
                    ((ReaderHomeActivity.k0) cVar).X();
                }
                c5.a b10 = c5.a.b();
                b10.a();
                d5.b b11 = b10.c.f5583e.b();
                if (b11 != null) {
                    b11.onCancel();
                }
                this$0.dismiss();
                return;
            case 1:
                t tVar = (t) obj;
                EditText editText = tVar.f19716f;
                if (editText != null) {
                    int selectionEnd = editText.getSelectionEnd();
                    EditText editText2 = tVar.f19716f;
                    if (editText2 == null || !(editText2.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        z12 = false;
                    }
                    if (z12) {
                        tVar.f19716f.setTransformationMethod(null);
                    } else {
                        tVar.f19716f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        tVar.f19716f.setSelection(selectionEnd);
                    }
                    tVar.q();
                    return;
                }
                return;
            case 2:
                AIChatActivity aIChatActivity = (AIChatActivity) obj;
                AIChatActivity.a aVar = AIChatActivity.f24356v0;
                kotlin.jvm.internal.g.e(aIChatActivity, ea.a.p("TGhQc0ww", "FA89hq4A"));
                aIChatActivity.x2();
                return;
            case 3:
                AIHistoryActivity aIHistoryActivity = (AIHistoryActivity) obj;
                int i11 = AIHistoryActivity.A;
                kotlin.jvm.internal.g.e(aIHistoryActivity, ea.a.p("O2hYc10w", "rNlRFNvY"));
                aIHistoryActivity.onBackPressed();
                return;
            case 4:
                OfficeAIReaderActivity officeAIReaderActivity = (OfficeAIReaderActivity) obj;
                String str = OfficeAIReaderActivity.K0;
                kotlin.jvm.internal.g.e(officeAIReaderActivity, ea.a.p("R2gic1cw", "1TjuSNi8"));
                officeAIReaderActivity.f2();
                return;
            case 5:
                BaseAISubscriptionActivity baseAISubscriptionActivity = (BaseAISubscriptionActivity) obj;
                String str2 = BaseAISubscriptionActivity.U;
                kotlin.jvm.internal.g.e(baseAISubscriptionActivity, ea.a.p("O2hYc10w", "3izXnGzz"));
                baseAISubscriptionActivity.j2().d(SubscriptionType.YEAR);
                return;
            case 6:
                SubscriptionBlackFridayActivity subscriptionBlackFridayActivity = (SubscriptionBlackFridayActivity) obj;
                int i12 = SubscriptionBlackFridayActivity.f24898a0;
                kotlin.jvm.internal.g.e(subscriptionBlackFridayActivity, ea.a.p("R2gic1cw", "0xaHBsbn"));
                if (!subscriptionBlackFridayActivity.W) {
                    subscriptionBlackFridayActivity.p2();
                    return;
                }
                return;
            case 7:
                SubscriptionDarkTestFActivity subscriptionDarkTestFActivity = (SubscriptionDarkTestFActivity) obj;
                int i13 = SubscriptionDarkTestFActivity.f24900a0;
                kotlin.jvm.internal.g.e(subscriptionDarkTestFActivity, ea.a.p("I2hbc1Uw", "2jW2qMZV"));
                BaseSubscriptionActivity.x2(subscriptionDarkTestFActivity, SubscriptionType.YEAR_TRIAL_3D);
                return;
            case 8:
                SubscriptionDarkTestJActivity subscriptionDarkTestJActivity = (SubscriptionDarkTestJActivity) obj;
                SubscriptionDarkTestJActivity.a aVar2 = SubscriptionDarkTestJActivity.f24905b0;
                kotlin.jvm.internal.g.e(subscriptionDarkTestJActivity, ea.a.p("R2gic1cw", "956RC6Va"));
                subscriptionDarkTestJActivity.o2();
                return;
            case 9:
                OCRSelectPDFPageActivity oCRSelectPDFPageActivity = (OCRSelectPDFPageActivity) obj;
                OCRSelectPDFPageActivity.a aVar3 = OCRSelectPDFPageActivity.P;
                kotlin.jvm.internal.g.e(oCRSelectPDFPageActivity, ea.a.p("O2hYc10w", "1ommWAU3"));
                oCRSelectPDFPageActivity.onBackPressed();
                return;
            case 10:
                OCRPreviewFragment oCRPreviewFragment = (OCRPreviewFragment) obj;
                OCRPreviewFragment.a aVar4 = OCRPreviewFragment.f25168p0;
                kotlin.jvm.internal.g.e(oCRPreviewFragment, ea.a.p("O2hYc10w", "lzVBbWVK"));
                tf.c cVar2 = ScanEventCenter.f28674a;
                ScanEventCenter.d(ea.a.p("IGNy", "18hP23YQ"));
                pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.a x02 = oCRPreviewFragment.x0();
                VB vb2 = oCRPreviewFragment.Y;
                kotlin.jvm.internal.g.b(vb2);
                int currentItem = ((v0) vb2).f1547s.getCurrentItem();
                if (currentItem >= 0) {
                    if (currentItem < x02.h().size()) {
                        um.a aVar5 = x02.h().get(currentItem);
                        ul.c cVar3 = aVar5.f30437f;
                        int i14 = cVar3.f30426b - 90;
                        cVar3.f30426b = i14;
                        if (i14 % 360 == 0) {
                            cVar3.f30426b = 0;
                        }
                        aVar5.f30438g = null;
                        aVar5.f30439h = null;
                        aVar5.f30436e = null;
                        x02.notifyItemChanged(currentItem, ImageAdjustPayload.ROTATE_ANTI_CLOCK_WISE);
                        return;
                    }
                    return;
                }
                x02.getClass();
                return;
            case 11:
                OCRResultFragment oCRResultFragment = (OCRResultFragment) obj;
                OCRResultFragment.a aVar6 = OCRResultFragment.f25189r0;
                kotlin.jvm.internal.g.e(oCRResultFragment, ea.a.p("JWgcc0sw", "4RQuoHZU"));
                VB vb3 = oCRResultFragment.Y;
                kotlin.jvm.internal.g.b(vb3);
                int currentItem2 = ((w0) vb3).f1587n.getCurrentItem();
                if (oCRResultFragment.f25191d0 < oCRResultFragment.z0().size() && oCRResultFragment.B0()) {
                    VB vb4 = oCRResultFragment.Y;
                    kotlin.jvm.internal.g.b(vb4);
                    ((w0) vb4).f1587n.setCurrentItem(currentItem2 + 1);
                    return;
                }
                return;
            case 12:
                OCRSelectTextFragment oCRSelectTextFragment = (OCRSelectTextFragment) obj;
                OCRSelectTextFragment.a aVar7 = OCRSelectTextFragment.f25218g0;
                kotlin.jvm.internal.g.e(oCRSelectTextFragment, ea.a.p("O2hYc10w", "VBNTINrn"));
                tf.c cVar4 = OCREventCenter.f28670a;
                String p10 = ea.a.p("PGVdZRp0", "4TKvLpPP");
                HashSet<String> hashSet = OCREventCenter.c;
                if (!hashSet.contains(ea.a.p("CWNEcjVzPWw8XwVvRHkIY1RpMWs=", "oIf6PHsi"))) {
                    Context c = r.c("XGM5chZzF2wGX1dvGXkJYyhpUWs=", "a2UAO4Bq", hashSet);
                    tn.a.d(c, a0.a.i("UnA7bBpjA3Qbb1pDBm4iZTx0", "5VuvJUwi", c, "IGNy", "xJbmzgwl"), ea.a.p("IGNDchxzQmwuXylvBXk3Y1lpDWs=", "IDn4gYId"), p10, false);
                }
                String t02 = oCRSelectTextFragment.t0();
                if (t02.length() <= 0) {
                    z12 = false;
                }
                if (z12) {
                    Object systemService = view.getContext().getSystemService(ea.a.p("J2wncAVvL3Jk", "9NDNgNvM"));
                    kotlin.jvm.internal.g.c(systemService, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuJW56bkVsOSBHeTtlU2EMZABvXWRHYzluMGVcdGhDL2k6YjhhQmQYYV1hLGVy", "JW0UyYaH"));
                    ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(ea.a.p("Y0QNUhZhBmVy", "CJYg80OK"), t02));
                    j1.h(oCRSelectTextFragment.v().getString(R.string.arg_res_0x7f130056), view.getContext(), false, R.drawable.ic_copy_success);
                    return;
                }
                return;
            case 13:
                CameraActivity cameraActivity = (CameraActivity) obj;
                int i15 = CameraActivity.H0;
                kotlin.jvm.internal.g.e(cameraActivity, ea.a.p("LGgec1Mw", "4hXwwTqy"));
                ImageConvertDataRepository.f26536a.getClass();
                ArrayList arrayList = (ArrayList) ImageConvertDataRepository.f26546l.d();
                if (arrayList != null && (!arrayList.isEmpty())) {
                    tn.a.d(cameraActivity, ea.a.p("QGMqbhBhbQ==", "LC4j5VBY"), ea.a.p("QGMqbhBhD18CaFt0Bl81bC1jaw==", "1OA66JJa"), cameraActivity.c2().concat("_total"), false);
                    tn.a.d(cameraActivity, ea.a.p("PGNQbhphbQ==", "toTcbWvT"), ea.a.p("QGMqbhBhD18CaFt0Bl81bC1jaw==", "Dagdiaap"), androidx.activity.f.m(cameraActivity.c2(), "_", cameraActivity.v2()), false);
                    tn.a.d(cameraActivity, ea.a.p("PGVdZRp0aGk3YS1l", "YjNY8hLw"), ea.a.p("Wm0scxZsB2MGX1dsAGNr", "0k2T8xgk"), cameraActivity.c2().concat("_camera"), false);
                    tn.a.d(cameraActivity, ea.a.p("PGVdZRp0aGk3YS1l", "JFeMyht8"), ea.a.p("NWVfZSt0PmktdzlzXG93", "OIF3HHvH"), cameraActivity.c2().concat("_camera"), false);
                    Intent intent = new Intent(cameraActivity, ReaderSelectImagePreviewActivity.class);
                    intent.putExtra(ea.a.p("JGVIXx1pRHA2YTNfBXINdlxlGV8sZA==", "pMBfKrFi"), ((ul.b) arrayList.get(ge.a.A(arrayList))).f30405b);
                    intent.putExtra(ea.a.p("Jm80chJl", "bnUAqjsx"), ea.a.p("LGFcZQth", "V1nkRXMW"));
                    intent.putExtra(ea.a.p("KXJebSZ3WHIxZiZvdw==", "3UlMwtnx"), cameraActivity.f27001t);
                    intent.putExtra(ea.a.p("WGUyXxBhD2UAYWttBmRl", "ZTJa9zFJ"), cameraActivity.f27006y.name());
                    intent.putExtra(ea.a.p("JnN3chZtY2gzcmQ=", "FIDoulBc"), cameraActivity.f25718j0);
                    intent.putExtra(ea.a.p("O3VDbi15R2U=", "WhwgGBIG"), cameraActivity.f27005x);
                    cameraActivity.f25720l0.a(intent);
                    return;
                }
                return;
            case 14:
                ImageAdjustActivity imageAdjustActivity = (ImageAdjustActivity) obj;
                ImageAdjustActivity.a aVar8 = ImageAdjustActivity.f25741u0;
                kotlin.jvm.internal.g.e(imageAdjustActivity, ea.a.p("AmgHc2sw", "49vnOZKA"));
                tf.c cVar5 = ScanEventCenter.f28674a;
                String d22 = imageAdjustActivity.d2();
                HashSet<String> hashSet2 = ScanEventCenter.f28675b;
                if (!hashSet2.contains(ea.a.p("F2EWZTFkM3U7dDlsUWYjX1tsO2Nr", "ZGgqPY28"))) {
                    hashSet2.add(ea.a.p("Q2EsZRJkCHUBdGtsDGYiXydsW2Nr", "6dirMRSH"));
                    tn.a.d(ScanEventCenter.a(), ea.a.p("Q2EsZSxhBmoHc3Q=", "Sk8Qofsp"), ea.a.p("R2EsZQ9kUnU7dDlsUWYjX1tsO2Nr", "UG7Kn8KA"), d22, false);
                }
                int l10 = imageAdjustActivity.C2().l();
                if (l10 >= 0) {
                    ImageAdjustFiltersAdapter imageAdjustFiltersAdapter = imageAdjustActivity.f25743b0;
                    if (imageAdjustFiltersAdapter != null) {
                        imageAdjustFiltersAdapter.i();
                    }
                    imageAdjustActivity.B2().notifyItemChanged(l10, ImageAdjustPayload.ROTATE_ANTI_CLOCK_WISE);
                    imageAdjustActivity.H.post(new g1(imageAdjustActivity, l10, 5));
                    return;
                }
                return;
            case 15:
                p2 p2Var = (p2) obj;
                ImageAdjustActivity.a aVar9 = ImageAdjustActivity.f25741u0;
                kotlin.jvm.internal.g.e(p2Var, ea.a.p("a2ZYbA1lRUIzbi5pG2c=", "rYrct1U6"));
                p2Var.f1307e.performClick();
                return;
            case 16:
                t1 t1Var = (t1) obj;
                ImageAdjustActivity.a aVar10 = ImageAdjustActivity.f25741u0;
                kotlin.jvm.internal.g.e(t1Var, ea.a.p("F2c-aRdlIGkcZF1uZw==", "HH4WzSgZ"));
                t1Var.f1467b.setVisibility(8);
                return;
            case 17:
                qn.a aVar11 = (qn.a) obj;
                int i16 = qn.a.f29388q0;
                kotlin.jvm.internal.g.e(aVar11, ea.a.p("HmggcxUw", "LfjI198m"));
                a.InterfaceC0367a interfaceC0367a = aVar11.f29390p0;
                if (interfaceC0367a != null) {
                    interfaceC0367a.a();
                }
                try {
                    aVar11.p0(true, false);
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            case 18:
                OfficeReaderActivity officeReaderActivity = (OfficeReaderActivity) obj;
                String str3 = OfficeReaderActivity.D2;
                kotlin.jvm.internal.g.e(officeReaderActivity, ea.a.p("R2gic1cw", "FSQNHgyt"));
                ReflowOpenGuideView reflowOpenGuideView = officeReaderActivity.f25941l0;
                if (reflowOpenGuideView != null && reflowOpenGuideView.getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    if (officeReaderActivity.f25932i0 != null && officeReaderActivity.f25915a0 != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        if (officeReaderActivity.f25965t0) {
                            officeReaderActivity.q2();
                            return;
                        } else if (officeReaderActivity.U2()) {
                            if (officeReaderActivity.B2().f26075d) {
                                c0 B2 = officeReaderActivity.B2();
                                p pVar = officeReaderActivity.P0;
                                if (pVar != null) {
                                    hVar = pVar.t();
                                }
                                B2.getClass();
                                ea.a.p("UGElYxZsQnMXYUZjaA==", "8XBqulaL");
                                B2.f26080i = true;
                                if (hVar != null) {
                                    hVar.c();
                                    return;
                                }
                                return;
                            }
                            officeReaderActivity.h2(false);
                            return;
                        } else {
                            officeReaderActivity.onBackPressed();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 19:
                Word2PDFConvertActivity word2PDFConvertActivity = (Word2PDFConvertActivity) obj;
                Word2PDFConvertActivity.a aVar12 = Word2PDFConvertActivity.f26020p1;
                kotlin.jvm.internal.g.e(word2PDFConvertActivity, ea.a.p("O2hYc10w", "IFvG3TWQ"));
                word2PDFConvertActivity.r2();
                return;
            case 20:
                String str4 = ReaderSelectImagePreviewActivity.U;
                ((ReaderSelectImagePreviewActivity) obj).onClick(view);
                return;
            case 21:
                pdf.pdfreader.viewer.editor.free.ui.dialog.c cVar6 = (pdf.pdfreader.viewer.editor.free.ui.dialog.c) obj;
                int i17 = pdf.pdfreader.viewer.editor.free.ui.dialog.c.A;
                kotlin.jvm.internal.g.e(cVar6, ea.a.p("O2hYc10w", "FPteINGA"));
                cVar6.f27508y = true;
                cVar6.dismiss();
                eo.d.c(cVar6.getContext(), ea.a.p("Ng==", "eY8H3H6g"), null);
                tn.a.b(ReaderPdfApplication.m(), ea.a.p("LnNr", "GRpYZALT"), ea.a.p("AnNcXy5vXmQXYwppV2s=", "UDc7I1Em"));
                return;
            case 22:
                PreviewAddTextDialog previewAddTextDialog = (PreviewAddTextDialog) obj;
                int i18 = PreviewAddTextDialog.f27451o;
                kotlin.jvm.internal.g.e(previewAddTextDialog, ea.a.p("O2hYc10w", "t1mIrDR6"));
                tn.a.b(previewAddTextDialog.getContext(), ea.a.p("CGQxXzNlMnQ=", "MHiUGJYM"), ea.a.p("R2UzdCxpDHAHdGtjBWU3chtjXmklaw==", "x0IPKPE8"));
                previewAddTextDialog.p().c.setText("");
                return;
            case 23:
                oo.c cVar7 = (oo.c) obj;
                int i19 = oo.c.B;
                kotlin.jvm.internal.g.e(cVar7, ea.a.p("R2gic1cw", "Uj2w0WPM"));
                oo.a aVar13 = cVar7.f23542t;
                if (aVar13 != null) {
                    aVar13.a();
                }
                cVar7.dismiss();
                return;
            case 24:
                oo.g gVar = (oo.g) obj;
                int i20 = oo.g.f23537x;
                kotlin.jvm.internal.g.e(gVar, ea.a.p("B2hdc2Aw", "HPs4DnwI"));
                Boolean bool = gVar.f23544v;
                if (bool != null) {
                    A = bool.booleanValue();
                } else {
                    A = gVar.A();
                }
                if (A) {
                    gVar.dismiss();
                    return;
                }
                return;
            case 25:
                ReaderDebugActivity readerDebugActivity = (ReaderDebugActivity) obj;
                boolean z13 = ReaderDebugActivity.f27826e;
                kotlin.jvm.internal.g.e(readerDebugActivity, ea.a.p("O2hYc10w", "TcdLUz23"));
                d1.b(ReaderPdfApplication.m()).c(ea.a.p("BWUNZFRyOmQtYhNna204ZGU=", "tbwl1el9"), false);
                Toast.makeText(ReaderPdfApplication.m(), ea.a.p("L2UqdSrl0LKthdXpo60=", "RBKHMgpp"), 0).show();
                readerDebugActivity.finish();
                return;
            case 26:
                DebugIAPConfigFragment debugIAPConfigFragment = (DebugIAPConfigFragment) obj;
                int i21 = DebugIAPConfigFragment.f27857e0;
                kotlin.jvm.internal.g.e(debugIAPConfigFragment, ea.a.p("O2hYc10w", "OtcZLrKF"));
                debugIAPConfigFragment.n0(new Intent(view.getContext(), SubscriptionBlackFridayActivity.class));
                return;
            default:
                ap.d dVar = (ap.d) obj;
                int i22 = ap.d.G;
                kotlin.jvm.internal.g.e(dVar, ea.a.p("R2gic1cw", "s0uODHd8"));
                c5.a.b().getClass();
                ea.a.f16518b = true;
                m mVar = dVar.f5157r;
                if (mVar != null) {
                    mVar.f18044j = kotlin.jvm.internal.g.a(dVar.F, ea.a.p("QQ==", "bQychOS9"));
                }
                if (dVar.f5162w != null) {
                    h5.b.j(dVar.f5156q, mVar);
                }
                if (ap.d.x() != null) {
                    new a.C0030a().b(dVar);
                }
                dVar.dismiss();
                return;
        }
    }
}
