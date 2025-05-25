package com.bytedance.sdk.component.cJ.Qhi;

import java.util.ArrayList;
import java.util.List;

/* compiled from: FormBody.java */
/* loaded from: classes.dex */
public final class Tgh extends pA {
    List<String> Qhi;
    List<String> cJ;

    public Tgh(List<String> list, List<String> list2) {
        this.Qhi = list;
        this.cJ = list2;
    }

    /* compiled from: FormBody.java */
    /* loaded from: classes.dex */
    public static final class Qhi {
        private final List<String> Qhi = new ArrayList();
        private final List<String> cJ = new ArrayList();

        public Qhi Qhi(String str, String str2) {
            this.Qhi.add(str);
            this.cJ.add(str2);
            return this;
        }

        public Tgh Qhi() {
            return new Tgh(this.Qhi, this.cJ);
        }
    }
}
