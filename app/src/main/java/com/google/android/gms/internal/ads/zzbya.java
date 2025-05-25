package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbya {
    private final Object zzi;
    private final AtomicReference zzb = new AtomicReference(null);
    private final Object zzc = new Object();
    private String zzd = null;
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final AtomicInteger zze = new AtomicInteger(-1);
    private final AtomicReference zzf = new AtomicReference(null);
    private final AtomicReference zzg = new AtomicReference(null);
    private final ConcurrentMap zzh = new ConcurrentHashMap(9);

    public zzbya() {
        new AtomicReference(null);
        new ArrayBlockingQueue(20);
        this.zzi = new Object();
    }

    public static final boolean zzq(Context context) {
        zzbbn zzbbnVar = zzbbw.zzac;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (!((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) < ((Integer) zzbaVar.c.zza(zzbbw.zzad)).intValue()) {
            return false;
        }
        if (((Boolean) zzbaVar.c.zza(zzbbw.zzae)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    private final Object zzr(String str, Context context) {
        if (!zzw(context, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
            return null;
        }
        try {
            return zzs(context, str).invoke(this.zzf.get(), new Object[0]);
        } catch (Exception unused) {
            zzv(str, true);
            return null;
        }
    }

    private final Method zzs(Context context, String str) {
        Method method = (Method) this.zzh.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.zzh.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            zzv(str, false);
            return null;
        }
    }

    private final void zzt(Context context, String str, String str2) {
        if (!zzw(context, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
            return;
        }
        Method method = (Method) this.zzh.get(str2);
        if (method == null) {
            try {
                method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                this.zzh.put(str2, method);
            } catch (Exception unused) {
                zzv(str2, false);
                method = null;
            }
        }
        try {
            method.invoke(this.zzf.get(), str);
            com.google.android.gms.ads.internal.util.zze.h("Invoke Firebase method " + str2 + ", Ad Unit Id: " + str);
        } catch (Exception unused2) {
            zzv(str2, false);
        }
    }

    private final void zzu(Context context, String str, String str2, Bundle bundle) {
        if (zzp(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException unused) {
                "Invalid event ID: ".concat(String.valueOf(str2));
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (zzw(context, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
                Method method = (Method) this.zzh.get("logEventInternal");
                if (method == null) {
                    try {
                        method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        this.zzh.put("logEventInternal", method);
                    } catch (Exception unused2) {
                        zzv("logEventInternal", true);
                        method = null;
                    }
                }
                try {
                    method.invoke(this.zzf.get(), "am", str, bundle2);
                } catch (Exception unused3) {
                    zzv("logEventInternal", true);
                }
            }
        }
    }

    private final void zzv(String str, boolean z10) {
        if (!this.zza.get()) {
            com.google.android.gms.ads.internal.util.client.zzm.e("Invoke Firebase method " + str + " error.");
            if (z10) {
                com.google.android.gms.ads.internal.util.client.zzm.e("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
                this.zza.set(true);
            }
        }
    }

    private final boolean zzw(Context context, String str, AtomicReference atomicReference, boolean z10) {
        if (atomicReference.get() == null) {
            try {
                zzbxx.zza(atomicReference, null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            } catch (Exception unused) {
                zzv("getInstance", z10);
                return false;
            }
        }
        return true;
    }

    public final String zza(Context context) {
        Object zzr;
        if (zzp(context) && (zzr = zzr("generateEventId", context)) != null) {
            return zzr.toString();
        }
        return null;
    }

    public final String zzb(final Context context) {
        if (!zzp(context)) {
            return null;
        }
        zzbbn zzbbnVar = zzbbw.zzaa;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        long longValue = ((Long) zzbaVar.c.zza(zzbbnVar)).longValue();
        if (longValue < 0) {
            return (String) zzr("getAppInstanceId", context);
        }
        if (this.zzb.get() == null) {
            zzbbn zzbbnVar2 = zzbbw.zzab;
            zzbxx.zza(this.zzb, null, new ThreadPoolExecutor(((Integer) zzbaVar.c.zza(zzbbnVar2)).intValue(), ((Integer) zzbaVar.c.zza(zzbbnVar2)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new zzbxz(this)));
        }
        try {
            return (String) ((ExecutorService) this.zzb.get()).submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzbxy
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzbya.this.zze(context);
                }
            }).get(longValue, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused) {
            return "TIME_OUT";
        } catch (Exception unused2) {
            return null;
        }
    }

    public final String zzc(Context context) {
        if (zzp(context) && zzw(context, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
            try {
                String str = (String) zzs(context, "getCurrentScreenName").invoke(this.zzf.get(), new Object[0]);
                if (str == null) {
                    str = (String) zzs(context, "getCurrentScreenClass").invoke(this.zzf.get(), new Object[0]);
                }
                if (str == null) {
                    return "";
                }
                return str;
            } catch (Exception unused) {
                zzv("getCurrentScreenName", false);
            }
        }
        return "";
    }

    public final String zzd(Context context) {
        if (!zzp(context)) {
            return null;
        }
        synchronized (this.zzc) {
            String str = this.zzd;
            if (str != null) {
                return str;
            }
            String str2 = (String) zzr("getGmpAppId", context);
            this.zzd = str2;
            return str2;
        }
    }

    public final /* synthetic */ String zze(Context context) {
        return (String) zzr("getAppInstanceId", context);
    }

    public final void zzf(Context context, String str) {
        if (!zzp(context)) {
            return;
        }
        zzt(context, str, "beginAdUnitExposure");
    }

    public final void zzg(Context context, String str) {
        if (!zzp(context)) {
            return;
        }
        zzt(context, str, "endAdUnitExposure");
    }

    public final void zzh(Context context, String str) {
        zzu(context, "_aa", str, null);
    }

    public final void zzi(Context context, String str) {
        zzu(context, "_aq", str, null);
    }

    public final void zzj(Context context, String str, Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str2 : map.keySet()) {
                bundle.putString(str2, (String) map.get(str2));
            }
        }
        zzu(context, "_ac", str, bundle);
    }

    public final void zzk(Context context, String str, Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str2 : map.keySet()) {
                bundle.putString(str2, (String) map.get(str2));
            }
        }
        zzu(context, "_ai", str, bundle);
    }

    public final void zzl(Context context, String str, String str2, String str3, int i10) {
        if (!zzp(context)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str2);
        bundle.putString("reward_type", str3);
        bundle.putInt("reward_value", i10);
        zzu(context, "_ar", str, bundle);
        com.google.android.gms.ads.internal.util.zze.h("Log a Firebase reward video event, reward type: " + str3 + ", reward value: " + i10);
    }

    public final void zzm(Context context, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzah)).booleanValue() && zzp(context) && zzq(context)) {
            synchronized (this.zzi) {
            }
        }
    }

    public final void zzn(Context context, com.google.android.gms.ads.internal.client.zzff zzffVar) {
        zzbyb.zzd(context).zzb().zzc(zzffVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzah)).booleanValue() && zzp(context) && zzq(context)) {
            synchronized (this.zzi) {
            }
        }
    }

    @Deprecated
    public final void zzo(Context context, String str) {
        if (zzp(context) && (context instanceof Activity) && zzw(context, "com.google.firebase.analytics.FirebaseAnalytics", this.zzg, false)) {
            Method method = (Method) this.zzh.get("setCurrentScreen");
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                    this.zzh.put("setCurrentScreen", method);
                } catch (Exception unused) {
                    zzv("setCurrentScreen", false);
                    method = null;
                }
            }
            try {
                method.invoke(this.zzg.get(), (Activity) context, str, context.getPackageName());
            } catch (Exception unused2) {
                zzv("setCurrentScreen", false);
            }
        }
    }

    public final boolean zzp(Context context) {
        boolean z10;
        boolean z11;
        zzbbn zzbbnVar = zzbbw.zzU;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue() && !this.zza.get()) {
            if (((Boolean) zzbaVar.c.zza(zzbbw.zzaf)).booleanValue()) {
                return true;
            }
            if (this.zze.get() == -1) {
                com.google.android.gms.ads.internal.util.client.zzf zzfVar = com.google.android.gms.ads.internal.client.zzay.f10107f.f10108a;
                zzfru zzfruVar = com.google.android.gms.ads.internal.util.client.zzf.f10351b;
                GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.f10884b;
                if (googleApiAvailabilityLight.c(context, 12451000) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    int c = googleApiAvailabilityLight.c(context, 12451000);
                    if (c != 0 && c != 2) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z11) {
                        com.google.android.gms.ads.internal.util.client.zzm.e("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.zze.set(0);
                    }
                }
                this.zze.set(1);
            }
            if (this.zze.get() == 1) {
                return true;
            }
        }
        return false;
    }
}
