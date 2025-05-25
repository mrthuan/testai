package com.inmobi.ads.rendering;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.A4;
import com.inmobi.media.AbstractC1692k3;
import com.inmobi.media.B;
import com.inmobi.media.B4;
import com.inmobi.media.C1566b3;
import com.inmobi.media.C1614e9;
import com.inmobi.media.C1707l4;
import com.inmobi.media.C1720m3;
import com.inmobi.media.C1734n4;
import com.inmobi.media.C1772q3;
import com.inmobi.media.C1797s3;
import com.inmobi.media.InterfaceC1768q;
import com.inmobi.media.P2;
import com.inmobi.media.S9;
import com.inmobi.media.U9;
import com.inmobi.media.r;
import k9.k;
import kotlin.jvm.internal.g;
import pb.a;
import pb.b;

@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes2.dex */
public final class InMobiAdActivity extends Activity {

    /* renamed from: j  reason: collision with root package name */
    public static final SparseArray f14092j = new SparseArray();

    /* renamed from: k  reason: collision with root package name */
    public static S9 f14093k;

    /* renamed from: l  reason: collision with root package name */
    public static U9 f14094l;

    /* renamed from: a  reason: collision with root package name */
    public C1734n4 f14095a;

    /* renamed from: b  reason: collision with root package name */
    public C1707l4 f14096b;
    public S9 c;

    /* renamed from: d  reason: collision with root package name */
    public int f14097d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f14098e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f14099f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f14100g;

    /* renamed from: h  reason: collision with root package name */
    public A4 f14101h;

    /* renamed from: i  reason: collision with root package name */
    public OnBackInvokedCallback f14102i;

    public static final void a(InMobiAdActivity this$0) {
        g.e(this$0, "this$0");
        this$0.a();
    }

    public static final boolean b(InMobiAdActivity this$0, View view, MotionEvent motionEvent) {
        C1772q3 c1772q3;
        g.e(this$0, "this$0");
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            S9 s92 = this$0.c;
            if (s92 != null && (c1772q3 = s92.f14680q0) != null) {
                c1772q3.a("userclickReload");
            }
            S9 s93 = this$0.c;
            if (s93 != null) {
                s93.reload();
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public static final boolean c(InMobiAdActivity this$0, View view, MotionEvent motionEvent) {
        g.e(this$0, "this$0");
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            S9 s92 = this$0.c;
            if (s92 != null && s92.canGoBack()) {
                S9 s93 = this$0.c;
                if (s93 != null) {
                    s93.goBack();
                }
            } else {
                this$0.f14098e = true;
                this$0.finish();
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public static final boolean d(InMobiAdActivity this$0, View view, MotionEvent motionEvent) {
        S9 s92;
        g.e(this$0, "this$0");
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            S9 s93 = this$0.c;
            if (s93 != null && s93.canGoForward() && (s92 = this$0.c) != null) {
                s92.goForward();
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        g.e(newConfig, "newConfig");
        A4 a42 = this.f14101h;
        if (a42 != null) {
            ((B4) a42).c("InMobiAdActivity", "onConfigChanged");
        }
        super.onConfigurationChanged(newConfig);
        C1734n4 c1734n4 = this.f14095a;
        if (c1734n4 != null) {
            c1734n4.b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
        if (r1 == null) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x026a A[Catch: Exception -> 0x022b, TryCatch #2 {Exception -> 0x022b, blocks: (B:86:0x021f, B:92:0x022f, B:94:0x0257, B:95:0x025f, B:97:0x0263, B:98:0x0266, B:100:0x026a, B:101:0x0278, B:102:0x027b, B:87:0x0223, B:88:0x022a), top: B:117:0x0219 }] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0278 A[Catch: Exception -> 0x022b, TryCatch #2 {Exception -> 0x022b, blocks: (B:86:0x021f, B:92:0x022f, B:94:0x0257, B:95:0x025f, B:97:0x0263, B:98:0x0266, B:100:0x026a, B:101:0x0278, B:102:0x027b, B:87:0x0223, B:88:0x022a), top: B:117:0x0219 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0208 A[Catch: Exception -> 0x027c, TryCatch #1 {Exception -> 0x027c, blocks: (B:74:0x01f7, B:78:0x020d, B:82:0x0217, B:81:0x0212, B:77:0x0208), top: B:115:0x01f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0212 A[Catch: Exception -> 0x027c, TryCatch #1 {Exception -> 0x027c, blocks: (B:74:0x01f7, B:78:0x020d, B:82:0x0217, B:81:0x0212, B:77:0x0208), top: B:115:0x01f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0257 A[Catch: Exception -> 0x022b, TryCatch #2 {Exception -> 0x022b, blocks: (B:86:0x021f, B:92:0x022f, B:94:0x0257, B:95:0x025f, B:97:0x0263, B:98:0x0266, B:100:0x026a, B:101:0x0278, B:102:0x027b, B:87:0x0223, B:88:0x022a), top: B:117:0x0219 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0263 A[Catch: Exception -> 0x022b, TryCatch #2 {Exception -> 0x022b, blocks: (B:86:0x021f, B:92:0x022f, B:94:0x0257, B:95:0x025f, B:97:0x0263, B:98:0x0266, B:100:0x026a, B:101:0x0278, B:102:0x027b, B:87:0x0223, B:88:0x022a), top: B:117:0x0219 }] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r37) {
        /*
            Method dump skipped, instructions count: 677
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.ads.rendering.InMobiAdActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        InterfaceC1768q fullScreenEventsListener;
        A4 a42 = this.f14101h;
        if (a42 != null) {
            ((B4) a42).c("InMobiAdActivity", "onDestroy");
        }
        if (this.f14098e) {
            int i10 = this.f14097d;
            if (100 == i10) {
                S9 s92 = this.c;
                if (s92 != null && (fullScreenEventsListener = s92.getFullScreenEventsListener()) != null) {
                    try {
                        fullScreenEventsListener.b(this.c);
                        S9 s93 = this.c;
                        g.b(s93);
                        s93.b();
                        C1734n4 c1734n4 = this.f14095a;
                        if (c1734n4 != null) {
                            S9 s94 = this.c;
                            g.b(s94);
                            c1734n4.f15343b.remove(s94);
                            c1734n4.a();
                            this.c = null;
                        } else {
                            g.i("orientationHandler");
                            throw null;
                        }
                    } catch (Exception unused) {
                    }
                }
            } else if (102 == i10) {
                C1707l4 c1707l4 = this.f14096b;
                if (c1707l4 != null) {
                    C1734n4 c1734n42 = this.f14095a;
                    if (c1734n42 != null) {
                        c1734n42.f15343b.remove(c1707l4);
                        c1734n42.a();
                        B b10 = c1707l4.c;
                        if (b10 != null) {
                            b10.b();
                        }
                        RelativeLayout relativeLayout = c1707l4.f15278d;
                        if (relativeLayout != null) {
                            relativeLayout.removeAllViews();
                        }
                        C1720m3 c1720m3 = c1707l4.f15279e;
                        if (c1720m3 != null) {
                            C1797s3 c1797s3 = c1720m3.f15299b;
                            if (c1797s3 != null) {
                                c1797s3.destroy();
                            }
                            c1720m3.f15299b = null;
                            c1720m3.c = null;
                            c1720m3.f15300d = null;
                            c1720m3.removeAllViews();
                        }
                        c1707l4.f15276a.clear();
                        c1707l4.f15277b = null;
                        c1707l4.c = null;
                        c1707l4.f15278d = null;
                        c1707l4.f15279e = null;
                    } else {
                        g.i("orientationHandler");
                        throw null;
                    }
                }
                this.f14096b = null;
            }
        } else {
            int i11 = this.f14097d;
            if (100 != i11 && 102 == i11) {
                C1707l4 c1707l42 = this.f14096b;
                if (c1707l42 != null) {
                    C1734n4 c1734n43 = this.f14095a;
                    if (c1734n43 != null) {
                        c1734n43.f15343b.remove(c1707l42);
                        c1734n43.a();
                        B b11 = c1707l42.c;
                        if (b11 != null) {
                            b11.b();
                        }
                        RelativeLayout relativeLayout2 = c1707l42.f15278d;
                        if (relativeLayout2 != null) {
                            relativeLayout2.removeAllViews();
                        }
                        C1720m3 c1720m32 = c1707l42.f15279e;
                        if (c1720m32 != null) {
                            C1797s3 c1797s32 = c1720m32.f15299b;
                            if (c1797s32 != null) {
                                c1797s32.destroy();
                            }
                            c1720m32.f15299b = null;
                            c1720m32.c = null;
                            c1720m32.f15300d = null;
                            c1720m32.removeAllViews();
                        }
                        c1707l42.f15276a.clear();
                        c1707l42.f15277b = null;
                        c1707l42.c = null;
                        c1707l42.f15278d = null;
                        c1707l42.f15279e = null;
                    } else {
                        g.i("orientationHandler");
                        throw null;
                    }
                }
                this.f14096b = null;
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10) {
        C1707l4 c1707l4;
        C1734n4 c1734n4;
        A4 a42 = this.f14101h;
        if (a42 != null) {
            ((B4) a42).c("InMobiAdActivity", "multiWindow mode - " + z10);
        }
        super.onMultiWindowModeChanged(z10);
        if (z10 || (c1707l4 = this.f14096b) == null) {
            return;
        }
        r rVar = c1707l4.f15277b;
        C1614e9 orientationProperties = (rVar == null || !(rVar instanceof S9)) ? null : ((S9) rVar).getOrientationProperties();
        if (orientationProperties == null || (c1734n4 = this.f14095a) == null) {
            return;
        }
        c1734n4.a(orientationProperties);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        g.e(intent, "intent");
        A4 a42 = this.f14101h;
        if (a42 != null) {
            ((B4) a42).c("InMobiAdActivity", "onNewIntent");
        }
        super.onNewIntent(intent);
        this.f14099f = false;
        this.c = null;
        setIntent(intent);
        C1707l4 c1707l4 = this.f14096b;
        if (c1707l4 != null) {
            SparseArray adContainers = f14092j;
            g.e(adContainers, "adContainers");
            c1707l4.a(intent, adContainers);
            B b10 = c1707l4.c;
            if (b10 != null) {
                b10.g();
            }
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        C1707l4 c1707l4;
        B b10;
        InterfaceC1768q fullScreenEventsListener;
        A4 a42 = this.f14101h;
        if (a42 != null) {
            ((B4) a42).c("InMobiAdActivity", "onResume");
        }
        super.onResume();
        if (!this.f14098e) {
            int i10 = this.f14097d;
            if (100 == i10) {
                S9 s92 = this.c;
                if (s92 != null && (fullScreenEventsListener = s92.getFullScreenEventsListener()) != null) {
                    try {
                        if (!this.f14099f) {
                            this.f14099f = true;
                            fullScreenEventsListener.a(this.c);
                        }
                    } catch (Exception unused) {
                    }
                }
            } else if (102 == i10 && (c1707l4 = this.f14096b) != null && (b10 = c1707l4.c) != null) {
                b10.c();
            }
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        C1707l4 c1707l4;
        boolean z10;
        Window window;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        A4 a42 = this.f14101h;
        if (a42 != null) {
            ((B4) a42).c("InMobiAdActivity", "onStart");
        }
        super.onStart();
        C1566b3 c1566b3 = C1566b3.f14952a;
        InMobiAdActivity inMobiAdActivity = null;
        if (c1566b3.G()) {
            if (this.f14102i == null) {
                this.f14102i = new OnBackInvokedCallback() { // from class: pb.d
                    public final void onBackInvoked() {
                        InMobiAdActivity.a(InMobiAdActivity.this);
                    }
                };
            }
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            OnBackInvokedCallback onBackInvokedCallback = this.f14102i;
            if (onBackInvokedCallback != null) {
                onBackInvokedDispatcher.registerOnBackInvokedCallback(0, onBackInvokedCallback);
            } else {
                g.i("backInvokedCallback");
                throw null;
            }
        }
        if (!this.f14098e && 102 == this.f14097d && (c1707l4 = this.f14096b) != null) {
            B b10 = c1707l4.c;
            if (b10 != null) {
                b10.g();
            }
            r rVar = c1707l4.f15277b;
            if (rVar != null) {
                if (!(rVar instanceof S9)) {
                    z10 = false;
                } else {
                    z10 = ((S9) rVar).D0;
                }
                if (z10 && !c1566b3.E() && c1566b3.x()) {
                    Object obj = c1707l4.f15276a.get();
                    if (obj instanceof InMobiAdActivity) {
                        inMobiAdActivity = (InMobiAdActivity) obj;
                    }
                    if (inMobiAdActivity != null && (window = inMobiAdActivity.getWindow()) != null) {
                        window.getDecorView().setSystemUiVisibility(5638);
                    }
                }
            }
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        C1707l4 c1707l4;
        B b10;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        A4 a42 = this.f14101h;
        if (a42 != null) {
            ((B4) a42).c("InMobiAdActivity", "onStop");
        }
        super.onStop();
        if (C1566b3.f14952a.G() && this.f14102i != null) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            OnBackInvokedCallback onBackInvokedCallback = this.f14102i;
            if (onBackInvokedCallback != null) {
                onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
            } else {
                g.i("backInvokedCallback");
                throw null;
            }
        }
        if (!this.f14098e && (c1707l4 = this.f14096b) != null && (b10 = c1707l4.c) != null) {
            b10.d();
        }
    }

    public final void a(RelativeLayout relativeLayout) {
        float f10 = AbstractC1692k3.d().c;
        LinearLayout linearLayout = new LinearLayout(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) (48 * f10));
        linearLayout.setOrientation(0);
        linearLayout.setId(65533);
        linearLayout.setWeightSum(100.0f);
        linearLayout.setBackgroundResource(17301658);
        linearLayout.setBackgroundColor(-7829368);
        layoutParams.addRule(12);
        relativeLayout.addView(linearLayout, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams2.weight = 25.0f;
        P2 p22 = new P2(this, (byte) 2, this.f14101h);
        p22.setOnTouchListener(new a(this, 0));
        linearLayout.addView(p22, layoutParams2);
        P2 p23 = new P2(this, (byte) 3, this.f14101h);
        p23.setOnTouchListener(new b(this, 0));
        linearLayout.addView(p23, layoutParams2);
        P2 p24 = new P2(this, (byte) 4, this.f14101h);
        p24.setOnTouchListener(new View.OnTouchListener() { // from class: pb.c
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return InMobiAdActivity.c(InMobiAdActivity.this, view, motionEvent);
            }
        });
        linearLayout.addView(p24, layoutParams2);
        P2 p25 = new P2(this, (byte) 6, this.f14101h);
        p25.setOnTouchListener(new k(this, 1));
        linearLayout.addView(p25, layoutParams2);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10, Configuration newConfig) {
        g.e(newConfig, "newConfig");
        super.onMultiWindowModeChanged(z10, newConfig);
        onMultiWindowModeChanged(z10);
    }

    public static final boolean a(InMobiAdActivity this$0, View view, MotionEvent motionEvent) {
        C1772q3 c1772q3;
        g.e(this$0, "this$0");
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            S9 s92 = this$0.c;
            if (s92 != null && (c1772q3 = s92.f14680q0) != null) {
                c1772q3.a("userclickClose");
            }
            this$0.f14098e = true;
            this$0.finish();
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public final void a() {
        B b10;
        A4 a42 = this.f14101h;
        if (a42 != null) {
            ((B4) a42).c("InMobiAdActivity", "onBackPressed");
        }
        int i10 = this.f14097d;
        if (i10 != 102) {
            if (i10 == 100) {
                A4 a43 = this.f14101h;
                if (a43 != null) {
                    ((B4) a43).c("InMobiAdActivity", "back pressed in browser");
                }
                this.f14098e = true;
                finish();
                return;
            }
            return;
        }
        A4 a44 = this.f14101h;
        if (a44 != null) {
            ((B4) a44).c("InMobiAdActivity", "back pressed on ad");
        }
        C1707l4 c1707l4 = this.f14096b;
        if (c1707l4 == null || (b10 = c1707l4.c) == null) {
            return;
        }
        b10.a();
    }
}
