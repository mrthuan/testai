package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
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
import java.util.UUID;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;
import x5.a;

/* compiled from: AppEvent.kt */
/* loaded from: classes.dex */
public final class AppEvent implements Serializable {
    public static final a Companion = new a();

    /* renamed from: a  reason: collision with root package name */
    public static final HashSet<String> f9463a = new HashSet<>();
    private static final long serialVersionUID = 1;
    private final String checksum;
    private final boolean inBackground;
    private final boolean isImplicit;
    private final JSONObject jsonObject;
    private final String name;
    private final JSONObject operationalJsonObject;

    /* compiled from: AppEvent.kt */
    /* loaded from: classes.dex */
    public static final class SerializationProxyV2 implements Serializable {
        public static final a Companion = new a();
        private static final long serialVersionUID = 20160803001L;
        private final String checksum;
        private final boolean inBackground;
        private final boolean isImplicit;
        private final String jsonString;
        private final String operationalJsonString;

        /* compiled from: AppEvent.kt */
        /* loaded from: classes.dex */
        public static final class a {
        }

        public SerializationProxyV2(String jsonString, String operationalJsonString, boolean z10, boolean z11, String str) {
            kotlin.jvm.internal.g.e(jsonString, "jsonString");
            kotlin.jvm.internal.g.e(operationalJsonString, "operationalJsonString");
            this.jsonString = jsonString;
            this.operationalJsonString = operationalJsonString;
            this.isImplicit = z10;
            this.inBackground = z11;
            this.checksum = str;
        }

        private final Object readResolve() {
            return new AppEvent(this.jsonString, this.operationalJsonString, this.isImplicit, this.inBackground, this.checksum, null);
        }
    }

    /* compiled from: AppEvent.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static void a(String identifier) {
            boolean z10;
            boolean contains;
            kotlin.jvm.internal.g.e(identifier, "identifier");
            if (identifier.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && identifier.length() <= 40) {
                synchronized (AppEvent.f9463a) {
                    contains = AppEvent.f9463a.contains(identifier);
                    tf.d dVar = tf.d.f30009a;
                }
                if (!contains) {
                    if (new Regex("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").matches(identifier)) {
                        synchronized (AppEvent.f9463a) {
                            AppEvent.f9463a.add(identifier);
                        }
                        return;
                    }
                    throw new FacebookException(b.a.f(new Object[]{identifier}, 1, "Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", "format(format, *args)"));
                }
                return;
            }
            String format = String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{identifier, 40}, 2));
            kotlin.jvm.internal.g.d(format, "format(locale, format, *args)");
            throw new FacebookException(format);
        }
    }

    public /* synthetic */ AppEvent(String str, String str2, Double d10, Bundle bundle, boolean z10, boolean z11, UUID uuid, r rVar, int i10, kotlin.jvm.internal.d dVar) {
        this(str, str2, d10, bundle, z10, z11, uuid, (i10 & 128) != 0 ? null : rVar);
    }

    public static Map validateParameters$default(AppEvent appEvent, Bundle bundle, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        appEvent.getClass();
        HashMap hashMap = new HashMap();
        for (String key : bundle.keySet()) {
            a aVar = Companion;
            kotlin.jvm.internal.g.d(key, "key");
            aVar.getClass();
            a.a(key);
            Object obj2 = bundle.get(key);
            if (!(obj2 instanceof String) && !(obj2 instanceof Number)) {
                throw new FacebookException(b.a.f(new Object[]{obj2, key}, 2, "Parameter value '%s' for key '%s' should be a string or a numeric type.", "format(format, *args)"));
            }
            hashMap.put(key, obj2.toString());
        }
        if (!z10) {
            b6.c cVar = b6.c.f5330a;
            if (!k6.a.b(b6.c.class)) {
                try {
                    if (b6.c.f5331b && !hashMap.isEmpty()) {
                        try {
                            List<String> E0 = kotlin.collections.m.E0(hashMap.keySet());
                            JSONObject jSONObject = new JSONObject();
                            for (String str : E0) {
                                Object obj3 = hashMap.get(str);
                                if (obj3 != null) {
                                    String str2 = (String) obj3;
                                    b6.c cVar2 = b6.c.f5330a;
                                    if (cVar2.a(str) || cVar2.a(str2)) {
                                        hashMap.remove(str);
                                        if (!b6.c.c) {
                                            str2 = "";
                                        }
                                        jSONObject.put(str, str2);
                                    }
                                } else {
                                    throw new IllegalStateException("Required value was null.".toString());
                                }
                            }
                            if (jSONObject.length() != 0) {
                                String jSONObject2 = jSONObject.toString();
                                kotlin.jvm.internal.g.d(jSONObject2, "restrictiveParamJson.toString()");
                                hashMap.put("_onDeviceParams", jSONObject2);
                            }
                        } catch (Exception unused) {
                        }
                    }
                } catch (Throwable th2) {
                    k6.a.a(b6.c.class, th2);
                }
            }
            Map b10 = kotlin.jvm.internal.k.b(hashMap);
            String eventName = appEvent.name;
            e6.a aVar2 = e6.a.f16466a;
            if (!k6.a.b(e6.a.class)) {
                try {
                    kotlin.jvm.internal.g.e(eventName, "eventName");
                    if (e6.a.f16467b) {
                        HashMap hashMap2 = new HashMap();
                        Iterator it = new ArrayList(b10.keySet()).iterator();
                        while (it.hasNext()) {
                            String str3 = (String) it.next();
                            String a10 = e6.a.f16466a.a(eventName, str3);
                            if (a10 != null) {
                                hashMap2.put(str3, a10);
                                b10.remove(str3);
                            }
                        }
                        if (!hashMap2.isEmpty()) {
                            try {
                                JSONObject jSONObject3 = new JSONObject();
                                for (Map.Entry entry : hashMap2.entrySet()) {
                                    jSONObject3.put((String) entry.getKey(), (String) entry.getValue());
                                }
                                b10.put("_restrictedParams", jSONObject3.toString());
                            } catch (JSONException unused2) {
                            }
                        }
                    }
                } catch (Throwable th3) {
                    k6.a.a(e6.a.class, th3);
                }
            }
            Map b11 = kotlin.jvm.internal.k.b(hashMap);
            String eventName2 = appEvent.name;
            x5.a aVar3 = x5.a.f31618a;
            if (!k6.a.b(x5.a.class)) {
                try {
                    kotlin.jvm.internal.g.e(eventName2, "eventName");
                    if (x5.a.f31619b) {
                        ArrayList arrayList = new ArrayList(b11.keySet());
                        Iterator it2 = new ArrayList(x5.a.c).iterator();
                        while (it2.hasNext()) {
                            a.C0406a c0406a = (a.C0406a) it2.next();
                            if (kotlin.jvm.internal.g.a(c0406a.f31621a, eventName2)) {
                                Iterator it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                    String str4 = (String) it3.next();
                                    if (c0406a.f31622b.contains(str4)) {
                                        b11.remove(str4);
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th4) {
                    k6.a.a(x5.a.class, th4);
                }
            }
        }
        return hashMap;
    }

    private final Object writeReplace() {
        String jSONObject = this.jsonObject.toString();
        kotlin.jvm.internal.g.d(jSONObject, "jsonObject.toString()");
        String jSONObject2 = this.operationalJsonObject.toString();
        kotlin.jvm.internal.g.d(jSONObject2, "operationalJsonObject.toString()");
        return new SerializationProxyV2(jSONObject, jSONObject2, this.isImplicit, this.inBackground, this.checksum);
    }

    public final boolean getIsImplicit() {
        return this.isImplicit;
    }

    public final JSONObject getJSONObject() {
        return this.jsonObject;
    }

    public final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    public final String getName() {
        return this.name;
    }

    public final JSONObject getOperationalJSONObject() {
        return this.operationalJsonObject;
    }

    public final JSONObject getOperationalJsonObject() {
        return this.operationalJsonObject;
    }

    public final boolean isChecksumValid() {
        String str;
        if (this.checksum == null) {
            return true;
        }
        a aVar = Companion;
        String jSONObject = this.jsonObject.toString();
        kotlin.jvm.internal.g.d(jSONObject, "jsonObject.toString()");
        aVar.getClass();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            Charset forName = Charset.forName("UTF-8");
            kotlin.jvm.internal.g.d(forName, "forName(charsetName)");
            byte[] bytes = jSONObject.getBytes(forName);
            kotlin.jvm.internal.g.d(bytes, "this as java.lang.String).getBytes(charset)");
            messageDigest.update(bytes, 0, bytes.length);
            byte[] digest = messageDigest.digest();
            kotlin.jvm.internal.g.d(digest, "digest.digest()");
            str = c6.f.a(digest);
        } catch (UnsupportedEncodingException unused) {
            com.facebook.internal.p pVar = com.facebook.internal.p.f9815a;
            com.facebook.d dVar = com.facebook.d.f9685a;
            str = "1";
        } catch (NoSuchAlgorithmException unused2) {
            com.facebook.internal.p pVar2 = com.facebook.internal.p.f9815a;
            com.facebook.d dVar2 = com.facebook.d.f9685a;
            str = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
        }
        return kotlin.jvm.internal.g.a(str, this.checksum);
    }

    public final boolean isImplicit() {
        return this.isImplicit;
    }

    public String toString() {
        return b.a.f(new Object[]{this.jsonObject.optString("_eventName"), Boolean.valueOf(this.isImplicit), this.jsonObject.toString()}, 3, "\"%s\", implicit: %b, json: %s", "format(format, *args)");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:1|(6:77|78|(2:81|79)|82|83|(1:85))(1:3)|4|(19:64|65|(3:67|(1:73)(1:69)|(16:71|7|(4:9|(4:13|14|(4:16|(3:18|(3:21|(1:30)(1:26)|19)|32)|34|(1:28))|12)|11|12)|37|(1:39)|(3:41|(2:44|42)|45)|(1:47)|48|(1:50)|51|(1:53)(1:63)|54|55|56|57|58))|74|7|(0)|37|(0)|(0)|(0)|48|(0)|51|(0)(0)|54|55|56|57|58)|6|7|(0)|37|(0)|(0)|(0)|48|(0)|51|(0)(0)|54|55|56|57|58) */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ba, code lost:
        r7 = com.facebook.internal.p.f9815a;
        r7 = com.facebook.d.f9685a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01bf, code lost:
        r7 = com.facebook.internal.p.f9815a;
        r7 = com.facebook.d.f9685a;
        r8 = com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppEvent(java.lang.String r7, java.lang.String r8, java.lang.Double r9, android.os.Bundle r10, boolean r11, boolean r12, java.util.UUID r13, com.facebook.appevents.r r14) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.AppEvent.<init>(java.lang.String, java.lang.String, java.lang.Double, android.os.Bundle, boolean, boolean, java.util.UUID, com.facebook.appevents.r):void");
    }

    public final JSONObject getOperationalJSONObject(OperationalDataEnum type) {
        kotlin.jvm.internal.g.e(type, "type");
        return this.operationalJsonObject.optJSONObject(type.getValue());
    }

    public AppEvent(String str, String str2, boolean z10, boolean z11, String str3, kotlin.jvm.internal.d dVar) {
        JSONObject jSONObject = new JSONObject(str);
        this.jsonObject = jSONObject;
        this.operationalJsonObject = new JSONObject(str2);
        this.isImplicit = z10;
        String optString = jSONObject.optString("_eventName");
        kotlin.jvm.internal.g.d(optString, "jsonObject.optString(Con…nts.EVENT_NAME_EVENT_KEY)");
        this.name = optString;
        this.checksum = str3;
        this.inBackground = z11;
    }
}
