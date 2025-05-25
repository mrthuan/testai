package a8;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzek;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzjy;
import com.google.android.gms.measurement.internal.zzq;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class k1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f214a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zzq f215b;
    public final /* synthetic */ zzjy c;

    public /* synthetic */ k1(zzjy zzjyVar, zzq zzqVar, int i10) {
        this.f214a = i10;
        this.c = zzjyVar;
        this.f215b = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f214a;
        zzjy zzjyVar = this.c;
        zzq zzqVar = this.f215b;
        switch (i10) {
            case 0:
                zzek zzekVar = zzjyVar.f11858d;
                Object obj = zzjyVar.f3529a;
                if (zzekVar == null) {
                    zzeu zzeuVar = ((zzge) obj).f11780i;
                    zzge.f(zzeuVar);
                    zzeuVar.f11712f.a("Discarding data. Failed to send app launch");
                    return;
                }
                try {
                    Preconditions.j(zzqVar);
                    zzekVar.L(zzqVar);
                    ((zzge) obj).l().s();
                    zzjyVar.q(zzekVar, null, zzqVar);
                    zzjyVar.x();
                    return;
                } catch (RemoteException e10) {
                    zzeu zzeuVar2 = ((zzge) obj).f11780i;
                    zzge.f(zzeuVar2);
                    zzeuVar2.f11712f.b(e10, "Failed to send app launch to the service");
                    return;
                }
            default:
                zzek zzekVar2 = zzjyVar.f11858d;
                Object obj2 = zzjyVar.f3529a;
                if (zzekVar2 == null) {
                    zzeu zzeuVar3 = ((zzge) obj2).f11780i;
                    zzge.f(zzeuVar3);
                    zzeuVar3.f11712f.a("Failed to send consent settings to service");
                    return;
                }
                try {
                    Preconditions.j(zzqVar);
                    zzekVar2.e0(zzqVar);
                    zzjyVar.x();
                    return;
                } catch (RemoteException e11) {
                    zzeu zzeuVar4 = ((zzge) obj2).f11780i;
                    zzge.f(zzeuVar4);
                    zzeuVar4.f11712f.b(e11, "Failed to send consent settings to the service");
                    return;
                }
        }
    }
}
