package ea;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzjb;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzhb;
import com.google.android.gms.measurement.internal.zzip;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.2 */
/* loaded from: classes2.dex */
public final class c implements AppMeasurementSdk.OnEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f16531a;

    public c(d dVar) {
        this.f16531a = dVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final void a(String str, String str2, Bundle bundle, long j10) {
        d dVar = this.f16531a;
        if (!dVar.f16532a.contains(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        zzjb zzjbVar = b.f16526a;
        String a10 = zzip.a(str2, zzhb.c, zzhb.f11802a);
        if (a10 != null) {
            str2 = a10;
        }
        bundle2.putString("events", str2);
        ((ia.b) dVar.f16533b).a(2, bundle2);
    }
}
