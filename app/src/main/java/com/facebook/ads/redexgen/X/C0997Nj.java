package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.Arrays;
import java.util.List;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.Nj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0997Nj extends LinearLayout {
    public static byte[] A0E;
    public static String[] A0F = {"SfnKd94fp0LIHLn5JRYBcVoydcWvvWC", "zcIUR0bnd2fDOpnzxhHInmQw6nqRGEtO", "", "Rlzv6bB7Czucpp1t79MjvCXFuIOZg8dc", "c1MACJD11uXVhN3Ickl6ZqMudEgzXQA", "WTgVZUaV9yT0hbCJXLqGbS", "77CVi", "3ZIeaeVMqGSC8jDTqrHFXNca0PmxnycW"};
    public static final int A0G;
    public static final int A0H;
    public static final Uri A0I;
    public static final View.OnTouchListener A0J;
    public ImageView A00;
    public ImageView A01;
    public ImageView A02;
    public ImageView A03;
    public LinearLayout A04;
    public InterfaceC0996Ni A05;
    public C1003Np A06;
    public String A07;
    public boolean A08;
    public final float A09;
    public final WebView A0A;
    public final C1314Zs A0B;
    public final InterfaceC1007Nt A0C;
    public final boolean A0D;

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 59);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A0E = new byte[]{-23, 8, 10, 18, -114, -73, -70, -66, -80, -22, 19, 22, Field.NUMWORDS, 5, 22, 8, -74, -41, -52, -43, -121, -43, -56, -37, -48, -35, -52, -121, -55, -39, -42, -34, -38, -52, -39, -6, -5, 8, 14, 13, -45, -5, 5, -6, 7, 4, 23, 36, 26, Field.DATA, Field.PAGEREF, 31, 26, -28, 31, 36, 42, Field.NUMWORDS, 36, 42, -28, 23, 25, 42, 31, Field.PAGEREF, 36, -28, 12, -1, -5, 13, 18, 30, Field.NUMCHARS, -35, 16, 29, 19, 33, 30, 24, 19, -35, 18, 23, 33, 30, Field.NUMCHARS, 20, -68, -56, -56, -60, -114, -125, -125, -53, -53, -53, -126, -70, -75, -73, -71, -74, -61, -61, -65, -126, -73, -61, -63};
    }

    static {
        A0A();
        A0G = Color.rgb(224, 224, 224);
        A0I = L5.A00(A06(90, 23, 25));
        A0J = new View$OnTouchListenerC0991Nd();
        A0H = Color.argb(34, 0, 0, 0);
    }

    public C0997Nj(C1314Zs c1314Zs, WebView webView) {
        this(c1314Zs, webView, false);
    }

    public C0997Nj(C1314Zs c1314Zs, WebView webView, boolean z10) {
        super(c1314Zs);
        this.A09 = getResources().getDisplayMetrics().density;
        this.A0C = new V0(this);
        this.A0A = webView;
        this.A0B = c1314Zs;
        this.A08 = AbstractC0878In.A06(c1314Zs);
        this.A0D = z10;
        A08();
    }

    private void A08() {
        int buttonSizePx;
        int i10 = (int) (this.A09 * 50.0f);
        M3.A0M(this, -1);
        setGravity(16);
        this.A01 = new ImageView(this.A0B);
        this.A01.setContentDescription(A06(4, 5, 16));
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(i10, i10);
        this.A01.setScaleType(ImageView.ScaleType.CENTER);
        this.A01.setImageBitmap(MC.A01(MB.BROWSER_CLOSE));
        this.A01.setOnTouchListener(A0J);
        this.A01.setOnClickListener(new View$OnClickListenerC0992Ne(this));
        addView(this.A01, layoutParams);
        if (this.A08 && !C0877Im.A2j(this.A0B)) {
            this.A00 = new ImageView(this.A0B);
            this.A00.setEnabled(false);
            this.A00.setAlpha(0.3f);
            this.A00.setContentDescription(A06(0, 4, 108));
            LinearLayout.LayoutParams backButtonParams = new LinearLayout.LayoutParams(i10, i10);
            this.A00.setScaleType(ImageView.ScaleType.CENTER);
            this.A00.setImageBitmap(MC.A01(MB.BACK_ARROW));
            this.A00.setOnTouchListener(A0J);
            this.A00.setOnClickListener(new View$OnClickListenerC0993Nf(this));
            addView(this.A00, backButtonParams);
        }
        this.A06 = new C1003Np(this.A0B);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        if (this.A08 || C0877Im.A2j(this.A0B)) {
            buttonSizePx = 1056964608;
        } else {
            buttonSizePx = 1065353216;
        }
        layoutParams2.weight = buttonSizePx;
        this.A06.setGravity(17);
        if (C0877Im.A2j(this.A0B) && !this.A0D) {
            this.A04 = new LinearLayout(this.A0B);
            this.A04.setOrientation(1);
            LinearLayout linearLayout = this.A04;
            int i11 = (int) (this.A09 * 2.0f);
            int buttonSizePx2 = (int) (this.A09 * 2.0f);
            linearLayout.setPadding(0, i11, 0, buttonSizePx2);
            layoutParams2.setMarginStart(0);
            addView(this.A04, layoutParams2);
            ImageView imageView = new ImageView(this.A0B);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageBitmap(MC.A01(MB.HANDLER));
            int i12 = (int) (this.A09 * 4.0f);
            int buttonSizePx3 = (int) (this.A09 * 4.0f);
            imageView.setPadding(0, i12, 0, buttonSizePx3);
            this.A04.addView(imageView, new LinearLayout.LayoutParams(-1, -2));
            LinearLayout.LayoutParams titleViewsParams = new LinearLayout.LayoutParams(-1, -2);
            this.A04.addView(this.A06, titleViewsParams);
        } else {
            addView(this.A06, layoutParams2);
        }
        if (this.A08 && !C0877Im.A2j(this.A0B)) {
            this.A02 = new ImageView(this.A0B);
            this.A02.setEnabled(false);
            this.A02.setAlpha(0.3f);
            this.A02.setContentDescription(A06(9, 7, 105));
            LinearLayout.LayoutParams titleViewsParams2 = new LinearLayout.LayoutParams(i10, i10);
            this.A02.setScaleType(ImageView.ScaleType.CENTER);
            this.A02.setImageBitmap(MC.A02(MB.BACK_ARROW));
            this.A02.setOnTouchListener(A0J);
            this.A02.setOnClickListener(new View$OnClickListenerC0994Ng(this));
            addView(this.A02, titleViewsParams2);
        }
        this.A03 = new ImageView(this.A0B);
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i10, i10);
        this.A03.setContentDescription(A06(16, 19, 44));
        this.A03.setScaleType(ImageView.ScaleType.CENTER);
        this.A03.setOnTouchListener(A0J);
        this.A03.setOnClickListener(new View$OnClickListenerC0995Nh(this));
        addView(this.A03, layoutParams3);
        A09();
    }

    private void A09() {
        PackageManager packageManager = this.A0B.getPackageManager();
        Bitmap bitmap = null;
        if (packageManager != null) {
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(new Intent(A06(46, 26, 123), A0I), 65536);
            if (queryIntentActivities.isEmpty()) {
                this.A03.setVisibility(8);
            } else {
                if (queryIntentActivities.size() == 1 && queryIntentActivities.get(0).activityInfo != null) {
                    if (A06(72, 18, 116).equals(queryIntentActivities.get(0).activityInfo.packageName)) {
                        MB mb2 = MB.BROWSER_LAUNCH_CHROME;
                        if (A0F[2].length() == 9) {
                            throw new RuntimeException();
                        }
                        String[] strArr = A0F;
                        strArr[4] = "u6Y9G9nX8SS9WzQYhqSHhnICOqiH6N8";
                        strArr[0] = "u87jsv4Qx8TBqcflHkBU630hheaj5W5";
                        bitmap = MC.A01(mb2);
                    }
                }
                bitmap = MC.A01(MB.BROWSER_LAUNCH_NATIVE);
            }
        }
        if (C0877Im.A2j(this.A0B)) {
            this.A03.setVisibility(0);
            bitmap = MC.A01(MB.BROWSER_LAUNCH_NATIVE);
        }
        this.A03.setImageBitmap(bitmap);
    }

    public InterfaceC1007Nt getBrowserNavigationListener() {
        return this.A0C;
    }

    public void setListener(InterfaceC0996Ni interfaceC0996Ni) {
        this.A05 = interfaceC0996Ni;
    }

    public void setTitle(String str) {
        this.A06.setTitle(str);
    }

    public void setUrl(String str) {
        this.A07 = str;
        if (TextUtils.isEmpty(this.A07) || A06(35, 11, 94).equals(this.A07)) {
            this.A06.setSubtitle(null);
            this.A03.setEnabled(false);
            this.A03.setColorFilter(new PorterDuffColorFilter(A0G, PorterDuff.Mode.SRC_IN));
            return;
        }
        this.A06.setSubtitle(this.A07);
        this.A03.setEnabled(true);
        this.A03.setColorFilter((ColorFilter) null);
    }
}
