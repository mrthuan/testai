package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.6G  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6G {
    public static byte[] A01;
    public SharedPreferences A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ ShapeTypes.VERTICAL_SCROLL);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{41, 44, Field.USERADDRESS, Field.DDE, 58, 60, 33, 59, 33, Field.ASK, Field.GLOSSARY, 1, 44, 80, Field.FILESIZE, Field.FILESIZE, Field.INCLUDEPICTURE, Field.HYPERLINK, Field.FORMDROPDOWN, Field.INCLUDETEXT, Field.FILESIZE, Field.HYPERLINK, Field.GREETINGLINE, Field.SHAPE, 120, Field.DOCPROPERTY, Field.ADDRESSBLOCK, Field.SHAPE, Field.ADDRESSBLOCK, 86, Field.HTMLCONTROL, 106, 109, 24, 20, 22, Field.DOCPROPERTY, 29, 26, 24, 30, 25, 20, 20, 16, Field.DOCPROPERTY, 26, 31, 8, Field.DOCPROPERTY, 18, 31, 29, 26, 115, 118, 114, 118, 107, Field.GREETINGLINE, 123, Field.MERGESEQ, 109, 126, 124, 116, 118, 113, 120};
    }

    public C6G(C7j c7j) {
        this.A00 = c7j.getSharedPreferences(ProcessUtils.getProcessSpecificName(A00(33, 21, 4), c7j), 0);
    }

    public final C6F A02() {
        SharedPreferences sharedPreferences = this.A00;
        String A00 = A00(0, 13, 55);
        if (sharedPreferences.contains(A00)) {
            return new C6F(this.A00.getString(A00, A00(0, 0, 75)), this.A00.getBoolean(A00(54, 15, 96), false), C6E.A08, this.A00.getLong(A00(26, 7, 65), -1L));
        }
        return C6F.A00();
    }

    public final String A03() {
        return this.A00.getString(A00(13, 13, 78), A00(0, 0, 75));
    }

    public final void A04(C6F c6f) {
        SharedPreferences.Editor edit = this.A00.edit();
        edit.putString(A00(0, 13, 55), c6f.A03());
        edit.putBoolean(A00(54, 15, 96), c6f.A04());
        edit.putLong(A00(26, 7, 65), c6f.A01());
        edit.apply();
    }

    public final void A05(String str) {
        SharedPreferences.Editor edit = this.A00.edit();
        edit.putString(A00(13, 13, 78), str);
        edit.apply();
    }
}
