package com.google.android.gms.internal.ads;

import android.text.Layout;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzale {
    private String zza;
    private int zzb;
    private boolean zzc;
    private int zzd;
    private boolean zze;
    private float zzk;
    private String zzl;
    private Layout.Alignment zzo;
    private Layout.Alignment zzp;
    private zzakx zzr;
    private int zzf = -1;
    private int zzg = -1;
    private int zzh = -1;
    private int zzi = -1;
    private int zzj = -1;
    private int zzm = -1;
    private int zzn = -1;
    private int zzq = -1;
    private float zzs = Float.MAX_VALUE;

    public final zzale zzA(boolean z10) {
        this.zzq = z10 ? 1 : 0;
        return this;
    }

    public final zzale zzB(zzakx zzakxVar) {
        this.zzr = zzakxVar;
        return this;
    }

    public final zzale zzC(boolean z10) {
        this.zzg = z10 ? 1 : 0;
        return this;
    }

    public final String zzD() {
        return this.zza;
    }

    public final String zzE() {
        return this.zzl;
    }

    public final boolean zzF() {
        if (this.zzq == 1) {
            return true;
        }
        return false;
    }

    public final boolean zzG() {
        return this.zze;
    }

    public final boolean zzH() {
        return this.zzc;
    }

    public final boolean zzI() {
        if (this.zzf == 1) {
            return true;
        }
        return false;
    }

    public final boolean zzJ() {
        if (this.zzg == 1) {
            return true;
        }
        return false;
    }

    public final float zza() {
        return this.zzk;
    }

    public final float zzb() {
        return this.zzs;
    }

    public final int zzc() {
        if (this.zze) {
            return this.zzd;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public final int zzd() {
        if (this.zzc) {
            return this.zzb;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public final int zze() {
        return this.zzj;
    }

    public final int zzf() {
        return this.zzn;
    }

    public final int zzg() {
        return this.zzm;
    }

    public final int zzh() {
        int i10;
        int i11 = this.zzh;
        if (i11 == -1 && this.zzi == -1) {
            return -1;
        }
        int i12 = 0;
        if (i11 == 1) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (this.zzi == 1) {
            i12 = 2;
        }
        return i10 | i12;
    }

    public final Layout.Alignment zzi() {
        return this.zzp;
    }

    public final Layout.Alignment zzj() {
        return this.zzo;
    }

    public final zzakx zzk() {
        return this.zzr;
    }

    public final zzale zzl(zzale zzaleVar) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (zzaleVar != null) {
            if (!this.zzc && zzaleVar.zzc) {
                zzo(zzaleVar.zzb);
            }
            if (this.zzh == -1) {
                this.zzh = zzaleVar.zzh;
            }
            if (this.zzi == -1) {
                this.zzi = zzaleVar.zzi;
            }
            if (this.zza == null && (str = zzaleVar.zza) != null) {
                this.zza = str;
            }
            if (this.zzf == -1) {
                this.zzf = zzaleVar.zzf;
            }
            if (this.zzg == -1) {
                this.zzg = zzaleVar.zzg;
            }
            if (this.zzn == -1) {
                this.zzn = zzaleVar.zzn;
            }
            if (this.zzo == null && (alignment2 = zzaleVar.zzo) != null) {
                this.zzo = alignment2;
            }
            if (this.zzp == null && (alignment = zzaleVar.zzp) != null) {
                this.zzp = alignment;
            }
            if (this.zzq == -1) {
                this.zzq = zzaleVar.zzq;
            }
            if (this.zzj == -1) {
                this.zzj = zzaleVar.zzj;
                this.zzk = zzaleVar.zzk;
            }
            if (this.zzr == null) {
                this.zzr = zzaleVar.zzr;
            }
            if (this.zzs == Float.MAX_VALUE) {
                this.zzs = zzaleVar.zzs;
            }
            if (!this.zze && zzaleVar.zze) {
                zzm(zzaleVar.zzd);
            }
            if (this.zzm == -1 && (i10 = zzaleVar.zzm) != -1) {
                this.zzm = i10;
            }
        }
        return this;
    }

    public final zzale zzm(int i10) {
        this.zzd = i10;
        this.zze = true;
        return this;
    }

    public final zzale zzn(boolean z10) {
        this.zzh = z10 ? 1 : 0;
        return this;
    }

    public final zzale zzo(int i10) {
        this.zzb = i10;
        this.zzc = true;
        return this;
    }

    public final zzale zzp(String str) {
        this.zza = str;
        return this;
    }

    public final zzale zzq(float f10) {
        this.zzk = f10;
        return this;
    }

    public final zzale zzr(int i10) {
        this.zzj = i10;
        return this;
    }

    public final zzale zzs(String str) {
        this.zzl = str;
        return this;
    }

    public final zzale zzt(boolean z10) {
        this.zzi = z10 ? 1 : 0;
        return this;
    }

    public final zzale zzu(boolean z10) {
        this.zzf = z10 ? 1 : 0;
        return this;
    }

    public final zzale zzv(Layout.Alignment alignment) {
        this.zzp = alignment;
        return this;
    }

    public final zzale zzw(int i10) {
        this.zzn = i10;
        return this;
    }

    public final zzale zzx(int i10) {
        this.zzm = i10;
        return this;
    }

    public final zzale zzy(float f10) {
        this.zzs = f10;
        return this;
    }

    public final zzale zzz(Layout.Alignment alignment) {
        this.zzo = alignment;
        return this;
    }
}
