package k7;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbo;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzbr;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzeu;
import com.google.android.gms.ads.internal.client.zzi;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzp;
import com.google.android.gms.ads.internal.util.client.zzq;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzboi;
import com.google.android.gms.internal.ads.zzbom;
import com.google.android.gms.internal.ads.zzbtq;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class j extends n {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f19625b;
    public final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ zzbom f19626d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ zzaw f19627e;

    public j(zzaw zzawVar, Context context, String str, zzboi zzboiVar) {
        this.f19625b = context;
        this.c = str;
        this.f19626d = zzboiVar;
        this.f19627e = zzawVar;
    }

    @Override // k7.n
    public final /* bridge */ /* synthetic */ Object a() {
        zzaw.b(this.f19625b, "native_ad");
        return new zzeu();
    }

    @Override // k7.n
    public final Object b(zzce zzceVar) {
        return zzceVar.y0(new ObjectWrapper(this.f19625b), this.c, this.f19626d, 242402000);
    }

    @Override // k7.n
    public final Object c() {
        Object zzboVar;
        Object zzboVar2;
        Context context = this.f19625b;
        zzbbw.zza(context);
        boolean booleanValue = ((Boolean) zzba.f10115d.c.zza(zzbbw.zzjN)).booleanValue();
        zzbom zzbomVar = this.f19626d;
        String str = this.c;
        zzaw zzawVar = this.f19627e;
        if (booleanValue) {
            try {
                IBinder zze = ((zzbr) zzq.a(context, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", new zzo() { // from class: com.google.android.gms.ads.internal.client.zzan
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.ads.internal.util.client.zzo
                    public final Object zza(Object obj) {
                        if (obj == 0) {
                            return null;
                        }
                        IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                        if (queryLocalInterface instanceof zzbr) {
                            return (zzbr) queryLocalInterface;
                        }
                        return new zzbr(obj);
                    }
                })).zze(new ObjectWrapper(context), str, zzbomVar, 242402000);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                if (queryLocalInterface instanceof zzbq) {
                    zzboVar = (zzbq) queryLocalInterface;
                } else {
                    zzboVar = new zzbo(zze);
                }
                return zzboVar;
            } catch (RemoteException | zzp | NullPointerException e10) {
                zzawVar.f10106f = zzbtq.zza(context);
                zzawVar.f10106f.zzh(e10, "ClientApiBroker.createAdLoaderBuilder");
                return null;
            }
        }
        zzi zziVar = zzawVar.f10103b;
        zziVar.getClass();
        try {
            IBinder zze2 = ((zzbr) zziVar.getRemoteCreatorInstance(context)).zze(new ObjectWrapper(context), str, zzbomVar, 242402000);
            if (zze2 == null) {
                return null;
            }
            IInterface queryLocalInterface2 = zze2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (queryLocalInterface2 instanceof zzbq) {
                zzboVar2 = (zzbq) queryLocalInterface2;
            } else {
                zzboVar2 = new zzbo(zze2);
            }
            return zzboVar2;
        } catch (RemoteException | RemoteCreator.RemoteCreatorException unused) {
            zzm.g(5);
            return null;
        }
    }
}
