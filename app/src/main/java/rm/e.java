package rm;

import am.y1;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import java.util.List;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: UserGuideD2PagerAdapter.kt */
/* loaded from: classes3.dex */
public final class e extends rm.a<a> {

    /* renamed from: e  reason: collision with root package name */
    public final List<h> f29631e;

    /* renamed from: f  reason: collision with root package name */
    public final b f29632f;

    /* compiled from: UserGuideD2PagerAdapter.kt */
    /* loaded from: classes3.dex */
    public final class a extends RecyclerView.b0 {

        /* renamed from: b  reason: collision with root package name */
        public final y1 f29633b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y1 y1Var) {
            super(y1Var.f1671a);
            ea.a.p("Gmk3ZB5uZw==", "ydxYwqWk");
            this.f29633b = y1Var;
        }
    }

    /* compiled from: UserGuideD2PagerAdapter.kt */
    /* loaded from: classes3.dex */
    public static final class b implements View.OnLayoutChangeListener {
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            View findViewById;
            boolean z10;
            if (view != null && view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0 && view.getMeasuredHeight() / view.getMeasuredWidth() < 1.6111112f && (findViewById = view.findViewById(R.id.animView)) != null) {
                if (findViewById.getTranslationY() == 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    findViewById.setTranslationY((-findViewById.getMeasuredHeight()) * 0.12f);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(List<h> list) {
        super(list);
        kotlin.jvm.internal.g.e(list, ea.a.p("Km5FaQ15", "M2WbJLiO"));
        this.f29631e = list;
        this.f29632f = new b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.b0 b0Var, int i10) {
        a holder = (a) b0Var;
        kotlin.jvm.internal.g.e(holder, "holder");
        h entity = this.f29631e.get(i10);
        kotlin.jvm.internal.g.e(entity, "entity");
        y1 y1Var = holder.f29633b;
        y1Var.f1673d.setText(entity.f29636a);
        y1Var.c.setText(entity.f29637b);
        LottieAnimationView lottieAnimationView = y1Var.f1672b;
        lottieAnimationView.setAnimation(entity.c);
        lottieAnimationView.setImageAssetsFolder(entity.f29638d);
        lottieAnimationView.setVisibility(4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.b0 onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.g.e(parent, "parent");
        View i11 = androidx.activity.f.i(parent, R.layout.item_user_guide_d2, parent, false);
        int i12 = R.id.animView;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) com.google.android.play.core.assetpacks.c.u(i11, R.id.animView);
        if (lottieAnimationView != null) {
            i12 = R.id.guideline;
            if (((Guideline) com.google.android.play.core.assetpacks.c.u(i11, R.id.guideline)) != null) {
                i12 = R.id.subtitleTv;
                AppCompatTextView appCompatTextView = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(i11, R.id.subtitleTv);
                if (appCompatTextView != null) {
                    i12 = R.id.titleTv;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(i11, R.id.titleTv);
                    if (appCompatTextView2 != null) {
                        y1 y1Var = new y1((ConstraintLayout) i11, lottieAnimationView, appCompatTextView, appCompatTextView2);
                        ea.a.p("Wm4tbBJ0Byg-YU1vHHQfbiJsU3Qjcm1mrIDTLlZvDXRWeD8pXyASYQBlWnRFIDBhKHNXKQ==", "Nu5cL5Rp");
                        return new a(y1Var);
                    }
                }
            }
        }
        throw new NullPointerException(ea.a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpPmhSSSM6IA==", "fZefJrgx").concat(i11.getResources().getResourceName(i12)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(RecyclerView.b0 b0Var) {
        a holder = (a) b0Var;
        kotlin.jvm.internal.g.e(holder, "holder");
        super.onViewAttachedToWindow(holder);
        Context context = holder.itemView.getContext();
        if ((context.getResources().getDisplayMetrics().heightPixels / context.getResources().getDisplayMetrics().widthPixels) * 1.0f <= 1.8888888f && holder.itemView.getContext().getResources().getDisplayMetrics().densityDpi <= 300) {
            View findViewById = holder.itemView.findViewById(R.id.guideline);
            kotlin.jvm.internal.g.d(findViewById, ea.a.p("J29dZBxyGWkuZSdWHGUfLlNpAGQTaQB32oDOdQRkL2wmblQ-UVIZaT4uLXUcZA1sXG4LKQ==", "JlfN8hmJ"));
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams != null) {
                ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                bVar.c = 0.7f;
                findViewById.setLayoutParams(bVar);
            } else {
                throw new NullPointerException(ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuJW5pbiFsFCBHeTtlU2EMZABvXWQRLjVvKnNGcidpLXQmYT1vIXRWd1pkLGUHLiFvHHNAcghpOHQIYUtvM3RtTCt5K3UgUBlyUm1z", "JDTxo5mT"));
            }
        }
        holder.itemView.addOnLayoutChangeListener(this.f29632f);
        y1 y1Var = holder.f29633b;
        AppCompatTextView appCompatTextView = y1Var.f1673d;
        kotlin.jvm.internal.g.d(appCompatTextView, ea.a.p("J29dZBxyGWIzbi5pG2dGdFx0AmURdg==", "I8fmZxdz"));
        if (appCompatTextView.getViewTreeObserver().isAlive()) {
            appCompatTextView.getViewTreeObserver().addOnPreDrawListener(new f(appCompatTextView));
        }
        String p10 = ea.a.p("W28nZBZyTGIbblBpB2d4czFiRmkybCZUdg==", "ar5gsAGD");
        AppCompatTextView appCompatTextView2 = y1Var.c;
        kotlin.jvm.internal.g.d(appCompatTextView2, p10);
        if (appCompatTextView2.getViewTreeObserver().isAlive()) {
            appCompatTextView2.getViewTreeObserver().addOnPreDrawListener(new g(appCompatTextView2));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(RecyclerView.b0 b0Var) {
        a holder = (a) b0Var;
        kotlin.jvm.internal.g.e(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        holder.itemView.removeOnLayoutChangeListener(this.f29632f);
        y1 y1Var = holder.f29633b;
        y1Var.f1672b.d();
        y1Var.f1672b.setVisibility(4);
    }
}
