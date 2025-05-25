package ce;

import android.content.Context;
import com.google.android.ump.ConsentInformation;

/* compiled from: ConsentManager.java */
/* loaded from: classes.dex */
public final class c implements ConsentInformation.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f5677a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f5678b;

    public c(Context context, b.b bVar) {
        this.f5677a = context;
        this.f5678b = bVar;
    }

    @Override // com.google.android.ump.ConsentInformation.a
    public final void onConsentInfoUpdateFailure(x9.d dVar) {
        fe.a.a().b("ConsentManager FormError:" + dVar.f31632a);
        a aVar = this.f5678b;
        if (aVar != null) {
            aVar.c();
        }
    }
}
