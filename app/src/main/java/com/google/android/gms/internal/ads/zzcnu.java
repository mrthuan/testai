package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcnu implements zzcwq, zzcye, zzcxk, com.google.android.gms.ads.internal.client.zza, zzcxg, zzdeh {
    private final Context zza;
    private final Executor zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    private final zzfex zze;
    private final zzfel zzf;
    private final zzflh zzg;
    private final zzffs zzh;
    private final zzauo zzi;
    private final zzbcz zzj;
    private final WeakReference zzk;
    private final WeakReference zzl;
    private final zzcvs zzm;
    private boolean zzn;
    private final AtomicBoolean zzo = new AtomicBoolean();

    public zzcnu(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, zzfex zzfexVar, zzfel zzfelVar, zzflh zzflhVar, zzffs zzffsVar, View view, zzcej zzcejVar, zzauo zzauoVar, zzbcz zzbczVar, zzbdb zzbdbVar, zzfkf zzfkfVar, zzcvs zzcvsVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = executor2;
        this.zzd = scheduledExecutorService;
        this.zze = zzfexVar;
        this.zzf = zzfelVar;
        this.zzg = zzflhVar;
        this.zzh = zzffsVar;
        this.zzi = zzauoVar;
        this.zzk = new WeakReference(view);
        this.zzl = new WeakReference(zzcejVar);
        this.zzj = zzbczVar;
        this.zzm = zzcvsVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List zzu() {
        Integer num;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzkx)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
            if (com.google.android.gms.ads.internal.util.zzt.b(this.zza)) {
                Object systemService = this.zza.getSystemService("display");
                if (systemService instanceof DisplayManager) {
                    num = Integer.valueOf(((DisplayManager) systemService).getDisplays().length);
                } else {
                    num = null;
                }
                if (num != null) {
                    Integer valueOf = Integer.valueOf(Math.min(num.intValue(), 20));
                    ArrayList arrayList = new ArrayList();
                    for (String str : this.zzf.zzd) {
                        arrayList.add(Uri.parse(str).buildUpon().appendQueryParameter("dspct", Integer.toString(valueOf.intValue())).toString());
                    }
                    return arrayList;
                }
            }
        }
        return this.zzf.zzd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv() {
        String str;
        int i10;
        List list = this.zzf.zzd;
        if (list != null && !list.isEmpty()) {
            zzbbn zzbbnVar = zzbbw.zzdf;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
            if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
                str = this.zzi.zzc().zzh(this.zza, (View) this.zzk.get(), null);
            } else {
                str = null;
            }
            if ((((Boolean) zzbaVar.c.zza(zzbbw.zzai)).booleanValue() && this.zze.zzb.zzb.zzh) || !((Boolean) zzbdr.zzh.zze()).booleanValue()) {
                this.zzh.zza(this.zzg.zzd(this.zze, this.zzf, false, str, null, zzu()));
                return;
            }
            if (((Boolean) zzbdr.zzg.zze()).booleanValue() && ((i10 = this.zzf.zzb) == 1 || i10 == 2 || i10 == 5)) {
                zzcej zzcejVar = (zzcej) this.zzl.get();
            }
            zzgcj.zzr((zzgca) zzgcj.zzo(zzgca.zzu(zzgcj.zzh(null)), ((Long) zzbaVar.c.zza(zzbbw.zzaM)).longValue(), TimeUnit.MILLISECONDS, this.zzd), new zzcnt(this, str), this.zzb);
        }
    }

    private final void zzw(final int i10, final int i11) {
        View view;
        if (i10 > 0 && ((view = (View) this.zzk.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnr
                @Override // java.lang.Runnable
                public final void run() {
                    zzcnu.this.zzp(i10, i11);
                }
            }, i11, TimeUnit.MILLISECONDS);
        } else {
            zzv();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if ((!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzai)).booleanValue() || !this.zze.zzb.zzb.zzh) && ((Boolean) zzbdr.zzd.zze()).booleanValue()) {
            zzgcj.zzr(zzgcj.zze(zzgca.zzu(this.zzj.zza()), Throwable.class, new zzful() { // from class: com.google.android.gms.internal.ads.zzcno
                @Override // com.google.android.gms.internal.ads.zzful
                public final Object apply(Object obj) {
                    Throwable th2 = (Throwable) obj;
                    return "failure_click_attok";
                }
            }, zzbzo.zzf), new zzcns(this), this.zzb);
            return;
        }
        zzffs zzffsVar = this.zzh;
        zzflh zzflhVar = this.zzg;
        zzfex zzfexVar = this.zze;
        zzfel zzfelVar = this.zzf;
        Context context = this.zza;
        List zzc = zzflhVar.zzc(zzfexVar, zzfelVar, zzfelVar.zzc);
        int i10 = 1;
        if (true == com.google.android.gms.ads.internal.zzu.B.f10557g.zzA(context)) {
            i10 = 2;
        }
        zzffsVar.zzc(zzc, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzds(zzbvn zzbvnVar, String str, String str2) {
        zzflh zzflhVar = this.zzg;
        zzfel zzfelVar = this.zzf;
        this.zzh.zza(zzflhVar.zze(zzfelVar, zzfelVar.zzh, zzbvnVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zze() {
        zzflh zzflhVar = this.zzg;
        zzfex zzfexVar = this.zze;
        zzfel zzfelVar = this.zzf;
        this.zzh.zza(zzflhVar.zzc(zzfexVar, zzfelVar, zzfelVar.zzi));
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzf() {
        zzflh zzflhVar = this.zzg;
        zzfex zzfexVar = this.zze;
        zzfel zzfelVar = this.zzf;
        this.zzh.zza(zzflhVar.zzc(zzfexVar, zzfelVar, zzfelVar.zzg));
    }

    public final /* synthetic */ void zzn() {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnq
            @Override // java.lang.Runnable
            public final void run() {
                zzcnu.this.zzv();
            }
        });
    }

    public final /* synthetic */ void zzo(int i10, int i11) {
        zzw(i10 - 1, i11);
    }

    public final /* synthetic */ void zzp(final int i10, final int i11) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnp
            @Override // java.lang.Runnable
            public final void run() {
                zzcnu.this.zzo(i10, i11);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzq(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbl)).booleanValue()) {
            this.zzh.zza(this.zzg.zzc(this.zze, this.zzf, zzflh.zzf(2, zzeVar.f10146a, this.zzf.zzo)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxk
    public final void zzr() {
        if (!this.zzo.compareAndSet(false, true)) {
            return;
        }
        zzbbn zzbbnVar = zzbbw.zzdo;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        int intValue = ((Integer) zzbaVar.c.zza(zzbbnVar)).intValue();
        if (intValue > 0) {
            zzw(intValue, ((Integer) zzbaVar.c.zza(zzbbw.zzdp)).intValue());
            return;
        }
        if (((Boolean) zzbaVar.c.zza(zzbbw.zzdn)).booleanValue()) {
            this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnn
                @Override // java.lang.Runnable
                public final void run() {
                    zzcnu.this.zzn();
                }
            });
        } else {
            zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final synchronized void zzs() {
        zzcvs zzcvsVar;
        if (this.zzn) {
            ArrayList arrayList = new ArrayList(zzu());
            arrayList.addAll(this.zzf.zzf);
            this.zzh.zza(this.zzg.zzd(this.zze, this.zzf, true, null, null, arrayList));
        } else {
            zzffs zzffsVar = this.zzh;
            zzflh zzflhVar = this.zzg;
            zzfex zzfexVar = this.zze;
            zzfel zzfelVar = this.zzf;
            zzffsVar.zza(zzflhVar.zzc(zzfexVar, zzfelVar, zzfelVar.zzm));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzdk)).booleanValue() && (zzcvsVar = this.zzm) != null) {
                List zzh = zzflh.zzh(zzflh.zzg(zzcvsVar.zzb().zzm, zzcvsVar.zza().zzg()), this.zzm.zza().zza());
                zzffs zzffsVar2 = this.zzh;
                zzflh zzflhVar2 = this.zzg;
                zzcvs zzcvsVar2 = this.zzm;
                zzffsVar2.zza(zzflhVar2.zzc(zzcvsVar2.zzc(), zzcvsVar2.zzb(), zzh));
            }
            zzffs zzffsVar3 = this.zzh;
            zzflh zzflhVar3 = this.zzg;
            zzfex zzfexVar2 = this.zze;
            zzfel zzfelVar2 = this.zzf;
            zzffsVar3.zza(zzflhVar3.zzc(zzfexVar2, zzfelVar2, zzfelVar2.zzf));
        }
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdeh
    public final void zzt() {
        zzflh zzflhVar = this.zzg;
        zzfex zzfexVar = this.zze;
        zzfel zzfelVar = this.zzf;
        this.zzh.zza(zzflhVar.zzc(zzfexVar, zzfelVar, zzfelVar.zzau));
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzc() {
    }
}
