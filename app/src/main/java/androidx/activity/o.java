package androidx.activity;

import android.window.OnBackInvokedCallback;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements OnBackInvokedCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1822a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1823b;

    public /* synthetic */ o(Object obj, int i10) {
        this.f1822a = i10;
        this.f1823b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f1822a) {
            case 0:
                cg.a onBackInvoked = (cg.a) this.f1823b;
                kotlin.jvm.internal.g.e(onBackInvoked, "$onBackInvoked");
                onBackInvoked.invoke();
                return;
            default:
                ((Runnable) this.f1823b).run();
                return;
        }
    }
}
