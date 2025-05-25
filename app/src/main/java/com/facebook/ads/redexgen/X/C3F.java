package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto;
import com.facebook.ads.internal.exoplayer2.thirdparty.video.DummySurface;
import java.util.Arrays;
import lib.zj.office.fc.hpsf.Constants;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* renamed from: com.facebook.ads.redexgen.X.3F  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C3F extends AbstractC05966m {
    public static boolean A0b;
    public static boolean A0c;
    public static byte[] A0d;
    public static String[] A0e = {"fuys41f8j9BIjf0ojt2fedQJMaOEhMwL", "PJI4NwGTXGhhOseE8AdytzgV4W1vFRln", "ZI4O58SZr", "GtHuMq8nY", "xDwAiZeXcZ6", "vfnsljbbJviNAIXV47dAQ3sPmg0uZR96", "Ds4ataWgSEjd51xojrpdxC", "aNF7Ng"};
    public static final int[] A0f;
    public IV A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public Surface A0N;
    public Surface A0O;
    public IU A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final int A0T;
    public final long A0U;
    public final Context A0V;
    public final IY A0W;
    public final C0872Ih A0X;
    public final boolean A0Y;
    public final long[] A0Z;
    public final long[] A0a;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static Point A02(DL dl2, Format format) throws DU {
        int[] iArr;
        boolean z10 = format.A08 > format.A0F;
        int i10 = z10 ? format.A08 : format.A0F;
        int i11 = z10 ? format.A0F : format.A08;
        float f10 = i11 / i10;
        for (int i12 : A0f) {
            int i13 = (int) (i12 * f10);
            if (i12 <= i10 || i13 <= i11) {
                return null;
            }
            if (IK.A02 >= 21) {
                int i14 = z10 ? i13 : i12;
                if (!z10) {
                    i12 = i13;
                }
                Point A0E = dl2.A0E(i14, i12);
                if (dl2.A0H(A0E.x, A0E.y, format.A01)) {
                    return A0E;
                }
            } else {
                int A04 = IK.A04(i12, 16) * 16;
                int A042 = IK.A04(i13, 16) * 16;
                if (A04 * A042 <= DW.A00()) {
                    int i15 = z10 ? A042 : A04;
                    if (!z10) {
                        A04 = A042;
                    }
                    return new Point(i15, A04);
                }
            }
        }
        return null;
    }

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0d, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 7);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0d = new byte[]{Field.FORMCHECKBOX, 64, Field.FORMTEXT, Field.FORMCHECKBOX, 10, 12, 10, 8, 60, 58, 60, Field.SYMBOL, Field.BARCODE, Field.AUTOTEXT, 78, Field.FORMDROPDOWN, Field.TOA, 78, 56, Field.EQ, Field.SECTION, Field.FORMTEXT, 64, Field.SECTION, Field.SECTIONPAGES, Field.EQ, Field.MACROBUTTON, Field.GOTOBUTTON, Field.AUTONUMLGL, 98, Field.IMPORT, Field.MACROBUTTON, 29, 107, 108, 108, 108, 113, 61, 110, 24, 31, 31, 31, Field.SHAPE, Field.INCLUDEPICTURE, Field.LISTNUM, Field.BIDIOUTLINE, Field.FORMCHECKBOX, Field.EQ, Field.AUTONUM, Field.IMPORT, Field.AUTONUM, 103, Field.GOTOBUTTON, Field.USERADDRESS, 41, Field.SHAPE, Field.HYPERLINK, Field.LISTNUM, Field.HYPERLINK, 9, Field.BIDIOUTLINE, 80, 25, 30, 12, 25, Field.EQ, Field.AUTONUM, 36, Field.USERADDRESS, Field.GLOSSARY, Field.DATA, 58, 61, 64, 108, 96, 123, 110, 111, 77, 125, 121, 109, Field.BIDIOUTLINE, 99, 123, 105, 126, Field.SECTION, 100, 80, Field.CONTROL, Field.INCLUDETEXT, 122, 107, 74, Field.ADDIN, 64, 122, 23, 9, 7, 10, 8, 0, 102, 122, 19, 12, Field.NUMCHARS, 15, 24, 7, 15, 110, 122, 5, 110, 124, 126, Byte.MAX_VALUE, 123, 14, 30, 13, 26, 5, 13, 19, 13, 24, 26, 126, 58, Field.NOTEREF, 7, 20, 124, 114, 115, 114, Field.NUMWORDS, 13, 116, 118, Field.GOTOBUTTON, 33, Field.SYMBOL, 64, Field.FORMCHECKBOX, Field.SECTION, Field.NOTEREF, 86, Field.FILESIZE, 76, Field.DDE, Field.ASK, 74, Field.BIDIOUTLINE, Field.PAGEREF, Field.PAGEREF, 1, Field.DDE, Field.ASK, Field.FILLIN, 33, 98, Field.GLOSSARY, Field.QUOTE, 58, 98, 48, Field.FILLIN, Field.EQ, Field.DDE, Field.DDEAUTO, Field.IMPORT, Field.AUTONUM, 43, Field.DDE, 44, 98, Field.QUOTE, Field.ASK, Field.DATA, Field.IMPORT, Field.EQ, Field.AUTONUM, Field.FILLIN, Field.ASK, 98, Field.AUTONUM, Field.DDE, 120, 98, 109, Field.SECTION, Field.INCLUDEPICTURE, Field.FORMCHECKBOX, Field.SECTION, 125, 31, Field.AUTONUM, Field.FORMTEXT, Field.FILESIZE, Field.FORMCHECKBOX, 64, Field.DDE, 36, 61, Field.GLOSSARY, 41, Field.IMPORT, 41, Field.HTMLCONTROL, Field.IMPORT, 56, 26, 7, Field.FILESIZE, 76, Field.DOCPROPERTY, Field.FORMCHECKBOX, Field.SECTION, Field.SHAPE, 78, 111, 116, 101, Field.MACROBUTTON, 58, Field.QUOTE, Field.EQ, Field.IMPORT, 41, Field.ASK, 4, 31, Field.NUMWORDS, 98, 107, 114, 96, 102, 120, 117, Field.FORMTEXT, Field.GREETINGLINE, 120, Byte.MAX_VALUE, 107, Field.HYPERLINK, Field.MERGESEQ, Field.BIDIOUTLINE, 125, Field.LISTNUM, Field.AUTOTEXT, Field.BIDIOUTLINE, 113, 125, 30, 107, 105, 105, 105, 126, 11, 9, 9, 11, Field.HYPERLINK, Field.DDE, Field.GLOSSARY, Field.GLOSSARY, Field.DATA, 18, 103, 102, 101, 101, 19, 102, 103, 100, 102, Field.FILESIZE, 48, Field.EQ, Field.GOTOBUTTON, Field.AUTONUM, 22, 99, 99, 97, 97, 123, Field.BIDIOUTLINE, Field.ADDIN, 78, Field.HYPERLINK, 126, Field.DOCPROPERTY, Field.HYPERLINK, Field.GREETINGLINE, 86, 29, 102, Field.ADDIN, Field.HYPERLINK, Field.LISTNUM, Field.BIDIOUTLINE, Field.GREETINGLINE, Field.INCLUDETEXT, 123, Field.AUTOTEXT, Field.BIDIOUTLINE, 80, Field.HYPERLINK, 110, Field.ADVANCE, Field.FORMCHECKBOX, Field.HYPERLINK, 17, 29, 80, Field.GREETINGLINE, Field.HYPERLINK, Field.AUTOTEXTLIST, 82, 82, Field.NOTEREF, 80, Field.DOCPROPERTY, Field.HTMLCONTROL, 32, 36, 33, Field.FILLIN, Field.ADDRESSBLOCK, Field.FORMDROPDOWN, Field.DOCPROPERTY, Field.ADVANCE, Field.SHAPE, Field.SHAPE, Field.FILESIZE, Field.TOA, 77, 77, 43, 44, 42, Field.QUOTE, 33, Field.GLOSSARY, 41, Field.DATA, Field.QUOTE, Field.QUOTE, Field.SYMBOL, Field.AUTONUMLGL, Field.EQ, Field.EQ, Field.CONTROL, 80, Field.ADVANCE, Field.ADDIN, 80, Field.GREETINGLINE, Field.HYPERLINK, Field.AUTOTEXTLIST, 82, 82, Field.NOTEREF, Field.INCLUDETEXT, 64, 64, Field.ASK, 33, 36, Field.ASK, 107, 101, 99, 98, 105, 105, 115, 123, 110, 96, 25, Field.NUMWORDS, Field.NUMCHARS, 20, 43, Field.PAGEREF, Field.QUOTE, 34, 41, 41, Field.MACROBUTTON, 59, Field.DDEAUTO, 32, Field.HTMLCONTROL, Field.SHAPE, Field.LISTNUM, Field.AUTOTEXTLIST, 24, 22, 16, 17, 26, 26, 0, 8, 29, 19, 104, 106, 110, 102, 118, Field.HYPERLINK, 126, Byte.MAX_VALUE, 116, 116, 110, 114, 115, 125, 6, 4, 0, 2, 104, Field.FORMTEXT, 96, 97, 106, 106, 112, 104, 109, 99, 24, Field.NUMCHARS, 30, 22, 1, 30, 11, 5, 7, 100, 1, Field.FORMCHECKBOX, Field.HYPERLINK, 76, 78, Field.SECTIONPAGES, 34, Field.FORMCHECKBOX, Field.FILESIZE, Field.LISTNUM, Field.HTMLCONTROL, Field.INCLUDEPICTURE, Field.GREETINGLINE, 32, Field.FILESIZE, 105, 78, Field.FORMTEXT, Field.TOA, 78, Field.TOA, Field.HYPERLINK, 13, 120, 21, 23, 18, Field.EQ, 60, 33, 59, Field.FILESIZE, 64, 17, Field.INCLUDETEXT, 64, Field.EQ, 60, 41, Field.AUTONUMLGL, Field.DDE, Field.MACROBUTTON, 97, 126, 0, 24, 29, Field.NUMCHARS, 26, Field.DOCPROPERTY, Field.DDE, 123, 14, 6, 10, 25, 22, Field.NUMCHARS, 14, 118, 42, Field.BARCODE, Field.ADDIN, 11, Field.QUOTE, 34, Field.GLOSSARY, Field.FILLIN, 5, 41, 34, Field.QUOTE, Field.PAGEREF, 16, Field.GLOSSARY, 34, Field.QUOTE, 41, 20, Field.QUOTE, Field.DATA, 34, Field.QUOTE, Field.AUTONUMOUT, Field.QUOTE, Field.AUTONUMOUT, 112, 104, 119, 122, 119, Byte.MAX_VALUE, 6, 16, 125, 124, 121, 2, 82, Field.INCLUDETEXT, 41, 43, Field.GLOSSARY, 86, 103, 101, 112, 6, Field.AUTOTEXT, Field.FORMCHECKBOX, Field.FORMCHECKBOX, Field.AUTOTEXT, Field.INCLUDETEXT, 77, 121, Field.HYPERLINK, Field.FORMDROPDOWN, 102, Field.LISTNUM, Field.INCLUDEPICTURE, Field.FILESIZE, 3, 98, Field.MACROBUTTON, Field.DOCPROPERTY, Field.HTMLCONTROL, 82, 0, 104, 101, 24, 10, 122, 101, 126, Byte.MAX_VALUE, 120, 5, 16, 7, 14, 117, 114, 120, 0, 23, 30, 102, 97, 96, 125, 106, 99, Field.NUMWORDS, Field.NUMCHARS, Field.NUMCHARS, 108, 112, 121, 26, 24, 5, 125, 25, Field.DDE, 21, Field.NUMCHARS, 19, 9, 18, 16, Field.MERGESEQ, 29, 36, Field.AUTONUMLGL, 36, 121, 96, 122, 18, 126, 10, 123, Field.SECTIONPAGES, Field.FORMDROPDOWN, Field.SECTIONPAGES, 30, 6, 26, Field.NUMWORDS, 116, 31, 108, 117, 23, 17, 20, 126, Field.NUMWORDS, 29, 25, 31, Field.IMPORT, 82, Field.ADVANCE, Field.ADDIN, 48, Field.DOCPROPERTY, 82, 80, Field.ADDIN, 117, 17, 80, 76, 48, Field.IMPORT, Field.AUTOTEXTLIST, Field.INCLUDETEXT, Field.GREETINGLINE, Field.ADVANCE, 6, 15, 102, 98, Field.DOCPROPERTY, Field.INCLUDEPICTURE, Field.SHAPE, Field.BIDIOUTLINE, Field.FILESIZE, Field.INCLUDETEXT, Field.AUTOTEXTLIST, Field.SHAPE, Field.GREETINGLINE, Field.INCLUDEPICTURE, 16, Field.FILESIZE, Field.GREETINGLINE, Field.HTMLCONTROL, Field.GREETINGLINE, Field.SHAPE, Field.FORMCHECKBOX, Field.GREETINGLINE, 30, 16, 115, Field.SHAPE, Field.ADVANCE, Field.DOCPROPERTY, Field.FORMDROPDOWN, 16, Field.ADDRESSBLOCK, Field.ADDIN, Field.NOTEREF, 16, Field.SECTIONPAGES, Field.DOCPROPERTY, Field.INCLUDEPICTURE, Field.SHAPE, Field.BIDIOUTLINE, Field.FILESIZE, Field.INCLUDETEXT, Field.AUTOTEXTLIST, Field.SHAPE, Field.GREETINGLINE, 10, 16, Field.FILESIZE, 64, Field.FORMTEXT, 59, 82, Field.SECTIONPAGES, 64, Field.FILLIN, Field.QUOTE, 108, Field.FORMDROPDOWN, Field.GREETINGLINE, Field.MERGESEQ, Field.LISTNUM, 96, 111, 77, 80, Field.FILESIZE, Field.FORMDROPDOWN, 34, 60, Field.ASK, 34, 33, Field.CONTROL, Field.FILLIN, Field.EQ, 64, Field.GREETINGLINE, Field.INCLUDETEXT, 64, Field.INCLUDEPICTURE, 43, Field.HTMLCONTROL, 77, 60, 34, Field.IMPORT, 58, Field.BARCODE, Field.TOA, 98, 116, 5, Field.NUMWORDS, 14, 3, 6, 123, Field.EQ, 10, 10, Field.FILESIZE, 8, 4, 11, Field.NUMCHARS, Field.FILESIZE, 22, 17, 23, 0, 4, 8, Field.FILESIZE, 6, 13, 4, 11, 2, 0, 22, Field.TOA, Field.FILESIZE, 22, 10, Field.FILESIZE, 1, 23, 10, 21, 21, 12, 11, 2, Field.FILESIZE, 10, 3, 3, 22, 0, 17, Field.SHAPE, Field.FILESIZE, 104, 15, 120, Field.NUMCHARS, 29, 105, 108, 96, 3, Byte.MAX_VALUE, 20, 120, 111, 108, 112, 109, 26, 112, Field.GOTOBUTTON, Field.USERADDRESS, Field.HTMLCONTROL, Field.BIDIOUTLINE, Field.BIDIOUTLINE, Field.AUTOTEXTLIST, 56, Field.FORMDROPDOWN, 80, 61, Field.GOTOBUTTON, 48, Field.DDE, 56, Field.LISTNUM, 82, 9, 99, 30, 101, 74, Field.GREETINGLINE, Field.AUTOTEXT, Field.SECTIONPAGES, Field.INCLUDETEXT, 6, Field.HYPERLINK, 78, Field.HYPERLINK, Field.HYPERLINK, Field.SECTIONPAGES, Field.INCLUDETEXT, Field.FILESIZE, 6, Field.SECTIONPAGES, Field.AUTOTEXT, 113, 101, 100, Byte.MAX_VALUE, 61, 118, 98, 115, Field.DDEAUTO, Field.BARCODE, 34, 61, 96, Field.GLOSSARY, 34, Field.SYMBOL, Field.SYMBOL, 34, 32, 118, 103, 122, 101, 56, 121, 112, 115, 97, Field.FILESIZE, Field.ADVANCE, Field.TOA, 86, 11, Field.ADVANCE, Field.AUTOTEXT, Field.SECTION, 78, 82, 59, 42, Field.IMPORT, Field.DATA, 117, 44, Field.IMPORT, Field.DATA, 96, 117, Field.GOTOBUTTON, Field.QUOTE, Field.AUTONUM, 115, Field.INCLUDETEXT, Field.FILESIZE, Field.SECTIONPAGES, 105, Byte.MAX_VALUE, 98, 125, Field.HTMLCONTROL, 100, 105, 104, 98, Field.AUTOTEXT, 120, 107, 107, 104, Byte.MAX_VALUE, 123, 113, 114, 34, 43, Field.IMPORT, 48, 33, Field.AUTONUM, 23, 3, 16, Field.NUMCHARS, 20, Field.BIDIOUTLINE, 3, 16, 5, 20, 121, 108, 119, 120, 120, 119, 112, 31, 18, 30, 16, 31, 3, Field.FILESIZE, Field.AUTOTEXTLIST, 78, 114, Field.NOTEREF, 24, Field.NUMWORDS, 64, Field.SECTION, 114, Field.TOA, Field.AUTOTEXTLIST, Field.HYPERLINK, Field.SECTION, 111, 112, Field.FORMTEXT, Field.MERGESEQ, Field.SECTIONPAGES, 42, Field.AUTOTEXT, 22, 29, 
        30, 19, 19, Field.FORMCHECKBOX, Field.NOTEREF, 76, 74, 32, Field.FORMTEXT, Field.FORMCHECKBOX, Field.AUTOTEXT, Field.TOA, 77, 86, 77, Field.CONTROL, 18, 20, 117, 104, 121, 112, Field.INCLUDEPICTURE, Field.AUTOTEXT, Field.DATA, Field.DDE, 36, 124, Field.AUTONUM, 34, 58, 43, Field.FILLIN, 32, 61, 109, 100, Field.GREETINGLINE, 121, Field.IMPORT, Field.INCLUDEPICTURE, Field.AUTOTEXT, 64, 64, Field.FORMCHECKBOX, 64, Field.TOA, 82, Field.GREETINGLINE, 77, 86, Field.ADDIN, 80, 96, Field.AUTOTEXTLIST, 86, Field.LISTNUM, Field.INCLUDEPICTURE, 22, Field.FORMDROPDOWN, Field.GREETINGLINE, 82, Field.BIDIOUTLINE, Field.FORMDROPDOWN, Field.AUTOTEXT, Field.AUTONUM, 58, Field.QUOTE, 118, Field.GOTOBUTTON, Field.AUTONUMLGL, 43, Field.DDEAUTO, Field.GLOSSARY, 118, Field.DATA, Field.GOTOBUTTON, 33, Field.USERADDRESS, Field.DDEAUTO, 34, 59, 110, Field.AUTONUMOUT, 42, Field.FILLIN, Field.IMPORT, 43, 43, Field.DDEAUTO, 3, 7, 10, 1, Field.ADVANCE, 80, Field.ADVANCE, Field.BIDIOUTLINE, 33, Field.DDEAUTO, 34, Field.DDEAUTO, 59, Field.FILLIN, Field.INCLUDETEXT, Field.INCLUDEPICTURE, Field.TOA, Field.SECTION, Field.FORMTEXT, Field.MERGESEQ, Field.SHAPE, Field.AUTOTEXTLIST, 117, 76, Field.USERADDRESS, 124, Byte.MAX_VALUE, 124, 124, 109, 98, 105, 96, 96, Field.FORMDROPDOWN, 104, 101, 116, 123, 112, 121, 121, 74, 113, 121, 26, 11, 4, 15, 6, 6, Field.AUTONUMLGL, 14, 25, 30, 15, 0, 11, 2, 2, Field.EQ, 10, 26, 119, 117, 110, 104, 117, 110, 115, 126, 7, 16, 25, 16, 20, 6, 16, 58, 0, 1, 5, 0, 1, Field.IMPORT, 0, 19, 19, 16, 7, Field.HYPERLINK, Field.FILESIZE, Field.GREETINGLINE, Field.MERGESEQ, Field.GREETINGLINE, Field.INCLUDEPICTURE, Field.FILESIZE, Field.INCLUDETEXT, 7, 78, Field.AUTOTEXT, 77, Field.HYPERLINK, Field.AUTOTEXT, Field.AUTOTEXT, Field.AUTOTEXTLIST, Field.INCLUDEPICTURE, 9, 0, 5, Field.NOTEREF, 0, 1, 8, Field.AUTONUM, 36, 43, Field.EQ, 42, 43, 44, 29, 5, 7, 30, 56, 7, 10, 11, 1, 44, Field.NUMWORDS, 8, 8, 11, Field.NUMCHARS, Field.HTMLCONTROL, 78, Field.FORMTEXT, Field.MERGESEQ, 64, 112, Field.ADDRESSBLOCK, 64, Field.HYPERLINK, 20, 3, 12, Field.BARCODE, 5, 21, 41, Field.DATA, Field.MACROBUTTON, Field.MACROBUTTON, 56, Field.EQ, 56, Field.SYMBOL, 112, Field.DDE, Field.EQ, 60, 36, Field.BARCODE, 60, Field.USERADDRESS, Field.AUTONUM, 98, 113, 102, 122, 113, 113, Field.MERGESEQ, Field.AUTOTEXTLIST, 33, Field.FILLIN, 56, Field.AUTONUMLGL, Field.AUTONUMOUT, Field.USERADDRESS, 126, 98, Field.AUTONUM, 33, 33, Field.DOCPROPERTY, 74, Field.FORMCHECKBOX, Field.FORMTEXT, 76, 12, Field.SECTIONPAGES, Field.DOCPROPERTY, 64, 41, Field.AUTONUM, 59, 58, 48, 112, Field.IMPORT, 58, 41, 60, Byte.MAX_VALUE, 96, 109, 108, 102, Field.ASK, 100, 121, 61, Byte.MAX_VALUE, 36, 108, 122, Field.LISTNUM, Field.FILESIZE, Field.NOTEREF, Field.TOA, Field.INCLUDEPICTURE, 3, Field.ADVANCE, 1, Field.LISTNUM, Field.SECTIONPAGES, Field.NOTEREF, 2, Field.INCLUDEPICTURE, Field.SECTIONPAGES, 30, 2, Field.LISTNUM, Field.BIDIOUTLINE, 20, 103, 120, 117, 116, 126, Field.USERADDRESS, 105, 60, 103, Byte.MAX_VALUE, 117, Field.BARCODE, 126, Byte.MAX_VALUE, Field.QUOTE, Field.BARCODE, 103, 97, Field.DATA, 10, Field.NUMCHARS, 9, 14, 18, 19, Field.PAGEREF, 58, 43, 32, Field.IMPORT, Field.AUTONUM, 22, 8, 5, 21, 9, Field.FORMCHECKBOX, Field.SHAPE, Field.SHAPE, Field.ADVANCE, Field.INCLUDEPICTURE, 111, 86, 121, 97, 97, 106, 125, Field.ADDIN, 104, 96, Field.BIDIOUTLINE};
    }

    static {
        A0D();
        A0f = new int[]{1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public C3F(Context context, DR dr, long j10, InterfaceC0707Bh<FrameworkMediaCrypto> interfaceC0707Bh, boolean z10, Handler handler, InterfaceC0873Ii interfaceC0873Ii, int i10) {
        super(2, dr, interfaceC0707Bh, z10);
        this.A0U = j10;
        this.A0T = i10;
        this.A0V = context.getApplicationContext();
        this.A0W = new IY(this.A0V);
        this.A0X = new C0872Ih(handler, interfaceC0873Ii);
        this.A0Y = A0M();
        this.A0Z = new long[10];
        this.A0a = new long[10];
        this.A0M = -9223372036854775807L;
        this.A0K = -9223372036854775807L;
        this.A0J = -9223372036854775807L;
        this.A08 = -1;
        this.A06 = -1;
        this.A01 = -1.0f;
        this.A02 = -1.0f;
        this.A0F = 1;
        A07();
    }

    public static int A00(DL dl2, Format format) {
        if (format.A09 != -1) {
            int i10 = 0;
            int i11 = format.A0P.size();
            for (int initializationDataCount = 0; initializationDataCount < i11; initializationDataCount++) {
                int totalInitializationDataSize = format.A0P.get(initializationDataCount).length;
                i10 += totalInitializationDataSize;
            }
            int i12 = format.A09;
            int initializationDataCount2 = A0e[2].length();
            if (initializationDataCount2 != 7) {
                String[] strArr = A0e;
                strArr[5] = "S79s7r8SM52UI34VQboE4fV4gdsMwFqf";
                strArr[0] = "NRJssXnBH8bGWFbqvXTszxRoESb4kgsb";
                return i12 + i10;
            }
            throw new RuntimeException();
        }
        return A01(dl2, format.A0O, format.A0F, format.A08);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010b, code lost:
        if (r5.A05 != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A01(com.facebook.ads.redexgen.X.DL r5, java.lang.String r6, int r7, int r8) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3F.A01(com.facebook.ads.redexgen.X.DL, java.lang.String, int, int):int");
    }

    private final MediaFormat A03(Format format, IU iu, boolean z10, int i10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(A05(1094, 4, 62), format.A0O);
        mediaFormat.setInteger(A05(1359, 5, 102), format.A0F);
        mediaFormat.setInteger(A05(971, 6, 112), format.A08);
        DX.A06(mediaFormat, format.A0P);
        DX.A03(mediaFormat, A05(954, 10, 118), format.A01);
        DX.A04(mediaFormat, A05(1180, 16, 45), format.A0B);
        DX.A02(mediaFormat, format.A0J);
        mediaFormat.setInteger(A05(1079, 9, 68), iu.A02);
        mediaFormat.setInteger(A05(1055, 10, 60), iu.A00);
        DX.A04(mediaFormat, A05(1065, 14, 92), iu.A01);
        if (IK.A02 >= 23) {
            mediaFormat.setInteger(A05(1153, 8, 0), 0);
        }
        if (z10) {
            mediaFormat.setInteger(A05(875, 8, 23), 0);
        }
        if (i10 != 0) {
            A0K(mediaFormat, i10);
        }
        return mediaFormat;
    }

    private final IU A04(DL dl2, Format format, Format[] formatArr) throws DU {
        int maxWidth;
        int i10 = format.A0F;
        int i11 = format.A08;
        int A00 = A00(dl2, format);
        int maxHeight = formatArr.length;
        if (maxHeight == 1) {
            return new IU(i10, i11, A00);
        }
        int i12 = 0;
        for (Format format2 : formatArr) {
            if (A0V(dl2.A03, format, format2)) {
                int maxWidth2 = format2.A0F;
                if (maxWidth2 != -1) {
                    int maxWidth3 = format2.A08;
                    if (maxWidth3 != -1) {
                        maxWidth = 0;
                        i12 |= maxWidth;
                        int maxWidth4 = format2.A0F;
                        i10 = Math.max(i10, maxWidth4);
                        int maxWidth5 = format2.A08;
                        i11 = Math.max(i11, maxWidth5);
                        int maxWidth6 = A00(dl2, format2);
                        A00 = Math.max(A00, maxWidth6);
                    }
                }
                maxWidth = 1;
                i12 |= maxWidth;
                int maxWidth42 = format2.A0F;
                i10 = Math.max(i10, maxWidth42);
                int maxWidth52 = format2.A08;
                i11 = Math.max(i11, maxWidth52);
                int maxWidth62 = A00(dl2, format2);
                A00 = Math.max(A00, maxWidth62);
            }
        }
        if (i12 != 0) {
            StringBuilder append = new StringBuilder().append(A05(683, 43, 55)).append(i10);
            String A05 = A05(1379, 1, 35);
            String sb2 = append.append(A05).append(i11).toString();
            String A052 = A05(522, 23, 65);
            Log.w(A052, sb2);
            Point A02 = A02(dl2, format);
            if (A02 != null) {
                int maxWidth7 = A02.x;
                i10 = Math.max(i10, maxWidth7);
                int maxWidth8 = A02.y;
                i11 = Math.max(i11, maxWidth8);
                int maxWidth9 = A01(dl2, format.A0O, i10, i11);
                A00 = Math.max(A00, maxWidth9);
                Log.w(A052, A05(164, 34, 69) + i10 + A05 + i11);
            }
        }
        return new IU(i10, i11, A00);
    }

    private void A06() {
        MediaCodec A1D;
        this.A0R = false;
        if (IK.A02 >= 23 && this.A0S && (A1D = A1D()) != null) {
            this.A00 = new IV(this, A1D);
        }
    }

    private void A07() {
        this.A0E = -1;
        this.A0C = -1;
        this.A03 = -1.0f;
        this.A0D = -1;
    }

    private void A08() {
        if (this.A09 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long now = this.A0H;
            long elapsedMs = elapsedRealtime - now;
            this.A0X.A02(this.A09, elapsedMs);
            this.A09 = 0;
            this.A0H = elapsedRealtime;
        }
    }

    private void A09() {
        if (this.A08 == -1 && this.A06 == -1) {
            return;
        }
        if (this.A0E != this.A08 || this.A0C != this.A06 || this.A0D != this.A07 || this.A03 != this.A01) {
            this.A0X.A01(this.A08, this.A06, this.A07, this.A01);
            this.A0E = this.A08;
            this.A0C = this.A06;
            this.A0D = this.A07;
            this.A03 = this.A01;
        }
    }

    private void A0A() {
        if (this.A0R) {
            this.A0X.A03(this.A0O);
        }
    }

    private void A0B() {
        if (this.A0E != -1 || this.A0C != -1) {
            this.A0X.A01(this.A0E, this.A0C, this.A0D, this.A03);
        }
    }

    private void A0C() {
        long j10;
        if (this.A0U > 0) {
            j10 = SystemClock.elapsedRealtime() + this.A0U;
        } else {
            j10 = -9223372036854775807L;
        }
        this.A0J = j10;
    }

    private final void A0E(int i10) {
        super.A0U.A02 += i10;
        this.A09 += i10;
        this.A05 += i10;
        super.A0U.A05 = Math.max(this.A05, super.A0U.A05);
        if (this.A09 >= this.A0T) {
            A08();
        }
    }

    private final void A0F(MediaCodec mediaCodec, int i10, long j10) {
        IH.A02(A05(930, 15, 10));
        mediaCodec.releaseOutputBuffer(i10, false);
        IH.A00();
        A0E(1);
    }

    private final void A0G(MediaCodec mediaCodec, int i10, long j10) {
        A09();
        IH.A02(A05(1161, 19, 114));
        mediaCodec.releaseOutputBuffer(i10, true);
        IH.A00();
        this.A0L = SystemClock.elapsedRealtime() * 1000;
        super.A0U.A06++;
        this.A05 = 0;
        A1S();
    }

    private final void A0H(MediaCodec mediaCodec, int i10, long j10) {
        IH.A02(A05(1211, 15, 105));
        mediaCodec.releaseOutputBuffer(i10, false);
        IH.A00();
        super.A0U.A08++;
    }

    private final void A0I(MediaCodec mediaCodec, int i10, long j10, long j11) {
        A09();
        IH.A02(A05(1161, 19, 114));
        mediaCodec.releaseOutputBuffer(i10, j11);
        IH.A00();
        this.A0L = SystemClock.elapsedRealtime() * 1000;
        super.A0U.A06++;
        this.A05 = 0;
        A1S();
    }

    public static void A0J(MediaCodec mediaCodec, Surface surface) {
        mediaCodec.setOutputSurface(surface);
    }

    public static void A0K(MediaFormat mediaFormat, int i10) {
        mediaFormat.setFeatureEnabled(A05(1241, 17, 90), true);
        mediaFormat.setInteger(A05(859, 16, 44), i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a4, code lost:
        if (r4 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a6, code lost:
        r5.A0N = com.facebook.ads.internal.exoplayer2.thirdparty.video.DummySurface.A01(r5.A0V, r3.A05);
        r6 = r5.A0N;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bb, code lost:
        if (r4 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0L(android.view.Surface r6) throws com.facebook.ads.redexgen.X.C06589h {
        /*
            r5 = this;
            if (r6 != 0) goto L8
            android.view.Surface r0 = r5.A0N
            if (r0 == 0) goto L81
            android.view.Surface r6 = r5.A0N
        L8:
            android.view.Surface r0 = r5.A0O
            if (r0 == r6) goto L74
            r5.A0O = r6
            int r4 = r5.A8P()
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C3F.A0e
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 32
            if (r1 == r0) goto Lbe
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C3F.A0e
            java.lang.String r1 = ""
            r0 = 6
            r2[r0] = r1
            r1 = 1
            r0 = 2
            if (r4 == r1) goto L2c
            if (r4 != r0) goto L41
        L2c:
            android.media.MediaCodec r3 = r5.A1D()
            int r2 = com.facebook.ads.redexgen.X.IK.A02
            r1 = 23
            if (r2 < r1) goto L6d
            if (r3 == 0) goto L6d
            if (r6 == 0) goto L6d
            boolean r1 = r5.A0Q
            if (r1 != 0) goto L6d
            A0J(r3, r6)
        L41:
            if (r6 == 0) goto L53
            android.view.Surface r1 = r5.A0N
            if (r6 == r1) goto L53
            r5.A0B()
            r5.A06()
            if (r4 != r0) goto L52
            r5.A0C()
        L52:
            return
        L53:
            r5.A07()
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C3F.A0e
            r0 = 2
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 7
            if (r1 == r0) goto Lbe
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C3F.A0e
            java.lang.String r1 = "YrtVfn3T33"
            r0 = 1
            r2[r0] = r1
            r5.A06()
            goto L52
        L6d:
            r5.A1H()
            r5.A1J()
            goto L41
        L74:
            if (r6 == 0) goto L52
            android.view.Surface r0 = r5.A0N
            if (r6 == r0) goto L52
            r5.A0B()
            r5.A0A()
            goto L52
        L81:
            com.facebook.ads.redexgen.X.DL r3 = r5.A1E()
            if (r3 == 0) goto L8
            boolean r4 = r5.A0T(r3)
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C3F.A0e
            r0 = 7
            r1 = r2[r0]
            r0 = 4
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto Lb4
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C3F.A0e
            java.lang.String r1 = "GRrSCiGb3HJ0IgtaAsL7ex7K0T"
            r0 = 2
            r2[r0] = r1
            if (r4 == 0) goto L8
        La6:
            android.content.Context r1 = r5.A0V
            boolean r0 = r3.A05
            com.facebook.ads.internal.exoplayer2.thirdparty.video.DummySurface r0 = com.facebook.ads.internal.exoplayer2.thirdparty.video.DummySurface.A01(r1, r0)
            r5.A0N = r0
            android.view.Surface r6 = r5.A0N
            goto L8
        Lb4:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C3F.A0e
            java.lang.String r1 = "cuC7HyH7q"
            r0 = 3
            r2[r0] = r1
            if (r4 == 0) goto L8
            goto La6
        Lbe:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3F.A0L(android.view.Surface):void");
    }

    public static boolean A0M() {
        return IK.A02 <= 22 && A05(948, 6, 67).equals(IK.A03) && A05(545, 6, 57).equals(IK.A05);
    }

    public static boolean A0N(long j10) {
        return j10 < -30000;
    }

    public static boolean A0O(long j10) {
        return j10 < -500000;
    }

    private final boolean A0P(long j10, long j11) {
        return A0O(j10);
    }

    private final boolean A0Q(long j10, long j11) {
        return A0N(j10);
    }

    private final boolean A0R(long j10, long j11) {
        return A0N(j10) && j11 > 100000;
    }

    private final boolean A0S(MediaCodec mediaCodec, int i10, long j10, long j11) throws C06589h {
        int A10 = A10(j11);
        if (A10 == 0) {
            return false;
        }
        BH bh2 = super.A0U;
        int droppedSourceBufferCount = bh2.A03;
        bh2.A03 = droppedSourceBufferCount + 1;
        int droppedSourceBufferCount2 = this.A04;
        A0E(droppedSourceBufferCount2 + A10);
        A1G();
        return true;
    }

    private boolean A0T(DL dl2) {
        if (IK.A02 >= 23) {
            boolean z10 = this.A0S;
            String[] strArr = A0e;
            if (strArr[7].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            A0e[2] = "tXI8HpJUcx6aHgbV0xWZv";
            if (!z10 && !A0U(dl2.A02) && (!dl2.A05 || DummySurface.A05(this.A0V))) {
                return true;
            }
        }
        return false;
    }

    private final boolean A0U(String str) {
        char c = 0;
        char c10 = 27;
        if (IK.A02 >= 27 || str.startsWith(A05(563, 10, 47))) {
            return false;
        }
        synchronized (C3F.class) {
            if (!A0c) {
                String str2 = IK.A03;
                switch (str2.hashCode()) {
                    case -2144781245:
                        if (str2.equals(A05(341, 14, 29))) {
                            c10 = '\'';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -2144781185:
                        if (str2.equals(A05(355, 14, 97))) {
                            c10 = '(';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -2144781160:
                        if (str2.equals(A05(369, 14, 16))) {
                            c10 = ')';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -2097309513:
                        if (str2.equals(A05(489, 6, 119))) {
                            c10 = '9';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -2022874474:
                        if (str2.equals(A05(ShapeTypes.FLOW_CHART_MULTIDOCUMENT, 10, 67))) {
                            c10 = 16;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1978993182:
                        if (str2.equals(A05(551, 6, 79))) {
                            c10 = 'E';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1978990237:
                        if (str2.equals(A05(557, 6, 27))) {
                            c10 = 'F';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1936688988:
                        if (str2.equals(A05(597, 6, 71))) {
                            c10 = 'P';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1936688066:
                        if (str2.equals(A05(603, 6, 87))) {
                            c10 = 'Q';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1936688065:
                        if (str2.equals(A05(609, 6, 42))) {
                            c10 = 'R';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1931988508:
                        if (str2.equals(A05(82, 10, 11))) {
                            c10 = '\n';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1696512866:
                        if (str2.equals(A05(839, 6, 109))) {
                            c10 = 's';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1680025915:
                        if (str2.equals(A05(198, 7, 41))) {
                            c10 = 15;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1615810839:
                        if (str2.equals(A05(623, 8, 122))) {
                            c10 = 'S';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1554255044:
                        if (str2.equals(A05(Constants.CP_WINDOWS_1258, 9, 19))) {
                            c10 = 'l';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1481772737:
                        if (str2.equals(A05(1126, 9, 18))) {
                            c10 = 'L';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1481772730:
                        if (str2.equals(A05(1135, 9, 109))) {
                            c10 = 'M';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1481772729:
                        if (str2.equals(A05(1144, 9, 105))) {
                            c10 = 'N';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1320080169:
                        if (str2.equals(A05(439, 14, 40))) {
                            c10 = '%';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1217592143:
                        if (str2.equals(A05(125, 11, 75))) {
                            c10 = '\r';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1180384755:
                        if (str2.equals(A05(1012, 6, 35))) {
                            c10 = '5';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1139198265:
                        if (str2.equals(A05(735, 9, 56))) {
                            c10 = '`';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1052835013:
                        if (str2.equals(A05(1098, 6, 72))) {
                            c10 = 'C';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -993250464:
                        if (str2.equals(A05(12, 7, 121))) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -965403638:
                        if (str2.equals(A05(1196, 8, 55))) {
                            c10 = 'b';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -958336948:
                        if (str2.equals(A05(242, 11, 32))) {
                            c10 = 26;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -879245230:
                        if (str2.equals(A05(1235, 6, 103))) {
                            c10 = 'h';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -842500323:
                        if (str2.equals(A05(1104, 10, 45))) {
                            c10 = 'D';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -821392978:
                        if (str2.equals(A05(32, 7, 91))) {
                            c10 = 6;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -797483286:
                        if (str2.equals(A05(726, 9, 17))) {
                            c10 = 'a';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -794946968:
                        if (str2.equals(A05(1347, 6, 122))) {
                            c10 = 'm';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -788334647:
                        if (str2.equals(A05(1353, 6, 85))) {
                            c10 = 'n';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -782144577:
                        if (str2.equals(A05(573, 9, 49))) {
                            c10 = 'G';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -575125681:
                        if (str2.equals(A05(425, 14, 54))) {
                            c10 = '$';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -521118391:
                        if (str2.equals(A05(327, 14, 16))) {
                            c10 = '&';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -430914369:
                        if (str2.equals(A05(631, 10, 74))) {
                            c10 = 'T';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -290434366:
                        if (str2.equals(A05(1226, 9, 40))) {
                            c10 = 'c';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -282781963:
                        if (str2.equals(A05(103, 8, 76))) {
                            c10 = '\f';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -277133239:
                        if (str2.equals(A05(845, 7, 101))) {
                            c10 = 't';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -173639913:
                        if (str2.equals(A05(210, 12, 111))) {
                            c10 = 23;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -56598463:
                        if (str2.equals(A05(1371, 8, 9))) {
                            c10 = 'p';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 2126:
                        if (str2.equals(A05(ShapeTypes.FLOW_CHART_INTERNAL_STORAGE, 2, 126))) {
                            c10 = 14;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 2564:
                        if (str2.equals(A05(670, 2, 35))) {
                            c10 = '\\';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 2715:
                        if (str2.equals(A05(821, 2, 57))) {
                            c10 = 'i';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 2719:
                        if (str2.equals(A05(828, 2, 49))) {
                            c10 = 'k';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 3483:
                        if (str2.equals(A05(1088, 2, 65))) {
                            c10 = '@';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 73405:
                        if (str2.equals(A05(486, 3, 124))) {
                            c10 = '8';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 75739:
                        if (str2.equals(A05(508, 3, 31))) {
                            c10 = '<';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 76779:
                        if (str2.equals(A05(519, 3, 96))) {
                            c10 = 'B';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 78669:
                        if (str2.equals(A05(586, 3, 87))) {
                            c10 = 'J';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 79305:
                        if (str2.equals(A05(615, 3, 59))) {
                            c10 = 'V';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 80618:
                        if (str2.equals(A05(680, 3, 80))) {
                            c10 = '^';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 88274:
                        if (str2.equals(A05(852, 3, 101))) {
                            c10 = 'u';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 98846:
                        if (str2.equals(A05(921, 3, 4))) {
                            c10 = 19;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 98848:
                        if (str2.equals(A05(924, 3, 71))) {
                            c10 = 20;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 99329:
                        if (str2.equals(A05(927, 3, 39))) {
                            c10 = 21;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 101481:
                        if (str2.equals(A05(945, 3, 26))) {
                            c10 = '#';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1513190:
                        if (str2.equals(A05(0, 4, 113))) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1514184:
                        if (str2.equals(A05(4, 4, 60))) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1514185:
                        if (str2.equals(A05(8, 4, 10))) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 2436959:
                        if (str2.equals(A05(582, 4, 100))) {
                            c10 = 'I';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 2463773:
                        if (str2.equals(A05(652, 4, 35))) {
                            c10 = 'X';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 2464648:
                        if (str2.equals(A05(661, 4, 97))) {
                            c10 = 'Z';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 2689555:
                        if (str2.equals(A05(835, 4, 47))) {
                            c10 = 'r';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 3351335:
                        if (str2.equals(A05(1090, 4, 105))) {
                            c10 = 'A';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 3386211:
                        if (str2.equals(A05(1114, 4, 73))) {
                            c10 = 'H';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 41325051:
                        if (str2.equals(A05(511, 8, 68))) {
                            c10 = '?';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 55178625:
                        if (str2.equals(A05(92, 11, 34))) {
                            c10 = 11;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 61542055:
                        if (str2.equals(A05(19, 5, 119))) {
                            c10 = 4;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 65355429:
                        if (str2.equals(A05(205, 5, 116))) {
                            c10 = 22;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 66214468:
                        if (str2.equals(A05(263, 5, 95))) {
                            c10 = 28;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 66214470:
                        if (str2.equals(A05(268, 5, 63))) {
                            c10 = 29;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 66214473:
                        if (str2.equals(A05(273, 5, 25))) {
                            c10 = 30;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 66215429:
                        if (str2.equals(A05(278, 5, 83))) {
                            c10 = 31;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 66215431:
                        if (str2.equals(A05(283, 5, 82))) {
                            c10 = ' ';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 66215433:
                        if (str2.equals(A05(288, 5, 4))) {
                            c10 = '!';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 66216390:
                        if (str2.equals(A05(293, 5, 87))) {
                            c10 = '\"';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 76402249:
                        if (str2.equals(A05(618, 5, 77))) {
                            c10 = 'W';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 76404105:
                        if (str2.equals(A05(656, 5, 40))) {
                            c10 = 'Y';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 76404911:
                        if (str2.equals(A05(665, 5, 102))) {
                            c10 = '[';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 80963634:
                        if (str2.equals(A05(823, 5, 41))) {
                            c10 = 'j';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 82882791:
                        if (str2.equals(A05(830, 5, 32))) {
                            c10 = 'q';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 102844228:
                        if (str2.equals(A05(1035, 5, 6))) {
                            c10 = ':';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 165221241:
                        if (str2.equals(A05(24, 8, 4))) {
                            c10 = 5;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 182191441:
                        if (str2.equals(A05(ShapeTypes.FLOW_CHART_MAGNETIC_DISK, 9, 18))) {
                            c10 = 18;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 245388979:
                        if (str2.equals(A05(1047, 8, 56))) {
                            c10 = '>';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 287431619:
                        if (str2.equals(A05(964, 7, 25))) {
                            c10 = '-';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 307593612:
                        if (str2.equals(A05(48, 8, 1))) {
                            c10 = '\b';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 308517133:
                        if (str2.equals(A05(56, 8, 111))) {
                            c10 = '\t';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 316215098:
                        if (str2.equals(A05(744, 8, 22))) {
                            c10 = 'd';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 316215116:
                        if (str2.equals(A05(752, 8, 116))) {
                            c10 = 'e';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 316246811:
                        if (str2.equals(A05(760, 8, 8))) {
                            c10 = 'f';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 316246818:
                        if (str2.equals(A05(768, 8, 49))) {
                            c10 = 'g';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 407160593:
                        if (str2.equals(A05(641, 11, 44))) {
                            c10 = 'U';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 507412548:
                        if (str2.equals(A05(672, 8, 6))) {
                            c10 = ']';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 793982701:
                        if (str2.equals(A05(383, 14, 43))) {
                            c10 = '*';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 794038622:
                        if (str2.equals(A05(397, 14, 107))) {
                            c10 = '+';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 794040393:
                        if (str2.equals(A05(TTAdConstant.IMAGE_CODE, 14, 88))) {
                            c10 = ',';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 835649806:
                        if (str2.equals(A05(1040, 7, 41))) {
                            c10 = '=';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 917340916:
                        if (str2.equals(A05(39, 9, 40))) {
                            c10 = 7;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 958008161:
                        if (str2.equals(A05(1026, 9, 73))) {
                            c10 = '7';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1060579533:
                        if (str2.equals(A05(1118, 8, 11))) {
                            c10 = 'K';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1150207623:
                        if (str2.equals(A05(PglCryptUtils.LOAD_SO_FAILED, 7, 42))) {
                            c10 = ';';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1176899427:
                        if (str2.equals(A05(1018, 8, 27))) {
                            c10 = '6';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1280332038:
                        if (str2.equals(A05(991, 7, 0))) {
                            c10 = PackagingURIHelper.FORWARD_SLASH_CHAR;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1306947716:
                        if (str2.equals(A05(253, 10, 41))) {
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1349174697:
                        if (str2.equals(A05(977, 14, 42))) {
                            c10 = '.';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1522194893:
                        if (str2.equals(A05(1364, 7, 55))) {
                            c10 = 'o';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1691543273:
                        if (str2.equals(A05(148, 7, 118))) {
                            c10 = 17;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1709443163:
                        if (str2.equals(A05(998, 14, 120))) {
                            c10 = '3';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1865889110:
                        if (str2.equals(A05(1204, 7, 66))) {
                            c10 = '_';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1906253259:
                        if (str2.equals(A05(589, 8, 79))) {
                            c10 = 'O';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1977196784:
                        if (str2.equals(A05(474, 12, 39))) {
                            c10 = '4';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 2029784656:
                        if (str2.equals(A05(453, 7, 78))) {
                            c10 = '0';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 2030379515:
                        if (str2.equals(A05(460, 7, 8))) {
                            c10 = '1';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 2047190025:
                        if (str2.equals(A05(222, 10, 7))) {
                            c10 = 24;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 2047252157:
                        if (str2.equals(A05(232, 10, 113))) {
                            c10 = 25;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 2048319463:
                        if (str2.equals(A05(467, 7, 10))) {
                            c10 = '2';
                            break;
                        }
                        c10 = 65535;
                        break;
                    default:
                        c10 = 65535;
                        break;
                }
                switch (c10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case '\b':
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case ' ':
                    case '!':
                    case '\"':
                    case '#':
                    case '$':
                    case '%':
                    case '&':
                    case '\'':
                    case '(':
                    case ')':
                    case '*':
                    case '+':
                    case ',':
                    case '-':
                    case '.':
                    case '/':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case ':':
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                    case '?':
                    case '@':
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                    case '[':
                    case '\\':
                    case ']':
                    case '^':
                    case '_':
                    case '`':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                        A0b = true;
                        break;
                }
                String str3 = IK.A06;
                switch (str3.hashCode()) {
                    case 2006354:
                        if (str3.equals(A05(64, 4, 95))) {
                            break;
                        }
                        c = 65535;
                        break;
                    case 2006367:
                        if (str3.equals(A05(68, 4, 119))) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                    case 1:
                        A0b = true;
                        break;
                }
                A0c = true;
            }
        }
        return A0b;
    }

    public static boolean A0V(boolean z10, Format format, Format format2) {
        return format.A0O.equals(format2.A0O) && format.A0B == format2.A0B && (z10 || (format.A0F == format2.A0F && format.A08 == format2.A08)) && IK.A0g(format.A0J, format2.A0J);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05966m, com.facebook.ads.redexgen.X.AbstractC0780Ee
    public final void A13() {
        super.A13();
        this.A09 = 0;
        this.A0H = SystemClock.elapsedRealtime();
        this.A0L = SystemClock.elapsedRealtime() * 1000;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05966m, com.facebook.ads.redexgen.X.AbstractC0780Ee
    public final void A14() {
        this.A0J = -9223372036854775807L;
        A08();
        super.A14();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05966m, com.facebook.ads.redexgen.X.AbstractC0780Ee
    public final void A15() {
        this.A08 = -1;
        this.A06 = -1;
        this.A01 = -1.0f;
        this.A02 = -1.0f;
        this.A0M = -9223372036854775807L;
        this.A0K = -9223372036854775807L;
        this.A0A = 0;
        A07();
        A06();
        this.A0W.A08();
        this.A00 = null;
        this.A0S = false;
        try {
            super.A15();
        } finally {
            super.A0U.A00();
            this.A0X.A05(super.A0U);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05966m, com.facebook.ads.redexgen.X.AbstractC0780Ee
    public final void A16(long j10, boolean z10) throws C06589h {
        super.A16(j10, z10);
        A06();
        this.A0I = -9223372036854775807L;
        this.A05 = 0;
        this.A0K = -9223372036854775807L;
        if (this.A0A != 0) {
            this.A0M = this.A0Z[this.A0A - 1];
            this.A0A = 0;
        }
        if (z10) {
            A0C();
        } else {
            this.A0J = -9223372036854775807L;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05966m, com.facebook.ads.redexgen.X.AbstractC0780Ee
    public final void A17(boolean z10) throws C06589h {
        super.A17(z10);
        this.A0G = A12().A00;
        this.A0S = this.A0G != 0;
        this.A0X.A06(super.A0U);
        this.A0W.A09();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0780Ee
    public final void A18(Format[] formatArr, long j10) throws C06589h {
        if (this.A0M == -9223372036854775807L) {
            this.A0M = j10;
        } else {
            if (this.A0A == this.A0Z.length) {
                Log.w(A05(522, 23, 65), A05(776, 45, 98) + this.A0Z[this.A0A - 1]);
            } else {
                this.A0A++;
            }
            this.A0Z[this.A0A - 1] = j10;
            this.A0a[this.A0A - 1] = this.A0K;
        }
        super.A18(formatArr, j10);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05966m
    public final int A1B(MediaCodec mediaCodec, DL dl2, Format format, Format format2) {
        if (!A0V(dl2.A03, format, format2) || format2.A0F > this.A0P.A02) {
            return 0;
        }
        int i10 = format2.A08;
        String[] strArr = A0e;
        if (strArr[5].charAt(3) != strArr[0].charAt(3)) {
            throw new RuntimeException();
        }
        A0e[2] = "gOkpvRAFIiK";
        if (i10 <= this.A0P.A00 && A00(dl2, format2) <= this.A0P.A01) {
            if (format.A0K(format2)) {
                return 1;
            }
            return 3;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
        if (r7 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
        if (r5 == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
        r3 = r10.A7A(r6, false);
        r0 = com.facebook.ads.redexgen.X.C3F.A0e[6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
        if (r0.length() == 32) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
        com.facebook.ads.redexgen.X.C3F.A0e[2] = "kY";
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
        if (r3 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
        r2 = com.facebook.ads.redexgen.X.C3F.A0e;
        r2[5] = "miospEErZf1PkmwycTNWtVsRxjbATiq1";
        r2[0] = "Nl2sCL7SF6rWs0f7PpMxxp0YRUBWrVNa";
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0098, code lost:
        if (r3 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009b, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ab, code lost:
        if (r7 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ae, code lost:
        r1 = com.facebook.ads.redexgen.X.AbstractC0780Ee.A0y(r11, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b2, code lost:
        if (r1 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b4, code lost:
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b5, code lost:
        r6 = r7.A0I(r12.A0K);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bb, code lost:
        if (r6 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bf, code lost:
        if (r12.A0F <= 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c3, code lost:
        if (r12.A08 <= 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c9, code lost:
        if (com.facebook.ads.redexgen.X.IK.A02 < 21) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cb, code lost:
        r6 = r7.A0H(r12.A0F, r12.A08, r12.A01);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d6, code lost:
        r4 = r7.A03;
        r2 = com.facebook.ads.redexgen.X.C3F.A0e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e9, code lost:
        if (r2[5].charAt(3) == r2[0].charAt(3)) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f0, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fa, code lost:
        if ((r12.A0F * r12.A08) > com.facebook.ads.redexgen.X.DW.A00()) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fc, code lost:
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fd, code lost:
        if (r6 != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ff, code lost:
        r4 = new java.lang.StringBuilder();
        r0 = A05(298, 29, 58);
        r4 = r4.append(r0).append(r12.A0F);
        r0 = A05(1379, 1, 35);
        r4 = r4.append(r0).append(r12.A08);
        r0 = A05(856, 3, 57);
        r1 = r4.append(r0);
        r0 = com.facebook.ads.redexgen.X.IK.A04;
        r4 = r1.append(r0);
        r0 = A05(855, 1, 83);
        r4.append(r0).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014f, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0151, code lost:
        com.facebook.ads.redexgen.X.C3F.A0e[6] = "4l1TldCvGyAMjXoB6PEL";
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0158, code lost:
        if (r4 == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015a, code lost:
        r5 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015e, code lost:
        if (r7.A06 == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0160, code lost:
        r3 = 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0162, code lost:
        if (r6 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0164, code lost:
        r4 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0165, code lost:
        r5 = r5 | r3;
        r2 = com.facebook.ads.redexgen.X.C3F.A0e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0177, code lost:
        if (r2[5].charAt(3) == r2[0].charAt(3)) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x017a, code lost:
        return r5 | r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017b, code lost:
        r4 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x017d, code lost:
        r5 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0180, code lost:
        com.facebook.ads.redexgen.X.C3F.A0e[2] = "Dws7l48Bd";
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0188, code lost:
        return r5 | r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:?, code lost:
        return r8;
     */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bh != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    @Override // com.facebook.ads.redexgen.X.AbstractC05966m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A1C(com.facebook.ads.redexgen.X.DR r10, com.facebook.ads.redexgen.X.InterfaceC0707Bh<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> r11, com.facebook.ads.internal.exoplayer2.thirdparty.Format r12) throws com.facebook.ads.redexgen.X.DU {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3F.A1C(com.facebook.ads.redexgen.X.DR, com.facebook.ads.redexgen.X.Bh, com.facebook.ads.internal.exoplayer2.thirdparty.Format):int");
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05966m
    public final void A1G() throws C06589h {
        super.A1G();
        this.A04 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05966m
    public final void A1H() {
        try {
            super.A1H();
        } finally {
            this.A04 = 0;
            if (this.A0N != null) {
                if (this.A0O == this.A0N) {
                    this.A0O = null;
                }
                this.A0N.release();
                this.A0N = null;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05966m
    public final void A1K(long j10) {
        this.A04--;
        while (this.A0A != 0 && j10 >= this.A0a[0]) {
            long[] jArr = this.A0Z;
            if (A0e[3].length() != 9) {
                throw new RuntimeException();
            }
            String[] strArr = A0e;
            strArr[5] = "1hGsVlhDffacJ6befvdxWjQmz9qEu7gY";
            strArr[0] = "P6esgzdkJXYtWL0gEpuFzBpLbYKtaT7x";
            this.A0M = jArr[0];
            this.A0A--;
            System.arraycopy(this.A0Z, 1, this.A0Z, 0, this.A0A);
            System.arraycopy(this.A0a, 1, this.A0a, 0, this.A0A);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ce, code lost:
        if (r4 == 270) goto L28;
     */
    @Override // com.facebook.ads.redexgen.X.AbstractC05966m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1L(android.media.MediaCodec r9, android.media.MediaFormat r10) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3F.A1L(android.media.MediaCodec, android.media.MediaFormat):void");
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05966m
    public final void A1M(Format format) throws C06589h {
        super.A1M(format);
        this.A0X.A04(format);
        this.A02 = format.A02;
        this.A0B = format.A0B;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05966m
    public final void A1N(C1292Yw c1292Yw) {
        this.A04++;
        this.A0K = Math.max(c1292Yw.A00, this.A0K);
        if (IK.A02 < 23 && this.A0S) {
            A1S();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05966m
    public final void A1O(DL dl2, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) throws DU {
        this.A0P = A04(dl2, format, A1A());
        MediaFormat A03 = A03(format, this.A0P, this.A0Y, this.A0G);
        if (this.A0O == null) {
            AbstractC0844Hf.A04(A0T(dl2));
            if (this.A0N == null) {
                this.A0N = DummySurface.A01(this.A0V, dl2.A05);
            }
            this.A0O = this.A0N;
        }
        mediaCodec.configure(A03, this.A0O, mediaCrypto, 0);
        if (IK.A02 >= 23 && this.A0S) {
            this.A00 = new IV(this, mediaCodec);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05966m
    public final void A1P(String str, long j10, long j11) {
        this.A0X.A07(str, j10, j11);
        this.A0Q = A0U(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
        if (A0R(r8, r19 - r4) != false) goto L60;
     */
    @Override // com.facebook.ads.redexgen.X.AbstractC05966m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A1Q(long r32, long r34, android.media.MediaCodec r36, java.nio.ByteBuffer r37, int r38, int r39, long r40, boolean r42) throws com.facebook.ads.redexgen.X.C06589h {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3F.A1Q(long, long, android.media.MediaCodec, java.nio.ByteBuffer, int, int, long, boolean):boolean");
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05966m
    public final boolean A1R(DL dl2) {
        return this.A0O != null || A0T(dl2);
    }

    public final void A1S() {
        if (!this.A0R) {
            this.A0R = true;
            this.A0X.A03(this.A0O);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0780Ee, com.facebook.ads.redexgen.X.AC
    public final void A8t(int i10, Object obj) throws C06589h {
        if (i10 == 1) {
            A0L((Surface) obj);
        } else if (i10 == 4) {
            this.A0F = ((Integer) obj).intValue();
            MediaCodec A1D = A1D();
            if (A1D == null) {
                return;
            }
            A1D.setVideoScalingMode(this.A0F);
        } else {
            super.A8t(i10, obj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
        if (r1 == (-9223372036854775807L)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
        if (r1 == (-9223372036854775807L)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
        if (android.os.SystemClock.elapsedRealtime() >= r9.A0J) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
        r9.A0J = -9223372036854775807L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
        return false;
     */
    @Override // com.facebook.ads.redexgen.X.AbstractC05966m, com.facebook.ads.redexgen.X.ZA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A9b() {
        /*
            r9 = this;
            boolean r0 = super.A9b()
            r8 = 1
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L46
            boolean r5 = r9.A0R
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C3F.A0e
            r0 = 1
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 31
            if (r1 == r0) goto L40
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C3F.A0e
            java.lang.String r1 = "rzYsSFSGOqombMnLFodn7FU5vMlf2MpC"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "TgGsZLg3j3z5Z41RamAG73xohavN5cT8"
            r0 = 0
            r2[r0] = r1
            if (r5 != 0) goto L3d
            android.view.Surface r0 = r9.A0N
            if (r0 == 0) goto L33
            android.view.Surface r1 = r9.A0O
            android.view.Surface r0 = r9.A0N
            if (r1 == r0) goto L3d
        L33:
            android.media.MediaCodec r0 = r9.A1D()
            if (r0 == 0) goto L3d
            boolean r0 = r9.A0S
            if (r0 == 0) goto L46
        L3d:
            r9.A0J = r3
            return r8
        L40:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L46:
            long r1 = r9.A0J
            r7 = 0
            java.lang.String[] r6 = com.facebook.ads.redexgen.X.C3F.A0e
            r0 = 7
            r5 = r6[r0]
            r0 = 4
            r0 = r6[r0]
            int r5 = r5.length()
            int r0 = r0.length()
            if (r5 == r0) goto L67
            java.lang.String[] r6 = com.facebook.ads.redexgen.X.C3F.A0e
            java.lang.String r5 = "TzQWrFDnBOdAflvt"
            r0 = 2
            r6[r0] = r5
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L6c
        L66:
            return r7
        L67:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L6c
            goto L66
        L6c:
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r1 = r9.A0J
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L77
            return r8
        L77:
            r9.A0J = r3
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C3F.A9b():boolean");
    }
}
