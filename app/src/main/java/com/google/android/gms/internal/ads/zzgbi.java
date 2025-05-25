package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzgbi extends zzgbo {
    private static final zzgct zza = new zzgct(zzgbi.class);
    private zzfxm zzb;
    private final boolean zzc;
    private final boolean zzf;

    public zzgbi(zzfxm zzfxmVar, boolean z10, boolean z11) {
        super(zzfxmVar.size());
        this.zzb = zzfxmVar;
        this.zzc = z10;
        this.zzf = z11;
    }

    private final void zzG(int i10, Future future) {
        try {
            zzf(i10, zzgcj.zzp(future));
        } catch (ExecutionException e10) {
            zzI(e10.getCause());
        } catch (Throwable th2) {
            zzI(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzH */
    public final void zzx(zzfxm zzfxmVar) {
        boolean z10;
        int zzA = zzA();
        int i10 = 0;
        if (zzA >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzfuu.zzk(z10, "Less than 0 remaining futures");
        if (zzA == 0) {
            if (zzfxmVar != null) {
                zzfzx it = zzfxmVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzG(i10, future);
                    }
                    i10++;
                }
            }
            zzF();
            zzu();
            zzy(2);
        }
    }

    private final void zzI(Throwable th2) {
        th2.getClass();
        if (this.zzc && !zzd(th2) && zzK(zzC(), th2)) {
            zzJ(th2);
        } else if (th2 instanceof Error) {
            zzJ(th2);
        }
    }

    private static void zzJ(Throwable th2) {
        String str;
        if (true != (th2 instanceof Error)) {
            str = "Got more than one input Future failure. Logging failures after the first";
        } else {
            str = "Input Future failed with Error";
        }
        zza.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", str, th2);
    }

    private static boolean zzK(Set set, Throwable th2) {
        while (th2 != null) {
            if (!set.add(th2)) {
                return false;
            }
            th2 = th2.getCause();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final String zza() {
        zzfxm zzfxmVar = this.zzb;
        if (zzfxmVar != null) {
            return "futures=".concat(zzfxmVar.toString());
        }
        return super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zzb() {
        zzfxm zzfxmVar = this.zzb;
        boolean z10 = true;
        zzy(1);
        boolean isCancelled = isCancelled();
        if (zzfxmVar == null) {
            z10 = false;
        }
        if (z10 & isCancelled) {
            boolean zzt = zzt();
            zzfzx it = zzfxmVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zzt);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbo
    public final void zze(Set set) {
        set.getClass();
        if (!isCancelled()) {
            Throwable zzl = zzl();
            Objects.requireNonNull(zzl);
            zzK(set, zzl);
        }
    }

    public abstract void zzf(int i10, Object obj);

    public abstract void zzu();

    public final void zzv() {
        final zzfxm zzfxmVar;
        Objects.requireNonNull(this.zzb);
        if (this.zzb.isEmpty()) {
            zzu();
        } else if (this.zzc) {
            zzfzx it = this.zzb.iterator();
            final int i10 = 0;
            while (it.hasNext()) {
                final y9.a aVar = (y9.a) it.next();
                aVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgbg
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzgbi.this.zzw(aVar, i10);
                    }
                }, zzgbx.INSTANCE);
                i10++;
            }
        } else {
            if (this.zzf) {
                zzfxmVar = this.zzb;
            } else {
                zzfxmVar = null;
            }
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzgbh
                @Override // java.lang.Runnable
                public final void run() {
                    zzgbi.this.zzx(zzfxmVar);
                }
            };
            zzfzx it2 = this.zzb.iterator();
            while (it2.hasNext()) {
                ((y9.a) it2.next()).addListener(runnable, zzgbx.INSTANCE);
            }
        }
    }

    public final /* synthetic */ void zzw(y9.a aVar, int i10) {
        try {
            if (aVar.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i10, aVar);
            }
        } finally {
            zzx(null);
        }
    }

    public void zzy(int i10) {
        this.zzb = null;
    }
}
