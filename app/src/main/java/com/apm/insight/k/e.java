package com.apm.insight.k;

import android.text.TextUtils;
import com.apm.insight.Npth;
import com.apm.insight.l.p;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f6596a = false;

    /* renamed from: b  reason: collision with root package name */
    private static h f6597b;

    /* loaded from: classes.dex */
    public enum a {
        NONE(0),
        GZIP(1),
        DEFLATER(2);
        

        /* renamed from: d  reason: collision with root package name */
        final int f6601d;

        a(int i10) {
            this.f6601d = i10;
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5),
        MOBILE_5G(6),
        WIFI_24GHZ(7),
        WIFI_5GHZ(8),
        MOBILE_3G_H(9),
        MOBILE_3G_HP(10);
        

        /* renamed from: l  reason: collision with root package name */
        final int f6613l;

        b(int i10) {
            this.f6613l = i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
        if (r9.endsWith("?") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
        if (r9.endsWith("&") == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0075, code lost:
        r9 = r9.concat(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
        r9 = a6.h.c(r9, "tt_data=a");
        r12 = "application/octet-stream;tt-data=a";
        r1 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.apm.insight.k.l a(long r7, java.lang.String r9, byte[] r10, com.apm.insight.k.e.a r11, java.lang.String r12, boolean r13) {
        /*
            boolean r7 = com.apm.insight.Npth.isStopUpload()
            r8 = 201(0xc9, float:2.82E-43)
            if (r7 == 0) goto Le
            com.apm.insight.k.l r7 = new com.apm.insight.k.l
            r7.<init>(r8)
            return r7
        Le:
            if (r9 != 0) goto L16
            com.apm.insight.k.l r7 = new com.apm.insight.k.l
            r7.<init>(r8)
            return r7
        L16:
            if (r10 != 0) goto L1b
            r7 = 0
            byte[] r10 = new byte[r7]
        L1b:
            int r7 = r10.length
            com.apm.insight.k.e$a r8 = com.apm.insight.k.e.a.GZIP
            r0 = 128(0x80, float:1.8E-43)
            if (r8 != r11) goto L2b
            if (r7 <= r0) goto L2b
            byte[] r10 = b(r10)
            java.lang.String r7 = "gzip"
            goto L39
        L2b:
            com.apm.insight.k.e$a r8 = com.apm.insight.k.e.a.DEFLATER
            if (r8 != r11) goto L38
            if (r7 <= r0) goto L38
            byte[] r10 = a(r10)
            java.lang.String r7 = "deflate"
            goto L39
        L38:
            r7 = 0
        L39:
            r3 = r7
            r1 = r10
            if (r1 != 0) goto L45
            com.apm.insight.k.l r7 = new com.apm.insight.k.l
            r8 = 202(0xca, float:2.83E-43)
            r7.<init>(r8)
            return r7
        L45:
            if (r13 == 0) goto L8d
            com.apm.insight.runtime.ConfigManager r7 = com.apm.insight.i.i()
            com.apm.insight.e r7 = r7.getEncryptImpl()
            byte[] r7 = r7.a(r1)
            if (r7 == 0) goto L82
            java.net.URL r8 = new java.net.URL
            r8.<init>(r9)
            java.lang.String r8 = r8.getQuery()
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 == 0) goto L6d
            java.lang.String r8 = "?"
            boolean r10 = r9.endsWith(r8)
            if (r10 != 0) goto L79
            goto L75
        L6d:
            java.lang.String r8 = "&"
            boolean r10 = r9.endsWith(r8)
            if (r10 != 0) goto L79
        L75:
            java.lang.String r9 = r9.concat(r8)
        L79:
            java.lang.String r8 = "tt_data=a"
            java.lang.String r9 = a6.h.c(r9, r8)
            java.lang.String r12 = "application/octet-stream;tt-data=a"
            r1 = r7
        L82:
            r0 = r9
            r2 = r12
            java.lang.String r4 = "POST"
            r5 = 1
            r6 = 1
            com.apm.insight.k.l r7 = a(r0, r1, r2, r3, r4, r5, r6)
            return r7
        L8d:
            java.lang.String r4 = "POST"
            r5 = 1
            r6 = 0
            r0 = r9
            r2 = r12
            com.apm.insight.k.l r7 = a(r0, r1, r2, r3, r4, r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.k.e.a(long, java.lang.String, byte[], com.apm.insight.k.e$a, java.lang.String, boolean):com.apm.insight.k.l");
    }

    public static l b(String str, String str2) {
        return a(str, str2, a());
    }

    private static l c(byte[] bArr) {
        return new l(204, bArr);
    }

    public static String d() {
        return com.apm.insight.i.i().getAlogUploadUrl();
    }

    public static String e() {
        return com.apm.insight.i.i().getLaunchCrashUploadUrl();
    }

    public static String f() {
        return com.apm.insight.i.i().getExceptionUploadUrl();
    }

    public static String g() {
        return com.apm.insight.i.i().getNativeCrashUploadUrl();
    }

    public static l b(String str, String str2, File... fileArr) {
        if (Npth.isStopUpload()) {
            return new l(201);
        }
        try {
            j jVar = new j(c(str, b() ? "have_dump=true&encrypt=true" : "have_dump=true"), "UTF-8", true);
            jVar.a("json", str2, false);
            jVar.a("file", fileArr);
            try {
                return new l(0, new JSONObject(jVar.a()));
            } catch (JSONException e10) {
                return new l(0, e10);
            }
        } catch (IOException e11) {
            e11.printStackTrace();
            return new l(207);
        }
    }

    public static String c() {
        return com.apm.insight.i.i().getJavaCrashUploadUrl();
    }

    private static String d(String str, String str2) {
        if (str2 == null) {
            str2 = "UTF-8";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    private static l b(String str, byte[] bArr, String str2, String str3, String str4, boolean z10, boolean z11) {
        InputStream inputStream;
        byte[] a10;
        DataOutputStream dataOutputStream;
        HttpURLConnection httpURLConnection = null;
        GZIPInputStream gZIPInputStream = null;
        try {
            h hVar = f6597b;
            if (hVar != null) {
                try {
                    str = hVar.a(str, bArr);
                } catch (Throwable unused) {
                }
            }
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
            try {
                if (z10) {
                    httpURLConnection2.setDoOutput(true);
                } else {
                    httpURLConnection2.setDoOutput(false);
                }
                if (str2 != null) {
                    httpURLConnection2.setRequestProperty("Content-Type", str2);
                }
                if (str3 != null) {
                    httpURLConnection2.setRequestProperty("Content-Encoding", str3);
                }
                httpURLConnection2.setRequestProperty("Accept-Encoding", "gzip");
                if (str4 != null) {
                    httpURLConnection2.setRequestMethod(str4);
                    if (bArr != null && bArr.length > 0) {
                        try {
                            dataOutputStream = new DataOutputStream(httpURLConnection2.getOutputStream());
                        } catch (Throwable th2) {
                            th = th2;
                            dataOutputStream = null;
                        }
                        try {
                            dataOutputStream.write(bArr);
                            dataOutputStream.flush();
                            com.apm.insight.l.j.a(dataOutputStream);
                        } catch (Throwable th3) {
                            th = th3;
                            com.apm.insight.l.j.a(dataOutputStream);
                            throw th;
                        }
                    }
                    int responseCode = httpURLConnection2.getResponseCode();
                    if (responseCode != 200) {
                        l lVar = new l(206, "http response code " + responseCode);
                        try {
                            httpURLConnection2.disconnect();
                        } catch (Exception unused2) {
                        }
                        com.apm.insight.l.j.a((Closeable) null);
                        return lVar;
                    }
                    InputStream inputStream2 = httpURLConnection2.getInputStream();
                    try {
                        if ("gzip".equalsIgnoreCase(httpURLConnection2.getContentEncoding())) {
                            try {
                                GZIPInputStream gZIPInputStream2 = new GZIPInputStream(inputStream2);
                                try {
                                    a10 = a(gZIPInputStream2);
                                    com.apm.insight.l.j.a(gZIPInputStream2);
                                } catch (Throwable th4) {
                                    th = th4;
                                    gZIPInputStream = gZIPInputStream2;
                                    com.apm.insight.l.j.a(gZIPInputStream);
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        } else {
                            a10 = a(inputStream2);
                        }
                        l c = c(a10);
                        try {
                            httpURLConnection2.disconnect();
                        } catch (Exception unused3) {
                        }
                        com.apm.insight.l.j.a(inputStream2);
                        return c;
                    } catch (Throwable th6) {
                        httpURLConnection = httpURLConnection2;
                        inputStream = inputStream2;
                        th = th6;
                        try {
                            p.a(th);
                            return new l(207, th);
                        } finally {
                            if (httpURLConnection != null) {
                                try {
                                    httpURLConnection.disconnect();
                                } catch (Exception unused4) {
                                }
                            }
                            com.apm.insight.l.j.a(inputStream);
                        }
                    }
                }
                throw new IllegalArgumentException("request method is not null");
            } catch (Throwable th7) {
                th = th7;
                httpURLConnection = httpURLConnection2;
                inputStream = null;
            }
        } catch (Throwable th8) {
            th = th8;
            inputStream = null;
        }
    }

    private static String c(String str, String str2) {
        try {
            if (TextUtils.isEmpty(new URL(str).getQuery())) {
                if (!str.endsWith("?")) {
                    str = str.concat("?");
                }
            } else if (!str.endsWith("&")) {
                str = str.concat("&");
            }
            return str + str2;
        } catch (Throwable unused) {
            return str;
        }
    }

    public static boolean b() {
        return false;
    }

    private static byte[] b(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th2) {
            try {
                p.b(th2);
                gZIPOutputStream.close();
                return null;
            } catch (Throwable th3) {
                gZIPOutputStream.close();
                throw th3;
            }
        }
    }

    public static l a(String str, String str2) {
        return a(str, str2, b());
    }

    public static l a(String str, String str2, boolean z10) {
        try {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                return a(2097152L, str, str2.getBytes(), a.GZIP, "application/json; charset=utf-8", z10);
            }
            return new l(201);
        } catch (Throwable th2) {
            p.b(th2);
            return new l(207, th2);
        }
    }

    public static l a(String str, String str2, File... fileArr) {
        return b(str, str2, fileArr);
    }

    private static l a(String str, byte[] bArr, String str2, String str3, String str4, boolean z10, boolean z11) {
        return b(str, bArr, str2, str3, str4, z10, z11);
    }

    private static String a(String str, Map map) {
        if (TextUtils.isDigitsOnly(str) || map == null || map.isEmpty()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str);
        if (!str.contains("?")) {
            sb2.append("?");
        }
        try {
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    if (!sb2.toString().endsWith("?")) {
                        sb2.append("&");
                    }
                    sb2.append(d(entry.getKey().toString(), "UTF-8"));
                    sb2.append("=");
                    sb2.append(d(entry.getValue().toString(), "UTF-8"));
                }
            }
            return sb2.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    public static void a(h hVar) {
        f6597b = hVar;
    }

    public static boolean a() {
        return false;
    }

    public static boolean a(String str, String str2, String str3, String str4, List<String> list) {
        if (Npth.isStopUpload()) {
            return false;
        }
        try {
            j jVar = new j(str, "UTF-8", false);
            jVar.a("aid", str2);
            jVar.a("device_id", str3);
            jVar.a("os", "Android");
            jVar.a("process_name", str4);
            for (String str5 : list) {
                File file = new File(str5);
                if (file.exists()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("logtype", "alog");
                    hashMap.put("scene", "Crash");
                    jVar.a(file.getName(), file, hashMap);
                }
            }
            return new JSONObject(jVar.a()).optInt("errno", -1) == 200;
        } catch (IOException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    private static byte[] a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                inputStream.close();
                try {
                    return byteArrayOutputStream.toByteArray();
                } finally {
                    com.apm.insight.l.j.a(byteArrayOutputStream);
                }
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static byte[] a(String str, Map<String, String> map, byte[] bArr) {
        try {
            return a(2097152L, a(str, map), bArr, a.GZIP, "application/json; charset=utf-8", false).b();
        } catch (IOException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private static byte[] a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        Deflater deflater = new Deflater();
        deflater.setInput(bArr);
        deflater.finish();
        byte[] bArr2 = new byte[8192];
        while (!deflater.finished()) {
            byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
        }
        deflater.end();
        return byteArrayOutputStream.toByteArray();
    }
}
