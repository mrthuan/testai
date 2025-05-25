package com.bytedance.adsdk.ugeno.component.flexbox;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.component.Qhi;
import com.bytedance.adsdk.ugeno.component.flexbox.FlexboxLayout;

/* compiled from: UGFlexWidget.java */
/* loaded from: classes.dex */
public class Tgh extends com.bytedance.adsdk.ugeno.component.Qhi<FlexboxLayout> {
    private int Dq;
    private int Qe;
    private int YB;
    private int cjC;
    private int dIT;

    /* compiled from: UGFlexWidget.java */
    /* loaded from: classes.dex */
    public static class Qhi extends Qhi.C0074Qhi {

        /* renamed from: hm  reason: collision with root package name */
        public int f7892hm = 1;
        public float WAv = 0.0f;
        public float Gm = 0.0f;

        /* renamed from: zc  reason: collision with root package name */
        public int f7893zc = -1;
        public float ABk = -1.0f;
        public int iMK = -1;
        public int pA = -1;
        public int hpZ = 16777215;
        public int HzH = 16777215;

        private float CJ(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return -1.0f;
            }
        }

        private float ac(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return 0.0f;
            }
        }

        private float cJ(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return 0.0f;
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private int fl(String str) {
            boolean z10;
            str.getClass();
            switch (str.hashCode()) {
                case -1881872635:
                    if (str.equals("stretch")) {
                        z10 = false;
                        break;
                    }
                    z10 = true;
                    break;
                case -1720785339:
                    if (str.equals("baseline")) {
                        z10 = true;
                        break;
                    }
                    z10 = true;
                    break;
                case -1364013995:
                    if (str.equals("center")) {
                        z10 = true;
                        break;
                    }
                    z10 = true;
                    break;
                case 1384876188:
                    if (str.equals("flex_start")) {
                        z10 = true;
                        break;
                    }
                    z10 = true;
                    break;
                case 1744442261:
                    if (str.equals("flex_end")) {
                        z10 = true;
                        break;
                    }
                    z10 = true;
                    break;
                default:
                    z10 = true;
                    break;
            }
            switch (z10) {
                case false:
                    return 4;
                case true:
                    return 3;
                case true:
                    return 2;
                case true:
                    return 0;
                case true:
                    return 1;
                default:
                    return -1;
            }
        }

        public String toString() {
            return "LayoutParams{mWidth=" + this.Qhi + ", mHeight=" + this.cJ + ", mMargin=" + this.f7873ac + ", mMarginLeft=" + this.CJ + ", mMarginRight=" + this.f7874fl + ", mMarginTop=" + this.Tgh + ", mMarginBottom=" + this.ROR + ", mParams=" + this.Sf + ", mOrder=" + this.f7892hm + ", mFlexGrow=" + this.WAv + ", mFlexShrink=" + this.Gm + ", mAlignSelf=" + this.f7893zc + ", mFlexBasisPercent=" + this.ABk + ", mMinWidth=" + this.iMK + ", mMinHeight=" + this.pA + ", mMaxWidth=" + this.hpZ + ", mMaxHeight=" + this.HzH + "} " + super.toString();
        }

        @Override // com.bytedance.adsdk.ugeno.component.Qhi.C0074Qhi
        public void Qhi(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.Qhi(context, str, str2);
            str.getClass();
            char c = 65535;
            switch (str.hashCode()) {
                case -1962496832:
                    if (str.equals("flexBasisPercent")) {
                        c = 0;
                        break;
                    }
                    break;
                case 106006350:
                    if (str.equals("order")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1031115618:
                    if (str.equals("flexShrink")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1743739820:
                    if (str.equals("flexGrow")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1767100401:
                    if (str.equals("alignSelf")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    this.ABk = CJ(str2);
                    return;
                case 1:
                    this.f7892hm = Qhi(str2);
                    return;
                case 2:
                    this.Gm = ac(str2);
                    return;
                case 3:
                    this.WAv = cJ(str2);
                    return;
                case 4:
                    this.f7893zc = fl(str2);
                    return;
                default:
                    return;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.component.Qhi.C0074Qhi
        /* renamed from: cJ */
        public FlexboxLayout.Qhi Qhi() {
            FlexboxLayout.Qhi qhi = new FlexboxLayout.Qhi((int) this.Qhi, (int) this.cJ);
            ((ViewGroup.MarginLayoutParams) qhi).leftMargin = (int) this.CJ;
            ((ViewGroup.MarginLayoutParams) qhi).rightMargin = (int) this.f7874fl;
            ((ViewGroup.MarginLayoutParams) qhi).topMargin = (int) this.Tgh;
            ((ViewGroup.MarginLayoutParams) qhi).bottomMargin = (int) this.ROR;
            qhi.ac(this.f7892hm);
            qhi.CJ(this.f7893zc);
            qhi.Qhi(this.WAv);
            qhi.cJ(this.Gm);
            qhi.ac(this.ABk);
            return qhi;
        }

        private int Qhi(String str) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return 1;
            }
        }
    }

    public Tgh(Context context) {
        super(context);
    }

    private int ROR(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c = 0;
                    break;
                }
                break;
            case -932331738:
                if (str.equals("space_around")) {
                    c = 1;
                    break;
                }
                break;
            case 1682480591:
                if (str.equals("space_between")) {
                    c = 2;
                    break;
                }
                break;
            case 1744442261:
                if (str.equals("flex_end")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 2;
            case 1:
                return 4;
            case 2:
                return 3;
            case 3:
                return 1;
            default:
                return 0;
        }
    }

    private int Tgh(String str) {
        str.getClass();
        if (!str.equals("wrap")) {
            return 0;
        }
        return 1;
    }

    private int fl(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1781065991:
                if (str.equals("column_reverse")) {
                    c = 0;
                    break;
                }
                break;
            case -1354837162:
                if (str.equals("column")) {
                    c = 1;
                    break;
                }
                break;
            case -207799939:
                if (str.equals("row_reverse")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 3;
            case 1:
                return 2;
            case 2:
                return 1;
            default:
                return 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int hm(String str) {
        char c;
        switch (str.hashCode()) {
            case -1881872635:
                if (str.equals("stretch")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -932331738:
                if (str.equals("space_around")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1384876188:
                if (str.equals("flex_start")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1682480591:
                if (str.equals("space_between")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1744442261:
                if (str.equals("flex_end")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return 0;
        }
        if (c == 1) {
            return 1;
        }
        if (c == 2) {
            return 2;
        }
        if (c == 3) {
            return 4;
        }
        if (c != 4) {
            return 5;
        }
        return 3;
    }

    @Override // com.bytedance.adsdk.ugeno.component.cJ
    public void Qhi(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.Qhi(str, str2);
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1063257157:
                if (str.equals("alignItems")) {
                    c = 0;
                    break;
                }
                break;
            case -975171706:
                if (str.equals("flexDirection")) {
                    c = 1;
                    break;
                }
                break;
            case -752601676:
                if (str.equals("alignContent")) {
                    c = 2;
                    break;
                }
                break;
            case 1744216035:
                if (str.equals("flexWrap")) {
                    c = 3;
                    break;
                }
                break;
            case 1860657097:
                if (str.equals("justifyContent")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.cjC = Sf(str2);
                return;
            case 1:
                this.dIT = fl(str2);
                return;
            case 2:
                this.Dq = hm(str2);
                return;
            case 3:
                this.Qe = Tgh(str2);
                return;
            case 4:
                this.YB = ROR(str2);
                return;
            default:
                return;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.component.Qhi
    public Qhi.C0074Qhi Sf() {
        return new Qhi();
    }

    @Override // com.bytedance.adsdk.ugeno.component.Qhi, com.bytedance.adsdk.ugeno.component.cJ
    public void cJ() {
        super.cJ();
        ((FlexboxLayout) this.f7876fl).setFlexDirection(this.dIT);
        ((FlexboxLayout) this.f7876fl).setFlexWrap(this.Qe);
        ((FlexboxLayout) this.f7876fl).setJustifyContent(this.YB);
        ((FlexboxLayout) this.f7876fl).setAlignItems(this.cjC);
        ((FlexboxLayout) this.f7876fl).setAlignContent(this.Dq);
    }

    @Override // com.bytedance.adsdk.ugeno.component.cJ
    /* renamed from: tP */
    public FlexboxLayout ac() {
        FlexboxLayout flexboxLayout = new FlexboxLayout(this.cJ);
        flexboxLayout.Qhi(this);
        return flexboxLayout;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int Sf(String str) {
        char c;
        switch (str.hashCode()) {
            case -1881872635:
                if (str.equals("stretch")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1720785339:
                if (str.equals("baseline")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1384876188:
                if (str.equals("flex_start")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1744442261:
                if (str.equals("flex_end")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    return c != 3 ? 4 : 3;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }
}
