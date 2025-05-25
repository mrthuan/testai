package w8;

import android.view.View;
import com.google.android.material.bottomappbar.BottomAppBar;
import java.util.WeakHashMap;
import w8.w;
import x0.f0;
import x0.n0;
import x0.s0;

/* compiled from: ViewUtils.java */
/* loaded from: classes2.dex */
public final class v implements w.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f31058a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f31059b;
    public final /* synthetic */ boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ w.b f31060d;

    public v(boolean z10, boolean z11, boolean z12, BottomAppBar.c cVar) {
        this.f31058a = z10;
        this.f31059b = z11;
        this.c = z12;
        this.f31060d = cVar;
    }

    @Override // w8.w.b
    public final s0 b(View view, s0 s0Var, w.c cVar) {
        if (this.f31058a) {
            cVar.f31065d = s0Var.b() + cVar.f31065d;
        }
        boolean e10 = w.e(view);
        if (this.f31059b) {
            if (e10) {
                cVar.c = s0Var.c() + cVar.c;
            } else {
                cVar.f31063a = s0Var.c() + cVar.f31063a;
            }
        }
        if (this.c) {
            if (e10) {
                cVar.f31063a = s0Var.d() + cVar.f31063a;
            } else {
                cVar.c = s0Var.d() + cVar.c;
            }
        }
        int i10 = cVar.f31063a;
        int i11 = cVar.f31064b;
        int i12 = cVar.c;
        int i13 = cVar.f31065d;
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        f0.e.k(view, i10, i11, i12, i13);
        w.b bVar = this.f31060d;
        if (bVar != null) {
            return bVar.b(view, s0Var, cVar);
        }
        return s0Var;
    }
}
