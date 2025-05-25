package com.facebook.ads.redexgen.X;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public class LR implements InvocationHandler {
    public static byte[] A03;
    public final /* synthetic */ int A00;
    public final /* synthetic */ C7j A01;
    public final /* synthetic */ LinkedBlockingQueue A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 52);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{Field.DATA, 42, 33, 42, 61, Field.ASK, 44, 43, 41, 56, 31, 60, 32, Field.PAGEREF, 56, 2, Field.DDE, 33, 41, 43, 41, 56, 24, Field.AUTONUMLGL, 60, 41, Field.TOA, Field.MERGESEQ, Field.LISTNUM, 120, Field.AUTOTEXT, Field.SECTIONPAGES, Field.HTMLCONTROL, Field.MERGESEQ, 29, Field.NUMCHARS, Field.EQ, 26, 23, 17, 25, 1, 7, 31, 1, 32, 23, 19, 22, 11};
    }

    public LR(int i10, LinkedBlockingQueue linkedBlockingQueue, C7j c7j) {
        this.A00 = i10;
        this.A02 = linkedBlockingQueue;
        this.A01 = c7j;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        try {
            if (method.getName().equals(A00(34, 16, 70)) && objArr.length == 1 && (objArr[0] instanceof List)) {
                for (Object c : (List) objArr[0]) {
                    String str = (String) c.getClass().getMethod(A00(7, 12, 120), new Class[0]).invoke(c, new Object[0]);
                    int intValue = ((Integer) c.getClass().getMethod(A00(19, 7, 120), new Class[0]).invoke(c, new Object[0])).intValue();
                    if (str == null && intValue == this.A00) {
                        byte[] value = (byte[]) c.getClass().getMethod(A00(26, 8, 26), new Class[0]).invoke(c, new Object[0]);
                        this.A02.put(value);
                        return null;
                    }
                }
                this.A02.put(null);
            }
        } catch (Throwable t4) {
            this.A01.A07().AA0(A00(0, 7, 123), C8E.A1G, new C8F(t4));
        }
        return null;
    }
}
