package a8;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzd;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzge;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f101a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f102b;
    public final /* synthetic */ zzd c;

    public a(zzd zzdVar, String str, long j10) {
        this.c = zzdVar;
        this.f101a = str;
        this.f102b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzd zzdVar = this.c;
        zzdVar.m();
        String str = this.f101a;
        Preconditions.f(str);
        y.b bVar = zzdVar.c;
        boolean isEmpty = bVar.isEmpty();
        long j10 = this.f102b;
        if (isEmpty) {
            zzdVar.f11604d = j10;
        }
        Integer num = (Integer) bVar.getOrDefault(str, null);
        if (num != null) {
            bVar.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (bVar.c >= 100) {
            zzeu zzeuVar = ((zzge) zzdVar.f3529a).f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11715i.a("Too many ads visible");
        } else {
            bVar.put(str, 1);
            zzdVar.f11603b.put(str, Long.valueOf(j10));
        }
    }
}
