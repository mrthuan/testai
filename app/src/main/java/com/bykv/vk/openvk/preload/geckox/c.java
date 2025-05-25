package com.bykv.vk.openvk.preload.geckox;

import android.content.Context;
import android.text.TextUtils;
import androidx.activity.r;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import java.io.File;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import lib.zj.office.fc.openxml4j.opc.ContentTypes;
import org.json.JSONObject;

/* compiled from: GeckoHubUtil.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    static File f7546a;

    /* renamed from: b  reason: collision with root package name */
    static Context f7547b;
    static String c;

    /* renamed from: g  reason: collision with root package name */
    private static final Set<String> f7548g = new HashSet(Arrays.asList("js", "css", "html", "ico", ContentTypes.EXTENSION_JPG_2, ContentTypes.EXTENSION_JPG_1, ContentTypes.EXTENSION_PNG, ContentTypes.EXTENSION_GIF, "woff", "svg", "ttf", "woff2", "webp", "otf", "sfnt"));

    /* renamed from: d  reason: collision with root package name */
    INetWork f7549d;

    /* renamed from: e  reason: collision with root package name */
    private Map.Entry<String, JSONObject> f7550e;

    /* renamed from: f  reason: collision with root package name */
    private Map.Entry<String, JSONObject> f7551f;

    /* compiled from: GeckoHubUtil.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static c f7552a = new c((byte) 0);
    }

    public /* synthetic */ c(byte b10) {
        this();
    }

    public static c a(Context context) {
        f7547b = context;
        if (f7546a == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f7547b.getCacheDir());
            f7546a = new File(r.g(sb2, File.separator, "gecko"));
        }
        return a.f7552a;
    }

    private static String b(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf("?");
        return indexOf == -1 ? str : str.substring(0, indexOf);
    }

    private void c(String str) {
        try {
            if (this.f7549d != null && !TextUtils.isEmpty(str)) {
                this.f7549d.syncDoGet(str);
            }
        } catch (Throwable unused) {
        }
    }

    private c() {
    }

    public static com.bykv.vk.openvk.preload.falconx.loader.a b() {
        try {
            return new com.bykv.vk.openvk.preload.falconx.loader.a(f7547b, "cca47107bfcbdb211d88f3385aeede40", f7546a);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static c a() {
        return a.f7552a;
    }

    public static void a(String str) {
        c = str;
    }

    private JSONObject a(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                Map.Entry<String, JSONObject> entry = this.f7550e;
                if (entry == null || !str.equals(entry.getKey())) {
                    String a10 = com.bykv.vk.openvk.preload.geckox.utils.c.a(new com.bykv.vk.openvk.preload.falconx.loader.a(f7547b, "cca47107bfcbdb211d88f3385aeede40", f7546a).getInputStream(str.concat("/manifest.json")));
                    if (TextUtils.isEmpty(a10)) {
                        return null;
                    }
                    this.f7550e = new AbstractMap.SimpleEntry(str, new JSONObject(a10));
                }
                Map.Entry<String, JSONObject> entry2 = this.f7551f;
                if (entry2 == null || !str.equals(entry2.getKey())) {
                    String a11 = com.bykv.vk.openvk.preload.geckox.utils.c.a(new com.bykv.vk.openvk.preload.falconx.loader.a(f7547b, "cca47107bfcbdb211d88f3385aeede40", f7546a).getInputStream(str.concat("/md5_url_map.json")));
                    if (TextUtils.isEmpty(a11)) {
                        return null;
                    }
                    this.f7551f = new AbstractMap.SimpleEntry(str, new JSONObject(a11));
                }
                JSONObject value = this.f7550e.getValue();
                JSONObject value2 = this.f7551f.getValue();
                String a12 = a(str2, value2);
                if (value.has(a12)) {
                    JSONObject jSONObject = value.getJSONObject(a12);
                    a(value, a12, str2);
                    return jSONObject;
                }
                String b10 = b(str2);
                if (b10 == null) {
                    return null;
                }
                String a13 = a(b10, value2);
                if (value.has(a13)) {
                    JSONObject jSONObject2 = value.getJSONObject(a13);
                    a(value, a13, str2);
                    return jSONObject2;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static String a(String str, JSONObject jSONObject) {
        try {
            return jSONObject.getJSONObject(str).getString("md5");
        } catch (Throwable unused) {
            return "";
        }
    }

    private void a(JSONObject jSONObject, String str, String str2) {
        try {
            if ("once".equals(jSONObject.getJSONObject(str).optJSONObject("cacheStrategy").optString("hitStrategy"))) {
                jSONObject.remove(str);
                c(str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(ILoader iLoader) {
        if (iLoader != null) {
            try {
                iLoader.release();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006e, code lost:
        return new com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel(1, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel a(com.bykv.vk.openvk.preload.falconx.loader.ILoader r8, java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.geckox.c.a(com.bykv.vk.openvk.preload.falconx.loader.ILoader, java.lang.String, java.lang.String):com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel");
    }

    public static int a(ILoader iLoader, String str) {
        if (iLoader == null || str == null) {
            return 0;
        }
        try {
            com.bykv.vk.openvk.preload.falconx.loader.a aVar = new com.bykv.vk.openvk.preload.falconx.loader.a(f7547b, "cca47107bfcbdb211d88f3385aeede40", f7546a);
            String str2 = str + File.separator;
            if (!aVar.f7478b.get()) {
                com.bykv.vk.openvk.preload.geckox.f.b bVar = aVar.f7477a;
                if (!bVar.f7590b.get()) {
                    if (!TextUtils.isEmpty(str2)) {
                        return bVar.a(str2.trim()).b(str2);
                    }
                    throw new RuntimeException("relativePath empty");
                }
                throw new RuntimeException("released");
            }
            throw new RuntimeException("released!");
        } catch (Throwable unused) {
            return 0;
        }
    }
}
