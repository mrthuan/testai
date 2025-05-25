package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgef {
    private final List zza = new ArrayList();
    private final zzgln zzb = zzgln.zza;
    private boolean zzc = false;

    public final void zzd() {
        for (zzged zzgedVar : this.zza) {
            zzgedVar.zza = false;
        }
    }

    public final zzgef zza(zzged zzgedVar) {
        zzgef zzgefVar;
        boolean z10;
        zzgefVar = zzgedVar.zzf;
        if (zzgefVar == null) {
            z10 = zzgedVar.zza;
            if (z10) {
                zzd();
            }
            zzgedVar.zzf = this;
            this.zza.add(zzgedVar);
            return this;
        }
        throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
    }

    public final zzgej zzb() {
        zzgee zzgeeVar;
        zzgee zzgeeVar2;
        zzgee zzgeeVar3;
        zzgen zzgenVar;
        Integer num;
        zzgen zzgenVar2;
        zzgea zzgeaVar;
        boolean z10;
        zzgea zzgeaVar2;
        int i10;
        boolean z11;
        zzgea zzgeaVar3;
        zzgee zzgeeVar4;
        zzgee zzgeeVar5;
        zzgee zzgeeVar6;
        zzgee zzgeeVar7;
        zzgea unused;
        zzgee unused2;
        if (!this.zzc) {
            char c = 1;
            this.zzc = true;
            List list = this.zza;
            zzgte zzd = zzgth.zzd();
            ArrayList arrayList = new ArrayList(list.size());
            List list2 = this.zza;
            int i11 = 0;
            int i12 = 0;
            while (i12 < list2.size() - 1) {
                int i13 = i12 + 1;
                zzgeeVar4 = ((zzged) list2.get(i12)).zze;
                zzgeeVar5 = zzgee.zza;
                if (zzgeeVar4 == zzgeeVar5) {
                    zzgeeVar6 = ((zzged) list2.get(i13)).zze;
                    zzgeeVar7 = zzgee.zza;
                    if (zzgeeVar6 != zzgeeVar7) {
                        throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                    }
                }
                i12 = i13;
            }
            HashSet hashSet = new HashSet();
            Integer num2 = null;
            for (zzged zzgedVar : this.zza) {
                unused = zzgedVar.zzb;
                zzgeeVar = zzgedVar.zze;
                if (zzgeeVar != null) {
                    zzgeeVar2 = zzgedVar.zze;
                    zzgeeVar3 = zzgee.zza;
                    int i14 = 4;
                    if (zzgeeVar2 != zzgeeVar3) {
                        unused2 = zzgedVar.zze;
                        i11 = 0;
                    } else {
                        int i15 = i11;
                        while (true) {
                            if (i11 != 0 && !hashSet.contains(Integer.valueOf(i11))) {
                                break;
                            }
                            SecureRandom secureRandom = new SecureRandom();
                            byte[] bArr = new byte[i14];
                            int i16 = i14;
                            int i17 = i15;
                            while (i15 == 0) {
                                secureRandom.nextBytes(bArr);
                                i15 = ((bArr[i17] & 255) << 24) | ((bArr[c] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                                i17 = 0;
                                i16 = 4;
                            }
                            i11 = i15;
                            i15 = i17;
                            i14 = i16;
                        }
                    }
                    Integer valueOf = Integer.valueOf(i11);
                    if (!hashSet.contains(valueOf)) {
                        hashSet.add(valueOf);
                        zzged.zza(zzgedVar);
                        zzgenVar = zzgedVar.zzd;
                        if (c != zzgenVar.zza()) {
                            num = null;
                        } else {
                            num = valueOf;
                        }
                        zzgma zzb = zzgma.zzb();
                        zzgenVar2 = zzgedVar.zzd;
                        zzgdy zza = zzb.zza(zzgenVar2, num);
                        zzgeaVar = zzgedVar.zzb;
                        z10 = zzgedVar.zza;
                        HashSet hashSet2 = hashSet;
                        zzgeh zzgehVar = new zzgeh(zza, zzgeaVar, i11, z10, null);
                        zzgeaVar2 = zzgedVar.zzb;
                        zzgnl zzgnlVar = (zzgnl) zzgmk.zzc().zzd(zza, zzgnl.class, zzger.zza());
                        Integer zzf = zzgnlVar.zzf();
                        if (zzf != null && zzf.intValue() != i11) {
                            throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                        }
                        zzgea zzgeaVar4 = zzgea.zza;
                        if (zzgeaVar4.equals(zzgeaVar2)) {
                            i10 = 3;
                        } else if (zzgea.zzb.equals(zzgeaVar2)) {
                            i10 = 4;
                        } else if (zzgea.zzc.equals(zzgeaVar2)) {
                            i10 = 5;
                        } else {
                            throw new IllegalStateException("Unknown key status");
                        }
                        zzgtf zzd2 = zzgtg.zzd();
                        zzgst zza2 = zzgsv.zza();
                        zza2.zzb(zzgnlVar.zzg());
                        zza2.zzc(zzgnlVar.zze());
                        zza2.zza(zzgnlVar.zzb());
                        zzd2.zza(zza2);
                        zzd2.zzd(i10);
                        zzd2.zzb(i11);
                        zzd2.zzc(zzgnlVar.zzc());
                        zzd.zza((zzgtg) zzd2.zzbr());
                        z11 = zzgedVar.zza;
                        if (z11) {
                            if (num2 == null) {
                                zzgeaVar3 = zzgedVar.zzb;
                                if (zzgeaVar3 == zzgeaVar4) {
                                    num2 = valueOf;
                                } else {
                                    throw new GeneralSecurityException("Primary key is not enabled");
                                }
                            } else {
                                throw new GeneralSecurityException("Two primaries were set");
                            }
                        }
                        arrayList.add(zzgehVar);
                        c = 1;
                        i11 = 0;
                        hashSet = hashSet2;
                    } else {
                        throw new GeneralSecurityException(a0.a.g("Id ", i11, " is used twice in the keyset"));
                    }
                } else {
                    throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
                }
            }
            if (num2 != null) {
                zzd.zzb(num2.intValue());
                zzgth zzgthVar = (zzgth) zzd.zzbr();
                zzgej.zzh(zzgthVar);
                return new zzgej(zzgthVar, arrayList, this.zzb, null);
            }
            throw new GeneralSecurityException("No primary was set");
        }
        throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
    }
}
