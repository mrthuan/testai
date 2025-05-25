package a8;

import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzff;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzij;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class o0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f269a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zzij f270b;

    public o0(zzij zzijVar, long j10) {
        this.f270b = zzijVar;
        this.f269a = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzij zzijVar = this.f270b;
        v vVar = ((zzge) zzijVar.f3529a).f11779h;
        zzge.d(vVar);
        zzff zzffVar = vVar.f347j;
        long j10 = this.f269a;
        zzffVar.b(j10);
        zzeu zzeuVar = ((zzge) zzijVar.f3529a).f11780i;
        zzge.f(zzeuVar);
        zzeuVar.f11719m.b(Long.valueOf(j10), "Session timeout duration set");
    }
}
