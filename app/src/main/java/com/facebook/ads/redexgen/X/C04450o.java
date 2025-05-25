package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import com.facebook.ads.internal.action.UserReturnTracker$UserReturnListener;
import com.facebook.ads.redexgen.X.C04450o;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.0o  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04450o {
    public static byte[] A06;
    public static String[] A07 = {"jjDsG8QlYrxY", "", "TMhFK0S9G1", "6qW7u5SP6R0wlmhQUiBuXDFp8yf", "n7Dasyj9dq5sG0xOL43e0c5rVQV9l70l", "dOqhBdKnx9bW", "a7CXWDqETze4gqUmjqRBhcRjVGu0d2y8", "nE3PHSl6bqsIePbBJ"};
    public Application A01;
    public UserReturnTracker$UserReturnListener A03;
    public final J7 A05;
    public long A00 = 0;
    public String A04 = null;
    public EnumC04380g A02 = null;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{Field.SHAPE, Field.BIDIOUTLINE, Field.GREETINGLINE, 86, 98, Field.TOA, Field.ADVANCE, 80, Field.HYPERLINK, 12, 5, 1, 22, 5, Field.BARCODE, 20, 9, 13, 5, 17, 11, 10, 29, 17, 19, Field.NUMWORDS};
    }

    static {
        A03();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.facebook.ads.internal.action.UserReturnTracker$UserReturnListener] */
    public C04450o(J7 j72, final Activity activity, int i10) {
        this.A05 = j72;
        this.A01 = activity.getApplication();
        this.A03 = new Application.ActivityLifecycleCallbacks(activity, this) { // from class: com.facebook.ads.internal.action.UserReturnTracker$UserReturnListener
            public C04450o A00;
            public final WeakReference<Activity> A01;

            {
                this.A01 = new WeakReference<>(activity);
                this.A00 = this;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity2, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity2) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity2) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity2) {
                if (this.A00 == null) {
                    return;
                }
                Activity trackedActivity = this.A01.get();
                if (trackedActivity == null || (trackedActivity != null && activity2.equals(trackedActivity))) {
                    this.A00.A05();
                    this.A00 = null;
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity2, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity2) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity2) {
            }
        };
    }

    public static C04450o A00(J7 j72, Activity activity) {
        return A01(j72, activity, Build.VERSION.SDK_INT);
    }

    public static C04450o A01(J7 j72, Activity activity, int i10) {
        if (activity != null && i10 >= 14) {
            return new C04450o(j72, activity, i10);
        }
        return null;
    }

    private void A04(String str, long j10, long j11, EnumC04380g enumC04380g) {
        HashMap hashMap = new HashMap();
        hashMap.put(A02(9, 10, 113), Long.toString(j10));
        hashMap.put(A02(0, 9, 44), Long.toString(j11));
        if (enumC04380g != null) {
            hashMap.put(A02(19, 7, 111), enumC04380g.name());
        }
        this.A05.AAZ(str, hashMap);
    }

    public final void A05() {
        A04(this.A04, this.A00, System.currentTimeMillis(), this.A02);
        if (this.A01 != null && this.A03 != null) {
            this.A01.unregisterActivityLifecycleCallbacks(this.A03);
            if (A07[1].length() != 0) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[5] = "Bj7dFfY1wcZx";
            strArr[0] = "MwUlwbTeTJkw";
            this.A03 = null;
            this.A01 = null;
        }
    }

    public final void A06(EnumC04380g enumC04380g) {
        this.A02 = enumC04380g;
    }

    public final void A07(String str) {
        this.A04 = str;
        if (this.A03 != null && this.A01 != null) {
            this.A00 = System.currentTimeMillis();
            this.A01.registerActivityLifecycleCallbacks(this.A03);
        } else if (A07[2].length() != 10) {
            throw new RuntimeException();
        } else {
            A07[3] = "P2oyl0IhOniiU9jQCrFtNFHhnuy";
            A04(str, -1L, -1L, EnumC04380g.A05);
        }
    }
}
