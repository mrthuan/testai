package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfqj {
    final zzfqm zza;
    final boolean zzb;

    private zzfqj(zzfqm zzfqmVar) {
        boolean z10;
        this.zza = zzfqmVar;
        if (zzfqmVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.zzb = z10;
    }

    public static zzfqj zzb(Context context, String str, String str2) {
        zzfqm zzfqkVar;
        try {
            try {
                try {
                    IBinder b10 = DynamiteModule.c(context, DynamiteModule.f11410b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (b10 == null) {
                        zzfqkVar = null;
                    } else {
                        IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        if (queryLocalInterface instanceof zzfqm) {
                            zzfqkVar = (zzfqm) queryLocalInterface;
                        } else {
                            zzfqkVar = new zzfqk(b10);
                        }
                    }
                    zzfqkVar.zze(new ObjectWrapper(context), str, null);
                    return new zzfqj(zzfqkVar);
                } catch (Exception e10) {
                    throw new zzfpl(e10);
                }
            } catch (Exception e11) {
                throw new zzfpl(e11);
            }
        } catch (RemoteException | zzfpl | NullPointerException | SecurityException unused) {
            return new zzfqj(new zzfqn());
        }
    }

    public static zzfqj zzc() {
        return new zzfqj(new zzfqn());
    }

    public final zzfqi zza(byte[] bArr) {
        return new zzfqi(this, bArr, null);
    }
}
