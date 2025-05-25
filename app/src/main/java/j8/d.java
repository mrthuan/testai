package j8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: BottomAppBar.java */
/* loaded from: classes2.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f19063a;

    public d(BottomAppBar bottomAppBar) {
        this.f19063a = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        float fabTranslationX;
        BottomAppBar bottomAppBar = this.f19063a;
        bottomAppBar.f12101t0.onAnimationStart(animator);
        FloatingActionButton y10 = bottomAppBar.y();
        if (y10 != null) {
            fabTranslationX = bottomAppBar.getFabTranslationX();
            y10.setTranslationX(fabTranslationX);
        }
    }
}
