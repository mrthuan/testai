package pdf.pdfreader.viewer.editor.free.ui.adapter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: ListAnimPool.java */
/* loaded from: classes3.dex */
public final class h extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Animator[] f27249a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Queue f27250b;
    public final /* synthetic */ Animator c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ i f27251d;

    public h(i iVar, Animator[] animatorArr, LinkedBlockingQueue linkedBlockingQueue, Animator animator) {
        this.f27251d = iVar;
        this.f27249a = animatorArr;
        this.f27250b = linkedBlockingQueue;
        this.c = animator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f27251d.getClass();
        Animator[] animatorArr = this.f27249a;
        if (animatorArr != null && animatorArr.length > 0) {
            for (Animator animator2 : animatorArr) {
                animator2.setTarget(null);
            }
            Queue queue = this.f27250b;
            if (!queue.offer(animatorArr)) {
                ea.a.p("PWVSeRpsUiA8YSNsVXMBelAg", "BbVRvxFD");
                queue.size();
            }
        }
        this.c.removeAllListeners();
    }
}
