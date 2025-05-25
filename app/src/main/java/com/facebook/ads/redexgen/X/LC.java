package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public abstract class LC {
    public static byte[] A00;
    public static String[] A01 = {"jE5XhhYKQHpatPcaqKauHRorLHvmx36n", "j5XcoEcQeBll47Gmx6jJ35WP8DJmwvrw", "kVl1RLZeBZp6BFsBugJhIVOAvqqMASOM", "QSUK5zHpyvdae", "vPHRoVXEMWzbN", "yuxZo0oeIJp1om754wFfCKw5qfu7K2sC", "XIj7zi9aVzSGRkWRza9PLbW8qplNkm3M", "NShUMjU8EFbasu9WAPG4eHHUTqko21N4"};
    public static final Handler A02;
    public static final Set<String> A03;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 4);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{Field.FILLIN, Field.GLOSSARY, 107, 112, 122, 119, 115, 104, Byte.MIN_VALUE, 108, 107, Field.FILLIN, 109, 118, 121, Field.FILLIN, 123, 108, 122, 123, Field.FILLIN, 104, 107, 122, Field.FILLIN, 118, 117, 115, Byte.MIN_VALUE, 48, -78, -66, -68, 125, -75, -80, -78, -76, -79, -66, -66, -70, 125, -70, -80, -61, -80, -67, -80, -87, -75, -77, 116, -84, -89, -87, -85, -88, -75, -75, -79, 116, -67, -89, -79, -81, -64, -89, -71, -82, -81};
    }

    static {
        A03();
        A03 = new HashSet();
        A02 = new Handler(Looper.getMainLooper());
    }

    public static void A04(Context context, String str) {
        if (AdInternalSettings.isTestMode(context)) {
            String str2 = str + A01(0, 30, 3);
        }
    }

    public static void A05(C1313Zr c1313Zr, LZ lz, String str) {
        if (str == null || A03.contains(str)) {
            return;
        }
        boolean isPackageInstalled = A08(c1313Zr.getPackageManager(), str);
        if (isPackageInstalled) {
            lz.ACu(str);
            return;
        }
        A03.add(str);
        A02.removeCallbacksAndMessages(null);
        A02.postDelayed(new LB(new int[]{0}, str, c1313Zr, lz), 1000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A06(com.facebook.ads.redexgen.X.C1313Zr r6, java.lang.String r7) {
        /*
            java.lang.String r3 = r6.getPackageName()
            r2 = 30
            r1 = 19
            r0 = 75
            java.lang.String r0 = A01(r2, r1, r0)
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L4d
            java.lang.String r4 = r6.getPackageName()
            r5 = 49
            r3 = 22
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.LC.A01
            r0 = 1
            r1 = r2[r0]
            r0 = 0
            r2 = r2[r0]
            r0 = 0
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L35
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L35:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.LC.A01
            java.lang.String r1 = "j02YsboHYugdBqu3W2eQxUFjhHj6b2oh"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "jTJN86H0DvMYpZ5S4bGPoLkC3Jk4zW8z"
            r0 = 0
            r2[r0] = r1
            r0 = 66
            java.lang.String r0 = A01(r5, r3, r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L65
        L4d:
            r0 = 1
        L4e:
            r2 = 0
            if (r0 == 0) goto L5c
            android.os.Handler r0 = com.facebook.ads.redexgen.X.LC.A02
            r0.removeCallbacksAndMessages(r2)
            java.util.Set<java.lang.String> r0 = com.facebook.ads.redexgen.X.LC.A03
            r0.remove(r7)
        L5b:
            return
        L5c:
            com.facebook.ads.redexgen.X.2A r1 = com.facebook.ads.redexgen.X.C2B.A00(r6)
            r0 = 5
            r1.A0A(r7, r2, r0)
            goto L5b
        L65:
            r0 = 0
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.LC.A06(com.facebook.ads.redexgen.X.Zr, java.lang.String):void");
    }

    public static void A07(C1313Zr c1313Zr, String str, LZ lz) {
        boolean isWithinFB = c1313Zr.getPackageName().equals(A01(30, 19, 75)) || c1313Zr.getPackageName().equals(A01(49, 22, 66));
        if (isWithinFB) {
            A05(c1313Zr, lz, str);
        } else {
            C2B.A00(c1313Zr).A0A(str, lz, 4);
        }
    }

    public static boolean A08(PackageManager packageManager, String str) {
        if (packageManager == null) {
            return false;
        }
        try {
            packageManager.getPackageGids(str);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
