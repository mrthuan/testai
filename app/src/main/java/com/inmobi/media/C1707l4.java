package com.inmobi.media;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.inmobi.ads.rendering.InMobiAdActivity;
import java.lang.ref.WeakReference;
import java.util.Objects;
import x0.t0;

/* renamed from: com.inmobi.media.l4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1707l4 implements InterfaceC1628f9 {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f15276a;

    /* renamed from: b  reason: collision with root package name */
    public r f15277b;
    public B c;

    /* renamed from: d  reason: collision with root package name */
    public RelativeLayout f15278d;

    /* renamed from: e  reason: collision with root package name */
    public C1720m3 f15279e;

    /* renamed from: f  reason: collision with root package name */
    public EnumC1586c9 f15280f;

    /* renamed from: g  reason: collision with root package name */
    public float f15281g;

    /* renamed from: h  reason: collision with root package name */
    public A4 f15282h;

    /* renamed from: i  reason: collision with root package name */
    public final C1693k4 f15283i;

    /* renamed from: j  reason: collision with root package name */
    public final C1679j4 f15284j;

    public C1707l4(Activity activity) {
        kotlin.jvm.internal.g.e(activity, "activity");
        this.f15276a = new WeakReference(activity);
        this.f15280f = AbstractC1600d9.a(AbstractC1692k3.g());
        this.f15281g = 1.0f;
        this.f15283i = new C1693k4(this);
        this.f15284j = new C1679j4(this);
    }

    public final void a(Intent intent, SparseArray adContainers) {
        C1720m3 c1720m3;
        Window window;
        t0.e bVar;
        t0.e eVar;
        kotlin.jvm.internal.g.e(intent, "intent");
        kotlin.jvm.internal.g.e(adContainers, "adContainers");
        if (intent.hasExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX")) {
            r rVar = (r) adContainers.get(intent.getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", -1));
            if (rVar == null) {
                b();
                return;
            }
            int intExtra = intent.getIntExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", 0);
            if (intExtra == 0) {
                InterfaceC1768q fullScreenEventsListener = rVar.getFullScreenEventsListener();
                if (fullScreenEventsListener != null) {
                    fullScreenEventsListener.a();
                }
                b();
                return;
            }
            if (intent.getBooleanExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", false) && (this.f15276a.get() instanceof InMobiAdActivity)) {
                Object obj = this.f15276a.get();
                kotlin.jvm.internal.g.c(obj, "null cannot be cast to non-null type com.inmobi.ads.rendering.InMobiAdActivity");
                if (!((InMobiAdActivity) obj).f14100g) {
                    Object obj2 = this.f15276a.get();
                    kotlin.jvm.internal.g.c(obj2, "null cannot be cast to non-null type com.inmobi.ads.rendering.InMobiAdActivity");
                    ((InMobiAdActivity) obj2).f14100g = true;
                    if (!(rVar instanceof S9) ? false : ((S9) rVar).D0) {
                        A4 a42 = this.f15282h;
                        if (a42 != null) {
                            ((B4) a42).a("InMobiActivityViewHandler", "showInImmersiveMode");
                        }
                        Object obj3 = this.f15276a.get();
                        InMobiAdActivity inMobiAdActivity = obj3 instanceof InMobiAdActivity ? (InMobiAdActivity) obj3 : null;
                        if (inMobiAdActivity != null && (window = inMobiAdActivity.getWindow()) != null) {
                            C1566b3 c1566b3 = C1566b3.f14952a;
                            if (c1566b3.E()) {
                                WindowManager.LayoutParams attributes = window.getAttributes();
                                attributes.layoutInDisplayCutoutMode = 3;
                                window.setAttributes(attributes);
                                x0.q0.a(window, false);
                            }
                            if (c1566b3.C()) {
                                WindowManager.LayoutParams attributes2 = window.getAttributes();
                                attributes2.layoutInDisplayCutoutMode = 1;
                                window.setAttributes(attributes2);
                                x0.q0.a(window, false);
                            }
                            if (c1566b3.E()) {
                                View decorView = window.getDecorView();
                                int i10 = Build.VERSION.SDK_INT;
                                if (i10 >= 30) {
                                    eVar = new t0.d(window);
                                } else {
                                    if (i10 >= 26) {
                                        bVar = new t0.c(window, decorView);
                                    } else {
                                        bVar = new t0.b(window, decorView);
                                    }
                                    eVar = bVar;
                                }
                                eVar.e(2);
                                eVar.a(7);
                                eVar.a(128);
                            } else if (c1566b3.x()) {
                                window.getDecorView().setSystemUiVisibility(5638);
                            }
                        }
                    } else {
                        Activity activity = (Activity) this.f15276a.get();
                        if (activity != null) {
                            try {
                                activity.requestWindowFeature(1);
                                activity.getWindow().setFlags(1024, 1024);
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
            if ((200 == intExtra && !kotlin.jvm.internal.g.a("html", rVar.getMarkupType())) || ((202 == intExtra && !kotlin.jvm.internal.g.a("htmlUrl", rVar.getMarkupType())) || (201 == intExtra && !kotlin.jvm.internal.g.a("inmobiJson", rVar.getMarkupType())))) {
                InterfaceC1768q fullScreenEventsListener2 = rVar.getFullScreenEventsListener();
                if (fullScreenEventsListener2 != null) {
                    fullScreenEventsListener2.a();
                }
                b();
                return;
            }
            try {
                this.f15277b = rVar;
                rVar.setFullScreenActivityContext((Activity) this.f15276a.get());
                a();
                Activity activity2 = (Activity) this.f15276a.get();
                if (activity2 != null) {
                    RelativeLayout relativeLayout = new RelativeLayout(activity2);
                    relativeLayout.setId(65534);
                    this.f15278d = relativeLayout;
                }
                a(rVar);
                B b10 = this.c;
                if (b10 != null) {
                    b10.f();
                }
                Activity activity3 = (Activity) this.f15276a.get();
                if (activity3 != null) {
                    FrameLayout frameLayout = (FrameLayout) activity3.findViewById(16908290);
                    RelativeLayout relativeLayout2 = frameLayout != null ? (RelativeLayout) frameLayout.findViewById(65519) : null;
                    RelativeLayout relativeLayout3 = this.f15278d;
                    if (relativeLayout3 != null && relativeLayout2 != null) {
                        RelativeLayout relativeLayout4 = (RelativeLayout) relativeLayout2.findViewById(65534);
                        if (relativeLayout4 != null) {
                            relativeLayout2.removeView(relativeLayout4);
                        }
                        relativeLayout2.addView(relativeLayout3);
                        B b11 = this.c;
                        if (b11 != null) {
                            b11.e();
                        }
                    }
                }
                if (rVar instanceof S9) {
                    ((S9) rVar).setEmbeddedBrowserJSCallbacks(this.f15284j);
                }
                if ((rVar instanceof S9) && (c1720m3 = this.f15279e) != null) {
                    c1720m3.setUserLeftApplicationListener(((S9) rVar).getListener());
                    return;
                }
                return;
            } catch (Exception e10) {
                rVar.setFullScreenActivityContext(null);
                InterfaceC1768q fullScreenEventsListener3 = rVar.getFullScreenEventsListener();
                if (fullScreenEventsListener3 != null) {
                    fullScreenEventsListener3.a();
                }
                b();
                Q4 q42 = Q4.f14590a;
                Q4.c.a(AbstractC1863x4.a(e10, "event"));
                return;
            }
        }
        b();
    }

    public final void b() {
        Activity activity = (Activity) this.f15276a.get();
        if (!(activity instanceof InMobiAdActivity)) {
            return;
        }
        ((InMobiAdActivity) activity).finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            r5 = this;
            com.inmobi.media.m3 r0 = r5.f15279e
            if (r0 != 0) goto L5
            return
        L5:
            com.inmobi.media.r r0 = r5.f15277b
            r1 = 1
            if (r0 == 0) goto L1b
            boolean r2 = r0 instanceof com.inmobi.media.S9
            if (r2 != 0) goto L10
            r0 = 0
            goto L14
        L10:
            com.inmobi.media.S9 r0 = (com.inmobi.media.S9) r0
            boolean r0 = r0.D0
        L14:
            if (r0 != r1) goto L1b
            com.inmobi.media.l3 r0 = com.inmobi.media.AbstractC1692k3.h()
            goto L1f
        L1b:
            com.inmobi.media.l3 r0 = com.inmobi.media.AbstractC1692k3.d()
        L1f:
            int r2 = r0.f15274a
            float r2 = (float) r2
            float r3 = r0.c
            float r2 = r2 * r3
            int r0 = r0.f15275b
            float r0 = (float) r0
            float r0 = r0 * r3
            com.inmobi.media.c9 r3 = r5.f15280f
            boolean r3 = com.inmobi.media.AbstractC1600d9.b(r3)
            r4 = -1
            if (r3 == 0) goto L3f
            float r0 = (float) r1
            float r1 = r5.f15281g
            float r0 = r0 - r1
            float r0 = r0 * r2
            int r0 = pdf.pdfreader.viewer.editor.free.utils.t0.o0(r0)
            r5.a(r0, r4)
            goto L4b
        L3f:
            float r1 = (float) r1
            float r2 = r5.f15281g
            float r1 = r1 - r2
            float r1 = r1 * r0
            int r0 = pdf.pdfreader.viewer.editor.free.utils.t0.o0(r1)
            r5.a(r4, r0)
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C1707l4.c():void");
    }

    public final void a() {
        Activity activity = (Activity) this.f15276a.get();
        if (activity == null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) activity.findViewById(16908290);
        if ((frameLayout != null ? (RelativeLayout) frameLayout.findViewById(65519) : null) != null) {
            return;
        }
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        relativeLayout.setId(65519);
        relativeLayout.setBackgroundColor(0);
        frameLayout.removeAllViews();
        frameLayout.addView(relativeLayout, new RelativeLayout.LayoutParams(-1, -1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
        r1 = new com.inmobi.media.X3(r4.f15276a, r5, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.inmobi.media.r r5) {
        /*
            r4 = this;
            java.lang.ref.WeakReference r0 = r4.f15276a
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            android.widget.RelativeLayout r0 = r4.f15278d
            if (r0 != 0) goto L10
            return
        L10:
            java.lang.String r1 = r5.getMarkupType()
            int r2 = r1.hashCode()
            r3 = -1084172778(0xffffffffbf60d616, float:-0.8782667)
            if (r2 == r3) goto L40
            r3 = 3213227(0x3107ab, float:4.50269E-39)
            if (r2 == r3) goto L30
            r3 = 1236050372(0x49aca1c4, float:1414200.5)
            if (r2 != r3) goto Lab
            java.lang.String r2 = "htmlUrl"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lab
            goto L38
        L30:
            java.lang.String r2 = "html"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lab
        L38:
            com.inmobi.media.X3 r1 = new com.inmobi.media.X3
            java.lang.ref.WeakReference r2 = r4.f15276a
            r1.<init>(r2, r5, r0)
            goto L4f
        L40:
            java.lang.String r2 = "inmobiJson"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lab
            com.inmobi.media.t5 r1 = new com.inmobi.media.t5
            java.lang.ref.WeakReference r2 = r4.f15276a
            r1.<init>(r2, r5, r0)
        L4f:
            r4.c = r1
            com.inmobi.media.c9 r0 = r4.f15280f
            r1.a(r0)
            float r0 = r4.f15281g
            r1.c = r0
            boolean r0 = r5 instanceof com.inmobi.media.S9
            r2 = 0
            if (r0 != 0) goto L61
            r3 = r2
            goto L66
        L61:
            r3 = r5
            com.inmobi.media.S9 r3 = (com.inmobi.media.S9) r3
            boolean r3 = r3.D0
        L66:
            r1.f14137d = r3
            boolean r3 = r1 instanceof com.inmobi.media.X3
            if (r3 == 0) goto Laa
            if (r0 != 0) goto L6f
            goto L73
        L6f:
            com.inmobi.media.S9 r5 = (com.inmobi.media.S9) r5
            boolean r2 = r5.D0
        L73:
            if (r2 == 0) goto Laa
            com.inmobi.media.X3 r1 = (com.inmobi.media.X3) r1
            com.inmobi.media.Aa r5 = new com.inmobi.media.Aa
            java.lang.ref.WeakReference r0 = r1.f14829e
            com.inmobi.media.r r2 = r1.f14830f
            java.lang.String r3 = "null cannot be cast to non-null type com.inmobi.ads.containers.RenderView"
            kotlin.jvm.internal.g.c(r2, r3)
            com.inmobi.media.S9 r2 = (com.inmobi.media.S9) r2
            r5.<init>(r0, r2)
            boolean r2 = com.inmobi.media.AbstractC1692k3.f15257i
            if (r2 != 0) goto L8c
            goto La8
        L8c:
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 != 0) goto L95
            goto La8
        L95:
            android.view.Window r0 = r0.getWindow()
            if (r0 != 0) goto L9c
            goto La8
        L9c:
            android.view.View r0 = r0.getDecorView()
            java.lang.String r2 = "getDecorView(...)"
            kotlin.jvm.internal.g.d(r0, r2)
            r5.a(r0)
        La8:
            r1.f14833i = r5
        Laa:
            return
        Lab:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "InMobiActivityViewHandler: Unknown Markup type"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C1707l4.a(com.inmobi.media.r):void");
    }

    @Override // com.inmobi.media.InterfaceC1628f9
    public final void a(EnumC1586c9 orientation) {
        kotlin.jvm.internal.g.e(orientation, "orientation");
        if (((Activity) this.f15276a.get()) == null) {
            return;
        }
        B b10 = this.c;
        if (b10 != null) {
            b10.a(orientation);
        }
        EnumC1586c9 enumC1586c9 = this.f15280f;
        if (enumC1586c9 != orientation && AbstractC1600d9.b(enumC1586c9) != AbstractC1600d9.b(orientation)) {
            Objects.toString(orientation);
            this.f15280f = orientation;
            B b11 = this.c;
            if (b11 != null) {
                b11.e();
            }
            c();
            return;
        }
        Objects.toString(orientation);
        this.f15280f = orientation;
    }

    public static final void a(C1707l4 c1707l4) {
        C1720m3 c1720m3 = c1707l4.f15279e;
        if (c1720m3 != null) {
            c1720m3.setLayoutParams(new RelativeLayout.LayoutParams(0, 0));
        }
        C1720m3 c1720m32 = c1707l4.f15279e;
        if (c1720m32 != null) {
            ViewParent parent = c1720m32.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(c1720m32);
            }
        }
        C1720m3 c1720m33 = c1707l4.f15279e;
        if (c1720m33 != null) {
            C1797s3 c1797s3 = c1720m33.f15299b;
            if (c1797s3 != null) {
                c1797s3.destroy();
            }
            c1720m33.f15299b = null;
            c1720m33.c = null;
            c1720m33.f15300d = null;
            c1720m33.removeAllViews();
        }
        c1707l4.f15279e = null;
        c1707l4.f15281g = 1.0f;
        B b10 = c1707l4.c;
        if (b10 != null) {
            b10.c = 1.0f;
            b10.e();
        }
    }

    public final void a(int i10, int i11) {
        RelativeLayout.LayoutParams layoutParams;
        Activity activity = (Activity) this.f15276a.get();
        if (activity == null) {
            return;
        }
        AbstractC1600d9.b(this.f15280f);
        if (AbstractC1600d9.b(this.f15280f)) {
            layoutParams = new RelativeLayout.LayoutParams(i10, i11);
            layoutParams.addRule(11);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(i10, i11);
            layoutParams.addRule(12);
        }
        RelativeLayout relativeLayout = (RelativeLayout) ((FrameLayout) activity.findViewById(16908290)).findViewById(65519);
        kotlin.jvm.internal.g.b(relativeLayout);
        if (((RelativeLayout) relativeLayout.findViewById(65518)) != null) {
            C1720m3 c1720m3 = this.f15279e;
            if (c1720m3 == null) {
                return;
            }
            c1720m3.setLayoutParams(layoutParams);
            return;
        }
        C1720m3 c1720m32 = this.f15279e;
        if (c1720m32 != null) {
            relativeLayout.addView(c1720m32, layoutParams);
        }
    }
}
