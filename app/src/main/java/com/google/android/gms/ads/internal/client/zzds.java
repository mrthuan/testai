package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxn;
import com.google.android.gms.internal.ads.zzaxo;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public abstract class zzds extends zzaxn implements zzdt {
    public zzds() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.zzaxn
    public final boolean zzdF(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return false;
                        }
                        boolean zzg = zzaxo.zzg(parcel);
                        zzaxo.zzc(parcel);
                        ((zzfj) this).q0(zzg);
                    } else {
                        ((zzfj) this).zze();
                    }
                } else {
                    ((zzfj) this).zzg();
                }
            } else {
                ((zzfj) this).zzh();
            }
        } else {
            ((zzfj) this).zzi();
        }
        parcel2.writeNoException();
        return true;
    }
}
