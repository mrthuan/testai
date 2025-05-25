package com.bytedance.sdk.openadsdk.Qhi;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: TotalCountLruDiskFile.java */
/* loaded from: classes.dex */
public class cJ extends Qhi {
    private int Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private volatile boolean f8504ac;
    private int cJ;

    public cJ(int i10, int i11) {
        this.Qhi = 15;
        this.cJ = 3;
        if (i10 > 0) {
            this.Qhi = i10;
            this.cJ = i11;
            return;
        }
        throw new IllegalArgumentException("Max count must be positive number!");
    }

    private void CJ(List<File> list) {
        long cJ;
        int size;
        boolean Qhi;
        if (list != null) {
            try {
                if (list.size() == 0 || (Qhi = Qhi((cJ = cJ(list)), (size = list.size())))) {
                    return;
                }
                TreeMap treeMap = new TreeMap();
                for (File file : list) {
                    treeMap.put(Long.valueOf(file.lastModified()), file);
                }
                for (Map.Entry entry : treeMap.entrySet()) {
                    if (entry != null && !Qhi) {
                        ((Long) entry.getKey()).longValue();
                        File file2 = (File) entry.getValue();
                        long length = file2.length();
                        if (file2.delete()) {
                            size--;
                            cJ -= length;
                        }
                        if (Qhi(file2, cJ, size)) {
                            return;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void ac(List<File> list) {
        long cJ = cJ(list);
        int size = list.size();
        if (!Qhi(cJ, size)) {
            for (File file : list) {
                long length = file.length();
                if (file.delete()) {
                    size--;
                    cJ -= length;
                }
                if (Qhi(file, cJ, size)) {
                    return;
                }
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.Qhi.Qhi
    public boolean Qhi(long j10, int i10) {
        return i10 <= this.Qhi;
    }

    @Override // com.bytedance.sdk.openadsdk.Qhi.Qhi
    public boolean Qhi(File file, long j10, int i10) {
        return i10 <= this.cJ;
    }

    @Override // com.bytedance.sdk.openadsdk.Qhi.Qhi
    public void Qhi(List<File> list) {
        if (this.f8504ac) {
            CJ(list);
            this.f8504ac = false;
            return;
        }
        ac(list);
    }

    public cJ(int i10, int i11, boolean z10) {
        this.Qhi = 15;
        this.cJ = 3;
        if (i10 > 0) {
            this.Qhi = i10;
            this.cJ = i11;
            this.f8504ac = z10;
            return;
        }
        throw new IllegalArgumentException("Max count must be positive number!");
    }
}
