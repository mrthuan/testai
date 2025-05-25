package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PagerSnapHelper.java */
/* loaded from: classes.dex */
public final class b0 extends v {

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ c0 f4393p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, Context context) {
        super(context);
        this.f4393p = c0Var;
    }

    @Override // androidx.recyclerview.widget.v, androidx.recyclerview.widget.RecyclerView.x
    public final void e(View view, RecyclerView.x.a aVar) {
        c0 c0Var = this.f4393p;
        int[] b10 = c0Var.b(c0Var.f4459a.getLayoutManager(), view);
        int i10 = b10[0];
        int i11 = b10[1];
        int ceil = (int) Math.ceil(j(Math.max(Math.abs(i10), Math.abs(i11))) / 0.3356d);
        if (ceil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f4609i;
            aVar.f4326a = i10;
            aVar.f4327b = i11;
            aVar.c = ceil;
            aVar.f4329e = decelerateInterpolator;
            aVar.f4330f = true;
        }
    }

    @Override // androidx.recyclerview.widget.v
    public final float i(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.v
    public final int j(int i10) {
        return Math.min(100, super.j(i10));
    }
}
