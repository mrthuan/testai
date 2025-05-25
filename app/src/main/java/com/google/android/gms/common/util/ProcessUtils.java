package com.google.android.gms.common.util;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class ProcessUtils {

    /* renamed from: a  reason: collision with root package name */
    public static String f11380a;

    /* renamed from: b  reason: collision with root package name */
    public static int f11381b;

    private ProcessUtils() {
    }

    @KeepForSdk
    public static String a() {
        String str;
        String str2;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        String processName;
        if (f11380a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                f11380a = processName;
            } else {
                int i10 = f11381b;
                if (i10 == 0) {
                    i10 = Process.myPid();
                    f11381b = i10;
                }
                String str3 = null;
                BufferedReader bufferedReader = null;
                BufferedReader bufferedReader2 = null;
                if (i10 > 0) {
                    try {
                        str2 = "/proc/" + i10 + "/cmdline";
                        allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    } catch (IOException unused) {
                        str = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        BufferedReader bufferedReader3 = new BufferedReader(new FileReader(str2));
                        try {
                            String readLine = bufferedReader3.readLine();
                            Preconditions.j(readLine);
                            str = readLine.trim();
                        } catch (IOException unused2) {
                            str = null;
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedReader2 = bufferedReader3;
                            IOUtils.a(bufferedReader2);
                            throw th;
                        }
                        bufferedReader = bufferedReader3;
                        IOUtils.a(bufferedReader);
                        str3 = str;
                    } finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                }
                f11380a = str3;
            }
        }
        return f11380a;
    }
}
