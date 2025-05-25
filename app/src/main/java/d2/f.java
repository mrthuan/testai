package d2;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: SwipeRefreshLayout.java */
/* loaded from: classes.dex */
public final class f extends Animation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f16109a;

    public f(SwipeRefreshLayout swipeRefreshLayout) {
        this.f16109a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation transformation) {
        this.f16109a.setAnimationProgress(1.0f - f10);
    }
}
