package com.google.android.gms.internal.ads;

import com.adjust.sdk.network.ErrorCodes;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public class zzgl extends zzft {
    public final int zzb;

    public zzgl(zzfy zzfyVar, int i10, int i11) {
        super(zzb(AdError.REMOTE_ADS_SERVICE_ERROR, 1));
        this.zzb = 1;
    }

    public static zzgl zza(IOException iOException, zzfy zzfyVar, int i10) {
        int i11;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i11 = AdError.CACHE_ERROR_CODE;
        } else if (iOException instanceof InterruptedIOException) {
            i11 = ErrorCodes.PROTOCOL_EXCEPTION;
        } else if (message != null && zzfuf.zza(message).matches("cleartext.*not permitted.*")) {
            i11 = 2007;
        } else {
            i11 = 2001;
        }
        if (i11 == 2007) {
            return new zzgk(iOException, zzfyVar);
        }
        return new zzgl(iOException, zzfyVar, i11, i10);
    }

    private static int zzb(int i10, int i11) {
        if (i10 == 2000) {
            if (i11 != 1) {
                return AdError.SERVER_ERROR_CODE;
            }
            return AdError.INTERNAL_ERROR_CODE;
        }
        return i10;
    }

    public zzgl(IOException iOException, zzfy zzfyVar, int i10, int i11) {
        super(iOException, zzb(i10, i11));
        this.zzb = i11;
    }

    public zzgl(String str, zzfy zzfyVar, int i10, int i11) {
        super(str, zzb(i10, i11));
        this.zzb = i11;
    }

    public zzgl(String str, IOException iOException, zzfy zzfyVar, int i10, int i11) {
        super(str, iOException, zzb(i10, i11));
        this.zzb = i11;
    }
}
