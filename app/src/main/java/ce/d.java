package ce;

/* compiled from: ConsentManager.java */
/* loaded from: classes.dex */
public final class d implements x9.f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f5679a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f5680b;

    public d(g gVar, a aVar) {
        this.f5680b = gVar;
        this.f5679a = aVar;
    }

    @Override // x9.f
    public final void onConsentFormLoadSuccess(x9.b bVar) {
        this.f5680b.f5687b = bVar;
        a aVar = this.f5679a;
        if (aVar != null) {
            aVar.b();
        }
    }
}
