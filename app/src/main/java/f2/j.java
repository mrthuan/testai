package f2;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.WeakHashMap;
import x0.f0;
import x0.n0;

/* compiled from: Slide.java */
/* loaded from: classes.dex */
public final class j extends d0 {
    public static final DecelerateInterpolator B = new DecelerateInterpolator();
    public static final AccelerateInterpolator C = new AccelerateInterpolator();
    public static final a D = new a();
    public static final b E = new b();
    public static final c F = new c();
    public static final d G = new d();
    public static final e H = new e();
    public static final f I = new f();
    public g A;

    /* compiled from: Slide.java */
    /* loaded from: classes.dex */
    public static class a extends h {
        @Override // f2.j.g
        public final float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* compiled from: Slide.java */
    /* loaded from: classes.dex */
    public static class b extends h {
        @Override // f2.j.g
        public final float b(ViewGroup viewGroup, View view) {
            WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
            boolean z10 = true;
            if (f0.e.d(viewGroup) != 1) {
                z10 = false;
            }
            if (z10) {
                return view.getTranslationX() + viewGroup.getWidth();
            }
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* compiled from: Slide.java */
    /* loaded from: classes.dex */
    public static class c extends i {
        @Override // f2.j.g
        public final float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    /* compiled from: Slide.java */
    /* loaded from: classes.dex */
    public static class d extends h {
        @Override // f2.j.g
        public final float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* compiled from: Slide.java */
    /* loaded from: classes.dex */
    public static class e extends h {
        @Override // f2.j.g
        public final float b(ViewGroup viewGroup, View view) {
            WeakHashMap<View, n0> weakHashMap = x0.f0.f31435a;
            boolean z10 = true;
            if (f0.e.d(viewGroup) != 1) {
                z10 = false;
            }
            if (z10) {
                return view.getTranslationX() - viewGroup.getWidth();
            }
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* compiled from: Slide.java */
    /* loaded from: classes.dex */
    public static class f extends i {
        @Override // f2.j.g
        public final float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    /* compiled from: Slide.java */
    /* loaded from: classes.dex */
    public interface g {
        float a(ViewGroup viewGroup, View view);

        float b(ViewGroup viewGroup, View view);
    }

    /* compiled from: Slide.java */
    /* loaded from: classes.dex */
    public static abstract class h implements g {
        @Override // f2.j.g
        public final float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    /* compiled from: Slide.java */
    /* loaded from: classes.dex */
    public static abstract class i implements g {
        @Override // f2.j.g
        public final float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    public j(int i10) {
        f fVar = I;
        this.A = fVar;
        if (i10 != 3) {
            if (i10 != 5) {
                if (i10 != 48) {
                    if (i10 != 80) {
                        if (i10 != 8388611) {
                            if (i10 == 8388613) {
                                this.A = H;
                            } else {
                                throw new IllegalArgumentException("Invalid slide direction");
                            }
                        } else {
                            this.A = E;
                        }
                    } else {
                        this.A = fVar;
                    }
                } else {
                    this.A = F;
                }
            } else {
                this.A = G;
            }
        } else {
            this.A = D;
        }
        f2.i iVar = new f2.i();
        iVar.f17032d = i10;
        this.f17053s = iVar;
    }

    @Override // f2.d0
    public final ObjectAnimator L(ViewGroup viewGroup, View view, r rVar, r rVar2) {
        if (rVar2 == null) {
            return null;
        }
        int[] iArr = (int[]) rVar2.f17075a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return s.a(view, rVar2, iArr[0], iArr[1], this.A.b(viewGroup, view), this.A.a(viewGroup, view), translationX, translationY, B, this);
    }

    @Override // f2.d0
    public final ObjectAnimator M(ViewGroup viewGroup, View view, r rVar) {
        if (rVar == null) {
            return null;
        }
        int[] iArr = (int[]) rVar.f17075a.get("android:slide:screenPosition");
        return s.a(view, rVar, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.A.b(viewGroup, view), this.A.a(viewGroup, view), C, this);
    }

    @Override // f2.d0, f2.k
    public final void e(r rVar) {
        J(rVar);
        int[] iArr = new int[2];
        rVar.f17076b.getLocationOnScreen(iArr);
        rVar.f17075a.put("android:slide:screenPosition", iArr);
    }

    @Override // f2.k
    public final void h(r rVar) {
        J(rVar);
        int[] iArr = new int[2];
        rVar.f17076b.getLocationOnScreen(iArr);
        rVar.f17075a.put("android:slide:screenPosition", iArr);
    }
}
