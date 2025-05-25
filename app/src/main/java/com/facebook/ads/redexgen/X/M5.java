package com.facebook.ads.redexgen.X;

import android.os.AsyncTask;
import android.os.Build;
import java.util.Arrays;
import java.util.concurrent.Executor;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public abstract class M5 {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 25);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{77, Field.SECTIONPAGES, Field.NOTEREF, Field.GREETINGLINE, Field.INCLUDEPICTURE, Field.FILESIZE, Field.NOTEREF, 2, Field.INCLUDEPICTURE, Field.SHAPE, 2, 109, Field.SHAPE, Field.DOCPROPERTY, Field.SECTIONPAGES, Field.AUTOTEXT, 120, 77, Field.SHAPE, Field.FORMCHECKBOX};
    }

    public static <P, PR, R> AsyncTask<P, PR, R> A00(Executor executor, AsyncTask<P, PR, R> task, P... params) {
        if (Build.VERSION.SDK_INT >= 11) {
            task.executeOnExecutor(executor, params);
        } else {
            task.execute(params);
        }
        return task;
    }

    public static void A02() {
        try {
            Class.forName(A01(0, 20, 53));
        } catch (Throwable unused) {
        }
    }
}
