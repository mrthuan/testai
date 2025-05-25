package m5;

import android.content.Intent;
import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlinx.coroutines.y;

/* compiled from: DefaultsFactory.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<Class<?>, Object> f21819a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Bundle.class, new y(0));
        hashMap.put(Intent.class, new com.google.android.play.core.assetpacks.c());
        f21819a = Collections.unmodifiableMap(hashMap);
    }
}
