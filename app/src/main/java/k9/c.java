package k9;

import am.e0;
import am.v0;
import am.w0;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.w;
import com.inmobi.media.C1565b2;
import en.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.billing.SubscriptionType;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseAISubscriptionActivity;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionBlackFridayActivity;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionDarkTestFActivity;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionDarkTestJActivity;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRPreviewFragment;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRResultFragment;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRSelectTextFragment;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.widget.PreviewCreateEditGuideView;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageBigPicPreviewActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageLongPicPreviewActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImagePicPreviewActivity;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustPayload;
import pdf.pdfreader.viewer.editor.free.ui.act.ClearDefaultReaderStep2Activity;
import pdf.pdfreader.viewer.editor.free.ui.act.PolicyOverloadActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.SettingsActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.PDFChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImgPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.EnterFileNameDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenClearDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenDefaultDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.b0;
import pdf.pdfreader.viewer.editor.free.ui.dialog.n3;
import pdf.pdfreader.viewer.editor.free.utils.e1;
import pdf.pdfreader.viewer.editor.free.utils.event.OCREventCenter;
import pdf.pdfreader.viewer.editor.free.utils.event.ScanEventCenter;
import pdf.pdfreader.viewer.editor.free.utils.j1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f19645a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f19646b;

    public /* synthetic */ c(Object obj, int i10) {
        this.f19645a = i10;
        this.f19646b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        byte b10;
        String obj;
        int i10;
        int i11;
        String str2;
        String str3;
        ActivityInfo activityInfo;
        ApplicationInfo applicationInfo;
        ActivityInfo activityInfo2;
        int i12 = this.f19645a;
        String str4 = "";
        Object obj2 = null;
        String str5 = null;
        r2 = null;
        ul.c cVar = null;
        boolean z10 = true;
        Object obj3 = this.f19646b;
        switch (i12) {
            case 0:
                g gVar = (g) obj3;
                EditText editText = gVar.f19655i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    gVar.q();
                    return;
                }
                return;
            case 1:
                C1565b2.a((C1565b2) obj3, view);
                return;
            case 2:
                BaseAISubscriptionActivity baseAISubscriptionActivity = (BaseAISubscriptionActivity) obj3;
                String str6 = BaseAISubscriptionActivity.U;
                kotlin.jvm.internal.g.e(baseAISubscriptionActivity, ea.a.p("R2gic1cw", "s3GvIr5m"));
                baseAISubscriptionActivity.p2();
                return;
            case 3:
                SubscriptionBlackFridayActivity subscriptionBlackFridayActivity = (SubscriptionBlackFridayActivity) obj3;
                int i13 = SubscriptionBlackFridayActivity.f24898a0;
                kotlin.jvm.internal.g.e(subscriptionBlackFridayActivity, ea.a.p("R2gic1cw", "02Yga9ah"));
                tn.a.b(view.getContext(), ea.a.p("JmFw", "yVsdGPjh"), ea.a.p("JmFBXxx2Um4uXylvG3QBbkBlMWMpaQZr", "sKmiAXiD"));
                Iterator<T> it = subscriptionBlackFridayActivity.j2().f24958n.c.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((ol.i) next).f23489a == SubscriptionType.YEAR_TRIAL_3D) {
                            b10 = 1;
                            continue;
                        } else {
                            b10 = 0;
                            continue;
                        }
                        if (b10 != 0) {
                            obj2 = next;
                        }
                    }
                }
                ol.i iVar = (ol.i) obj2;
                if (iVar != null && (str = iVar.f23490b) != null) {
                    str4 = str;
                }
                subscriptionBlackFridayActivity.y2(str4);
                return;
            case 4:
                SubscriptionDarkTestFActivity subscriptionDarkTestFActivity = (SubscriptionDarkTestFActivity) obj3;
                int i14 = SubscriptionDarkTestFActivity.f24900a0;
                kotlin.jvm.internal.g.e(subscriptionDarkTestFActivity, ea.a.p("O2hYc10w", "EDmvGLN6"));
                subscriptionDarkTestFActivity.n2();
                return;
            case 5:
                SubscriptionDarkTestJActivity subscriptionDarkTestJActivity = (SubscriptionDarkTestJActivity) obj3;
                SubscriptionDarkTestJActivity.a aVar = SubscriptionDarkTestJActivity.f24905b0;
                kotlin.jvm.internal.g.e(subscriptionDarkTestJActivity, ea.a.p("R2gic1cw", "42ft3am5"));
                subscriptionDarkTestJActivity.j2().d(SubscriptionType.YEAR);
                return;
            case 6:
                OCRPreviewFragment oCRPreviewFragment = (OCRPreviewFragment) obj3;
                OCRPreviewFragment.a aVar2 = OCRPreviewFragment.f25168p0;
                kotlin.jvm.internal.g.e(oCRPreviewFragment, ea.a.p("TGhQc1Iw", "Qn89vmej"));
                pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.a x02 = oCRPreviewFragment.x0();
                VB vb2 = oCRPreviewFragment.Y;
                kotlin.jvm.internal.g.b(vb2);
                int currentItem = ((v0) vb2).f1547s.getCurrentItem();
                if (currentItem >= 0) {
                    if (currentItem < x02.h().size()) {
                        um.a aVar3 = x02.h().get(currentItem);
                        ul.c cVar2 = aVar3.f30437f;
                        cVar2.f30428e = true ^ cVar2.f30428e;
                        cVar2.f30427d = false;
                        cVar2.f30429f = false;
                        x02.notifyItemChanged(currentItem, ImageAdjustPayload.CROP_STATE);
                        aVar3.f30438g = null;
                        aVar3.f30439h = null;
                        aVar3.f30436e = null;
                        cVar = cVar2;
                    }
                } else {
                    x02.getClass();
                }
                if (cVar != null) {
                    boolean z11 = cVar.f30428e;
                    tf.c cVar3 = ScanEventCenter.f28674a;
                    ScanEventCenter.c(ea.a.p("IGNy", "18hP23YQ"), z11);
                    oCRPreviewFragment.u0(cVar);
                    return;
                }
                return;
            case 7:
                OCRResultFragment oCRResultFragment = (OCRResultFragment) obj3;
                OCRResultFragment.a aVar4 = OCRResultFragment.f25189r0;
                kotlin.jvm.internal.g.e(oCRResultFragment, ea.a.p("R2gic1cw", "0CnaFe5K"));
                tf.c cVar4 = OCREventCenter.f28670a;
                String p10 = ea.a.p("Vng_chJjdA==", "ZxagokrV");
                HashSet<String> hashSet = OCREventCenter.c;
                if (!hashSet.contains(ea.a.p("IGNDchxzQmwuXylvBXkJbFlfDWwsY2s=", "ZIhKYdLB"))) {
                    Context c = androidx.activity.r.c("XWM6chBzOmw8XwVvRHk2bFRfMWwgY2s=", "Bs2HuObC", hashSet);
                    tn.a.d(c, a0.a.i("UnA7bBpjA3Qbb1pDBm4iZTx0", "N5kEWCie", c, "AmNy", "YgmvOxqy"), ea.a.p("BWM0ci1zAWw8XwVvRHk2bFRfMWwgY2s=", "RUjFHtmq"), p10, false);
                }
                VB vb3 = oCRResultFragment.Y;
                kotlin.jvm.internal.g.b(vb3);
                Editable text2 = ((w0) vb3).f1590q.getText();
                if (text2 != null && (obj = text2.toString()) != null) {
                    if (kotlin.text.k.n0(obj).toString().length() <= 0) {
                        z10 = false;
                    }
                    if (z10) {
                        str5 = obj;
                    }
                    if (str5 != null) {
                        Object systemService = view.getContext().getSystemService(ea.a.p("AWwqcFFvEXJk", "9tbC3p24"));
                        kotlin.jvm.internal.g.c(systemService, ea.a.p("InU6bGtjDW4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiA4eSZla2ECZDpvD2QaYzhuTGU8dGdDWmkEYh5hI2QPYSJhMWVy", "thLVKll9"));
                        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(ea.a.p("H0R3UhxhU2Vy", "w1UIuIJO"), str5));
                        j1.h(oCRResultFragment.v().getString(R.string.arg_res_0x7f130056), view.getContext(), false, R.drawable.ic_copy_success);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                OCRSelectTextFragment oCRSelectTextFragment = (OCRSelectTextFragment) obj3;
                OCRSelectTextFragment.a aVar5 = OCRSelectTextFragment.f25218g0;
                kotlin.jvm.internal.g.e(oCRSelectTextFragment, ea.a.p("R2gic1cw", "VzKaSTEU"));
                tf.c cVar5 = OCREventCenter.f28670a;
                OCREventCenter.m(ea.a.p("QGUnZRB0", "njjrS5Sz"));
                String t02 = oCRSelectTextFragment.t0();
                if (t02.length() <= 0) {
                    z10 = false;
                }
                if (z10) {
                    e1.h(view.getContext(), oCRSelectTextFragment.v().getString(R.string.arg_res_0x7f13036c), t02);
                    return;
                }
                return;
            case 9:
                PDFPageManagerActivity pDFPageManagerActivity = (PDFPageManagerActivity) obj3;
                PDFPageManagerActivity.a aVar6 = PDFPageManagerActivity.H0;
                kotlin.jvm.internal.g.e(pDFPageManagerActivity, ea.a.p("O2hYc10w", "XYmXW3eL"));
                pDFPageManagerActivity.onBackPressed();
                return;
            case 10:
                pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.dialog.b bVar = (pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.dialog.b) obj3;
                int i15 = pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.dialog.b.f25366r;
                kotlin.jvm.internal.g.e(bVar, ea.a.p("R2gic1cw", "xNmxrM5F"));
                e0 e0Var = bVar.f23549n;
                kotlin.jvm.internal.g.b(e0Var);
                e0Var.f851d.setText("");
                view.setVisibility(8);
                return;
            case 11:
                PreviewCreateEditGuideView previewCreateEditGuideView = (PreviewCreateEditGuideView) obj3;
                int i16 = PreviewCreateEditGuideView.f25425s;
                kotlin.jvm.internal.g.e(previewCreateEditGuideView, ea.a.p("R2gic1cw", "EyNRJy0R"));
                cg.a<tf.d> aVar7 = previewCreateEditGuideView.f25427r;
                if (aVar7 != null) {
                    aVar7.invoke();
                }
                previewCreateEditGuideView.r();
                return;
            case 12:
                Pdf2ImageBigPicPreviewActivity pdf2ImageBigPicPreviewActivity = (Pdf2ImageBigPicPreviewActivity) obj3;
                Pdf2ImageBigPicPreviewActivity.a aVar8 = Pdf2ImageBigPicPreviewActivity.f25491w0;
                kotlin.jvm.internal.g.e(pdf2ImageBigPicPreviewActivity, ea.a.p("R2gic1cw", "qUQSewDY"));
                bn.a aVar9 = (bn.a) kotlin.collections.m.t0(pdf2ImageBigPicPreviewActivity.f25495p0, pdf2ImageBigPicPreviewActivity.b3().f25452d);
                if (aVar9 != null) {
                    if (pdf2ImageBigPicPreviewActivity.F2()) {
                        if (!aVar9.f5492f) {
                            ArrayList arrayList = (ArrayList) en.a.f16817d.d();
                            if (arrayList != null) {
                                i11 = arrayList.size();
                            } else {
                                i11 = 0;
                            }
                            if (i11 >= 40) {
                                String string = pdf2ImageBigPicPreviewActivity.getString(R.string.arg_res_0x7f130257);
                                kotlin.jvm.internal.g.d(string, ea.a.p("JWUcUzNyX24vKDQuR3QlaVZnfG0oeGlsHW0YdA5yJ2EhaA1kGGdGdCk=", "HPBhG6xF"));
                                pdf2ImageBigPicPreviewActivity.V2(string);
                                return;
                            }
                        }
                    } else if (pdf2ImageBigPicPreviewActivity.L && !aVar9.f5492f) {
                        ArrayList arrayList2 = (ArrayList) en.a.f16817d.d();
                        if (arrayList2 != null) {
                            i10 = arrayList2.size();
                        } else {
                            i10 = 0;
                        }
                        if (i10 >= 24) {
                            String string2 = pdf2ImageBigPicPreviewActivity.getString(R.string.arg_res_0x7f130257);
                            kotlin.jvm.internal.g.d(string2, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHG0neBxsEG0vdBVyBGFQaC5kLGcSdCk=", "yFJasV5Z"));
                            pdf2ImageBigPicPreviewActivity.V2(string2);
                            return;
                        }
                    }
                    if (aVar9.f5492f) {
                        tn.a.d(pdf2ImageBigPicPreviewActivity, ea.a.p("Wm0scxZsB2N0", "kVKgSuE0"), ea.a.p("Jm1WXwxuRGU2ZSl0KmMEaVZr", "nsCDoF8d"), pdf2ImageBigPicPreviewActivity.a3(), false);
                        w<ArrayList<bn.a>> wVar = en.a.f16815a;
                        a.C0215a.d(aVar9);
                    } else {
                        tn.a.d(pdf2ImageBigPicPreviewActivity, ea.a.p("HG1Qc1RsDmN0", "27u71kdR"), ea.a.p("Wm0sXwBlDmURdGtjBWk1aw==", "gmhxr0xs"), pdf2ImageBigPicPreviewActivity.a3(), false);
                        w<ArrayList<bn.a>> wVar2 = en.a.f16815a;
                        ArrayList<bn.a> b11 = a.C0215a.b();
                        aVar9.f5492f = true;
                        aVar9.f5493g = b11.size() + 1;
                        b11.add(aVar9);
                        en.a.c.j(b11);
                    }
                    pdf2ImageBigPicPreviewActivity.Y2(aVar9);
                    pdf2ImageBigPicPreviewActivity.e3();
                    return;
                }
                return;
            case 13:
                Pdf2ImageLongPicPreviewActivity pdf2ImageLongPicPreviewActivity = (Pdf2ImageLongPicPreviewActivity) obj3;
                int i17 = Pdf2ImageLongPicPreviewActivity.f25506w0;
                kotlin.jvm.internal.g.e(pdf2ImageLongPicPreviewActivity, ea.a.p("R2gic1cw", "lvVcmIcS"));
                pdf2ImageLongPicPreviewActivity.onBackPressed();
                return;
            case 14:
                Pdf2ImagePicPreviewActivity pdf2ImagePicPreviewActivity = (Pdf2ImagePicPreviewActivity) obj3;
                int i18 = Pdf2ImagePicPreviewActivity.I0;
                kotlin.jvm.internal.g.e(pdf2ImagePicPreviewActivity, ea.a.p("O2hYc10w", "1gzmQElV"));
                if (pdf2ImagePicPreviewActivity.e3()) {
                    pdf2ImagePicPreviewActivity.b3().f1117b.setChecked(false);
                    pdf2ImagePicPreviewActivity.d3().g();
                    return;
                }
                pdf2ImagePicPreviewActivity.b3().f1117b.setChecked(true);
                pdf2ImagePicPreviewActivity.d3().f(pdf2ImagePicPreviewActivity.f25521s0);
                return;
            case 15:
                pdf.pdfreader.viewer.editor.free.feature.scan.dialog.f fVar = (pdf.pdfreader.viewer.editor.free.feature.scan.dialog.f) obj3;
                int i19 = pdf.pdfreader.viewer.editor.free.feature.scan.dialog.f.D;
                kotlin.jvm.internal.g.e(fVar, ea.a.p("PGgRc0gw", "g1HxlngV"));
                fVar.C = true;
                fVar.cancel();
                return;
            case 16:
                pdf.pdfreader.viewer.editor.free.feature.scan.dialog.r rVar = (pdf.pdfreader.viewer.editor.free.feature.scan.dialog.r) obj3;
                int i20 = pdf.pdfreader.viewer.editor.free.feature.scan.dialog.r.F;
                kotlin.jvm.internal.g.e(rVar, ea.a.p("R2gic1cw", "ntz1tq0O"));
                rVar.cancel();
                return;
            case 17:
                qn.a aVar10 = (qn.a) obj3;
                int i21 = qn.a.f29388q0;
                kotlin.jvm.internal.g.e(aVar10, ea.a.p("R2gic1cw", "6PBbwh0j"));
                try {
                    aVar10.p0(true, false);
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            case 18:
                PolicyOverloadActivity policyOverloadActivity = (PolicyOverloadActivity) obj3;
                int i22 = PolicyOverloadActivity.f26626b;
                kotlin.jvm.internal.g.e(policyOverloadActivity, ea.a.p("R2gic1cw", "O5pSrnm8"));
                policyOverloadActivity.finish();
                return;
            case 19:
                RecentAddedActivity recentAddedActivity = (RecentAddedActivity) obj3;
                RecentAddedActivity.a aVar11 = RecentAddedActivity.f26850l0;
                kotlin.jvm.internal.g.e(recentAddedActivity, ea.a.p("R2gic1cw", "XaRHQ7PG"));
                recentAddedActivity.m2(false);
                recentAddedActivity.q2().C0();
                return;
            case 20:
                SettingsActivity settingsActivity = (SettingsActivity) obj3;
                SettingsActivity.a aVar12 = SettingsActivity.f26879v;
                kotlin.jvm.internal.g.e(settingsActivity, ea.a.p("R2gic1cw", "4noe7ScI"));
                settingsActivity.finish();
                return;
            case 21:
                PDFChooseActivity pDFChooseActivity = (PDFChooseActivity) obj3;
                PDFChooseActivity.a aVar13 = PDFChooseActivity.f27008u0;
                kotlin.jvm.internal.g.e(pDFChooseActivity, ea.a.p("O2hYc10w", "zOTimB2c"));
                pDFChooseActivity.f27025q0 = true;
                return;
            case 22:
                ReaderImg2PDFChooseActivity.a aVar14 = ReaderImg2PDFChooseActivity.M0;
                ((ReaderImg2PDFChooseActivity) obj3).onClick(view);
                return;
            case 23:
                String str7 = ReaderImgPreviewActivity.f27400d0;
                ((ReaderImgPreviewActivity) obj3).onClick(view);
                return;
            case 24:
                EnterFileNameDialog enterFileNameDialog = (EnterFileNameDialog) obj3;
                int i23 = EnterFileNameDialog.f27427x;
                kotlin.jvm.internal.g.e(enterFileNameDialog, ea.a.p("R2gic1cw", "9r0xQBLx"));
                AppCompatEditText appCompatEditText = enterFileNameDialog.f27430p;
                if (appCompatEditText != null) {
                    appCompatEditText.setText("");
                }
                view.setVisibility(4);
                return;
            case 25:
                b0 b0Var = (b0) obj3;
                int i24 = b0.B;
                kotlin.jvm.internal.g.e(b0Var, ea.a.p("R2gic1cw", "SbeyPVYP"));
                b0Var.dismiss();
                return;
            case 26:
                PdfReaderOpenClearDialog pdfReaderOpenClearDialog = (PdfReaderOpenClearDialog) obj3;
                int i25 = PdfReaderOpenClearDialog.M;
                kotlin.jvm.internal.g.e(pdfReaderOpenClearDialog, ea.a.p("JWgucxUw", "eIQG1pc7"));
                PdfReaderOpenDefaultDialog.a aVar15 = PdfReaderOpenDefaultDialog.J;
                Context context = pdfReaderOpenClearDialog.getContext();
                kotlin.jvm.internal.g.d(context, ea.a.p("LG9fdBx4dA==", "KnVnX1Rv"));
                aVar15.getClass();
                ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(PdfReaderOpenDefaultDialog.a.e(pdfReaderOpenClearDialog.f27447y), 65536);
                String p11 = ea.a.p("DW4NcgRpZA==", "W7likef3");
                if (resolveActivity != null && (activityInfo2 = resolveActivity.activityInfo) != null) {
                    str2 = activityInfo2.packageName;
                } else {
                    str2 = null;
                }
                if (!kotlin.jvm.internal.g.a(p11, str2)) {
                    Intent intent = new Intent();
                    intent.setAction(ea.a.p("Lm5VchZpUy4pZT50HG4PcxtBPlAJSSZBEkkJTixEL1QOSX1TJlNyVA5JBEdT", "hgXMFFsj"));
                    String p12 = ea.a.p("Q2EoaxJnZQ==", "aClrP56V");
                    if (resolveActivity != null && (activityInfo = resolveActivity.activityInfo) != null && (applicationInfo = activityInfo.applicationInfo) != null) {
                        str3 = applicationInfo.packageName;
                    } else {
                        str3 = null;
                    }
                    intent.setData(Uri.fromParts(p12, str3, null));
                    try {
                        context.startActivity(intent);
                        cp.a.f15999a.getClass();
                        String str8 = cp.a.f16000b;
                        String str9 = cp.a.f16003f;
                        if (kotlin.text.j.G(str9, str8, true)) {
                            ClearDefaultReaderStep2Activity.a aVar16 = ClearDefaultReaderStep2Activity.C;
                            String p13 = ea.a.p("S2kqbx5p", "NLQxZ0Wv");
                            aVar16.getClass();
                            ClearDefaultReaderStep2Activity.a.a(context, p13);
                        } else if (kotlin.text.j.G(str9, cp.a.c, true)) {
                            ClearDefaultReaderStep2Activity.a aVar17 = ClearDefaultReaderStep2Activity.C;
                            String p14 = ea.a.p("QGEmcwZuZw==", "Q05BgrHC");
                            aVar17.getClass();
                            ClearDefaultReaderStep2Activity.a.a(context, p14);
                        } else if (cp.a.a()) {
                            ClearDefaultReaderStep2Activity.a aVar18 = ClearDefaultReaderStep2Activity.C;
                            String p15 = ea.a.p("P2lJZWw=", "N6ImbZvB");
                            aVar18.getClass();
                            ClearDefaultReaderStep2Activity.a.a(context, p15);
                        }
                    } catch (ActivityNotFoundException e11) {
                        e11.printStackTrace();
                    }
                }
                ro.b<Boolean, PdfReaderOpenClearDialog> bVar2 = pdfReaderOpenClearDialog.K;
                if (bVar2 != null) {
                    bVar2.d(Boolean.TRUE, pdfReaderOpenClearDialog);
                }
                if (!pdfReaderOpenClearDialog.H) {
                    pdfReaderOpenClearDialog.H = true;
                    tn.a.d(pdfReaderOpenClearDialog.getContext(), ea.a.p("EnUoZGU=", "miuAiqDE"), ea.a.p("UWw1YStfFmU7ZRJfV2w-Y2s=", "vq2PYdYu"), pdfReaderOpenClearDialog.I(), false);
                    return;
                }
                return;
            case 27:
                n3 n3Var = (n3) obj3;
                int i26 = n3.f27703k;
                kotlin.jvm.internal.g.e(n3Var, ea.a.p("NWg8c2ww", "TlAUHF9n"));
                n3Var.cancel();
                return;
            case 28:
                oo.d dVar = (oo.d) obj3;
                int i27 = oo.d.f23521r;
                kotlin.jvm.internal.g.e(dVar, ea.a.p("R2gic1cw", "8gbbvwsS"));
                oo.a aVar19 = dVar.f23532h;
                if (aVar19 != null) {
                    aVar19.a();
                }
                dVar.dismiss();
                return;
            default:
                final pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.n nVar = (pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.n) obj3;
                int i28 = pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.n.f27916d0;
                kotlin.jvm.internal.g.e(nVar, ea.a.p("O2hYc10w", "mdR2fAtn"));
                b.a aVar20 = new b.a(view.getContext());
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.k
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i29) {
                        n nVar2 = n.this;
                        int i30 = n.f27916d0;
                        kotlin.jvm.internal.g.e(nVar2, ea.a.p("R2gic1cw", "AvK1Ku0I"));
                        if (i29 != 0) {
                            if (i29 != 1) {
                                if (i29 != 2) {
                                    if (i29 != 3) {
                                        if (i29 == 4) {
                                            pdf.pdfreader.viewer.editor.free.ads.d.m().h(nVar2.f0());
                                            return;
                                        }
                                        return;
                                    }
                                    pdf.pdfreader.viewer.editor.free.ads.j c10 = pdf.pdfreader.viewer.editor.free.ads.j.c();
                                    androidx.fragment.app.u f02 = nVar2.f0();
                                    synchronized (c10) {
                                        c10.g(f02, true);
                                    }
                                    return;
                                }
                                pdf.pdfreader.viewer.editor.free.ads.g.m().h(nVar2.f0());
                                return;
                            }
                            pdf.pdfreader.viewer.editor.free.ads.f.m().h(nVar2.f0());
                            return;
                        }
                        pdf.pdfreader.viewer.editor.free.ads.l.m().h(nVar2.f0());
                    }
                };
                AlertController.b bVar3 = aVar20.f1918a;
                bVar3.f1908m = new String[]{ea.a.p("1orr6M69i5fY5YWPj4_E5fWP", "AY9s1EaX"), ea.a.p("1orr6M69K3QXbXdsAGM95suS17GP", "a4e44wPp"), ea.a.p("qoqR6MS93qLe6O2InKHd5rqSi7GP", "sYBEOOf8"), ea.a.p("lYrh6My91rjB5vC50YjR5IKrHXAsbndE", "ukpAq2GY"), ea.a.p("273n5v6ii6HH5ruSjLGP", "3dmt0qnB")};
                bVar3.f1910o = onClickListener;
                aVar20.a().show();
                return;
        }
    }
}
