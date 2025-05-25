package pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment;

import am.v0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y0;
import androidx.lifecycle.j;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import androidx.lifecycle.x;
import androidx.viewpager2.widget.ViewPager2;
import cg.l;
import d9.f;
import ig.h;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.m;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.i;
import n1.a;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.base.BaseVMFragment;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity;
import pdf.pdfreader.viewer.editor.free.feature.ocr.data.OCRWorkFlow;
import pdf.pdfreader.viewer.editor.free.feature.ocr.data.OcrUploadResult;
import pdf.pdfreader.viewer.editor.free.feature.ocr.dialog.OCRLoadingDialog;
import pdf.pdfreader.viewer.editor.free.feature.ocr.helper.OCRStateManager;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRPreviewFragment;
import pdf.pdfreader.viewer.editor.free.feature.ocr.vm.OCRPreviewViewModel;
import pdf.pdfreader.viewer.editor.free.feature.ocr.vm.OCRResultViewModel;
import pdf.pdfreader.viewer.editor.free.ui.dialog.i3;
import pdf.pdfreader.viewer.editor.free.ui.widget.guide.OCRTrialGuideView;
import pdf.pdfreader.viewer.editor.free.utils.event.ScanEventCenter;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import qb.j0;
import tf.d;

/* compiled from: OCRPreviewFragment.kt */
/* loaded from: classes3.dex */
public final class OCRPreviewFragment extends BaseVMFragment<v0> {

    /* renamed from: p0  reason: collision with root package name */
    public static final a f25168p0;

    /* renamed from: c0  reason: collision with root package name */
    public final tf.c f25169c0 = kotlin.a.a(new cg.a<pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.a>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRPreviewFragment$ocrAdjustAdapter$2
        {
            super(0);
        }

        @Override // cg.a
        public final pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.a invoke() {
            return new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.a(b.b.x(OCRPreviewFragment.this));
        }
    });

    /* renamed from: d0  reason: collision with root package name */
    public final k0 f25170d0 = y0.a(this, i.a(OCRPreviewViewModel.class), new cg.a<o0>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRPreviewFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final o0 invoke() {
            o0 viewModelStore = Fragment.this.f0().getViewModelStore();
            g.d(viewModelStore, ea.a.p("PWVAdRByUkE5dCN2HHQRKBwuGGkgdyhvV2UYUwJvGWU=", "86oh3tvk"));
            return viewModelStore;
        }
    }, new cg.a<n1.a>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRPreviewFragment$special$$inlined$activityViewModels$default$2
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
        }

        @Override // cg.a
        public final n1.a invoke() {
            n1.a aVar;
            cg.a aVar2 = cg.a.this;
            if (aVar2 == null || (aVar = (n1.a) aVar2.invoke()) == null) {
                n1.a defaultViewModelCreationExtras = this.f0().getDefaultViewModelCreationExtras();
                g.d(defaultViewModelCreationExtras, ea.a.p("PWVAdRByUkE5dCN2HHQRKBwuCmUjYRBsGlY_ZQBNHGQqbHJyHGFDaTVuD3gBcglz", "yehAnVws"));
                return defaultViewModelCreationExtras;
            }
            return aVar;
        }
    }, new cg.a<m0.b>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRPreviewFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final m0.b invoke() {
            m0.b defaultViewModelProviderFactory = Fragment.this.f0().getDefaultViewModelProviderFactory();
            g.d(defaultViewModelProviderFactory, ea.a.p("PWVAdRByUkE5dCN2HHQRKBwuCmUjYRBsQlY5ZSJNNmQqbGFyFnZeZD9yDGEWdAdyeQ==", "VuoP6PUY"));
            return defaultViewModelProviderFactory;
        }
    });

    /* renamed from: e0  reason: collision with root package name */
    public final k0 f25171e0;

    /* renamed from: f0  reason: collision with root package name */
    public OCRLoadingDialog f25172f0;

    /* renamed from: g0  reason: collision with root package name */
    public i3 f25173g0;

    /* renamed from: h0  reason: collision with root package name */
    public i3 f25174h0;

    /* renamed from: i0  reason: collision with root package name */
    public kotlinx.coroutines.y0 f25175i0;

    /* renamed from: j0  reason: collision with root package name */
    public OCRWorkFlow f25176j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f25177k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f25178l0;

    /* renamed from: m0  reason: collision with root package name */
    public long f25179m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f25180n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f25181o0;

    /* compiled from: OCRPreviewFragment.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    /* compiled from: OCRPreviewFragment.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f25182a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f25183b;

        static {
            int[] iArr = new int[OCRStateManager.OCRState.values().length];
            try {
                iArr[OCRStateManager.OCRState.vip.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OCRStateManager.OCRState.free.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OCRStateManager.OCRState.billing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f25182a = iArr;
            int[] iArr2 = new int[OcrUploadResult.values().length];
            try {
                iArr2[OcrUploadResult.IMAGE_UPLOAD_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OcrUploadResult.NETWORK_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f25183b = iArr2;
        }
    }

    /* compiled from: OCRPreviewFragment.kt */
    /* loaded from: classes3.dex */
    public static final class d extends ViewPager2.g {
        public d() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        @SuppressLint({"SetTextI18n"})
        public final void c(int i10) {
            ea.a.p("fEMZUAFlFGkXd3JyCGc7ZSp0", "MpMbuYI5");
            a aVar = OCRPreviewFragment.f25168p0;
            OCRPreviewFragment oCRPreviewFragment = OCRPreviewFragment.this;
            oCRPreviewFragment.z0(i10, oCRPreviewFragment.x0().getItemCount());
            if (oCRPreviewFragment.f25178l0 != i10) {
                tf.c cVar = ScanEventCenter.f28674a;
                ScanEventCenter.e(ea.a.p("IGNy", "18hP23YQ"));
            }
            um.a aVar2 = (um.a) m.t0(i10, oCRPreviewFragment.x0().h());
            if (aVar2 != null) {
                oCRPreviewFragment.u0(aVar2.f30437f);
            }
            oCRPreviewFragment.f25178l0 = i10;
        }
    }

    /* compiled from: OCRPreviewFragment.kt */
    /* loaded from: classes3.dex */
    public static final class e implements x, kotlin.jvm.internal.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f25185a;

        public e(l lVar) {
            ea.a.p("VXUlYwdpDW4=", "Y70uI7pt");
            this.f25185a = lVar;
        }

        @Override // kotlin.jvm.internal.e
        public final l a() {
            return this.f25185a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof x) && (obj instanceof kotlin.jvm.internal.e)) {
                return g.a(this.f25185a, ((kotlin.jvm.internal.e) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return this.f25185a.hashCode();
        }

        @Override // androidx.lifecycle.x
        public final /* synthetic */ void m(Object obj) {
            this.f25185a.invoke(obj);
        }
    }

    static {
        ea.a.p("fEMZUAFlFGkXd3JyCGc7ZSp0", "oSiDWbry");
        f25168p0 = new a();
    }

    public OCRPreviewFragment() {
        final cg.a<Fragment> aVar = new cg.a<Fragment>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRPreviewFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        final tf.c b10 = kotlin.a.b(LazyThreadSafetyMode.NONE, new cg.a<p0>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRPreviewFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final p0 invoke() {
                return (p0) cg.a.this.invoke();
            }
        });
        this.f25171e0 = y0.a(this, i.a(OCRResultViewModel.class), new cg.a<o0>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRPreviewFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final o0 invoke() {
                return ((p0) tf.c.this.getValue()).getViewModelStore();
            }
        }, new cg.a<n1.a>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRPreviewFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cg.a
            public final n1.a invoke() {
                n1.a aVar2;
                cg.a aVar3 = cg.a.this;
                if (aVar3 == null || (aVar2 = (n1.a) aVar3.invoke()) == null) {
                    p0 p0Var = (p0) b10.getValue();
                    j jVar = p0Var instanceof j ? (j) p0Var : null;
                    return jVar != null ? jVar.getDefaultViewModelCreationExtras() : a.C0298a.f22314b;
                }
                return aVar2;
            }
        }, new cg.a<m0.b>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRPreviewFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final m0.b invoke() {
                m0.b defaultViewModelProviderFactory;
                p0 p0Var = (p0) b10.getValue();
                j jVar = p0Var instanceof j ? (j) p0Var : null;
                if (jVar == null || (defaultViewModelProviderFactory = jVar.getDefaultViewModelProviderFactory()) == null) {
                    m0.b defaultViewModelProviderFactory2 = Fragment.this.getDefaultViewModelProviderFactory();
                    g.d(defaultViewModelProviderFactory2, ea.a.p("EmU8YU1sTVYhZRFNW2QybGhyPXYgZFNyMmESdD5yeQ==", "NLvZ89Nw"));
                    return defaultViewModelProviderFactory2;
                }
                return defaultViewModelProviderFactory;
            }
        });
    }

    public static final void t0(OCRPreviewFragment oCRPreviewFragment, OCRStateManager.OCRState oCRState) {
        oCRPreviewFragment.getClass();
        int i10 = b.f25182a[oCRState.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    VB vb2 = oCRPreviewFragment.Y;
                    g.b(vb2);
                    ((v0) vb2).f1543o.setVisibility(0);
                    VB vb3 = oCRPreviewFragment.Y;
                    g.b(vb3);
                    ((v0) vb3).f1542n.setVisibility(8);
                    return;
                }
                return;
            }
            BillingConfigImpl.c.getClass();
            if (BillingConfigImpl.p()) {
                h<Object>[] hVarArr = BillingConfigImpl.f24850d;
                h<Object> hVar = hVarArr[4];
                pdf.pdfreader.viewer.editor.free.datasource.sp.a aVar = BillingConfigImpl.f24866t;
                if (!((Boolean) aVar.b(hVar)).booleanValue()) {
                    aVar.c(hVarArr[4], Boolean.TRUE);
                    VB vb4 = oCRPreviewFragment.Y;
                    g.b(vb4);
                    ((v0) vb4).f1538j.s();
                }
                VB vb5 = oCRPreviewFragment.Y;
                g.b(vb5);
                ((v0) vb5).f1543o.setVisibility(8);
                VB vb6 = oCRPreviewFragment.Y;
                g.b(vb6);
                ((v0) vb6).f1542n.setVisibility(0);
                VB vb7 = oCRPreviewFragment.Y;
                g.b(vb7);
                ((v0) vb7).f1542n.setText(String.valueOf(BillingConfigImpl.j()));
                return;
            }
            VB vb8 = oCRPreviewFragment.Y;
            g.b(vb8);
            ((v0) vb8).f1543o.setVisibility(8);
            VB vb9 = oCRPreviewFragment.Y;
            g.b(vb9);
            ((v0) vb9).f1542n.setVisibility(8);
            return;
        }
        VB vb10 = oCRPreviewFragment.Y;
        g.b(vb10);
        ((v0) vb10).f1543o.setVisibility(8);
        VB vb11 = oCRPreviewFragment.Y;
        g.b(vb11);
        ((v0) vb11).f1542n.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0() {
        /*
            r9 = this;
            android.content.Context r3 = r9.r()
            if (r3 != 0) goto L7
            return
        L7:
            android.content.Context r0 = r9.r()
            r6 = 0
            if (r0 != 0) goto Lf
            goto L77
        Lf:
            boolean r1 = pdf.pdfreader.viewer.editor.free.ui.feature.debug.ReaderDebugActivity.f27841t
            r2 = 1
            if (r1 == 0) goto L15
            goto L78
        L15:
            boolean r1 = cl.b.b(r0)
            if (r1 == 0) goto L1c
            goto L78
        L1c:
            boolean r1 = r9.f25180n0
            if (r1 != 0) goto L2d
            tf.c r1 = pdf.pdfreader.viewer.editor.free.utils.event.OCREventCenter.f28670a
            pdf.pdfreader.viewer.editor.free.feature.ocr.data.OcrUploadResult r1 = pdf.pdfreader.viewer.editor.free.feature.ocr.data.OcrUploadResult.NETWORK_ERROR
            java.lang.String r1 = r9.v0(r1)
            pdf.pdfreader.viewer.editor.free.utils.event.OCREventCenter.e(r1)
            r9.f25180n0 = r2
        L2d:
            pdf.pdfreader.viewer.editor.free.ui.dialog.i3 r1 = r9.f25173g0
            if (r1 == 0) goto L37
            r1.show()
            tf.d r1 = tf.d.f30009a
            goto L38
        L37:
            r1 = r6
        L38:
            if (r1 != 0) goto L77
            pdf.pdfreader.viewer.editor.free.ui.dialog.i3 r1 = new pdf.pdfreader.viewer.editor.free.ui.dialog.i3
            android.content.res.Resources r2 = r0.getResources()
            r4 = 2131952303(0x7f1302af, float:1.9541045E38)
            java.lang.String r2 = r2.getString(r4)
            java.lang.String r4 = "FW8UYVpDA248ZR50GnIyc1d1IGMscxhnloDXZ3lSbHMNch5uUS4CZTx3CXJfXzJySm8gKQ=="
            java.lang.String r5 = "pHyw6lkM"
            java.lang.String r4 = ea.a.p(r4, r5)
            kotlin.jvm.internal.g.d(r2, r4)
            android.content.res.Resources r4 = r0.getResources()
            r5 = 2131951881(0x7f130109, float:1.954019E38)
            java.lang.String r4 = r4.getString(r5)
            java.lang.String r5 = "I29SYRVDWG4uZTJ0W3INc1p1HGMgc0tnpIDwUmlzOHImblYuHW9AbjZvK2QqZglpWWUKKQ=="
            java.lang.String r7 = "ZfNlFVGL"
            java.lang.String r5 = ea.a.p(r5, r7)
            kotlin.jvm.internal.g.d(r4, r5)
            r1.<init>(r0, r2, r4, r6)
            r9.f25173g0 = r1
            pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRPreviewFragment$networkIsAvailable$1$1 r0 = new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRPreviewFragment$networkIsAvailable$1$1
            r0.<init>()
            r1.B = r0
            r1.show()
        L77:
            r2 = 0
        L78:
            if (r2 != 0) goto L7b
            return
        L7b:
            VB extends i2.a r0 = r9.Y
            kotlin.jvm.internal.g.b(r0)
            am.v0 r0 = (am.v0) r0
            androidx.viewpager2.widget.ViewPager2 r0 = r0.f1547s
            int r4 = r0.getCurrentItem()
            pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.a r0 = r9.x0()
            java.util.List r0 = r0.h()
            java.lang.Object r0 = kotlin.collections.m.t0(r4, r0)
            r1 = r0
            um.a r1 = (um.a) r1
            if (r1 == 0) goto Lac
            androidx.lifecycle.LifecycleCoroutineScopeImpl r7 = b.b.x(r9)
            pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRPreviewFragment$startExtractText$1$1 r8 = new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRPreviewFragment$startExtractText$1$1
            r5 = 0
            r0 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 3
            kotlinx.coroutines.l1 r0 = pdf.pdfreader.viewer.editor.free.utils.t0.d0(r7, r6, r6, r8, r0)
            r9.f25175i0 = r0
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRPreviewFragment.A0():void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void O() {
        this.F = true;
        ScanEventCenter.f28675b.clear();
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment, androidx.fragment.app.Fragment
    public final void W() {
        super.W();
        if (this.f25177k0) {
            this.f25177k0 = false;
            if (BillingConfigImpl.c.w()) {
                A0();
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final v0 p0(LayoutInflater inflater, ViewGroup viewGroup) {
        g.e(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_ocr_preview, viewGroup, false);
        int i10 = R.id.backImg;
        AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.backImg);
        if (appCompatImageView != null) {
            i10 = R.id.crop_iv;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.crop_iv);
            if (appCompatImageView2 != null) {
                i10 = R.id.crop_layout;
                LinearLayout linearLayout = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.crop_layout);
                if (linearLayout != null) {
                    i10 = R.id.crop_tv;
                    TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.crop_tv);
                    if (textView != null) {
                        i10 = R.id.current_index_tv;
                        TextView textView2 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.current_index_tv);
                        if (textView2 != null) {
                            i10 = R.id.current_slash_tv;
                            if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.current_slash_tv)) != null) {
                                i10 = R.id.deleteImg;
                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.deleteImg);
                                if (appCompatImageView3 != null) {
                                    i10 = R.id.extractLayout;
                                    LinearLayout linearLayout2 = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.extractLayout);
                                    if (linearLayout2 != null) {
                                        i10 = R.id.index_layout;
                                        if (((LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.index_layout)) != null) {
                                            i10 = R.id.next_iv;
                                            AppCompatImageView appCompatImageView4 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.next_iv);
                                            if (appCompatImageView4 != null) {
                                                i10 = R.id.ocrTrialGuideView;
                                                OCRTrialGuideView oCRTrialGuideView = (OCRTrialGuideView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ocrTrialGuideView);
                                                if (oCRTrialGuideView != null) {
                                                    i10 = R.id.previous_iv;
                                                    AppCompatImageView appCompatImageView5 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.previous_iv);
                                                    if (appCompatImageView5 != null) {
                                                        i10 = R.id.rotate_left_iv;
                                                        if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.rotate_left_iv)) != null) {
                                                            i10 = R.id.rotate_left_layout;
                                                            LinearLayout linearLayout3 = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.rotate_left_layout);
                                                            if (linearLayout3 != null) {
                                                                i10 = R.id.rotate_left_tv;
                                                                if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.rotate_left_tv)) != null) {
                                                                    i10 = R.id.rotate_right_iv;
                                                                    if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.rotate_right_iv)) != null) {
                                                                        i10 = R.id.rotate_right_layout;
                                                                        LinearLayout linearLayout4 = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.rotate_right_layout);
                                                                        if (linearLayout4 != null) {
                                                                            i10 = R.id.rotate_right_tv;
                                                                            if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.rotate_right_tv)) != null) {
                                                                                i10 = R.id.subscribeFreeTv;
                                                                                TextView textView3 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.subscribeFreeTv);
                                                                                if (textView3 != null) {
                                                                                    i10 = R.id.subscribeImg;
                                                                                    AppCompatImageView appCompatImageView6 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.subscribeImg);
                                                                                    if (appCompatImageView6 != null) {
                                                                                        i10 = R.id.titleTv;
                                                                                        if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.titleTv)) != null) {
                                                                                            i10 = R.id.tool_bar_view;
                                                                                            View u7 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.tool_bar_view);
                                                                                            if (u7 != null) {
                                                                                                i10 = R.id.tools_line;
                                                                                                View u10 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.tools_line);
                                                                                                if (u10 != null) {
                                                                                                    i10 = R.id.total_index_tv;
                                                                                                    TextView textView4 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.total_index_tv);
                                                                                                    if (textView4 != null) {
                                                                                                        i10 = R.id.view_pager;
                                                                                                        ViewPager2 viewPager2 = (ViewPager2) com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_pager);
                                                                                                        if (viewPager2 != null) {
                                                                                                            v0 v0Var = new v0((ConstraintLayout) inflate, appCompatImageView, appCompatImageView2, linearLayout, textView, textView2, appCompatImageView3, linearLayout2, appCompatImageView4, oCRTrialGuideView, appCompatImageView5, linearLayout3, linearLayout4, textView3, appCompatImageView6, u7, u10, textView4, viewPager2);
                                                                                                            ea.a.p("Wm4tbBJ0BygbblJsCHQzcmggUW8odCJpJmUHLHdmLWxAZSk=", "HuWLwJG5");
                                                                                                            return v0Var;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(ea.a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpEGhYSS86IA==", "ZUZndxku").concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final void q0(Bundle bundle) {
        OCRWorkFlow oCRWorkFlow;
        String string;
        Bundle bundle2 = this.f3674g;
        if (bundle2 != null && (string = bundle2.getString(ea.a.p("JGVIXxZjRV8qci92HGUfX1NyAW0=", "LrMrrkNu"))) != null) {
            oCRWorkFlow = OCRWorkFlow.valueOf(string);
        } else {
            oCRWorkFlow = null;
        }
        this.f25176j0 = oCRWorkFlow;
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final void r0() {
        tf.c cVar = ScanEventCenter.f28674a;
        ScanEventCenter.g(ea.a.p("IGNy", "18hP23YQ"));
        VB vb2 = this.Y;
        g.b(vb2);
        pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.a x02 = x0();
        ViewPager2 viewPager2 = ((v0) vb2).f1547s;
        viewPager2.setAdapter(x02);
        viewPager2.setCurrentItem(0);
        viewPager2.setOffscreenPageLimit(1);
        this.f25178l0 = 0;
        viewPager2.setPageTransformer(new zo.a(v().getDimensionPixelSize(R.dimen.dp_28), new c()));
        viewPager2.f(new d());
        VB vb3 = this.Y;
        g.b(vb3);
        ((v0) vb3).f1539k.setOnClickListener(new u4.g(this, 8));
        VB vb4 = this.Y;
        g.b(vb4);
        ((v0) vb4).f1537i.setOnClickListener(new u4.j(this, 10));
        VB vb5 = this.Y;
        g.b(vb5);
        ((v0) vb5).f1535g.setOnClickListener(new f(this, 8));
        VB vb6 = this.Y;
        g.b(vb6);
        ((v0) vb6).f1531b.setOnClickListener(new j0(this, 8));
        VB vb7 = this.Y;
        g.b(vb7);
        ((v0) vb7).f1540l.setOnClickListener(new f5.d(this, 10));
        VB vb8 = this.Y;
        g.b(vb8);
        ((v0) vb8).f1541m.setOnClickListener(new f5.e(this, 8));
        VB vb9 = this.Y;
        g.b(vb9);
        ((v0) vb9).f1532d.setOnClickListener(new k9.c(this, 6));
        VB vb10 = this.Y;
        g.b(vb10);
        String p10 = ea.a.p("UWklZBpuBS4XeEByCGMiTCV5XXV0", "DWaKSnlW");
        LinearLayout linearLayout = ((v0) vb10).f1536h;
        g.d(linearLayout, p10);
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(linearLayout, new l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRPreviewFragment$initView$9
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ d invoke(View view) {
                invoke2(view);
                return d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(final View it) {
                g.e(it, "it");
                tn.a.b(ScanEventCenter.a(), ea.a.p("UHIkcA==", "a8CJX7qy"), ea.a.p("LHJecCZlT3Q7Yz5fFmwBY2s=", "lCmdZEsl"));
                OCRPreviewFragment oCRPreviewFragment = OCRPreviewFragment.this;
                OCRPreviewFragment.a aVar = OCRPreviewFragment.f25168p0;
                VB vb11 = oCRPreviewFragment.Y;
                g.b(vb11);
                ((v0) vb11).f1538j.r();
                OCRStateManager.a aVar2 = OCRStateManager.f25059a;
                final OCRPreviewFragment oCRPreviewFragment2 = OCRPreviewFragment.this;
                cg.a<d> aVar3 = new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRPreviewFragment$initView$9.1
                    {
                        super(0);
                    }

                    @Override // cg.a
                    public /* bridge */ /* synthetic */ d invoke() {
                        invoke2();
                        return d.f30009a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        OCRPreviewFragment oCRPreviewFragment3 = OCRPreviewFragment.this;
                        OCRPreviewFragment.a aVar4 = OCRPreviewFragment.f25168p0;
                        oCRPreviewFragment3.A0();
                    }
                };
                final OCRPreviewFragment oCRPreviewFragment3 = OCRPreviewFragment.this;
                cg.a<d> aVar4 = new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRPreviewFragment$initView$9.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // cg.a
                    public /* bridge */ /* synthetic */ d invoke() {
                        invoke2();
                        return d.f30009a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        OCRPreviewFragment.this.f25177k0 = true;
                        BillingConfigImpl.c.getClass();
                        BillingConfigImpl.f24865s.c(BillingConfigImpl.f24850d[3], Boolean.TRUE);
                        BaseSubscriptionActivity.a aVar5 = BaseSubscriptionActivity.L;
                        Context context = it.getContext();
                        g.d(context, ea.a.p("JnQfYxZuQ2UidA==", "Bx3yRhfT"));
                        String p11 = ea.a.p("IGNy", "JGYj1AQI");
                        aVar5.getClass();
                        BaseSubscriptionActivity.a.a(context, p11);
                    }
                };
                aVar2.getClass();
                OCRStateManager.a.a(aVar3, aVar4);
            }
        });
        VB vb11 = this.Y;
        g.b(vb11);
        String p11 = ea.a.p("LWlfZBBuUC4pdShzFnIBYlBJA2c=", "3wBuRgjf");
        AppCompatImageView appCompatImageView = ((v0) vb11).f1543o;
        g.d(appCompatImageView, p11);
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = -v().getDimensionPixelSize(R.dimen.dp_9);
            bVar.setMarginEnd(-v().getDimensionPixelSize(R.dimen.dp_8));
            appCompatImageView.setLayoutParams(bVar);
            VB vb12 = this.Y;
            g.b(vb12);
            String p12 = ea.a.p("Omk7ZFBuMi47dQRzV3I-Yl1GIGUsVHY=", "CkXU9UQP");
            TextView textView = ((v0) vb12).f1542n;
            g.d(textView, p12);
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            if (layoutParams2 != null) {
                ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
                ((ViewGroup.MarginLayoutParams) bVar2).topMargin = -v().getDimensionPixelSize(R.dimen.dp_7);
                bVar2.setMarginEnd(-v().getDimensionPixelSize(R.dimen.dp_4));
                textView.setLayoutParams(bVar2);
                OCRStateManager.a aVar = OCRStateManager.f25059a;
                OCRPreviewFragment$refreshOCRState$1 oCRPreviewFragment$refreshOCRState$1 = new OCRPreviewFragment$refreshOCRState$1(this);
                aVar.getClass();
                OCRStateManager.a.b(oCRPreviewFragment$refreshOCRState$1);
                return;
            }
            throw new NullPointerException(ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuO25UbhRsKiBHeTtlU2EMZABvXWQRLjVvKnNGcidpLXQ4YQBvFHRod1pkLGUHLiFvHHNAcghpOHQIYUtvM3RtTDV5FnUVUCdyUm1z", "TyaFoLyr"));
        }
        throw new NullPointerException(ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuJm4VbhtsBSBHeTtlU2EMZABvXWQRLjVvKnNGcidpLXQlYUFvG3RHd1pkLGUHLiFvHHNAcghpOHQIYUtvM3RtTCh5V3UaUAhyUm1z", "I8niBoSV"));
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final void s0() {
        pdf.pdfreader.viewer.editor.free.feature.ocr.helper.a.f25069b.e(this, new e(new l<List<um.a>, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRPreviewFragment$initViewModel$1
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ d invoke(List<um.a> list) {
                invoke2(list);
                return d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(List<um.a> list) {
                if (list == null) {
                    return;
                }
                OCRPreviewFragment oCRPreviewFragment = OCRPreviewFragment.this;
                OCRPreviewFragment.a aVar = OCRPreviewFragment.f25168p0;
                pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.a x02 = oCRPreviewFragment.x0();
                x02.getClass();
                x02.h().clear();
                x02.h().addAll(list);
                x02.notifyDataSetChanged();
                VB vb2 = OCRPreviewFragment.this.Y;
                g.b(vb2);
                ((v0) vb2).f1546r.setText(String.valueOf(list.size()));
            }
        }));
        t0.d0(b.b.x(this), null, null, new OCRPreviewFragment$initViewModel$2(this, null), 3);
        t0.d0(b.b.x(this), null, null, new OCRPreviewFragment$initViewModel$3(this, null), 3);
    }

    public final void u0(ul.c cVar) {
        int i10;
        int i11;
        boolean z10 = cVar.f30428e;
        VB vb2 = this.Y;
        g.b(vb2);
        v0 v0Var = (v0) vb2;
        if (!z10) {
            i10 = R.drawable.ic_scan_crop_setting;
        } else {
            i10 = R.drawable.ic_image_adjust_no_crop;
        }
        v0Var.c.setImageResource(i10);
        VB vb3 = this.Y;
        g.b(vb3);
        v0 v0Var2 = (v0) vb3;
        if (!z10) {
            i11 = R.string.arg_res_0x7f130080;
        } else {
            i11 = R.string.arg_res_0x7f1302c2;
        }
        v0Var2.f1533e.setText(x(i11));
    }

    public final String v0(OcrUploadResult ocrUploadResult) {
        int i10 = b.f25183b[ocrUploadResult.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return ea.a.p("BmRUbg1p", "ydKotPxw");
            }
            return ea.a.p("XWU_dxxyaw==", "WBtzHDna");
        }
        return ea.a.p("RnAnbxJk", "zO6agP8B");
    }

    public final pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.a x0() {
        return (pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.a) this.f25169c0.getValue();
    }

    public final OCRResultViewModel y0() {
        return (OCRResultViewModel) this.f25171e0.getValue();
    }

    public final void z0(int i10, int i11) {
        String valueOf;
        int i12;
        int i13;
        VB vb2 = this.Y;
        g.b(vb2);
        v0 v0Var = (v0) vb2;
        if (i10 >= i11) {
            valueOf = String.valueOf(i11);
        } else {
            valueOf = String.valueOf(i10 + 1);
        }
        v0Var.f1534f.setText(valueOf);
        VB vb3 = this.Y;
        g.b(vb3);
        ((v0) vb3).f1546r.setText(String.valueOf(i11));
        VB vb4 = this.Y;
        g.b(vb4);
        v0 v0Var2 = (v0) vb4;
        int i14 = 4;
        if (i10 == 0) {
            i12 = 4;
        } else {
            i12 = 0;
        }
        v0Var2.f1539k.setVisibility(i12);
        VB vb5 = this.Y;
        g.b(vb5);
        v0 v0Var3 = (v0) vb5;
        if (i10 >= i11 - 1) {
            i13 = 4;
        } else {
            i13 = 0;
        }
        v0Var3.f1537i.setVisibility(i13);
        VB vb6 = this.Y;
        g.b(vb6);
        v0 v0Var4 = (v0) vb6;
        if (i11 > 1) {
            i14 = 0;
        }
        v0Var4.f1535g.setVisibility(i14);
    }

    /* compiled from: OCRPreviewFragment.kt */
    /* loaded from: classes3.dex */
    public static final class c implements zo.b {
        @Override // zo.b
        public final void a(View view, float f10) {
        }
    }
}
