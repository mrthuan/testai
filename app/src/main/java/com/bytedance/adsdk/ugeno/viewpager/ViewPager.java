package com.bytedance.adsdk.ugeno.viewpager;

import a6.h;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.appcompat.view.menu.d;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import lib.zj.office.fc.hslf.record.SlideAtom;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    private Scroller ABk;
    int CJ;
    private boolean CQU;
    private boolean Dq;
    private boolean Dww;
    private int EBS;
    private int Eh;
    private VelocityTracker FQ;
    private Parcelable Gm;
    private Tgh HLI;
    private boolean Hf;
    private Drawable HzH;
    private float Jma;
    private boolean MND;
    private float MQ;
    private int NBs;
    private boolean NFd;
    private int PAe;
    private EdgeEffect Qe;
    private int Qhi;
    private final ArrayList<cJ> ROR;
    private ArrayList<View> ReL;
    private final cJ Sf;
    private int VnT;
    private int WAv;
    private EdgeEffect YB;
    private boolean aP;

    /* renamed from: ac  reason: collision with root package name */
    com.bytedance.adsdk.ugeno.viewpager.cJ f7965ac;
    private int bxS;
    private boolean cjC;
    private List<fl> dI;
    private long dIT;
    private fl dVA;
    private float es;
    private final Runnable gga;

    /* renamed from: hm  reason: collision with root package name */
    private final Rect f7966hm;
    private int hpZ;
    private boolean iMK;

    /* renamed from: ip  reason: collision with root package name */
    private int f7967ip;
    private int jPH;
    private float js;
    private int kYc;
    private int lB;
    private int lG;
    private int oU;
    private List<Object> ots;
    private ROR pA;
    private boolean pM;
    private int pv;
    private float qMt;
    private int sDy;
    private int tP;
    private int xyz;
    private int yN;

    /* renamed from: zc  reason: collision with root package name */
    private ClassLoader f7968zc;
    private fl zjb;

    /* renamed from: zn  reason: collision with root package name */
    private float f7969zn;
    static final int[] cJ = {16842931};

    /* renamed from: fl  reason: collision with root package name */
    private static final Comparator<cJ> f7964fl = new Comparator<cJ>() { // from class: com.bytedance.adsdk.ugeno.viewpager.ViewPager.1
        @Override // java.util.Comparator
        /* renamed from: Qhi */
        public int compare(cJ cJVar, cJ cJVar2) {
            return cJVar.cJ - cJVar2.cJ;
        }
    };
    private static final Interpolator Tgh = new Interpolator() { // from class: com.bytedance.adsdk.ugeno.viewpager.ViewPager.2
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    };
    private static final hm EGK = new hm();

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface Qhi {
    }

    /* loaded from: classes.dex */
    public class ROR extends DataSetObserver {
        public ROR() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.cJ();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.cJ();
        }
    }

    /* loaded from: classes.dex */
    public static class Sf extends com.bytedance.adsdk.ugeno.viewpager.Qhi {
        public static final Parcelable.Creator<Sf> CREATOR = new Parcelable.ClassLoaderCreator<Sf>() { // from class: com.bytedance.adsdk.ugeno.viewpager.ViewPager.Sf.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: Qhi */
            public Sf createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new Sf(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: Qhi */
            public Sf createFromParcel(Parcel parcel) {
                return new Sf(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: Qhi */
            public Sf[] newArray(int i10) {
                return new Sf[i10];
            }
        };
        ClassLoader CJ;

        /* renamed from: ac  reason: collision with root package name */
        Parcelable f7970ac;
        int cJ;

        public Sf(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("FragmentPager.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" position=");
            return h.g(sb2, this.cJ, "}");
        }

        @Override // com.bytedance.adsdk.ugeno.viewpager.Qhi, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.cJ);
            parcel.writeParcelable(this.f7970ac, i10);
        }

        public Sf(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.cJ = parcel.readInt();
            this.f7970ac = parcel.readParcelable(classLoader);
            this.CJ = classLoader;
        }
    }

    /* loaded from: classes.dex */
    public interface Tgh {
        void Qhi(View view, float f10);
    }

    /* loaded from: classes.dex */
    public static class cJ {
        float CJ;
        Object Qhi;

        /* renamed from: ac  reason: collision with root package name */
        boolean f7973ac;
        int cJ;

        /* renamed from: fl  reason: collision with root package name */
        float f7974fl;
    }

    /* loaded from: classes.dex */
    public interface fl {
        void Qhi(int i10, float f10, int i11);

        void Sf(int i10);

        void hm(int i10);
    }

    /* loaded from: classes.dex */
    public static class hm implements Comparator<View> {
        @Override // java.util.Comparator
        /* renamed from: Qhi */
        public int compare(View view, View view2) {
            ac acVar = (ac) view.getLayoutParams();
            ac acVar2 = (ac) view2.getLayoutParams();
            boolean z10 = acVar.Qhi;
            if (z10 != acVar2.Qhi) {
                if (z10) {
                    return 1;
                }
                return -1;
            }
            return acVar.f7972fl - acVar2.f7972fl;
        }
    }

    public ViewPager(Context context) {
        super(context);
        this.ROR = new ArrayList<>();
        this.Sf = new cJ();
        this.f7966hm = new Rect();
        this.WAv = -1;
        this.Gm = null;
        this.f7968zc = null;
        this.MQ = -3.4028235E38f;
        this.qMt = Float.MAX_VALUE;
        this.Eh = 1;
        this.yN = -1;
        this.cjC = true;
        this.Dq = false;
        this.gga = new Runnable() { // from class: com.bytedance.adsdk.ugeno.viewpager.ViewPager.3
            @Override // java.lang.Runnable
            public void run() {
                ViewPager.this.setScrollState(0);
                ViewPager.this.ac();
            }
        };
        this.VnT = 0;
        Qhi();
    }

    private void ABk() {
        this.aP = false;
        this.NFd = false;
        VelocityTracker velocityTracker = this.FQ;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.FQ = null;
        }
    }

    private boolean CJ(int i10) {
        if (this.ROR.size() == 0) {
            if (this.cjC) {
                return false;
            }
            this.Hf = false;
            Qhi(0, 0.0f, 0);
            if (this.Hf) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        cJ zc2 = zc();
        int clientWidth = getClientWidth();
        int i11 = this.hpZ;
        int i12 = clientWidth + i11;
        float f10 = clientWidth;
        int i13 = zc2.cJ;
        float f11 = ((i10 / f10) - zc2.f7974fl) / (zc2.CJ + (i11 / f10));
        this.Hf = false;
        Qhi(i13, f11, (int) (i12 * f11));
        if (this.Hf) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean Gm() {
        this.yN = -1;
        ABk();
        this.Qe.onRelease();
        this.YB.onRelease();
        if (!this.Qe.isFinished() && !this.YB.isFinished()) {
            return false;
        }
        return true;
    }

    private void Tgh(int i10) {
        fl flVar = this.dVA;
        if (flVar != null) {
            flVar.hm(i10);
        }
        List<fl> list = this.dI;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                fl flVar2 = this.dI.get(i11);
                if (flVar2 != null) {
                    flVar2.hm(i10);
                }
            }
        }
        fl flVar3 = this.zjb;
        if (flVar3 != null) {
            flVar3.hm(i10);
        }
    }

    private void WAv() {
        if (this.pv != 0) {
            ArrayList<View> arrayList = this.ReL;
            if (arrayList == null) {
                this.ReL = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.ReL.add(getChildAt(i10));
            }
            Collections.sort(this.ReL, EGK);
        }
    }

    private void fl(int i10) {
        fl flVar = this.dVA;
        if (flVar != null) {
            flVar.Sf(i10);
        }
        List<fl> list = this.dI;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                fl flVar2 = this.dI.get(i11);
                if (flVar2 != null) {
                    flVar2.Sf(i10);
                }
            }
        }
        fl flVar3 = this.zjb;
        if (flVar3 != null) {
            flVar3.Sf(i10);
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void hm() {
        int i10 = 0;
        while (i10 < getChildCount()) {
            if (!((ac) getChildAt(i10).getLayoutParams()).Qhi) {
                removeViewAt(i10);
                i10--;
            }
            i10++;
        }
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.CQU != z10) {
            this.CQU = z10;
        }
    }

    private cJ zc() {
        float f10;
        float f11;
        int i10;
        int clientWidth = getClientWidth();
        float f12 = 0.0f;
        if (clientWidth > 0) {
            f10 = getScrollX() / clientWidth;
        } else {
            f10 = 0.0f;
        }
        if (clientWidth > 0) {
            f11 = this.hpZ / clientWidth;
        } else {
            f11 = 0.0f;
        }
        int i11 = 0;
        boolean z10 = true;
        cJ cJVar = null;
        int i12 = -1;
        float f13 = 0.0f;
        while (i11 < this.ROR.size()) {
            cJ cJVar2 = this.ROR.get(i11);
            if (!z10 && cJVar2.cJ != (i10 = i12 + 1)) {
                cJVar2 = this.Sf;
                cJVar2.f7974fl = f12 + f13 + f11;
                cJVar2.cJ = i10;
                cJVar2.CJ = this.f7965ac.Qhi(i10);
                i11--;
            }
            cJ cJVar3 = cJVar2;
            f12 = cJVar3.f7974fl;
            float f14 = cJVar3.CJ + f12 + f11;
            if (!z10 && f10 < f12) {
                return cJVar;
            }
            if (f10 >= f14 && i11 != this.ROR.size() - 1) {
                int i13 = cJVar3.cJ;
                float f15 = cJVar3.CJ;
                i11++;
                z10 = false;
                i12 = i13;
                f13 = f15;
                cJVar = cJVar3;
            } else {
                return cJVar3;
            }
        }
        return cJVar;
    }

    public void Qhi() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.ABk = new Scroller(context, Tgh);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.lG = viewConfiguration.getScaledPagingTouchSlop();
        this.PAe = (int) (400.0f * f10);
        this.f7967ip = viewConfiguration.getScaledMaximumFlingVelocity();
        this.Qe = new EdgeEffect(context);
        this.YB = new EdgeEffect(context);
        this.xyz = (int) (25.0f * f10);
        this.jPH = (int) (2.0f * f10);
        this.sDy = (int) (f10 * 16.0f);
    }

    public boolean ROR() {
        int i10 = this.CJ;
        if (i10 > 0) {
            Qhi(i10 - 1, true);
            return true;
        }
        return false;
    }

    public boolean Sf() {
        com.bytedance.adsdk.ugeno.viewpager.cJ cJVar = this.f7965ac;
        if (cJVar != null && this.CJ < cJVar.Qhi() - 1) {
            Qhi(this.CJ + 1, true);
            return true;
        }
        return false;
    }

    public void ac() {
        Qhi(this.CJ);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        cJ Qhi2;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (Qhi2 = Qhi(childAt)) != null && Qhi2.cJ == this.CJ) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
            return;
        }
        arrayList.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        cJ Qhi2;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (Qhi2 = Qhi(childAt)) != null && Qhi2.cJ == this.CJ) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        ac acVar = (ac) layoutParams;
        boolean ac2 = acVar.Qhi | ac(view);
        acVar.Qhi = ac2;
        if (this.Dww) {
            if (!ac2) {
                acVar.CJ = true;
                addViewInLayout(view, i10, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, i10, layoutParams);
    }

    public void cJ() {
        int Qhi2 = this.f7965ac.Qhi();
        this.Qhi = Qhi2;
        boolean z10 = this.ROR.size() < (this.Eh * 2) + 1 && this.ROR.size() < Qhi2;
        int i10 = this.CJ;
        int i11 = 0;
        while (i11 < this.ROR.size()) {
            cJ cJVar = this.ROR.get(i11);
            int Qhi3 = this.f7965ac.Qhi(cJVar.Qhi);
            if (Qhi3 != -1) {
                if (Qhi3 == -2) {
                    this.ROR.remove(i11);
                    i11--;
                    this.f7965ac.Qhi((ViewGroup) this, cJVar.cJ, cJVar.Qhi);
                    int i12 = this.CJ;
                    if (i12 == cJVar.cJ) {
                        i10 = Math.max(0, Math.min(i12, Qhi2 - 1));
                    }
                } else {
                    int i13 = cJVar.cJ;
                    if (i13 != Qhi3) {
                        if (i13 == this.CJ) {
                            i10 = Qhi3;
                        }
                        cJVar.cJ = Qhi3;
                    }
                }
                z10 = true;
            }
            i11++;
        }
        Collections.sort(this.ROR, f7964fl);
        if (z10) {
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                ac acVar = (ac) getChildAt(i14).getLayoutParams();
                if (!acVar.Qhi) {
                    acVar.f7971ac = 0.0f;
                }
            }
            Qhi(i10, false, true);
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        if (this.f7965ac == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i10 < 0) {
            if (scrollX <= ((int) (clientWidth * this.MQ))) {
                return false;
            }
            return true;
        } else if (i10 <= 0 || scrollX >= ((int) (clientWidth * this.qMt))) {
            return false;
        } else {
            return true;
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof ac) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void computeScroll() {
        this.iMK = true;
        if (!this.ABk.isFinished() && this.ABk.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.ABk.getCurrX();
            int currY = this.ABk.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!CJ(currX)) {
                    this.ABk.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            postInvalidateOnAnimation();
            return;
        }
        Qhi(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !Qhi(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        cJ Qhi2;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (Qhi2 = Qhi(childAt)) != null && Qhi2.cJ == this.CJ && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        com.bytedance.adsdk.ugeno.viewpager.cJ cJVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z10 = false;
        if (overScrollMode != 0 && (overScrollMode != 1 || (cJVar = this.f7965ac) == null || cJVar.Qhi() <= 1)) {
            this.Qe.finish();
            this.YB.finish();
        } else {
            if (!this.Qe.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.MQ * width);
                this.Qe.setSize(height, width);
                z10 = false | this.Qe.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.YB.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.qMt + 1.0f)) * width2);
                this.YB.setSize(height2, width2);
                z10 |= this.YB.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
        if (z10) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.HzH;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ac();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public com.bytedance.adsdk.ugeno.viewpager.cJ getAdapter() {
        return this.f7965ac;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        if (this.pv == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((ac) this.ReL.get(i11).getLayoutParams()).Tgh;
    }

    public int getCurrentItem() {
        return this.CJ;
    }

    public int getOffscreenPageLimit() {
        return this.Eh;
    }

    public int getPageMargin() {
        return this.hpZ;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.cjC = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.gga);
        Scroller scroller = this.ABk;
        if (scroller != null && !scroller.isFinished()) {
            this.ABk.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        int i10;
        float f10;
        float f11;
        super.onDraw(canvas);
        if (this.hpZ > 0 && this.HzH != null && this.ROR.size() > 0 && this.f7965ac != null) {
            int scrollX = getScrollX();
            float width2 = getWidth();
            float f12 = this.hpZ / width2;
            int i11 = 0;
            cJ cJVar = this.ROR.get(0);
            float f13 = cJVar.f7974fl;
            int size = this.ROR.size();
            int i12 = cJVar.cJ;
            int i13 = this.ROR.get(size - 1).cJ;
            while (i12 < i13) {
                while (true) {
                    i10 = cJVar.cJ;
                    if (i12 <= i10 || i11 >= size) {
                        break;
                    }
                    i11++;
                    cJVar = this.ROR.get(i11);
                }
                if (i12 == i10) {
                    float f14 = cJVar.f7974fl;
                    float f15 = cJVar.CJ;
                    f10 = (f14 + f15) * width2;
                    f13 = f14 + f15 + f12;
                } else {
                    float Qhi2 = this.f7965ac.Qhi(i12);
                    f10 = (f13 + Qhi2) * width2;
                    f13 = Qhi2 + f12 + f13;
                }
                if (this.hpZ + f10 > scrollX) {
                    f11 = f12;
                    this.HzH.setBounds(Math.round(f10), this.kYc, Math.round(this.hpZ + f10), this.tP);
                    this.HzH.draw(canvas);
                } else {
                    f11 = f12;
                }
                if (f10 <= scrollX + width) {
                    i12++;
                    f12 = f11;
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        float f10;
        int action = motionEvent.getAction() & FunctionEval.FunctionID.EXTERNAL_FUNC;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.aP) {
                    return true;
                }
                if (this.NFd) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        Qhi(motionEvent);
                    }
                } else {
                    int i10 = this.yN;
                    if (i10 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i10)) != -1) {
                        float x4 = motionEvent.getX(findPointerIndex);
                        float f11 = x4 - this.Jma;
                        float abs = Math.abs(f11);
                        float y10 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y10 - this.es);
                        int i11 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
                        if (i11 != 0 && !Qhi(this.Jma, f11) && Qhi(this, false, (int) f11, (int) x4, (int) y10)) {
                            this.Jma = x4;
                            this.js = y10;
                            this.NFd = true;
                            return false;
                        }
                        int i12 = this.lG;
                        if (abs > i12 && abs * 0.5f > abs2) {
                            this.aP = true;
                            ac(true);
                            setScrollState(1);
                            float f12 = this.f7969zn;
                            float f13 = this.lG;
                            if (i11 > 0) {
                                f10 = f12 + f13;
                            } else {
                                f10 = f12 - f13;
                            }
                            this.Jma = f10;
                            this.js = y10;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > i12) {
                            this.NFd = true;
                        }
                        if (this.aP && ac(x4)) {
                            postInvalidateOnAnimation();
                        }
                    }
                }
            } else {
                float x10 = motionEvent.getX();
                this.f7969zn = x10;
                this.Jma = x10;
                float y11 = motionEvent.getY();
                this.es = y11;
                this.js = y11;
                this.yN = motionEvent.getPointerId(0);
                this.NFd = false;
                this.iMK = true;
                this.ABk.computeScrollOffset();
                if (this.VnT == 2 && Math.abs(this.ABk.getFinalX() - this.ABk.getCurrX()) > this.jPH) {
                    this.ABk.abortAnimation();
                    this.pM = false;
                    ac();
                    this.aP = true;
                    ac(true);
                    setScrollState(1);
                } else {
                    Qhi(false);
                    this.aP = false;
                }
            }
            if (this.FQ == null) {
                this.FQ = VelocityTracker.obtain();
            }
            this.FQ.addMovement(motionEvent);
            return this.aP;
        }
        Gm();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.viewpager.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        ac acVar;
        ac acVar2;
        boolean z10;
        int i12;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.lB = Math.min(measuredWidth / 10, this.sDy);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z11 = true;
            int i14 = 1073741824;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && (acVar2 = (ac) childAt.getLayoutParams()) != null && acVar2.Qhi) {
                int i15 = acVar2.cJ;
                int i16 = i15 & 7;
                int i17 = i15 & 112;
                if (i17 != 48 && i17 != 80) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (i16 != 3 && i16 != 5) {
                    z11 = false;
                }
                int i18 = SlideAtom.USES_MASTER_SLIDE_ID;
                if (z10) {
                    i12 = Integer.MIN_VALUE;
                    i18 = 1073741824;
                } else if (z11) {
                    i12 = 1073741824;
                } else {
                    i12 = Integer.MIN_VALUE;
                }
                int i19 = ((ViewGroup.LayoutParams) acVar2).width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = paddingLeft;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = paddingLeft;
                }
                int i20 = ((ViewGroup.LayoutParams) acVar2).height;
                if (i20 != -2) {
                    if (i20 == -1) {
                        i20 = measuredHeight;
                    }
                } else {
                    i20 = measuredHeight;
                    i14 = i12;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z10) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z11) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        this.EBS = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.bxS = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.Dww = true;
        ac();
        this.Dww = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((acVar = (ac) childAt2.getLayoutParams()) == null || !acVar.Qhi)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * acVar.f7971ac), 1073741824), this.bxS);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        cJ Qhi2;
        int childCount = getChildCount();
        if ((i10 & 2) != 0) {
            i12 = childCount;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (Qhi2 = Qhi(childAt)) != null && Qhi2.cJ == this.CJ && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i13;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Sf)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Sf sf2 = (Sf) parcelable;
        super.onRestoreInstanceState(sf2.Qhi());
        if (this.f7965ac != null) {
            Qhi(sf2.cJ, false, true);
            return;
        }
        this.WAv = sf2.cJ;
        this.Gm = sf2.f7970ac;
        this.f7968zc = sf2.CJ;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Sf sf2 = new Sf(super.onSaveInstanceState());
        sf2.cJ = this.CJ;
        com.bytedance.adsdk.ugeno.viewpager.cJ cJVar = this.f7965ac;
        if (cJVar != null) {
            sf2.f7970ac = cJVar.cJ();
        }
        return sf2;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.hpZ;
            Qhi(i10, i12, i14, i14);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.bytedance.adsdk.ugeno.viewpager.cJ cJVar;
        int findPointerIndex;
        float f10;
        if (this.MND) {
            return true;
        }
        boolean z10 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (cJVar = this.f7965ac) == null || cJVar.Qhi() == 0) {
            return false;
        }
        if (this.FQ == null) {
            this.FQ = VelocityTracker.obtain();
        }
        this.FQ.addMovement(motionEvent);
        int action = motionEvent.getAction() & FunctionEval.FunctionID.EXTERNAL_FUNC;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6) {
                                Qhi(motionEvent);
                                int findPointerIndex2 = motionEvent.findPointerIndex(this.yN);
                                if (findPointerIndex2 != -1) {
                                    this.Jma = motionEvent.getX(findPointerIndex2);
                                }
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            if (actionIndex != -1) {
                                this.Jma = motionEvent.getX(actionIndex);
                                this.yN = motionEvent.getPointerId(actionIndex);
                            }
                        }
                    } else if (this.aP) {
                        Qhi(this.CJ, true, 0, false);
                        z10 = Gm();
                    }
                } else {
                    if (!this.aP) {
                        int findPointerIndex3 = motionEvent.findPointerIndex(this.yN);
                        if (findPointerIndex3 == -1) {
                            z10 = Gm();
                        } else {
                            float x4 = motionEvent.getX(findPointerIndex3);
                            float abs = Math.abs(x4 - this.Jma);
                            float y10 = motionEvent.getY(findPointerIndex3);
                            float abs2 = Math.abs(y10 - this.js);
                            if (abs > this.lG && abs > abs2) {
                                this.aP = true;
                                ac(true);
                                float f11 = this.f7969zn;
                                if (x4 - f11 > 0.0f) {
                                    f10 = f11 + this.lG;
                                } else {
                                    f10 = f11 - this.lG;
                                }
                                this.Jma = f10;
                                this.js = y10;
                                setScrollState(1);
                                setScrollingCacheEnabled(true);
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                    if (this.aP && (findPointerIndex = motionEvent.findPointerIndex(this.yN)) != -1) {
                        z10 = false | ac(motionEvent.getX(findPointerIndex));
                    }
                }
            } else if (this.aP) {
                VelocityTracker velocityTracker = this.FQ;
                velocityTracker.computeCurrentVelocity(1000, this.f7967ip);
                int xVelocity = (int) velocityTracker.getXVelocity(this.yN);
                this.pM = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                cJ zc2 = zc();
                float f12 = clientWidth;
                int i10 = zc2.cJ;
                float f13 = ((scrollX / f12) - zc2.f7974fl) / (zc2.CJ + (this.hpZ / f12));
                int findPointerIndex4 = motionEvent.findPointerIndex(this.yN);
                if (findPointerIndex4 != -1) {
                    Qhi(Qhi(i10, f13, xVelocity, (int) (motionEvent.getX(findPointerIndex4) - this.f7969zn)), true, true, xVelocity);
                    z10 = Gm();
                }
            }
        } else {
            this.ABk.abortAnimation();
            this.pM = false;
            ac();
            float x10 = motionEvent.getX();
            this.f7969zn = x10;
            this.Jma = x10;
            float y11 = motionEvent.getY();
            this.es = y11;
            this.js = y11;
            this.yN = motionEvent.getPointerId(0);
        }
        if (z10) {
            postInvalidateOnAnimation();
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.Dww) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(com.bytedance.adsdk.ugeno.viewpager.cJ cJVar) {
        com.bytedance.adsdk.ugeno.viewpager.cJ cJVar2 = this.f7965ac;
        if (cJVar2 != null) {
            cJVar2.Qhi((DataSetObserver) null);
            for (int i10 = 0; i10 < this.ROR.size(); i10++) {
                cJ cJVar3 = this.ROR.get(i10);
                this.f7965ac.Qhi((ViewGroup) this, cJVar3.cJ, cJVar3.Qhi);
            }
            this.ROR.clear();
            hm();
            this.CJ = 0;
            scrollTo(0, 0);
        }
        this.f7965ac = cJVar;
        this.Qhi = 0;
        if (cJVar != null) {
            if (this.pA == null) {
                this.pA = new ROR();
            }
            this.f7965ac.Qhi((DataSetObserver) this.pA);
            this.pM = false;
            boolean z10 = this.cjC;
            this.cjC = true;
            this.Qhi = this.f7965ac.Qhi();
            int i11 = this.WAv;
            if (i11 >= 0) {
                Qhi(i11, false, true);
                this.WAv = -1;
                this.Gm = null;
                this.f7968zc = null;
            } else if (!z10) {
                ac();
            } else {
                requestLayout();
            }
        }
        List<Object> list = this.ots;
        if (list != null && !list.isEmpty()) {
            int size = this.ots.size();
            for (int i12 = 0; i12 < size; i12++) {
                this.ots.get(i12);
            }
        }
    }

    public void setCurrentItem(int i10) {
        this.pM = false;
        Qhi(i10, !this.cjC, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 <= 0) {
            i10 = 1;
        }
        if (i10 != this.Eh) {
            this.Eh = i10;
            ac();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(fl flVar) {
        this.dVA = flVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.hpZ;
        this.hpZ = i10;
        int width = getWidth();
        Qhi(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.HzH = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i10) {
        boolean z10;
        if (this.VnT == i10) {
            return;
        }
        this.VnT = i10;
        if (this.HLI != null) {
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            cJ(z10);
        }
        Tgh(i10);
    }

    public void setScroller(Scroller scroller) {
        this.ABk = scroller;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.HzH) {
            return false;
        }
        return true;
    }

    /* loaded from: classes.dex */
    public static class ac extends ViewGroup.LayoutParams {
        boolean CJ;
        public boolean Qhi;
        int Tgh;

        /* renamed from: ac  reason: collision with root package name */
        float f7971ac;
        public int cJ;

        /* renamed from: fl  reason: collision with root package name */
        int f7972fl;

        public ac() {
            super(-1, -1);
            this.f7971ac = 0.0f;
        }

        public ac(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f7971ac = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.cJ);
            this.cJ = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    private static boolean ac(View view) {
        return view.getClass().getAnnotation(Qhi.class) != null;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ac(getContext(), attributeSet);
    }

    private void ac(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i10));
    }

    private boolean ac(float f10) {
        boolean z10;
        boolean z11;
        float f11 = this.Jma - f10;
        this.Jma = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.MQ * clientWidth;
        float f13 = this.qMt * clientWidth;
        boolean z12 = false;
        cJ cJVar = this.ROR.get(0);
        cJ cJVar2 = (cJ) d.b(this.ROR, 1);
        if (cJVar.cJ != 0) {
            f12 = cJVar.f7974fl * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (cJVar2.cJ != this.f7965ac.Qhi() - 1) {
            f13 = cJVar2.f7974fl * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f12) {
            if (z10) {
                this.Qe.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z11) {
                this.YB.onPull(Math.abs(scrollX - f13) / clientWidth);
                z12 = true;
            }
            scrollX = f13;
        }
        int i10 = (int) scrollX;
        this.Jma = (scrollX - i10) + this.Jma;
        scrollTo(i10, getScrollY());
        CJ(i10);
        return z12;
    }

    public boolean Tgh() {
        return this.MND;
    }

    public void fl() {
        if (this.MND) {
            if (this.f7965ac != null) {
                VelocityTracker velocityTracker = this.FQ;
                velocityTracker.computeCurrentVelocity(1000, this.f7967ip);
                int xVelocity = (int) velocityTracker.getXVelocity(this.yN);
                this.pM = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                cJ zc2 = zc();
                Qhi(Qhi(zc2.cJ, ((scrollX / clientWidth) - zc2.f7974fl) / zc2.CJ, xVelocity, (int) (this.Jma - this.f7969zn)), true, true, xVelocity);
            }
            ABk();
            this.MND = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    public boolean CJ() {
        if (this.aP) {
            return false;
        }
        this.MND = true;
        setScrollState(1);
        this.Jma = 0.0f;
        this.f7969zn = 0.0f;
        VelocityTracker velocityTracker = this.FQ;
        if (velocityTracker == null) {
            this.FQ = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.FQ.addMovement(obtain);
        obtain.recycle();
        this.dIT = uptimeMillis;
        return true;
    }

    public void Qhi(int i10, boolean z10) {
        this.pM = false;
        Qhi(i10, z10, false);
    }

    public void Qhi(int i10, boolean z10, boolean z11) {
        Qhi(i10, z10, z11, 0);
    }

    public void Qhi(int i10, boolean z10, boolean z11, int i11) {
        com.bytedance.adsdk.ugeno.viewpager.cJ cJVar = this.f7965ac;
        if (cJVar != null && cJVar.Qhi() > 0) {
            if (!z11 && this.CJ == i10 && this.ROR.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i10 < 0) {
                i10 = 0;
            } else if (i10 >= this.f7965ac.Qhi()) {
                i10 = this.f7965ac.Qhi() - 1;
            }
            int i12 = this.Eh;
            int i13 = this.CJ;
            if (i10 > i13 + i12 || i10 < i13 - i12) {
                for (int i14 = 0; i14 < this.ROR.size(); i14++) {
                    this.ROR.get(i14).f7973ac = true;
                }
            }
            boolean z12 = this.CJ != i10;
            if (this.cjC) {
                this.CJ = i10;
                if (z12) {
                    fl(i10);
                }
                requestLayout();
                return;
            }
            Qhi(i10);
            Qhi(i10, z10, i11, z12);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    public cJ cJ(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return Qhi(view);
            }
        }
    }

    public cJ cJ(int i10) {
        for (int i11 = 0; i11 < this.ROR.size(); i11++) {
            cJ cJVar = this.ROR.get(i11);
            if (cJVar.cJ == i10) {
                return cJVar;
            }
        }
        return null;
    }

    private void cJ(int i10, float f10, int i11) {
        fl flVar = this.dVA;
        if (flVar != null) {
            flVar.Qhi(i10, f10, i11);
        }
        List<fl> list = this.dI;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                fl flVar2 = this.dI.get(i12);
                if (flVar2 != null) {
                    flVar2.Qhi(i10, f10, i11);
                }
            }
        }
        fl flVar3 = this.zjb;
        if (flVar3 != null) {
            flVar3.Qhi(i10, f10, i11);
        }
    }

    private void Qhi(int i10, boolean z10, int i11, boolean z11) {
        int i12;
        cJ cJ2 = cJ(i10);
        if (cJ2 != null) {
            i12 = (int) (Math.max(this.MQ, Math.min(cJ2.f7974fl, this.qMt)) * getClientWidth());
        } else {
            i12 = 0;
        }
        if (z10) {
            Qhi(i12, 0, i11);
            if (z11) {
                fl(i10);
                return;
            }
            return;
        }
        if (z11) {
            fl(i10);
        }
        Qhi(false);
        scrollTo(i12, 0);
        CJ(i12);
    }

    private void cJ(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setLayerType(z10 ? this.oU : 0, null);
        }
    }

    public void cJ(float f10) {
        ArrayList<cJ> arrayList;
        if (this.MND) {
            if (this.f7965ac == null) {
                return;
            }
            this.Jma += f10;
            float scrollX = getScrollX() - f10;
            float clientWidth = getClientWidth();
            float f11 = this.MQ * clientWidth;
            float f12 = this.qMt * clientWidth;
            cJ cJVar = this.ROR.get(0);
            cJ cJVar2 = this.ROR.get(arrayList.size() - 1);
            if (cJVar.cJ != 0) {
                f11 = cJVar.f7974fl * clientWidth;
            }
            if (cJVar2.cJ != this.f7965ac.Qhi() - 1) {
                f12 = cJVar2.f7974fl * clientWidth;
            }
            if (scrollX < f11) {
                scrollX = f11;
            } else if (scrollX > f12) {
                scrollX = f12;
            }
            int i10 = (int) scrollX;
            this.Jma = (scrollX - i10) + this.Jma;
            scrollTo(i10, getScrollY());
            CJ(i10);
            MotionEvent obtain = MotionEvent.obtain(this.dIT, SystemClock.uptimeMillis(), 2, this.Jma, 0.0f, 0);
            this.FQ.addMovement(obtain);
            obtain.recycle();
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    public void Qhi(fl flVar) {
        if (this.dI == null) {
            this.dI = new ArrayList();
        }
        this.dI.add(flVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0094, code lost:
        if (r7 != 2) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean ac(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto Lb
        L9:
            r0 = r3
            goto L41
        Lb:
            if (r0 == 0) goto L41
            android.view.ViewParent r4 = r0.getParent()
        L11:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L1e
            if (r4 != r6) goto L19
            r4 = r1
            goto L1f
        L19:
            android.view.ViewParent r4 = r4.getParent()
            goto L11
        L1e:
            r4 = r2
        L1f:
            if (r4 != 0) goto L41
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L35:
            boolean r4 = r0 instanceof android.view.ViewGroup
            if (r4 == 0) goto L9
            r0.getClass()
            android.view.ViewParent r0 = r0.getParent()
            goto L35
        L41:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto L8c
            if (r3 == r0) goto L8c
            if (r7 != r5) goto L71
            android.graphics.Rect r1 = r6.f7966hm
            android.graphics.Rect r1 = r6.Qhi(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f7966hm
            android.graphics.Rect r2 = r6.Qhi(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L6c
            if (r1 < r2) goto L6c
            boolean r2 = r6.ROR()
            goto L9f
        L6c:
            boolean r2 = r3.requestFocus()
            goto L9f
        L71:
            if (r7 != r4) goto L9f
            android.graphics.Rect r1 = r6.f7966hm
            android.graphics.Rect r1 = r6.Qhi(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f7966hm
            android.graphics.Rect r2 = r6.Qhi(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L87
            if (r1 <= r2) goto L96
        L87:
            boolean r2 = r3.requestFocus()
            goto L9f
        L8c:
            if (r7 == r5) goto L9b
            if (r7 != r1) goto L91
            goto L9b
        L91:
            if (r7 == r4) goto L96
            r0 = 2
            if (r7 != r0) goto L9f
        L96:
            boolean r2 = r6.Sf()
            goto L9f
        L9b:
            boolean r2 = r6.ROR()
        L9f:
            if (r2 == 0) goto La8
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        La8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.viewpager.ViewPager.ac(int):boolean");
    }

    public void Qhi(boolean z10, Tgh tgh) {
        Qhi(z10, tgh, 2);
    }

    public void Qhi(boolean z10, Tgh tgh, int i10) {
        boolean z11 = tgh != null;
        boolean z12 = z11 != (this.HLI != null);
        this.HLI = tgh;
        setChildrenDrawingOrderEnabled(z11);
        if (z11) {
            this.pv = z10 ? 2 : 1;
            this.oU = i10;
        } else {
            this.pv = 0;
        }
        if (z12) {
            ac();
        }
    }

    public float Qhi(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    public void Qhi(int i10, int i11, int i12) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.ABk;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.iMK ? this.ABk.getCurrX() : this.ABk.getStartX();
            this.ABk.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i13 = scrollX;
        int scrollY = getScrollY();
        int i14 = i10 - i13;
        int i15 = i11 - scrollY;
        if (i14 == 0 && i15 == 0) {
            Qhi(false);
            ac();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i16 = clientWidth / 2;
        float f10 = clientWidth;
        float f11 = i16;
        float Qhi2 = (Qhi(Math.min(1.0f, (Math.abs(i14) * 1.0f) / f10)) * f11) + f11;
        int abs2 = Math.abs(i12);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(Qhi2 / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i14) / ((this.f7965ac.Qhi(this.CJ) * f10) + this.hpZ)) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, (int) OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD);
        this.iMK = false;
        this.ABk.startScroll(i13, scrollY, i14, i15, min);
        postInvalidateOnAnimation();
    }

    public cJ Qhi(int i10, int i11) {
        cJ cJVar = new cJ();
        cJVar.cJ = i10;
        cJVar.Qhi = this.f7965ac.Qhi((ViewGroup) this, i10);
        cJVar.CJ = this.f7965ac.Qhi(i10);
        if (i11 >= 0 && i11 < this.ROR.size()) {
            this.ROR.add(i11, cJVar);
        } else {
            this.ROR.add(cJVar);
        }
        return cJVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
        if (r9 == r10) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Qhi(int r18) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.viewpager.ViewPager.Qhi(int):void");
    }

    private void Qhi(cJ cJVar, int i10, cJ cJVar2) {
        int i11;
        int i12;
        cJ cJVar3;
        cJ cJVar4;
        int Qhi2 = this.f7965ac.Qhi();
        int clientWidth = getClientWidth();
        float f10 = clientWidth > 0 ? this.hpZ / clientWidth : 0.0f;
        if (cJVar2 != null) {
            int i13 = cJVar2.cJ;
            int i14 = cJVar.cJ;
            if (i13 < i14) {
                float f11 = cJVar2.f7974fl + cJVar2.CJ + f10;
                int i15 = i13 + 1;
                int i16 = 0;
                while (i15 <= cJVar.cJ && i16 < this.ROR.size()) {
                    cJ cJVar5 = this.ROR.get(i16);
                    while (true) {
                        cJVar4 = cJVar5;
                        if (i15 <= cJVar4.cJ || i16 >= this.ROR.size() - 1) {
                            break;
                        }
                        i16++;
                        cJVar5 = this.ROR.get(i16);
                    }
                    while (i15 < cJVar4.cJ) {
                        f11 += this.f7965ac.Qhi(i15) + f10;
                        i15++;
                    }
                    cJVar4.f7974fl = f11;
                    f11 += cJVar4.CJ + f10;
                    i15++;
                }
            } else if (i13 > i14) {
                int size = this.ROR.size() - 1;
                float f12 = cJVar2.f7974fl;
                while (true) {
                    i13--;
                    if (i13 < cJVar.cJ || size < 0) {
                        break;
                    }
                    cJ cJVar6 = this.ROR.get(size);
                    while (true) {
                        cJVar3 = cJVar6;
                        if (i13 >= cJVar3.cJ || size <= 0) {
                            break;
                        }
                        size--;
                        cJVar6 = this.ROR.get(size);
                    }
                    while (i13 > cJVar3.cJ) {
                        f12 -= this.f7965ac.Qhi(i13) + f10;
                        i13--;
                    }
                    f12 -= cJVar3.CJ + f10;
                    cJVar3.f7974fl = f12;
                }
            }
        }
        int size2 = this.ROR.size();
        float f13 = cJVar.f7974fl;
        int i17 = cJVar.cJ;
        int i18 = i17 - 1;
        this.MQ = i17 == 0 ? f13 : -3.4028235E38f;
        int i19 = Qhi2 - 1;
        this.qMt = i17 == i19 ? (cJVar.CJ + f13) - 1.0f : Float.MAX_VALUE;
        int i20 = i10 - 1;
        while (i20 >= 0) {
            cJ cJVar7 = this.ROR.get(i20);
            while (true) {
                i12 = cJVar7.cJ;
                if (i18 <= i12) {
                    break;
                }
                f13 -= this.f7965ac.Qhi(i18) + f10;
                i18--;
            }
            f13 -= cJVar7.CJ + f10;
            cJVar7.f7974fl = f13;
            if (i12 == 0) {
                this.MQ = f13;
            }
            i20--;
            i18--;
        }
        float f14 = cJVar.f7974fl + cJVar.CJ + f10;
        int i21 = cJVar.cJ + 1;
        int i22 = i10 + 1;
        while (i22 < size2) {
            cJ cJVar8 = this.ROR.get(i22);
            while (true) {
                i11 = cJVar8.cJ;
                if (i21 >= i11) {
                    break;
                }
                f14 += this.f7965ac.Qhi(i21) + f10;
                i21++;
            }
            if (i11 == i19) {
                this.qMt = (cJVar8.CJ + f14) - 1.0f;
            }
            cJVar8.f7974fl = f14;
            f14 += cJVar8.CJ + f10;
            i22++;
            i21++;
        }
        this.Dq = false;
    }

    public cJ Qhi(View view) {
        for (int i10 = 0; i10 < this.ROR.size(); i10++) {
            cJ cJVar = this.ROR.get(i10);
            if (this.f7965ac.Qhi(view, cJVar.Qhi)) {
                return cJVar;
            }
        }
        return null;
    }

    private void Qhi(int i10, int i11, int i12, int i13) {
        if (i11 > 0 && !this.ROR.isEmpty()) {
            if (!this.ABk.isFinished()) {
                this.ABk.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
                return;
            }
        }
        cJ cJ2 = cJ(this.CJ);
        int min = (int) ((cJ2 != null ? Math.min(cJ2.f7974fl, this.qMt) : 0.0f) * ((i10 - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            Qhi(false);
            scrollTo(min, getScrollY());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Qhi(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.NBs
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6a
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L1b:
            if (r7 >= r6) goto L6a
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$ac r9 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.ac) r9
            boolean r10 = r9.Qhi
            if (r10 == 0) goto L67
            int r9 = r9.cJ
            r9 = r9 & 7
            if (r9 == r2) goto L4c
            r10 = 3
            if (r9 == r10) goto L46
            r10 = 5
            if (r9 == r10) goto L39
            r9 = r3
            goto L5b
        L39:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L58
        L46:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5b
        L4c:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L58:
            r11 = r9
            r9 = r3
            r3 = r11
        L5b:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L66
            r8.offsetLeftAndRight(r3)
        L66:
            r3 = r9
        L67:
            int r7 = r7 + 1
            goto L1b
        L6a:
            r12.cJ(r13, r14, r15)
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$Tgh r13 = r12.HLI
            if (r13 == 0) goto L9d
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L79:
            if (r1 >= r14) goto L9d
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$ac r0 = (com.bytedance.adsdk.ugeno.viewpager.ViewPager.ac) r0
            boolean r0 = r0.Qhi
            if (r0 != 0) goto L9a
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            com.bytedance.adsdk.ugeno.viewpager.ViewPager$Tgh r3 = r12.HLI
            r3.Qhi(r15, r0)
        L9a:
            int r1 = r1 + 1
            goto L79
        L9d:
            r12.Hf = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.viewpager.ViewPager.Qhi(int, float, int):void");
    }

    private void Qhi(boolean z10) {
        boolean z11 = this.VnT == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.ABk.isFinished()) {
                this.ABk.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.ABk.getCurrX();
                int currY = this.ABk.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        CJ(currX);
                    }
                }
            }
        }
        this.pM = false;
        for (int i10 = 0; i10 < this.ROR.size(); i10++) {
            cJ cJVar = this.ROR.get(i10);
            if (cJVar.f7973ac) {
                cJVar.f7973ac = false;
                z11 = true;
            }
        }
        if (z11) {
            if (z10) {
                postOnAnimation(this.gga);
            } else {
                this.gga.run();
            }
        }
    }

    private boolean Qhi(float f10, float f11) {
        if (f10 >= this.lB || f11 <= 0.0f) {
            return f10 > ((float) (getWidth() - this.lB)) && f11 < 0.0f;
        }
        return true;
    }

    private int Qhi(int i10, float f10, int i11, int i12) {
        if (Math.abs(i12) <= this.xyz || Math.abs(i11) <= this.PAe) {
            i10 += (int) (f10 + (i10 >= this.CJ ? 0.4f : 0.6f));
        } else if (i11 <= 0) {
            i10++;
        }
        if (this.ROR.size() > 0) {
            ArrayList<cJ> arrayList = this.ROR;
            return Math.max(this.ROR.get(0).cJ, Math.min(i10, arrayList.get(arrayList.size() - 1).cJ));
        }
        return i10;
    }

    private void Qhi(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.yN) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.Jma = motionEvent.getX(i10);
            this.yN = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.FQ;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean Qhi(View view, boolean z10, int i10, int i11, int i12) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && Qhi(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i10);
    }

    public boolean Qhi(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                if (keyEvent.hasModifiers(2)) {
                    return ROR();
                }
                return ac(17);
            } else if (keyCode == 22) {
                if (keyEvent.hasModifiers(2)) {
                    return Sf();
                }
                return ac(66);
            } else if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return ac(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return ac(1);
                }
            }
        }
        return false;
    }

    private Rect Qhi(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }
}
