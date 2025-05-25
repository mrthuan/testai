package androidx.fragment.app;

import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;

/* compiled from: FragmentTransaction.java */
/* loaded from: classes.dex */
public abstract class p0 {

    /* renamed from: b  reason: collision with root package name */
    public int f3899b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f3900d;

    /* renamed from: e  reason: collision with root package name */
    public int f3901e;

    /* renamed from: f  reason: collision with root package name */
    public int f3902f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3903g;

    /* renamed from: h  reason: collision with root package name */
    public String f3904h;

    /* renamed from: i  reason: collision with root package name */
    public int f3905i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f3906j;

    /* renamed from: k  reason: collision with root package name */
    public int f3907k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f3908l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<String> f3909m;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList<String> f3910n;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<a> f3898a = new ArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    public boolean f3911o = false;

    /* compiled from: FragmentTransaction.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f3912a;

        /* renamed from: b  reason: collision with root package name */
        public Fragment f3913b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public int f3914d;

        /* renamed from: e  reason: collision with root package name */
        public int f3915e;

        /* renamed from: f  reason: collision with root package name */
        public int f3916f;

        /* renamed from: g  reason: collision with root package name */
        public int f3917g;

        /* renamed from: h  reason: collision with root package name */
        public Lifecycle.State f3918h;

        /* renamed from: i  reason: collision with root package name */
        public Lifecycle.State f3919i;

        public a() {
        }

        public a(int i10, Fragment fragment) {
            this.f3912a = i10;
            this.f3913b = fragment;
            this.c = false;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f3918h = state;
            this.f3919i = state;
        }

        public a(int i10, Fragment fragment, int i11) {
            this.f3912a = i10;
            this.f3913b = fragment;
            this.c = true;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f3918h = state;
            this.f3919i = state;
        }

        public a(Fragment fragment, Lifecycle.State state) {
            this.f3912a = 10;
            this.f3913b = fragment;
            this.c = false;
            this.f3918h = fragment.O;
            this.f3919i = state;
        }
    }

    public final void b(a aVar) {
        this.f3898a.add(aVar);
        aVar.f3914d = this.f3899b;
        aVar.f3915e = this.c;
        aVar.f3916f = this.f3900d;
        aVar.f3917g = this.f3901e;
    }

    public abstract void c(int i10, Fragment fragment, String str, int i11);

    public final void d(int i10, Fragment fragment, String str) {
        if (i10 != 0) {
            c(i10, fragment, str, 2);
            return;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public final void e(int i10, int i11) {
        this.f3899b = i10;
        this.c = i11;
        this.f3900d = 0;
        this.f3901e = 0;
    }
}
