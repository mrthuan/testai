package com.tom_roush.fontbox.encoding;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class Encoding {
    protected Map<Integer, String> codeToName = new HashMap(250);
    protected Map<String, Integer> nameToCode = new HashMap(250);

    public void addCharacterEncoding(int i10, String str) {
        this.codeToName.put(Integer.valueOf(i10), str);
        this.nameToCode.put(str, Integer.valueOf(i10));
    }

    public Integer getCode(String str) {
        return this.nameToCode.get(str);
    }

    public Map<Integer, String> getCodeToNameMap() {
        return Collections.unmodifiableMap(this.codeToName);
    }

    public String getName(int i10) {
        String str = this.codeToName.get(Integer.valueOf(i10));
        if (str != null) {
            return str;
        }
        return ".notdef";
    }
}
