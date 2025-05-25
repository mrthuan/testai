package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import java.util.Map;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public class W9 implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener, InterfaceC06097e {
    public static byte[] A02;
    public static String[] A03 = {"2Mr7WzO4XT19fyb3DHhbNTMzGWXczG8b", "vf19oH1ZBxP9VPI3JVFDPhemIBzJ7OC4", "PwSJ9ELrmEQEpkj", "NKBqcIyQCWq", "qemkSyFbN3a9gQ2aUzusWvKKRIknTA5w", "Z", "UIuvCrnGUlyr13fhGKhlPOBYvJPgs1Zm", "jOlkEqTUPEoF6L4suBriQ9wTaVLjQjL5"};
    public final C1314Zs A00;
    public final /* synthetic */ W7 A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[7].charAt(17) == 't') {
                throw new RuntimeException();
            }
            A03[6] = "LYjyLl4kg8CHjw2beKSdtMq0XfNpXvKm";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            byte b10 = (byte) ((copyOfRange[i13] ^ i12) ^ 40);
            String[] strArr = A03;
            if (strArr[3].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A03[6] = "YSbRSDMNs4CLdH15XbZL4GcvXcpOIsjI";
            copyOfRange[i13] = b10;
            i13++;
        }
    }

    public static void A02() {
        A02 = new byte[]{101, 64, 4, Field.FORMCHECKBOX, Field.FILESIZE, 74, 74, Field.MERGESEQ, 80, 4, Field.FORMTEXT, Field.SECTION, 4, Field.FORMCHECKBOX, Field.NOTEREF, 77, Field.FORMCHECKBOX, Field.AUTOTEXT, Field.SECTION, 64, 4, Field.FORMTEXT, Field.SECTION, Field.SECTIONPAGES, Field.MERGESEQ, 86, Field.SECTION, 4, 77, 80, 4, 77, Field.CONTROL, 4, 82, 77, Field.SECTION, Field.FORMDROPDOWN, Field.SECTION, 64, 10, 42, 5, 0, 10, 2, 26, Field.TOA, 1, 8, 25, 25, 12, 7, 12, 13, Field.TOA, 29, 6, 6, Field.TOA, 15, 8, 26, 29, Field.FORMCHECKBOX, 13, 9, 10, Field.USERADDRESS, Field.GLOSSARY, 34, Field.DDEAUTO, Field.PAGEREF, Field.DATA, Field.DDEAUTO, 5, Field.DDEAUTO, Field.BARCODE, 60, 36, Field.SYMBOL, 32, 24, Field.SYMBOL, 118, 34, Field.SYMBOL, Field.QUOTE, Field.AUTONUMLGL, Field.USERADDRESS, 118, Field.GOTOBUTTON, Field.IMPORT, 34, Field.IMPORT, 118, 36, Field.MACROBUTTON, Field.AUTONUMLGL, Field.SYMBOL, 36, Field.GOTOBUTTON, Field.MACROBUTTON, Field.GOTOBUTTON, 122, 118, Field.ASK, 58, Field.MACROBUTTON, Field.IMPORT, Field.PAGEREF, Field.MACROBUTTON, 118, Field.MACROBUTTON, 56, Field.PAGEREF, Field.QUOTE, 36, Field.MACROBUTTON, 118, 34, Field.SYMBOL, Field.QUOTE, Field.AUTONUMLGL, Field.USERADDRESS, 118, Field.MACROBUTTON, 32, Field.MACROBUTTON, 56, 34, Field.PAGEREF, 118, 36, Field.MACROBUTTON, Field.IMPORT, Field.AUTONUMLGL, Field.USERADDRESS, 118, 34, Field.USERADDRESS, Field.MACROBUTTON, 118, Field.IMPORT, Field.GOTOBUTTON, 118, 0, Field.BARCODE, Field.MACROBUTTON, 33, 118, Field.AUTONUMOUT, Field.GLOSSARY, 118, 36, Field.MACROBUTTON, 34, Field.QUOTE, 36, 56, Field.BARCODE, 56, Field.EQ, 118, 48, Field.IMPORT, 58, Field.PAGEREF, Field.MACROBUTTON, 118, Field.BARCODE, 48, 118, Field.GLOSSARY, Field.SYMBOL, Field.QUOTE, 118, Field.BARCODE, 56, 34, Field.MACROBUTTON, 36, Field.AUTONUMLGL, Field.MACROBUTTON, Field.ASK, 34, 118, 34, Field.USERADDRESS, Field.MACROBUTTON, 118, Field.MACROBUTTON, 32, Field.MACROBUTTON, 56, 34, 120, 13, 11, 16, 120, 98, Byte.MAX_VALUE};
    }

    static {
        A02();
    }

    public W9(W7 w7, C1314Zs c1314Zs) {
        this.A01 = w7;
        this.A00 = c1314Zs;
    }

    public /* synthetic */ W9(W7 w7, C1314Zs c1314Zs, WI wi2) {
        this(w7, c1314Zs);
    }

    private Map<String, String> A01() {
        C1102Rk c1102Rk;
        C0957Lv c0957Lv;
        JX jx;
        boolean z10;
        boolean z11;
        JX jx2;
        O8 o82 = new O8();
        c1102Rk = this.A01.A0R;
        O8 A032 = o82.A03(c1102Rk);
        c0957Lv = this.A01.A0f;
        Map<String, String> A05 = A032.A02(c0957Lv).A05();
        jx = this.A01.A0I;
        if (jx != null) {
            jx2 = this.A01.A0I;
            A05.put(A00(201, 3, 62), String.valueOf(jx2.A05()));
        }
        z10 = this.A01.A0W;
        if (z10) {
            z11 = this.A01.A0W;
            A05.put(A00(198, 3, 75), String.valueOf(z11));
        }
        return A05;
    }

    private void A03(Map<String, String> extraData) {
        if (this.A01.A0a != null) {
            this.A01.A0a.A0M(extraData);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06097e
    public final C1314Zs A6G() {
        return this.A00;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0957Lv c0957Lv;
        C1314Zs c1314Zs;
        C0957Lv c0957Lv2;
        C1314Zs c1314Zs2;
        C0957Lv c0957Lv3;
        C0957Lv c0957Lv4;
        if (KQ.A02(this)) {
            return;
        }
        try {
            c0957Lv = this.A01.A0f;
            boolean A08 = c0957Lv.A08();
            String A00 = A00(66, 17, 99);
            if (!A08) {
                Log.e(A00, A00(83, 115, 126));
            }
            c1314Zs = this.A01.A0c;
            int minimumElapsedTime = C0877Im.A0I(c1314Zs);
            if (minimumElapsedTime >= 0) {
                c0957Lv3 = this.A01.A0f;
                if (c0957Lv3.A03() < minimumElapsedTime) {
                    c0957Lv4 = this.A01.A0f;
                    if (!c0957Lv4.A07()) {
                        Log.e(A00, A00(0, 41, 12));
                        return;
                    } else {
                        Log.e(A00, A00(41, 25, 65));
                        return;
                    }
                }
            }
            c0957Lv2 = this.A01.A0f;
            c1314Zs2 = this.A01.A0c;
            if (c0957Lv2.A09(c1314Zs2)) {
                if (this.A01.A0a != null) {
                    this.A01.A0a.A0N(A01());
                    return;
                }
                return;
            }
            A03(A01());
        } catch (Throwable th2) {
            KQ.A00(th2, this);
            String[] strArr = A03;
            if (strArr[1].charAt(15) != strArr[0].charAt(15)) {
                throw new RuntimeException();
            }
            A03[7] = "EqeSsMwGTYaeKofhe8hU7ULkNSCE0y6O";
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        View view2;
        O6 o62;
        O6 o63;
        View view3;
        View view4;
        O6 o64;
        O6 o65;
        view2 = this.A01.A04;
        if (view2 != null) {
            o62 = this.A01.A0L;
            if (o62 != null) {
                o63 = this.A01.A0L;
                view3 = this.A01.A04;
                int width = view3.getWidth();
                view4 = this.A01.A04;
                o63.setBounds(0, 0, width, view4.getHeight());
                o64 = this.A01.A0L;
                o65 = this.A01.A0L;
                o64.A0D(!o65.A0E());
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0957Lv c0957Lv;
        C1314Zs c1314Zs;
        View view2;
        View.OnTouchListener onTouchListener;
        View.OnTouchListener onTouchListener2;
        c0957Lv = this.A01.A0f;
        c1314Zs = this.A01.A0c;
        view2 = this.A01.A04;
        c0957Lv.A06(c1314Zs, motionEvent, view2, view);
        onTouchListener = this.A01.A02;
        if (onTouchListener != null) {
            onTouchListener2 = this.A01.A02;
            if (A03[2].length() == 9) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[1] = "w4fxh8qGKfQUI633kdvfD6D1dPFrXVB8";
            strArr[0] = "m7FEgH87ot2vGtV3LgABw7ULf2zod61Q";
            if (onTouchListener2.onTouch(view, motionEvent)) {
                return true;
            }
        }
        return false;
    }
}
