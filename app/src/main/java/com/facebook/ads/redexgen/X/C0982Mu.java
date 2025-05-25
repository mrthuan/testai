package com.facebook.ads.redexgen.X;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Mu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0982Mu implements RF {
    public static byte[] A06;
    public ValueAnimator A00;
    public RE A01 = RE.A04;
    public final int A02;
    public final int A03;
    public final int A04;
    public final View A05;

    static {
        A05();
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 16);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{Field.EQ, 32, 61, Field.EQ, 6, 42, 41, 42, Field.IMPORT};
    }

    public C0982Mu(View view, int i10, int i11, int i12) {
        this.A02 = i10;
        this.A05 = view;
        this.A04 = i11;
        this.A03 = i12;
    }

    private void A06(int i10, int i11) {
        this.A01 = i10 == this.A04 ? RE.A03 : RE.A05;
        this.A00 = ObjectAnimator.ofInt((TextView) this.A05, A04(0, 9, 85), i10, i11);
        this.A00.setEvaluator(new ArgbEvaluator());
        this.A00.setDuration(this.A02);
        this.A00.addListener(new RL(this, i10, i11));
        this.A00.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(int i10, int i11, boolean z10) {
        if (z10) {
            A06(i10, i11);
            return;
        }
        ((TextView) this.A05).setTextColor(i11);
        this.A01 = i11 == this.A03 ? RE.A02 : RE.A04;
    }

    @Override // com.facebook.ads.redexgen.X.RF
    public final void A3u(boolean z10, boolean z11) {
        int endColor = z11 ? this.A03 : this.A04;
        int startColor = z11 ? this.A04 : this.A03;
        A07(endColor, startColor, z10);
    }

    @Override // com.facebook.ads.redexgen.X.RF
    public final RE A8Q() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.RF
    public final void cancel() {
        if (this.A00 != null) {
            this.A00.cancel();
        }
    }
}
