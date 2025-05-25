package com.tom_roush.pdfbox.cos;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: classes2.dex */
final class PDFDocEncoding {
    private static final char REPLACEMENT_CHARACTER = 65533;
    private static final int[] CODE_TO_UNI = new int[256];
    private static final Map<Character, Integer> UNI_TO_CODE = new HashMap(256);

    static {
        for (int i10 = 0; i10 < 256; i10++) {
            if ((i10 <= 23 || i10 >= 32) && ((i10 <= 126 || i10 >= 161) && i10 != 173)) {
                set(i10, (char) i10);
            }
        }
        set(24, (char) 728);
        set(25, (char) 711);
        set(26, (char) 710);
        set(27, (char) 729);
        set(28, (char) 733);
        set(29, (char) 731);
        set(30, (char) 730);
        set(31, (char) 732);
        set(ShapeTypes.VERTICAL_SCROLL, REPLACEMENT_CHARACTER);
        set(128, (char) 8226);
        set(129, (char) 8224);
        set(ShapeTypes.DOUBLE_WAVE, (char) 8225);
        set(ShapeTypes.PLUS, (char) 8230);
        set(ShapeTypes.FLOW_CHART_PROCESS, (char) 8212);
        set(ShapeTypes.FLOW_CHART_DECISION, (char) 8211);
        set(ShapeTypes.FLOW_CHART_INPUT_OUTPUT, (char) 402);
        set(ShapeTypes.FLOW_CHART_PREDEFINED_PROCESS, (char) 8260);
        set(ShapeTypes.FLOW_CHART_INTERNAL_STORAGE, (char) 8249);
        set(ShapeTypes.FLOW_CHART_DOCUMENT, (char) 8250);
        set(ShapeTypes.FLOW_CHART_MULTIDOCUMENT, (char) 8722);
        set(ShapeTypes.FLOW_CHART_TERMINATOR, (char) 8240);
        set(ShapeTypes.FLOW_CHART_PREPARATION, (char) 8222);
        set(ShapeTypes.FLOW_CHART_MANUAL_INPUT, (char) 8220);
        set(ShapeTypes.FLOW_CHART_MANUAL_OPERATION, (char) 8221);
        set(ShapeTypes.FLOW_CHART_CONNECTOR, (char) 8216);
        set(144, (char) 8217);
        set(ShapeTypes.FLOW_CHART_PUNCHED_TAPE, (char) 8218);
        set(ShapeTypes.FLOW_CHART_SUMMING_JUNCTION, (char) 8482);
        set(ShapeTypes.FLOW_CHART_OR, (char) 64257);
        set(148, (char) 64258);
        set(ShapeTypes.FLOW_CHART_SORT, (char) 321);
        set(ShapeTypes.FLOW_CHART_EXTRACT, (char) 338);
        set(ShapeTypes.FLOW_CHART_MERGE, (char) 352);
        set(ShapeTypes.FLOW_CHART_OFFLINE_STORAGE, (char) 376);
        set(153, (char) 381);
        set(ShapeTypes.FLOW_CHART_MAGNETIC_TAPE, (char) 305);
        set(ShapeTypes.FLOW_CHART_MAGNETIC_DISK, (char) 322);
        set(ShapeTypes.FLOW_CHART_MAGNETIC_DRUM, (char) 339);
        set(ShapeTypes.FLOW_CHART_DISPLAY, (char) 353);
        set(ShapeTypes.FLOW_CHART_DELAY, (char) 382);
        set(ShapeTypes.FLOW_CHART_ALTERNATE_PROCESS, REPLACEMENT_CHARACTER);
        set(160, (char) 8364);
    }

    private PDFDocEncoding() {
    }

    public static boolean containsChar(char c) {
        return UNI_TO_CODE.containsKey(Character.valueOf(c));
    }

    public static byte[] getBytes(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (char c : str.toCharArray()) {
            Integer num = UNI_TO_CODE.get(Character.valueOf(c));
            if (num == null) {
                byteArrayOutputStream.write(0);
            } else {
                byteArrayOutputStream.write(num.intValue());
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static void set(int i10, char c) {
        CODE_TO_UNI[i10] = c;
        UNI_TO_CODE.put(Character.valueOf(c), Integer.valueOf(i10));
    }

    public static String toString(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            int i10 = b10 & 255;
            int[] iArr = CODE_TO_UNI;
            if (i10 >= iArr.length) {
                sb2.append('?');
            } else {
                sb2.append((char) iArr[i10]);
            }
        }
        return sb2.toString();
    }
}
