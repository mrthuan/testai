package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzakx {
    private static final Pattern zzd = Pattern.compile("\\s+");
    private static final zzfxw zze = zzfxw.zzp("auto", "none");
    private static final zzfxw zzf = zzfxw.zzq("dot", "sesame", "circle");
    private static final zzfxw zzg = zzfxw.zzp("filled", PDWindowsLaunchParams.OPERATION_OPEN);
    private static final zzfxw zzh = zzfxw.zzq("after", "before", "outside");
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzakx(int i10, int i11, int i12) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
    }

    public static zzakx zza(String str) {
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        boolean z12;
        if (str != null) {
            String zza = zzfuf.zza(str.trim());
            if (!zza.isEmpty()) {
                zzfxw zzm = zzfxw.zzm(TextUtils.split(zza, zzd));
                String str2 = (String) zzfxx.zza(zzfzt.zzb(zzh, zzm), "outside");
                int hashCode = str2.hashCode();
                int i12 = -1;
                int i13 = 0;
                if (hashCode != -1106037339) {
                    if (hashCode == 92734940 && str2.equals("after")) {
                        z10 = false;
                    }
                    z10 = true;
                } else {
                    if (str2.equals("outside")) {
                        z10 = true;
                    }
                    z10 = true;
                }
                if (z10) {
                    if (!z10) {
                        i10 = 1;
                    } else {
                        i10 = -2;
                    }
                } else {
                    i10 = 2;
                }
                zzfzs zzb = zzfzt.zzb(zze, zzm);
                if (!zzb.isEmpty()) {
                    String str3 = (String) zzb.iterator().next();
                    if (str3.hashCode() == 3387192 && str3.equals("none")) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (!z12) {
                        i12 = 0;
                    }
                } else {
                    zzfzs zzb2 = zzfzt.zzb(zzg, zzm);
                    zzfzs zzb3 = zzfzt.zzb(zzf, zzm);
                    if (!zzb2.isEmpty() || !zzb3.isEmpty()) {
                        String str4 = (String) zzfxx.zza(zzb2, "filled");
                        if (str4.hashCode() == 3417674 && str4.equals(PDWindowsLaunchParams.OPERATION_OPEN)) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (z11) {
                            i11 = 1;
                        } else {
                            i11 = 2;
                        }
                        String str5 = (String) zzfxx.zza(zzb3, "circle");
                        int hashCode2 = str5.hashCode();
                        if (hashCode2 != -905816648) {
                            if (hashCode2 == 99657 && str5.equals("dot")) {
                                i12 = 0;
                            }
                        } else if (str5.equals("sesame")) {
                            i12 = 1;
                        }
                        if (i12 != 0) {
                            if (i12 != 1) {
                                i13 = i11;
                                i12 = 1;
                            } else {
                                i12 = 3;
                            }
                        } else {
                            i12 = 2;
                        }
                        i13 = i11;
                    }
                }
                return new zzakx(i12, i13, i10);
            }
            return null;
        }
        return null;
    }
}
