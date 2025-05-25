package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.io.IOException;
import java.util.Arrays;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public class ED implements Runnable {
    public static byte[] A02;
    public static String[] A03 = {"9o2RxoXQGzsRG5J758VgWnXZxAzPRq", "slrrPzhosaIRqTN91PQYW8eaCwjzQBbt", "YVDvad", "Ym", "53", "hXaHevQM6mpLzWC0IPGUKBJDuwqdnNoz", "RJB0f5QpOpSi3jWxIV2", "1FVstl0HMzPtGnzHv5PnFy0PCKNLlrql"};
    public final /* synthetic */ EL A00;
    public final /* synthetic */ DownloadAction[] A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 108);
            String[] strArr = A03;
            if (strArr[5].charAt(26) == strArr[7].charAt(26)) {
                throw new RuntimeException();
            }
            A03[3] = "nw";
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{78, 101, 125, 100, 102, 101, 107, 110, Field.FORMCHECKBOX, 107, 100, 107, 109, 111, 120, 103, 82, Field.FILESIZE, Field.INCLUDETEXT, Field.GREETINGLINE, Field.INCLUDETEXT, Field.INCLUDEPICTURE, Field.GREETINGLINE, Field.AUTOTEXTLIST, 80, 23, 86, Field.ADVANCE, Field.INCLUDEPICTURE, Field.GREETINGLINE, Field.HYPERLINK, Field.AUTOTEXTLIST, Field.INCLUDETEXT, 23, Field.ADDIN, 86, Field.GREETINGLINE, Field.HTMLCONTROL, 82, Field.FORMDROPDOWN, 25};
    }

    static {
        A01();
    }

    public ED(EL el2, DownloadAction[] downloadActionArr) {
        this.A00 = el2;
        this.A01 = downloadActionArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        E1 e12;
        if (KQ.A02(this)) {
            return;
        }
        try {
            try {
                e12 = this.A00.A09;
                e12.A02(this.A01);
            } catch (IOException e10) {
                Log.e(A00(0, 15, 102), A00(15, 26, 91), e10);
            }
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
