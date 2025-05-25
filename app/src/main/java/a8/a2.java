package a8;

import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzkr;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class a2 extends f {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ zzkr f108e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(zzkr zzkrVar, zzge zzgeVar) {
        super(zzgeVar);
        this.f108e = zzkrVar;
    }

    @Override // a8.f
    public final void b() {
        zzkr zzkrVar = this.f108e;
        zzkrVar.q();
        zzeu zzeuVar = ((zzge) zzkrVar.f3529a).f11780i;
        zzge.f(zzeuVar);
        zzeuVar.f11720n.a("Starting upload from DelayedRunnable");
        zzkrVar.f117b.o();
    }
}
