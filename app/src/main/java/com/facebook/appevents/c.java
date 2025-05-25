package com.facebook.appevents;

import android.content.Context;
import com.facebook.internal.a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: AppEventCollection.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<AccessTokenAppIdPair, s> f9473a = new HashMap<>();

    public final synchronized void a(PersistedEvents persistedEvents) {
        for (Map.Entry<AccessTokenAppIdPair, List<AppEvent>> entry : persistedEvents.entrySet()) {
            s d10 = d(entry.getKey());
            if (d10 != null) {
                for (AppEvent appEvent : entry.getValue()) {
                    d10.a(appEvent);
                }
            }
        }
    }

    public final synchronized s b(AccessTokenAppIdPair accessTokenAppIdPair) {
        kotlin.jvm.internal.g.e(accessTokenAppIdPair, "accessTokenAppIdPair");
        return this.f9473a.get(accessTokenAppIdPair);
    }

    public final synchronized int c() {
        int i10;
        i10 = 0;
        for (s sVar : this.f9473a.values()) {
            i10 += sVar.c();
        }
        return i10;
    }

    public final synchronized s d(AccessTokenAppIdPair accessTokenAppIdPair) {
        s sVar = this.f9473a.get(accessTokenAppIdPair);
        if (sVar == null) {
            Context a10 = com.facebook.d.a();
            com.facebook.internal.a aVar = com.facebook.internal.a.f9745f;
            com.facebook.internal.a a11 = a.C0146a.a(a10);
            if (a11 != null) {
                sVar = new s(a11, k.a(a10));
            }
        }
        if (sVar == null) {
            return null;
        }
        this.f9473a.put(accessTokenAppIdPair, sVar);
        return sVar;
    }

    public final synchronized Set<AccessTokenAppIdPair> e() {
        Set<AccessTokenAppIdPair> keySet;
        keySet = this.f9473a.keySet();
        kotlin.jvm.internal.g.d(keySet, "stateMap.keys");
        return keySet;
    }
}
