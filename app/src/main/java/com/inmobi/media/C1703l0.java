package com.inmobi.media;

import java.util.Map;

/* renamed from: com.inmobi.media.l0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1703l0 {
    public static final String a(String str, Map map) {
        if (map != null && str != null) {
            for (Object obj : map.keySet()) {
                if (str != null) {
                    str = kotlin.text.j.K(str, String.valueOf(obj), String.valueOf(map.get(obj)));
                } else {
                    str = null;
                }
            }
        }
        return str;
    }
}
