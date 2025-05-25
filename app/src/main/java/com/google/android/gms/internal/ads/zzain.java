package com.google.android.gms.internal.ads;

import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.openxml4j.opc.ContentTypes;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzain {
    public static zzbj zza(zzek zzekVar) {
        String str;
        zzbj zzafpVar;
        int zzg = zzekVar.zzg() + zzekVar.zzd();
        int zzg2 = zzekVar.zzg();
        int i10 = (zzg2 >> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC;
        zzbj zzbjVar = null;
        try {
            if (i10 != 169 && i10 != 253) {
                if (zzg2 == 1735291493) {
                    String zza = zzage.zza(zzb(zzekVar) - 1);
                    if (zza != null) {
                        zzafpVar = new zzagm("TCON", null, zzfxr.zzn(zza));
                        zzbjVar = zzafpVar;
                    } else {
                        zzea.zzf("MetadataUtil", "Failed to parse standard genre code");
                    }
                } else if (zzg2 == 1684632427) {
                    zzbjVar = zzd(1684632427, "TPOS", zzekVar);
                } else if (zzg2 == 1953655662) {
                    zzbjVar = zzd(1953655662, "TRCK", zzekVar);
                } else if (zzg2 == 1953329263) {
                    zzbjVar = zzc(1953329263, "TBPM", zzekVar, true, false);
                } else if (zzg2 == 1668311404) {
                    zzbjVar = zzc(1668311404, "TCMP", zzekVar, true, true);
                } else if (zzg2 == 1668249202) {
                    int zzg3 = zzekVar.zzg();
                    if (zzekVar.zzg() == 1684108385) {
                        int zzg4 = zzekVar.zzg() & 16777215;
                        if (zzg4 == 13) {
                            str = ContentTypes.IMAGE_JPEG;
                        } else if (zzg4 == 14) {
                            str = ContentTypes.IMAGE_PNG;
                            zzg4 = 14;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            zzea.zzf("MetadataUtil", "Unrecognized cover art flags: " + zzg4);
                        } else {
                            zzekVar.zzL(4);
                            int i11 = zzg3 - 16;
                            byte[] bArr = new byte[i11];
                            zzekVar.zzG(bArr, 0, i11);
                            zzafpVar = new zzafp(str, null, 3, bArr);
                            zzbjVar = zzafpVar;
                        }
                    } else {
                        zzea.zzf("MetadataUtil", "Failed to parse cover art attribute");
                    }
                } else if (zzg2 == 1631670868) {
                    zzbjVar = zze(1631670868, "TPE2", zzekVar);
                } else if (zzg2 == 1936682605) {
                    zzbjVar = zze(1936682605, "TSOT", zzekVar);
                } else if (zzg2 == 1936679276) {
                    zzbjVar = zze(1936679276, "TSOA", zzekVar);
                } else if (zzg2 == 1936679282) {
                    zzbjVar = zze(1936679282, "TSOP", zzekVar);
                } else if (zzg2 == 1936679265) {
                    zzbjVar = zze(1936679265, "TSO2", zzekVar);
                } else if (zzg2 == 1936679791) {
                    zzbjVar = zze(1936679791, "TSOC", zzekVar);
                } else if (zzg2 == 1920233063) {
                    zzbjVar = zzc(1920233063, "ITUNESADVISORY", zzekVar, false, false);
                } else if (zzg2 == 1885823344) {
                    zzbjVar = zzc(1885823344, "ITUNESGAPLESS", zzekVar, false, true);
                } else if (zzg2 == 1936683886) {
                    zzbjVar = zze(1936683886, "TVSHOWSORT", zzekVar);
                } else if (zzg2 == 1953919848) {
                    zzbjVar = zze(1953919848, "TVSHOW", zzekVar);
                } else {
                    if (zzg2 == 757935405) {
                        int i12 = -1;
                        int i13 = -1;
                        String str2 = null;
                        String str3 = null;
                        while (zzekVar.zzd() < zzg) {
                            int zzd = zzekVar.zzd();
                            int zzg5 = zzekVar.zzg();
                            int zzg6 = zzekVar.zzg();
                            zzekVar.zzL(4);
                            if (zzg6 == 1835360622) {
                                str2 = zzekVar.zzz(zzg5 - 12);
                            } else {
                                int i14 = zzg5 - 12;
                                if (zzg6 == 1851878757) {
                                    str3 = zzekVar.zzz(i14);
                                } else {
                                    if (zzg6 == 1684108385) {
                                        i13 = zzg5;
                                    }
                                    if (zzg6 == 1684108385) {
                                        i12 = zzd;
                                    }
                                    zzekVar.zzL(i14);
                                }
                            }
                        }
                        if (str2 != null && str3 != null && i12 != -1) {
                            zzekVar.zzK(i12);
                            zzekVar.zzL(16);
                            zzbjVar = new zzagg(str2, str3, zzekVar.zzz(i13 - 16));
                        }
                    }
                    zzea.zzb("MetadataUtil", "Skipped unknown metadata entry: " + zzahx.zzf(zzg2));
                }
            } else {
                int i15 = zzg2 & 16777215;
                if (i15 == 6516084) {
                    int zzg7 = zzekVar.zzg();
                    if (zzekVar.zzg() == 1684108385) {
                        zzekVar.zzL(8);
                        String zzz = zzekVar.zzz(zzg7 - 16);
                        zzbjVar = new zzafx("und", zzz, zzz);
                    } else {
                        zzea.zzf("MetadataUtil", "Failed to parse comment attribute: ".concat(zzahx.zzf(zzg2)));
                    }
                } else {
                    if (i15 != 7233901 && i15 != 7631467) {
                        if (i15 != 6516589 && i15 != 7828084) {
                            if (i15 == 6578553) {
                                zzbjVar = zze(zzg2, "TDRC", zzekVar);
                            } else if (i15 == 4280916) {
                                zzbjVar = zze(zzg2, "TPE1", zzekVar);
                            } else if (i15 == 7630703) {
                                zzbjVar = zze(zzg2, "TSSE", zzekVar);
                            } else if (i15 == 6384738) {
                                zzbjVar = zze(zzg2, "TALB", zzekVar);
                            } else if (i15 == 7108978) {
                                zzbjVar = zze(zzg2, "USLT", zzekVar);
                            } else if (i15 == 6776174) {
                                zzbjVar = zze(zzg2, "TCON", zzekVar);
                            } else {
                                if (i15 == 6779504) {
                                    zzbjVar = zze(zzg2, "TIT1", zzekVar);
                                }
                                zzea.zzb("MetadataUtil", "Skipped unknown metadata entry: " + zzahx.zzf(zzg2));
                            }
                        }
                        zzbjVar = zze(zzg2, "TCOM", zzekVar);
                    }
                    zzbjVar = zze(zzg2, "TIT2", zzekVar);
                }
            }
            return zzbjVar;
        } finally {
            zzekVar.zzK(zzg);
        }
    }

    private static int zzb(zzek zzekVar) {
        int zzg = zzekVar.zzg();
        if (zzekVar.zzg() == 1684108385) {
            zzekVar.zzL(8);
            int i10 = zzg - 16;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4 && (zzekVar.zzf() & 128) == 0) {
                            return zzekVar.zzp();
                        }
                    } else {
                        return zzekVar.zzo();
                    }
                } else {
                    return zzekVar.zzq();
                }
            } else {
                return zzekVar.zzm();
            }
        }
        zzea.zzf("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static zzagd zzc(int i10, String str, zzek zzekVar, boolean z10, boolean z11) {
        int zzb = zzb(zzekVar);
        if (z11) {
            zzb = Math.min(1, zzb);
        }
        if (zzb >= 0) {
            if (z10) {
                return new zzagm(str, null, zzfxr.zzn(Integer.toString(zzb)));
            }
            return new zzafx("und", str, Integer.toString(zzb));
        }
        zzea.zzf("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzahx.zzf(i10)));
        return null;
    }

    private static zzagm zzd(int i10, String str, zzek zzekVar) {
        int zzg = zzekVar.zzg();
        if (zzekVar.zzg() == 1684108385 && zzg >= 22) {
            zzekVar.zzL(10);
            int zzq = zzekVar.zzq();
            if (zzq > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(zzq);
                String sb3 = sb2.toString();
                int zzq2 = zzekVar.zzq();
                if (zzq2 > 0) {
                    sb3 = sb3 + PackagingURIHelper.FORWARD_SLASH_STRING + zzq2;
                }
                return new zzagm(str, null, zzfxr.zzn(sb3));
            }
        }
        zzea.zzf("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzahx.zzf(i10)));
        return null;
    }

    private static zzagm zze(int i10, String str, zzek zzekVar) {
        int zzg = zzekVar.zzg();
        if (zzekVar.zzg() == 1684108385) {
            zzekVar.zzL(8);
            return new zzagm(str, null, zzfxr.zzn(zzekVar.zzz(zzg - 16)));
        }
        zzea.zzf("MetadataUtil", "Failed to parse text attribute: ".concat(zzahx.zzf(i10)));
        return null;
    }
}
