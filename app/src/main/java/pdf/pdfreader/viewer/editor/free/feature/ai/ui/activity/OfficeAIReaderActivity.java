package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.lib.flutter.encrypt.EngineHelper;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import jl.a;
import lib.zj.office.officereader.AppFrame;
import lib.zj.office.officereader.beans.AToolsbar;
import lib.zj.office.pg.control.PGPrintMode;
import lib.zj.office.pg.control.Presentation;
import lib.zj.office.system.beans.pagelist.APageListView;
import lib.zj.office.wp.control.Word;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.AppOpenManager;
import pdf.pdfreader.viewer.editor.free.ads.a;
import pdf.pdfreader.viewer.editor.free.ads.anim.BannerLoadingAnimation;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.thumb.ThumbLoadCenter;
import pdf.pdfreader.viewer.editor.free.thumb.adapter.ThumbnailAdapter;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.i3;
import pdf.pdfreader.viewer.editor.free.ui.dialog.s;
import pdf.pdfreader.viewer.editor.free.ui.myview.InterceptRecyclerView;
import pdf.pdfreader.viewer.editor.free.ui.myview.InterceptTouchFrameLayout;
import pdf.pdfreader.viewer.editor.free.ui.myview.ReaderLoadingView;
import pdf.pdfreader.viewer.editor.free.utils.t1;
import sg.e;

/* compiled from: OfficeAIReaderActivity.kt */
/* loaded from: classes3.dex */
public final class OfficeAIReaderActivity extends jl.a implements lib.zj.office.system.i, a.d, pdf.pdfreader.viewer.editor.free.fnbridge.b, pdf.pdfreader.viewer.editor.free.thumb.adapter.a {
    public static final String K0 = ea.a.p("fGYtaRBlI0kgZVVkDHIXYzBpRGkyeQ==", "3UJCOOaj");
    public AppCompatTextView A;
    public boolean A0;
    public AppCompatTextView B;
    public boolean B0;
    public AppCompatTextView C;
    public LinearLayout D;
    public ValueAnimator D0;
    public ViewGroup E;
    public ValueAnimator E0;
    public LinearLayout F;
    public int F0;
    public ViewGroup G;
    public int G0;
    public FrameLayout H;
    public Point H0;
    public FrameLayout I;
    public boolean I0;
    public InterceptRecyclerView J;
    public View K;
    public ViewStub L;
    public ConstraintLayout M;
    public TextView N;
    public TextView O;
    public ReaderLoadingView P;
    public ViewGroup Q;
    public boolean S;
    public boolean T;
    public PdfPreviewEntity W;
    public nl.b X;
    public lib.zj.office.system.p Y;
    public AppFrame Z;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f24433b0;

    /* renamed from: d0  reason: collision with root package name */
    public pdf.pdfreader.viewer.editor.free.ui.dialog.s f24435d0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f24437f0;

    /* renamed from: i0  reason: collision with root package name */
    public ThumbnailAdapter f24440i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f24441j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f24442k0;

    /* renamed from: l0  reason: collision with root package name */
    public pdf.pdfreader.viewer.editor.free.thumb.adapter.b f24443l0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f24446o0;

    /* renamed from: p0  reason: collision with root package name */
    public ConstraintLayout f24447p0;

    /* renamed from: q0  reason: collision with root package name */
    public View f24448q0;

    /* renamed from: t  reason: collision with root package name */
    public String f24451t;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f24452t0;

    /* renamed from: u  reason: collision with root package name */
    public boolean f24453u;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f24454u0;

    /* renamed from: v  reason: collision with root package name */
    public ViewGroup f24455v;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f24456v0;

    /* renamed from: w  reason: collision with root package name */
    public ConstraintLayout f24457w;

    /* renamed from: w0  reason: collision with root package name */
    public long f24458w0;

    /* renamed from: x  reason: collision with root package name */
    public ImageView f24459x;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f24460x0;

    /* renamed from: y  reason: collision with root package name */
    public InterceptTouchFrameLayout f24461y;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f24462y0;

    /* renamed from: z  reason: collision with root package name */
    public AppCompatTextView f24463z;

    /* renamed from: z0  reason: collision with root package name */
    public c7.w f24464z0;
    public final boolean R = true;
    public String U = "";
    public String V = "";

    /* renamed from: a0  reason: collision with root package name */
    public int f24432a0 = -1;

    /* renamed from: c0  reason: collision with root package name */
    public final tf.c f24434c0 = kotlin.a.a(new cg.a<Handler>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.OfficeAIReaderActivity$mainHandler$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    });

    /* renamed from: e0  reason: collision with root package name */
    public final tf.c f24436e0 = kotlin.a.a(new cg.a<hp.e>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.OfficeAIReaderActivity$rotateObservable$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final hp.e invoke() {
            return new hp.e(OfficeAIReaderActivity.this);
        }
    });

    /* renamed from: g0  reason: collision with root package name */
    public int f24438g0 = 1;

    /* renamed from: h0  reason: collision with root package name */
    public final tf.c f24439h0 = kotlin.a.a(new cg.a<ThumbLoadCenter>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.OfficeAIReaderActivity$thumbLoadCenter$2
        @Override // cg.a
        public final ThumbLoadCenter invoke() {
            return new ThumbLoadCenter();
        }
    });

    /* renamed from: m0  reason: collision with root package name */
    public String f24444m0 = "";

    /* renamed from: n0  reason: collision with root package name */
    public boolean f24445n0 = true;

    /* renamed from: r0  reason: collision with root package name */
    public final a f24449r0 = new a();

    /* renamed from: s0  reason: collision with root package name */
    public final wn.c f24450s0 = new wn.c(0);
    public final g0 C0 = new g0(this, 1);
    public final s0 J0 = new s0(this, 0);

    /* compiled from: OfficeAIReaderActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a implements com.lib.flutter.encrypt.e {
        public a() {
        }

        @Override // com.lib.flutter.encrypt.e
        public final void a(String str) {
            OfficeAIReaderActivity officeAIReaderActivity = OfficeAIReaderActivity.this;
            if (pdf.pdfreader.viewer.editor.free.utils.extension.a.c(officeAIReaderActivity)) {
                if (BillingConfigImpl.c.w()) {
                    String p10 = ea.a.p("P3JUbRB1WiAvcy9yWSAba1xwTnA3ZRNpIncqbyF0Fm0NYV9uHHIXczJvdw==", "cMcAGhUy");
                    int i10 = zk.a.f32399a;
                    t1.b(p10);
                    return;
                }
                LinearLayout linearLayout = officeAIReaderActivity.F;
                if (linearLayout != null) {
                    gl.o.f17931a.getClass();
                    gl.o.a(str, linearLayout);
                    gl.o.b();
                }
            }
        }

        @Override // com.lib.flutter.encrypt.e
        public final void b() {
            LinearLayout linearLayout;
            OfficeAIReaderActivity officeAIReaderActivity = OfficeAIReaderActivity.this;
            if (pdf.pdfreader.viewer.editor.free.utils.extension.a.c(officeAIReaderActivity)) {
                LinearLayout linearLayout2 = officeAIReaderActivity.F;
                Object obj = null;
                if (linearLayout2 != null) {
                    x0.j0 j0Var = new x0.j0(linearLayout2);
                    while (true) {
                        if (!j0Var.hasNext()) {
                            break;
                        }
                        Object next = j0Var.next();
                        if (((View) next) instanceof BannerLoadingAnimation) {
                            obj = next;
                            break;
                        }
                    }
                    obj = (View) obj;
                }
                if (obj != null && (linearLayout = officeAIReaderActivity.F) != null) {
                    linearLayout.removeAllViews();
                }
            }
        }
    }

    /* compiled from: OfficeAIReaderActivity.kt */
    /* loaded from: classes3.dex */
    public static final class b implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public int f24466a;

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View v10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            kotlin.jvm.internal.g.e(v10, "v");
            int i18 = this.f24466a;
            if (i18 == 0) {
                this.f24466a = v10.getMeasuredHeight();
            } else if (i18 == v10.getMeasuredHeight()) {
            } else {
                ViewGroup.LayoutParams layoutParams = v10.getLayoutParams();
                kotlin.jvm.internal.g.c(layoutParams, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuCm5pbiVsOyA7eUFlWWFZZChvI2RbdgFlQi44aSB3InIKdTQuHWElZyZufWEAb0J0CmE4YRhz", "UMWieDPW"));
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int i19 = marginLayoutParams.topMargin;
                if (i19 < 0 && (-i19) == this.f24466a) {
                    marginLayoutParams.topMargin = -v10.getMeasuredHeight();
                    v10.post(new m(v10, marginLayoutParams, 1));
                }
                this.f24466a = v10.getMeasuredHeight();
            }
        }
    }

    /* compiled from: OfficeAIReaderActivity.kt */
    /* loaded from: classes3.dex */
    public static final class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ConstraintLayout f24467a;

        public c(ConstraintLayout constraintLayout) {
            this.f24467a = constraintLayout;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.g.e(animation, "animation");
            this.f24467a.setVisibility(8);
        }
    }

    /* compiled from: OfficeAIReaderActivity.kt */
    /* loaded from: classes3.dex */
    public static final class d implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animation) {
            kotlin.jvm.internal.g.e(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.g.e(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animation) {
            kotlin.jvm.internal.g.e(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animation) {
            kotlin.jvm.internal.g.e(animation, "animation");
        }
    }

    /* compiled from: OfficeAIReaderActivity.kt */
    /* loaded from: classes3.dex */
    public static final class e implements sg.b {
        public e() {
        }

        @Override // sg.b
        public final void a() {
            System.currentTimeMillis();
            OfficeAIReaderActivity officeAIReaderActivity = OfficeAIReaderActivity.this;
            officeAIReaderActivity.getClass();
            o9.d.s(ea.a.p("AGZXaRpldkkIZStkEHIpY0FpGGkxeQ==", "D2DvmR4A"), ea.a.p("K2lCbRBzREQzYSZvZw==", "EfidQMKr"));
            officeAIReaderActivity.k2();
        }

        @Override // sg.b
        public final void b() {
            o9.d.s(ea.a.p("fGYtaRBlI0kgZVVkDHIXYzBpRGkyeQ==", "y7P1t5wX"), ea.a.p("QGgkdzdpA2wdZw==", "bCZJM60X"));
            long currentTimeMillis = System.currentTimeMillis();
            OfficeAIReaderActivity officeAIReaderActivity = OfficeAIReaderActivity.this;
            officeAIReaderActivity.f24458w0 = currentTimeMillis;
            officeAIReaderActivity.runOnUiThread(new u0(officeAIReaderActivity, 1));
        }
    }

    /* compiled from: OfficeAIReaderActivity.kt */
    /* loaded from: classes3.dex */
    public static final class g extends AnimatorListenerAdapter {
        public g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.g.e(animation, "animation");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animation) {
            kotlin.jvm.internal.g.e(animation, "animation");
            OfficeAIReaderActivity officeAIReaderActivity = OfficeAIReaderActivity.this;
            if (officeAIReaderActivity.H0 == null) {
                LinearLayout linearLayout = officeAIReaderActivity.D;
                if (linearLayout != null) {
                    if (linearLayout != null) {
                        linearLayout.setPadding(0, 0, 0, 0);
                        return;
                    } else {
                        kotlin.jvm.internal.g.i(ea.a.p("UWcbYRRlNm8Tc3Q=", "M0tRPswd"));
                        throw null;
                    }
                }
                kotlin.jvm.internal.g.i(ea.a.p("UWcbYRRlNm8Tc3Q=", "6AUe5I4u"));
                throw null;
            }
        }
    }

    /* compiled from: OfficeAIReaderActivity.kt */
    /* loaded from: classes3.dex */
    public static final class h implements Word.h {
        public h() {
        }

        @Override // lib.zj.office.wp.control.Word.h
        public final void a(boolean z10) {
            OfficeAIReaderActivity officeAIReaderActivity = OfficeAIReaderActivity.this;
            if (!officeAIReaderActivity.S) {
                officeAIReaderActivity.u2(z10);
            }
        }

        @Override // lib.zj.office.wp.control.Word.h
        public final void b(boolean z10) {
            OfficeAIReaderActivity officeAIReaderActivity = OfficeAIReaderActivity.this;
            if (z10) {
                if (!officeAIReaderActivity.A0) {
                    ConstraintLayout constraintLayout = officeAIReaderActivity.M;
                    if (constraintLayout != null) {
                        constraintLayout.setVisibility(8);
                    }
                    officeAIReaderActivity.B0 = false;
                    return;
                }
                if (officeAIReaderActivity.M == null) {
                    try {
                        ViewStub viewStub = officeAIReaderActivity.L;
                        if (viewStub != null) {
                            View inflate = viewStub.inflate();
                            kotlin.jvm.internal.g.c(inflate, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuA253biJsKiA7eUFlWWFZZChvI2QNLgtvW3MaciRpC3QAYSNvInRodyZkVmUNLnRvNHM-chRpBnR5YRdvMHQ=", "yIKzlZWF"));
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate;
                            officeAIReaderActivity.M = constraintLayout2;
                            TextView textView = (TextView) constraintLayout2.findViewById(R.id.preview_current_page_number_tv);
                            officeAIReaderActivity.N = textView;
                            if (textView != null) {
                                String format = String.format(Locale.ENGLISH, ea.a.p("FmQg", "t2ccl5R5"), Arrays.copyOf(new Object[]{Integer.valueOf(officeAIReaderActivity.f24441j0)}, 1));
                                kotlin.jvm.internal.g.d(format, ea.a.p("VW85bRJ0SmwdY1VsDCx2ZityX2EyLGMqKXIzcyk=", "HTzrxw09"));
                                textView.setText(format);
                            }
                            TextView textView2 = (TextView) constraintLayout2.findViewById(R.id.preview_total_page_number_tv);
                            officeAIReaderActivity.O = textView2;
                            if (officeAIReaderActivity.f24442k0 > 0 && textView2 != null) {
                                String format2 = String.format(Locale.ENGLISH, ea.a.p("VmQg", "mJsw3DqF"), Arrays.copyOf(new Object[]{Integer.valueOf(officeAIReaderActivity.f24442k0)}, 1));
                                kotlin.jvm.internal.g.d(format2, ea.a.p("M28xbVN0bmwnYwdsUSx3ZldyP2E9LBYqFXIWcyk=", "F8UC2FBH"));
                                textView2.setText(format2);
                            }
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("LGVfdBxyZ2E9ZQR1GGINcmNz", "jtLzhnlE"));
                            throw null;
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
                ConstraintLayout constraintLayout3 = officeAIReaderActivity.M;
                if (constraintLayout3 != null && constraintLayout3.getVisibility() != 0) {
                    constraintLayout3.setAlpha(1.0f);
                    constraintLayout3.setVisibility(0);
                }
                Handler i22 = officeAIReaderActivity.i2();
                s0 s0Var = officeAIReaderActivity.J0;
                i22.removeCallbacks(s0Var);
                officeAIReaderActivity.i2().postDelayed(s0Var, 200L);
                if (!officeAIReaderActivity.B0) {
                    officeAIReaderActivity.B0 = true;
                    officeAIReaderActivity.t2();
                    return;
                }
                return;
            }
            String str = OfficeAIReaderActivity.K0;
            officeAIReaderActivity.j2();
        }
    }

    /* compiled from: OfficeAIReaderActivity.kt */
    /* loaded from: classes3.dex */
    public static final class i implements androidx.lifecycle.x, kotlin.jvm.internal.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cg.l f24471a;

        public i(cg.l lVar) {
            ea.a.p("NnU8YzNpJ24=", "zwPRGH24");
            this.f24471a = lVar;
        }

        @Override // kotlin.jvm.internal.e
        public final cg.l a() {
            return this.f24471a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof androidx.lifecycle.x) && (obj instanceof kotlin.jvm.internal.e)) {
                return kotlin.jvm.internal.g.a(this.f24471a, ((kotlin.jvm.internal.e) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return this.f24471a.hashCode();
        }

        @Override // androidx.lifecycle.x
        public final /* synthetic */ void m(Object obj) {
            this.f24471a.invoke(obj);
        }
    }

    /* compiled from: OfficeAIReaderActivity.kt */
    /* loaded from: classes3.dex */
    public static final class j extends AnimatorListenerAdapter {
        public j() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.g.e(animation, "animation");
            LinearLayout linearLayout = OfficeAIReaderActivity.this.D;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("UWcbYRRlNm8Tc3Q=", "llEUdSMo"));
                throw null;
            }
        }
    }

    /* compiled from: OfficeAIReaderActivity.kt */
    /* loaded from: classes3.dex */
    public static final class k extends AnimatorListenerAdapter {
        public k() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.g.e(animation, "animation");
            LinearLayout linearLayout = OfficeAIReaderActivity.this.D;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("JWciYRNlZW8pc3Q=", "THGrt1jJ"));
                throw null;
            }
        }
    }

    /* compiled from: OfficeAIReaderActivity.kt */
    /* loaded from: classes3.dex */
    public static final class l implements s.a {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f24475b = false;
        public final /* synthetic */ int c;

        public l(int i10) {
            this.c = i10;
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.s.a
        public final void a(int i10) {
            View view;
            gj.j jVar;
            gj.k I;
            View view2;
            OfficeAIReaderActivity officeAIReaderActivity = OfficeAIReaderActivity.this;
            pdf.pdfreader.viewer.editor.free.utils.p.f(officeAIReaderActivity, officeAIReaderActivity.W, this.f24475b);
            Word word = null;
            Presentation presentation = null;
            int i11 = this.c;
            if (i11 != 0) {
                if (i11 == 1) {
                    lib.zj.office.system.p pVar = officeAIReaderActivity.Y;
                    if (pVar != null) {
                        view2 = pVar.getView();
                    } else {
                        view2 = null;
                    }
                    if (view2 instanceof Presentation) {
                        presentation = (Presentation) view2;
                    }
                    if (presentation != null) {
                        PGPrintMode pGPrintMode = presentation.f20940t;
                        try {
                            APageListView aPageListView = pGPrintMode.f20913e;
                            APageListView aPageListView2 = pGPrintMode.f20913e;
                            Object model = aPageListView.getModel();
                            kotlin.jvm.internal.g.c(model, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuIW5UbjZsPiBHeTtlU2wLYlx6Xi4GZjBpJ2UccCEuLm8qZRUuE0cfb1dlbA==", "NyCR1ayc"));
                            th.c cVar = (th.c) model;
                            if (i10 <= cVar.c() && i10 > 0) {
                                aPageListView2.setCurrentPageNumber(i10);
                                aPageListView2.requestLayout();
                            } else {
                                pdf.pdfreader.viewer.editor.free.ui.dialog.s sVar = officeAIReaderActivity.f24435d0;
                                if (sVar != null) {
                                    cVar.c();
                                    sVar.B();
                                }
                                o9.d.r("OfficeAIReaderActivity page not enough, current page = " + cVar.c());
                                return;
                            }
                        } catch (Exception e10) {
                            t1.b(e10.toString());
                        }
                    }
                }
            } else {
                lib.zj.office.system.p pVar2 = officeAIReaderActivity.Y;
                if (pVar2 != null) {
                    view = pVar2.getView();
                } else {
                    view = null;
                }
                if (view instanceof Word) {
                    word = view;
                }
                if (word != null && (jVar = word.f21109q) != null && (I = jVar.I(i10 - 1)) != null) {
                    word.scrollTo(0, (int) (word.getZoom() * I.c));
                }
            }
            pdf.pdfreader.viewer.editor.free.ui.dialog.s sVar2 = officeAIReaderActivity.f24435d0;
            if (sVar2 != null) {
                sVar2.cancel();
            }
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.s.a
        public final void b() {
            OfficeAIReaderActivity officeAIReaderActivity = OfficeAIReaderActivity.this;
            pdf.pdfreader.viewer.editor.free.utils.p.g(officeAIReaderActivity, officeAIReaderActivity.W, this.f24475b);
        }
    }

    @Override // lib.zj.office.system.i
    public final void A0(String str) {
        boolean z10;
        if (!isFinishing()) {
            if (str != null && str.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                new pdf.pdfreader.viewer.editor.free.ui.dialog.b0(this, str, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.OfficeAIReaderActivity$onTouchLink$1
                    {
                        super(0);
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        int i10;
                        int[] iArr;
                        InterceptTouchFrameLayout interceptTouchFrameLayout;
                        OfficeAIReaderActivity officeAIReaderActivity = OfficeAIReaderActivity.this;
                        String string = officeAIReaderActivity.getString(R.string.arg_res_0x7f1301b4);
                        kotlin.jvm.internal.g.d(string, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHGkodiJsMGQmbF1uWSk=", "Yy42uwa2"));
                        if (officeAIReaderActivity.isFinishing()) {
                            return;
                        }
                        try {
                            iArr = new int[2];
                            interceptTouchFrameLayout = officeAIReaderActivity.f24461y;
                        } catch (Exception unused) {
                        }
                        if (interceptTouchFrameLayout != null) {
                            interceptTouchFrameLayout.getLocationInWindow(iArr);
                            int U = iArr[1] - pdf.pdfreader.viewer.editor.free.utils.t0.U(officeAIReaderActivity);
                            if (U >= 0) {
                                i10 = (int) (U + officeAIReaderActivity.getResources().getDimension(R.dimen.dp_6));
                                pdf.pdfreader.viewer.editor.free.utils.j1.e(officeAIReaderActivity, string, true, null, i10);
                                return;
                            }
                            i10 = -1;
                            pdf.pdfreader.viewer.editor.free.utils.j1.e(officeAIReaderActivity, string, true, null, i10);
                            return;
                        }
                        kotlin.jvm.internal.g.i(ea.a.p("QWUqZBZyIW8cdFVpB2Vy", "5oYgIF2B"));
                        throw null;
                    }

                    @Override // cg.a
                    public /* bridge */ /* synthetic */ tf.d invoke() {
                        invoke2();
                        return tf.d.f30009a;
                    }
                }).show();
            }
        }
    }

    public final void A2(int i10) {
        boolean z10;
        s2(i10);
        if (i10 <= 1) {
            z10 = true;
        } else {
            AppCompatTextView appCompatTextView = this.B;
            if (appCompatTextView != null) {
                appCompatTextView.setText(String.valueOf(i10));
                TextView textView = this.O;
                if (textView != null) {
                    String format = String.format(Locale.ENGLISH, ea.a.p("amQg", "6Kpt62eb"), Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
                    kotlin.jvm.internal.g.d(format, ea.a.p("VW81bRl0WWwnYwdsUSx3ZldyP2E9LBYqFXIWcyk=", "tD3GxqtW"));
                    textView.setText(format);
                }
                z10 = false;
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("R28_YR9QA2cXVHY=", "fj5Hrbq5"));
                throw null;
            }
        }
        if (z10) {
            this.A0 = false;
            u2(true);
        } else {
            d2();
        }
        pdf.pdfreader.viewer.editor.free.ui.dialog.s sVar = this.f24435d0;
        if (sVar != null) {
            sVar.C(i10);
        }
    }

    @Override // lib.zj.office.system.i
    public final boolean B0() {
        return this.R;
    }

    @Override // lib.zj.office.system.i
    public final byte C0() {
        return (byte) 0;
    }

    @Override // jl.a
    public final void C1() {
        this.f24448q0 = findViewById(R.id.viewStatusBarSpace);
        View findViewById = findViewById(R.id.rootView);
        kotlin.jvm.internal.g.d(findViewById, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuHG8qdDNpIHcp", "exxjEuMU"));
        this.f24455v = (ViewGroup) findViewById;
        View findViewById2 = findViewById(R.id.container);
        kotlin.jvm.internal.g.d(findViewById2, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuUW8odCJpIWUTKQ==", "OaqsqjcA"));
        this.f24457w = (ConstraintLayout) findViewById2;
        View findViewById3 = findViewById(R.id.backIv);
        kotlin.jvm.internal.g.d(findViewById3, ea.a.p("PGkpZB1pCncKeS9kHFJ5aVwuMGEqa392KQ==", "eYZGKo7Q"));
        this.f24459x = (ImageView) findViewById3;
        View findViewById4 = findViewById(R.id.readerContainer);
        kotlin.jvm.internal.g.d(findViewById4, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuHGUkZAByF29fdDFpWGU9KQ==", "XBxnT1P6"));
        this.f24461y = (InterceptTouchFrameLayout) findViewById4;
        View findViewById5 = findViewById(R.id.currentPageTv);
        kotlin.jvm.internal.g.d(findViewById5, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuDXU3cgBuMVAmZwNUACk=", "TDQhEGfv"));
        this.f24463z = (AppCompatTextView) findViewById5;
        View findViewById6 = findViewById(R.id.pageSlash);
        kotlin.jvm.internal.g.d(findViewById6, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuQmEhZRBsBnMiKQ==", "gJabHxV8"));
        this.A = (AppCompatTextView) findViewById6;
        View findViewById7 = findViewById(R.id.totalPageTv);
        kotlin.jvm.internal.g.d(findViewById7, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuGm8xYQlQG2cmVEQp", "sXlrzC2M"));
        this.B = (AppCompatTextView) findViewById7;
        View findViewById8 = findViewById(R.id.fileNameTv);
        kotlin.jvm.internal.g.d(findViewById8, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuVGkqZQ1hGWU-dik=", "tj5YZNwx"));
        this.C = (AppCompatTextView) findViewById8;
        View findViewById9 = findViewById(R.id.bgPageToast);
        kotlin.jvm.internal.g.d(findViewById9, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuUGcWYSRlJm8icxwp", "rChSlPsN"));
        this.D = (LinearLayout) findViewById9;
        View findViewById10 = findViewById(R.id.actionBarView);
        kotlin.jvm.internal.g.d(findViewById10, ea.a.p("Fmk_ZDlpI3cKeS9kHFJ5aVwuM2M9aVluNmEDVjhlNSk=", "mbpQoFZH"));
        this.E = (ViewGroup) findViewById10;
        this.F = (LinearLayout) findViewById(R.id.ad_layout);
        View findViewById11 = findViewById(R.id.bottomAdContainer);
        kotlin.jvm.internal.g.d(findViewById11, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuDG8xdAptOGQqbyV0N2khZUMp", "NzmByiKV"));
        this.G = (ViewGroup) findViewById11;
        View findViewById12 = findViewById(R.id.thumb_fl_container);
        kotlin.jvm.internal.g.d(findViewById12, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuGmgwbQdfJGw7YyNuGWEmblRyKQ==", "ktX6BdLm"));
        this.I = (FrameLayout) findViewById12;
        View findViewById13 = findViewById(R.id.thumb_rv);
        kotlin.jvm.internal.g.d(findViewById13, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuRmgzbSFfNHYp", "F2foM5lP"));
        this.J = (InterceptRecyclerView) findViewById13;
        View findViewById14 = findViewById(R.id.thumb_line);
        kotlin.jvm.internal.g.d(findViewById14, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuGmgwbQdfVGk4ZSk=", "8MWn8VJZ"));
        this.K = findViewById14;
        View findViewById15 = findViewById(R.id.loadingContainer);
        kotlin.jvm.internal.g.d(findViewById15, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuAm8kZAxuUUMNbgNhE24qcik=", "rglA6bwz"));
        this.H = (FrameLayout) findViewById15;
        View findViewById16 = findViewById(R.id.toast_vs);
        kotlin.jvm.internal.g.d(findViewById16, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuGm8kcxFfEnMp", "1X1BdIkY"));
        ViewStub viewStub = (ViewStub) findViewById16;
        View findViewById17 = findViewById(R.id.preview_page_number_vs);
        kotlin.jvm.internal.g.d(findViewById17, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuQnIjdiplGF8dYQ1lPm5GbSllAV8Ucyk=", "omjaLJHe"));
        this.L = (ViewStub) findViewById17;
        this.Q = (ViewGroup) findViewById(R.id.full_holder);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.top_ll);
        this.f24447p0 = constraintLayout;
        if (constraintLayout != null) {
            constraintLayout.addOnLayoutChangeListener(new b());
        }
    }

    @Override // jl.a
    public final int E1() {
        return R.layout.activity_office_reader_ai;
    }

    @Override // lib.zj.office.system.i
    public final File G0() {
        File externalFilesDir = getExternalFilesDir(null);
        if (externalFilesDir == null) {
            File filesDir = getFilesDir();
            kotlin.jvm.internal.g.d(filesDir, ea.a.p("VWknZQBEC3I=", "nOHaYNQM"));
            return filesDir;
        }
        return externalFilesDir;
    }

    @Override // lib.zj.office.system.i
    public final void K() {
        View view;
        o9.d.s(K0, ea.a.p("LG9ccBVlQ2UWYTNvAHQ=", "6nDBZJRB"));
        t1.b(ea.a.p("AGZXaRpldkkIZStkEHIpY0FpGGkxeUVjLm0lbAl0JkwueV51dA==", "yutdAUlC"));
        androidx.activity.f.q("AWYWaTFlCUkaZQdkUXIWY0xpJGk9eRZjG20BbDR0J0wveR91dA==", "jINpRHuN", dp.a.a());
        this.f24433b0 = true;
        k2();
        lib.zj.office.system.p pVar = this.Y;
        if (pVar != null && (view = pVar.getView()) != null) {
            byte b10 = (byte) this.f24432a0;
            if (b10 == 0) {
                if (view instanceof Word) {
                    A2(((Word) view).getPageCount());
                }
            } else if (b10 == 2) {
                ea.a.p("P3BFIBpvWnA2ZT5lOWERb0B0", "RVZiBrkp");
            }
        }
    }

    @Override // jl.a
    public final void K1() {
        z2();
        View findViewById = findViewById(R.id.pageGotoLl);
        kotlin.jvm.internal.g.d(findViewById, ea.a.p("VWklZCVpB3cweX1kVVY_ZTM-GlJoaScuR2EXZTFvRW9_bCk=", "7pv1Bhaa"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(findViewById, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.OfficeAIReaderActivity$initView$1
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
                kotlin.jvm.internal.g.e(it, "it");
                OfficeAIReaderActivity officeAIReaderActivity = OfficeAIReaderActivity.this;
                lib.zj.office.system.p pVar = officeAIReaderActivity.Y;
                View view = pVar != null ? pVar.getView() : null;
                if (view instanceof Word) {
                    officeAIReaderActivity.y2(0, false);
                } else if (view instanceof Presentation) {
                    officeAIReaderActivity.y2(1, false);
                }
            }
        });
        ImageView imageView = this.f24459x;
        if (imageView != null) {
            imageView.setOnClickListener(new f0(this, 2));
        } else {
            kotlin.jvm.internal.g.i(ea.a.p("CGEZazh2", "8cjzqvEL"));
            throw null;
        }
    }

    @Override // lib.zj.office.system.i
    public final boolean L() {
        return true;
    }

    @Override // jl.a
    public final void L1() {
        BillingConfigImpl.c.getClass();
        BillingConfigImpl.x().e(this, new i(new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.OfficeAIReaderActivity$initViewModel$1
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke2(bool);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Boolean bool) {
                kotlin.jvm.internal.g.d(bool, ea.a.p("WnQ=", "uOvHwh0T"));
                if (bool.booleanValue()) {
                    LinearLayout linearLayout = OfficeAIReaderActivity.this.F;
                    if (linearLayout != null) {
                        linearLayout.removeAllViews();
                        linearLayout.setVisibility(8);
                    }
                    OfficeAIReaderActivity activity = OfficeAIReaderActivity.this;
                    gl.o.f17931a.getClass();
                    kotlin.jvm.internal.g.e(activity, "activity");
                    gl.p.f17933p.e(activity);
                    gl.q.f17934p.e(activity);
                }
            }
        }));
    }

    @Override // lib.zj.office.system.i
    public final void M0(boolean z10) {
        o9.d.s(K0, "setFindBackForwardState false");
    }

    @Override // lib.zj.office.system.i
    public final void N() {
        View view;
        Presentation presentation;
        View view2;
        Word word;
        o9.d.s(K0, ea.a.p("OnBVYQ1lY281bDliFHI7dFR0G3M=", "jlyXBgcB"));
        if (this.f24432a0 == 0 && !this.f24433b0) {
            lib.zj.office.system.p pVar = this.Y;
            if (pVar != null) {
                view2 = pVar.getView();
            } else {
                view2 = null;
            }
            if (view2 instanceof Word) {
                word = (Word) view2;
            } else {
                word = null;
            }
            if (word != null) {
                k2();
                A2(word.getPageCount());
            }
        }
        if (this.f24432a0 == 2) {
            lib.zj.office.system.p pVar2 = this.Y;
            if (pVar2 != null) {
                view = pVar2.getView();
            } else {
                view = null;
            }
            if (view instanceof Presentation) {
                presentation = (Presentation) view;
            } else {
                presentation = null;
            }
            if (presentation != null) {
                presentation.getRealSlideCount();
                try {
                    Object model = presentation.f20940t.f20913e.getModel();
                    kotlin.jvm.internal.g.c(model, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuXW5CbkNsNSA7eUFlWWxeYnR6IC4aZg5pVmVAcCIuCG9WZQMuZkcUbytlbA==", "tMyc2o6Y"));
                    k2();
                    s2(((th.c) model).c());
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
        AppFrame appFrame = this.Z;
        if (appFrame != null) {
            int childCount = appFrame.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                AppFrame appFrame2 = this.Z;
                if (appFrame2 != null) {
                    View childAt = appFrame2.getChildAt(i10);
                    if (childAt instanceof AToolsbar) {
                        ((AToolsbar) childAt).g();
                    }
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("UnA7RgFhD2U=", "JkgzaHF7"));
                    throw null;
                }
            }
            return;
        }
        kotlin.jvm.internal.g.i(ea.a.p("UnA7RgFhD2U=", "aoorejc5"));
        throw null;
    }

    @Override // lib.zj.office.system.i
    public final boolean O() {
        return false;
    }

    @Override // lib.zj.office.system.i
    public final boolean P() {
        return false;
    }

    @Override // lib.zj.office.system.i
    public final boolean P0() {
        return this.T;
    }

    @Override // lib.zj.office.system.i
    public final void S() {
        View view;
        ea.a.p("LGhQbh5lZ2E9ZQ==", "TW1zNb6s");
        String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        lib.zj.office.system.p pVar = this.Y;
        if (pVar != null && (view = pVar.getView()) != null) {
            byte b10 = (byte) this.f24432a0;
            boolean z10 = false;
            if (b10 == 0) {
                if (view instanceof Word) {
                    Word word = (Word) view;
                    this.f24441j0 = word.getCurrentPageNumber();
                    TextView textView = this.N;
                    if (textView != null) {
                        String format = String.format(Locale.ENGLISH, ea.a.p("amQg", "GGOxZgVW"), Arrays.copyOf(new Object[]{Integer.valueOf(this.f24441j0)}, 1));
                        kotlin.jvm.internal.g.d(format, ea.a.p("X28RbRN0SmwnYwdsUSx3ZldyP2E9LBYqFXIWcyk=", "CX9crbxG"));
                        textView.setText(format);
                    }
                    AppCompatTextView appCompatTextView = this.f24463z;
                    if (appCompatTextView != null) {
                        appCompatTextView.setText(String.valueOf(word.getCurrentPageNumber()));
                        ThumbnailAdapter thumbnailAdapter = this.f24440i0;
                        if (thumbnailAdapter != null && thumbnailAdapter.f26585j == word.getCurrentPageNumber()) {
                            z10 = true;
                        }
                        if (!z10) {
                            InterceptRecyclerView interceptRecyclerView = this.J;
                            if (interceptRecyclerView != null) {
                                RecyclerView.m layoutManager = interceptRecyclerView.getLayoutManager();
                                if (layoutManager != null) {
                                    layoutManager.B0(word.getCurrentPageNumber() - 1);
                                }
                            } else {
                                kotlin.jvm.internal.g.i(ea.a.p("GGhMbTRSdg==", "Lkl9Vt3U"));
                                throw null;
                            }
                        }
                        ThumbnailAdapter thumbnailAdapter2 = this.f24440i0;
                        if (thumbnailAdapter2 != null) {
                            thumbnailAdapter2.h(word.getCurrentPageNumber());
                            return;
                        }
                        return;
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("UHU5chZuFlATZ1FUdg==", "ScP3m1L4"));
                    throw null;
                }
            } else if (b10 == 2 && (view instanceof Presentation)) {
                Presentation presentation = (Presentation) view;
                this.f24441j0 = presentation.getCurrentIndex() + 1;
                AppCompatTextView appCompatTextView2 = this.f24463z;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setText(String.valueOf(presentation.getCurrentIndex() + 1));
                    ThumbnailAdapter thumbnailAdapter3 = this.f24440i0;
                    if (thumbnailAdapter3 != null && thumbnailAdapter3.f26585j == presentation.getCurrentIndex() + 1) {
                        z10 = true;
                    }
                    if (!z10) {
                        InterceptRecyclerView interceptRecyclerView2 = this.J;
                        if (interceptRecyclerView2 != null) {
                            RecyclerView.m layoutManager2 = interceptRecyclerView2.getLayoutManager();
                            if (layoutManager2 != null) {
                                layoutManager2.B0(presentation.getCurrentIndex());
                            }
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("GGgjbS9Sdg==", "b7lVMvYs"));
                            throw null;
                        }
                    }
                    ThumbnailAdapter thumbnailAdapter4 = this.f24440i0;
                    if (thumbnailAdapter4 != null) {
                        thumbnailAdapter4.h(presentation.getCurrentIndex() + 1);
                        return;
                    }
                    return;
                }
                kotlin.jvm.internal.g.i(ea.a.p("UHU5chZuFlATZ1FUdg==", "RitaM6BN"));
                throw null;
            }
        }
    }

    @Override // lib.zj.office.system.i
    public final void T(boolean z10) {
        o9.d.s(K0, "fullScreen " + z10);
        t1.b("OfficeAIReaderActivity fullScreen " + z10);
    }

    @Override // lib.zj.office.system.i
    public final int V0() {
        return getResources().getDimensionPixelSize(R.dimen.dp_36);
    }

    @Override // lib.zj.office.system.i
    public final Integer Y0() {
        return Integer.valueOf(androidx.core.content.a.getColor(this, R.color.colorOnPrimary));
    }

    @Override // lib.zj.office.system.i
    public final String a1() {
        return ea.a.p("GlR3LTg=", "brfZYWkX");
    }

    public final void a2() {
        if (this.F != null && !this.f24460x0 && getResources().getConfiguration().orientation == 1) {
            this.f24460x0 = true;
            aj.b.I(this, this.F, ea.a.p("XGYtaRBl", "0RtZFbJU"));
        }
    }

    public final boolean b2(String str) {
        String str2;
        if (str == null) {
            str2 = ea.a.p("G3UubA==", "1NuBg9iI");
        } else {
            str2 = str;
        }
        t1.b("pdfPreview thirdOpen entity= ".concat(str2));
        if (str != null && !TextUtils.isEmpty(str)) {
            if (!aj.b.H(str)) {
                Resources resources = getResources();
                tn.a.d(this, ea.a.p("OWlUdw==", "MtOemhcG"), ea.a.p("RWkudyxuDXQBdURwNm8mZW4=", "SY8CNOi9"), aj.b.M(str), false);
                String string = resources.getString(R.string.arg_res_0x7f13004c);
                kotlin.jvm.internal.g.d(string, ea.a.p("QWU4LhRlFlMGcl1uDigELjd0QGkoZ21hp4DVciFhAGVBMhR0CnAHXxxvQF8adSZwK3JGKQ==", "EsDd56sw"));
                String string2 = resources.getString(R.string.arg_res_0x7f13004d);
                kotlin.jvm.internal.g.d(string2, ea.a.p("QWU4LhRlFlMGcl1uDigELjd0QGkoZ21hgIDsMmp0QXBWXyVvB18RdQJwW3IdXzJlN18DKQ==", "bJ58wbwA"));
                w2(string, string2, resources.getString(R.string.arg_res_0x7f13004e));
            } else {
                return true;
            }
        } else {
            t1.b(ea.a.p("P2RXUAtlQWk_d2p0HWkaZHpwC25lcARyGmUDcjxvcg==", "fnMRiFNY"));
            String string3 = getString(R.string.arg_res_0x7f130391);
            kotlin.jvm.internal.g.d(string3, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHHIjYSdlHF8TaT9lOWVLYy5wB2kNbik=", "nuSfCz4F"));
            String string4 = getString(R.string.arg_res_0x7f130390);
            kotlin.jvm.internal.g.d(string4, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHHIjYSdlsYDNZi9sAF9QbzlyBnAWXxFhWm4GdAlvNGVcKQ==", "SkFeJFV5"));
            w2(string3, string4, null);
        }
        return false;
    }

    @Override // lib.zj.office.system.i
    public final void c1(byte b10) {
        String p10;
        boolean z10;
        boolean z11;
        int i10;
        ValueAnimator valueAnimator;
        if (b10 == 7) {
            String str = pdf.pdfreader.viewer.editor.free.utils.p.f28740a;
            if (!this.S) {
                v2();
                return;
            }
            byte b11 = (byte) this.f24432a0;
            if (b11 == 0) {
                p10 = ea.a.p("Dm8WZA==", "1Xyd9tet");
            } else if (b11 == 1) {
                p10 = ea.a.p("VngoZWw=", "70mQfsaV");
            } else if (b11 == 2) {
                p10 = ea.a.p("Q3B0", "MYavmNW0");
            } else {
                p10 = ea.a.p("RG85ZA==", "rB97ddg5");
            }
            tn.a.d(ReaderPdfApplication.m(), ea.a.p("RWkudw==", "x6Il5KA9"), ea.a.p("OWlUdyZmQmw2XzloGnc=", "mMCn6VCf"), p10, false);
            if (this.f24447p0 != null && this.S) {
                if (this.D0 == null) {
                    this.D0 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    q2();
                }
                if (this.E0 == null) {
                    this.E0 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    l2();
                }
                ValueAnimator valueAnimator2 = this.D0;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    ValueAnimator valueAnimator3 = this.E0;
                    if (valueAnimator3 != null && valueAnimator3.isRunning()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        if (getRequestedOrientation() == 1 && !pdf.pdfreader.viewer.editor.free.utils.a0.i(this)) {
                            if (this.H0 == null) {
                                this.H0 = g2();
                            }
                        } else {
                            this.H0 = null;
                        }
                        ConstraintLayout constraintLayout = this.f24447p0;
                        if (constraintLayout != null) {
                            i10 = constraintLayout.getHeight();
                        } else {
                            i10 = this.F0;
                        }
                        this.F0 = i10;
                        m2();
                        this.S = false;
                        ValueAnimator valueAnimator4 = this.D0;
                        if (valueAnimator4 != null) {
                            valueAnimator4.start();
                        }
                        int i11 = this.f24432a0;
                        if ((i11 == 0 || i11 == 2) && (valueAnimator = this.E0) != null) {
                            valueAnimator.start();
                        }
                        if (getResources().getConfiguration().orientation != 1) {
                            ViewGroup viewGroup = this.G;
                            if (viewGroup != null) {
                                viewGroup.setVisibility(8);
                            } else {
                                kotlin.jvm.internal.g.i(ea.a.p("UW8_dBxtI2Qxb1p0CGk4ZXI=", "SVIAEFUL"));
                                throw null;
                            }
                        }
                        x2();
                    }
                }
            }
        }
    }

    public final boolean c2(final Bundle bundle) {
        Intent intent;
        Uri data;
        if (pdf.pdfreader.viewer.editor.free.utils.extension.c.g(this) || pdf.pdfreader.viewer.editor.free.utils.h1.c() || (intent = getIntent()) == null || (data = intent.getData()) == null) {
            return false;
        }
        String decode = Uri.decode(data.getEncodedPath());
        if (!TextUtils.isEmpty(decode)) {
            kotlin.jvm.internal.g.d(decode, ea.a.p("VWknZSNhFmg=", "nSGW0kuo"));
            String packageName = getPackageName();
            kotlin.jvm.internal.g.d(packageName, ea.a.p("Q2EoaxJnB04TbWU=", "R3MiXMnS"));
            if (!kotlin.text.k.O(decode, packageName, false)) {
                ea.a.p("LGhUYxJOUmU-UC9yGGkbc1xvACxlbRBzNSAIZQt1M3M7UFRyFGlEczNvJCATaRpzdA==", "hA6EAzzV");
                R1(new a.d() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.x0
                    @Override // jl.a.d
                    public final void B(boolean z10) {
                        String str = OfficeAIReaderActivity.K0;
                        String p10 = ea.a.p("O2hYc10w", "ubwEd8Cx");
                        OfficeAIReaderActivity officeAIReaderActivity = OfficeAIReaderActivity.this;
                        kotlin.jvm.internal.g.e(officeAIReaderActivity, p10);
                        if (z10) {
                            officeAIReaderActivity.o2(bundle);
                        } else {
                            officeAIReaderActivity.f2();
                        }
                    }
                });
                return true;
            }
        }
        return false;
    }

    public final boolean d2() {
        lib.zj.office.system.p pVar;
        View view;
        boolean z10;
        boolean z11;
        boolean z12;
        if (((byte) this.f24432a0) != 0 || (pVar = this.Y) == null || (view = pVar.getView()) == null || !(view instanceof Word)) {
            return false;
        }
        Word word = (Word) view;
        float zoom = word.getZoom() * word.f21099g;
        InterceptTouchFrameLayout interceptTouchFrameLayout = this.f24461y;
        if (interceptTouchFrameLayout != null) {
            int height = interceptTouchFrameLayout.getHeight();
            int pageCount = word.getPageCount();
            String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
            if (zoom >= height && pageCount > 1) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            word.setIsInOneScreen(z11);
            if (!z10) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.A0 = z12;
            u2(true);
            if (z10) {
                return false;
            }
            return true;
        }
        kotlin.jvm.internal.g.i(ea.a.p("PWVQZBxydG80dCtpG2Vy", "1vjshVgR"));
        throw null;
    }

    public final void e2() {
        if (!isDestroyed() && !isFinishing() && !this.f19289b) {
            Handler i22 = i2();
            g0 g0Var = this.C0;
            i22.removeCallbacks(g0Var);
            i2().postDelayed(g0Var, 2000L);
            x2();
        }
    }

    public final void f2() {
        if (kotlin.jvm.internal.g.a(ea.a.p("dVIETSxUKkkgRA==", "rmDYM0gx"), this.f24451t) && !this.I0) {
            t1.b(ea.a.p("fGYtaRBlI0kgZVVkDHIXYzBpRGkyeWMtGC0faB1yUC0eLWtmGm4LcxogVWMdaSBpMHkeICx1LnAVaARtZQ==", "5kt4mrWQ"));
            this.I0 = true;
            Intent intent = new Intent(this, ReaderHomeActivity.class);
            intent.putExtra(ea.a.p("R2gichdFDHQbdHk=", "zADTT5VC"), this.W);
            startActivity(intent);
        }
        finish();
    }

    @Override // android.app.Activity
    public final void finish() {
        qo.a aVar = new qo.a();
        aVar.f29391a = this.W;
        wk.b.b().e(aVar);
        t1.b(ea.a.p("QWUvIANyDWcAZUdzUyA5ZiJpUWVmZipuPnNo", "WW4F965W"));
        i2().removeCallbacksAndMessages(null);
        super.finish();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
        r0 = r0.getDisplayCutout();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Point g2() {
        /*
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r2 = 0
            if (r0 < r1) goto L6f
            android.view.Window r0 = r4.getWindow()
            if (r0 == 0) goto L6f
            android.widget.LinearLayout r1 = r4.D
            if (r1 == 0) goto L63
            android.view.View r0 = r0.getDecorView()
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 != 0) goto L1c
            return r2
        L1c:
            android.view.DisplayCutout r0 = androidx.window.layout.e.f(r0)
            if (r0 != 0) goto L23
            return r2
        L23:
            android.widget.LinearLayout r1 = r4.D
            if (r1 == 0) goto L57
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            java.lang.String r2 = "XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuPm5ObgVsISBHeTtlU2EMZABvXWRHdj9lMy5kaSN3BHI-dRMuPWE_Z1puB2EKbxd0ImFGYQRz"
            java.lang.String r3 = "QcpMVaCf"
            java.lang.String r2 = ea.a.p(r2, r3)
            kotlin.jvm.internal.g.c(r1, r2)
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r2 = r1.getMarginStart()
            int r1 = r1.topMargin
            int r3 = androidx.window.layout.f.c(r0)
            int r0 = androidx.window.layout.e.b(r0)
            int r3 = r3 - r1
            int r0 = r0 - r2
            android.graphics.Point r1 = new android.graphics.Point
            r2 = 0
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = java.lang.Math.max(r3, r2)
            r1.<init>(r0, r2)
            return r1
        L57:
            java.lang.String r0 = "E2cbYRRlJG8pc3Q="
            java.lang.String r1 = "rJqKsp7g"
            java.lang.String r0 = ea.a.p(r0, r1)
            kotlin.jvm.internal.g.i(r0)
            throw r2
        L63:
            java.lang.String r0 = "UWcbYRRlNm8Tc3Q="
            java.lang.String r1 = "JKaczoXH"
            java.lang.String r0 = ea.a.p(r0, r1)
            kotlin.jvm.internal.g.i(r0)
            throw r2
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.OfficeAIReaderActivity.g2():android.graphics.Point");
    }

    @Override // lib.zj.office.system.i
    public final byte getPageListViewMovingPosition() {
        if (((byte) this.f24432a0) == 0) {
            return (byte) 1;
        }
        return (byte) 0;
    }

    @Override // lib.zj.office.system.i
    public final void h1(boolean z10) {
        this.T = z10;
    }

    public final String h2() {
        int i10 = this.f24432a0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return ea.a.p("RG85ZA==", "5MuMRGKb");
                    }
                    return ea.a.p("Q2Rm", "o6H6SpOh");
                }
                return ea.a.p("P3B0", "cbp6MrKz");
            }
            return ea.a.p("KnhSZWw=", "UzMDThhw");
        } else if (kotlin.text.j.F(this.U, ea.a.p("LHN2", "uPZYUhkh"), false)) {
            return ea.a.p("VngoZWw=", "XKgTnZ0i");
        } else {
            return ea.a.p("OG9DZA==", "UcAJzATO");
        }
    }

    @Override // lib.zj.office.system.i
    public final void i() {
        ea.a.p("IWgZbhNlEm8nbQ==", "NGBxtHAe");
        String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        d2();
    }

    public final Handler i2() {
        return (Handler) this.f24434c0.getValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0283, code lost:
        if (r0.equals(ea.a.p("Q3B0", "7ytTISwN")) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0292, code lost:
        if (r0.equals(ea.a.p("P290", "8gyTJZMT")) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0295, code lost:
        new lib.zj.office.officereader.beans.PGToolsbar(getApplicationContext(), r8.Y);
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02cb, code lost:
        if (r0.equals(ea.a.p("V290", "kEySUqFg")) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02da, code lost:
        if (r0.equals(ea.a.p("V29j", "2XaOWjqu")) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02dd, code lost:
        new lib.zj.office.officereader.beans.WPToolsbar(getApplicationContext(), r8.Y);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01a3, code lost:
        if (r0.equals(ea.a.p("TGw5eA==", "ql4MCQqN")) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01b3, code lost:
        if (r0.equals(ea.a.p("S2w_bQ==", "iARttSpA")) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01c3, code lost:
        if (r0.equals(ea.a.p("N2xCeA==", "GmiILiDw")) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01d3, code lost:
        if (r0.equals(ea.a.p("L2wbbQ==", "G7WhkH9v")) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01e3, code lost:
        if (r0.equals(ea.a.p("P3BFeA==", "3VeuMjc6")) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01f3, code lost:
        if (r0.equals(ea.a.p("Q3A_bQ==", "Suoq1RoO")) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0203, code lost:
        if (r0.equals(ea.a.p("Q28_eA==", "mq9f7SDO")) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0214, code lost:
        if (r0.equals(ea.a.p("Q28_bQ==", "wbd7m8SM")) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0224, code lost:
        if (r0.equals(ea.a.p("V28_eA==", "bWeX34ja")) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0234, code lost:
        if (r0.equals(ea.a.p("V28_bQ==", "0pPjAVpY")) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0244, code lost:
        if (r0.equals(ea.a.p("V28oeA==", "9GYrN5kd")) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0254, code lost:
        if (r0.equals(ea.a.p("N2x0", "8DftgLJx")) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0265, code lost:
        if (r0.equals(ea.a.p("HWxz", "t4eWPUqf")) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0269, code lost:
        new lib.zj.office.officereader.beans.SSToolsbar(getApplicationContext(), r8.Y);
        r2 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void init() {
        /*
            Method dump skipped, instructions count: 914
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.OfficeAIReaderActivity.init():void");
    }

    public final void j2() {
        if (this.B0) {
            this.B0 = false;
            t2();
        }
        ConstraintLayout constraintLayout = this.M;
        if (constraintLayout != null && constraintLayout.getVisibility() != 8) {
            constraintLayout.setAlpha(1.0f);
            constraintLayout.animate().alpha(0.0f).setDuration(100L).setListener(new c(constraintLayout)).start();
        }
    }

    public final void k2() {
        runOnUiThread(new s0(this, 1));
    }

    public final void l2() {
        ValueAnimator valueAnimator = this.E0;
        if (valueAnimator != null) {
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.y0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    String str = OfficeAIReaderActivity.K0;
                    String p10 = ea.a.p("O2hYc10w", "D4c3mn4W");
                    OfficeAIReaderActivity officeAIReaderActivity = OfficeAIReaderActivity.this;
                    kotlin.jvm.internal.g.e(officeAIReaderActivity, p10);
                    kotlin.jvm.internal.g.e(valueAnimator2, ea.a.p("Lm5YbRh0Xm9u", "dwRutNvE"));
                    Object animatedValue = valueAnimator2.getAnimatedValue();
                    kotlin.jvm.internal.g.c(animatedValue, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuIG5_bgxsHiBHeTtlU2sNdB5pWi4vbDlhdA==", "ORyrYc0f"));
                    float floatValue = ((Float) animatedValue).floatValue();
                    FrameLayout frameLayout = officeAIReaderActivity.I;
                    if (frameLayout != null) {
                        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                        kotlin.jvm.internal.g.c(layoutParams, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuJG5fbi1sXiA7eUFlWWFZZChvI2RbdgFlQi44aSB3InIkdQIuFWFAZyZufWEAb0J0CmE4YRhz", "ThVMKrX2"));
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.bottomMargin = -((int) (floatValue * officeAIReaderActivity.G0));
                        FrameLayout frameLayout2 = officeAIReaderActivity.I;
                        if (frameLayout2 != null) {
                            frameLayout2.setLayoutParams(marginLayoutParams);
                            return;
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("R2g-bRFDDW4GYV1uDHI=", "B2veSiTs"));
                            throw null;
                        }
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("R2g-bRFDDW4GYV1uDHI=", "XI5XHJRn"));
                    throw null;
                }
            });
        }
        ValueAnimator valueAnimator2 = this.E0;
        if (valueAnimator2 != null) {
            valueAnimator2.addListener(new d());
        }
        ValueAnimator valueAnimator3 = this.E0;
        if (valueAnimator3 != null) {
            valueAnimator3.setInterpolator(new LinearInterpolator());
        }
        ValueAnimator valueAnimator4 = this.E0;
        if (valueAnimator4 != null) {
            valueAnimator4.setDuration(200L);
        }
    }

    public final void m2() {
        int dimensionPixelSize;
        if (this.f24432a0 == 2) {
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp_75);
        } else {
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp_91);
        }
        this.G0 = dimensionPixelSize;
    }

    @Override // lib.zj.office.system.i
    public final void n0(List<Integer> list) {
        Integer num;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        o9.d.s(K0, "updateViewImages " + num);
    }

    @Override // lib.zj.office.system.i
    public final void n1(int i10) {
        String e10;
        View view;
        View view2;
        View view3;
        t1.b(ea.a.p("AGZXaRpldkkIZStkEHIpY0FpGGkxeUVvAmUGRhpsPEYmblhzESAKIC5yP2U=", "pnbjrhsY"));
        Context m10 = ReaderPdfApplication.m();
        zl.a.c.getClass();
        ig.h<Object>[] hVarArr = zl.a.f32400d;
        boolean z10 = false;
        ig.h<Object> hVar = hVarArr[0];
        pdf.pdfreader.viewer.editor.free.datasource.sp.a aVar = zl.a.f32401e;
        if (!pdf.pdfreader.viewer.editor.free.utils.t0.b0(((Number) aVar.b(hVar)).longValue(), System.currentTimeMillis())) {
            tn.a.a(m10, ea.a.p("UG85ZSx2C2UFX0doBnc=", "OSOF39Cj"));
            aVar.c(hVarArr[0], Long.valueOf(System.currentTimeMillis()));
        }
        pdf.pdfreader.viewer.editor.free.utils.q0.t();
        this.f24453u = true;
        wn.c cVar = this.f24450s0;
        cVar.f31396b = true;
        cVar.c = true;
        cVar.c();
        if (!this.f24452t0) {
            wn.b.b();
        }
        o9.d.s(K0, b.a.c("openFileFinish ", i10));
        t1.b("OfficeAIReaderActivity openFileFinish " + i10);
        dp.a.a().getClass();
        dp.a.c("OfficeAIReaderActivity openFileFinish " + i10);
        n2();
        k2();
        if (TextUtils.isEmpty(this.V)) {
            e10 = lo.d.e(this, String.valueOf(System.currentTimeMillis()));
        } else {
            e10 = lo.d.e(this, this.V);
        }
        this.f24444m0 = e10;
        ((ThumbLoadCenter) this.f24439h0.getValue()).e(new b1(this));
        lib.zj.office.system.p pVar = this.Y;
        if (pVar != null && (view = pVar.getView()) != null) {
            AppFrame appFrame = this.Z;
            View view4 = null;
            if (appFrame != null) {
                appFrame.addView(view, new LinearLayout.LayoutParams(-1, -1));
                byte b10 = (byte) this.f24432a0;
                if (b10 == 0) {
                    if (view instanceof Word) {
                        if (!this.f24452t0) {
                            pdf.pdfreader.viewer.editor.free.utils.p.w(this, ea.a.p("RG85ZA==", "ccIY5bbz"));
                        }
                        p2();
                        InterceptRecyclerView interceptRecyclerView = this.J;
                        if (interceptRecyclerView != null) {
                            interceptRecyclerView.setVisibility(0);
                            View view5 = this.K;
                            if (view5 != null) {
                                view5.setVisibility(0);
                                AppCompatTextView appCompatTextView = this.C;
                                if (appCompatTextView != null) {
                                    appCompatTextView.setText(this.V);
                                    e2();
                                    u2(true);
                                } else {
                                    kotlin.jvm.internal.g.i(ea.a.p("V2kPZTRhI2Ucdg==", "RJ1czNgq"));
                                    throw null;
                                }
                            } else {
                                kotlin.jvm.internal.g.i(ea.a.p("R2g-bRFMC25l", "yvdCSkdq"));
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("O2hEbRtSdg==", "MEetUElj"));
                            throw null;
                        }
                    }
                } else if (b10 == 1) {
                    LinearLayout linearLayout = this.D;
                    if (linearLayout != null) {
                        linearLayout.setPadding(getResources().getDimensionPixelSize(R.dimen.dp_14), 0, getResources().getDimensionPixelSize(R.dimen.dp_14), 0);
                        androidx.constraintlayout.widget.a aVar2 = new androidx.constraintlayout.widget.a();
                        ConstraintLayout constraintLayout = this.f24457w;
                        if (constraintLayout != null) {
                            aVar2.f(constraintLayout);
                            aVar2.l(R.id.bgPageToast).f3373e.f3427x = 0.5f;
                            ConstraintLayout constraintLayout2 = this.f24457w;
                            if (constraintLayout2 != null) {
                                aVar2.b(constraintLayout2);
                                this.A0 = false;
                                AppCompatTextView appCompatTextView2 = this.C;
                                if (appCompatTextView2 != null) {
                                    appCompatTextView2.setText(this.V);
                                    e2();
                                    u2(true);
                                } else {
                                    kotlin.jvm.internal.g.i(ea.a.p("D2kpZSRhIWUcdg==", "HLiEjL2D"));
                                    throw null;
                                }
                            } else {
                                kotlin.jvm.internal.g.i(ea.a.p("LG8fdC5pKmVy", "ePOqODTO"));
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("UG8ldBJpDGVy", "ux0ZlKXL"));
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.g.i(ea.a.p("LWdhYR5lY287c3Q=", "mK4PbbuB"));
                        throw null;
                    }
                } else if (b10 == 2) {
                    if (view instanceof Presentation) {
                        if (!this.f24452t0) {
                            pdf.pdfreader.viewer.editor.free.utils.p.w(this, ea.a.p("P3B0", "JNfLU6cQ"));
                        }
                        p2();
                        InterceptRecyclerView interceptRecyclerView2 = this.J;
                        if (interceptRecyclerView2 != null) {
                            interceptRecyclerView2.setVisibility(0);
                            View view6 = this.K;
                            if (view6 != null) {
                                view6.setVisibility(0);
                                try {
                                    lib.zj.office.system.p pVar2 = this.Y;
                                    if (pVar2 != null) {
                                        view2 = pVar2.getView();
                                    } else {
                                        view2 = null;
                                    }
                                    kotlin.jvm.internal.g.c(view2, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuIm5gbjpsWCA7eUFlWWxeYnR6IC4aZg5pVmVAcCIuBm8jdD9vIy5kcipzVG4NYUNpNW4=", "LbJAMMO4"));
                                    Object model = ((Presentation) view2).f20940t.f20913e.getModel();
                                    kotlin.jvm.internal.g.c(model, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuIG5BbgJsJyA7eUFlWWxeYnR6IC4aZg5pVmVAcCIuCG8rZQAuJ0cGbytlbA==", "CArFOlwK"));
                                    th.c cVar2 = (th.c) model;
                                    if (cVar2.f30031e <= 1) {
                                        s2(1);
                                    } else {
                                        AppCompatTextView appCompatTextView3 = this.f24463z;
                                        if (appCompatTextView3 != null) {
                                            appCompatTextView3.setText(String.valueOf(((Presentation) view).getCurrentIndex() + 1));
                                            ThumbnailAdapter thumbnailAdapter = this.f24440i0;
                                            if (thumbnailAdapter != null) {
                                                thumbnailAdapter.h(((Presentation) view).getCurrentIndex() + 1);
                                            }
                                            s2(cVar2.c());
                                            AppCompatTextView appCompatTextView4 = this.B;
                                            if (appCompatTextView4 != null) {
                                                appCompatTextView4.setText(String.valueOf(cVar2.f30031e));
                                                z10 = true;
                                            } else {
                                                kotlin.jvm.internal.g.i(ea.a.p("R28_YR9QA2cXVHY=", "xlTClQu0"));
                                                throw null;
                                            }
                                        } else {
                                            kotlin.jvm.internal.g.i(ea.a.p("UHU5chZuFlATZ1FUdg==", "d7Gah4yH"));
                                            throw null;
                                        }
                                    }
                                    this.A0 = z10;
                                    AppCompatTextView appCompatTextView5 = this.C;
                                    if (appCompatTextView5 != null) {
                                        appCompatTextView5.setText(this.V);
                                        e2();
                                        u2(true);
                                    } else {
                                        kotlin.jvm.internal.g.i(ea.a.p("KWldZTdhWmUOdg==", "6rP2BIkz"));
                                        throw null;
                                    }
                                } catch (Exception unused) {
                                }
                            } else {
                                kotlin.jvm.internal.g.i(ea.a.p("TGg-bRZMLG5l", "KY8KtEs9"));
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("EWggbSNSdg==", "UHeUAMWL"));
                            throw null;
                        }
                    }
                } else {
                    u2(false);
                }
                lib.zj.office.system.p pVar3 = this.Y;
                if (pVar3 != null) {
                    view3 = pVar3.getView();
                } else {
                    view3 = null;
                }
                if (view3 instanceof Word) {
                    lib.zj.office.system.p pVar4 = this.Y;
                    if (pVar4 != null) {
                        view4 = pVar4.getView();
                    }
                    kotlin.jvm.internal.g.c(view4, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuOm4bbj9sGyA7eUFlWWxeYnR6IC4aZg5pVmVAdzUuBm87dERvJi4gbz1k", "1bdXU6Jw"));
                    ((Word) view4).setListener(new h());
                    return;
                }
                return;
            }
            kotlin.jvm.internal.g.i(ea.a.p("UnA7RgFhD2U=", "6TaBSL90"));
            throw null;
        }
    }

    public final void n2() {
        PdfPreviewEntity pdfPreviewEntity;
        nl.b bVar;
        if (this.X == null && (pdfPreviewEntity = this.W) != null) {
            if (pdfPreviewEntity != null) {
                bVar = com.google.android.play.core.assetpacks.c.w(pdfPreviewEntity);
            } else {
                bVar = null;
            }
            this.X = bVar;
            ea.a.p("K2E5ZXp1AHItbhJQVWdl", "4bXO9rM7");
            nl.b bVar2 = this.X;
            String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0071, code lost:
        if (r6.A0 == false) goto L76;
     */
    @Override // pdf.pdfreader.viewer.editor.free.thumb.adapter.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o1(int r7) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.OfficeAIReaderActivity.o1(int):void");
    }

    public final void o2(Bundle bundle) {
        e.a.f29807a.a();
        ConcurrentHashMap<String, Paint> concurrentHashMap = sg.d.f29801b.f29802a;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
        lib.zj.office.system.p pVar = new lib.zj.office.system.p(this);
        this.Y = pVar;
        pVar.f21055h = new e();
        AppFrame appFrame = new AppFrame(this);
        this.Z = appFrame;
        appFrame.post(new androidx.appcompat.widget.y0(this, 26));
        lib.zj.office.system.p pVar2 = this.Y;
        if (pVar2 != null) {
            pVar2.f21054g = new f();
        }
        InterceptTouchFrameLayout interceptTouchFrameLayout = this.f24461y;
        if (interceptTouchFrameLayout != null) {
            AppFrame appFrame2 = this.Z;
            if (appFrame2 != null) {
                interceptTouchFrameLayout.addView(appFrame2);
                a2();
                v2();
                if (bundle == null) {
                    tn.a.d(this, ea.a.p("PHBdYQpo", "dtmkvGuR"), ea.a.p("Q3IudhplFV8dbldyDGEiZQ==", "6vaYZQou"), wn.b.e(), false);
                } else {
                    this.f24450s0.f31395a = bundle.getLong(ea.a.p("PGVWZCVpIGU=", "XoN7qMiN"));
                }
                InterceptTouchFrameLayout interceptTouchFrameLayout2 = this.f24461y;
                if (interceptTouchFrameLayout2 != null) {
                    interceptTouchFrameLayout2.setTopTouchListener(new t5.f(16));
                    InterceptRecyclerView interceptRecyclerView = this.J;
                    if (interceptRecyclerView != null) {
                        interceptRecyclerView.setTopTouchListener(new t5.g(14));
                        wn.b.a(false, false);
                        return;
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("O2hEbRtSdg==", "FPByQCkl"));
                    throw null;
                }
                kotlin.jvm.internal.g.i(ea.a.p("QWUqZBZyIW8cdFVpB2Vy", "Na5DP4jA"));
                throw null;
            }
            kotlin.jvm.internal.g.i(ea.a.p("UnA7RgFhD2U=", "peCEZxS0"));
            throw null;
        }
        kotlin.jvm.internal.g.i(ea.a.p("PWVQZBxydG80dCtpG2Vy", "KVMC18Xn"));
        throw null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        Object obj;
        lib.zj.office.system.j jVar;
        lib.zj.office.system.p pVar = this.Y;
        lib.zj.office.system.j jVar2 = null;
        if (pVar != null) {
            obj = pVar.w(1358954496);
        } else {
            obj = null;
        }
        if (obj != null && ((Boolean) obj).booleanValue()) {
            T(false);
            lib.zj.office.system.p pVar2 = this.Y;
            if (pVar2 != null) {
                pVar2.r(1358954498, null);
                return;
            }
            return;
        }
        lib.zj.office.system.p pVar3 = this.Y;
        if (pVar3 != null) {
            jVar2 = pVar3.f21056i;
        }
        if (jVar2 != null) {
            if (pVar3 != null && (jVar = pVar3.f21056i) != null) {
                jVar.abortReader();
            }
            this.f24462y0 = true;
        }
        super.onBackPressed();
    }

    @Override // androidx.appcompat.app.c, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.g.e(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation != getResources().getConfiguration().orientation) {
            getResources().updateConfiguration(newConfig, null);
        }
        pdf.pdfreader.viewer.editor.free.utils.a0.a(this, true);
        int i10 = this.f24438g0;
        int i11 = newConfig.orientation;
        if (i10 != i11) {
            this.f24438g0 = i11;
            z2();
            P1();
        }
        dp.a a10 = dp.a.a();
        a10.getClass();
        dp.a.c("OfficeAIReaderActivity onConfigurationChanged " + newConfig.orientation);
        androidx.activity.s.f1864s = pdf.pdfreader.viewer.editor.free.utils.extension.c.j(this);
        int i12 = 0;
        if (newConfig.orientation == 1) {
            a2();
            ViewGroup viewGroup = this.G;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
                return;
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("LW9FdBZtdmQZbyR0FGkGZXI=", "wbTxIpi2"));
                throw null;
            }
        }
        ViewGroup viewGroup2 = this.G;
        if (viewGroup2 != null) {
            if (!this.S) {
                i12 = 8;
            }
            viewGroup2.setVisibility(i12);
            return;
        }
        kotlin.jvm.internal.g.i(ea.a.p("LW9FdBZtdmQZbyR0FGkGZXI=", "rtGgAFmt"));
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x028c, code lost:
        if (r1 == null) goto L78;
     */
    @Override // jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 876
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.OfficeAIReaderActivity.onCreate(android.os.Bundle):void");
    }

    @Override // jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onDestroy() {
        boolean z10;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        tf.c cVar = this.f24439h0;
        ((ThumbLoadCenter) cVar.getValue()).e(null);
        ((ThumbLoadCenter) cVar.getValue()).f();
        pdf.pdfreader.viewer.editor.free.utils.t0.V().execute(new t0(this, 0));
        EngineHelper.f15726a.getClass();
        EngineHelper.e(this.f24449r0);
        super.onDestroy();
        androidx.activity.f.q("AGZXaRpldkkIZStkEHIpY0FpGGkxeUVvCkQmcwByNXk=", "MtvodCtZ", dp.a.a());
        lib.zj.office.system.p pVar = this.Y;
        if (pVar != null) {
            pVar.dispose();
        }
        ValueAnimator valueAnimator3 = this.D0;
        boolean z11 = true;
        if (valueAnimator3 != null && valueAnimator3.isRunning()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (valueAnimator2 = this.D0) != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator4 = this.E0;
        if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
            z11 = false;
        }
        if (z11 && (valueAnimator = this.E0) != null) {
            valueAnimator.cancel();
        }
        wn.c cVar2 = this.f24450s0;
        if (cVar2.c) {
            tn.a.d(ReaderPdfApplication.m(), ea.a.p("OWlUdw==", "cAhTBBvD"), ea.a.p("RWkudyx0C21l", "Oac2jMM1"), h2() + "_" + cVar2.a(), false);
        }
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onPause() {
        t1.b(ea.a.p("fGYtaRBlI0kgZVVkDHIXYzBpRGkyeWNvIlAAdTRl", "LaGfNOWI"));
        ((hp.e) this.f24436e0.getValue()).d();
        super.onPause();
        androidx.activity.f.q("DWYqaTVlMkkaZQdkUXIWY0xpJGk9eRZvGlAQdSJl", "o9BLVsvC", dp.a.a());
        g0 g0Var = this.C0;
        if (g0Var != null) {
            t1.b(ea.a.p("DmZfaSFlD0kaZQdkUXIWY0xpJGk9eRZvGlAQdSJlbiAzZVRvNGVuZC1sB3kUZzhuXSAgdSduV2IYZQ==", "TTA9BNvV"));
            i2().removeCallbacks(g0Var);
        }
        this.f24450s0.b();
        gl.o.f17931a.getClass();
        gl.p.f17933p.l();
        gl.q.f17934p.l();
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onResume() {
        pdf.pdfreader.viewer.editor.free.utils.e1.f28647a = false;
        ((hp.e) this.f24436e0.getValue()).c();
        AppOpenManager.c().f23907g = true;
        super.onResume();
        androidx.activity.s.w0(this);
        aj.b.j(this, this.F, ea.a.p("BmYRaVpl", "2ziw9Rw2"), this.f24449r0);
        aj.b.L();
        if (this.f24437f0) {
            this.f24437f0 = false;
            i2().postDelayed(new u0(this, 0), 10L);
            return;
        }
        dp.a a10 = dp.a.a();
        String p10 = ea.a.p("AGZXaRpldkkIZStkEHIpY0FpGGkxeUVvPFIIcz9tZQ==", "IfVNRmJR");
        a10.getClass();
        dp.a.c(p10);
        t1.b(ea.a.p("fGYtaRBlI0kgZVVkDHIXYzBpRGkyeWNvClJcc0BtZQ==", "d95N1lFn"));
        e2();
        this.f24450s0.c();
    }

    @Override // jl.a, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.g.e(outState, "outState");
        super.onSaveInstanceState(outState);
        wn.c cVar = this.f24450s0;
        cVar.c = false;
        outState.putLong(ea.a.p("QWUqZCdpD2U=", "asuW0HoZ"), cVar.f31395a);
        outState.putBoolean(ea.a.p("PWVQZABKQm0qSCVtEE8GUlBzG21l", "bBDZUYoi"), this.f24437f0);
    }

    @Override // jl.a, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z10) {
        c7.w wVar;
        super.onWindowFocusChanged(z10);
        if (z10) {
            pdf.pdfreader.viewer.editor.free.utils.e1.f28647a = false;
        }
        this.f24446o0 = z10;
        if (z10 && (wVar = this.f24464z0) != null) {
            kotlin.jvm.internal.g.b(wVar);
            c7.w wVar2 = this.f24464z0;
            kotlin.jvm.internal.g.b(wVar2);
            c7.w wVar3 = this.f24464z0;
            kotlin.jvm.internal.g.b(wVar3);
            w2((String) wVar.f5664a, (String) wVar2.f5665b, (String) wVar3.c);
            this.f24464z0 = null;
        }
    }

    public final void p2() {
        int dimensionPixelSize;
        InterceptRecyclerView interceptRecyclerView = this.J;
        if (interceptRecyclerView != null) {
            boolean z10 = false;
            interceptRecyclerView.setLayoutManager(new LinearLayoutManager(0));
            pdf.pdfreader.viewer.editor.free.thumb.adapter.b bVar = new pdf.pdfreader.viewer.editor.free.thumb.adapter.b(this.f24444m0, this.f24442k0);
            this.f24443l0 = bVar;
            ThumbLoadCenter thumbLoadCenter = (ThumbLoadCenter) this.f24439h0.getValue();
            if (this.f24432a0 == 2) {
                z10 = true;
            }
            ThumbnailAdapter thumbnailAdapter = new ThumbnailAdapter(this, thumbLoadCenter, false, bVar, z10, this);
            this.f24440i0 = thumbnailAdapter;
            InterceptRecyclerView interceptRecyclerView2 = this.J;
            if (interceptRecyclerView2 != null) {
                interceptRecyclerView2.setAdapter(thumbnailAdapter);
                InterceptRecyclerView interceptRecyclerView3 = this.J;
                if (interceptRecyclerView3 != null) {
                    ViewGroup.LayoutParams layoutParams = interceptRecyclerView3.getLayoutParams();
                    if (this.f24432a0 == 2) {
                        dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp_74);
                    } else {
                        dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp_90);
                    }
                    layoutParams.height = dimensionPixelSize;
                    interceptRecyclerView3.setLayoutParams(layoutParams);
                    return;
                }
                kotlin.jvm.internal.g.i(ea.a.p("QGgibVVSdg==", "pT4W7HDl"));
                throw null;
            }
            kotlin.jvm.internal.g.i(ea.a.p("I2g9bTNSdg==", "GVWHQQcW"));
            throw null;
        }
        kotlin.jvm.internal.g.i(ea.a.p("R2g-bRFSdg==", "WTuRvwf0"));
        throw null;
    }

    @Override // lib.zj.office.system.i
    public final boolean q() {
        return false;
    }

    public final void q2() {
        ValueAnimator valueAnimator = this.D0;
        kotlin.jvm.internal.g.b(valueAnimator);
        valueAnimator.addListener(new g());
        ValueAnimator valueAnimator2 = this.D0;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new n8.a(this, 2));
        }
        ValueAnimator valueAnimator3 = this.D0;
        if (valueAnimator3 != null) {
            valueAnimator3.setInterpolator(new LinearInterpolator());
        }
        ValueAnimator valueAnimator4 = this.D0;
        if (valueAnimator4 != null) {
            valueAnimator4.setDuration(200L);
        }
    }

    public final boolean r2() {
        if (!kotlin.jvm.internal.g.a(ea.a.p("NFJ3TThUJEkaRA==", "9Xr8glbj"), this.f24451t) && !kotlin.jvm.internal.g.a(ea.a.p("PGE9ZRJ3M2QvZXQ=", "C7LZMZOU"), this.f24451t)) {
            return false;
        }
        return true;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void s2(int i10) {
        boolean z10;
        ThumbnailAdapter thumbnailAdapter;
        int i11 = this.f24442k0;
        if (i11 >= i10) {
            return;
        }
        if (i11 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f24442k0 = i10;
        pdf.pdfreader.viewer.editor.free.thumb.adapter.b bVar = this.f24443l0;
        if (bVar != null && (thumbnailAdapter = this.f24440i0) != null) {
            if (z10) {
                bVar.f26598b = i10;
                thumbnailAdapter.notifyDataSetChanged();
                return;
            }
            int i12 = thumbnailAdapter.f26582g.f26598b;
            bVar.f26598b = i10;
            thumbnailAdapter.notifyItemRangeInserted(i12, i10 - i12);
        }
    }

    @Override // lib.zj.office.system.i
    public final boolean t(int i10, Object obj) {
        lib.zj.office.system.r rVar;
        lib.zj.office.system.d c10;
        try {
            if (i10 != 0) {
                if (i10 != 20) {
                    if (i10 != 1073741828) {
                        return false;
                    }
                    return true;
                }
                N();
            } else {
                onBackPressed();
            }
            return true;
        } catch (Exception e10) {
            lib.zj.office.system.p pVar = this.Y;
            if (pVar != null && (rVar = pVar.f21062o) != null && (c10 = rVar.c()) != null) {
                c10.a(false, e10);
                return true;
            }
            return true;
        }
    }

    public final void t2() {
        int i10;
        int i11;
        int i12;
        AppCompatTextView appCompatTextView = this.f24463z;
        if (appCompatTextView != null) {
            if (this.A0 && !this.B0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            appCompatTextView.setVisibility(i10);
            AppCompatTextView appCompatTextView2 = this.A;
            if (appCompatTextView2 != null) {
                if (this.A0 && !this.B0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                appCompatTextView2.setVisibility(i11);
                AppCompatTextView appCompatTextView3 = this.B;
                if (appCompatTextView3 != null) {
                    if (this.A0 && !this.B0) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    appCompatTextView3.setVisibility(i12);
                    if (this.A0 && !this.B0) {
                        LinearLayout linearLayout = this.D;
                        if (linearLayout != null) {
                            linearLayout.setVisibility(0);
                            return;
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("UWcbYRRlNm8Tc3Q=", "GNaPb9ss"));
                            throw null;
                        }
                    }
                    LinearLayout linearLayout2 = this.D;
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(8);
                        return;
                    } else {
                        kotlin.jvm.internal.g.i(ea.a.p("LWdhYR5lY287c3Q=", "Pl8cejDG"));
                        throw null;
                    }
                }
                kotlin.jvm.internal.g.i(ea.a.p("P28BYR9QWGctVHY=", "WTKus9AD"));
                throw null;
            }
            kotlin.jvm.internal.g.i(ea.a.p("P2FWZSpsVnNo", "CM2N8TOV"));
            throw null;
        }
        kotlin.jvm.internal.g.i(ea.a.p("LHVDchxuQ1A7Zy9Udg==", "BcKu8r2i"));
        throw null;
    }

    public final void u2(boolean z10) {
        boolean z11 = this.A0;
        String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        if (!z11) {
            LinearLayout linearLayout = this.D;
            if (linearLayout != null) {
                if (linearLayout.getVisibility() != 8) {
                    LinearLayout linearLayout2 = this.D;
                    if (linearLayout2 != null) {
                        linearLayout2.setAlpha(1.0f);
                        LinearLayout linearLayout3 = this.D;
                        if (linearLayout3 != null) {
                            linearLayout3.animate().alpha(0.0f).setDuration(450L).setListener(new j());
                            return;
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("UWcbYRRlNm8Tc3Q=", "AIzCIuaS"));
                            throw null;
                        }
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("LWdhYR5lY287c3Q=", "sIWOZmdO"));
                    throw null;
                }
                return;
            }
            kotlin.jvm.internal.g.i(ea.a.p("LWdhYR5lY287c3Q=", "oejkkwDN"));
            throw null;
        } else if (!z10) {
            LinearLayout linearLayout4 = this.D;
            if (linearLayout4 != null) {
                if (linearLayout4.getVisibility() != 8) {
                    LinearLayout linearLayout5 = this.D;
                    if (linearLayout5 != null) {
                        linearLayout5.setAlpha(1.0f);
                        LinearLayout linearLayout6 = this.D;
                        if (linearLayout6 != null) {
                            linearLayout6.animate().alpha(0.0f).setDuration(450L).setListener(new k()).start();
                            return;
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("Kmc4YSplHm8pc3Q=", "B7HhMJ4u"));
                            throw null;
                        }
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("LWchYRZlGW8pc3Q=", "TPOqqMFt"));
                    throw null;
                }
                return;
            }
            kotlin.jvm.internal.g.i(ea.a.p("CGcUYTVlY28pc3Q=", "QOjDR7Rn"));
            throw null;
        } else {
            LinearLayout linearLayout7 = this.D;
            if (linearLayout7 != null) {
                if (linearLayout7.getVisibility() != 0) {
                    LinearLayout linearLayout8 = this.D;
                    if (linearLayout8 != null) {
                        linearLayout8.setAlpha(0.0f);
                        LinearLayout linearLayout9 = this.D;
                        if (linearLayout9 != null) {
                            linearLayout9.animate().alpha(1.0f).setDuration(450L).setListener(null).start();
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("BWdnYSxlOW8pc3Q=", "cCg7Kmhm"));
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.g.i(ea.a.p("UWcFYVBlAG8pc3Q=", "nC3U7TIE"));
                        throw null;
                    }
                }
                LinearLayout linearLayout10 = this.D;
                if (linearLayout10 != null) {
                    linearLayout10.setVisibility(0);
                    t2();
                    return;
                }
                kotlin.jvm.internal.g.i(ea.a.p("LWdhYR5lY287c3Q=", "ybAZIxJR"));
                throw null;
            }
            kotlin.jvm.internal.g.i(ea.a.p("W2c0YV5lMm8pc3Q=", "bq9d9ftg"));
            throw null;
        }
    }

    @Override // lib.zj.office.system.i
    public final void v0(int i10, Throwable th2) {
        String string;
        String string2;
        int i11;
        String str;
        String str2;
        if (this.f24462y0) {
            t1.b(ea.a.p("AGZXaRpldkkIZStkEHIpY0FpGGkxeUVpF0knaQxpOHQmdlRBG29FdAhlK2QQckg9FXQcdSAsRXIBdDxybg==", "nejPdIxY"));
        } else if (this.f24453u) {
            t1.b(ea.a.p("dmYpaRZlckkaZQdkUXIWY0xpJGk9eRZvBGUfRjhsJ1NMYyxlBnMTPWh0FHVRLHdyXXQncm4=", "TT9Ou3KB"));
        } else {
            dp.a.a().getClass();
            dp.a.c("OfficeAIReaderActivity errorCode " + i10 + " error " + th2);
            if (th2 != null) {
                dp.a.a().getClass();
                dp.a.e(th2);
            }
            if (!kotlin.jvm.internal.g.a(Looper.myLooper(), Looper.getMainLooper())) {
                ea.a.p("AGZXaRpldkkIZStkEHIpY0FpGGkxeUVwBmlWdANyJ289IF9vDSBebnptK2kbIBxoR2UPZGkgF2UAdUpu", "IOkut8FU");
                String str3 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                return;
            }
            t1.c("OfficeAIReaderActivity errorCode " + i10 + " error", th2);
            u2(false);
            if (i10 != 0) {
                if (i10 != 11) {
                    switch (i10) {
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            break;
                        case 6:
                        case 7:
                            string = getResources().getString(R.string.arg_res_0x7f13040a);
                            kotlin.jvm.internal.g.d(string, ea.a.p("QWU4bwZyAWUBLlNlHVMici1uVSgULjB0qYDhLh1lAGRWchR1HXMXcAJvRnQMZAlmLWxXKQ==", "KGoaT9kt"));
                            string2 = getResources().getString(R.string.arg_res_0x7f13040b);
                            kotlin.jvm.internal.g.d(string2, ea.a.p("SAprIFMgQiBSIBQgSSB2IGQgV3I0bzFUqYD0ZAVmIWxWXy9lACloIFIgFCBJIHYgZCASfQ==", "KRZHY9SP"));
                            i11 = 3;
                            break;
                        default:
                            string = getResources().getString(R.string.arg_res_0x7f1303be);
                            kotlin.jvm.internal.g.d(string, ea.a.p("PWVCbwxyVGUpLi1lAVMcclxuCSgXLhZ0KmldZ2FyA2ErZUNfFm9Hcyk=", "l1EVX3Of"));
                            string2 = getResources().getString(R.string.arg_res_0x7f1303a5);
                            kotlin.jvm.internal.g.d(string2, ea.a.p("NAoRIFkgFyB6IGogVSBIIBUgGmkxbABTkIDkcyNlA18qckNvCyk9IHogaiBVIEggFSBOfQ==", "zMcurBWn"));
                            i11 = 4;
                            break;
                    }
                }
                string = getResources().getString(R.string.arg_res_0x7f1303be);
                kotlin.jvm.internal.g.d(string, ea.a.p("MWUJbw1yVGU7LgFlQFMjclFuNSgbLkV0BmkfZ39yJ2EnZQhfF29Hcyk=", "XyCzx7Jy"));
                string2 = getResources().getString(R.string.arg_res_0x7f1303a4);
                kotlin.jvm.internal.g.d(string2, ea.a.p("SAprIFMgQiBSIBQgSSB2IGQgV3I0bzFUq4DgYUZzKl9WcjlvASloIFIgFCBJIHYgZCASfQ==", "IF4OEW5X"));
                i11 = 1;
            } else {
                string = getResources().getString(R.string.arg_res_0x7f1303be);
                kotlin.jvm.internal.g.d(string, ea.a.p("QWU4bwZyAWUBLlNlHVMici1uVSgULjB0O2k0Zx5yHWFXZTlfHG8Scyk=", "IZ0xoo1B"));
                string2 = getResources().getString(R.string.arg_res_0x7f1303a3);
                kotlin.jvm.internal.g.d(string2, ea.a.p("SAprIFMgQiBSIBQgSSB2IGQgV3I0bzFUg4DVYQlrMm1WbSRyCiloIFIgFCBJIHYgZCASfQ==", "asjmUT87"));
                i11 = 2;
            }
            i3 i3Var = new i3(this, string, string2, null);
            i3Var.setCanceledOnTouchOutside(false);
            i3Var.setCancelable(true);
            i3Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.w0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    String str4 = OfficeAIReaderActivity.K0;
                    String p10 = ea.a.p("R2gic1cw", "fbElUeS0");
                    OfficeAIReaderActivity officeAIReaderActivity = OfficeAIReaderActivity.this;
                    kotlin.jvm.internal.g.e(officeAIReaderActivity, p10);
                    officeAIReaderActivity.i2().postDelayed(new t0(officeAIReaderActivity, 2), 150L);
                }
            });
            i3Var.show();
            k2();
            String p10 = ea.a.p("H2lcdw==", "Tsi9vxyU");
            String p11 = ea.a.p("RGkPd21lPHIncg==", "tG2j2NHU");
            if (r2()) {
                str = "R2gicmQ=";
                str2 = "TLLd0OlD";
            } else {
                str = "K2VCaw==";
                str2 = "eeKrNuhI";
            }
            tn.a.d(this, p10, p11, ea.a.p(str, str2) + "_" + h2() + "_" + i11, false);
        }
    }

    public final void v2() {
        boolean z10;
        boolean z11;
        int i10;
        ValueAnimator valueAnimator;
        if (this.f24447p0 != null && !this.S) {
            ea.a.p("Yi0cLVQtQG8oZGpzHW8fQkB0Gm8rc0V2WHMjYjBsAHQ2PUdpCmlVbGU=", "nlwJ1JYi");
            String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
            if (this.f24433b0) {
                u2(true);
                x2();
            }
            if (this.D0 == null) {
                this.D0 = ValueAnimator.ofFloat(0.0f, 1.0f);
                q2();
            }
            if (this.E0 == null) {
                this.E0 = ValueAnimator.ofFloat(0.0f, 1.0f);
                l2();
            }
            ValueAnimator valueAnimator2 = this.D0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return;
            }
            ValueAnimator valueAnimator3 = this.E0;
            if (valueAnimator3 != null && valueAnimator3.isRunning()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return;
            }
            if (getRequestedOrientation() == 1 && !pdf.pdfreader.viewer.editor.free.utils.a0.i(this)) {
                if (this.H0 == null) {
                    this.H0 = g2();
                }
            } else {
                this.H0 = null;
            }
            ConstraintLayout constraintLayout = this.f24447p0;
            if (constraintLayout != null) {
                i10 = constraintLayout.getHeight();
            } else {
                i10 = this.F0;
            }
            this.F0 = i10;
            m2();
            this.S = true;
            ValueAnimator valueAnimator4 = this.D0;
            if (valueAnimator4 != null) {
                valueAnimator4.reverse();
            }
            int i11 = this.f24432a0;
            if ((i11 == 0 || i11 == 2) && (valueAnimator = this.E0) != null) {
                valueAnimator.reverse();
            }
            if (getResources().getConfiguration().orientation != 1) {
                ViewGroup viewGroup = this.G;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("FG8HdD5tF2QLbwh0VWk5ZXI=", "E8vsQVqs"));
                    throw null;
                }
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a.d
    public final void w(boolean z10) {
        if (!z10) {
            f2();
        }
    }

    public final void w2(String str, String str2, String str3) {
        if (!this.f24446o0) {
            this.f24464z0 = new c7.w(str, str2, str3);
            return;
        }
        this.S = true;
        i3 i3Var = new i3(this, str, str2, str3);
        i3Var.setCanceledOnTouchOutside(false);
        i3Var.setCancelable(true);
        i3Var.setOnCancelListener(new v0(this, 0));
        i3Var.show();
    }

    @Override // lib.zj.office.system.i
    public final String x0() {
        String string = getResources().getString(R.string.arg_res_0x7f13036c);
        kotlin.jvm.internal.g.d(string, ea.a.p("QWU4bwZyAWUBLlNlHVMici1uVSgULjB0EGkeZ09yEWFXZTlfEnASXxxhWWUp", "bpatwvyo"));
        return string;
    }

    public final void x2() {
        View view;
        lib.zj.office.system.p pVar = this.Y;
        if (pVar != null && (view = pVar.getView()) != null && (view instanceof Word)) {
            Word word = (Word) view;
            word.T = false;
            word.d(true, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003a, code lost:
        if (r4.A0 == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y2(int r5, boolean r6) {
        /*
            r4 = this;
            r6 = 0
            r0 = 1
            if (r5 == 0) goto L20
            if (r5 == r0) goto L7
            goto L3c
        L7:
            lib.zj.office.system.p r1 = r4.Y
            if (r1 == 0) goto L10
            android.view.View r1 = r1.getView()
            goto L11
        L10:
            r1 = r6
        L11:
            boolean r2 = r1 instanceof lib.zj.office.pg.control.Presentation
            if (r2 == 0) goto L18
            lib.zj.office.pg.control.Presentation r1 = (lib.zj.office.pg.control.Presentation) r1
            goto L19
        L18:
            r1 = r6
        L19:
            if (r1 == 0) goto L3c
            int r1 = r1.getSlideCount()
            goto L3d
        L20:
            lib.zj.office.system.p r1 = r4.Y
            if (r1 == 0) goto L29
            android.view.View r1 = r1.getView()
            goto L2a
        L29:
            r1 = r6
        L2a:
            boolean r2 = r1 instanceof lib.zj.office.wp.control.Word
            if (r2 == 0) goto L31
            lib.zj.office.wp.control.Word r1 = (lib.zj.office.wp.control.Word) r1
            goto L32
        L31:
            r1 = r6
        L32:
            if (r1 == 0) goto L3c
            int r1 = r1.getPageCount()
            boolean r2 = r4.A0
            if (r2 != 0) goto L3d
        L3c:
            r1 = r0
        L3d:
            if (r1 > r0) goto L40
            return
        L40:
            pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity r0 = r4.W
            java.lang.String r2 = "dVIETSxBSQ=="
            java.lang.String r3 = "Gczoeqb0"
            java.lang.String r2 = ea.a.p(r2, r3)
            java.lang.String r3 = r4.f24451t
            boolean r2 = kotlin.jvm.internal.g.a(r2, r3)
            if (r2 == 0) goto L57
            java.lang.String r2 = "Lmk="
            java.lang.String r3 = "TU8K8Viu"
            goto L5b
        L57:
            java.lang.String r2 = "IW9DbRhs"
            java.lang.String r3 = "LZFXkb4O"
        L5b:
            java.lang.String r2 = ea.a.p(r2, r3)
            r3 = 0
            pdf.pdfreader.viewer.editor.free.utils.p.h(r4, r0, r3, r2)
            pdf.pdfreader.viewer.editor.free.ui.dialog.s r0 = r4.f24435d0
            if (r0 == 0) goto L6c
            r0.show()
            tf.d r6 = tf.d.f30009a
        L6c:
            if (r6 != 0) goto L7f
            pdf.pdfreader.viewer.editor.free.ui.dialog.s r6 = new pdf.pdfreader.viewer.editor.free.ui.dialog.s
            r6.<init>(r4, r1)
            pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.OfficeAIReaderActivity$l r0 = new pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.OfficeAIReaderActivity$l
            r0.<init>(r5)
            r6.f27742t = r0
            r6.show()
            r4.f24435d0 = r6
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.OfficeAIReaderActivity.y2(int, boolean):void");
    }

    public final void z2() {
        View view = this.f24448q0;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = pdf.pdfreader.viewer.editor.free.utils.t0.U(this);
            }
            View view2 = this.f24448q0;
            if (view2 != null) {
                view2.setLayoutParams(layoutParams);
            }
        }
    }

    /* compiled from: OfficeAIReaderActivity.kt */
    /* loaded from: classes3.dex */
    public static final class f implements sg.c {
        @Override // sg.c
        public final Bitmap a(int i10, int i11) {
            return null;
        }

        @Override // sg.c
        public final void b() {
        }

        @Override // sg.c
        public final void c() {
        }

        @Override // sg.c
        public final void d() {
        }

        @Override // sg.c
        public final void dispose() {
        }
    }

    @Override // lib.zj.office.system.i
    public final void H0() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a.d
    public final void J() {
    }

    @Override // lib.zj.office.system.i
    public final /* synthetic */ void X0() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a.d
    public final void a0() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a.d
    public final void close() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a.d
    public final void d() {
    }

    @Override // lib.zj.office.system.i
    public final void d1() {
    }

    @Override // lib.zj.office.system.i
    public final void j() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.fnbridge.b
    public final void k() {
    }

    @Override // lib.zj.office.system.i
    public final void k0() {
    }

    @Override // lib.zj.office.system.i
    public final void l() {
    }

    @Override // lib.zj.office.system.i
    public final Activity m() {
        return this;
    }

    @Override // pdf.pdfreader.viewer.editor.free.fnbridge.b
    public final void n() {
    }

    @Override // lib.zj.office.system.i
    public final void o() {
    }
}
