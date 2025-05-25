package na;

import android.util.Log;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: MetaDataStore.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f22375b = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final ra.d f22376a;

    public e(ra.d dVar) {
        this.f22376a = dVar;
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String str2 = null;
            if (!jSONObject.isNull(next)) {
                str2 = jSONObject.optString(next, null);
            }
            hashMap.put(next, str2);
        }
        return hashMap;
    }

    public static void d(File file) {
        if (file.exists() && file.delete()) {
            file.getAbsolutePath();
        }
    }

    public final Map<String, String> b(String str, boolean z10) {
        File c;
        FileInputStream fileInputStream;
        ra.d dVar = this.f22376a;
        if (z10) {
            c = dVar.c(str, "internal-keys");
        } else {
            c = dVar.c(str, "keys");
        }
        if (c.exists() && c.length() != 0) {
            FileInputStream fileInputStream2 = null;
            try {
                try {
                    fileInputStream = new FileInputStream(c);
                    try {
                        HashMap a10 = a(CommonUtils.k(fileInputStream));
                        CommonUtils.a(fileInputStream);
                        return a10;
                    } catch (Exception unused) {
                        fileInputStream2 = fileInputStream;
                        d(c);
                        CommonUtils.a(fileInputStream2);
                        return Collections.emptyMap();
                    } catch (Throwable th2) {
                        th = th2;
                        CommonUtils.a(fileInputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream = fileInputStream2;
                }
            } catch (Exception unused2) {
            }
        } else {
            d(c);
            return Collections.emptyMap();
        }
    }

    public final String c(String str) {
        FileInputStream fileInputStream;
        String str2;
        File c = this.f22376a.c(str, "user-data");
        FileInputStream fileInputStream2 = null;
        if (c.exists() && c.length() != 0) {
            try {
                fileInputStream = new FileInputStream(c);
            } catch (Exception unused) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                CommonUtils.a(fileInputStream2);
                throw th;
            }
            try {
                try {
                    JSONObject jSONObject = new JSONObject(CommonUtils.k(fileInputStream));
                    if (!jSONObject.isNull("userId")) {
                        str2 = jSONObject.optString("userId", null);
                    } else {
                        str2 = null;
                    }
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    CommonUtils.a(fileInputStream);
                    return str2;
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream2 = fileInputStream;
                    CommonUtils.a(fileInputStream2);
                    throw th;
                }
            } catch (Exception unused2) {
                d(c);
                CommonUtils.a(fileInputStream);
                return null;
            }
        }
        Log.isLoggable("FirebaseCrashlytics", 3);
        d(c);
        return null;
    }
}
