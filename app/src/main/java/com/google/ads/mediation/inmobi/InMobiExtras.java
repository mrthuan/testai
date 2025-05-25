package com.google.ads.mediation.inmobi;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class InMobiExtras {
    private final String keywords;
    private final HashMap<String, String> parameterMap;

    public InMobiExtras(HashMap<String, String> hashMap, String str) {
        this.parameterMap = hashMap;
        this.keywords = str;
    }

    public String getKeywords() {
        return this.keywords;
    }

    public HashMap<String, String> getParameterMap() {
        return this.parameterMap;
    }
}
