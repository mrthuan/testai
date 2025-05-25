package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p0;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: FragmentManager.java */
/* loaded from: classes.dex */
public abstract class g0 {
    public androidx.activity.result.e A;
    public androidx.activity.result.e B;
    public ArrayDeque<l> C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ArrayList<androidx.fragment.app.a> I;
    public ArrayList<Boolean> J;
    public ArrayList<Fragment> K;
    public j0 L;
    public final f M;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3777b;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<androidx.fragment.app.a> f3778d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<Fragment> f3779e;

    /* renamed from: g  reason: collision with root package name */
    public OnBackPressedDispatcher f3781g;

    /* renamed from: l  reason: collision with root package name */
    public final b0 f3786l;

    /* renamed from: m  reason: collision with root package name */
    public final CopyOnWriteArrayList<k0> f3787m;

    /* renamed from: n  reason: collision with root package name */
    public final c0 f3788n;

    /* renamed from: o  reason: collision with root package name */
    public final d0 f3789o;

    /* renamed from: p  reason: collision with root package name */
    public final e0 f3790p;

    /* renamed from: q  reason: collision with root package name */
    public final f0 f3791q;

    /* renamed from: r  reason: collision with root package name */
    public final c f3792r;

    /* renamed from: s  reason: collision with root package name */
    public int f3793s;

    /* renamed from: t  reason: collision with root package name */
    public z<?> f3794t;

    /* renamed from: u  reason: collision with root package name */
    public w f3795u;

    /* renamed from: v  reason: collision with root package name */
    public Fragment f3796v;

    /* renamed from: w  reason: collision with root package name */
    public Fragment f3797w;

    /* renamed from: x  reason: collision with root package name */
    public final d f3798x;

    /* renamed from: y  reason: collision with root package name */
    public final e f3799y;

    /* renamed from: z  reason: collision with root package name */
    public androidx.activity.result.e f3800z;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<m> f3776a = new ArrayList<>();
    public final o0 c = new o0(0);

    /* renamed from: f  reason: collision with root package name */
    public final a0 f3780f = new a0(this);

    /* renamed from: h  reason: collision with root package name */
    public final b f3782h = new b();

    /* renamed from: i  reason: collision with root package name */
    public final AtomicInteger f3783i = new AtomicInteger();

    /* renamed from: j  reason: collision with root package name */
    public final Map<String, androidx.fragment.app.c> f3784j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k  reason: collision with root package name */
    public final Map<String, Bundle> f3785k = Collections.synchronizedMap(new HashMap());

    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    public class a implements androidx.activity.result.b<Map<String, Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g0 f3801a;

        public a(h0 h0Var) {
            this.f3801a = h0Var;
        }

        @Override // androidx.activity.result.b
        @SuppressLint({"SyntheticAccessor"})
        public final void c(Map<String, Boolean> map) {
            int i10;
            Map<String, Boolean> map2 = map;
            String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map2.values());
            int[] iArr = new int[arrayList.size()];
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((Boolean) arrayList.get(i11)).booleanValue()) {
                    i10 = 0;
                } else {
                    i10 = -1;
                }
                iArr[i11] = i10;
            }
            g0 g0Var = this.f3801a;
            l pollFirst = g0Var.C.pollFirst();
            if (pollFirst != null) {
                g0Var.c.d(pollFirst.f3809a);
            }
        }
    }

    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    public class b extends androidx.activity.n {
        public b() {
            super(false);
        }

        @Override // androidx.activity.n
        public final void a() {
            g0 g0Var = g0.this;
            g0Var.y(true);
            if (g0Var.f3782h.f1820a) {
                g0Var.R();
            } else {
                g0Var.f3781g.c();
            }
        }
    }

    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    public class c implements x0.n {
        public c() {
        }

        @Override // x0.n
        public final boolean a(MenuItem menuItem) {
            return g0.this.o();
        }

        @Override // x0.n
        public final void b(Menu menu) {
            g0.this.p();
        }

        @Override // x0.n
        public final void c(Menu menu, MenuInflater menuInflater) {
            g0.this.j();
        }

        @Override // x0.n
        public final void d(Menu menu) {
            g0.this.s(menu);
        }
    }

    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    public class d extends y {
        public d() {
        }

        @Override // androidx.fragment.app.y
        public final Fragment a(String str) {
            Context context = g0.this.f3794t.f3962e;
            Object obj = Fragment.X;
            try {
                return y.c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException e10) {
                throw new Fragment.InstantiationException(a6.h.d("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
            } catch (InstantiationException e11) {
                throw new Fragment.InstantiationException(a6.h.d("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e11);
            } catch (NoSuchMethodException e12) {
                throw new Fragment.InstantiationException(a6.h.d("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e12);
            } catch (InvocationTargetException e13) {
                throw new Fragment.InstantiationException(a6.h.d("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e13);
            }
        }
    }

    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    public class e implements b1 {
    }

    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            g0.this.y(true);
        }
    }

    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    public class g implements k0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Fragment f3806a;

        public g(Fragment fragment) {
            this.f3806a = fragment;
        }

        @Override // androidx.fragment.app.k0
        public final void u(Fragment fragment) {
            this.f3806a.getClass();
        }
    }

    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    public class h implements androidx.activity.result.b<androidx.activity.result.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g0 f3807a;

        public h(h0 h0Var) {
            this.f3807a = h0Var;
        }

        @Override // androidx.activity.result.b
        public final void c(androidx.activity.result.a aVar) {
            Fragment d10;
            androidx.activity.result.a aVar2 = aVar;
            g0 g0Var = this.f3807a;
            l pollLast = g0Var.C.pollLast();
            if (pollLast != null && (d10 = g0Var.c.d(pollLast.f3809a)) != null) {
                d10.I(pollLast.f3810b, aVar2.f1828a, aVar2.f1829b);
            }
        }
    }

    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    public class i implements androidx.activity.result.b<androidx.activity.result.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g0 f3808a;

        public i(h0 h0Var) {
            this.f3808a = h0Var;
        }

        @Override // androidx.activity.result.b
        public final void c(androidx.activity.result.a aVar) {
            Fragment d10;
            androidx.activity.result.a aVar2 = aVar;
            g0 g0Var = this.f3808a;
            l pollFirst = g0Var.C.pollFirst();
            if (pollFirst != null && (d10 = g0Var.c.d(pollFirst.f3809a)) != null) {
                d10.I(pollFirst.f3810b, aVar2.f1828a, aVar2.f1829b);
            }
        }
    }

    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    public static class j extends j.a<androidx.activity.result.h, androidx.activity.result.a> {
        @Override // j.a
        public final Intent a(ComponentActivity componentActivity, Object obj) {
            Bundle bundleExtra;
            androidx.activity.result.h hVar = (androidx.activity.result.h) obj;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = hVar.f1846b;
            if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    IntentSender intentSender = hVar.f1845a;
                    kotlin.jvm.internal.g.e(intentSender, "intentSender");
                    hVar = new androidx.activity.result.h(intentSender, null, hVar.c, hVar.f1847d);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", hVar);
            if (g0.J(2)) {
                intent.toString();
            }
            return intent;
        }

        @Override // j.a
        public final androidx.activity.result.a c(int i10, Intent intent) {
            return new androidx.activity.result.a(i10, intent);
        }
    }

    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    public static abstract class k {
    }

    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    public interface m {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    public class n implements m {

        /* renamed from: a  reason: collision with root package name */
        public final int f3811a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3812b = 1;

        public n(int i10) {
            this.f3811a = i10;
        }

        @Override // androidx.fragment.app.g0.m
        public final boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            g0 g0Var = g0.this;
            Fragment fragment = g0Var.f3797w;
            int i10 = this.f3811a;
            if (fragment != null && i10 < 0 && fragment.q().R()) {
                return false;
            }
            return g0Var.T(arrayList, arrayList2, i10, this.f3812b);
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.fragment.app.c0] */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.fragment.app.d0] */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.fragment.app.e0] */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.fragment.app.f0] */
    public g0() {
        Collections.synchronizedMap(new HashMap());
        this.f3786l = new b0(this);
        this.f3787m = new CopyOnWriteArrayList<>();
        this.f3788n = new w0.a() { // from class: androidx.fragment.app.c0
            @Override // w0.a
            public final void accept(Object obj) {
                Configuration configuration = (Configuration) obj;
                g0 g0Var = g0.this;
                if (g0Var.L()) {
                    g0Var.h(false, configuration);
                }
            }
        };
        this.f3789o = new w0.a() { // from class: androidx.fragment.app.d0
            @Override // w0.a
            public final void accept(Object obj) {
                Integer num = (Integer) obj;
                g0 g0Var = g0.this;
                if (g0Var.L() && num.intValue() == 80) {
                    g0Var.l(false);
                }
            }
        };
        this.f3790p = new w0.a() { // from class: androidx.fragment.app.e0
            @Override // w0.a
            public final void accept(Object obj) {
                k0.k kVar = (k0.k) obj;
                g0 g0Var = g0.this;
                if (g0Var.L()) {
                    g0Var.m(kVar.f19478a, false);
                }
            }
        };
        this.f3791q = new w0.a() { // from class: androidx.fragment.app.f0
            @Override // w0.a
            public final void accept(Object obj) {
                k0.y yVar = (k0.y) obj;
                g0 g0Var = g0.this;
                if (g0Var.L()) {
                    g0Var.r(yVar.f19553a, false);
                }
            }
        };
        this.f3792r = new c();
        this.f3793s = -1;
        this.f3798x = new d();
        this.f3799y = new e();
        this.C = new ArrayDeque<>();
        this.M = new f();
    }

    public static boolean J(int i10) {
        if (Log.isLoggable("FragmentManager", i10)) {
            return true;
        }
        return false;
    }

    public static boolean K(Fragment fragment) {
        boolean z10;
        if (fragment.D && fragment.E) {
            return true;
        }
        Iterator it = fragment.f3688u.c.f().iterator();
        boolean z11 = false;
        while (true) {
            if (it.hasNext()) {
                Fragment fragment2 = (Fragment) it.next();
                if (fragment2 != null) {
                    z11 = K(fragment2);
                    continue;
                }
                if (z11) {
                    z10 = true;
                    break;
                }
            } else {
                z10 = false;
                break;
            }
        }
        if (z10) {
            return true;
        }
        return false;
    }

    public static boolean M(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        if (fragment.E && (fragment.f3686s == null || M(fragment.f3689v))) {
            return true;
        }
        return false;
    }

    public static boolean N(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        g0 g0Var = fragment.f3686s;
        if (fragment.equals(g0Var.f3797w) && N(g0Var.f3796v)) {
            return true;
        }
        return false;
    }

    public final void A(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        ViewGroup viewGroup;
        o0 o0Var;
        o0 o0Var2;
        o0 o0Var3;
        int i12;
        int i13;
        int i14;
        ArrayList<androidx.fragment.app.a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        boolean z10 = arrayList3.get(i10).f3911o;
        ArrayList<Fragment> arrayList5 = this.K;
        if (arrayList5 == null) {
            this.K = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        ArrayList<Fragment> arrayList6 = this.K;
        o0 o0Var4 = this.c;
        arrayList6.addAll(o0Var4.g());
        Fragment fragment = this.f3797w;
        int i15 = i10;
        boolean z11 = false;
        while (true) {
            int i16 = 1;
            if (i15 < i11) {
                androidx.fragment.app.a aVar = arrayList3.get(i15);
                if (!arrayList4.get(i15).booleanValue()) {
                    ArrayList<Fragment> arrayList7 = this.K;
                    int i17 = 0;
                    while (true) {
                        ArrayList<p0.a> arrayList8 = aVar.f3898a;
                        if (i17 < arrayList8.size()) {
                            p0.a aVar2 = arrayList8.get(i17);
                            int i18 = aVar2.f3912a;
                            if (i18 != i16) {
                                if (i18 != 2) {
                                    if (i18 != 3 && i18 != 6) {
                                        if (i18 != 7) {
                                            if (i18 == 8) {
                                                arrayList8.add(i17, new p0.a(9, fragment, 0));
                                                aVar2.c = true;
                                                i17++;
                                                fragment = aVar2.f3913b;
                                            }
                                        } else {
                                            o0Var3 = o0Var4;
                                            i12 = 1;
                                        }
                                    } else {
                                        arrayList7.remove(aVar2.f3913b);
                                        Fragment fragment2 = aVar2.f3913b;
                                        if (fragment2 == fragment) {
                                            arrayList8.add(i17, new p0.a(9, fragment2));
                                            i17++;
                                            o0Var3 = o0Var4;
                                            i12 = 1;
                                            fragment = null;
                                        }
                                    }
                                    o0Var3 = o0Var4;
                                    i12 = 1;
                                } else {
                                    Fragment fragment3 = aVar2.f3913b;
                                    int i19 = fragment3.f3691x;
                                    int size = arrayList7.size() - 1;
                                    boolean z12 = false;
                                    while (size >= 0) {
                                        o0 o0Var5 = o0Var4;
                                        Fragment fragment4 = arrayList7.get(size);
                                        if (fragment4.f3691x == i19) {
                                            if (fragment4 == fragment3) {
                                                i13 = i19;
                                                z12 = true;
                                            } else {
                                                if (fragment4 == fragment) {
                                                    i13 = i19;
                                                    i14 = 0;
                                                    arrayList8.add(i17, new p0.a(9, fragment4, 0));
                                                    i17++;
                                                    fragment = null;
                                                } else {
                                                    i13 = i19;
                                                    i14 = 0;
                                                }
                                                p0.a aVar3 = new p0.a(3, fragment4, i14);
                                                aVar3.f3914d = aVar2.f3914d;
                                                aVar3.f3916f = aVar2.f3916f;
                                                aVar3.f3915e = aVar2.f3915e;
                                                aVar3.f3917g = aVar2.f3917g;
                                                arrayList8.add(i17, aVar3);
                                                arrayList7.remove(fragment4);
                                                i17++;
                                                fragment = fragment;
                                            }
                                        } else {
                                            i13 = i19;
                                        }
                                        size--;
                                        i19 = i13;
                                        o0Var4 = o0Var5;
                                    }
                                    o0Var3 = o0Var4;
                                    i12 = 1;
                                    if (z12) {
                                        arrayList8.remove(i17);
                                        i17--;
                                    } else {
                                        aVar2.f3912a = 1;
                                        aVar2.c = true;
                                        arrayList7.add(fragment3);
                                    }
                                }
                                i17 += i12;
                                i16 = i12;
                                o0Var4 = o0Var3;
                            } else {
                                o0Var3 = o0Var4;
                                i12 = i16;
                            }
                            arrayList7.add(aVar2.f3913b);
                            i17 += i12;
                            i16 = i12;
                            o0Var4 = o0Var3;
                        } else {
                            o0Var2 = o0Var4;
                        }
                    }
                } else {
                    o0Var2 = o0Var4;
                    int i20 = 1;
                    ArrayList<Fragment> arrayList9 = this.K;
                    ArrayList<p0.a> arrayList10 = aVar.f3898a;
                    int size2 = arrayList10.size() - 1;
                    while (size2 >= 0) {
                        p0.a aVar4 = arrayList10.get(size2);
                        int i21 = aVar4.f3912a;
                        if (i21 != i20) {
                            if (i21 != 3) {
                                switch (i21) {
                                    case 8:
                                        fragment = null;
                                        break;
                                    case 9:
                                        fragment = aVar4.f3913b;
                                        break;
                                    case 10:
                                        aVar4.f3919i = aVar4.f3918h;
                                        break;
                                }
                                size2--;
                                i20 = 1;
                            }
                            arrayList9.add(aVar4.f3913b);
                            size2--;
                            i20 = 1;
                        }
                        arrayList9.remove(aVar4.f3913b);
                        size2--;
                        i20 = 1;
                    }
                }
                if (!z11 && !aVar.f3903g) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                i15++;
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
                o0Var4 = o0Var2;
            } else {
                o0 o0Var6 = o0Var4;
                this.K.clear();
                if (!z10 && this.f3793s >= 1) {
                    for (int i22 = i10; i22 < i11; i22++) {
                        Iterator<p0.a> it = arrayList.get(i22).f3898a.iterator();
                        while (it.hasNext()) {
                            Fragment fragment5 = it.next().f3913b;
                            if (fragment5 != null && fragment5.f3686s != null) {
                                o0Var = o0Var6;
                                o0Var.h(f(fragment5));
                            } else {
                                o0Var = o0Var6;
                            }
                            o0Var6 = o0Var;
                        }
                    }
                }
                for (int i23 = i10; i23 < i11; i23++) {
                    androidx.fragment.app.a aVar5 = arrayList.get(i23);
                    if (arrayList2.get(i23).booleanValue()) {
                        aVar5.f(-1);
                        ArrayList<p0.a> arrayList11 = aVar5.f3898a;
                        for (int size3 = arrayList11.size() - 1; size3 >= 0; size3--) {
                            p0.a aVar6 = arrayList11.get(size3);
                            Fragment fragment6 = aVar6.f3913b;
                            if (fragment6 != null) {
                                if (fragment6.K != null) {
                                    fragment6.o().f3698a = true;
                                }
                                int i24 = aVar5.f3902f;
                                int i25 = 8194;
                                int i26 = 4097;
                                if (i24 != 4097) {
                                    if (i24 != 8194) {
                                        i25 = 8197;
                                        i26 = 4100;
                                        if (i24 != 8197) {
                                            if (i24 != 4099) {
                                                if (i24 != 4100) {
                                                    i25 = 0;
                                                }
                                            } else {
                                                i25 = 4099;
                                            }
                                        }
                                    }
                                    i25 = i26;
                                }
                                if (fragment6.K != null || i25 != 0) {
                                    fragment6.o();
                                    fragment6.K.f3702f = i25;
                                }
                                ArrayList<String> arrayList12 = aVar5.f3910n;
                                ArrayList<String> arrayList13 = aVar5.f3909m;
                                fragment6.o();
                                Fragment.d dVar = fragment6.K;
                                dVar.f3703g = arrayList12;
                                dVar.f3704h = arrayList13;
                            }
                            int i27 = aVar6.f3912a;
                            g0 g0Var = aVar5.f3733p;
                            switch (i27) {
                                case 1:
                                    fragment6.i0(aVar6.f3914d, aVar6.f3915e, aVar6.f3916f, aVar6.f3917g);
                                    g0Var.Z(fragment6, true);
                                    g0Var.U(fragment6);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + aVar6.f3912a);
                                case 3:
                                    fragment6.i0(aVar6.f3914d, aVar6.f3915e, aVar6.f3916f, aVar6.f3917g);
                                    g0Var.a(fragment6);
                                    break;
                                case 4:
                                    fragment6.i0(aVar6.f3914d, aVar6.f3915e, aVar6.f3916f, aVar6.f3917g);
                                    g0Var.getClass();
                                    if (J(2)) {
                                        Objects.toString(fragment6);
                                    }
                                    if (fragment6.f3693z) {
                                        fragment6.f3693z = false;
                                        fragment6.L = !fragment6.L;
                                        break;
                                    } else {
                                        break;
                                    }
                                case 5:
                                    fragment6.i0(aVar6.f3914d, aVar6.f3915e, aVar6.f3916f, aVar6.f3917g);
                                    g0Var.Z(fragment6, true);
                                    if (J(2)) {
                                        Objects.toString(fragment6);
                                    }
                                    if (fragment6.f3693z) {
                                        break;
                                    } else {
                                        fragment6.f3693z = true;
                                        fragment6.L = !fragment6.L;
                                        g0Var.c0(fragment6);
                                        break;
                                    }
                                case 6:
                                    fragment6.i0(aVar6.f3914d, aVar6.f3915e, aVar6.f3916f, aVar6.f3917g);
                                    g0Var.c(fragment6);
                                    break;
                                case 7:
                                    fragment6.i0(aVar6.f3914d, aVar6.f3915e, aVar6.f3916f, aVar6.f3917g);
                                    g0Var.Z(fragment6, true);
                                    g0Var.g(fragment6);
                                    break;
                                case 8:
                                    g0Var.b0(null);
                                    break;
                                case 9:
                                    g0Var.b0(fragment6);
                                    break;
                                case 10:
                                    g0Var.a0(fragment6, aVar6.f3918h);
                                    break;
                            }
                        }
                        continue;
                    } else {
                        aVar5.f(1);
                        ArrayList<p0.a> arrayList14 = aVar5.f3898a;
                        int size4 = arrayList14.size();
                        for (int i28 = 0; i28 < size4; i28++) {
                            p0.a aVar7 = arrayList14.get(i28);
                            Fragment fragment7 = aVar7.f3913b;
                            if (fragment7 != null) {
                                if (fragment7.K != null) {
                                    fragment7.o().f3698a = false;
                                }
                                int i29 = aVar5.f3902f;
                                if (fragment7.K != null || i29 != 0) {
                                    fragment7.o();
                                    fragment7.K.f3702f = i29;
                                }
                                ArrayList<String> arrayList15 = aVar5.f3909m;
                                ArrayList<String> arrayList16 = aVar5.f3910n;
                                fragment7.o();
                                Fragment.d dVar2 = fragment7.K;
                                dVar2.f3703g = arrayList15;
                                dVar2.f3704h = arrayList16;
                            }
                            int i30 = aVar7.f3912a;
                            g0 g0Var2 = aVar5.f3733p;
                            switch (i30) {
                                case 1:
                                    fragment7.i0(aVar7.f3914d, aVar7.f3915e, aVar7.f3916f, aVar7.f3917g);
                                    g0Var2.Z(fragment7, false);
                                    g0Var2.a(fragment7);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + aVar7.f3912a);
                                case 3:
                                    fragment7.i0(aVar7.f3914d, aVar7.f3915e, aVar7.f3916f, aVar7.f3917g);
                                    g0Var2.U(fragment7);
                                    break;
                                case 4:
                                    fragment7.i0(aVar7.f3914d, aVar7.f3915e, aVar7.f3916f, aVar7.f3917g);
                                    g0Var2.getClass();
                                    if (J(2)) {
                                        Objects.toString(fragment7);
                                    }
                                    if (!fragment7.f3693z) {
                                        fragment7.f3693z = true;
                                        fragment7.L = !fragment7.L;
                                        g0Var2.c0(fragment7);
                                    }
                                    break;
                                case 5:
                                    fragment7.i0(aVar7.f3914d, aVar7.f3915e, aVar7.f3916f, aVar7.f3917g);
                                    g0Var2.Z(fragment7, false);
                                    if (J(2)) {
                                        Objects.toString(fragment7);
                                    }
                                    if (fragment7.f3693z) {
                                        fragment7.f3693z = false;
                                        fragment7.L = !fragment7.L;
                                    }
                                    break;
                                case 6:
                                    fragment7.i0(aVar7.f3914d, aVar7.f3915e, aVar7.f3916f, aVar7.f3917g);
                                    g0Var2.g(fragment7);
                                    break;
                                case 7:
                                    fragment7.i0(aVar7.f3914d, aVar7.f3915e, aVar7.f3916f, aVar7.f3917g);
                                    g0Var2.Z(fragment7, false);
                                    g0Var2.c(fragment7);
                                    break;
                                case 8:
                                    g0Var2.b0(fragment7);
                                    break;
                                case 9:
                                    g0Var2.b0(null);
                                    break;
                                case 10:
                                    g0Var2.a0(fragment7, aVar7.f3919i);
                                    break;
                            }
                        }
                        continue;
                    }
                }
                boolean booleanValue = arrayList2.get(i11 - 1).booleanValue();
                for (int i31 = i10; i31 < i11; i31++) {
                    androidx.fragment.app.a aVar8 = arrayList.get(i31);
                    if (booleanValue) {
                        for (int size5 = aVar8.f3898a.size() - 1; size5 >= 0; size5--) {
                            Fragment fragment8 = aVar8.f3898a.get(size5).f3913b;
                            if (fragment8 != null) {
                                f(fragment8).k();
                            }
                        }
                    } else {
                        Iterator<p0.a> it2 = aVar8.f3898a.iterator();
                        while (it2.hasNext()) {
                            Fragment fragment9 = it2.next().f3913b;
                            if (fragment9 != null) {
                                f(fragment9).k();
                            }
                        }
                    }
                }
                P(this.f3793s, true);
                HashSet hashSet = new HashSet();
                for (int i32 = i10; i32 < i11; i32++) {
                    Iterator<p0.a> it3 = arrayList.get(i32).f3898a.iterator();
                    while (it3.hasNext()) {
                        Fragment fragment10 = it3.next().f3913b;
                        if (fragment10 != null && (viewGroup = fragment10.G) != null) {
                            hashSet.add(SpecialEffectsController.f(viewGroup, this));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    SpecialEffectsController specialEffectsController = (SpecialEffectsController) it4.next();
                    specialEffectsController.f3719d = booleanValue;
                    specialEffectsController.g();
                    specialEffectsController.c();
                }
                for (int i33 = i10; i33 < i11; i33++) {
                    androidx.fragment.app.a aVar9 = arrayList.get(i33);
                    if (arrayList2.get(i33).booleanValue() && aVar9.f3735r >= 0) {
                        aVar9.f3735r = -1;
                    }
                    aVar9.getClass();
                }
                return;
            }
        }
    }

    public final Fragment B(String str) {
        return this.c.c(str);
    }

    public final Fragment C(int i10) {
        o0 o0Var = this.c;
        int size = ((ArrayList) o0Var.f3891a).size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = (Fragment) ((ArrayList) o0Var.f3891a).get(size);
                if (fragment != null && fragment.f3690w == i10) {
                    return fragment;
                }
            } else {
                for (n0 n0Var : ((HashMap) o0Var.f3892b).values()) {
                    if (n0Var != null) {
                        Fragment fragment2 = n0Var.c;
                        if (fragment2.f3690w == i10) {
                            return fragment2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public final Fragment D(String str) {
        o0 o0Var = this.c;
        if (str != null) {
            int size = ((ArrayList) o0Var.f3891a).size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                Fragment fragment = (Fragment) ((ArrayList) o0Var.f3891a).get(size);
                if (fragment != null && str.equals(fragment.f3692y)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (n0 n0Var : ((HashMap) o0Var.f3892b).values()) {
                if (n0Var != null) {
                    Fragment fragment2 = n0Var.c;
                    if (str.equals(fragment2.f3692y)) {
                        return fragment2;
                    }
                }
            }
        } else {
            o0Var.getClass();
        }
        return null;
    }

    public final void E() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            SpecialEffectsController specialEffectsController = (SpecialEffectsController) it.next();
            if (specialEffectsController.f3720e) {
                J(2);
                specialEffectsController.f3720e = false;
                specialEffectsController.c();
            }
        }
    }

    public final ViewGroup F(Fragment fragment) {
        ViewGroup viewGroup = fragment.G;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.f3691x > 0 && this.f3795u.H()) {
            View F = this.f3795u.F(fragment.f3691x);
            if (F instanceof ViewGroup) {
                return (ViewGroup) F;
            }
        }
        return null;
    }

    public final y G() {
        Fragment fragment = this.f3796v;
        if (fragment != null) {
            return fragment.f3686s.G();
        }
        return this.f3798x;
    }

    public final List<Fragment> H() {
        return this.c.g();
    }

    public final b1 I() {
        Fragment fragment = this.f3796v;
        if (fragment != null) {
            return fragment.f3686s.I();
        }
        return this.f3799y;
    }

    public final boolean L() {
        Fragment fragment = this.f3796v;
        if (fragment == null) {
            return true;
        }
        if (fragment.D() && this.f3796v.u().L()) {
            return true;
        }
        return false;
    }

    public final boolean O() {
        if (!this.E && !this.F) {
            return false;
        }
        return true;
    }

    public final void P(int i10, boolean z10) {
        z<?> zVar;
        if (this.f3794t == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (!z10 && i10 == this.f3793s) {
            return;
        }
        this.f3793s = i10;
        o0 o0Var = this.c;
        Iterator it = ((ArrayList) o0Var.f3891a).iterator();
        while (it.hasNext()) {
            n0 n0Var = (n0) ((HashMap) o0Var.f3892b).get(((Fragment) it.next()).f3673f);
            if (n0Var != null) {
                n0Var.k();
            }
        }
        Iterator it2 = ((HashMap) o0Var.f3892b).values().iterator();
        while (true) {
            boolean z11 = false;
            if (!it2.hasNext()) {
                break;
            }
            n0 n0Var2 = (n0) it2.next();
            if (n0Var2 != null) {
                n0Var2.k();
                Fragment fragment = n0Var2.c;
                if (fragment.f3680m && !fragment.F()) {
                    z11 = true;
                }
                if (z11) {
                    o0Var.i(n0Var2);
                }
            }
        }
        d0();
        if (this.D && (zVar = this.f3794t) != null && this.f3793s == 7) {
            zVar.M();
            this.D = false;
        }
    }

    public final void Q() {
        if (this.f3794t == null) {
            return;
        }
        this.E = false;
        this.F = false;
        this.L.f3837i = false;
        for (Fragment fragment : this.c.g()) {
            if (fragment != null) {
                fragment.f3688u.Q();
            }
        }
    }

    public final boolean R() {
        return S(-1, 0);
    }

    public final boolean S(int i10, int i11) {
        y(false);
        x(true);
        Fragment fragment = this.f3797w;
        if (fragment != null && i10 < 0 && fragment.q().R()) {
            return true;
        }
        boolean T = T(this.I, this.J, i10, i11);
        if (T) {
            this.f3777b = true;
            try {
                V(this.I, this.J);
            } finally {
                d();
            }
        }
        f0();
        u();
        this.c.b();
        return T;
    }

    public final boolean T(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        boolean z10;
        if ((i11 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f3778d;
        int i12 = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i10 < 0) {
                i12 = z10 ? 0 : (-1) + this.f3778d.size();
            } else {
                int size = this.f3778d.size() - 1;
                while (size >= 0) {
                    androidx.fragment.app.a aVar = this.f3778d.get(size);
                    if (i10 >= 0 && i10 == aVar.f3735r) {
                        break;
                    }
                    size--;
                }
                if (size >= 0) {
                    if (z10) {
                        while (size > 0) {
                            int i13 = size - 1;
                            androidx.fragment.app.a aVar2 = this.f3778d.get(i13);
                            if (i10 < 0 || i10 != aVar2.f3735r) {
                                break;
                            }
                            size = i13;
                        }
                    } else if (size != this.f3778d.size() - 1) {
                        size++;
                    }
                }
                i12 = size;
            }
        }
        if (i12 < 0) {
            return false;
        }
        for (int size2 = this.f3778d.size() - 1; size2 >= i12; size2--) {
            arrayList.add(this.f3778d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void U(Fragment fragment) {
        if (J(2)) {
            Objects.toString(fragment);
        }
        boolean z10 = !fragment.F();
        if (!fragment.A || z10) {
            o0 o0Var = this.c;
            synchronized (((ArrayList) o0Var.f3891a)) {
                ((ArrayList) o0Var.f3891a).remove(fragment);
            }
            fragment.f3679l = false;
            if (K(fragment)) {
                this.D = true;
            }
            fragment.f3680m = true;
            c0(fragment);
        }
    }

    public final void V(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == arrayList2.size()) {
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                if (!arrayList.get(i10).f3911o) {
                    if (i11 != i10) {
                        A(arrayList, arrayList2, i11, i10);
                    }
                    i11 = i10 + 1;
                    if (arrayList2.get(i10).booleanValue()) {
                        while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f3911o) {
                            i11++;
                        }
                    }
                    A(arrayList, arrayList2, i10, i11);
                    i10 = i11 - 1;
                }
                i10++;
            }
            if (i11 != size) {
                A(arrayList, arrayList2, i11, size);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    public final void W(Bundle bundle) {
        b0 b0Var;
        int i10;
        boolean z10;
        n0 n0Var;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f3794t.f3962e.getClassLoader());
                this.f3785k.put(str.substring(7), bundle3);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f3794t.f3962e.getClassLoader());
                hashMap.put(str2.substring(9), bundle2);
            }
        }
        o0 o0Var = this.c;
        HashMap hashMap2 = o0Var.c;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        i0 i0Var = (i0) bundle.getParcelable("state");
        if (i0Var == null) {
            return;
        }
        ((HashMap) o0Var.f3892b).clear();
        Iterator<String> it = i0Var.f3818a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            b0Var = this.f3786l;
            if (!hasNext) {
                break;
            }
            Bundle j10 = o0Var.j(null, it.next());
            if (j10 != null) {
                Fragment fragment = this.L.f3832d.get(((m0) j10.getParcelable("state")).f3871b);
                if (fragment != null) {
                    if (J(2)) {
                        fragment.toString();
                    }
                    n0Var = new n0(b0Var, o0Var, fragment, j10);
                } else {
                    n0Var = new n0(this.f3786l, this.c, this.f3794t.f3962e.getClassLoader(), G(), j10);
                }
                Fragment fragment2 = n0Var.c;
                fragment2.f3670b = j10;
                fragment2.f3686s = this;
                if (J(2)) {
                    fragment2.toString();
                }
                n0Var.m(this.f3794t.f3962e.getClassLoader());
                o0Var.h(n0Var);
                n0Var.f3887e = this.f3793s;
            }
        }
        j0 j0Var = this.L;
        j0Var.getClass();
        Iterator it2 = new ArrayList(j0Var.f3832d.values()).iterator();
        while (true) {
            i10 = 0;
            if (!it2.hasNext()) {
                break;
            }
            Fragment fragment3 = (Fragment) it2.next();
            if (((HashMap) o0Var.f3892b).get(fragment3.f3673f) != null) {
                i10 = 1;
            }
            if (i10 == 0) {
                if (J(2)) {
                    fragment3.toString();
                    Objects.toString(i0Var.f3818a);
                }
                this.L.f(fragment3);
                fragment3.f3686s = this;
                n0 n0Var2 = new n0(b0Var, o0Var, fragment3);
                n0Var2.f3887e = 1;
                n0Var2.k();
                fragment3.f3680m = true;
                n0Var2.k();
            }
        }
        ArrayList<String> arrayList = i0Var.f3819b;
        ((ArrayList) o0Var.f3891a).clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                Fragment c10 = o0Var.c(str3);
                if (c10 != null) {
                    if (J(2)) {
                        c10.toString();
                    }
                    o0Var.a(c10);
                } else {
                    throw new IllegalStateException(a6.h.d("No instantiated fragment for (", str3, ")"));
                }
            }
        }
        if (i0Var.c != null) {
            this.f3778d = new ArrayList<>(i0Var.c.length);
            int i11 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = i0Var.c;
                if (i11 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.b bVar = bVarArr[i11];
                bVar.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(this);
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    int[] iArr = bVar.f3741a;
                    if (i12 >= iArr.length) {
                        break;
                    }
                    p0.a aVar2 = new p0.a();
                    int i14 = i12 + 1;
                    aVar2.f3912a = iArr[i12];
                    if (J(2)) {
                        Objects.toString(aVar);
                        int i15 = iArr[i14];
                    }
                    aVar2.f3918h = Lifecycle.State.values()[bVar.c[i13]];
                    aVar2.f3919i = Lifecycle.State.values()[bVar.f3743d[i13]];
                    int i16 = i14 + 1;
                    if (iArr[i14] != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    aVar2.c = z10;
                    int i17 = i16 + 1;
                    int i18 = iArr[i16];
                    aVar2.f3914d = i18;
                    int i19 = i17 + 1;
                    int i20 = iArr[i17];
                    aVar2.f3915e = i20;
                    int i21 = i19 + 1;
                    int i22 = iArr[i19];
                    aVar2.f3916f = i22;
                    int i23 = iArr[i21];
                    aVar2.f3917g = i23;
                    aVar.f3899b = i18;
                    aVar.c = i20;
                    aVar.f3900d = i22;
                    aVar.f3901e = i23;
                    aVar.b(aVar2);
                    i13++;
                    i12 = i21 + 1;
                }
                aVar.f3902f = bVar.f3744e;
                aVar.f3904h = bVar.f3745f;
                aVar.f3903g = true;
                aVar.f3905i = bVar.f3747h;
                aVar.f3906j = bVar.f3748i;
                aVar.f3907k = bVar.f3749j;
                aVar.f3908l = bVar.f3750k;
                aVar.f3909m = bVar.f3751l;
                aVar.f3910n = bVar.f3752m;
                aVar.f3911o = bVar.f3753n;
                aVar.f3735r = bVar.f3746g;
                int i24 = 0;
                while (true) {
                    ArrayList<String> arrayList2 = bVar.f3742b;
                    if (i24 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = arrayList2.get(i24);
                    if (str4 != null) {
                        aVar.f3898a.get(i24).f3913b = B(str4);
                    }
                    i24++;
                }
                aVar.f(1);
                if (J(2)) {
                    aVar.toString();
                    PrintWriter printWriter = new PrintWriter(new z0());
                    aVar.k("  ", printWriter, false);
                    printWriter.close();
                }
                this.f3778d.add(aVar);
                i11++;
            }
        } else {
            this.f3778d = null;
        }
        this.f3783i.set(i0Var.f3820d);
        String str5 = i0Var.f3821e;
        if (str5 != null) {
            Fragment B = B(str5);
            this.f3797w = B;
            q(B);
        }
        ArrayList<String> arrayList3 = i0Var.f3822f;
        if (arrayList3 != null) {
            while (i10 < arrayList3.size()) {
                this.f3784j.put(arrayList3.get(i10), i0Var.f3823g.get(i10));
                i10++;
            }
        }
        this.C = new ArrayDeque<>(i0Var.f3824h);
    }

    public final Bundle X() {
        androidx.fragment.app.b[] bVarArr;
        ArrayList<String> arrayList;
        int size;
        Bundle bundle = new Bundle();
        E();
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((SpecialEffectsController) it.next()).e();
        }
        y(true);
        this.E = true;
        this.L.f3837i = true;
        o0 o0Var = this.c;
        o0Var.getClass();
        ArrayList<String> arrayList2 = new ArrayList<>(((HashMap) o0Var.f3892b).size());
        for (n0 n0Var : ((HashMap) o0Var.f3892b).values()) {
            if (n0Var != null) {
                Fragment fragment = n0Var.c;
                o0Var.j(n0Var.o(), fragment.f3673f);
                arrayList2.add(fragment.f3673f);
                if (J(2)) {
                    fragment.toString();
                    Objects.toString(fragment.f3670b);
                }
            }
        }
        HashMap hashMap = this.c.c;
        if (hashMap.isEmpty()) {
            J(2);
        } else {
            o0 o0Var2 = this.c;
            synchronized (((ArrayList) o0Var2.f3891a)) {
                bVarArr = null;
                if (((ArrayList) o0Var2.f3891a).isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList<>(((ArrayList) o0Var2.f3891a).size());
                    Iterator it2 = ((ArrayList) o0Var2.f3891a).iterator();
                    while (it2.hasNext()) {
                        Fragment fragment2 = (Fragment) it2.next();
                        arrayList.add(fragment2.f3673f);
                        if (J(2)) {
                            fragment2.toString();
                        }
                    }
                }
            }
            ArrayList<androidx.fragment.app.a> arrayList3 = this.f3778d;
            if (arrayList3 != null && (size = arrayList3.size()) > 0) {
                bVarArr = new androidx.fragment.app.b[size];
                for (int i10 = 0; i10 < size; i10++) {
                    bVarArr[i10] = new androidx.fragment.app.b(this.f3778d.get(i10));
                    if (J(2)) {
                        Objects.toString(this.f3778d.get(i10));
                    }
                }
            }
            i0 i0Var = new i0();
            i0Var.f3818a = arrayList2;
            i0Var.f3819b = arrayList;
            i0Var.c = bVarArr;
            i0Var.f3820d = this.f3783i.get();
            Fragment fragment3 = this.f3797w;
            if (fragment3 != null) {
                i0Var.f3821e = fragment3.f3673f;
            }
            i0Var.f3822f.addAll(this.f3784j.keySet());
            i0Var.f3823g.addAll(this.f3784j.values());
            i0Var.f3824h = new ArrayList<>(this.C);
            bundle.putParcelable("state", i0Var);
            for (String str : this.f3785k.keySet()) {
                bundle.putBundle(a0.a.h("result_", str), this.f3785k.get(str));
            }
            for (String str2 : hashMap.keySet()) {
                bundle.putBundle(a0.a.h("fragment_", str2), (Bundle) hashMap.get(str2));
            }
        }
        return bundle;
    }

    public final void Y() {
        synchronized (this.f3776a) {
            boolean z10 = true;
            if (this.f3776a.size() != 1) {
                z10 = false;
            }
            if (z10) {
                this.f3794t.f3963f.removeCallbacks(this.M);
                this.f3794t.f3963f.post(this.M);
                f0();
            }
        }
    }

    public final void Z(Fragment fragment, boolean z10) {
        ViewGroup F = F(fragment);
        if (F != null && (F instanceof FragmentContainerView)) {
            ((FragmentContainerView) F).setDrawDisappearingViewsLast(!z10);
        }
    }

    public final n0 a(Fragment fragment) {
        String str = fragment.N;
        if (str != null) {
            FragmentStrictMode.d(fragment, str);
        }
        if (J(2)) {
            fragment.toString();
        }
        n0 f10 = f(fragment);
        fragment.f3686s = this;
        o0 o0Var = this.c;
        o0Var.h(f10);
        if (!fragment.A) {
            o0Var.a(fragment);
            fragment.f3680m = false;
            if (fragment.H == null) {
                fragment.L = false;
            }
            if (K(fragment)) {
                this.D = true;
            }
        }
        return f10;
    }

    public final void a0(Fragment fragment, Lifecycle.State state) {
        if (fragment.equals(B(fragment.f3673f)) && (fragment.f3687t == null || fragment.f3686s == this)) {
            fragment.O = state;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    @SuppressLint({"SyntheticAccessor"})
    public final void b(z<?> zVar, w wVar, Fragment fragment) {
        String str;
        if (this.f3794t == null) {
            this.f3794t = zVar;
            this.f3795u = wVar;
            this.f3796v = fragment;
            CopyOnWriteArrayList<k0> copyOnWriteArrayList = this.f3787m;
            if (fragment != null) {
                copyOnWriteArrayList.add(new g(fragment));
            } else if (zVar instanceof k0) {
                copyOnWriteArrayList.add((k0) zVar);
            }
            if (this.f3796v != null) {
                f0();
            }
            if (zVar instanceof androidx.activity.q) {
                androidx.activity.q qVar = (androidx.activity.q) zVar;
                OnBackPressedDispatcher onBackPressedDispatcher = qVar.getOnBackPressedDispatcher();
                this.f3781g = onBackPressedDispatcher;
                androidx.lifecycle.p pVar = qVar;
                if (fragment != null) {
                    pVar = fragment;
                }
                onBackPressedDispatcher.a(pVar, this.f3782h);
            }
            if (fragment != null) {
                j0 j0Var = fragment.f3686s.L;
                HashMap<String, j0> hashMap = j0Var.f3833e;
                j0 j0Var2 = hashMap.get(fragment.f3673f);
                if (j0Var2 == null) {
                    j0Var2 = new j0(j0Var.f3835g);
                    hashMap.put(fragment.f3673f, j0Var2);
                }
                this.L = j0Var2;
            } else if (zVar instanceof androidx.lifecycle.p0) {
                this.L = (j0) new androidx.lifecycle.m0(((androidx.lifecycle.p0) zVar).getViewModelStore(), j0.f3831j).a(j0.class);
            } else {
                this.L = new j0(false);
            }
            this.L.f3837i = O();
            this.c.f3893d = this.L;
            z<?> zVar2 = this.f3794t;
            if ((zVar2 instanceof z1.c) && fragment == null) {
                androidx.savedstate.a savedStateRegistry = ((z1.c) zVar2).getSavedStateRegistry();
                savedStateRegistry.c("android:support:fragments", new androidx.activity.d(this, 1));
                Bundle a10 = savedStateRegistry.a("android:support:fragments");
                if (a10 != null) {
                    W(a10);
                }
            }
            z<?> zVar3 = this.f3794t;
            if (zVar3 instanceof androidx.activity.result.g) {
                androidx.activity.result.f activityResultRegistry = ((androidx.activity.result.g) zVar3).getActivityResultRegistry();
                if (fragment != null) {
                    str = androidx.activity.r.g(new StringBuilder(), fragment.f3673f, ":");
                } else {
                    str = "";
                }
                String h10 = a0.a.h("FragmentManager:", str);
                h0 h0Var = (h0) this;
                this.f3800z = activityResultRegistry.d(a6.h.c(h10, "StartActivityForResult"), new j.d(), new h(h0Var));
                this.A = activityResultRegistry.d(a6.h.c(h10, "StartIntentSenderForResult"), new j(), new i(h0Var));
                this.B = activityResultRegistry.d(a6.h.c(h10, "RequestPermissions"), new j.b(), new a(h0Var));
            }
            z<?> zVar4 = this.f3794t;
            if (zVar4 instanceof androidx.core.content.c) {
                ((androidx.core.content.c) zVar4).addOnConfigurationChangedListener(this.f3788n);
            }
            z<?> zVar5 = this.f3794t;
            if (zVar5 instanceof androidx.core.content.d) {
                ((androidx.core.content.d) zVar5).addOnTrimMemoryListener(this.f3789o);
            }
            z<?> zVar6 = this.f3794t;
            if (zVar6 instanceof k0.v) {
                ((k0.v) zVar6).addOnMultiWindowModeChangedListener(this.f3790p);
            }
            z<?> zVar7 = this.f3794t;
            if (zVar7 instanceof k0.w) {
                ((k0.w) zVar7).addOnPictureInPictureModeChangedListener(this.f3791q);
            }
            z<?> zVar8 = this.f3794t;
            if ((zVar8 instanceof x0.i) && fragment == null) {
                ((x0.i) zVar8).addMenuProvider(this.f3792r);
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    public final void b0(Fragment fragment) {
        if (fragment != null && (!fragment.equals(B(fragment.f3673f)) || (fragment.f3687t != null && fragment.f3686s != this))) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        Fragment fragment2 = this.f3797w;
        this.f3797w = fragment;
        q(fragment2);
        q(this.f3797w);
    }

    public final void c(Fragment fragment) {
        if (J(2)) {
            Objects.toString(fragment);
        }
        if (fragment.A) {
            fragment.A = false;
            if (!fragment.f3679l) {
                this.c.a(fragment);
                if (J(2)) {
                    fragment.toString();
                }
                if (K(fragment)) {
                    this.D = true;
                }
            }
        }
    }

    public final void c0(Fragment fragment) {
        int i10;
        int i11;
        int i12;
        int i13;
        ViewGroup F = F(fragment);
        if (F != null) {
            Fragment.d dVar = fragment.K;
            boolean z10 = false;
            if (dVar == null) {
                i10 = 0;
            } else {
                i10 = dVar.f3699b;
            }
            if (dVar == null) {
                i11 = 0;
            } else {
                i11 = dVar.c;
            }
            int i14 = i11 + i10;
            if (dVar == null) {
                i12 = 0;
            } else {
                i12 = dVar.f3700d;
            }
            int i15 = i12 + i14;
            if (dVar == null) {
                i13 = 0;
            } else {
                i13 = dVar.f3701e;
            }
            if (i13 + i15 > 0) {
                if (F.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    F.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                Fragment fragment2 = (Fragment) F.getTag(R.id.visible_removing_fragment_view_tag);
                Fragment.d dVar2 = fragment.K;
                if (dVar2 != null) {
                    z10 = dVar2.f3698a;
                }
                if (fragment2.K != null) {
                    fragment2.o().f3698a = z10;
                }
            }
        }
    }

    public final void d() {
        this.f3777b = false;
        this.J.clear();
        this.I.clear();
    }

    public final void d0() {
        Iterator it = this.c.e().iterator();
        while (it.hasNext()) {
            n0 n0Var = (n0) it.next();
            Fragment fragment = n0Var.c;
            if (fragment.I) {
                if (this.f3777b) {
                    this.H = true;
                } else {
                    fragment.I = false;
                    n0Var.k();
                }
            }
        }
    }

    public final HashSet e() {
        Object jVar;
        HashSet hashSet = new HashSet();
        Iterator it = this.c.e().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((n0) it.next()).c.G;
            if (viewGroup != null) {
                b1 factory = I();
                kotlin.jvm.internal.g.e(factory, "factory");
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof SpecialEffectsController) {
                    jVar = (SpecialEffectsController) tag;
                } else {
                    jVar = new androidx.fragment.app.j(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, jVar);
                }
                hashSet.add(jVar);
            }
        }
        return hashSet;
    }

    public final void e0(IllegalStateException illegalStateException) {
        illegalStateException.getMessage();
        PrintWriter printWriter = new PrintWriter(new z0());
        z<?> zVar = this.f3794t;
        try {
            if (zVar != null) {
                zVar.J(printWriter, new String[0]);
            } else {
                v("  ", null, printWriter, new String[0]);
            }
        } catch (Exception unused) {
        }
        throw illegalStateException;
    }

    public final n0 f(Fragment fragment) {
        String str = fragment.f3673f;
        o0 o0Var = this.c;
        n0 n0Var = (n0) ((HashMap) o0Var.f3892b).get(str);
        if (n0Var != null) {
            return n0Var;
        }
        n0 n0Var2 = new n0(this.f3786l, o0Var, fragment);
        n0Var2.m(this.f3794t.f3962e.getClassLoader());
        n0Var2.f3887e = this.f3793s;
        return n0Var2;
    }

    public final void f0() {
        int i10;
        synchronized (this.f3776a) {
            try {
                boolean z10 = true;
                if (!this.f3776a.isEmpty()) {
                    b bVar = this.f3782h;
                    bVar.f1820a = true;
                    cg.a<tf.d> aVar = bVar.c;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    return;
                }
                b bVar2 = this.f3782h;
                ArrayList<androidx.fragment.app.a> arrayList = this.f3778d;
                if (arrayList != null) {
                    i10 = arrayList.size();
                } else {
                    i10 = 0;
                }
                if (i10 <= 0 || !N(this.f3796v)) {
                    z10 = false;
                }
                bVar2.f1820a = z10;
                cg.a<tf.d> aVar2 = bVar2.c;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g(Fragment fragment) {
        if (J(2)) {
            Objects.toString(fragment);
        }
        if (!fragment.A) {
            fragment.A = true;
            if (fragment.f3679l) {
                if (J(2)) {
                    fragment.toString();
                }
                o0 o0Var = this.c;
                synchronized (((ArrayList) o0Var.f3891a)) {
                    ((ArrayList) o0Var.f3891a).remove(fragment);
                }
                fragment.f3679l = false;
                if (K(fragment)) {
                    this.D = true;
                }
                c0(fragment);
            }
        }
    }

    public final void h(boolean z10, Configuration configuration) {
        if (z10 && (this.f3794t instanceof androidx.core.content.c)) {
            e0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.g()) {
            if (fragment != null) {
                fragment.onConfigurationChanged(configuration);
                if (z10) {
                    fragment.f3688u.h(true, configuration);
                }
            }
        }
    }

    public final boolean i() {
        if (this.f3793s < 1) {
            return false;
        }
        for (Fragment fragment : this.c.g()) {
            if (fragment != null && fragment.d0()) {
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        boolean z10;
        boolean z11;
        if (this.f3793s < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z12 = false;
        for (Fragment fragment : this.c.g()) {
            if (fragment != null && M(fragment)) {
                if (!fragment.f3693z) {
                    if (fragment.D && fragment.E) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z10 = z11 | fragment.f3688u.j();
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(fragment);
                    z12 = true;
                }
            }
        }
        if (this.f3779e != null) {
            for (int i10 = 0; i10 < this.f3779e.size(); i10++) {
                Fragment fragment2 = this.f3779e.get(i10);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.getClass();
                }
            }
        }
        this.f3779e = arrayList;
        return z12;
    }

    public final void k() {
        boolean z10 = true;
        this.G = true;
        y(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((SpecialEffectsController) it.next()).e();
        }
        z<?> zVar = this.f3794t;
        boolean z11 = zVar instanceof androidx.lifecycle.p0;
        o0 o0Var = this.c;
        if (z11) {
            z10 = ((j0) o0Var.f3893d).f3836h;
        } else {
            Context context = zVar.f3962e;
            if (context instanceof Activity) {
                z10 = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z10) {
            for (androidx.fragment.app.c cVar : this.f3784j.values()) {
                for (String str : cVar.f3758a) {
                    j0 j0Var = (j0) o0Var.f3893d;
                    j0Var.getClass();
                    J(3);
                    j0Var.e(str);
                }
            }
        }
        t(-1);
        z<?> zVar2 = this.f3794t;
        if (zVar2 instanceof androidx.core.content.d) {
            ((androidx.core.content.d) zVar2).removeOnTrimMemoryListener(this.f3789o);
        }
        z<?> zVar3 = this.f3794t;
        if (zVar3 instanceof androidx.core.content.c) {
            ((androidx.core.content.c) zVar3).removeOnConfigurationChangedListener(this.f3788n);
        }
        z<?> zVar4 = this.f3794t;
        if (zVar4 instanceof k0.v) {
            ((k0.v) zVar4).removeOnMultiWindowModeChangedListener(this.f3790p);
        }
        z<?> zVar5 = this.f3794t;
        if (zVar5 instanceof k0.w) {
            ((k0.w) zVar5).removeOnPictureInPictureModeChangedListener(this.f3791q);
        }
        z<?> zVar6 = this.f3794t;
        if ((zVar6 instanceof x0.i) && this.f3796v == null) {
            ((x0.i) zVar6).removeMenuProvider(this.f3792r);
        }
        this.f3794t = null;
        this.f3795u = null;
        this.f3796v = null;
        if (this.f3781g != null) {
            Iterator<androidx.activity.a> it2 = this.f3782h.f1821b.iterator();
            while (it2.hasNext()) {
                it2.next().cancel();
            }
            this.f3781g = null;
        }
        androidx.activity.result.e eVar = this.f3800z;
        if (eVar != null) {
            eVar.b();
            this.A.b();
            this.B.b();
        }
    }

    public final void l(boolean z10) {
        if (z10 && (this.f3794t instanceof androidx.core.content.d)) {
            e0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.g()) {
            if (fragment != null) {
                fragment.onLowMemory();
                if (z10) {
                    fragment.f3688u.l(true);
                }
            }
        }
    }

    public final void m(boolean z10, boolean z11) {
        if (z11 && (this.f3794t instanceof k0.v)) {
            e0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.g()) {
            if (fragment != null && z11) {
                fragment.f3688u.m(z10, true);
            }
        }
    }

    public final void n() {
        Iterator it = this.c.f().iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null) {
                fragment.S(fragment.E());
                fragment.f3688u.n();
            }
        }
    }

    public final boolean o() {
        boolean z10;
        if (this.f3793s < 1) {
            return false;
        }
        for (Fragment fragment : this.c.g()) {
            if (fragment != null) {
                if (!fragment.f3693z) {
                    z10 = fragment.f3688u.o();
                } else {
                    z10 = false;
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.f3793s < 1) {
            return;
        }
        for (Fragment fragment : this.c.g()) {
            if (fragment != null && !fragment.f3693z) {
                fragment.f3688u.p();
            }
        }
    }

    public final void q(Fragment fragment) {
        if (fragment != null && fragment.equals(B(fragment.f3673f))) {
            fragment.f3686s.getClass();
            boolean N = N(fragment);
            Boolean bool = fragment.f3678k;
            if (bool == null || bool.booleanValue() != N) {
                fragment.f3678k = Boolean.valueOf(N);
                h0 h0Var = fragment.f3688u;
                h0Var.f0();
                h0Var.q(h0Var.f3797w);
            }
        }
    }

    public final void r(boolean z10, boolean z11) {
        if (z11 && (this.f3794t instanceof k0.w)) {
            e0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.g()) {
            if (fragment != null && z11) {
                fragment.f3688u.r(z10, true);
            }
        }
    }

    public final boolean s(Menu menu) {
        boolean z10;
        boolean z11;
        if (this.f3793s < 1) {
            return false;
        }
        boolean z12 = false;
        for (Fragment fragment : this.c.g()) {
            if (fragment != null && M(fragment)) {
                if (!fragment.f3693z) {
                    if (fragment.D && fragment.E) {
                        fragment.U();
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z10 = fragment.f3688u.s(menu) | z11;
                } else {
                    z10 = false;
                }
                if (z10) {
                    z12 = true;
                }
            }
        }
        return z12;
    }

    public final void t(int i10) {
        try {
            this.f3777b = true;
            for (n0 n0Var : ((HashMap) this.c.f3892b).values()) {
                if (n0Var != null) {
                    n0Var.f3887e = i10;
                }
            }
            P(i10, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((SpecialEffectsController) it.next()).e();
            }
            this.f3777b = false;
            y(true);
        } catch (Throwable th2) {
            this.f3777b = false;
            throw th2;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f3796v;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f3796v)));
            sb2.append("}");
        } else {
            z<?> zVar = this.f3794t;
            if (zVar != null) {
                sb2.append(zVar.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f3794t)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public final void u() {
        if (this.H) {
            this.H = false;
            d0();
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String c10 = a6.h.c(str, "    ");
        o0 o0Var = this.c;
        o0Var.getClass();
        String str2 = str + "    ";
        if (!((HashMap) o0Var.f3892b).isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (n0 n0Var : ((HashMap) o0Var.f3892b).values()) {
                printWriter.print(str);
                if (n0Var != null) {
                    Fragment fragment = n0Var.c;
                    printWriter.println(fragment);
                    fragment.n(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = ((ArrayList) o0Var.f3891a).size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size3; i10++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(((Fragment) ((ArrayList) o0Var.f3891a).get(i10)).toString());
            }
        }
        ArrayList<Fragment> arrayList = this.f3779e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i11 = 0; i11 < size2; i11++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(this.f3779e.get(i11).toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.f3778d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i12 = 0; i12 < size; i12++) {
                androidx.fragment.app.a aVar = this.f3778d.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.k(c10, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f3783i.get());
        synchronized (this.f3776a) {
            int size4 = this.f3776a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i13 = 0; i13 < size4; i13++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i13);
                    printWriter.print(": ");
                    printWriter.println((m) this.f3776a.get(i13));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f3794t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f3795u);
        if (this.f3796v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f3796v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f3793s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.D);
        }
    }

    public final void w(m mVar, boolean z10) {
        if (!z10) {
            if (this.f3794t == null) {
                if (this.G) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (O()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f3776a) {
            if (this.f3794t == null) {
                if (z10) {
                    return;
                }
                throw new IllegalStateException("Activity has been destroyed");
            }
            this.f3776a.add(mVar);
            Y();
        }
    }

    public final void x(boolean z10) {
        if (!this.f3777b) {
            if (this.f3794t == null) {
                if (this.G) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (Looper.myLooper() == this.f3794t.f3963f.getLooper()) {
                if (!z10 && O()) {
                    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                }
                if (this.I == null) {
                    this.I = new ArrayList<>();
                    this.J = new ArrayList<>();
                    return;
                }
                return;
            } else {
                throw new IllegalStateException("Must be called from main thread of fragment host");
            }
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    public final boolean y(boolean z10) {
        boolean z11;
        x(z10);
        boolean z12 = false;
        while (true) {
            ArrayList<androidx.fragment.app.a> arrayList = this.I;
            ArrayList<Boolean> arrayList2 = this.J;
            synchronized (this.f3776a) {
                if (this.f3776a.isEmpty()) {
                    z11 = false;
                } else {
                    int size = this.f3776a.size();
                    z11 = false;
                    for (int i10 = 0; i10 < size; i10++) {
                        z11 |= this.f3776a.get(i10).a(arrayList, arrayList2);
                    }
                    this.f3776a.clear();
                    this.f3794t.f3963f.removeCallbacks(this.M);
                }
            }
            if (z11) {
                z12 = true;
                this.f3777b = true;
                try {
                    V(this.I, this.J);
                } finally {
                    d();
                }
            } else {
                f0();
                u();
                this.c.b();
                return z12;
            }
        }
    }

    public final void z(m mVar, boolean z10) {
        if (z10 && (this.f3794t == null || this.G)) {
            return;
        }
        x(z10);
        if (mVar.a(this.I, this.J)) {
            this.f3777b = true;
            try {
                V(this.I, this.J);
            } finally {
                d();
            }
        }
        f0();
        u();
        this.c.b();
    }

    /* compiled from: FragmentManager.java */
    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class l implements Parcelable {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public final String f3809a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3810b;

        /* compiled from: FragmentManager.java */
        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<l> {
            @Override // android.os.Parcelable.Creator
            public final l createFromParcel(Parcel parcel) {
                return new l(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final l[] newArray(int i10) {
                return new l[i10];
            }
        }

        public l(String str, int i10) {
            this.f3809a = str;
            this.f3810b = i10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f3809a);
            parcel.writeInt(this.f3810b);
        }

        public l(Parcel parcel) {
            this.f3809a = parcel.readString();
            this.f3810b = parcel.readInt();
        }
    }
