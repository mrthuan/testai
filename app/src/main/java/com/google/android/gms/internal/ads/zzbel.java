package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbel {
    private final Context zza;

    public zzbel(Context context) {
        this.zza = context;
    }

    public final void zza(zzbtx zzbtxVar) {
        try {
            ((zzbem) com.google.android.gms.ads.internal.util.client.zzq.a(this.zza, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new com.google.android.gms.ads.internal.util.client.zzo() { // from class: com.google.android.gms.internal.ads.zzbek
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.ads.internal.util.client.zzo
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                    if (queryLocalInterface instanceof zzbem) {
                        return (zzbem) queryLocalInterface;
                    }
                    return new zzbem(obj);
                }
            })).zze(zzbtxVar);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e10.getMessage())));
        } catch (com.google.android.gms.ads.internal.util.client.zzp e11) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e11.getMessage())));
        }
    }
}
