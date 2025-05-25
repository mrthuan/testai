package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SimpleItemAnimator.java */
/* loaded from: classes.dex */
public abstract class h0 extends RecyclerView.j {

    /* renamed from: g  reason: collision with root package name */
    public boolean f4455g = true;

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final boolean a(RecyclerView.b0 b0Var, RecyclerView.j.c cVar, RecyclerView.j.c cVar2) {
        int i10;
        int i11;
        if (cVar != null && ((i10 = cVar.f4282a) != (i11 = cVar2.f4282a) || cVar.f4283b != cVar2.f4283b)) {
            return o(b0Var, i10, cVar.f4283b, i11, cVar2.f4283b);
        }
        m(b0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final boolean b(RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2, RecyclerView.j.c cVar, RecyclerView.j.c cVar2) {
        int i10;
        int i11;
        int i12 = cVar.f4282a;
        int i13 = cVar.f4283b;
        if (b0Var2.shouldIgnore()) {
            int i14 = cVar.f4282a;
            i11 = cVar.f4283b;
            i10 = i14;
        } else {
            i10 = cVar2.f4282a;
            i11 = cVar2.f4283b;
        }
        return n(b0Var, b0Var2, i12, i13, i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final boolean c(RecyclerView.b0 b0Var, RecyclerView.j.c cVar, RecyclerView.j.c cVar2) {
        int i10;
        int i11;
        int i12 = cVar.f4282a;
        int i13 = cVar.f4283b;
        View view = b0Var.itemView;
        if (cVar2 == null) {
            i10 = view.getLeft();
        } else {
            i10 = cVar2.f4282a;
        }
        int i14 = i10;
        if (cVar2 == null) {
            i11 = view.getTop();
        } else {
            i11 = cVar2.f4283b;
        }
        int i15 = i11;
        if (!b0Var.isRemoved() && (i12 != i14 || i13 != i15)) {
            view.layout(i14, i15, view.getWidth() + i14, view.getHeight() + i15);
            return o(b0Var, i12, i13, i14, i15);
        }
        p(b0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final boolean d(RecyclerView.b0 b0Var, RecyclerView.j.c cVar, RecyclerView.j.c cVar2) {
        int i10 = cVar.f4282a;
        int i11 = cVar2.f4282a;
        if (i10 == i11 && cVar.f4283b == cVar2.f4283b) {
            h(b0Var);
            return false;
        }
        return o(b0Var, i10, cVar.f4283b, i11, cVar2.f4283b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final boolean f(RecyclerView.b0 b0Var) {
        if (this.f4455g && !b0Var.isInvalid()) {
            return false;
        }
        return true;
    }

    public abstract void m(RecyclerView.b0 b0Var);

    public abstract boolean n(RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2, int i10, int i11, int i12, int i13);

    public abstract boolean o(RecyclerView.b0 b0Var, int i10, int i11, int i12, int i13);

    public abstract void p(RecyclerView.b0 b0Var);
}
