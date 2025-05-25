package ta;

import android.text.TextUtils;
import java.util.HashMap;
import ma.f0;

/* compiled from: DefaultSettingsSpiCall.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f29975a;

    /* renamed from: b  reason: collision with root package name */
    public final ge.a f29976b;

    public b(String str, ge.a aVar) {
        if (str != null) {
            this.f29976b = aVar;
            this.f29975a = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }

    public static void a(qa.a aVar, g gVar) {
        b(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", gVar.f29986a);
        b(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        b(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", "18.3.6");
        b(aVar, "Accept", "application/json");
        b(aVar, "X-CRASHLYTICS-DEVICE-MODEL", gVar.f29987b);
        b(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", gVar.c);
        b(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", gVar.f29988d);
        b(aVar, "X-CRASHLYTICS-INSTALLATION-ID", ((f0) gVar.f29989e).c());
    }

    public static void b(qa.a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.c.put(str, str2);
        }
    }

    public static HashMap c(g gVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", gVar.f29992h);
        hashMap.put("display_version", gVar.f29991g);
        hashMap.put("source", Integer.toString(gVar.f29993i));
        String str = gVar.f29990f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }
}
