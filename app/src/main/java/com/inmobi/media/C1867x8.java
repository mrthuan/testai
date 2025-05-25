package com.inmobi.media;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Callback;
import com.squareup.picasso.RequestCreator;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import kotlin.Pair;

/* renamed from: com.inmobi.media.x8  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1867x8 {

    /* renamed from: d  reason: collision with root package name */
    public static volatile WeakReference f15650d;

    /* renamed from: a  reason: collision with root package name */
    public int f15654a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f15655b;
    public static final HashMap c = kotlin.collections.q.z0(new Pair(D7.class, (byte) 0), new Pair(Fa.class, (byte) 1), new Pair(Ea.class, (byte) 2), new Pair(C1598d7.class, (byte) 3), new Pair(ImageView.class, (byte) 6), new Pair(C1641g8.class, (byte) 7), new Pair(C1683j8.class, (byte) 4), new Pair(Button.class, (byte) 5), new Pair(O7.class, (byte) 8), new Pair(S9.class, (byte) 9), new Pair(R3.class, (byte) 10));

    /* renamed from: e  reason: collision with root package name */
    public static WeakReference f15651e = new WeakReference(null);

    /* renamed from: f  reason: collision with root package name */
    public static int f15652f = 1;

    /* renamed from: g  reason: collision with root package name */
    public static int f15653g = 1;

    public C1867x8(Context context) {
        f15651e = new WeakReference(context);
        this.f15655b = kotlin.collections.q.z0(new Pair((byte) 0, new C1777q8(this)), new Pair((byte) 3, new C1725m8(this)), new Pair((byte) 1, new C1841v8(this)), new Pair((byte) 2, new C1789r8(this)), new Pair((byte) 6, new C1764p8(this)), new Pair((byte) 10, new C1751o8(this)), new Pair((byte) 7, new C1828u8(this)), new Pair((byte) 4, new C1802s8(this)), new Pair((byte) 5, new C1738n8(this)), new Pair((byte) 8, new C1815t8(this)), new Pair((byte) 9, new C1854w8(this)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
        if (r0.equals("IMAGE") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007b, code lost:
        if (r0.equals("ICON") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007e, code lost:
        r0 = 6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View a(android.content.Context r6, com.inmobi.media.W6 r7, com.inmobi.commons.core.configs.AdConfig r8) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C1867x8.a(android.content.Context, com.inmobi.media.W6, com.inmobi.commons.core.configs.AdConfig):android.view.View");
    }

    public final void b(View view) {
        byte b10;
        Byte b11 = (Byte) c.get(view.getClass());
        if (b11 != null) {
            b10 = b11.byteValue();
        } else {
            b10 = -1;
        }
        if (-1 == b10) {
            view.toString();
            return;
        }
        AbstractC1711l8 abstractC1711l8 = (AbstractC1711l8) this.f15655b.get(Byte.valueOf(b10));
        if (abstractC1711l8 == null) {
            return;
        }
        if (this.f15654a >= 300) {
            int i10 = 0;
            AbstractC1711l8 abstractC1711l82 = null;
            for (Map.Entry entry : this.f15655b.entrySet()) {
                AbstractC1711l8 abstractC1711l83 = (AbstractC1711l8) entry.getValue();
                if (abstractC1711l83.f15287a.size() > i10) {
                    i10 = abstractC1711l83.f15287a.size();
                    abstractC1711l82 = abstractC1711l83;
                }
            }
            if (abstractC1711l82 != null && abstractC1711l82.f15287a.size() > 0) {
                abstractC1711l82.f15287a.removeFirst();
            }
        }
        abstractC1711l8.a(view);
    }

    public static final void a(C1867x8 c1867x8, Button button, W6 w62) {
        c1867x8.getClass();
        X6 x62 = w62.f14788d;
        kotlin.jvm.internal.g.c(x62, "null cannot be cast to non-null type com.inmobi.ads.modelsv2.NativeCtaAsset.NativeCtaAssetStyle");
        C1612e7 c1612e7 = (C1612e7) x62;
        button.setLayoutParams(new ViewGroup.LayoutParams(C1655h8.a(c1612e7.f14841a.x), C1655h8.a(c1612e7.f14841a.y)));
        Object obj = w62.f14789e;
        button.setText(obj instanceof CharSequence ? (CharSequence) obj : null);
        button.setTextSize(1, C1655h8.a(c1612e7.f14316l));
        int parseColor = Color.parseColor("#ff000000");
        try {
            String str = c1612e7.f14318n;
            Locale US = Locale.US;
            kotlin.jvm.internal.g.d(US, "US");
            String lowerCase = str.toLowerCase(US);
            kotlin.jvm.internal.g.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            parseColor = Color.parseColor(lowerCase);
        } catch (IllegalArgumentException e10) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(new J1(e10));
        }
        button.setTextColor(parseColor);
        int parseColor2 = Color.parseColor("#00000000");
        try {
            parseColor2 = Color.parseColor(c1612e7.a());
        } catch (IllegalArgumentException e11) {
            Q4 q43 = Q4.f14590a;
            Q4.c.a(new J1(e11));
        }
        button.setBackgroundColor(parseColor2);
        button.setTextAlignment(4);
        button.setGravity(17);
        C1655h8.a(button, c1612e7.f14319o);
        C1655h8.a(button, c1612e7);
    }

    public static final void a(C1867x8 c1867x8, ImageView imageView, W6 w62) {
        int i10;
        int i11;
        int i12;
        String str;
        c1867x8.getClass();
        Object obj = w62.f14789e;
        String str2 = obj instanceof String ? (String) obj : null;
        if (str2 != null) {
            int a10 = C1655h8.a(w62.f14788d.f14841a.x);
            int a11 = C1655h8.a(w62.f14788d.f14841a.y);
            String str3 = w62.f14788d.f14846g;
            if (kotlin.jvm.internal.g.a(str3, "aspectFit")) {
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            } else if (kotlin.jvm.internal.g.a(str3, "aspectFill")) {
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            } else {
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            }
            Context context = (Context) f15651e.get();
            if (context != null && a10 > 0 && a11 > 0) {
                int length = str2.length() - 1;
                int i13 = 0;
                boolean z10 = false;
                while (i13 <= length) {
                    boolean z11 = kotlin.jvm.internal.g.f(str2.charAt(!z10 ? i13 : length), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        }
                        length--;
                    } else if (z11) {
                        i13++;
                    } else {
                        z10 = true;
                    }
                }
                if (str2.subSequence(i13, length + 1).toString().length() > 0) {
                    C1712l9 c1712l9 = C1712l9.f15290a;
                    RequestCreator load = c1712l9.a(context).load(str2);
                    Object a12 = c1712l9.a(new C1697k8(context, imageView, w62));
                    kotlin.jvm.internal.g.c(a12, "null cannot be cast to non-null type com.squareup.picasso.Callback");
                    load.into(imageView, (Callback) a12);
                    if (kotlin.text.j.G("cross_button", w62.f14787b, true) && ((str = w62.f14800p) == null || str.length() == 0)) {
                        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC1669i8(context, imageView), 2000L);
                    }
                }
            }
            W6 w63 = w62.f14802r;
            if (w63 == null || !kotlin.jvm.internal.g.a("line", w63.f14788d.f14844e)) {
                i10 = 0;
                i11 = 0;
                i12 = 0;
            } else {
                X6 x62 = w63.f14788d;
                int i14 = x62.c.x == w62.f14788d.c.x ? 1 : 0;
                i11 = C1655h8.a(x62.f14841a.x) == C1655h8.a(w62.f14788d.f14841a.x) + w62.f14788d.c.x ? 1 : 0;
                i12 = C1655h8.a(w63.f14788d.c.y) == C1655h8.a(w62.f14788d.c.y) ? 1 : 0;
                r3 = C1655h8.a(w63.f14788d.f14841a.y) == C1655h8.a(w62.f14788d.c.y) + C1655h8.a(w62.f14788d.f14841a.y) ? 1 : 0;
                if (C1655h8.a(w63.f14788d.f14841a.x) == C1655h8.a(w62.f14788d.f14841a.x)) {
                    i10 = r3;
                    i11 = 1;
                    r3 = 1;
                } else {
                    i10 = r3;
                    r3 = i14;
                }
            }
            imageView.setPaddingRelative(r3, i12, i11, i10);
            C1655h8.a(imageView, w62.f14788d);
        }
    }

    public static final void a(C1867x8 c1867x8, TextView textView, W6 w62) {
        c1867x8.getClass();
        X6 x62 = w62.f14788d;
        kotlin.jvm.internal.g.c(x62, "null cannot be cast to non-null type com.inmobi.ads.modelsv2.NativeTextAsset.NativeTextAssetStyle");
        H7 h72 = (H7) x62;
        textView.setLayoutParams(new ViewGroup.LayoutParams(C1655h8.a(h72.f14841a.x), C1655h8.a(h72.f14841a.y)));
        Object obj = w62.f14789e;
        textView.setText(obj instanceof CharSequence ? (CharSequence) obj : null);
        textView.setTypeface(Typeface.DEFAULT);
        byte b10 = h72.f14317m;
        if (b10 == 0) {
            textView.setGravity(8388627);
        } else if (b10 == 1) {
            textView.setGravity(8388629);
        } else if (b10 == 2) {
            textView.setGravity(17);
        } else {
            textView.setGravity(8388627);
        }
        textView.setTextSize(1, C1655h8.a(h72.f14316l));
        int parseColor = Color.parseColor("#ff000000");
        try {
            String str = h72.f14318n;
            Locale US = Locale.US;
            kotlin.jvm.internal.g.d(US, "US");
            String lowerCase = str.toLowerCase(US);
            kotlin.jvm.internal.g.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            parseColor = Color.parseColor(lowerCase);
        } catch (IllegalArgumentException e10) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(new J1(e10));
        }
        textView.setTextColor(parseColor);
        int parseColor2 = Color.parseColor("#00000000");
        try {
            parseColor2 = Color.parseColor(h72.a());
        } catch (IllegalArgumentException e11) {
            Q4 q43 = Q4.f14590a;
            Q4.c.a(new J1(e11));
        }
        textView.setBackgroundColor(parseColor2);
        textView.setTextAlignment(1);
        C1655h8.a(textView, h72.f14319o);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setHorizontallyScrolling(true);
        textView.setFocusable(true);
        textView.setFocusableInTouchMode(true);
        C1655h8.a(textView, h72);
    }

    public final void a(View view) {
        kotlin.jvm.internal.g.e(view, "view");
        if (!(view instanceof D7) && !(view instanceof C1598d7)) {
            b(view);
            return;
        }
        C1598d7 c1598d7 = (C1598d7) view;
        if (c1598d7.getChildCount() == 0) {
            b(view);
            return;
        }
        Stack stack = new Stack();
        stack.push(c1598d7);
        while (!stack.isEmpty()) {
            C1598d7 c1598d72 = (C1598d7) stack.pop();
            int childCount = c1598d72.getChildCount();
            while (true) {
                childCount--;
                if (-1 < childCount) {
                    View childAt = c1598d72.getChildAt(childCount);
                    c1598d72.removeViewAt(childCount);
                    if (childAt instanceof C1598d7) {
                        stack.push(childAt);
                    } else {
                        kotlin.jvm.internal.g.b(childAt);
                        b(childAt);
                    }
                }
            }
            b(c1598d72);
        }
    }

    public static void a(O7 o72, W6 w62) {
        long a10;
        o72.setVisibility(4);
        kotlin.jvm.internal.g.c(w62, "null cannot be cast to non-null type com.inmobi.ads.modelsv2.NativeTimerAsset");
        L7 l72 = (L7) w62;
        K7 k72 = l72.f14433x;
        J7 j72 = k72.f14397a;
        J7 j73 = k72.f14398b;
        if (j72 != null) {
            try {
                a10 = j72.a();
            } catch (Exception e10) {
                Q4 q42 = Q4.f14590a;
                Q4.c.a(AbstractC1863x4.a(e10, "event"));
                return;
            }
        } else {
            a10 = 0;
        }
        long a11 = j73 != null ? j73.a() : 0L;
        if (a11 >= 0) {
            o72.setTimerValue(a11);
            new Handler(Looper.getMainLooper()).postDelayed(new f0.s(15, l72, o72), a10 * 1000);
        }
    }

    public static final void a(L7 timerAsset, O7 timerView) {
        kotlin.jvm.internal.g.e(timerAsset, "$timerAsset");
        kotlin.jvm.internal.g.e(timerView, "$timerView");
        if (f15651e.get() != null) {
            if (timerAsset.f14434y) {
                timerView.setVisibility(0);
            }
            timerView.d();
        }
    }
}
