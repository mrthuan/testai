package u4;

import am.t0;
import am.v0;
import am.w0;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Editable;
import android.view.View;
import androidx.activity.r;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.g0;
import com.inmobi.ads.InMobiNative;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.text.Regex;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.billing.SubscriptionType;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.dialog.AIStatementDialog;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseAISubscriptionActivity;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionBlackFridayActivity;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionDarkTestFActivity;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionDarkTestJActivity;
import pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.inquiry.InquiryAfterGuideFragment;
import pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.inquiry.InquiryAfterGuidePageFragment;
import pdf.pdfreader.viewer.editor.free.feature.guide.vm.UserGuideViewModel;
import pdf.pdfreader.viewer.editor.free.feature.ocr.helper.b;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRPreviewFragment;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRResultFragment;
import pdf.pdfreader.viewer.editor.free.feature.ocr.vm.OCRResultViewModel;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageLongPicPreviewActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImagePicPreviewActivity;
import pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity;
import pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenClearDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.RenameDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.b0;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.ReaderDebugViewModel;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugIAPConfigFragment;
import pdf.pdfreader.viewer.editor.free.ui.frag.SettingFragment;
import pdf.pdfreader.viewer.editor.free.ui.widget.DrawSignView;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.SignaturePad;
import pdf.pdfreader.viewer.editor.free.utils.event.OCREventCenter;
import pdf.pdfreader.viewer.editor.free.utils.event.UserGuideEvent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f30186a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f30187b;

    public /* synthetic */ g(Object obj, int i10) {
        this.f30186a = i10;
        this.f30187b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        int i11;
        String obj;
        byte b10;
        boolean v10;
        int i12 = this.f30186a;
        String str = null;
        tf.d dVar = null;
        boolean z10 = false;
        Object obj2 = this.f30187b;
        switch (i12) {
            case 0:
                InMobiNative ad2 = (InMobiNative) obj2;
                kotlin.jvm.internal.g.e(ad2, "$ad");
                ad2.reportAdClickAndOpenLandingPage();
                return;
            case 1:
                AIStatementDialog.H((AIStatementDialog) obj2);
                return;
            case 2:
                pdf.pdfreader.viewer.editor.free.feature.billing.dialog.a aVar = (pdf.pdfreader.viewer.editor.free.feature.billing.dialog.a) obj2;
                int i13 = pdf.pdfreader.viewer.editor.free.feature.billing.dialog.a.C;
                kotlin.jvm.internal.g.e(aVar, ea.a.p("R2gic1cw", "pquy49f5"));
                oo.a aVar2 = aVar.f23542t;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
                aVar.dismiss();
                return;
            case 3:
                BaseAISubscriptionActivity baseAISubscriptionActivity = (BaseAISubscriptionActivity) obj2;
                String str2 = BaseAISubscriptionActivity.U;
                kotlin.jvm.internal.g.e(baseAISubscriptionActivity, ea.a.p("R2gic1cw", "mSRJwtc5"));
                baseAISubscriptionActivity.r2();
                return;
            case 4:
                SubscriptionBlackFridayActivity subscriptionBlackFridayActivity = (SubscriptionBlackFridayActivity) obj2;
                int i14 = SubscriptionBlackFridayActivity.f24898a0;
                kotlin.jvm.internal.g.e(subscriptionBlackFridayActivity, ea.a.p("R2gic1cw", "ScUqhFBd"));
                subscriptionBlackFridayActivity.o2();
                return;
            case 5:
                SubscriptionDarkTestFActivity subscriptionDarkTestFActivity = (SubscriptionDarkTestFActivity) obj2;
                int i15 = SubscriptionDarkTestFActivity.f24900a0;
                kotlin.jvm.internal.g.e(subscriptionDarkTestFActivity, ea.a.p("O2hYc10w", "KRgPLEmU"));
                subscriptionDarkTestFActivity.j2().d(SubscriptionType.YEAR);
                return;
            case 6:
                SubscriptionDarkTestJActivity subscriptionDarkTestJActivity = (SubscriptionDarkTestJActivity) obj2;
                SubscriptionDarkTestJActivity.a aVar3 = SubscriptionDarkTestJActivity.f24905b0;
                kotlin.jvm.internal.g.e(subscriptionDarkTestJActivity, ea.a.p("R2gic1cw", "6074g4lJ"));
                subscriptionDarkTestJActivity.j2().d(SubscriptionType.MONTH);
                return;
            case 7:
                InquiryAfterGuideFragment inquiryAfterGuideFragment = (InquiryAfterGuideFragment) obj2;
                InquiryAfterGuideFragment.a aVar4 = InquiryAfterGuideFragment.f25030e0;
                kotlin.jvm.internal.g.e(inquiryAfterGuideFragment, ea.a.p("PWgscx0w", "7nIE9Jng"));
                if (inquiryAfterGuideFragment.u0().d()) {
                    tf.c cVar = UserGuideEvent.f28677a;
                    UserGuideEvent.d(ea.a.p("MWFRZTI=", "MIA6b9bK"));
                    Context context = view.getContext();
                    kotlin.jvm.internal.g.d(context, ea.a.p("JnQfYxZuQ2UidA==", "zKMQoLF1"));
                    boolean j10 = pdf.pdfreader.viewer.editor.free.utils.extension.c.j(context);
                    InquiryAfterGuidePageFragment e10 = inquiryAfterGuideFragment.u0().e();
                    g0 q5 = inquiryAfterGuideFragment.q();
                    q5.getClass();
                    androidx.fragment.app.a aVar5 = new androidx.fragment.app.a(q5);
                    if (j10) {
                        i10 = R.anim.slide_right_in;
                    } else {
                        i10 = R.anim.slide_left_in;
                    }
                    if (j10) {
                        i11 = R.anim.slide_left_out;
                    } else {
                        i11 = R.anim.slide_right_out;
                    }
                    aVar5.e(i10, i11);
                    VB vb2 = inquiryAfterGuideFragment.Y;
                    kotlin.jvm.internal.g.b(vb2);
                    aVar5.d(((t0) vb2).c.getId(), e10, null);
                    aVar5.i();
                    return;
                }
                tf.c cVar2 = UserGuideEvent.f28677a;
                UserGuideEvent.d(ea.a.p("P2FWZTE=", "FTiVi6nx"));
                ((UserGuideViewModel) inquiryAfterGuideFragment.f25032d0.getValue()).e();
                return;
            case 8:
                OCRPreviewFragment oCRPreviewFragment = (OCRPreviewFragment) obj2;
                OCRPreviewFragment.a aVar6 = OCRPreviewFragment.f25168p0;
                kotlin.jvm.internal.g.e(oCRPreviewFragment, ea.a.p("O2hYc10w", "UcvznwFc"));
                VB vb3 = oCRPreviewFragment.Y;
                kotlin.jvm.internal.g.b(vb3);
                int currentItem = ((v0) vb3).f1547s.getCurrentItem();
                if (currentItem != 0) {
                    VB vb4 = oCRPreviewFragment.Y;
                    kotlin.jvm.internal.g.b(vb4);
                    ((v0) vb4).f1547s.setCurrentItem(currentItem - 1);
                    return;
                }
                return;
            case 9:
                OCRResultFragment oCRResultFragment = (OCRResultFragment) obj2;
                OCRResultFragment.a aVar7 = OCRResultFragment.f25189r0;
                kotlin.jvm.internal.g.e(oCRResultFragment, ea.a.p("R2gic1cw", "S2i28Q54"));
                tf.c cVar3 = OCREventCenter.f28670a;
                String p10 = ea.a.p("KnhFchhjdA==", "KDneVxmb");
                HashSet<String> hashSet = OCREventCenter.c;
                if (!hashSet.contains(ea.a.p("IGNDchxzQmwuXzllGWULdGpjAmkmaw==", "zuF82IPL"))) {
                    Context c = r.c("IWM8ciRzFmw8XxVlWGU0dGdjPmkqaw==", "XGNNAcm7", hashSet);
                    tn.a.d(c, a0.a.i("UnA7bBpjA3Qbb1pDBm4iZTx0", "5nSBU0rj", c, "IGNy", "f3xkAF2L"), ea.a.p("AGMRcj9zI2w8XxVlWGU0dGdjPmkqaw==", "R1ocZVBH"), p10, false);
                }
                VB vb5 = oCRResultFragment.Y;
                kotlin.jvm.internal.g.b(vb5);
                Editable text = ((w0) vb5).f1590q.getText();
                if (text != null && (obj = text.toString()) != null) {
                    if (kotlin.text.k.n0(obj).toString().length() > 0) {
                        z10 = true;
                    }
                    if (z10) {
                        str = obj;
                    }
                    if (str != null) {
                        VB vb6 = oCRResultFragment.Y;
                        kotlin.jvm.internal.g.b(vb6);
                        String p11 = ea.a.p("UWklZBpuBS4AZUd1BXQTZC10ZmU-dA==", "qSL9ObuJ");
                        AppCompatEditText appCompatEditText = ((w0) vb6).f1590q;
                        kotlin.jvm.internal.g.d(appCompatEditText, p11);
                        pdf.pdfreader.viewer.editor.free.utils.extension.g.a(appCompatEditText);
                        OCRResultViewModel A0 = oCRResultFragment.A0();
                        Regex regex = pdf.pdfreader.viewer.editor.free.feature.ocr.helper.b.f25070a;
                        A0.f25234d.c(b.a.a(str), ea.a.p("XGM5Qh9vAWs0bFV0HWVu", "6GaRCYbL"));
                        return;
                    }
                    return;
                }
                return;
            case 10:
                PDFPageManagerActivity pDFPageManagerActivity = (PDFPageManagerActivity) obj2;
                PDFPageManagerActivity.a aVar8 = PDFPageManagerActivity.H0;
                kotlin.jvm.internal.g.e(pDFPageManagerActivity, ea.a.p("O2hYc10w", "Wvsl6hGL"));
                pDFPageManagerActivity.j2();
                return;
            case 11:
                pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.dialog.b bVar = (pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.dialog.b) obj2;
                int i16 = pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.dialog.b.f25366r;
                kotlin.jvm.internal.g.e(bVar, ea.a.p("R2gic1cw", "imtE20Eh"));
                bVar.dismiss();
                return;
            case 12:
                Pdf2ImageLongPicPreviewActivity pdf2ImageLongPicPreviewActivity = (Pdf2ImageLongPicPreviewActivity) obj2;
                int i17 = Pdf2ImageLongPicPreviewActivity.f25506w0;
                kotlin.jvm.internal.g.e(pdf2ImageLongPicPreviewActivity, ea.a.p("TGgYcxcw", "fz8q3RXb"));
                pdf2ImageLongPicPreviewActivity.c3(true);
                return;
            case 13:
                Pdf2ImagePicPreviewActivity pdf2ImagePicPreviewActivity = (Pdf2ImagePicPreviewActivity) obj2;
                int i18 = Pdf2ImagePicPreviewActivity.I0;
                kotlin.jvm.internal.g.e(pdf2ImagePicPreviewActivity, ea.a.p("AWgDc2ww", "4CujHYXT"));
                pdf2ImagePicPreviewActivity.g3(true);
                return;
            case 14:
                pdf.pdfreader.viewer.editor.free.feature.scan.dialog.f fVar = (pdf.pdfreader.viewer.editor.free.feature.scan.dialog.f) obj2;
                int i19 = pdf.pdfreader.viewer.editor.free.feature.scan.dialog.f.D;
                kotlin.jvm.internal.g.e(fVar, ea.a.p("R2gic1cw", "KEfezaYK"));
                fVar.cancel();
                return;
            case 15:
                OfficeReaderActivity officeReaderActivity = (OfficeReaderActivity) obj2;
                String str3 = OfficeReaderActivity.D2;
                kotlin.jvm.internal.g.e(officeReaderActivity, ea.a.p("O2hYc10w", "xmoUYDrX"));
                kotlin.jvm.internal.g.e(view, ea.a.p("dg==", "FcDTg1jS"));
                if (view.getId() == R.id.reflow_continue_use_yes) {
                    officeReaderActivity.p2();
                    officeReaderActivity.L2();
                    tn.a.d(officeReaderActivity, ea.a.p("Gmlcdw==", "wwl9TPjD"), ea.a.p("OWlUdyZyUmY2bz1hBms3b0VlAF8mbAxjaw==", "lvjDXc2X"), ea.a.p("RG85ZA==", "awhUfzwx"), false);
                    return;
                }
                officeReaderActivity.p3(false);
                officeReaderActivity.L2();
                tn.a.d(officeReaderActivity, ea.a.p("B2kvdw==", "KYqJErf6"), ea.a.p("RWkudyxyB2Yeb0NhGmsJbitfUWwvY2s=", "WR9O090O"), ea.a.p("RG85ZA==", "1QnyTK5p"), false);
                return;
            case 16:
                Word2PDFConvertActivity word2PDFConvertActivity = (Word2PDFConvertActivity) obj2;
                Word2PDFConvertActivity.a aVar9 = Word2PDFConvertActivity.f26020p1;
                kotlin.jvm.internal.g.e(word2PDFConvertActivity, ea.a.p("R2gic1cw", "LEShbEIS"));
                word2PDFConvertActivity.onBackPressed();
                return;
            case 17:
                ReaderImg2PDFChooseActivity.a aVar10 = ReaderImg2PDFChooseActivity.M0;
                ((ReaderImg2PDFChooseActivity) obj2).onClick(view);
                return;
            case 18:
                pdf.pdfreader.viewer.editor.free.ui.dialog.g gVar = (pdf.pdfreader.viewer.editor.free.ui.dialog.g) obj2;
                int i20 = pdf.pdfreader.viewer.editor.free.ui.dialog.g.f27566g;
                kotlin.jvm.internal.g.e(gVar, ea.a.p("O2hYc10w", "Fcocrei3"));
                cg.a<tf.d> aVar11 = gVar.f27571f;
                if (aVar11 != null) {
                    aVar11.invoke();
                }
                gVar.cancel();
                return;
            case 19:
                b0 b0Var = (b0) obj2;
                int i21 = b0.B;
                kotlin.jvm.internal.g.e(b0Var, ea.a.p("R2gic1cw", "06kQBAkO"));
                String str4 = b0Var.f27501y;
                if (str4.length() > 0) {
                    b10 = 1;
                } else {
                    b10 = 0;
                }
                if (b10 != 0 && (!kotlin.text.j.H(str4))) {
                    z10 = true;
                }
                if (!z10) {
                    str4 = null;
                }
                cg.a<tf.d> aVar12 = b0Var.f27502z;
                if (str4 != null) {
                    try {
                        view.getContext().startActivity(new Intent(ea.a.p("Lm5VchZpUy4zbj5lG3RGYVZ0B28rLjNJAFc=", "1WrtEEyt"), Uri.parse(str4)));
                    } catch (Exception unused) {
                        aVar12.invoke();
                    }
                    dVar = tf.d.f30009a;
                }
                if (dVar == null) {
                    aVar12.invoke();
                }
                b0Var.dismiss();
                return;
            case 20:
                PdfReaderOpenClearDialog pdfReaderOpenClearDialog = (PdfReaderOpenClearDialog) obj2;
                int i22 = PdfReaderOpenClearDialog.M;
                kotlin.jvm.internal.g.e(pdfReaderOpenClearDialog, ea.a.p("R2gic1cw", "fu7s5hOH"));
                if (!pdfReaderOpenClearDialog.H) {
                    pdfReaderOpenClearDialog.H = true;
                    tn.a.d(pdfReaderOpenClearDialog.getContext(), ea.a.p("KHVYZGU=", "NpmohXDz"), ea.a.p("NWw1YTNfX2E8ZRRfV2w-Y2s=", "6qVPA3gH"), pdfReaderOpenClearDialog.I(), false);
                }
                pdfReaderOpenClearDialog.dismiss();
                return;
            case 21:
                RenameDialog renameDialog = (RenameDialog) obj2;
                int i23 = RenameDialog.f27470y;
                kotlin.jvm.internal.g.e(renameDialog, ea.a.p("R2gic1cw", "l0m5UBwe"));
                AppCompatEditText appCompatEditText2 = renameDialog.f27471n;
                if (appCompatEditText2 != null) {
                    appCompatEditText2.setText("");
                }
                view.setVisibility(4);
                return;
            case 22:
                oo.f fVar2 = (oo.f) obj2;
                int i24 = oo.f.f23527m;
                kotlin.jvm.internal.g.e(fVar2, ea.a.p("R2gic1cw", "yl30HSoc"));
                Boolean bool = fVar2.f23534j;
                if (bool != null) {
                    v10 = bool.booleanValue();
                } else {
                    v10 = fVar2.v();
                }
                if (v10) {
                    fVar2.dismiss();
                    return;
                }
                return;
            case 23:
                DebugIAPConfigFragment debugIAPConfigFragment = (DebugIAPConfigFragment) obj2;
                int i25 = DebugIAPConfigFragment.f27857e0;
                kotlin.jvm.internal.g.e(debugIAPConfigFragment, ea.a.p("R2gic1cw", "0uioOnAj"));
                ((kotlinx.coroutines.flow.r) ((ReaderDebugViewModel) debugIAPConfigFragment.f27858d0.getValue()).f27850d.getValue()).setValue(Boolean.TRUE);
                return;
            case 24:
                SettingFragment settingFragment = (SettingFragment) obj2;
                SettingFragment.a aVar13 = SettingFragment.f27957u0;
                kotlin.jvm.internal.g.e(settingFragment, ea.a.p("DGhac2cw", "H8x3CilE"));
                Context r4 = settingFragment.r();
                Intent intent = new Intent(ea.a.p("Um4vchxpBi4bbkBlB3R4YSd0W28oLhVJEVc=", "TYzdcTs0"), Uri.parse(ea.a.p("J3RFcAo6GC8uLidlWkEEbGVEKFIgYQFlcg==", "nYEWyXko")));
                intent.putExtra(ea.a.p("I25dcjppIC4hbhJlWnR5ZUB0IGFnVHNYVA==", "Y9B9UD9c"), ea.a.p("PG8Fbg==", "9JVlXMc3"));
                intent.setPackage(ea.a.p("XHIsLgdlDmUVclVtR20zczdlXGcjcg==", "Jaa1SddY"));
                intent.putExtra(ea.a.p("O2VdZR5yVm0=", "sOKP61fR"), ea.a.p("DG8EbiFoKXRnQQpsZEQRUl1hNmVy", "3nfmBHUw"));
                intent.addFlags(268435456);
                try {
                    r4.startActivity(intent);
                } catch (Exception unused2) {
                    intent.setPackage(ea.a.p("XHIsLgdoF24WZUZkBmd4YyxhXmwjZzFhbQ==", "3k5jCZw8"));
                    try {
                        r4.startActivity(intent);
                    } catch (Exception unused3) {
                        String p12 = ea.a.p("IHJWLg1lW2U9cittW20Nc0ZlAGcgcg==", "MQnsfCgZ");
                        kotlin.jvm.internal.g.e(r4, "<this>");
                        String p13 = ea.a.p("LG9cLhhuU3I1aS4uA2UGZFxuZw==", "BUhGOtcW");
                        String concat = "https://play.google.com/store/apps/details?id=".concat(p12);
                        try {
                            Intent intent2 = new Intent(ea.a.p("EW4qchZpLS4hbhJlWnR5YVt0O28nLmBJMVc=", "7WpNyIrR"), Uri.parse(concat));
                            intent2.setPackage(p13);
                            r4.startActivity(intent2);
                        } catch (Exception e11) {
                            e11.printStackTrace();
                            try {
                                Intent intent3 = new Intent(ea.a.p("FW4schVpAi4hbhJlWnR5YVt0O28nLmBJMVc=", "nbtHzfNJ"), Uri.parse(concat));
                                intent3.setFlags(268435456);
                                r4.startActivity(intent3);
                            } catch (Exception e12) {
                                e12.printStackTrace();
                            }
                        }
                    }
                }
                tn.a.b(settingFragment.r(), ea.a.p("PGVFdBBuZw==", "AAmh4Y1b"), ea.a.p("PGVFXw1lW185bCNjaw==", "KVLEy6nJ"));
                return;
            default:
                DrawSignView drawSignView = (DrawSignView) obj2;
                int i26 = DrawSignView.f28182f;
                tn.a.b(drawSignView.getContext(), ea.a.p("PGlWbg==", "WuZkRKdK"), ea.a.p("PGlWbiZkRWEtXzhlA28LYUFpAW4aYwlpDms=", "fM2Gmrlo"));
                SignaturePad signaturePad = drawSignView.f28183a.f1047p;
                ArrayList arrayList = signaturePad.f28479j;
                if (!arrayList.isEmpty()) {
                    SignaturePad.c cVar4 = (SignaturePad.c) arrayList.get(arrayList.size() - 1);
                    signaturePad.f28480k.add(cVar4);
                    arrayList.remove(cVar4);
                    if (!arrayList.isEmpty()) {
                        SignaturePad.c cVar5 = (SignaturePad.c) arrayList.get(arrayList.size() - 1);
                        if (cVar5 instanceof SignaturePad.d) {
                            SignaturePad.d dVar2 = (SignaturePad.d) cVar5;
                            signaturePad.c(dVar2.f28487b, dVar2.f28486a);
                        } else if (cVar5 instanceof SignaturePad.e) {
                            SignaturePad.e eVar = (SignaturePad.e) cVar5;
                            signaturePad.c(eVar.f28489b, eVar.c);
                        }
                    }
                    signaturePad.invalidate();
                    SignaturePad.f fVar3 = signaturePad.f28478i;
                    if (fVar3 != null) {
                        ((DrawSignView) fVar3).g();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
