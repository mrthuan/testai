package a8;

import com.google.android.gms.measurement.internal.zzgw;
import com.google.android.gms.measurement.internal.zzlg;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzq;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class i0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzlj f194a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zzq f195b;
    public final /* synthetic */ zzgw c;

    public i0(zzgw zzgwVar, zzlj zzljVar, zzq zzqVar) {
        this.c = zzgwVar;
        this.f194a = zzljVar;
        this.f195b = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgw zzgwVar = this.c;
        zzgwVar.f11800a.a();
        zzlj zzljVar = this.f194a;
        Object d10 = zzljVar.d();
        zzlg zzlgVar = zzgwVar.f11800a;
        zzq zzqVar = this.f195b;
        if (d10 == null) {
            zzlgVar.j(zzljVar.f11910b, zzqVar);
        } else {
            zzlgVar.n(zzljVar, zzqVar);
        }
    }
}
