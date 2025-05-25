package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfgh {
    public static ParcelFileDescriptor zza(final InputStream inputStream) {
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
        final ParcelFileDescriptor parcelFileDescriptor2 = createPipe[1];
        zzbzo.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgg
            @Override // java.lang.Runnable
            public final void run() {
                InputStream inputStream2 = inputStream;
                try {
                    ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor2);
                    try {
                        IOUtils.b(inputStream2, autoCloseOutputStream, false);
                        autoCloseOutputStream.close();
                        inputStream2.close();
                    } catch (Throwable th2) {
                        try {
                            autoCloseOutputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (IOException unused) {
                }
            }
        });
        return parcelFileDescriptor;
    }
}
