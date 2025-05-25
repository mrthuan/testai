package a8;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzek;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzjy;
import com.google.android.gms.measurement.internal.zzq;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class o1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzq f271a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f272b;
    public final /* synthetic */ zzaw c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ zzjy f273d;

    public o1(zzjy zzjyVar, zzq zzqVar, boolean z10, zzaw zzawVar) {
        this.f273d = zzjyVar;
        this.f271a = zzqVar;
        this.f272b = z10;
        this.c = zzawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaw zzawVar;
        zzjy zzjyVar = this.f273d;
        zzek zzekVar = zzjyVar.f11858d;
        if (zzekVar == null) {
            zzeu zzeuVar = ((zzge) zzjyVar.f3529a).f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11712f.a("Discarding data. Failed to send event to service");
            return;
        }
        zzq zzqVar = this.f271a;
        Preconditions.j(zzqVar);
        if (this.f272b) {
            zzawVar = null;
        } else {
            zzawVar = this.c;
        }
        zzjyVar.q(zzekVar, zzawVar, zzqVar);
        zzjyVar.x();
    }
}
