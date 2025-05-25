package com.bytedance.sdk.openadsdk.utils;

import java.util.ArrayList;
import java.util.List;

/* compiled from: InitChecker.java */
/* loaded from: classes.dex */
public class hpZ {
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d A[Catch: all -> 0x00ac, TRY_LEAVE, TryCatch #2 {all -> 0x00ac, blocks: (B:34:0x0087, B:36:0x008d), top: B:47:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void Qhi() {
        /*
            android.content.Context r0 = com.bytedance.sdk.openadsdk.core.HzH.Qhi()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r1 = com.bytedance.sdk.component.utils.ABk.CJ()
            if (r1 != 0) goto Le
            return
        Le:
            java.lang.String r1 = "The pangolin sdk access, the environment is debug, the initial configuration detection starts"
            java.lang.String r2 = "TTAdSdk-InitChecker"
            com.bytedance.sdk.component.utils.ABk.Qhi(r2, r1)
            java.lang.String r1 = r0.getPackageName()
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo()
            int r3 = r3.targetSdkVersion
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r4 = 4096(0x1000, float:5.74E-42)
            r5 = 1
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r4)     // Catch: java.lang.Throwable -> L81
            java.lang.String[] r0 = r0.requestedPermissions     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L7b
            int r1 = r0.length     // Catch: java.lang.Throwable -> L81
            if (r1 <= 0) goto L7b
            java.util.List r1 = cJ()     // Catch: java.lang.Throwable -> L81
            int r4 = r0.length     // Catch: java.lang.Throwable -> L81
            r6 = 0
            r7 = r6
        L38:
            if (r7 >= r4) goto L44
            r8 = r0[r7]     // Catch: java.lang.Throwable -> L81
            if (r8 == 0) goto L41
            r1.remove(r8)     // Catch: java.lang.Throwable -> L81
        L41:
            int r7 = r7 + 1
            goto L38
        L44:
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L50
            java.lang.String r0 = "AndroidManifest.xml permissions configuration is normal"
            com.bytedance.sdk.component.utils.ABk.Qhi(r2, r0)     // Catch: java.lang.Throwable -> L81
            goto L87
        L50:
            java.util.Iterator r0 = r1.iterator()     // Catch: java.lang.Throwable -> L81
        L54:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L81
            if (r1 == 0) goto L87
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L81
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L81
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L78
            java.lang.String r5 = "    May be missing permissions："
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L78
            r4.append(r1)     // Catch: java.lang.Throwable -> L78
            java.lang.String r1 = "，Please refer to the access documentation"
            r4.append(r1)     // Catch: java.lang.Throwable -> L78
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L78
            com.bytedance.sdk.component.utils.ABk.Qhi(r2, r1)     // Catch: java.lang.Throwable -> L78
            r5 = r6
            goto L54
        L78:
            r0 = move-exception
            r5 = r6
            goto L82
        L7b:
            java.lang.String r0 = "The uses-permission configuration in AndroidManifest.xml is missing, please refer to the access documentation"
            com.bytedance.sdk.component.utils.ABk.Qhi(r2, r0)     // Catch: java.lang.Throwable -> L81
            goto L87
        L81:
            r0 = move-exception
        L82:
            java.lang.String r1 = "The usage-permission configuration error in AndroidManifest.xml, please refer to the access documentation"
            com.bytedance.sdk.component.utils.ABk.Qhi(r2, r1, r0)
        L87:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lac
            r1 = 23
            if (r3 >= r1) goto Lb2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lac
            java.lang.String r4 = "No adaptation required for dynamic permissions：target="
            r1.<init>(r4)     // Catch: java.lang.Throwable -> Lac
            r1.append(r3)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r3 = "&phone="
            r1.append(r3)     // Catch: java.lang.Throwable -> Lac
            r1.append(r0)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r0 = ", require=23"
            r1.append(r0)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> Lac
            com.bytedance.sdk.component.utils.ABk.Qhi(r2, r0)     // Catch: java.lang.Throwable -> Lac
            goto Lb2
        Lac:
            r0 = move-exception
            java.lang.String r1 = "The dynamic permission is abnormal. Please check and read the access document in detail： "
            com.bytedance.sdk.component.utils.ABk.Qhi(r2, r1, r0)
        Lb2:
            if (r5 != 0) goto Lb9
            java.lang.String r0 = "You have not configured permission, please refer to the access documentation, otherwise it will affect the conversion"
            com.bytedance.sdk.component.utils.ABk.Qhi(r2, r0)
        Lb9:
            java.lang.String r0 = "End of pangolin sdk initial configuration test"
            com.bytedance.sdk.component.utils.ABk.Qhi(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.hpZ.Qhi():void");
    }

    private static List<String> cJ() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.INTERNET");
        arrayList.add("android.permission.ACCESS_NETWORK_STATE");
        arrayList.add("android.permission.WAKE_LOCK");
        return arrayList;
    }
}
