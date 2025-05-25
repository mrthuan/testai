package pdf.pdfreader.viewer.editor.free.ui.act;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.ads.ADRequestList;
import el.c;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ads.AppOpenManager;
import pdf.pdfreader.viewer.editor.free.ads.standard.banner.BannerType;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.utils.t1;
import x0.f0;

/* compiled from: PreInstallOpenAdActivity.kt */
/* loaded from: classes3.dex */
public final class PreInstallOpenAdActivity extends jl.a implements hl.a {

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ int f26628u = 0;

    /* renamed from: t  reason: collision with root package name */
    public final tf.c f26629t = kotlin.a.a(new cg.a<am.r>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.PreInstallOpenAdActivity$binding$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final am.r invoke() {
            View inflate = PreInstallOpenAdActivity.this.getLayoutInflater().inflate(R.layout.activity_pre_install_oepn_ad, (ViewGroup) null, false);
            int i10 = R.id.loadingAnim;
            if (((LottieAnimationView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.loadingAnim)) != null) {
                i10 = R.id.nativeOpenAdContainer;
                FrameLayout frameLayout = (FrameLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.nativeOpenAdContainer);
                if (frameLayout != null) {
                    i10 = R.id.welcomeTv;
                    if (((AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.welcomeTv)) != null) {
                        return new am.r((ConstraintLayout) inflate, frameLayout);
                    }
                }
            }
            throw new NullPointerException(ea.a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpLGhuSQU6IA==", "6Y62XNA6").concat(inflate.getResources().getResourceName(i10)));
        }
    });

    /* compiled from: PreInstallOpenAdActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static void a(Activity context) {
            kotlin.jvm.internal.g.e(context, "context");
            if (!androidx.activity.s.x(context) && !BillingConfigImpl.c.w()) {
                no.f.b(context).getClass();
                if (no.f.f() && cl.b.b(context)) {
                    if (!pdf.pdfreader.viewer.editor.free.utils.c1.s(context)) {
                        String p10 = ea.a.p("Y3IuSR1zFmEebHphHWkgZQtwV24HZGNzKWlJIABkT2xcYWQ=", "B9aoApzL");
                        int i10 = zk.a.f32399a;
                        t1.b(p10);
                        return;
                    }
                    context.startActivity(new Intent(context, PreInstallOpenAdActivity.class));
                    AppOpenManager.c().f23910j = true;
                    Activity l10 = pdf.pdfreader.viewer.editor.free.utils.extension.c.l(context);
                    if (l10 != null) {
                        l10.overridePendingTransition(0, 0);
                    }
                }
            }
        }
    }

    /* compiled from: PreInstallOpenAdActivity.kt */
    /* loaded from: classes3.dex */
    public static final class b implements androidx.lifecycle.x, kotlin.jvm.internal.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cg.l f26630a;

        public b(cg.l lVar) {
            ea.a.p("KXVfYw1pWG4=", "TKWNr4bb");
            this.f26630a = lVar;
        }

        @Override // kotlin.jvm.internal.e
        public final cg.l a() {
            return this.f26630a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof androidx.lifecycle.x) && (obj instanceof kotlin.jvm.internal.e)) {
                return kotlin.jvm.internal.g.a(this.f26630a, ((kotlin.jvm.internal.e) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return this.f26630a.hashCode();
        }

        @Override // androidx.lifecycle.x
        public final /* synthetic */ void m(Object obj) {
            this.f26630a.invoke(obj);
        }
    }

    @Override // jl.a
    public final View D1() {
        ConstraintLayout constraintLayout = a2().f1350a;
        kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("LWlfZBBuUC4obyV0", "JAbwDfcl"));
        return constraintLayout;
    }

    @Override // jl.a
    public final int E1() {
        return 0;
    }

    @Override // jl.a
    public final int G1() {
        return 0;
    }

    @Override // jl.a
    public final void K1() {
        ConstraintLayout constraintLayout = a2().f1350a;
        androidx.appcompat.libconvert.helper.b bVar = new androidx.appcompat.libconvert.helper.b(this, 11);
        WeakHashMap<View, x0.n0> weakHashMap = x0.f0.f31435a;
        f0.i.u(constraintLayout, bVar);
        b2();
    }

    @Override // jl.a
    public final void L1() {
        BillingConfigImpl.c.getClass();
        BillingConfigImpl.x().e(this, new b(new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.PreInstallOpenAdActivity$initViewModel$1

            /* compiled from: PreInstallOpenAdActivity.kt */
            @wf.c(c = "pdf.pdfreader.viewer.editor.free.ui.act.PreInstallOpenAdActivity$initViewModel$1$1", f = "PreInstallOpenAdActivity.kt", l = {66}, m = "invokeSuspend")
            /* renamed from: pdf.pdfreader.viewer.editor.free.ui.act.PreInstallOpenAdActivity$initViewModel$1$1  reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements cg.p<kotlinx.coroutines.w, kotlin.coroutines.c<? super tf.d>, Object> {
                int label;
                final /* synthetic */ PreInstallOpenAdActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(PreInstallOpenAdActivity preInstallOpenAdActivity, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.this$0 = preInstallOpenAdActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.c<tf.d> create(Object obj, kotlin.coroutines.c<?> cVar) {
                    return new AnonymousClass1(this.this$0, cVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.label;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            androidx.activity.s.u0(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        androidx.activity.s.u0(obj);
                        this.label = 1;
                        if (kotlinx.coroutines.e0.a(1000L, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    this.this$0.finish();
                    return tf.d.f30009a;
                }

                @Override // cg.p
                public final Object invoke(kotlinx.coroutines.w wVar, kotlin.coroutines.c<? super tf.d> cVar) {
                    return ((AnonymousClass1) create(wVar, cVar)).invokeSuspend(tf.d.f30009a);
                }
            }

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
                kotlin.jvm.internal.g.d(bool, ea.a.p("WnQ=", "V5gYVKte"));
                if (bool.booleanValue()) {
                    pdf.pdfreader.viewer.editor.free.utils.t0.d0(b.b.x(PreInstallOpenAdActivity.this), null, null, new AnonymousClass1(PreInstallOpenAdActivity.this, null), 3);
                }
            }
        }));
    }

    public final am.r a2() {
        return (am.r) this.f26629t.getValue();
    }

    public final void b2() {
        byte b10;
        c.a aVar = el.c.f16799g;
        el.c a10 = aVar.a();
        if (a10.f16801a != null && a10.f16805f != null) {
            b10 = 1;
        } else {
            b10 = 0;
        }
        if (b10 != 0) {
            el.c a11 = aVar.a();
            FrameLayout frameLayout = a2().f1351b;
            kotlin.jvm.internal.g.d(frameLayout, ea.a.p("UWklZBpuBS4cYUBpH2UZcCFuc2QFby10BmkFZXI=", "gklp3V5K"));
            a11.b(frameLayout);
            return;
        }
        aVar.a().f16802b = this;
        el.c a12 = aVar.a();
        synchronized (a12) {
            if (BillingConfigImpl.c.w()) {
                String p10 = ea.a.p("P3JUbRB1WiAvcy9yWSAba1xwTmwkbgJ1IGcmTR50MGIjZX9hDWlBZXpsJWFk", "212nACkQ");
                int i10 = zk.a.f32399a;
                t1.b(p10);
            } else if (a12.f16803d) {
                el.c.a(ea.a.p("LmQRchxxQmUpdCNuEixIc15pHiApbwRk", "rXe2DlhR"));
            } else if (!pdf.pdfreader.viewer.editor.free.utils.c1.s(this)) {
                el.c.a(ea.a.p("QGsicFNhBiAeb1Vk", "NUJINVWS"));
            } else {
                ADRequestList aDRequestList = new ADRequestList(new el.d(a12));
                float p02 = pdf.pdfreader.viewer.editor.free.utils.t0.p0(this) * 0.9f;
                float dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp_300);
                if (p02 > dimensionPixelSize) {
                    p02 = dimensionPixelSize;
                }
                aDRequestList.addAll(he.a.a(this, p02));
                a12.c = false;
                a12.f16803d = true;
                a12.f16804e = false;
                Iterator<yd.c> it = aDRequestList.iterator();
                while (it.hasNext()) {
                    ((Bundle) it.next().f32118b.c).putInt(ea.a.p("LmRuYxFvXmM_cxVwGnMBdFxvbg==", "rk3EL3nj"), !pdf.pdfreader.viewer.editor.free.utils.a0.i(this) ? 1 : 0);
                }
                zd.d dVar = new zd.d();
                a12.f16801a = dVar;
                el.c.a(ea.a.p("Bm9WZFRhZA==", "IDj7to46"));
                dVar.f(this, aDRequestList);
            }
        }
    }

    @Override // hl.a
    public final void e() {
        el.c a10 = el.c.f16799g.a();
        FrameLayout frameLayout = a2().f1351b;
        kotlin.jvm.internal.g.d(frameLayout, ea.a.p("UWklZBpuBS4cYUBpH2UZcCFuc2QFby10F2kbZXI=", "vuYVfSdE"));
        a10.b(frameLayout);
    }

    @Override // hl.a
    public final void f1(BannerType type) {
        kotlin.jvm.internal.g.e(type, "type");
        if (pdf.pdfreader.viewer.editor.free.utils.extension.a.c(this)) {
            FrameLayout frameLayout = a2().f1351b;
            kotlin.jvm.internal.g.d(frameLayout, ea.a.p("JmkfZAZuDy4mYRJpQmUYcF1uE2QKb1h0FWkfZXI=", "UqDqoh9N"));
            View findViewById = frameLayout.findViewById(R.id.continueLayer);
            if (findViewById != null) {
                findViewById.setOnClickListener(new c(this, 1));
            }
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
        AppOpenManager.c().f23910j = false;
    }

    @Override // jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AppOpenManager.c().f23910j = true;
        Window window = getWindow();
        if (window != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.i.j(window, 1280);
        }
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        kotlin.jvm.internal.g.d(onBackPressedDispatcher, ea.a.p("BG4LYTJrGXItcxVlUEQ-c0hhJmMhZXI=", "9RkIQIik"));
        com.google.android.play.core.assetpacks.b1.m(onBackPressedDispatcher, this, new cg.l<androidx.activity.n, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.PreInstallOpenAdActivity$onCreate$1
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.activity.n addCallback) {
                kotlin.jvm.internal.g.e(addCallback, "$this$addCallback");
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(androidx.activity.n nVar) {
                invoke2(nVar);
                return tf.d.f30009a;
            }
        }, 2);
    }

    @Override // jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onDestroy() {
        AppOpenManager.c().f23910j = false;
        c.a aVar = el.c.f16799g;
        if (!aVar.a().f16804e && !aVar.a().c) {
            aVar.a().f16802b = null;
        } else {
            el.c a10 = aVar.a();
            el.c.a(ea.a.p("HmUbdAJvESApZA==", "HizhphzT"));
            zd.d dVar = a10.f16801a;
            if (dVar != null) {
                dVar.d(this);
            }
            a10.f16801a = null;
            a10.f16804e = false;
            a10.f16803d = false;
            a10.c = false;
            a10.f16805f = null;
            a10.f16802b = null;
            el.c.f16800h = null;
        }
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        AppOpenManager.c().f23910j = true;
        b2();
    }

    @Override // jl.a
    public final void C1() {
    }

    @Override // hl.a
    public final void d() {
    }
}
