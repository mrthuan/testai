package ce;

import android.content.Context;
import x9.b;

/* compiled from: ConsentManager.java */
/* loaded from: classes.dex */
public final class f implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f5683a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f5684b;

    public f(g gVar, Context context) {
        this.f5684b = gVar;
        this.f5683a = context;
    }

    @Override // x9.b.a
    public final void a(x9.d dVar) {
        String str;
        g gVar = this.f5684b;
        if (dVar == null && gVar.f5686a != null) {
            fe.a a10 = fe.a.a();
            int consentStatus = gVar.f5686a.getConsentStatus();
            if (consentStatus != 1) {
                if (consentStatus != 2) {
                    if (consentStatus != 3) {
                        str = "UNKNOWN";
                    } else {
                        str = "OBTAINED";
                    }
                } else {
                    str = "REQUIRED";
                }
            } else {
                str = "NOT_REQUIRED";
            }
            a10.b("ConsentManager ConsentStatus:".concat(str));
            a aVar = gVar.c;
            if (aVar != null) {
                gVar.f5686a.getConsentStatus();
                aVar.d();
                return;
            }
            return;
        }
        fe.a.a().b("ConsentManager onConsentFormDismissed:" + dVar.f31632a);
        a aVar2 = gVar.c;
        if (aVar2 != null) {
            aVar2.c();
        }
    }
}
