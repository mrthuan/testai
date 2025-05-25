package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import java.util.ArrayList;

/* compiled from: RecyclerView.java */
/* loaded from: classes.dex */
public final class e0 implements a.InterfaceC0023a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f4415a;

    public e0(RecyclerView recyclerView) {
        this.f4415a = recyclerView;
    }

    public final void a(a.b bVar) {
        int i10 = bVar.f4387a;
        RecyclerView recyclerView = this.f4415a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 == 8) {
                        recyclerView.f4238m.k0(bVar.f4388b, bVar.f4389d);
                        return;
                    }
                    return;
                }
                recyclerView.f4238m.n0(recyclerView, bVar.f4388b, bVar.f4389d);
                return;
            }
            recyclerView.f4238m.l0(bVar.f4388b, bVar.f4389d);
            return;
        }
        recyclerView.f4238m.i0(bVar.f4388b, bVar.f4389d);
    }

    public final RecyclerView.b0 b(int i10) {
        RecyclerView recyclerView = this.f4415a;
        int h10 = recyclerView.f4222e.h();
        int i11 = 0;
        RecyclerView.b0 b0Var = null;
        while (true) {
            if (i11 >= h10) {
                break;
            }
            RecyclerView.b0 X = RecyclerView.X(recyclerView.f4222e.g(i11));
            if (X != null && !X.isRemoved() && X.mPosition == i10) {
                if (recyclerView.f4222e.j(X.itemView)) {
                    b0Var = X;
                } else {
                    b0Var = X;
                    break;
                }
            }
            i11++;
        }
        if (b0Var == null || recyclerView.f4222e.j(b0Var.itemView)) {
            return null;
        }
        return b0Var;
    }

    public final void c(int i10, int i11, Object obj) {
        int i12;
        int i13;
        RecyclerView recyclerView = this.f4415a;
        int h10 = recyclerView.f4222e.h();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < h10; i15++) {
            View g10 = recyclerView.f4222e.g(i15);
            RecyclerView.b0 X = RecyclerView.X(g10);
            if (X != null && !X.shouldIgnore() && (i13 = X.mPosition) >= i10 && i13 < i14) {
                X.addFlags(2);
                X.addChangePayload(obj);
                ((RecyclerView.n) g10.getLayoutParams()).c = true;
            }
        }
        RecyclerView.t tVar = recyclerView.f4217b;
        ArrayList<RecyclerView.b0> arrayList = tVar.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                RecyclerView.b0 b0Var = arrayList.get(size);
                if (b0Var != null && (i12 = b0Var.mPosition) >= i10 && i12 < i14) {
                    b0Var.addFlags(2);
                    tVar.f(size);
                }
            } else {
                recyclerView.f4237l0 = true;
                return;
            }
        }
    }

    public final void d(int i10, int i11) {
        RecyclerView recyclerView = this.f4415a;
        int h10 = recyclerView.f4222e.h();
        for (int i12 = 0; i12 < h10; i12++) {
            RecyclerView.b0 X = RecyclerView.X(recyclerView.f4222e.g(i12));
            if (X != null && !X.shouldIgnore() && X.mPosition >= i10) {
                X.offsetPosition(i11, false);
                recyclerView.f4229h0.f4335f = true;
            }
        }
        ArrayList<RecyclerView.b0> arrayList = recyclerView.f4217b.c;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView.b0 b0Var = arrayList.get(i13);
            if (b0Var != null && b0Var.mPosition >= i10) {
                b0Var.offsetPosition(i11, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f4235k0 = true;
    }

    public final void e(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = this.f4415a;
        int h10 = recyclerView.f4222e.h();
        int i19 = -1;
        if (i10 < i11) {
            i13 = i10;
            i12 = i11;
            i14 = -1;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i20 = 0; i20 < h10; i20++) {
            RecyclerView.b0 X = RecyclerView.X(recyclerView.f4222e.g(i20));
            if (X != null && (i18 = X.mPosition) >= i13 && i18 <= i12) {
                if (i18 == i10) {
                    X.offsetPosition(i11 - i10, false);
                } else {
                    X.offsetPosition(i14, false);
                }
                recyclerView.f4229h0.f4335f = true;
            }
        }
        RecyclerView.t tVar = recyclerView.f4217b;
        tVar.getClass();
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i16 = i11;
            i19 = 1;
        }
        ArrayList<RecyclerView.b0> arrayList = tVar.c;
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            RecyclerView.b0 b0Var = arrayList.get(i21);
            if (b0Var != null && (i17 = b0Var.mPosition) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    b0Var.offsetPosition(i11 - i10, false);
                } else {
                    b0Var.offsetPosition(i19, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f4235k0 = true;
    }
}
