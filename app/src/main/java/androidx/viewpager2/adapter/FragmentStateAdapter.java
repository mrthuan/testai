package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.b0;
import androidx.fragment.app.g0;
import androidx.fragment.app.u;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.n;
import androidx.lifecycle.p;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugIAPConfigFragment;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugNotificationFragment;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.e1;
import x0.f0;
import x0.n0;
import y.h;

/* loaded from: classes.dex */
public abstract class FragmentStateAdapter extends RecyclerView.Adapter<f> implements g {

    /* renamed from: d  reason: collision with root package name */
    public final Lifecycle f4794d;

    /* renamed from: e  reason: collision with root package name */
    public final g0 f4795e;

    /* renamed from: f  reason: collision with root package name */
    public final y.f<Fragment> f4796f;

    /* renamed from: g  reason: collision with root package name */
    public final y.f<Fragment.f> f4797g;

    /* renamed from: h  reason: collision with root package name */
    public final y.f<Integer> f4798h;

    /* renamed from: i  reason: collision with root package name */
    public b f4799i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4800j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4801k;

    /* loaded from: classes.dex */
    public static abstract class a extends RecyclerView.g {
        public a(int i10) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void b() {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void c(int i10, int i11, Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void d(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void e(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void f(int i10, int i11) {
            a();
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public d f4807a;

        /* renamed from: b  reason: collision with root package name */
        public e f4808b;
        public n c;

        /* renamed from: d  reason: collision with root package name */
        public ViewPager2 f4809d;

        /* renamed from: e  reason: collision with root package name */
        public long f4810e = -1;

        public b() {
        }

        public static ViewPager2 a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        public final void b(boolean z10) {
            boolean z11;
            int currentItem;
            boolean z12;
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            if (fragmentStateAdapter.f4795e.O() || this.f4809d.getScrollState() != 0) {
                return;
            }
            y.f<Fragment> fVar = fragmentStateAdapter.f4796f;
            if (fVar.j() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 || (currentItem = this.f4809d.getCurrentItem()) >= 6) {
                return;
            }
            long j10 = currentItem;
            if (j10 == this.f4810e && !z10) {
                return;
            }
            Fragment fragment = null;
            Fragment fragment2 = (Fragment) fVar.f(j10, null);
            if (fragment2 != null && fragment2.D()) {
                this.f4810e = j10;
                g0 g0Var = fragmentStateAdapter.f4795e;
                g0Var.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(g0Var);
                for (int i10 = 0; i10 < fVar.j(); i10++) {
                    long g10 = fVar.g(i10);
                    Fragment k10 = fVar.k(i10);
                    if (k10.D()) {
                        if (g10 != this.f4810e) {
                            aVar.n(k10, Lifecycle.State.STARTED);
                        } else {
                            fragment = k10;
                        }
                        if (g10 == this.f4810e) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        k10.l0(z12);
                    }
                }
                if (fragment != null) {
                    aVar.n(fragment, Lifecycle.State.RESUMED);
                }
                if (!aVar.f3898a.isEmpty()) {
                    aVar.i();
                }
            }
        }
    }

    public FragmentStateAdapter(u uVar) {
        g0 supportFragmentManager = uVar.getSupportFragmentManager();
        Lifecycle lifecycle = uVar.getLifecycle();
        this.f4796f = new y.f<>();
        this.f4797g = new y.f<>();
        this.f4798h = new y.f<>();
        this.f4800j = false;
        this.f4801k = false;
        this.f4795e = supportFragmentManager;
        this.f4794d = lifecycle;
        super.setHasStableIds(true);
    }

    public static void h(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() <= 1) {
            if (view.getParent() == frameLayout) {
                return;
            }
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    @Override // androidx.viewpager2.adapter.g
    public final Parcelable a() {
        y.f<Fragment> fVar = this.f4796f;
        int j10 = fVar.j();
        y.f<Fragment.f> fVar2 = this.f4797g;
        Bundle bundle = new Bundle(fVar2.j() + j10);
        for (int i10 = 0; i10 < fVar.j(); i10++) {
            long g10 = fVar.g(i10);
            Fragment fragment = (Fragment) fVar.f(g10, null);
            if (fragment != null && fragment.D()) {
                String c = androidx.appcompat.view.menu.d.c("f#", g10);
                g0 g0Var = this.f4795e;
                g0Var.getClass();
                if (fragment.f3686s == g0Var) {
                    bundle.putString(c, fragment.f3673f);
                } else {
                    g0Var.e0(new IllegalStateException(androidx.activity.f.l("Fragment ", fragment, " is not currently in the FragmentManager")));
                    throw null;
                }
            }
        }
        for (int i11 = 0; i11 < fVar2.j(); i11++) {
            long g11 = fVar2.g(i11);
            if (i(g11)) {
                bundle.putParcelable(androidx.appcompat.view.menu.d.c("s#", g11), (Parcelable) fVar2.f(g11, null));
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager2.adapter.g
    public final void b(Parcelable parcelable) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        y.f<Fragment.f> fVar = this.f4797g;
        boolean z14 = false;
        if (fVar.j() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            y.f<Fragment> fVar2 = this.f4796f;
            if (fVar2.j() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(getClass().getClassLoader());
                }
                for (String str : bundle.keySet()) {
                    if (str.startsWith("f#") && str.length() > 2) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        long parseLong = Long.parseLong(str.substring(2));
                        g0 g0Var = this.f4795e;
                        g0Var.getClass();
                        String string = bundle.getString(str);
                        Fragment fragment = null;
                        if (string != null) {
                            Fragment B = g0Var.B(string);
                            if (B != null) {
                                fragment = B;
                            } else {
                                g0Var.e0(new IllegalStateException(androidx.appcompat.view.menu.d.d("Fragment no longer exists for key ", str, ": unique id ", string)));
                                throw null;
                            }
                        }
                        fVar2.h(parseLong, fragment);
                    } else {
                        if (str.startsWith("s#") && str.length() > 2) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            long parseLong2 = Long.parseLong(str.substring(2));
                            Fragment.f fVar3 = (Fragment.f) bundle.getParcelable(str);
                            if (i(parseLong2)) {
                                fVar.h(parseLong2, fVar3);
                            }
                        } else {
                            throw new IllegalArgumentException("Unexpected key in savedState: ".concat(str));
                        }
                    }
                }
                if (fVar2.j() == 0) {
                    z14 = true;
                }
                if (!z14) {
                    this.f4801k = true;
                    this.f4800j = true;
                    j();
                    final Handler handler = new Handler(Looper.getMainLooper());
                    final c cVar = new c(this);
                    this.f4794d.a(new n() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.5
                        @Override // androidx.lifecycle.n
                        public final void d(p pVar, Lifecycle.Event event) {
                            if (event == Lifecycle.Event.ON_DESTROY) {
                                handler.removeCallbacks(cVar);
                                pVar.getLifecycle().c(this);
                            }
                        }
                    });
                    handler.postDelayed(cVar, 10000L);
                    return;
                }
                return;
            }
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    public final boolean i(long j10) {
        if (j10 >= 0 && j10 < 6) {
            return true;
        }
        return false;
    }

    public final void j() {
        y.f<Fragment> fVar;
        y.f<Integer> fVar2;
        boolean z10;
        Fragment fragment;
        View view;
        if (this.f4801k && !this.f4795e.O()) {
            y.d dVar = new y.d();
            int i10 = 0;
            while (true) {
                fVar = this.f4796f;
                int j10 = fVar.j();
                fVar2 = this.f4798h;
                if (i10 >= j10) {
                    break;
                }
                long g10 = fVar.g(i10);
                if (!i(g10)) {
                    dVar.add(Long.valueOf(g10));
                    fVar2.i(g10);
                }
                i10++;
            }
            if (!this.f4800j) {
                this.f4801k = false;
                for (int i11 = 0; i11 < fVar.j(); i11++) {
                    long g11 = fVar.g(i11);
                    if (fVar2.f31923a) {
                        fVar2.e();
                    }
                    boolean z11 = true;
                    if (b.b.k(fVar2.f31924b, fVar2.f31925d, g11) >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10 && ((fragment = (Fragment) fVar.f(g11, null)) == null || (view = fragment.H) == null || view.getParent() == null)) {
                        z11 = false;
                    }
                    if (!z11) {
                        dVar.add(Long.valueOf(g11));
                    }
                }
            }
            Iterator it = dVar.iterator();
            while (true) {
                h.a aVar = (h.a) it;
                if (aVar.hasNext()) {
                    m(((Long) aVar.next()).longValue());
                } else {
                    return;
                }
            }
        }
    }

    public final Long k(int i10) {
        Long l10 = null;
        int i11 = 0;
        while (true) {
            y.f<Integer> fVar = this.f4798h;
            if (i11 < fVar.j()) {
                if (fVar.k(i11).intValue() == i10) {
                    if (l10 == null) {
                        l10 = Long.valueOf(fVar.g(i11));
                    } else {
                        throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                    }
                }
                i11++;
            } else {
                return l10;
            }
        }
    }

    public final void l(final f fVar) {
        Fragment fragment = (Fragment) this.f4796f.f(fVar.getItemId(), null);
        if (fragment != null) {
            FrameLayout frameLayout = (FrameLayout) fVar.itemView;
            View view = fragment.H;
            if (!fragment.D() && view != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            boolean D = fragment.D();
            g0 g0Var = this.f4795e;
            if (D && view == null) {
                g0Var.f3786l.f3754a.add(new b0.a(new androidx.viewpager2.adapter.b(this, fragment, frameLayout)));
                return;
            } else if (fragment.D() && view.getParent() != null) {
                if (view.getParent() != frameLayout) {
                    h(view, frameLayout);
                    return;
                }
                return;
            } else if (fragment.D()) {
                h(view, frameLayout);
                return;
            } else if (!g0Var.O()) {
                g0Var.f3786l.f3754a.add(new b0.a(new androidx.viewpager2.adapter.b(this, fragment, frameLayout)));
                g0Var.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(g0Var);
                aVar.c(0, fragment, "f" + fVar.getItemId(), 1);
                aVar.n(fragment, Lifecycle.State.STARTED);
                aVar.i();
                this.f4799i.b(false);
                return;
            } else if (g0Var.G) {
                return;
            } else {
                this.f4794d.a(new n() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
                    @Override // androidx.lifecycle.n
                    public final void d(p pVar, Lifecycle.Event event) {
                        FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
                        if (fragmentStateAdapter.f4795e.O()) {
                            return;
                        }
                        pVar.getLifecycle().c(this);
                        f fVar2 = fVar;
                        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                        if (f0.g.b((FrameLayout) fVar2.itemView)) {
                            fragmentStateAdapter.l(fVar2);
                        }
                    }
                });
                return;
            }
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public final void m(long j10) {
        ViewParent parent;
        y.f<Fragment> fVar = this.f4796f;
        Fragment.f fVar2 = null;
        Fragment fragment = (Fragment) fVar.f(j10, null);
        if (fragment == null) {
            return;
        }
        View view = fragment.H;
        if (view != null && (parent = view.getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        boolean i10 = i(j10);
        y.f<Fragment.f> fVar3 = this.f4797g;
        if (!i10) {
            fVar3.i(j10);
        }
        if (!fragment.D()) {
            fVar.i(j10);
            return;
        }
        g0 g0Var = this.f4795e;
        if (g0Var.O()) {
            this.f4801k = true;
            return;
        }
        if (fragment.D() && i(j10)) {
            g0Var.getClass();
            androidx.fragment.app.n0 n0Var = (androidx.fragment.app.n0) ((HashMap) g0Var.c.f3892b).get(fragment.f3673f);
            if (n0Var != null) {
                Fragment fragment2 = n0Var.c;
                if (fragment2.equals(fragment)) {
                    if (fragment2.f3669a > -1) {
                        fVar2 = new Fragment.f(n0Var.o());
                    }
                    fVar3.h(j10, fVar2);
                }
            }
            g0Var.e0(new IllegalStateException(androidx.activity.f.l("Fragment ", fragment, " is not currently in the FragmentManager")));
            throw null;
        }
        g0Var.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(g0Var);
        aVar.m(fragment);
        aVar.i();
        fVar.i(j10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        boolean z10;
        if (this.f4799i == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            final b bVar = new b();
            this.f4799i = bVar;
            bVar.f4809d = b.a(recyclerView);
            d dVar = new d(bVar);
            bVar.f4807a = dVar;
            bVar.f4809d.f(dVar);
            e eVar = new e(bVar);
            bVar.f4808b = eVar;
            registerAdapterDataObserver(eVar);
            n nVar = new n() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3
                @Override // androidx.lifecycle.n
                public final void d(p pVar, Lifecycle.Event event) {
                    FragmentStateAdapter.b.this.b(false);
                }
            };
            bVar.c = nVar;
            this.f4794d.a(nVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(f fVar, int i10) {
        boolean z10;
        Fragment debugAppConfigFragment;
        Bundle bundle;
        f fVar2 = fVar;
        long itemId = fVar2.getItemId();
        int id2 = ((FrameLayout) fVar2.itemView).getId();
        Long k10 = k(id2);
        y.f<Integer> fVar3 = this.f4798h;
        if (k10 != null && k10.longValue() != itemId) {
            m(k10.longValue());
            fVar3.i(k10.longValue());
        }
        fVar3.h(itemId, Integer.valueOf(id2));
        long j10 = i10;
        y.f<Fragment> fVar4 = this.f4796f;
        if (fVar4.f31923a) {
            fVar4.e();
        }
        if (b.b.k(fVar4.f31924b, fVar4.f31925d, j10) >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 != 5) {
                                    debugAppConfigFragment = new DebugAppConfigFragment();
                                } else {
                                    debugAppConfigFragment = new e1();
                                }
                            } else {
                                debugAppConfigFragment = new DebugPageAndDialogFragment();
                            }
                        } else {
                            debugAppConfigFragment = new DebugNotificationFragment();
                        }
                    } else {
                        debugAppConfigFragment = new DebugIAPConfigFragment();
                    }
                } else {
                    debugAppConfigFragment = new pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.n();
                }
            } else {
                debugAppConfigFragment = new DebugAppConfigFragment();
            }
            Bundle bundle2 = null;
            Fragment.f fVar5 = (Fragment.f) this.f4797g.f(j10, null);
            if (debugAppConfigFragment.f3686s == null) {
                if (fVar5 != null && (bundle = fVar5.f3710a) != null) {
                    bundle2 = bundle;
                }
                debugAppConfigFragment.f3670b = bundle2;
                fVar4.h(j10, debugAppConfigFragment);
            } else {
                throw new IllegalStateException("Fragment already added");
            }
        }
        FrameLayout frameLayout = (FrameLayout) fVar2.itemView;
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        if (f0.g.b(frameLayout)) {
            if (frameLayout.getParent() == null) {
                frameLayout.addOnLayoutChangeListener(new androidx.viewpager2.adapter.a(this, frameLayout, fVar2));
            } else {
                throw new IllegalStateException("Design assumption violated.");
            }
        }
        j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final f onCreateViewHolder(ViewGroup viewGroup, int i10) {
        int i11 = f.f4819b;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        frameLayout.setId(f0.e.a());
        frameLayout.setSaveEnabled(false);
        return new f(frameLayout);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        b bVar = this.f4799i;
        bVar.getClass();
        ViewPager2 a10 = b.a(recyclerView);
        a10.c.f4852a.remove(bVar.f4807a);
        e eVar = bVar.f4808b;
        FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
        fragmentStateAdapter.unregisterAdapterDataObserver(eVar);
        fragmentStateAdapter.f4794d.c(bVar.c);
        bVar.f4809d = null;
        this.f4799i = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ boolean onFailedToRecycleView(f fVar) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(f fVar) {
        l(fVar);
        j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(f fVar) {
        Long k10 = k(((FrameLayout) fVar.itemView).getId());
        if (k10 != null) {
            m(k10.longValue());
            this.f4798h.i(k10.longValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z10) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }
}
