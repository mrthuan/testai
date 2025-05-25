package com.inmobi.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.inmobi.ads.rendering.InMobiAdActivity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: com.inmobi.media.h8  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1655h8 {
    public static ViewGroup.LayoutParams a(W6 asset, ViewGroup parent) {
        kotlin.jvm.internal.g.e(asset, "asset");
        kotlin.jvm.internal.g.e(parent, "parent");
        X6 x62 = asset.f14788d;
        Point point = x62.f14841a;
        Point point2 = x62.c;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(a(point.x), a(point.y));
        if (parent instanceof C1598d7) {
            C1584c7 c1584c7 = new C1584c7(a(point.x), a(point.y));
            int a10 = a(point2.x);
            int a11 = a(point2.y);
            c1584c7.f14986a = a10;
            c1584c7.f14987b = a11;
            return c1584c7;
        } else if (parent instanceof LinearLayout) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(a(point.x), a(point.y));
            layoutParams2.setMargins(a(point2.x), a(point2.y), 0, 0);
            return layoutParams2;
        } else if (parent instanceof AbsListView) {
            return new AbsListView.LayoutParams(a(point.x), a(point.y));
        } else {
            if (parent instanceof FrameLayout) {
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(a(point.x), a(point.y));
                layoutParams3.setMargins(a(point2.x), a(point2.y), 0, 0);
                return layoutParams3;
            }
            HashMap hashMap = C1867x8.c;
            return layoutParams;
        }
    }

    public static int a(int i10) {
        int i11;
        return ((((Context) C1867x8.f15651e.get()) instanceof InMobiAdActivity) || (i11 = C1867x8.f15652f) == 0) ? i10 : (int) (((i11 * 1.0d) / C1867x8.f15653g) * i10);
    }

    public static void a(Context context, ImageView imageView) {
        Bitmap createBitmap;
        if (imageView.getDrawable() == null) {
            float f10 = AbstractC1692k3.d().c;
            P2 p22 = new P2(context, (byte) 0, null);
            if (Build.VERSION.SDK_INT < 28) {
                p22.layout(0, 0, (int) (a(40) * f10), (int) (a(40) * f10));
                p22.setDrawingCacheEnabled(true);
                p22.buildDrawingCache();
                createBitmap = p22.getDrawingCache();
                kotlin.jvm.internal.g.d(createBitmap, "getDrawingCache(...)");
            } else {
                p22.layout(0, 0, (int) (a(40) * f10), (int) (a(40) * f10));
                createBitmap = Bitmap.createBitmap((int) (a(40) * f10), (int) (a(40) * f10), Bitmap.Config.ARGB_8888);
                kotlin.jvm.internal.g.d(createBitmap, "createBitmap(...)");
                p22.draw(new Canvas(createBitmap));
            }
            imageView.setImageBitmap(createBitmap);
        }
    }

    public static final void a(TextView textView, List list) {
        HashMap hashMap = C1867x8.c;
        int paintFlags = textView.getPaintFlags();
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            int hashCode = str.hashCode();
            if (hashCode != -1178781136) {
                if (hashCode != -1026963764) {
                    if (hashCode != -891985998) {
                        if (hashCode == 3029637 && str.equals("bold")) {
                            i10 |= 1;
                        }
                    } else if (str.equals("strike")) {
                        paintFlags |= 16;
                    }
                } else if (str.equals("underline")) {
                    paintFlags |= 8;
                }
            } else if (str.equals("italic")) {
                i10 |= 2;
            }
        }
        textView.setTypeface(Typeface.DEFAULT, i10);
        textView.setPaintFlags(paintFlags);
    }

    public static void a(View view, X6 assetStyle) {
        kotlin.jvm.internal.g.e(view, "view");
        kotlin.jvm.internal.g.e(assetStyle, "assetStyle");
        int parseColor = Color.parseColor("#00000000");
        try {
            parseColor = Color.parseColor(assetStyle.a());
        } catch (IllegalArgumentException e10) {
            HashMap hashMap = C1867x8.c;
            Q4 q42 = Q4.f14590a;
            Q4.c.a(new J1(e10));
        }
        view.setBackgroundColor(parseColor);
        if (kotlin.jvm.internal.g.a("line", assetStyle.f14844e)) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(parseColor);
            if (kotlin.jvm.internal.g.a("curved", assetStyle.f14845f)) {
                gradientDrawable.setCornerRadius(assetStyle.f14847h);
            }
            int parseColor2 = Color.parseColor("#ff000000");
            try {
                String str = assetStyle.f14848i;
                Locale US = Locale.US;
                kotlin.jvm.internal.g.d(US, "US");
                String lowerCase = str.toLowerCase(US);
                kotlin.jvm.internal.g.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                parseColor2 = Color.parseColor(lowerCase);
            } catch (IllegalArgumentException e11) {
                HashMap hashMap2 = C1867x8.c;
                Q4 q43 = Q4.f14590a;
                Q4.c.a(new J1(e11));
            }
            gradientDrawable.setStroke(1, parseColor2);
            view.setBackground(gradientDrawable);
        }
    }

    public static final void a(View view) {
        HashMap hashMap = C1867x8.c;
        view.setBackground(null);
    }
}
