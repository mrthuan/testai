package com.apm.insight.l;

import android.text.TextUtils;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.nativecrash.NativeImpl;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h {
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c2, code lost:
        if (r17 != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c5, code lost:
        r3 = "InvalidStack.NoStackAvailable: Catch a crash not OOM without stack.\n";
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c6, code lost:
        r2.append(r3);
        r2 = r2.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d4, code lost:
        if (r17 != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f9, code lost:
        if (r17 != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00fc, code lost:
        r3 = "InvalidStack.NoStackAvailable: Catch a crash not OOM without stack.\n";
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00fd, code lost:
        r5 = null;
        r0 = null;
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r17 != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.apm.insight.entity.a a(java.io.File r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.l.h.a(java.io.File, boolean):com.apm.insight.entity.a");
    }

    public static JSONArray b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a(new File(str), -1L);
    }

    public static String c(File file) {
        return a(file, "\n");
    }

    public static com.apm.insight.entity.a d(File file) {
        com.apm.insight.entity.a a10 = a(new File(file, "logEventStack"), file.getName().contains("oom"));
        boolean z10 = false;
        for (int i10 = 0; i10 < com.apm.insight.g.d.a(); i10++) {
            File a11 = n.a(file, "." + i10);
            if (a11.exists()) {
                try {
                    a10.c(new JSONObject(c(a11.getAbsolutePath())));
                    z10 = true;
                } catch (Throwable unused) {
                }
            }
        }
        a10.a("crash_type", z10 ? "step" : "simple");
        JSONObject optJSONObject = a10.h().optJSONObject("header");
        JSONObject f10 = Header.a(com.apm.insight.i.g(), a10.h().optLong("crash_time", 0L)).f();
        if (optJSONObject == null) {
            a10.a(f10);
        } else {
            k.a(optJSONObject, f10);
        }
        return a10;
    }

    public static com.apm.insight.entity.e e(String str) {
        try {
            JSONObject jSONObject = new JSONObject(c(str));
            com.apm.insight.entity.e eVar = new com.apm.insight.entity.e();
            eVar.d(jSONObject.optString("aid"));
            eVar.c(jSONObject.optString("did"));
            eVar.e(jSONObject.optString("processName"));
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("alogFiles");
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    arrayList.add(optJSONArray.getString(i10));
                }
                eVar.a(arrayList);
            }
            return eVar;
        } catch (IOException | JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static void f(File file) {
        File file2 = new File(file, "lock");
        try {
            file2.createNewFile();
            NativeImpl.c(file2.getAbsolutePath());
        } catch (Throwable th2) {
            com.apm.insight.c.a().a("NPTH_CATCH", th2);
        }
    }

    public static boolean g(File file) {
        int c;
        if (!file.isFile()) {
            file = new File(file, "lock");
        }
        if (!file.exists()) {
            return false;
        }
        try {
            c = NativeImpl.c(file.getAbsolutePath());
        } catch (Throwable th2) {
            com.apm.insight.c.a().a("NPTH_CATCH", th2);
        }
        if (c > 0) {
            NativeImpl.a(c);
            return false;
        } else if (c >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static JSONArray b(String str, String str2) {
        JSONArray jSONArray = new JSONArray();
        if (str != null && str2 != null) {
            for (String str3 : str.split(str2)) {
                jSONArray.put(str3);
            }
        }
        return jSONArray;
    }

    public static String c(String str) {
        return a(str, "\n");
    }

    public static com.apm.insight.entity.e d(String str) {
        try {
            String c = c(str);
            if (c == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(c);
            com.apm.insight.entity.e eVar = new com.apm.insight.entity.e();
            eVar.a(jSONObject.optString(InMobiNetworkValues.URL));
            eVar.a(jSONObject.optJSONObject("body"));
            eVar.b(jSONObject.optString("dump_file"));
            eVar.a(jSONObject.optBoolean("encrypt", false));
            return eVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0041: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:21:0x0041 */
    public static Map<String, String> e(File file) {
        FileInputStream fileInputStream;
        Closeable closeable;
        Properties properties;
        Closeable closeable2 = null;
        try {
            try {
                properties = new Properties();
                fileInputStream = new FileInputStream(file);
            } catch (IOException e10) {
                e = e10;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                j.a(closeable2);
                throw th;
            }
            try {
                properties.load(fileInputStream);
                Set<String> stringPropertyNames = properties.stringPropertyNames();
                HashMap hashMap = new HashMap();
                for (String str : stringPropertyNames) {
                    hashMap.put(str, properties.getProperty(str));
                }
                j.a(fileInputStream);
                return hashMap;
            } catch (IOException e11) {
                e = e11;
                p.b((Throwable) e);
                j.a(fileInputStream);
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
            closeable2 = closeable;
            j.a(closeable2);
            throw th;
        }
    }

    public static void b(File file, JSONObject jSONObject, boolean z10) {
        if (jSONObject == null) {
            return;
        }
        file.getParentFile().mkdirs();
        BufferedWriter bufferedWriter = null;
        try {
            BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file));
            try {
                l.a(jSONObject, bufferedWriter2);
                j.a(bufferedWriter2);
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                try {
                    try {
                        jSONObject.put("err_write", th.toString());
                        com.apm.insight.entity.a.a(jSONObject, "filters", "err_write", th.getLocalizedMessage());
                    } catch (JSONException unused) {
                        com.apm.insight.c.a().a("NPTH_CATCH", th);
                        j.a(bufferedWriter);
                    }
                } catch (Throwable th3) {
                    j.a(bufferedWriter);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static void c(String str, String str2) {
        a(str2, new File(str));
    }

    public static boolean b(File file) {
        String[] list = file.list();
        return list == null || list.length == 0;
    }

    public static com.apm.insight.entity.e a(File file, CrashType crashType) {
        com.apm.insight.entity.a d10 = d(file);
        String name = file.getName();
        String substring = name.substring(name.lastIndexOf(95) + 1);
        JSONObject optJSONObject = d10.h().optJSONObject("header");
        if (optJSONObject.optString("unique_key", null) == null) {
            try {
                optJSONObject.put("unique_key", "android_" + com.apm.insight.i.c().a() + "_" + substring + "_" + CrashType.LAUNCH);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        com.apm.insight.entity.e eVar = new com.apm.insight.entity.e();
        eVar.a(crashType == CrashType.LAUNCH ? com.apm.insight.k.e.e() : com.apm.insight.k.e.c());
        eVar.a(d10.h());
        eVar.a(com.apm.insight.k.e.a());
        return eVar;
    }

    public static String a(File file, String str) {
        return a(file, str, -1L);
    }

    public static String a(File file, String str, long j10) {
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            if (j10 > 0) {
                try {
                    bufferedReader2.skip(j10);
                    bufferedReader2.readLine();
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    j.a(bufferedReader);
                    throw th;
                }
            }
            while (true) {
                String readLine = bufferedReader2.readLine();
                if (readLine == null) {
                    j.a(bufferedReader2);
                    return sb2.toString();
                }
                if (sb2.length() != 0 && str != null) {
                    sb2.append(str);
                }
                sb2.append(readLine);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static String a(File file, String str, String str2, JSONObject jSONObject, String str3, boolean z10) {
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str);
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(InMobiNetworkValues.URL, str2);
            jSONObject2.put("body", jSONObject);
            if (str3 == null) {
                str3 = "";
            }
            jSONObject2.put("dump_file", str3);
            jSONObject2.put("encrypt", z10);
            a(file2, jSONObject2, false);
        } catch (IOException | JSONException e10) {
            e10.printStackTrace();
        }
        return file2.getAbsolutePath();
    }

    public static String a(File file, String str, String str2, JSONObject jSONObject, boolean z10) {
        return a(file, str, str2, jSONObject, null, z10);
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a(new File(str), str2);
    }

    public static JSONArray a(File file, long j10) {
        JSONArray jSONArray = new JSONArray();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            if (j10 > 0) {
                try {
                    bufferedReader2.skip(j10);
                    bufferedReader2.readLine();
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    j.a(bufferedReader);
                    throw th;
                }
            }
            while (true) {
                String readLine = bufferedReader2.readLine();
                if (readLine == null) {
                    j.a(bufferedReader2);
                    return jSONArray;
                }
                jSONArray.put(readLine);
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static void a(File file, File file2) {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        if (file == null || file2 == null) {
            return;
        }
        FileInputStream fileInputStream2 = null;
        try {
            file2.getParentFile().mkdirs();
            fileInputStream = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
            } catch (Exception e10) {
                e = e10;
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Exception e11) {
            e = e11;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            j.a(fileInputStream);
        } catch (Exception e12) {
            e = e12;
            fileInputStream2 = fileInputStream;
            try {
                e.printStackTrace();
                j.a(fileInputStream2);
                j.a(fileOutputStream);
            } catch (Throwable th4) {
                th = th4;
                j.a(fileInputStream2);
                j.a(fileOutputStream);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            fileInputStream2 = fileInputStream;
            j.a(fileInputStream2);
            j.a(fileOutputStream);
            throw th;
        }
        j.a(fileOutputStream);
    }

    public static void a(File file, String str, boolean z10) {
        FileOutputStream fileOutputStream;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        file.getParentFile().mkdirs();
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file, z10);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            fileOutputStream.write(str.getBytes());
            fileOutputStream.flush();
            j.a(fileOutputStream);
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            j.a(fileOutputStream2);
            throw th;
        }
    }

    public static void a(File file, Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                Properties properties = new Properties();
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        properties.setProperty(entry.getKey(), entry.getValue());
                    }
                    properties.store(fileOutputStream2, "no");
                    j.a(fileOutputStream2);
                } catch (IOException e10) {
                    e = e10;
                    fileOutputStream = fileOutputStream2;
                    p.b((Throwable) e);
                    j.a(fileOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    j.a(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e11) {
            e = e11;
        }
    }

    public static void a(File file, JSONArray jSONArray, boolean z10) {
        BufferedWriter bufferedWriter;
        if (jSONArray == null) {
            return;
        }
        file.getParentFile().mkdirs();
        BufferedWriter bufferedWriter2 = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
        } catch (Throwable unused) {
        }
        try {
            l.a(jSONArray, bufferedWriter);
            j.a(bufferedWriter);
        } catch (Throwable unused2) {
            bufferedWriter2 = bufferedWriter;
            j.a(bufferedWriter2);
        }
    }

    public static void a(File file, JSONObject jSONObject, boolean z10) {
        BufferedWriter bufferedWriter;
        if (jSONObject == null) {
            return;
        }
        file.getParentFile().mkdirs();
        BufferedWriter bufferedWriter2 = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
        } catch (Throwable unused) {
        }
        try {
            l.a(jSONObject, bufferedWriter);
            j.a(bufferedWriter);
        } catch (Throwable unused2) {
            bufferedWriter2 = bufferedWriter;
            j.a(bufferedWriter2);
        }
    }

    public static void a(OutputStream outputStream, File... fileArr) {
        ZipOutputStream zipOutputStream;
        ZipOutputStream zipOutputStream2 = null;
        try {
            zipOutputStream = new ZipOutputStream(outputStream);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            zipOutputStream.putNextEntry(new ZipEntry(PackagingURIHelper.FORWARD_SLASH_STRING));
            for (File file : fileArr) {
                a(zipOutputStream, file);
            }
            j.a(zipOutputStream);
        } catch (Throwable th3) {
            th = th3;
            zipOutputStream2 = zipOutputStream;
            j.a(zipOutputStream2);
            throw th;
        }
    }

    private static void a(String str, File file) {
        ZipOutputStream zipOutputStream;
        ZipOutputStream zipOutputStream2 = null;
        try {
            new File(str).getParentFile().mkdirs();
            zipOutputStream = new ZipOutputStream(new FileOutputStream(str));
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            a(zipOutputStream, file, "");
            j.a(zipOutputStream);
        } catch (Throwable th3) {
            th = th3;
            zipOutputStream2 = zipOutputStream;
            j.a(zipOutputStream2);
            throw th;
        }
    }

    private static void a(ZipOutputStream zipOutputStream, File file) {
        if (file == null || !file.exists()) {
            return;
        }
        File[] listFiles = file.isDirectory() ? file.listFiles() : new File[]{file};
        if (listFiles == null) {
            return;
        }
        for (File file2 : listFiles) {
            a(zipOutputStream, file2, file2.getName());
        }
    }

    private static void a(ZipOutputStream zipOutputStream, File file, String str) {
        FileInputStream fileInputStream;
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            zipOutputStream.putNextEntry(new ZipEntry(a6.h.c(str, PackagingURIHelper.FORWARD_SLASH_STRING)));
            String concat = str.length() == 0 ? "" : str.concat(PackagingURIHelper.FORWARD_SLASH_STRING);
            for (int i10 = 0; i10 < listFiles.length; i10++) {
                File file2 = listFiles[i10];
                StringBuilder k10 = a0.a.k(concat);
                k10.append(listFiles[i10].getName());
                a(zipOutputStream, file2, k10.toString());
            }
            return;
        }
        zipOutputStream.putNextEntry(new ZipEntry(str));
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (-1 == read) {
                    j.a(fileInputStream);
                    return;
                }
                zipOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream2 = fileInputStream;
            j.a(fileInputStream2);
            throw th;
        }
    }

    public static boolean a(File file) {
        boolean a10;
        boolean z10 = true;
        if (file.exists()) {
            if (file.canWrite()) {
                if (file.isFile()) {
                    return file.delete();
                }
                if (file.isDirectory()) {
                    File[] listFiles = file.listFiles();
                    for (int i10 = 0; listFiles != null && i10 < listFiles.length; i10++) {
                        if (!listFiles[i10].isFile()) {
                            a10 = a(listFiles[i10]);
                        } else if (listFiles[i10].canWrite()) {
                            a10 = listFiles[i10].delete();
                        } else {
                            z10 = false;
                        }
                        z10 &= a10;
                    }
                    return z10 & file.delete();
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return a(new File(str));
    }

    public static boolean a(JSONArray jSONArray) {
        return jSONArray == null || jSONArray.length() == 0;
    }
}
