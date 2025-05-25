package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* compiled from: CpuUtils.java */
/* loaded from: classes.dex */
public class Sf {

    /* compiled from: CpuUtils.java */
    /* renamed from: com.bytedance.sdk.openadsdk.utils.Sf$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static class AnonymousClass1 implements FilenameFilter {
        private final Pattern Qhi = Pattern.compile("^cpu[0-9]+$");

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return this.Qhi.matcher(str).matches();
        }
    }

    public static int Qhi() {
        return Math.max(Runtime.getRuntime().availableProcessors(), 0);
    }

    public static int ac(Context context) {
        return com.bytedance.sdk.openadsdk.core.ac.Qhi(context).cJ("cpu_min_frequency", 0);
    }

    public static int cJ(Context context) {
        return com.bytedance.sdk.openadsdk.core.ac.Qhi(context).cJ("cpu_max_frequency", 0);
    }

    public static int Qhi(Context context) {
        return com.bytedance.sdk.openadsdk.core.ac.Qhi(context).cJ("cpu_count", 0);
    }

    public static int cJ(int i10) {
        BufferedReader bufferedReader;
        Throwable th2;
        FileReader fileReader;
        BufferedReader bufferedReader2;
        int parseInt;
        int i11 = 0;
        FileReader fileReader2 = null;
        BufferedReader bufferedReader3 = null;
        while (true) {
            i10--;
            if (i10 < 0) {
                return i11;
            }
            try {
                fileReader = new FileReader("/sys/devices/system/cpu/cpu" + i10 + "/cpufreq/cpuinfo_min_freq");
                try {
                    bufferedReader2 = new BufferedReader(fileReader);
                } catch (Throwable th3) {
                    BufferedReader bufferedReader4 = bufferedReader3;
                    th2 = th3;
                    fileReader2 = fileReader;
                    bufferedReader = bufferedReader4;
                }
            } catch (Throwable th4) {
                bufferedReader = bufferedReader3;
                th2 = th4;
            }
            try {
                String readLine = bufferedReader2.readLine();
                if (!TextUtils.isEmpty(readLine) && ((parseInt = Integer.parseInt(readLine)) < i11 || i11 == 0)) {
                    i11 = parseInt;
                }
                try {
                    bufferedReader2.close();
                    fileReader.close();
                } catch (Exception unused) {
                }
                bufferedReader3 = bufferedReader2;
                fileReader2 = fileReader;
            } catch (Throwable th5) {
                th2 = th5;
                bufferedReader = bufferedReader2;
                fileReader2 = fileReader;
                try {
                    com.bytedance.sdk.component.utils.ABk.Qhi("CpuUtils", th2.getMessage());
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception unused2) {
                            bufferedReader3 = bufferedReader;
                        }
                    }
                    bufferedReader3 = bufferedReader;
                } finally {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception unused3) {
                        }
                    }
                    if (fileReader2 != null) {
                        fileReader2.close();
                    }
                }
            }
        }
    }

    public static int Qhi(int i10) {
        BufferedReader bufferedReader;
        Throwable th2;
        int parseInt;
        int i11 = 0;
        FileReader fileReader = null;
        BufferedReader bufferedReader2 = null;
        while (true) {
            i10--;
            if (i10 < 0) {
                return i11;
            }
            try {
                FileReader fileReader2 = new FileReader("/sys/devices/system/cpu/cpu" + i10 + "/cpufreq/cpuinfo_max_freq");
                try {
                    BufferedReader bufferedReader3 = new BufferedReader(fileReader2);
                    try {
                        String readLine = bufferedReader3.readLine();
                        if (!TextUtils.isEmpty(readLine) && (parseInt = Integer.parseInt(readLine)) > i11) {
                            i11 = parseInt;
                        }
                        try {
                            bufferedReader3.close();
                            fileReader2.close();
                        } catch (Exception unused) {
                        }
                        bufferedReader2 = bufferedReader3;
                        fileReader = fileReader2;
                    } catch (Throwable th3) {
                        th2 = th3;
                        bufferedReader = bufferedReader3;
                        fileReader = fileReader2;
                        try {
                            com.bytedance.sdk.component.utils.ABk.Qhi("CpuUtils", th2.getMessage());
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception unused2) {
                                    bufferedReader2 = bufferedReader;
                                }
                            }
                            bufferedReader2 = bufferedReader;
                        } finally {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception unused3) {
                                }
                            }
                            if (fileReader != null) {
                                fileReader.close();
                            }
                        }
                    }
                } catch (Throwable th4) {
                    BufferedReader bufferedReader4 = bufferedReader2;
                    th2 = th4;
                    fileReader = fileReader2;
                    bufferedReader = bufferedReader4;
                }
            } catch (Throwable th5) {
                bufferedReader = bufferedReader2;
                th2 = th5;
            }
        }
    }
}
