package com.bykv.vk.openvk.preload.geckox.utils;

import java.util.concurrent.Executor;

/* compiled from: PiecemealSerialExecutor.java */
/* loaded from: classes.dex */
public class i implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private static volatile i f7666a;

    public static i a() {
        if (f7666a == null) {
            synchronized (i.class) {
                if (f7666a == null) {
                    f7666a = new i();
                }
            }
        }
        return f7666a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bykv.vk.openvk.preload.geckox.b.c().execute(runnable);
    }
}
