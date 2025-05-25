package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzhdy extends zzgxy implements zzgzk {
    private static final zzhdy zza;
    private static volatile zzgzr zzb;
    private zzhdu zzC;
    private zzhcf zzE;
    private zzhbx zzG;
    private zzhcy zzI;
    private int zzJ;
    private long zzM;
    private zzhdx zzN;
    private zzhdd zzO;
    private int zzc;
    private int zzd;
    private int zze;
    private zzhcb zzi;
    private zzhdj zzm;
    private boolean zzn;
    private boolean zzu;
    private boolean zzv;
    private zzhdq zzx;
    private boolean zzy;
    private byte zzP = 2;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private zzgyk zzj = zzgxy.zzbK();
    private zzgyk zzk = zzgxy.zzbK();
    private String zzl = "";
    private zzgyk zzo = zzgxy.zzbK();
    private String zzp = "";
    private zzgwm zzw = zzgwm.zzb;
    private String zzz = "";
    private zzgyk zzA = zzgxy.zzbK();
    private zzgyk zzB = zzgxy.zzbK();
    private zzgyk zzD = zzgxy.zzbK();
    private String zzF = "";
    private zzgyk zzH = zzgxy.zzbK();
    private zzgyk zzK = zzgxy.zzbK();
    private zzgyk zzL = zzgxy.zzbK();

    static {
        zzhdy zzhdyVar = new zzhdy();
        zza = zzhdyVar;
        zzgxy.zzcb(zzhdy.class, zzhdyVar);
    }

    private zzhdy() {
    }

    public static zzhbz zzc() {
        return (zzhbz) zza.zzaZ();
    }

    public static /* synthetic */ void zzh(zzhdy zzhdyVar, String str) {
        str.getClass();
        zzhdyVar.zzc |= 4;
        zzhdyVar.zzf = str;
    }

    public static /* synthetic */ void zzi(zzhdy zzhdyVar, String str) {
        str.getClass();
        zzhdyVar.zzc |= 8;
        zzhdyVar.zzg = str;
    }

    public static /* synthetic */ void zzj(zzhdy zzhdyVar, zzhcb zzhcbVar) {
        zzhcbVar.getClass();
        zzhdyVar.zzi = zzhcbVar;
        zzhdyVar.zzc |= 32;
    }

    public static /* synthetic */ void zzk(zzhdy zzhdyVar, zzhdo zzhdoVar) {
        zzhdoVar.getClass();
        zzgyk zzgykVar = zzhdyVar.zzj;
        if (!zzgykVar.zzc()) {
            zzhdyVar.zzj = zzgxy.zzbL(zzgykVar);
        }
        zzhdyVar.zzj.add(zzhdoVar);
    }

    public static /* synthetic */ void zzl(zzhdy zzhdyVar, String str) {
        zzhdyVar.zzc |= 64;
        zzhdyVar.zzl = str;
    }

    public static /* synthetic */ void zzm(zzhdy zzhdyVar) {
        zzhdyVar.zzc &= -65;
        zzhdyVar.zzl = zza.zzl;
    }

    public static /* synthetic */ void zzn(zzhdy zzhdyVar, zzhdj zzhdjVar) {
        zzhdjVar.getClass();
        zzhdyVar.zzm = zzhdjVar;
        zzhdyVar.zzc |= 128;
    }

    public static /* synthetic */ void zzo(zzhdy zzhdyVar, zzhdq zzhdqVar) {
        zzhdqVar.getClass();
        zzhdyVar.zzx = zzhdqVar;
        zzhdyVar.zzc |= 8192;
    }

    public static /* synthetic */ void zzp(zzhdy zzhdyVar, Iterable iterable) {
        zzgyk zzgykVar = zzhdyVar.zzA;
        if (!zzgykVar.zzc()) {
            zzhdyVar.zzA = zzgxy.zzbL(zzgykVar);
        }
        zzgvv.zzaQ(iterable, zzhdyVar.zzA);
    }

    public static /* synthetic */ void zzq(zzhdy zzhdyVar, Iterable iterable) {
        zzgyk zzgykVar = zzhdyVar.zzB;
        if (!zzgykVar.zzc()) {
            zzhdyVar.zzB = zzgxy.zzbL(zzgykVar);
        }
        zzgvv.zzaQ(iterable, zzhdyVar.zzB);
    }

    public static /* synthetic */ void zzr(zzhdy zzhdyVar, int i10) {
        zzhdyVar.zzd = i10 - 1;
        zzhdyVar.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzgxy
    public final Object zzde(zzgxx zzgxxVar, Object obj, Object obj2) {
        byte b10 = 1;
        switch (zzgxxVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzP);
            case 1:
                if (obj == null) {
                    b10 = 0;
                }
                this.zzP = b10;
                return null;
            case 2:
                return zzgxy.zzbS(zza, "\u0001\"\u0000\u0001\u0001\"\"\u0000\t\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b ဂ\u0016!ဉ\u0017\"ဉ\u0018", new Object[]{"zzc", "zzf", "zzg", "zzh", "zzj", zzhdo.class, "zzn", "zzo", "zzp", "zzu", "zzv", "zzd", zzhdk.zza, "zze", zzhby.zza, "zzi", "zzl", "zzm", "zzw", "zzk", zzhec.class, "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", zzhei.class, "zzE", "zzF", "zzG", "zzH", zzhcj.class, "zzI", "zzJ", zzhds.zza, "zzK", zzhdb.class, "zzL", zzhdg.class, "zzM", "zzN", "zzO"});
            case 3:
                return new zzhdy();
            case 4:
                return new zzhbz(null);
            case 5:
                return zza;
            case 6:
                zzgzr zzgzrVar = zzb;
                if (zzgzrVar == null) {
                    synchronized (zzhdy.class) {
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

    public final String zze() {
        return this.zzl;
    }

    public final String zzf() {
        return this.zzf;
    }

    public final List zzg() {
        return this.zzj;
    }
}
