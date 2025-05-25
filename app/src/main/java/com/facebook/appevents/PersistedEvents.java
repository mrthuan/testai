package com.facebook.appevents;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PersistedEvents.kt */
/* loaded from: classes.dex */
public final class PersistedEvents implements Serializable {
    public static final a Companion = new a();
    private static final long serialVersionUID = 20160629001L;
    private final HashMap<AccessTokenAppIdPair, List<AppEvent>> events;

    /* compiled from: PersistedEvents.kt */
    /* loaded from: classes.dex */
    public static final class SerializationProxyV1 implements Serializable {
        public static final a Companion = new a();
        private static final long serialVersionUID = 20160629001L;
        private final HashMap<AccessTokenAppIdPair, List<AppEvent>> proxyEvents;

        /* compiled from: PersistedEvents.kt */
        /* loaded from: classes.dex */
        public static final class a {
        }

        public SerializationProxyV1(HashMap<AccessTokenAppIdPair, List<AppEvent>> proxyEvents) {
            kotlin.jvm.internal.g.e(proxyEvents, "proxyEvents");
            this.proxyEvents = proxyEvents;
        }

        private final Object readResolve() {
            return new PersistedEvents(this.proxyEvents);
        }
    }

    /* compiled from: PersistedEvents.kt */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public PersistedEvents() {
        this.events = new HashMap<>();
    }

    private final Object writeReplace() {
        if (k6.a.b(this)) {
            return null;
        }
        try {
            return new SerializationProxyV1(this.events);
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return null;
        }
    }

    public final void addEvents(AccessTokenAppIdPair accessTokenAppIdPair, List<AppEvent> appEvents) {
        if (k6.a.b(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.g.e(accessTokenAppIdPair, "accessTokenAppIdPair");
            kotlin.jvm.internal.g.e(appEvents, "appEvents");
            if (!this.events.containsKey(accessTokenAppIdPair)) {
                this.events.put(accessTokenAppIdPair, kotlin.collections.m.F0(appEvents));
                return;
            }
            List<AppEvent> list = this.events.get(accessTokenAppIdPair);
            if (list != null) {
                list.addAll(appEvents);
            }
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }

    public final boolean containsKey(AccessTokenAppIdPair accessTokenAppIdPair) {
        if (k6.a.b(this)) {
            return false;
        }
        try {
            kotlin.jvm.internal.g.e(accessTokenAppIdPair, "accessTokenAppIdPair");
            return this.events.containsKey(accessTokenAppIdPair);
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return false;
        }
    }

    public final Set<Map.Entry<AccessTokenAppIdPair, List<AppEvent>>> entrySet() {
        if (k6.a.b(this)) {
            return null;
        }
        try {
            Set<Map.Entry<AccessTokenAppIdPair, List<AppEvent>>> entrySet = this.events.entrySet();
            kotlin.jvm.internal.g.d(entrySet, "events.entries");
            return entrySet;
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return null;
        }
    }

    public final List<AppEvent> get(AccessTokenAppIdPair accessTokenAppIdPair) {
        if (k6.a.b(this)) {
            return null;
        }
        try {
            kotlin.jvm.internal.g.e(accessTokenAppIdPair, "accessTokenAppIdPair");
            return this.events.get(accessTokenAppIdPair);
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return null;
        }
    }

    public final Set<AccessTokenAppIdPair> keySet() {
        if (k6.a.b(this)) {
            return null;
        }
        try {
            Set<AccessTokenAppIdPair> keySet = this.events.keySet();
            kotlin.jvm.internal.g.d(keySet, "events.keys");
            return keySet;
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return null;
        }
    }

    public PersistedEvents(HashMap<AccessTokenAppIdPair, List<AppEvent>> appEventMap) {
        kotlin.jvm.internal.g.e(appEventMap, "appEventMap");
        HashMap<AccessTokenAppIdPair, List<AppEvent>> hashMap = new HashMap<>();
        this.events = hashMap;
        hashMap.putAll(appEventMap);
    }
}
