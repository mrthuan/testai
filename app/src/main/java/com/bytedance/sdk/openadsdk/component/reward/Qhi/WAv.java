package com.bytedance.sdk.openadsdk.component.reward.Qhi;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import com.bytedance.sdk.component.utils.CQU;
import com.bytedance.sdk.openadsdk.utils.zn;

/* compiled from: RewardFullScreenManager.java */
/* loaded from: classes.dex */
public class WAv {
    private Qhi CJ;
    protected int Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private boolean f8810ac = true;
    private final com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi cJ;

    /* compiled from: RewardFullScreenManager.java */
    /* loaded from: classes.dex */
    public static abstract class Qhi implements View.OnLayoutChangeListener {
        private int Qhi;
        private int cJ;

        private Qhi() {
        }

        public abstract void Qhi(int i10, int i11);

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            int i18 = i12 - i10;
            int i19 = i13 - i11;
            if (i18 != this.Qhi || i19 != this.cJ) {
                this.Qhi = i18;
                this.cJ = i19;
                Qhi(i18, i19);
            }
        }
    }

    public WAv(com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi) {
        this.Qhi = 0;
        this.cJ = qhi;
        ac();
        if (qhi.Qhi == 2) {
            return;
        }
        try {
            this.Qhi = zn.ac(qhi.FQ, zn.Qhi());
            if (!qhi.FQ.getWindow().hasFeature(1)) {
                qhi.FQ.requestWindowFeature(1);
            }
            qhi.FQ.getWindow().addFlags(16777344);
            if (qhi.Dq == 2 || !zn.ac(qhi.FQ)) {
                qhi.FQ.getWindow().addFlags(1024);
            }
        } catch (Throwable unused) {
        }
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private void CJ() {
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.cJ;
        if (qhi.Dq == 2) {
            if (qhi.dVA) {
                Qhi(qhi.FQ, 8);
                return;
            } else {
                Qhi(qhi.FQ, 0);
                return;
            }
        }
        Qhi(qhi.FQ, 1);
    }

    private float Tgh() {
        return zn.ac(this.cJ.FQ, zn.hm(this.cJ.FQ));
    }

    private void ac() {
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.cJ;
        qhi.Hf = qhi.cJ.Oy();
        if (26 == Build.VERSION.SDK_INT) {
            if (this.cJ.FQ.getResources().getConfiguration().orientation == 1) {
                this.cJ.Dq = 1;
                return;
            } else {
                this.cJ.Dq = 2;
                return;
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi2 = this.cJ;
        qhi2.Dq = qhi2.cJ.SL();
    }

    private float fl() {
        return zn.ac(this.cJ.FQ, zn.WAv(this.cJ.FQ));
    }

    public void cJ(CQU cqu) {
        try {
            final boolean z10 = true;
            final boolean z11 = this.f8810ac && com.bytedance.sdk.openadsdk.core.HzH.CJ().yN() == 1;
            if (!this.f8810ac || !zn.ac(this.cJ.FQ)) {
                z10 = false;
            }
            if (z10 || z11) {
                if (this.CJ == null) {
                    this.CJ = new Qhi() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.WAv.2
                        boolean Qhi;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super();
                        }

                        /* JADX WARN: Removed duplicated region for block: B:28:0x00e9 A[Catch: all -> 0x010c, TryCatch #0 {all -> 0x010c, blocks: (B:2:0x0000, B:4:0x000b, B:6:0x001f, B:8:0x006a, B:10:0x0088, B:12:0x0097, B:14:0x00ab, B:15:0x00af, B:26:0x00e3, B:28:0x00e9, B:29:0x00ee, B:31:0x00fc, B:16:0x00b2, B:18:0x00bc, B:20:0x00d0, B:22:0x00d4, B:23:0x00da, B:25:0x00de, B:33:0x0102, B:35:0x0106, B:7:0x0045), top: B:38:0x0000 }] */
                        /* JADX WARN: Removed duplicated region for block: B:31:0x00fc A[Catch: all -> 0x010c, TryCatch #0 {all -> 0x010c, blocks: (B:2:0x0000, B:4:0x000b, B:6:0x001f, B:8:0x006a, B:10:0x0088, B:12:0x0097, B:14:0x00ab, B:15:0x00af, B:26:0x00e3, B:28:0x00e9, B:29:0x00ee, B:31:0x00fc, B:16:0x00b2, B:18:0x00bc, B:20:0x00d0, B:22:0x00d4, B:23:0x00da, B:25:0x00de, B:33:0x0102, B:35:0x0106, B:7:0x0045), top: B:38:0x0000 }] */
                        /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
                        @Override // com.bytedance.sdk.openadsdk.component.reward.Qhi.WAv.Qhi
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public void Qhi(int r7, int r8) {
                            /*
                                Method dump skipped, instructions count: 269
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.Qhi.WAv.AnonymousClass2.Qhi(int, int):void");
                        }
                    };
                }
                this.cJ.FQ.getWindow().getDecorView().addOnLayoutChangeListener(this.CJ);
            }
            this.f8810ac = false;
        } catch (Exception unused) {
        }
    }

    public void Qhi(CQU cqu) {
        if (cqu == null) {
            return;
        }
        cqu.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.WAv.1
            @Override // java.lang.Runnable
            public void run() {
                View findViewById;
                try {
                    View decorView = WAv.this.cJ.FQ.getWindow().getDecorView();
                    if (decorView != null && (findViewById = decorView.findViewById(16908335)) != null) {
                        findViewById.setVisibility(8);
                    }
                } catch (Exception unused) {
                }
            }
        }, 300L);
    }

    public void Qhi(boolean z10) {
        float min;
        float max;
        int max2;
        int i10;
        int i11;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 != 26) {
            if (i12 == 27) {
                try {
                    CJ();
                } catch (Throwable unused) {
                }
            } else {
                CJ();
            }
        }
        float fl2 = fl();
        float Tgh = Tgh();
        if (this.cJ.Dq == 2) {
            min = Math.max(fl2, Tgh);
            max = Math.min(fl2, Tgh);
        } else {
            min = Math.min(fl2, Tgh);
            max = Math.max(fl2, Tgh);
        }
        Activity activity = this.cJ.FQ;
        int ac2 = zn.ac(activity, zn.Qhi());
        if (this.cJ.Dq != 2) {
            if (zn.ac(activity)) {
                max -= ac2;
            }
        } else if (zn.ac(activity)) {
            min -= ac2;
        }
        if (z10) {
            com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi = this.cJ;
            qhi.NBs = (int) min;
            qhi.dI = (int) max;
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi2 = this.cJ;
        int i13 = 20;
        if (qhi2.Dq != 2) {
            float f10 = qhi2.Hf;
            if (f10 != 0.0f && f10 != 100.0f) {
                i10 = (int) Math.max((max - (((min - 20.0f) - 20.0f) / f10)) / 2.0f, 0.0f);
                i11 = i10;
                max2 = 20;
            }
            i13 = 0;
            max2 = 0;
            i10 = 0;
            i11 = 0;
        } else {
            float f11 = qhi2.Hf;
            if (f11 != 0.0f && f11 != 100.0f) {
                max2 = (int) Math.max((min - (((max - 20.0f) - 20.0f) * f11)) / 2.0f, 0.0f);
                i10 = 20;
                i11 = 20;
                i13 = max2;
            }
            i13 = 0;
            max2 = 0;
            i10 = 0;
            i11 = 0;
        }
        com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi3 = this.cJ;
        float f12 = i13;
        float f13 = max2;
        qhi3.NBs = (int) ((min - f12) - f13);
        float f14 = i10;
        float f15 = i11;
        qhi3.dI = (int) ((max - f14) - f15);
        activity.getWindow().getDecorView().setPadding(zn.cJ(activity, f12), zn.cJ(activity, f14), zn.cJ(activity, f13), zn.cJ(activity, f15));
    }

    private float[] cJ(int i10) {
        float Tgh = Tgh();
        float fl2 = fl();
        int i11 = this.cJ.Dq;
        if ((i11 == 1) != (Tgh > fl2)) {
            float f10 = Tgh + fl2;
            fl2 = f10 - fl2;
            Tgh = f10 - fl2;
        }
        if (i11 == 1) {
            Tgh -= i10;
        } else {
            fl2 -= i10;
        }
        return new float[]{fl2, Tgh};
    }

    public void cJ() {
        if (this.CJ != null) {
            this.cJ.FQ.getWindow().getDecorView().removeOnLayoutChangeListener(this.CJ);
            this.CJ = null;
        }
    }

    public float[] Qhi(int i10) {
        float[] fArr = new float[2];
        Activity activity = this.cJ.FQ;
        View decorView = activity.getWindow().getDecorView();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 35 && this.cJ.cJ.Oy() == 100.0f) {
            fArr[0] = decorView.getWidth() - decorView.getPaddingLeft();
            fArr[1] = decorView.getHeight() - decorView.getPaddingTop();
        } else {
            fArr[0] = decorView.getWidth() - (decorView.getPaddingLeft() * 2);
            fArr[1] = decorView.getHeight() - (decorView.getPaddingTop() * 2);
        }
        fArr[0] = zn.ac(activity, fArr[0]);
        float ac2 = zn.ac(activity, fArr[1]);
        fArr[1] = ac2;
        if (fArr[0] < 10.0f || ac2 < 10.0f) {
            fArr = cJ(this.Qhi);
        }
        if (i11 != 26 && i11 != 27 && activity.getResources() != null && activity.getResources().getConfiguration() != null) {
            if ((activity.getResources().getConfiguration().orientation == 2 ? 2 : 1) != i10) {
                if (i10 == 2) {
                    float f10 = fArr[0];
                    float f11 = fArr[1];
                    if (f10 < f11) {
                        fArr[1] = f10;
                        fArr[0] = f11;
                    }
                } else {
                    float f12 = fArr[0];
                    float f13 = fArr[1];
                    if (f12 > f13) {
                        fArr[1] = f12;
                        fArr[0] = f13;
                    }
                }
            }
        }
        return fArr;
    }

    public void Qhi() {
        zn.Qhi(this.cJ.FQ);
        this.cJ.FQ.getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.WAv.3
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i10) {
                if (i10 == 0) {
                    try {
                        if (WAv.this.cJ.FQ.isFinishing()) {
                            return;
                        }
                        WAv.this.cJ.FQ.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.Qhi.WAv.3.1
                            @Override // java.lang.Runnable
                            public void run() {
                                zn.Qhi(WAv.this.cJ.FQ);
                            }
                        }, 2500L);
                    } catch (Exception e10) {
                        com.bytedance.sdk.component.utils.ABk.Qhi("TTAD.RFSM", e10.getMessage());
                    }
                }
            }
        });
    }

    private static void Qhi(Activity activity, int i10) {
        if (activity.getRequestedOrientation() == i10) {
            return;
        }
        activity.setRequestedOrientation(i10);
    }
}
