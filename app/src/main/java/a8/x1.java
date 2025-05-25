package a8;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzpe;
import com.google.android.gms.measurement.internal.zzeh;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzij;
import com.google.android.gms.measurement.internal.zziy;
import com.google.android.gms.measurement.internal.zzko;
import com.google.android.gms.measurement.internal.zzlo;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class x1 {
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    public long f380a;
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    public long f381b;
    public final w1 c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ zzko f382d;

    public x1(zzko zzkoVar) {
        this.f382d = zzkoVar;
        this.c = new w1(this, (zzge) zzkoVar.f3529a);
        ((zzge) zzkoVar.f3529a).f11785n.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f380a = elapsedRealtime;
        this.f381b = elapsedRealtime;
    }

    public final boolean a(long j10, boolean z10, boolean z11) {
        zzko zzkoVar = this.f382d;
        zzkoVar.m();
        zzkoVar.n();
        zzpe.zzc();
        Object obj = zzkoVar.f3529a;
        if (((zzge) obj).f11778g.v(null, zzeh.f11650f0)) {
            if (((zzge) obj).b()) {
                v vVar = ((zzge) obj).f11779h;
                zzge.d(vVar);
                ((zzge) obj).f11785n.getClass();
                vVar.f351n.b(System.currentTimeMillis());
            }
        } else {
            v vVar2 = ((zzge) obj).f11779h;
            zzge.d(vVar2);
            ((zzge) obj).f11785n.getClass();
            vVar2.f351n.b(System.currentTimeMillis());
        }
        long j11 = j10 - this.f380a;
        if (!z10 && j11 < 1000) {
            zzeu zzeuVar = ((zzge) obj).f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11720n.b(Long.valueOf(j11), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z11) {
            j11 = j10 - this.f381b;
            this.f381b = j10;
        }
        zzeu zzeuVar2 = ((zzge) obj).f11780i;
        zzge.f(zzeuVar2);
        zzeuVar2.f11720n.b(Long.valueOf(j11), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j11);
        zziy zziyVar = ((zzge) obj).f11786o;
        zzge.e(zziyVar);
        zzlo.z(zziyVar.s(!((zzge) obj).f11778g.w()), bundle, true);
        if (!z11) {
            zzij zzijVar = ((zzge) obj).f11787p;
            zzge.e(zzijVar);
            zzijVar.t(bundle, "auto", "_e");
        }
        this.f380a = j10;
        w1 w1Var = this.c;
        w1Var.a();
        w1Var.c(3600000L);
        return true;
    }
}
