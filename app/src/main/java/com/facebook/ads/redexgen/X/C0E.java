package com.facebook.ads.redexgen.X;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* renamed from: com.facebook.ads.redexgen.X.0E  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C0E {
    public static byte[] A00;
    public static String[] A01 = {"pXXvlweo53LEBZFO8IULCIdZyckTRG5r", "DuGHfKZCm01", "80fcVnrJERY0uuv61EoOWTfKBWpdgNO", "9CXibrLJZkMktsdeymca", "5EX4ZE8RGyFWDwwd0Tfx6XQfl6R1kt5", "MQihPub9yWY", "FZA8FrqtMtEe7NzfiE56", "M8QLs2sFGOm02m2V5lAOlFR2Pc3pvKwT"};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 115);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{Field.BIDIOUTLINE, 21, 15, Field.BIDIOUTLINE, 18, 19, 8, Field.BIDIOUTLINE, 24, 21, 14, 25, 31, 8, 19, 14, 5, Field.ADDRESSBLOCK, Field.AUTONUMOUT, 25, 2, 21, 19, 4, 31, 2, 9, 80, Field.DOCPROPERTY, 3, 80, 19, 17, 30, Field.CONTROL, 4, 80, 18, 21, 80, 19, 2, 21, 17, 4, 21, 20, Field.USERADDRESS, 9, 9, 20, 9, Field.HTMLCONTROL, 9, 30, 24, 9, 30, 26, 15, 30, Field.HTMLCONTROL, 1, 30, 9, 20, 86, 8, 18, 1, 30, Field.HTMLCONTROL, 29, 18, 23, 30, Field.HTMLCONTROL, 122, 77, 77, 80, 77, 31, 76, Field.LISTNUM, Field.MERGESEQ, 31, Field.FORMDROPDOWN, Field.GREETINGLINE, 76, Field.MERGESEQ, 31, 82, 80, Field.HTMLCONTROL, 86, Field.AUTOTEXTLIST, 86, Field.LISTNUM, Field.HTMLCONTROL, 31, Field.HTMLCONTROL, Field.GREETINGLINE, Field.MERGESEQ, Field.LISTNUM, 31, Field.MERGESEQ, 80, 31, Field.FORMDROPDOWN, 124, 121, 112, Field.AUTONUMLGL, 99, 102, 117};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static synchronized void A06(File file) throws IOException {
        synchronized (C0E.class) {
            if (file.exists()) {
                if (!file.isDirectory()) {
                    throw new IOException(A00(109, 5, 102) + file + A00(0, 18, 15));
                }
            } else if (!file.mkdirs()) {
                throw new IOException(String.format(Locale.US, A00(18, 29, 3), file.getAbsolutePath()));
            }
        }
    }

    static {
        A02();
    }

    public static List<File> A01(File file) {
        LinkedList linkedList = new LinkedList();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            List<File> asList = Arrays.asList(listFiles);
            Collections.sort(asList, new C0D());
            return asList;
        }
        return linkedList;
    }

    public static void A03(File file) throws IOException {
        if (file.exists()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (!file.setLastModified(currentTimeMillis)) {
                A04(file);
                if (file.lastModified() >= currentTimeMillis) {
                    return;
                }
                throw new IOException(A00(77, 32, 76) + file);
            }
        }
    }

    public static void A04(File file) throws IOException {
        long length = file.length();
        if (length == 0) {
            A05(file);
            String[] strArr = A01;
            if (strArr[7].charAt(10) == strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[5] = "fwMIAeZxeVy";
            strArr2[1] = "XGkZ1N2vKGp";
            return;
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, A00(114, 3, 98));
        long size = length - 1;
        randomAccessFile.seek(size);
        byte readByte = randomAccessFile.readByte();
        randomAccessFile.seek(length - 1);
        randomAccessFile.write(readByte);
        randomAccessFile.close();
    }

    public static void A05(File file) throws IOException {
        if (file.delete() && file.createNewFile()) {
            return;
        }
        throw new IOException(A00(47, 30, 8) + file);
    }
}
