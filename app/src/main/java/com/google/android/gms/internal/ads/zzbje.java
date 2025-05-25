package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbje implements zzbix {
    static final Map zza;
    private final com.google.android.gms.ads.internal.zzb zzb;
    private final zzbrk zzc;
    private final zzbrr zzd;

    static {
        String[] strArr = {"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"};
        Integer[] numArr = {1, 2, 3, 4, 5, 6, 7};
        y.b bVar = new y.b(7);
        for (int i10 = 0; i10 < 7; i10++) {
            bVar.put(strArr[i10], numArr[i10]);
        }
        zza = Collections.unmodifiableMap(bVar);
    }

    public zzbje(com.google.android.gms.ads.internal.zzb zzbVar, zzbrk zzbrkVar, zzbrr zzbrrVar) {
        this.zzb = zzbVar;
        this.zzc = zzbrkVar;
        this.zzd = zzbrrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbix
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcej zzcejVar = (zzcej) obj;
        int intValue = ((Integer) zza.get((String) map.get("a"))).intValue();
        int i10 = 6;
        boolean z10 = true;
        if (intValue != 5) {
            if (intValue != 7) {
                if (this.zzb.b()) {
                    if (intValue != 1) {
                        if (intValue != 3) {
                            if (intValue != 4) {
                                if (intValue != 5) {
                                    if (intValue != 6) {
                                        if (intValue != 7) {
                                            com.google.android.gms.ads.internal.util.client.zzm.d("Unknown MRAID command called.");
                                            return;
                                        }
                                    } else {
                                        this.zzc.zza(true);
                                        return;
                                    }
                                }
                            } else {
                                new zzbrh(zzcejVar, map).zzc();
                                return;
                            }
                        } else {
                            new zzbrn(zzcejVar, map).zzb();
                            return;
                        }
                    } else {
                        this.zzc.zzb(map);
                        return;
                    }
                } else {
                    this.zzb.a(null);
                    return;
                }
            }
            this.zzd.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            z10 = Boolean.parseBoolean((String) map.get("allowOrientationChange"));
        }
        if (zzcejVar == null) {
            com.google.android.gms.ads.internal.util.client.zzm.e("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i10 = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            if (z10) {
                i10 = -1;
            } else {
                i10 = 14;
            }
        }
        zzcejVar.zzau(i10);
    }
}
