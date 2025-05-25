package a8;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.zzek;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzjy;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzlo;
import com.google.android.gms.measurement.internal.zzq;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class g1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f176a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f177b;
    public final /* synthetic */ zzq c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f178d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ zzcf f179e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ zzjy f180f;

    public g1(zzjy zzjyVar, String str, String str2, zzq zzqVar, boolean z10, zzcf zzcfVar) {
        this.f180f = zzjyVar;
        this.f176a = str;
        this.f177b = str2;
        this.c = zzqVar;
        this.f178d = z10;
        this.f179e = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        zzq zzqVar = this.c;
        String str = this.f176a;
        zzcf zzcfVar = this.f179e;
        zzjy zzjyVar = this.f180f;
        Bundle bundle2 = new Bundle();
        try {
            try {
                zzek zzekVar = zzjyVar.f11858d;
                Object obj = zzjyVar.f3529a;
                String str2 = this.f177b;
                if (zzekVar == null) {
                    zzeu zzeuVar = ((zzge) obj).f11780i;
                    zzge.f(zzeuVar);
                    zzeuVar.f11712f.c(str, "Failed to get user properties; not connected to service", str2);
                    zzlo zzloVar = ((zzge) obj).f11783l;
                    zzge.d(zzloVar);
                    zzloVar.H(zzcfVar, bundle2);
                    return;
                }
                Preconditions.j(zzqVar);
                List<zzlj> f02 = zzekVar.f0(str, str2, this.f178d, zzqVar);
                bundle = new Bundle();
                if (f02 != null) {
                    for (zzlj zzljVar : f02) {
                        String str3 = zzljVar.f11912e;
                        String str4 = zzljVar.f11910b;
                        if (str3 != null) {
                            bundle.putString(str4, str3);
                        } else {
                            Long l10 = zzljVar.f11911d;
                            if (l10 != null) {
                                bundle.putLong(str4, l10.longValue());
                            } else {
                                Double d10 = zzljVar.f11914g;
                                if (d10 != null) {
                                    bundle.putDouble(str4, d10.doubleValue());
                                }
                            }
                        }
                    }
                }
                try {
                    zzjyVar.x();
                    zzlo zzloVar2 = ((zzge) obj).f11783l;
                    zzge.d(zzloVar2);
                    zzloVar2.H(zzcfVar, bundle);
                } catch (RemoteException e10) {
                    e = e10;
                    bundle2 = bundle;
                    zzeu zzeuVar2 = ((zzge) zzjyVar.f3529a).f11780i;
                    zzge.f(zzeuVar2);
                    zzeuVar2.f11712f.c(str, "Failed to get user properties; remote exception", e);
                    zzlo zzloVar3 = ((zzge) zzjyVar.f3529a).f11783l;
                    zzge.d(zzloVar3);
                    zzloVar3.H(zzcfVar, bundle2);
                } catch (Throwable th2) {
                    th = th2;
                    zzlo zzloVar4 = ((zzge) zzjyVar.f3529a).f11783l;
                    zzge.d(zzloVar4);
                    zzloVar4.H(zzcfVar, bundle);
                    throw th;
                }
            } catch (RemoteException e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
            bundle = bundle2;
        }
    }
}
