package com.google.firebase.concurrent;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class FirebaseExecutors {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class DirectExecutor implements Executor {
        public static final DirectExecutor INSTANCE;

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ DirectExecutor[] f13496a;

        static {
            DirectExecutor directExecutor = new DirectExecutor();
            INSTANCE = directExecutor;
            f13496a = new DirectExecutor[]{directExecutor};
        }

        public static DirectExecutor valueOf(String str) {
            return (DirectExecutor) Enum.valueOf(DirectExecutor.class, str);
        }

        public static DirectExecutor[] values() {
            return (DirectExecutor[]) f13496a.clone();
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return DirectExecutor.INSTANCE;
    }
}
