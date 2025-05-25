package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SpecialEffectsController;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.fragment.app.strictmode.WrongNestedHierarchyViolation;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import o1.b;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;

/* compiled from: FragmentStateManager.java */
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a  reason: collision with root package name */
    public final b0 f3884a;

    /* renamed from: b  reason: collision with root package name */
    public final o0 f3885b;
    public final Fragment c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3886d = false;

    /* renamed from: e  reason: collision with root package name */
    public int f3887e = -1;

    /* compiled from: FragmentStateManager.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3889a;

        static {
            int[] iArr = new int[Lifecycle.State.values().length];
            f3889a = iArr;
            try {
                iArr[Lifecycle.State.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3889a[Lifecycle.State.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3889a[Lifecycle.State.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3889a[Lifecycle.State.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public n0(b0 b0Var, o0 o0Var, Fragment fragment) {
        this.f3884a = b0Var;
        this.f3885b = o0Var;
        this.c = fragment;
    }

    public final void a() {
        Bundle bundle;
        Bundle bundle2;
        boolean J = g0.J(3);
        Fragment fragment = this.c;
        if (J) {
            Objects.toString(fragment);
        }
        Bundle bundle3 = fragment.f3670b;
        if (bundle3 != null) {
            bundle = bundle3.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        fragment.f3688u.Q();
        fragment.f3669a = 3;
        fragment.F = false;
        fragment.H(bundle);
        if (fragment.F) {
            if (g0.J(3)) {
                fragment.toString();
            }
            if (fragment.H != null) {
                Bundle bundle4 = fragment.f3670b;
                if (bundle4 != null) {
                    bundle2 = bundle4.getBundle("savedInstanceState");
                } else {
                    bundle2 = null;
                }
                SparseArray<Parcelable> sparseArray = fragment.c;
                if (sparseArray != null) {
                    fragment.H.restoreHierarchyState(sparseArray);
                    fragment.c = null;
                }
                fragment.F = false;
                fragment.c0(bundle2);
                if (fragment.F) {
                    if (fragment.H != null) {
                        fragment.Q.a(Lifecycle.Event.ON_CREATE);
                    }
                } else {
                    throw new SuperNotCalledException(androidx.activity.f.l("Fragment ", fragment, " did not call through to super.onViewStateRestored()"));
                }
            }
            fragment.f3670b = null;
            h0 h0Var = fragment.f3688u;
            h0Var.E = false;
            h0Var.F = false;
            h0Var.L.f3837i = false;
            h0Var.t(4);
            this.f3884a.a(false);
            return;
        }
        throw new SuperNotCalledException(androidx.activity.f.l("Fragment ", fragment, " did not call through to super.onActivityCreated()"));
    }

    public final void b() {
        Fragment fragment;
        int i10;
        View view;
        View view2;
        Fragment fragment2;
        Fragment fragment3 = this.c;
        View view3 = fragment3.G;
        while (true) {
            fragment = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            if (tag instanceof Fragment) {
                fragment2 = (Fragment) tag;
            } else {
                fragment2 = null;
            }
            if (fragment2 != null) {
                fragment = fragment2;
                break;
            }
            ViewParent parent = view3.getParent();
            if (parent instanceof View) {
                view3 = (View) parent;
            } else {
                view3 = null;
            }
        }
        Fragment fragment4 = fragment3.f3689v;
        if (fragment != null && !fragment.equals(fragment4)) {
            int i11 = fragment3.f3691x;
            FragmentStrictMode.a aVar = FragmentStrictMode.f3929a;
            WrongNestedHierarchyViolation wrongNestedHierarchyViolation = new WrongNestedHierarchyViolation(fragment3, fragment, i11);
            FragmentStrictMode.c(wrongNestedHierarchyViolation);
            FragmentStrictMode.a a10 = FragmentStrictMode.a(fragment3);
            if (a10.f3931a.contains(FragmentStrictMode.Flag.DETECT_WRONG_NESTED_HIERARCHY) && FragmentStrictMode.e(a10, fragment3.getClass(), WrongNestedHierarchyViolation.class)) {
                FragmentStrictMode.b(a10, wrongNestedHierarchyViolation);
            }
        }
        o0 o0Var = this.f3885b;
        o0Var.getClass();
        ViewGroup viewGroup = fragment3.G;
        if (viewGroup != null) {
            int indexOf = ((ArrayList) o0Var.f3891a).indexOf(fragment3);
            int i12 = indexOf - 1;
            while (true) {
                if (i12 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= ((ArrayList) o0Var.f3891a).size()) {
                            break;
                        }
                        Fragment fragment5 = (Fragment) ((ArrayList) o0Var.f3891a).get(indexOf);
                        if (fragment5.G == viewGroup && (view = fragment5.H) != null) {
                            i10 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment6 = (Fragment) ((ArrayList) o0Var.f3891a).get(i12);
                    if (fragment6.G == viewGroup && (view2 = fragment6.H) != null) {
                        i10 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i12--;
                }
            }
        }
        i10 = -1;
        fragment3.G.addView(fragment3.H, i10);
    }

    public final void c() {
        boolean J = g0.J(3);
        Fragment fragment = this.c;
        if (J) {
            Objects.toString(fragment);
        }
        Fragment fragment2 = fragment.f3675h;
        n0 n0Var = null;
        o0 o0Var = this.f3885b;
        if (fragment2 != null) {
            n0 n0Var2 = (n0) ((HashMap) o0Var.f3892b).get(fragment2.f3673f);
            if (n0Var2 != null) {
                fragment.f3676i = fragment.f3675h.f3673f;
                fragment.f3675h = null;
                n0Var = n0Var2;
            } else {
                throw new IllegalStateException("Fragment " + fragment + " declared target fragment " + fragment.f3675h + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.f3676i;
            if (str != null && (n0Var = (n0) ((HashMap) o0Var.f3892b).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(fragment);
                sb2.append(" declared target fragment ");
                throw new IllegalStateException(androidx.activity.r.g(sb2, fragment.f3676i, " that does not belong to this FragmentManager!"));
            }
        }
        if (n0Var != null) {
            n0Var.k();
        }
        g0 g0Var = fragment.f3686s;
        fragment.f3687t = g0Var.f3794t;
        fragment.f3689v = g0Var.f3796v;
        b0 b0Var = this.f3884a;
        b0Var.g(false);
        ArrayList<Fragment.e> arrayList = fragment.V;
        Iterator<Fragment.e> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        arrayList.clear();
        fragment.f3688u.b(fragment.f3687t, fragment.m(), fragment);
        fragment.f3669a = 0;
        fragment.F = false;
        fragment.L(fragment.f3687t.f3962e);
        if (fragment.F) {
            Iterator<k0> it2 = fragment.f3686s.f3787m.iterator();
            while (it2.hasNext()) {
                it2.next().u(fragment);
            }
            h0 h0Var = fragment.f3688u;
            h0Var.E = false;
            h0Var.F = false;
            h0Var.L.f3837i = false;
            h0Var.t(0);
            b0Var.b(false);
            return;
        }
        throw new SuperNotCalledException(androidx.activity.f.l("Fragment ", fragment, " did not call through to super.onAttach()"));
    }

    public final int d() {
        SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact;
        Object obj;
        int i10;
        boolean z10;
        Fragment fragment = this.c;
        if (fragment.f3686s == null) {
            return fragment.f3669a;
        }
        int i11 = this.f3887e;
        int i12 = b.f3889a[fragment.O.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        i11 = Math.min(i11, -1);
                    } else {
                        i11 = Math.min(i11, 0);
                    }
                } else {
                    i11 = Math.min(i11, 1);
                }
            } else {
                i11 = Math.min(i11, 5);
            }
        }
        if (fragment.f3681n) {
            if (fragment.f3682o) {
                i11 = Math.max(this.f3887e, 2);
                View view = fragment.H;
                if (view != null && view.getParent() == null) {
                    i11 = Math.min(i11, 2);
                }
            } else {
                i11 = this.f3887e < 4 ? Math.min(i11, fragment.f3669a) : Math.min(i11, 1);
            }
        }
        if (!fragment.f3679l) {
            i11 = Math.min(i11, 1);
        }
        ViewGroup viewGroup = fragment.G;
        SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact2 = null;
        if (viewGroup != null) {
            SpecialEffectsController f10 = SpecialEffectsController.f(viewGroup, fragment.u());
            f10.getClass();
            SpecialEffectsController.Operation d10 = f10.d(fragment);
            if (d10 != null) {
                lifecycleImpact = d10.f3722b;
            } else {
                lifecycleImpact = null;
            }
            Iterator it = f10.c.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    SpecialEffectsController.Operation operation = (SpecialEffectsController.Operation) obj;
                    if (kotlin.jvm.internal.g.a(operation.c, fragment) && !operation.f3725f) {
                        z10 = true;
                        continue;
                    } else {
                        z10 = false;
                        continue;
                    }
                    if (z10) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            SpecialEffectsController.Operation operation2 = (SpecialEffectsController.Operation) obj;
            if (operation2 != null) {
                lifecycleImpact2 = operation2.f3722b;
            }
            if (lifecycleImpact == null) {
                i10 = -1;
            } else {
                i10 = SpecialEffectsController.b.f3732a[lifecycleImpact.ordinal()];
            }
            if (i10 != -1 && i10 != 1) {
                lifecycleImpact2 = lifecycleImpact;
            }
        }
        if (lifecycleImpact2 == SpecialEffectsController.Operation.LifecycleImpact.ADDING) {
            i11 = Math.min(i11, 6);
        } else if (lifecycleImpact2 == SpecialEffectsController.Operation.LifecycleImpact.REMOVING) {
            i11 = Math.max(i11, 3);
        } else if (fragment.f3680m) {
            if (fragment.F()) {
                i11 = Math.min(i11, 1);
            } else {
                i11 = Math.min(i11, -1);
            }
        }
        if (fragment.I && fragment.f3669a < 5) {
            i11 = Math.min(i11, 4);
        }
        if (g0.J(2)) {
            Objects.toString(fragment);
        }
        return i11;
    }

    public final void e() {
        Bundle bundle;
        Bundle bundle2;
        boolean J = g0.J(3);
        final Fragment fragment = this.c;
        if (J) {
            Objects.toString(fragment);
        }
        Bundle bundle3 = fragment.f3670b;
        if (bundle3 != null) {
            bundle = bundle3.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        if (!fragment.M) {
            b0 b0Var = this.f3884a;
            b0Var.h(false);
            fragment.f3688u.Q();
            fragment.f3669a = 1;
            fragment.F = false;
            fragment.P.a(new androidx.lifecycle.n() { // from class: androidx.fragment.app.Fragment.6
                @Override // androidx.lifecycle.n
                public final void d(androidx.lifecycle.p pVar, Lifecycle.Event event) {
                    View view;
                    if (event == Lifecycle.Event.ON_STOP && (view = fragment.H) != null) {
                        view.cancelPendingInputEvents();
                    }
                }
            });
            fragment.M(bundle);
            fragment.M = true;
            if (fragment.F) {
                fragment.P.f(Lifecycle.Event.ON_CREATE);
                b0Var.c(false);
                return;
            }
            throw new SuperNotCalledException(androidx.activity.f.l("Fragment ", fragment, " did not call through to super.onCreate()"));
        }
        fragment.f3669a = 1;
        Bundle bundle4 = fragment.f3670b;
        if (bundle4 != null && (bundle2 = bundle4.getBundle("childFragmentManager")) != null) {
            fragment.f3688u.W(bundle2);
            h0 h0Var = fragment.f3688u;
            h0Var.E = false;
            h0Var.F = false;
            h0Var.L.f3837i = false;
            h0Var.t(1);
        }
    }

    public final void f() {
        Bundle bundle;
        String str;
        Fragment fragment = this.c;
        if (fragment.f3681n) {
            return;
        }
        if (g0.J(3)) {
            Objects.toString(fragment);
        }
        Bundle bundle2 = fragment.f3670b;
        Bundle bundle3 = null;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        LayoutInflater R = fragment.R(bundle);
        ViewGroup viewGroup = fragment.G;
        if (viewGroup == null) {
            int i10 = fragment.f3691x;
            if (i10 != 0) {
                if (i10 != -1) {
                    viewGroup = (ViewGroup) fragment.f3686s.f3795u.F(i10);
                    if (viewGroup == null) {
                        if (!fragment.f3683p) {
                            try {
                                str = fragment.v().getResourceName(fragment.f3691x);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.f3691x) + " (" + str + ") for fragment " + fragment);
                        }
                    } else if (!(viewGroup instanceof FragmentContainerView)) {
                        FragmentStrictMode.a aVar = FragmentStrictMode.f3929a;
                        WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment, viewGroup);
                        FragmentStrictMode.c(wrongFragmentContainerViolation);
                        FragmentStrictMode.a a10 = FragmentStrictMode.a(fragment);
                        if (a10.f3931a.contains(FragmentStrictMode.Flag.DETECT_WRONG_FRAGMENT_CONTAINER) && FragmentStrictMode.e(a10, fragment.getClass(), WrongFragmentContainerViolation.class)) {
                            FragmentStrictMode.b(a10, wrongFragmentContainerViolation);
                        }
                    }
                } else {
                    throw new IllegalArgumentException(androidx.activity.f.l("Cannot create fragment ", fragment, " for a container view with no id"));
                }
            } else {
                viewGroup = null;
            }
        }
        fragment.G = viewGroup;
        fragment.e0(R, viewGroup, bundle);
        if (fragment.H != null) {
            if (g0.J(3)) {
                Objects.toString(fragment);
            }
            fragment.H.setSaveFromParentEnabled(false);
            fragment.H.setTag(R.id.fragment_container_view_tag, fragment);
            if (viewGroup != null) {
                b();
            }
            if (fragment.f3693z) {
                fragment.H.setVisibility(8);
            }
            View view = fragment.H;
            WeakHashMap<View, x0.n0> weakHashMap = x0.f0.f31435a;
            if (f0.g.b(view)) {
                f0.h.c(fragment.H);
            } else {
                View view2 = fragment.H;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            Bundle bundle4 = fragment.f3670b;
            if (bundle4 != null) {
                bundle3 = bundle4.getBundle("savedInstanceState");
            }
            fragment.b0(fragment.H, bundle3);
            fragment.f3688u.t(2);
            this.f3884a.m(fragment, fragment.H, false);
            int visibility = fragment.H.getVisibility();
            fragment.o().f3708l = fragment.H.getAlpha();
            if (fragment.G != null && visibility == 0) {
                View findFocus = fragment.H.findFocus();
                if (findFocus != null) {
                    fragment.o().f3709m = findFocus;
                    if (g0.J(2)) {
                        findFocus.toString();
                        Objects.toString(fragment);
                    }
                }
                fragment.H.setAlpha(0.0f);
            }
        }
        fragment.f3669a = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n0.g():void");
    }

    public final void h() {
        View view;
        boolean J = g0.J(3);
        Fragment fragment = this.c;
        if (J) {
            Objects.toString(fragment);
        }
        ViewGroup viewGroup = fragment.G;
        if (viewGroup != null && (view = fragment.H) != null) {
            viewGroup.removeView(view);
        }
        fragment.f3688u.t(1);
        if (fragment.H != null) {
            x0 x0Var = fragment.Q;
            x0Var.b();
            if (x0Var.f3958e.f4071d.isAtLeast(Lifecycle.State.CREATED)) {
                fragment.Q.a(Lifecycle.Event.ON_DESTROY);
            }
        }
        fragment.f3669a = 1;
        fragment.F = false;
        fragment.P();
        if (fragment.F) {
            y.j<b.a> jVar = o1.a.a(fragment).f22663b.f22665d;
            int i10 = jVar.c;
            for (int i11 = 0; i11 < i10; i11++) {
                ((b.a) jVar.f31946b[i11]).getClass();
            }
            fragment.f3684q = false;
            this.f3884a.n(false);
            fragment.G = null;
            fragment.H = null;
            fragment.Q = null;
            fragment.R.j(null);
            fragment.f3682o = false;
            return;
        }
        throw new SuperNotCalledException(androidx.activity.f.l("Fragment ", fragment, " did not call through to super.onDestroyView()"));
    }

    public final void i() {
        boolean J = g0.J(3);
        Fragment fragment = this.c;
        if (J) {
            Objects.toString(fragment);
        }
        fragment.f3669a = -1;
        boolean z10 = false;
        fragment.F = false;
        fragment.Q();
        if (fragment.F) {
            h0 h0Var = fragment.f3688u;
            if (!h0Var.G) {
                h0Var.k();
                fragment.f3688u = new h0();
            }
            this.f3884a.e(false);
            fragment.f3669a = -1;
            fragment.f3687t = null;
            fragment.f3689v = null;
            fragment.f3686s = null;
            boolean z11 = true;
            if (fragment.f3680m && !fragment.F()) {
                z10 = true;
            }
            if (!z10) {
                j0 j0Var = (j0) this.f3885b.f3893d;
                if (j0Var.f3832d.containsKey(fragment.f3673f) && j0Var.f3835g) {
                    z11 = j0Var.f3836h;
                }
                if (!z11) {
                    return;
                }
            }
            if (g0.J(3)) {
                Objects.toString(fragment);
            }
            fragment.C();
            return;
        }
        throw new SuperNotCalledException(androidx.activity.f.l("Fragment ", fragment, " did not call through to super.onDetach()"));
    }

    public final void j() {
        Bundle bundle;
        Fragment fragment = this.c;
        if (fragment.f3681n && fragment.f3682o && !fragment.f3684q) {
            if (g0.J(3)) {
                Objects.toString(fragment);
            }
            Bundle bundle2 = fragment.f3670b;
            Bundle bundle3 = null;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("savedInstanceState");
            } else {
                bundle = null;
            }
            fragment.e0(fragment.R(bundle), null, bundle);
            View view = fragment.H;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fragment.H.setTag(R.id.fragment_container_view_tag, fragment);
                if (fragment.f3693z) {
                    fragment.H.setVisibility(8);
                }
                Bundle bundle4 = fragment.f3670b;
                if (bundle4 != null) {
                    bundle3 = bundle4.getBundle("savedInstanceState");
                }
                fragment.b0(fragment.H, bundle3);
                fragment.f3688u.t(2);
                this.f3884a.m(fragment, fragment.H, false);
                fragment.f3669a = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        o0 o0Var = this.f3885b;
        boolean z10 = this.f3886d;
        Fragment fragment = this.c;
        if (z10) {
            if (g0.J(2)) {
                Objects.toString(fragment);
                return;
            }
            return;
        }
        try {
            this.f3886d = true;
            boolean z11 = false;
            while (true) {
                int d10 = d();
                int i10 = fragment.f3669a;
                if (d10 != i10) {
                    if (d10 > i10) {
                        switch (i10 + 1) {
                            case 0:
                                c();
                                continue;
                            case 1:
                                e();
                                continue;
                            case 2:
                                j();
                                f();
                                continue;
                            case 3:
                                a();
                                continue;
                            case 4:
                                if (fragment.H != null && (viewGroup3 = fragment.G) != null) {
                                    SpecialEffectsController f10 = SpecialEffectsController.f(viewGroup3, fragment.u());
                                    SpecialEffectsController.Operation.State finalState = SpecialEffectsController.Operation.State.from(fragment.H.getVisibility());
                                    f10.getClass();
                                    kotlin.jvm.internal.g.e(finalState, "finalState");
                                    if (g0.J(2)) {
                                        Objects.toString(fragment);
                                    }
                                    f10.a(finalState, SpecialEffectsController.Operation.LifecycleImpact.ADDING, this);
                                }
                                fragment.f3669a = 4;
                                continue;
                            case 5:
                                q();
                                continue;
                            case 6:
                                fragment.f3669a = 6;
                                continue;
                            case 7:
                                n();
                                continue;
                            default:
                                continue;
                        }
                    } else {
                        switch (i10 - 1) {
                            case -1:
                                i();
                                continue;
                            case 0:
                                g();
                                continue;
                            case 1:
                                h();
                                fragment.f3669a = 1;
                                continue;
                            case 2:
                                fragment.f3682o = false;
                                fragment.f3669a = 2;
                                continue;
                            case 3:
                                if (g0.J(3)) {
                                    Objects.toString(fragment);
                                }
                                if (fragment.H != null && fragment.c == null) {
                                    p();
                                }
                                if (fragment.H != null && (viewGroup2 = fragment.G) != null) {
                                    SpecialEffectsController f11 = SpecialEffectsController.f(viewGroup2, fragment.u());
                                    f11.getClass();
                                    if (g0.J(2)) {
                                        Objects.toString(fragment);
                                    }
                                    f11.a(SpecialEffectsController.Operation.State.REMOVED, SpecialEffectsController.Operation.LifecycleImpact.REMOVING, this);
                                }
                                fragment.f3669a = 3;
                                continue;
                            case 4:
                                r();
                                continue;
                            case 5:
                                fragment.f3669a = 5;
                                continue;
                            case 6:
                                l();
                                continue;
                            default:
                                continue;
                        }
                    }
                    z11 = true;
                } else {
                    if (!z11 && i10 == -1 && fragment.f3680m && !fragment.F()) {
                        if (g0.J(3)) {
                            Objects.toString(fragment);
                        }
                        j0 j0Var = (j0) o0Var.f3893d;
                        j0Var.getClass();
                        if (g0.J(3)) {
                            Objects.toString(fragment);
                        }
                        j0Var.e(fragment.f3673f);
                        o0Var.i(this);
                        if (g0.J(3)) {
                            Objects.toString(fragment);
                        }
                        fragment.C();
                    }
                    if (fragment.L) {
                        if (fragment.H != null && (viewGroup = fragment.G) != null) {
                            SpecialEffectsController f12 = SpecialEffectsController.f(viewGroup, fragment.u());
                            if (fragment.f3693z) {
                                f12.getClass();
                                if (g0.J(2)) {
                                    Objects.toString(fragment);
                                }
                                f12.a(SpecialEffectsController.Operation.State.GONE, SpecialEffectsController.Operation.LifecycleImpact.NONE, this);
                            } else {
                                f12.getClass();
                                if (g0.J(2)) {
                                    Objects.toString(fragment);
                                }
                                f12.a(SpecialEffectsController.Operation.State.VISIBLE, SpecialEffectsController.Operation.LifecycleImpact.NONE, this);
                            }
                        }
                        g0 g0Var = fragment.f3686s;
                        if (g0Var != null && fragment.f3679l && g0.K(fragment)) {
                            g0Var.D = true;
                        }
                        fragment.L = false;
                        fragment.S(fragment.f3693z);
                        fragment.f3688u.n();
                    }
                    return;
                }
            }
        } finally {
            this.f3886d = false;
        }
    }

    public final void l() {
        boolean J = g0.J(3);
        Fragment fragment = this.c;
        if (J) {
            Objects.toString(fragment);
        }
        fragment.f3688u.t(5);
        if (fragment.H != null) {
            fragment.Q.a(Lifecycle.Event.ON_PAUSE);
        }
        fragment.P.f(Lifecycle.Event.ON_PAUSE);
        fragment.f3669a = 6;
        fragment.F = false;
        fragment.T();
        if (fragment.F) {
            this.f3884a.f(false);
            return;
        }
        throw new SuperNotCalledException(androidx.activity.f.l("Fragment ", fragment, " did not call through to super.onPause()"));
    }

    public final void m(ClassLoader classLoader) {
        Fragment fragment = this.c;
        Bundle bundle = fragment.f3670b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (fragment.f3670b.getBundle("savedInstanceState") == null) {
            fragment.f3670b.putBundle("savedInstanceState", new Bundle());
        }
        fragment.c = fragment.f3670b.getSparseParcelableArray("viewState");
        fragment.f3671d = fragment.f3670b.getBundle("viewRegistryState");
        m0 m0Var = (m0) fragment.f3670b.getParcelable("state");
        if (m0Var != null) {
            fragment.f3676i = m0Var.f3880l;
            fragment.f3677j = m0Var.f3881m;
            Boolean bool = fragment.f3672e;
            if (bool != null) {
                fragment.J = bool.booleanValue();
                fragment.f3672e = null;
            } else {
                fragment.J = m0Var.f3882n;
            }
        }
        if (!fragment.J) {
            fragment.I = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() {
        /*
            r7 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.g0.J(r0)
            androidx.fragment.app.Fragment r1 = r7.c
            if (r0 == 0) goto Lc
            java.util.Objects.toString(r1)
        Lc:
            androidx.fragment.app.Fragment$d r0 = r1.K
            r2 = 0
            if (r0 != 0) goto L13
            r0 = r2
            goto L15
        L13:
            android.view.View r0 = r0.f3709m
        L15:
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L4b
            android.view.View r5 = r1.H
            if (r0 != r5) goto L1e
            goto L28
        L1e:
            android.view.ViewParent r5 = r0.getParent()
        L22:
            if (r5 == 0) goto L2f
            android.view.View r6 = r1.H
            if (r5 != r6) goto L2a
        L28:
            r5 = r4
            goto L30
        L2a:
            android.view.ViewParent r5 = r5.getParent()
            goto L22
        L2f:
            r5 = r3
        L30:
            if (r5 == 0) goto L4b
            r0.requestFocus()
            r5 = 2
            boolean r5 = androidx.fragment.app.g0.J(r5)
            if (r5 == 0) goto L4b
            r0.toString()
            java.util.Objects.toString(r1)
            android.view.View r0 = r1.H
            android.view.View r0 = r0.findFocus()
            java.util.Objects.toString(r0)
        L4b:
            androidx.fragment.app.Fragment$d r0 = r1.o()
            r0.f3709m = r2
            androidx.fragment.app.h0 r0 = r1.f3688u
            r0.Q()
            androidx.fragment.app.h0 r0 = r1.f3688u
            r0.y(r4)
            r0 = 7
            r1.f3669a = r0
            r1.F = r3
            r1.W()
            boolean r4 = r1.F
            if (r4 == 0) goto L99
            androidx.lifecycle.q r4 = r1.P
            androidx.lifecycle.Lifecycle$Event r5 = androidx.lifecycle.Lifecycle.Event.ON_RESUME
            r4.f(r5)
            android.view.View r4 = r1.H
            if (r4 == 0) goto L79
            androidx.fragment.app.x0 r4 = r1.Q
            androidx.lifecycle.q r4 = r4.f3958e
            r4.f(r5)
        L79:
            androidx.fragment.app.h0 r4 = r1.f3688u
            r4.E = r3
            r4.F = r3
            androidx.fragment.app.j0 r5 = r4.L
            r5.f3837i = r3
            r4.t(r0)
            androidx.fragment.app.b0 r0 = r7.f3884a
            r0.i(r3)
            androidx.fragment.app.o0 r0 = r7.f3885b
            java.lang.String r3 = r1.f3673f
            r0.j(r2, r3)
            r1.f3670b = r2
            r1.c = r2
            r1.f3671d = r2
            return
        L99:
            androidx.fragment.app.SuperNotCalledException r0 = new androidx.fragment.app.SuperNotCalledException
            java.lang.String r2 = "Fragment "
            java.lang.String r3 = " did not call through to super.onResume()"
            java.lang.String r1 = androidx.activity.f.l(r2, r1, r3)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n0.n():void");
    }

    public final Bundle o() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.c;
        if (fragment.f3669a == -1 && (bundle = fragment.f3670b) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new m0(fragment));
        if (fragment.f3669a > -1) {
            Bundle bundle3 = new Bundle();
            fragment.X(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f3884a.j(false);
            Bundle bundle4 = new Bundle();
            fragment.T.c(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle X = fragment.f3688u.X();
            if (!X.isEmpty()) {
                bundle2.putBundle("childFragmentManager", X);
            }
            if (fragment.H != null) {
                p();
            }
            SparseArray<Parcelable> sparseArray = fragment.c;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = fragment.f3671d;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = fragment.f3674g;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void p() {
        Fragment fragment = this.c;
        if (fragment.H == null) {
            return;
        }
        if (g0.J(2)) {
            Objects.toString(fragment);
            Objects.toString(fragment.H);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        fragment.H.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            fragment.c = sparseArray;
        }
        Bundle bundle = new Bundle();
        fragment.Q.f3959f.c(bundle);
        if (!bundle.isEmpty()) {
            fragment.f3671d = bundle;
        }
    }

    public final void q() {
        boolean J = g0.J(3);
        Fragment fragment = this.c;
        if (J) {
            Objects.toString(fragment);
        }
        fragment.f3688u.Q();
        fragment.f3688u.y(true);
        fragment.f3669a = 5;
        fragment.F = false;
        fragment.Y();
        if (fragment.F) {
            androidx.lifecycle.q qVar = fragment.P;
            Lifecycle.Event event = Lifecycle.Event.ON_START;
            qVar.f(event);
            if (fragment.H != null) {
                fragment.Q.f3958e.f(event);
            }
            h0 h0Var = fragment.f3688u;
            h0Var.E = false;
            h0Var.F = false;
            h0Var.L.f3837i = false;
            h0Var.t(5);
            this.f3884a.k(false);
            return;
        }
        throw new SuperNotCalledException(androidx.activity.f.l("Fragment ", fragment, " did not call through to super.onStart()"));
    }

    public final void r() {
        boolean J = g0.J(3);
        Fragment fragment = this.c;
        if (J) {
            Objects.toString(fragment);
        }
        h0 h0Var = fragment.f3688u;
        h0Var.F = true;
        h0Var.L.f3837i = true;
        h0Var.t(4);
        if (fragment.H != null) {
            fragment.Q.a(Lifecycle.Event.ON_STOP);
        }
        fragment.P.f(Lifecycle.Event.ON_STOP);
        fragment.f3669a = 4;
        fragment.F = false;
        fragment.Z();
        if (fragment.F) {
            this.f3884a.l(false);
            return;
        }
        throw new SuperNotCalledException(androidx.activity.f.l("Fragment ", fragment, " did not call through to super.onStop()"));
    }

    public n0(b0 b0Var, o0 o0Var, ClassLoader classLoader, y yVar, Bundle bundle) {
        this.f3884a = b0Var;
        this.f3885b = o0Var;
        m0 m0Var = (m0) bundle.getParcelable("state");
        Fragment a10 = yVar.a(m0Var.f3870a);
        a10.f3673f = m0Var.f3871b;
        a10.f3681n = m0Var.c;
        a10.f3683p = true;
        a10.f3690w = m0Var.f3872d;
        a10.f3691x = m0Var.f3873e;
        a10.f3692y = m0Var.f3874f;
        a10.B = m0Var.f3875g;
        a10.f3680m = m0Var.f3876h;
        a10.A = m0Var.f3877i;
        a10.f3693z = m0Var.f3878j;
        a10.O = Lifecycle.State.values()[m0Var.f3879k];
        a10.f3676i = m0Var.f3880l;
        a10.f3677j = m0Var.f3881m;
        a10.J = m0Var.f3882n;
        this.c = a10;
        a10.f3670b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a10.j0(bundle2);
        if (g0.J(2)) {
            Objects.toString(a10);
        }
    }

    /* compiled from: FragmentStateManager.java */
    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f3888a;

        public a(View view) {
            this.f3888a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            View view2 = this.f3888a;
            view2.removeOnAttachStateChangeListener(this);
            WeakHashMap<View, x0.n0> weakHashMap = x0.f0.f31435a;
            f0.h.c(view2);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public n0(b0 b0Var, o0 o0Var, Fragment fragment, Bundle bundle) {
        this.f3884a = b0Var;
        this.f3885b = o0Var;
        this.c = fragment;
        fragment.c = null;
        fragment.f3671d = null;
        fragment.f3685r = 0;
        fragment.f3682o = false;
        fragment.f3679l = false;
        Fragment fragment2 = fragment.f3675h;
        fragment.f3676i = fragment2 != null ? fragment2.f3673f : null;
        fragment.f3675h = null;
        fragment.f3670b = bundle;
        fragment.f3674g = bundle.getBundle("arguments");
    }
}
