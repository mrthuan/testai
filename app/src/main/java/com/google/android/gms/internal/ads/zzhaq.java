package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzhaq {
    public static String zza(zzgwm zzgwmVar) {
        StringBuilder sb2 = new StringBuilder(zzgwmVar.zzd());
        for (int i10 = 0; i10 < zzgwmVar.zzd(); i10++) {
            byte zza = zzgwmVar.zza(i10);
            if (zza != 34) {
                if (zza != 39) {
                    if (zza != 92) {
                        switch (zza) {
                            case 7:
                                sb2.append("\\a");
                                continue;
                            case 8:
                                sb2.append("\\b");
                                continue;
                            case 9:
                                sb2.append("\\t");
                                continue;
                            case 10:
                                sb2.append("\\n");
                                continue;
                            case 11:
                                sb2.append("\\v");
                                continue;
                            case 12:
                                sb2.append("\\f");
                                continue;
                            case 13:
                                sb2.append("\\r");
                                continue;
                            default:
                                if (zza >= 32 && zza <= 126) {
                                    sb2.append((char) zza);
                                    continue;
                                } else {
                                    sb2.append('\\');
                                    sb2.append((char) (((zza >>> 6) & 3) + 48));
                                    sb2.append((char) (((zza >>> 3) & 7) + 48));
                                    sb2.append((char) ((zza & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb2.append("\\\\");
                    }
                } else {
                    sb2.append("\\'");
                }
            } else {
                sb2.append("\\\"");
            }
        }
        return sb2.toString();
    }
}
