package com.bytedance.adsdk.lottie.Qhi.Qhi;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CompoundTrimPathContent.java */
/* loaded from: classes.dex */
public class cJ {
    private final List<EBS> Qhi = new ArrayList();

    public void Qhi(EBS ebs) {
        this.Qhi.add(ebs);
    }

    public void Qhi(Path path) {
        for (int size = this.Qhi.size() - 1; size >= 0; size--) {
            com.bytedance.adsdk.lottie.Tgh.ROR.Qhi(path, this.Qhi.get(size));
        }
    }
}
