package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzayl {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final boolean zzd;
    private final zzaza zze;
    private final zzazi zzf;
    private int zzn;
    private final Object zzg = new Object();
    private final ArrayList zzh = new ArrayList();
    private final ArrayList zzi = new ArrayList();
    private final ArrayList zzj = new ArrayList();
    private int zzk = 0;
    private int zzl = 0;
    private int zzm = 0;
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";

    public zzayl(int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z10) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = z10;
        this.zze = new zzaza(i13);
        this.zzf = new zzazi(i14, i15, i16);
    }

    private final void zzp(String str, boolean z10, float f10, float f11, float f12, float f13) {
        if (str != null) {
            if (str.length() >= this.zzc) {
                synchronized (this.zzg) {
                    this.zzh.add(str);
                    this.zzk += str.length();
                    if (z10) {
                        this.zzi.add(str);
                        this.zzj.add(new zzayw(f10, f11, f12, f13, this.zzi.size() - 1));
                    }
                }
            }
        }
    }

    private static final String zzq(ArrayList arrayList, int i10) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            sb2.append((String) arrayList.get(i11));
            sb2.append(' ');
            i11++;
            if (sb2.length() > 100) {
                break;
            }
        }
        sb2.deleteCharAt(sb2.length() - 1);
        String sb3 = sb2.toString();
        if (sb3.length() < 100) {
            return sb3;
        }
        return sb3.substring(0, 100);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzayl)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((zzayl) obj).zzo;
        if (str == null || !str.equals(this.zzo)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.zzo.hashCode();
    }

    public final String toString() {
        ArrayList arrayList = this.zzh;
        int i10 = this.zzl;
        int i11 = this.zzn;
        int i12 = this.zzk;
        String zzq = zzq(arrayList, 100);
        String zzq2 = zzq(this.zzi, 100);
        String str = this.zzo;
        String str2 = this.zzp;
        String str3 = this.zzq;
        StringBuilder f10 = a0.d.f("ActivityContent fetchId: ", i10, " score:", i11, " total_length:");
        f10.append(i12);
        f10.append("\n text: ");
        f10.append(zzq);
        f10.append("\n viewableText");
        a6.h.l(f10, zzq2, "\n signture: ", str, "\n viewableSignture: ");
        return androidx.activity.f.o(f10, str2, "\n viewableSignatureForVertical: ", str3);
    }

    public final int zza(int i10, int i11) {
        if (this.zzd) {
            return this.zzb;
        }
        return (i11 * this.zzb) + (i10 * this.zza);
    }

    public final int zzb() {
        return this.zzn;
    }

    public final int zzc() {
        return this.zzk;
    }

    public final String zzd() {
        return this.zzo;
    }

    public final String zze() {
        return this.zzp;
    }

    public final String zzf() {
        return this.zzq;
    }

    public final void zzg() {
        synchronized (this.zzg) {
            this.zzm--;
        }
    }

    public final void zzh() {
        synchronized (this.zzg) {
            this.zzm++;
        }
    }

    public final void zzi() {
        synchronized (this.zzg) {
            this.zzn -= 100;
        }
    }

    public final void zzj(int i10) {
        this.zzl = i10;
    }

    public final void zzk(String str, boolean z10, float f10, float f11, float f12, float f13) {
        zzp(str, z10, f10, f11, f12, f13);
    }

    public final void zzl(String str, boolean z10, float f10, float f11, float f12, float f13) {
        zzp(str, z10, f10, f11, f12, f13);
        synchronized (this.zzg) {
            if (this.zzm < 0) {
                com.google.android.gms.ads.internal.util.client.zzm.b("ActivityContent: negative number of WebViews.");
            }
            zzm();
        }
    }

    public final void zzm() {
        synchronized (this.zzg) {
            try {
                int zza = zza(this.zzk, this.zzl);
                if (zza > this.zzn) {
                    this.zzn = zza;
                    com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
                    if (!zzuVar.f10557g.zzi().zzP()) {
                        this.zzo = this.zze.zza(this.zzh);
                        this.zzp = this.zze.zza(this.zzi);
                    }
                    if (!zzuVar.f10557g.zzi().zzQ()) {
                        this.zzq = this.zzf.zza(this.zzi, this.zzj);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzn() {
        synchronized (this.zzg) {
            int zza = zza(this.zzk, this.zzl);
            if (zza > this.zzn) {
                this.zzn = zza;
            }
        }
    }

    public final boolean zzo() {
        boolean z10;
        synchronized (this.zzg) {
            if (this.zzm == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }
}
