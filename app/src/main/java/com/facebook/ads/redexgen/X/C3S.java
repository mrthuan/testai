package com.facebook.ads.redexgen.X;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.3S  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C3S {
    public static Field A00;
    public static boolean A01;
    public static Field A02;
    public static Field A03;
    public static boolean A04;
    public static boolean A05;
    public static byte[] A06;
    public static String[] A07 = {"02HXzqXk73QVshK", "Vd3PIQVGbymKr1peOQp46bHqBe5g9xLl", "HcoaSp9EGPDRlMz", "LE49K9mUXs4bvL0Dhr0uWsVmH5LUwBm4", "LDPLoHz6UrHGmx6GMbvpIivkJ6REIOLV", "AJsKzOma0c3h", "nSSDOEXzoGvtoIqz4QDa0TtkmnPlbH1G", "jHxdDI4CDuwq"};

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 29);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{-28, -72, -38, -38, -36, -22, -22, -32, -39, -32, -29, -32, -21, -16, -69, -36, -29, -36, -34, -40, -21, -36, -94, -126, -98, -93, 125, -102, -98, -100, -99, -87, -109, 115, -113, -108, 125, -113, -118, -102, -114, -32, -46, -41, -51, -40, -32};
    }

    static {
        A02();
        A01 = false;
    }

    private final long A00() {
        return ValueAnimator.getFrameDelay();
    }

    public int A03(View view) {
        return 0;
    }

    public int A04(View view) {
        return 0;
    }

    public int A05(View view) {
        if (!A04) {
            try {
                A02 = View.class.getDeclaredField(A01(22, 10, 24));
                A02.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            A04 = true;
        }
        if (A02 != null) {
            try {
                return ((Integer) A02.get(view)).intValue();
            } catch (Exception unused2) {
                return 0;
            }
        }
        return 0;
    }

    public int A06(View view) {
        if (!A05) {
            try {
                A03 = View.class.getDeclaredField(A01(32, 9, 9));
                A03.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            A05 = true;
        }
        if (A03 != null) {
            try {
                return ((Integer) A03.get(view)).intValue();
            } catch (Exception unused2) {
                return 0;
            }
        }
        return 0;
    }

    public Display A07(View view) {
        if (A0J(view)) {
            Object systemService = view.getContext().getSystemService(A01(41, 6, 76));
            if (A07[1].charAt(22) != 'H') {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[7] = "dM00LoaEDvCF";
            strArr[5] = "OddPVl80Vy9V";
            return ((WindowManager) systemService).getDefaultDisplay();
        }
        return null;
    }

    public C05193k A08(View view, C05193k c05193k) {
        return c05193k;
    }

    public C05193k A09(View view, C05193k c05193k) {
        return c05193k;
    }

    public void A0A(View view) {
        view.postInvalidate();
    }

    public void A0B(View view) {
        if (view instanceof C3A) {
            ((C3A) view).stopNestedScroll();
        }
    }

    public void A0C(View view, int i10) {
    }

    public void A0D(View view, Drawable drawable) {
        view.setBackgroundDrawable(drawable);
    }

    public final void A0E(View view, AnonymousClass37 anonymousClass37) {
        view.setAccessibilityDelegate(anonymousClass37 == null ? null : anonymousClass37.A00());
    }

    public void A0F(View view, C3D c3d) {
    }

    public void A0G(View view, Runnable runnable) {
        view.postDelayed(runnable, A00());
    }

    public void A0H(View view, Runnable runnable, long j10) {
        view.postDelayed(runnable, A00() + j10);
    }

    public boolean A0I(View view) {
        return false;
    }

    public boolean A0J(View view) {
        return view.getWindowToken() != null;
    }

    public final boolean A0K(View view) {
        if (A01) {
            return false;
        }
        Field field = A00;
        if (A07[6].charAt(21) == 'T') {
            A07[1] = "Q1ruOHxOk6WILPvKf2GjHGHRzmp539Hk";
            if (field == null) {
                try {
                    A00 = View.class.getDeclaredField(A01(0, 22, 90));
                    A00.setAccessible(true);
                } catch (Throwable unused) {
                    A01 = true;
                    if (A07[6].charAt(21) == 'T') {
                        String[] strArr = A07;
                        strArr[0] = "nDS37f2fXP1nkU7";
                        strArr[2] = "CEc31ZmnNMQB0dp";
                        return false;
                    }
                }
            }
            try {
                return A00.get(view) != null;
            } catch (Throwable unused2) {
                A01 = true;
                return false;
            }
        }
        throw new RuntimeException();
    }
}
