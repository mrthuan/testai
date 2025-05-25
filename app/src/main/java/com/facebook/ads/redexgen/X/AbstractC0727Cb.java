package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.adjust.sdk.network.ErrorCodes;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ApicFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.CommentFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.InternalFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.TextInformationFrame;
import com.tom_roush.fontbox.ttf.WGL4Names;
import java.util.Arrays;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.Cb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0727Cb {
    public static byte[] A00;
    public static String[] A01 = {"MFKZRNfE5LKgelOl5YZG5lkN79pCMSOj", "7XRJ9n3VKsznrkMad32wBzGjTyZQuAWt", "DODzeSGoEcF4lIeSgHx85i0M3f36R", "UN4uEosLC7l1uEf6nFtlcbZtnvtJNTdL", "LZW51xhWog0mzOBaK8aIWH1fPTNnB2TH", "5kk0Roeus2oZhYogqtjwPTNstKQRY8en", "saBem6mzmwGkGuCiSgbsTgInQDD10eKq", "7uf5GFKBHSfhhBvQi0nrSYO7FNHs97Sp"};
    public static final int A02;
    public static final int A03;
    public static final int A04;
    public static final int A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public static final int A0L;
    public static final int A0M;
    public static final int A0N;
    public static final int A0O;
    public static final int A0P;
    public static final int A0Q;
    public static final int A0R;
    public static final int A0S;
    public static final int A0T;
    public static final int A0U;
    public static final String[] A0V;

    public static String A09(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 64);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A00 = new byte[]{22, 22, 22, 22, 103, 76, Field.DDE, 110, 108, 125, 104, 97, 97, 108, Field.BARCODE, 44, 42, Field.DOCPROPERTY, 119, 125, 112, 32, 2, 8, 5, Field.SECTION, 43, 0, Field.NUMWORDS, Field.NUMWORDS, 26, 56, Field.GOTOBUTTON, Field.BARCODE, 123, 11, Field.DDEAUTO, Field.AUTONUMLGL, 48, Field.BIDIOUTLINE, 126, 114, 104, 110, 105, 116, 126, 123, 86, 78, Field.SHAPE, Field.NOTEREF, Field.ADVANCE, 104, Field.DOCPROPERTY, Field.AUTOTEXTLIST, Field.ADDIN, 123, 86, 78, Field.SHAPE, Field.NOTEREF, Field.ADVANCE, Field.HTMLCONTROL, 78, Field.FORMDROPDOWN, 76, Field.SHAPE, 82, 126, 113, 122, 118, 125, 103, 22, Field.SYMBOL, Field.USERADDRESS, 58, Field.GOTOBUTTON, Field.SECTION, 118, 97, 110, 116, 103, 97, 114, 100, 101, 12, Field.GLOSSARY, 34, 34, Field.GLOSSARY, 42, 12, Field.GLOSSARY, 61, 61, 96, Field.FORMCHECKBOX, Field.INCLUDEPICTURE, 86, 25, Field.USERADDRESS, Field.SYMBOL, Field.AUTONUMOUT, Field.SYMBOL, Field.DATA, 3, 13, 74, Field.DATA, 11, 4, 14, Field.ADDRESSBLOCK, 115, 126, 124, 116, Field.BARCODE, 82, 122, 107, 126, 115, 98, 76, Field.DOCPROPERTY, Field.FILESIZE, Field.FORMCHECKBOX, 82, Field.SECTION, Field.FORMDROPDOWN, Field.FORMDROPDOWN, Field.NOTEREF, 102, Byte.MAX_VALUE, 111, 121, Field.NOTEREF, 101, 101, 126, 115, 42, Field.NOTEREF, 107, 121, 121, 36, 20, 15, 18, Field.AUTONUM, 9, 22, 58, 24, Field.NUMWORDS, 24, 11, Field.NUMCHARS, 13, 23, Field.EQ, 56, 32, 61, Field.IMPORT, 31, Field.AUTONUMOUT, 61, Field.EQ, Field.USERADDRESS, Field.SYMBOL, Field.DDEAUTO, 124, 17, 41, Field.GLOSSARY, Field.AUTONUMLGL, Field.BARCODE, Field.DOCPROPERTY, 126, 119, 120, 101, 121, 120, 76, 103, 96, 125, 122, 124, 44, 7, 29, 6, Field.NUMCHARS, Field.NUMWORDS, 6, 14, 1, Field.AUTOTEXT, Field.DATA, 14, 1, 8, Field.NUMCHARS, Field.NUMWORDS, 14, Field.AUTOTEXT, 61, 14, 31, 105, Field.SECTIONPAGES, Field.HYPERLINK, Field.INCLUDEPICTURE, Field.AUTOTEXTLIST, Field.GREETINGLINE, Field.INCLUDEPICTURE, Field.MERGESEQ, Field.INCLUDETEXT, 10, 120, Field.MERGESEQ, Field.LISTNUM, 115, Field.HYPERLINK, Field.SECTIONPAGES, Field.AUTOTEXTLIST, Field.INCLUDEPICTURE, Field.INCLUDETEXT, Field.AUTOTEXTLIST, Field.ADDIN, Field.GREETINGLINE, 16, 98, Field.SHAPE, Field.FORMDROPDOWN, Field.HTMLCONTROL, Field.PAGEREF, 10, 7, 21, 21, 15, 5, Field.FORMTEXT, Field.AUTONUMOUT, 9, 5, 13, 32, 15, 2, 16, 16, 10, 0, 2, 15, Field.PAGEREF, 10, 19, 4, 30, Field.EQ, Field.DATA, Field.BARCODE, 112, 21, Field.GOTOBUTTON, Field.DATA, Field.DDEAUTO, 56, 17, 61, Field.BARCODE, Field.IMPORT, Field.AUTONUM, 43, 17, 61, 60, Field.ASK, Field.IMPORT, Field.BARCODE, 34, 61, 32, Field.MACROBUTTON, 32, 43, 114, 17, 58, 32, 59, 33, Field.ASK, 59, Field.MACROBUTTON, 60, 113, Field.ADDRESSBLOCK, Field.FORMCHECKBOX, Field.BIDIOUTLINE, Field.FORMTEXT, 64, Field.MERGESEQ, 103, 86, Field.MERGESEQ, Field.CONTROL, Field.CONTROL, Field.MERGESEQ, 82, Field.SECTION, 86, 77, 123, 98, 122, 16, Field.AUTONUMLGL, 58, Field.IMPORT, Field.EQ, Field.HYPERLINK, 125, 114, Byte.MAX_VALUE, 121, 60, Field.ADVANCE, 125, 112, 112, Field.LISTNUM, Byte.MAX_VALUE, 108, 117, 105, Byte.MAX_VALUE, 104, 123, Field.FORMDROPDOWN, 114, 118, 99, Byte.MAX_VALUE, Field.IMPORT, Field.LISTNUM, 114, 99, 118, 123, 64, 109, 119, 103, 107, 60, 10, 29, 25, 21, 74, 124, 123, 99, Field.DDEAUTO, Field.DATA, Field.DDEAUTO, 76, 111, 125, 125, Field.AUTONUM, 0, 7, 31, 82, 33, 29, 30, 29, Field.GOTOBUTTON, 3, 19, 2, 59, 31, 13, 7, Field.GREETINGLINE, Field.GOTOBUTTON, 23, 13, 10, Field.NUMWORDS, 16, 23, 16, 25, 80, 121, 112, 118, 97, 103, 122, 123, 124, 118, Field.TOA, 120, 100, 98, 101, 111, Field.SECTIONPAGES, 114, 117, 104, 42, Field.AUTOTEXT, 104, 114, 116, 98, 42, 26, 29, 0, Field.SECTIONPAGES, 59, 10, 12, 7, 1, 0, 4, Field.AUTONUMOUT, Field.MACROBUTTON, Field.DDEAUTO, Field.PAGEREF, 32, Field.GLOSSARY, 34, 36, 126, Field.AUTOTEXTLIST, Field.ADDIN, Field.ADVANCE, Field.ADDRESSBLOCK, Field.BIDIOUTLINE, 24, 76, Field.CONTROL, 24, Field.NOTEREF, Field.AUTOTEXTLIST, 74, Field.MERGESEQ, Field.ADDRESSBLOCK, 24, Field.HTMLCONTROL, Field.CONTROL, Field.DOCPROPERTY, Field.DOCPROPERTY, Field.ADDRESSBLOCK, 86, 76, 24, Field.AUTOTEXTLIST, 76, 76, 74, Field.ADDIN, Field.LISTNUM, 77, 76, Field.ADDRESSBLOCK, 2, 24, 8, Field.GLOSSARY, Field.FILLIN, 34, 43, 42, 110, 58, 33, 110, Field.USERADDRESS, Field.GLOSSARY, 60, 61, 43, 110, Field.DDE, 33, 56, 43, 60, 110, Field.GLOSSARY, 60, 58, 110, Field.GLOSSARY, 58, 58, 60, Field.FILLIN, 44, 59, 58, 43, 111, Field.NOTEREF, 64, Field.FILESIZE, 76, 77, 9, Field.ADDRESSBLOCK, Field.FORMTEXT, 9, Field.AUTOTEXTLIST, Field.NOTEREF, Field.HTMLCONTROL, Field.LISTNUM, 76, 9, 64, Field.FORMCHECKBOX, 77, 76, Field.ADDIN, 6, 74, Field.FORMTEXT, Field.BIDIOUTLINE, Field.FORMCHECKBOX, Field.ADDRESSBLOCK, 9, Field.NOTEREF, Field.ADDRESSBLOCK, Field.ADDRESSBLOCK, Field.HTMLCONTROL, 64, Field.MERGESEQ, Field.BIDIOUTLINE, Field.ADDRESSBLOCK, 76, 19, 9, 64, 103, 111, 106, 99, 98, Field.ASK, 114, 105, Field.ASK, 118, 103, 116, 117, 99, Field.ASK, 117, 114, 103, 104, 98, 103, 116, 98, Field.ASK, 97, 99, 104, 116, 99, Field.ASK, 101, 105, 98, 99, Field.IMPORT, 16, 24, 29, 20, 21, Field.ADDIN, 5, 30, Field.ADDIN, 1, 16, 3, 2, 20, Field.ADDIN, 5, 20, 9, 5, Field.ADDIN, 16, 5, 5, 3, 24, 19, 4, 5, 20, Field.MERGESEQ, Field.ADDIN, 9, Field.DDEAUTO, Field.ASK, Field.QUOTE, 42, 43, 111, 59, 32, 111, Field.BARCODE, Field.DDEAUTO, 61, 60, 42, 111, 58, Field.ASK, 33, 59, 119, 111, Field.DDEAUTO, 59, 59, 61, Field.ASK, Field.DDE, 58, 59, 42, 111, Field.SYMBOL, Field.DDEAUTO, Field.QUOTE, 58, 42, 113, 86, Field.GREETINGLINE, Field.HTMLCONTROL, 82, Field.FORMDROPDOWN, 23, Field.INCLUDEPICTURE, Field.HYPERLINK, 23, Field.FORMCHECKBOX, 86, Field.FILESIZE, Field.INCLUDETEXT, 82, 23, Field.SECTIONPAGES, Field.GREETINGLINE, Field.AUTOTEXTLIST, Field.INCLUDEPICTURE, 15, 23, 86, Field.INCLUDEPICTURE, Field.INCLUDEPICTURE, Field.FILESIZE, Field.GREETINGLINE, Field.DOCPROPERTY, Field.SECTIONPAGES, Field.INCLUDEPICTURE, 82, 13, 23, 41, 14, Field.NUMCHARS, Field.NUMWORDS, Field.AUTOTEXT, 41, 26, Field.NUMCHARS, 6, 0, 1, 32, 9, 10, 13, 99, 74, Field.TOA, 78, 8, 119, 74, Field.FORMTEXT, 78, 101, 76, Field.AUTOTEXT, Field.NOTEREF, Field.AUTOTEXT, 76, Field.ADDIN, Field.FORMTEXT, Field.DOCPROPERTY, 97, 118, 118, 96, 103, 106, Byte.MAX_VALUE, 118, 119, Field.INCLUDETEXT, Field.SHAPE, Field.LISTNUM, Field.BARCODE, 12, 10, 16, 22, 23, 112, 86, Field.LISTNUM, 82, 20, Field.GOTOBUTTON, 61, Field.AUTONUMOUT, 32, Field.FILLIN, Field.GOTOBUTTON, 80, 120, 118, Field.LISTNUM, 114, 110, 109, 120, 113, 120, 80, Field.MERGESEQ, Field.CONTROL, 86, Field.BIDIOUTLINE, 32, 8, 19, 15, 14, 4, Field.FORMCHECKBOX, Field.AUTONUMLGL, 8, 4, 12, 82, 103, 96, 123, 114, 112, Byte.MAX_VALUE, 86, Field.FILESIZE, Field.FORMDROPDOWN, 23, 101, Field.HYPERLINK, Field.ADVANCE, Field.BIDIOUTLINE, 15, Field.ASK, Field.AUTONUMLGL, Field.QUOTE, 36, Field.DATA, Field.AUTONUMLGL, 34, 105, Field.INCLUDETEXT, 64, Field.CONTROL, Field.HYPERLINK, 1, 108, Field.INCLUDETEXT, Field.DOCPROPERTY, 64, 77, 124, Field.ADDRESSBLOCK, Field.INCLUDETEXT, 25, 124, Field.HTMLCONTROL, Field.INCLUDETEXT, Field.NUMWORDS, 60, Field.ASK, 32, Field.AUTONUM, 1, 60, 36, Field.ASK, 60, 59, 56, Field.PAGEREF, 36, Field.BARCODE, Field.AUTONUMOUT, 34, 48, Field.AUTONUMLGL, Field.FILLIN, 56, 34, Field.USERADDRESS, Field.QUOTE, Field.DATA, 74, Field.CONTROL, 86, 77, Field.FORMTEXT, 80, Field.INCLUDETEXT, Field.SECTIONPAGES, Field.FORMDROPDOWN, Field.AUTOTEXT, Field.FORMTEXT, 80, 80, 86, 113, 123, 118, 122, 29, 58, 48, 33, Field.FILLIN, 32, Field.ASK, 61, Field.AUTONUMLGL, 56, Field.BARCODE, 24, 5, 2, 4, 3, Field.NUMWORDS, 19, 24, 2, 23, 26, Field.AUTONUMOUT, 19, 14, 9, 15, 8, 16, 24, 19, 9, Field.NUMCHARS, 17, Field.ADDRESSBLOCK, Field.DDE, 18, 13, 120, Field.SHAPE, Field.SECTIONPAGES, Field.FILESIZE, Field.INCLUDEPICTURE, Field.INCLUDETEXT, Field.BIDIOUTLINE, Field.ADVANCE, Field.SHAPE, Field.FILESIZE, 80, Field.ADDRESSBLOCK, 17, 99, Field.GREETINGLINE, 82, Field.LISTNUM, Field.BARCODE, 20, 15, 15, 100, Field.AUTOTEXT, Field.ADVANCE, Field.ADVANCE, 5, 104, Field.HTMLCONTROL, 64, Field.FILESIZE, Field.NUMCHARS, Field.ASK, Field.SYMBOL, Field.ASK, Field.DDEAUTO, 17, 10, 3, 8, 1, 107, Field.FORMTEXT, Field.FORMDROPDOWN, 78, Field.TOA, Field.AUTOTEXT, 108, Field.DDEAUTO, Field.FILESIZE, 106, Field.AUTOTEXT, 103, 102, 107, 118, 99, 118, 107, 116, 103, Field.IMPORT, 31, 8, 31, 20, 29, 15, 31, 6, Field.DDEAUTO, Field.BARCODE, 42, Field.GLOSSARY, 42, Field.BARCODE, 42, 30, Field.BARCODE, 34, Field.FILLIN, 48, 24, 9, Field.NUMCHARS, 17, Field.ADDRESSBLOCK, 101, 
        99, 121, 115, 113, 124, 99, 76, Field.AUTOTEXTLIST, Field.INCLUDETEXT, Field.SECTIONPAGES, Field.INCLUDEPICTURE, 76, Field.SECTION, 13, 107, Field.SECTIONPAGES, Field.SECTION, Field.FORMTEXT, Field.FORMDROPDOWN, 124, 105, 116, 107, 120, 61, Field.BIDIOUTLINE, 112, 120, 111, 116, 126, 124, 115, Field.GOTOBUTTON, 25, Field.NUMWORDS, 25, 14, 12, 9, 18, 23, 113, Field.LISTNUM, Field.NOTEREF, 31, 126, Field.HYPERLINK, Field.LISTNUM, 109, Field.FORMTEXT, Field.ADVANCE, 3, 116, Field.SECTIONPAGES, Field.DOCPROPERTY, Field.FORMTEXT, Field.ADVANCE, 117, 115, 105, Byte.MAX_VALUE, 119, Field.ADVANCE, Field.BIDIOUTLINE, Field.ADDIN, Field.ADDRESSBLOCK, Field.MERGESEQ, 5, 58, Field.GLOSSARY, 56, 43, Field.GLOSSARY, 20, 8, 5, 18, 103, Field.HYPERLINK, Field.HTMLCONTROL, Field.BIDIOUTLINE, 86, Field.FORMTEXT, 121, 122, 101, 125, Field.AUTONUM, Field.FORMTEXT, 99, 120, 125, 116, Field.MERGESEQ, Field.ADVANCE, Field.HTMLCONTROL, 100, 123, Field.ASK, 77, 100, 103, 96, 56, 7, 24, Field.FORMCHECKBOX, Field.DDEAUTO, 29, 6, 3, 96, Field.SHAPE, Field.SECTIONPAGES, Field.GREETINGLINE, 16, 119, Field.SECTIONPAGES, Field.SHAPE, Field.SHAPE, Field.FORMTEXT, Field.DOCPROPERTY, 86, 105, 113, 99, 116, Field.ASK, Field.INCLUDETEXT, 103, 106, 106, 103, 98, Field.GLOSSARY, 13, 30, 17, 20, 12, 96, Field.SECTIONPAGES, Field.AUTOTEXTLIST, Field.ADDRESSBLOCK, Field.FILESIZE, Field.INCLUDEPICTURE, Field.DDE, 15, 18, 26, 15, 24, 14, 14, 20, 11, 24, Field.ADDRESSBLOCK, Field.GLOSSARY, 18, 30, 22, 96, Field.INCLUDEPICTURE, Field.TOA, Field.FORMDROPDOWN, Field.HYPERLINK, Field.ADDIN, Field.ADVANCE, Field.DOCPROPERTY, Field.BIDIOUTLINE, Field.AUTOTEXTLIST, Field.FORMDROPDOWN, 106, Field.TOA, Field.INCLUDEPICTURE, Field.AUTOTEXTLIST, 82, Field.SHAPE, Field.GREETINGLINE, Field.SHAPE, 86, Field.FORMDROPDOWN, Field.AUTOTEXTLIST, 26, 104, Field.DOCPROPERTY, Field.AUTOTEXTLIST, Field.ADDIN, 64, 101, 126, 123, 126, Field.HTMLCONTROL, 64, Field.FILESIZE, 14, 124, Field.SECTION, 77, Field.FILESIZE, Field.SECTIONPAGES, Field.AUTONUM, 82, 42, 25, 8, Field.GREETINGLINE, 109, 122, 105, Field.USERADDRESS, 9, 11, 11, 13, 9, 78, 121, 104, 110, 115, 56, 15, Field.NUMCHARS, 3, Field.NUMCHARS, 11, 6, 119, 77, Field.BIDIOUTLINE, Field.ADDIN, 77, Field.NOTEREF, 76, Field.FORMTEXT, 5, 118, 74, 80, Field.TOA, 100, Field.AUTOTEXTLIST, Field.DOCPROPERTY, Field.ADDRESSBLOCK, Field.AUTOTEXT, 114, 126, 118, 61, 59, 61, Field.AUTOTEXT, 114, 113, 113, 121, Field.MERGESEQ, Field.FORMTEXT, Field.AUTOTEXTLIST, Field.MERGESEQ, 1, Field.MACROBUTTON, Field.BARCODE, 48, Field.MACROBUTTON, 34, 16, 5, 24, 3, 20, 9, Field.GOTOBUTTON, Field.AUTONUMLGL, Field.DDE, Field.DDEAUTO, Field.GLOSSARY, Field.AUTONUMOUT, Field.BARCODE, 41, 30, Field.ASK, 44, Field.GREETINGLINE, 102, 100, 125, 125, 104, 105, Field.DDE, 120, 99, 102, 99, 98, 122, 99, Field.DDE, 96, 104, 121, 108, 105, 108, 121, 108, Field.DDE, 104, 99, 121, Byte.MAX_VALUE, 116, Field.IMPORT, Field.DDE, 82, 109, 110, 118, 33, Field.MERGESEQ, 96, 108, Field.FORMDROPDOWN, 108, 111, 119, 32, 82, 111, 99, 107, 123, Field.FORMCHECKBOX, Field.FORMTEXT, Field.TOA, Field.BIDIOUTLINE, Field.TOA, 108, 80, 74, Field.FORMDROPDOWN, Field.FORMCHECKBOX, 123, 97, 122, 112, Field.AUTONUMOUT, Field.CONTROL, 120, 125, 100, Field.FILLIN, Field.NUMWORDS, 1, 26, 16, 0, 6, 21, 23, 31, 101, Field.AUTOTEXTLIST, Field.INCLUDEPICTURE, Field.SECTIONPAGES, Field.GREETINGLINE, Field.FORMDROPDOWN, Field.INCLUDETEXT, Field.HYPERLINK, 22, 100, Field.AUTOTEXTLIST, Field.DOCPROPERTY, Field.ADDRESSBLOCK, 22, Field.AUTONUMLGL, 36, Field.ASK, 32, 61, 30, 11, 11, 13, 6, 125, Field.AUTOTEXTLIST, Field.FORMCHECKBOX, 64, Field.TOA, 19, Field.SYMBOL, Field.DDE, 48, Field.DATA, Field.GLOSSARY, Field.DDEAUTO, 41, Field.QUOTE, 96, 18, Field.GLOSSARY, Field.QUOTE, 43, 8, 34, Field.AUTONUM, 43, Field.MACROBUTTON, Field.AUTONUMOUT, Field.AUTONUMLGL, 34, 97, Field.MERGESEQ, Field.BIDIOUTLINE, Field.FORMTEXT, Field.LISTNUM, Field.SECTIONPAGES, Field.ADDRESSBLOCK, Field.SECTIONPAGES, 60, 41, 36, 42, 108, 122, 104, 117, 98, 117, 123, 102, 22, 1, 13, 15, 102, 113, 125, 124, Field.IMPORT, Field.FILLIN, Field.EQ, 32, Byte.MAX_VALUE, 98, Byte.MAX_VALUE, 26, Field.AUTONUM, 43, Field.AUTONUM, 80, 102, 98, 119, 3, Field.USERADDRESS, 58, Field.GLOSSARY, Field.HYPERLINK, 96, 100, 123, 103, Field.QUOTE, Field.PAGEREF, Field.AUTONUMOUT, 60, Field.SYMBOL, Field.USERADDRESS, 34, Field.SHAPE, 110, 105, 117, 123, 77, 74, 86, Field.LISTNUM, Field.TOA, 78, 82, 77, 3, 4, 24, 3, 98, 101, 101, 115, 99, 97, 100, Byte.MAX_VALUE, 120, 96, 99, 97, 100, Byte.MAX_VALUE, 120, 96, 100, 120, 101, 99, 14, 59, Field.AUTONUMOUT, 61, Field.AUTONUMLGL, 15, Field.USERADDRESS, 56, Field.MACROBUTTON, Field.AUTONUMLGL, Field.AUTONUMOUT, 118, Field.FORMCHECKBOX, Field.SECTION, 74, 76, 77, 15, 107, 76, Field.FORMTEXT, Field.CONTROL, Field.ADDIN, 86, 80, Field.MERGESEQ, Field.INCLUDEPICTURE, 78, Field.NUMCHARS, Field.DDE, 58, 58, Field.FILLIN, 58, 60, 0, 26, 9, Field.NUMWORDS, 0, Field.NOTEREF, Field.PAGEREF, 13, Field.NUMCHARS, 9, 4, 101, Field.GREETINGLINE, Field.SECTION, 17, 5, 1, 2, 36, Field.IMPORT, Field.BARCODE, 58, Field.MACROBUTTON, 36, Field.HTMLCONTROL, 125, 110, 97, 108, 106, 0, Field.ASK, 61, Field.AUTONUM, Field.AUTONUMLGL, 56, Field.IMPORT, 17, 10, 19, 78, 43, 12, 19, 14, 8, 23, 15, 2, Field.SYMBOL, Field.PAGEREF, Field.GOTOBUTTON, Field.AUTONUMOUT, 56, 48, Field.SYMBOL, Field.USERADDRESS, Field.DDE, Field.GOTOBUTTON, Field.MACROBUTTON, 119, Field.AUTONUMOUT, 56, 33, Field.GOTOBUTTON, Field.PAGEREF, 119, Field.AUTONUM, Field.PAGEREF, Field.QUOTE, 119, Field.EQ, 59, Field.AUTONUM, 48, 36, 109, 119, Byte.MAX_VALUE, Field.FORMTEXT, 74, Field.NOTEREF, Field.FILESIZE, Field.GLOSSARY, 15, Field.NUMCHARS, 26, 36, 41, Field.FILLIN, Field.AUTONUM, 56, 33, Field.IMPORT, 59, Field.SYMBOL, 9, 5, Field.NUMCHARS, 24, Field.MERGESEQ, Field.HYPERLINK, Field.SECTION, Field.INCLUDETEXT, Field.MERGESEQ, 78, 86, 124, 113, 107, 115, Field.AUTOTEXTLIST, Field.HTMLCONTROL, 80, Field.ADDIN, Field.HYPERLINK, Field.INCLUDETEXT, Field.FORMDROPDOWN, 98, 119, 117, 11, 15, 3, 5, 7, 77, 8, 18, 7, 5, 74, 78, Field.SECTIONPAGES, Field.INCLUDETEXT, Field.FORMTEXT, 12, Field.FORMDROPDOWN, 77, Field.INCLUDETEXT, 60, 41, 34, 43, 36, Field.DATA, Field.SHAPE, Field.NOTEREF, 78, Field.SHAPE, Field.BIDIOUTLINE, Field.LISTNUM, 64, Field.TOA, 100, 120, 118, 118, 116, 104, 102, 107, 122, 102, 104, 123, 0, Field.NUMCHARS, 16, Field.NUMCHARS, Field.BARCODE, Field.QUOTE, 34, 33, Field.PAGEREF, Field.SYMBOL, Field.PAGEREF, 56, Field.DATA, Field.EQ, 44, Field.MACROBUTTON, 44, Field.IMPORT, Field.IMPORT, Field.AUTOTEXTLIST, Field.SHAPE, Field.FORMTEXT, 121, Byte.MAX_VALUE, 102, 99, 44, Field.DDEAUTO, 43, 48, 120, 99, 105, 74, Field.AUTOTEXT, Field.TOA};
    }

    static {
        A0A();
        A0A = IK.A08(A09(1691, 3, 5));
        A0B = IK.A08(A09(1733, 3, 109));
        A04 = IK.A08(A09(1638, 3, 21));
        A0C = IK.A08(A09(1652, 3, 111));
        A03 = IK.A08(A09(14, 3, 62));
        A07 = IK.A08(A09(1730, 3, 24));
        A02 = IK.A08(A09(1635, 3, 5));
        A05 = IK.A08(A09(1641, 3, 20));
        A06 = IK.A08(A09(1747, 3, 125));
        A09 = IK.A08(A09(1688, 3, 16));
        A08 = IK.A08(A09(1659, 3, 126));
        A0F = IK.A08(A09(1644, 4, 42));
        A0I = IK.A08(A09(1662, 4, 118));
        A0J = IK.A08(A09(1666, 3, 69));
        A0G = IK.A08(A09(1655, 4, 88));
        A0S = IK.A08(A09(1736, 4, 77));
        A0R = IK.A08(A09(1726, 4, 28));
        A0E = IK.A08(A09(1648, 4, 104));
        A0D = IK.A08(A09(1631, 4, 14));
        A0Q = IK.A08(A09(1718, 4, 12));
        A0M = IK.A08(A09(1706, 4, 71));
        A0O = IK.A08(A09(1710, 4, 73));
        A0N = IK.A08(A09(1702, 4, 87));
        A0P = IK.A08(A09(1714, 4, 51));
        A0L = IK.A08(A09(1698, 4, 110));
        A0H = IK.A08(A09(1694, 4, 111));
        A0U = IK.A08(A09(1722, 4, 22));
        A0T = IK.A08(A09(1740, 4, 24));
        A0K = IK.A08(A09(0, 4, 123));
        A0V = new String[]{A09(ShapeTypes.FLOW_CHART_DOCUMENT, 5, 74), A09(246, 12, 38), A09(309, 7, 114), A09(329, 5, 20), A09(363, 5, 68), A09(744, 4, 113), A09(791, 6, 85), A09(825, 7, 116), A09(930, 4, 53), A09(993, 5, 61), A09(1042, 7, ShapeTypes.VERTICAL_SCROLL), A09(1062, 6, 120), A09(1073, 5, 32), A09(1093, 3, 100), A09(1203, 3, 80), A09(1206, 3, 56), A09(1213, 6, 44), A09(1244, 4, 118), A09(1518, 6, 27), A09(875, 10, 20), A09(57, 11, 122), A09(1284, 3, 13), A09(352, 11, 87), A09(1135, 6, 63), A09(1356, 10, 52), A09(437, 11, 47), A09(68, 7, 83), A09(1584, 8, 35), A09(1626, 5, 105), A09(934, 9, 110), A09(748, 6, 57), A09(1572, 6, 79), A09(WGL4Names.NUMBER_OF_MAC_GLYPHS, 9, 35), A09(885, 12, 54), A09(17, 4, 84), A09(832, 5, 19), A09(754, 4, 119), A09(1346, 10, 84), A09(768, 6, 93), A09(1057, 5, 90), A09(47, 10, 122), A09(96, 4, 14), A09(1342, 4, ShapeTypes.VERTICAL_SCROLL), A09(1190, 4, 80), A09(1379, 5, 5), A09(963, 10, 66), A09(897, 16, 61), A09(913, 17, 113), A09(421, 6, 76), A09(774, 6, ShapeTypes.VERTICAL_SCROLL), A09(344, 8, 94), A09(1524, 17, 98), A09(TTAdConstant.IMAGE_CODE, 10, 85), A09(1096, 8, 75), A09(448, 9, 1), A09(368, 5, 56), A09(1366, 13, 118), A09(281, 6, 18), A09(325, 4, 78), A09(758, 7, 19), A09(1559, 6, 113), A09(219, 13, 106), A09(1104, 8, 40), A09(947, 6, 36), A09(1018, 15, 93), A09(ShapeTypes.FLOW_CHART_ALTERNATE_PROCESS, 7, 57), A09(1049, 8, 99), A09(1163, 11, 112), A09(1209, 4, 76), A09(1275, 9, 26), A09(1565, 7, 22), A09(958, 5, 67), A09(1578, 6, 20), A09(30, 9, 27), A09(21, 9, 33), A09(1078, 5, 119), A09(1219, 5, 92), A09(998, 7, 80), A09(1248, 11, 93), A09(797, 9, 119), A09(714, 4, 38), A09(718, 9, 101), A09(ErrorCodes.SOCKET_TIMEOUT_EXCEPTION, 13, 109), A09(1390, 5, 110), A09(703, 11, 47), A09(104, 5, 27), A09(953, 5, 103), A09(1224, 7, 42), A09(ShapeTypes.ACTION_BUTTON_BACK_PREVIOUS, 6, 20), A09(128, 9, 96), A09(80, 10, 64), A09(780, 11, 39), A09(1147, 16, 61), A09(1174, 16, 122), A09(1395, 14, 0), A09(1327, 9, 64), A09(109, 8, 42), A09(192, 6, 79), A09(397, 14, 62), A09(39, 8, 93), A09(837, 6, 9), A09(1384, 6, 46), A09(ShapeTypes.CHART_X, 7, 86), A09(1068, 5, 10), A09(ShapeTypes.ACTION_BUTTON_MOVIE, 13, 28), A09(1336, 6, 104), A09(1409, 8, 27), A09(ShapeTypes.FLOW_CHART_MANUAL_OPERATION, 10, 74), A09(1141, 6, 112), A09(1112, 11, 112), A09(1269, 6, 49), A09(1319, 8, 65), A09(267, 4, 38), A09(1513, 5, 26), A09(1264, 5, 18), A09(727, 8, 99), A09(90, 6, 14), A09(1123, 12, 70), A09(1231, 13, 101), A09(735, 9, 83), A09(393, 4, 54), A09(1194, 9, 110), A09(384, 9, 50), A09(5, 9, 77), A09(427, 10, 71), A09(334, 10, 92), A09(765, 3, 87), A09(373, 11, 78), A09(271, 10, 29), A09(806, 8, 7), A09(1541, 6, 8), A09(870, 5, 95), A09(ShapeTypes.FLOW_CHART_OFFLINE_STORAGE, 7, 38), A09(1033, 9, 60), A09(1083, 10, 86), A09(100, 4, 98), A09(198, 21, 47), A09(814, 11, 97), A09(117, 11, 95), A09(316, 9, 100), A09(287, 22, 18), A09(232, 14, 112), A09(973, 8, 58), A09(1259, 5, 106), A09(1547, 12, 40), A09(75, 5, 23), A09(943, 4, 22), A09(1417, 8, 114)};
    }

    public static int A00(I4 i42) {
        i42.A0Z(4);
        int A082 = i42.A08();
        int atomType = CO.A0F;
        if (A082 == atomType) {
            i42.A0Z(8);
            int A0E2 = i42.A0E();
            if (A01[5].charAt(25) != 'K') {
                throw new RuntimeException();
            }
            A01[6] = "v3dratF8uS1bGgr8CKDg71frPtPmOQP2";
            return A0E2;
        }
        Log.w(A09(981, 12, 11), A09(633, 37, 15));
        return -1;
    }

    public static ApicFrame A01(I4 i42) {
        String mimeType;
        int A082 = i42.A08();
        int A083 = i42.A08();
        int i10 = CO.A0F;
        String A092 = A09(981, 12, 11);
        if (A083 == i10) {
            int A084 = i42.A08();
            int atomType = A01[0].charAt(15);
            if (atomType != 108) {
                throw new RuntimeException();
            }
            A01[5] = "qGElklccUGYaCPiJcZ7Rg4NshKbeEBAR";
            int A002 = CO.A00(A084);
            if (A002 == 13) {
                int atomType2 = A01[7].charAt(20);
                if (atomType2 != 83) {
                    throw new RuntimeException();
                }
                A01[6] = "0c2lioblnouP1EUceYfeEOePY9KxVly9";
                mimeType = A09(1669, 10, 34);
            } else {
                mimeType = A002 == 14 ? A09(1679, 9, 99) : null;
            }
            if (mimeType == null) {
                Log.w(A092, A09(1596, 30, 23) + A002);
                return null;
            }
            i42.A0Z(4);
            int atomSize = A082 - 16;
            byte[] bArr = new byte[atomSize];
            int atomSize2 = bArr.length;
            i42.A0c(bArr, 0, atomSize2);
            return new ApicFrame(mimeType, null, 3, bArr);
        }
        Log.w(A092, A09(492, 35, 14));
        return null;
    }

    public static CommentFrame A02(int i10, I4 i42) {
        int A082 = i42.A08();
        int atomType = i42.A08();
        int atomSize = CO.A0F;
        if (atomType == atomSize) {
            i42.A0Z(8);
            int atomSize2 = A082 - 16;
            String A0R2 = i42.A0R(atomSize2);
            return new CommentFrame(A09(1744, 3, 77), A0R2, A0R2);
        }
        Log.w(A09(981, 12, 11), A09(457, 35, 120) + CO.A02(i10));
        return null;
    }

    public static Id3Frame A03(int i10, String str, I4 i42, boolean z10, boolean z11) {
        int A002 = A00(i42);
        if (z11) {
            A002 = Math.min(1, A002);
        }
        if (A002 >= 0) {
            if (z10) {
                return new TextInformationFrame(str, null, Integer.toString(A002));
            }
            return new CommentFrame(A09(1744, 3, 77), str, Integer.toString(A002));
        }
        Log.w(A09(981, 12, 11), A09(670, 33, 119) + CO.A02(i10));
        return null;
    }

    public static Id3Frame A04(I4 i42) {
        int position = i42.A06();
        int shortType = i42.A08() + position;
        int typeTopByte = i42.A08();
        int position2 = typeTopByte >> 24;
        int endPosition = position2 & FunctionEval.FunctionID.EXTERNAL_FUNC;
        try {
            if (endPosition == 169 || endPosition == 65533) {
                int endPosition2 = 16777215 & typeTopByte;
                int position3 = A04;
                if (endPosition2 == position3) {
                    return A02(typeTopByte, i42);
                }
                int position4 = A0A;
                if (endPosition2 != position4) {
                    int position5 = A0B;
                    if (endPosition2 != position5) {
                        int position6 = A05;
                        if (endPosition2 != position6) {
                            int position7 = A06;
                            if (endPosition2 != position7) {
                                int position8 = A0C;
                                if (endPosition2 == position8) {
                                    return A07(typeTopByte, A09(1445, 4, 35), i42);
                                }
                                int position9 = A03;
                                if (endPosition2 == position9) {
                                    return A07(typeTopByte, A09(1457, 4, 114), i42);
                                }
                                int position10 = A07;
                                if (endPosition2 == position10) {
                                    return A07(typeTopByte, A09(1493, 4, 118), i42);
                                }
                                int position11 = A02;
                                if (endPosition2 == position11) {
                                    return A07(typeTopByte, A09(1425, 4, 40), i42);
                                }
                                int position12 = A09;
                                if (endPosition2 == position12) {
                                    TextInformationFrame A072 = A07(typeTopByte, A09(1592, 4, 27), i42);
                                    i42.A0Y(shortType);
                                    if (A01[0].charAt(15) == 108) {
                                        A01[6] = "eyrANlZcPMjIlGp3ctz43NSDdPrpVkXq";
                                        return A072;
                                    }
                                    throw new RuntimeException();
                                }
                                int position13 = A08;
                                if (endPosition2 == position13) {
                                    return A07(typeTopByte, A09(1441, 4, 114), i42);
                                }
                                int position14 = A0J;
                                if (endPosition2 == position14) {
                                    return A07(typeTopByte, A09(1449, 4, 107), i42);
                                }
                                String str = A09(1287, 32, 77) + CO.A02(typeTopByte);
                                i42.A0Y(shortType);
                                return null;
                            }
                        }
                        return A07(typeTopByte, A09(1437, 4, 2), i42);
                    }
                }
                return A07(typeTopByte, A09(1453, 4, 34), i42);
            }
            int position15 = A0I;
            if (typeTopByte == position15) {
                return A08(i42);
            }
            int position16 = A0G;
            if (typeTopByte == position16) {
                return A06(typeTopByte, A09(1465, 4, 116), i42);
            }
            int position17 = A0S;
            if (typeTopByte == position17) {
                TextInformationFrame A062 = A06(typeTopByte, A09(1469, 4, 55), i42);
                i42.A0Y(shortType);
                if (A01[5].charAt(25) != 75) {
                    A01[5] = "dEL4MrWRD0Kzey4hGoWDZqcvUKARoqwc";
                    return A062;
                }
                A01[3] = "cOy0hASJa7X3hhl8ive1T2ECen89aHEG";
                return A062;
            }
            int i10 = A0R;
            if (A01[3].charAt(23) != 48) {
                A01[5] = "gKC5wBYBO5OKTL9rk0LJP6CrzKHysN1x";
                if (typeTopByte == i10) {
                    return A03(typeTopByte, A09(1429, 4, 120), i42, true, false);
                }
                if (typeTopByte == A0E) {
                    return A03(typeTopByte, A09(1433, 4, 118), i42, true, true);
                }
                if (typeTopByte == A0F) {
                    return A01(i42);
                }
                if (typeTopByte == A0D) {
                    return A07(typeTopByte, A09(1461, 4, 42), i42);
                }
                if (typeTopByte == A0Q) {
                    return A07(typeTopByte, A09(1489, 4, 23), i42);
                }
                if (typeTopByte == A0M) {
                    return A07(typeTopByte, A09(1473, 4, 45), i42);
                }
                if (typeTopByte == A0O) {
                    return A07(typeTopByte, A09(1477, 4, 122), i42);
                }
                if (typeTopByte == A0N) {
                    return A07(typeTopByte, A09(1485, 4, 93), i42);
                }
                if (typeTopByte == A0P) {
                    return A07(typeTopByte, A09(1481, 4, 89), i42);
                }
                if (typeTopByte == A0L) {
                    return A03(typeTopByte, A09(843, 14, 49), i42, false, false);
                }
                if (typeTopByte == A0H) {
                    return A03(typeTopByte, A09(857, 13, 67), i42, false, true);
                }
                int position18 = A0U;
                if (typeTopByte == position18) {
                    return A07(typeTopByte, A09(1503, 10, 119), i42);
                }
                int position19 = A0T;
                if (typeTopByte == position19) {
                    TextInformationFrame A073 = A07(typeTopByte, A09(1497, 6, 119), i42);
                    i42.A0Y(shortType);
                    if (A01[2].length() == 29) {
                        A01[7] = "PHa0inyi7GEpnSXSpoRXSebHTJ1KJs15";
                        return A073;
                    }
                    throw new RuntimeException();
                }
                int position20 = A0K;
                if (typeTopByte == position20) {
                    return A05(i42, shortType);
                }
                String str2 = A09(1287, 32, 77) + CO.A02(typeTopByte);
                i42.A0Y(shortType);
                return null;
            }
            throw new RuntimeException();
        } finally {
            i42.A0Y(shortType);
        }
    }

    public static InternalFrame A05(I4 i42, int i10) {
        String str = null;
        String str2 = null;
        int atomPosition = -1;
        int i11 = -1;
        while (i42.A06() < i10) {
            int atomType = i42.A06();
            int atomSize = i42.A08();
            int A082 = i42.A08();
            i42.A0Z(4);
            if (A082 == CO.A0e) {
                int atomSize2 = atomSize - 12;
                String name = A01[0];
                if (name.charAt(15) != 'l') {
                    throw new RuntimeException();
                }
                A01[6] = "HO4eaJrrMSu6AjdqNxy31Do5DdGYo5fB";
                str = i42.A0R(atomSize2);
            } else if (A082 == CO.A0o) {
                str2 = i42.A0R(atomSize - 12);
            } else {
                if (A082 == CO.A0F) {
                    atomPosition = atomType;
                    i11 = atomSize;
                }
                i42.A0Z(atomSize - 12);
            }
        }
        if (str == null || str2 == null || atomPosition == -1) {
            return null;
        }
        i42.A0Y(atomPosition);
        i42.A0Z(16);
        String name2 = i42.A0R(i11 - 16);
        return new InternalFrame(str, str2, name2);
    }

    public static TextInformationFrame A06(int i10, String str, I4 i42) {
        int A082 = i42.A08();
        int atomType = i42.A08();
        int atomSize = CO.A0F;
        if (atomType == atomSize && A082 >= 22) {
            i42.A0Z(10);
            int A0I2 = i42.A0I();
            if (A0I2 > 0) {
                String str2 = A09(0, 0, 95) + A0I2;
                int count = i42.A0I();
                if (count > 0) {
                    str2 = str2 + A09(4, 1, 8) + count;
                }
                return new TextInformationFrame(str, null, str2);
            }
        }
        Log.w(A09(981, 12, 11), A09(527, 39, 105) + CO.A02(i10));
        return null;
    }

    public static TextInformationFrame A07(int i10, String str, I4 i42) {
        int A082 = i42.A08();
        int atomType = i42.A08();
        int atomSize = CO.A0F;
        if (atomType == atomSize) {
            i42.A0Z(8);
            int atomSize2 = A082 - 16;
            return new TextInformationFrame(str, null, i42.A0R(atomSize2));
        }
        Log.w(A09(981, 12, 11), A09(601, 32, 49) + CO.A02(i10));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.TextInformationFrame A08(com.facebook.ads.redexgen.X.I4 r4) {
        /*
            int r2 = A00(r4)
            r4 = 0
            if (r2 <= 0) goto L23
            java.lang.String[] r0 = com.facebook.ads.redexgen.X.AbstractC0727Cb.A0V
            int r0 = r0.length
            if (r2 > r0) goto L23
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.AbstractC0727Cb.A0V
            int r0 = r2 + (-1)
            r3 = r1[r0]
        L12:
            if (r3 == 0) goto L25
            r2 = 1441(0x5a1, float:2.019E-42)
            r1 = 4
            r0 = 114(0x72, float:1.6E-43)
            java.lang.String r1 = A09(r2, r1, r0)
            com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.TextInformationFrame r0 = new com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.TextInformationFrame
            r0.<init>(r1, r4, r3)
            return r0
        L23:
            r3 = r4
            goto L12
        L25:
            r2 = 981(0x3d5, float:1.375E-42)
            r1 = 12
            r0 = 11
            java.lang.String r3 = A09(r2, r1, r0)
            r2 = 566(0x236, float:7.93E-43)
            r1 = 35
            r0 = 70
            java.lang.String r0 = A09(r2, r1, r0)
            android.util.Log.w(r3, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC0727Cb.A08(com.facebook.ads.redexgen.X.I4):com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.TextInformationFrame");
    }
}
