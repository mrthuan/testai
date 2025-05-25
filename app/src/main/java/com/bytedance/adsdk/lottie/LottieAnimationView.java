package com.bytedance.adsdk.lottie;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.component.sdk.annotation.FloatRange;
import com.bytedance.component.sdk.annotation.MainThread;
import com.bytedance.component.sdk.annotation.RawRes;
import com.inmobi.commons.core.configs.CrashConfig;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class LottieAnimationView extends ImageView {
    private static final String Qhi = "LottieAnimationView";
    private static final Gm<Throwable> cJ = new Gm<Throwable>() { // from class: com.bytedance.adsdk.lottie.LottieAnimationView.1
        @Override // com.bytedance.adsdk.lottie.Gm
        public void Qhi(Throwable th2) {
            com.bytedance.adsdk.lottie.Tgh.ROR.Qhi(th2);
        }
    };
    private boolean ABk;
    private final Gm<Throwable> CJ;
    private boolean Gm;
    private ROR HzH;
    private final hm ROR;
    private String Sf;
    private int Tgh;
    private com.bytedance.adsdk.ugeno.ac WAv;

    /* renamed from: ac  reason: collision with root package name */
    private final Gm<ROR> f7690ac;

    /* renamed from: fl  reason: collision with root package name */
    private Gm<Throwable> f7691fl;
    @RawRes

    /* renamed from: hm  reason: collision with root package name */
    private int f7692hm;
    private ABk<ROR> hpZ;
    private final Set<cJ> iMK;
    private final Set<Object> pA;

    /* renamed from: zc  reason: collision with root package name */
    private boolean f7693zc;

    /* loaded from: classes.dex */
    public static class Qhi extends View.BaseSavedState {
        public static final Parcelable.Creator<Qhi> CREATOR = new Parcelable.Creator<Qhi>() { // from class: com.bytedance.adsdk.lottie.LottieAnimationView.Qhi.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: Qhi */
            public Qhi createFromParcel(Parcel parcel) {
                return new Qhi(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: Qhi */
            public Qhi[] newArray(int i10) {
                return new Qhi[i10];
            }
        };
        boolean CJ;
        String Qhi;
        int ROR;
        int Tgh;

        /* renamed from: ac  reason: collision with root package name */
        float f7694ac;
        int cJ;

        /* renamed from: fl  reason: collision with root package name */
        String f7695fl;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.Qhi);
            parcel.writeFloat(this.f7694ac);
            parcel.writeInt(this.CJ ? 1 : 0);
            parcel.writeString(this.f7695fl);
            parcel.writeInt(this.Tgh);
            parcel.writeInt(this.ROR);
        }

        public Qhi(Parcelable parcelable) {
            super(parcelable);
        }

        private Qhi(Parcel parcel) {
            super(parcel);
            this.Qhi = parcel.readString();
            this.f7694ac = parcel.readFloat();
            this.CJ = parcel.readInt() == 1;
            this.f7695fl = parcel.readString();
            this.Tgh = parcel.readInt();
            this.ROR = parcel.readInt();
        }
    }

    /* loaded from: classes.dex */
    public enum cJ {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.f7690ac = new Gm<ROR>() { // from class: com.bytedance.adsdk.lottie.LottieAnimationView.2
            @Override // com.bytedance.adsdk.lottie.Gm
            public void Qhi(ROR ror) {
                LottieAnimationView.this.setComposition(ror);
            }
        };
        this.CJ = new Gm<Throwable>() { // from class: com.bytedance.adsdk.lottie.LottieAnimationView.3
            @Override // com.bytedance.adsdk.lottie.Gm
            public void Qhi(Throwable th2) {
                if (LottieAnimationView.this.Tgh != 0) {
                    LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                    lottieAnimationView.setImageResource(lottieAnimationView.Tgh);
                }
                (LottieAnimationView.this.f7691fl == null ? LottieAnimationView.cJ : LottieAnimationView.this.f7691fl).Qhi(th2);
            }
        };
        this.Tgh = 0;
        this.ROR = new hm();
        this.Gm = false;
        this.f7693zc = false;
        this.ABk = true;
        this.iMK = new HashSet();
        this.pA = new HashSet();
        Tgh();
    }

    private void ROR() {
        ABk<ROR> aBk = this.hpZ;
        if (aBk != null) {
            aBk.cJ(this.f7690ac);
            this.hpZ.CJ(this.CJ);
        }
    }

    private void Sf() {
        this.HzH = null;
        this.ROR.Sf();
    }

    private void Tgh() {
        boolean z10 = false;
        setSaveEnabled(false);
        this.ABk = true;
        setFallbackResource(0);
        setImageAssetsFolder("");
        Qhi(0.0f, false);
        Qhi(false);
        setIgnoreDisabledSystemAnimations(false);
        hm hmVar = this.ROR;
        if (com.bytedance.adsdk.lottie.Tgh.ROR.Qhi(getContext()) != 0.0f) {
            z10 = true;
        }
        hmVar.Qhi(Boolean.valueOf(z10));
    }

    private void hm() {
        boolean cJ2 = cJ();
        setImageDrawable(null);
        setImageDrawable(this.ROR);
        if (cJ2) {
            this.ROR.Gm();
        }
    }

    private void setCompositionTask(ABk<ROR> aBk) {
        this.iMK.add(cJ.SET_ANIMATION);
        Sf();
        ROR();
        this.hpZ = aBk.Qhi(this.f7690ac).ac(this.CJ);
    }

    @MainThread
    public void CJ() {
        this.f7693zc = false;
        this.ROR.Dww();
    }

    public boolean getClipToCompositionBounds() {
        return this.ROR.cJ();
    }

    public ROR getComposition() {
        return this.HzH;
    }

    public long getDuration() {
        ROR ror = this.HzH;
        if (ror != null) {
            return ror.fl();
        }
        return 0L;
    }

    public int getFrame() {
        return this.ROR.pA();
    }

    public String getImageAssetsFolder() {
        return this.ROR.ac();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.ROR.CJ();
    }

    public float getMaxFrame() {
        return this.ROR.ABk();
    }

    public float getMinFrame() {
        return this.ROR.zc();
    }

    public kYc getPerformanceTracker() {
        return this.ROR.Tgh();
    }

    @FloatRange(from = 0.0d, to = CrashConfig.DEFAULT_CRASH_SAMPLING_PERCENT)
    public float getProgress() {
        return this.ROR.CQU();
    }

    public tP getRenderMode() {
        return this.ROR.fl();
    }

    public int getRepeatCount() {
        return this.ROR.HzH();
    }

    public int getRepeatMode() {
        return this.ROR.hpZ();
    }

    public float getSpeed() {
        return this.ROR.iMK();
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof hm) && ((hm) drawable).fl() == tP.SOFTWARE) {
            this.ROR.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        hm hmVar = this.ROR;
        if (drawable2 == hmVar) {
            super.invalidateDrawable(hmVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && this.f7693zc) {
            this.ROR.hm();
        }
        com.bytedance.adsdk.ugeno.ac acVar = this.WAv;
        if (acVar != null) {
            acVar.Tgh();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.ac acVar = this.WAv;
        if (acVar != null) {
            acVar.Tgh();
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i10;
        if (!(parcelable instanceof Qhi)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Qhi qhi = (Qhi) parcelable;
        super.onRestoreInstanceState(qhi.getSuperState());
        this.Sf = qhi.Qhi;
        Set<cJ> set = this.iMK;
        cJ cJVar = cJ.SET_ANIMATION;
        if (!set.contains(cJVar) && !TextUtils.isEmpty(this.Sf)) {
            setAnimation(this.Sf);
        }
        this.f7692hm = qhi.cJ;
        if (!this.iMK.contains(cJVar) && (i10 = this.f7692hm) != 0) {
            setAnimation(i10);
        }
        if (!this.iMK.contains(cJ.SET_PROGRESS)) {
            Qhi(qhi.f7694ac, false);
        }
        if (!this.iMK.contains(cJ.PLAY_OPTION) && qhi.CJ) {
            Qhi();
        }
        if (!this.iMK.contains(cJ.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(qhi.f7695fl);
        }
        if (!this.iMK.contains(cJ.SET_REPEAT_MODE)) {
            setRepeatMode(qhi.Tgh);
        }
        if (!this.iMK.contains(cJ.SET_REPEAT_COUNT)) {
            setRepeatCount(qhi.ROR);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Qhi qhi = new Qhi(super.onSaveInstanceState());
        qhi.Qhi = this.Sf;
        qhi.cJ = this.f7692hm;
        qhi.f7694ac = this.ROR.CQU();
        qhi.CJ = this.ROR.tP();
        qhi.f7695fl = this.ROR.ac();
        qhi.Tgh = this.ROR.hpZ();
        qhi.ROR = this.ROR.HzH();
        return qhi;
    }

    public void setAnimation(@RawRes int i10) {
        this.f7692hm = i10;
        this.Sf = null;
        setCompositionTask(Qhi(i10));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        Qhi(str, (String) null);
    }

    public void setAnimationFromUrl(String str) {
        ABk<ROR> Qhi2;
        if (this.ABk) {
            Qhi2 = Sf.Qhi(getContext(), str);
        } else {
            Qhi2 = Sf.Qhi(getContext(), str, (String) null);
        }
        setCompositionTask(Qhi2);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.ROR.Tgh(z10);
    }

    public void setCacheComposition(boolean z10) {
        this.ABk = z10;
    }

    public void setClipToCompositionBounds(boolean z10) {
        this.ROR.cJ(z10);
    }

    public void setComposition(ROR ror) {
        if (Tgh.Qhi) {
            "Set Composition \n".concat(String.valueOf(ror));
        }
        this.ROR.setCallback(this);
        this.HzH = ror;
        this.Gm = true;
        boolean Qhi2 = this.ROR.Qhi(ror);
        this.Gm = false;
        if (getDrawable() == this.ROR && !Qhi2) {
            return;
        }
        if (!Qhi2) {
            hm();
        }
        onVisibilityChanged(this, getVisibility());
        requestLayout();
        Iterator<Object> it = this.pA.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.ROR.ROR(str);
    }

    public void setFailureListener(Gm<Throwable> gm2) {
        this.f7691fl = gm2;
    }

    public void setFallbackResource(int i10) {
        this.Tgh = i10;
    }

    public void setFontAssetDelegate(ac acVar) {
        this.ROR.Qhi(acVar);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.ROR.Qhi(map);
    }

    public void setFrame(int i10) {
        this.ROR.ac(i10);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z10) {
        this.ROR.Sf(z10);
    }

    public void setImageAssetDelegate(fl flVar) {
        this.ROR.Qhi(flVar);
    }

    public void setImageAssetsFolder(String str) {
        this.ROR.Qhi(str);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        ROR();
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        ROR();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        ROR();
        super.setImageResource(i10);
    }

    public void setMaintainOriginalImageBounds(boolean z10) {
        this.ROR.ac(z10);
    }

    public void setMaxFrame(int i10) {
        this.ROR.cJ(i10);
    }

    public void setMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) float f10) {
        this.ROR.cJ(f10);
    }

    public void setMinAndMaxFrame(String str) {
        this.ROR.CJ(str);
    }

    public void setMinFrame(int i10) {
        this.ROR.Qhi(i10);
    }

    public void setMinProgress(float f10) {
        this.ROR.Qhi(f10);
    }

    public void setOutlineMasksAndMattes(boolean z10) {
        this.ROR.fl(z10);
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        this.ROR.CJ(z10);
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f10) {
        Qhi(f10, true);
    }

    public void setRenderMode(tP tPVar) {
        this.ROR.Qhi(tPVar);
    }

    public void setRepeatCount(int i10) {
        this.iMK.add(cJ.SET_REPEAT_COUNT);
        this.ROR.fl(i10);
    }

    public void setRepeatMode(int i10) {
        this.iMK.add(cJ.SET_REPEAT_MODE);
        this.ROR.CJ(i10);
    }

    public void setSafeMode(boolean z10) {
        this.ROR.ROR(z10);
    }

    public void setSpeed(float f10) {
        this.ROR.ac(f10);
    }

    public void setTextDelegate(MQ mq) {
        this.ROR.Qhi(mq);
    }

    public void setUseCompositionFrameRate(boolean z10) {
        this.ROR.hm(z10);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        hm hmVar;
        if (!this.Gm && drawable == (hmVar = this.ROR) && hmVar.kYc()) {
            CJ();
        } else if (!this.Gm && (drawable instanceof hm)) {
            hm hmVar2 = (hm) drawable;
            if (hmVar2.kYc()) {
                hmVar2.Dww();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void Qhi(com.bytedance.adsdk.ugeno.ac acVar) {
        this.WAv = acVar;
    }

    @MainThread
    public void ac() {
        this.iMK.add(cJ.PLAY_OPTION);
        this.ROR.bxS();
    }

    @Deprecated
    public void cJ(boolean z10) {
        this.ROR.fl(z10 ? -1 : 0);
    }

    public void setMaxFrame(String str) {
        this.ROR.ac(str);
    }

    public void setMinFrame(String str) {
        this.ROR.cJ(str);
    }

    public void Qhi(boolean z10) {
        this.ROR.Qhi(z10);
    }

    public boolean cJ() {
        return this.ROR.kYc();
    }

    private ABk<ROR> Qhi(@RawRes final int i10) {
        if (isInEditMode()) {
            return new ABk<>(new Callable<zc<ROR>>() { // from class: com.bytedance.adsdk.lottie.LottieAnimationView.4
                @Override // java.util.concurrent.Callable
                /* renamed from: Qhi */
                public zc<ROR> call() {
                    if (LottieAnimationView.this.ABk) {
                        return Sf.cJ(LottieAnimationView.this.getContext(), i10);
                    }
                    return Sf.cJ(LottieAnimationView.this.getContext(), i10, (String) null);
                }
            }, true);
        }
        return this.ABk ? Sf.Qhi(getContext(), i10) : Sf.Qhi(getContext(), i10, (String) null);
    }

    public void setAnimation(String str) {
        this.Sf = str;
        this.f7692hm = 0;
        setCompositionTask(Qhi(str));
    }

    private ABk<ROR> Qhi(final String str) {
        if (isInEditMode()) {
            return new ABk<>(new Callable<zc<ROR>>() { // from class: com.bytedance.adsdk.lottie.LottieAnimationView.5
                @Override // java.util.concurrent.Callable
                /* renamed from: Qhi */
                public zc<ROR> call() {
                    if (LottieAnimationView.this.ABk) {
                        return Sf.ac(LottieAnimationView.this.getContext(), str);
                    }
                    return Sf.ac(LottieAnimationView.this.getContext(), str, null);
                }
            }, true);
        }
        return this.ABk ? Sf.cJ(getContext(), str) : Sf.cJ(getContext(), str, (String) null);
    }

    public void Qhi(String str, String str2) {
        Qhi(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void Qhi(InputStream inputStream, String str) {
        setCompositionTask(Sf.Qhi(inputStream, str));
    }

    @MainThread
    public void Qhi() {
        this.iMK.add(cJ.PLAY_OPTION);
        this.ROR.hm();
    }

    public Bitmap Qhi(String str, Bitmap bitmap) {
        return this.ROR.Qhi(str, bitmap);
    }

    private void Qhi(@FloatRange(from = 0.0d, to = 1.0d) float f10, boolean z10) {
        if (z10) {
            this.iMK.add(cJ.SET_PROGRESS);
        }
        this.ROR.CJ(f10);
    }
}
