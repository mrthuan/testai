package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private static volatile u f6791a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile Handler f6792b;

    public static HandlerThread a() {
        if (f6791a == null) {
            synchronized (p.class) {
                if (f6791a == null) {
                    f6791a = new u("default_npth_thread");
                    f6791a.b();
                }
            }
        }
        return f6791a.c();
    }

    public static u b() {
        if (f6791a == null) {
            a();
        }
        return f6791a;
    }
}
