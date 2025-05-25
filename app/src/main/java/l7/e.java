package l7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.gms.ads.internal.overlay.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class e extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzs f20525a;

    public e(zzs zzsVar) {
        this.f20525a = zzsVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        zzs zzsVar = this.f20525a;
        zzsVar.setEnabled(true);
        zzsVar.f10332a.setEnabled(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        zzs zzsVar = this.f20525a;
        zzsVar.setEnabled(true);
        zzsVar.f10332a.setEnabled(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        zzs zzsVar = this.f20525a;
        zzsVar.setEnabled(false);
        zzsVar.f10332a.setEnabled(false);
    }
}
