package v9;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes2.dex */
public final class m extends g {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n f30785b;

    public m(n nVar) {
        this.f30785b = nVar;
    }

    @Override // v9.g
    public final void a() {
        n nVar = this.f30785b;
        o oVar = nVar.f30786a;
        oVar.f30789b.a("unlinkToDeath", new Object[0]);
        oVar.f30799m.asBinder().unlinkToDeath(oVar.f30796j, 0);
        o oVar2 = nVar.f30786a;
        oVar2.f30799m = null;
        oVar2.f30793g = false;
    }
}
