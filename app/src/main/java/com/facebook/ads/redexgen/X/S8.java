package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: assets/audience_network.dex */
public final class S8 {
    public static InterfaceC1106Ro A00;
    public static byte[] A01;
    public static final Set<String> A02;
    public static final Set<String> A03;
    public static final AtomicBoolean A04;

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 29);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A01 = new byte[]{Field.MACROBUTTON, 114, 121, 9, Field.ADVANCE, Field.FILESIZE, 113, Field.IMPORT, Field.IMPORT, 120, 5, 112, 1, 25, Field.MACROBUTTON, 18, 114, Field.GLOSSARY, 24, 117, 44, Field.DDEAUTO, 36, 43, 114, Field.DATA, Field.IMPORT, 48, 114, 21, Field.GLOSSARY, Field.MACROBUTTON, 43, 125, 74, Field.BARCODE, 96, Field.FORMCHECKBOX, 122, 102, Field.SECTIONPAGES, Byte.MAX_VALUE, 106, 97, 126, 98, Field.FILLIN, Field.HTMLCONTROL, 97, 106, Field.NOTEREF, 100, 122, 126, Field.USERADDRESS, 101, Field.LISTNUM, 100, Field.QUOTE, 117, Field.GREETINGLINE, Byte.MAX_VALUE, Field.EQ, 6, Field.ADDIN, Field.QUOTE, 43, Field.SECTIONPAGES, 103, 86, Field.FILLIN, 106, Field.SHAPE, 80, 119, Byte.MAX_VALUE, 122, Field.FILLIN, 97, 99, 103, 106, 98, 82, 86, 112, 105, Field.MERGESEQ, Field.BIDIOUTLINE, 118, 82, Field.DDEAUTO, 25, Field.HYPERLINK, 115, 98, 97, 121, 100, 125, Byte.MAX_VALUE, 120, 113, Field.AUTONUM, 116, 115, 112, 121, 100, 115, Field.AUTONUM, Byte.MAX_VALUE, 120, Byte.MAX_VALUE, 98, Field.IMPORT, Field.FORMDROPDOWN, Field.ADDIN, Field.FORMDROPDOWN, Field.SECTIONPAGES, 61, 106, 101, Field.ADDIN, 105, 111, 64, 109, 32, Byte.MAX_VALUE, 106, Field.GREETINGLINE, Field.AUTOTEXTLIST, 111, 101, 114, Field.GREETINGLINE, Field.INCLUDEPICTURE, Field.USERADDRESS, 98, 123, 108, Field.FORMTEXT, Field.AUTONUM, 1, 15, 7, Field.NUMCHARS, 30, 2, 15, 0, 11, Field.EQ, 3, 1, 10, 11, Field.EQ, 1, 0, 29, 22, 7, 4, Field.NUMCHARS, 1, 24, 33, 58, 15, 103, 18, 7, 59, 7, Field.BARCODE, 22, 108, 5, 96, 3, 3, 0, Field.EQ, 22, Field.PAGEREF, 26, Field.FILLIN, 19, 29, 109, Field.SYMBOL, Field.MACROBUTTON, 4, 104, Field.SHAPE};
    }

    static {
        A07();
        A02 = new HashSet();
        A03 = new HashSet();
        A02.add(A05(6, 29, 93));
        A03.add(A05(ShapeTypes.ACTION_BUTTON_BEGINNING, 29, 72));
        A03.add(A05(35, 29, 17));
        A03.add(A05(64, 29, 14));
        A03.add(A05(116, 29, 22));
        A04 = new AtomicBoolean();
    }

    public static InterfaceC1108Rq A00(C7j c7j) {
        return A03(true, c7j);
    }

    public static InterfaceC1108Rq A01(C7j c7j) {
        return A02(true, c7j);
    }

    public static InterfaceC1108Rq A02(boolean z10, C7j c7j) {
        C1112Ru c1112Ru = new C1112Ru();
        C1115Rx networkModuleRequestConfigurationBuilder = A04(c7j);
        if (!A0B(c7j)) {
            c1112Ru.A02(A03);
            c1112Ru.A01(A02);
        }
        if (L7.A04()) {
            networkModuleRequestConfigurationBuilder.A08(L7.A02());
        }
        LF A002 = AbstractC1110Rs.A00();
        C1112Ru networkModuleConfigurationBuilder = c1112Ru.A00(networkModuleRequestConfigurationBuilder.A09());
        return A002.A00(networkModuleConfigurationBuilder.A03(z10).A04(c7j.A04().A9O()).A05(), c7j.A07(), M8.A01());
    }

    public static InterfaceC1108Rq A03(boolean z10, C7j c7j) {
        return AbstractC1110Rs.A00().A00(new C1112Ru().A03(z10).A00(A04(c7j).A09()).A04(c7j.A04().A9O()).A05(), c7j.A07(), M8.A01());
    }

    public static C1115Rx A04(C7j c7j) {
        A08(c7j);
        C1115Rx c1115Rx = new C1115Rx();
        if (A0B(c7j) || L7.A04()) {
            c1115Rx.A02(360000).A04(120000);
        } else {
            c1115Rx.A02(C0877Im.A09(c7j)).A04(C0877Im.A0B(c7j));
        }
        c1115Rx.A03(C0877Im.A0A(c7j)).A05(C0877Im.A0C(c7j)).A06(C0877Im.A0D(c7j));
        synchronized (S8.class) {
            if (A00 != null && (A00 instanceof InterfaceC1106Ro)) {
                c1115Rx.A07(A00);
            }
        }
        return c1115Rx;
    }

    public static void A06() {
        A04.set(true);
    }

    public static void A08(C7j c7j) {
        if (!A04.get()) {
            c7j.A07().AA0(A05(ShapeTypes.ACTION_BUTTON_BLANK, 7, 110), C8E.A21, new C8F(A05(93, 23, 11)));
        }
    }

    public static synchronized void A09(InterfaceC1106Ro interfaceC1106Ro) {
        synchronized (S8.class) {
            A00 = interfaceC1106Ro;
        }
    }

    public static boolean A0A(C7j c7j) {
        int i10 = Build.VERSION.SDK_INT;
        String A05 = A05(ShapeTypes.FLOW_CHART_PUNCHED_TAPE, 16, 115);
        return i10 < 17 ? Settings.System.getInt(c7j.getContentResolver(), A05, 0) != 0 : Settings.Global.getInt(c7j.getContentResolver(), A05, 0) != 0;
    }

    public static boolean A0B(C7j c7j) {
        String A8d = c7j.A04().A8d();
        if (!TextUtils.isEmpty(A8d)) {
            String urlPrefix = A05(3, 3, 58);
            if (!A8d.endsWith(urlPrefix)) {
                String urlPrefix2 = A05(0, 3, 0);
                if (A8d.endsWith(urlPrefix2)) {
                }
            }
            return true;
        }
        return false;
    }
}
