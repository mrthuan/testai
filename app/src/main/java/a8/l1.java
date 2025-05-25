package a8;

import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzjy;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class l1 extends f {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ zzjy f220e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(zzjy zzjyVar, m0 m0Var) {
        super(m0Var);
        this.f220e = zzjyVar;
    }

    @Override // a8.f
    public final void b() {
        zzjy zzjyVar = this.f220e;
        zzjyVar.m();
        if (!zzjyVar.s()) {
            return;
        }
        zzeu zzeuVar = ((zzge) zzjyVar.f3529a).f11780i;
        zzge.f(zzeuVar);
        zzeuVar.f11720n.a("Inactivity, disconnecting from the service");
        zzjyVar.C();
    }
}
