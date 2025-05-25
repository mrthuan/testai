package androidx.fragment.app;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.g0;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: FragmentLifecycleCallbacksDispatcher.java */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final CopyOnWriteArrayList<a> f3754a = new CopyOnWriteArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final g0 f3755b;

    /* compiled from: FragmentLifecycleCallbacksDispatcher.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final g0.k f3756a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f3757b = false;

        public a(androidx.viewpager2.adapter.b bVar) {
            this.f3756a = bVar;
        }
    }

    public b0(g0 g0Var) {
        this.f3755b = g0Var;
    }

    public final void a(boolean z10) {
        Fragment fragment = this.f3755b.f3796v;
        if (fragment != null) {
            fragment.u().f3786l.a(true);
        }
        Iterator<a> it = this.f3754a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f3757b) {
                next.f3756a.getClass();
            }
        }
    }

    public final void b(boolean z10) {
        g0 g0Var = this.f3755b;
        Context context = g0Var.f3794t.f3962e;
        Fragment fragment = g0Var.f3796v;
        if (fragment != null) {
            fragment.u().f3786l.b(true);
        }
        Iterator<a> it = this.f3754a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f3757b) {
                next.f3756a.getClass();
            }
        }
    }

    public final void c(boolean z10) {
        Fragment fragment = this.f3755b.f3796v;
        if (fragment != null) {
            fragment.u().f3786l.c(true);
        }
        Iterator<a> it = this.f3754a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f3757b) {
                next.f3756a.getClass();
            }
        }
    }

    public final void d(boolean z10) {
        Fragment fragment = this.f3755b.f3796v;
        if (fragment != null) {
            fragment.u().f3786l.d(true);
        }
        Iterator<a> it = this.f3754a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f3757b) {
                next.f3756a.getClass();
            }
        }
    }

    public final void e(boolean z10) {
        Fragment fragment = this.f3755b.f3796v;
        if (fragment != null) {
            fragment.u().f3786l.e(true);
        }
        Iterator<a> it = this.f3754a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f3757b) {
                next.f3756a.getClass();
            }
        }
    }

    public final void f(boolean z10) {
        Fragment fragment = this.f3755b.f3796v;
        if (fragment != null) {
            fragment.u().f3786l.f(true);
        }
        Iterator<a> it = this.f3754a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f3757b) {
                next.f3756a.getClass();
            }
        }
    }

    public final void g(boolean z10) {
        g0 g0Var = this.f3755b;
        Context context = g0Var.f3794t.f3962e;
        Fragment fragment = g0Var.f3796v;
        if (fragment != null) {
            fragment.u().f3786l.g(true);
        }
        Iterator<a> it = this.f3754a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f3757b) {
                next.f3756a.getClass();
            }
        }
    }

    public final void h(boolean z10) {
        Fragment fragment = this.f3755b.f3796v;
        if (fragment != null) {
            fragment.u().f3786l.h(true);
        }
        Iterator<a> it = this.f3754a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f3757b) {
                next.f3756a.getClass();
            }
        }
    }

    public final void i(boolean z10) {
        Fragment fragment = this.f3755b.f3796v;
        if (fragment != null) {
            fragment.u().f3786l.i(true);
        }
        Iterator<a> it = this.f3754a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f3757b) {
                next.f3756a.getClass();
            }
        }
    }

    public final void j(boolean z10) {
        Fragment fragment = this.f3755b.f3796v;
        if (fragment != null) {
            fragment.u().f3786l.j(true);
        }
        Iterator<a> it = this.f3754a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f3757b) {
                next.f3756a.getClass();
            }
        }
    }

    public final void k(boolean z10) {
        Fragment fragment = this.f3755b.f3796v;
        if (fragment != null) {
            fragment.u().f3786l.k(true);
        }
        Iterator<a> it = this.f3754a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f3757b) {
                next.f3756a.getClass();
            }
        }
    }

    public final void l(boolean z10) {
        Fragment fragment = this.f3755b.f3796v;
        if (fragment != null) {
            fragment.u().f3786l.l(true);
        }
        Iterator<a> it = this.f3754a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f3757b) {
                next.f3756a.getClass();
            }
        }
    }

    public final void m(Fragment fragment, View view, boolean z10) {
        Fragment fragment2 = this.f3755b.f3796v;
        if (fragment2 != null) {
            fragment2.u().f3786l.m(fragment, view, true);
        }
        Iterator<a> it = this.f3754a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f3757b) {
                g0.k kVar = next.f3756a;
                g0 g0Var = this.f3755b;
                androidx.viewpager2.adapter.b bVar = (androidx.viewpager2.adapter.b) kVar;
                if (fragment == bVar.f4814a) {
                    b0 b0Var = g0Var.f3786l;
                    synchronized (b0Var.f3754a) {
                        int size = b0Var.f3754a.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 >= size) {
                                break;
                            } else if (b0Var.f3754a.get(i10).f3756a == bVar) {
                                b0Var.f3754a.remove(i10);
                                break;
                            } else {
                                i10++;
                            }
                        }
                    }
                    FragmentStateAdapter fragmentStateAdapter = bVar.c;
                    FrameLayout frameLayout = bVar.f4815b;
                    fragmentStateAdapter.getClass();
                    FragmentStateAdapter.h(view, frameLayout);
                } else {
                    continue;
                }
            }
        }
    }

    public final void n(boolean z10) {
        Fragment fragment = this.f3755b.f3796v;
        if (fragment != null) {
            fragment.u().f3786l.n(true);
        }
        Iterator<a> it = this.f3754a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f3757b) {
                next.f3756a.getClass();
            }
        }
    }
}
