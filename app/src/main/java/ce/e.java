package ce;

import android.content.Context;

/* compiled from: ConsentManager.java */
/* loaded from: classes.dex */
public final class e implements x9.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f5681a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f5682b;

    public e(Context context, a aVar) {
        this.f5681a = context;
        this.f5682b = aVar;
    }

    @Override // x9.e
    public final void onConsentFormLoadFailure(x9.d dVar) {
        String str;
        if (dVar != null) {
            str = "ConsentManager onConsentFormLoadFailure:" + dVar.f31632a;
        } else {
            str = "ConsentManager onConsentFormLoadFailure";
        }
        fe.a.a().b(str);
        a aVar = this.f5682b;
        if (aVar != null) {
            aVar.c();
        }
    }
}
