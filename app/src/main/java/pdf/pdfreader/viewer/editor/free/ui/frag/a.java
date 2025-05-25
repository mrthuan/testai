package pdf.pdfreader.viewer.editor.free.ui.frag;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m0;
import androidx.lifecycle.w;
import com.google.android.material.tabs.TabLayout;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.scwang.smart.refresh.layout.constant.RefreshState;
import industries.deepthought.decode.Decoder;
import java.util.ArrayList;
import org.greenrobot.eventbus.ThreadMode;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.data.RecentAddRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.u2;
import pdf.pdfreader.viewer.editor.free.ui.myview.ReaderViewPager;
import pdf.pdfreader.viewer.editor.free.ui.myview.TouchMonitorRecyclerView;
import pdf.pdfreader.viewer.editor.free.ui.vm.HomeViewModel;
import pdf.pdfreader.viewer.editor.free.utils.k0;
import pdf.pdfreader.viewer.editor.free.utils.q0;
import pdf.pdfreader.viewer.editor.free.utils.t1;

/* compiled from: PdfReaderFilesFragment.java */
/* loaded from: classes3.dex */
public class a extends pdf.pdfreader.viewer.editor.free.base.a implements xn.c {

    /* renamed from: y0  reason: collision with root package name */
    public static ro.c f27997y0;

    /* renamed from: e0  reason: collision with root package name */
    public TabLayout f27999e0;

    /* renamed from: f0  reason: collision with root package name */
    public ReaderViewPager f28000f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f28001g0;

    /* renamed from: h0  reason: collision with root package name */
    public ArrayList<Fragment> f28002h0;

    /* renamed from: i0  reason: collision with root package name */
    public n f28003i0;

    /* renamed from: j0  reason: collision with root package name */
    public n f28004j0;

    /* renamed from: k0  reason: collision with root package name */
    public n f28005k0;

    /* renamed from: l0  reason: collision with root package name */
    public n f28006l0;

    /* renamed from: m0  reason: collision with root package name */
    public n f28007m0;

    /* renamed from: n0  reason: collision with root package name */
    public xk.e f28008n0;

    /* renamed from: o0  reason: collision with root package name */
    public ArrayList<String> f28009o0;

    /* renamed from: p0  reason: collision with root package name */
    public u2 f28010p0;

    /* renamed from: q0  reason: collision with root package name */
    public SmartRefreshLayout f28011q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f28012r0;

    /* renamed from: s0  reason: collision with root package name */
    public ViewGroup f28013s0;

    /* renamed from: v0  reason: collision with root package name */
    public TouchMonitorRecyclerView.a f28016v0;

    /* renamed from: w0  reason: collision with root package name */
    public HomeViewModel f28017w0;

    /* renamed from: d0  reason: collision with root package name */
    public int f27998d0 = 200;

    /* renamed from: t0  reason: collision with root package name */
    public String f28014t0 = ea.a.p("CERG", "9DXth87y");

    /* renamed from: u0  reason: collision with root package name */
    public boolean f28015u0 = true;

    /* renamed from: x0  reason: collision with root package name */
    public final int[] f28018x0 = {-1, -2285526, -14192157, -14965917, -823497};

    /* compiled from: PdfReaderFilesFragment.java */
    /* renamed from: pdf.pdfreader.viewer.editor.free.ui.frag.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0355a implements bc.e {
        public C0355a() {
        }
    }

    static {
        ea.a.p("cWE4ZTVyA2dfPg==", "BsQH57kt");
    }

    public static String E0(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return ea.a.p("DkxM", "WZztYVgU");
                        }
                        return ea.a.p("O1BU", "YCk99qGp");
                    }
                    return ea.a.p("dlgIRUw=", "aw2Dr5gD");
                }
                return ea.a.p("GE9jRA==", "Uy2oQlEJ");
            }
            return ea.a.p("Y0RG", "55MtEHeo");
        }
        return ea.a.p("DkxM", "pMw2IehQ");
    }

    public static void y0(a aVar, int i10) {
        View view;
        TextView textView;
        if (aVar.f27999e0 != null) {
            for (int i11 = 0; i11 < aVar.f27999e0.getTabCount(); i11++) {
                TabLayout.g h10 = aVar.f27999e0.h(i11);
                if (h10 != null && (view = h10.f12981e) != null && (textView = (TextView) view.findViewById(R.id.tv_top_tab_text)) != null && aVar.i() != null) {
                    if (i11 == i10) {
                        textView.setTextSize(0, textView.getContext().getResources().getDimensionPixelSize(R.dimen.sp_16));
                        if (i10 == 0) {
                            textView.setTextColor(aVar.v().getColor(R.color.colorSurface));
                        } else {
                            textView.setTextColor(aVar.v().getColor(R.color.white));
                        }
                        textView.setTextAppearance(textView.getContext(), R.style.TextViewFont_RobotoBold);
                    } else {
                        textView.setTextSize(0, textView.getContext().getResources().getDimensionPixelSize(R.dimen.sp_14));
                        if (i10 == 0) {
                            textView.setTextColor(androidx.core.content.a.getColor(aVar.i(), R.color.colorSurfaceFix));
                        } else {
                            textView.setTextColor(androidx.core.content.a.getColor(aVar.i(), R.color.white_70));
                        }
                        textView.setTextAppearance(textView.getContext(), R.style.TextViewFont_RobotoMedium);
                    }
                }
            }
        }
    }

    public static void z0(a aVar, int i10) {
        TabLayout tabLayout = aVar.f27999e0;
        if (tabLayout != null) {
            tabLayout.setSelectedTabIndicatorColor(i10);
        }
    }

    public final void A0() {
        n F0;
        boolean z10;
        if (this.f28000f0 != null && (F0 = F0()) != null) {
            ArrayList<PdfPreviewEntity> arrayList = F0.E0.f27213h;
            boolean z11 = false;
            if (this.f28000f0.getCurrentItem() == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f27998d0 != 200) {
                z11 = true;
            }
            wk.b.b().e(new qo.e(arrayList.size(), z10, z11));
        }
    }

    public final void B0(int i10) {
        int i11;
        if (r() == null) {
            return;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        i11 = R.color.colorPrimary;
                    } else {
                        i11 = R.color.colorPPT;
                    }
                } else {
                    i11 = R.color.colorExcel;
                }
            } else {
                i11 = R.color.colorWord;
            }
        } else {
            i11 = R.color.colorPDF;
        }
        wk.b.b().e(new qo.f(i11, i10));
    }

    public final void C0(boolean z10) {
        boolean z11;
        TabLayout tabLayout;
        int i10;
        boolean z12 = false;
        if (this.J && (tabLayout = this.f27999e0) != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            tabLayout.setVisibility(i10);
        }
        ReaderViewPager readerViewPager = this.f28000f0;
        if (readerViewPager != null) {
            readerViewPager.setEnableScroll(z10);
        }
        SmartRefreshLayout smartRefreshLayout = this.f28011q0;
        if (smartRefreshLayout != null) {
            if (z10 && this.f27998d0 == 200 && pdf.pdfreader.viewer.editor.free.utils.extension.c.g(g0())) {
                z11 = true;
            } else {
                z11 = false;
            }
            smartRefreshLayout.B = z11;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ea.a.p("QHcicBZSB2YAZUdoJWEvbzF0EiAlaCJuPmUFYVVTCm9ETzlIGmQHIAFlQEUHYTRsIVJXZjRlMGg6", "YQ7b0QXc"));
            if (z10 && this.f27998d0 == 200) {
                z12 = true;
            }
            sb2.append(z12);
            t1.b(sb2.toString());
        }
        if (z10) {
            try {
                K0(this.f28014t0);
                n F0 = F0();
                if (F0 != null) {
                    F0.C0();
                }
                t1.b(ea.a.p("QHcicBZSB2YAZUdoJWEvbzF0EiAjbidTBGxTYztNFmRl", "a6OyZNZJ"));
                A0();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public final void D0(String str, PdfPreviewEntity pdfPreviewEntity, String str2) {
        n F0 = F0();
        if (F0 != null) {
            ArrayList<PdfPreviewEntity> E0 = F0.E0();
            if (!TextUtils.isEmpty(str) && E0 != null && E0.size() > 0) {
                int i10 = -1;
                for (int i11 = 0; i11 < E0.size(); i11++) {
                    if (E0.get(i11).getPath().equals(str)) {
                        i10 = i11;
                    }
                }
                if (i10 < E0.size() && i10 >= 0) {
                    PdfPreviewEntity pdfPreviewEntity2 = E0.get(i10);
                    pdfPreviewEntity2.setRecent(1);
                    pdfPreviewEntity2.setRecentDate(System.currentTimeMillis());
                    Context I0 = F0.I0();
                    if (I0 != null) {
                        bm.c.b(I0).i(pdfPreviewEntity2);
                    }
                }
            }
            String p10 = ea.a.p("AlI-TQVBFkw=", "liDqZZDI");
            switch (F0.f22156e0) {
                case 200:
                    p10 = ea.a.p("KFI5TRlBBEw=", "34nvFHlx");
                    break;
                case 201:
                    p10 = ea.a.p("CVJ-TSZSckMfTlQ=", "wNhWilUv");
                    break;
                case 202:
                    p10 = ea.a.p("dVIaTTdGc1Y=", "9Z3Uh2YY");
                    break;
            }
            k0.c(F0.Y.get(), str, pdfPreviewEntity, str2, p10);
        }
    }

    public final n F0() {
        ReaderViewPager readerViewPager = this.f28000f0;
        if (readerViewPager != null) {
            int currentItem = readerViewPager.getCurrentItem();
            if (currentItem != 0) {
                if (currentItem != 1) {
                    if (currentItem != 2) {
                        if (currentItem != 3) {
                            if (currentItem == 4) {
                                return this.f28007m0;
                            }
                            return null;
                        }
                        return this.f28006l0;
                    }
                    return this.f28005k0;
                }
                return this.f28004j0;
            }
            return this.f28003i0;
        }
        return null;
    }

    public final String G0() {
        switch (this.f27998d0) {
            case 200:
                return ea.a.p("Umxs", "50zdh4Qs");
            case 201:
                return ea.a.p("PWVSZRd0", "tJZdmcNX");
            case 202:
                return ea.a.p("ImFDaw==", "sOg2ciPQ");
            case 203:
                return ea.a.p("UmQvZWQ=", "dK0a3fV4");
            default:
                return ea.a.p("WGxs", "Lu9o4yfc");
        }
    }

    public final void H0() {
        n nVar = this.f28003i0;
        if (nVar != null) {
            nVar.e1(this.f27998d0, ea.a.p("BExM", "UxEQ6qHR"));
        }
        n nVar2 = this.f28004j0;
        if (nVar2 != null) {
            nVar2.e1(this.f27998d0, ea.a.p("AURG", "YTQNBd9i"));
        }
        n nVar3 = this.f28005k0;
        if (nVar3 != null) {
            nVar3.e1(this.f27998d0, ea.a.p("GE9jRA==", "vUTbDVQj"));
        }
        n nVar4 = this.f28006l0;
        if (nVar4 != null) {
            nVar4.e1(this.f27998d0, ea.a.p("dlgIRUw=", "2WY91k5E"));
        }
        n nVar5 = this.f28007m0;
        if (nVar5 != null) {
            nVar5.e1(this.f27998d0, ea.a.p("H1BU", "N13YJbzs"));
        }
    }

    public final void I0(String str) {
        n nVar = this.f28003i0;
        if (nVar != null) {
            nVar.e1(this.f27998d0, ea.a.p("DkxM", "kpuCNhhD"));
        }
        if (this.f28004j0 != null && TextUtils.equals(str, ea.a.p("Y0RG", "raOyKVOo"))) {
            this.f28004j0.e1(this.f27998d0, ea.a.p("H0RG", "3B8rizfz"));
        }
        if (this.f28005k0 != null && TextUtils.equals(str, ea.a.p("ZE8ZRA==", "W9ASGL9p"))) {
            this.f28005k0.e1(this.f27998d0, ea.a.p("I08WRA==", "7stD7e4m"));
        }
        if (this.f28006l0 != null && TextUtils.equals(str, ea.a.p("dlgIRUw=", "4JWr4d0I"))) {
            this.f28006l0.e1(this.f27998d0, ea.a.p("ClhyRUw=", "2ntdro2w"));
        }
        if (this.f28007m0 != null && TextUtils.equals(str, ea.a.p("Y1BU", "0otisdBy"))) {
            this.f28007m0.e1(this.f27998d0, ea.a.p("aFBU", "vk8qv8is"));
        }
    }

    public final void J0() {
        boolean z10;
        SmartRefreshLayout smartRefreshLayout = this.f28011q0;
        if (smartRefreshLayout != null) {
            if (smartRefreshLayout.f15945w0 == RefreshState.Refreshing) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                smartRefreshLayout.getClass();
                smartRefreshLayout.f15941u0.postDelayed(new xb.c(smartRefreshLayout, 0, Boolean.FALSE), 200);
                t1.b(ea.a.p("PHdYcBxSUmYoZTloOWERb0B0TiA3ZQNyH3MmRBJ0FEYgclJlWWZebjNzIlIQZhplRmg=", "wutszNsu"));
            }
        }
        this.f28012r0 = true;
        n nVar = this.f28003i0;
        if (nVar != null) {
            nVar.f1(this.f27998d0, ea.a.p("ckxM", "UhdeDSFm"));
        }
        n nVar2 = this.f28004j0;
        if (nVar2 != null) {
            nVar2.f1(this.f27998d0, ea.a.p("KkRG", "t7z2hNrq"));
        }
        n nVar3 = this.f28005k0;
        if (nVar3 != null) {
            nVar3.f1(this.f27998d0, ea.a.p("HU8YRA==", "L9JJNsOn"));
        }
        n nVar4 = this.f28006l0;
        if (nVar4 != null) {
            nVar4.f1(this.f27998d0, ea.a.p("dlgIRUw=", "15MUc75E"));
        }
        n nVar5 = this.f28007m0;
        if (nVar5 != null) {
            nVar5.f1(this.f27998d0, ea.a.p("H1BU", "Wen4w11B"));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void K(Activity activity) {
        f27997y0 = (ro.c) activity;
        this.F = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015c, code lost:
        if (r2 != false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K0(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.frag.a.K0(java.lang.String):void");
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.a, androidx.fragment.app.Fragment
    public final void L(Context context) {
        if (context instanceof Activity) {
            f27997y0 = (ro.c) context;
        }
        super.L(context);
    }

    public final void L0(int i10) {
        String p10;
        this.f28014t0 = E0(i10);
        M0(i10, -1);
        this.f28015u0 = true;
        K0(this.f28014t0);
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            tn.a.b(i(), ea.a.p("J29cZQ==", "DWXfTXfI"), ea.a.p("H28_ZS1wCnQXYwppV2s=", "HqwRrzRh"));
                        }
                    } else {
                        tn.a.b(i(), ea.a.p("LW88ZQ==", "zLEQfIfH"), ea.a.p("W28mZSxlGmMXbGtjBWk1aw==", "804D2EVd"));
                    }
                } else {
                    tn.a.b(i(), ea.a.p("J29cZQ==", "3xOvG3rB"), ea.a.p("W28mZSx3DXIWX1dsAGNr", "NipaElP8"));
                }
            } else {
                tn.a.b(i(), ea.a.p("J29cZQ==", "NcfldtWk"), ea.a.p("OW9ZZTZwXGYXYwppV2s=", "hHQ4i8CX"));
            }
        } else {
            tn.a.b(i(), ea.a.p("Mm8OZQ==", "eCZclnjq"), ea.a.p("J29cZSZhW2w8aSZlBl8LbFxjaw==", "M8T1WJRA"));
        }
        if (i() != null && pdf.pdfreader.viewer.editor.free.utils.extension.c.g(i())) {
            androidx.fragment.app.u i11 = i();
            String p11 = ea.a.p("J29cZQ==", "M6yiJAgQ");
            String p12 = ea.a.p("J29cZSZzX293", "jx4GxDzh");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(G0());
            sb2.append(ea.a.p("Xw==", "yJvxOhDi"));
            String str = this.f28014t0;
            if (str == null) {
                p10 = "";
            } else if (TextUtils.equals(str, ea.a.p("ckxM", "MyKiDpao"))) {
                p10 = ea.a.p("Lmxs", "8bwBfyNU");
            } else if (TextUtils.equals(str, ea.a.p("Y0RG", "tpLQum0Q"))) {
                p10 = ea.a.p("Q2Rm", "30aOOjtA");
            } else if (TextUtils.equals(str, ea.a.p("ZE8ZRA==", "8SKSGzml"))) {
                p10 = ea.a.p("OG9DZA==", "zLKI42rZ");
            } else if (TextUtils.equals(str, ea.a.p("ClhyRUw=", "bgbIrkCe"))) {
                p10 = ea.a.p("VngoZWw=", "Y0Mckkfm");
            } else if (TextUtils.equals(str, ea.a.p("M1BU", "j9crgWGB"))) {
                p10 = ea.a.p("Q3B0", "lSUs9MCn");
            } else {
                p10 = ea.a.p("Umxs", "EUN5RGVg");
            }
            sb2.append(p10);
            tn.a.d(i11, p11, p12, sb2.toString(), false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void M(Bundle bundle) {
        super.M(bundle);
        if (f27997y0 == null && i() != null) {
            f27997y0 = (ro.c) i();
            androidx.fragment.app.u context = i();
            kotlin.jvm.internal.g.e(context, "context");
            if (Decoder.f18572a) {
                ad.a.c(context);
                vc.a.c(context);
            } else {
                ReaderPdfApplication.o(context);
            }
        }
        k0(true);
    }

    public final void M0(int i10, int i11) {
        n nVar;
        if (this.f28000f0 != null) {
            int i12 = this.f27998d0;
            String E0 = E0(i10);
            if (i11 > -1 && i11 < 5) {
                this.f28000f0.setCurrentItem(i11);
            }
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4 && (nVar = this.f28007m0) != null) {
                                nVar.e1(i12, E0);
                                return;
                            }
                            return;
                        }
                        n nVar2 = this.f28006l0;
                        if (nVar2 != null) {
                            nVar2.e1(i12, E0);
                            return;
                        }
                        return;
                    }
                    n nVar3 = this.f28005k0;
                    if (nVar3 != null) {
                        nVar3.e1(i12, E0);
                        return;
                    }
                    return;
                }
                n nVar4 = this.f28004j0;
                if (nVar4 != null) {
                    nVar4.e1(i12, E0);
                    return;
                }
                return;
            }
            n nVar5 = this.f28003i0;
            if (nVar5 != null) {
                nVar5.e1(i12, E0);
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.a, androidx.fragment.app.Fragment
    public final void P() {
        super.P();
        wk.b.b().k(this);
    }

    @wk.i(threadMode = ThreadMode.MAIN)
    public void RefreshAllFilesFragEvent(qo.j jVar) {
        if (jVar != null) {
            jVar.getClass();
            J0();
        }
    }

    @wk.i(threadMode = ThreadMode.MAIN)
    public void RefreshFavFragEvent(qo.k kVar) {
        ea.a.p("LGI=", "ttFkgVbL");
        ea.a.p("HWVXchxzX0Y7dgxyFGctdlBudA==", "pfI1s4Dm");
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.a
    public final void s0() {
        TabLayout tabLayout;
        wk.b.b().i(this);
        ReaderHomeActivity readerHomeActivity = (ReaderHomeActivity) i();
        if (readerHomeActivity != null) {
            tabLayout = readerHomeActivity.f26682q0;
        } else {
            tabLayout = null;
        }
        this.f27999e0 = tabLayout;
        this.f28013s0 = (ViewGroup) r0(R.id.top_ad_layout);
        RelativeLayout relativeLayout = (RelativeLayout) r0(R.id.ll_tops_ads);
        this.f28000f0 = (ReaderViewPager) r0(R.id.documentViewPager);
        SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) r0(R.id.smartRefreshLayout);
        this.f28011q0 = smartRefreshLayout;
        smartRefreshLayout.B = pdf.pdfreader.viewer.editor.free.utils.extension.c.g(g0());
        this.f28011q0.setEnabled(true);
        t1.b(ea.a.p("PHdYcBxSUmYoZTloOWERb0B0TiAjaQtkMmkOd0cgJ3cmcFRSHGZFZSloBmEMbx10Og==", "z3k6dk4T") + this.f28011q0.isEnabled());
        this.f28011q0.W = new C0355a();
        pdf.pdfreader.viewer.editor.free.utils.extension.d.b(A(), RecentAddRepository.f24196q, this.P, new a1.e(this, 15));
        pdf.pdfreader.viewer.editor.free.utils.extension.d.b(A(), RecentAddRepository.f24197r, this.P, new h5.e(this, 16));
        pdf.pdfreader.viewer.editor.free.utils.extension.d.b(A(), RecentAddRepository.f24198s, this.P, new androidx.appcompat.libconvert.helper.b(this, 18));
        pdf.pdfreader.viewer.editor.free.utils.extension.d.b(A(), RecentAddRepository.f24199t, this.P, new com.google.android.tools.d(this, 19));
        pdf.pdfreader.viewer.editor.free.utils.extension.d.b(A(), RecentAddRepository.f24200u, this.P, new d9.g(this, 21));
        if (!this.f28001g0 && i() != null) {
            this.f28001g0 = true;
            if (this.f28002h0 == null) {
                this.f28002h0 = new ArrayList<>();
            }
            if (i() instanceof ReaderHomeActivity) {
                this.f28003i0 = new n(ea.a.p("DkxM", "bUYbMWK1"));
                this.f28004j0 = new n(ea.a.p("NERG", "h1dkHsWn"));
                this.f28005k0 = new n(ea.a.p("GE9jRA==", "6znTJYEB"));
                this.f28006l0 = new n(ea.a.p("ClhyRUw=", "rnGYJBRy"));
                this.f28007m0 = new n(ea.a.p("Y1BU", "S573c5sn"));
                this.f28002h0.add(this.f28003i0);
                this.f28002h0.add(this.f28004j0);
                this.f28002h0.add(this.f28005k0);
                this.f28002h0.add(this.f28006l0);
                this.f28002h0.add(this.f28007m0);
            }
            TouchMonitorRecyclerView.a aVar = this.f28016v0;
            if (aVar != null) {
                n nVar = this.f28003i0;
                nVar.f22171t0 = aVar;
                TouchMonitorRecyclerView touchMonitorRecyclerView = nVar.f22162k0;
                if (touchMonitorRecyclerView != null) {
                    touchMonitorRecyclerView.setScrollOnTouchListener(aVar);
                }
                n nVar2 = this.f28004j0;
                TouchMonitorRecyclerView.a aVar2 = this.f28016v0;
                nVar2.f22171t0 = aVar2;
                TouchMonitorRecyclerView touchMonitorRecyclerView2 = nVar2.f22162k0;
                if (touchMonitorRecyclerView2 != null) {
                    touchMonitorRecyclerView2.setScrollOnTouchListener(aVar2);
                }
                n nVar3 = this.f28005k0;
                TouchMonitorRecyclerView.a aVar3 = this.f28016v0;
                nVar3.f22171t0 = aVar3;
                TouchMonitorRecyclerView touchMonitorRecyclerView3 = nVar3.f22162k0;
                if (touchMonitorRecyclerView3 != null) {
                    touchMonitorRecyclerView3.setScrollOnTouchListener(aVar3);
                }
                n nVar4 = this.f28006l0;
                TouchMonitorRecyclerView.a aVar4 = this.f28016v0;
                nVar4.f22171t0 = aVar4;
                TouchMonitorRecyclerView touchMonitorRecyclerView4 = nVar4.f22162k0;
                if (touchMonitorRecyclerView4 != null) {
                    touchMonitorRecyclerView4.setScrollOnTouchListener(aVar4);
                }
                n nVar5 = this.f28007m0;
                TouchMonitorRecyclerView.a aVar5 = this.f28016v0;
                nVar5.f22171t0 = aVar5;
                TouchMonitorRecyclerView touchMonitorRecyclerView5 = nVar5.f22162k0;
                if (touchMonitorRecyclerView5 != null) {
                    touchMonitorRecyclerView5.setScrollOnTouchListener(aVar5);
                }
            }
            ArrayList<String> arrayList = new ArrayList<>();
            this.f28009o0 = arrayList;
            arrayList.add(v().getString(R.string.arg_res_0x7f13038b));
            this.f28009o0.add(v().getString(R.string.arg_res_0x7f130402));
            this.f28009o0.add(v().getString(R.string.arg_res_0x7f130404));
            this.f28009o0.add(v().getString(R.string.arg_res_0x7f130401));
            this.f28009o0.add(v().getString(R.string.arg_res_0x7f130403));
            xk.e eVar = new xk.e(q(), this.f28002h0, this.f28009o0);
            this.f28008n0 = eVar;
            this.f28000f0.setAdapter(eVar);
            this.f28000f0.setOffscreenPageLimit(this.f28009o0.size());
            this.f28000f0.setEnableScroll(true);
            this.f28000f0.setSmoothScroll(true);
            this.f28000f0.b(new b(this, pdf.pdfreader.viewer.editor.free.utils.extension.c.h(i())));
            TabLayout tabLayout2 = this.f27999e0;
            if (tabLayout2 != null) {
                tabLayout2.setupWithViewPager(this.f28000f0);
                this.f27999e0.setTabMode(1);
                this.f27999e0.setTabGravity(0);
                for (int i10 = 0; i10 < this.f27999e0.getTabCount(); i10++) {
                    TabLayout.g h10 = this.f27999e0.h(i10);
                    if (h10 != null) {
                        View inflate = LayoutInflater.from(i()).inflate(R.layout.nav_top_tab_item, (ViewGroup) this.f27999e0, false);
                        ((TextView) inflate.findViewById(R.id.tv_top_tab_text)).setText(this.f28009o0.get(i10));
                        h10.f12981e = inflate;
                        h10.b();
                        h10.f12984h.setLongClickable(false);
                        if (Build.VERSION.SDK_INT > 26) {
                            h10.f12984h.setTooltipText("");
                        }
                    }
                }
                this.f27999e0.a(new d(this));
                w<Integer> wVar = wn.b.f31387b;
                int l10 = q0.l(r(), 1, "home_page_last_index");
                if (l10 == 5) {
                    q0.x(r(), 0, "home_page_new_file_flag");
                    q0.x(r(), 1, "home_page_last_index");
                    l10 = 1;
                } else {
                    l10 = (l10 < 0 || l10 > 4) ? 1 : 1;
                    if (q0.l(r(), 0, "home_page_new_file_flag") == 1) {
                        q0.x(r(), 0, "home_page_new_file_flag");
                        l10 = 0;
                    }
                }
                if (l10 == 0) {
                    L0(0);
                }
                wVar.j(Integer.valueOf(l10));
                wVar.e(this, new pdf.pdfreader.viewer.editor.free.ui.act.tools.c(this, 1));
            }
        }
    }

    @wk.i(threadMode = ThreadMode.MAIN)
    public void savePdfChangeState(qo.l lVar) {
        ReaderViewPager readerViewPager;
        boolean z10;
        if (lVar != null && (readerViewPager = this.f28000f0) != null) {
            n nVar = this.f28003i0;
            String str = lVar.f29403a;
            String str2 = lVar.f29404b;
            boolean z11 = false;
            if (nVar != null) {
                if (readerViewPager.getCurrentItem() != 0 && !str.equals(ea.a.p("dVIETSxUKkkgRA==", "56mAzoHn"))) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                nVar.T0(str2, z10);
            }
            n nVar2 = this.f28004j0;
            if (nVar2 != null) {
                if (this.f28000f0.getCurrentItem() == 1 || str.equals(ea.a.p("dVIETSxUKkkgRA==", "yRTWkqSN"))) {
                    z11 = true;
                }
                nVar2.T0(str2, z11);
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.a
    public final int u0() {
        return R.layout.fragment_bottom_documets;
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.a
    public final void v0() {
        this.f28017w0 = (HomeViewModel) new m0(f0()).a(HomeViewModel.class);
    }

    @Override // xn.c
    public final void R0() {
    }

    @Override // androidx.fragment.app.Fragment
    public final void U() {
    }

    @Override // xn.c
    public final void g() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.a
    public final void x0() {
    }

    @Override // xn.c
    public final void V(int i10) {
    }

    @wk.i(threadMode = ThreadMode.MAIN)
    public void changeCenterProgress(qo.p pVar) {
    }

    @Override // xn.c
    public final void w0(Throwable th2) {
    }

    @Override // xn.c
    public final void c(String str, boolean z10) {
    }
}
