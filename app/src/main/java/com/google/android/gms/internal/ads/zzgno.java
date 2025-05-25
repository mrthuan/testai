package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgno {
    private static final ThreadLocal zza = new zzgnn();

    public static /* synthetic */ SecureRandom zza() {
        SecureRandom zzc = zzc();
        zzc.nextLong();
        return zzc;
    }

    public static byte[] zzb(int i10) {
        byte[] bArr = new byte[i10];
        ((SecureRandom) zza.get()).nextBytes(bArr);
        return bArr;
    }

    private static SecureRandom zzc() {
        try {
            try {
                try {
                    try {
                        try {
                            return SecureRandom.getInstance("SHA1PRNG", "GmsCore_OpenSSL");
                        } catch (ClassNotFoundException e10) {
                            e = e10;
                            throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                        } catch (IllegalAccessException e11) {
                            e = e11;
                            throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                        } catch (IllegalArgumentException e12) {
                            e = e12;
                            throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                        } catch (NoSuchMethodException e13) {
                            e = e13;
                            throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                        } catch (InvocationTargetException e14) {
                            e = e14;
                            throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                        }
                    } catch (GeneralSecurityException unused) {
                        return SecureRandom.getInstance("SHA1PRNG", (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", new Class[0]).invoke(null, new Object[0]));
                    }
                } catch (GeneralSecurityException unused2) {
                    return SecureRandom.getInstance("SHA1PRNG", "AndroidOpenSSL");
                }
            } catch (GeneralSecurityException unused3) {
                return SecureRandom.getInstance("SHA1PRNG", "Conscrypt");
            }
        } catch (GeneralSecurityException unused4) {
            return new SecureRandom();
        }
    }
}
