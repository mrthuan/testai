package w8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* compiled from: StateListAnimator.java */
/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<b> f31044a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public ValueAnimator f31045b = null;
    public final a c = new a();

    /* compiled from: StateListAnimator.java */
    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            o oVar = o.this;
            if (oVar.f31045b == animator) {
                oVar.f31045b = null;
            }
        }
    }

    /* compiled from: StateListAnimator.java */
    /* loaded from: classes2.dex */
    public static class b {
        public b(int[] iArr, ValueAnimator valueAnimator) {
        }
    }

    public final void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.c);
        this.f31044a.add(bVar);
    }
}
