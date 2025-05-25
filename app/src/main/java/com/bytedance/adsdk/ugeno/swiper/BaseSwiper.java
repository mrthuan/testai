package com.bytedance.adsdk.ugeno.swiper;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.adjust.sdk.Constants;
import com.bytedance.adsdk.ugeno.swiper.indicator.DotIndicator;
import com.bytedance.adsdk.ugeno.viewpager.ViewPager;
import com.facebook.ads.AdError;
import com.google.android.gms.common.api.Api;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class BaseSwiper<T> extends FrameLayout implements ViewPager.fl {
    private boolean ABk;
    private int CJ;
    private boolean Gm;
    private DotIndicator HzH;
    private final Runnable MQ;
    protected List<T> Qhi;
    private int ROR;
    private String Sf;
    private int Tgh;
    private boolean WAv;

    /* renamed from: ac  reason: collision with root package name */
    private int f7948ac;
    protected ViewPager cJ;

    /* renamed from: fl  reason: collision with root package name */
    private int f7949fl;

    /* renamed from: hm  reason: collision with root package name */
    private float f7950hm;
    private int hpZ;
    private int iMK;
    private Qhi kYc;
    private int pA;
    private final Runnable qMt;
    private com.bytedance.adsdk.ugeno.swiper.Qhi tP;

    /* renamed from: zc  reason: collision with root package name */
    private boolean f7951zc;

    /* loaded from: classes.dex */
    public class Qhi extends com.bytedance.adsdk.ugeno.viewpager.cJ {
        public Qhi() {
        }

        @Override // com.bytedance.adsdk.ugeno.viewpager.cJ
        public int Qhi(Object obj) {
            return -2;
        }

        @Override // com.bytedance.adsdk.ugeno.viewpager.cJ
        public boolean Qhi(View view, Object obj) {
            return view == obj;
        }

        @Override // com.bytedance.adsdk.ugeno.viewpager.cJ
        public int Qhi() {
            return BaseSwiper.this.f7951zc ? Api.BaseClientBuilder.API_PRIORITY_OTHER : BaseSwiper.this.Qhi.size();
        }

        @Override // com.bytedance.adsdk.ugeno.viewpager.cJ
        public Object Qhi(ViewGroup viewGroup, int i10) {
            View Qhi = BaseSwiper.this.Qhi(i10, com.bytedance.adsdk.ugeno.swiper.cJ.Qhi(BaseSwiper.this.f7951zc, i10, BaseSwiper.this.Qhi.size()));
            viewGroup.addView(Qhi);
            return Qhi;
        }

        @Override // com.bytedance.adsdk.ugeno.viewpager.cJ
        public void Qhi(ViewGroup viewGroup, int i10, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // com.bytedance.adsdk.ugeno.viewpager.cJ
        public float Qhi(int i10) {
            if (BaseSwiper.this.f7950hm <= 0.0f) {
                return 1.0f;
            }
            return 1.0f / BaseSwiper.this.f7950hm;
        }
    }

    /* loaded from: classes.dex */
    public class cJ extends ViewPager {
        public cJ(Context context) {
            super(context);
        }

        @Override // com.bytedance.adsdk.ugeno.viewpager.ViewPager, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (BaseSwiper.this.ABk) {
                try {
                    return super.onInterceptTouchEvent(motionEvent);
                } catch (Throwable unused) {
                    return false;
                }
            }
            return false;
        }

        @Override // com.bytedance.adsdk.ugeno.viewpager.ViewPager, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            try {
                return super.onTouchEvent(motionEvent);
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    public BaseSwiper(Context context) {
        super(context);
        this.Qhi = new CopyOnWriteArrayList();
        this.f7948ac = AdError.SERVER_ERROR_CODE;
        this.CJ = OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM;
        this.f7949fl = 10;
        this.Tgh = -1;
        this.ROR = -1;
        this.Sf = Constants.NORMAL;
        this.f7950hm = 1.0f;
        this.WAv = true;
        this.Gm = true;
        this.f7951zc = true;
        this.ABk = true;
        this.iMK = 0;
        this.pA = 0;
        this.hpZ = 0;
        this.MQ = new Runnable() { // from class: com.bytedance.adsdk.ugeno.swiper.BaseSwiper.1
            @Override // java.lang.Runnable
            public void run() {
                int currentItem = BaseSwiper.this.cJ.getCurrentItem() + 1;
                if (BaseSwiper.this.f7951zc) {
                    if (currentItem >= Integer.MAX_VALUE) {
                        BaseSwiper.this.cJ.Qhi(1073741823, false);
                    } else {
                        BaseSwiper.this.cJ.Qhi(currentItem, true);
                    }
                } else if (currentItem >= BaseSwiper.this.cJ.getAdapter().Qhi()) {
                    BaseSwiper.this.cJ.Qhi(0, false);
                } else {
                    BaseSwiper.this.cJ.Qhi(currentItem, true);
                }
            }
        };
        this.qMt = new Runnable() { // from class: com.bytedance.adsdk.ugeno.swiper.BaseSwiper.2
            @Override // java.lang.Runnable
            public void run() {
                if (BaseSwiper.this.Gm) {
                    int currentItem = BaseSwiper.this.cJ.getCurrentItem() + 1;
                    if (BaseSwiper.this.f7951zc) {
                        if (currentItem >= Integer.MAX_VALUE) {
                            BaseSwiper.this.cJ.Qhi(1073741823, false);
                        } else {
                            BaseSwiper.this.cJ.Qhi(currentItem, true);
                        }
                        BaseSwiper baseSwiper = BaseSwiper.this;
                        baseSwiper.postDelayed(baseSwiper.qMt, BaseSwiper.this.f7948ac);
                    } else if (currentItem >= BaseSwiper.this.cJ.getAdapter().Qhi()) {
                        BaseSwiper.this.cJ.Qhi(0, false);
                        BaseSwiper baseSwiper2 = BaseSwiper.this;
                        baseSwiper2.postDelayed(baseSwiper2.qMt, BaseSwiper.this.f7948ac);
                    } else {
                        BaseSwiper.this.cJ.Qhi(currentItem, true);
                        BaseSwiper baseSwiper3 = BaseSwiper.this;
                        baseSwiper3.postDelayed(baseSwiper3.qMt, BaseSwiper.this.f7948ac);
                    }
                }
            }
        };
        this.cJ = new cJ(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(this.cJ, layoutParams);
        DotIndicator dotIndicator = new DotIndicator(context);
        this.HzH = dotIndicator;
        addView(dotIndicator);
    }

    public abstract View ROR(int i10);

    @Override // com.bytedance.adsdk.ugeno.viewpager.ViewPager.fl
    public void Sf(int i10) {
        boolean z10;
        boolean z11;
        if (this.tP != null) {
            int Qhi2 = com.bytedance.adsdk.ugeno.swiper.cJ.Qhi(this.f7951zc, i10, this.Qhi.size());
            com.bytedance.adsdk.ugeno.swiper.Qhi qhi = this.tP;
            boolean z12 = this.f7951zc;
            if (Qhi2 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (Qhi2 == this.Qhi.size() - 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            qhi.Qhi(z12, Qhi2, i10, z10, z11);
        }
        if (this.WAv) {
            this.HzH.Qhi(i10);
        }
    }

    public void WAv(int i10) {
        Qhi(this.Sf, this.f7949fl, this.Tgh, this.ROR, true);
        if (this.kYc == null) {
            this.kYc = new Qhi();
            this.cJ.Qhi((ViewPager.fl) this);
            this.cJ.setAdapter(this.kYc);
        }
        if (this.f7951zc) {
            if (i10 >= Integer.MAX_VALUE) {
                this.cJ.Qhi(1073741823, false);
            } else {
                this.cJ.Qhi(i10, true);
            }
        } else if (i10 >= 0 && i10 < this.Qhi.size()) {
            this.cJ.Qhi(i10, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.Gm) {
            int action = motionEvent.getAction();
            if (action != 1 && action != 3 && action != 4) {
                if (action == 0) {
                    ac();
                }
            } else {
                cJ();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public com.bytedance.adsdk.ugeno.viewpager.cJ getAdapter() {
        return this.cJ.getAdapter();
    }

    public int getCurrentItem() {
        return this.cJ.getCurrentItem();
    }

    public ViewPager getViewPager() {
        return this.cJ;
    }

    public void setOnPageChangeListener(com.bytedance.adsdk.ugeno.swiper.Qhi qhi) {
        this.tP = qhi;
    }

    public BaseSwiper CJ(int i10) {
        this.f7949fl = i10;
        Qhi(this.Sf, i10, this.Tgh, this.ROR, true);
        return this;
    }

    public BaseSwiper Tgh(int i10) {
        this.ROR = i10;
        Qhi(this.Sf, this.f7949fl, this.Tgh, i10, true);
        return this;
    }

    public BaseSwiper ac(int i10) {
        this.HzH.setUnSelectedColor(i10);
        return this;
    }

    public BaseSwiper cJ(boolean z10) {
        this.WAv = z10;
        return this;
    }

    public BaseSwiper fl(int i10) {
        this.Tgh = i10;
        Qhi(this.Sf, this.f7949fl, i10, this.ROR, true);
        return this;
    }

    public BaseSwiper Qhi(boolean z10) {
        this.Gm = z10;
        cJ();
        return this;
    }

    public BaseSwiper ac(boolean z10) {
        this.HzH.setLoop(z10);
        if (this.f7951zc != z10) {
            int Qhi2 = com.bytedance.adsdk.ugeno.swiper.cJ.Qhi(z10, this.cJ.getCurrentItem(), this.Qhi.size());
            this.f7951zc = z10;
            Qhi qhi = this.kYc;
            if (qhi != null) {
                qhi.ac();
                this.cJ.setCurrentItem(Qhi2);
            }
        }
        return this;
    }

    public BaseSwiper cJ(int i10) {
        this.HzH.setSelectedColor(i10);
        return this;
    }

    public void cJ() {
        removeCallbacks(this.qMt);
        postDelayed(this.qMt, this.f7948ac);
    }

    public BaseSwiper Qhi(int i10) {
        this.f7948ac = i10;
        cJ();
        return this;
    }

    public BaseSwiper Qhi(float f10) {
        this.f7950hm = f10;
        return this;
    }

    public BaseSwiper Qhi(String str) {
        this.Sf = str;
        Qhi(str, this.f7949fl, this.Tgh, this.ROR, true);
        return this;
    }

    public void Qhi(String str, int i10, int i11, int i12, boolean z10) {
        Qhi qhi = this.kYc;
        if (qhi != null) {
            qhi.ac();
        }
        setClipChildren(false);
        this.cJ.setClipChildren(false);
        this.cJ.setPageMargin(i10);
        ViewGroup.LayoutParams layoutParams = this.cJ.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = i11 + i10;
            marginLayoutParams.rightMargin = i12 + i10;
            this.cJ.setLayoutParams(layoutParams);
        }
        if (TextUtils.equals(str, "linear")) {
            this.cJ.Qhi(false, (ViewPager.Tgh) new com.bytedance.adsdk.ugeno.swiper.Qhi.Qhi());
        } else {
            this.cJ.Qhi(false, (ViewPager.Tgh) null);
        }
        this.cJ.setOffscreenPageLimit((int) this.f7950hm);
    }

    public void ac() {
        removeCallbacks(this.qMt);
    }

    public void Qhi() {
        int i10;
        Qhi(this.Sf, this.f7949fl, this.Tgh, this.ROR, true);
        if (this.kYc == null) {
            this.kYc = new Qhi();
            this.cJ.Qhi((ViewPager.fl) this);
            this.cJ.setAdapter(this.kYc);
        }
        int i11 = this.iMK;
        if (i11 < 0 || i11 >= this.Qhi.size()) {
            this.iMK = 0;
        }
        if (this.f7951zc) {
            i10 = this.iMK + 1073741823;
        } else {
            i10 = this.iMK;
        }
        this.cJ.Qhi(i10, true);
        if (!this.f7951zc) {
            Sf(i10);
        }
        if (this.Gm) {
            cJ();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.viewpager.ViewPager.fl
    public void hm(int i10) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View Qhi(int i10, int i11) {
        if (this.Qhi.size() == 0) {
            return new View(getContext());
        }
        View ROR = ROR(i11);
        FrameLayout frameLayout = new FrameLayout(getContext());
        if (ROR instanceof ViewGroup) {
            frameLayout.setClipChildren(true);
        }
        if (ROR.getParent() instanceof ViewGroup) {
            ((ViewGroup) ROR.getParent()).removeView(ROR);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.addView(ROR, layoutParams);
        frameLayout.addView(new View(getContext()), new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    public BaseSwiper<T> Qhi(T t4) {
        if (t4 != null) {
            this.Qhi.add(t4);
            if (this.WAv) {
                this.HzH.cJ();
            }
        }
        Qhi qhi = this.kYc;
        if (qhi != null) {
            qhi.ac();
            this.HzH.Qhi(this.iMK, this.cJ.getCurrentItem());
        }
        return this;
    }

    @Override // com.bytedance.adsdk.ugeno.viewpager.ViewPager.fl
    public void Qhi(int i10, float f10, int i11) {
        if (this.tP != null) {
            com.bytedance.adsdk.ugeno.swiper.cJ.Qhi(this.f7951zc, i10, this.Qhi.size());
        }
    }
}
