package k7;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzcp;
import com.google.android.gms.ads.internal.client.zzeq;
import com.google.android.gms.ads.internal.client.zzey;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzp;
import com.google.android.gms.ads.internal.util.client.zzq;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzaxo;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbtq;
import com.google.android.gms.internal.ads.zzbts;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class k extends n {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f19628b;
    public final /* synthetic */ zzaw c;

    public k(zzaw zzawVar, Context context) {
        this.f19628b = context;
        this.c = zzawVar;
    }

    @Override // k7.n
    public final /* bridge */ /* synthetic */ Object a() {
        zzaw.b(this.f19628b, "mobile_ads_settings");
        return new zzey();
    }

    @Override // k7.n
    public final Object b(zzce zzceVar) {
        return zzceVar.zzg(new ObjectWrapper(this.f19628b), 242402000);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.google.android.gms.dynamic.ObjectWrapper, android.os.IInterface] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005f -> B:29:0x00a9). Please submit an issue!!! */
    @Override // k7.n
    public final Object c() {
        IBinder readStrongBinder;
        Object zzcmVar;
        zzaw zzawVar;
        ?? r02;
        Object zzcmVar2;
        Context context = this.f19628b;
        zzbbw.zza(context);
        boolean booleanValue = ((Boolean) zzba.f10115d.c.zza(zzbbw.zzjN)).booleanValue();
        zzaw zzawVar2 = this.c;
        if (booleanValue) {
            try {
                ObjectWrapper objectWrapper = new ObjectWrapper(context);
                zzcp zzcpVar = (zzcp) zzq.a(context, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", new zzo() { // from class: com.google.android.gms.ads.internal.client.zzap
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.ads.internal.util.client.zzo
                    public final Object zza(Object obj) {
                        if (obj == 0) {
                            return null;
                        }
                        IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                        if (queryLocalInterface instanceof zzcp) {
                            return (zzcp) queryLocalInterface;
                        }
                        return new zzcp(obj);
                    }
                });
                Parcel zza = zzcpVar.zza();
                zzaxo.zzf(zza, objectWrapper);
                zza.writeInt(242402000);
                Parcel zzdb = zzcpVar.zzdb(1, zza);
                readStrongBinder = zzdb.readStrongBinder();
                zzdb.recycle();
            } catch (RemoteException | zzp | NullPointerException e10) {
                zzbts zza2 = zzbtq.zza(context);
                zzawVar2.f10106f = zza2;
                zza2.zzh(e10, "ClientApiBroker.getMobileAdsSettingsManager");
                r02 = zza2;
                zzawVar = zzawVar2;
            }
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                if (queryLocalInterface instanceof zzco) {
                    zzcmVar = (zzco) queryLocalInterface;
                    context = context;
                    zzawVar2 = zzawVar2;
                } else {
                    zzcmVar = new zzcm(readStrongBinder);
                    context = context;
                    zzawVar2 = zzawVar2;
                }
                return zzcmVar;
            }
            r02 = context;
            zzawVar = zzawVar2;
        } else {
            zzeq zzeqVar = zzawVar2.c;
            zzeqVar.getClass();
            try {
                ?? objectWrapper2 = new ObjectWrapper(context);
                zzcp zzcpVar2 = (zzcp) zzeqVar.getRemoteCreatorInstance(context);
                Parcel zza3 = zzcpVar2.zza();
                zzaxo.zzf(zza3, objectWrapper2);
                zza3.writeInt(242402000);
                Parcel zzdb2 = zzcpVar2.zzdb(1, zza3);
                IBinder readStrongBinder2 = zzdb2.readStrongBinder();
                zzdb2.recycle();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                    if (queryLocalInterface2 instanceof zzco) {
                        zzcmVar2 = (zzco) queryLocalInterface2;
                    } else {
                        zzcmVar2 = new zzcm(readStrongBinder2);
                    }
                    return zzcmVar2;
                }
                r02 = zzdb2;
                zzawVar = objectWrapper2;
            } catch (RemoteException | RemoteCreator.RemoteCreatorException unused) {
                r02 = 5;
                zzm.g(5);
                zzawVar = zzawVar2;
            }
        }
        zzcmVar = null;
        context = r02;
        zzawVar2 = zzawVar;
        return zzcmVar;
    }
}
