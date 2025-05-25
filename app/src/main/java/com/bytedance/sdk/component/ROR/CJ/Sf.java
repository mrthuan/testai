package com.bytedance.sdk.component.ROR.CJ;

/* compiled from: Logger.java */
/* loaded from: classes.dex */
public class Sf {
    private Qhi Qhi;
    private cJ cJ;

    /* compiled from: Logger.java */
    /* loaded from: classes.dex */
    public enum Qhi {
        DEBUG,
        INFO,
        ERROR,
        OFF
    }

    /* compiled from: Logger.java */
    /* loaded from: classes.dex */
    public static class ac {
        private static final Sf Qhi = new Sf();
    }

    /* compiled from: Logger.java */
    /* loaded from: classes.dex */
    public interface cJ {
    }

    public static void Qhi(Qhi qhi) {
        synchronized (Sf.class) {
            ac.Qhi.Qhi = qhi;
        }
    }

    private Sf() {
        this.Qhi = Qhi.OFF;
        this.cJ = new ROR();
    }
}
