package com.facebook.ads.redexgen.X;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.pm.PackageManager;
import android.net.Uri;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class WQ implements JK {
    public static byte[] A01;
    public final C1314Zs A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 12);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Field.GREETINGLINE, Field.AUTOTEXTLIST, Field.HTMLCONTROL, 76, 77, Field.AUTOTEXTLIST, Field.ADVANCE, 103, 76, Field.ADDIN, Field.DOCPROPERTY, Field.ADDRESSBLOCK, Field.MERGESEQ, 76, Field.AUTOTEXTLIST, Field.DOCPROPERTY, Field.NOTEREF, 64, Field.AUTOTEXT, 74, Field.FORMTEXT, 77, Field.CONTROL, 124, Field.SECTIONPAGES, Field.FORMDROPDOWN, 74, 124, Field.DOCPROPERTY, Field.FORMTEXT, Field.ADDIN, 80, 74, 76, 77, 101, 105, 104, 114, 99, 104, 114, 60, 41, 41, 5, 2, 31, 24, 13, 0, 0, Field.MACROBUTTON, 30, 9, 10, 9, 30, 30, 9, 30, Field.INCLUDETEXT, Field.GREETINGLINE, 114, 78, Field.AUTOTEXTLIST, Field.SYMBOL, Field.DATA, 42, 34, Field.DATA, Field.DDEAUTO, 44, 22, Field.FILLIN, Field.DATA, 36, 44};
    }

    public WQ(C1314Zs c1314Zs) {
        this.A00 = c1314Zs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A03(String str, boolean z10, String str2, String str3, String str4, long j10) {
        this.A00.A0E().AAA(str);
        PackageManager packageManager = this.A00.getPackageManager();
        if (packageManager == null) {
            this.A00.A0E().AAF(str);
            return false;
        }
        ContentResolver contentResolver = this.A00.getContentResolver();
        if (contentResolver == null) {
            this.A00.A0E().AAC(str);
            return false;
        } else if (packageManager.resolveContentProvider(str, 0) == null) {
            this.A00.A0E().AAB(str);
            return false;
        } else {
            Uri parse = Uri.parse(A00(35, 10, 10) + str + A00(0, 1, 125) + str2);
            ContentValues values = new ContentValues();
            values.put(A00(17, 18, 47), (Integer) 1);
            values.put(A00(61, 5, 33), Boolean.valueOf(z10));
            values.put(A00(45, 16, 96), str3);
            values.put(A00(66, 12, 69), str4);
            values.put(A00(1, 16, 52), Long.valueOf(j10));
            try {
                contentResolver.insert(parse, values);
                this.A00.A0E().AAH(str);
                return true;
            } catch (UnsupportedOperationException unused) {
                this.A00.A0E().AAE(str);
                return false;
            } catch (Exception unused2) {
                this.A00.A0E().AAD(str);
                return false;
            }
        }
    }

    public final void A04(boolean z10, String str, String str2, String str3, long j10, boolean z11) {
        this.A00.A0E().AAG();
        M8.A06.execute(new WR(this, z10, str, str2, str3, j10, z11));
    }
}
