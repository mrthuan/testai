package com.bytedance.adsdk.lottie;

import a6.h;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.bytedance.adsdk.lottie.fl.bxS;
import com.bytedance.component.sdk.annotation.FloatRange;
import com.bytedance.component.sdk.annotation.IntRange;
import com.bytedance.component.sdk.annotation.MainThread;
import com.bytedance.component.sdk.annotation.RestrictTo;
import com.inmobi.commons.core.configs.CrashConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* compiled from: LottieDrawable.java */
/* loaded from: classes.dex */
public class hm extends Drawable implements Animatable, Drawable.Callback {
    private String ABk;
    private ROR CJ;
    private tP CQU;
    private boolean Dww;
    private boolean EBS;
    private final Matrix Eh;
    private Matrix FQ;
    private final ValueAnimator.AnimatorUpdateListener Gm;
    private boolean HzH;
    private Rect Jma;
    private com.bytedance.adsdk.lottie.ac.ac.cJ MQ;
    private Canvas NFd;
    private boolean PAe;
    String Qhi;
    private boolean ROR;
    private boolean Sf;
    private boolean Tgh;
    private final ArrayList<Qhi> WAv;
    private Bitmap aP;

    /* renamed from: ac  reason: collision with root package name */
    MQ f7858ac;
    private boolean bxS;
    ac cJ;
    private RectF es;

    /* renamed from: fl  reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.Tgh.ac f7859fl;

    /* renamed from: hm  reason: collision with root package name */
    private cJ f7860hm;
    private Map<String, Typeface> hpZ;
    private fl iMK;
    private Rect js;
    private boolean kYc;
    private RectF lB;
    private Paint lG;
    private com.bytedance.adsdk.lottie.cJ.Qhi pA;
    private boolean pM;
    private int qMt;
    private Rect sDy;
    private boolean tP;
    private Matrix yN;

    /* renamed from: zc  reason: collision with root package name */
    private com.bytedance.adsdk.lottie.cJ.cJ f7861zc;

    /* renamed from: zn  reason: collision with root package name */
    private RectF f7862zn;

    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public interface Qhi {
        void Qhi(ROR ror);
    }

    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public enum cJ {
        NONE,
        PLAY,
        RESUME
    }

    public hm() {
        com.bytedance.adsdk.lottie.Tgh.ac acVar = new com.bytedance.adsdk.lottie.Tgh.ac();
        this.f7859fl = acVar;
        this.Tgh = true;
        this.ROR = false;
        this.Sf = false;
        this.f7860hm = cJ.NONE;
        this.WAv = new ArrayList<>();
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.lottie.hm.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (hm.this.MQ != null) {
                    hm.this.MQ.Qhi(hm.this.f7859fl.Tgh());
                }
            }
        };
        this.Gm = animatorUpdateListener;
        this.kYc = false;
        this.tP = true;
        this.qMt = FunctionEval.FunctionID.EXTERNAL_FUNC;
        this.CQU = tP.AUTOMATIC;
        this.pM = false;
        this.Eh = new Matrix();
        this.PAe = false;
        acVar.addUpdateListener(animatorUpdateListener);
    }

    private void Eh() {
        ROR ror = this.CJ;
        if (ror == null) {
            return;
        }
        com.bytedance.adsdk.lottie.ac.ac.cJ cJVar = new com.bytedance.adsdk.lottie.ac.ac.cJ(this, bxS.Qhi(ror), ror.hm(), ror);
        this.MQ = cJVar;
        if (this.bxS) {
            cJVar.Qhi(true);
        }
        this.MQ.cJ(this.tP);
    }

    private boolean Jma() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        ViewParent parent = ((View) callback).getParent();
        if (!(parent instanceof ViewGroup) || ((ViewGroup) parent).getClipChildren()) {
            return false;
        }
        return true;
    }

    private com.bytedance.adsdk.lottie.cJ.cJ NFd() {
        com.bytedance.adsdk.lottie.cJ.cJ cJVar = this.f7861zc;
        if (cJVar != null && !cJVar.Qhi(lB())) {
            this.f7861zc = null;
        }
        if (this.f7861zc == null) {
            this.f7861zc = new com.bytedance.adsdk.lottie.cJ.cJ(getCallback(), this.ABk, this.iMK, this.CJ.zc());
        }
        return this.f7861zc;
    }

    private boolean aP() {
        if (!this.Tgh && !this.ROR) {
            return false;
        }
        return true;
    }

    private Context lB() {
        Drawable.Callback callback = getCallback();
        if (callback == null || !(callback instanceof View)) {
            return null;
        }
        return ((View) callback).getContext();
    }

    private void lG() {
        if (this.NFd != null) {
            return;
        }
        this.NFd = new Canvas();
        this.es = new RectF();
        this.yN = new Matrix();
        this.FQ = new Matrix();
        this.sDy = new Rect();
        this.lB = new RectF();
        this.lG = new com.bytedance.adsdk.lottie.Qhi.Qhi();
        this.Jma = new Rect();
        this.js = new Rect();
        this.f7862zn = new RectF();
    }

    private void pM() {
        ROR ror = this.CJ;
        if (ror == null) {
            return;
        }
        this.pM = this.CQU.Qhi(Build.VERSION.SDK_INT, ror.Qhi(), ror.cJ());
    }

    private com.bytedance.adsdk.lottie.cJ.Qhi sDy() {
        if (getCallback() == null) {
            return null;
        }
        if (this.pA == null) {
            com.bytedance.adsdk.lottie.cJ.Qhi qhi = new com.bytedance.adsdk.lottie.cJ.Qhi(getCallback(), this.cJ);
            this.pA = qhi;
            String str = this.Qhi;
            if (str != null) {
                qhi.Qhi(str);
            }
        }
        return this.pA;
    }

    public float ABk() {
        return this.f7859fl.hpZ();
    }

    public boolean CJ() {
        return this.kYc;
    }

    @FloatRange(from = 0.0d, to = CrashConfig.DEFAULT_CRASH_SAMPLING_PERCENT)
    public float CQU() {
        return this.f7859fl.Tgh();
    }

    public void Dww() {
        this.WAv.clear();
        this.f7859fl.ABk();
        if (!isVisible()) {
            this.f7860hm = cJ.NONE;
        }
    }

    public ROR EBS() {
        return this.CJ;
    }

    @MainThread
    public void Gm() {
        float ABk;
        if (this.MQ == null) {
            this.WAv.add(new Qhi() { // from class: com.bytedance.adsdk.lottie.hm.7
                @Override // com.bytedance.adsdk.lottie.hm.Qhi
                public void Qhi(ROR ror) {
                    hm.this.Gm();
                }
            });
            return;
        }
        pM();
        if (aP() || HzH() == 0) {
            if (isVisible()) {
                this.f7859fl.iMK();
                this.f7860hm = cJ.NONE;
            } else {
                this.f7860hm = cJ.RESUME;
            }
        }
        if (!aP()) {
            if (iMK() < 0.0f) {
                ABk = zc();
            } else {
                ABk = ABk();
            }
            ac((int) ABk);
            this.f7859fl.zc();
            if (!isVisible()) {
                this.f7860hm = cJ.NONE;
            }
        }
    }

    public int HzH() {
        return this.f7859fl.getRepeatCount();
    }

    public MQ MQ() {
        return this.f7858ac;
    }

    public boolean ROR() {
        return this.Dww;
    }

    public void Sf() {
        if (this.f7859fl.isRunning()) {
            this.f7859fl.cancel();
            if (!isVisible()) {
                this.f7860hm = cJ.NONE;
            }
        }
        this.CJ = null;
        this.MQ = null;
        this.f7861zc = null;
        this.f7859fl.Sf();
        invalidateSelf();
    }

    public kYc Tgh() {
        ROR ror = this.CJ;
        if (ror != null) {
            return ror.ac();
        }
        return null;
    }

    @MainThread
    public void WAv() {
        this.WAv.clear();
        this.f7859fl.zc();
        if (!isVisible()) {
            this.f7860hm = cJ.NONE;
        }
    }

    public String ac() {
        return this.ABk;
    }

    public void bxS() {
        this.WAv.clear();
        this.f7859fl.cancel();
        if (!isVisible()) {
            this.f7860hm = cJ.NONE;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Tgh.Qhi("Drawable#draw");
        if (this.Sf) {
            try {
                if (this.pM) {
                    Qhi(canvas, this.MQ);
                } else {
                    Qhi(canvas);
                }
            } catch (Throwable unused) {
            }
        } else if (this.pM) {
            Qhi(canvas, this.MQ);
        } else {
            Qhi(canvas);
        }
        this.PAe = false;
        Tgh.cJ("Drawable#draw");
    }

    public tP fl() {
        return this.pM ? tP.SOFTWARE : tP.HARDWARE;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.qMt;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        ROR ror = this.CJ;
        if (ror == null) {
            return -1;
        }
        return ror.CJ().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        ROR ror = this.CJ;
        if (ror == null) {
            return -1;
        }
        return ror.CJ().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @MainThread
    public void hm() {
        if (this.MQ == null) {
            this.WAv.add(new Qhi() { // from class: com.bytedance.adsdk.lottie.hm.6
                @Override // com.bytedance.adsdk.lottie.hm.Qhi
                public void Qhi(ROR ror) {
                    hm.this.hm();
                }
            });
            return;
        }
        pM();
        if (aP() || HzH() == 0) {
            if (isVisible()) {
                this.f7859fl.Gm();
                this.f7860hm = cJ.NONE;
            } else {
                this.f7860hm = cJ.PLAY;
            }
        }
        if (aP()) {
            return;
        }
        ac((int) (iMK() < 0.0f ? zc() : ABk()));
        this.f7859fl.zc();
        if (isVisible()) {
            return;
        }
        this.f7860hm = cJ.NONE;
    }

    @SuppressLint({"WrongConstant"})
    public int hpZ() {
        return this.f7859fl.getRepeatMode();
    }

    public float iMK() {
        return this.f7859fl.WAv();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.PAe) {
            return;
        }
        this.PAe = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return kYc();
    }

    public boolean kYc() {
        com.bytedance.adsdk.lottie.Tgh.ac acVar = this.f7859fl;
        if (acVar == null) {
            return false;
        }
        return acVar.isRunning();
    }

    public int pA() {
        return (int) this.f7859fl.ROR();
    }

    public boolean qMt() {
        if (this.hpZ == null && this.f7858ac == null && this.CJ.WAv().size() > 0) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = 255) int i10) {
        this.qMt = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean z12 = !isVisible();
        boolean visible = super.setVisible(z10, z11);
        if (z10) {
            cJ cJVar = this.f7860hm;
            if (cJVar == cJ.PLAY) {
                hm();
            } else if (cJVar == cJ.RESUME) {
                Gm();
            }
        } else if (this.f7859fl.isRunning()) {
            Dww();
            this.f7860hm = cJ.RESUME;
        } else if (!z12) {
            this.f7860hm = cJ.NONE;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    @MainThread
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        hm();
    }

    @Override // android.graphics.drawable.Animatable
    @MainThread
    public void stop() {
        WAv();
    }

    public boolean tP() {
        if (isVisible()) {
            return this.f7859fl.isRunning();
        }
        cJ cJVar = this.f7860hm;
        if (cJVar != cJ.PLAY && cJVar != cJ.RESUME) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public float zc() {
        return this.f7859fl.pA();
    }

    public void CJ(boolean z10) {
        this.EBS = z10;
        ROR ror = this.CJ;
        if (ror != null) {
            ror.cJ(z10);
        }
    }

    public boolean Qhi() {
        return this.HzH;
    }

    public void ROR(boolean z10) {
        this.Sf = z10;
    }

    public void ac(boolean z10) {
        this.kYc = z10;
    }

    public void cJ(boolean z10) {
        if (z10 != this.tP) {
            this.tP = z10;
            com.bytedance.adsdk.lottie.ac.ac.cJ cJVar = this.MQ;
            if (cJVar != null) {
                cJVar.cJ(z10);
            }
            invalidateSelf();
        }
    }

    public void fl(boolean z10) {
        if (this.bxS == z10) {
            return;
        }
        this.bxS = z10;
        com.bytedance.adsdk.lottie.ac.ac.cJ cJVar = this.MQ;
        if (cJVar != null) {
            cJVar.Qhi(z10);
        }
    }

    public void Qhi(boolean z10) {
        if (this.HzH == z10) {
            return;
        }
        this.HzH = z10;
        if (this.CJ != null) {
            Eh();
        }
    }

    public void ROR(String str) {
        this.Qhi = str;
        com.bytedance.adsdk.lottie.cJ.Qhi sDy = sDy();
        if (sDy != null) {
            sDy.Qhi(str);
        }
    }

    public void Tgh(boolean z10) {
        this.Dww = z10;
    }

    public void ac(final String str) {
        ROR ror = this.CJ;
        if (ror == null) {
            this.WAv.add(new Qhi() { // from class: com.bytedance.adsdk.lottie.hm.13
                @Override // com.bytedance.adsdk.lottie.hm.Qhi
                public void Qhi(ROR ror2) {
                    hm.this.ac(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.lottie.ac.ROR ac2 = ror.ac(str);
        if (ac2 != null) {
            cJ((int) (ac2.Qhi + ac2.cJ));
            return;
        }
        throw new IllegalArgumentException(h.d("Cannot find marker with name ", str, "."));
    }

    public WAv Tgh(String str) {
        ROR ror = this.CJ;
        if (ror == null) {
            return null;
        }
        return ror.zc().get(str);
    }

    public void CJ(final String str) {
        ROR ror = this.CJ;
        if (ror == null) {
            this.WAv.add(new Qhi() { // from class: com.bytedance.adsdk.lottie.hm.2
                @Override // com.bytedance.adsdk.lottie.hm.Qhi
                public void Qhi(ROR ror2) {
                    hm.this.CJ(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.lottie.ac.ROR ac2 = ror.ac(str);
        if (ac2 != null) {
            int i10 = (int) ac2.Qhi;
            Qhi(i10, ((int) ac2.cJ) + i10);
            return;
        }
        throw new IllegalArgumentException(h.d("Cannot find marker with name ", str, "."));
    }

    public void fl(int i10) {
        this.f7859fl.setRepeatCount(i10);
    }

    public void Qhi(String str) {
        this.ABk = str;
    }

    public boolean cJ() {
        return this.tP;
    }

    public Bitmap fl(String str) {
        com.bytedance.adsdk.lottie.cJ.cJ NFd = NFd();
        if (NFd != null) {
            return NFd.Qhi(str);
        }
        return null;
    }

    public boolean Qhi(ROR ror) {
        if (this.CJ == ror) {
            return false;
        }
        this.PAe = true;
        Sf();
        this.CJ = ror;
        Eh();
        this.f7859fl.Qhi(ror);
        CJ(this.f7859fl.getAnimatedFraction());
        Iterator it = new ArrayList(this.WAv).iterator();
        while (it.hasNext()) {
            Qhi qhi = (Qhi) it.next();
            if (qhi != null) {
                qhi.Qhi(ror);
            }
            it.remove();
        }
        this.WAv.clear();
        ror.cJ(this.EBS);
        pM();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void cJ(final int i10) {
        if (this.CJ == null) {
            this.WAv.add(new Qhi() { // from class: com.bytedance.adsdk.lottie.hm.10
                @Override // com.bytedance.adsdk.lottie.hm.Qhi
                public void Qhi(ROR ror) {
                    hm.this.cJ(i10);
                }
            });
        } else {
            this.f7859fl.cJ(i10 + 0.99f);
        }
    }

    public void Sf(boolean z10) {
        this.ROR = z10;
    }

    public void cJ(@FloatRange(from = 0.0d, to = 1.0d) final float f10) {
        ROR ror = this.CJ;
        if (ror == null) {
            this.WAv.add(new Qhi() { // from class: com.bytedance.adsdk.lottie.hm.11
                @Override // com.bytedance.adsdk.lottie.hm.Qhi
                public void Qhi(ROR ror2) {
                    hm.this.cJ(f10);
                }
            });
        } else {
            this.f7859fl.cJ(com.bytedance.adsdk.lottie.Tgh.Tgh.Qhi(ror.Tgh(), this.CJ.ROR(), f10));
        }
    }

    public void cJ(final String str) {
        ROR ror = this.CJ;
        if (ror == null) {
            this.WAv.add(new Qhi() { // from class: com.bytedance.adsdk.lottie.hm.12
                @Override // com.bytedance.adsdk.lottie.hm.Qhi
                public void Qhi(ROR ror2) {
                    hm.this.cJ(str);
                }
            });
            return;
        }
        com.bytedance.adsdk.lottie.ac.ROR ac2 = ror.ac(str);
        if (ac2 != null) {
            Qhi((int) ac2.Qhi);
            return;
        }
        throw new IllegalArgumentException(h.d("Cannot find marker with name ", str, "."));
    }

    public void hm(boolean z10) {
        this.f7859fl.ac(z10);
    }

    public void ac(float f10) {
        this.f7859fl.ac(f10);
    }

    public void ac(final int i10) {
        if (this.CJ == null) {
            this.WAv.add(new Qhi() { // from class: com.bytedance.adsdk.lottie.hm.4
                @Override // com.bytedance.adsdk.lottie.hm.Qhi
                public void Qhi(ROR ror) {
                    hm.this.ac(i10);
                }
            });
        } else {
            this.f7859fl.Qhi(i10);
        }
    }

    public void CJ(@FloatRange(from = 0.0d, to = 1.0d) final float f10) {
        if (this.CJ == null) {
            this.WAv.add(new Qhi() { // from class: com.bytedance.adsdk.lottie.hm.5
                @Override // com.bytedance.adsdk.lottie.hm.Qhi
                public void Qhi(ROR ror) {
                    hm.this.CJ(f10);
                }
            });
            return;
        }
        Tgh.Qhi("Drawable#setProgress");
        this.f7859fl.Qhi(this.CJ.Qhi(f10));
        Tgh.cJ("Drawable#setProgress");
    }

    public void Qhi(tP tPVar) {
        this.CQU = tPVar;
        pM();
    }

    public void CJ(int i10) {
        this.f7859fl.setRepeatMode(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void Qhi(final int i10) {
        if (this.CJ == null) {
            this.WAv.add(new Qhi() { // from class: com.bytedance.adsdk.lottie.hm.8
                @Override // com.bytedance.adsdk.lottie.hm.Qhi
                public void Qhi(ROR ror) {
                    hm.this.Qhi(i10);
                }
            });
        } else {
            this.f7859fl.Qhi(i10);
        }
    }

    private void cJ(int i10, int i11) {
        Bitmap bitmap = this.aP;
        if (bitmap != null && bitmap.getWidth() >= i10 && this.aP.getHeight() >= i11) {
            if (this.aP.getWidth() > i10 || this.aP.getHeight() > i11) {
                Bitmap createBitmap = Bitmap.createBitmap(this.aP, 0, 0, i10, i11);
                this.aP = createBitmap;
                this.NFd.setBitmap(createBitmap);
                this.PAe = true;
                return;
            }
            return;
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        this.aP = createBitmap2;
        this.NFd.setBitmap(createBitmap2);
        this.PAe = true;
    }

    public void Qhi(final float f10) {
        ROR ror = this.CJ;
        if (ror == null) {
            this.WAv.add(new Qhi() { // from class: com.bytedance.adsdk.lottie.hm.9
                @Override // com.bytedance.adsdk.lottie.hm.Qhi
                public void Qhi(ROR ror2) {
                    hm.this.Qhi(f10);
                }
            });
        } else {
            Qhi((int) com.bytedance.adsdk.lottie.Tgh.Tgh.Qhi(ror.Tgh(), this.CJ.ROR(), f10));
        }
    }

    public void Qhi(final int i10, final int i11) {
        if (this.CJ == null) {
            this.WAv.add(new Qhi() { // from class: com.bytedance.adsdk.lottie.hm.3
                @Override // com.bytedance.adsdk.lottie.hm.Qhi
                public void Qhi(ROR ror) {
                    hm.this.Qhi(i10, i11);
                }
            });
        } else {
            this.f7859fl.Qhi(i10, i11 + 0.99f);
        }
    }

    public void Qhi(Boolean bool) {
        this.Tgh = bool.booleanValue();
    }

    public void Qhi(fl flVar) {
        this.iMK = flVar;
        com.bytedance.adsdk.lottie.cJ.cJ cJVar = this.f7861zc;
        if (cJVar != null) {
            cJVar.Qhi(flVar);
        }
    }

    public void Qhi(ac acVar) {
        this.cJ = acVar;
        com.bytedance.adsdk.lottie.cJ.Qhi qhi = this.pA;
        if (qhi != null) {
            qhi.Qhi(acVar);
        }
    }

    public void Qhi(Map<String, Typeface> map) {
        if (map == this.hpZ) {
            return;
        }
        this.hpZ = map;
        invalidateSelf();
    }

    public void Qhi(MQ mq) {
        this.f7858ac = mq;
    }

    public Bitmap Qhi(String str, Bitmap bitmap) {
        com.bytedance.adsdk.lottie.cJ.cJ NFd = NFd();
        if (NFd == null) {
            return null;
        }
        Bitmap Qhi2 = NFd.Qhi(str, bitmap);
        invalidateSelf();
        return Qhi2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Typeface Qhi(com.bytedance.adsdk.lottie.ac.ac acVar) {
        Map<String, Typeface> map = this.hpZ;
        if (map != null) {
            String Qhi2 = acVar.Qhi();
            if (map.containsKey(Qhi2)) {
                return map.get(Qhi2);
            }
            String cJ2 = acVar.cJ();
            if (map.containsKey(cJ2)) {
                return map.get(cJ2);
            }
            String str = acVar.Qhi() + "-" + acVar.ac();
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        com.bytedance.adsdk.lottie.cJ.Qhi sDy = sDy();
        if (sDy != null) {
            return sDy.Qhi(acVar);
        }
        return null;
    }

    private void Qhi(Canvas canvas) {
        com.bytedance.adsdk.lottie.ac.ac.cJ cJVar = this.MQ;
        ROR ror = this.CJ;
        if (cJVar == null || ror == null) {
            return;
        }
        this.Eh.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            this.Eh.preScale(bounds.width() / ror.CJ().width(), bounds.height() / ror.CJ().height());
            this.Eh.preTranslate(bounds.left, bounds.top);
        }
        cJVar.Qhi(canvas, this.Eh, this.qMt);
    }

    private void Qhi(Canvas canvas, com.bytedance.adsdk.lottie.ac.ac.cJ cJVar) {
        if (this.CJ == null || cJVar == null) {
            return;
        }
        lG();
        canvas.getMatrix(this.yN);
        canvas.getClipBounds(this.sDy);
        Qhi(this.sDy, this.lB);
        this.yN.mapRect(this.lB);
        Qhi(this.lB, this.sDy);
        if (this.tP) {
            this.es.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            cJVar.Qhi(this.es, (Matrix) null, false);
        }
        this.yN.mapRect(this.es);
        Rect bounds = getBounds();
        float width = bounds.width() / getIntrinsicWidth();
        float height = bounds.height() / getIntrinsicHeight();
        Qhi(this.es, width, height);
        if (!Jma()) {
            RectF rectF = this.es;
            Rect rect = this.sDy;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int ceil = (int) Math.ceil(this.es.width());
        int ceil2 = (int) Math.ceil(this.es.height());
        if (ceil == 0 || ceil2 == 0) {
            return;
        }
        cJ(ceil, ceil2);
        if (this.PAe) {
            this.Eh.set(this.yN);
            this.Eh.preScale(width, height);
            Matrix matrix = this.Eh;
            RectF rectF2 = this.es;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.aP.eraseColor(0);
            cJVar.Qhi(this.NFd, this.Eh, this.qMt);
            this.yN.invert(this.FQ);
            this.FQ.mapRect(this.f7862zn, this.es);
            Qhi(this.f7862zn, this.js);
        }
        this.Jma.set(0, 0, ceil, ceil2);
        canvas.drawBitmap(this.aP, this.Jma, this.js, this.lG);
    }

    private void Qhi(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void Qhi(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    private void Qhi(RectF rectF, float f10, float f11) {
        rectF.set(rectF.left * f10, rectF.top * f11, rectF.right * f10, rectF.bottom * f11);
    }
}
