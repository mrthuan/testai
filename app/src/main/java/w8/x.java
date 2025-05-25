package w8;

import android.view.View;
import java.util.WeakHashMap;
import x0.f0;
import x0.n0;

/* compiled from: ViewUtils.java */
/* loaded from: classes2.dex */
public final class x implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        f0.h.c(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
