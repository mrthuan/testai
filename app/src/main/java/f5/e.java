package f5;

import am.p0;
import am.v0;
import am.x0;
import an.a;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.activity.r;
import androidx.activity.s;
import androidx.lifecycle.w;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchView;
import com.inmobi.media.C1891z6;
import h5.m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import kotlin.Result;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.billing.SubscriptionType;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseAISubscriptionActivity;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionBlackFridayActivity;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionDarkTestFActivity;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionDarkTestJActivity;
import pdf.pdfreader.viewer.editor.free.feature.ocr.data.OCRBlockFlatten;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRSelectPDFPageActivity;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRPreviewFragment;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRResultFragment;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRSelectTextFragment;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageBigPicPreviewActivity;
import pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.ImageAdjustPayload;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ClearDefaultReaderStep2Activity;
import pdf.pdfreader.viewer.editor.free.ui.act.LanguageChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImgPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.ReaderDebugActivity;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugIAPConfigFragment;
import pdf.pdfreader.viewer.editor.free.ui.frag.SplitPreviewFragment;
import pdf.pdfreader.viewer.editor.free.utils.event.OCREventCenter;
import pdf.pdfreader.viewer.editor.free.utils.event.ScanEventCenter;
import qn.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17100a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f17101b;

    public /* synthetic */ e(Object obj, int i10) {
        this.f17100a = i10;
        this.f17101b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ArrayList arrayList;
        Object m13constructorimpl;
        int i10 = this.f17100a;
        Object obj = this.f17101b;
        switch (i10) {
            case 0:
                i this$0 = (i) obj;
                kotlin.jvm.internal.g.e(this$0, "this$0");
                ea.a.f16518b = true;
                m mVar = this$0.f17107r;
                if (mVar != null) {
                    mVar.f18044j = kotlin.jvm.internal.g.a(this$0.G, "A");
                }
                this$0.f17112w.getClass();
                h5.b.j(this$0.f17106q, mVar);
                c5.a b10 = c5.a.b();
                b10.a();
                d5.b b11 = b10.c.f5583e.b();
                if (b11 != null) {
                    b11.b(this$0);
                }
                this$0.dismiss();
                return;
            case 1:
                SearchView searchView = (SearchView) obj;
                if (!searchView.f12826y.equals(SearchView.TransitionState.HIDDEN) && !searchView.f12826y.equals(SearchView.TransitionState.HIDING)) {
                    com.google.android.material.search.e eVar = searchView.f12816o;
                    SearchBar searchBar = eVar.f12845m;
                    SearchView searchView2 = eVar.f12834a;
                    if (searchBar != null) {
                        if (searchView2.c()) {
                            searchView2.b();
                        }
                        AnimatorSet c = eVar.c(false);
                        c.addListener(new com.google.android.material.search.b(eVar));
                        c.start();
                    } else {
                        if (searchView2.c()) {
                            searchView2.b();
                        }
                        AnimatorSet g10 = eVar.g(false);
                        g10.addListener(new com.google.android.material.search.d(eVar));
                        g10.start();
                    }
                    searchView.setModalForAccessibility(false);
                    return;
                }
                return;
            case 2:
                C1891z6.a((C1891z6) obj, view);
                return;
            case 3:
                BaseAISubscriptionActivity baseAISubscriptionActivity = (BaseAISubscriptionActivity) obj;
                String str = BaseAISubscriptionActivity.U;
                kotlin.jvm.internal.g.e(baseAISubscriptionActivity, ea.a.p("HGgmc1Ew", "CQhOu7uw"));
                baseAISubscriptionActivity.j2().d(SubscriptionType.MONTH);
                return;
            case 4:
                SubscriptionBlackFridayActivity subscriptionBlackFridayActivity = (SubscriptionBlackFridayActivity) obj;
                int i11 = SubscriptionBlackFridayActivity.f24898a0;
                kotlin.jvm.internal.g.e(subscriptionBlackFridayActivity, ea.a.p("R2gic1cw", "H2InUR5d"));
                subscriptionBlackFridayActivity.r2();
                return;
            case 5:
                SubscriptionDarkTestFActivity subscriptionDarkTestFActivity = (SubscriptionDarkTestFActivity) obj;
                int i12 = SubscriptionDarkTestFActivity.f24900a0;
                kotlin.jvm.internal.g.e(subscriptionDarkTestFActivity, ea.a.p("R2gic1cw", "tmNKSu4K"));
                subscriptionDarkTestFActivity.o2();
                return;
            case 6:
                SubscriptionDarkTestJActivity subscriptionDarkTestJActivity = (SubscriptionDarkTestJActivity) obj;
                SubscriptionDarkTestJActivity.a aVar = SubscriptionDarkTestJActivity.f24905b0;
                kotlin.jvm.internal.g.e(subscriptionDarkTestJActivity, ea.a.p("R2gic1cw", "taBSeWq7"));
                subscriptionDarkTestJActivity.n2();
                return;
            case 7:
                OCRSelectPDFPageActivity oCRSelectPDFPageActivity = (OCRSelectPDFPageActivity) obj;
                OCRSelectPDFPageActivity.a aVar2 = OCRSelectPDFPageActivity.P;
                kotlin.jvm.internal.g.e(oCRSelectPDFPageActivity, ea.a.p("R2gic1cw", "u0IqOcG4"));
                Context a10 = OCREventCenter.a();
                OCREventCenter.b(a10, a0.a.i("UnA7bBpjA3Qbb1pDBm4iZTx0", "sK8eEQSk", a10, "IGNy", "nTiFmPxJ"), ea.a.p("XGM5cxZsB2MGX1VsBV81bC1jaw==", "c1xKphl0"));
                if (oCRSelectPDFPageActivity.k2()) {
                    oCRSelectPDFPageActivity.h2().f1051b.setChecked(false);
                    oCRSelectPDFPageActivity.j2().g();
                    return;
                }
                oCRSelectPDFPageActivity.h2().f1051b.setChecked(true);
                oCRSelectPDFPageActivity.j2().f(oCRSelectPDFPageActivity.K);
                return;
            case 8:
                OCRPreviewFragment oCRPreviewFragment = (OCRPreviewFragment) obj;
                OCRPreviewFragment.a aVar3 = OCRPreviewFragment.f25168p0;
                kotlin.jvm.internal.g.e(oCRPreviewFragment, ea.a.p("R2gic1cw", "kISfnVGT"));
                tf.c cVar = ScanEventCenter.f28674a;
                ScanEventCenter.f(ea.a.p("IGNy", "18hP23YQ"));
                pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.a x02 = oCRPreviewFragment.x0();
                VB vb2 = oCRPreviewFragment.Y;
                kotlin.jvm.internal.g.b(vb2);
                int currentItem = ((v0) vb2).f1547s.getCurrentItem();
                if (currentItem >= 0) {
                    if (currentItem < x02.h().size()) {
                        um.a aVar4 = x02.h().get(currentItem);
                        ul.c cVar2 = aVar4.f30437f;
                        int i13 = cVar2.f30426b + 90;
                        cVar2.f30426b = i13;
                        if (i13 % 360 == 0) {
                            cVar2.f30426b = 0;
                        }
                        aVar4.f30438g = null;
                        aVar4.f30439h = null;
                        aVar4.f30436e = null;
                        x02.notifyItemChanged(currentItem, ImageAdjustPayload.ROTATE_CLOCK_WISE);
                        return;
                    }
                    return;
                }
                x02.getClass();
                return;
            case 9:
                OCRResultFragment oCRResultFragment = (OCRResultFragment) obj;
                OCRResultFragment.a aVar5 = OCRResultFragment.f25189r0;
                kotlin.jvm.internal.g.e(oCRResultFragment, ea.a.p("R2gic1cw", "RbAxXuK5"));
                oCRResultFragment.A0().j();
                return;
            case 10:
                OCRSelectTextFragment oCRSelectTextFragment = (OCRSelectTextFragment) obj;
                OCRSelectTextFragment.a aVar6 = OCRSelectTextFragment.f25218g0;
                kotlin.jvm.internal.g.e(oCRSelectTextFragment, ea.a.p("R2gic1cw", "ZmIe2vea"));
                VB vb3 = oCRSelectTextFragment.Y;
                kotlin.jvm.internal.g.b(vb3);
                if (kotlin.jvm.internal.g.a(((x0) vb3).f1638j.getText().toString(), oCRSelectTextFragment.v().getString(R.string.arg_res_0x7f1303e9))) {
                    tf.c cVar3 = OCREventCenter.f28670a;
                    String p10 = ea.a.p("P2UgZVt0", "RvLL8D9m");
                    HashSet<String> hashSet = OCREventCenter.c;
                    if (!hashSet.contains(ea.a.p("XGM5chZzF2wGX0dlBWU1dCVsXl8lbCpjaw==", "014ZWqlw"))) {
                        Context c10 = r.c("XGM5chZzF2wGX0dlBWU1dCVsXl8lbCpjaw==", "AcAqCaOB", hashSet);
                        tn.a.d(c10, a0.a.i("LnBBbBBjVnQzbyRDGm4cZU10", "8JZim86j", c10, "IGNy", "gv2XM4rF"), ea.a.p("AmMHclNzQmw8XxVlWGU0dFlsPl8qbF9jaw==", "nTmu674R"), p10, false);
                    }
                } else {
                    tf.c cVar4 = OCREventCenter.f28670a;
                    String p11 = ea.a.p("QGUnZRB0", "SvfGTnmc");
                    HashSet<String> hashSet2 = OCREventCenter.c;
                    if (!hashSet2.contains(ea.a.p("IGNDchxzQmwuXy5lBmUEZVZ0D2wpXwZsE2Nr", "Gs2RzV3N"))) {
                        Context c11 = r.c("XGM5chZzF2wGX1BlGmU6ZSd0U2wqXyBsLWNr", "DaTnZkUy", hashSet2);
                        tn.a.d(c11, a0.a.i("LnBBbBBjVnQzbyRDGm4cZU10", "LjAET1YP", c11, "IGNy", "JD1rlNEL"), ea.a.p("IGNDchxzQmwuXy5lBmUEZVZ0D2wpXwZsEWNr", "bLumxoBk"), p11, false);
                    }
                }
                for (OCRBlockFlatten oCRBlockFlatten : oCRSelectTextFragment.u0()) {
                    oCRBlockFlatten.setSelected(oCRSelectTextFragment.f25222f0);
                }
                VB vb4 = oCRSelectTextFragment.Y;
                kotlin.jvm.internal.g.b(vb4);
                RecyclerView.Adapter adapter = ((x0) vb4).f1635g.getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
                oCRSelectTextFragment.v0();
                return;
            case 11:
                PDFPageManagerActivity pDFPageManagerActivity = (PDFPageManagerActivity) obj;
                PDFPageManagerActivity.a aVar7 = PDFPageManagerActivity.H0;
                kotlin.jvm.internal.g.e(pDFPageManagerActivity, ea.a.p("PGg_cxYw", "N9HV2Tdg"));
                if (pDFPageManagerActivity.R) {
                    if (pDFPageManagerActivity.w2()) {
                        pDFPageManagerActivity.o2().f1263b.setChecked(false);
                        pDFPageManagerActivity.s2().f();
                        return;
                    }
                    pDFPageManagerActivity.o2().f1263b.setChecked(true);
                    an.b s22 = pDFPageManagerActivity.s2();
                    ArrayList<bn.a> images = pDFPageManagerActivity.q2().f30865e;
                    s22.getClass();
                    kotlin.jvm.internal.g.e(images, "images");
                    w<ArrayList<bn.a>> wVar = an.a.f1699a;
                    ArrayList<bn.a> a11 = a.C0003a.a();
                    int size = a11.size();
                    Iterator<bn.a> it = images.iterator();
                    while (it.hasNext()) {
                        bn.a next = it.next();
                        if (!next.f5492f) {
                            next.f5492f = true;
                            size++;
                            next.f5493g = size;
                            a11.add(next);
                        }
                    }
                    an.a.f1700b.j(a11);
                    return;
                }
                return;
            case 12:
                Pdf2ImageBigPicPreviewActivity pdf2ImageBigPicPreviewActivity = (Pdf2ImageBigPicPreviewActivity) obj;
                Pdf2ImageBigPicPreviewActivity.a aVar8 = Pdf2ImageBigPicPreviewActivity.f25491w0;
                kotlin.jvm.internal.g.e(pdf2ImageBigPicPreviewActivity, ea.a.p("R2hbc2Yw", "gm32BH7x"));
                pdf2ImageBigPicPreviewActivity.onBackPressed();
                return;
            case 13:
                pdf.pdfreader.viewer.editor.free.feature.scan.dialog.r rVar = (pdf.pdfreader.viewer.editor.free.feature.scan.dialog.r) obj;
                int i14 = pdf.pdfreader.viewer.editor.free.feature.scan.dialog.r.F;
                kotlin.jvm.internal.g.e(rVar, ea.a.p("O2hYc10w", "cBuzm6JI"));
                rVar.D = true;
                rVar.cancel();
                return;
            case 14:
                ImageAdjustActivity imageAdjustActivity = (ImageAdjustActivity) obj;
                ImageAdjustActivity.a aVar9 = ImageAdjustActivity.f25741u0;
                kotlin.jvm.internal.g.e(imageAdjustActivity, ea.a.p("TWgzc2Aw", "zl9ZDfQy"));
                tf.c cVar5 = ScanEventCenter.f28674a;
                String d22 = imageAdjustActivity.d2();
                HashSet<String> hashSet3 = ScanEventCenter.f28675b;
                if (!hashSet3.contains(ea.a.p("Q2EsZRJkCHUBdGtmAGwiZTZfUWwvY2s=", "k95ro5xg"))) {
                    hashSet3.add(ea.a.p("P2FWZRhkXXUpdBVmHGwcZUdfDWwsY2s=", "UTBPIwCt"));
                    tn.a.d(ScanEventCenter.a(), ea.a.p("P2FWZSZhU2ovc3Q=", "Z6VFPNIj"), ea.a.p("IGEwZVNkLHU7dDlmXWwjZUpfMWwgY2s=", "kqPW2FpL"), d22, false);
                }
                imageAdjustActivity.E2();
                if (imageAdjustActivity.K != null) {
                    imageAdjustActivity.C2().g();
                    return;
                }
                try {
                    m13constructorimpl = Result.m13constructorimpl(imageAdjustActivity.y2().f681l.inflate());
                } catch (Throwable th2) {
                    m13constructorimpl = Result.m13constructorimpl(s.v(th2));
                }
                Result.m12boximpl(m13constructorimpl);
                return;
            case 15:
                qn.a aVar10 = (qn.a) obj;
                int i15 = qn.a.f29388q0;
                kotlin.jvm.internal.g.e(aVar10, ea.a.p("R2gic1cw", "F6l97cXS"));
                a.InterfaceC0367a interfaceC0367a = aVar10.f29390p0;
                if (interfaceC0367a != null) {
                    interfaceC0367a.b();
                }
                try {
                    aVar10.p0(true, false);
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            case 16:
                ReaderPreviewActivity readerPreviewActivity = (ReaderPreviewActivity) obj;
                ExecutorService executorService = ReaderPreviewActivity.U5;
                readerPreviewActivity.o3();
                ViewGroup viewGroup = readerPreviewActivity.X3;
                if (viewGroup != null) {
                    viewGroup.performClick();
                    return;
                }
                return;
            case 17:
                ClearDefaultReaderStep2Activity clearDefaultReaderStep2Activity = (ClearDefaultReaderStep2Activity) obj;
                ClearDefaultReaderStep2Activity.a aVar11 = ClearDefaultReaderStep2Activity.C;
                kotlin.jvm.internal.g.e(clearDefaultReaderStep2Activity, ea.a.p("R2gic1cw", "CbEio000"));
                clearDefaultReaderStep2Activity.finish();
                return;
            case 18:
                LanguageChooseActivity languageChooseActivity = (LanguageChooseActivity) obj;
                int i16 = LanguageChooseActivity.H;
                kotlin.jvm.internal.g.e(languageChooseActivity, ea.a.p("R2gic1cw", "KI0KgnKr"));
                languageChooseActivity.a2();
                return;
            case 19:
                RecentAddedActivity recentAddedActivity = (RecentAddedActivity) obj;
                RecentAddedActivity.a aVar12 = RecentAddedActivity.f26850l0;
                kotlin.jvm.internal.g.e(recentAddedActivity, ea.a.p("R2gic1cw", "AupcaIAQ"));
                recentAddedActivity.m2(true);
                recentAddedActivity.q2().Z0();
                return;
            case 20:
                ReaderImg2PDFChooseActivity.a aVar13 = ReaderImg2PDFChooseActivity.M0;
                ((ReaderImg2PDFChooseActivity) obj).onClick(view);
                return;
            case 21:
                String str2 = ReaderImgPreviewActivity.f27400d0;
                ((ReaderImgPreviewActivity) obj).onClick(view);
                return;
            case 22:
                oo.d dVar = (oo.d) obj;
                int i17 = oo.d.f23521r;
                kotlin.jvm.internal.g.e(dVar, ea.a.p("EGgfc2Aw", "CydvDHsu"));
                oo.a aVar14 = dVar.f23532h;
                if (aVar14 != null) {
                    aVar14.cancel();
                }
                dVar.dismiss();
                return;
            case 23:
                ReaderDebugActivity readerDebugActivity = (ReaderDebugActivity) obj;
                boolean z10 = ReaderDebugActivity.f27826e;
                kotlin.jvm.internal.g.e(readerDebugActivity, ea.a.p("R2gic1cw", "IIq51caY"));
                readerDebugActivity.finish();
                return;
            case 24:
                DebugAppConfigFragment.u0((DebugAppConfigFragment) obj);
                return;
            case 25:
                DebugIAPConfigFragment debugIAPConfigFragment = (DebugIAPConfigFragment) obj;
                int i18 = DebugIAPConfigFragment.f27857e0;
                kotlin.jvm.internal.g.e(debugIAPConfigFragment, ea.a.p("O2hYc10w", "ZlWDYsAm"));
                try {
                    VB vb5 = debugIAPConfigFragment.Y;
                    kotlin.jvm.internal.g.b(vb5);
                    int parseInt = Integer.parseInt(((p0) vb5).f1298m.getText().toString());
                    pdf.pdfreader.viewer.editor.free.utils.c.f28558a.getClass();
                    pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putInt(ea.a.p("V2UpdRRfEXAeYUdoNnM-bzNfRmkrZRwxAjg=", "7a8PHHEv"), parseInt).apply();
                    Toast.makeText(debugIAPConfigFragment.r(), ea.a.p("17_l5ue5hIji5b6f", "lxznZ5Bc"), 0).show();
                    return;
                } catch (Exception unused) {
                    pdf.pdfreader.viewer.editor.free.utils.c.f28558a.getClass();
                    pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putInt(ea.a.p("V2UpdRRfEXAeYUdoNnM-bzNfRmkrZRwxAjg=", "7a8PHHEv"), 3).apply();
                    return;
                }
            default:
                SplitPreviewFragment splitPreviewFragment = (SplitPreviewFragment) obj;
                SplitPreviewFragment.a aVar15 = SplitPreviewFragment.f27979l0;
                kotlin.jvm.internal.g.e(splitPreviewFragment, ea.a.p("I2gxc0ww", "AHWXhlnq"));
                pdf.pdfreader.viewer.editor.free.ui.adapter.w wVar2 = splitPreviewFragment.f27984g0;
                if (wVar2 != null && (arrayList = wVar2.f27315g) != null) {
                    splitPreviewFragment.q0(1, arrayList);
                    return;
                }
                return;
        }
    }
}
