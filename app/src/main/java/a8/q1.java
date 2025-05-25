package a8;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.zzek;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzjy;
import com.google.android.gms.measurement.internal.zzlo;
import com.google.android.gms.measurement.internal.zzq;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class q1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f300a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f301b;
    public final /* synthetic */ zzq c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ zzcf f302d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ zzjy f303e;

    public q1(zzjy zzjyVar, String str, String str2, zzq zzqVar, zzcf zzcfVar) {
        this.f303e = zzjyVar;
        this.f300a = str;
        this.f301b = str2;
        this.c = zzqVar;
        this.f302d = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlo zzloVar;
        zzge zzgeVar;
        zzq zzqVar = this.c;
        String str = this.f301b;
        String str2 = this.f300a;
        zzcf zzcfVar = this.f302d;
        zzjy zzjyVar = this.f303e;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                zzek zzekVar = zzjyVar.f11858d;
                Object obj = zzjyVar.f3529a;
                if (zzekVar == null) {
                    zzeu zzeuVar = ((zzge) obj).f11780i;
                    zzge.f(zzeuVar);
                    zzeuVar.f11712f.c(str2, "Failed to get conditional properties; not connected to service", str);
                    zzgeVar = (zzge) obj;
                } else {
                    Preconditions.j(zzqVar);
                    arrayList = zzlo.w(zzekVar.M(str2, str, zzqVar));
                    zzjyVar.x();
                    zzgeVar = (zzge) obj;
                }
                zzloVar = zzgeVar.f11783l;
            } catch (RemoteException e10) {
                zzeu zzeuVar2 = ((zzge) zzjyVar.f3529a).f11780i;
                zzge.f(zzeuVar2);
                zzeuVar2.f11712f.d("Failed to get conditional properties; remote exception", str2, str, e10);
                zzloVar = ((zzge) zzjyVar.f3529a).f11783l;
            }
            zzge.d(zzloVar);
            zzloVar.G(zzcfVar, arrayList);
        } catch (Throwable th2) {
            zzlo zzloVar2 = ((zzge) zzjyVar.f3529a).f11783l;
            zzge.d(zzloVar2);
            zzloVar2.G(zzcfVar, arrayList);
            throw th2;
        }
    }
}
