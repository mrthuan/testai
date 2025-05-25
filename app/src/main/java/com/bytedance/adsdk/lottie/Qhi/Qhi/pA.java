package com.bytedance.adsdk.lottie.Qhi.Qhi;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.activity.r;
import com.bytedance.adsdk.lottie.Qhi.cJ.Qhi;
import com.bytedance.adsdk.lottie.ac.cJ.Gm;
import com.bytedance.adsdk.lottie.ac.cJ.MQ;
import java.util.List;

/* compiled from: PolystarContent.java */
/* loaded from: classes.dex */
public class pA implements iMK, zc, Qhi.InterfaceC0071Qhi {
    private final com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<?, Float> ABk;
    private final Gm.Qhi CJ;
    private final com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<?, Float> Gm;
    private final com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<?, Float> ROR;
    private final com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<?, PointF> Sf;
    private final boolean Tgh;
    private final com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<?, Float> WAv;

    /* renamed from: ac  reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.hm f7732ac;
    private final String cJ;

    /* renamed from: fl  reason: collision with root package name */
    private final boolean f7733fl;

    /* renamed from: hm  reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<?, Float> f7734hm;
    private boolean pA;

    /* renamed from: zc  reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<?, Float> f7735zc;
    private final Path Qhi = new Path();
    private final cJ iMK = new cJ();

    /* compiled from: PolystarContent.java */
    /* renamed from: com.bytedance.adsdk.lottie.Qhi.Qhi.pA$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Qhi;

        static {
            int[] iArr = new int[Gm.Qhi.values().length];
            Qhi = iArr;
            try {
                iArr[Gm.Qhi.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Qhi[Gm.Qhi.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public pA(com.bytedance.adsdk.lottie.hm hmVar, com.bytedance.adsdk.lottie.ac.ac.Qhi qhi, com.bytedance.adsdk.lottie.ac.cJ.Gm gm2) {
        this.f7732ac = hmVar;
        this.cJ = gm2.Qhi();
        Gm.Qhi cJ = gm2.cJ();
        this.CJ = cJ;
        this.f7733fl = gm2.WAv();
        this.Tgh = gm2.Gm();
        com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Float, Float> Qhi = gm2.ac().Qhi();
        this.ROR = Qhi;
        com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<PointF, PointF> Qhi2 = gm2.CJ().Qhi();
        this.Sf = Qhi2;
        com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Float, Float> Qhi3 = gm2.fl().Qhi();
        this.f7734hm = Qhi3;
        com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Float, Float> Qhi4 = gm2.ROR().Qhi();
        this.Gm = Qhi4;
        com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Float, Float> Qhi5 = gm2.hm().Qhi();
        this.ABk = Qhi5;
        Gm.Qhi qhi2 = Gm.Qhi.STAR;
        if (cJ == qhi2) {
            this.WAv = gm2.Tgh().Qhi();
            this.f7735zc = gm2.Sf().Qhi();
        } else {
            this.WAv = null;
            this.f7735zc = null;
        }
        qhi.Qhi(Qhi);
        qhi.Qhi(Qhi2);
        qhi.Qhi(Qhi3);
        qhi.Qhi(Qhi4);
        qhi.Qhi(Qhi5);
        if (cJ == qhi2) {
            qhi.Qhi(this.WAv);
            qhi.Qhi(this.f7735zc);
        }
        Qhi.Qhi(this);
        Qhi2.Qhi(this);
        Qhi3.Qhi(this);
        Qhi4.Qhi(this);
        Qhi5.Qhi(this);
        if (cJ == qhi2) {
            this.WAv.Qhi(this);
            this.f7735zc.Qhi(this);
        }
    }

    private void ac() {
        double floatValue;
        float f10;
        float f11;
        int i10;
        float sin;
        double d10;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        double d11;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float floatValue2 = this.ROR.ROR().floatValue();
        com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<?, Float> qhi = this.f7734hm;
        if (qhi == null) {
            floatValue = 0.0d;
        } else {
            floatValue = qhi.ROR().floatValue();
        }
        double radians = Math.toRadians(floatValue - 90.0d);
        double d12 = floatValue2;
        float f27 = (float) (6.283185307179586d / d12);
        if (this.Tgh) {
            f27 *= -1.0f;
        }
        float f28 = f27 / 2.0f;
        float f29 = floatValue2 - ((int) floatValue2);
        float f30 = 0.0f;
        int i11 = (f29 > 0.0f ? 1 : (f29 == 0.0f ? 0 : -1));
        if (i11 != 0) {
            radians += (1.0f - f29) * f28;
        }
        float floatValue3 = this.Gm.ROR().floatValue();
        float floatValue4 = this.WAv.ROR().floatValue();
        com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<?, Float> qhi2 = this.f7735zc;
        if (qhi2 != null) {
            f10 = qhi2.ROR().floatValue() / 100.0f;
        } else {
            f10 = 0.0f;
        }
        com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<?, Float> qhi3 = this.ABk;
        if (qhi3 != null) {
            f30 = qhi3.ROR().floatValue() / 100.0f;
        }
        if (i11 != 0) {
            f12 = r.l(floatValue3, floatValue4, f29, floatValue4);
            double d13 = f12;
            f11 = f30;
            i10 = i11;
            f13 = (float) (Math.cos(radians) * d13);
            sin = (float) (d13 * Math.sin(radians));
            this.Qhi.moveTo(f13, sin);
            d10 = radians + ((f27 * f29) / 2.0f);
        } else {
            f11 = f30;
            i10 = i11;
            double d14 = floatValue3;
            float cos = (float) (Math.cos(radians) * d14);
            sin = (float) (Math.sin(radians) * d14);
            this.Qhi.moveTo(cos, sin);
            d10 = radians + f28;
            f12 = 0.0f;
            f13 = cos;
        }
        double ceil = Math.ceil(d12) * 2.0d;
        int i12 = 0;
        boolean z10 = false;
        while (true) {
            double d15 = i12;
            if (d15 < ceil) {
                if (z10) {
                    f14 = floatValue3;
                } else {
                    f14 = floatValue4;
                }
                int i13 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
                if (i13 != 0 && d15 == ceil - 2.0d) {
                    f15 = f27;
                    f16 = (f27 * f29) / 2.0f;
                } else {
                    f15 = f27;
                    f16 = f28;
                }
                if (i13 != 0 && d15 == ceil - 1.0d) {
                    f19 = f16;
                    f17 = f28;
                    f18 = f12;
                } else {
                    f17 = f28;
                    f18 = f14;
                    f19 = f16;
                }
                double d16 = f18;
                float cos2 = (float) (Math.cos(d10) * d16);
                float sin2 = (float) (d16 * Math.sin(d10));
                if (f10 == 0.0f && f11 == 0.0f) {
                    this.Qhi.lineTo(cos2, sin2);
                    d11 = d10;
                    f21 = sin2;
                    f22 = f10;
                    f20 = f12;
                } else {
                    d11 = d10;
                    double atan2 = (float) (Math.atan2(sin, f13) - 1.5707963267948966d);
                    float cos3 = (float) Math.cos(atan2);
                    float sin3 = (float) Math.sin(atan2);
                    f20 = f12;
                    f21 = sin2;
                    f22 = f10;
                    double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                    float cos4 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    if (z10) {
                        f23 = f22;
                    } else {
                        f23 = f11;
                    }
                    if (z10) {
                        f24 = f11;
                    } else {
                        f24 = f22;
                    }
                    if (z10) {
                        f25 = floatValue4;
                    } else {
                        f25 = floatValue3;
                    }
                    if (z10) {
                        f26 = floatValue3;
                    } else {
                        f26 = floatValue4;
                    }
                    float f31 = f25 * f23 * 0.47829f;
                    float f32 = cos3 * f31;
                    float f33 = f31 * sin3;
                    float f34 = f26 * f24 * 0.47829f;
                    float f35 = cos4 * f34;
                    float f36 = f34 * sin4;
                    if (i10 != 0) {
                        if (i12 == 0) {
                            f32 *= f29;
                            f33 *= f29;
                        } else if (d15 == ceil - 1.0d) {
                            f35 *= f29;
                            f36 *= f29;
                        }
                    }
                    this.Qhi.cubicTo(f13 - f32, sin - f33, cos2 + f35, f21 + f36, cos2, f21);
                }
                z10 = !z10;
                i12++;
                f12 = f20;
                d10 = d11 + f19;
                f13 = cos2;
                f28 = f17;
                f27 = f15;
                sin = f21;
                f10 = f22;
            } else {
                PointF ROR = this.Sf.ROR();
                this.Qhi.offset(ROR.x, ROR.y);
                this.Qhi.close();
                return;
            }
        }
    }

    private void cJ() {
        this.pA = false;
        this.f7732ac.invalidateSelf();
    }

    private void fl() {
        double floatValue;
        int i10;
        double d10;
        double d11;
        double d12;
        int floor = (int) Math.floor(this.ROR.ROR().floatValue());
        com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<?, Float> qhi = this.f7734hm;
        if (qhi == null) {
            floatValue = 0.0d;
        } else {
            floatValue = qhi.ROR().floatValue();
        }
        double radians = Math.toRadians(floatValue - 90.0d);
        double d13 = floor;
        float floatValue2 = this.ABk.ROR().floatValue() / 100.0f;
        float floatValue3 = this.Gm.ROR().floatValue();
        double d14 = floatValue3;
        float cos = (float) (Math.cos(radians) * d14);
        float sin = (float) (Math.sin(radians) * d14);
        this.Qhi.moveTo(cos, sin);
        double d15 = (float) (6.283185307179586d / d13);
        double d16 = radians + d15;
        double ceil = Math.ceil(d13);
        int i11 = 0;
        while (i11 < ceil) {
            float cos2 = (float) (Math.cos(d16) * d14);
            double d17 = ceil;
            float sin2 = (float) (Math.sin(d16) * d14);
            if (floatValue2 != 0.0f) {
                d11 = d14;
                i10 = i11;
                d10 = d16;
                double atan2 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                float cos3 = (float) Math.cos(atan2);
                d12 = d15;
                double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                float f10 = floatValue3 * floatValue2 * 0.25f;
                this.Qhi.cubicTo(cos - (cos3 * f10), sin - (((float) Math.sin(atan2)) * f10), cos2 + (((float) Math.cos(atan22)) * f10), sin2 + (f10 * ((float) Math.sin(atan22))), cos2, sin2);
            } else {
                i10 = i11;
                d10 = d16;
                d11 = d14;
                d12 = d15;
                this.Qhi.lineTo(cos2, sin2);
            }
            d16 = d10 + d12;
            i11 = i10 + 1;
            sin = sin2;
            cos = cos2;
            ceil = d17;
            d14 = d11;
            d15 = d12;
        }
        PointF ROR = this.Sf.ROR();
        this.Qhi.offset(ROR.x, ROR.y);
        this.Qhi.close();
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.Qhi.iMK
    public Path CJ() {
        if (this.pA) {
            return this.Qhi;
        }
        this.Qhi.reset();
        if (this.f7733fl) {
            this.pA = true;
            return this.Qhi;
        }
        int i10 = AnonymousClass1.Qhi[this.CJ.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                fl();
            }
        } else {
            ac();
        }
        this.Qhi.close();
        this.iMK.Qhi(this.Qhi);
        this.pA = true;
        return this.Qhi;
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.cJ.Qhi.InterfaceC0071Qhi
    public void Qhi() {
        cJ();
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.Qhi.ac
    public void Qhi(List<ac> list, List<ac> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            ac acVar = list.get(i10);
            if (acVar instanceof EBS) {
                EBS ebs = (EBS) acVar;
                if (ebs.cJ() == MQ.Qhi.SIMULTANEOUSLY) {
                    this.iMK.Qhi(ebs);
                    ebs.Qhi(this);
                }
            }
        }
    }
}
