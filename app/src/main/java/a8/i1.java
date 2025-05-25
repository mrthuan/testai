package a8;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzek;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzjy;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzq;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class i1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzq f196a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f197b;
    public final /* synthetic */ zzlj c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ zzjy f198d;

    public i1(zzjy zzjyVar, zzq zzqVar, boolean z10, zzlj zzljVar) {
        this.f198d = zzjyVar;
        this.f196a = zzqVar;
        this.f197b = z10;
        this.c = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlj zzljVar;
        zzjy zzjyVar = this.f198d;
        zzek zzekVar = zzjyVar.f11858d;
        if (zzekVar == null) {
            zzeu zzeuVar = ((zzge) zzjyVar.f3529a).f11780i;
            zzge.f(zzeuVar);
            zzeuVar.f11712f.a("Discarding data. Failed to set user property");
            return;
        }
        zzq zzqVar = this.f196a;
        Preconditions.j(zzqVar);
        if (this.f197b) {
            zzljVar = null;
        } else {
            zzljVar = this.c;
        }
        zzjyVar.q(zzekVar, zzljVar, zzqVar);
        zzjyVar.x();
    }
}
