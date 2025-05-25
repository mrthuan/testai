package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: ChildHelper.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final b f4424a;

    /* renamed from: b  reason: collision with root package name */
    public final a f4425b = new a();
    public final ArrayList c = new ArrayList();

    /* compiled from: ChildHelper.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f4426a = 0;

        /* renamed from: b  reason: collision with root package name */
        public a f4427b;

        public final void a(int i10) {
            if (i10 >= 64) {
                a aVar = this.f4427b;
                if (aVar != null) {
                    aVar.a(i10 - 64);
                    return;
                }
                return;
            }
            this.f4426a &= ~(1 << i10);
        }

        public final int b(int i10) {
            a aVar = this.f4427b;
            if (aVar == null) {
                if (i10 >= 64) {
                    return Long.bitCount(this.f4426a);
                }
                return Long.bitCount(this.f4426a & ((1 << i10) - 1));
            } else if (i10 < 64) {
                return Long.bitCount(this.f4426a & ((1 << i10) - 1));
            } else {
                return Long.bitCount(this.f4426a) + aVar.b(i10 - 64);
            }
        }

        public final void c() {
            if (this.f4427b == null) {
                this.f4427b = new a();
            }
        }

        public final boolean d(int i10) {
            if (i10 >= 64) {
                c();
                return this.f4427b.d(i10 - 64);
            } else if ((this.f4426a & (1 << i10)) != 0) {
                return true;
            } else {
                return false;
            }
        }

        public final void e(int i10, boolean z10) {
            boolean z11;
            if (i10 >= 64) {
                c();
                this.f4427b.e(i10 - 64, z10);
                return;
            }
            long j10 = this.f4426a;
            if ((Long.MIN_VALUE & j10) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            long j11 = (1 << i10) - 1;
            this.f4426a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                h(i10);
            } else {
                a(i10);
            }
            if (z11 || this.f4427b != null) {
                c();
                this.f4427b.e(0, z11);
            }
        }

        public final boolean f(int i10) {
            boolean z10;
            if (i10 >= 64) {
                c();
                return this.f4427b.f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f4426a;
            if ((j11 & j10) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            long j12 = j11 & (~j10);
            this.f4426a = j12;
            long j13 = j10 - 1;
            this.f4426a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f4427b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f4427b.f(0);
            }
            return z10;
        }

        public final void g() {
            this.f4426a = 0L;
            a aVar = this.f4427b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public final void h(int i10) {
            if (i10 >= 64) {
                c();
                this.f4427b.h(i10 - 64);
                return;
            }
            this.f4426a |= 1 << i10;
        }

        public final String toString() {
            if (this.f4427b == null) {
                return Long.toBinaryString(this.f4426a);
            }
            return this.f4427b.toString() + "xx" + Long.toBinaryString(this.f4426a);
        }
    }

    /* compiled from: ChildHelper.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    public g(d0 d0Var) {
        this.f4424a = d0Var;
    }

    public final void a(View view, boolean z10, int i10) {
        int f10;
        b bVar = this.f4424a;
        if (i10 < 0) {
            f10 = ((d0) bVar).a();
        } else {
            f10 = f(i10);
        }
        this.f4425b.e(f10, z10);
        if (z10) {
            i(view);
        }
        RecyclerView recyclerView = ((d0) bVar).f4406a;
        recyclerView.addView(view, f10);
        RecyclerView.b0 X = RecyclerView.X(view);
        RecyclerView.Adapter adapter = recyclerView.f4236l;
        if (adapter != null && X != null) {
            adapter.onViewAttachedToWindow(X);
        }
        ArrayList arrayList = recyclerView.C;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((RecyclerView.o) recyclerView.C.get(size)).b(view);
                } else {
                    return;
                }
            }
        }
    }

    public final void b(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int f10;
        b bVar = this.f4424a;
        if (i10 < 0) {
            f10 = ((d0) bVar).a();
        } else {
            f10 = f(i10);
        }
        this.f4425b.e(f10, z10);
        if (z10) {
            i(view);
        }
        d0 d0Var = (d0) bVar;
        d0Var.getClass();
        RecyclerView.b0 X = RecyclerView.X(view);
        RecyclerView recyclerView = d0Var.f4406a;
        if (X != null) {
            if (!X.isTmpDetached() && !X.shouldIgnore()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + X + recyclerView.K());
            }
            X.clearTmpDetachFlag();
        }
        recyclerView.attachViewToParent(view, f10, layoutParams);
    }

    public final void c(int i10) {
        RecyclerView.b0 X;
        int f10 = f(i10);
        this.f4425b.f(f10);
        d0 d0Var = (d0) this.f4424a;
        View childAt = d0Var.f4406a.getChildAt(f10);
        RecyclerView recyclerView = d0Var.f4406a;
        if (childAt != null && (X = RecyclerView.X(childAt)) != null) {
            if (X.isTmpDetached() && !X.shouldIgnore()) {
                throw new IllegalArgumentException("called detach on an already detached child " + X + recyclerView.K());
            }
            X.addFlags(256);
        }
        recyclerView.detachViewFromParent(f10);
    }

    public final View d(int i10) {
        return ((d0) this.f4424a).f4406a.getChildAt(f(i10));
    }

    public final int e() {
        return ((d0) this.f4424a).a() - this.c.size();
    }

    public final int f(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int a10 = ((d0) this.f4424a).a();
        int i11 = i10;
        while (i11 < a10) {
            a aVar = this.f4425b;
            int b10 = i10 - (i11 - aVar.b(i11));
            if (b10 == 0) {
                while (aVar.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += b10;
        }
        return -1;
    }

    public final View g(int i10) {
        return ((d0) this.f4424a).f4406a.getChildAt(i10);
    }

    public final int h() {
        return ((d0) this.f4424a).a();
    }

    public final void i(View view) {
        this.c.add(view);
        d0 d0Var = (d0) this.f4424a;
        d0Var.getClass();
        RecyclerView.b0 X = RecyclerView.X(view);
        if (X != null) {
            X.onEnteredHiddenState(d0Var.f4406a);
        }
    }

    public final boolean j(View view) {
        return this.c.contains(view);
    }

    public final void k(int i10) {
        int f10 = f(i10);
        d0 d0Var = (d0) this.f4424a;
        View childAt = d0Var.f4406a.getChildAt(f10);
        if (childAt == null) {
            return;
        }
        if (this.f4425b.f(f10)) {
            l(childAt);
        }
        d0Var.b(f10);
    }

    public final void l(View view) {
        if (this.c.remove(view)) {
            d0 d0Var = (d0) this.f4424a;
            d0Var.getClass();
            RecyclerView.b0 X = RecyclerView.X(view);
            if (X != null) {
                X.onLeftHiddenState(d0Var.f4406a);
            }
        }
    }

    public final String toString() {
        return this.f4425b.toString() + ", hidden list:" + this.c.size();
    }
}
