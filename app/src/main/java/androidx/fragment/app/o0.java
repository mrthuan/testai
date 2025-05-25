package androidx.fragment.app;

import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: FragmentStore.java */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    public Serializable f3891a;

    /* renamed from: b  reason: collision with root package name */
    public Serializable f3892b;
    public final HashMap c;

    /* renamed from: d  reason: collision with root package name */
    public Object f3893d;

    public o0(int i10) {
        if (i10 != 1) {
            this.f3891a = new ArrayList();
            this.f3892b = new HashMap();
            this.c = new HashMap();
        }
    }

    public final void a(Fragment fragment) {
        if (!((ArrayList) this.f3891a).contains(fragment)) {
            synchronized (((ArrayList) this.f3891a)) {
                ((ArrayList) this.f3891a).add(fragment);
            }
            fragment.f3679l = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    public final void b() {
        ((HashMap) this.f3892b).values().removeAll(Collections.singleton(null));
    }

    public final Fragment c(String str) {
        n0 n0Var = (n0) ((HashMap) this.f3892b).get(str);
        if (n0Var != null) {
            return n0Var.c;
        }
        return null;
    }

    public final Fragment d(String str) {
        for (n0 n0Var : ((HashMap) this.f3892b).values()) {
            if (n0Var != null) {
                Fragment fragment = n0Var.c;
                if (!str.equals(fragment.f3673f)) {
                    fragment = fragment.f3688u.c.d(str);
                }
                if (fragment != null) {
                    return fragment;
                }
            }
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (n0 n0Var : ((HashMap) this.f3892b).values()) {
            if (n0Var != null) {
                arrayList.add(n0Var);
            }
        }
        return arrayList;
    }

    public final ArrayList f() {
        ArrayList arrayList = new ArrayList();
        for (n0 n0Var : ((HashMap) this.f3892b).values()) {
            if (n0Var != null) {
                arrayList.add(n0Var.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List g() {
        ArrayList arrayList;
        if (((ArrayList) this.f3891a).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f3891a)) {
            arrayList = new ArrayList((ArrayList) this.f3891a);
        }
        return arrayList;
    }

    public final void h(n0 n0Var) {
        boolean z10;
        Fragment fragment = n0Var.c;
        if (((HashMap) this.f3892b).get(fragment.f3673f) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        ((HashMap) this.f3892b).put(fragment.f3673f, n0Var);
        if (fragment.C) {
            if (fragment.B) {
                ((j0) this.f3893d).d(fragment);
            } else {
                ((j0) this.f3893d).f(fragment);
            }
            fragment.C = false;
        }
        if (g0.J(2)) {
            fragment.toString();
        }
    }

    public final void i(n0 n0Var) {
        Fragment fragment = n0Var.c;
        if (fragment.B) {
            ((j0) this.f3893d).f(fragment);
        }
        if (((HashMap) this.f3892b).get(fragment.f3673f) == n0Var && ((n0) ((HashMap) this.f3892b).put(fragment.f3673f, null)) != null && g0.J(2)) {
            fragment.toString();
        }
    }

    public final Bundle j(Bundle bundle, String str) {
        HashMap hashMap = this.c;
        if (bundle != null) {
            return (Bundle) hashMap.put(str, bundle);
        }
        return (Bundle) hashMap.remove(str);
    }
}
