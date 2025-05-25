package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgth extends zzgxy implements zzgzk {
    private static final zzgth zza;
    private static volatile zzgzr zzb;
    private int zzc;
    private zzgyk zzd = zzgxy.zzbK();

    static {
        zzgth zzgthVar = new zzgth();
        zza = zzgthVar;
        zzgxy.zzcb(zzgth.class, zzgthVar);
    }

    private zzgth() {
    }

    public static zzgte zzd() {
        return (zzgte) zza.zzaZ();
    }

    public static zzgth zzg(InputStream inputStream, zzgxi zzgxiVar) {
        return (zzgth) zzgxy.zzbu(zza, inputStream, zzgxiVar);
    }

    public static /* synthetic */ void zzj(zzgth zzgthVar, zzgtg zzgtgVar) {
        zzgtgVar.getClass();
        zzgyk zzgykVar = zzgthVar.zzd;
        if (!zzgykVar.zzc()) {
            zzgthVar.zzd = zzgxy.zzbL(zzgykVar);
        }
        zzgthVar.zzd.add(zzgtgVar);
    }

    public final int zza() {
        return this.zzd.size();
    }

    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
        switch (zzgxxVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return zzgxy.zzbS(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzc", "zzd", zzgtg.class});
            case 3:
                return new zzgth();
            case 4:
                return new zzgte(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzgth.class) {
                        zzgzrVar = zzb;
                        if (zzgzrVar == null) {
                            zzgzrVar = new zzgxt(zza);
                            zzb = zzgzrVar;
                        }
                    }
                }
                return zzgzrVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final zzgtg zze(int i10) {
        return (zzgtg) this.zzd.get(i10);
    }

    public final List zzh() {
        return this.zzd;
    }
}
