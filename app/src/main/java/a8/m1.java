package a8;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzek;
import com.google.android.gms.measurement.internal.zzeu;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.gms.measurement.internal.zzjy;
import com.google.android.gms.measurement.internal.zzlo;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class m1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzaw f224a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f225b;
    public final /* synthetic */ zzcf c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ zzjy f226d;

    public m1(zzjy zzjyVar, zzaw zzawVar, String str, zzcf zzcfVar) {
        this.f226d = zzjyVar;
        this.f224a = zzawVar;
        this.f225b = str;
        this.c = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlo zzloVar;
        zzge zzgeVar;
        zzcf zzcfVar = this.c;
        zzjy zzjyVar = this.f226d;
        byte[] bArr = null;
        try {
            try {
                zzek zzekVar = zzjyVar.f11858d;
                Object obj = zzjyVar.f3529a;
                if (zzekVar == null) {
                    zzeu zzeuVar = ((zzge) obj).f11780i;
                    zzge.f(zzeuVar);
                    zzeuVar.f11712f.a("Discarding data. Failed to send event to service to bundle");
                    zzgeVar = (zzge) obj;
                } else {
                    bArr = zzekVar.j(this.f224a, this.f225b);
                    zzjyVar.x();
                    zzgeVar = (zzge) obj;
                }
                zzloVar = zzgeVar.f11783l;
            } catch (RemoteException e10) {
                zzeu zzeuVar2 = ((zzge) zzjyVar.f3529a).f11780i;
                zzge.f(zzeuVar2);
                zzeuVar2.f11712f.b(e10, "Failed to send event to the service to bundle");
                zzloVar = ((zzge) zzjyVar.f3529a).f11783l;
            }
            zzge.d(zzloVar);
            zzloVar.I(zzcfVar, bArr);
        } catch (Throwable th2) {
            zzlo zzloVar2 = ((zzge) zzjyVar.f3529a).f11783l;
            zzge.d(zzloVar2);
            zzloVar2.I(zzcfVar, null);
            throw th2;
        }
    }
}
