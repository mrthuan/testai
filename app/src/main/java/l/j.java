package l;

import android.view.View;
import java.util.WeakHashMap;
import x0.f0;
import x0.n0;

/* compiled from: AppCompatDelegateImpl.java */
/* loaded from: classes.dex */
public final class j extends androidx.activity.s {

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ f f20354x;

    public j(f fVar) {
        this.f20354x = fVar;
    }

    @Override // x0.o0
    public final void a() {
        f fVar = this.f20354x;
        fVar.f20314v.setAlpha(1.0f);
        fVar.f20317y.d(null);
        fVar.f20317y = null;
    }

    @Override // androidx.activity.s, x0.o0
    public final void f() {
        f fVar = this.f20354x;
        fVar.f20314v.setVisibility(0);
        if (fVar.f20314v.getParent() instanceof View) {
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            f0.h.c((View) fVar.f20314v.getParent());
        }
    }
}
