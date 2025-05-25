package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.app.AlertDialog;
import android.widget.EditText;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Executor;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.Vd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1199Vd implements MI {
    public static byte[] A04;
    public C1313Zr A00;
    public C8W A01;
    public InterfaceC1108Rq A02;
    public final Executor A03;

    static {
        A06();
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 53);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A04 = new byte[]{98, 103, 103, 97, 100, 105, 97, 99, 102, 98, 99, 96, 103, 97, 98, Field.BIDIOUTLINE, Field.CONTROL, Field.AUTOTEXTLIST, Field.GREETINGLINE, Field.ADDRESSBLOCK, Field.HTMLCONTROL, Field.LISTNUM, Field.BIDIOUTLINE, Field.GREETINGLINE, 86, 86, Field.HTMLCONTROL, Field.LISTNUM, Field.ADDRESSBLOCK, Field.LISTNUM, Field.SHAPE, 80, Field.LISTNUM, 80, Field.BIDIOUTLINE, Field.LISTNUM, 80, Field.ADDRESSBLOCK, Field.AUTOTEXTLIST, 80, 80, Field.GREETINGLINE, 80, Field.AUTOTEXTLIST, Field.HYPERLINK, 21, 80, 11, 15, Field.HTMLCONTROL, 80, 8, Field.HYPERLINK, 15, Field.HTMLCONTROL, Field.GREETINGLINE, Field.ADDRESSBLOCK, Field.BIDIOUTLINE, Field.GREETINGLINE, Field.ADDRESSBLOCK, Field.SHAPE, 8, Field.SHAPE, 10, Field.SHAPE, Field.AUTOTEXTLIST, 13, Field.GREETINGLINE, Field.AUTOTEXTLIST, Field.GREETINGLINE, 15, Field.BIDIOUTLINE, 11, 10, Field.HTMLCONTROL, Field.LISTNUM, 10, Field.HTMLCONTROL, Field.GREETINGLINE, 124, 115, 126, 120, 113, 109, Field.SECTION, Field.AUTOTEXTLIST, 0, Field.AUTOTEXT, Field.ADVANCE, Field.NOTEREF, Field.FILESIZE, 82, Field.FORMDROPDOWN, 0, 76, Field.AUTOTEXT, Field.FORMCHECKBOX, Field.TOA, 78, 0, Field.SECTION, Field.FORMDROPDOWN, 0, Field.AUTOTEXTLIST, Field.AUTOTEXT, Field.DOCPROPERTY, 0, Field.ADVANCE, Field.AUTOTEXT, 0, Field.INCLUDETEXT, Field.FILESIZE, Field.SECTIONPAGES, Field.DOCPROPERTY, Field.FORMCHECKBOX, 31, 0, 104, Field.AUTOTEXT, Field.CONTROL, 0, Field.INCLUDETEXT, Field.AUTOTEXT, 0, Field.AUTOTEXTLIST, Field.AUTOTEXT, Field.DOCPROPERTY, 0, 82, Field.FILESIZE, 80, 82, Field.AUTOTEXT, Field.INCLUDETEXT, Field.DOCPROPERTY, Field.INCLUDEPICTURE, Field.FILESIZE, 0, Field.ADVANCE, Field.NOTEREF, Field.FILESIZE, 0, Field.TOA, Field.FORMDROPDOWN, Field.FORMDROPDOWN, Field.DOCPROPERTY, Field.FILESIZE, 31, Field.AUTONUMLGL, 3, 8, 2, Field.FORMTEXT, Field.AUTONUMOUT, 3, 22, 9, 20, 18, Field.USERADDRESS, 1, 8, 29, Field.TOA, 33, 8, 25, 25, 12, 7, 12, 13, 86, Field.NUMWORDS, 25, 25, 31, 9, 9, Field.PAGEREF, 14, 21, 17, 31, 20, 25, Field.NUMWORDS, 14, 31, 29, 21, 8, 3, Field.PAGEREF, 19, 30, Field.GLOSSARY, 32, Field.PAGEREF, 41, 34, 56, 19, 56, Field.PAGEREF, 33, 41, 99, 108, 105, 101, 110, 116, Field.SHAPE, 116, 111, 107, 101, 110, Field.AUTOTEXTLIST, Field.DOCPROPERTY, Field.ADVANCE, Field.BIDIOUTLINE, Field.FORMDROPDOWN, Field.ADDRESSBLOCK, 101, Field.FORMDROPDOWN, Field.GREETINGLINE, 1, 0, 22, 6, 23, 12, 21, 17, 12, 10, 11, Field.GLOSSARY, Field.FILLIN, Field.AUTONUM, Field.QUOTE, Field.ASK, Field.QUOTE, Field.AUTONUM, Field.QUOTE, Field.SYMBOL, 61, Field.FILLIN, Field.IMPORT, 11, 61, 58, Field.GOTOBUTTON, 59, 116, 114, 100, 115, Field.GREETINGLINE, 104, 101, 100, 111, 117, 104, 103, 104, 100, 115};
    }

    public C1199Vd(Executor executor, C8W c8w, C1314Zs c1314Zs) {
        this.A00 = c1314Zs.A01();
        this.A02 = S8.A01(this.A00);
        this.A03 = executor;
        this.A01 = c8w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A02(String str) {
        S4 s4 = new S4();
        S4 s42 = new S4();
        S4 s43 = new S4();
        s4.put(A03(257, 15, 52), C6H.A00().A03());
        s4.put(A03(220, 9, 15), A03(15, 15, 91));
        s4.put(A03(ShapeTypes.CHART_STAR, 11, 79), A03(0, 15, 101));
        s4.put(A03(ShapeTypes.GEAR_9, 12, 79), A03(30, 48, 92));
        s4.put(A03(197, 11, 121), (System.currentTimeMillis() / 1000) + A03(0, 0, 108));
        String A09 = this.A01.A09();
        if (A09 != null) {
            s43.put(A03(208, 12, 53), A09);
        }
        s42.put(A03(229, 11, 80), str);
        s42.put(A03(248, 9, 97), LV.A01(s43));
        s4.A04(A03(240, 8, 119), LV.A01(s42));
        return s4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(C8W c8w) {
        this.A01 = c8w;
    }

    @Override // com.facebook.ads.redexgen.X.MI
    public final void ADZ() {
        Activity A00 = ActivityUtils.A00();
        if (A00 == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(A00);
        builder.setTitle(A03(160, 14, 92));
        EditText editText = new EditText(A00);
        editText.setSingleLine(false);
        editText.setImeOptions(1073741824);
        editText.setHint(A03(84, 65, 21));
        editText.setMaxLines(2);
        editText.setMinLines(2);
        builder.setView(editText);
        builder.setNegativeButton(A03(78, 6, 40), new MF(this));
        builder.setPositiveButton(A03(ShapeTypes.FLOW_CHART_SORT, 11, 83), new MG(this, editText));
        builder.create().show();
    }
}
