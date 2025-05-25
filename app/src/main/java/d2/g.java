package d2;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: SwipeRefreshLayout.java */
/* loaded from: classes.dex */
public final class g extends Animation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16110a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f16111b;
    public final /* synthetic */ SwipeRefreshLayout c;

    public g(SwipeRefreshLayout swipeRefreshLayout, int i10, int i11) {
        this.c = swipeRefreshLayout;
        this.f16110a = i10;
        this.f16111b = i11;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation transformation) {
        d dVar = this.c.f4714x;
        int i10 = this.f16110a;
        dVar.setAlpha((int) (((this.f16111b - i10) * f10) + i10));
    }
}
