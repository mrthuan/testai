package pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h;
import androidx.fragment.app.u;
import androidx.fragment.app.y0;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.airbnb.lottie.LottieAnimationView;
import el.e;
import i2.a;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.i;
import lib.zj.office.system.l;
import no.f;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.FullScreenManage;
import pdf.pdfreader.viewer.editor.free.ads.InterstitialAdState;
import pdf.pdfreader.viewer.editor.free.ads.e;
import pdf.pdfreader.viewer.editor.free.base.BaseVMFragment;
import pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.BaseUserGuideTestFragment;
import pdf.pdfreader.viewer.editor.free.feature.guide.vm.UserGuideViewModel;
import pdf.pdfreader.viewer.editor.free.utils.event.AppCoreFilterEvent;
import pdf.pdfreader.viewer.editor.free.utils.event.AppOpenSource;
import pdf.pdfreader.viewer.editor.free.utils.event.UserGuideEvent;
import u.j;
import x0.f0;
import x0.j0;
import x0.n0;

/* compiled from: BaseUserGuideTestFragment.kt */
/* loaded from: classes3.dex */
public abstract class BaseUserGuideTestFragment<VB extends i2.a> extends BaseVMFragment<VB> {

    /* renamed from: h0  reason: collision with root package name */
    public static final a f24996h0;

    /* renamed from: c0  reason: collision with root package name */
    public final k0 f24997c0 = y0.a(this, i.a(UserGuideViewModel.class), new cg.a<o0>() { // from class: pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.BaseUserGuideTestFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final o0 invoke() {
            o0 viewModelStore = Fragment.this.f0().getViewModelStore();
            g.d(viewModelStore, ea.a.p("PmUTdS1yFEErdA92XXQuKBEuJGksd3tvEGUdUyVvMGU=", "7mLbDq9D"));
            return viewModelStore;
        }
    }, new cg.a<n1.a>() { // from class: pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.BaseUserGuideTestFragment$special$$inlined$activityViewModels$default$2
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
                g.d(defaultViewModelCreationExtras, ea.a.p("PWVAdRByUkE5dCN2HHQRKBwuCmUjYRBsNlYOZQRNBWQqbHJyHGFDaTVuD3gBcglz", "Q4RbBgsj"));
                return defaultViewModelCreationExtras;
            }
            return aVar;
        }
    }, new cg.a<m0.b>() { // from class: pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.BaseUserGuideTestFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final m0.b invoke() {
            m0.b defaultViewModelProviderFactory = Fragment.this.f0().getDefaultViewModelProviderFactory();
            g.d(defaultViewModelProviderFactory, ea.a.p("QWU6dRpyB0ERdF12AHQvKG0uVmUgYTZsLVYgZT9NWmRWbBtyHHYLZBdycmEKdDlyeQ==", "YIH5Kyh2"));
            return defaultViewModelProviderFactory;
        }
    });

    /* renamed from: d0  reason: collision with root package name */
    public AnimationSet f24998d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f24999e0;

    /* renamed from: f0  reason: collision with root package name */
    public ValueAnimator f25000f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f25001g0;

    /* compiled from: BaseUserGuideTestFragment.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    /* compiled from: BaseUserGuideTestFragment.kt */
    /* loaded from: classes3.dex */
    public static final class b extends ViewPager2.g {

        /* renamed from: a  reason: collision with root package name */
        public int f25002a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f25003b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ BaseUserGuideTestFragment<VB> f25004d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ ViewPager2 f25005e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ImageView f25006f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ ImageView f25007g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ ImageView f25008h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ TextView f25009i;

        public b(BaseUserGuideTestFragment<VB> baseUserGuideTestFragment, ViewPager2 viewPager2, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView) {
            this.f25004d = baseUserGuideTestFragment;
            this.f25005e = viewPager2;
            this.f25006f = imageView;
            this.f25007g = imageView2;
            this.f25008h = imageView3;
            this.f25009i = textView;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void a(int i10) {
            ea.a.p("G3NScn91L2QtVANzQEYlYV9tN250", "4TN78FZg");
            this.f25003b = i10;
            if (i10 == 0 && this.c) {
                this.c = false;
                int i11 = this.f25002a;
                a aVar = BaseUserGuideTestFragment.f24996h0;
                this.f25004d.E0(i11, this.f25005e, false);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void c(int i10) {
            ea.a.p("DXMwcg91UWQtVANzQEYlYV9tN250", "wjXUH8Mi");
            int i11 = this.f25003b;
            ViewPager2 viewPager2 = this.f25005e;
            BaseUserGuideTestFragment<VB> baseUserGuideTestFragment = this.f25004d;
            if (i11 == 0) {
                a aVar = BaseUserGuideTestFragment.f24996h0;
                baseUserGuideTestFragment.E0(i10, viewPager2, false);
                this.c = false;
            } else {
                this.c = true;
            }
            ValueAnimator valueAnimator = baseUserGuideTestFragment.f25000f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            TextView textView = this.f25009i;
            ImageView imageView = this.f25008h;
            ImageView imageView2 = this.f25007g;
            ImageView imageView3 = this.f25006f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        imageView3.setSelected(false);
                        imageView2.setSelected(false);
                        imageView.setSelected(true);
                        textView.setText(textView.getContext().getString(R.string.arg_res_0x7f13049a));
                    }
                } else {
                    imageView3.setSelected(false);
                    imageView2.setSelected(true);
                    imageView.setSelected(false);
                    textView.setText(textView.getContext().getString(R.string.arg_res_0x7f1302a8));
                }
            } else {
                imageView3.setSelected(true);
                imageView2.setSelected(false);
                imageView.setSelected(false);
                textView.setText(textView.getContext().getString(R.string.arg_res_0x7f1302a8));
            }
            ValueAnimator valueAnimator2 = baseUserGuideTestFragment.f25000f0;
            if (valueAnimator2 != null) {
                valueAnimator2.start();
            }
            int i12 = this.f25002a;
            if (i12 < i10) {
                if (i12 != -1) {
                    tf.c cVar = UserGuideEvent.f28678b;
                    if (!((Set) cVar.getValue()).contains(Integer.valueOf(i12))) {
                        ((Set) cVar.getValue()).add(Integer.valueOf(i12));
                        if (wn.b.f31389e) {
                            Context m10 = ReaderPdfApplication.m();
                            String p10 = ea.a.p("XWU8Zh9vdw==", "Ym6PGSQe");
                            String p11 = ea.a.p("KHVYZBxuUncFbi94AV8LbFxjaw==", "ZDbnRfjd");
                            f.b(ReaderPdfApplication.m()).getClass();
                            String c = f.c();
                            tn.a.d(m10, p10, p11, c + "_page" + (i12 + 1), false);
                        }
                    }
                }
                baseUserGuideTestFragment.F0(i10, viewPager2, false);
            } else if (i12 > i10) {
                viewPager2.postDelayed(new j(baseUserGuideTestFragment, i12, viewPager2, 2), 100L);
            }
            this.f25002a = i10;
            baseUserGuideTestFragment.f24999e0 = i10;
            tf.c cVar2 = UserGuideEvent.f28677a;
            if (!((Set) cVar2.getValue()).contains(Integer.valueOf(i10))) {
                ((Set) cVar2.getValue()).add(Integer.valueOf(i10));
                if (wn.b.f31389e) {
                    if (i10 < 3) {
                        if (AppCoreFilterEvent.f28650a == AppOpenSource.Desk) {
                            AppCoreFilterEvent.g(ea.a.p("VHUqZB9uNHcXcAdnUTE=", "co3CzQXH"));
                        }
                    } else if (AppCoreFilterEvent.f28650a == AppOpenSource.Desk) {
                        AppCoreFilterEvent.g(ea.a.p("EHNabhZ3KXApZwMx", "Kmq1sv27"));
                    }
                    Context m11 = ReaderPdfApplication.m();
                    String p12 = ea.a.p("IWVGZhVvdw==", "ulp4LCD1");
                    String p13 = ea.a.p("DnUEZCJuKHcXcw5vdw==", "7wimGMNV");
                    f.b(ReaderPdfApplication.m()).getClass();
                    String c10 = f.c();
                    tn.a.d(m11, p12, p13, c10 + "_page" + (i10 + 1), false);
                }
            }
            baseUserGuideTestFragment.D0(i10);
        }
    }

    /* compiled from: Animator.kt */
    /* loaded from: classes3.dex */
    public static final class c implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BaseUserGuideTestFragment f25010a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ImageView f25011b;
        public final /* synthetic */ ImageView c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ImageView f25012d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ int f25013e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f25014f;

        public c(int i10, int i11, ImageView imageView, ImageView imageView2, ImageView imageView3, BaseUserGuideTestFragment baseUserGuideTestFragment) {
            this.f25010a = baseUserGuideTestFragment;
            this.f25011b = imageView;
            this.c = imageView2;
            this.f25012d = imageView3;
            this.f25013e = i10;
            this.f25014f = i11;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            g.e(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            int i10;
            int i11;
            g.e(animator, "animator");
            a aVar = BaseUserGuideTestFragment.f24996h0;
            if (this.f25010a.Z) {
                ImageView imageView = this.f25011b;
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams != null) {
                    boolean isSelected = imageView.isSelected();
                    int i12 = this.f25013e;
                    int i13 = this.f25014f;
                    if (isSelected) {
                        i10 = i12;
                    } else {
                        i10 = i13;
                    }
                    layoutParams.width = i10;
                    imageView.setLayoutParams(layoutParams);
                    ImageView imageView2 = this.c;
                    ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
                    if (layoutParams2 != null) {
                        if (imageView2.isSelected()) {
                            i11 = i12;
                        } else {
                            i11 = i13;
                        }
                        layoutParams2.width = i11;
                        imageView2.setLayoutParams(layoutParams2);
                        ImageView imageView3 = this.f25012d;
                        ViewGroup.LayoutParams layoutParams3 = imageView3.getLayoutParams();
                        if (layoutParams3 != null) {
                            if (!imageView3.isSelected()) {
                                i12 = i13;
                            }
                            layoutParams3.width = i12;
                            imageView3.setLayoutParams(layoutParams3);
                            return;
                        }
                        throw new NullPointerException(ea.a.p("XXVebFpjEG4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiBHeUJlWmEfZDpvD2Qadj5lTy4EaSx3cXIbdQEuHWE7b0Z0YmEIYRxz", "Pb32zqoQ"));
                    }
                    throw new NullPointerException(ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuKG5Ybj9sKyBHeTtlU2EMZABvXWRHdj9lMy5kaSN3BHIodQUuBmE-b0Z0G2EBYQ9z", "GuJGCQ1a"));
                }
                throw new NullPointerException(ea.a.p("PnUkbGFjKG4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiAkeThlYWEnZDpvD2Qadj5lTy4EaSx3cXIbdQEuHWE7byV0GGEzYSRz", "X4PHAIsX"));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            g.e(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            g.e(animator, "animator");
        }
    }

    static {
        ea.a.p("OnM9ch11JmQtVANzQEYlYV9tN250", "9koXZOjy");
        f24996h0 = new a();
    }

    public static void t0(ImageView imageView, int i10, int i11) {
        if (!imageView.isSelected()) {
            if (imageView.getMeasuredWidth() > i11) {
                i10 = i11;
            } else {
                i10 = -1;
            }
        }
        if (i10 > 0) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = i10;
                imageView.setLayoutParams(layoutParams);
                return;
            }
            throw new NullPointerException(ea.a.p("BHVabHZjBW4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiAeeUZldmEKZDpvD2Qadj5lTy4EaSx3cXIbdQEuHWE7bx90ZmEkYQlz", "i4j6Vd9y"));
        }
    }

    public abstract Space A0();

    public abstract ViewPager2 B0();

    public final void C0() {
        Context r4 = r();
        if (r4 == null) {
            return;
        }
        f.b(r4).getClass();
        if (!f.f()) {
            return;
        }
        tf.c cVar = FullScreenManage.f23914a;
        u i10 = i();
        if (i10 == null) {
            return;
        }
        this.f25001g0 = FullScreenManage.d(i10, null, 5, false);
    }

    public void D0(int i10) {
        boolean z10;
        Context r4 = r();
        if (r4 == null) {
            return;
        }
        f.b(r4).getClass();
        if (!f.f()) {
            return;
        }
        if (!this.f25001g0) {
            if (e.m().f23924h == InterstitialAdState.FAIL) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return;
            }
        }
        C0();
    }

    public final void E0(int i10, ViewPager2 viewPager2, boolean z10) {
        RecyclerView recyclerView;
        RecyclerView.m mVar;
        LottieAnimationView lottieAnimationView;
        if (!this.Z) {
            return;
        }
        View childAt = viewPager2.getChildAt(0);
        tf.d dVar = null;
        if (childAt instanceof RecyclerView) {
            recyclerView = (RecyclerView) childAt;
        } else {
            recyclerView = null;
        }
        if (recyclerView != null) {
            mVar = recyclerView.getLayoutManager();
        } else {
            mVar = null;
        }
        if (mVar != null) {
            View C = mVar.C(i10);
            if (C != null && (lottieAnimationView = (LottieAnimationView) C.findViewById(R.id.animView)) != null) {
                ea.a.p("VWklZCVpB3cweX1kVUw5dDBpV0EoaS5hBmkcbmFpVXcNKBkuGmRMYRxpWVYAZSEp", "rs70mg3g");
                if (lottieAnimationView.getImageAssetsFolder() != null) {
                    lottieAnimationView.setVisibility(0);
                    lottieAnimationView.setProgress(0.0f);
                    lottieAnimationView.j();
                }
                dVar = tf.d.f30009a;
            }
            if (dVar == null && !z10) {
                viewPager2.post(new l(this, i10, viewPager2, 1));
            }
        }
    }

    public final void F0(int i10, ViewPager2 viewPager2, boolean z10) {
        RecyclerView recyclerView;
        RecyclerView.m mVar;
        if (!this.Z) {
            return;
        }
        View childAt = viewPager2.getChildAt(0);
        tf.d dVar = null;
        if (childAt instanceof RecyclerView) {
            recyclerView = (RecyclerView) childAt;
        } else {
            recyclerView = null;
        }
        if (recyclerView != null) {
            mVar = recyclerView.getLayoutManager();
        } else {
            mVar = null;
        }
        if (mVar != null) {
            View C = mVar.C(i10);
            if (C != null) {
                TextView textView = (TextView) C.findViewById(R.id.titleTv);
                if (textView != null) {
                    ea.a.p("VWklZCVpB3cweX1kVVQzeDBWW2UxPmtSQmkzLi1pH2xWVD0p", "lWYkhWJ0");
                    textView.setVisibility(0);
                    G0(textView);
                }
                TextView textView2 = (TextView) C.findViewById(R.id.subtitleTv);
                if (textView2 != null) {
                    ea.a.p("VWklZCVpB3cweX1kVVQzeDBWW2UxPmtSe2lULit1E3RadCdlJ3Yp", "U0XqBmb7");
                    textView2.setVisibility(0);
                    G0(textView2);
                    dVar = tf.d.f30009a;
                }
            }
            if (dVar == null && !z10) {
                viewPager2.post(new pdf.pdfreader.viewer.editor.free.convert.opt.c(this, i10, viewPager2, 1));
            }
        }
    }

    public final void G0(TextView textView) {
        if (this.f24998d0 == null) {
            float dimensionPixelSize = v().getDimensionPixelSize(R.dimen.dp_120);
            Context context = textView.getContext();
            g.d(context, ea.a.p("RWkud11jDW4GZUx0", "P0Bsmivw"));
            if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(context)) {
                dimensionPixelSize = -dimensionPixelSize;
            }
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.5f, 1.0f);
            TranslateAnimation translateAnimation = new TranslateAnimation(dimensionPixelSize, 0.0f, 0.0f, 0.0f);
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.setDuration(350L);
            animationSet.addAnimation(alphaAnimation);
            animationSet.addAnimation(translateAnimation);
            this.f24998d0 = animationSet;
        }
        textView.startAnimation(this.f24998d0);
    }

    @Override // androidx.fragment.app.Fragment
    public final void O() {
        u i10 = i();
        if (i10 == null) {
            return;
        }
        f.b(i10).getClass();
        if (f.f()) {
            e.a aVar = el.e.f16807g;
            if (!aVar.a().f16812e && !aVar.a().c) {
                aVar.a().f16810b = null;
            } else {
                el.e a10 = aVar.a();
                if (a10.f16809a != null) {
                    el.e.a(ea.a.p("V2U4dAFvGyATZA==", "6PraB6vy"));
                }
                zd.d dVar = a10.f16809a;
                if (dVar != null) {
                    dVar.d(i10);
                }
                a10.f16809a = null;
                a10.f16812e = false;
                a10.f16811d = false;
                a10.c = false;
                a10.f16813f = null;
                a10.f16810b = null;
                el.e.f16808h = null;
            }
            FullScreenManage.g(5);
        }
        this.F = true;
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment, androidx.fragment.app.Fragment
    public final void P() {
        ValueAnimator valueAnimator = this.f25000f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f25000f0 = null;
        AnimationSet animationSet = this.f24998d0;
        if (animationSet != null) {
            animationSet.cancel();
        }
        this.f24998d0 = null;
        super.P();
    }

    @Override // androidx.fragment.app.Fragment
    public final void X(Bundle bundle) {
        bundle.putInt(ea.a.p("UHU5chZuFkkcZFF4", "xzsaXzkJ"), this.f24999e0);
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public void q0(Bundle bundle) {
        int i10;
        if (bundle != null) {
            i10 = bundle.getInt(ea.a.p("LHVDchxuQ0k0ZC94", "lMrhY6ny"));
        } else {
            i10 = 0;
        }
        this.f24999e0 = i10;
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    @SuppressLint({"ClickableViewAccessibility"})
    public void r0() {
        Object obj;
        Space A0 = A0();
        VB vb2 = this.Y;
        g.b(vb2);
        View b10 = vb2.b();
        h hVar = new h(5, this, A0);
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        f0.i.u(b10, hVar);
        final ViewPager2 B0 = B0();
        rm.a<? extends RecyclerView.b0> z02 = z0();
        final AppCompatImageView v02 = v0();
        final AppCompatImageView x02 = x0();
        final AppCompatImageView y02 = y0();
        AppCompatTextView u02 = u0();
        final int dimensionPixelSize = v().getDimensionPixelSize(R.dimen.dp_6);
        final int dimensionPixelSize2 = v().getDimensionPixelSize(R.dimen.dp_18);
        ValueAnimator ofInt = ValueAnimator.ofInt(dimensionPixelSize, dimensionPixelSize2);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseUserGuideTestFragment.a aVar = BaseUserGuideTestFragment.f24996h0;
                String p10 = ea.a.p("O2hYc10w", "LJQf1T8W");
                BaseUserGuideTestFragment baseUserGuideTestFragment = this;
                g.e(baseUserGuideTestFragment, p10);
                String p11 = ea.a.p("YWknZBxjKXQncjE=", "HdEIuHOb");
                ImageView imageView = v02;
                g.e(imageView, p11);
                String p12 = ea.a.p("F2klZBpjA3QdcjI=", "n48EagEn");
                ImageView imageView2 = x02;
                g.e(imageView2, p12);
                String p13 = ea.a.p("a2lfZBBjVnQ1cjM=", "AyoJlAkm");
                ImageView imageView3 = y02;
                g.e(imageView3, p13);
                g.e(valueAnimator, ea.a.p("JnQ=", "X2EMfMRT"));
                if (baseUserGuideTestFragment.Z) {
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    g.c(animatedValue, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuOG51bjBsKCA7eUFlWWtYdDZpJC48bnQ=", "KitoWXED"));
                    int intValue = ((Integer) animatedValue).intValue();
                    int i10 = dimensionPixelSize2 - (intValue - dimensionPixelSize);
                    BaseUserGuideTestFragment.t0(imageView, intValue, i10);
                    BaseUserGuideTestFragment.t0(imageView2, intValue, i10);
                    BaseUserGuideTestFragment.t0(imageView3, intValue, i10);
                }
            }
        });
        ea.a.p("Jm5YdC9pUnd-bCttF2QJJDc=", "NgzDgVzr");
        ofInt.addListener(new c(dimensionPixelSize2, dimensionPixelSize, v02, x02, y02, this));
        ofInt.setDuration(150L);
        this.f25000f0 = ofInt;
        B0.setAdapter(z02);
        B0.setCurrentItem(this.f24999e0);
        B0.f(new b(this, B0, v02, x02, y02, u02));
        final float f10 = B0.getContext().getResources().getDisplayMetrics().widthPixels / 5.0f;
        final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        j0 j0Var = new j0(B0);
        RecyclerView recyclerView = null;
        if (!j0Var.hasNext()) {
            obj = null;
        } else {
            obj = j0Var.next();
        }
        if (obj instanceof RecyclerView) {
            recyclerView = (RecyclerView) obj;
        }
        if (recyclerView != null) {
            recyclerView.setOnTouchListener(new View.OnTouchListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.b
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    BaseUserGuideTestFragment.a aVar = BaseUserGuideTestFragment.f24996h0;
                    String p10 = ea.a.p("YnNNYQR0WA==", "YJF9vXZx");
                    Ref$FloatRef ref$FloatRef2 = Ref$FloatRef.this;
                    g.e(ref$FloatRef2, p10);
                    String p11 = ea.a.p("R2gic1cw", "h5PlowX3");
                    BaseUserGuideTestFragment baseUserGuideTestFragment = this;
                    g.e(baseUserGuideTestFragment, p11);
                    String p12 = ea.a.p("a2l0", "Jib4zCQi");
                    ViewPager2 viewPager2 = B0;
                    g.e(viewPager2, p12);
                    int action = motionEvent.getAction();
                    if (action != 0) {
                        if (action == 1 && baseUserGuideTestFragment.f24999e0 == 2) {
                            float x4 = motionEvent.getX() - ref$FloatRef2.element;
                            int layoutDirection = viewPager2.getLayoutDirection();
                            k0 k0Var = baseUserGuideTestFragment.f24997c0;
                            float f11 = f10;
                            if (layoutDirection == 1) {
                                if (x4 > f11) {
                                    UserGuideEvent.c();
                                    UserGuideEvent.b();
                                    ((UserGuideViewModel) k0Var.getValue()).d();
                                    return false;
                                }
                                return false;
                            } else if ((-x4) > f11) {
                                UserGuideEvent.c();
                                UserGuideEvent.b();
                                ((UserGuideViewModel) k0Var.getValue()).d();
                                return false;
                            } else {
                                return false;
                            }
                        }
                        return false;
                    }
                    ref$FloatRef2.element = motionEvent.getX();
                    return false;
                }
            });
        }
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(u02, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.BaseUserGuideTestFragment$initView$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                invoke2(view);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                g.e(it, "it");
                if (ViewPager2.this.getCurrentItem() == 2) {
                    UserGuideEvent.c();
                    UserGuideEvent.b();
                    BaseUserGuideTestFragment<VB> baseUserGuideTestFragment = this;
                    BaseUserGuideTestFragment.a aVar = BaseUserGuideTestFragment.f24996h0;
                    ((UserGuideViewModel) baseUserGuideTestFragment.f24997c0.getValue()).d();
                    return;
                }
                ViewPager2 viewPager2 = ViewPager2.this;
                viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
            }
        });
        C0();
    }

    public abstract AppCompatTextView u0();

    public abstract AppCompatImageView v0();

    public abstract AppCompatImageView x0();

    public abstract AppCompatImageView y0();

    public abstract rm.a<? extends RecyclerView.b0> z0();
}
