package a9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DrawableWithAnimatedVisibilityChange.java */
/* loaded from: classes2.dex */
public final class h extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f426a;

    public h(j jVar) {
        this.f426a = jVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        j jVar = this.f426a;
        ArrayList arrayList = jVar.f433f;
        if (arrayList != null && !jVar.f434g) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((g2.c) it.next()).b(jVar);
            }
        }
    }
}
