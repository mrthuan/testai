package a8;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzd;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zziq;
import com.google.android.gms.measurement.internal.zziy;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f192a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f193b;
    public final /* synthetic */ zzd c;

    public i(zzd zzdVar, String str, long j10) {
        this.c = zzdVar;
        this.f192a = str;
        this.f193b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzd zzdVar = this.c;
        zzdVar.m();
        String str = this.f192a;
        Preconditions.f(str);
        y.b bVar = zzdVar.c;
        Integer num = (Integer) bVar.getOrDefault(str, null);
        Object obj = zzdVar.f3529a;
        if (num != null) {
            zzge zzgeVar = (zzge) obj;
            zziy zziyVar = zzgeVar.f11786o;
            zzge.e(zziyVar);
            zziq s4 = zziyVar.s(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                bVar.remove(str);
                y.b bVar2 = zzdVar.f11603b;
                Long l10 = (Long) bVar2.getOrDefault(str, null);
                zzeu zzeuVar = zzgeVar.f11780i;
                long j10 = this.f193b;
                if (l10 == null) {
                    zzge.f(zzeuVar);
                    zzeuVar.f11712f.a("First ad unit exposure time was never set");
                } else {
                    bVar2.remove(str);
                    zzdVar.r(str, j10 - l10.longValue(), s4);
                }
                if (bVar.isEmpty()) {
                    long j11 = zzdVar.f11604d;
                    if (j11 == 0) {
                        zzge.f(zzeuVar);
                        zzeuVar.f11712f.a("First ad exposure time was never set");
                        return;
                    }
                    zzdVar.q(j10 - j11, s4);
                    zzdVar.f11604d = 0L;
                    return;
                }
                return;
            }
            bVar.put(str, Integer.valueOf(intValue));
            return;
        }
        zzeu zzeuVar2 = ((zzge) obj).f11780i;
        zzge.f(zzeuVar2);
        zzeuVar2.f11712f.b(str, "Call to endAdUnitExposure for unknown ad unit id");
    }
}
