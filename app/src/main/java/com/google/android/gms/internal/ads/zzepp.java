package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzepp implements zzevn {
    private final Integer zza;

    private zzepp(Integer num) {
        this.zza = num;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0063 -> B:23:0x0064). Please submit an issue!!! */
    public static zzepp zzb(VersionInfoParcel versionInfoParcel) {
        int i10;
        int i11;
        int extensionVersion;
        int extensionVersion2;
        zzbbn zzbbnVar = zzbbw.zzjg;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        zzbbu zzbbuVar = zzbaVar.c;
        zzbbu zzbbuVar2 = zzbaVar.c;
        if (((Boolean) zzbbuVar.zza(zzbbnVar)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
            try {
                i11 = Build.VERSION.SDK_INT;
            } catch (Exception e10) {
                com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "AdUtil.getAdServicesExtensionVersion");
            }
            if (i11 >= 30) {
                extensionVersion2 = SdkExtensions.getExtensionVersion(30);
                if (extensionVersion2 > 3) {
                    i10 = SdkExtensions.getExtensionVersion(1000000);
                    return new zzepp(Integer.valueOf(i10));
                }
            }
            if (((Boolean) zzbbuVar2.zza(zzbbw.zzjj)).booleanValue() && versionInfoParcel.c >= ((Integer) zzbbuVar2.zza(zzbbw.zzji)).intValue() && i11 >= 31) {
                extensionVersion = SdkExtensions.getExtensionVersion(31);
                if (extensionVersion >= 9) {
                    i10 = SdkExtensions.getExtensionVersion(31);
                    return new zzepp(Integer.valueOf(i10));
                }
            }
            i10 = 0;
            return new zzepp(Integer.valueOf(i10));
        }
        return new zzepp(null);
    }

    @Override // com.google.android.gms.internal.ads.zzevn
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Integer num = this.zza;
        Bundle bundle = (Bundle) obj;
        if (num != null) {
            bundle.putInt("aos", num.intValue());
        }
    }
}
