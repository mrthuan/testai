package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcd {
    public final int zza;
    public final String zzb;
    public final int zzc;
    private final zzaf[] zzd;
    private int zze;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzcd(String str, zzaf... zzafVarArr) {
        boolean z10;
        int length = zzafVarArr.length;
        int i10 = 1;
        if (length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdi.zzd(z10);
        this.zzb = str;
        this.zzd = zzafVarArr;
        this.zza = length;
        int zzb = zzbn.zzb(zzafVarArr[0].zzm);
        this.zzc = zzb == -1 ? zzbn.zzb(zzafVarArr[0].zzl) : zzb;
        String zzc = zzc(zzafVarArr[0].zzd);
        int i11 = zzafVarArr[0].zzf | 16384;
        while (true) {
            zzaf[] zzafVarArr2 = this.zzd;
            if (i10 < zzafVarArr2.length) {
                if (!zzc.equals(zzc(zzafVarArr2[i10].zzd))) {
                    zzaf[] zzafVarArr3 = this.zzd;
                    zzd("languages", zzafVarArr3[0].zzd, zzafVarArr3[i10].zzd, i10);
                    return;
                }
                zzaf[] zzafVarArr4 = this.zzd;
                if (i11 != (zzafVarArr4[i10].zzf | 16384)) {
                    zzd("role flags", Integer.toBinaryString(zzafVarArr4[0].zzf), Integer.toBinaryString(this.zzd[i10].zzf), i10);
                    return;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    private static String zzc(String str) {
        if (str != null && !str.equals("und")) {
            return str;
        }
        return "";
    }

    private static void zzd(String str, String str2, String str3, int i10) {
        StringBuilder f10 = android.support.v4.media.session.h.f("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        f10.append(str3);
        f10.append("' (track ");
        f10.append(i10);
        f10.append(")");
        zzea.zzd("TrackGroup", "", new IllegalStateException(f10.toString()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcd.class == obj.getClass()) {
            zzcd zzcdVar = (zzcd) obj;
            if (this.zzb.equals(zzcdVar.zzb) && Arrays.equals(this.zzd, zzcdVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zze;
        if (i10 == 0) {
            int hashCode = Arrays.hashCode(this.zzd) + ((this.zzb.hashCode() + 527) * 31);
            this.zze = hashCode;
            return hashCode;
        }
        return i10;
    }

    public final int zza(zzaf zzafVar) {
        int i10 = 0;
        while (true) {
            zzaf[] zzafVarArr = this.zzd;
            if (i10 < zzafVarArr.length) {
                if (zzafVar == zzafVarArr[i10]) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public final zzaf zzb(int i10) {
        return this.zzd[i10];
    }
}
