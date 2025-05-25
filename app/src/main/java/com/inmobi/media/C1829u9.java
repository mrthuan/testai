package com.inmobi.media;

import android.content.Context;
import com.inmobi.commons.core.configs.SignalsConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.u9  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1829u9 {

    /* renamed from: a  reason: collision with root package name */
    public static final C1829u9 f15497a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ ig.h[] f15498b;
    public static C1752o9 c;

    /* renamed from: d  reason: collision with root package name */
    public static final C1564b1 f15499d;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(C1829u9.class, "cachedJson", "getCachedJson()Lorg/json/JSONObject;", 0);
        kotlin.jvm.internal.i.f19949a.getClass();
        f15498b = new ig.h[]{propertyReference1Impl};
        f15497a = new C1829u9();
        f15499d = new C1564b1((Object) new JSONObject(), (cg.a) C1816t9.f15476a, true, true);
    }

    public static void b() {
        Context d10 = Ha.d();
        if (d10 != null) {
            Ha.a(new u1.c(d10, 1));
        }
    }

    public final LinkedHashMap a() {
        String str;
        JSONObject jSONObject;
        JSONObject jSONObject2 = (JSONObject) f15499d.getValue(this, f15498b[0]);
        LinkedHashMap linkedHashMap = C1732n2.f15334a;
        SignalsConfig.PublisherConfig publisherConfig = ((SignalsConfig) AbstractC1773q4.a("signals", "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig", null)).getPublisherConfig();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, String> entry : publisherConfig.getGeneralKeys().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (jSONObject2.has(key)) {
                int hashCode = value.hashCode();
                if (hashCode != -1325958191) {
                    if (hashCode != -891985903) {
                        if (hashCode != 104431) {
                            if (hashCode == 3029738 && value.equals("bool")) {
                                linkedHashMap2.put(key, Boolean.valueOf(jSONObject2.optBoolean(key)));
                            }
                        } else if (value.equals("int")) {
                            linkedHashMap2.put(key, Integer.valueOf(jSONObject2.optInt(key)));
                        }
                    } else if (value.equals("string")) {
                        String optString = jSONObject2.optString(key);
                        kotlin.jvm.internal.g.d(optString, "optString(...)");
                        linkedHashMap2.put(key, optString);
                    }
                } else if (value.equals("double")) {
                    linkedHashMap2.put(key, Double.valueOf(jSONObject2.optDouble(key)));
                }
            }
        }
        for (Map.Entry<String, String> entry2 : publisherConfig.getAdSpecificKeys().entrySet()) {
            String key2 = entry2.getKey();
            String value2 = entry2.getValue();
            JSONArray optJSONArray = jSONObject2.optJSONArray(key2);
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                int i10 = 0;
                while (i10 < length) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(key2);
                    sb2.append('_');
                    if (i10 == 0) {
                        str = "ban";
                    } else if (i10 == 1) {
                        str = "int";
                    } else if (i10 == 2) {
                        str = "rew";
                    } else if (i10 != 3) {
                        jSONObject = jSONObject2;
                        i10++;
                        jSONObject2 = jSONObject;
                    } else {
                        str = "nat";
                    }
                    sb2.append(str);
                    String sb3 = sb2.toString();
                    int hashCode2 = value2.hashCode();
                    jSONObject = jSONObject2;
                    if (hashCode2 != -1325958191) {
                        if (hashCode2 != -891985903) {
                            if (hashCode2 != 104431) {
                                if (hashCode2 == 3029738 && value2.equals("bool")) {
                                    linkedHashMap2.put(sb3, Boolean.valueOf(optJSONArray.optBoolean(i10)));
                                }
                            } else if (value2.equals("int")) {
                                linkedHashMap2.put(sb3, Integer.valueOf(optJSONArray.optInt(i10)));
                            }
                        } else if (value2.equals("string")) {
                            String optString2 = optJSONArray.optString(i10);
                            kotlin.jvm.internal.g.d(optString2, "optString(...)");
                            linkedHashMap2.put(sb3, optString2);
                        }
                    } else if (value2.equals("double")) {
                        linkedHashMap2.put(sb3, Double.valueOf(optJSONArray.optDouble(i10)));
                    }
                    i10++;
                    jSONObject2 = jSONObject;
                }
            }
        }
        return linkedHashMap2;
    }

    public static final void b(JSONObject this_saveSignalsToPersistentCache) {
        kotlin.jvm.internal.g.e(this_saveSignalsToPersistentCache, "$this_saveSignalsToPersistentCache");
        Context d10 = Ha.d();
        if (d10 != null) {
            f15497a.getClass();
            if (c == null) {
                c = new C1752o9(d10, "pub_signals_store");
            }
            C1752o9 c1752o9 = c;
            if (c1752o9 != null) {
                String jSONObject = this_saveSignalsToPersistentCache.toString();
                kotlin.jvm.internal.g.d(jSONObject, "toString(...)");
                c1752o9.a("saved_signals", jSONObject);
                f15499d.a();
                Z5.a((byte) 2, "PubSignalsStore", "Publisher Signals saved successfully.");
                return;
            }
            kotlin.jvm.internal.g.i("prefDao");
            throw null;
        }
    }

    public static final void a(Context context) {
        kotlin.jvm.internal.g.e(context, "$context");
        try {
            f15497a.getClass();
            if (c == null) {
                c = new C1752o9(context, "pub_signals_store");
            }
            C1752o9 c1752o9 = c;
            if (c1752o9 != null) {
                c1752o9.c("saved_signals");
                f15499d.a();
                return;
            }
            kotlin.jvm.internal.g.i("prefDao");
            throw null;
        } catch (Exception e10) {
            Z5.a((byte) 1, "PubSignalsStore", "Publisher signals could not be reset.");
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ba, code lost:
        r1.remove(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.LinkedHashMap a(java.util.LinkedHashMap r13, com.inmobi.commons.core.configs.SignalsConfig.PublisherConfig r14) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C1829u9.a(java.util.LinkedHashMap, com.inmobi.commons.core.configs.SignalsConfig$PublisherConfig):java.util.LinkedHashMap");
    }

    public static Object a(Object obj, String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1325958191) {
            if (hashCode != -891985903) {
                if (hashCode != 104431) {
                    if (hashCode == 3029738 && str.equals("bool") && (obj instanceof Boolean)) {
                        return (Boolean) obj;
                    }
                } else if (str.equals("int") && (obj instanceof Integer)) {
                    return (Integer) obj;
                }
            } else if (str.equals("string") && (obj instanceof String)) {
                return (String) obj;
            }
        } else if (str.equals("double")) {
            if (obj instanceof Double) {
                return (Double) obj;
            }
            if (obj instanceof Integer) {
                return Double.valueOf(((Number) obj).intValue());
            }
            if (obj instanceof Float) {
                return Double.valueOf(((Number) obj).floatValue());
            }
        }
        return null;
    }

    public static Object a(String str) {
        int hashCode = str.hashCode();
        if (hashCode == -1325958191) {
            return !str.equals("double") ? "-1" : Double.valueOf(Double.parseDouble("-1"));
        } else if (hashCode == -891985903) {
            str.equals("string");
            return "-1";
        } else if (hashCode == 104431) {
            return !str.equals("int") ? "-1" : Integer.valueOf(Integer.parseInt("-1"));
        } else if (hashCode != 3029738) {
            return "-1";
        } else {
            str.equals("bool");
            return "-1";
        }
    }

    public static JSONObject a(LinkedHashMap linkedHashMap) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                jSONObject.put(str, value);
            } else if (value instanceof Integer) {
                jSONObject.put(str, ((Number) value).intValue());
            } else if (value instanceof Boolean) {
                jSONObject.put(str, ((Boolean) value).booleanValue());
            } else if (value instanceof Double) {
                jSONObject.put(str, ((Number) value).doubleValue());
            } else if (value instanceof JSONArray) {
                jSONObject.put(str, value);
            }
        }
        return jSONObject;
    }

    public static void a(JSONObject jSONObject) {
        Ha.a(new androidx.activity.i(jSONObject, 15));
    }

    public static JSONObject a(JSONObject jSONObject, SignalsConfig.PublisherConfig publisherConfig) {
        if (jSONObject.toString().length() > publisherConfig.getPayloadSize()) {
            Z5.a((byte) 1, "PubSignalsStore", "Publisher Signal payload size exceeded.");
            Q4 q42 = Q4.f14590a;
            Q4.c.a(new J1(new IllegalStateException("Publisher signals size exceeds the limit")));
            return null;
        }
        return jSONObject;
    }
}
