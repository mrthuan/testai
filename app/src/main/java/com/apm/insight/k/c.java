package com.apm.insight.k;

import com.apm.insight.CrashType;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    private static ConcurrentLinkedQueue<c> f6588a = new ConcurrentLinkedQueue<>();

    /* renamed from: com.apm.insight.k.c$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6589a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f6589a = iArr;
            try {
                iArr[CrashType.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6589a[CrashType.LAUNCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6589a[CrashType.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private JSONObject f6590a;

        /* renamed from: b  reason: collision with root package name */
        private JSONObject f6591b;
        private CrashType c;

        public a(JSONObject jSONObject, CrashType crashType) {
            this.c = crashType;
            if (crashType == CrashType.LAUNCH) {
                this.f6590a = ((JSONArray) jSONObject.opt("data")).optJSONObject(0);
            } else {
                this.f6590a = jSONObject;
            }
            this.f6591b = jSONObject.optJSONObject("header");
        }

        public String a() {
            return this.f6590a.optString("crash_thread_name", null);
        }

        public long b() {
            return this.f6590a.optInt("app_start_time", -1);
        }

        public String c() {
            int i10 = AnonymousClass1.f6589a[this.c.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return this.f6590a.optString("data", null);
                }
                return this.f6590a.optString("stack", null);
            }
            return this.f6590a.optString("data", null);
        }
    }

    public static void a(CrashType crashType, JSONObject jSONObject) {
        ConcurrentLinkedQueue<c> concurrentLinkedQueue = f6588a;
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            return;
        }
        a aVar = new a(jSONObject, crashType);
        while (!f6588a.isEmpty()) {
            c poll = f6588a.poll();
            if (poll != null) {
                poll.a(crashType, aVar);
            }
        }
        f6588a = null;
    }

    public abstract void a(CrashType crashType, a aVar);
}
