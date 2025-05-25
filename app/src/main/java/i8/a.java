package i8;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import x0.f0;
import x0.n0;
import y0.j;

/* compiled from: SwipeDismissBehavior.java */
/* loaded from: classes2.dex */
public final class a implements j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f18475a;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f18475a = swipeDismissBehavior;
    }

    @Override // y0.j
    public final boolean a(View view) {
        boolean z10;
        SwipeDismissBehavior swipeDismissBehavior = this.f18475a;
        boolean z11 = false;
        if (!swipeDismissBehavior.s(view)) {
            return false;
        }
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        if (f0.e.d(view) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = swipeDismissBehavior.f12072d;
        if ((i10 == 0 && z10) || (i10 == 1 && !z10)) {
            z11 = true;
        }
        int width = view.getWidth();
        if (z11) {
            width = -width;
        }
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        return true;
    }
}
