package com.inmobi.media;

import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.zb  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1896zb extends Lambda implements cg.p {

    /* renamed from: a  reason: collision with root package name */
    public static final C1896zb f15713a = new C1896zb();

    public C1896zb() {
        super(2);
    }

    @Override // cg.p
    public final Object invoke(Object obj, Object obj2) {
        JSONObject param = (JSONObject) obj;
        int intValue = ((Number) obj2).intValue();
        kotlin.jvm.internal.g.e(param, "param");
        Iterator<String> keys = param.keys();
        kotlin.jvm.internal.g.d(keys, "keys(...)");
        boolean z10 = true;
        while (keys.hasNext()) {
            if (param.getInt(keys.next()) < intValue) {
                z10 = false;
            }
        }
        return Boolean.valueOf(z10);
    }
}
