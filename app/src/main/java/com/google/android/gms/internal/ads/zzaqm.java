package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;
import lib.zj.office.fc.codec.CharEncoding;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public class zzaqm extends zzaph {
    private final Object zza;
    private final zzapm zzb;

    public zzaqm(int i10, String str, zzapm zzapmVar, zzapl zzaplVar) {
        super(i10, str, zzaplVar);
        this.zza = new Object();
        this.zzb = zzapmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaph
    public final zzapn zzh(zzapd zzapdVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzapdVar.zzb;
            Map map = zzapdVar.zzc;
            String str3 = CharEncoding.ISO_8859_1;
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] split = str2.split(";", 0);
                int i10 = 1;
                while (true) {
                    if (i10 >= split.length) {
                        break;
                    }
                    String[] split2 = split[i10].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str3 = split2[1];
                        break;
                    }
                    i10++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzapdVar.zzb);
        }
        return zzapn.zzb(str, zzaqe.zzb(zzapdVar));
    }

    @Override // com.google.android.gms.internal.ads.zzaph
    /* renamed from: zzz */
    public void zzo(String str) {
        zzapm zzapmVar;
        synchronized (this.zza) {
            zzapmVar = this.zzb;
        }
        zzapmVar.zza(str);
    }
}
