package com.inmobi.media;

import org.json.JSONObject;

/* renamed from: com.inmobi.media.o6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1749o6 {
    public static int a(String str, JSONObject jSONObject) {
        if (str != null && jSONObject.has(str)) {
            return jSONObject.getInt(str);
        }
        return jSONObject.getInt("default");
    }
}
