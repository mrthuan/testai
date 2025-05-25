package a8;

import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzko;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class u1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f338a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zzko f339b;

    public u1(zzko zzkoVar, long j10) {
        this.f339b = zzkoVar;
        this.f338a = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j10 = this.f338a;
        zzko zzkoVar = this.f339b;
        zzkoVar.m();
        zzkoVar.q();
        zzge zzgeVar = (zzge) zzkoVar.f3529a;
        zzeu zzeuVar = zzgeVar.f11780i;
        zzge.f(zzeuVar);
        zzeuVar.f11720n.b(Long.valueOf(j10), "Activity paused, time");
        j3.h hVar = zzkoVar.f11879f;
        ((zzge) ((zzko) hVar.c).f3529a).f11785n.getClass();
        v1 v1Var = new v1(hVar, System.currentTimeMillis(), j10);
        hVar.f19039b = v1Var;
        ((zzko) hVar.c).c.postDelayed(v1Var, 2000L);
        if (zzgeVar.f11778g.w()) {
            zzkoVar.f11878e.c.a();
        }
    }
}
