package com.google.android.gms.internal.ads;

import lib.zj.office.fc.hslf.record.SlideAtom;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzans {
    private final String zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private String zze;

    public zzans(int i10, int i11, int i12) {
        String str;
        if (i10 == Integer.MIN_VALUE) {
            str = "";
        } else {
            str = i10 + PackagingURIHelper.FORWARD_SLASH_STRING;
        }
        this.zza = str;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = SlideAtom.USES_MASTER_SLIDE_ID;
        this.zze = "";
    }

    private final void zzd() {
        if (this.zzd != Integer.MIN_VALUE) {
            return;
        }
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }

    public final int zza() {
        zzd();
        return this.zzd;
    }

    public final String zzb() {
        zzd();
        return this.zze;
    }

    public final void zzc() {
        int i10;
        int i11 = this.zzd;
        if (i11 == Integer.MIN_VALUE) {
            i10 = this.zzb;
        } else {
            i10 = i11 + this.zzc;
        }
        this.zzd = i10;
        String str = this.zza;
        this.zze = str + i10;
    }
}
