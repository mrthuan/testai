package d2;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: SwipeRefreshLayout.java */
/* loaded from: classes.dex */
public final class e extends Animation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f16108a;

    public e(SwipeRefreshLayout swipeRefreshLayout) {
        this.f16108a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation transformation) {
        this.f16108a.setAnimationProgress(f10);
    }
}
