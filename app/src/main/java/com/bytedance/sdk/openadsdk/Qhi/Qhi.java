package com.bytedance.sdk.openadsdk.Qhi;

import com.bytedance.sdk.component.utils.ROR;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: LruDiskFile.java */
/* loaded from: classes.dex */
public abstract class Qhi {
    private final ExecutorService Qhi = Executors.newSingleThreadExecutor();

    /* compiled from: LruDiskFile.java */
    /* renamed from: com.bytedance.sdk.openadsdk.Qhi.Qhi$Qhi  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class CallableC0104Qhi implements Callable<Void> {
        private final File cJ;

        @Override // java.util.concurrent.Callable
        /* renamed from: Qhi */
        public Void call() {
            Qhi.this.cJ(this.cJ);
            return null;
        }

        private CallableC0104Qhi(File file) {
            this.cJ = file;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ(File file) {
        try {
            ROR.cJ(file);
        } catch (Throwable unused) {
        }
        Qhi(ROR.Qhi(file.getParentFile()));
    }

    public abstract void Qhi(List<File> list);

    public abstract boolean Qhi(long j10, int i10);

    public abstract boolean Qhi(File file, long j10, int i10);

    public void Qhi(File file) {
        this.Qhi.submit(new CallableC0104Qhi(file));
    }

    public long cJ(List<File> list) {
        long j10 = 0;
        for (File file : list) {
            j10 += file.length();
        }
        return j10;
    }
}
