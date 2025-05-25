package com.apm.insight.runtime;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private static j f6770a;

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x004b: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:25:0x004b */
    public static JSONArray a(String str) {
        Closeable closeable;
        BufferedReader bufferedReader;
        JSONArray jSONArray;
        Closeable closeable2 = null;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                jSONArray = new JSONArray();
                bufferedReader = new BufferedReader(new FileReader(str));
            } catch (IOException e10) {
                e = e10;
                bufferedReader = null;
            } catch (Throwable th2) {
                th = th2;
                com.apm.insight.l.j.a(closeable2);
                throw th;
            }
            try {
                File file = new File(str);
                if (file.length() > 512000) {
                    bufferedReader.skip(file.length() - 512000);
                }
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        com.apm.insight.l.j.a(bufferedReader);
                        return jSONArray;
                    }
                    jSONArray.put(readLine);
                }
            } catch (IOException e11) {
                e = e11;
                e.printStackTrace();
                com.apm.insight.l.j.a(bufferedReader);
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
            closeable2 = closeable;
        }
    }

    public static JSONArray b(String str) {
        if (f6770a != null && com.apm.insight.i.f().equals(str)) {
            try {
                return a(f6770a.a());
            } catch (Throwable th2) {
                com.apm.insight.c.a().a("NPTH_CATCH", th2);
            }
        }
        try {
            return a(com.apm.insight.l.f.a(str, com.apm.insight.i.i().getLogcatDumpCount(), com.apm.insight.i.i().getLogcatLevel()).getAbsolutePath());
        } catch (Throwable th3) {
            com.apm.insight.c.a().a("NPTH_CATCH", th3);
            return null;
        }
    }

    public static void a(j jVar) {
        f6770a = jVar;
    }
}
