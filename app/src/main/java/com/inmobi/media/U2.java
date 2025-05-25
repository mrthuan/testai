package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class U2 {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f14728a = new HashMap();

    public static Config a(String str, String type) {
        kotlin.jvm.internal.g.e(type, "type");
        String str2 = str + '-' + type;
        HashMap hashMap = f14728a;
        Object obj = hashMap.get(str2);
        if (obj == null) {
            Config.Companion.getClass();
            obj = C1621f2.a(type, str);
            hashMap.put(str2, obj);
        }
        return (Config) obj;
    }
}
