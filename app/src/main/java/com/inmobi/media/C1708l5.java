package com.inmobi.media;

import java.lang.reflect.Field;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.l5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1708l5 {
    /* JADX WARN: Removed duplicated region for block: B:62:0x013f A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0141 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(java.lang.Object r3, java.lang.Object r4) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C1708l5.a(java.lang.Object, java.lang.Object):boolean");
    }

    public static final boolean b(Class cls) {
        Class cls2 = Integer.TYPE;
        if (!kotlin.jvm.internal.g.a(cls2, cls) && !kotlin.jvm.internal.g.a(cls2, cls)) {
            Class cls3 = Boolean.TYPE;
            if (!kotlin.jvm.internal.g.a(cls3, cls) && !kotlin.jvm.internal.g.a(cls3, cls)) {
                Class cls4 = Double.TYPE;
                if (!kotlin.jvm.internal.g.a(cls4, cls) && !kotlin.jvm.internal.g.a(cls4, cls)) {
                    Class cls5 = Float.TYPE;
                    if (!kotlin.jvm.internal.g.a(cls5, cls) && !kotlin.jvm.internal.g.a(cls5, cls)) {
                        Class cls6 = Long.TYPE;
                        if (!kotlin.jvm.internal.g.a(cls6, cls) && !kotlin.jvm.internal.g.a(cls6, cls) && !kotlin.jvm.internal.g.a(String.class, cls)) {
                            Class cls7 = Byte.TYPE;
                            if (!kotlin.jvm.internal.g.a(cls7, cls) && !kotlin.jvm.internal.g.a(cls7, cls)) {
                                Class cls8 = Short.TYPE;
                                if (!kotlin.jvm.internal.g.a(cls8, cls) && !kotlin.jvm.internal.g.a(cls8, cls)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void b(Object copyFrom, Object copyTo) {
        kotlin.jvm.internal.g.e(copyFrom, "copyFrom");
        kotlin.jvm.internal.g.e(copyTo, "copyTo");
        Class<?> cls = copyFrom.getClass();
        if (cls.isAssignableFrom(copyTo.getClass())) {
            Object cast = cls.cast(copyTo);
            kotlin.jvm.internal.g.d(cast, "cast(...)");
            Field[] declaredFields = cls.getDeclaredFields();
            kotlin.jvm.internal.g.d(declaredFields, "getDeclaredFields(...)");
            for (Field field : declaredFields) {
                try {
                    field.setAccessible(true);
                    field.set(cast, field.get(copyFrom));
                } catch (IllegalAccessException unused) {
                }
            }
        }
    }

    public static boolean a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray.length() == jSONArray2.length()) {
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    Object obj = jSONArray.get(i10);
                    Object obj2 = jSONArray2.get(i10);
                    if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
                        if (!a((JSONObject) obj, (JSONObject) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) {
                        if (!a((JSONArray) obj, (JSONArray) obj2)) {
                            return false;
                        }
                    } else {
                        kotlin.jvm.internal.g.b(obj);
                        kotlin.jvm.internal.g.b(obj2);
                        if (!a(obj, obj2)) {
                            return false;
                        }
                    }
                } catch (JSONException unused) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean a(JSONObject json1, JSONObject json2) {
        Object obj;
        Object obj2;
        kotlin.jvm.internal.g.e(json1, "json1");
        kotlin.jvm.internal.g.e(json2, "json2");
        if (json1.length() == json2.length()) {
            Iterator<String> keys = json1.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    obj = json1.get(next);
                    obj2 = json2.get(next);
                } catch (JSONException unused) {
                }
                if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
                    if (!a((JSONObject) obj, (JSONObject) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) {
                    if (!a((JSONArray) obj, (JSONArray) obj2)) {
                        return false;
                    }
                } else {
                    kotlin.jvm.internal.g.b(obj);
                    kotlin.jvm.internal.g.b(obj2);
                    if (!a(obj, obj2)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean a(Class cls) {
        return kotlin.jvm.internal.g.a(Integer.class, cls) || kotlin.jvm.internal.g.a(Boolean.class, cls) || kotlin.jvm.internal.g.a(Double.class, cls) || kotlin.jvm.internal.g.a(Float.class, cls) || kotlin.jvm.internal.g.a(Long.class, cls) || kotlin.jvm.internal.g.a(String.class, cls) || kotlin.jvm.internal.g.a(Byte.class, cls) || kotlin.jvm.internal.g.a(Short.class, cls);
    }

    public static final Object a(JSONArray jSONArray, int i10, Class cls) {
        Object obj;
        if (kotlin.jvm.internal.g.a(Integer.TYPE, cls)) {
            obj = Integer.valueOf(jSONArray.getInt(i10));
        } else if (kotlin.jvm.internal.g.a(Double.TYPE, cls)) {
            obj = Double.valueOf(jSONArray.getDouble(i10));
        } else if (kotlin.jvm.internal.g.a(Float.TYPE, cls)) {
            obj = Float.valueOf((float) jSONArray.getDouble(i10));
        } else if (kotlin.jvm.internal.g.a(Long.TYPE, cls)) {
            obj = Long.valueOf(jSONArray.getLong(i10));
        } else if (kotlin.jvm.internal.g.a(Byte.TYPE, cls)) {
            obj = Byte.valueOf((byte) jSONArray.getInt(i10));
        } else if (kotlin.jvm.internal.g.a(Short.TYPE, cls)) {
            obj = Short.valueOf((short) jSONArray.getInt(i10));
        } else {
            obj = jSONArray.get(i10);
        }
        kotlin.jvm.internal.g.b(obj);
        return obj;
    }

    public static final Object a(JSONObject jSONObject, String str, Class cls) {
        Object obj;
        if (kotlin.jvm.internal.g.a(Integer.TYPE, cls)) {
            obj = Integer.valueOf(jSONObject.getInt(str));
        } else if (kotlin.jvm.internal.g.a(Double.TYPE, cls)) {
            obj = Double.valueOf(jSONObject.getDouble(str));
        } else if (kotlin.jvm.internal.g.a(Float.TYPE, cls)) {
            obj = Float.valueOf((float) jSONObject.getDouble(str));
        } else if (kotlin.jvm.internal.g.a(Long.TYPE, cls)) {
            obj = Long.valueOf(jSONObject.getLong(str));
        } else if (kotlin.jvm.internal.g.a(Byte.TYPE, cls)) {
            obj = Byte.valueOf((byte) jSONObject.getInt(str));
        } else if (kotlin.jvm.internal.g.a(Short.TYPE, cls)) {
            obj = Short.valueOf((short) jSONObject.getInt(str));
        } else {
            obj = jSONObject.get(str);
        }
        kotlin.jvm.internal.g.b(obj);
        return obj;
    }
}
