package x0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;
import x0.s0;

/* compiled from: WindowInsetsAnimationCompat.java */
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a  reason: collision with root package name */
    public final e f31474a;

    /* compiled from: WindowInsetsAnimationCompat.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final o0.b f31475a;

        /* renamed from: b  reason: collision with root package name */
        public final o0.b f31476b;

        public a(o0.b bVar, o0.b bVar2) {
            this.f31475a = bVar;
            this.f31476b = bVar2;
        }

        public final String toString() {
            return "Bounds{lower=" + this.f31475a + " upper=" + this.f31476b + "}";
        }
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    /* loaded from: classes.dex */
    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public WindowInsets f31477a;

        /* renamed from: b  reason: collision with root package name */
        public final int f31478b = 0;

        public abstract s0 a(s0 s0Var, List<r0> list);
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    /* loaded from: classes.dex */
    public static class c extends e {

        /* compiled from: WindowInsetsAnimationCompat.java */
        /* loaded from: classes.dex */
        public static class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a  reason: collision with root package name */
            public final b f31479a;

            /* renamed from: b  reason: collision with root package name */
            public s0 f31480b;

            /* compiled from: WindowInsetsAnimationCompat.java */
            /* renamed from: x0.r0$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class C0402a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ r0 f31481a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ s0 f31482b;
                public final /* synthetic */ s0 c;

                /* renamed from: d  reason: collision with root package name */
                public final /* synthetic */ int f31483d;

                /* renamed from: e  reason: collision with root package name */
                public final /* synthetic */ View f31484e;

                public C0402a(r0 r0Var, s0 s0Var, s0 s0Var2, int i10, View view) {
                    this.f31481a = r0Var;
                    this.f31482b = s0Var;
                    this.c = s0Var2;
                    this.f31483d = i10;
                    this.f31484e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    s0.e bVar;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    r0 r0Var = this.f31481a;
                    r0Var.f31474a.d(animatedFraction);
                    float b10 = r0Var.f31474a.b();
                    int i10 = Build.VERSION.SDK_INT;
                    s0 s0Var = this.f31482b;
                    if (i10 >= 30) {
                        bVar = new s0.d(s0Var);
                    } else if (i10 >= 29) {
                        bVar = new s0.c(s0Var);
                    } else {
                        bVar = new s0.b(s0Var);
                    }
                    for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                        if ((this.f31483d & i11) == 0) {
                            bVar.c(i11, s0Var.a(i11));
                        } else {
                            o0.b a10 = s0Var.a(i11);
                            o0.b a11 = this.c.a(i11);
                            float f10 = 1.0f - b10;
                            bVar.c(i11, s0.f(a10, (int) (((a10.f22639a - a11.f22639a) * f10) + 0.5d), (int) (((a10.f22640b - a11.f22640b) * f10) + 0.5d), (int) (((a10.c - a11.c) * f10) + 0.5d), (int) (((a10.f22641d - a11.f22641d) * f10) + 0.5d)));
                        }
                    }
                    c.g(this.f31484e, bVar.b(), Collections.singletonList(r0Var));
                }
            }

            /* compiled from: WindowInsetsAnimationCompat.java */
            /* loaded from: classes.dex */
            public class b extends AnimatorListenerAdapter {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ r0 f31485a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ View f31486b;

                public b(r0 r0Var, View view) {
                    this.f31485a = r0Var;
                    this.f31486b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    r0 r0Var = this.f31485a;
                    r0Var.f31474a.d(1.0f);
                    c.e(this.f31486b, r0Var);
                }
            }

            /* compiled from: WindowInsetsAnimationCompat.java */
            /* renamed from: x0.r0$c$a$c  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class RunnableC0403c implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ View f31487a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ r0 f31488b;
                public final /* synthetic */ a c;

                /* renamed from: d  reason: collision with root package name */
                public final /* synthetic */ ValueAnimator f31489d;

                public RunnableC0403c(View view, r0 r0Var, a aVar, ValueAnimator valueAnimator) {
                    this.f31487a = view;
                    this.f31488b = r0Var;
                    this.c = aVar;
                    this.f31489d = valueAnimator;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    c.h(this.f31487a, this.f31488b, this.c);
                    this.f31489d.start();
                }
            }

            public a(View view, l8.g gVar) {
                s0 s0Var;
                s0.e bVar;
                this.f31479a = gVar;
                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                s0 a10 = f0.j.a(view);
                if (a10 != null) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30) {
                        bVar = new s0.d(a10);
                    } else if (i10 >= 29) {
                        bVar = new s0.c(a10);
                    } else {
                        bVar = new s0.b(a10);
                    }
                    s0Var = bVar.b();
                } else {
                    s0Var = null;
                }
                this.f31480b = s0Var;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f31480b = s0.i(view, windowInsets);
                    return c.i(view, windowInsets);
                }
                s0 i10 = s0.i(view, windowInsets);
                if (this.f31480b == null) {
                    WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                    this.f31480b = f0.j.a(view);
                }
                if (this.f31480b == null) {
                    this.f31480b = i10;
                    return c.i(view, windowInsets);
                }
                b j10 = c.j(view);
                if (j10 != null && Objects.equals(j10.f31477a, windowInsets)) {
                    return c.i(view, windowInsets);
                }
                s0 s0Var = this.f31480b;
                int i11 = 0;
                for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                    if (!i10.a(i12).equals(s0Var.a(i12))) {
                        i11 |= i12;
                    }
                }
                if (i11 == 0) {
                    return c.i(view, windowInsets);
                }
                s0 s0Var2 = this.f31480b;
                r0 r0Var = new r0(i11, new DecelerateInterpolator(), 160L);
                e eVar = r0Var.f31474a;
                eVar.d(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(eVar.a());
                o0.b a10 = i10.a(i11);
                o0.b a11 = s0Var2.a(i11);
                int min = Math.min(a10.f22639a, a11.f22639a);
                int i13 = a10.f22640b;
                int i14 = a11.f22640b;
                int min2 = Math.min(i13, i14);
                int i15 = a10.c;
                int i16 = a11.c;
                int min3 = Math.min(i15, i16);
                int i17 = a10.f22641d;
                int i18 = i11;
                int i19 = a11.f22641d;
                a aVar = new a(o0.b.b(min, min2, min3, Math.min(i17, i19)), o0.b.b(Math.max(a10.f22639a, a11.f22639a), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i19)));
                c.f(view, r0Var, windowInsets, false);
                duration.addUpdateListener(new C0402a(r0Var, i10, s0Var2, i18, view));
                duration.addListener(new b(r0Var, view));
                x.a(view, new RunnableC0403c(view, r0Var, aVar, duration));
                this.f31480b = i10;
                return c.i(view, windowInsets);
            }
        }

        public static void e(View view, r0 r0Var) {
            b j10 = j(view);
            if (j10 != null) {
                ((l8.g) j10).c.setTranslationY(0.0f);
                if (j10.f31478b == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    e(viewGroup.getChildAt(i10), r0Var);
                }
            }
        }

        public static void f(View view, r0 r0Var, WindowInsets windowInsets, boolean z10) {
            b j10 = j(view);
            if (j10 != null) {
                j10.f31477a = windowInsets;
                if (!z10) {
                    l8.g gVar = (l8.g) j10;
                    View view2 = gVar.c;
                    int[] iArr = gVar.f20535f;
                    view2.getLocationOnScreen(iArr);
                    gVar.f20533d = iArr[1];
                    if (j10.f31478b == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    f(viewGroup.getChildAt(i10), r0Var, windowInsets, z10);
                }
            }
        }

        public static void g(View view, s0 s0Var, List<r0> list) {
            b j10 = j(view);
            if (j10 != null) {
                j10.a(s0Var, list);
                if (j10.f31478b == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    g(viewGroup.getChildAt(i10), s0Var, list);
                }
            }
        }

        public static void h(View view, r0 r0Var, a aVar) {
            b j10 = j(view);
            if (j10 != null) {
                l8.g gVar = (l8.g) j10;
                View view2 = gVar.c;
                int[] iArr = gVar.f20535f;
                view2.getLocationOnScreen(iArr);
                int i10 = gVar.f20533d - iArr[1];
                gVar.f20534e = i10;
                view2.setTranslationY(i10);
                if (j10.f31478b == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    h(viewGroup.getChildAt(i11), r0Var, aVar);
                }
            }
        }

        public static WindowInsets i(View view, WindowInsets windowInsets) {
            if (view.getTag(R.id.tag_on_apply_window_listener) != null) {
                return windowInsets;
            }
            return view.onApplyWindowInsets(windowInsets);
        }

        public static b j(View view) {
            Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
            if (tag instanceof a) {
                return ((a) tag).f31479a;
            }
            return null;
        }
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: e  reason: collision with root package name */
        public final WindowInsetsAnimation f31490e;

        /* compiled from: WindowInsetsAnimationCompat.java */
        /* loaded from: classes.dex */
        public static class a extends WindowInsetsAnimation$Callback {

            /* renamed from: a  reason: collision with root package name */
            public final b f31491a;

            /* renamed from: b  reason: collision with root package name */
            public List<r0> f31492b;
            public ArrayList<r0> c;

            /* renamed from: d  reason: collision with root package name */
            public final HashMap<WindowInsetsAnimation, r0> f31493d;

            public a(l8.g gVar) {
                super(gVar.f31478b);
                this.f31493d = new HashMap<>();
                this.f31491a = gVar;
            }

            public final r0 a(WindowInsetsAnimation windowInsetsAnimation) {
                r0 r0Var = this.f31493d.get(windowInsetsAnimation);
                if (r0Var == null) {
                    r0 r0Var2 = new r0(windowInsetsAnimation);
                    this.f31493d.put(windowInsetsAnimation, r0Var2);
                    return r0Var2;
                }
                return r0Var;
            }

            public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                b bVar = this.f31491a;
                a(windowInsetsAnimation);
                ((l8.g) bVar).c.setTranslationY(0.0f);
                this.f31493d.remove(windowInsetsAnimation);
            }

            public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                b bVar = this.f31491a;
                a(windowInsetsAnimation);
                l8.g gVar = (l8.g) bVar;
                View view = gVar.c;
                int[] iArr = gVar.f20535f;
                view.getLocationOnScreen(iArr);
                gVar.f20533d = iArr[1];
            }

            public final WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                float fraction;
                ArrayList<r0> arrayList = this.c;
                if (arrayList == null) {
                    ArrayList<r0> arrayList2 = new ArrayList<>(list.size());
                    this.c = arrayList2;
                    this.f31492b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        WindowInsetsAnimation d10 = androidx.window.layout.d.d(list.get(size));
                        r0 a10 = a(d10);
                        fraction = d10.getFraction();
                        a10.f31474a.d(fraction);
                        this.c.add(a10);
                    } else {
                        b bVar = this.f31491a;
                        s0 i10 = s0.i(null, windowInsets);
                        bVar.a(i10, this.f31492b);
                        return i10.h();
                    }
                }
            }

            public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                Insets lowerBound;
                Insets upperBound;
                b bVar = this.f31491a;
                a(windowInsetsAnimation);
                lowerBound = bounds.getLowerBound();
                o0.b c = o0.b.c(lowerBound);
                upperBound = bounds.getUpperBound();
                o0.b c10 = o0.b.c(upperBound);
                l8.g gVar = (l8.g) bVar;
                View view = gVar.c;
                int[] iArr = gVar.f20535f;
                view.getLocationOnScreen(iArr);
                int i10 = gVar.f20533d - iArr[1];
                gVar.f20534e = i10;
                view.setTranslationY(i10);
                com.google.android.gms.internal.ads.h.e();
                return com.google.android.gms.internal.ads.a.c(c.d(), c10.d());
            }
        }

        public d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f31490e = windowInsetsAnimation;
        }

        @Override // x0.r0.e
        public final long a() {
            long durationMillis;
            durationMillis = this.f31490e.getDurationMillis();
            return durationMillis;
        }

        @Override // x0.r0.e
        public final float b() {
            float interpolatedFraction;
            interpolatedFraction = this.f31490e.getInterpolatedFraction();
            return interpolatedFraction;
        }

        @Override // x0.r0.e
        public final int c() {
            int typeMask;
            typeMask = this.f31490e.getTypeMask();
            return typeMask;
        }

        @Override // x0.r0.e
        public final void d(float f10) {
            this.f31490e.setFraction(f10);
        }
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f31494a;

        /* renamed from: b  reason: collision with root package name */
        public float f31495b;
        public final Interpolator c;

        /* renamed from: d  reason: collision with root package name */
        public final long f31496d;

        public e(int i10, DecelerateInterpolator decelerateInterpolator, long j10) {
            this.f31494a = i10;
            this.c = decelerateInterpolator;
            this.f31496d = j10;
        }

        public long a() {
            return this.f31496d;
        }

        public float b() {
            Interpolator interpolator = this.c;
            if (interpolator != null) {
                return interpolator.getInterpolation(this.f31495b);
            }
            return this.f31495b;
        }

        public int c() {
            return this.f31494a;
        }

        public void d(float f10) {
            this.f31495b = f10;
        }
    }

    public r0(int i10, DecelerateInterpolator decelerateInterpolator, long j10) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f31474a = new d(com.gyf.immersionbar.f.b(i10, decelerateInterpolator, j10));
        } else {
            this.f31474a = new c(i10, decelerateInterpolator, j10);
        }
    }

    public r0(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f31474a = new d(windowInsetsAnimation);
        }
    }
}
