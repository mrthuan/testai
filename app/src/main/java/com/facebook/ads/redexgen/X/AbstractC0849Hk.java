package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.adjust.sdk.network.ErrorCodes;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lib.zj.office.fc.hpsf.Constants;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import lib.zj.office.fc.ss.util.IEEEDouble;

/* renamed from: com.facebook.ads.redexgen.X.Hk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0849Hk {
    public static byte[] A00;
    public static String[] A01 = {"QaRNxGLOob9K4H7fRMkquel3h50VelkQ", "azTCGchk6", "mHgnG6dnf2MGZd5DpY3Fvtm9G", "tzEaWGaEvJza45cGoZVKtnbcUrArONKc", "oHJkPKeSQUNkwlTgdbaOwJQEOAFT8Z3w", "LswLHEYKeGvbNlCvRjNUSVWZKRT8D0Zx", "T5MrOQzei7G0RtN59lzfKQqgq2SafeDq", "ucBpJzW1cVnftjPi059PqZMmOpUXxZKe"};
    public static final Map<String, Integer> A02;
    public static final Pattern A03;
    public static final Pattern A04;
    public static final Pattern A05;

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[3].charAt(30) != strArr[7].charAt(30)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[3] = "S3cqE9iPcF9hTGsbBg8LQ82o0ngu41Kq";
            strArr2[7] = "xg2fMgkDGF8jjQwJ6jhRkufT7C75CxKJ";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 126);
            i13++;
        }
    }

    public static void A06() {
        A00 = new byte[]{Field.SYMBOL, 64, 108, 121, 124, Field.SECTIONPAGES, Field.AUTONUM, Field.AUTONUM, Field.SECTIONPAGES, 122, 101, Field.GLOSSARY, Field.GOTOBUTTON, Field.DDE, 99, Field.IMPORT, Field.GOTOBUTTON, Field.AUTONUM, Field.SECTIONPAGES, 122, 101, Field.GLOSSARY, Field.GOTOBUTTON, Field.DDE, 99, Field.IMPORT, Field.GOTOBUTTON, Field.AUTONUM, Field.SECTIONPAGES, 122, 101, Field.GLOSSARY, Field.GOTOBUTTON, Field.DDE, 99, Field.IMPORT, Field.SECTIONPAGES, Field.IMPORT, 58, Field.IMPORT, Field.NUMWORDS, 14, 11, 8, Field.AUTONUMLGL, Field.SECTION, Field.SECTION, Field.AUTONUMLGL, 13, 18, Field.HYPERLINK, Field.FILESIZE, Field.LISTNUM, 20, 64, Field.FILESIZE, Field.SECTION, Field.AUTONUMLGL, 13, 18, Field.HYPERLINK, Field.FILESIZE, Field.LISTNUM, 20, 64, Field.FILESIZE, Field.SECTION, Field.AUTONUMLGL, 13, 18, Field.HYPERLINK, Field.FILESIZE, Field.LISTNUM, 20, 64, Field.FILESIZE, Field.SECTION, Field.AUTONUMLGL, 13, Field.INCLUDEPICTURE, Field.AUTONUMLGL, Field.FORMCHECKBOX, 86, Field.AUTONUMLGL, 13, Field.INCLUDEPICTURE, 86, 64, Field.AUTONUMLGL, 64, 77, Field.AUTONUMOUT, 24, 13, 8, 11, Field.AUTONUM, Field.SECTIONPAGES, Field.SECTIONPAGES, Field.AUTONUM, 14, 17, Field.HTMLCONTROL, Field.FORMTEXT, Field.AUTOTEXTLIST, 23, Field.INCLUDEPICTURE, Field.FORMTEXT, Field.SECTIONPAGES, Field.AUTONUM, 14, 17, Field.HTMLCONTROL, Field.FORMTEXT, Field.AUTOTEXTLIST, 23, Field.INCLUDEPICTURE, Field.FORMTEXT, Field.SECTIONPAGES, Field.AUTONUM, 14, 17, Field.HTMLCONTROL, Field.FORMTEXT, Field.AUTOTEXTLIST, 23, Field.INCLUDEPICTURE, Field.FORMTEXT, Field.SECTIONPAGES, Field.AUTONUM, 14, 17, Field.HTMLCONTROL, Field.FORMTEXT, Field.AUTOTEXTLIST, 23, Field.INCLUDEPICTURE, Field.AUTONUM, Field.INCLUDEPICTURE, 78, 116, 121, 124, 118, 112, 119, 121, 96, 112, 58, Field.AUTONUMLGL, Field.GLOSSARY, Field.GOTOBUTTON, 42, Field.DDEAUTO, Field.USERADDRESS, 44, Field.MACROBUTTON, Field.GOTOBUTTON, Field.GLOSSARY, Field.USERADDRESS, 0, 16, 20, 0, 58, 42, Field.DDEAUTO, 58, Field.AUTONUM, 58, 41, Field.GOTOBUTTON, Field.AUTONUMLGL, Field.USERADDRESS, 44, Field.IMPORT, 56, Field.BARCODE, Field.DATA, Field.DDE, 42, Field.ASK, Field.DATA, 42, 24, 19, 9, 11, 15, 31, Field.FORMCHECKBOX, Field.TOA, Field.INCLUDETEXT, Field.FORMTEXT, 78, Field.HYPERLINK, 86, Field.HTMLCONTROL, Field.ADVANCE, Field.AUTOTEXTLIST, 82, Field.SHAPE, Field.GREETINGLINE, Field.HTMLCONTROL, 86, Field.CONTROL, Field.DOCPROPERTY, Field.ADVANCE, Field.GREETINGLINE, 23, 25, 0, 16, Field.SECTION, Field.AUTOTEXT, 86, Field.FORMTEXT, Field.DOCPROPERTY, 74, 76, Field.AUTOTEXT, Field.FORMTEXT, Field.CONTROL, 6, 22, 11, 19, 10, 98, 117, 114, 108, 121, 119, 111, 111, 100, Field.TOA, Field.MERGESEQ, 78, Field.AUTOTEXT, Field.GREETINGLINE, Field.NOTEREF, Field.FORMTEXT, Field.SHAPE, Field.AUTOTEXT, Field.SHAPE, Field.ADVANCE, Field.ADDRESSBLOCK, 78, Field.NOTEREF, 78, Field.AUTOTEXTLIST, Field.TOA, Field.AUTOTEXT, Field.AUTOTEXTLIST, 101, 110, 105, 101, 105, 106, 103, 114, 99, Field.AUTONUMOUT, 56, Field.PAGEREF, Field.AUTONUM, 59, Field.INCLUDETEXT, Field.NOTEREF, Field.DOCPROPERTY, Field.TOA, Field.SECTION, Field.MERGESEQ, Field.NOTEREF, 80, Field.SECTIONPAGES, Field.DOCPROPERTY, Field.FILESIZE, Field.MERGESEQ, 82, Field.SECTIONPAGES, 125, 113, 108, 112, 109, 119, 114, 117, Field.AUTOTEXTLIST, Field.NOTEREF, Field.FORMDROPDOWN, Field.CONTROL, Field.TOA, Field.DOCPROPERTY, Field.ADVANCE, 20, 14, 22, 25, Field.ADDIN, Field.ADVANCE, Field.FORMCHECKBOX, Field.GREETINGLINE, Field.CONTROL, Field.AUTOTEXTLIST, 64, 80, Field.NUMCHARS, 25, 10, 19, Field.NUMWORDS, 1, 25, 22, 74, Field.AUTOTEXT, Field.BIDIOUTLINE, Field.FILESIZE, Field.TOA, Field.SECTION, Field.SECTIONPAGES, 74, Field.MERGESEQ, 64, Field.BIDIOUTLINE, Field.SECTION, 74, 0, 5, 22, 15, 3, 22, 5, 29, Field.USERADDRESS, 59, Field.DATA, Field.EQ, 61, Field.DATA, Field.BARCODE, Field.BARCODE, Field.AUTONUMOUT, 1, 4, 23, 14, 2, 23, 0, Field.NUMCHARS, 13, 8, Field.NUMWORDS, 2, 2, 1, 8, 2, 0, 97, 100, 119, 110, 104, 100, 98, 96, 107, 113, 100, 10, 15, Field.NUMCHARS, 5, 1, 2, 7, 24, 11, 9, Field.NUMCHARS, 11, 11, 0, Field.AUTOTEXT, 74, Field.AUTOTEXTLIST, 64, Field.INCLUDETEXT, Field.AUTOTEXTLIST, 74, Field.FILESIZE, 76, 78, Field.SECTIONPAGES, Field.FORMCHECKBOX, Field.ADVANCE, 77, Field.TOA, Field.ADVANCE, Field.FILESIZE, 78, Field.AUTOTEXT, Field.SECTIONPAGES, 104, 109, 126, 103, 126, 105, 104, Byte.MAX_VALUE, 122, 105, 112, 104, 122, 119, 118, 116, 117, Field.FORMDROPDOWN, 86, Field.FILESIZE, Field.BIDIOUTLINE, Field.INCLUDETEXT, 82, 86, 80, Field.FILESIZE, 82, 82, Field.AUTOTEXTLIST, 78, Field.MERGESEQ, Field.HYPERLINK, Field.SECTION, Field.AUTOTEXTLIST, Field.FORMTEXT, Field.MERGESEQ, Field.GREETINGLINE, Field.AUTOTEXT, Field.NOTEREF, Field.FORMTEXT, Field.SHAPE, Field.AUTOTEXT, 30, Field.NUMWORDS, 8, 17, 9, 22, Field.NUMWORDS, 14, 31, 29, 8, Field.NUMWORDS, 3, Field.MERGESEQ, 78, Field.ADDRESSBLOCK, Field.INCLUDETEXT, Field.BIDIOUTLINE, Field.INCLUDEPICTURE, 78, Field.HTMLCONTROL, 74, Field.NOTEREF, Field.ADDRESSBLOCK, 74, 86, 29, 24, 11, 18, 13, 12, 11, 8, 12, 22, 16, 10, Field.NUMCHARS, 115, 118, 101, 124, 97, 126, 120, 123, 114, 99, Field.SECTION, 64, 64, Field.DOCPROPERTY, Field.DOCPROPERTY, 76, Field.MERGESEQ, 78, Field.AUTONUMOUT, Field.AUTONUMLGL, Field.AUTONUMLGL, 32, Field.QUOTE, 59, 41, Field.GOTOBUTTON, 60, Field.PAGEREF, Field.AUTONUMLGL, 116, 121, 125, 119, 98, 113, 105, Field.DDEAUTO, Field.QUOTE, Field.FILLIN, Field.DDE, 56, Field.GLOSSARY, Field.MACROBUTTON, 98, 105, 98, 97, 99, 116, 100, 106, 115, 99, 48, Field.BARCODE, 36, Field.MACROBUTTON, Field.AUTONUMOUT, 36, Field.BARCODE, Field.AUTONUMLGL, 61, 119, 125, 126, 99, 112, 125, 102, 121, 120, 101, 116, Field.HTMLCONTROL, 82, Field.AUTOTEXT, Field.HYPERLINK, 78, Field.TOA, Field.LISTNUM, Field.AUTOTEXT, Field.HYPERLINK, Field.HYPERLINK, Field.FORMDROPDOWN, Field.MACROBUTTON, 32, Field.AUTONUM, 61, Field.ASK, 60, Field.AUTONUMOUT, Field.NUMCHARS, 26, 18, 21, 8, 25, 20, 9, 20, Field.AUTOTEXTLIST, 86, Field.ADDIN, 77, 74, Field.TOA, 86, Field.CONTROL, 74, Field.HTMLCONTROL, Field.FORMTEXT, 78, 77, Field.FILESIZE, 113, 121, 122, 114, 115, 120, 100, 121, 114, Field.AUTONUM, Field.QUOTE, 48, Field.DATA, 119, 98, 117, 117, 126, Field.INCLUDEPICTURE, 86, Field.SECTION, Field.SECTION, 74, Field.ADDRESSBLOCK, Field.SECTION, Field.NOTEREF, Field.NOTEREF, Field.MERGESEQ, Field.FORMDROPDOWN, 107, 126, 105, 117, Field.FORMCHECKBOX, 64, Field.SECTION, 74, 86, Field.MERGESEQ, 74, Field.HYPERLINK, Field.FILESIZE, Field.SECTIONPAGES, Field.AUTOTEXTLIST, Field.ADDRESSBLOCK, Field.INCLUDETEXT, Field.INCLUDEPICTURE, Field.FORMTEXT, Field.SYMBOL, Field.USERADDRESS, Field.AUTONUMOUT, Field.SYMBOL, Field.EQ, Field.USERADDRESS, 34, Field.AUTONUMLGL, Field.AUTONUMOUT, 14, 9, 3, 14, 0, 8, Field.INCLUDEPICTURE, Field.BIDIOUTLINE, Field.FILESIZE, Field.HYPERLINK, Field.FORMDROPDOWN, 61, Field.USERADDRESS, Field.IMPORT, 61, Field.BARCODE, 14, 3, 20, 7, 12, 6, 7, 16, Field.NOTEREF, Field.FILESIZE, 82, Field.SECTION, 74, 64, Field.SECTION, 86, Field.FORMTEXT, Field.NOTEREF, Field.ADDIN, Field.CONTROL, 76, 12, 1, 23, 14, 7, 18, 5, 5, 14, 44, Field.PAGEREF, Field.DDE, Field.GLOSSARY, Field.DDEAUTO, Field.QUOTE, Field.DATA, 41, Field.ASK, Field.ASK, Field.GLOSSARY, Field.DDEAUTO, 5, 0, 14, 1, 29, 11, 5, Field.NUMCHARS, 12, 124, 121, 119, 120, 100, 115, Byte.MAX_VALUE, 98, 113, 124, Field.DATA, Field.DDE, Field.QUOTE, 44, 48, Field.FILLIN, 61, Field.PAGEREF, 42, 61, 56, Field.AUTONUM, Field.SYMBOL, Field.PAGEREF, Field.AUTONUM, Field.USERADDRESS, 61, Field.AUTONUMLGL, Field.AUTONUMOUT, Field.BARCODE, Field.QUOTE, Field.USERADDRESS, Field.AUTONUMLGL, Field.DATA, Field.AUTONUMOUT, 61, 61, Field.USERADDRESS, Field.ASK, 15, 10, 4, 11, 23, 4, 17, 2, 26, 56, 61, Field.MACROBUTTON, 60, 32, Field.MACROBUTTON, Field.ASK, Field.EQ, Field.EQ, 58, 117, 112, 126, 113, 109, 126, 107, 124, 96, Field.QUOTE, Field.ASK, Field.DATA, Field.FILLIN, 59, Field.BARCODE, Field.ASK, 33, 36, Field.AUTONUM, Field.MACROBUTTON, 61, Field.GOTOBUTTON, Field.DDEAUTO, 41, 59, Field.AUTONUM, Field.IMPORT, Field.AUTONUMLGL, Field.AUTONUMOUT, 10, 15, 1, 14, 18, 21, 3, 7, 1, 20, 3, 3, 8, Field.DATA, Field.DDE, Field.QUOTE, 44, 48, Field.IMPORT, Field.GLOSSARY, 61, Field.ASK, Field.DATA, Field.EQ, 33, Field.SECTION, Field.INCLUDETEXT, 74, Field.FILESIZE, Field.AUTOTEXTLIST, Field.GREETINGLINE, Field.SECTION, 76, Field.AUTOTEXTLIST, Field.NOTEREF, 74, Field.SHAPE, 76, Field.ADVANCE, Field.NOTEREF, 77, Field.INCLUDEPICTURE, 76, 80, Field.CONTROL, Field.NOTEREF, Field.FILESIZE, 80, Field.SECTION, Field.INCLUDEPICTURE, 86, Field.SECTION, Field.ADDRESSBLOCK, Field.NUMCHARS, 25, 23, 24, 4, 3, 4, 21, 21, Field.NUMCHARS, 18, Field.NUMCHARS, 5, 21, 10, 15, 1, 14, 18, 31, 3, 10, 10, 9, 17, Field.HYPERLINK, Field.ADDRESSBLOCK, Field.AUTOTEXTLIST, Field.ADDIN, 29, 24, Field.NUMCHARS, 20, 22, 3, 20, 20, 31, 15, 10, 13, 6, 13, Field.DDE, 33, Field.FILLIN, Field.PAGEREF, Field.DDEAUTO, Field.AUTONUMOUT, 33, Field.NUMWORDS, 23, 4, 25, 25, 24, 112, 120, 121, 116, 104, 112, 124, 108, 104, 124, 112, 124, 111, 116, 115, 120, 80, Field.HYPERLINK, Field.AUTOTEXTLIST, Field.ADVANCE, Field.NOTEREF, 80, Field.SHAPE, Field.ADDIN, Field.NOTEREF, Field.HYPERLINK, 41, 33, 32, Field.DDE, Field.EQ, 41, 43, Field.AUTONUM, Field.FILLIN, 44, Field.DDE, 32, Field.FILESIZE, 77, 76, Field.SECTION, Field.ADDRESSBLOCK, Field.FILESIZE, Field.HYPERLINK, Field.ADDRESSBLOCK, Field.LISTNUM, Field.HYPERLINK, Field.INCLUDETEXT, 77, 118, 126, Byte.MAX_VALUE, 114, 110, 118, 104, 126, 122, 124, 105, 126, 126, 117, 14, 6, 7, 10, 22, 14, 16, 15, 2, 
        23, 6, 1, 15, 22, 6, 86, Field.GREETINGLINE, Field.SHAPE, 82, 78, 86, Field.NOTEREF, Field.MERGESEQ, Field.TOA, 82, Field.DOCPROPERTY, Field.BIDIOUTLINE, Field.BIDIOUTLINE, Field.TOA, Field.GREETINGLINE, Field.GREETINGLINE, Field.DOCPROPERTY, 5, 13, 12, 1, 29, 5, Field.NUMCHARS, 29, 26, 25, 29, 7, 1, Field.NUMWORDS, 13, 102, 110, 111, 98, 126, 102, 125, 98, 100, 103, 110, Byte.MAX_VALUE, 121, 110, 111, Field.INCLUDEPICTURE, Field.FORMCHECKBOX, 74, 64, Field.FORMCHECKBOX, Field.TOA, Field.FORMTEXT, Field.LISTNUM, 76, Field.SECTIONPAGES, Field.HTMLCONTROL, Field.MERGESEQ, Field.TOA, 77, 74, 80, Field.FORMCHECKBOX, 86, Field.SECTION, Field.FILESIZE, Field.TOA, 110, 106, 112, 119, 122, 113, 108, 112, 102, 123, 121, 117, 117, 119, 101, Byte.MAX_VALUE, 120, 124, 115, 100, 115, 120, 125, 101, 122, 123, 102, 119, Field.CONTROL, Field.HYPERLINK, Field.AUTOTEXT, 64, 1, 2, 10, 2, 15, 13, 11, Field.ADDIN, 82, Field.CONTROL, Field.NOTEREF, Field.HTMLCONTROL, 10, 9, 12, 19, 0, 1, 23, 4, 7, Field.ASK, 59, Field.DATA, Field.FILLIN, Field.DDEAUTO, 44, 6, Field.NUMWORDS, 8, 7, 14, 12, Field.NUMWORDS, 12, 13, 20, 9, 24, 19, 18, 31, 7, 22, Field.NUMWORDS, 18, 16, 24, Field.NUMWORDS, 19, 18, 25, 5, 24, 19, 97, 112, 125, 116, 118, 99, 116, 116, Byte.MAX_VALUE, Field.MACROBUTTON, 34, Field.GLOSSARY, Field.ASK, Field.IMPORT, Field.AUTONUM, Field.EQ, Field.GOTOBUTTON, Field.AUTONUM, 44, 42, 48, Field.ASK, 103, 118, 123, 114, 97, 126, 120, 123, 114, 99, 101, 114, 115, 26, 11, 26, 11, 19, 11, 29, 2, 3, 26, Field.ADVANCE, Field.SECTION, Field.FILESIZE, Field.FORMCHECKBOX, 76, Field.ADVANCE, Field.ADDIN, Field.SECTIONPAGES, Field.SECTIONPAGES, 122, 111, 120, Byte.MAX_VALUE, 36, 61, 58, Field.BARCODE, 122, 102, Byte.MAX_VALUE, 103, 12, 19, 11, 24, 25, 14, 30, 16, 9, 25, 82, Field.CONTROL, 80, 82, 78, Field.FORMCHECKBOX, Field.DATA, Field.BARCODE, 56, Field.BARCODE, Field.SYMBOL, Field.SYMBOL, 59, 42, Field.GLOSSARY, Field.DATA, 42, Field.AUTONUM, Field.BARCODE, Field.PAGEREF, Field.GOTOBUTTON, Field.MACROBUTTON, 36, Field.EQ, Field.AUTONUMOUT, 1, 20, 17, 18, 56, Field.PAGEREF, Field.SYMBOL, Field.MACROBUTTON, Field.DATA, 56, Field.PAGEREF, 61, 36, 20, 9, 31, 7, 10, 4, 10, 19, 3, 58, Field.DATA, Field.DDE, Field.DDE, Field.PAGEREF, 44, 43, 59, Field.ASK, Field.USERADDRESS, Field.FILLIN, Field.MACROBUTTON, 33, 44, Field.DDE, Field.GLOSSARY, Field.DDEAUTO, 112, 98, 109, 103, 122, 97, 113, 108, 116, 109, 3, 21, 17, 23, 2, 21, 21, 30, 41, Field.BARCODE, 59, 41, Field.GOTOBUTTON, Field.BARCODE, Field.AUTONUM, Field.AUTONUM, Field.DDE, Field.IMPORT, 59, 48, 48, Field.BARCODE, 29, 7, 2, 24, 11, Field.NUMCHARS, 41, Field.EQ, Field.QUOTE, 56, Field.AUTONUM, Field.GLOSSARY, Field.BARCODE, Field.INCLUDEPICTURE, Field.BIDIOUTLINE, Field.ADDIN, Field.INCLUDETEXT, Field.DOCPROPERTY, 82, Field.BIDIOUTLINE, Field.FILESIZE, Field.DOCPROPERTY, 116, 107, 102, 115, 98, 96, 117, 102, 126, 30, 1, 12, 25, 8, 10, 31, 8, 20, 112, 109, 108, 116, 105, 106, 104, 115, 116, 125, 125, 104, Byte.MAX_VALUE, Byte.MAX_VALUE, 116, Field.TOA, 78, Field.SHAPE, Field.SHAPE, 86, Field.HYPERLINK, 86, Field.AUTOTEXT, Field.SHAPE, Field.AUTOTEXT, Field.LISTNUM, Field.DOCPROPERTY, 108, 125, 121, 116, Field.LISTNUM, Field.FORMTEXT, Field.FORMCHECKBOX, Field.ADDRESSBLOCK, Field.LISTNUM, Field.SECTIONPAGES, Field.MERGESEQ, 56, Field.QUOTE, 33, Field.DDE, 56, Field.QUOTE, 105, 111, 124, 115, 110, 109, 124, 111, 120, 115, 105, 21, 20, 19, 16, 20, 14, 8, 18, 4, Field.BIDIOUTLINE, Field.INCLUDEPICTURE, Field.FILESIZE, Field.FORMTEXT, Field.AUTOTEXT, Field.GREETINGLINE, Field.USERADDRESS, 33, 44, Field.DATA, 61, 56, Field.FILLIN, Field.ASK, 59, 42, 108, 115, 114, 111, 126, 104, 118, 116, 112, 126, 33, 61, Field.AUTONUMOUT, Field.AUTONUMOUT, Field.IMPORT, Field.GLOSSARY, 25, 5, 12, 12, 15, 23, 7, 18, 5, 5, 14};
    }

    static {
        A06();
        A05 = Pattern.compile(A05(1, 38, 96));
        A04 = Pattern.compile(A05(91, 49, 20));
        A03 = Pattern.compile(A05(39, 52, 23));
        A02 = new HashMap();
        A02.put(A05(ShapeTypes.FLOW_CHART_PREPARATION, 9, 107), -984833);
        A02.put(A05(ShapeTypes.FLOW_CHART_SORT, 12, 37), -332841);
        A02.put(A05(ShapeTypes.ACTION_BUTTON_BLANK, 4, 31), -16711681);
        A02.put(A05(ShapeTypes.ACTION_BUTTON_FORWARD_NEXT, 10, 37), -8388652);
        A02.put(A05(ShapeTypes.FUNNEL, 5, 51), -983041);
        A02.put(A05(ShapeTypes.MATH_EQUAL, 5, 49), -657956);
        A02.put(A05(ShapeTypes.CHART_X, 6, 4), -6972);
        A02.put(A05(191, 5, 91), -16777216);
        A02.put(A05(196, 14, 68), -5171);
        A02.put(A05(210, 4, 11), -16776961);
        A02.put(A05(214, 10, 93), -7722014);
        A02.put(A05(224, 5, 26), -5952982);
        A02.put(A05(229, 9, 126), -2180985);
        A02.put(A05(238, 9, 84), -10510688);
        A02.put(A05(247, 10, 66), -8388864);
        A02.put(A05(257, 9, 120), -2987746);
        A02.put(A05(266, 5, 41), -32944);
        A02.put(A05(271, 14, 89), -10185235);
        A02.put(A05(285, 8, 96), -1828);
        A02.put(A05(293, 7, 68), -2354116);
        A02.put(A05(OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT, 4, 9), -16711681);
        A02.put(A05(304, 8, 75), -16777077);
        A02.put(A05(312, 8, 6), -16741493);
        A02.put(A05(320, 13, 80), -4684277);
        A02.put(A05(333, 8, 26), -5658199);
        A02.put(A05(341, 9, 36), -16751616);
        A02.put(A05(350, 8, 27), -5658199);
        A02.put(A05(358, 9, 23), -4343957);
        A02.put(A05(367, 11, 123), -7667573);
        A02.put(A05(378, 14, 16), -11179217);
        A02.put(A05(392, 10, 85), -29696);
        A02.put(A05(TTAdConstant.AD_ID_IS_NULL_CODE, 10, 88), -6737204);
        A02.put(A05(TTAdConstant.IMAGE_URL_CODE, 7, 114), -7667712);
        A02.put(A05(419, 10, 101), -1468806);
        A02.put(A05(429, 12, 73), -7357297);
        A02.put(A05(441, 13, 84), -12042869);
        A02.put(A05(454, 13, 4), -13676721);
        A02.put(A05(467, 13, 81), -13676721);
        A02.put(A05(480, 13, 7), -16724271);
        A02.put(A05(493, 10, 105), -7077677);
        A02.put(A05(PglCryptUtils.COMPRESS_FAILED, 8, 91), -60269);
        A02.put(A05(511, 11, 46), -16728065);
        A02.put(A05(522, 7, 110), -9868951);
        A02.put(A05(529, 7, 52), -9868951);
        A02.put(A05(536, 10, 120), -14774017);
        A02.put(A05(546, 9, 40), -5103070);
        A02.put(A05(555, 11, 111), -1296);
        A02.put(A05(566, 11, 67), -14513374);
        A02.put(A05(577, 7, 43), -65281);
        A02.put(A05(584, 9, 5), -2302756);
        A02.put(A05(593, 10, 64), -460545);
        A02.put(A05(603, 4, 95), -10496);
        A02.put(A05(607, 9, 104), -2448096);
        A02.put(A05(616, 4, 47), -8355712);
        A02.put(A05(620, 5, 110), -16744448);
        A02.put(A05(625, 11, 90), -5374161);
        A02.put(A05(636, 4, 114), -8355712);
        A02.put(A05(640, 8, 81), -983056);
        A02.put(A05(648, 7, 83), -38476);
        A02.put(A05(655, 9, 46), -3318692);
        A02.put(A05(664, 6, 25), -11861886);
        A02.put(A05(670, 5, 84), -16);
        A02.put(A05(675, 5, 40), -989556);
        A02.put(A05(680, 8, 28), -1644806);
        A02.put(A05(688, 13, 90), -3851);
        A02.put(A05(701, 9, 30), -8586240);
        A02.put(A05(710, 12, 62), -1331);
        A02.put(A05(722, 9, 23), -5383962);
        A02.put(A05(731, 10, 110), -1015680);
        A02.put(A05(741, 9, 58), -2031617);
        A02.put(A05(750, 20, 47), -329006);
        A02.put(A05(770, 9, 29), -2894893);
        A02.put(A05(779, 10, 42), -7278960);
        A02.put(A05(789, 9, 103), -2894893);
        A02.put(A05(798, 9, 49), -18751);
        A02.put(A05(807, 11, 36), -24454);
        A02.put(A05(818, 13, 24), -14634326);
        A02.put(A05(831, 12, 58), -7876870);
        A02.put(A05(843, 14, 83), -8943463);
        A02.put(A05(857, 14, 90), -8943463);
        A02.put(A05(871, 14, 14), -5192482);
        A02.put(A05(885, 11, 24), -32);
        A02.put(A05(896, 4, 74), -16711936);
        A02.put(A05(OS2WindowsMetricsTable.WEIGHT_CLASS_BLACK, 9, 15), -13447886);
        A02.put(A05(909, 5, 29), -331546);
        A02.put(A05(914, 7, 62), -65281);
        A02.put(A05(921, 6, 8), -8388608);
        A02.put(A05(927, 16, 99), -10039894);
        A02.put(A05(943, 10, 67), -16777011);
        A02.put(A05(953, 12, 58), -4565549);
        A02.put(A05(965, 12, 86), -7114533);
        A02.put(A05(977, 14, 101), -12799119);
        A02.put(A05(991, 15, 29), -8689426);
        A02.put(A05(ErrorCodes.SSL_HANDSHAKE_EXCEPTION, 17, 69), -16713062);
        A02.put(A05(IEEEDouble.EXPONENT_BIAS, 15, 22), -12004916);
        A02.put(A05(1038, 15, 117), -3730043);
        A02.put(A05(1053, 12, 80), -15132304);
        A02.put(A05(1065, 9, 90), -655366);
        A02.put(A05(1074, 9, 125), -6943);
        A02.put(A05(1083, 8, 104), -6987);
        A02.put(A05(1091, 11, 108), -8531);
        A02.put(A05(1102, 4, 71), -16777088);
        A02.put(A05(1106, 7, 16), -133658);
        A02.put(A05(1113, 5, 64), -8355840);
        A02.put(A05(1118, 9, 27), -9728477);
        A02.put(A05(1127, 6, 55), -23296);
        A02.put(A05(1133, 9, 23), -47872);
        A02.put(A05(1142, 6, 5), -2461482);
        A02.put(A05(1148, 13, 9), -1120086);
        A02.put(A05(1161, 9, 111), -6751336);
        A02.put(A05(1170, 13, 61), -5247250);
        A02.put(A05(1183, 13, 105), -2396013);
        A02.put(A05(1196, 10, 20), -4139);
        A02.put(A05(1206, 9, 90), -9543);
        A02.put(A05(1215, 4, 116), -3308225);
        A02.put(A05(1219, 4, 42), -16181);
        A02.put(A05(1223, 4, 116), -2252579);
        A02.put(A05(1227, 10, 2), -5185306);
        A02.put(A05(1237, 6, 92), -8388480);
        A02.put(A05(1243, 13, 36), -10079335);
        A02.put(A05(Constants.CP_WINDOWS_1256, 3, 41), -65536);
        A02.put(A05(1266, 9, 52), -4419697);
        A02.put(A05(1275, 9, 24), -12490271);
        A02.put(A05(1284, 11, 55), -7650029);
        A02.put(A05(1295, 6, 62), -360334);
        A02.put(A05(1301, 10, 125), -744352);
        A02.put(A05(1311, 8, 14), -13726889);
        A02.put(A05(1319, 8, 36), -2578);
        A02.put(A05(1327, 6, 32), -6270419);
        A02.put(A05(1333, 6, 16), -4144960);
        A02.put(A05(1339, 7, 36), -7876885);
        A02.put(A05(1346, 9, 78), -9807155);
        A02.put(A05(1355, 9, 121), -9404272);
        A02.put(A05(1364, 9, 19), -9404272);
        A02.put(A05(1373, 4, 125), -1286);
        A02.put(A05(1377, 11, 100), -16711809);
        A02.put(A05(1388, 9, 68), -12156236);
        A02.put(A05(1397, 3, 69), -2968436);
        A02.put(A05(1400, 4, 102), -16744320);
        A02.put(A05(1404, 7, 80), -2572328);
        A02.put(A05(1411, 6, 50), -40121);
        A02.put(A05(1417, 11, 99), 0);
        A02.put(A05(1428, 9, 31), -12525360);
        A02.put(A05(1437, 6, 84), -1146130);
        A02.put(A05(1443, 5, 55), -663885);
        A02.put(A05(1448, 5, 49), -1);
        A02.put(A05(1453, 10, 101), -657931);
        A02.put(A05(1463, 6, 38), -256);
        A02.put(A05(1469, 11, 30), -6632142);
    }

    public static int A00(int i10, int i11, int i12) {
        return A01(FunctionEval.FunctionID.EXTERNAL_FUNC, i10, i11, i12);
    }

    public static int A01(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    public static int A02(String str) {
        return A04(str, true);
    }

    public static int A03(String str) {
        return A04(str, false);
    }

    public static int A04(String str, boolean z10) {
        int parseInt;
        AbstractC0844Hf.A03(!TextUtils.isEmpty(str));
        String replace = str.replace(A05(0, 1, 103), A05(0, 0, 32));
        if (replace.charAt(0) == '#') {
            int parseLong = (int) Long.parseLong(replace.substring(1), 16);
            if (replace.length() == 7) {
                return (-16777216) | parseLong;
            }
            if (replace.length() == 9) {
                return ((parseLong & FunctionEval.FunctionID.EXTERNAL_FUNC) << 24) | (parseLong >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (replace.startsWith(A05(1262, 4, 13))) {
            Matcher matcher = (z10 ? A03 : A04).matcher(replace);
            if (matcher.matches()) {
                if (z10) {
                    parseInt = (int) (Float.parseFloat(matcher.group(4)) * 255.0f);
                } else {
                    parseInt = Integer.parseInt(matcher.group(4), 10);
                }
                return A01(parseInt, Integer.parseInt(matcher.group(1), 10), Integer.parseInt(matcher.group(2), 10), Integer.parseInt(matcher.group(3), 10));
            }
        } else if (replace.startsWith(A05(1259, 3, 40))) {
            Matcher matcher2 = A05.matcher(replace);
            if (matcher2.matches()) {
                return A00(Integer.parseInt(matcher2.group(1), 10), Integer.parseInt(matcher2.group(2), 10), Integer.parseInt(matcher2.group(3), 10));
            }
        } else {
            Integer color = A02.get(IK.A0M(replace));
            if (color != null) {
                return color.intValue();
            }
        }
        throw new IllegalArgumentException();
    }
}
