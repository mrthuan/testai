package androidx.fragment.app;

/* compiled from: Fragment.java */
/* loaded from: classes.dex */
public final class o implements t.a<Void, androidx.activity.result.f> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Fragment f3890a;

    public o(Fragment fragment) {
        this.f3890a = fragment;
    }

    @Override // t.a
    public final Object apply() {
        Fragment fragment = this.f3890a;
        z<?> zVar = fragment.f3687t;
        if (zVar instanceof androidx.activity.result.g) {
            return ((androidx.activity.result.g) zVar).getActivityResultRegistry();
        }
        return fragment.f0().getActivityResultRegistry();
    }
}
