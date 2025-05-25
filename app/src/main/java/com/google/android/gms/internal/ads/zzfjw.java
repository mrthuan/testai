package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfjw implements zzfju {
    private final Context zza;
    private final int zzp;
    private long zzb = 0;
    private long zzc = -1;
    private boolean zzd = false;
    private int zzq = 2;
    private int zzr = 2;
    private int zze = 0;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private zzfkl zzj = zzfkl.SCAR_REQUEST_TYPE_UNSPECIFIED;
    private String zzk = "";
    private String zzl = "";
    private String zzm = "";
    private boolean zzn = false;
    private boolean zzo = false;

    public zzfjw(Context context, int i10) {
        this.zza = context;
        this.zzp = i10;
    }

    public final synchronized zzfjw zzA() {
        com.google.android.gms.ads.internal.zzu.B.f10560j.getClass();
        this.zzc = SystemClock.elapsedRealtime();
        return this;
    }

    public final synchronized zzfjw zzK(int i10) {
        this.zzq = i10;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfju
    public final /* bridge */ /* synthetic */ zzfju zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzr(zzeVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfju
    public final /* bridge */ /* synthetic */ zzfju zzb(zzfew zzfewVar) {
        zzs(zzfewVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfju
    public final /* bridge */ /* synthetic */ zzfju zzc(String str) {
        zzt(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfju
    public final /* bridge */ /* synthetic */ zzfju zzd(String str) {
        zzu(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfju
    public final /* bridge */ /* synthetic */ zzfju zze(String str) {
        zzv(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfju
    public final /* bridge */ /* synthetic */ zzfju zzf(zzfkl zzfklVar) {
        zzw(zzfklVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfju
    public final /* bridge */ /* synthetic */ zzfju zzg(boolean z10) {
        zzx(z10);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfju
    public final /* bridge */ /* synthetic */ zzfju zzh(Throwable th2) {
        zzy(th2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfju
    public final /* bridge */ /* synthetic */ zzfju zzi() {
        zzz();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfju
    public final /* bridge */ /* synthetic */ zzfju zzj() {
        zzA();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfju
    public final synchronized boolean zzk() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzfju
    public final boolean zzl() {
        if (!TextUtils.isEmpty(this.zzh)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfju
    public final synchronized zzfjy zzm() {
        if (this.zzn) {
            return null;
        }
        this.zzn = true;
        if (!this.zzo) {
            zzz();
        }
        if (this.zzc < 0) {
            zzA();
        }
        return new zzfjy(this, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfju
    public final /* bridge */ /* synthetic */ zzfju zzn(int i10) {
        zzK(i10);
        return this;
    }

    public final synchronized zzfjw zzr(com.google.android.gms.ads.internal.client.zze zzeVar) {
        IBinder iBinder = zzeVar.f10149e;
        if (iBinder != null) {
            zzcwj zzcwjVar = (zzcwj) iBinder;
            String zzk = zzcwjVar.zzk();
            if (!TextUtils.isEmpty(zzk)) {
                this.zzf = zzk;
            }
            String zzi = zzcwjVar.zzi();
            if (!TextUtils.isEmpty(zzi)) {
                this.zzg = zzi;
            }
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x002b, code lost:
        r2.zzg = r0.zzab;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.google.android.gms.internal.ads.zzfjw zzs(com.google.android.gms.internal.ads.zzfew r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzfeo r0 = r3.zzb     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r0.zzb     // Catch: java.lang.Throwable -> L31
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L11
            com.google.android.gms.internal.ads.zzfeo r0 = r3.zzb     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r0.zzb     // Catch: java.lang.Throwable -> L31
            r2.zzf = r0     // Catch: java.lang.Throwable -> L31
        L11:
            java.util.List r3 = r3.zza     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L31
        L17:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.internal.ads.zzfel r0 = (com.google.android.gms.internal.ads.zzfel) r0     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = r0.zzab     // Catch: java.lang.Throwable -> L31
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L17
            java.lang.String r3 = r0.zzab     // Catch: java.lang.Throwable -> L31
            r2.zzg = r3     // Catch: java.lang.Throwable -> L31
        L2f:
            monitor-exit(r2)
            return r2
        L31:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfjw.zzs(com.google.android.gms.internal.ads.zzfew):com.google.android.gms.internal.ads.zzfjw");
    }

    public final synchronized zzfjw zzt(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzhV)).booleanValue()) {
            this.zzm = str;
        }
        return this;
    }

    public final synchronized zzfjw zzu(String str) {
        this.zzh = str;
        return this;
    }

    public final synchronized zzfjw zzv(String str) {
        this.zzi = str;
        return this;
    }

    public final synchronized zzfjw zzw(zzfkl zzfklVar) {
        this.zzj = zzfklVar;
        return this;
    }

    public final synchronized zzfjw zzx(boolean z10) {
        this.zzd = z10;
        return this;
    }

    public final synchronized zzfjw zzy(Throwable th2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzhV)).booleanValue()) {
            this.zzl = zzbtq.zzf(th2);
            this.zzk = (String) zzfvh.zzb(zzfui.zzc('\n')).zzc(zzbtq.zze(th2)).iterator().next();
        }
        return this;
    }

    public final synchronized zzfjw zzz() {
        Configuration configuration;
        com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
        this.zze = zzuVar.f10555e.h(this.zza);
        Resources resources = this.zza.getResources();
        int i10 = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i10 = configuration.orientation == 2 ? 4 : 3;
        }
        this.zzr = i10;
        zzuVar.f10560j.getClass();
        this.zzb = SystemClock.elapsedRealtime();
        this.zzo = true;
        return this;
    }
}
