package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* compiled from: FragmentTransitionCompat21.java */
/* loaded from: classes.dex */
public final class t0 implements Transition.TransitionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f3934a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f3935b;
    public final /* synthetic */ Object c = null;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ArrayList f3936d = null;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f3937e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ArrayList f3938f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ s0 f3939g;

    public t0(s0 s0Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f3939g = s0Var;
        this.f3934a = obj;
        this.f3935b = arrayList;
        this.f3937e = obj2;
        this.f3938f = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        s0 s0Var = this.f3939g;
        Object obj = this.f3934a;
        if (obj != null) {
            s0Var.t(obj, this.f3935b, null);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            s0Var.t(obj2, this.f3936d, null);
        }
        Object obj3 = this.f3937e;
        if (obj3 != null) {
            s0Var.t(obj3, this.f3938f, null);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }
}
