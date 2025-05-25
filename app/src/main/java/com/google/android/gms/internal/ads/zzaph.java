package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzaph implements Comparable {
    private final zzaps zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;
    private final zzapl zzf;
    private Integer zzg;
    private zzapk zzh;
    private boolean zzi;
    private zzaoq zzj;
    private zzapg zzk;
    private final zzaov zzl;

    public zzaph(int i10, String str, zzapl zzaplVar) {
        zzaps zzapsVar;
        Uri parse;
        String host;
        if (zzaps.zza) {
            zzapsVar = new zzaps();
        } else {
            zzapsVar = null;
        }
        this.zza = zzapsVar;
        this.zze = new Object();
        int i11 = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i10;
        this.zzc = str;
        this.zzf = zzaplVar;
        this.zzl = new zzaov();
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i11 = host.hashCode();
        }
        this.zzd = i11;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzaph) obj).zzg.intValue();
    }

    public final String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.zzd));
        zzw();
        Integer num = this.zzg;
        return "[ ] " + this.zzc + " " + "0x".concat(valueOf) + " NORMAL " + num;
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzl.zzb();
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzaoq zzd() {
        return this.zzj;
    }

    public final zzaph zze(zzaoq zzaoqVar) {
        this.zzj = zzaoqVar;
        return this;
    }

    public final zzaph zzf(zzapk zzapkVar) {
        this.zzh = zzapkVar;
        return this;
    }

    public final zzaph zzg(int i10) {
        this.zzg = Integer.valueOf(i10);
        return this;
    }

    public abstract zzapn zzh(zzapd zzapdVar);

    public final String zzj() {
        int i10 = this.zzb;
        String str = this.zzc;
        if (i10 != 0) {
            return androidx.activity.f.m(Integer.toString(1), "-", str);
        }
        return str;
    }

    public final String zzk() {
        return this.zzc;
    }

    public Map zzl() {
        return Collections.emptyMap();
    }

    public final void zzm(String str) {
        if (zzaps.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    public final void zzn(zzapq zzapqVar) {
        zzapl zzaplVar;
        synchronized (this.zze) {
            zzaplVar = this.zzf;
        }
        zzaplVar.zza(zzapqVar);
    }

    public abstract void zzo(Object obj);

    public final void zzp(String str) {
        zzapk zzapkVar = this.zzh;
        if (zzapkVar != null) {
            zzapkVar.zzb(this);
        }
        if (zzaps.zza) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzapf(this, str, id2));
                return;
            }
            this.zza.zza(str, id2);
            this.zza.zzb(toString());
        }
    }

    public final void zzq() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    public final void zzr() {
        zzapg zzapgVar;
        synchronized (this.zze) {
            zzapgVar = this.zzk;
        }
        if (zzapgVar != null) {
            zzapgVar.zza(this);
        }
    }

    public final void zzs(zzapn zzapnVar) {
        zzapg zzapgVar;
        synchronized (this.zze) {
            zzapgVar = this.zzk;
        }
        if (zzapgVar != null) {
            zzapgVar.zzb(this, zzapnVar);
        }
    }

    public final void zzt(int i10) {
        zzapk zzapkVar = this.zzh;
        if (zzapkVar != null) {
            zzapkVar.zzc(this, i10);
        }
    }

    public final void zzu(zzapg zzapgVar) {
        synchronized (this.zze) {
            this.zzk = zzapgVar;
        }
    }

    public final boolean zzv() {
        boolean z10;
        synchronized (this.zze) {
            z10 = this.zzi;
        }
        return z10;
    }

    public final boolean zzw() {
        synchronized (this.zze) {
        }
        return false;
    }

    public byte[] zzx() {
        return null;
    }

    public final zzaov zzy() {
        return this.zzl;
    }
}
