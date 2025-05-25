package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.g0;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetUserVisibleHintViolation;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.m0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.p, androidx.lifecycle.p0, androidx.lifecycle.j, z1.c {
    public static final Object X = new Object();
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean F;
    public ViewGroup G;
    public View H;
    public boolean I;
    public d K;
    public boolean L;
    public boolean M;
    public String N;
    public Lifecycle.State O;
    public androidx.lifecycle.q P;
    public x0 Q;
    public final androidx.lifecycle.w<androidx.lifecycle.p> R;
    public androidx.lifecycle.g0 S;
    public z1.b T;
    public final AtomicInteger U;
    public final ArrayList<e> V;
    public final b W;

    /* renamed from: b  reason: collision with root package name */
    public Bundle f3670b;
    public SparseArray<Parcelable> c;

    /* renamed from: d  reason: collision with root package name */
    public Bundle f3671d;

    /* renamed from: e  reason: collision with root package name */
    public Boolean f3672e;

    /* renamed from: g  reason: collision with root package name */
    public Bundle f3674g;

    /* renamed from: h  reason: collision with root package name */
    public Fragment f3675h;

    /* renamed from: j  reason: collision with root package name */
    public int f3677j;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3679l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3680m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f3681n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f3682o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f3683p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f3684q;

    /* renamed from: r  reason: collision with root package name */
    public int f3685r;

    /* renamed from: s  reason: collision with root package name */
    public g0 f3686s;

    /* renamed from: t  reason: collision with root package name */
    public z<?> f3687t;

    /* renamed from: v  reason: collision with root package name */
    public Fragment f3689v;

    /* renamed from: w  reason: collision with root package name */
    public int f3690w;

    /* renamed from: x  reason: collision with root package name */
    public int f3691x;

    /* renamed from: y  reason: collision with root package name */
    public String f3692y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f3693z;

    /* renamed from: a  reason: collision with root package name */
    public int f3669a = -1;

    /* renamed from: f  reason: collision with root package name */
    public String f3673f = UUID.randomUUID().toString();

    /* renamed from: i  reason: collision with root package name */
    public String f3676i = null;

    /* renamed from: k  reason: collision with root package name */
    public Boolean f3678k = null;

    /* renamed from: u  reason: collision with root package name */
    public h0 f3688u = new h0();
    public boolean E = true;
    public boolean J = true;

    /* loaded from: classes.dex */
    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Fragment fragment = Fragment.this;
            if (fragment.K != null) {
                fragment.o().getClass();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends e {
        public b() {
        }

        @Override // androidx.fragment.app.Fragment.e
        public final void a() {
            Bundle bundle;
            Fragment fragment = Fragment.this;
            fragment.T.a();
            SavedStateHandleSupport.b(fragment);
            Bundle bundle2 = fragment.f3670b;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("registryState");
            } else {
                bundle = null;
            }
            fragment.T.b(bundle);
        }
    }

    /* loaded from: classes.dex */
    public class c extends w {
        public c() {
        }

        @Override // androidx.fragment.app.w
        public final View F(int i10) {
            Fragment fragment = Fragment.this;
            View view = fragment.H;
            if (view != null) {
                return view.findViewById(i10);
            }
            throw new IllegalStateException(androidx.activity.f.l("Fragment ", fragment, " does not have a view"));
        }

        @Override // androidx.fragment.app.w
        public final boolean H() {
            if (Fragment.this.H != null) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3698a;

        /* renamed from: b  reason: collision with root package name */
        public int f3699b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f3700d;

        /* renamed from: e  reason: collision with root package name */
        public int f3701e;

        /* renamed from: f  reason: collision with root package name */
        public int f3702f;

        /* renamed from: g  reason: collision with root package name */
        public ArrayList<String> f3703g;

        /* renamed from: h  reason: collision with root package name */
        public ArrayList<String> f3704h;

        /* renamed from: i  reason: collision with root package name */
        public final Object f3705i;

        /* renamed from: j  reason: collision with root package name */
        public final Object f3706j;

        /* renamed from: k  reason: collision with root package name */
        public final Object f3707k;

        /* renamed from: l  reason: collision with root package name */
        public float f3708l;

        /* renamed from: m  reason: collision with root package name */
        public View f3709m;

        public d() {
            Object obj = Fragment.X;
            this.f3705i = obj;
            this.f3706j = obj;
            this.f3707k = obj;
            this.f3708l = 1.0f;
            this.f3709m = null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {
        public abstract void a();
    }

    public Fragment() {
        new a();
        this.O = Lifecycle.State.RESUMED;
        this.R = new androidx.lifecycle.w<>();
        this.U = new AtomicInteger();
        this.V = new ArrayList<>();
        this.W = new b();
        B();
    }

    public final x0 A() {
        x0 x0Var = this.Q;
        if (x0Var != null) {
            return x0Var;
        }
        throw new IllegalStateException(androidx.activity.f.l("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public final void B() {
        this.P = new androidx.lifecycle.q(this);
        this.T = new z1.b(this);
        this.S = null;
        ArrayList<e> arrayList = this.V;
        b bVar = this.W;
        if (!arrayList.contains(bVar)) {
            if (this.f3669a >= 0) {
                bVar.a();
            } else {
                arrayList.add(bVar);
            }
        }
    }

    public final void C() {
        B();
        this.N = this.f3673f;
        this.f3673f = UUID.randomUUID().toString();
        this.f3679l = false;
        this.f3680m = false;
        this.f3681n = false;
        this.f3682o = false;
        this.f3683p = false;
        this.f3685r = 0;
        this.f3686s = null;
        this.f3688u = new h0();
        this.f3687t = null;
        this.f3690w = 0;
        this.f3691x = 0;
        this.f3692y = null;
        this.f3693z = false;
        this.A = false;
    }

    public final boolean D() {
        if (this.f3687t != null && this.f3679l) {
            return true;
        }
        return false;
    }

    public final boolean E() {
        boolean E;
        if (!this.f3693z) {
            g0 g0Var = this.f3686s;
            if (g0Var == null) {
                return false;
            }
            Fragment fragment = this.f3689v;
            g0Var.getClass();
            if (fragment == null) {
                E = false;
            } else {
                E = fragment.E();
            }
            if (!E) {
                return false;
            }
        }
        return true;
    }

    public final boolean F() {
        if (this.f3685r > 0) {
            return true;
        }
        return false;
    }

    public final boolean G() {
        View view;
        if (D() && !E() && (view = this.H) != null && view.getWindowToken() != null && this.H.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Deprecated
    public void H(Bundle bundle) {
        this.F = true;
    }

    @Deprecated
    public void I(int i10, int i11, Intent intent) {
        if (g0.J(2)) {
            toString();
            Objects.toString(intent);
        }
    }

    @Deprecated
    public void K(Activity activity) {
        this.F = true;
    }

    public void L(Context context) {
        Activity activity;
        this.F = true;
        z<?> zVar = this.f3687t;
        if (zVar == null) {
            activity = null;
        } else {
            activity = zVar.f3961d;
        }
        if (activity != null) {
            this.F = false;
            K(activity);
        }
    }

    public void M(Bundle bundle) {
        boolean z10;
        Bundle bundle2;
        this.F = true;
        Bundle bundle3 = this.f3670b;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.f3688u.W(bundle2);
            h0 h0Var = this.f3688u;
            h0Var.E = false;
            h0Var.F = false;
            h0Var.L.f3837i = false;
            h0Var.t(1);
        }
        h0 h0Var2 = this.f3688u;
        if (h0Var2.f3793s >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            h0Var2.E = false;
            h0Var2.F = false;
            h0Var2.L.f3837i = false;
            h0Var2.t(1);
        }
    }

    public View N(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void O() {
        this.F = true;
    }

    public void P() {
        this.F = true;
    }

    public void Q() {
        this.F = true;
    }

    public LayoutInflater R(Bundle bundle) {
        z<?> zVar = this.f3687t;
        if (zVar != null) {
            LayoutInflater L = zVar.L();
            L.setFactory2(this.f3688u.f3780f);
            return L;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void T() {
        this.F = true;
    }

    public void W() {
        this.F = true;
    }

    public void Y() {
        this.F = true;
    }

    public void Z() {
        this.F = true;
    }

    public void c0(Bundle bundle) {
        this.F = true;
    }

    public final boolean d0() {
        if (!this.f3693z) {
            return this.f3688u.i();
        }
        return false;
    }

    public void e0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f3688u.Q();
        boolean z10 = true;
        this.f3684q = true;
        this.Q = new x0(this, getViewModelStore(), new androidx.activity.b(this, 4));
        View N = N(layoutInflater, viewGroup, bundle);
        this.H = N;
        if (N != null) {
            this.Q.b();
            if (g0.J(3)) {
                Objects.toString(this.H);
                toString();
            }
            pdf.pdfreader.viewer.editor.free.utils.t0.q0(this.H, this.Q);
            View view = this.H;
            x0 x0Var = this.Q;
            kotlin.jvm.internal.g.e(view, "<this>");
            view.setTag(R.id.view_tree_view_model_store_owner, x0Var);
            pdf.pdfreader.viewer.editor.free.utils.t0.r0(this.H, this.Q);
            this.R.j(this.Q);
            return;
        }
        if (this.Q.f3958e == null) {
            z10 = false;
        }
        if (!z10) {
            this.Q = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final u f0() {
        u i10 = i();
        if (i10 != null) {
            return i10;
        }
        throw new IllegalStateException(androidx.activity.f.l("Fragment ", this, " not attached to an activity."));
    }

    public final Context g0() {
        Context r4 = r();
        if (r4 != null) {
            return r4;
        }
        throw new IllegalStateException(androidx.activity.f.l("Fragment ", this, " not attached to a context."));
    }

    @Override // androidx.lifecycle.j
    public final n1.a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = g0().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        if (application == null && g0.J(3)) {
            Objects.toString(g0().getApplicationContext());
        }
        n1.c cVar = new n1.c();
        LinkedHashMap linkedHashMap = cVar.f22313a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.l0.f4062a, application);
        }
        linkedHashMap.put(SavedStateHandleSupport.f4016a, this);
        linkedHashMap.put(SavedStateHandleSupport.f4017b, this);
        Bundle bundle = this.f3674g;
        if (bundle != null) {
            linkedHashMap.put(SavedStateHandleSupport.c, bundle);
        }
        return cVar;
    }

    @Override // androidx.lifecycle.j
    public final m0.b getDefaultViewModelProviderFactory() {
        Application application;
        if (this.f3686s != null) {
            if (this.S == null) {
                Context applicationContext = g0().getApplicationContext();
                while (true) {
                    if (applicationContext instanceof ContextWrapper) {
                        if (applicationContext instanceof Application) {
                            application = (Application) applicationContext;
                            break;
                        }
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    } else {
                        application = null;
                        break;
                    }
                }
                if (application == null && g0.J(3)) {
                    Objects.toString(g0().getApplicationContext());
                }
                this.S = new androidx.lifecycle.g0(application, this, this.f3674g);
            }
            return this.S;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // androidx.lifecycle.p
    public final Lifecycle getLifecycle() {
        return this.P;
    }

    @Override // z1.c
    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.T.f32217b;
    }

    @Override // androidx.lifecycle.p0
    public final androidx.lifecycle.o0 getViewModelStore() {
        if (this.f3686s != null) {
            if (s() != Lifecycle.State.INITIALIZED.ordinal()) {
                HashMap<String, androidx.lifecycle.o0> hashMap = this.f3686s.L.f3834f;
                androidx.lifecycle.o0 o0Var = hashMap.get(this.f3673f);
                if (o0Var == null) {
                    androidx.lifecycle.o0 o0Var2 = new androidx.lifecycle.o0();
                    hashMap.put(this.f3673f, o0Var2);
                    return o0Var2;
                }
                return o0Var;
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final View h0() {
        View view = this.H;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(androidx.activity.f.l("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final void i0(int i10, int i11, int i12, int i13) {
        if (this.K == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        o().f3699b = i10;
        o().c = i11;
        o().f3700d = i12;
        o().f3701e = i13;
    }

    public final void j0(Bundle bundle) {
        boolean O;
        g0 g0Var = this.f3686s;
        if (g0Var != null) {
            if (g0Var == null) {
                O = false;
            } else {
                O = g0Var.O();
            }
            if (O) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f3674g = bundle;
    }

    @Deprecated
    public final void k0(boolean z10) {
        if (this.D != z10) {
            this.D = z10;
            if (D() && !E()) {
                this.f3687t.M();
            }
        }
    }

    public final void l0(boolean z10) {
        if (this.E != z10) {
            this.E = z10;
            if (this.D && D() && !E()) {
                this.f3687t.M();
            }
        }
    }

    public w m() {
        return new c();
    }

    @Deprecated
    public void m0(boolean z10) {
        FragmentStrictMode.a aVar = FragmentStrictMode.f3929a;
        SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(this, z10);
        FragmentStrictMode.c(setUserVisibleHintViolation);
        FragmentStrictMode.a a10 = FragmentStrictMode.a(this);
        if (a10.f3931a.contains(FragmentStrictMode.Flag.DETECT_SET_USER_VISIBLE_HINT) && FragmentStrictMode.e(a10, getClass(), SetUserVisibleHintViolation.class)) {
            FragmentStrictMode.b(a10, setUserVisibleHintViolation);
        }
        boolean z11 = true;
        if (!this.J && z10 && this.f3669a < 5 && this.f3686s != null && D() && this.M) {
            g0 g0Var = this.f3686s;
            n0 f10 = g0Var.f(this);
            Fragment fragment = f10.c;
            if (fragment.I) {
                if (g0Var.f3777b) {
                    g0Var.H = true;
                } else {
                    fragment.I = false;
                    f10.k();
                }
            }
        }
        this.J = z10;
        if (this.f3669a >= 5 || z10) {
            z11 = false;
        }
        this.I = z11;
        if (this.f3670b != null) {
            this.f3672e = Boolean.valueOf(z10);
        }
    }

    public void n(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f3690w));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f3691x));
        printWriter.print(" mTag=");
        printWriter.println(this.f3692y);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f3669a);
        printWriter.print(" mWho=");
        printWriter.print(this.f3673f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f3685r);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f3679l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f3680m);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f3681n);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f3682o);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f3693z);
        printWriter.print(" mDetached=");
        printWriter.print(this.A);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.E);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.D);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.B);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.J);
        if (this.f3686s != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f3686s);
        }
        if (this.f3687t != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f3687t);
        }
        if (this.f3689v != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f3689v);
        }
        if (this.f3674g != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f3674g);
        }
        if (this.f3670b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f3670b);
        }
        if (this.c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.c);
        }
        if (this.f3671d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f3671d);
        }
        int i17 = 0;
        Fragment z11 = z(false);
        if (z11 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(z11);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f3677j);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        d dVar = this.K;
        if (dVar == null) {
            z10 = false;
        } else {
            z10 = dVar.f3698a;
        }
        printWriter.println(z10);
        d dVar2 = this.K;
        if (dVar2 == null) {
            i10 = 0;
        } else {
            i10 = dVar2.f3699b;
        }
        if (i10 != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            d dVar3 = this.K;
            if (dVar3 == null) {
                i16 = 0;
            } else {
                i16 = dVar3.f3699b;
            }
            printWriter.println(i16);
        }
        d dVar4 = this.K;
        if (dVar4 == null) {
            i11 = 0;
        } else {
            i11 = dVar4.c;
        }
        if (i11 != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            d dVar5 = this.K;
            if (dVar5 == null) {
                i15 = 0;
            } else {
                i15 = dVar5.c;
            }
            printWriter.println(i15);
        }
        d dVar6 = this.K;
        if (dVar6 == null) {
            i12 = 0;
        } else {
            i12 = dVar6.f3700d;
        }
        if (i12 != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            d dVar7 = this.K;
            if (dVar7 == null) {
                i14 = 0;
            } else {
                i14 = dVar7.f3700d;
            }
            printWriter.println(i14);
        }
        d dVar8 = this.K;
        if (dVar8 == null) {
            i13 = 0;
        } else {
            i13 = dVar8.f3701e;
        }
        if (i13 != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            d dVar9 = this.K;
            if (dVar9 != null) {
                i17 = dVar9.f3701e;
            }
            printWriter.println(i17);
        }
        if (this.G != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.G);
        }
        if (this.H != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.H);
        }
        if (r() != null) {
            o1.a.a(this).b(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f3688u + ":");
        this.f3688u.v(a6.h.c(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final void n0(Intent intent) {
        z<?> zVar = this.f3687t;
        if (zVar != null) {
            androidx.core.content.a.startActivity(zVar.f3962e, intent, null);
            return;
        }
        throw new IllegalStateException(androidx.activity.f.l("Fragment ", this, " not attached to Activity"));
    }

    public final d o() {
        if (this.K == null) {
            this.K = new d();
        }
        return this.K;
    }

    @Deprecated
    public final void o0(Intent intent, int i10, Bundle bundle) {
        if (this.f3687t != null) {
            g0 u7 = u();
            if (u7.f3800z != null) {
                u7.C.addLast(new g0.l(this.f3673f, i10));
                if (bundle != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                }
                u7.f3800z.a(intent);
                return;
            }
            z<?> zVar = u7.f3794t;
            if (i10 == -1) {
                androidx.core.content.a.startActivity(zVar.f3962e, intent, bundle);
                return;
            } else {
                zVar.getClass();
                throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
            }
        }
        throw new IllegalStateException(androidx.activity.f.l("Fragment ", this, " not attached to Activity"));
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.F = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        f0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.F = true;
    }

    /* renamed from: p */
    public final u i() {
        z<?> zVar = this.f3687t;
        if (zVar == null) {
            return null;
        }
        return (u) zVar.f3961d;
    }

    public final g0 q() {
        if (this.f3687t != null) {
            return this.f3688u;
        }
        throw new IllegalStateException(androidx.activity.f.l("Fragment ", this, " has not been attached yet."));
    }

    public final Context r() {
        z<?> zVar = this.f3687t;
        if (zVar == null) {
            return null;
        }
        return zVar.f3962e;
    }

    public final int s() {
        Lifecycle.State state = this.O;
        if (state != Lifecycle.State.INITIALIZED && this.f3689v != null) {
            return Math.min(state.ordinal(), this.f3689v.s());
        }
        return state.ordinal();
    }

    @Deprecated
    public final void startActivityForResult(Intent intent, int i10) {
        o0(intent, i10, null);
    }

    public pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f t() {
        return (pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f) i();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} (");
        sb2.append(this.f3673f);
        if (this.f3690w != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f3690w));
        }
        if (this.f3692y != null) {
            sb2.append(" tag=");
            sb2.append(this.f3692y);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public final g0 u() {
        g0 g0Var = this.f3686s;
        if (g0Var != null) {
            return g0Var;
        }
        throw new IllegalStateException(androidx.activity.f.l("Fragment ", this, " not associated with a fragment manager."));
    }

    public final Resources v() {
        return g0().getResources();
    }

    public final String x(int i10) {
        return v().getString(i10);
    }

    public final String y(int i10, Object... objArr) {
        return v().getString(i10, objArr);
    }

    public final Fragment z(boolean z10) {
        String str;
        if (z10) {
            FragmentStrictMode.a aVar = FragmentStrictMode.f3929a;
            GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(this);
            FragmentStrictMode.c(getTargetFragmentUsageViolation);
            FragmentStrictMode.a a10 = FragmentStrictMode.a(this);
            if (a10.f3931a.contains(FragmentStrictMode.Flag.DETECT_TARGET_FRAGMENT_USAGE) && FragmentStrictMode.e(a10, getClass(), GetTargetFragmentUsageViolation.class)) {
                FragmentStrictMode.b(a10, getTargetFragmentUsageViolation);
            }
        }
        Fragment fragment = this.f3675h;
        if (fragment != null) {
            return fragment;
        }
        g0 g0Var = this.f3686s;
        if (g0Var != null && (str = this.f3676i) != null) {
            return g0Var.B(str);
        }
        return null;
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    /* loaded from: classes.dex */
    public static class f implements Parcelable {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public final Bundle f3710a;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<f> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new f(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new f[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }
        }

        public f(Bundle bundle) {
            this.f3710a = bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeBundle(this.f3710a);
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f3710a = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }
    }

    @Deprecated
    public void U() {
    }

    public void S(boolean z10) {
    }

    public void X(Bundle bundle) {
    }

    public void b0(View view, Bundle bundle) {
    }
}
