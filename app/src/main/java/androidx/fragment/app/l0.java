package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.p0;
import androidx.lifecycle.Lifecycle;

/* compiled from: FragmentPagerAdapter.java */
@Deprecated
/* loaded from: classes.dex */
public abstract class l0 extends j2.a {

    /* renamed from: h  reason: collision with root package name */
    public final g0 f3845h;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3849l;

    /* renamed from: j  reason: collision with root package name */
    public a f3847j = null;

    /* renamed from: k  reason: collision with root package name */
    public Fragment f3848k = null;

    /* renamed from: i  reason: collision with root package name */
    public final int f3846i = 0;

    @Deprecated
    public l0(g0 g0Var) {
        this.f3845h = g0Var;
    }

    public abstract Fragment a(int i10);

    public abstract long b(int i10);

    @Override // j2.a
    public final void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f3847j == null) {
            g0 g0Var = this.f3845h;
            g0Var.getClass();
            this.f3847j = new a(g0Var);
        }
        this.f3847j.j(fragment);
        if (fragment.equals(this.f3848k)) {
            this.f3848k = null;
        }
    }

    @Override // j2.a
    public final void finishUpdate(ViewGroup viewGroup) {
        a aVar = this.f3847j;
        if (aVar != null) {
            if (!this.f3849l) {
                try {
                    this.f3849l = true;
                    if (!aVar.f3903g) {
                        aVar.f3733p.z(aVar, true);
                    } else {
                        throw new IllegalStateException("This transaction is already being added to the back stack");
                    }
                } finally {
                    this.f3849l = false;
                }
            }
            this.f3847j = null;
        }
    }

    @Override // j2.a
    public final Object instantiateItem(ViewGroup viewGroup, int i10) {
        a aVar = this.f3847j;
        g0 g0Var = this.f3845h;
        if (aVar == null) {
            g0Var.getClass();
            this.f3847j = new a(g0Var);
        }
        long b10 = b(i10);
        int id2 = viewGroup.getId();
        Fragment D = g0Var.D("android:switcher:" + id2 + ":" + b10);
        if (D != null) {
            a aVar2 = this.f3847j;
            aVar2.getClass();
            aVar2.b(new p0.a(7, D));
        } else {
            D = a(i10);
            a aVar3 = this.f3847j;
            int id3 = viewGroup.getId();
            int id4 = viewGroup.getId();
            aVar3.c(id3, D, "android:switcher:" + id4 + ":" + b10, 1);
        }
        if (D != this.f3848k) {
            D.l0(false);
            if (this.f3846i == 1) {
                this.f3847j.n(D, Lifecycle.State.STARTED);
            } else {
                D.m0(false);
            }
        }
        return D;
    }

    @Override // j2.a
    public final boolean isViewFromObject(View view, Object obj) {
        if (((Fragment) obj).H == view) {
            return true;
        }
        return false;
    }

    @Override // j2.a
    public final Parcelable saveState() {
        return null;
    }

    @Override // j2.a
    public final void setPrimaryItem(ViewGroup viewGroup, int i10, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f3848k;
        if (fragment != fragment2) {
            g0 g0Var = this.f3845h;
            int i11 = this.f3846i;
            if (fragment2 != null) {
                fragment2.l0(false);
                if (i11 == 1) {
                    if (this.f3847j == null) {
                        g0Var.getClass();
                        this.f3847j = new a(g0Var);
                    }
                    this.f3847j.n(this.f3848k, Lifecycle.State.STARTED);
                } else {
                    this.f3848k.m0(false);
                }
            }
            fragment.l0(true);
            if (i11 == 1) {
                if (this.f3847j == null) {
                    g0Var.getClass();
                    this.f3847j = new a(g0Var);
                }
                this.f3847j.n(fragment, Lifecycle.State.RESUMED);
            } else {
                fragment.m0(true);
            }
            this.f3848k = fragment;
        }
    }

    @Override // j2.a
    public final void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    @Override // j2.a
    public final void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }
}
