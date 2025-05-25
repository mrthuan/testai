package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.f;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.n;
import androidx.lifecycle.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;

/* compiled from: ActivityResultRegistry.java */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public Random f1834a = new Random();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f1835b = new HashMap();
    public final HashMap c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f1836d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<String> f1837e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public final transient HashMap f1838f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f1839g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public final Bundle f1840h = new Bundle();

    /* compiled from: ActivityResultRegistry.java */
    /* loaded from: classes.dex */
    public static class a<O> {

        /* renamed from: a  reason: collision with root package name */
        public final androidx.activity.result.b<O> f1841a;

        /* renamed from: b  reason: collision with root package name */
        public final j.a<?, O> f1842b;

        public a(j.a aVar, androidx.activity.result.b bVar) {
            this.f1841a = bVar;
            this.f1842b = aVar;
        }
    }

    /* compiled from: ActivityResultRegistry.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Lifecycle f1843a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<n> f1844b = new ArrayList<>();

        public b(Lifecycle lifecycle) {
            this.f1843a = lifecycle;
        }
    }

    public final boolean a(int i10, int i11, Intent intent) {
        androidx.activity.result.b<O> bVar;
        String str = (String) this.f1835b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        a aVar = (a) this.f1838f.get(str);
        if (aVar != null && (bVar = aVar.f1841a) != 0 && this.f1837e.contains(str)) {
            bVar.c(aVar.f1842b.c(i11, intent));
            this.f1837e.remove(str);
            return true;
        }
        this.f1839g.remove(str);
        this.f1840h.putParcelable(str, new androidx.activity.result.a(i11, intent));
        return true;
    }

    public abstract void b(int i10, j.a aVar, @SuppressLint({"UnknownNullness"}) Object obj);

    public final d c(final String str, p pVar, final j.a aVar, final androidx.activity.result.b bVar) {
        Lifecycle lifecycle = pVar.getLifecycle();
        if (!lifecycle.b().isAtLeast(Lifecycle.State.STARTED)) {
            e(str);
            HashMap hashMap = this.f1836d;
            b bVar2 = (b) hashMap.get(str);
            if (bVar2 == null) {
                bVar2 = new b(lifecycle);
            }
            n nVar = new n() { // from class: androidx.activity.result.ActivityResultRegistry$1
                @Override // androidx.lifecycle.n
                public final void d(p pVar2, Lifecycle.Event event) {
                    boolean equals = Lifecycle.Event.ON_START.equals(event);
                    String str2 = str;
                    f fVar = f.this;
                    if (equals) {
                        HashMap hashMap2 = fVar.f1838f;
                        j.a aVar2 = aVar;
                        b bVar3 = bVar;
                        hashMap2.put(str2, new f.a(aVar2, bVar3));
                        HashMap hashMap3 = fVar.f1839g;
                        if (hashMap3.containsKey(str2)) {
                            Object obj = hashMap3.get(str2);
                            hashMap3.remove(str2);
                            bVar3.c(obj);
                        }
                        Bundle bundle = fVar.f1840h;
                        a aVar3 = (a) bundle.getParcelable(str2);
                        if (aVar3 != null) {
                            bundle.remove(str2);
                            bVar3.c(aVar2.c(aVar3.f1828a, aVar3.f1829b));
                        }
                    } else if (Lifecycle.Event.ON_STOP.equals(event)) {
                        fVar.f1838f.remove(str2);
                    } else if (Lifecycle.Event.ON_DESTROY.equals(event)) {
                        fVar.f(str2);
                    }
                }
            };
            bVar2.f1843a.a(nVar);
            bVar2.f1844b.add(nVar);
            hashMap.put(str, bVar2);
            return new d(this, str, aVar);
        }
        throw new IllegalStateException("LifecycleOwner " + pVar + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.");
    }

    public final e d(String str, j.a aVar, androidx.activity.result.b bVar) {
        e(str);
        this.f1838f.put(str, new a(aVar, bVar));
        HashMap hashMap = this.f1839g;
        if (hashMap.containsKey(str)) {
            Object obj = hashMap.get(str);
            hashMap.remove(str);
            bVar.c(obj);
        }
        Bundle bundle = this.f1840h;
        androidx.activity.result.a aVar2 = (androidx.activity.result.a) bundle.getParcelable(str);
        if (aVar2 != null) {
            bundle.remove(str);
            bVar.c(aVar.c(aVar2.f1828a, aVar2.f1829b));
        }
        return new e(this, str, aVar);
    }

    public final void e(String str) {
        HashMap hashMap = this.c;
        if (((Integer) hashMap.get(str)) != null) {
            return;
        }
        int nextInt = this.f1834a.nextInt(2147418112);
        while (true) {
            int i10 = nextInt + 65536;
            HashMap hashMap2 = this.f1835b;
            if (hashMap2.containsKey(Integer.valueOf(i10))) {
                nextInt = this.f1834a.nextInt(2147418112);
            } else {
                hashMap2.put(Integer.valueOf(i10), str);
                hashMap.put(str, Integer.valueOf(i10));
                return;
            }
        }
    }

    public final void f(String str) {
        Integer num;
        if (!this.f1837e.contains(str) && (num = (Integer) this.c.remove(str)) != null) {
            this.f1835b.remove(num);
        }
        this.f1838f.remove(str);
        HashMap hashMap = this.f1839g;
        if (hashMap.containsKey(str)) {
            Objects.toString(hashMap.get(str));
            hashMap.remove(str);
        }
        Bundle bundle = this.f1840h;
        if (bundle.containsKey(str)) {
            Objects.toString(bundle.getParcelable(str));
            bundle.remove(str);
        }
        HashMap hashMap2 = this.f1836d;
        b bVar = (b) hashMap2.get(str);
        if (bVar != null) {
            ArrayList<n> arrayList = bVar.f1844b;
            Iterator<n> it = arrayList.iterator();
            while (it.hasNext()) {
                bVar.f1843a.c(it.next());
            }
            arrayList.clear();
            hashMap2.remove(str);
        }
    }
}
