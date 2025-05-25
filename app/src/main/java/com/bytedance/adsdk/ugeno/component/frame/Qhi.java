package com.bytedance.adsdk.ugeno.component.frame;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.component.Qhi;

/* compiled from: UGFrameWidget.java */
/* loaded from: classes.dex */
public class Qhi extends com.bytedance.adsdk.ugeno.component.Qhi<UGFrameLayout> {
    private UGFrameLayout dIT;

    /* compiled from: UGFrameWidget.java */
    /* renamed from: com.bytedance.adsdk.ugeno.component.frame.Qhi$Qhi  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0075Qhi extends Qhi.C0074Qhi {

        /* renamed from: hm  reason: collision with root package name */
        protected int f7900hm = -1;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private int cJ(String str) {
            char c;
            str.getClass();
            switch (str.hashCode()) {
                case -1383228885:
                    if (str.equals("bottom")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1364013995:
                    if (str.equals("center")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -348726240:
                    if (str.equals("center_vertical")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 115029:
                    if (str.equals("top")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3317767:
                    if (str.equals("left")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 108511772:
                    if (str.equals("right")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1063616078:
                    if (str.equals("center_horizontal")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    return 80;
                case 1:
                    return 17;
                case 2:
                    return 16;
                case 3:
                    return 48;
                case 4:
                    return 3;
                case 5:
                    return 5;
                case 6:
                    return 1;
                default:
                    return -1;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.component.Qhi.C0074Qhi
        public void Qhi(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.Qhi(context, str, str2);
            if (TextUtils.equals(str, "layoutGravity")) {
                this.f7900hm = Qhi(str2);
            }
        }

        @Override // com.bytedance.adsdk.ugeno.component.Qhi.C0074Qhi
        /* renamed from: cJ */
        public FrameLayout.LayoutParams Qhi() {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.Qhi, (int) this.cJ);
            layoutParams.leftMargin = (int) this.CJ;
            layoutParams.rightMargin = (int) this.f7874fl;
            layoutParams.topMargin = (int) this.Tgh;
            layoutParams.bottomMargin = (int) this.ROR;
            layoutParams.gravity = this.f7900hm;
            return layoutParams;
        }

        private int Qhi(String str) {
            String[] split;
            if (TextUtils.isEmpty(str) || (split = str.split("\\|")) == null || split.length <= 0) {
                return -1;
            }
            int i10 = 0;
            for (String str2 : split) {
                i10 |= cJ(str2);
            }
            return i10;
        }
    }

    public Qhi(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.component.Qhi
    public Qhi.C0074Qhi Sf() {
        return new C0075Qhi();
    }

    @Override // com.bytedance.adsdk.ugeno.component.Qhi, com.bytedance.adsdk.ugeno.component.cJ
    public void cJ() {
        this.dIT.setEventMap(this.MND);
        super.cJ();
    }

    @Override // com.bytedance.adsdk.ugeno.component.cJ
    /* renamed from: tP */
    public UGFrameLayout ac() {
        UGFrameLayout uGFrameLayout = new UGFrameLayout(this.cJ);
        this.dIT = uGFrameLayout;
        uGFrameLayout.Qhi(this);
        return this.dIT;
    }
}
