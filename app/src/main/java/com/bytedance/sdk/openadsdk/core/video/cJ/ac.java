package com.bytedance.sdk.openadsdk.core.video.cJ;

import com.bytedance.sdk.component.utils.ROR;
import java.io.File;
import java.util.List;

/* compiled from: TotalCountLruDiskDir.java */
/* loaded from: classes.dex */
public class ac extends com.bytedance.sdk.openadsdk.Qhi.cJ {
    public ac(int i10, int i11) {
        super(i10, i11);
    }

    @Override // com.bytedance.sdk.openadsdk.Qhi.cJ, com.bytedance.sdk.openadsdk.Qhi.Qhi
    public void Qhi(List<File> list) {
        int size = list.size();
        if (!Qhi(0L, size)) {
            for (File file : list) {
                ROR.ac(file);
                size--;
                if (Qhi(file, 0L, size)) {
                    return;
                }
            }
        }
    }
}
