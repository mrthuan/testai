package com.google.firebase.crashlytics.ndk;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes2.dex */
class JniNativeApi implements f {

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f13546b;
    public static final e c = new e();

    /* renamed from: a  reason: collision with root package name */
    public final Context f13547a;

    static {
        boolean z10;
        try {
            System.loadLibrary("crashlytics");
            z10 = true;
        } catch (UnsatisfiedLinkError e10) {
            e10.getLocalizedMessage();
            z10 = false;
        }
        f13546b = z10;
    }

    public JniNativeApi(Context context) {
        this.f13547a = context;
    }

    @TargetApi(21)
    public static void a(ArrayList arrayList, PackageInfo packageInfo) {
        String num;
        long longVersionCode;
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            Collections.addAll(arrayList, strArr);
        }
        String str = applicationInfo.dataDir;
        Object[] objArr = new Object[1];
        if (Build.VERSION.SDK_INT >= 28) {
            longVersionCode = packageInfo.getLongVersionCode();
            num = Long.toString(longVersionCode);
        } else {
            num = Integer.toString(packageInfo.versionCode);
        }
        objArr[0] = num;
        File file = new File(str, String.format("files/splitcompat/%s/verified-splits", objArr));
        if (!file.exists()) {
            file.getAbsolutePath();
            Log.isLoggable("FirebaseCrashlytics", 3);
            return;
        }
        File[] listFiles = file.listFiles(c);
        if (listFiles == null) {
            listFiles = new File[0];
        }
        file.getAbsolutePath();
        Log.isLoggable("FirebaseCrashlytics", 3);
        for (File file2 : listFiles) {
            file2.getName();
            Log.isLoggable("FirebaseCrashlytics", 3);
            arrayList.add(file2.getAbsolutePath());
        }
    }

    private native boolean nativeInit(String[] strArr, Object obj);

    public final boolean b(AssetManager assetManager, String str) {
        int i10;
        String str2 = Build.CPU_ABI;
        Context context = this.f13547a;
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            if (Build.VERSION.SDK_INT >= 24) {
                i10 = 9216;
            } else {
                i10 = 1024;
            }
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, i10);
            ArrayList arrayList = new ArrayList(10);
            arrayList.add(packageInfo.applicationInfo.sourceDir);
            a(arrayList, packageInfo);
            String[] strArr = packageInfo.applicationInfo.sharedLibraryFiles;
            if (strArr != null) {
                Collections.addAll(arrayList, strArr);
            }
            ArrayList arrayList2 = new ArrayList(10);
            File parentFile = new File(packageInfo.applicationInfo.nativeLibraryDir).getParentFile();
            if (parentFile != null) {
                arrayList2.add(new File(parentFile, str2).getPath());
                if (str2.startsWith("arm64")) {
                    arrayList2.add(new File(parentFile, "arm64").getPath());
                } else if (str2.startsWith("arm")) {
                    arrayList2.add(new File(parentFile, "arm").getPath());
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (str3.endsWith(".apk")) {
                    arrayList2.add(str3 + "!/lib/" + str2);
                }
            }
            arrayList2.add(System.getProperty("java.library.path"));
            arrayList2.add(packageInfo.applicationInfo.nativeLibraryDir);
            String str4 = File.pathSeparator;
            String join = TextUtils.join(str4, arrayList2);
            String str5 = new String[]{TextUtils.join(str4, arrayList), join}[0];
            if (!f13546b || !nativeInit(new String[]{str5, join, str}, assetManager)) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e10) {
            throw new RuntimeException(e10);
        }
    }
}
