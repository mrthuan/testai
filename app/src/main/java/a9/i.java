package a9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DrawableWithAnimatedVisibilityChange.java */
/* loaded from: classes2.dex */
public final class i extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f427a;

    public i(j jVar) {
        this.f427a = jVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        j jVar = this.f427a;
        super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
        ArrayList arrayList = jVar.f433f;
        if (arrayList != null && !jVar.f434g) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((g2.c) it.next()).a(jVar);
            }
        }
    }
}
