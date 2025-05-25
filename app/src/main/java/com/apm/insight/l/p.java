package com.apm.insight.l;

import java.util.Objects;

/* loaded from: classes.dex */
public final class p {
    public static void a(Object obj) {
        if (com.apm.insight.i.i().isDebugMode()) {
            String.valueOf(obj);
        }
    }

    public static void b(Object obj) {
        if (com.apm.insight.i.i().isDebugMode()) {
            String.valueOf(obj);
        }
    }

    public static void a(String str) {
        com.apm.insight.i.i().isDebugMode();
    }

    public static void b(Throwable th2) {
        com.apm.insight.i.i().isDebugMode();
    }

    public static void a(String str, Object obj) {
        if (com.apm.insight.i.i().isDebugMode()) {
            Objects.toString(obj);
        }
    }

    public static void a(String str, Object obj, Throwable th2) {
        if (com.apm.insight.i.i().isDebugMode()) {
            Objects.toString(obj);
        }
    }

    public static void a(String str, Throwable th2) {
        com.apm.insight.i.i().isDebugMode();
    }

    public static void a(Throwable th2) {
        com.apm.insight.i.i().isDebugMode();
    }
}
