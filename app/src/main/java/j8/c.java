package j8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* compiled from: BottomAppBar.java */
/* loaded from: classes2.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f19059a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f19060b;
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f19061d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f19062e;

    public c(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i10, boolean z10) {
        this.f19062e = bottomAppBar;
        this.f19060b = actionMenuView;
        this.c = i10;
        this.f19061d = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f19059a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        if (!this.f19059a) {
            BottomAppBar bottomAppBar = this.f19062e;
            int i10 = bottomAppBar.f12094m0;
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i10 != 0) {
                bottomAppBar.f12094m0 = 0;
                bottomAppBar.getMenu().clear();
                bottomAppBar.k(i10);
            }
            bottomAppBar.H(this.f19060b, this.c, this.f19061d, z10);
        }
    }
}
