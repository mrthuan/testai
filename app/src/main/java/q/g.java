package q;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.activity.s;
import java.util.ArrayList;
import java.util.Iterator;
import x0.n0;
import x0.o0;

/* compiled from: ViewPropertyAnimatorCompatSet.java */
/* loaded from: classes.dex */
public final class g {
    public Interpolator c;

    /* renamed from: d  reason: collision with root package name */
    public o0 f29045d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f29046e;

    /* renamed from: b  reason: collision with root package name */
    public long f29044b = -1;

    /* renamed from: f  reason: collision with root package name */
    public final a f29047f = new a();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<n0> f29043a = new ArrayList<>();

    /* compiled from: ViewPropertyAnimatorCompatSet.java */
    /* loaded from: classes.dex */
    public class a extends s {

        /* renamed from: x  reason: collision with root package name */
        public boolean f29048x = false;

        /* renamed from: y  reason: collision with root package name */
        public int f29049y = 0;

        public a() {
        }

        @Override // x0.o0
        public final void a() {
            int i10 = this.f29049y + 1;
            this.f29049y = i10;
            g gVar = g.this;
            if (i10 == gVar.f29043a.size()) {
                o0 o0Var = gVar.f29045d;
                if (o0Var != null) {
                    o0Var.a();
                }
                this.f29049y = 0;
                this.f29048x = false;
                gVar.f29046e = false;
            }
        }

        @Override // androidx.activity.s, x0.o0
        public final void f() {
            if (this.f29048x) {
                return;
            }
            this.f29048x = true;
            o0 o0Var = g.this.f29045d;
            if (o0Var != null) {
                o0Var.f();
            }
        }
    }

    public final void a() {
        if (!this.f29046e) {
            return;
        }
        Iterator<n0> it = this.f29043a.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        this.f29046e = false;
    }

    public final void b() {
        View view;
        if (this.f29046e) {
            return;
        }
        Iterator<n0> it = this.f29043a.iterator();
        while (it.hasNext()) {
            n0 next = it.next();
            long j10 = this.f29044b;
            if (j10 >= 0) {
                next.c(j10);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null && (view = next.f31469a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f29045d != null) {
                next.d(this.f29047f);
            }
            View view2 = next.f31469a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f29046e = true;
    }
}
