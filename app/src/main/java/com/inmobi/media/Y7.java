package com.inmobi.media;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class Y7 extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public final String f14874a;

    /* renamed from: b  reason: collision with root package name */
    public U7 f14875b;
    public final X7 c;

    /* renamed from: d  reason: collision with root package name */
    public C1627f8 f14876d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f14877e;

    /* renamed from: f  reason: collision with root package name */
    public final P2 f14878f;

    /* renamed from: g  reason: collision with root package name */
    public final P2 f14879g;

    /* renamed from: h  reason: collision with root package name */
    public final ProgressBar f14880h;

    /* renamed from: i  reason: collision with root package name */
    public final RelativeLayout f14881i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f14882j;

    /* renamed from: k  reason: collision with root package name */
    public final float f14883k;

    /* renamed from: l  reason: collision with root package name */
    public final View.OnClickListener f14884l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y7(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.g.e(context, "context");
        this.f14874a = "Y7";
        this.f14883k = AbstractC1692k3.d().c;
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.f14881i = relativeLayout;
        this.f14878f = new P2(context, (byte) 9, null);
        this.f14879g = new P2(context, (byte) 10, null);
        ProgressBar progressBar = new ProgressBar(context, null, 16842872);
        this.f14880h = progressBar;
        progressBar.setScaleY(0.8f);
        addView(relativeLayout, new RelativeLayout.LayoutParams(-1, -1));
        relativeLayout.setPadding(0, 0, 0, 0);
        a();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12, -1);
        float f10 = AbstractC1692k3.d().c;
        layoutParams.setMargins(0, (int) ((-6) * f10), 0, (int) ((-8) * f10));
        Drawable progressDrawable = progressBar.getProgressDrawable();
        LayerDrawable layerDrawable = progressDrawable instanceof LayerDrawable ? (LayerDrawable) progressDrawable : null;
        if (layerDrawable != null) {
            Drawable drawable = layerDrawable.getDrawable(0);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable.setColorFilter(new PorterDuffColorFilter(-1, mode));
            layerDrawable.getDrawable(2).setColorFilter(new PorterDuffColorFilter(-327674, mode));
        }
        relativeLayout.addView(progressBar, layoutParams);
        this.c = new X7(this);
        this.f14884l = new qb.j0(this, 0);
    }

    public final void a() {
        int i10 = (int) (30 * this.f14883k);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i10, i10);
        layoutParams.addRule(9, -1);
        layoutParams.addRule(12, -1);
        this.f14881i.addView(this.f14878f, layoutParams);
        this.f14878f.setOnClickListener(this.f14884l);
    }

    public final void b() {
        int i10 = (int) (30 * this.f14883k);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i10, i10);
        layoutParams.addRule(9, -1);
        layoutParams.addRule(12, -1);
        this.f14881i.addView(this.f14879g, layoutParams);
        this.f14879g.setOnClickListener(this.f14884l);
    }

    public final void c() {
        if (this.f14877e) {
            try {
                X7 x72 = this.c;
                if (x72 != null) {
                    x72.removeMessages(2);
                }
                setVisibility(8);
            } catch (IllegalArgumentException e10) {
                String TAG = this.f14874a;
                kotlin.jvm.internal.g.d(TAG, "TAG");
                Q4 q42 = Q4.f14590a;
                Q4.c.a(new J1(e10));
            }
            this.f14877e = false;
        }
    }

    public final void d() {
        Object obj;
        int i10;
        if (!this.f14877e) {
            C1627f8 c1627f8 = this.f14876d;
            if (c1627f8 != null) {
                int currentPosition = c1627f8.getCurrentPosition();
                int duration = c1627f8.getDuration();
                if (duration != 0) {
                    this.f14880h.setProgress((currentPosition * 100) / duration);
                }
            }
            this.f14877e = true;
            C1627f8 c1627f82 = this.f14876d;
            W7 w7 = null;
            if (c1627f82 != null) {
                obj = c1627f82.getTag();
            } else {
                obj = null;
            }
            if (obj instanceof W7) {
                w7 = (W7) obj;
            }
            if (w7 != null) {
                P2 p22 = this.f14878f;
                int i11 = 4;
                if (w7.A) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                p22.setVisibility(i10);
                ProgressBar progressBar = this.f14880h;
                if (w7.C) {
                    i11 = 0;
                }
                progressBar.setVisibility(i11);
            }
            setVisibility(0);
        }
        X7 x72 = this.c;
        if (x72 != null) {
            x72.sendEmptyMessage(2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent event) {
        boolean z10;
        C1627f8 c1627f8;
        C1627f8 c1627f82;
        kotlin.jvm.internal.g.e(event, "event");
        int keyCode = event.getKeyCode();
        if (event.getRepeatCount() == 0 && event.getAction() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (keyCode != 24 && keyCode != 25 && keyCode != 27) {
            if (keyCode != 62 && keyCode != 79) {
                if (keyCode != 164) {
                    if (keyCode != 85) {
                        if (keyCode != 86) {
                            if (keyCode != 126) {
                                if (keyCode != 127) {
                                    d();
                                    return super.dispatchKeyEvent(event);
                                }
                            } else {
                                if (z10 && (c1627f82 = this.f14876d) != null && !c1627f82.isPlaying()) {
                                    C1627f8 c1627f83 = this.f14876d;
                                    if (c1627f83 != null) {
                                        c1627f83.start();
                                    }
                                    d();
                                }
                                return true;
                            }
                        }
                        if (z10 && (c1627f8 = this.f14876d) != null && c1627f8.isPlaying()) {
                            C1627f8 c1627f84 = this.f14876d;
                            if (c1627f84 != null) {
                                c1627f84.pause();
                            }
                            d();
                        }
                        return true;
                    }
                }
            }
            if (z10) {
                C1627f8 c1627f85 = this.f14876d;
                if (c1627f85 != null) {
                    if (c1627f85.isPlaying()) {
                        c1627f85.pause();
                    } else {
                        c1627f85.start();
                    }
                }
                d();
            }
            return true;
        }
        return super.dispatchKeyEvent(event);
    }

    public final Map<View, FriendlyObstructionPurpose> getFriendlyViews() {
        ProgressBar progressBar = this.f14880h;
        FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.VIDEO_CONTROLS;
        return kotlin.collections.q.z0(new Pair(progressBar, friendlyObstructionPurpose), new Pair(this.f14878f, friendlyObstructionPurpose), new Pair(this.f14879g, friendlyObstructionPurpose));
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        kotlin.jvm.internal.g.e(event, "event");
        super.onInitializeAccessibilityEvent(event);
        event.setClassName(Y7.class.getName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        kotlin.jvm.internal.g.e(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        info.setClassName(Y7.class.getName());
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent ev) {
        kotlin.jvm.internal.g.e(ev, "ev");
        C1627f8 c1627f8 = this.f14876d;
        if (c1627f8 != null && c1627f8.a()) {
            if (this.f14877e) {
                c();
                return false;
            }
            d();
            return false;
        }
        return false;
    }

    public final void setMediaPlayer(C1627f8 videoView) {
        W7 w7;
        kotlin.jvm.internal.g.e(videoView, "videoView");
        this.f14876d = videoView;
        Object tag = videoView.getTag();
        if (tag instanceof W7) {
            w7 = (W7) tag;
        } else {
            w7 = null;
        }
        if (w7 != null && w7.A && !w7.a()) {
            this.f14882j = true;
            this.f14881i.removeView(this.f14879g);
            this.f14881i.removeView(this.f14878f);
            b();
        }
    }

    public final void setVideoAd(U7 u7) {
        this.f14875b = u7;
    }

    public static final void a(Y7 this$0, View view) {
        U7 u7;
        U7 u72;
        kotlin.jvm.internal.g.e(this$0, "this$0");
        C1627f8 c1627f8 = this$0.f14876d;
        if (c1627f8 != null) {
            Object tag = c1627f8.getTag();
            W7 w7 = tag instanceof W7 ? (W7) tag : null;
            if (this$0.f14882j) {
                C1627f8 c1627f82 = this$0.f14876d;
                if (c1627f82 != null) {
                    c1627f82.k();
                }
                this$0.f14882j = false;
                this$0.f14881i.removeView(this$0.f14879g);
                this$0.f14881i.removeView(this$0.f14878f);
                this$0.a();
                if (w7 == null || (u72 = this$0.f14875b) == null) {
                    return;
                }
                try {
                    u72.i(w7);
                    w7.f14810z = true;
                    return;
                } catch (Exception e10) {
                    String TAG = this$0.f14874a;
                    kotlin.jvm.internal.g.d(TAG, "TAG");
                    Q4 q42 = Q4.f14590a;
                    Q4.c.a(AbstractC1863x4.a(e10, "event"));
                    return;
                }
            }
            C1627f8 c1627f83 = this$0.f14876d;
            if (c1627f83 != null) {
                c1627f83.c();
            }
            this$0.f14882j = true;
            this$0.f14881i.removeView(this$0.f14878f);
            this$0.f14881i.removeView(this$0.f14879g);
            this$0.b();
            if (w7 == null || (u7 = this$0.f14875b) == null) {
                return;
            }
            try {
                u7.e(w7);
                w7.f14810z = false;
            } catch (Exception e11) {
                String TAG2 = this$0.f14874a;
                kotlin.jvm.internal.g.d(TAG2, "TAG");
                Q4 q43 = Q4.f14590a;
                Q4.c.a(AbstractC1863x4.a(e11, "event"));
            }
        }
    }
}
