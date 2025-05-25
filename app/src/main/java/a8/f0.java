package a8;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzgw;
import com.google.android.gms.measurement.internal.zzlg;
import com.google.android.gms.measurement.internal.zzq;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class f0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f155a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zzq f156b;
    public final /* synthetic */ zzgw c;

    public /* synthetic */ f0(zzgw zzgwVar, zzq zzqVar, int i10) {
        this.f155a = i10;
        this.c = zzgwVar;
        this.f156b = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f155a;
        zzq zzqVar = this.f156b;
        zzgw zzgwVar = this.c;
        switch (i10) {
            case 0:
                zzgwVar.f11800a.a();
                zzlg zzlgVar = zzgwVar.f11800a;
                zzlgVar.zzaB().m();
                zzlgVar.b();
                Preconditions.f(zzqVar.f11920a);
                zzlgVar.D(zzqVar);
                return;
            default:
                zzgwVar.f11800a.a();
                zzgwVar.f11800a.h(zzqVar);
                return;
        }
    }
}
