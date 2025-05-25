package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Debug;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

/* loaded from: classes2.dex */
public final class CommonUtils {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f13509a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b  reason: collision with root package name */
    public static long f13510b = -1;

    /* loaded from: classes2.dex */
    public enum Architecture {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        

        /* renamed from: a  reason: collision with root package name */
        public static final HashMap f13511a;

        static {
            Architecture architecture = X86_32;
            Architecture architecture2 = ARMV6;
            Architecture architecture3 = ARMV7;
            Architecture architecture4 = ARM64;
            HashMap hashMap = new HashMap(4);
            f13511a = hashMap;
            hashMap.put("armeabi-v7a", architecture3);
            hashMap.put("armeabi", architecture2);
            hashMap.put("arm64-v8a", architecture4);
            hashMap.put("x86", architecture);
        }

        public static Architecture getValue() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                Log.isLoggable("FirebaseCrashlytics", 2);
                return UNKNOWN;
            }
            Architecture architecture = (Architecture) f13511a.get(str.toLowerCase(Locale.US));
            if (architecture == null) {
                return UNKNOWN;
            }
            return architecture;
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long b(int i10, String str, String str2) {
        return Long.parseLong(str.split(str2)[0].trim()) * i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
        r2 = r3[1];
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.BufferedReader] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String c(java.io.File r6) {
        /*
            java.lang.String r0 = "MemTotal"
            boolean r1 = r6.exists()
            r2 = 0
            if (r1 == 0) goto L47
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L39
        L15:
            java.lang.String r3 = r1.readLine()     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L41
            if (r3 == 0) goto L3d
            java.lang.String r4 = "\\s*:\\s*"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L41
            r5 = 2
            java.lang.String[] r3 = r4.split(r3, r5)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L41
            int r4 = r3.length     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L41
            r5 = 1
            if (r4 <= r5) goto L15
            r4 = 0
            r4 = r3[r4]     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L41
            boolean r4 = r4.equals(r0)     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L41
            if (r4 == 0) goto L15
            r6 = r3[r5]     // Catch: java.lang.Exception -> L3a java.lang.Throwable -> L41
            r2 = r6
            goto L3d
        L37:
            r6 = move-exception
            goto L43
        L39:
            r1 = r2
        L3a:
            r6.toString()     // Catch: java.lang.Throwable -> L41
        L3d:
            a(r1)
            goto L47
        L41:
            r6 = move-exception
            r2 = r1
        L43:
            a(r2)
            throw r6
        L47:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.CommonUtils.c(java.io.File):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int d() {
        boolean z10;
        boolean i10 = i();
        ?? r02 = i10;
        if (j()) {
            r02 = (i10 ? 1 : 0) | true;
        }
        if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return r02 | 4;
        }
        return r02;
    }

    public static String e(Context context) {
        int f10 = f(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (f10 == 0) {
            f10 = f(context, "com.crashlytics.android.build_id", "string");
        }
        if (f10 != 0) {
            return context.getResources().getString(f10);
        }
        return null;
    }

    public static int f(Context context, String str, String str2) {
        String packageName;
        Resources resources = context.getResources();
        int i10 = context.getApplicationContext().getApplicationInfo().icon;
        if (i10 > 0) {
            try {
                packageName = context.getResources().getResourcePackageName(i10);
                if ("android".equals(packageName)) {
                    packageName = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
                packageName = context.getPackageName();
            }
        } else {
            packageName = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, packageName);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0055 -> B:20:0x0057). Please submit an issue!!! */
    public static synchronized long g() {
        long j10;
        long j11;
        synchronized (CommonUtils.class) {
            if (f13510b == -1) {
                String c = c(new File("/proc/meminfo"));
                if (!TextUtils.isEmpty(c)) {
                    String upperCase = c.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            j11 = b(1024, upperCase, "KB");
                        } else if (upperCase.endsWith("MB")) {
                            j11 = b(1048576, upperCase, "MB");
                        } else if (upperCase.endsWith("GB")) {
                            j11 = b(1073741824, upperCase, "GB");
                        }
                    } catch (NumberFormatException unused) {
                    }
                    f13510b = j11;
                }
                j11 = 0;
                f13510b = j11;
            }
            j10 = f13510b;
        }
        return j10;
    }

    public static String h(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = bArr[i10] & 255;
            int i12 = i10 * 2;
            char[] cArr2 = f13509a;
            cArr[i12] = cArr2[i11 >>> 4];
            cArr[i12 + 1] = cArr2[i11 & 15];
        }
        return new String(cArr);
    }

    public static boolean i() {
        if (!Build.PRODUCT.contains("sdk")) {
            String str = Build.HARDWARE;
            if (!str.contains("goldfish") && !str.contains("ranchu")) {
                return false;
            }
        }
        return true;
    }

    public static boolean j() {
        boolean i10 = i();
        String str = Build.TAGS;
        if ((!i10 && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        File file = new File("/system/xbin/su");
        if (!i10 && file.exists()) {
            return true;
        }
        return false;
    }

    public static String k(FileInputStream fileInputStream) {
        Scanner useDelimiter = new Scanner(fileInputStream).useDelimiter("\\A");
        if (useDelimiter.hasNext()) {
            return useDelimiter.next();
        }
        return "";
    }
}
