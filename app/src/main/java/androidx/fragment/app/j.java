package androidx.fragment.app;

import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.SpecialEffectsController;
import androidx.fragment.app.v;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import x0.f0;

/* compiled from: DefaultSpecialEffectsController.kt */
/* loaded from: classes.dex */
public final class j extends SpecialEffectsController {

    /* compiled from: DefaultSpecialEffectsController.kt */
    /* loaded from: classes.dex */
    public static final class a extends b {
        public final boolean c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f3825d;

        /* renamed from: e  reason: collision with root package name */
        public v.a f3826e;

        public a(SpecialEffectsController.Operation operation, s0.d dVar, boolean z10) {
            super(operation, dVar);
            this.c = z10;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0063 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final androidx.fragment.app.v.a c(android.content.Context r10) {
            /*
                Method dump skipped, instructions count: 261
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j.a.c(android.content.Context):androidx.fragment.app.v$a");
        }
    }

    /* compiled from: DefaultSpecialEffectsController.kt */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final SpecialEffectsController.Operation f3827a;

        /* renamed from: b  reason: collision with root package name */
        public final s0.d f3828b;

        public b(SpecialEffectsController.Operation operation, s0.d dVar) {
            this.f3827a = operation;
            this.f3828b = dVar;
        }

        public final void a() {
            SpecialEffectsController.Operation operation = this.f3827a;
            operation.getClass();
            s0.d signal = this.f3828b;
            kotlin.jvm.internal.g.e(signal, "signal");
            LinkedHashSet linkedHashSet = operation.f3724e;
            if (linkedHashSet.remove(signal) && linkedHashSet.isEmpty()) {
                operation.b();
            }
        }

        public final boolean b() {
            SpecialEffectsController.Operation.State state;
            SpecialEffectsController.Operation.State.a aVar = SpecialEffectsController.Operation.State.Companion;
            SpecialEffectsController.Operation operation = this.f3827a;
            View view = operation.c.H;
            kotlin.jvm.internal.g.d(view, "operation.fragment.mView");
            aVar.getClass();
            SpecialEffectsController.Operation.State a10 = SpecialEffectsController.Operation.State.a.a(view);
            SpecialEffectsController.Operation.State state2 = operation.f3721a;
            if (a10 != state2 && (a10 == (state = SpecialEffectsController.Operation.State.VISIBLE) || state2 == state)) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: DefaultSpecialEffectsController.kt */
    /* loaded from: classes.dex */
    public static final class c extends b {
        public final Object c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f3829d;

        /* renamed from: e  reason: collision with root package name */
        public final Object f3830e;

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0029, code lost:
            if (r6 == androidx.fragment.app.Fragment.X) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
            if (r6 == androidx.fragment.app.Fragment.X) goto L25;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public c(androidx.fragment.app.SpecialEffectsController.Operation r5, s0.d r6, boolean r7, boolean r8) {
            /*
                r4 = this;
                r4.<init>(r5, r6)
                androidx.fragment.app.SpecialEffectsController$Operation$State r6 = r5.f3721a
                androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                r1 = 0
                androidx.fragment.app.Fragment r2 = r5.c
                if (r6 != r0) goto L1e
                if (r7 == 0) goto L1a
                androidx.fragment.app.Fragment$d r6 = r2.K
                if (r6 != 0) goto L13
                goto L2f
            L13:
                java.lang.Object r6 = r6.f3706j
                java.lang.Object r3 = androidx.fragment.app.Fragment.X
                if (r6 != r3) goto L30
                goto L2f
            L1a:
                r2.getClass()
                goto L2f
            L1e:
                if (r7 == 0) goto L2c
                androidx.fragment.app.Fragment$d r6 = r2.K
                if (r6 != 0) goto L25
                goto L2f
            L25:
                java.lang.Object r6 = r6.f3705i
                java.lang.Object r3 = androidx.fragment.app.Fragment.X
                if (r6 != r3) goto L30
                goto L2f
            L2c:
                r2.getClass()
            L2f:
                r6 = r1
            L30:
                r4.c = r6
                androidx.fragment.app.SpecialEffectsController$Operation$State r5 = r5.f3721a
                if (r5 != r0) goto L3d
                if (r7 == 0) goto L3b
                androidx.fragment.app.Fragment$d r5 = r2.K
                goto L3d
            L3b:
                androidx.fragment.app.Fragment$d r5 = r2.K
            L3d:
                r5 = 1
                r4.f3829d = r5
                if (r8 == 0) goto L55
                if (r7 == 0) goto L52
                androidx.fragment.app.Fragment$d r5 = r2.K
                if (r5 != 0) goto L49
                goto L55
            L49:
                java.lang.Object r5 = r5.f3707k
                java.lang.Object r6 = androidx.fragment.app.Fragment.X
                if (r5 != r6) goto L50
                goto L55
            L50:
                r1 = r5
                goto L55
            L52:
                r2.getClass()
            L55:
                r4.f3830e = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j.c.<init>(androidx.fragment.app.SpecialEffectsController$Operation, s0.d, boolean, boolean):void");
        }

        public final w0 c() {
            boolean z10;
            Object obj = this.c;
            w0 d10 = d(obj);
            Object obj2 = this.f3830e;
            w0 d11 = d(obj2);
            if (d10 != null && d11 != null && d10 != d11) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                if (d10 == null) {
                    return d11;
                }
                return d10;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.f3827a.c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
        }

        public final w0 d(Object obj) {
            if (obj == null) {
                return null;
            }
            s0 s0Var = q0.f3921a;
            if (s0Var != null && (obj instanceof Transition)) {
                return s0Var;
            }
            w0 w0Var = q0.f3922b;
            if (w0Var != null && w0Var.e(obj)) {
                return w0Var;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f3827a.c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ViewGroup container) {
        super(container);
        kotlin.jvm.internal.g.e(container, "container");
    }

    public static void i(ArrayList arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (x0.i0.b(viewGroup)) {
                if (!arrayList.contains(view)) {
                    arrayList.add(view);
                    return;
                }
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    i(arrayList, childAt);
                }
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public static void j(View view, y.b bVar) {
        WeakHashMap<View, x0.n0> weakHashMap = x0.f0.f31435a;
        String k10 = f0.i.k(view);
        if (k10 != null) {
            bVar.put(k10, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    j(childAt, bVar);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:221:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x05f0  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v61, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // androidx.fragment.app.SpecialEffectsController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.util.ArrayList r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 2259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j.b(java.util.ArrayList, boolean):void");
    }
}
