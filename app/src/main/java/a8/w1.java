package a8;

import android.os.SystemClock;
import com.google.android.gms.measurement.internal.zzd;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzko;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class w1 extends f {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ x1 f375e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(x1 x1Var, zzge zzgeVar) {
        super(zzgeVar);
        this.f375e = x1Var;
    }

    @Override // a8.f
    public final void b() {
        x1 x1Var = this.f375e;
        x1Var.f382d.m();
        zzko zzkoVar = x1Var.f382d;
        ((zzge) zzkoVar.f3529a).f11785n.getClass();
        x1Var.a(SystemClock.elapsedRealtime(), false, false);
        Object obj = zzkoVar.f3529a;
        zzd h10 = ((zzge) obj).h();
        ((zzge) obj).f11785n.getClass();
        h10.p(SystemClock.elapsedRealtime());
    }
}
