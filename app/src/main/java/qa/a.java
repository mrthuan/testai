package qa;

import a6.h;
import android.util.Log;
import androidx.activity.f;
import com.google.android.play.core.assetpacks.h1;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import lib.zj.office.fc.hpsf.Constants;

/* compiled from: HttpGetRequest.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f29140a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, String> f29141b;
    public final HashMap c = new HashMap();

    public a(String str, HashMap hashMap) {
        this.f29140a = str;
        this.f29141b = hashMap;
    }

    public static String a(String str, Map map) {
        String str2;
        String str3;
        StringBuilder sb2 = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb2.append((String) entry.getKey());
        sb2.append("=");
        if (entry.getValue() == null) {
            str2 = "";
        } else {
            str2 = URLEncoder.encode((String) entry.getValue(), "UTF-8");
        }
        sb2.append(str2);
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb2.append("&");
            sb2.append((String) entry2.getKey());
            sb2.append("=");
            if (entry2.getValue() == null) {
                str3 = "";
            } else {
                str3 = URLEncoder.encode((String) entry2.getValue(), "UTF-8");
            }
            sb2.append(str3);
        }
        String sb3 = sb2.toString();
        if (sb3.isEmpty()) {
            return str;
        }
        if (str.contains("?")) {
            if (!str.endsWith("&")) {
                sb3 = "&".concat(sb3);
            }
            return h.c(str, sb3);
        }
        return f.m(str, "?", sb3);
    }

    public final h1 b() {
        Throwable th2;
        HttpsURLConnection httpsURLConnection;
        InputStream inputStream = null;
        String sb2 = null;
        inputStream = null;
        try {
            String a10 = a(this.f29140a, this.f29141b);
            Log.isLoggable("FirebaseCrashlytics", 2);
            httpsURLConnection = (HttpsURLConnection) new URL(a10).openConnection();
            try {
                httpsURLConnection.setReadTimeout(Constants.CP_MAC_ROMAN);
                httpsURLConnection.setConnectTimeout(Constants.CP_MAC_ROMAN);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : this.c.entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
                        char[] cArr = new char[8192];
                        StringBuilder sb3 = new StringBuilder();
                        while (true) {
                            int read = bufferedReader.read(cArr);
                            if (read == -1) {
                                break;
                            }
                            sb3.append(cArr, 0, read);
                        }
                        sb2 = sb3.toString();
                    } catch (Throwable th3) {
                        th2 = th3;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th2;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new h1(responseCode, sb2);
            } catch (Throwable th4) {
                th2 = th4;
            }
        } catch (Throwable th5) {
            th2 = th5;
            httpsURLConnection = null;
        }
    }
}
