package v9;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes2.dex */
public final class j extends g {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o f30783b;

    public j(o oVar) {
        this.f30783b = oVar;
    }

    @Override // v9.g
    public final void a() {
        o oVar = this.f30783b;
        if (oVar.f30799m != null) {
            oVar.f30789b.a("Unbind from service.", new Object[0]);
            oVar.f30788a.unbindService(oVar.f30798l);
            oVar.f30793g = false;
            oVar.f30799m = null;
            oVar.f30798l = null;
        }
        oVar.b();
    }
}
