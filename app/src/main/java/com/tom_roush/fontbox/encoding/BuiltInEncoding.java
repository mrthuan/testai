package com.tom_roush.fontbox.encoding;

import java.util.Map;

/* loaded from: classes2.dex */
public class BuiltInEncoding extends Encoding {
    public BuiltInEncoding(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            addCharacterEncoding(entry.getKey().intValue(), entry.getValue());
        }
    }
}
