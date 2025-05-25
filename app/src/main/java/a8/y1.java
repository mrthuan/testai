package a8;

import android.app.ActivityManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzos;
import com.google.android.gms.internal.measurement.zzqr;
import com.google.android.gms.measurement.internal.zzeh;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzij;
import com.google.android.gms.measurement.internal.zzko;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class y1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzko f390a;

    public y1(zzko zzkoVar) {
        this.f390a = zzkoVar;
    }

    public final void a() {
        zzko zzkoVar = this.f390a;
        zzkoVar.m();
        Object obj = zzkoVar.f3529a;
        v vVar = ((zzge) obj).f11779h;
        zzge.d(vVar);
        ((zzge) obj).f11785n.getClass();
        if (vVar.w(System.currentTimeMillis())) {
            v vVar2 = ((zzge) obj).f11779h;
            zzge.d(vVar2);
            vVar2.f348k.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                zzeu zzeuVar = ((zzge) obj).f11780i;
                zzge.f(zzeuVar);
                zzeuVar.f11720n.a("Detected application was in foreground");
                ((zzge) obj).f11785n.getClass();
                c(System.currentTimeMillis(), false);
            }
        }
    }

    public final void b(long j10, boolean z10) {
        zzko zzkoVar = this.f390a;
        zzkoVar.m();
        zzkoVar.q();
        Object obj = zzkoVar.f3529a;
        v vVar = ((zzge) obj).f11779h;
        zzge.d(vVar);
        if (vVar.w(j10)) {
            v vVar2 = ((zzge) obj).f11779h;
            zzge.d(vVar2);
            vVar2.f348k.a(true);
            zzqr.zzc();
            if (((zzge) obj).f11778g.v(null, zzeh.f11660k0)) {
                ((zzge) obj).k().t();
            }
        }
        v vVar3 = ((zzge) obj).f11779h;
        zzge.d(vVar3);
        vVar3.f351n.b(j10);
        v vVar4 = ((zzge) obj).f11779h;
        zzge.d(vVar4);
        if (vVar4.f348k.b()) {
            c(j10, z10);
        }
    }

    @VisibleForTesting
    public final void c(long j10, boolean z10) {
        zzko zzkoVar = this.f390a;
        zzkoVar.m();
        Object obj = zzkoVar.f3529a;
        if (!((zzge) obj).b()) {
            return;
        }
        v vVar = ((zzge) obj).f11779h;
        zzge.d(vVar);
        vVar.f351n.b(j10);
        ((zzge) obj).f11785n.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        zzeu zzeuVar = ((zzge) obj).f11780i;
        zzge.f(zzeuVar);
        zzeuVar.f11720n.b(Long.valueOf(elapsedRealtime), "Session started, time");
        Long valueOf = Long.valueOf(j10 / 1000);
        zzij zzijVar = ((zzge) obj).f11787p;
        zzge.e(zzijVar);
        zzijVar.C(j10, valueOf, "auto", "_sid");
        v vVar2 = ((zzge) obj).f11779h;
        zzge.d(vVar2);
        vVar2.f352o.b(valueOf.longValue());
        v vVar3 = ((zzge) obj).f11779h;
        zzge.d(vVar3);
        vVar3.f348k.a(false);
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", valueOf.longValue());
        if (((zzge) obj).f11778g.v(null, zzeh.f11643b0) && z10) {
            bundle.putLong("_aib", 1L);
        }
        zzij zzijVar2 = ((zzge) obj).f11787p;
        zzge.e(zzijVar2);
        zzijVar2.u("auto", "_s", bundle, j10);
        zzos.zzc();
        if (((zzge) obj).f11778g.v(null, zzeh.f11648e0)) {
            v vVar4 = ((zzge) obj).f11779h;
            zzge.d(vVar4);
            String a10 = vVar4.f357t.a();
            if (!TextUtils.isEmpty(a10)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", a10);
                zzij zzijVar3 = ((zzge) obj).f11787p;
                zzge.e(zzijVar3);
                zzijVar3.u("auto", "_ssr", bundle2, j10);
            }
        }
    }
}
