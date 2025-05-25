package pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.inquiry;

import am.t0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g0;
import androidx.fragment.app.h;
import androidx.fragment.app.y0;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.x;
import cg.l;
import com.google.android.play.core.assetpacks.c;
import ea.a;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.i;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.base.BaseVMFragment;
import pdf.pdfreader.viewer.editor.free.feature.guide.data.InquiryAfterGuideType;
import pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.inquiry.InquiryAfterGuideFragment;
import pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.inquiry.InquiryAfterGuidePageFragment;
import pdf.pdfreader.viewer.editor.free.feature.guide.vm.InquiryAfterGuideViewModel;
import pdf.pdfreader.viewer.editor.free.feature.guide.vm.UserGuideViewModel;
import tf.d;
import u4.j;
import x0.f0;
import x0.n0;

/* compiled from: InquiryAfterGuideFragment.kt */
/* loaded from: classes3.dex */
public final class InquiryAfterGuideFragment extends BaseVMFragment<t0> {

    /* renamed from: e0  reason: collision with root package name */
    public static final a f25030e0;

    /* renamed from: c0  reason: collision with root package name */
    public final k0 f25031c0 = y0.a(this, i.a(InquiryAfterGuideViewModel.class), new cg.a<o0>() { // from class: pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.inquiry.InquiryAfterGuideFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final o0 invoke() {
            o0 viewModelStore = Fragment.this.f0().getViewModelStore();
            g.d(viewModelStore, a.p("A2UEdV1yJ0ErdA92XXQuKBEuJGksd3tvEGUdUyVvMGU=", "1Tqu4Bgj"));
            return viewModelStore;
        }
    }, new cg.a<n1.a>() { // from class: pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.inquiry.InquiryAfterGuideFragment$special$$inlined$activityViewModels$default$2
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
                g.d(defaultViewModelCreationExtras, a.p("QWU6dRpyB0ERdF12AHQvKG0uVmUgYTZsPVY6ZTVNDGRWbAhyFmEWaR1ucXgdcjdz", "ISBcqYbC"));
                return defaultViewModelCreationExtras;
            }
            return aVar;
        }
    }, new cg.a<m0.b>() { // from class: pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.inquiry.InquiryAfterGuideFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final m0.b invoke() {
            m0.b defaultViewModelProviderFactory = Fragment.this.f0().getDefaultViewModelProviderFactory();
            g.d(defaultViewModelProviderFactory, a.p("RmUzdRhyFEErdA92XXQuKBEuNmUvYUNsAFYYZSZNLWRRbBJyHnYYZC1yIGFXdDhyeQ==", "T24BqqcX"));
            return defaultViewModelProviderFactory;
        }
    });

    /* renamed from: d0  reason: collision with root package name */
    public final k0 f25032d0 = y0.a(this, i.a(UserGuideViewModel.class), new cg.a<o0>() { // from class: pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.inquiry.InquiryAfterGuideFragment$special$$inlined$activityViewModels$default$4
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final o0 invoke() {
            o0 viewModelStore = Fragment.this.f0().getViewModelStore();
            g.d(viewModelStore, a.p("FWVGdS5yDEErdA92XXQuKBEuJGksd3tvEGUdUyVvMGU=", "MVg7Gi4W"));
            return viewModelStore;
        }
    }, new cg.a<n1.a>() { // from class: pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.inquiry.InquiryAfterGuideFragment$special$$inlined$activityViewModels$default$5
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
                g.d(defaultViewModelCreationExtras, a.p("PWVAdRByUkE5dCN2HHQRKBwuCmUjYRBsAFYDZTpNAWQqbHJyHGFDaTVuD3gBcglz", "z6L6tjMn"));
                return defaultViewModelCreationExtras;
            }
            return aVar;
        }
    }, new cg.a<m0.b>() { // from class: pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.inquiry.InquiryAfterGuideFragment$special$$inlined$activityViewModels$default$6
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final m0.b invoke() {
            m0.b defaultViewModelProviderFactory = Fragment.this.f0().getDefaultViewModelProviderFactory();
            g.d(defaultViewModelProviderFactory, a.p("QWU6dRpyB0ERdF12AHQvKG0uVmUgYTZsRFYGZRhNPWRWbBtyHHYLZBdycmEKdDlyeQ==", "0ooRmQ6g"));
            return defaultViewModelProviderFactory;
        }
    });

    /* compiled from: InquiryAfterGuideFragment.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static void a(g0 g0Var, int i10, boolean z10) {
            int i11;
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(g0Var);
            if (z10) {
                i11 = R.anim.slide_bottom_in;
            } else {
                i11 = 0;
            }
            aVar.e(i11, 0);
            aVar.d(i10, new InquiryAfterGuideFragment(), ea.a.p("em46dRpyG0EUdFFyLnU_ZCFGQGEhbSZudA==", "mvIVotU0"));
            if (!aVar.f3903g) {
                aVar.f3733p.z(aVar, true);
                return;
            }
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
    }

    /* compiled from: InquiryAfterGuideFragment.kt */
    /* loaded from: classes3.dex */
    public static final class b implements x, e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f25033a;

        public b(l lVar) {
            ea.a.p("KXVfYw1pWG4=", "bKibOYLN");
            this.f25033a = lVar;
        }

        @Override // kotlin.jvm.internal.e
        public final l a() {
            return this.f25033a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof x) && (obj instanceof e)) {
                return g.a(this.f25033a, ((e) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return this.f25033a.hashCode();
        }

        @Override // androidx.lifecycle.x
        public final /* synthetic */ void m(Object obj) {
            this.f25033a.invoke(obj);
        }
    }

    static {
        ea.a.p("OG4ZdV9yGkEudANyc3U-ZF1GIGEubVNudA==", "tFqh6cx4");
        f25030e0 = new a();
    }

    public static final t0 t0(InquiryAfterGuideFragment inquiryAfterGuideFragment) {
        VB vb2 = inquiryAfterGuideFragment.Y;
        g.b(vb2);
        return (t0) vb2;
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final t0 p0(LayoutInflater inflater, ViewGroup viewGroup) {
        g.e(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_inquiry_after_guide, viewGroup, false);
        int i10 = R.id.backIv;
        AppCompatImageView appCompatImageView = (AppCompatImageView) c.u(inflate, R.id.backIv);
        if (appCompatImageView != null) {
            i10 = R.id.container;
            FrameLayout frameLayout = (FrameLayout) c.u(inflate, R.id.container);
            if (frameLayout != null) {
                i10 = R.id.continueTv;
                AppCompatTextView appCompatTextView = (AppCompatTextView) c.u(inflate, R.id.continueTv);
                if (appCompatTextView != null) {
                    i10 = R.id.topSpace;
                    Space space = (Space) c.u(inflate, R.id.topSpace);
                    if (space != null) {
                        t0 t0Var = new t0((ConstraintLayout) inflate, appCompatImageView, frameLayout, appCompatTextView, space);
                        ea.a.p("Jm5XbBh0UigzbixsFHQNchkgDW8rdARpO2UQLG9mBmw8ZSk=", "BknIUbOg");
                        return t0Var;
                    }
                }
            }
        }
        throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpF2hRSTQ6IA==", "cqpyUSzd").concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final void r0() {
        InquiryAfterGuidePageFragment a10;
        VB vb2 = this.Y;
        g.b(vb2);
        String p10 = ea.a.p("LWlfZBBuUC4ubzpTBWELZQ==", "poIObvTf");
        Space space = ((t0) vb2).f1465e;
        g.d(space, p10);
        VB vb3 = this.Y;
        g.b(vb3);
        h hVar = new h(6, this, space);
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        f0.i.u(((t0) vb3).f1462a, hVar);
        if (q().H().isEmpty()) {
            InquiryAfterGuideViewModel u02 = u0();
            zl.c cVar = zl.c.c;
            cVar.getClass();
            ig.h<Object>[] hVarArr = zl.c.f32417d;
            if (((Number) zl.c.f32420g.b(hVarArr[2])).intValue() == 0) {
                a10 = u02.e();
            } else {
                cVar.getClass();
                zl.c.f32421h.c(hVarArr[3], 1);
                InquiryAfterGuideType inquiryAfterGuideType = InquiryAfterGuideType.FEATURE;
                u02.f25040d.c(inquiryAfterGuideType, ea.a.p("LHVDchxuQ1A7Zy9GB2EPbVBuGlQ8cGU=", "s6AJWC2M"));
                u02.f25045i = inquiryAfterGuideType;
                InquiryAfterGuidePageFragment.f25034e0.getClass();
                a10 = InquiryAfterGuidePageFragment.a.a(inquiryAfterGuideType);
            }
            g0 q5 = q();
            q5.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(q5);
            VB vb4 = this.Y;
            g.b(vb4);
            aVar.d(((t0) vb4).c.getId(), a10, null);
            aVar.i();
        }
        VB vb5 = this.Y;
        g.b(vb5);
        ((t0) vb5).f1463b.setOnClickListener(new u4.g(this, 7));
        VB vb6 = this.Y;
        g.b(vb6);
        ((t0) vb6).f1464d.setOnClickListener(new j(this, 9));
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final void s0() {
        InquiryAfterGuideViewModel u02 = u0();
        u02.f25043g.e(A(), new b(new l<Set<? extends Integer>, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.inquiry.InquiryAfterGuideFragment$initViewModel$1
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ d invoke(Set<? extends Integer> set) {
                invoke2((Set<Integer>) set);
                return d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Set<Integer> set) {
                if (set == null) {
                    return;
                }
                InquiryAfterGuideFragment inquiryAfterGuideFragment = InquiryAfterGuideFragment.this;
                InquiryAfterGuideFragment.a aVar = InquiryAfterGuideFragment.f25030e0;
                if (inquiryAfterGuideFragment.u0().f25045i == InquiryAfterGuideType.ROLE) {
                    if (set.isEmpty()) {
                        InquiryAfterGuideFragment.t0(InquiryAfterGuideFragment.this).f1464d.setEnabled(false);
                        InquiryAfterGuideFragment.t0(InquiryAfterGuideFragment.this).f1464d.setAlpha(0.3f);
                        return;
                    }
                    InquiryAfterGuideFragment.t0(InquiryAfterGuideFragment.this).f1464d.setEnabled(true);
                    InquiryAfterGuideFragment.t0(InquiryAfterGuideFragment.this).f1464d.setAlpha(1.0f);
                }
            }
        }));
        InquiryAfterGuideViewModel u03 = u0();
        u03.f25044h.e(A(), new b(new l<Set<? extends Integer>, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.inquiry.InquiryAfterGuideFragment$initViewModel$2
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ d invoke(Set<? extends Integer> set) {
                invoke2((Set<Integer>) set);
                return d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Set<Integer> set) {
                if (set == null) {
                    return;
                }
                InquiryAfterGuideFragment inquiryAfterGuideFragment = InquiryAfterGuideFragment.this;
                InquiryAfterGuideFragment.a aVar = InquiryAfterGuideFragment.f25030e0;
                if (inquiryAfterGuideFragment.u0().f25045i == InquiryAfterGuideType.FEATURE) {
                    if (set.isEmpty()) {
                        InquiryAfterGuideFragment.t0(InquiryAfterGuideFragment.this).f1464d.setEnabled(false);
                        InquiryAfterGuideFragment.t0(InquiryAfterGuideFragment.this).f1464d.setAlpha(0.3f);
                        return;
                    }
                    InquiryAfterGuideFragment.t0(InquiryAfterGuideFragment.this).f1464d.setEnabled(true);
                    InquiryAfterGuideFragment.t0(InquiryAfterGuideFragment.this).f1464d.setAlpha(1.0f);
                }
            }
        }));
        pdf.pdfreader.viewer.editor.free.utils.t0.d0(b.b.x(this), null, null, new InquiryAfterGuideFragment$initViewModel$3(this, null), 3);
    }

    public final InquiryAfterGuideViewModel u0() {
        return (InquiryAfterGuideViewModel) this.f25031c0.getValue();
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final void q0(Bundle bundle) {
    }
}
