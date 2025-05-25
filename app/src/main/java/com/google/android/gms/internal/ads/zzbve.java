package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbve {
    private int zzA;
    private final String zzB;
    private boolean zzC;
    private int zza;
    private boolean zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private String zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;
    private int zzl;
    private double zzm;
    private boolean zzn;
    private String zzo;
    private String zzp;
    private final boolean zzq;
    private final boolean zzr;
    private final String zzs;
    private final boolean zzt;
    private final boolean zzu;
    private final boolean zzv;
    private final String zzw;
    private final String zzx;
    private float zzy;
    private int zzz;

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(1:3)(1:34)|4|(1:6)|7|(3:28|29|(7:31|10|11|12|(1:14)|16|(2:20|21)(1:23)))|9|10|11|12|(0)|16|(1:24)(3:18|20|21)) */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c A[Catch: Exception -> 0x00b2, TRY_LEAVE, TryCatch #1 {Exception -> 0x00b2, blocks: (B:20:0x008e, B:22:0x009c), top: B:34:0x008e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzbve(android.content.Context r7) {
        /*
            r6 = this;
            r6.<init>()
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            com.google.android.gms.internal.ads.zzbbw.zza(r7)
            r6.zzc(r7)
            r6.zze(r7)
            r6.zzd(r7)
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r2 = "geo:0,0?q=donuts"
            android.content.pm.ResolveInfo r2 = zzb(r0, r2)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L23
            r2 = r3
            goto L24
        L23:
            r2 = r4
        L24:
            r6.zzq = r2
            java.lang.String r2 = "http://www.google.com"
            android.content.pm.ResolveInfo r2 = zzb(r0, r2)
            if (r2 == 0) goto L2f
            goto L30
        L2f:
            r3 = r4
        L30:
            r6.zzr = r3
            java.lang.String r2 = r1.getCountry()
            r6.zzs = r2
            com.google.android.gms.ads.internal.zzu r2 = com.google.android.gms.ads.internal.zzu.B
            com.google.android.gms.ads.internal.util.zzt r2 = r2.c
            com.google.android.gms.ads.internal.client.zzay r2 = com.google.android.gms.ads.internal.client.zzay.f10107f
            com.google.android.gms.ads.internal.util.client.zzf r2 = r2.f10108a
            boolean r2 = com.google.android.gms.ads.internal.util.client.zzf.m()
            r6.zzt = r2
            boolean r2 = com.google.android.gms.common.util.DeviceProperties.a(r7)
            r6.zzu = r2
            boolean r2 = com.google.android.gms.common.util.DeviceProperties.d(r7)
            r6.zzv = r2
            java.lang.String r1 = r1.getLanguage()
            r6.zzw = r1
            java.lang.String r1 = "market://details?id=com.google.android.gms.ads"
            android.content.pm.ResolveInfo r0 = zzb(r0, r1)
            java.lang.String r1 = "."
            r2 = 0
            if (r0 != 0) goto L65
        L63:
            r0 = r2
            goto L8c
        L65:
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            if (r0 != 0) goto L6a
            goto L63
        L6a:
            com.google.android.gms.common.wrappers.PackageManagerWrapper r3 = com.google.android.gms.common.wrappers.Wrappers.a(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
            java.lang.String r5 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
            android.content.pm.PackageInfo r3 = r3.c(r4, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
            if (r3 == 0) goto L63
            int r3 = r3.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
            java.lang.String r0 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
            r4.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
            r4.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
            r4.append(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
            r4.append(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
            java.lang.String r0 = r4.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
        L8c:
            r6.zzx = r0
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.a(r7)     // Catch: java.lang.Exception -> Lb2
            java.lang.String r3 = "com.android.vending"
            r4 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r0 = r0.c(r4, r3)     // Catch: java.lang.Exception -> Lb2
            if (r0 == 0) goto Lb2
            int r3 = r0.versionCode     // Catch: java.lang.Exception -> Lb2
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Exception -> Lb2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb2
            r4.<init>()     // Catch: java.lang.Exception -> Lb2
            r4.append(r3)     // Catch: java.lang.Exception -> Lb2
            r4.append(r1)     // Catch: java.lang.Exception -> Lb2
            r4.append(r0)     // Catch: java.lang.Exception -> Lb2
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> Lb2
        Lb2:
            r6.zzB = r2
            android.content.res.Resources r7 = r7.getResources()
            if (r7 != 0) goto Lbb
            goto Lcd
        Lbb:
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            if (r7 == 0) goto Lcd
            float r0 = r7.density
            r6.zzy = r0
            int r0 = r7.widthPixels
            r6.zzz = r0
            int r7 = r7.heightPixels
            r6.zzA = r7
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbve.<init>(android.content.Context):void");
    }

    private static ResolveInfo zzb(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(th2, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    private final void zzc(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.zza = audioManager.getMode();
                this.zzb = audioManager.isMusicActive();
                this.zzc = audioManager.isSpeakerphoneOn();
                this.zzd = audioManager.getStreamVolume(3);
                this.zze = audioManager.getRingerMode();
                this.zzf = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(th2, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.zza = -2;
        this.zzb = false;
        this.zzc = false;
        this.zzd = 0;
        this.zze = 2;
        this.zzf = 0;
    }

    @SuppressLint({"UnprotectedReceiver"})
    private final void zzd(Context context) {
        Intent registerReceiver;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzkb)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
            registerReceiver = context.registerReceiver(null, intentFilter, 4);
        } else {
            registerReceiver = context.registerReceiver(null, intentFilter);
        }
        boolean z10 = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            this.zzm = registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
            this.zzn = (intExtra == 2 || intExtra == 5) ? true : true;
            return;
        }
        this.zzm = -1.0d;
        this.zzn = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zze(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r6.getSystemService(r1)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            java.lang.String r2 = r0.getNetworkOperator()
            r5.zzg = r2
            boolean r2 = com.google.android.gms.common.util.PlatformVersion.b()
            r3 = 0
            if (r2 == 0) goto L31
            com.google.android.gms.internal.ads.zzbbn r2 = com.google.android.gms.internal.ads.zzbbw.zzhL
            com.google.android.gms.ads.internal.client.zzba r4 = com.google.android.gms.ads.internal.client.zzba.f10115d
            com.google.android.gms.internal.ads.zzbbu r4 = r4.c
            java.lang.Object r2 = r4.zza(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L31
            r2 = r3
            goto L35
        L31:
            int r2 = r0.getNetworkType()
        L35:
            r5.zzi = r2
            int r0 = r0.getPhoneType()
            r5.zzj = r0
            r0 = -2
            r5.zzh = r0
            r5.zzk = r3
            r0 = -1
            r5.zzl = r0
            com.google.android.gms.ads.internal.zzu r2 = com.google.android.gms.ads.internal.zzu.B
            com.google.android.gms.ads.internal.util.zzt r2 = r2.c
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r6 = com.google.android.gms.ads.internal.util.zzt.a(r6, r2)
            if (r6 == 0) goto L70
            android.net.NetworkInfo r6 = r1.getActiveNetworkInfo()
            if (r6 == 0) goto L68
            int r0 = r6.getType()
            r5.zzh = r0
            android.net.NetworkInfo$DetailedState r6 = r6.getDetailedState()
            int r6 = r6.ordinal()
            r5.zzl = r6
            goto L6a
        L68:
            r5.zzh = r0
        L6a:
            boolean r6 = r1.isActiveNetworkMetered()
            r5.zzk = r6
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbve.zze(android.content.Context):void");
    }

    public final zzbvf zza() {
        return new zzbvf(this.zza, this.zzq, this.zzr, this.zzg, this.zzs, this.zzt, this.zzu, this.zzv, this.zzb, this.zzc, this.zzw, this.zzx, this.zzB, this.zzd, this.zzh, this.zzi, this.zzj, this.zze, this.zzf, this.zzy, this.zzz, this.zzA, this.zzm, this.zzn, this.zzk, this.zzl, this.zzo, this.zzC, this.zzp);
    }

    public zzbve(Context context, zzbvf zzbvfVar) {
        zzbbw.zza(context);
        zzc(context);
        zze(context);
        zzd(context);
        this.zzo = Build.FINGERPRINT;
        this.zzp = Build.DEVICE;
        this.zzC = zzbct.zzg(context);
        this.zzq = zzbvfVar.zza;
        this.zzr = zzbvfVar.zzb;
        this.zzs = zzbvfVar.zzc;
        this.zzt = zzbvfVar.zzd;
        this.zzu = zzbvfVar.zze;
        this.zzv = zzbvfVar.zzf;
        this.zzw = zzbvfVar.zzg;
        this.zzx = zzbvfVar.zzh;
        this.zzB = zzbvfVar.zzi;
        this.zzy = zzbvfVar.zzl;
        this.zzz = zzbvfVar.zzm;
        this.zzA = zzbvfVar.zzn;
    }
}
