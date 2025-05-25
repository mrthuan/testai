package k7;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzp;
import com.google.android.gms.ads.internal.util.client.zzq;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbsm;
import com.google.android.gms.internal.ads.zzbsp;
import com.google.android.gms.internal.ads.zzbsq;
import com.google.android.gms.internal.ads.zzbtq;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class a extends n {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Activity f19604b;
    public final /* synthetic */ zzaw c;

    public a(zzaw zzawVar, Activity activity) {
        this.f19604b = activity;
        this.c = zzawVar;
    }

    @Override // k7.n
    public final /* bridge */ /* synthetic */ Object a() {
        zzaw.b(this.f19604b, "ad_overlay");
        return null;
    }

    @Override // k7.n
    public final Object b(zzce zzceVar) {
        return zzceVar.zzm(new ObjectWrapper(this.f19604b));
    }

    @Override // k7.n
    public final Object c() {
        Activity activity = this.f19604b;
        zzbbw.zza(activity);
        boolean booleanValue = ((Boolean) zzba.f10115d.c.zza(zzbbw.zzjN)).booleanValue();
        zzaw zzawVar = this.c;
        if (booleanValue) {
            try {
                return zzbsm.zzI(((zzbsq) zzq.a(activity, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", new zzo() { // from class: com.google.android.gms.ads.internal.client.zzz
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.ads.internal.util.client.zzo
                    public final Object zza(Object obj) {
                        return zzbsp.zzb(obj);
                    }
                })).zze(new ObjectWrapper(activity)));
            } catch (RemoteException | zzp | NullPointerException e10) {
                zzawVar.f10106f = zzbtq.zza(activity.getApplicationContext());
                zzawVar.f10106f.zzh(e10, "ClientApiBroker.createAdOverlay");
                return null;
            }
        }
        return zzawVar.f10105e.zza(activity);
    }
}
