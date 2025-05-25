package a8;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzci;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzhf;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.2.2 */
/* loaded from: classes2.dex */
public final class l2 implements zzhf {

    /* renamed from: a  reason: collision with root package name */
    public final zzci f221a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f222b;

    public l2(AppMeasurementDynamiteService appMeasurementDynamiteService, zzci zzciVar) {
        this.f222b = appMeasurementDynamiteService;
        this.f221a = zzciVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzhf
    public final void a(String str, String str2, Bundle bundle, long j10) {
        try {
            this.f221a.zze(str, str2, bundle, j10);
        } catch (RemoteException e10) {
            zzge zzgeVar = this.f222b.f11514a;
            if (zzgeVar != null) {
                zzeu zzeuVar = zzgeVar.f11780i;
                zzge.f(zzeuVar);
                zzeuVar.f11715i.b(e10, "Event listener threw exception");
            }
        }
    }
}
