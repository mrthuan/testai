package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class UiExecutor implements Executor {
    public static final UiExecutor INSTANCE;
    @SuppressLint({"ThreadPoolCreation"})

    /* renamed from: a  reason: collision with root package name */
    public static final Handler f13506a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ UiExecutor[] f13507b;

    static {
        UiExecutor uiExecutor = new UiExecutor();
        INSTANCE = uiExecutor;
        f13507b = new UiExecutor[]{uiExecutor};
        f13506a = new Handler(Looper.getMainLooper());
    }

    public static UiExecutor valueOf(String str) {
        return (UiExecutor) Enum.valueOf(UiExecutor.class, str);
    }

    public static UiExecutor[] values() {
        return (UiExecutor[]) f13507b.clone();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        f13506a.post(runnable);
    }
}
