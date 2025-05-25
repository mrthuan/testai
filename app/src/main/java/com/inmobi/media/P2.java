package com.inmobi.media;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.widget.ImageView;
import com.inmobi.ads.R;
import com.inmobi.media.P2;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes2.dex */
public final class P2 extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    public final byte f14567a;

    /* renamed from: b  reason: collision with root package name */
    public final A4 f14568b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x003f, code lost:
        if (r11 == 8) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004d A[Catch: Exception -> 0x0085, TryCatch #0 {Exception -> 0x0085, blocks: (B:37:0x0047, B:39:0x004d, B:41:0x005a, B:43:0x0073), top: B:52:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public P2(android.content.Context r10, byte r11, com.inmobi.media.A4 r12) {
        /*
            r9 = this;
            java.lang.String r0 = "CustomView"
            java.lang.String r1 = "null drawable id while creating button - "
            java.lang.String r2 = "new customView - "
            java.lang.String r3 = "context"
            kotlin.jvm.internal.g.e(r10, r3)
            r9.<init>(r10)
            r9.f14567a = r11
            r9.f14568b = r12
            if (r11 != 0) goto L15
            goto L41
        L15:
            r10 = 1
            if (r11 != r10) goto L19
            goto L45
        L19:
            r10 = 2
            if (r11 != r10) goto L1d
            goto L2c
        L1d:
            r10 = 3
            if (r11 != r10) goto L21
            goto L2c
        L21:
            r10 = 4
            if (r11 != r10) goto L25
            goto L2c
        L25:
            r10 = 5
            if (r11 != r10) goto L29
            goto L2c
        L29:
            r10 = 6
            if (r11 != r10) goto L2f
        L2c:
            r10 = 30
            goto L43
        L2f:
            r10 = 9
            if (r11 != r10) goto L34
            goto L41
        L34:
            r10 = 10
            if (r11 != r10) goto L39
            goto L41
        L39:
            r10 = 7
            if (r11 != r10) goto L3d
            goto L41
        L3d:
            r10 = 8
            if (r11 != r10) goto L45
        L41:
            r10 = 15
        L43:
            r8 = r10
            goto L47
        L45:
            r10 = 0
            goto L43
        L47:
            java.lang.Integer r10 = a(r11)     // Catch: java.lang.Exception -> L85
            if (r10 == 0) goto L71
            int r4 = r10.intValue()     // Catch: java.lang.Exception -> L85
            r3 = r9
            r5 = r8
            r6 = r8
            r7 = r8
            r3.a(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L85
            if (r12 == 0) goto L9e
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L85
            r10.<init>(r2)     // Catch: java.lang.Exception -> L85
            r10.append(r11)     // Catch: java.lang.Exception -> L85
            java.lang.String r11 = " created"
            r10.append(r11)     // Catch: java.lang.Exception -> L85
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Exception -> L85
            com.inmobi.media.B4 r12 = (com.inmobi.media.B4) r12     // Catch: java.lang.Exception -> L85
            r12.c(r0, r10)     // Catch: java.lang.Exception -> L85
            goto L9e
        L71:
            if (r12 == 0) goto L9e
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L85
            r10.<init>(r1)     // Catch: java.lang.Exception -> L85
            r10.append(r11)     // Catch: java.lang.Exception -> L85
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Exception -> L85
            com.inmobi.media.B4 r12 = (com.inmobi.media.B4) r12     // Catch: java.lang.Exception -> L85
            r12.b(r0, r10)     // Catch: java.lang.Exception -> L85
            goto L9e
        L85:
            r10 = move-exception
            com.inmobi.media.A4 r11 = r9.f14568b
            if (r11 == 0) goto L91
            com.inmobi.media.B4 r11 = (com.inmobi.media.B4) r11
            java.lang.String r12 = "exception while building customView"
            r11.a(r0, r12, r10)
        L91:
            com.inmobi.media.Q4 r11 = com.inmobi.media.Q4.f14590a
            java.lang.String r11 = "event"
            com.inmobi.media.J1 r10 = com.inmobi.media.AbstractC1863x4.a(r10, r11)
            com.inmobi.media.y5 r11 = com.inmobi.media.Q4.c
            r11.a(r10)
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.P2.<init>(android.content.Context, byte, com.inmobi.media.A4):void");
    }

    public static Integer a(byte b10) {
        if (b10 == 0) {
            return Integer.valueOf(R.drawable.im_close_button);
        }
        if (b10 == 1) {
            return Integer.valueOf(R.drawable.im_close_transparent);
        }
        if (b10 == 2) {
            return Integer.valueOf(R.drawable.im_close_icon);
        }
        if (b10 == 3) {
            return Integer.valueOf(R.drawable.im_refresh);
        }
        if (b10 == 4) {
            return Integer.valueOf(R.drawable.im_back);
        }
        if (b10 == 5) {
            return Integer.valueOf(R.drawable.im_forward_active);
        }
        if (b10 == 6) {
            return Integer.valueOf(R.drawable.im_forward_inactive);
        }
        if (b10 == 9) {
            return Integer.valueOf(R.drawable.im_mute);
        }
        if (b10 == 10) {
            return Integer.valueOf(R.drawable.im_unmute);
        }
        if (b10 == 7) {
            return Integer.valueOf(R.drawable.im_play);
        }
        if (b10 == 8) {
            return Integer.valueOf(R.drawable.im_pause);
        }
        return null;
    }

    public final void a(final int i10, final int i11, final int i12, final int i13, final int i14) {
        if (C1566b3.z()) {
            Icon.createWithResource(getContext(), i10).loadDrawableAsync(getContext(), new Icon.OnDrawableLoadedListener() { // from class: qb.h
                @Override // android.graphics.drawable.Icon.OnDrawableLoadedListener
                public final void onDrawableLoaded(Drawable drawable) {
                    P2.a(P2.this, i11, i12, i13, i14, drawable);
                }
            }, ((ExecutorC1639g6) G3.f14269d.getValue()).f15096a);
        } else {
            ((ScheduledThreadPoolExecutor) G3.c.getValue()).execute(new Runnable() { // from class: qb.i
                @Override // java.lang.Runnable
                public final void run() {
                    P2.a(P2.this, i10, i11, i12, i13, i14);
                }
            });
        }
    }

    public static final void a(P2 this$0, int i10, int i11, int i12, int i13, Drawable drawable) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        if (drawable == null) {
            A4 a42 = this$0.f14568b;
            if (a42 != null) {
                ((B4) a42).b("CustomView", a6.h.g(new StringBuilder("drawable for "), this$0.f14567a, " is null"));
                return;
            }
            return;
        }
        this$0.setImageDrawable(drawable);
        this$0.setPadding(i10, i11, i12, i13);
    }

    public static final void a(P2 this$0, int i10, int i11, int i12, int i13, int i14) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        Drawable drawable = androidx.core.content.a.getDrawable(this$0.getContext(), i10);
        if (drawable == null) {
            A4 a42 = this$0.f14568b;
            if (a42 != null) {
                ((B4) a42).b("CustomView", a6.h.g(new StringBuilder("CustomView drawable for "), this$0.f14567a, " cannot be created"));
                return;
            }
            return;
        }
        this$0.a(drawable, i11, i12, i13, i14);
    }

    public final void a(final Drawable drawable, final int i10, final int i11, final int i12, final int i13) {
        post(new Runnable() { // from class: qb.j
            @Override // java.lang.Runnable
            public final void run() {
                P2.a(P2.this, drawable, i10, i11, i12, i13);
            }
        });
    }

    public static final void a(P2 this$0, Drawable drawable, int i10, int i11, int i12, int i13) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(drawable, "$drawable");
        this$0.setImageDrawable(drawable);
        this$0.setPadding(i10, i11, i12, i13);
    }
}
