package ce;

import android.content.Context;
import com.google.android.gms.internal.consent_sdk.zza;
import com.google.android.ump.ConsentInformation;

/* compiled from: ConsentManager.java */
/* loaded from: classes.dex */
public final class b implements ConsentInformation.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f5675a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f5676b;
    public final /* synthetic */ g c;

    public b(g gVar, Context context, b.b bVar) {
        this.c = gVar;
        this.f5675a = context;
        this.f5676b = bVar;
    }

    @Override // com.google.android.ump.ConsentInformation.b
    public final void onConsentInfoUpdateSuccess() {
        String str;
        g gVar = this.c;
        if (gVar.f5686a != null) {
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
            String concat = "ConsentManager ConsentStatus:".concat(str);
            Context context = this.f5675a;
            a10.b(concat);
            int consentStatus2 = gVar.f5686a.getConsentStatus();
            a aVar = this.f5676b;
            if (consentStatus2 != 1 && gVar.f5686a.getConsentStatus() != 3) {
                fe.a a11 = fe.a.a();
                a11.b("ConsentManager isFormAvailable:" + gVar.f5686a.isConsentFormAvailable());
                if (gVar.f5686a.isConsentFormAvailable()) {
                    try {
                        zza.zza(context).zzc().zzb(new d(gVar, aVar), new e(context, aVar));
                    } catch (Throwable th2) {
                        fe.a.a().c(th2);
                        if (aVar != null) {
                            th2.getMessage();
                            aVar.c();
                        }
                    }
                }
            } else if (aVar != null) {
                aVar.c();
            }
        }
    }
}
