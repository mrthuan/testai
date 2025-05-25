package z8;

import android.view.View;
import com.google.android.material.navigationrail.NavigationRailView;
import java.util.WeakHashMap;
import w8.w;
import x0.f0;
import x0.n0;
import x0.s0;

/* compiled from: NavigationRailView.java */
/* loaded from: classes2.dex */
public final class b implements w.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NavigationRailView f32300a;

    public b(NavigationRailView navigationRailView) {
        this.f32300a = navigationRailView;
    }

    @Override // w8.w.b
    public final s0 b(View view, s0 s0Var, w.c cVar) {
        boolean b10;
        boolean b11;
        NavigationRailView navigationRailView = this.f32300a;
        Boolean bool = navigationRailView.f12760h;
        if (bool != null) {
            b10 = bool.booleanValue();
        } else {
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            b10 = f0.d.b(navigationRailView);
        }
        if (b10) {
            cVar.f31064b += s0Var.a(7).f22640b;
        }
        Boolean bool2 = navigationRailView.f12761i;
        if (bool2 != null) {
            b11 = bool2.booleanValue();
        } else {
            WeakHashMap<View, n0> weakHashMap2 = f0.f31435a;
            b11 = f0.d.b(navigationRailView);
        }
        if (b11) {
            cVar.f31065d += s0Var.a(7).f22641d;
        }
        WeakHashMap<View, n0> weakHashMap3 = f0.f31435a;
        boolean z10 = true;
        if (f0.e.d(view) != 1) {
            z10 = false;
        }
        int c = s0Var.c();
        int d10 = s0Var.d();
        int i10 = cVar.f31063a;
        if (z10) {
            c = d10;
        }
        int i11 = i10 + c;
        cVar.f31063a = i11;
        f0.e.k(view, i11, cVar.f31064b, cVar.c, cVar.f31065d);
        return s0Var;
    }
}
