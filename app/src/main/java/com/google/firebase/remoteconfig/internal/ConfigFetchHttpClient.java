package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ConfigFetchHttpClient {

    /* renamed from: h  reason: collision with root package name */
    public static final Pattern f13706h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a  reason: collision with root package name */
    public final Context f13707a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13708b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final String f13709d;

    /* renamed from: e  reason: collision with root package name */
    public final String f13710e;

    /* renamed from: f  reason: collision with root package name */
    public final long f13711f;

    /* renamed from: g  reason: collision with root package name */
    public final long f13712g;

    public ConfigFetchHttpClient(Context context, String str, String str2, long j10, long j11) {
        String str3;
        this.f13707a = context;
        this.f13708b = str;
        this.c = str2;
        Matcher matcher = f13706h.matcher(str);
        if (matcher.matches()) {
            str3 = matcher.group(1);
        } else {
            str3 = null;
        }
        this.f13709d = str3;
        this.f13710e = "firebase";
        this.f13711f = j10;
        this.f13712g = j11;
    }

    public static JSONObject c(URLConnection uRLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), "utf-8"));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read != -1) {
                sb2.append((char) read);
            } else {
                return new JSONObject(sb2.toString());
            }
        }
    }

    public static void d(HttpURLConnection httpURLConnection, byte[] bArr) {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final JSONObject a(String str, String str2, Map<String, String> map, Long l10) {
        long j10;
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("appInstanceId", str);
            hashMap.put("appInstanceIdToken", str2);
            hashMap.put("appId", this.f13708b);
            Context context = this.f13707a;
            Locale locale = context.getResources().getConfiguration().locale;
            hashMap.put("countryCode", locale.getCountry());
            int i10 = Build.VERSION.SDK_INT;
            hashMap.put("languageCode", locale.toLanguageTag());
            hashMap.put("platformVersion", Integer.toString(i10));
            hashMap.put("timeZone", TimeZone.getDefault().getID());
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                if (packageInfo != null) {
                    hashMap.put("appVersion", packageInfo.versionName);
                    if (i10 >= 28) {
                        j10 = m0.a.b(packageInfo);
                    } else {
                        j10 = packageInfo.versionCode;
                    }
                    hashMap.put("appBuild", Long.toString(j10));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            hashMap.put("packageName", context.getPackageName());
            hashMap.put("sdkVersion", "21.3.0");
            hashMap.put("analyticsUserProperties", new JSONObject(map));
            if (l10 != null) {
                long longValue = l10.longValue();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                hashMap.put("firstOpenTime", simpleDateFormat.format(Long.valueOf(longValue)));
            }
            return new JSONObject(hashMap);
        }
        throw new FirebaseRemoteConfigClientException("Fetch failed: Firebase installation id is null.");
    }

    public final HttpURLConnection b() {
        try {
            return (HttpURLConnection) new URL(String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", this.f13709d, this.f13710e)).openConnection();
        } catch (IOException e10) {
            throw new FirebaseRemoteConfigException(e10.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0079 A[LOOP:0: B:11:0x0073->B:13:0x0079, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00af A[Catch: all -> 0x0168, JSONException -> 0x016a, IOException | JSONException -> 0x016c, TRY_LEAVE, TryCatch #3 {all -> 0x0168, blocks: (B:15:0x0093, B:17:0x00af, B:59:0x015e, B:60:0x0167, B:66:0x016d, B:67:0x0174), top: B:81:0x0093 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015e A[Catch: all -> 0x0168, JSONException -> 0x016a, IOException | JSONException -> 0x016c, TRY_ENTER, TryCatch #3 {all -> 0x0168, blocks: (B:15:0x0093, B:17:0x00af, B:59:0x015e, B:60:0x0167, B:66:0x016d, B:67:0x0174), top: B:81:0x0093 }] */
    @androidx.annotation.Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.firebase.remoteconfig.internal.ConfigFetchHandler.a fetch(java.net.HttpURLConnection r12, java.lang.String r13, java.lang.String r14, java.util.Map<java.lang.String, java.lang.String> r15, java.lang.String r16, java.util.Map<java.lang.String, java.lang.String> r17, java.lang.Long r18, java.util.Date r19) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.fetch(java.net.HttpURLConnection, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.util.Map, java.lang.Long, java.util.Date):com.google.firebase.remoteconfig.internal.ConfigFetchHandler$a");
    }
}
