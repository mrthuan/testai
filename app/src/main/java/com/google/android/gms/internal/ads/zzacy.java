package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzacy {
    private static final Pattern zzc = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int zza = -1;
    public int zzb = -1;

    private final boolean zzc(String str) {
        Matcher matcher = zzc.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                int i10 = zzet.zza;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.zza = parseInt;
                    this.zzb = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final boolean zza() {
        if (this.zza != -1 && this.zzb != -1) {
            return true;
        }
        return false;
    }

    public final boolean zzb(zzbk zzbkVar) {
        for (int i10 = 0; i10 < zzbkVar.zza(); i10++) {
            zzbj zzb = zzbkVar.zzb(i10);
            if (zzb instanceof zzafx) {
                zzafx zzafxVar = (zzafx) zzb;
                if ("iTunSMPB".equals(zzafxVar.zzb) && zzc(zzafxVar.zzc)) {
                    return true;
                }
            } else if (zzb instanceof zzagg) {
                zzagg zzaggVar = (zzagg) zzb;
                if ("com.apple.iTunes".equals(zzaggVar.zza) && "iTunSMPB".equals(zzaggVar.zzb) && zzc(zzaggVar.zzc)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
