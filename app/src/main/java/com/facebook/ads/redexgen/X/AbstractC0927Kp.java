package com.facebook.ads.redexgen.X;

import android.app.Activity;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Kp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0927Kp {
    public static byte[] A00;
    public static String[] A01 = {"sZHdN6DnxhyjInuuwKT0RhtuIDa6RijQ", "8cuc4SRnt52u8A", "2WFcqn3uWqeuESEsgYZMEltW", "X9bY0baThRQoxJWrF88Q", "LV97W74qtL9kCw5aLEufLebev1Dp02F", "HRzTSkX2nkKPhEUot3qqZNsXHT", "Bu0g", "NlYn9LsIhiHyd3xbWzs6ij1u9O30FtmN"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static Activity A01() throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException, InvocationTargetException, IllegalAccessException {
        Class<?> cls = Class.forName(A02(8, 26, 55));
        Object invoke = cls.getMethod(A02(34, 21, 49), new Class[0]).invoke(null, new Object[0]);
        Field declaredField = cls.getDeclaredField(A02(55, 11, 91));
        declaredField.setAccessible(true);
        Map map = (Map) declaredField.get(invoke);
        if (map == null) {
            return null;
        }
        for (Object obj : map.values()) {
            Class<?> cls2 = obj.getClass();
            Field declaredField2 = cls2.getDeclaredField(A02(66, 6, 4));
            declaredField2.setAccessible(true);
            if (!declaredField2.getBoolean(obj)) {
                Field declaredField3 = cls2.getDeclaredField(A02(0, 8, 61));
                declaredField3.setAccessible(true);
                return (Activity) declaredField3.get(obj);
            }
        }
        return null;
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[6].length() != 4) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[5] = "tITZfrjeKeNOj3ZL7JO2M2Srx7";
            strArr[2] = "270Z6IsJIOKvltqMP1US5A2c";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 57);
            i13++;
        }
    }

    public static void A03() {
        A00 = new byte[]{101, 103, 112, 109, 114, 109, 112, 125, 111, 96, 106, 124, 97, 103, 106, 32, 111, 126, 126, 32, lib.zj.office.fc.hwpf.usermodel.Field.AUTOTEXT, 109, 122, 103, 120, 103, 122, 119, lib.zj.office.fc.hwpf.usermodel.Field.LISTNUM, 102, 124, 107, 111, 106, 107, 125, 122, 122, 109, 102, 124, lib.zj.office.fc.hwpf.usermodel.Field.TOA, 107, 124, 97, 126, 97, 124, 113, lib.zj.office.fc.hwpf.usermodel.Field.BIDIOUTLINE, 96, 122, 109, 105, 108, 15, lib.zj.office.fc.hwpf.usermodel.Field.QUOTE, 1, 22, 11, 20, 11, 22, 11, 7, 17, 77, lib.zj.office.fc.hwpf.usermodel.Field.BIDIOUTLINE, lib.zj.office.fc.hwpf.usermodel.Field.NOTEREF, 78, lib.zj.office.fc.hwpf.usermodel.Field.HYPERLINK, lib.zj.office.fc.hwpf.usermodel.Field.AUTOTEXTLIST};
    }

    static {
        A03();
    }

    public static Activity A00() {
        try {
            return A01();
        } catch (Exception unused) {
            return null;
        }
    }
}
