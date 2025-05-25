package com.bytedance.sdk.component.fl.ac.Qhi;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;

/* compiled from: CacheConfig.java */
/* loaded from: classes.dex */
public class Qhi implements com.bytedance.sdk.component.fl.cJ, Cloneable {
    private static volatile com.bytedance.sdk.component.fl.cJ Tgh;
    private boolean CJ;
    private long Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private boolean f8375ac;
    private int cJ;

    /* renamed from: fl  reason: collision with root package name */
    private File f8376fl;

    public Qhi(int i10, long j10, File file) {
        this(i10, j10, i10 != 0, j10 != 0, file);
    }

    public static com.bytedance.sdk.component.fl.cJ ROR() {
        return Tgh;
    }

    private static long Sf() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocks() * statFs.getBlockSize();
    }

    @Override // com.bytedance.sdk.component.fl.cJ
    public boolean CJ() {
        return this.CJ;
    }

    @Override // com.bytedance.sdk.component.fl.cJ
    public long Qhi() {
        return this.Qhi;
    }

    @Override // com.bytedance.sdk.component.fl.cJ
    public boolean Tgh() {
        return true;
    }

    @Override // com.bytedance.sdk.component.fl.cJ
    public boolean ac() {
        return this.f8375ac;
    }

    @Override // com.bytedance.sdk.component.fl.cJ
    public int cJ() {
        return this.cJ;
    }

    @Override // com.bytedance.sdk.component.fl.cJ
    public File fl() {
        return this.f8376fl;
    }

    public Qhi(int i10, long j10, boolean z10, boolean z11, File file) {
        this.Qhi = j10;
        this.cJ = i10;
        this.f8375ac = z10;
        this.CJ = z11;
        this.f8376fl = file;
    }

    public static void Qhi(Context context, com.bytedance.sdk.component.fl.cJ cJVar) {
        if (cJVar != null) {
            Tgh = cJVar;
        } else {
            Tgh = Qhi(new File(context.getCacheDir(), "image"));
        }
    }

    public static com.bytedance.sdk.component.fl.cJ Qhi(File file) {
        int min;
        long min2;
        file.mkdirs();
        if (Tgh == null) {
            min = Math.min(Long.valueOf(Runtime.getRuntime().maxMemory()).intValue() / 16, 31457280);
            min2 = Math.min(Sf() / 16, 41943040L);
        } else {
            min = Math.min(Tgh.cJ() / 2, 31457280);
            min2 = Math.min(Tgh.Qhi() / 2, 41943040L);
        }
        return new Qhi(Math.max(min, 26214400), Math.max(min2, 20971520L), file);
    }
}
