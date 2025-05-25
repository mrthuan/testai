package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.internal.api.AdComponentViewApi;
import com.facebook.ads.internal.api.AdOptionsViewApi;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.ac  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1360ac extends C5Y implements AdOptionsViewApi {
    public static byte[] A03;
    public static String[] A04 = {"HVqi6jlpWuJt2YtXNdvGk3FhV0BHl3EV", "MmKJ6DDV7RS65o7dKLAsYGebg3Me5CTe", "1YJN2Qnc4ttaIZRVWQztvMy6euLicnbf", "AdY32lBMWhACAu5OzQBb3WT", "7pW2kqTunwh3p", "By284lxDKeQhXfwWoADF7ASQT9nDXNCZ", "", "3GcamP2dghLgpW6nys2YEXVC3i8y"};
    public static final int A05;
    public static final int A06;
    public final ImageView A00;
    public final ImageView A01;
    public final AdOptionsView A02;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 54);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {Field.ADDIN, 102, 115, 108, 113, 119, Field.QUOTE, Field.SECTIONPAGES, 103};
        String[] strArr = A04;
        if (strArr[3].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[3] = "u5VvbSB0F1Ye86S0UUtiEMk";
        strArr2[7] = "xkynJM0f4daSI4M9ryujsiLCexBq";
        A03 = bArr;
    }

    static {
        A02();
        A05 = (int) (LP.A02 * 23.0f);
        A06 = (int) (LP.A02 * 4.0f);
    }

    public C1360ac(final Context context, NativeAdBase nativeAdBase, NativeAdLayout nativeAdLayout, AdOptionsView.Orientation orientation, int i10, AdOptionsView adOptionsView) {
        int i11;
        this.A02 = adOptionsView;
        final LinearLayout linearLayout = new LinearLayout(context);
        this.A02.addView(linearLayout);
        if (orientation == AdOptionsView.Orientation.HORIZONTAL) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        linearLayout.setOrientation(i11);
        this.A01 = A00(MB.DEFAULT_INFO_ICON);
        this.A00 = A00(MB.AD_CHOICES_ICON);
        this.A00.setContentDescription(A01(0, 9, 53));
        linearLayout.addView(this.A01);
        linearLayout.addView(this.A00);
        setIconSizeDp(i10);
        setIconColor(-10459280);
        final W7 A0L = W7.A0L(nativeAdBase.getInternalNativeAd());
        A0L.A1U(nativeAdLayout);
        A0L.A1W(this);
        C1473cU A0y = A0L.A0y();
        if (A0y != null && A0y.A0R() && !A0y.A0P()) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.5N
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (KQ.A02(this)) {
                    return;
                }
                try {
                    A0L.A1I();
                    if (Build.VERSION.SDK_INT >= 16 && C0877Im.A2N(context)) {
                        linearLayout.performAccessibilityAction(128, null);
                    }
                } catch (Throwable th2) {
                    KQ.A00(th2, this);
                }
            }
        });
        LU.A04(this.A02, LU.A0C);
    }

    public C1360ac(Context context, NativeAdBase nativeAdBase, NativeAdLayout nativeAdLayout, AdOptionsView adOptionsView) {
        this(context, nativeAdBase, nativeAdLayout, AdOptionsView.Orientation.HORIZONTAL, 23, adOptionsView);
    }

    private ImageView A00(MB mb2) {
        ImageView imageView = new ImageView(this.A02.getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setPadding(A06, A06, A06, A06);
        imageView.setImageBitmap(MC.A01(mb2));
        return imageView;
    }

    public final void A03(MB mb2) {
        this.A01.setImageBitmap(MC.A01(mb2));
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final AdComponentViewApi getAdComponentViewApi() {
        return this;
    }

    @Override // com.facebook.ads.internal.api.AdOptionsViewApi
    public final void setIconColor(int i10) {
        this.A01.setColorFilter(i10);
        this.A00.setColorFilter(i10);
    }

    @Override // com.facebook.ads.internal.api.AdOptionsViewApi
    public final void setIconSizeDp(int i10) {
        int iconSize = Math.max(A05, (int) (LP.A02 * i10));
        LinearLayout.LayoutParams iconParams = new LinearLayout.LayoutParams(iconSize, iconSize);
        this.A01.setLayoutParams(iconParams);
        this.A00.setLayoutParams(iconParams);
    }

    @Override // com.facebook.ads.redexgen.X.C5Y, com.facebook.ads.internal.api.AdComponentView
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = -2;
        layoutParams.height = -2;
        super.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.internal.api.AdOptionsViewApi
    public final void setSingleIcon(boolean z10) {
        M3.A0N(this.A01, z10 ? 8 : 0);
    }
}
