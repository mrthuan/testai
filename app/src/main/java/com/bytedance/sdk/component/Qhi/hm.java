package com.bytedance.sdk.component.Qhi;

import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DataConverterActual.java */
/* loaded from: classes.dex */
public class hm {
    private ABk Qhi;

    private hm(ABk aBk) {
        this.Qhi = aBk;
    }

    public static hm Qhi(ABk aBk) {
        return new hm(aBk);
    }

    public <T> T Qhi(String str, Type type) {
        Qhi(str);
        if (!type.equals(JSONObject.class) && (!(type instanceof Class) || !JSONObject.class.isAssignableFrom((Class) type))) {
            return (T) this.Qhi.Qhi(str, type);
        }
        return (T) new JSONObject(str);
    }

    public <T> String Qhi(T t4) {
        String obj;
        if (t4 == null) {
            return "{}";
        }
        if (!(t4 instanceof JSONObject) && !(t4 instanceof JSONArray)) {
            obj = this.Qhi.Qhi(t4);
        } else {
            obj = t4.toString();
        }
        Qhi(obj);
        return obj;
    }

    private static void Qhi(String str) {
        if (str.startsWith("{") && str.endsWith("}")) {
            return;
        }
        WAv.Qhi(new IllegalArgumentException("Param is not allowed to be List or JSONArray, rawString:\n ".concat(str)));
    }
}
