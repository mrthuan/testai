package com.apm.insight.l;

import com.apm.insight.nativecrash.NativeImpl;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/* loaded from: classes.dex */
public class f {
    public static File a(String str, int i10, int i11) {
        File file = new File(n.a(com.apm.insight.i.g(), str), "logcat.txt");
        if (!file.exists() || file.length() <= 0) {
            file.getParentFile().mkdirs();
            try {
                file.createNewFile();
            } catch (IOException unused) {
            }
            NativeImpl.a(file.getAbsolutePath(), String.valueOf(i10), String.valueOf(i11));
            return file;
        }
        return file;
    }

    public static File b() {
        File file = new File(n.e(com.apm.insight.i.g()), "maps.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.f(file.getAbsolutePath());
        return file;
    }

    public static File c() {
        File file = new File(n.e(com.apm.insight.i.g()), "meminfo.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.d(file.getAbsolutePath());
        return file;
    }

    public static File d() {
        File file = new File(n.e(com.apm.insight.i.g()), "fds.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.e(file.getAbsolutePath());
        return file;
    }

    public static File e() {
        File file = new File(n.e(com.apm.insight.i.g()), "threads.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.g(file.getAbsolutePath());
        return file;
    }

    public static File f() {
        BufferedWriter bufferedWriter;
        File file = new File(n.e(com.apm.insight.i.g()), "anr_trace.txt");
        if (file.exists()) {
            return file;
        }
        if (!com.apm.insight.runtime.a.f()) {
            return file;
        }
        File file2 = new File("/data/anr/traces.txt");
        if (!file2.exists()) {
            return file;
        }
        BufferedReader bufferedReader = null;
        try {
            file.getParentFile().mkdirs();
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2));
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(file));
                int i10 = 0;
                do {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        bufferedWriter.write(readLine);
                        bufferedWriter.write(10);
                        i10 += readLine.length();
                    } catch (IOException unused) {
                        bufferedReader = bufferedReader2;
                        j.a(bufferedReader);
                        j.a(bufferedWriter);
                        return file;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        j.a(bufferedReader);
                        j.a(bufferedWriter);
                        throw th;
                    }
                } while (i10 < 1048576);
                j.a(bufferedReader2);
            } catch (IOException unused2) {
                bufferedWriter = null;
            } catch (Throwable th3) {
                th = th3;
                bufferedWriter = null;
            }
        } catch (IOException unused3) {
            bufferedWriter = null;
        } catch (Throwable th4) {
            th = th4;
            bufferedWriter = null;
        }
        j.a(bufferedWriter);
        return file;
    }

    public static void a() {
        try {
            a(com.apm.insight.i.f(), com.apm.insight.i.i().getLogcatDumpCount(), com.apm.insight.i.i().getLogcatLevel());
            if (com.apm.insight.i.u()) {
                b();
                d();
                c();
                e();
            }
        } catch (Throwable unused) {
        }
    }
}
