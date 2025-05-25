package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbyx {
    private final Clock zza;
    private final zzbzi zzb;
    private final String zze;
    private final String zzf;
    private final Object zzd = new Object();
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = 0;
    private long zzj = -1;
    private long zzk = -1;
    private final LinkedList zzc = new LinkedList();

    public zzbyx(Clock clock, zzbzi zzbziVar, String str, String str2) {
        this.zza = clock;
        this.zzb = zzbziVar;
        this.zze = str;
        this.zzf = str2;
    }

    public final Bundle zza() {
        Bundle bundle;
        synchronized (this.zzd) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.zze);
            bundle.putString("slotid", this.zzf);
            bundle.putBoolean("ismediation", false);
            bundle.putLong("treq", this.zzj);
            bundle.putLong("tresponse", this.zzk);
            bundle.putLong("timp", this.zzg);
            bundle.putLong("tload", this.zzh);
            bundle.putLong("pcc", this.zzi);
            bundle.putLong("tfetch", -1L);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                arrayList.add(((zzbyw) it.next()).zzb());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }

    public final String zzc() {
        return this.zze;
    }

    public final void zzd() {
        synchronized (this.zzd) {
            if (this.zzk != -1) {
                zzbyw zzbywVar = new zzbyw(this);
                zzbywVar.zzd();
                this.zzc.add(zzbywVar);
                this.zzi++;
                this.zzb.zzf();
                this.zzb.zze(this);
            }
        }
    }

    public final void zze() {
        synchronized (this.zzd) {
            if (this.zzk != -1 && !this.zzc.isEmpty()) {
                zzbyw zzbywVar = (zzbyw) this.zzc.getLast();
                if (zzbywVar.zza() == -1) {
                    zzbywVar.zzc();
                    this.zzb.zze(this);
                }
            }
        }
    }

    public final void zzf() {
        synchronized (this.zzd) {
            if (this.zzk != -1 && this.zzg == -1) {
                this.zzg = this.zza.b();
                this.zzb.zze(this);
            }
            this.zzb.zzg();
        }
    }

    public final void zzg() {
        synchronized (this.zzd) {
            this.zzb.zzh();
        }
    }

    public final void zzh(boolean z10) {
        synchronized (this.zzd) {
            if (this.zzk != -1) {
                this.zzh = this.zza.b();
            }
        }
    }

    public final void zzi() {
        synchronized (this.zzd) {
            this.zzb.zzi();
        }
    }

    public final void zzj(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        synchronized (this.zzd) {
            long b10 = this.zza.b();
            this.zzj = b10;
            this.zzb.zzj(zzlVar, b10);
        }
    }

    public final void zzk(long j10) {
        synchronized (this.zzd) {
            this.zzk = j10;
            if (j10 != -1) {
                this.zzb.zze(this);
            }
        }
    }
}
