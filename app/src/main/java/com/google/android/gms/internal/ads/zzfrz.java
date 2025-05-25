package com.google.android.gms.internal.ads;

import android.content.Context;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
class zzfrz {
    static final String zza = new UUID(0, 0).toString();
    final zzfsa zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;

    public zzfrz(Context context, String str, String str2, String str3) {
        this.zzb = zzfsa.zzb(context);
        this.zzc = str;
        this.zzd = str.concat("_3p");
        this.zze = str2;
        this.zzf = str2.concat("_3p");
        this.zzg = str3;
    }

    private final String zzh(String str, String str2, String str3) {
        String str4;
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes(androidx.activity.f.m(str, str2, str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        StringBuilder g10 = a0.d.g(this.zzg, ": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        String str5 = "null";
        if (str2 == null) {
            str4 = "null";
        } else {
            str4 = "not null";
        }
        g10.append(str4);
        g10.append(", hashKey is ");
        if (str3 != null) {
            str5 = "not null";
        }
        g10.append(str5);
        throw new IllegalArgumentException(g10.toString());
    }

    public final long zza(boolean z10) {
        String str;
        if (z10) {
            str = this.zzf;
        } else {
            str = this.zze;
        }
        return this.zzb.zza(str, -1L);
    }

    public final zzfry zzb(String str, String str2, long j10, boolean z10) {
        String str3;
        boolean z11 = true;
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(zza)) {
                    String zze = zze(true);
                    String zzc = this.zzb.zzc("paid_3p_hash_key", null);
                    if (zze != null && zzc != null && !zze.equals(zzh(str, str2, zzc))) {
                        return zzc(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new zzfry();
        }
        if (str == null) {
            z11 = false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= 0) {
            long zza2 = zza(z11);
            if (zza2 != -1) {
                if (currentTimeMillis < zza2) {
                    zzfsa zzfsaVar = this.zzb;
                    if (z11) {
                        str3 = this.zzf;
                    } else {
                        str3 = this.zze;
                    }
                    zzfsaVar.zzd(str3, Long.valueOf(currentTimeMillis));
                } else if (currentTimeMillis >= zza2 + j10) {
                    return zzc(str, str2);
                }
            }
            String zze2 = zze(z11);
            if (zze2 == null && !z10) {
                return zzc(str, str2);
            }
            return new zzfry(zze2, zza(z11));
        }
        throw new IllegalStateException(this.zzg.concat(": Invalid negative current timestamp. Updating PAID failed"));
    }

    public final zzfry zzc(String str, String str2) {
        if (str == null) {
            return zzd(UUID.randomUUID().toString(), false);
        }
        String uuid = UUID.randomUUID().toString();
        this.zzb.zzd("paid_3p_hash_key", uuid);
        return zzd(zzh(str, str2, uuid), true);
    }

    public final zzfry zzd(String str, boolean z10) {
        String str2;
        String str3;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= 0) {
            zzfsa zzfsaVar = this.zzb;
            if (z10) {
                str2 = this.zzf;
            } else {
                str2 = this.zze;
            }
            zzfsaVar.zzd(str2, Long.valueOf(currentTimeMillis));
            zzfsa zzfsaVar2 = this.zzb;
            if (z10) {
                str3 = this.zzd;
            } else {
                str3 = this.zzc;
            }
            zzfsaVar2.zzd(str3, str);
            return new zzfry(str, currentTimeMillis);
        }
        throw new IllegalStateException(this.zzg.concat(": Invalid negative current timestamp. Updating PAID failed"));
    }

    public final String zze(boolean z10) {
        String str;
        if (z10) {
            str = this.zzd;
        } else {
            str = this.zzc;
        }
        return this.zzb.zzc(str, null);
    }

    public final void zzf(boolean z10) {
        String str;
        String str2;
        if (z10) {
            str = this.zzf;
        } else {
            str = this.zze;
        }
        this.zzb.zze(str);
        zzfsa zzfsaVar = this.zzb;
        if (z10) {
            str2 = this.zzd;
        } else {
            str2 = this.zzc;
        }
        zzfsaVar.zze(str2);
    }

    public final boolean zzg(boolean z10) {
        return this.zzb.zzg(this.zzc);
    }
}
