package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.NativeAd;

/* renamed from: com.facebook.ads.redexgen.X.aR  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1349aR implements PQ {
    public static String[] A03 = {"nDiRY7f5TVWQOdU6I2mqi9PFa0bJ0VdN", "dUUtDl8unUO3GnPy3lwgtNvfo3F9XuVE", "auWwlwtRUPVHuGctx8NQwZ9fHxwXm1Rl", "TBzFY5XPxTfovmrmdBuO6vWMd6W8Cva2", "LKANgRtOSZEoLNHfrBEFH87LShAEPYie", "UCBlHB7WfBTqWuynAgT0g", "VPae1XPQy5IfYkfssFJoJg5Ye50RabOh", "Wz70ndlImsTWQI2daID25L24SXF8SnWJ"};
    public final /* synthetic */ NativeAd A00;
    public final /* synthetic */ C1344aM A01;
    public final /* synthetic */ W7 A02;

    public C1349aR(C1344aM c1344aM, W7 w7, NativeAd nativeAd) {
        this.A01 = c1344aM;
        this.A02 = w7;
        this.A00 = nativeAd;
    }

    @Override // com.facebook.ads.redexgen.X.PQ
    public final void A9k() {
    }

    @Override // com.facebook.ads.redexgen.X.PQ
    public final void ABp(BN bn2) {
        new Handler(Looper.getMainLooper()).postDelayed(new C1350aS(this, bn2), 1L);
    }

    @Override // com.facebook.ads.redexgen.X.PQ
    public final void AC4() {
        BN bn2;
        BN bn3;
        bn2 = this.A01.A0A;
        if (bn2 != null) {
            bn3 = this.A01.A0A;
            String[] strArr = A03;
            if (strArr[4].charAt(31) == strArr[0].charAt(31)) {
                throw new RuntimeException();
            }
            A03[1] = "TOeEN4NbTJF6yCcoA7wHZFJASn52oXHD";
            bn3.A08();
        }
    }

    @Override // com.facebook.ads.redexgen.X.PQ
    public final void ADo(View view, MotionEvent motionEvent) {
        C1314Zs c1314Zs;
        boolean A0J;
        C0957Lv A19 = this.A02.A19();
        c1314Zs = this.A01.A07;
        A19.A06(c1314Zs, motionEvent, view, view);
        if (motionEvent.getAction() == 1) {
            A0J = this.A01.A0J(this.A00);
            if (!A0J && this.A02.A12() != null) {
                this.A02.A12().onClick(view);
            }
        }
    }
}
