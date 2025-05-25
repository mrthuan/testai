package com.bykv.vk.openvk.preload.geckox.utils;

import java.util.concurrent.Executor;

/* compiled from: IOSerialExecutor.java */
/* loaded from: classes.dex */
public class e implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private static volatile e f7663a;

    public static e a() {
        if (f7663a == null) {
            synchronized (e.class) {
                if (f7663a == null) {
                    f7663a = new e();
                }
            }
        }
        return f7663a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bykv.vk.openvk.preload.geckox.b.c().execute(runnable);
    }
}
