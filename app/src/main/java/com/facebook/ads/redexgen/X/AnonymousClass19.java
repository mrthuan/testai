package com.facebook.ads.redexgen.X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.io.Serializable;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.19  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass19 extends BroadcastReceiver {
    public static byte[] A03;
    public static String[] A04 = {"Zajbq5JOCnWrQ3Qr", "TCN1z34NH4GHaAlQvwLAm", "H6zcI", "fG9vyRzubE117ecaxLAWdwziYhb1qpFD", "HGvL5kVmbL0dgsivMgEslo9gYSg3Drcz", "onuj3", "bRQo93cAMXtZyJucWKt", "haBpxRpvqIWUs6HGbuX"};
    public Context A00;
    public C0720Bu A01;
    public boolean A02 = false;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 51);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{Field.AUTONUMLGL, 24, 20, 22, Field.DOCPROPERTY, 29, 26, 24, 30, 25, 20, 20, 16, Field.DOCPROPERTY, 26, 31, 8, Field.DOCPROPERTY, 18, 21, 15, 30, 9, 8, 15, 18, 15, 18, 26, 23, Field.DOCPROPERTY, 31, 18, 8, 11, 23, 26, 2, 30, 31, Field.IMPORT, 59, Field.SYMBOL, 122, Field.GOTOBUTTON, Field.AUTONUMLGL, Field.IMPORT, Field.EQ, Field.AUTONUM, 59, 59, Field.BARCODE, 122, Field.AUTONUMLGL, 48, Field.FILLIN, 122, 61, 58, 32, Field.EQ, Field.ASK, Field.FILLIN, 32, 61, 32, 61, Field.AUTONUMLGL, 56, 122, 48, 61, Field.FILLIN, 36, 56, Field.AUTONUMLGL, Field.DDE, Field.EQ, 48, 110, Field.ADDIN, Field.SECTIONPAGES, Field.ADDIN, Field.LISTNUM, 64, Field.TOA, Field.BIDIOUTLINE, Field.MERGESEQ, Field.SHAPE, 86, Field.MERGESEQ, Field.ADVANCE, 122, 77, Field.HYPERLINK, 122, Field.DOCPROPERTY, 80, Field.LISTNUM, 82, Field.FORMCHECKBOX, 82, Field.FILESIZE, Field.ADDIN, Field.HYPERLINK, Field.FILESIZE, Field.LISTNUM, 116, Field.INCLUDEPICTURE, 86, 116, Field.HTMLCONTROL, Field.GREETINGLINE, Field.ADVANCE, Field.BIDIOUTLINE, 13, Field.LISTNUM, Field.FILESIZE, Field.NOTEREF, Field.TOA, Field.INCLUDEPICTURE, 101, Field.SECTIONPAGES, Field.HYPERLINK, Field.TOA, Field.GREETINGLINE, Field.SHAPE, Field.HYPERLINK, Field.FILESIZE, Field.HYPERLINK, 77, 64, 105, Field.LISTNUM, Field.TOA, Field.SECTIONPAGES, Field.HYPERLINK, 105, 118, 123, 122, 112, 86, 113, 107, 122, 109, 108, 107, 118, 107, 126, 115, Field.LISTNUM, 105, 122, 113, 107, Field.PAGEREF};
    }

    static {
        A01();
    }

    public AnonymousClass19(C0720Bu c0720Bu, Context context) {
        this.A01 = c0720Bu;
        this.A00 = context;
    }

    public final void A02() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(A00(40, 40, 103) + this.A01.getUniqueId());
        intentFilter.addAction(A00(ShapeTypes.FLOW_CHART_DOCUMENT, 22, 44) + this.A01.getUniqueId());
        intentFilter.addAction(A00(100, 16, 4) + this.A01.getUniqueId());
        C04972o.A00(this.A00).A06(this, intentFilter);
    }

    public final void A03() {
        try {
            C04972o.A00(this.A00).A05(this);
        } catch (Exception unused) {
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        String action2 = A00(0, 1, 60);
        String[] split = action.split(action2);
        if (split.length != 2) {
            return;
        }
        String str = split[1];
        String action3 = this.A01.getUniqueId();
        if (!str.equals(action3)) {
            return;
        }
        String str2 = split[0];
        String[] strArr = A04;
        String str3 = strArr[6];
        String action4 = strArr[7];
        if (str3.length() == action4.length()) {
            String[] strArr2 = A04;
            strArr2[1] = "cVmv3UmH0jQ76579UnKAx";
            strArr2[0] = "Daa9OCgAFjmRw5DI";
            String action5 = A00(1, 39, 72);
            if (str2.equals(action5)) {
                if (this.A01.getListener() != null) {
                    this.A01.getListener().ABq();
                    this.A01.getListener().AEB();
                    return;
                }
                return;
            }
            String str4 = split[0];
            String action6 = A00(116, 21, 31);
            if (str4.equals(action6)) {
                String action7 = A00(80, 5, 7);
                Serializable serializableExtra = intent.getSerializableExtra(action7);
                if (serializableExtra instanceof R6) {
                    if (this.A01.getListener() != null) {
                        this.A01.getListener().ABw();
                        this.A01.getListener().AEB();
                    }
                    if (this.A02) {
                        this.A01.A0Y(1);
                    } else {
                        this.A01.A0Y(((R6) serializableExtra).A01());
                    }
                    this.A01.setVisibility(0);
                    this.A01.A0b(EnumC1084Qs.A04, 1);
                    return;
                } else if (serializableExtra instanceof C1123Sf) {
                    if (this.A01.getListener() == null) {
                        return;
                    }
                    C0720Bu c0720Bu = this.A01;
                    String[] strArr3 = A04;
                    String str5 = strArr3[6];
                    String action8 = strArr3[7];
                    if (str5.length() == action8.length()) {
                        String[] strArr4 = A04;
                        strArr4[3] = "8JMcdO2ddwvsOz1l0eACjHxgYswUY7yr";
                        strArr4[4] = "ZybcsncwY6JEIQQDyQcFnHvjYhNwtivs";
                        c0720Bu.getListener().AC3();
                        return;
                    }
                } else if (serializableExtra instanceof C1122Se) {
                    if (this.A01.getListener() == null) {
                        return;
                    }
                    this.A01.getListener().AC5();
                    return;
                } else if (serializableExtra instanceof C9R) {
                    if (this.A01.getListener() != null) {
                        this.A01.getListener().ABZ();
                    }
                    this.A02 = true;
                    return;
                } else if (serializableExtra instanceof SZ) {
                    if (this.A01.getListener() != null) {
                        this.A01.getListener().AD1();
                    }
                    this.A02 = false;
                    return;
                } else {
                    boolean z10 = serializableExtra instanceof C9P;
                    String[] strArr5 = A04;
                    String str6 = strArr5[5];
                    String action9 = strArr5[2];
                    if (str6.length() == action9.length()) {
                        String[] strArr6 = A04;
                        strArr6[5] = "0aNC0";
                        strArr6[2] = "prrJE";
                        if (!z10 || this.A01.getListener() == null) {
                            return;
                        }
                        this.A01.getListener().onPause();
                        return;
                    }
                }
            } else {
                String str7 = split[0];
                String[] strArr7 = A04;
                String str8 = strArr7[1];
                String action10 = strArr7[0];
                if (str8.length() != action10.length()) {
                    String[] strArr8 = A04;
                    strArr8[6] = "hQHl7K2LkQxZ3MVJZ2W";
                    strArr8[7] = "MyC8C5hgly0WituHMEy";
                    String action11 = A00(85, 15, 10);
                    if (!str7.equals(action11)) {
                        return;
                    }
                } else {
                    String[] strArr9 = A04;
                    strArr9[3] = "OiP3hK9qgel9CjGx7GeTViZjY0DdeBQ1";
                    strArr9[4] = "Kg9TdH9JmWDwVESkwLvI07zIYN1y95Tk";
                    String action12 = A00(70, 4, 4);
                    if (!str7.equals(action12)) {
                        return;
                    }
                }
                this.A01.A0n();
                return;
            }
        }
        throw new RuntimeException();
    }
}
