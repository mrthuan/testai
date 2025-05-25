package rm;

import am.v1;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import java.util.List;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: PreInstallUserGuidePagerAdapter.kt */
/* loaded from: classes3.dex */
public final class b extends rm.a<a> {

    /* renamed from: e  reason: collision with root package name */
    public final boolean f29624e;

    /* renamed from: f  reason: collision with root package name */
    public final List<h> f29625f;

    /* renamed from: g  reason: collision with root package name */
    public final View$OnLayoutChangeListenerC0370b f29626g;

    /* compiled from: PreInstallUserGuidePagerAdapter.kt */
    /* loaded from: classes3.dex */
    public final class a extends RecyclerView.b0 {

        /* renamed from: b  reason: collision with root package name */
        public final v1 f29627b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1 v1Var) {
            super(v1Var.f1548a);
            ea.a.p("UWklZBpuZw==", "qMRSQzz1");
            this.f29627b = v1Var;
        }
    }

    /* compiled from: PreInstallUserGuidePagerAdapter.kt */
    /* renamed from: rm.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class View$OnLayoutChangeListenerC0370b implements View.OnLayoutChangeListener {
        public View$OnLayoutChangeListenerC0370b() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            View findViewById;
            if (view != null && b.this.f29624e && view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0 && (findViewById = view.findViewById(R.id.animView)) != null && findViewById.getMeasuredHeight() > view.getMeasuredHeight()) {
                findViewById.setTranslationY((findViewById.getMeasuredHeight() * 0.05f) + (view.getMeasuredHeight() - findViewById.getMeasuredHeight()));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z10, List<h> list) {
        super(list);
        kotlin.jvm.internal.g.e(list, ea.a.p("Um5CaS55", "Mx76Z8FT"));
        this.f29624e = z10;
        this.f29625f = list;
        this.f29626g = new View$OnLayoutChangeListenerC0370b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.b0 b0Var, int i10) {
        a holder = (a) b0Var;
        kotlin.jvm.internal.g.e(holder, "holder");
        h entity = this.f29625f.get(i10);
        kotlin.jvm.internal.g.e(entity, "entity");
        v1 v1Var = holder.f29627b;
        v1Var.f1550d.setText(entity.f29636a);
        v1Var.c.setText(entity.f29637b);
        LottieAnimationView lottieAnimationView = v1Var.f1549b;
        lottieAnimationView.setAnimation(entity.c);
        lottieAnimationView.setImageAssetsFolder(entity.f29638d);
        lottieAnimationView.setVisibility(4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.b0 onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.g.e(parent, "parent");
        View i11 = androidx.activity.f.i(parent, R.layout.item_pre_install_user_guide, parent, false);
        int i12 = R.id.animView;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) com.google.android.play.core.assetpacks.c.u(i11, R.id.animView);
        if (lottieAnimationView != null) {
            i12 = R.id.subtitleTv;
            AppCompatTextView appCompatTextView = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(i11, R.id.subtitleTv);
            if (appCompatTextView != null) {
                i12 = R.id.titleTv;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(i11, R.id.titleTv);
                if (appCompatTextView2 != null) {
                    v1 v1Var = new v1((ConstraintLayout) i11, lottieAnimationView, appCompatTextView, appCompatTextView2);
                    ea.a.p("Wm4tbBJ0Byg-YU1vHHQfbiJsU3Qjcm1mg4CfLidvBHRWeD8pXyASYQBlWnRFIDBhKHNXKQ==", "a9DjakWB");
                    return new a(v1Var);
                }
            }
        }
        throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpAmhCSXQ6IA==", "vb0NhFd1").concat(i11.getResources().getResourceName(i12)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(RecyclerView.b0 b0Var) {
        String p10;
        a holder = (a) b0Var;
        kotlin.jvm.internal.g.e(holder, "holder");
        super.onViewAttachedToWindow(holder);
        holder.itemView.addOnLayoutChangeListener(this.f29626g);
        v1 v1Var = holder.f29627b;
        AppCompatTextView appCompatTextView = v1Var.f1550d;
        kotlin.jvm.internal.g.d(appCompatTextView, ea.a.p("J29dZBxyGWIzbi5pG2dGdFx0AmURdg==", "tIZYKXWx"));
        if (appCompatTextView.getViewTreeObserver().isAlive()) {
            appCompatTextView.getViewTreeObserver().addOnPreDrawListener(new c(appCompatTextView));
        }
        String p11 = ea.a.p("W28nZBZyTGIbblBpB2d4czFiRmkybCZUdg==", "alyfZZOS");
        AppCompatTextView appCompatTextView2 = v1Var.c;
        kotlin.jvm.internal.g.d(appCompatTextView2, p11);
        if (appCompatTextView2.getViewTreeObserver().isAlive()) {
            appCompatTextView2.getViewTreeObserver().addOnPreDrawListener(new d(appCompatTextView2));
        }
        String p12 = ea.a.p("W28nZBZyTGIbblBpB2d4YSppX1YvZXc=", "scrBw8f0");
        LottieAnimationView lottieAnimationView = v1Var.f1549b;
        kotlin.jvm.internal.g.d(lottieAnimationView, p12);
        ViewGroup.LayoutParams layoutParams = lottieAnimationView.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            if (this.f29624e) {
                p10 = ea.a.p("AjVxMjQ=", "S5Ymzmq2");
            } else {
                p10 = ea.a.p("eDULNTg=", "VJelAwdy");
            }
            bVar.G = p10;
            lottieAnimationView.setLayoutParams(bVar);
            return;
        }
        throw new NullPointerException(ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuI24fbhtsWyBHeTtlU2EMZABvXWQRLjVvKnNGcidpLXQgYUtvG3QZd1pkLGUHLiFvHHNAcghpOHQIYUtvM3RtTC15XXUaUFZyUm1z", "L2n7DaTK"));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.b0 b0Var) {
        a holder = (a) b0Var;
        kotlin.jvm.internal.g.e(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        holder.itemView.removeOnLayoutChangeListener(this.f29626g);
        v1 v1Var = holder.f29627b;
        v1Var.f1549b.d();
        v1Var.f1549b.setVisibility(4);
    }
}
