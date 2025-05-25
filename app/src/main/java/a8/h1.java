package a8;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzjy;
import com.google.android.gms.measurement.internal.zzlo;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.2.2 */
/* loaded from: classes2.dex */
public final class h1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzcf f187a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zzaw f188b;
    public final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f189d;

    public h1(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcfVar, zzaw zzawVar, String str) {
        this.f189d = appMeasurementDynamiteService;
        this.f187a = zzcfVar;
        this.f188b = zzawVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjy o10 = this.f189d.f11514a.o();
        o10.m();
        o10.n();
        zzge zzgeVar = (zzge) o10.f3529a;
        zzlo zzloVar = zzgeVar.f11783l;
        zzge.d(zzloVar);
        zzloVar.getClass();
        int c = GoogleApiAvailabilityLight.f10884b.c(((zzge) zzloVar.f3529a).f11773a, 12451000);
        zzcf zzcfVar = this.f187a;
        if (c != 0) {
            zzeu zzeuVar = zzgeVar.f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11715i.a("Not bundling data. Service unavailable or out of date");
            zzlo zzloVar2 = zzgeVar.f11783l;
            zzge.d(zzloVar2);
            zzloVar2.I(zzcfVar, new byte[0]);
            return;
        }
        o10.y(new m1(o10, this.f188b, this.c, zzcfVar));
    }
}
