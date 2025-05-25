package k7;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.measurement.internal.zziy;
import com.google.android.gms.tasks.OnCanceledListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f19636a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f19637b;

    public /* synthetic */ r(Object obj, int i10) {
        this.f19636a = i10;
        this.f19637b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19636a) {
            case 0:
                zzbh zzbhVar = ((s) this.f19637b).f19638a.f10183a;
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
            case 1:
                zziy zziyVar = (zziy) this.f19637b;
                zziyVar.f11848e = zziyVar.f11853j;
                return;
            default:
                synchronized (((d8.f) this.f19637b).f16135b) {
                    OnCanceledListener onCanceledListener = ((d8.f) this.f19637b).c;
                    if (onCanceledListener != null) {
                        onCanceledListener.c();
                    }
                }
                return;
        }
    }
}
