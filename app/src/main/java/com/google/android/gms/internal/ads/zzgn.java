package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgn extends zzgl {
    public final int zzc;

    public zzgn(int i10, String str, IOException iOException, Map map, zzfy zzfyVar, byte[] bArr) {
        super(b.a.c("Response code: ", i10), iOException, zzfyVar, AdError.INTERNAL_ERROR_2004, 1);
        this.zzc = i10;
    }
}
