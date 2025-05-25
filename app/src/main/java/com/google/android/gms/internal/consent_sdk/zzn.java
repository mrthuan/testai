package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import x9.a;
import x9.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes2.dex */
public final class zzn {
    private final zzl zza;
    private final Activity zzb;
    private final a zzc;
    private final c zzd;

    public /* synthetic */ zzn(zzl zzlVar, Activity activity, a aVar, c cVar, zzm zzmVar) {
        this.zza = zzlVar;
        this.zzb = activity;
        this.zzc = aVar;
        this.zzd = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.util.List] */
    public static zzci zza(zzn zznVar) {
        Bundle bundle;
        String str;
        Application application;
        Application application2;
        ArrayList arrayList;
        zzap zzapVar;
        Application application3;
        Application application4;
        Application application5;
        Window window;
        View decorView;
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        List<Rect> boundingRects;
        List list;
        Application application6;
        PackageInfo packageInfo;
        Application application7;
        Application application8;
        long j10;
        Application application9;
        zzci zzciVar = new zzci();
        zznVar.zzd.getClass();
        String str2 = null;
        if (TextUtils.isEmpty(null)) {
            try {
                application = zznVar.zza.zza;
                PackageManager packageManager = application.getPackageManager();
                application2 = zznVar.zza.zza;
                bundle = packageManager.getApplicationInfo(application2.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            if (bundle != null) {
                str = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                throw new zzg(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        } else {
            str = null;
        }
        zzciVar.zza = str;
        if (!zznVar.zzc.f31626a) {
            arrayList = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList();
            zznVar.zzc.getClass();
            arrayList2.add(zzcd.PREVIEWING_DEBUG_MESSAGES);
            arrayList = arrayList2;
        }
        zzciVar.zzi = arrayList;
        zzapVar = zznVar.zza.zzb;
        zzciVar.zze = zzapVar.zzc();
        zzciVar.zzd = Boolean.valueOf(zznVar.zzd.f31629a);
        zzciVar.zzc = Locale.getDefault().toLanguageTag();
        zzce zzceVar = new zzce();
        int i10 = Build.VERSION.SDK_INT;
        zzceVar.zzb = Integer.valueOf(i10);
        zzceVar.zza = Build.MODEL;
        zzceVar.zzc = 2;
        zzciVar.zzb = zzceVar;
        application3 = zznVar.zza.zza;
        Configuration configuration = application3.getResources().getConfiguration();
        application4 = zznVar.zza.zza;
        application4.getResources().getConfiguration();
        zzcg zzcgVar = new zzcg();
        zzcgVar.zza = Integer.valueOf(configuration.screenWidthDp);
        zzcgVar.zzb = Integer.valueOf(configuration.screenHeightDp);
        application5 = zznVar.zza.zza;
        zzcgVar.zzc = Double.valueOf(application5.getResources().getDisplayMetrics().density);
        if (i10 < 28) {
            list = Collections.emptyList();
        } else {
            Activity activity = zznVar.zzb;
            if (activity == null) {
                window = null;
            } else {
                window = activity.getWindow();
            }
            if (window == null) {
                decorView = null;
            } else {
                decorView = window.getDecorView();
            }
            if (decorView == null) {
                rootWindowInsets = null;
            } else {
                rootWindowInsets = decorView.getRootWindowInsets();
            }
            if (rootWindowInsets != null) {
                displayCutout = rootWindowInsets.getDisplayCutout();
            } else {
                displayCutout = null;
            }
            if (displayCutout != null) {
                displayCutout.getSafeInsetBottom();
                ArrayList arrayList3 = new ArrayList();
                boundingRects = displayCutout.getBoundingRects();
                for (Rect rect : boundingRects) {
                    if (rect != null) {
                        zzcf zzcfVar = new zzcf();
                        zzcfVar.zzb = Integer.valueOf(rect.left);
                        zzcfVar.zzc = Integer.valueOf(rect.right);
                        zzcfVar.zza = Integer.valueOf(rect.top);
                        zzcfVar.zzd = Integer.valueOf(rect.bottom);
                        arrayList3.add(zzcfVar);
                    }
                }
                list = arrayList3;
            } else {
                list = Collections.emptyList();
            }
        }
        zzcgVar.zzd = list;
        zzciVar.zzf = zzcgVar;
        zzl zzlVar = zznVar.zza;
        application6 = zzlVar.zza;
        try {
            application9 = zzlVar.zza;
            packageInfo = application9.getPackageManager().getPackageInfo(application6.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        zzcc zzccVar = new zzcc();
        zzccVar.zza = application6.getPackageName();
        application7 = zznVar.zza.zza;
        PackageManager packageManager2 = application7.getPackageManager();
        application8 = zznVar.zza.zza;
        CharSequence applicationLabel = packageManager2.getApplicationLabel(application8.getApplicationInfo());
        if (applicationLabel != null) {
            str2 = applicationLabel.toString();
        }
        zzccVar.zzb = str2;
        if (packageInfo != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                j10 = packageInfo.getLongVersionCode();
            } else {
                j10 = packageInfo.versionCode;
            }
            zzccVar.zzc = Long.toString(j10);
        }
        zzciVar.zzg = zzccVar;
        zzch zzchVar = new zzch();
        zzchVar.zza = "3.0.0";
        zzciVar.zzh = zzchVar;
        return zzciVar;
    }
}
