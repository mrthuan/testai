package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: assets/audience_network.dex */
public class RK extends AnimatorListenerAdapter {
    public static String[] A01 = {"GafIPb7LWAiViAmPwlKEWLDLjss8g6Ws", "GmgIBltz4NMSrZrLjhCSQUR2lVK3nFE3", "EM6stZgjBHDzdWE7fS4BkrJy", "N0axt6y48e2BEk8smmzy4ee5", "dltbLtM4ojsXN2KUcmFBCOrEHNkSvQMG", "uja4KtsxSl5i0Xy4u8CYRakEDe0zRqlk", "vzw9JeJO1xcQXP0eAZjCAk8tucW9kQEs", "5sufJRWLYSrz8Qvpedy6kGMFzpd6V4cT"};
    public final /* synthetic */ C0983Mv A00;

    public RK(C0983Mv c0983Mv) {
        this.A00 = c0983Mv;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        boolean z10;
        View view;
        ViewPropertyAnimator viewPropertyAnimator;
        ViewPropertyAnimator viewPropertyAnimator2;
        View view2;
        z10 = this.A00.A04;
        if (z10) {
            view2 = this.A00.A03;
            M3.A0L(view2);
        }
        view = this.A00.A03;
        view.setAlpha(1.0f);
        this.A00.A01 = RE.A02;
        viewPropertyAnimator = this.A00.A00;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator2 = this.A00.A00;
            viewPropertyAnimator2.setListener(null);
            String[] strArr = A01;
            if (strArr[2].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            A01[7] = "SL0VqGGoYjOg4No5xWkpM0ju1xWwOnF6";
            this.A00.A00 = null;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        ViewPropertyAnimator viewPropertyAnimator;
        ViewPropertyAnimator viewPropertyAnimator2;
        View view;
        z10 = this.A00.A04;
        if (z10) {
            view = this.A00.A03;
            M3.A0H(view);
        }
        this.A00.A01 = RE.A04;
        String[] strArr = A01;
        if (strArr[4].charAt(13) == strArr[1].charAt(13)) {
            throw new RuntimeException();
        }
        A01[7] = "UFxXeO2yYsCLDJeld9s6oynUImAPkk9q";
        viewPropertyAnimator = this.A00.A00;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator2 = this.A00.A00;
            viewPropertyAnimator2.setListener(null);
            this.A00.A00 = null;
        }
    }
}
