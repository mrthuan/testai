package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Locale;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzo {
    public static final zzo zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final byte[] zze;
    public final int zzf;
    public final int zzg;
    private int zzh;

    static {
        zzm zzmVar = new zzm();
        zzmVar.zzc(1);
        zzmVar.zzb(2);
        zzmVar.zzd(3);
        zza = zzmVar.zzg();
        zzm zzmVar2 = new zzm();
        zzmVar2.zzc(1);
        zzmVar2.zzb(1);
        zzmVar2.zzd(2);
        zzmVar2.zzg();
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ zzo(int i10, int i11, int i12, byte[] bArr, int i13, int i14, zzn zznVar) {
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = bArr;
        this.zzf = i13;
        this.zzg = i14;
    }

    public static int zza(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 9) {
            return 6;
        }
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            return -1;
        }
        return 2;
    }

    public static int zzb(int i10) {
        if (i10 != 1) {
            if (i10 != 4) {
                if (i10 != 13) {
                    if (i10 == 16) {
                        return 6;
                    }
                    if (i10 == 18) {
                        return 7;
                    }
                    if (i10 != 6 && i10 != 7) {
                        return -1;
                    }
                    return 3;
                }
                return 2;
            }
            return 10;
        }
        return 3;
    }

    public static boolean zzg(zzo zzoVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (zzoVar == null) {
            return true;
        }
        int i14 = zzoVar.zzb;
        if ((i14 == -1 || i14 == 1 || i14 == 2) && (((i10 = zzoVar.zzc) == -1 || i10 == 2) && (((i11 = zzoVar.zzd) == -1 || i11 == 3) && zzoVar.zze == null && (((i12 = zzoVar.zzg) == -1 || i12 == 8) && ((i13 = zzoVar.zzf) == -1 || i13 == 8))))) {
            return true;
        }
        return false;
    }

    private static String zzh(int i10) {
        if (i10 != -1) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return b.a.c("Undefined color range ", i10);
                }
                return "Limited range";
            }
            return "Full range";
        }
        return "Unset color range";
    }

    private static String zzi(int i10) {
        if (i10 != -1) {
            if (i10 != 6) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return b.a.c("Undefined color space ", i10);
                    }
                    return "BT601";
                }
                return "BT709";
            }
            return "BT2020";
        }
        return "Unset color space";
    }

    private static String zzj(int i10) {
        if (i10 != -1) {
            if (i10 != 10) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    return b.a.c("Undefined color transfer ", i10);
                                }
                                return "HLG";
                            }
                            return "ST2084 PQ";
                        }
                        return "SDR SMPTE 170M";
                    }
                    return "sRGB";
                }
                return "Linear";
            }
            return "Gamma 2.2";
        }
        return "Unset color transfer";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzo.class == obj.getClass()) {
            zzo zzoVar = (zzo) obj;
            if (this.zzb == zzoVar.zzb && this.zzc == zzoVar.zzc && this.zzd == zzoVar.zzd && Arrays.equals(this.zze, zzoVar.zze) && this.zzf == zzoVar.zzf && this.zzg == zzoVar.zzg) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzh;
        if (i10 == 0) {
            int i11 = this.zzd;
            int hashCode = ((((Arrays.hashCode(this.zze) + ((((((this.zzb + 527) * 31) + this.zzc) * 31) + i11) * 31)) * 31) + this.zzf) * 31) + this.zzg;
            this.zzh = hashCode;
            return hashCode;
        }
        return i10;
    }

    public final String toString() {
        String str;
        boolean z10;
        int i10 = this.zzf;
        int i11 = this.zzd;
        int i12 = this.zzc;
        String zzi = zzi(this.zzb);
        String zzh = zzh(i12);
        String zzj = zzj(i11);
        String str2 = "NA";
        if (i10 == -1) {
            str = "NA";
        } else {
            str = i10 + "bit Luma";
        }
        int i13 = this.zzg;
        if (i13 != -1) {
            str2 = i13 + "bit Chroma";
        }
        if (this.zze != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        StringBuilder f10 = android.support.v4.media.session.h.f("ColorInfo(", zzi, ", ", zzh, ", ");
        f10.append(zzj);
        f10.append(", ");
        f10.append(z10);
        f10.append(", ");
        f10.append(str);
        f10.append(", ");
        f10.append(str2);
        f10.append(")");
        return f10.toString();
    }

    public final zzm zzc() {
        return new zzm(this, null);
    }

    public final String zzd() {
        String str;
        String str2;
        if (zzf()) {
            str = String.format(Locale.US, "%s/%s/%s", zzi(this.zzb), zzh(this.zzc), zzj(this.zzd));
        } else {
            str = "NA/NA/NA";
        }
        if (zze()) {
            str2 = this.zzf + PackagingURIHelper.FORWARD_SLASH_STRING + this.zzg;
        } else {
            str2 = "NA/NA";
        }
        return androidx.activity.f.m(str, PackagingURIHelper.FORWARD_SLASH_STRING, str2);
    }

    public final boolean zze() {
        if (this.zzf != -1 && this.zzg != -1) {
            return true;
        }
        return false;
    }

    public final boolean zzf() {
        if (this.zzb != -1 && this.zzc != -1 && this.zzd != -1) {
            return true;
        }
        return false;
    }
}
