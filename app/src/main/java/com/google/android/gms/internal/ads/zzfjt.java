package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzfjt {
    public static zzfju zza(Context context, int i10) {
        boolean booleanValue;
        if (zzfki.zza()) {
            int i11 = i10 - 2;
            if (i11 != 20 && i11 != 21) {
                switch (i11) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        booleanValue = ((Boolean) zzbdl.zzc.zze()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        booleanValue = ((Boolean) zzbdl.zzd.zze()).booleanValue();
                        break;
                    case 5:
                        booleanValue = ((Boolean) zzbdl.zzb.zze()).booleanValue();
                        break;
                }
            } else {
                booleanValue = ((Boolean) zzbdl.zze.zze()).booleanValue();
            }
            if (booleanValue) {
                return new zzfjw(context, i10);
            }
        }
        return new zzfky();
    }

    public static zzfju zzb(Context context, int i10, int i11, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        zzfju zza = zza(context, i10);
        if (zza instanceof zzfjw) {
            zza.zzi();
            zza.zzn(i11);
            zza.zzf(com.google.android.gms.ads.nonagon.signalgeneration.zzq.a(zzlVar.f10211m));
            String str = zzlVar.f10214p;
            if (zzfke.zze(str)) {
                zza.zze(str);
            }
        }
        return zza;
    }
}
