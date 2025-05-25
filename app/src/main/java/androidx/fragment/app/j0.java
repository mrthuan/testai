package androidx.fragment.app;

import androidx.lifecycle.m0;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: FragmentManagerViewModel.java */
/* loaded from: classes.dex */
public final class j0 extends androidx.lifecycle.j0 {

    /* renamed from: j  reason: collision with root package name */
    public static final a f3831j = new a();

    /* renamed from: g  reason: collision with root package name */
    public final boolean f3835g;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<String, Fragment> f3832d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public final HashMap<String, j0> f3833e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    public final HashMap<String, androidx.lifecycle.o0> f3834f = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    public boolean f3836h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3837i = false;

    /* compiled from: FragmentManagerViewModel.java */
    /* loaded from: classes.dex */
    public class a implements m0.b {
        @Override // androidx.lifecycle.m0.b
        public final <T extends androidx.lifecycle.j0> T a(Class<T> cls) {
            return new j0(true);
        }

        @Override // androidx.lifecycle.m0.b
        public final androidx.lifecycle.j0 b(Class cls, n1.c cVar) {
            return a(cls);
        }
    }

    public j0(boolean z10) {
        this.f3835g = z10;
    }

    @Override // androidx.lifecycle.j0
    public final void b() {
        if (g0.J(3)) {
            toString();
        }
        this.f3836h = true;
    }

    public final void d(Fragment fragment) {
        if (this.f3837i) {
            g0.J(2);
            return;
        }
        HashMap<String, Fragment> hashMap = this.f3832d;
        if (hashMap.containsKey(fragment.f3673f)) {
            return;
        }
        hashMap.put(fragment.f3673f, fragment);
        if (g0.J(2)) {
            fragment.toString();
        }
    }

    public final void e(String str) {
        HashMap<String, j0> hashMap = this.f3833e;
        j0 j0Var = hashMap.get(str);
        if (j0Var != null) {
            j0Var.b();
            hashMap.remove(str);
        }
        HashMap<String, androidx.lifecycle.o0> hashMap2 = this.f3834f;
        androidx.lifecycle.o0 o0Var = hashMap2.get(str);
        if (o0Var != null) {
            o0Var.a();
            hashMap2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j0.class != obj.getClass()) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (this.f3832d.equals(j0Var.f3832d) && this.f3833e.equals(j0Var.f3833e) && this.f3834f.equals(j0Var.f3834f)) {
            return true;
        }
        return false;
    }

    public final void f(Fragment fragment) {
        boolean z10;
        if (this.f3837i) {
            g0.J(2);
            return;
        }
        if (this.f3832d.remove(fragment.f3673f) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && g0.J(2)) {
            fragment.toString();
        }
    }

    public final int hashCode() {
        int hashCode = this.f3833e.hashCode();
        return this.f3834f.hashCode() + ((hashCode + (this.f3832d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<Fragment> it = this.f3832d.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f3833e.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f3834f.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
