package k8;

import android.view.View;
import java.util.WeakHashMap;
import w8.w;
import x0.f0;
import x0.n0;
import x0.s0;

/* compiled from: BottomNavigationView.java */
/* loaded from: classes2.dex */
public final class a implements w.b {
    @Override // w8.w.b
    public final s0 b(View view, s0 s0Var, w.c cVar) {
        int i10;
        cVar.f31065d = s0Var.b() + cVar.f31065d;
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        boolean z10 = true;
        if (f0.e.d(view) != 1) {
            z10 = false;
        }
        int c = s0Var.c();
        int d10 = s0Var.d();
        int i11 = cVar.f31063a;
        if (z10) {
            i10 = d10;
        } else {
            i10 = c;
        }
        int i12 = i11 + i10;
        cVar.f31063a = i12;
        int i13 = cVar.c;
        if (!z10) {
            c = d10;
        }
        int i14 = i13 + c;
        cVar.c = i14;
        f0.e.k(view, i12, cVar.f31064b, i14, cVar.f31065d);
        return s0Var;
    }
}
