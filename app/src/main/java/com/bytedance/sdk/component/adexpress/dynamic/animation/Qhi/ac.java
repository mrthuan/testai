package com.bytedance.sdk.component.adexpress.dynamic.animation.Qhi;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: AnimatorFactory.java */
/* loaded from: classes.dex */
public class ac {
    private static volatile ac Qhi;

    private ac() {
    }

    public static ac Qhi() {
        if (Qhi == null) {
            synchronized (ac.class) {
                if (Qhi == null) {
                    Qhi = new ac();
                }
            }
        }
        return Qhi;
    }

    public fl Qhi(View view, com.bytedance.sdk.component.adexpress.dynamic.ac.Qhi qhi) {
        if (qhi == null) {
            return null;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).setClipChildren(false);
        }
        if (view.getParent().getParent() != null) {
            ((ViewGroup) view.getParent().getParent()).setClipChildren(false);
        }
        if ("scale".equals(qhi.hm())) {
            return new zc(view, qhi);
        }
        if ("translate".equals(qhi.hm())) {
            return new hpZ(view, qhi);
        }
        if ("ripple".equals(qhi.hm())) {
            return new hm(view, qhi);
        }
        if ("marquee".equals(qhi.hm())) {
            return new Sf(view, qhi);
        }
        if ("waggle".equals(qhi.hm())) {
            return new HzH(view, qhi);
        }
        if ("shine".equals(qhi.hm())) {
            return new ABk(view, qhi);
        }
        if ("swing".equals(qhi.hm())) {
            return new pA(view, qhi);
        }
        if ("fade".equals(qhi.hm())) {
            return new Qhi(view, qhi);
        }
        if ("rubIn".equals(qhi.hm())) {
            return new Gm(view, qhi);
        }
        if ("rotate".equals(qhi.hm())) {
            return new WAv(view, qhi);
        }
        if ("cutIn".equals(qhi.hm())) {
            return new ROR(view, qhi);
        }
        if ("stretch".equals(qhi.hm())) {
            return new iMK(view, qhi);
        }
        if ("bounce".equals(qhi.hm())) {
            return new Tgh(view, qhi);
        }
        return null;
    }
}
