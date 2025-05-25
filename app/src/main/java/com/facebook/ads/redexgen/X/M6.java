package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class M6 implements ThreadFactory {
    public static byte[] A02;
    public final AtomicLong A01 = new AtomicLong();
    public int A00 = Thread.currentThread().getPriority();

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 92);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{25, 21, 23, Field.ADVANCE, Field.NUMCHARS, Field.NUMWORDS, 25, 31, 24, 21, 21, 17, Field.ADVANCE, Field.NUMWORDS, 30, 9, Field.LISTNUM, 14, 18, 8, 31, Field.NUMWORDS, 30, Field.CONTROL, Field.SHAPE, 30, Field.LISTNUM, Field.SHAPE, 14, 60, Field.LISTNUM, Field.SHAPE, Field.FORMTEXT, 14, Field.DDEAUTO};
    }

    private final String A00() {
        return String.format(Locale.US, A01(0, 35, 38), Long.valueOf(this.A01.incrementAndGet()), Long.valueOf(System.currentTimeMillis()));
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(null, runnable, A00(), 0L);
        thread.setPriority(this.A00);
        return thread;
    }
}
