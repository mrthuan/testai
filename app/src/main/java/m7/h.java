package m7;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class h extends zzb {

    /* renamed from: a  reason: collision with root package name */
    public final Context f21834a;

    public h(Context context) {
        this.f21834a = context;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        boolean z10;
        try {
            z10 = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.f21834a);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException unused) {
            zzm.g(6);
            z10 = false;
        }
        synchronized (zzl.f10365b) {
            zzl.c = true;
            zzl.f10366d = z10;
        }
        zzm.e("Update ad debug logging enablement as " + z10);
    }
}
