package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicBoolean;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.8e  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C06298e {
    public static byte[] A00;
    public static String[] A01 = {"45sljFocWSeUIm", "kFy0iLqCQu1rSjegRu3gZQBslrN28zfh", "Jt25Esr0vPr63IR3ofREXbE2F9XS", "aIy3uOWBpnLKLBqKI1xznCdUmB4uZWmr", "OU2R0KFOTNKkc0fC1q8eYWzKYBY", "OKiYeSmWG", "N6c8h1LLghxAImqWtVZLONNsuls", "y1x9YRSrIuYSzULWME6mF7szl8n2nmJ"};
    public static final String A02;
    public static final AtomicBoolean A03;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 54);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{108, 0, Field.IMPORT, 43, Field.DDEAUTO, Field.ASK, 1, Field.DDE, 44, 36, 43, Field.PAGEREF, 105, Field.FORMTEXT, 76, Field.LISTNUM, Field.FORMCHECKBOX, Field.SECTION, 76, 8, 123, 108, 99, 8, 74, Field.ADDRESSBLOCK, Field.SECTION, Field.INCLUDETEXT, Field.BIDIOUTLINE, 8, 78, Field.FORMCHECKBOX, Field.LISTNUM, 8, 80, 16, 30, 17, 6, 26, 31, 23, 12, 7, 10, 3, 22, 25, Field.AUTONUMLGL, Field.GLOSSARY, Field.AUTONUM, Field.USERADDRESS, 122, Field.AUTONUMOUT, Field.AUTONUMLGL, Field.DDEAUTO, 122, 59, Field.USERADDRESS, Field.USERADDRESS, 122, 42, 59, Field.DATA, 59, Field.IMPORT, Field.BARCODE, Field.DDEAUTO, Field.BARCODE, Field.DATA, 96, 21, 20, 19, 4, 22, 99, Field.MERGESEQ, Field.FORMDROPDOWN, 74, Field.FORMCHECKBOX, 82, Field.TOA, Field.ADVANCE, 20, Field.AUTONUM, 61, 42, Field.USERADDRESS, 60, Field.FILLIN, 58, 60, 61, Field.FILESIZE, 36, 74, Field.MACROBUTTON, 34, Field.SYMBOL, 13, 33, 59, Field.DATA, Field.IMPORT, 100, 117, 117, Field.LISTNUM, 118, 113, 100, 119, 113, 96, 97, Field.LISTNUM, 119, 96, 100, 118, 106, 107, Field.AUTOTEXT, Field.HYPERLINK, Field.INCLUDETEXT, Field.SECTION, Field.TOA, 114, Field.AUTOTEXTLIST, Field.ADVANCE, Field.ADDRESSBLOCK, Field.NOTEREF, 61, 60, 59, 44, Field.USERADDRESS, 6, Field.GLOSSARY, 56, Field.AUTONUMLGL, 44, 60, 15, 13, 6, 13, 26, 1, 11, 115, 123, 123, 115, 120, 113, Field.MERGESEQ, 103, 112, Byte.MAX_VALUE, 99, 121, Field.DOCPROPERTY, 110, 111, 104, Byte.MAX_VALUE, 109, 109, 107, 104, 102, 111, 12, 22, 58, 0, 8, 16, Field.CONTROL, 74, 78, Field.FORMTEXT, Field.AUTOTEXTLIST, 76, 77, Field.FORMTEXT, 124, 76, Field.FILESIZE, Field.FILESIZE, 80, Field.FORMTEXT, Field.CONTROL, Field.SHAPE, Field.INCLUDETEXT, Field.SECTION, Field.INCLUDETEXT, Field.FILESIZE, Field.ADDRESSBLOCK, Field.INCLUDETEXT};
    }

    static {
        A06();
        A02 = C06298e.class.getSimpleName();
        A03 = new AtomicBoolean();
    }

    public static int A00() {
        return TimeZone.getDefault().getRawOffset();
    }

    public static long A01(C7j c7j, String str) {
        try {
            PackageManager packageManager = c7j.getPackageManager();
            if (packageManager == null) {
                return -1L;
            }
            return new File(packageManager.getApplicationInfo(str, 0).publicSourceDir).length();
        } catch (Exception e10) {
            String[] strArr = A01;
            if (strArr[2].length() != strArr[7].length()) {
                String[] strArr2 = A01;
                strArr2[1] = "r1yKAsFrz8T6kTbDeRMAIryo3adSH8UC";
                strArr2[3] = "KmyFzAC6ois190XCewwcScJ1n5axjY80";
                if (A03.compareAndSet(false, true)) {
                    c7j.A07().AA0(A02(144, 7, 94), C8E.A1E, new C8F(e10));
                }
                return -1L;
            }
            throw new RuntimeException();
        }
    }

    public static String A03(Context context) {
        try {
            java.lang.reflect.Field buildType = Class.forName(context.getPackageName() + A02(0, 12, 116)).getDeclaredField(A02(37, 10, 101));
            return (String) buildType.get(null);
        } catch (Exception unused) {
            return A02(94, 3, 61);
        }
    }

    public static String A04(Context context) {
        try {
            java.lang.reflect.Field buildType = Class.forName(context.getPackageName() + A02(0, 12, 116)).getDeclaredField(A02(71, 5, 103));
            return String.valueOf(buildType.getBoolean(null));
        } catch (Exception unused) {
            return A02(94, 3, 61);
        }
    }

    public static String A05(C7j c7j, String str) {
        JSONObject jSONObject = new JSONObject();
        A07(c7j, jSONObject, A02(ShapeTypes.GEAR_9, 6, 83), String.valueOf(A08()));
        A07(c7j, jSONObject, A02(97, 8, 100), String.valueOf(A01(c7j, str)));
        A07(c7j, jSONObject, A02(ShapeTypes.MATH_EQUAL, 15, 21), String.valueOf(A00()));
        A07(c7j, jSONObject, A02(105, 18, 51), String.valueOf(AbstractC0923Kl.A01(c7j)));
        A07(c7j, jSONObject, A02(ShapeTypes.ACTION_BUTTON_BLANK, 13, 60), String.valueOf(A09(c7j)));
        A07(c7j, jSONObject, A02(ShapeTypes.FLOW_CHART_DECISION, 11, 111), A04(c7j));
        A07(c7j, jSONObject, A02(123, 10, 27), A03(c7j));
        return jSONObject.toString();
    }

    public static void A07(C7j c7j, JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e10) {
            if (c7j.A04().A9O()) {
                Log.e(A02, A02(47, 24, 108), e10);
            }
        }
    }

    public static boolean A08() {
        String str = Build.FINGERPRINT;
        String A022 = A02(144, 7, 94);
        if (!str.contains(A022) && !Build.FINGERPRINT.startsWith(A02(195, 7, 28))) {
            String str2 = Build.MODEL;
            String A023 = A02(ShapeTypes.FLOW_CHART_MERGE, 10, 34);
            if (!str2.contains(A023) && !Build.MODEL.contains(A02(76, 8, 16))) {
                String str3 = Build.MODEL;
                String[] strArr = A01;
                if (strArr[6].length() != strArr[4].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[6] = "CTJ6oNGQrsuCzXfrpGcSjdlcrxq";
                strArr2[4] = "Vk4ircYNHpPTfJ73X6WLPy0mTCx";
                if (!str3.contains(A02(12, 25, 30)) && !Build.MANUFACTURER.contains(A02(84, 10, 101)) && ((!Build.BRAND.startsWith(A022) || !Build.DEVICE.startsWith(A022)) && !A023.equals(Build.PRODUCT))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean A09(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }
}
