package u4;

import am.o0;
import am.t0;
import am.v0;
import am.w0;
import android.content.Context;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.g0;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchView;
import com.inmobi.ads.InMobiNative;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlinx.coroutines.flow.StateFlowImpl;
import lib.zj.pdfeditor.PageView;
import lib.zj.pdfeditor.model.AnalyticsEvent;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.billing.SubscriptionType;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIQuickTagView;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseAISubscriptionActivity;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionBlackFridayActivity;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionDarkTestFActivity;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionDarkTestJActivity;
import pdf.pdfreader.viewer.editor.free.feature.guide.data.InquiryAfterGuideType;
import pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.inquiry.InquiryAfterGuideFragment;
import pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.inquiry.InquiryAfterGuidePageFragment;
import pdf.pdfreader.viewer.editor.free.feature.guide.vm.InquiryAfterGuideViewModel;
import pdf.pdfreader.viewer.editor.free.feature.guide.vm.UserGuideViewModel;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRPreviewFragment;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRResultFragment;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImageLongPicPreviewActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImagePicPreviewActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.PreviewPageManageGuideView;
import pdf.pdfreader.viewer.editor.free.feature.scan.dialog.ChooseCropTypeDialog;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFConvertActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.f0;
import pdf.pdfreader.viewer.editor.free.ui.dialog.i3;
import pdf.pdfreader.viewer.editor.free.ui.dialog.t2;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment;
import pdf.pdfreader.viewer.editor.free.ui.frag.SettingFragment;
import pdf.pdfreader.viewer.editor.free.utils.e1;
import pdf.pdfreader.viewer.editor.free.utils.event.OCREventCenter;
import pdf.pdfreader.viewer.editor.free.utils.event.UserGuideEvent;
import w8.t;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f30201a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f30202b;

    public /* synthetic */ j(Object obj, int i10) {
        this.f30201a = i10;
        this.f30202b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.google.android.material.search.SearchView$TransitionState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v47 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ?? r22;
        ?? r4;
        ?? r42;
        ?? r13;
        ?? r52;
        int i10;
        int i11;
        ?? r53;
        ?? r43;
        String obj;
        PreviewPageManageGuideView previewPageManageGuideView;
        int i12 = this.f30201a;
        String str = null;
        Editable editable = null;
        boolean z10 = false;
        Object obj2 = this.f30202b;
        switch (i12) {
            case 0:
                InMobiNative ad2 = (InMobiNative) obj2;
                kotlin.jvm.internal.g.e(ad2, "$ad");
                ad2.reportAdClickAndOpenLandingPage();
                return;
            case 1:
                SearchView searchView = (SearchView) obj2;
                if (!searchView.f12826y.equals(SearchView.TransitionState.SHOWN)) {
                    ?? r02 = searchView.f12826y;
                    SearchView.TransitionState transitionState = SearchView.TransitionState.SHOWING;
                    if (!r02.equals(transitionState)) {
                        com.google.android.material.search.e eVar = searchView.f12816o;
                        SearchBar searchBar = eVar.f12845m;
                        ClippableRoundedCornerLayout clippableRoundedCornerLayout = eVar.c;
                        SearchView searchView2 = eVar.f12834a;
                        if (searchBar != null) {
                            if (searchView2.c()) {
                                searchView2.d();
                            }
                            searchView2.setTransitionState(transitionState);
                            Toolbar toolbar = eVar.f12839g;
                            Menu menu = toolbar.getMenu();
                            if (menu != null) {
                                menu.clear();
                            }
                            if (eVar.f12845m.getMenuResId() != -1 && searchView2.f12822u) {
                                toolbar.k(eVar.f12845m.getMenuResId());
                                ActionMenuView a10 = t.a(toolbar);
                                if (a10 != null) {
                                    for (int i13 = 0; i13 < a10.getChildCount(); i13++) {
                                        View childAt = a10.getChildAt(i13);
                                        childAt.setClickable(false);
                                        childAt.setFocusable(false);
                                        childAt.setFocusableInTouchMode(false);
                                    }
                                }
                                toolbar.setVisibility(0);
                            } else {
                                toolbar.setVisibility(8);
                            }
                            CharSequence text = eVar.f12845m.getText();
                            EditText editText = eVar.f12841i;
                            editText.setText(text);
                            editText.setSelection(editText.getText().length());
                            clippableRoundedCornerLayout.setVisibility(4);
                            clippableRoundedCornerLayout.post(new androidx.activity.k(eVar, 6));
                        } else {
                            if (searchView2.c()) {
                                searchView2.postDelayed(new androidx.activity.b(searchView2, 8), 150L);
                            }
                            clippableRoundedCornerLayout.setVisibility(4);
                            clippableRoundedCornerLayout.post(new b7.g(eVar, 2));
                        }
                        searchView.setModalForAccessibility(true);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                PageView pageView = PageView.this;
                pageView.L0();
                PageView.A0(pageView, pageView.getSelectText());
                PageView.G0(pageView, AnalyticsEvent.COPY_CLICK);
                pageView.f21309w = null;
                pageView.T = null;
                pageView.b();
                pageView.q1();
                return;
            case 3:
                AIQuickTagView aIQuickTagView = (AIQuickTagView) obj2;
                int i14 = AIQuickTagView.f24742g;
                kotlin.jvm.internal.g.e(aIQuickTagView, ea.a.p("Bmgkc28w", "BErMK9rF"));
                aIQuickTagView.d();
                return;
            case 4:
                pdf.pdfreader.viewer.editor.free.feature.billing.dialog.a aVar = (pdf.pdfreader.viewer.editor.free.feature.billing.dialog.a) obj2;
                int i15 = pdf.pdfreader.viewer.editor.free.feature.billing.dialog.a.C;
                kotlin.jvm.internal.g.e(aVar, ea.a.p("R2gic1cw", "02jlCUbB"));
                oo.a aVar2 = aVar.f23542t;
                if (aVar2 != null) {
                    aVar2.a();
                }
                aVar.dismiss();
                return;
            case 5:
                BaseAISubscriptionActivity baseAISubscriptionActivity = (BaseAISubscriptionActivity) obj2;
                String str2 = BaseAISubscriptionActivity.U;
                kotlin.jvm.internal.g.e(baseAISubscriptionActivity, ea.a.p("O2gjc0Iw", "FDOJfF7X"));
                BaseSubscriptionActivity.x2(baseAISubscriptionActivity, SubscriptionType.YEAR_TRIAL_3D);
                return;
            case 6:
                SubscriptionBlackFridayActivity subscriptionBlackFridayActivity = (SubscriptionBlackFridayActivity) obj2;
                int i16 = SubscriptionBlackFridayActivity.f24898a0;
                kotlin.jvm.internal.g.e(subscriptionBlackFridayActivity, ea.a.p("R2gic1cw", "0MCOPs80"));
                subscriptionBlackFridayActivity.n2();
                return;
            case 7:
                SubscriptionDarkTestFActivity subscriptionDarkTestFActivity = (SubscriptionDarkTestFActivity) obj2;
                int i17 = SubscriptionDarkTestFActivity.f24900a0;
                kotlin.jvm.internal.g.e(subscriptionDarkTestFActivity, ea.a.p("R2gic1cw", "N7ZJ0mZu"));
                subscriptionDarkTestFActivity.j2().d(SubscriptionType.MONTH);
                return;
            case 8:
                SubscriptionDarkTestJActivity subscriptionDarkTestJActivity = (SubscriptionDarkTestJActivity) obj2;
                SubscriptionDarkTestJActivity.a aVar3 = SubscriptionDarkTestJActivity.f24905b0;
                kotlin.jvm.internal.g.e(subscriptionDarkTestJActivity, ea.a.p("AmhQc3Iw", "y8v9VB1X"));
                if (!subscriptionDarkTestJActivity.U) {
                    subscriptionDarkTestJActivity.p2();
                    return;
                }
                return;
            case 9:
                InquiryAfterGuideFragment inquiryAfterGuideFragment = (InquiryAfterGuideFragment) obj2;
                InquiryAfterGuideFragment.a aVar4 = InquiryAfterGuideFragment.f25030e0;
                kotlin.jvm.internal.g.e(inquiryAfterGuideFragment, ea.a.p("R2gic1cw", "fhA8paJU"));
                if (inquiryAfterGuideFragment.u0().f25045i == InquiryAfterGuideType.ROLE) {
                    tf.c cVar = UserGuideEvent.f28677a;
                    UserGuideEvent.e(ea.a.p("Q2EsZTE=", "4RpaWxb9"));
                    Set set = (Set) inquiryAfterGuideFragment.u0().f25043g.d();
                    Set set2 = set;
                    if (set2 != null && !set2.isEmpty()) {
                        r52 = false;
                    } else {
                        r52 = true;
                    }
                    if (r52 == false) {
                        int intValue = ((Number) kotlin.collections.m.q0(set)).intValue();
                        if (intValue >= 0 && intValue < ((List) UserGuideEvent.f28679d.getValue()).size()) {
                            r53 = true;
                        } else {
                            r53 = false;
                        }
                        if (r53 != false) {
                            zl.c cVar2 = zl.c.c;
                            String str3 = (String) ((List) UserGuideEvent.f28679d.getValue()).get(intValue);
                            cVar2.getClass();
                            kotlin.jvm.internal.g.e(str3, "<set-?>");
                            zl.c.f32422i.c(zl.c.f32417d[4], str3);
                        }
                        if (wn.b.f31389e) {
                            if (intValue >= 0 && intValue < ((List) UserGuideEvent.f28679d.getValue()).size()) {
                                r43 = true;
                            } else {
                                r43 = false;
                            }
                            if (r43 != false && intValue != UserGuideEvent.f28681f) {
                                UserGuideEvent.f28681f = intValue;
                                tn.a.d(ReaderPdfApplication.m(), ea.a.p("XWU8Zh9vdw==", "2E1Uo10s"), ea.a.p("UnMgbhZ3U18Wb1pl", "QuhqxaiJ"), (String) ((List) UserGuideEvent.f28679d.getValue()).get(intValue), false);
                                tn.a.d(ReaderPdfApplication.m(), ea.a.p("XWU8Zh9vdw==", "1iGBSDVe"), ea.a.p("LnNabhx3Bl8-byRl", "IWoNRGsd"), ea.a.p("Nm8wYWw=", "2ZBDV2i7"), false);
                            }
                        }
                    }
                    Context context = view.getContext();
                    kotlin.jvm.internal.g.d(context, ea.a.p("WnRlYxxuFmUKdA==", "7F5dfqP8"));
                    boolean j10 = pdf.pdfreader.viewer.editor.free.utils.extension.c.j(context);
                    InquiryAfterGuideViewModel u02 = inquiryAfterGuideFragment.u0();
                    zl.c.c.getClass();
                    zl.c.f32421h.c(zl.c.f32417d[3], 1);
                    InquiryAfterGuideType inquiryAfterGuideType = InquiryAfterGuideType.FEATURE;
                    u02.f25040d.c(inquiryAfterGuideType, ea.a.p("LHVDchxuQ1A7Zy9GB2EPbVBuGlQ8cGU=", "s6AJWC2M"));
                    u02.f25045i = inquiryAfterGuideType;
                    InquiryAfterGuidePageFragment.f25034e0.getClass();
                    InquiryAfterGuidePageFragment a11 = InquiryAfterGuidePageFragment.a.a(inquiryAfterGuideType);
                    g0 q5 = inquiryAfterGuideFragment.q();
                    q5.getClass();
                    androidx.fragment.app.a aVar5 = new androidx.fragment.app.a(q5);
                    if (j10) {
                        i10 = R.anim.slide_left_in;
                    } else {
                        i10 = R.anim.slide_right_in;
                    }
                    if (j10) {
                        i11 = R.anim.slide_right_out;
                    } else {
                        i11 = R.anim.slide_left_out;
                    }
                    aVar5.e(i10, i11);
                    Object obj3 = inquiryAfterGuideFragment.Y;
                    kotlin.jvm.internal.g.b(obj3);
                    aVar5.d(((t0) obj3).c.getId(), a11, null);
                    aVar5.i();
                    return;
                }
                tf.c cVar3 = UserGuideEvent.f28677a;
                UserGuideEvent.e(ea.a.p("KmEQZTI=", "bQZw9Nov"));
                Set indexes = (Set) inquiryAfterGuideFragment.u0().f25044h.d();
                Set set3 = indexes;
                if (set3 != null && !set3.isEmpty()) {
                    r22 = false;
                } else {
                    r22 = true;
                }
                if (r22 == false) {
                    kotlin.jvm.internal.g.e(indexes, "indexes");
                    StringBuilder sb2 = new StringBuilder();
                    Set<Number> set4 = indexes;
                    Iterator it = set4.iterator();
                    int i18 = 0;
                    while (true) {
                        boolean hasNext = it.hasNext();
                        tf.c cVar4 = UserGuideEvent.f28677a;
                        if (hasNext) {
                            Object next = it.next();
                            int i19 = i18 + 1;
                            if (i18 >= 0) {
                                int intValue2 = ((Number) next).intValue();
                                if (i18 >= 0 && i18 < ((List) UserGuideEvent.f28680e.getValue()).size()) {
                                    r13 = true;
                                } else {
                                    r13 = false;
                                }
                                if (r13 != false) {
                                    if (i18 != 0) {
                                        sb2.append(ea.a.p("Xw==", "EIWsKbTw"));
                                    }
                                    sb2.append((String) ((List) UserGuideEvent.f28680e.getValue()).get(intValue2));
                                }
                                i18 = i19;
                            } else {
                                ge.a.c0();
                                throw null;
                            }
                        } else {
                            if (sb2.length() > 0) {
                                r4 = true;
                            } else {
                                r4 = false;
                            }
                            if (r4 != false) {
                                zl.c cVar5 = zl.c.c;
                                String sb3 = sb2.toString();
                                kotlin.jvm.internal.g.d(sb3, ea.a.p("PGIfdBZTQ3Izbi0oKQ==", "ZdjX8rAT"));
                                cVar5.getClass();
                                zl.c.f32423j.c(zl.c.f32417d[5], sb3);
                            }
                            if (wn.b.f31389e) {
                                for (Number number : set4) {
                                    int intValue3 = number.intValue();
                                    if (intValue3 >= 0 && intValue3 < ((List) UserGuideEvent.f28680e.getValue()).size()) {
                                        r42 = true;
                                    } else {
                                        r42 = false;
                                    }
                                    if (r42 != false) {
                                        tn.a.d(ReaderPdfApplication.m(), ea.a.p("XWU8Zh9vdw==", "SXsQ1I6C"), ea.a.p("UnMgbhZ3UF8Wb1pl", "Y0aZldkQ"), (String) ((List) UserGuideEvent.f28680e.getValue()).get(intValue3), false);
                                    }
                                }
                                if (!indexes.isEmpty()) {
                                    tn.a.d(ReaderPdfApplication.m(), ea.a.p("XWU8Zh9vdw==", "A80pDE34"), ea.a.p("LnNabhx3BV8-byRl", "oulDGdV8"), ea.a.p("R28_YWw=", "8SOaAir8"), false);
                                }
                            }
                        }
                    }
                }
                ((UserGuideViewModel) inquiryAfterGuideFragment.f25032d0.getValue()).e();
                return;
            case 10:
                OCRPreviewFragment oCRPreviewFragment = (OCRPreviewFragment) obj2;
                OCRPreviewFragment.a aVar6 = OCRPreviewFragment.f25168p0;
                kotlin.jvm.internal.g.e(oCRPreviewFragment, ea.a.p("O2hYc10w", "zUABZcdn"));
                Object obj4 = oCRPreviewFragment.Y;
                kotlin.jvm.internal.g.b(obj4);
                int currentItem = ((v0) obj4).f1547s.getCurrentItem();
                if (currentItem < oCRPreviewFragment.x0().getItemCount()) {
                    Object obj5 = oCRPreviewFragment.Y;
                    kotlin.jvm.internal.g.b(obj5);
                    ((v0) obj5).f1547s.setCurrentItem(currentItem + 1);
                    return;
                }
                return;
            case 11:
                OCRResultFragment oCRResultFragment = (OCRResultFragment) obj2;
                OCRResultFragment.a aVar7 = OCRResultFragment.f25189r0;
                kotlin.jvm.internal.g.e(oCRResultFragment, ea.a.p("R2gic1cw", "IxNdSgoy"));
                tf.c cVar6 = OCREventCenter.f28670a;
                OCREventCenter.m(ea.a.p("Vng_chJjdA==", "gsSlgzfn"));
                Object obj6 = oCRResultFragment.Y;
                kotlin.jvm.internal.g.b(obj6);
                Editable text2 = ((w0) obj6).f1590q.getText();
                if (text2 != null && (obj = text2.toString()) != null) {
                    if (kotlin.text.k.n0(obj).toString().length() > 0) {
                        z10 = true;
                    }
                    if (z10) {
                        str = obj;
                    }
                    if (str != null) {
                        e1.h(view.getContext(), oCRResultFragment.v().getString(R.string.arg_res_0x7f13036c), str);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                PDFPageManagerActivity pDFPageManagerActivity = (PDFPageManagerActivity) obj2;
                PDFPageManagerActivity.a aVar8 = PDFPageManagerActivity.H0;
                kotlin.jvm.internal.g.e(pDFPageManagerActivity, ea.a.p("O2hYc10w", "vWePwrX4"));
                LinearLayout linearLayout = (LinearLayout) pDFPageManagerActivity.o2().C.f1302d;
                kotlin.jvm.internal.g.d(linearLayout, ea.a.p("UWklZBpuBS4GaURzJWx4dC1wQUxs", "RGG3aHNO"));
                pDFPageManagerActivity.K2(linearLayout, false, pDFPageManagerActivity.B0);
                wm.b.c.getClass();
                wm.b.f31383i.c(wm.b.f31378d[3], Boolean.TRUE);
                return;
            case 13:
                Pdf2ImageLongPicPreviewActivity pdf2ImageLongPicPreviewActivity = (Pdf2ImageLongPicPreviewActivity) obj2;
                int i20 = Pdf2ImageLongPicPreviewActivity.f25506w0;
                kotlin.jvm.internal.g.e(pdf2ImageLongPicPreviewActivity, ea.a.p("TWg_c04w", "Kq9Vj2vH"));
                pdf2ImageLongPicPreviewActivity.c3(false);
                return;
            case 14:
                Pdf2ImagePicPreviewActivity pdf2ImagePicPreviewActivity = (Pdf2ImagePicPreviewActivity) obj2;
                int i21 = Pdf2ImagePicPreviewActivity.I0;
                kotlin.jvm.internal.g.e(pdf2ImagePicPreviewActivity, ea.a.p("O2hYc10w", "lCtgJmsR"));
                pdf2ImagePicPreviewActivity.g3(false);
                return;
            case 15:
                PreviewPageManageGuideView previewPageManageGuideView2 = (PreviewPageManageGuideView) obj2;
                int i22 = PreviewPageManageGuideView.f25608s;
                kotlin.jvm.internal.g.e(previewPageManageGuideView2, ea.a.p("OGgmc2Ew", "9kLOEeU8"));
                PreviewPageManageGuideView.b bVar = previewPageManageGuideView2.f25609q;
                if (bVar != null) {
                    ExecutorService executorService = ReaderPreviewActivity.U5;
                    ReaderPreviewActivity readerPreviewActivity = ((ao.v0) bVar).f5141a;
                    PreviewPageManageGuideView previewPageManageGuideView3 = readerPreviewActivity.f26216m0;
                    if (previewPageManageGuideView3 != null && previewPageManageGuideView3.getVisibility() == 0) {
                        z10 = true;
                    }
                    if (z10 && (previewPageManageGuideView = readerPreviewActivity.f26216m0) != null) {
                        previewPageManageGuideView.r();
                        return;
                    }
                    return;
                }
                return;
            case 16:
                int i23 = ChooseCropTypeDialog.E;
                ((ImageView) obj2).performClick();
                return;
            case 17:
                CameraActivity cameraActivity = (CameraActivity) obj2;
                int i24 = CameraActivity.H0;
                kotlin.jvm.internal.g.e(cameraActivity, ea.a.p("O2hYc10w", "J4U2Iz6e"));
                StateFlowImpl stateFlowImpl = cameraActivity.s2().f23509d;
                stateFlowImpl.setValue(mn.a.a((mn.a) stateFlowImpl.b(), false, false, !((mn.a) stateFlowImpl.b()).c, false, false, 27));
                return;
            case 18:
                pdf.pdfreader.viewer.editor.free.ui.act.e eVar2 = (pdf.pdfreader.viewer.editor.free.ui.act.e) obj2;
                String str4 = pdf.pdfreader.viewer.editor.free.ui.act.e.f26901p;
                kotlin.jvm.internal.g.e(eVar2, ea.a.p("O2hYc10w", "DOwhh4d4"));
                try {
                    EditText editText2 = eVar2.f26907a;
                    if (editText2 != null) {
                        editable = editText2.getText();
                    }
                    eVar2.C1(String.valueOf(editable), eVar2.f26911f);
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            case 19:
                ReaderImg2PDFChooseActivity.a aVar9 = ReaderImg2PDFChooseActivity.M0;
                ((ReaderImg2PDFChooseActivity) obj2).onClick(view);
                return;
            case 20:
                ReaderImg2PDFConvertActivity.a aVar10 = ReaderImg2PDFConvertActivity.f27381i0;
                ((ReaderImg2PDFConvertActivity) obj2).onClick(view);
                return;
            case 21:
                int i25 = f0.L;
                ((f0) obj2).dismiss();
                return;
            case 22:
                t2 t2Var = (t2) obj2;
                int i26 = t2.f27761b;
                kotlin.jvm.internal.g.e(t2Var, ea.a.p("OmgEcxIw", "XtNm673Z"));
                View.OnClickListener onClickListener = t2Var.f27762a;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                t2Var.dismiss();
                return;
            case 23:
                i3 i3Var = (i3) obj2;
                int i27 = i3.C;
                kotlin.jvm.internal.g.e(i3Var, ea.a.p("O2hYc10w", "XyAVX4jZ"));
                cg.a<tf.d> aVar11 = i3Var.B;
                if (aVar11 != null) {
                    aVar11.invoke();
                }
                i3Var.cancel();
                return;
            case 24:
                DebugAppConfigFragment debugAppConfigFragment = (DebugAppConfigFragment) obj2;
                int i28 = DebugAppConfigFragment.f27856d0;
                kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("R2gic1cw", "MPa2rzKl"));
                Object obj7 = debugAppConfigFragment.Y;
                kotlin.jvm.internal.g.b(obj7);
                ((o0) obj7).f1221i0.setText("");
                return;
            default:
                SettingFragment.a aVar12 = SettingFragment.f27957u0;
                kotlin.jvm.internal.g.e((SettingFragment) obj2, ea.a.p("A2gxc2ww", "f4wXHjL1"));
                return;
        }
    }
}
