package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.adjust.sdk.Constants;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.pangle.PangleConstants;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.wrappers.Wrappers;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbtq implements zzbts {
    public static zzbts zza;
    static zzbts zzb;
    static zzbts zzc;
    static Boolean zzd;
    private static final Object zze = new Object();
    private final Object zzf;
    private final Context zzg;
    private final WeakHashMap zzh;
    private final ExecutorService zzi;
    private final VersionInfoParcel zzj;
    private final PackageInfo zzk;
    private final String zzl;
    private final String zzm;
    private final AtomicBoolean zzn;
    private boolean zzo;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzbtq(android.content.Context r4, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r5) {
        /*
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.zzf = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r3.zzh = r0
            com.google.android.gms.internal.ads.zzfrt.zza()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.unconfigurableExecutorService(r0)
            r3.zzi = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r3.zzn = r0
            android.content.Context r0 = r4.getApplicationContext()
            if (r0 == 0) goto L2f
            android.content.Context r4 = r4.getApplicationContext()
        L2f:
            r3.zzg = r4
            r3.zzj = r5
            com.google.android.gms.internal.ads.zzbbn r5 = com.google.android.gms.internal.ads.zzbbw.zzgX
            com.google.android.gms.ads.internal.client.zzba r0 = com.google.android.gms.ads.internal.client.zzba.f10115d
            com.google.android.gms.internal.ads.zzbbu r0 = r0.c
            java.lang.Object r5 = r0.zza(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r0 = 0
            if (r5 == 0) goto L61
            com.google.android.gms.internal.ads.zzfru r5 = com.google.android.gms.ads.internal.util.client.zzf.f10351b
            if (r4 == 0) goto L61
            android.content.pm.ApplicationInfo r5 = r4.getApplicationInfo()
            if (r5 != 0) goto L51
            goto L61
        L51:
            com.google.android.gms.common.wrappers.PackageManagerWrapper r5 = com.google.android.gms.common.wrappers.Wrappers.a(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            java.lang.String r4 = r4.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            r1 = 0
            android.content.pm.PackageInfo r4 = r5.c(r1, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            goto L62
        L61:
            r4 = r0
        L62:
            r3.zzk = r4
            com.google.android.gms.internal.ads.zzbbn r4 = com.google.android.gms.internal.ads.zzbbw.zzgV
            com.google.android.gms.ads.internal.client.zzba r5 = com.google.android.gms.ads.internal.client.zzba.f10115d
            com.google.android.gms.internal.ads.zzbbu r1 = r5.c
            java.lang.Object r1 = r1.zza(r4)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.String r2 = "unknown"
            if (r1 == 0) goto L81
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r1 = r1.getCountry()
            goto L82
        L81:
            r1 = r2
        L82:
            r3.zzl = r1
            com.google.android.gms.internal.ads.zzbbu r5 = r5.c
            java.lang.Object r4 = r5.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto Laf
            android.content.Context r4 = r3.zzg
            com.google.android.gms.internal.ads.zzfru r5 = com.google.android.gms.ads.internal.util.client.zzf.f10351b
            if (r4 != 0) goto L99
            goto Lb0
        L99:
            com.google.android.gms.common.wrappers.PackageManagerWrapper r4 = com.google.android.gms.common.wrappers.Wrappers.a(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb0
            java.lang.String r5 = "com.android.vending"
            r1 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r4 = r4.c(r1, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb0
            if (r4 != 0) goto La8
            goto Lb0
        La8:
            int r4 = r4.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb0
            java.lang.String r0 = java.lang.Integer.toString(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb0
            goto Lb0
        Laf:
            r0 = r2
        Lb0:
            r3.zzm = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbtq.<init>(android.content.Context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel):void");
    }

    public static zzbts zza(Context context) {
        synchronized (zze) {
            if (zza == null) {
                if (zzl()) {
                    zza = new zzbtq(context, VersionInfoParcel.d());
                } else {
                    zza = new zzbtr();
                }
            }
        }
        return zza;
    }

    public static zzbts zzb(Context context, VersionInfoParcel versionInfoParcel) {
        synchronized (zze) {
            try {
                if (zzc == null) {
                    boolean z10 = false;
                    if (((Boolean) zzbdk.zzc.zze()).booleanValue()) {
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzgQ)).booleanValue() || ((Boolean) zzbdk.zza.zze()).booleanValue()) {
                            z10 = true;
                        }
                    }
                    if (zzl()) {
                        zzbtq zzbtqVar = new zzbtq(context, versionInfoParcel);
                        zzbtqVar.zzk();
                        zzbtqVar.zzj();
                        zzc = zzbtqVar;
                    } else if (z10) {
                        zzbtq zzbtqVar2 = new zzbtq(context, versionInfoParcel, true);
                        zzbtqVar2.zzk();
                        zzbtqVar2.zzj();
                        zzc = zzbtqVar2;
                    } else {
                        zzc = new zzbtr();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzc;
    }

    public static zzbts zzc(Context context) {
        synchronized (zze) {
            try {
                if (zzb == null) {
                    zzbbn zzbbnVar = zzbbw.zzgR;
                    com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
                    if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
                        if (!((Boolean) zzbaVar.c.zza(zzbbw.zzgQ)).booleanValue()) {
                            zzb = new zzbtq(context, VersionInfoParcel.d());
                        }
                    }
                    zzb = new zzbtr();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzb;
    }

    public static zzbts zzd(Context context, VersionInfoParcel versionInfoParcel) {
        synchronized (zze) {
            try {
                if (zzb == null) {
                    zzbbn zzbbnVar = zzbbw.zzgR;
                    com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
                    if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
                        if (!((Boolean) zzbaVar.c.zza(zzbbw.zzgQ)).booleanValue()) {
                            zzb = new zzbtq(context, versionInfoParcel);
                        }
                    }
                    zzb = new zzbtr();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzb;
    }

    public static String zze(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String zzf(Throwable th2) {
        return zzfvj.zzc(com.google.android.gms.ads.internal.util.client.zzf.a(zze(th2), Constants.SHA256));
    }

    private final void zzj() {
        Thread.setDefaultUncaughtExceptionHandler(new zzbto(this, Thread.getDefaultUncaughtExceptionHandler()));
    }

    private final void zzk() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.zzf) {
            this.zzh.put(thread, Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new zzbtp(this, thread.getUncaughtExceptionHandler()));
    }

    private static boolean zzl() {
        boolean z10;
        zzbbn zzbbnVar = zzbbw.zzlO;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (!((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
            if (((Boolean) zzbeb.zze.zze()).booleanValue()) {
                if (!((Boolean) zzbaVar.c.zza(zzbbw.zzgQ)).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        synchronized (zze) {
            try {
                if (zzd == null) {
                    if (com.google.android.gms.ads.internal.client.zzay.f10107f.f10111e.nextInt(100) < ((Integer) zzbaVar.c.zza(zzbbw.zzlL)).intValue()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zzd = Boolean.valueOf(z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zzd.booleanValue()) {
            if (!((Boolean) zzbaVar.c.zza(zzbbw.zzgQ)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final void zzg(Thread thread, Throwable th2) {
        StackTraceElement[] stackTrace;
        if (th2 != null) {
            boolean z10 = false;
            boolean z11 = false;
            for (Throwable th3 = th2; th3 != null; th3 = th3.getCause()) {
                for (StackTraceElement stackTraceElement : th3.getStackTrace()) {
                    z10 |= com.google.android.gms.ads.internal.util.client.zzf.l(stackTraceElement.getClassName());
                    z11 |= zzbtq.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (z10 && !z11) {
                if (!this.zzo) {
                    zzh(th2, "");
                }
                if (!this.zzn.getAndSet(true) && ((Boolean) zzbdk.zzc.zze()).booleanValue()) {
                    zzbbg.zzc(this.zzg);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbts
    public final void zzh(Throwable th2, String str) {
        if (this.zzo) {
            return;
        }
        zzi(th2, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzbts
    public final void zzi(Throwable th2, String str, float f10) {
        Throwable th3;
        boolean z10;
        String str2;
        int i10;
        String str3;
        String str4;
        PackageInfo packageInfo;
        ActivityManager.MemoryInfo g10;
        if (!this.zzo) {
            zzfru zzfruVar = com.google.android.gms.ads.internal.util.client.zzf.f10351b;
            boolean z11 = false;
            if (((Boolean) zzbeb.zzf.zze()).booleanValue()) {
                th3 = th2;
            } else {
                LinkedList linkedList = new LinkedList();
                for (Throwable th4 = th2; th4 != null; th4 = th4.getCause()) {
                    linkedList.push(th4);
                }
                th3 = null;
                while (!linkedList.isEmpty()) {
                    Throwable th5 = (Throwable) linkedList.pop();
                    StackTraceElement[] stackTrace = th5.getStackTrace();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzbY)).booleanValue() && stackTrace != null && stackTrace.length == 0 && com.google.android.gms.ads.internal.util.client.zzf.l(th5.getClass().getName())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new StackTraceElement(th5.getClass().getName(), "<filtered>", "<filtered>", 1));
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        if (com.google.android.gms.ads.internal.util.client.zzf.l(stackTraceElement.getClassName())) {
                            arrayList.add(stackTraceElement);
                            z10 = true;
                        } else {
                            String className = stackTraceElement.getClassName();
                            if (TextUtils.isEmpty(className) || (!className.startsWith("android.") && !className.startsWith("java."))) {
                                arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                            } else {
                                arrayList.add(stackTraceElement);
                            }
                        }
                    }
                    if (z10) {
                        if (th3 == null) {
                            th3 = new Throwable(th5.getMessage());
                        } else {
                            th3 = new Throwable(th5.getMessage(), th3);
                        }
                        th3.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                    }
                }
            }
            if (th3 != null) {
                String name = th2.getClass().getName();
                String zze2 = zze(th2);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzhV)).booleanValue()) {
                    str2 = zzf(th2);
                } else {
                    str2 = "";
                }
                double d10 = f10;
                int i11 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                double random = Math.random();
                if (i11 > 0) {
                    i10 = (int) (1.0f / f10);
                } else {
                    i10 = 1;
                }
                if (random < d10) {
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        z11 = Wrappers.a(this.zzg).d();
                    } catch (Throwable unused) {
                        com.google.android.gms.ads.internal.util.client.zzm.g(6);
                    }
                    try {
                        str3 = this.zzg.getPackageName();
                    } catch (Throwable unused2) {
                        com.google.android.gms.ads.internal.util.client.zzm.e("Cannot obtain package name, proceeding.");
                        str3 = "unknown";
                    }
                    Uri.Builder appendQueryParameter = new Uri.Builder().scheme(Constants.SCHEME).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z11)).appendQueryParameter(FacebookMediationAdapter.KEY_ID, "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE);
                    int i12 = Build.VERSION.SDK_INT;
                    Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("api", String.valueOf(i12));
                    String str5 = Build.MANUFACTURER;
                    String str6 = Build.MODEL;
                    if (!str6.startsWith(str5)) {
                        str6 = androidx.activity.f.m(str5, " ", str6);
                    }
                    Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("device", str6).appendQueryParameter("js", this.zzj.f10345a).appendQueryParameter(PangleConstants.APP_ID, str3).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", zze2);
                    com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
                    Uri.Builder appendQueryParameter4 = appendQueryParameter3.appendQueryParameter("eids", TextUtils.join(",", zzbaVar.f10116a.zza())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "661295874").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i10)).appendQueryParameter("pb_tm", String.valueOf(zzbeb.zzc.zze()));
                    Context context = this.zzg;
                    GoogleApiAvailabilityLight.f10884b.getClass();
                    Uri.Builder appendQueryParameter5 = appendQueryParameter4.appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.a(context)));
                    boolean z12 = this.zzj.f10348e;
                    String str7 = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
                    if (true == z12) {
                        str4 = "1";
                    } else {
                        str4 = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
                    }
                    Uri.Builder appendQueryParameter6 = appendQueryParameter5.appendQueryParameter("lite", str4);
                    if (!TextUtils.isEmpty(str2)) {
                        appendQueryParameter6.appendQueryParameter("hash", str2);
                    }
                    zzbbn zzbbnVar = zzbbw.zzgW;
                    zzbbu zzbbuVar = zzbaVar.c;
                    if (((Boolean) zzbbuVar.zza(zzbbnVar)).booleanValue() && (g10 = com.google.android.gms.ads.internal.util.client.zzf.g(this.zzg)) != null) {
                        appendQueryParameter6.appendQueryParameter("available_memory", Long.toString(g10.availMem));
                        appendQueryParameter6.appendQueryParameter("total_memory", Long.toString(g10.totalMem));
                        if (true == g10.lowMemory) {
                            str7 = "1";
                        }
                        appendQueryParameter6.appendQueryParameter("is_low_memory", str7);
                    }
                    if (((Boolean) zzbbuVar.zza(zzbbw.zzgV)).booleanValue()) {
                        if (!TextUtils.isEmpty(this.zzl)) {
                            appendQueryParameter6.appendQueryParameter("countrycode", this.zzl);
                        }
                        if (!TextUtils.isEmpty(this.zzm)) {
                            appendQueryParameter6.appendQueryParameter("psv", this.zzm);
                        }
                        Context context2 = this.zzg;
                        if (i12 >= 26) {
                            packageInfo = WebView.getCurrentWebViewPackage();
                        } else {
                            if (context2 != null) {
                                try {
                                    packageInfo = Wrappers.a(context2).c(128, "com.android.webview");
                                } catch (PackageManager.NameNotFoundException unused3) {
                                    packageInfo = null;
                                }
                            }
                            packageInfo = null;
                        }
                        if (packageInfo != null) {
                            appendQueryParameter6.appendQueryParameter("wvvc", Integer.toString(packageInfo.versionCode));
                            appendQueryParameter6.appendQueryParameter("wvvn", packageInfo.versionName);
                            appendQueryParameter6.appendQueryParameter("wvpn", packageInfo.packageName);
                        }
                    }
                    PackageInfo packageInfo2 = this.zzk;
                    if (packageInfo2 != null) {
                        appendQueryParameter6.appendQueryParameter("appvc", String.valueOf(packageInfo2.versionCode));
                        appendQueryParameter6.appendQueryParameter("appvn", this.zzk.versionName);
                    }
                    arrayList2.add(appendQueryParameter6.toString());
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        final String str8 = (String) it.next();
                        final com.google.android.gms.ads.internal.util.client.zzr zzrVar = new com.google.android.gms.ads.internal.util.client.zzr(null);
                        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbtn
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.google.android.gms.ads.internal.util.client.zzr.this.zza(str8);
                            }
                        });
                    }
                }
            }
        }
    }

    public zzbtq(Context context, VersionInfoParcel versionInfoParcel, boolean z10) {
        this(context, versionInfoParcel);
        this.zzo = true;
    }
}
