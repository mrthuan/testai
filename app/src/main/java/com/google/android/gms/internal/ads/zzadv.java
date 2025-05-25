package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzadv {
    public static int zza(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i10 >>>= 1;
            i11++;
        }
        return i11;
    }

    public static zzbk zzb(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            int i11 = zzet.zza;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                zzea.zzf("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzafj.zzb(new zzek(Base64.decode(split[1], 0))));
                } catch (RuntimeException e10) {
                    zzea.zzg("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new zzaha(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzbk(arrayList);
    }

    public static zzads zzc(zzek zzekVar, boolean z10, boolean z11) {
        if (z10) {
            zzd(3, zzekVar, false);
        }
        String zzA = zzekVar.zzA((int) zzekVar.zzs(), zzfuj.zzc);
        int length = zzA.length();
        long zzs = zzekVar.zzs();
        String[] strArr = new String[(int) zzs];
        int i10 = length + 15;
        for (int i11 = 0; i11 < zzs; i11++) {
            String zzA2 = zzekVar.zzA((int) zzekVar.zzs(), zzfuj.zzc);
            strArr[i11] = zzA2;
            i10 = i10 + 4 + zzA2.length();
        }
        if (z11 && (zzekVar.zzm() & 1) == 0) {
            throw zzbo.zza("framing bit expected to be set", null);
        }
        return new zzads(zzA, strArr, i10 + 1);
    }

    public static boolean zzd(int i10, zzek zzekVar, boolean z10) {
        if (zzekVar.zzb() < 7) {
            if (z10) {
                return false;
            }
            int zzb = zzekVar.zzb();
            throw zzbo.zza("too short header: " + zzb, null);
        } else if (zzekVar.zzm() != i10) {
            if (z10) {
                return false;
            }
            throw zzbo.zza("expected header type ".concat(String.valueOf(Integer.toHexString(i10))), null);
        } else if (zzekVar.zzm() == 118 && zzekVar.zzm() == 111 && zzekVar.zzm() == 114 && zzekVar.zzm() == 98 && zzekVar.zzm() == 105 && zzekVar.zzm() == 115) {
            return true;
        } else {
            if (z10) {
                return false;
            }
            throw zzbo.zza("expected characters 'vorbis'", null);
        }
    }
}
