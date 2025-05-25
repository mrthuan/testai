package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzaiu {
    private static final zzfvh zza = zzfvh.zzb(zzfui.zzc(':'));
    private static final zzfvh zzb = zzfvh.zzb(zzfui.zzc('*'));
    private final List zzc = new ArrayList();
    private int zzd = 0;
    private int zze;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int zza(zzacl zzaclVar, zzadf zzadfVar, List list) {
        int i10;
        boolean z10;
        char c;
        int i11 = this.zzd;
        if (i11 != 0) {
            int i12 = 2;
            if (i11 != 1) {
                short s4 = 2817;
                short s10 = 2816;
                short s11 = 2192;
                if (i11 != 2) {
                    long zzf = zzaclVar.zzf();
                    int zzd = (int) ((zzaclVar.zzd() - zzaclVar.zzf()) - this.zze);
                    zzek zzekVar = new zzek(zzd);
                    zzaclVar.zzi(zzekVar.zzM(), 0, zzd);
                    for (int i13 = 0; i13 < this.zzc.size(); i13++) {
                        zzait zzaitVar = (zzait) this.zzc.get(i13);
                        zzekVar.zzK((int) (zzaitVar.zza - zzf));
                        zzekVar.zzL(4);
                        int zzi = zzekVar.zzi();
                        Charset charset = zzfuj.zzc;
                        String zzA = zzekVar.zzA(zzi, charset);
                        switch (zzA.hashCode()) {
                            case -1711564334:
                                if (zzA.equals("SlowMotion_Data")) {
                                    z10 = false;
                                    break;
                                }
                                z10 = true;
                                break;
                            case -1332107749:
                                if (zzA.equals("Super_SlowMotion_Edit_Data")) {
                                    z10 = true;
                                    break;
                                }
                                z10 = true;
                                break;
                            case -1251387154:
                                if (zzA.equals("Super_SlowMotion_Data")) {
                                    z10 = true;
                                    break;
                                }
                                z10 = true;
                                break;
                            case -830665521:
                                if (zzA.equals("Super_SlowMotion_Deflickering_On")) {
                                    z10 = true;
                                    break;
                                }
                                z10 = true;
                                break;
                            case 1760745220:
                                if (zzA.equals("Super_SlowMotion_BGM")) {
                                    z10 = true;
                                    break;
                                }
                                z10 = true;
                                break;
                            default:
                                z10 = true;
                                break;
                        }
                        if (z10) {
                            if (!z10) {
                                if (!z10) {
                                    if (!z10) {
                                        if (z10) {
                                            c = 2820;
                                        } else {
                                            throw zzbo.zza("Invalid SEF name", null);
                                        }
                                    } else {
                                        c = 2819;
                                    }
                                } else {
                                    c = 2817;
                                }
                            } else {
                                c = 2816;
                            }
                        } else {
                            c = 2192;
                        }
                        int i14 = zzaitVar.zzb - (zzi + 8);
                        if (c != 2192) {
                            if (c != 2816 && c != 2817 && c != 2819 && c != 2820) {
                                throw new IllegalStateException();
                            }
                        } else {
                            ArrayList arrayList = new ArrayList();
                            List zze = zzb.zze(zzekVar.zzA(i14, charset));
                            for (int i15 = 0; i15 < zze.size(); i15++) {
                                List zze2 = zza.zze((CharSequence) zze.get(i15));
                                if (zze2.size() == 3) {
                                    try {
                                        arrayList.add(new zzagu(Long.parseLong((String) zze2.get(0)), Long.parseLong((String) zze2.get(1)), 1 << (Integer.parseInt((String) zze2.get(2)) - 1)));
                                    } catch (NumberFormatException e10) {
                                        throw zzbo.zza(null, e10);
                                    }
                                } else {
                                    throw zzbo.zza(null, null);
                                }
                            }
                            list.add(new zzagv(arrayList));
                        }
                    }
                    zzadfVar.zza = 0L;
                    return 1;
                }
                long zzd2 = zzaclVar.zzd();
                int i16 = this.zze - 20;
                zzek zzekVar2 = new zzek(i16);
                zzaclVar.zzi(zzekVar2.zzM(), 0, i16);
                int i17 = 0;
                while (i17 < i16 / 12) {
                    zzekVar2.zzL(i12);
                    short zzC = zzekVar2.zzC();
                    if (zzC != s11 && zzC != s10 && zzC != s4 && zzC != 2819 && zzC != 2820) {
                        zzekVar2.zzL(8);
                        i10 = i16;
                    } else {
                        i10 = i16;
                        this.zzc.add(new zzait(zzC, (zzd2 - this.zze) - zzekVar2.zzi(), zzekVar2.zzi()));
                    }
                    i17++;
                    i16 = i10;
                    i12 = 2;
                    s4 = 2817;
                    s10 = 2816;
                    s11 = 2192;
                }
                if (this.zzc.isEmpty()) {
                    zzadfVar.zza = 0L;
                } else {
                    this.zzd = 3;
                    zzadfVar.zza = ((zzait) this.zzc.get(0)).zza;
                }
            } else {
                zzek zzekVar3 = new zzek(8);
                zzaclVar.zzi(zzekVar3.zzM(), 0, 8);
                this.zze = zzekVar3.zzi() + 8;
                if (zzekVar3.zzg() != 1397048916) {
                    zzadfVar.zza = 0L;
                } else {
                    zzadfVar.zza = zzaclVar.zzf() - (this.zze - 12);
                    this.zzd = 2;
                }
            }
            return 1;
        }
        long zzd3 = zzaclVar.zzd();
        zzadfVar.zza = (zzd3 != -1 && zzd3 >= 8) ? zzd3 - 8 : 0L;
        this.zzd = 1;
        return 1;
    }

    public final void zzb() {
        this.zzc.clear();
        this.zzd = 0;
    }
}
