package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdln {
    private final com.google.android.gms.ads.internal.util.zzbo zza;
    private final Clock zzb;
    private final Executor zzc;

    public zzdln(com.google.android.gms.ads.internal.util.zzbo zzboVar, Clock clock, Executor executor) {
        this.zza = zzboVar;
        this.zzb = clock;
        this.zzc = executor;
    }

    private final Bitmap zzc(byte[] bArr, BitmapFactory.Options options) {
        long b10 = this.zzb.b();
        boolean z10 = false;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long b11 = this.zzb.b();
        if (decodeByteArray != null) {
            long j10 = b11 - b10;
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z10 = true;
            }
            StringBuilder f10 = a0.d.f("Decoded image w: ", width, " h:", height, " bytes: ");
            f10.append(allocationByteCount);
            f10.append(" time: ");
            f10.append(j10);
            f10.append(" on ui thread: ");
            f10.append(z10);
            com.google.android.gms.ads.internal.util.zze.h(f10.toString());
        }
        return decodeByteArray;
    }

    public final Bitmap zza(double d10, boolean z10, zzapd zzapdVar) {
        byte[] bArr = zzapdVar.zzb;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d10 * 160.0d);
        if (!z10) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        zzbbn zzbbnVar = zzbbw.zzfy;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
            options.inJustDecodeBounds = true;
            zzc(bArr, options);
            options.inJustDecodeBounds = false;
            int i10 = options.outWidth * options.outHeight;
            if (i10 > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i10 - 1) / ((Integer) zzbaVar.c.zza(zzbbw.zzfz)).intValue())) / 2);
            }
        }
        return zzc(bArr, options);
    }

    public final y9.a zzb(String str, final double d10, final boolean z10) {
        this.zza.getClass();
        zzbzt zzbztVar = new zzbzt();
        com.google.android.gms.ads.internal.util.zzbo.f10431a.zza(new com.google.android.gms.ads.internal.util.zzbn(str, zzbztVar));
        return zzgcj.zzm(zzbztVar, new zzful() { // from class: com.google.android.gms.internal.ads.zzdlm
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj) {
                return zzdln.this.zza(d10, z10, (zzapd) obj);
            }
        }, this.zzc);
    }
}
