package androidx.fragment.app;

import android.view.View;
import android.view.animation.Animation;
import androidx.fragment.app.SpecialEffectsController;
import androidx.fragment.app.j;
import java.util.Objects;

/* compiled from: DefaultSpecialEffectsController.kt */
/* loaded from: classes.dex */
public final class l implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SpecialEffectsController.Operation f3842a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f3843b;
    public final /* synthetic */ View c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ j.a f3844d;

    public l(View view, j.a aVar, j jVar, SpecialEffectsController.Operation operation) {
        this.f3842a = operation;
        this.f3843b = jVar;
        this.c = view;
        this.f3844d = aVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        kotlin.jvm.internal.g.e(animation, "animation");
        j jVar = this.f3843b;
        jVar.f3717a.post(new d(jVar, this.c, this.f3844d));
        if (g0.J(2)) {
            Objects.toString(this.f3842a);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        kotlin.jvm.internal.g.e(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        kotlin.jvm.internal.g.e(animation, "animation");
        if (g0.J(2)) {
            Objects.toString(this.f3842a);
        }
    }
}
