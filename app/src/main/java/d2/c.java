package d2;

import android.animation.Animator;
import d2.d;

/* compiled from: CircularProgressDrawable.java */
/* loaded from: classes.dex */
public final class c implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d.a f16078a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f16079b;

    public c(d dVar, d.a aVar) {
        this.f16079b = dVar;
        this.f16078a = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        d dVar = this.f16079b;
        d.a aVar = this.f16078a;
        dVar.a(1.0f, aVar, true);
        aVar.f16097k = aVar.f16091e;
        aVar.f16098l = aVar.f16092f;
        aVar.f16099m = aVar.f16093g;
        aVar.a((aVar.f16096j + 1) % aVar.f16095i.length);
        if (dVar.f16087f) {
            dVar.f16087f = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            if (aVar.f16100n) {
                aVar.f16100n = false;
                return;
            }
            return;
        }
        dVar.f16086e += 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f16079b.f16086e = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }
}
