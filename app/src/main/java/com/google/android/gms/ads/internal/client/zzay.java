package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbhc;
import com.google.android.gms.internal.ads.zzbhd;
import com.google.android.gms.internal.ads.zzbsk;
import com.google.android.gms.internal.ads.zzbws;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class zzay {

    /* renamed from: f  reason: collision with root package name */
    public static final zzay f10107f = new zzay();

    /* renamed from: a  reason: collision with root package name */
    public final com.google.android.gms.ads.internal.util.client.zzf f10108a;

    /* renamed from: b  reason: collision with root package name */
    public final zzaw f10109b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final VersionInfoParcel f10110d;

    /* renamed from: e  reason: collision with root package name */
    public final Random f10111e;

    public zzay() {
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = new com.google.android.gms.ads.internal.util.client.zzf();
        zzk zzkVar = new zzk();
        zzi zziVar = new zzi();
        zzeq zzeqVar = new zzeq();
        zzbhc zzbhcVar = new zzbhc();
        new zzbws();
        zzbsk zzbskVar = new zzbsk();
        new zzbhd();
        zzaw zzawVar = new zzaw(zzkVar, zziVar, zzeqVar, zzbhcVar, zzbskVar);
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(true, 0, 242402000, false);
        Random random = new Random();
        this.f10108a = zzfVar;
        this.f10109b = zzawVar;
        this.c = bigInteger;
        this.f10110d = versionInfoParcel;
        this.f10111e = random;
    }
}
