package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbom;
import com.google.android.gms.internal.ads.zzbtq;
import com.google.android.gms.internal.ads.zzbts;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class zzk extends RemoteCreator {

    /* renamed from: a  reason: collision with root package name */
    public zzbts f10199a;

    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    public final zzbu a(Context context, zzq zzqVar, String str, zzbom zzbomVar, int i10) {
        zzbu zzbsVar;
        zzbu zzbsVar2;
        zzbbw.zza(context);
        if (((Boolean) zzba.f10115d.c.zza(zzbbw.zzjN)).booleanValue()) {
            try {
                IBinder K = ((zzbv) com.google.android.gms.ads.internal.util.client.zzq.a(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzo() { // from class: com.google.android.gms.ads.internal.client.zzj
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.ads.internal.util.client.zzo
                    public final Object zza(Object obj) {
                        if (obj == 0) {
                            return null;
                        }
                        IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                        if (queryLocalInterface instanceof zzbv) {
                            return (zzbv) queryLocalInterface;
                        }
                        return new zzbv(obj);
                    }
                })).K(new ObjectWrapper(context), zzqVar, str, zzbomVar, i10);
                if (K == null) {
                    return null;
                }
                IInterface queryLocalInterface = K.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                if (queryLocalInterface instanceof zzbu) {
                    zzbsVar = (zzbu) queryLocalInterface;
                } else {
                    zzbsVar = new zzbs(K);
                }
                return zzbsVar;
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzp | NullPointerException e10) {
                zzbts zza = zzbtq.zza(context);
                this.f10199a = zza;
                zza.zzh(e10, "AdManagerCreator.newAdManagerByDynamiteLoader");
                com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
                return null;
            }
        }
        try {
            IBinder K2 = ((zzbv) getRemoteCreatorInstance(context)).K(new ObjectWrapper(context), zzqVar, str, zzbomVar, i10);
            if (K2 == null) {
                return null;
            }
            IInterface queryLocalInterface2 = K2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface2 instanceof zzbu) {
                zzbsVar2 = (zzbu) queryLocalInterface2;
            } else {
                zzbsVar2 = new zzbs(K2);
            }
            return zzbsVar2;
        } catch (RemoteException | RemoteCreator.RemoteCreatorException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(3);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (queryLocalInterface instanceof zzbv) {
            return (zzbv) queryLocalInterface;
        }
        return new zzbv(iBinder);
    }
}
