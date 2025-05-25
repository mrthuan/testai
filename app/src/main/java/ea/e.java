package ea;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.tom_roush.fontbox.ttf.NamingTable;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.2 */
/* loaded from: classes2.dex */
public final class e implements AppMeasurementSdk.OnEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f16534a;

    public e(f fVar) {
        this.f16534a = fVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final void a(String str, String str2, Bundle bundle, long j10) {
        if (str != null && (!b.f16526a.contains(str2))) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(NamingTable.TAG, str2);
            bundle2.putLong("timestampInMillis", j10);
            bundle2.putBundle("params", bundle);
            ((ia.b) this.f16534a.f16535a).a(3, bundle2);
        }
    }
}
