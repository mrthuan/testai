package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzwi {
    public static final zzwi zza = new zzwi(new zzcd[0]);
    public final int zzb;
    private final zzfxr zzc;
    private int zzd;

    static {
        Integer.toString(0, 36);
    }

    public zzwi(zzcd... zzcdVarArr) {
        this.zzc = zzfxr.zzl(zzcdVarArr);
        this.zzb = zzcdVarArr.length;
        int i10 = 0;
        while (i10 < this.zzc.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.zzc.size(); i12++) {
                if (((zzcd) this.zzc.get(i10)).equals(this.zzc.get(i12))) {
                    zzea.zzd("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzwi.class == obj.getClass()) {
            zzwi zzwiVar = (zzwi) obj;
            if (this.zzb == zzwiVar.zzb && this.zzc.equals(zzwiVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzd;
        if (i10 == 0) {
            int hashCode = this.zzc.hashCode();
            this.zzd = hashCode;
            return hashCode;
        }
        return i10;
    }

    public final int zza(zzcd zzcdVar) {
        int indexOf = this.zzc.indexOf(zzcdVar);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final zzcd zzb(int i10) {
        return (zzcd) this.zzc.get(i10);
    }

    public final zzfxr zzc() {
        return zzfxr.zzk(zzfyh.zzb(this.zzc, new zzful() { // from class: com.google.android.gms.internal.ads.zzwh
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj) {
                zzwi zzwiVar = zzwi.zza;
                return Integer.valueOf(((zzcd) obj).zzc);
            }
        }));
    }
}
