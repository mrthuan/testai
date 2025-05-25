package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Objects;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.R;
import s0.d;
import x0.f0;

/* compiled from: SpecialEffectsController.kt */
/* loaded from: classes.dex */
public abstract class SpecialEffectsController {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f3717a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f3718b;
    public final ArrayList c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3719d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3720e;

    /* compiled from: SpecialEffectsController.kt */
    /* loaded from: classes.dex */
    public static final class a extends Operation {

        /* renamed from: h  reason: collision with root package name */
        public final n0 f3731h;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a(androidx.fragment.app.SpecialEffectsController.Operation.State r3, androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact r4, androidx.fragment.app.n0 r5, s0.d r6) {
            /*
                r2 = this;
                java.lang.String r0 = "finalState"
                kotlin.jvm.internal.g.e(r3, r0)
                java.lang.String r0 = "lifecycleImpact"
                kotlin.jvm.internal.g.e(r4, r0)
                java.lang.String r0 = "fragmentStateManager"
                kotlin.jvm.internal.g.e(r5, r0)
                androidx.fragment.app.Fragment r0 = r5.c
                java.lang.String r1 = "fragmentStateManager.fragment"
                kotlin.jvm.internal.g.d(r0, r1)
                r2.<init>(r3, r4, r0, r6)
                r2.f3731h = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.SpecialEffectsController.a.<init>(androidx.fragment.app.SpecialEffectsController$Operation$State, androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact, androidx.fragment.app.n0, s0.d):void");
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public final void b() {
            super.b();
            this.f3731h.k();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public final void d() {
            boolean z10;
            float f10;
            Operation.LifecycleImpact lifecycleImpact = this.f3722b;
            Operation.LifecycleImpact lifecycleImpact2 = Operation.LifecycleImpact.ADDING;
            n0 n0Var = this.f3731h;
            if (lifecycleImpact == lifecycleImpact2) {
                Fragment fragment = n0Var.c;
                kotlin.jvm.internal.g.d(fragment, "fragmentStateManager.fragment");
                View findFocus = fragment.H.findFocus();
                if (findFocus != null) {
                    fragment.o().f3709m = findFocus;
                    if (g0.J(2)) {
                        findFocus.toString();
                        fragment.toString();
                    }
                }
                View h02 = this.c.h0();
                if (h02.getParent() == null) {
                    n0Var.b();
                    h02.setAlpha(0.0f);
                }
                if (h02.getAlpha() == 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && h02.getVisibility() == 0) {
                    h02.setVisibility(4);
                }
                Fragment.d dVar = fragment.K;
                if (dVar == null) {
                    f10 = 1.0f;
                } else {
                    f10 = dVar.f3708l;
                }
                h02.setAlpha(f10);
            } else if (lifecycleImpact == Operation.LifecycleImpact.REMOVING) {
                Fragment fragment2 = n0Var.c;
                kotlin.jvm.internal.g.d(fragment2, "fragmentStateManager.fragment");
                View h03 = fragment2.h0();
                if (g0.J(2)) {
                    Objects.toString(h03.findFocus());
                    h03.toString();
                    fragment2.toString();
                }
                h03.clearFocus();
            }
        }
    }

    /* compiled from: SpecialEffectsController.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3732a;

        static {
            int[] iArr = new int[Operation.LifecycleImpact.values().length];
            try {
                iArr[Operation.LifecycleImpact.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f3732a = iArr;
        }
    }

    public SpecialEffectsController(ViewGroup container) {
        kotlin.jvm.internal.g.e(container, "container");
        this.f3717a = container;
        this.f3718b = new ArrayList();
        this.c = new ArrayList();
    }

    public static final SpecialEffectsController f(ViewGroup container, g0 fragmentManager) {
        kotlin.jvm.internal.g.e(container, "container");
        kotlin.jvm.internal.g.e(fragmentManager, "fragmentManager");
        kotlin.jvm.internal.g.d(fragmentManager.I(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = container.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof SpecialEffectsController) {
            return (SpecialEffectsController) tag;
        }
        j jVar = new j(container);
        container.setTag(R.id.special_effects_controller_view_tag, jVar);
        return jVar;
    }

    public final void a(Operation.State state, Operation.LifecycleImpact lifecycleImpact, n0 n0Var) {
        synchronized (this.f3718b) {
            s0.d dVar = new s0.d();
            Fragment fragment = n0Var.c;
            kotlin.jvm.internal.g.d(fragment, "fragmentStateManager.fragment");
            Operation d10 = d(fragment);
            if (d10 != null) {
                d10.c(state, lifecycleImpact);
                return;
            }
            a aVar = new a(state, lifecycleImpact, n0Var, dVar);
            this.f3718b.add(aVar);
            aVar.f3723d.add(new a1(0, this, aVar));
            aVar.f3723d.add(new f0.s(1, this, aVar));
            tf.d dVar2 = tf.d.f30009a;
        }
    }

    public abstract void b(ArrayList arrayList, boolean z10);

    public final void c() {
        if (this.f3720e) {
            return;
        }
        ViewGroup viewGroup = this.f3717a;
        WeakHashMap<View, x0.n0> weakHashMap = x0.f0.f31435a;
        if (!f0.g.b(viewGroup)) {
            e();
            this.f3719d = false;
            return;
        }
        synchronized (this.f3718b) {
            if (!this.f3718b.isEmpty()) {
                ArrayList F0 = kotlin.collections.m.F0(this.c);
                this.c.clear();
                Iterator it = F0.iterator();
                while (it.hasNext()) {
                    Operation operation = (Operation) it.next();
                    if (g0.J(2)) {
                        Objects.toString(operation);
                    }
                    operation.a();
                    if (!operation.f3726g) {
                        this.c.add(operation);
                    }
                }
                h();
                ArrayList F02 = kotlin.collections.m.F0(this.f3718b);
                this.f3718b.clear();
                this.c.addAll(F02);
                g0.J(2);
                Iterator it2 = F02.iterator();
                while (it2.hasNext()) {
                    ((Operation) it2.next()).d();
                }
                b(F02, this.f3719d);
                this.f3719d = false;
                g0.J(2);
            }
            tf.d dVar = tf.d.f30009a;
        }
    }

    public final Operation d(Fragment fragment) {
        Object obj;
        boolean z10;
        Iterator it = this.f3718b.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                Operation operation = (Operation) obj;
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
        return (Operation) obj;
    }

    public final void e() {
        g0.J(2);
        ViewGroup viewGroup = this.f3717a;
        WeakHashMap<View, x0.n0> weakHashMap = x0.f0.f31435a;
        boolean b10 = f0.g.b(viewGroup);
        synchronized (this.f3718b) {
            h();
            Iterator it = this.f3718b.iterator();
            while (it.hasNext()) {
                ((Operation) it.next()).d();
            }
            Iterator it2 = kotlin.collections.m.F0(this.c).iterator();
            while (it2.hasNext()) {
                Operation operation = (Operation) it2.next();
                if (g0.J(2)) {
                    if (!b10) {
                        Objects.toString(this.f3717a);
                    }
                    Objects.toString(operation);
                }
                operation.a();
            }
            Iterator it3 = kotlin.collections.m.F0(this.f3718b).iterator();
            while (it3.hasNext()) {
                Operation operation2 = (Operation) it3.next();
                if (g0.J(2)) {
                    if (!b10) {
                        Objects.toString(this.f3717a);
                    }
                    Objects.toString(operation2);
                }
                operation2.a();
            }
            tf.d dVar = tf.d.f30009a;
        }
    }

    public final void g() {
        Fragment fragment;
        Object obj;
        boolean z10;
        synchronized (this.f3718b) {
            h();
            ArrayList arrayList = this.f3718b;
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                fragment = null;
                if (listIterator.hasPrevious()) {
                    obj = listIterator.previous();
                    Operation operation = (Operation) obj;
                    Operation.State.a aVar = Operation.State.Companion;
                    View view = operation.c.H;
                    kotlin.jvm.internal.g.d(view, "operation.fragment.mView");
                    aVar.getClass();
                    Operation.State a10 = Operation.State.a.a(view);
                    Operation.State state = operation.f3721a;
                    Operation.State state2 = Operation.State.VISIBLE;
                    if (state == state2 && a10 != state2) {
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
            Operation operation2 = (Operation) obj;
            if (operation2 != null) {
                fragment = operation2.c;
            }
            if (fragment != null) {
                Fragment.d dVar = fragment.K;
            }
            this.f3720e = false;
            tf.d dVar2 = tf.d.f30009a;
        }
    }

    public final void h() {
        Iterator it = this.f3718b.iterator();
        while (it.hasNext()) {
            Operation operation = (Operation) it.next();
            if (operation.f3722b == Operation.LifecycleImpact.ADDING) {
                View h02 = operation.c.h0();
                Operation.State.a aVar = Operation.State.Companion;
                int visibility = h02.getVisibility();
                aVar.getClass();
                operation.c(Operation.State.a.b(visibility), Operation.LifecycleImpact.NONE);
            }
        }
    }

    /* compiled from: SpecialEffectsController.kt */
    /* loaded from: classes.dex */
    public static class Operation {

        /* renamed from: a  reason: collision with root package name */
        public State f3721a;

        /* renamed from: b  reason: collision with root package name */
        public LifecycleImpact f3722b;
        public final Fragment c;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList f3723d;

        /* renamed from: e  reason: collision with root package name */
        public final LinkedHashSet f3724e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f3725f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f3726g;

        /* compiled from: SpecialEffectsController.kt */
        /* loaded from: classes.dex */
        public enum LifecycleImpact {
            NONE,
            ADDING,
            REMOVING
        }

        /* compiled from: SpecialEffectsController.kt */
        /* loaded from: classes.dex */
        public enum State {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;
            
            public static final a Companion = new a();

            /* compiled from: SpecialEffectsController.kt */
            /* loaded from: classes.dex */
            public static final class a {
                public static State a(View view) {
                    boolean z10;
                    if (view.getAlpha() == 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && view.getVisibility() == 0) {
                        return State.INVISIBLE;
                    }
                    return b(view.getVisibility());
                }

                public static State b(int i10) {
                    if (i10 != 0) {
                        if (i10 != 4) {
                            if (i10 == 8) {
                                return State.GONE;
                            }
                            throw new IllegalArgumentException(b.a.c("Unknown visibility ", i10));
                        }
                        return State.INVISIBLE;
                    }
                    return State.VISIBLE;
                }
            }

            /* compiled from: SpecialEffectsController.kt */
            /* loaded from: classes.dex */
            public /* synthetic */ class b {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f3729a;

                static {
                    int[] iArr = new int[State.values().length];
                    try {
                        iArr[State.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[State.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[State.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[State.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f3729a = iArr;
                }
            }

            public static final State from(int i10) {
                Companion.getClass();
                return a.b(i10);
            }

            public final void applyState(View view) {
                ViewGroup viewGroup;
                kotlin.jvm.internal.g.e(view, "view");
                int i10 = b.f3729a[ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                if (g0.J(2)) {
                                    view.toString();
                                }
                                view.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        if (g0.J(2)) {
                            view.toString();
                        }
                        view.setVisibility(8);
                        return;
                    }
                    if (g0.J(2)) {
                        view.toString();
                    }
                    view.setVisibility(0);
                    return;
                }
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    viewGroup = (ViewGroup) parent;
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    if (g0.J(2)) {
                        view.toString();
                        viewGroup.toString();
                    }
                    viewGroup.removeView(view);
                }
            }
        }

        /* compiled from: SpecialEffectsController.kt */
        /* loaded from: classes.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f3730a;

            static {
                int[] iArr = new int[LifecycleImpact.values().length];
                try {
                    iArr[LifecycleImpact.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LifecycleImpact.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LifecycleImpact.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f3730a = iArr;
            }
        }

        public Operation(State finalState, LifecycleImpact lifecycleImpact, Fragment fragment, s0.d dVar) {
            kotlin.jvm.internal.g.e(finalState, "finalState");
            kotlin.jvm.internal.g.e(lifecycleImpact, "lifecycleImpact");
            this.f3721a = finalState;
            this.f3722b = lifecycleImpact;
            this.c = fragment;
            this.f3723d = new ArrayList();
            this.f3724e = new LinkedHashSet();
            dVar.a(new androidx.appcompat.libconvert.a(this, 1));
        }

        public final void a() {
            if (this.f3725f) {
                return;
            }
            this.f3725f = true;
            if (this.f3724e.isEmpty()) {
                b();
                return;
            }
            LinkedHashSet linkedHashSet = this.f3724e;
            kotlin.jvm.internal.g.e(linkedHashSet, "<this>");
            for (s0.d dVar : new LinkedHashSet(linkedHashSet)) {
                synchronized (dVar) {
                    if (!dVar.f29689a) {
                        dVar.f29689a = true;
                        dVar.c = true;
                        d.a aVar = dVar.f29690b;
                        if (aVar != null) {
                            try {
                                aVar.onCancel();
                            } catch (Throwable th2) {
                                synchronized (dVar) {
                                    dVar.c = false;
                                    dVar.notifyAll();
                                    throw th2;
                                }
                            }
                        }
                        synchronized (dVar) {
                            dVar.c = false;
                            dVar.notifyAll();
                        }
                    }
                }
            }
        }

        public void b() {
            if (this.f3726g) {
                return;
            }
            if (g0.J(2)) {
                toString();
            }
            this.f3726g = true;
            for (Runnable runnable : this.f3723d) {
                runnable.run();
            }
        }

        public final void c(State finalState, LifecycleImpact lifecycleImpact) {
            kotlin.jvm.internal.g.e(finalState, "finalState");
            kotlin.jvm.internal.g.e(lifecycleImpact, "lifecycleImpact");
            int i10 = a.f3730a[lifecycleImpact.ordinal()];
            Fragment fragment = this.c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3 && this.f3721a != State.REMOVED) {
                        if (g0.J(2)) {
                            Objects.toString(fragment);
                            Objects.toString(this.f3721a);
                            finalState.toString();
                        }
                        this.f3721a = finalState;
                        return;
                    }
                    return;
                }
                if (g0.J(2)) {
                    Objects.toString(fragment);
                    Objects.toString(this.f3721a);
                    Objects.toString(this.f3722b);
                }
                this.f3721a = State.REMOVED;
                this.f3722b = LifecycleImpact.REMOVING;
            } else if (this.f3721a == State.REMOVED) {
                if (g0.J(2)) {
                    Objects.toString(fragment);
                    Objects.toString(this.f3722b);
                }
                this.f3721a = State.VISIBLE;
                this.f3722b = LifecycleImpact.ADDING;
            }
        }

        public final String toString() {
            StringBuilder g10 = b.a.g("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
            g10.append(this.f3721a);
            g10.append(" lifecycleImpact = ");
            g10.append(this.f3722b);
            g10.append(" fragment = ");
            g10.append(this.c);
            g10.append('}');
            return g10.toString();
        }

        public void d() {
        }
    }
}
