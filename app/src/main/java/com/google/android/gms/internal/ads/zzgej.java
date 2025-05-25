package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgej {
    private final zzgth zza;
    private final List zzb;
    private final zzgln zzc;

    public /* synthetic */ zzgej(zzgth zzgthVar, List list, zzgln zzglnVar, zzgei zzgeiVar) {
        this.zza = zzgthVar;
        this.zzb = list;
        this.zzc = zzglnVar;
    }

    public static final zzgej zza(zzgth zzgthVar) {
        zzh(zzgthVar);
        return new zzgej(zzgthVar, zzg(zzgthVar));
    }

    public static final zzgej zzb(zzgen zzgenVar) {
        zzgef zzgefVar = new zzgef();
        zzged zzgedVar = new zzged(zzgenVar, null);
        zzgedVar.zzd();
        zzgedVar.zzc();
        zzgefVar.zza(zzgedVar);
        return zzgefVar.zzb();
    }

    public static /* bridge */ /* synthetic */ void zze(zzgth zzgthVar) {
        zzh(zzgthVar);
    }

    private final Object zzf(zzgkx zzgkxVar, Class cls, Class cls2) {
        boolean z10;
        int i10 = zzgeu.zza;
        zzgth zzgthVar = this.zza;
        int zzc = zzgthVar.zzc();
        int i11 = 0;
        boolean z11 = false;
        boolean z12 = true;
        for (zzgtg zzgtgVar : zzgthVar.zzh()) {
            if (zzgtgVar.zzk() == 3) {
                if (zzgtgVar.zzj()) {
                    if (zzgtgVar.zzf() != zzgtz.UNKNOWN_PREFIX) {
                        if (zzgtgVar.zzk() != 2) {
                            if (zzgtgVar.zza() == zzc) {
                                if (!z11) {
                                    z11 = true;
                                } else {
                                    throw new GeneralSecurityException("keyset contains multiple primary keys");
                                }
                            }
                            if (zzgtgVar.zzc().zzc() != zzgsu.ASYMMETRIC_PUBLIC) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            z12 &= z10;
                            i11++;
                        } else {
                            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzgtgVar.zza())));
                        }
                    } else {
                        throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzgtgVar.zza())));
                    }
                } else {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzgtgVar.zza())));
                }
            }
        }
        if (i11 != 0) {
            if (!z11 && !z12) {
                throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
            }
            zzgnf zzb = zzgnj.zzb(cls2);
            zzb.zzc(this.zzc);
            for (int i12 = 0; i12 < this.zzb.size(); i12++) {
                zzgtg zze = this.zza.zze(i12);
                if (zze.zzk() == 3) {
                    zzgeh zzgehVar = (zzgeh) this.zzb.get(i12);
                    if (zzgehVar != null) {
                        zzgdy zza = zzgehVar.zza();
                        try {
                            Object zzc2 = zzgmh.zza().zzc(zza, cls2);
                            if (zze.zza() == this.zza.zzc()) {
                                zzb.zzb(zzc2, zza, zze);
                            } else {
                                zzb.zza(zzc2, zza, zze);
                            }
                        } catch (GeneralSecurityException e10) {
                            throw new GeneralSecurityException(a0.d.d("Unable to get primitive ", cls2.toString(), " for key of type ", zze.zzc().zzg(), ", see https://developers.google.com/tink/faq/registration_errors"), e10);
                        }
                    } else {
                        throw new GeneralSecurityException("Key parsing of key with index " + i12 + " and type_url " + zze.zzc().zzg() + " failed, unable to get primitive");
                    }
                }
            }
            zzgnj zzd = zzb.zzd();
            int i13 = zzgeq.zza;
            return zzgmh.zza().zzd(zzd, cls);
        }
        throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
    }

    private static List zzg(zzgth zzgthVar) {
        Integer valueOf;
        zzgdy zza;
        zzgea zzgeaVar;
        boolean z10;
        ArrayList arrayList = new ArrayList(zzgthVar.zza());
        for (zzgtg zzgtgVar : zzgthVar.zzh()) {
            int zza2 = zzgtgVar.zza();
            try {
                int zza3 = zzgtgVar.zza();
                if (zzgtgVar.zzf() == zzgtz.RAW) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(zza3);
                }
                zzgnl zza4 = zzgnl.zza(zzgtgVar.zzc().zzg(), zzgtgVar.zzc().zzf(), zzgtgVar.zzc().zzc(), zzgtgVar.zzf(), valueOf);
                zzgmk zzc = zzgmk.zzc();
                zzger zza5 = zzger.zza();
                if (!zzc.zzj(zza4)) {
                    zza = new zzglj(zza4, zza5);
                } else {
                    zza = zzc.zza(zza4, zza5);
                }
                int zzk = zzgtgVar.zzk() - 2;
                if (zzk != 1) {
                    if (zzk != 2) {
                        if (zzk == 3) {
                            zzgeaVar = zzgea.zzc;
                        } else {
                            throw new GeneralSecurityException("Unknown key status");
                            break;
                        }
                    } else {
                        zzgeaVar = zzgea.zzb;
                    }
                } else {
                    zzgeaVar = zzgea.zza;
                }
                zzgea zzgeaVar2 = zzgeaVar;
                if (zza2 == zzgthVar.zzc()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(new zzgeh(zza, zzgeaVar2, zza2, z10, null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static void zzh(zzgth zzgthVar) {
        if (zzgthVar != null && zzgthVar.zza() > 0) {
            return;
        }
        throw new GeneralSecurityException("empty keyset");
    }

    public final String toString() {
        int i10 = zzgeu.zza;
        zzgtj zza = zzgtm.zza();
        zzgth zzgthVar = this.zza;
        zza.zzb(zzgthVar.zzc());
        for (zzgtg zzgtgVar : zzgthVar.zzh()) {
            zzgtk zza2 = zzgtl.zza();
            zza2.zzc(zzgtgVar.zzc().zzg());
            zza2.zzd(zzgtgVar.zzk());
            zza2.zzb(zzgtgVar.zzf());
            zza2.zza(zzgtgVar.zza());
            zza.zza((zzgtl) zza2.zzbr());
        }
        return ((zzgtm) zza.zzbr()).toString();
    }

    public final zzgth zzc() {
        return this.zza;
    }

    public final Object zzd(zzgds zzgdsVar, Class cls) {
        Class zza = zzgeq.zza(cls);
        if (zza != null) {
            return zzf((zzgkx) zzgdsVar, cls, zza);
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
    }

    private zzgej(zzgth zzgthVar, List list) {
        this.zza = zzgthVar;
        this.zzb = list;
        this.zzc = zzgln.zza;
    }
}
