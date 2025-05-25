package com.inmobi.media;

import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class C8 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f14163a = 0;

    /* JADX WARN: Code restructure failed: missing block: B:74:0x015f, code lost:
        if (kotlin.collections.m.o0(r0, r4 != null ? r4.f14201a : null) != false) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016f  */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.net.HttpURLConnection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.inmobi.media.C1727ma a(com.inmobi.media.C1643ga r8, cg.p r9) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C8.a(com.inmobi.media.ga, cg.p):com.inmobi.media.ma");
    }

    public static HttpURLConnection a(C1643ga c1643ga, String str) {
        URLConnection openConnection = new URL(str).openConnection();
        kotlin.jvm.internal.g.c(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setConnectTimeout(c1643ga.f15108i);
        httpURLConnection.setReadTimeout(c1643ga.f15109j);
        httpURLConnection.setUseCaches(false);
        Map map = c1643ga.c;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
        }
        httpURLConnection.setRequestMethod(c1643ga.f15102b.name());
        if (EnumC1601da.f15018a != c1643ga.f15102b) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
        }
        return httpURLConnection;
    }

    public static void a(String str, HttpURLConnection httpURLConnection, boolean z10) {
        OutputStream bufferedOutputStream;
        OutputStream outputStream = null;
        try {
            if (z10) {
                bufferedOutputStream = new GZIPOutputStream(httpURLConnection.getOutputStream(), 4096);
            } else {
                bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            }
            outputStream = bufferedOutputStream;
            byte[] bytes = str.getBytes(kotlin.text.a.f19966b);
            kotlin.jvm.internal.g.d(bytes, "this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
            outputStream.flush();
        } finally {
            K8.a(outputStream);
        }
    }

    public static C1727ma a(C1643ga c1643ga, HttpURLConnection httpURLConnection) {
        EnumC1849w3 enumC1849w3;
        String str;
        JSONObject jSONObject;
        C1727ma c1727ma = new C1727ma();
        int responseCode = httpURLConnection.getResponseCode();
        c1727ma.f15321d = Integer.valueOf(responseCode);
        c1727ma.f15320b = httpURLConnection.getHeaderFields();
        c1727ma.f15322e = httpURLConnection.getContentLength();
        if (c1643ga.f15110k) {
            return c1727ma;
        }
        if (responseCode == 200) {
            InputStream inputStream = httpURLConnection.getInputStream();
            kotlin.jvm.internal.g.d(inputStream, "getInputStream(...)");
            a(c1727ma, inputStream);
        } else {
            EnumC1849w3.f15552b.getClass();
            if (400 <= responseCode && 500 > responseCode) {
                enumC1849w3 = EnumC1849w3.f15558i;
            } else if (200 < responseCode && 300 > responseCode) {
                enumC1849w3 = EnumC1849w3.f15560k;
            } else {
                enumC1849w3 = (EnumC1849w3) EnumC1849w3.c.get(responseCode);
                if (enumC1849w3 == null) {
                    enumC1849w3 = EnumC1849w3.f15554e;
                }
            }
            if (enumC1849w3 == EnumC1849w3.f15558i) {
                InputStream errorStream = httpURLConnection.getErrorStream();
                kotlin.jvm.internal.g.d(errorStream, "getErrorStream(...)");
                a(c1727ma, errorStream);
                try {
                    jSONObject = new JSONObject(E8.a(c1727ma.c));
                } catch (JSONException unused) {
                }
                if (jSONObject.has("errorMessage")) {
                    str = jSONObject.getString("errorMessage");
                    c1727ma.f15319a = new D8(enumC1849w3, str);
                }
                str = null;
                c1727ma.f15319a = new D8(enumC1849w3, str);
            } else {
                c1727ma.f15319a = new D8(enumC1849w3, b.a.c("HTTP:", responseCode));
            }
        }
        return c1727ma;
    }

    public static void a(C1727ma c1727ma, InputStream inputStream) {
        byte[] a10 = K8.a(inputStream);
        K8.a((Closeable) inputStream);
        if (a10 != null) {
            if (!(a10.length == 0)) {
                kotlin.jvm.internal.g.e(c1727ma, "<this>");
                Map map = c1727ma.f15320b;
                List list = map != null ? (List) map.get("Content-Encoding") : null;
                if (kotlin.jvm.internal.g.a(list != null ? (String) list.get(0) : null, "gzip") && (a10 = K8.a(a10)) == null) {
                    c1727ma.f15319a = new D8(EnumC1849w3.f15557h, "Failed to uncompress gzip response");
                }
                if (a10 != null) {
                    c1727ma.c = a10;
                }
            }
        }
    }
}
