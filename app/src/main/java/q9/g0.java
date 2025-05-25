package q9;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class g0 extends z {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h0 f29110b;

    public g0(h0 h0Var) {
        this.f29110b = h0Var;
    }

    @Override // q9.z
    public final void a() {
        h0 h0Var = this.f29110b;
        i0 i0Var = h0Var.f29111a;
        i0Var.f29116b.d("unlinkToDeath", new Object[0]);
        i0Var.f29126m.asBinder().unlinkToDeath(i0Var.f29123j, 0);
        i0 i0Var2 = h0Var.f29111a;
        i0Var2.f29126m = null;
        i0Var2.f29120g = false;
    }
}
