package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.R;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class zzy {

    /* renamed from: a  reason: collision with root package name */
    public final AdSize[] f10263a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10264b;

    public zzy(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.f10038a);
        String string = obtainAttributes.getString(0);
        String string2 = obtainAttributes.getString(1);
        boolean z10 = !TextUtils.isEmpty(string);
        boolean isEmpty = true ^ TextUtils.isEmpty(string2);
        if (z10 && !isEmpty) {
            this.f10263a = a(string);
        } else if (!z10 && isEmpty) {
            this.f10263a = a(string2);
        } else if (z10) {
            obtainAttributes.recycle();
            throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
        } else {
            obtainAttributes.recycle();
            throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
        }
        String string3 = obtainAttributes.getString(2);
        this.f10264b = string3;
        obtainAttributes.recycle();
        if (!TextUtils.isEmpty(string3)) {
            return;
        }
        throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
    }

    public static AdSize[] a(String str) {
        int parseInt;
        int parseInt2;
        String[] split = str.split("\\s*,\\s*");
        int length = split.length;
        AdSize[] adSizeArr = new AdSize[length];
        for (int i10 = 0; i10 < split.length; i10++) {
            String trim = split[i10].trim();
            if (trim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] split2 = trim.split("[xX]");
                split2[0] = split2[0].trim();
                split2[1] = split2[1].trim();
                try {
                    if ("FULL_WIDTH".equals(split2[0])) {
                        parseInt = -1;
                    } else {
                        parseInt = Integer.parseInt(split2[0]);
                    }
                    if ("AUTO_HEIGHT".equals(split2[1])) {
                        parseInt2 = -2;
                    } else {
                        parseInt2 = Integer.parseInt(split2[1]);
                    }
                    adSizeArr[i10] = new AdSize(parseInt, parseInt2);
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(trim));
                }
            } else if ("BANNER".equals(trim)) {
                adSizeArr[i10] = AdSize.f10014i;
            } else if ("LARGE_BANNER".equals(trim)) {
                adSizeArr[i10] = AdSize.f10016k;
            } else if ("FULL_BANNER".equals(trim)) {
                adSizeArr[i10] = AdSize.f10015j;
            } else if ("LEADERBOARD".equals(trim)) {
                adSizeArr[i10] = AdSize.f10017l;
            } else if ("MEDIUM_RECTANGLE".equals(trim)) {
                adSizeArr[i10] = AdSize.f10018m;
            } else if ("SMART_BANNER".equals(trim)) {
                adSizeArr[i10] = AdSize.f10020o;
            } else if ("WIDE_SKYSCRAPER".equals(trim)) {
                adSizeArr[i10] = AdSize.f10019n;
            } else if ("FLUID".equals(trim)) {
                adSizeArr[i10] = AdSize.f10021p;
            } else if ("ICON".equals(trim)) {
                adSizeArr[i10] = AdSize.f10023r;
            } else {
                throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(trim));
            }
        }
        if (length != 0) {
            return adSizeArr;
        }
        throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(str));
    }
}
