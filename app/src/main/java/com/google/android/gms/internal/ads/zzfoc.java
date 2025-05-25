package com.google.android.gms.internal.ads;

import android.os.Build;
import com.adjust.sdk.Constants;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfoc {
    protected static final byte[] zza = {61, 122, 18, Field.QUOTE, 1, -102, -93, -99, -98, -96, -29, Field.INCLUDEPICTURE, 106, -73, -64, -119, 107, -5, Field.AUTOTEXT, -74, 121, -12, -34, Field.SHAPE, -25, -62, Field.BARCODE, Field.GOTOBUTTON, 108, -113, -103, 74};
    protected static final byte[] zzb = {-110, -13, -34, Field.FORMTEXT, -83, 43, 97, 21, -44, 16, -54, -125, -28, -57, -125, -127, -7, 17, 102, -69, 116, -121, -79, 43, -13, 120, 58, Field.IMPORT, -29, -108, Field.SHAPE, Field.FORMDROPDOWN};
    private final byte[] zzc = zzb;
    private final byte[] zzd = zza;

    public final boolean zza(File file) {
        try {
            X509Certificate[][] zza2 = zzaon.zza(file.getAbsolutePath());
            if (zza2.length == 1) {
                byte[] digest = MessageDigest.getInstance(Constants.SHA256).digest(zza2[0][0].getEncoded());
                if (Arrays.equals(this.zzd, digest)) {
                    return true;
                }
                if (!"user".equals(Build.TYPE) && Arrays.equals(this.zzc, digest)) {
                    return true;
                }
                return false;
            }
            throw new GeneralSecurityException("APK has more than one signature.");
        } catch (zzaok e10) {
            throw new GeneralSecurityException("Package is not signed", e10);
        } catch (IOException e11) {
            e = e11;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        } catch (RuntimeException e12) {
            e = e12;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        }
    }
}
