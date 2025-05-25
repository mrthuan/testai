package k7;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzb;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f19639a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f19640b;

    public /* synthetic */ t(Object obj, int i10) {
        this.f19639a = i10;
        this.f19640b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f19639a;
        Object obj = this.f19640b;
        switch (i10) {
            case 0:
                zzbh zzbhVar = ((zzew) obj).f10184a;
                if (zzbhVar != null) {
                    try {
                        zzbhVar.zze(1);
                        return;
                    } catch (RemoteException unused) {
                        zzm.g(5);
                        return;
                    }
                }
                return;
            default:
                zzb zzbVar = (zzb) obj;
                zzb.zzc(zzbVar, Thread.currentThread());
                zzbVar.zza();
                return;
        }
    }
}
