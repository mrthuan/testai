package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzals implements zzaka {
    private final zzek zza = new zzek();
    private final zzali zzb = new zzali();

    @Override // com.google.android.gms.internal.ads.zzaka
    public final void zza(byte[] bArr, int i10, int i11, zzajz zzajzVar, zzdn zzdnVar) {
        this.zza.zzI(bArr, i11 + i10);
        this.zza.zzK(i10);
        ArrayList arrayList = new ArrayList();
        try {
            zzek zzekVar = this.zza;
            int zzd = zzekVar.zzd();
            Charset charset = zzfuj.zzc;
            String zzy = zzekVar.zzy(charset);
            if (zzy != null && zzy.startsWith("WEBVTT")) {
                do {
                } while (!TextUtils.isEmpty(this.zza.zzy(zzfuj.zzc)));
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    zzek zzekVar2 = this.zza;
                    char c = 65535;
                    int i12 = 0;
                    while (c == 65535) {
                        i12 = zzekVar2.zzd();
                        String zzy2 = zzekVar2.zzy(zzfuj.zzc);
                        if (zzy2 == null) {
                            c = 0;
                        } else if ("STYLE".equals(zzy2)) {
                            c = 2;
                        } else if (zzy2.startsWith("NOTE")) {
                            c = 1;
                        } else {
                            c = 3;
                        }
                    }
                    zzekVar2.zzK(i12);
                    if (c != 0) {
                        if (c == 1) {
                            do {
                            } while (!TextUtils.isEmpty(this.zza.zzy(zzfuj.zzc)));
                        } else if (c == 2) {
                            if (arrayList2.isEmpty()) {
                                this.zza.zzy(zzfuj.zzc);
                                arrayList.addAll(this.zzb.zzb(this.zza));
                            } else {
                                throw new IllegalArgumentException("A style block was found after the first cue.");
                            }
                        } else {
                            zzalk zzc = zzalr.zzc(this.zza, arrayList);
                            if (zzc != null) {
                                arrayList2.add(zzc);
                            }
                        }
                    } else {
                        zzaju.zza(new zzalv(arrayList2), zzajzVar, zzdnVar);
                        return;
                    }
                }
            } else {
                zzekVar.zzK(zzd);
                throw zzbo.zza("Expected WEBVTT. Got ".concat(String.valueOf(zzekVar.zzy(charset))), null);
            }
        } catch (zzbo e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final /* synthetic */ void zzb() {
    }
}
