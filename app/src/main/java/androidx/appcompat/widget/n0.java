package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import androidx.appcompat.widget.StarCheckView;
import lib.zj.office.fc.ss.util.CellUtil;
import pe.a;

/* compiled from: StarCheckView.java */
/* loaded from: classes.dex */
public final class n0 extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StarCheckView f2620a;

    public n0(StarCheckView starCheckView) {
        this.f2620a = starCheckView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        StarCheckView starCheckView = this.f2620a;
        StarCheckView.a aVar = starCheckView.f2414k;
        if (aVar != null) {
            a.b bVar = (a.b) aVar;
            pe.a aVar2 = pe.a.this;
            aVar2.getClass();
            if (bVar.f28932a && !aVar2.f28929d) {
                aVar2.a();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bVar.f28933b, CellUtil.ROTATION, 20.0f, -20.0f, 20.0f, -20.0f, 0.0f);
                aVar2.f28930e = ofFloat;
                ofFloat.setDuration(2000L);
                aVar2.f28930e.addListener(new pe.b(bVar));
                aVar2.f28930e.start();
            }
        }
        starCheckView.f2412i = null;
    }
}
