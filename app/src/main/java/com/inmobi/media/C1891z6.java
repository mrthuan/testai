package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import lib.zj.office.fc.hpsf.Variant;

/* renamed from: com.inmobi.media.z6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1891z6 {

    /* renamed from: a  reason: collision with root package name */
    public final S9 f15703a;

    /* renamed from: b  reason: collision with root package name */
    public final A4 f15704b;
    public ViewGroup c;

    /* renamed from: d  reason: collision with root package name */
    public int f15705d;

    public C1891z6(S9 mRenderView, A4 a42) {
        kotlin.jvm.internal.g.e(mRenderView, "mRenderView");
        this.f15703a = mRenderView;
        this.f15704b = a42;
    }

    public final void a() {
        A4 a42 = this.f15704b;
        if (a42 != null) {
            ((B4) a42).c("MraidResizeProcession", "doResize()");
        }
        if (this.c == null) {
            ViewParent parent = this.f15703a.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            this.c = viewGroup;
            if (viewGroup != null) {
                this.f15705d = viewGroup.indexOfChild(this.f15703a);
            }
        }
        C1713la resizeProperties = this.f15703a.getResizeProperties();
        A4 a43 = this.f15704b;
        if (a43 != null) {
            ((B4) a43).c("MraidResizeProcession", "replaceRenderViewWithPlaceholder()");
        }
        ViewGroup viewGroup2 = this.c;
        if (viewGroup2 != null) {
            FrameLayout frameLayout = new FrameLayout(this.f15703a.getContainerContext());
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(this.f15703a.getWidth(), this.f15703a.getHeight());
            frameLayout.setId(Variant.VT_ILLEGAL);
            viewGroup2.addView(frameLayout, this.f15705d, layoutParams);
            viewGroup2.removeView(this.f15703a);
        }
        if (resizeProperties != null) {
            A4 a44 = this.f15704b;
            if (a44 != null) {
                ((B4) a44).c("MraidResizeProcession", "setupLayoutForResizedAd()");
            }
            float f10 = AbstractC1692k3.d().c;
            int f11 = (int) ((resizeProperties.f() * f10) + 0.5f);
            int c = (int) ((resizeProperties.c() * f10) + 0.5f);
            ViewGroup viewGroup3 = this.c;
            View rootView = viewGroup3 != null ? viewGroup3.getRootView() : null;
            if (rootView != null) {
                FrameLayout frameLayout2 = (FrameLayout) rootView.findViewById(16908290);
                FrameLayout frameLayout3 = new FrameLayout(this.f15703a.getContainerContext());
                ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                RelativeLayout relativeLayout = new RelativeLayout(this.f15703a.getContainerContext());
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(f11, c);
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(f11, c);
                frameLayout3.setId(65534);
                ViewParent parent2 = this.f15703a.getParent();
                ViewGroup viewGroup4 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                if (viewGroup4 != null) {
                    viewGroup4.removeAllViews();
                }
                relativeLayout.addView(this.f15703a, layoutParams4);
                a(relativeLayout, resizeProperties.b());
                frameLayout3.addView(relativeLayout, layoutParams3);
                frameLayout2.addView(frameLayout3, layoutParams2);
                ViewGroup viewGroup5 = this.c;
                if (viewGroup5 != null) {
                    A4 a45 = this.f15704b;
                    if (a45 != null) {
                        ((B4) a45).c("MraidResizeProcession", "doResize()");
                    }
                    float f12 = AbstractC1692k3.d().c;
                    int f13 = (int) ((resizeProperties.f() * f12) + 0.5f);
                    int c10 = (int) ((resizeProperties.c() * f12) + 0.5f);
                    int e10 = (int) ((resizeProperties.e() * f12) + 0.5f);
                    int[] iArr = new int[2];
                    viewGroup5.getLocationOnScreen(r10);
                    frameLayout2.getLocationOnScreen(iArr);
                    int i10 = r10[1] - iArr[1];
                    int[] iArr2 = {r12, i10};
                    int i11 = iArr2[0] - iArr[0];
                    iArr2[0] = i11 + ((int) ((resizeProperties.d() * f12) + 0.5f));
                    iArr2[1] = i10 + e10;
                    if (!resizeProperties.a()) {
                        if (f13 > frameLayout2.getWidth() - iArr2[0]) {
                            iArr2[0] = frameLayout2.getWidth() - f13;
                        }
                        if (c10 > frameLayout2.getHeight() - iArr2[1]) {
                            iArr2[1] = frameLayout2.getHeight() - c10;
                        }
                        if (iArr2[0] < 0) {
                            iArr2[0] = 0;
                        }
                        if (iArr2[1] < 0) {
                            iArr2[1] = 0;
                        }
                    }
                    FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(f13, c10);
                    layoutParams5.leftMargin = iArr2[0];
                    layoutParams5.topMargin = iArr2[1];
                    layoutParams5.gravity = 8388611;
                    frameLayout3.setLayoutParams(layoutParams5);
                }
                frameLayout3.setBackgroundColor(0);
                return;
            }
            A4 a46 = this.f15704b;
            if (a46 != null) {
                ((B4) a46).b("MraidResizeProcessor", "Couldn't process resize request as root view was found null.");
            }
        }
    }

    public final void a(RelativeLayout relativeLayout, String str) {
        A4 a42 = this.f15704b;
        if (a42 != null) {
            ((B4) a42).c("MraidResizeProcession", "buildAndAddCloseRegion()");
        }
        float f10 = AbstractC1692k3.d().c;
        View p22 = new P2(this.f15703a.getContainerContext(), (byte) 1, this.f15704b);
        p22.setId(65531);
        p22.setOnClickListener(new f5.e(this, 2));
        A4 a43 = this.f15704b;
        if (a43 != null) {
            ((B4) a43).c("MraidResizeProcession", "buildCloseRegionLayoutParam()");
        }
        A4 a44 = this.f15704b;
        if (a44 != null) {
            ((B4) a44).c("MraidResizeProcession", "validateCustomClose()");
        }
        if (str == null || str.length() == 0 || !ge.a.I("top-left", C1713la.DEFAULT_POSITION, "bottom-left", "bottom-right", "top-center", "bottom-center", "centre").contains(str)) {
            str = C1713la.DEFAULT_POSITION;
        }
        int i10 = (int) (50 * f10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i10, i10);
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    layoutParams.addRule(13);
                    break;
                }
                break;
            case -1314880604:
                if (str.equals(C1713la.DEFAULT_POSITION)) {
                    layoutParams.addRule(11);
                    break;
                }
                break;
            case -655373719:
                if (str.equals("bottom-left")) {
                    layoutParams.addRule(12);
                    layoutParams.addRule(4);
                    break;
                }
                break;
            case 1163912186:
                if (str.equals("bottom-right")) {
                    layoutParams.addRule(11);
                    layoutParams.addRule(12);
                    layoutParams.addRule(4);
                    break;
                }
                break;
            case 1288627767:
                if (str.equals("bottom-center")) {
                    layoutParams.addRule(12);
                    layoutParams.addRule(4);
                    layoutParams.addRule(13);
                    break;
                }
                break;
            case 1755462605:
                if (str.equals("top-center")) {
                    layoutParams.addRule(13);
                    layoutParams.addRule(10);
                    break;
                }
                break;
        }
        relativeLayout.addView(p22, layoutParams);
    }

    public static final void a(C1891z6 this$0, View view) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        this$0.f15703a.a();
    }
}
