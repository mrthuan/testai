package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.adjust.sdk.Constants;
import com.facebook.FacebookException;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* compiled from: Utility.kt */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: b  reason: collision with root package name */
    public static int f9816b;

    /* renamed from: j  reason: collision with root package name */
    public static Locale f9823j;

    /* renamed from: a  reason: collision with root package name */
    public static final p f9815a = new p();
    public static long c = -1;

    /* renamed from: d  reason: collision with root package name */
    public static long f9817d = -1;

    /* renamed from: e  reason: collision with root package name */
    public static long f9818e = -1;

    /* renamed from: f  reason: collision with root package name */
    public static String f9819f = "";

    /* renamed from: g  reason: collision with root package name */
    public static String f9820g = "";

    /* renamed from: h  reason: collision with root package name */
    public static String f9821h = "NoCarrier";

    /* renamed from: i  reason: collision with root package name */
    public static String f9822i = "";

    /* compiled from: Utility.kt */
    /* loaded from: classes.dex */
    public interface a {
        void a(JSONObject jSONObject);

        void b(FacebookException facebookException);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A(org.json.JSONObject r6, com.facebook.internal.a r7, java.lang.String r8, boolean r9, android.content.Context r10) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.p.A(org.json.JSONObject, com.facebook.internal.a, java.lang.String, boolean, android.content.Context):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x0192 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void B(android.content.Context r11, org.json.JSONObject r12) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.p.B(android.content.Context, org.json.JSONObject):void");
    }

    public static final String C(String str) {
        if (str == null) {
            return null;
        }
        f9815a.getClass();
        byte[] bytes = str.getBytes(kotlin.text.a.f19966b);
        kotlin.jvm.internal.g.d(bytes, "this as java.lang.String).getBytes(charset)");
        return q(Constants.SHA256, bytes);
    }

    public static final <T> boolean a(T t4, T t10) {
        if (t4 == null) {
            if (t10 == null) {
                return true;
            }
            return false;
        }
        return kotlin.jvm.internal.g.a(t4, t10);
    }

    public static void b(Context context, String str) {
        int i10;
        boolean z10;
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie == null) {
            return;
        }
        for (String str2 : (String[]) kotlin.text.k.h0(cookie, new String[]{";"}, 0, 6).toArray(new String[0])) {
            String[] strArr = (String[]) kotlin.text.k.h0(str2, new String[]{"="}, 0, 6).toArray(new String[0]);
            if (strArr.length > 0) {
                StringBuilder sb2 = new StringBuilder();
                String str3 = strArr[0];
                int length = str3.length() - 1;
                int i11 = 0;
                boolean z11 = false;
                while (i11 <= length) {
                    if (!z11) {
                        i10 = i11;
                    } else {
                        i10 = length;
                    }
                    if (kotlin.jvm.internal.g.f(str3.charAt(i10), 32) <= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z11) {
                        if (!z10) {
                            z11 = true;
                        } else {
                            i11++;
                        }
                    } else if (!z10) {
                        break;
                    } else {
                        length--;
                    }
                }
                sb2.append(str3.subSequence(i11, length + 1).toString());
                sb2.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                cookieManager.setCookie(str, sb2.toString());
            }
        }
        cookieManager.removeExpiredCookie();
    }

    public static final void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final String d(String str) {
        if (v(str)) {
            return "";
        }
        return str;
    }

    public static final HashSet<String> e(JSONArray jSONArray) {
        boolean z10;
        if (jSONArray != null) {
            if (jSONArray.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                HashSet<String> hashSet = new HashSet<>();
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    String string = jSONArray.getString(i10);
                    kotlin.jvm.internal.g.d(string, "jsonArray.getString(i)");
                    hashSet.add(string);
                }
                return hashSet;
            }
            return null;
        }
        return null;
    }

    public static final ArrayList f(JSONArray jSONArray) {
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                String string = jSONArray.getString(i10);
                kotlin.jvm.internal.g.d(string, "jsonArray.getString(i)");
                arrayList.add(string);
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    public static final HashMap g(JSONObject jsonObject) {
        kotlin.jvm.internal.g.e(jsonObject, "jsonObject");
        HashMap hashMap = new HashMap();
        JSONArray names = jsonObject.names();
        if (names == null) {
            return hashMap;
        }
        int length = names.length();
        for (int i10 = 0; i10 < length; i10++) {
            try {
                String string = names.getString(i10);
                kotlin.jvm.internal.g.d(string, "keys.getString(i)");
                Object value = jsonObject.get(string);
                if (value instanceof JSONObject) {
                    value = g((JSONObject) value);
                }
                kotlin.jvm.internal.g.d(value, "value");
                hashMap.put(string, value);
            } catch (JSONException unused) {
            }
        }
        return hashMap;
    }

    public static final HashMap h(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            String optString = jSONObject.optString(key);
            if (optString != null) {
                kotlin.jvm.internal.g.d(key, "key");
                hashMap.put(key, optString);
            }
        }
        return hashMap;
    }

    public static final int i(InputStream inputStream, OutputStream outputStream) {
        BufferedInputStream bufferedInputStream;
        kotlin.jvm.internal.g.e(outputStream, "outputStream");
        BufferedInputStream bufferedInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            byte[] bArr = new byte[8192];
            int i10 = 0;
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                outputStream.write(bArr, 0, read);
                i10 += read;
            }
            bufferedInputStream.close();
            if (inputStream != null) {
                inputStream.close();
            }
            return i10;
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream2 = bufferedInputStream;
            if (bufferedInputStream2 != null) {
                bufferedInputStream2.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    public static final void j(URLConnection uRLConnection) {
        if (uRLConnection != null && (uRLConnection instanceof HttpURLConnection)) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    public static final String k(Context context) {
        if (context == null) {
            return "null";
        }
        if (context == context.getApplicationContext()) {
            return "unknown";
        }
        return context.getClass().getSimpleName();
    }

    public static final String l(Context context) {
        String string;
        try {
            com.facebook.d dVar = com.facebook.d.f9685a;
            q.e();
            String str = com.facebook.d.f9689f;
            if (str != null) {
                return str;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i10 = applicationInfo.labelRes;
            if (i10 == 0) {
                string = applicationInfo.nonLocalizedLabel.toString();
            } else {
                string = context.getString(i10);
                kotlin.jvm.internal.g.d(string, "context.getString(stringId)");
            }
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    public static final JSONObject m() {
        if (k6.a.b(p.class)) {
            return null;
        }
        try {
            String string = com.facebook.d.a().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th2) {
            k6.a.a(p.class, th2);
            return null;
        }
    }

    public static final Method n(Class<?> cls, String str, Class<?>... parameterTypes) {
        kotlin.jvm.internal.g.e(parameterTypes, "parameterTypes");
        try {
            return cls.getMethod(str, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static final Method o(String str, String str2, Class<?>... clsArr) {
        try {
            return n(Class.forName(str), str2, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final Object p(String str, String str2, JSONObject jSONObject) {
        Object opt = jSONObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt != null && !(opt instanceof JSONObject) && !(opt instanceof JSONArray)) {
            if (str2 != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt(str2, opt);
                return jSONObject2;
            }
            throw new FacebookException("Got an unexpected non-JSON object.");
        }
        return opt;
    }

    public static String q(String str, byte[] bArr) {
        try {
            MessageDigest hash = MessageDigest.getInstance(str);
            kotlin.jvm.internal.g.d(hash, "hash");
            hash.update(bArr);
            byte[] digest = hash.digest();
            StringBuilder sb2 = new StringBuilder();
            kotlin.jvm.internal.g.d(digest, "digest");
            for (byte b10 : digest) {
                sb2.append(Integer.toHexString((b10 >> 4) & 15));
                sb2.append(Integer.toHexString((b10 >> 0) & 15));
            }
            String sb3 = sb2.toString();
            kotlin.jvm.internal.g.d(sb3, "builder.toString()");
            return sb3;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static final Object r(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static final boolean s() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            String format = String.format("fb%s://applinks", Arrays.copyOf(new Object[]{com.facebook.d.b()}, 1));
            kotlin.jvm.internal.g.d(format, "format(format, *args)");
            intent.setData(Uri.parse(format));
            Context a10 = com.facebook.d.a();
            PackageManager packageManager = a10.getPackageManager();
            String packageName = a10.getPackageName();
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            kotlin.jvm.internal.g.d(queryIntentActivities, "packageManager.queryInte…nager.MATCH_DEFAULT_ONLY)");
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                if (kotlin.jvm.internal.g.a(packageName, resolveInfo.activityInfo.packageName)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static final boolean t() {
        if (k6.a.b(p.class)) {
            return false;
        }
        try {
            JSONObject m10 = m();
            if (m10 == null) {
                return false;
            }
            try {
                JSONArray jSONArray = m10.getJSONArray("data_processing_options");
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    String string = jSONArray.getString(i10);
                    kotlin.jvm.internal.g.d(string, "options.getString(i)");
                    String lowerCase = string.toLowerCase();
                    kotlin.jvm.internal.g.d(lowerCase, "this as java.lang.String).toLowerCase()");
                    if (kotlin.jvm.internal.g.a(lowerCase, "ldu")) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        } catch (Throwable th2) {
            k6.a.a(p.class, th2);
            return false;
        }
    }

    public static boolean u(Context context) {
        Method o10 = o("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (o10 == null) {
            return false;
        }
        Object r4 = r(null, o10, context);
        if ((r4 instanceof Integer) && kotlin.jvm.internal.g.a(r4, 0)) {
            return true;
        }
        return false;
    }

    public static final boolean v(String str) {
        boolean z10;
        if (str == null) {
            return true;
        }
        if (str.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return false;
    }

    public static final ArrayList w(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(jSONArray.getString(i10));
        }
        return arrayList;
    }

    public static final HashMap x(String str) {
        boolean z10;
        if (str.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                kotlin.jvm.internal.g.d(key, "key");
                String string = jSONObject.getString(key);
                kotlin.jvm.internal.g.d(string, "jsonObject.getString(key)");
                hashMap.put(key, string);
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public static final String y(Map<String, String> map) {
        kotlin.jvm.internal.g.e(map, "map");
        String str = "";
        if (!map.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                str = jSONObject.toString();
            } catch (JSONException unused) {
            }
            kotlin.jvm.internal.g.d(str, "{\n      try {\n        va…\n        \"\"\n      }\n    }");
        }
        return str;
    }

    public static final String z(InputStream inputStream) {
        BufferedInputStream bufferedInputStream;
        Throwable th2;
        InputStreamReader inputStreamReader;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
            } catch (Throwable th3) {
                th2 = th3;
                inputStreamReader = null;
            }
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th2 = th4;
            inputStreamReader = null;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            char[] cArr = new char[2048];
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read != -1) {
                    sb2.append(cArr, 0, read);
                } else {
                    String sb3 = sb2.toString();
                    kotlin.jvm.internal.g.d(sb3, "{\n      bufferedInputStr…gBuilder.toString()\n    }");
                    c(bufferedInputStream);
                    c(inputStreamReader);
                    return sb3;
                }
            }
        } catch (Throwable th5) {
            th2 = th5;
            c(bufferedInputStream);
            c(inputStreamReader);
            throw th2;
        }
    }
}
