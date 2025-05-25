package p9;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class v extends o {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w f23824b;

    public v(w wVar) {
        this.f23824b = wVar;
    }

    @Override // p9.o
    public final void a() {
        w wVar = this.f23824b;
        x xVar = wVar.f23825a;
        xVar.f23828b.c("unlinkToDeath", new Object[0]);
        xVar.f23838m.asBinder().unlinkToDeath(xVar.f23835j, 0);
        x xVar2 = wVar.f23825a;
        xVar2.f23838m = null;
        xVar2.f23832g = false;
    }
}
