package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.Lifecycle;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import s.b;

/* compiled from: LifecycleRegistry.kt */
/* loaded from: classes.dex */
public final class q extends Lifecycle {

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4070b;
    public s.a<o, a> c;

    /* renamed from: d  reason: collision with root package name */
    public Lifecycle.State f4071d;

    /* renamed from: e  reason: collision with root package name */
    public final WeakReference<p> f4072e;

    /* renamed from: f  reason: collision with root package name */
    public int f4073f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4074g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4075h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList<Lifecycle.State> f4076i;

    /* compiled from: LifecycleRegistry.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public Lifecycle.State f4077a;

        /* renamed from: b  reason: collision with root package name */
        public final n f4078b;

        public a(o oVar, Lifecycle.State initialState) {
            n reflectiveGenericLifecycleObserver;
            kotlin.jvm.internal.g.e(initialState, "initialState");
            kotlin.jvm.internal.g.b(oVar);
            HashMap hashMap = s.f4079a;
            boolean z10 = oVar instanceof n;
            boolean z11 = oVar instanceof e;
            if (z10 && z11) {
                reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((e) oVar, (n) oVar);
            } else if (z11) {
                reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((e) oVar, null);
            } else if (z10) {
                reflectiveGenericLifecycleObserver = (n) oVar;
            } else {
                Class<?> cls = oVar.getClass();
                if (s.b(cls) == 2) {
                    Object obj = s.f4080b.get(cls);
                    kotlin.jvm.internal.g.b(obj);
                    List list = (List) obj;
                    if (list.size() == 1) {
                        reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver(s.a((Constructor) list.get(0), oVar));
                    } else {
                        int size = list.size();
                        i[] iVarArr = new i[size];
                        for (int i10 = 0; i10 < size; i10++) {
                            iVarArr[i10] = s.a((Constructor) list.get(i10), oVar);
                        }
                        reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(iVarArr);
                    }
                } else {
                    reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(oVar);
                }
            }
            this.f4078b = reflectiveGenericLifecycleObserver;
            this.f4077a = initialState;
        }

        public final void a(p pVar, Lifecycle.Event event) {
            Lifecycle.State targetState = event.getTargetState();
            Lifecycle.State state1 = this.f4077a;
            kotlin.jvm.internal.g.e(state1, "state1");
            if (targetState != null && targetState.compareTo(state1) < 0) {
                state1 = targetState;
            }
            this.f4077a = state1;
            this.f4078b.d(pVar, event);
            this.f4077a = targetState;
        }
    }

    public q(p provider) {
        kotlin.jvm.internal.g.e(provider, "provider");
        this.f4070b = true;
        this.c = new s.a<>();
        this.f4071d = Lifecycle.State.INITIALIZED;
        this.f4076i = new ArrayList<>();
        this.f4072e = new WeakReference<>(provider);
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void a(o observer) {
        p pVar;
        boolean z10;
        kotlin.jvm.internal.g.e(observer, "observer");
        e("addObserver");
        Lifecycle.State state = this.f4071d;
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state != state2) {
            state2 = Lifecycle.State.INITIALIZED;
        }
        a aVar = new a(observer, state2);
        if (this.c.b(observer, aVar) != null || (pVar = this.f4072e.get()) == null) {
            return;
        }
        if (this.f4073f == 0 && !this.f4074g) {
            z10 = false;
        } else {
            z10 = true;
        }
        Lifecycle.State d10 = d(observer);
        this.f4073f++;
        while (aVar.f4077a.compareTo(d10) < 0 && this.c.f29678e.containsKey(observer)) {
            Lifecycle.State state3 = aVar.f4077a;
            ArrayList<Lifecycle.State> arrayList = this.f4076i;
            arrayList.add(state3);
            Lifecycle.Event.a aVar2 = Lifecycle.Event.Companion;
            Lifecycle.State state4 = aVar.f4077a;
            aVar2.getClass();
            Lifecycle.Event b10 = Lifecycle.Event.a.b(state4);
            if (b10 != null) {
                aVar.a(pVar, b10);
                arrayList.remove(arrayList.size() - 1);
                d10 = d(observer);
            } else {
                throw new IllegalStateException("no event up from " + aVar.f4077a);
            }
        }
        if (!z10) {
            i();
        }
        this.f4073f--;
    }

    @Override // androidx.lifecycle.Lifecycle
    public final Lifecycle.State b() {
        return this.f4071d;
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void c(o observer) {
        kotlin.jvm.internal.g.e(observer, "observer");
        e("removeObserver");
        this.c.c(observer);
    }

    public final Lifecycle.State d(o oVar) {
        b.c<o, a> cVar;
        Lifecycle.State state;
        a aVar;
        s.a<o, a> aVar2 = this.c;
        Lifecycle.State state2 = null;
        if (aVar2.f29678e.containsKey(oVar)) {
            cVar = aVar2.f29678e.get(oVar).f29684d;
        } else {
            cVar = null;
        }
        if (cVar != null && (aVar = cVar.f29683b) != null) {
            state = aVar.f4077a;
        } else {
            state = null;
        }
        ArrayList<Lifecycle.State> arrayList = this.f4076i;
        if (!arrayList.isEmpty()) {
            state2 = arrayList.get(arrayList.size() - 1);
        }
        Lifecycle.State state1 = this.f4071d;
        kotlin.jvm.internal.g.e(state1, "state1");
        if (state == null || state.compareTo(state1) >= 0) {
            state = state1;
        }
        if (state2 == null || state2.compareTo(state) >= 0) {
            return state;
        }
        return state2;
    }

    @SuppressLint({"RestrictedApi"})
    public final void e(String str) {
        if (this.f4070b && !r.b.m().n()) {
            throw new IllegalStateException(a6.h.d("Method ", str, " must be called on the main thread").toString());
        }
    }

    public final void f(Lifecycle.Event event) {
        kotlin.jvm.internal.g.e(event, "event");
        e("handleLifecycleEvent");
        g(event.getTargetState());
    }

    public final void g(Lifecycle.State state) {
        boolean z10;
        Lifecycle.State state2 = this.f4071d;
        if (state2 == state) {
            return;
        }
        if (state2 == Lifecycle.State.INITIALIZED && state == Lifecycle.State.DESTROYED) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            this.f4071d = state;
            if (!this.f4074g && this.f4073f == 0) {
                this.f4074g = true;
                i();
                this.f4074g = false;
                if (this.f4071d == Lifecycle.State.DESTROYED) {
                    this.c = new s.a<>();
                    return;
                }
                return;
            }
            this.f4075h = true;
            return;
        }
        throw new IllegalStateException(("no event down from " + this.f4071d + " in component " + this.f4072e.get()).toString());
    }

    public final void h(Lifecycle.State state) {
        kotlin.jvm.internal.g.e(state, "state");
        e("setCurrentState");
        g(state);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0162 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.q.i():void");
    }
}
