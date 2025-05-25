package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import p0.a;

/* compiled from: AppCompatCompoundButtonHelper.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final CompoundButton f2579a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f2580b = null;
    public PorterDuff.Mode c = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2581d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2582e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2583f;

    public g(CompoundButton compoundButton) {
        this.f2579a = compoundButton;
    }

    public final void a() {
        CompoundButton compoundButton = this.f2579a;
        Drawable a10 = b1.d.a(compoundButton);
        if (a10 != null) {
            if (this.f2581d || this.f2582e) {
                Drawable mutate = a10.mutate();
                if (this.f2581d) {
                    a.b.h(mutate, this.f2580b);
                }
                if (this.f2582e) {
                    a.b.i(mutate, this.c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053 A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:3:0x001a, B:5:0x0020, B:7:0x0026, B:11:0x0035, B:13:0x003b, B:15:0x0041, B:16:0x004c, B:18:0x0053, B:19:0x005a, B:21:0x0061), top: B:28:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061 A[Catch: all -> 0x0072, TRY_LEAVE, TryCatch #0 {all -> 0x0072, blocks: (B:3:0x001a, B:5:0x0020, B:7:0x0026, B:11:0x0035, B:13:0x003b, B:15:0x0041, B:16:0x004c, B:18:0x0053, B:19:0x005a, B:21:0x0061), top: B:28:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r6 = r9.f2579a
            android.content.Context r0 = r6.getContext()
            int[] r2 = k.a.f19441n
            r7 = 0
            androidx.appcompat.widget.u0 r8 = androidx.appcompat.widget.u0.m(r0, r10, r2, r11, r7)
            android.content.Context r1 = r6.getContext()
            android.content.res.TypedArray r4 = r8.f2688b
            r0 = r6
            r3 = r10
            r5 = r11
            x0.f0.n(r0, r1, r2, r3, r4, r5)
            r10 = 1
            boolean r11 = r8.l(r10)     // Catch: java.lang.Throwable -> L72
            if (r11 == 0) goto L32
            int r11 = r8.i(r10, r7)     // Catch: java.lang.Throwable -> L72
            if (r11 == 0) goto L32
            android.content.Context r0 = r6.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L32 java.lang.Throwable -> L72
            android.graphics.drawable.Drawable r11 = m.a.a(r0, r11)     // Catch: android.content.res.Resources.NotFoundException -> L32 java.lang.Throwable -> L72
            r6.setButtonDrawable(r11)     // Catch: android.content.res.Resources.NotFoundException -> L32 java.lang.Throwable -> L72
            goto L33
        L32:
            r10 = r7
        L33:
            if (r10 != 0) goto L4c
            boolean r10 = r8.l(r7)     // Catch: java.lang.Throwable -> L72
            if (r10 == 0) goto L4c
            int r10 = r8.i(r7, r7)     // Catch: java.lang.Throwable -> L72
            if (r10 == 0) goto L4c
            android.content.Context r11 = r6.getContext()     // Catch: java.lang.Throwable -> L72
            android.graphics.drawable.Drawable r10 = m.a.a(r11, r10)     // Catch: java.lang.Throwable -> L72
            r6.setButtonDrawable(r10)     // Catch: java.lang.Throwable -> L72
        L4c:
            r10 = 2
            boolean r11 = r8.l(r10)     // Catch: java.lang.Throwable -> L72
            if (r11 == 0) goto L5a
            android.content.res.ColorStateList r10 = r8.b(r10)     // Catch: java.lang.Throwable -> L72
            b1.c.c(r6, r10)     // Catch: java.lang.Throwable -> L72
        L5a:
            r10 = 3
            boolean r11 = r8.l(r10)     // Catch: java.lang.Throwable -> L72
            if (r11 == 0) goto L6e
            r11 = -1
            int r10 = r8.h(r10, r11)     // Catch: java.lang.Throwable -> L72
            r11 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.a0.c(r10, r11)     // Catch: java.lang.Throwable -> L72
            b1.c.d(r6, r10)     // Catch: java.lang.Throwable -> L72
        L6e:
            r8.n()
            return
        L72:
            r10 = move-exception
            r8.n()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.g.b(android.util.AttributeSet, int):void");
    }
}
