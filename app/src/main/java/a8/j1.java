package a8;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzek;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzij;
import com.google.android.gms.measurement.internal.zzjy;
import com.google.android.gms.measurement.internal.zzlo;
import com.google.android.gms.measurement.internal.zzq;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class j1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzq f207a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zzcf f208b;
    public final /* synthetic */ zzjy c;

    public j1(zzjy zzjyVar, zzq zzqVar, zzcf zzcfVar) {
        this.c = zzjyVar;
        this.f207a = zzqVar;
        this.f208b = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlo zzloVar;
        zzge zzgeVar;
        zzq zzqVar = this.f207a;
        zzcf zzcfVar = this.f208b;
        zzjy zzjyVar = this.c;
        String str = null;
        try {
            try {
                v vVar = ((zzge) zzjyVar.f3529a).f11779h;
                zzge.d(vVar);
                boolean f10 = vVar.s().f(zzah.ANALYTICS_STORAGE);
                Object obj = zzjyVar.f3529a;
                if (!f10) {
                    zzeu zzeuVar = ((zzge) obj).f11780i;
                    zzge.f(zzeuVar);
                    zzeuVar.f11717k.a("Analytics storage consent denied; will not get app instance id");
                    zzij zzijVar = ((zzge) obj).f11787p;
                    zzge.e(zzijVar);
                    zzijVar.f11829g.set(null);
                    v vVar2 = ((zzge) obj).f11779h;
                    zzge.d(vVar2);
                    vVar2.f343f.b(null);
                    zzgeVar = (zzge) obj;
                } else {
                    zzek zzekVar = zzjyVar.f11858d;
                    if (zzekVar == null) {
                        zzeu zzeuVar2 = ((zzge) obj).f11780i;
                        zzge.f(zzeuVar2);
                        zzeuVar2.f11712f.a("Failed to get app instance id");
                        zzgeVar = (zzge) obj;
                    } else {
                        Preconditions.j(zzqVar);
                        str = zzekVar.p(zzqVar);
                        if (str != null) {
                            zzij zzijVar2 = ((zzge) obj).f11787p;
                            zzge.e(zzijVar2);
                            zzijVar2.f11829g.set(str);
                            v vVar3 = ((zzge) obj).f11779h;
                            zzge.d(vVar3);
                            vVar3.f343f.b(str);
                        }
                        zzjyVar.x();
                        zzgeVar = (zzge) obj;
                    }
                }
                zzloVar = zzgeVar.f11783l;
            } catch (RemoteException e10) {
                zzeu zzeuVar3 = ((zzge) zzjyVar.f3529a).f11780i;
                zzge.f(zzeuVar3);
                zzeuVar3.f11712f.b(e10, "Failed to get app instance id");
                zzloVar = ((zzge) zzjyVar.f3529a).f11783l;
            }
            zzge.d(zzloVar);
            zzloVar.L(str, zzcfVar);
        } catch (Throwable th2) {
            zzlo zzloVar2 = ((zzge) zzjyVar.f3529a).f11783l;
            zzge.d(zzloVar2);
            zzloVar2.L(null, zzcfVar);
            throw th2;
        }
    }
}
