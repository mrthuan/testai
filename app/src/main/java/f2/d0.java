package f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import f2.k;
import java.util.HashMap;

/* compiled from: Visibility.java */
/* loaded from: classes.dex */
public abstract class d0 extends k {

    /* renamed from: z  reason: collision with root package name */
    public static final String[] f17008z = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: y  reason: collision with root package name */
    public int f17009y = 3;

    /* compiled from: Visibility.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f17015a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f17016b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f17017d;

        /* renamed from: e  reason: collision with root package name */
        public ViewGroup f17018e;

        /* renamed from: f  reason: collision with root package name */
        public ViewGroup f17019f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static f2.d0.b K(f2.r r8, f2.r r9) {
        /*
            f2.d0$b r0 = new f2.d0$b
            r0.<init>()
            r1 = 0
            r0.f17015a = r1
            r0.f17016b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f17075a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.c = r7
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f17018e = r6
            goto L33
        L2f:
            r0.c = r4
            r0.f17018e = r3
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f17075a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r3 = r6.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f17017d = r3
            java.lang.Object r2 = r6.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f17019f = r2
            goto L56
        L52:
            r0.f17017d = r4
            r0.f17019f = r3
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.c
            int r9 = r0.f17017d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f17018e
            android.view.ViewGroup r4 = r0.f17019f
            if (r3 != r4) goto L68
            return r0
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.f17016b = r1
            r0.f17015a = r2
            goto L9f
        L71:
            if (r9 != 0) goto L9f
            r0.f17016b = r2
            r0.f17015a = r2
            goto L9f
        L78:
            android.view.ViewGroup r8 = r0.f17019f
            if (r8 != 0) goto L81
            r0.f17016b = r1
            r0.f17015a = r2
            goto L9f
        L81:
            android.view.ViewGroup r8 = r0.f17018e
            if (r8 != 0) goto L9f
            r0.f17016b = r2
            r0.f17015a = r2
            goto L9f
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.f17017d
            if (r8 != 0) goto L95
            r0.f17016b = r2
            r0.f17015a = r2
            goto L9f
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.c
            if (r8 != 0) goto L9f
            r0.f17016b = r1
            r0.f17015a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.d0.K(f2.r, f2.r):f2.d0$b");
    }

    public final void J(r rVar) {
        View view = rVar.f17076b;
        int visibility = view.getVisibility();
        HashMap hashMap = rVar.f17075a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public abstract ObjectAnimator L(ViewGroup viewGroup, View view, r rVar, r rVar2);

    public abstract ObjectAnimator M(ViewGroup viewGroup, View view, r rVar);

    @Override // f2.k
    public void e(r rVar) {
        J(rVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
        if (K(p(r5, false), s(r5, false)).f17015a != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01be  */
    @Override // f2.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator l(android.view.ViewGroup r21, f2.r r22, f2.r r23) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.d0.l(android.view.ViewGroup, f2.r, f2.r):android.animation.Animator");
    }

    @Override // f2.k
    public final String[] r() {
        return f17008z;
    }

    @Override // f2.k
    public final boolean t(r rVar, r rVar2) {
        if (rVar == null && rVar2 == null) {
            return false;
        }
        if (rVar != null && rVar2 != null && rVar2.f17075a.containsKey("android:visibility:visibility") != rVar.f17075a.containsKey("android:visibility:visibility")) {
            return false;
        }
        b K = K(rVar, rVar2);
        if (!K.f17015a) {
            return false;
        }
        if (K.c != 0 && K.f17017d != 0) {
            return false;
        }
        return true;
    }

    /* compiled from: Visibility.java */
    /* loaded from: classes.dex */
    public static class a extends AnimatorListenerAdapter implements k.d {

        /* renamed from: a  reason: collision with root package name */
        public final View f17010a;

        /* renamed from: b  reason: collision with root package name */
        public final int f17011b;
        public final ViewGroup c;

        /* renamed from: e  reason: collision with root package name */
        public boolean f17013e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f17014f = false;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f17012d = true;

        public a(View view, int i10) {
            this.f17010a = view;
            this.f17011b = i10;
            this.c = (ViewGroup) view.getParent();
            f(true);
        }

        @Override // f2.k.d
        public final void a() {
            f(false);
        }

        @Override // f2.k.d
        public final void c(k kVar) {
            if (!this.f17014f) {
                w.f17090a.a0(this.f17010a, this.f17011b);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            f(false);
            kVar.x(this);
        }

        @Override // f2.k.d
        public final void e() {
            f(true);
        }

        public final void f(boolean z10) {
            ViewGroup viewGroup;
            if (this.f17012d && this.f17013e != z10 && (viewGroup = this.c) != null) {
                this.f17013e = z10;
                u.a(viewGroup, z10);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f17014f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (!this.f17014f) {
                w.f17090a.a0(this.f17010a, this.f17011b);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            f(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            if (!this.f17014f) {
                w.f17090a.a0(this.f17010a, this.f17011b);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            if (!this.f17014f) {
                w.f17090a.a0(this.f17010a, 0);
            }
        }

        @Override // f2.k.d
        public final void b() {
        }

        @Override // f2.k.d
        public final void d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }
}
