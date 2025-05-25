package pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment;

import a6.h;
import am.e1;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;
import rm.e;

/* compiled from: UserGuideD2Fragment.kt */
/* loaded from: classes3.dex */
public final class d extends BaseUserGuideTestFragment<e1> {

    /* renamed from: i0  reason: collision with root package name */
    public e f25029i0;

    /* renamed from: k0  reason: collision with root package name */
    public static final String f25028k0 = ea.a.p("ZnMucjR1C2QXRAZGG2ExbSFudA==", "z03BYTK1");

    /* renamed from: j0  reason: collision with root package name */
    public static final a f25027j0 = new a();

    /* compiled from: UserGuideD2Fragment.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.BaseUserGuideTestFragment
    public final Space A0() {
        VB vb2 = this.Y;
        g.b(vb2);
        String p10 = ea.a.p("UWklZBpuBS4Gb0RTGWE1ZQ==", "iB5Hkqm1");
        Space space = ((e1) vb2).f860i;
        g.d(space, p10);
        return space;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.BaseUserGuideTestFragment
    public final ViewPager2 B0() {
        VB vb2 = this.Y;
        g.b(vb2);
        String p10 = ea.a.p("UWklZBpuBS4EaVF3OWExZXI=", "ox9jGySD");
        ViewPager2 viewPager2 = ((e1) vb2).f861j;
        g.d(viewPager2, p10);
        return viewPager2;
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final i2.a p0(LayoutInflater inflater, ViewGroup viewGroup) {
        g.e(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_user_guide_d2, viewGroup, false);
        int i10 = R.id.continueTv;
        AppCompatTextView appCompatTextView = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.continueTv);
        if (appCompatTextView != null) {
            i10 = R.id.indicator1Container;
            FrameLayout frameLayout = (FrameLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.indicator1Container);
            if (frameLayout != null) {
                i10 = R.id.indicator1Iv;
                AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.indicator1Iv);
                if (appCompatImageView != null) {
                    i10 = R.id.indicator2Container;
                    FrameLayout frameLayout2 = (FrameLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.indicator2Container);
                    if (frameLayout2 != null) {
                        i10 = R.id.indicator2Iv;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.indicator2Iv);
                        if (appCompatImageView2 != null) {
                            i10 = R.id.indicator3Container;
                            FrameLayout frameLayout3 = (FrameLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.indicator3Container);
                            if (frameLayout3 != null) {
                                i10 = R.id.indicator3Iv;
                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.indicator3Iv);
                                if (appCompatImageView3 != null) {
                                    i10 = R.id.topSpace;
                                    Space space = (Space) com.google.android.play.core.assetpacks.c.u(inflate, R.id.topSpace);
                                    if (space != null) {
                                        i10 = R.id.viewPager;
                                        ViewPager2 viewPager2 = (ViewPager2) com.google.android.play.core.assetpacks.c.u(inflate, R.id.viewPager);
                                        if (viewPager2 != null) {
                                            e1 e1Var = new e1((ConstraintLayout) inflate, appCompatTextView, frameLayout, appCompatImageView, frameLayout2, appCompatImageView2, frameLayout3, appCompatImageView3, space, viewPager2);
                                            ea.a.p("O24XbFh0VCghbgBsVXQychQgMW8ndFdpGmUDLHFmI2whZSk=", "t8Rq9184");
                                            return e1Var;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(ea.a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpOGhLSTQ6IA==", "I3AMLkpn").concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.BaseUserGuideTestFragment, pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final void r0() {
        super.r0();
        VB vb2 = this.Y;
        g.b(vb2);
        ((e1) vb2).f861j.addOnLayoutChangeListener(new pdf.pdfreader.viewer.editor.free.feature.ai.widget.b(this, 2));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.BaseUserGuideTestFragment
    public final AppCompatTextView u0() {
        VB vb2 = this.Y;
        g.b(vb2);
        String p10 = ea.a.p("UWklZBpuBS4Rb1p0AG4jZRB2", "asmPROr2");
        AppCompatTextView appCompatTextView = ((e1) vb2).f854b;
        g.d(appCompatTextView, p10);
        return appCompatTextView;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.BaseUserGuideTestFragment
    public final AppCompatImageView v0() {
        VB vb2 = this.Y;
        g.b(vb2);
        String p10 = ea.a.p("DGkWZCduDC4hbgJpV2Ejb0oxG3Y=", "JYnxNk7x");
        AppCompatImageView appCompatImageView = ((e1) vb2).f855d;
        g.d(appCompatImageView, p10);
        return appCompatImageView;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.BaseUserGuideTestFragment
    public final AppCompatImageView x0() {
        VB vb2 = this.Y;
        g.b(vb2);
        String p10 = ea.a.p("UWklZBpuBS4bblBpCmEibzYye3Y=", "P5BV483J");
        AppCompatImageView appCompatImageView = ((e1) vb2).f857f;
        g.d(appCompatImageView, p10);
        return appCompatImageView;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.BaseUserGuideTestFragment
    public final AppCompatImageView y0() {
        VB vb2 = this.Y;
        g.b(vb2);
        String p10 = ea.a.p("G2k_ZBhuXy4hbgJpV2Ejb0ozG3Y=", "GDyQq8kZ");
        AppCompatImageView appCompatImageView = ((e1) vb2).f859h;
        g.d(appCompatImageView, p10);
        return appCompatImageView;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.BaseUserGuideTestFragment
    public final rm.a<e.a> z0() {
        Context r4 = r();
        if (r4 == null) {
            return null;
        }
        e eVar = this.f25029i0;
        if (eVar == null) {
            String string = r4.getString(R.string.arg_res_0x7f130360);
            String e10 = h.e("X28oYR9DDW4GZUx0R2czdBd0QGkoZ2tSjYDHYQZfNHVfdCJfFWkOZQFfQGkdbDNfI3BGKQ==", "oabYTLzF", string, r4, R.string.arg_res_0x7f13035f);
            g.d(e10, ea.a.p("X28oYR9DDW4GZUx0R2czdBd0QGkoZ2tSp4CVaV5nWXJWYS9fHnUOdBtfUmkFZSVfIGVBKQ==", "E30wlAUC"));
            String string2 = r4.getString(R.string.arg_res_0x7f130301);
            String e11 = h.e("I29SYRVDWG4uZTJ0W2cNdGZ0HGkrZ01St4DlaS9nV3ArZm5jFm5BZShzI28bXxxpQWwLKQ==", "1rxQUCAy", string2, r4, R.string.arg_res_0x7f130574);
            g.d(e11, ea.a.p("I29SYRVDWG4uZTJ0W2cNdGZ0HGkrZ01Sp4DLaVZneXU8ZUNfHnVeZD9fe18RZRtfUnAaKQ==", "yJyREm8W"));
            String string3 = r4.getString(R.string.arg_res_0x7f130303);
            String e12 = h.e("I29SYRVDWG4uZTJ0W2cNdGZ0HGkrZ01SiYDvbh0uNGQpX1RkEHRebj1fPmkBbA1fUnAaKQ==", "TgeAkIzD", string3, r4, R.string.arg_res_0x7f130302);
            g.d(e12, ea.a.p("X28oYR9DDW4GZUx0R2czdBd0QGkoZ2tSsYDMcgJuCy5DZC1fFmQLdBtuU18NZSVfI3BGKQ==", "SjklMbWY"));
            e eVar2 = new e(ge.a.I(new rm.h(R.raw.user_guide_d2_step1, string, e10, ea.a.p("OnNUciZnQmk-ZWVkRy8bdFBwMQ==", "VENQTgeC")), new rm.h(R.raw.user_guide_d2_step2, string2, e11, ea.a.p("OnNUciZnQmk-ZWVkRy8bdFBwMg==", "QPozJupJ")), new rm.h(R.raw.user_guide_d2_step3, string3, e12, ea.a.p("RnMucixnF2kWZRtkWy8ldCFwMw==", "TMaXYGos"))));
            this.f25029i0 = eVar2;
            return eVar2;
        }
        return eVar;
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final void s0() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.BaseUserGuideTestFragment
    public final void D0(int i10) {
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.BaseUserGuideTestFragment, pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final void q0(Bundle bundle) {
    }
}
