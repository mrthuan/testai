package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.internal.api.AdNativeComponentView;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.NativeAdImageApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.lang.ref.WeakReference;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.WeakHashMap;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class W7 implements com.facebook.ads.Ad, NativeAdBaseApi, Repairable, InterfaceC0891Jc {
    public static C05906f A0k;
    public static byte[] A0l;
    public static String[] A0m = {"0QrYY16WpsBKaBkyPEA33iBIoR05UhVT", "YnnsFrkLVth43aFbA8XanJ7Af1ELV", "Oxqa2FUUnPLQ7GUfsty3Y0efzjvyqNtk", "SIKP4BEcnF1kam64buW5uj4ZKlEjFxDR", "vEVPI6RQ4lovzpZyrpWOxFDddvUHwWNp", "NGWOmnzpb", "djSS0JJWnZq1rlBsvyeXY9GnDKzed", "NhvbMWoFDj5W6o0bWnGe4dztWB8buZER"};
    public static final String A0n;
    public static final WeakHashMap<View, WeakReference<W7>> A0o;
    public long A00;
    public Drawable A01;
    public View.OnTouchListener A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public NativeAdLayout A07;
    public AnonymousClass12 A08;
    public C1462cJ A09;
    public C0798Fh A0A;
    public C1431bo A0B;
    public C6l A0C;
    public C8X A0D;
    public JQ A0E;
    public W9 A0F;
    public W6 A0G;
    public JW A0H;
    public JX A0I;
    public EnumC0898Jl A0J;
    public N8 A0K;
    public O6 A0L;
    public C1041Pb A0M;
    public QS A0N;
    public AbstractC1101Rj A0O;
    public AbstractC1101Rj A0P;
    public C1102Rk A0Q;
    public C1102Rk A0R;
    public String A0S;
    public String A0T;
    public WeakReference<C1360ac> A0U;
    public WeakReference<AbstractC1101Rj> A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public C1473cU A0a;
    public final C05906f A0b;
    public final C1314Zs A0c;
    public final JT A0d;
    public final C0893Je A0e;
    public final C0957Lv A0f;
    public final String A0g;
    public final String A0h;
    public final List<View> A0i;
    public volatile boolean A0j;

    public static String A0W(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0l, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 112);
        }
        return new String(copyOfRange);
    }

    public static void A0d() {
        A0l = new byte[]{-32, 26, Field.ASK, 31, 30, -18, -12, -12, -12, -13, 34, 33, 33, -25, 26, -19, -20, -23, -21, 23, -23, -74, -77, -28, -74, -25, -27, -29, -77, Field.ASK, Field.TOA, 5, Field.FORMDROPDOWN, Field.ADVANCE, Field.AUTOTEXTLIST, 5, Field.ADDIN, Field.ADVANCE, Field.FORMTEXT, Field.TOA, 74, Field.TOA, -25, 10, -6, 11, 19, 22, 18, 7, 26, 11, -58, -51, -53, 25, -51, -58, 15, 25, -58, 20, 21, 26, -58, 7, -58, 20, 7, 26, 15, Field.NUMCHARS, 11, -58, 7, 10, -33, -37, -38, 14, -3, 2, -2, 7, -4, -2, -25, -2, 13, 16, 8, 11, 4, -27, 0, 8, 11, 4, 3, -65, 19, 14, -65, 11, 14, 0, 3, -65, -20, 4, 3, 8, 0, -51, -16, 11, 19, 22, 15, 14, -54, 30, 25, -54, 25, 12, 30, 11, 19, 24, -54, 30, 15, 23, 26, 22, 11, 30, 15, -54, -13, -18, -54, 16, Field.NUMCHARS, 25, 23, -54, 12, 19, 14, -54, 26, 11, Field.QUOTE, 22, 25, 11, 14, -54, -47, -49, 29, -47, -23, 14, 20, 5, 18, 14, 1, 12, -64, 5, 18, 18, 15, 18, -50, -86, 30, Field.INCLUDEPICTURE, Field.MERGESEQ, Field.AUTONUM, Field.SECTION, Field.USERADDRESS, Field.SYMBOL, -11, Field.NOTEREF, 58, Field.TOA, -11, Field.INCLUDETEXT, 59, -11, 56, Field.SECTION, Field.USERADDRESS, 56, 64, Field.AUTONUM, Field.IMPORT, Field.SECTION, 58, -11, Field.MERGESEQ, Field.USERADDRESS, 58, 76, Field.NOTEREF, 0, 24, 23, Field.NUMCHARS, 20, 9, Field.NUMCHARS, 24, 42, -45, 25, 34, Field.PAGEREF, -45, Field.NUMCHARS, 22, 34, 33, -45, Field.NUMCHARS, Field.ASK, -45, Field.NUMCHARS, Field.ASK, -45, 32, Field.NUMCHARS, Field.ASK, Field.ASK, Field.NUMCHARS, 33, 26, -31, 29, Field.AUTONUMLGL, Field.AUTONUMOUT, Field.SYMBOL, Field.EQ, Field.ASK, Field.SYMBOL, Field.AUTONUMLGL, Field.FORMCHECKBOX, -16, Field.SYMBOL, Field.INCLUDEPICTURE, -16, 61, Field.SYMBOL, Field.INCLUDEPICTURE, Field.INCLUDEPICTURE, Field.SYMBOL, Field.USERADDRESS, Field.IMPORT, -2, Field.MACROBUTTON, Field.HTMLCONTROL, Field.AUTOTEXTLIST, Field.LISTNUM, 6, 86, Field.HYPERLINK, Field.DOCPROPERTY, Field.BIDIOUTLINE, Field.AUTOTEXT, 74, Field.MERGESEQ, 6, Field.FORMCHECKBOX, 6, 60, Field.AUTOTEXT, Field.MERGESEQ, Field.ADDRESSBLOCK, Field.QUOTE, Field.AUTONUM, Field.TOA, Field.USERADDRESS, Field.MERGESEQ, 58, -11, 22, Field.SYMBOL, -11, 76, Field.AUTONUM, Field.NOTEREF, -11, Field.AUTONUM, Field.SECTION, Field.FORMCHECKBOX, 58, Field.AUTONUM, Field.SYMBOL, 78, -11, Field.FORMCHECKBOX, 58, 60, Field.USERADDRESS, Field.NOTEREF, Field.TOA, 58, Field.FORMCHECKBOX, 58, Field.SYMBOL, -11, 76, Field.USERADDRESS, Field.TOA, 61, -11, Field.AUTONUM, -11, 43, Field.USERADDRESS, 58, 76, 3, -11, 22, 74, Field.TOA, Field.INCLUDETEXT, -11, 74, Field.INCLUDEPICTURE, Field.FORMCHECKBOX, 58, 60, Field.USERADDRESS, Field.NOTEREF, Field.TOA, 58, Field.FORMCHECKBOX, Field.USERADDRESS, Field.INCLUDEPICTURE, 60, -11, Field.AUTONUM, Field.INCLUDEPICTURE, Field.SYMBOL, -11, Field.FILESIZE, Field.FORMCHECKBOX, Field.INCLUDETEXT, 56, 58, 58, Field.SYMBOL, Field.USERADDRESS, Field.INCLUDEPICTURE, 60, 3, -55, -36, -17, -28, -15, -32, -101, -36, -33, -101, -33, -32, -18, -17, -19, -22, -12, -32, -33, -39, -20, -1, -12, 1, -16, -85, -20, -17, -85, -9, -6, -20, -17, -85, -3, -16, -4, 0, -16, -2, -1, -16, -17, -22, -3, -7, 11, -76, -11, 0, 6, -7, -11, -8, 13, -76, 6, -7, -5, -3, 7, 8, -7, 6, -7, -8, -76, 11, -3, 8, -4, -76, -11, -76, -30, -11, 8, -3, 10, -7, -43, -8, -62, -76, -43, 9, 8, 3, -76, 9, 2, 6, -7, -5, -3, 7, 8, -7, 6, -3, 2, -5, -76, -11, 2, -8, -76, 4, 6, 3, -9, -7, -7, -8, -3, 2, -5, -62, -1, 18, 14, 32, -55, 23, 24, 29, -55, Field.NUMWORDS, 14, 16, 18, Field.NUMCHARS, 29, 14, Field.NUMWORDS, 14, 13, -55, 32, 18, 29, 17, -55, 29, 17, 18, Field.NUMCHARS, -55, -9, 10, 29, 18, 31, 14, -22, 13, Field.DDEAUTO, Field.EQ, -19, 58, Field.GOTOBUTTON, Field.EQ, Field.AUTONUM, Field.DDEAUTO, -19, Field.SECTION, Field.FORMTEXT, 61, Field.GOTOBUTTON, -19, Field.AUTONUM, 64, -19, 59, 60, Field.SECTION, -19, 64, Field.SECTIONPAGES, 61, 61, 60, Field.BARCODE, Field.SECTION, Field.GOTOBUTTON, Field.EQ, -5, Field.AUTONUM, Field.FILESIZE, Field.USERADDRESS, Field.MACROBUTTON, Field.AUTONUMOUT, Field.SECTIONPAGES, Field.INCLUDEPICTURE, Field.SECTION, Field.USERADDRESS, Field.NOTEREF, Field.ADDIN, Field.ADVANCE, Field.FORMTEXT, Field.TOA, Field.ASK, Field.TOA, Field.FILESIZE, Field.NOTEREF, 58, 61, 26, 61, 1, 2, -7, 60, 58, Field.FILESIZE, Field.FILESIZE, Field.USERADDRESS, 61, -7, Field.FORMTEXT, Field.NOTEREF, Field.MERGESEQ, Field.USERADDRESS, -7, 77, Field.SECTION, 58, Field.FORMCHECKBOX, -7, Field.NOTEREF, Field.FORMCHECKBOX, 60, Field.USERADDRESS, -27, -40, -21, -32, -19, -36};
        String[] strArr = A0m;
        if (strArr[6].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A0m[3] = "WbNUBB1XQVUYjPuN5kyqwH0pcEyoS9gz";
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x02c6, code lost:
        if (r6.A0S() == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02c8, code lost:
        r12.A0O = new com.facebook.ads.redexgen.X.WC(r12);
        r12.A0Q = new com.facebook.ads.redexgen.X.C1102Rk(r13, 1, new java.lang.ref.WeakReference(r12.A0O), r12.A0c);
        r12.A0Q.A0Y(false);
        r12.A0Q.A0X(r6.A09());
        r12.A0Q.A0U();
        r12.A0c.A0E().AAt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02fb, code lost:
        r1 = new java.util.ArrayList(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0302, code lost:
        if (r12.A05 == null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0304, code lost:
        r7 = r12.A05;
        r4 = com.facebook.ads.redexgen.X.W7.A0m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0317, code lost:
        if (r4[2].charAt(3) == r4[7].charAt(3)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0319, code lost:
        r4 = com.facebook.ads.redexgen.X.W7.A0m;
        r4[0] = "7BxfhPTBtrovnc2SNqJYjum2f5qDPcpL";
        r4[4] = "Q5pxYg7VFdMmLRDnYTITcnTwa1eIsVWj";
        r1.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0328, code lost:
        r2 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0330, code lost:
        if (r2.hasNext() == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0332, code lost:
        A1K((android.view.View) r2.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x033c, code lost:
        r0 = A0z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0340, code lost:
        if (r16 == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0342, code lost:
        if (r0 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0348, code lost:
        if (r0.A18() == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x034a, code lost:
        A1K(r13);
        r1.add(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0350, code lost:
        r7 = A00();
        r12.A0P = new com.facebook.ads.redexgen.X.WB(r12, r14, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x035d, code lost:
        if ((r14 instanceof com.facebook.ads.internal.api.AdNativeComponentView) == false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x035f, code lost:
        r12.A03 = ((com.facebook.ads.internal.api.AdNativeComponentView) r14).getAdContentsView();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x036d, code lost:
        if (com.facebook.ads.redexgen.X.C0877Im.A1p(r12.A0c) == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x036f, code lost:
        r4 = A1B();
        r6 = A11().A0A();
        r5 = r12.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x037d, code lost:
        if (r4 != null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x037f, code lost:
        r4 = A0W(0, 0, 121);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0387, code lost:
        r6.AHP(r5, r4, r12.A03 instanceof com.facebook.ads.redexgen.X.C1081Qp, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x038f, code lost:
        r12.A0R = new com.facebook.ads.redexgen.X.C1102Rk(r12.A03, r7, A03(), true, new java.lang.ref.WeakReference(r12.A0P), r12.A0c);
        r12.A0R.A0Y(!A0q());
        r12.A0R.A0W(A01());
        r12.A0R.A0X(A02());
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x03c7, code lost:
        if ((r12.A03 instanceof com.facebook.ads.redexgen.X.C1010Nw) == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x03c9, code lost:
        r5 = (com.facebook.ads.redexgen.X.C1010Nw) r12.A03;
        r4 = com.facebook.ads.redexgen.X.W7.A0m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x03df, code lost:
        if (r4[0].charAt(21) == r4[4].charAt(21)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x03e1, code lost:
        com.facebook.ads.redexgen.X.W7.A0m[3] = "9jWMkBrIWAaQq3BshIoiK9kOFApm7Mnb";
        r5.A06(r12.A0R);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x03ed, code lost:
        r12.A09 = new com.facebook.ads.redexgen.X.C1462cJ(r12.A0c, new com.facebook.ads.redexgen.X.W8(r12, null), r12.A0R, r12.A0a);
        r12.A09.A0D(r1);
        com.facebook.ads.redexgen.X.W7.A0o.put(r13, new java.lang.ref.WeakReference<>(r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0413, code lost:
        if (android.os.Build.VERSION.SDK_INT < 18) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x041b, code lost:
        if (com.facebook.ads.redexgen.X.C0877Im.A16(r12.A0c) == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x041d, code lost:
        r12.A0L = new com.facebook.ads.redexgen.X.O6();
        r12.A0L.A0C(r12.A0g);
        r12.A0L.A0B(r12.A0c.getPackageName());
        r12.A0L.A0A(r12.A0R);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x043f, code lost:
        if (r12.A0a == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x044b, code lost:
        if (r12.A0a.A0E().A03() <= 0) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x044d, code lost:
        r4 = r12.A0a.A0E();
        r2 = com.facebook.ads.redexgen.X.W7.A0m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0463, code lost:
        if (r2[6].length() == r2[1].length()) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x046b, code lost:
        r2 = com.facebook.ads.redexgen.X.W7.A0m;
        r2[0] = "InlaPqSCsodlo1snRpIwz8DPt1ADYzZZ";
        r2[4] = "FtfMBLderHMiZZFXfgJZWbC0srgJcpuD";
        r12.A0L.A08(r4.A03(), r4.A04());
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0486, code lost:
        if (r12.A0D == null) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0488, code lost:
        r4 = r12.A0L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0496, code lost:
        if (com.facebook.ads.redexgen.X.W7.A0m[3].charAt(5) == 'B') goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0499, code lost:
        r12.A03 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x049f, code lost:
        if (r12.A0A == null) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x04a7, code lost:
        if (r12.A0A.A0I() == null) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x04a9, code lost:
        r12.A0L.A09(r12.A0A.A0I().A0C());
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x04b9, code lost:
        r2 = com.facebook.ads.redexgen.X.W7.A0m;
        r2[0] = "0NneDoUmBBax1k2al7sn5wGz6YlJvYnm";
        r2[4] = "TUOAUmE75XZKXYZI7fK9pdpTcTx58G4M";
        r4.A09(r12.A0D.A0C());
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x04ce, code lost:
        r4 = r12.A04.getOverlay();
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x04e0, code lost:
        if (com.facebook.ads.redexgen.X.W7.A0m[3].charAt(5) == 'B') goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x04e2, code lost:
        com.facebook.ads.redexgen.X.W7.A0m[3] = "phIEPBH6I0ughovInGkhz8ZisPRzHBk3";
        r4.add(r12.A0L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x04ee, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x04ef, code lost:
        r2 = com.facebook.ads.redexgen.X.W7.A0m;
        r2[2] = "gnfKTnhAP88IqIDCyFwPWRuvnh0aHtXe";
        r2[7] = "JILhdROEHVygs9M2n2U0jFxigvp1iBje";
        r4.add(r12.A0L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0222, code lost:
        if (r8 != null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0224, code lost:
        android.util.Log.w(com.facebook.ads.redexgen.X.W7.A0n, A0W(283, 80, 101));
        unregisterView();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0236, code lost:
        r8 = com.facebook.ads.redexgen.X.W7.A0o.containsKey(r13);
        r2 = com.facebook.ads.redexgen.X.W7.A0m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x024c, code lost:
        if (r2[6].length() == r2[1].length()) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0253, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x025b, code lost:
        if (r8 != null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x025e, code lost:
        r2 = com.facebook.ads.redexgen.X.W7.A0m;
        r2[0] = "r1dCEV0W05obqeylsxysUOCLLtyqbDkO";
        r2[4] = "jsU6g8E1kSPqSuKqGJQzSRDrUMjHNr5E";
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x026a, code lost:
        if (r8 == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0278, code lost:
        if (com.facebook.ads.redexgen.X.W7.A0o.get(r13).get() == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x027a, code lost:
        android.util.Log.w(com.facebook.ads.redexgen.X.W7.A0n, A0W(com.bytedance.sdk.openadsdk.TTAdConstant.LANDING_PAGE_TYPE_CODE, 75, 36));
        com.facebook.ads.redexgen.X.W7.A0o.get(r13).get().unregisterView();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x029a, code lost:
        r12.A0F = new com.facebook.ads.redexgen.X.W9(r12, r12.A0c, null);
        r12.A04 = r13;
        r12.A06 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02aa, code lost:
        if ((r13 instanceof android.view.ViewGroup) == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02ac, code lost:
        r12.A0K = new com.facebook.ads.redexgen.X.N8(r12.A0c, new com.facebook.ads.redexgen.X.WD(r12));
        ((android.view.ViewGroup) r13).addView(r12.A0K);
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 24 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0f(android.view.View r13, android.view.View r14, java.util.List<android.view.View> r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 1281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.W7.A0f(android.view.View, android.view.View, java.util.List, boolean):void");
    }

    static {
        A0d();
        A0n = W7.class.getSimpleName();
        A0o = new WeakHashMap<>();
    }

    public W7(Context context, String str, JT jt, boolean z10) {
        this.A0h = UUID.randomUUID().toString();
        this.A0J = EnumC0898Jl.A06;
        this.A0E = JQ.A04;
        this.A08 = AnonymousClass12.A03;
        this.A0U = new WeakReference<>(null);
        this.A0i = new ArrayList();
        this.A0f = new C0957Lv();
        this.A0Z = false;
        this.A0Y = false;
        this.A00 = -1L;
        if (context instanceof C1314Zs) {
            this.A0c = (C1314Zs) context;
        } else if (!z10) {
            this.A0c = C05605b.A04(context);
        } else {
            this.A0c = C05605b.A03(context);
        }
        this.A0c.A0N(this);
        this.A0g = str;
        this.A0d = jt;
        if (A0k != null) {
            this.A0b = A0k;
        } else {
            this.A0b = new C05906f(this.A0c);
        }
        this.A05 = new View(context);
        this.A0e = new C0893Je(this.A0c, this);
    }

    public W7(W7 w7) {
        this((Context) w7.A0c, (String) null, w7.A0d, true);
        this.A0D = w7.A0D;
        this.A0a = w7.A0a;
        this.A0B = w7.A0B;
        this.A0j = true;
        this.A05 = new View(this.A0c);
    }

    public W7(C1314Zs c1314Zs, C1473cU c1473cU, C8X c8x, JT jt) {
        this((Context) c1314Zs, (String) null, jt, true);
        this.A0a = c1473cU;
        this.A0D = c8x;
        this.A0j = true;
        this.A05 = new View(c1314Zs);
    }

    public W7(C1314Zs c1314Zs, C1473cU c1473cU, C8X c8x, JT jt, C1431bo c1431bo) {
        this(c1314Zs, c1473cU, c8x, jt);
        this.A0B = c1431bo;
    }

    private int A00() {
        if (this.A0D != null) {
            return this.A0D.A04();
        }
        if (this.A0A == null || this.A0A.A0I() == null) {
            return 1;
        }
        C8X A0I = this.A0A.A0I();
        String[] strArr = A0m;
        String str = strArr[6];
        String str2 = strArr[1];
        int length = str.length();
        int viewabilityThreshold = str2.length();
        if (length != viewabilityThreshold) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0m;
        strArr2[2] = "P5kYLn6xwAUrjDfDuw88TuaVt88D3vtD";
        strArr2[7] = "ZJzVQNISDO4cH7XUZ38T2d7bCdM1k8uN";
        return A0I.A04();
    }

    private int A01() {
        if (this.A0D != null) {
            return this.A0D.A07();
        }
        if (this.A0a != null) {
            return this.A0a.A0C();
        }
        if (this.A0A != null && this.A0A.A0I() != null) {
            return this.A0A.A0I().A07();
        }
        return 0;
    }

    private int A02() {
        if (this.A0D != null) {
            return this.A0D.A08();
        }
        if (this.A0a != null) {
            return this.A0a.A0D();
        }
        if (this.A0A != null && this.A0A.A0I() != null) {
            return this.A0A.A0I().A08();
        }
        return 1000;
    }

    private int A03() {
        if (this.A0D != null) {
            return this.A0D.A09();
        }
        C0798Fh c0798Fh = this.A0A;
        if (A0m[3].charAt(5) != 'B') {
            throw new RuntimeException();
        }
        A0m[5] = "Xt";
        if (c0798Fh == null || this.A0A.A0I() == null) {
            return 0;
        }
        return this.A0A.A0I().A09();
    }

    public static Drawable A05(C1314Zs c1314Zs, Bitmap bitmap, boolean z10, String str) {
        BitmapDrawable A00;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(c1314Zs.getResources(), bitmap);
        if (!z10 || (A00 = QR.A00(c1314Zs, str)) == null) {
            return bitmapDrawable;
        }
        Drawable iconViewDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, A00});
        return iconViewDrawable;
    }

    public static NativeAdBase A0A(Context context, String str, String str2) throws C0895Jh {
        EnumC0898Jl A00 = C0903Jq.A00(str2);
        if (A00 != null) {
            EnumC0898Jl template = EnumC0898Jl.A05;
            if (A00 == template) {
                return new NativeBannerAd(context, str);
            }
            EnumC0898Jl template2 = EnumC0898Jl.A06;
            if (A00 == template2) {
                return new NativeAd(context, str);
            }
            throw new C0895Jh(AdErrorType.BID_PAYLOAD_ERROR, String.format(Locale.US, A0W(42, 34, 54), A00));
        }
        throw new C0895Jh(AdErrorType.BID_PAYLOAD_ERROR, String.format(Locale.US, A0W(114, 50, 58), str2));
    }

    private final C1473cU A0C() {
        C1473cU c1473cU = this.A0a;
        if (c1473cU != null && c1473cU.A0R()) {
            return c1473cU;
        }
        return null;
    }

    private C1461cI A0F() {
        return A0G(false);
    }

    private C1461cI A0G(boolean z10) {
        if (this.A0a != null) {
            C1473cU c1473cU = this.A0a;
            if (A0m[3].charAt(5) == 'B') {
                String[] strArr = A0m;
                strArr[0] = "rkQiEYXoMEhriwkmxTS9YqbekXjRctvV";
                strArr[4] = "aQIgqL6bCxVEsMgFZvYj1f08oAvgjHgO";
                if (c1473cU.A0R()) {
                    if (z10) {
                        C1473cU c1473cU2 = this.A0a;
                        if (A0m[3].charAt(5) == 'B') {
                            A0m[3] = "EWl26Bqfon8mX0lHHC6z05409Pwx5AXq";
                            c1473cU2.A0I();
                        }
                    }
                    return this.A0a.A0E();
                }
            }
            throw new RuntimeException();
        }
        return new C1461cI();
    }

    public static WA A0K() {
        return new WA();
    }

    public static W7 A0L(NativeAdBaseApi nativeAdBaseApi) {
        if (nativeAdBaseApi instanceof Proxy) {
            return (W7) ((C5L) Proxy.getInvocationHandler(nativeAdBaseApi)).A04();
        }
        return (W7) nativeAdBaseApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /* renamed from: A0M */
    public final JU getAdChoicesIcon() {
        return A0F().A0D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /* renamed from: A0O */
    public final JV getAdStarRating() {
        return A0F().A0G();
    }

    private AdPlacementType A0R() {
        if (this.A0J == EnumC0898Jl.A06) {
            return AdPlacementType.NATIVE;
        }
        return AdPlacementType.NATIVE_BANNER;
    }

    private void A0Z() {
        for (View view : this.A0i) {
            view.setOnClickListener(null);
            if (A0m[3].charAt(5) != 'B') {
                throw new RuntimeException();
            }
            A0m[3] = "reBfvBMaH6BqwlxZ2WqAQZq3knZpIvyz";
            view.setOnTouchListener(null);
            view.setOnLongClickListener(null);
        }
        this.A0i.clear();
    }

    private void A0a() {
        if (!TextUtils.isEmpty(getAdChoicesLinkUrl())) {
            L2.A0M(new L2(), this.A0c, L5.A00(getAdChoicesLinkUrl()), A1B());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0b() {
        this.A0f.A05();
        this.A0e.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0c() {
        if (this.A0Q != null) {
            this.A0Q.A0V();
            this.A0c.A0E().AAu();
            this.A0Q = null;
        }
    }

    public static void A0e(Drawable drawable, ImageView imageView) {
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (A0m[3].charAt(5) != 'B') {
            throw new RuntimeException();
        }
        String[] strArr = A0m;
        strArr[6] = "LXDT52DRzEPuIKBbeK5QN38hLQjcy";
        strArr[1] = "Z1aNossC2MxjaxQyIIrn4vHalGw3J";
        if (i10 >= 16) {
            imageView.setBackground(null);
        } else {
            imageView.setBackgroundDrawable(null);
        }
    }

    private void A0g(FrameLayout frameLayout, String str) {
        if (this.A0N != null) {
            frameLayout.removeView(this.A0N);
        }
        this.A0N = QR.A01(C05605b.A03(this.A0c), str);
        if (this.A0N != null) {
            frameLayout.addView(this.A0N, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(this.A0N);
        }
    }

    private void A0h(C1473cU c1473cU, boolean z10) {
        if (c1473cU == null) {
            return;
        }
        boolean equals = this.A0E.equals(JQ.A04);
        String A0W = A0W(596, 6, 7);
        if (equals) {
            C1461cI A0E = c1473cU.A0E();
            String clientToken = c1473cU.A6r();
            if (!TextUtils.isEmpty(clientToken)) {
                this.A0b.A0d(new JF(clientToken, this.A0c.A09()));
            }
            JU A0F = A0E.A0F();
            String[] strArr = A0m;
            if (strArr[2].charAt(3) == strArr[7].charAt(3)) {
                throw new RuntimeException();
            }
            A0m[3] = "olK6BBrMvSH2F6L4J2jXYHYWLLMocGr7";
            if (A0F != null) {
                C05886d c05886d = new C05886d(A0E.A0F().getUrl(), A0E.A0F().getHeight(), A0E.A0F().getWidth(), c1473cU.A0G(), A0W(596, 6, 7));
                c05886d.A00 = this.A0C;
                this.A0b.A0V();
                this.A0b.A0b(c05886d);
            }
            if (!this.A0J.equals(EnumC0898Jl.A05)) {
                if (A0E.A0E() != null) {
                    this.A0b.A0b(new C05886d(A0E.A0E().getUrl(), A0E.A0E().getHeight(), A0E.A0E().getWidth(), c1473cU.A0G(), A0W(596, 6, 7)));
                }
                if (c1473cU.A0H() != null) {
                    for (W7 w7 : c1473cU.A0H()) {
                        if (w7.getAdCoverImage() != null) {
                            this.A0b.A0b(new C05886d(w7.getAdCoverImage().getUrl(), w7.getAdCoverImage().getHeight(), w7.getAdCoverImage().getWidth(), c1473cU.A0G(), A0W(596, 6, 7)));
                        }
                    }
                }
                String A0b = A0E.A0b();
                if (!TextUtils.isEmpty(A0b)) {
                    this.A0b.A0a(new C05866b(A0b, c1473cU.A0G(), A0W(596, 6, 7), A0E.A0A()));
                }
            }
            AbstractC1456cD A0C = A0E.A0C();
            if (A0C != null && A0C.A19()) {
                C05866b c05866b = new C05866b(A0C.A0Z(), A0C.A0l(), A0W);
                c05866b.A04 = true;
                c05866b.A03 = A0W(0, 5, 66);
                this.A0b.A0X(c05866b);
            }
        }
        this.A0b.A0W(new WE(this, c1473cU, z10), new C6Y(c1473cU.A0G(), A0W));
    }

    private void A0i(AnonymousClass14 anonymousClass14) {
        if (this.A0a == null) {
            return;
        }
        this.A0a.A0K(anonymousClass14);
    }

    public static void A0j(NativeAdImageApi nativeAdImageApi, ImageView imageView, C1314Zs c1314Zs) {
        if (nativeAdImageApi != null && imageView != null) {
            new AsyncTaskC1183Un(imageView, c1314Zs).A05(nativeAdImageApi.getHeight(), nativeAdImageApi.getWidth()).A07(nativeAdImageApi.getUrl());
        }
    }

    private final void A0m(W6 w62) {
        this.A0G = w62;
    }

    private final void A0n(String str) {
        this.A0S = str;
    }

    private void A0o(List<View> list, View view) {
        if (this.A0d != null && this.A0d.AGk(view)) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                A0o(list, viewGroup.getChildAt(i10));
            }
            return;
        }
        list.add(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0p() {
        return A18() == JZ.A05 || A18() == JZ.A03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0q() {
        return A0F().A0e();
    }

    public final long A0x() {
        return this.A00;
    }

    public final C1473cU A0y() {
        return this.A0a;
    }

    public final AbstractC1456cD A0z() {
        return A0F().A0C();
    }

    public final C05906f A10() {
        return this.A0b;
    }

    public final C1314Zs A11() {
        return this.A0c;
    }

    public final W9 A12() {
        return this.A0F;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /* renamed from: A13 */
    public final JU getAdCoverImage() {
        return A0F().A0E();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /* renamed from: A14 */
    public final JU getAdIcon() {
        return A0F().A0F();
    }

    public final W6 A15() {
        return this.A0G;
    }

    public final JW A16() {
        return this.A0H;
    }

    public final JX A17() {
        return this.A0I;
    }

    public final JZ A18() {
        return A0F().A0H();
    }

    public final C0957Lv A19() {
        return this.A0f;
    }

    public final C1102Rk A1A() {
        return this.A0R;
    }

    public final String A1B() {
        if (this.A0a == null || !isAdLoaded()) {
            return null;
        }
        return this.A0a.A6r();
    }

    public final String A1C() {
        return this.A0T;
    }

    public final String A1D() {
        return A0G(true).A0N();
    }

    public final String A1E() {
        return A0G(true).A0O();
    }

    public final String A1F() {
        return A0F().A0a();
    }

    public final String A1G() {
        if (this.A0a == null || TextUtils.isEmpty(this.A0a.A0E().A0b())) {
            return null;
        }
        return this.A0b.A0S(this.A0a.A0E().A0b());
    }

    public final List<W7> A1H() {
        if (this.A0a == null || !isAdLoaded()) {
            return null;
        }
        return this.A0a.A0H();
    }

    public final void A1I() {
        if (!C2T.A00(this.A0c.A01()).A0O(this.A0c, false)) {
            A0a();
            if (A0m[5].length() == 3) {
                throw new RuntimeException();
            }
            A0m[3] = "yREZ0BSYt8CSunaR9f1myx0zIAs3a5bO";
            return;
        }
        NE A01 = NF.A01(this.A0c, this.A0c.A09(), A1B(), this.A07);
        if (A01 == null) {
            A0a();
            return;
        }
        ((C1343aL) this.A07.getNativeAdLayoutApi()).A03(A01);
        A01.A0K();
    }

    public final void A1J(Drawable drawable) {
        this.A01 = drawable;
        A1e(drawable != null, true);
    }

    public final void A1K(View view) {
        this.A0i.add(view);
        view.setOnClickListener(this.A0F);
        view.setOnTouchListener(this.A0F);
        if (Build.VERSION.SDK_INT >= 18 && C0877Im.A16(view.getContext())) {
            view.setOnLongClickListener(this.A0F);
        }
    }

    public final void A1L(View view, ImageView imageView) {
        ArrayList arrayList = new ArrayList();
        A0o(arrayList, view);
        A0f(view, imageView, arrayList, true);
    }

    public final void A1M(View view, ImageView imageView, List<View> clickableViews) {
        A0f(view, imageView, clickableViews, true);
    }

    public final void A1N(View view, AdNativeComponentView adNativeComponentView) {
        ArrayList arrayList = new ArrayList();
        A0o(arrayList, view);
        A0f(view, adNativeComponentView, arrayList, false);
    }

    public final void A1O(View view, AdNativeComponentView adNativeComponentView, List<View> clickableViews) {
        A0f(view, adNativeComponentView, clickableViews, false);
    }

    public final void A1P(View view, AdNativeComponentView adNativeComponentView, List<View> clickableViews, boolean z10) {
        A0f(view, adNativeComponentView, clickableViews, z10);
    }

    public final void A1Q(View view, AdNativeComponentView adNativeComponentView, boolean z10) {
        List<View> clickableViews = new ArrayList<>();
        A0o(clickableViews, view);
        A0f(view, adNativeComponentView, clickableViews, z10);
    }

    public final void A1R(MediaView mediaView) {
        if (mediaView != null) {
            this.A0Y = true;
        }
    }

    public final void A1S(MediaView mediaView) {
        if (mediaView != null) {
            this.A0Z = true;
        }
    }

    public final void A1T(NativeAdBase nativeAdBase, NativeAdListener nativeAdListener) {
        if (nativeAdListener == null) {
            return;
        }
        A0m(new CN(nativeAdListener, nativeAdBase));
    }

    public final void A1U(NativeAdLayout nativeAdLayout) {
        this.A07 = nativeAdLayout;
    }

    public final void A1V(C1473cU c1473cU) {
        A0h(c1473cU, true);
        if (this.A0G != null && c1473cU.A0H() != null) {
            WG wg2 = new WG(this);
            for (W7 w7 : c1473cU.A0H()) {
                if (A0m[3].charAt(5) != 'B') {
                    throw new RuntimeException();
                }
                String[] strArr = A0m;
                strArr[0] = "7JUEXy8BV6wMe69mvRG8Hisl1h58kfsH";
                strArr[4] = "Ag7M0cktqfZPxcWhbEyn8XCMGlxm5ALn";
                w7.A0i(wg2);
            }
        }
    }

    public final void A1W(C1360ac c1360ac) {
        this.A0U = new WeakReference<>(c1360ac);
    }

    public final void A1X(JQ jq, String str, C6l c6l) {
        if (str == null) {
            this.A0c.A0E().A3B();
        } else {
            this.A0c.A0E().A3A();
        }
        this.A00 = System.currentTimeMillis();
        boolean z10 = this.A0j;
        String[] strArr = A0m;
        if (strArr[0].charAt(21) != strArr[4].charAt(21)) {
            String[] strArr2 = A0m;
            strArr2[0] = "knecuAJjZigTf7VsFCGhTGCW7dxKplKn";
            strArr2[4] = "uRrNlLGUJL1gxvEKewtOLFu1Ztix0dl1";
            if (z10) {
                AdSettings.IntegrationErrorMode A00 = AbstractC04791w.A00(this.A0c);
                String A0W = A0W(566, 30, 105);
                AdSettings.IntegrationErrorMode integrationErrorMode = AdSettings.IntegrationErrorMode.INTEGRATION_ERROR_CRASH_DEBUG_MODE;
                if (!integrationErrorMode.equals(A00)) {
                    C0894Jg c0894Jg = new C0894Jg(AdErrorType.LOAD_AD_CALLED_MORE_THAN_ONCE, A0W(566, 30, 105));
                    A11().A0E().A38(C0956Lu.A01(this.A00), c0894Jg.A03().getErrorCode(), c0894Jg.A04());
                    if (this.A0G != null) {
                        this.A0G.ABs(c0894Jg);
                    } else {
                        Log.e(A0W(76, 17, 41), A0W);
                    }
                    C8F c8f = new C8F(A0W);
                    A11().A07().AA0(A0W(550, 3, 101), C8E.A0c, c8f);
                } else {
                    throw new AnonymousClass21(A0W);
                }
            }
            this.A0j = true;
            this.A0E = jq;
            if (jq.equals(JQ.A05)) {
                AnonymousClass12 anonymousClass12 = AnonymousClass12.A05;
                if (A0m[3].charAt(5) == 'B') {
                    A0m[3] = "N11XMBa1eBkGGouoRChlRsXEwEtHvHDZ";
                    this.A08 = anonymousClass12;
                }
            }
            this.A0C = c6l;
            C04761t c04761t = new C04761t(this.A0g, this.A0J, A0R(), null, 1, new C1424bh());
            c04761t.A05(jq);
            c04761t.A06(this.A0S);
            c04761t.A07(this.A0T);
            this.A0A = new C0798Fh(this.A0c, c04761t);
            this.A0A.A0R(new WH(this));
            this.A0A.A0V(str);
            return;
        }
        throw new RuntimeException();
    }

    public final void A1Y(JW jw) {
        this.A0H = jw;
    }

    public final void A1Z(JX jx) {
        this.A0I = jx;
    }

    public final void A1a(EnumC0898Jl enumC0898Jl) {
        if (!A0q()) {
            if (EnumC0898Jl.A05.equals(enumC0898Jl)) {
                this.A0c.A0E().A3E(AdPlacementType.NATIVE_BANNER.toString(), this.A0g);
            } else {
                this.A0c.A0E().A3E(AdPlacementType.NATIVE.toString(), this.A0g);
            }
        }
        this.A0J = enumC0898Jl;
    }

    public final void A1b(AbstractC1101Rj abstractC1101Rj) {
        this.A0V = new WeakReference<>(abstractC1101Rj);
    }

    public final void A1c(boolean z10) {
        this.A0W = z10;
    }

    public final void A1d(boolean z10) {
        this.A0X = z10;
    }

    public final void A1e(boolean z10, boolean z11) {
        String A0W;
        if (z10) {
            if (this.A0E.equals(JQ.A05)) {
                boolean A0q = A0q();
                if (A0m[3].charAt(5) != 'B') {
                    throw new RuntimeException();
                }
                String[] strArr = A0m;
                strArr[6] = "maLBxQjysuwmJ75m3YPaJDHU5JlBu";
                strArr[1] = "hXXEi4DazsshJWFEyRiAh7tUxgC1d";
                if (!A0q && this.A0G != null) {
                    this.A0G.ACg();
                }
            }
            if (this.A0R != null) {
                this.A0R.A0U();
                this.A0e.A09();
                return;
            }
            return;
        }
        if (this.A0R != null) {
            C1473cU adapter = A0y();
            if (adapter != null) {
                A0W = adapter.A0G();
            } else if (A0m[5].length() != 3) {
                String[] strArr2 = A0m;
                strArr2[2] = "2ETmOz1YodPf8MKRGGB9YcIoy7FDTpAq";
                strArr2[7] = "k5VZ8yDbY0Zqj8FxkeEerY08JJe7M6tR";
                A0W = A0W(0, 0, 121);
            } else {
                String[] strArr3 = A0m;
                strArr3[0] = "JjUCnZOckAfeDcKZajvIf0dyi7sruRRg";
                strArr3[4] = "GlO3j5qd4HFQ8L5mPWBpkp3onxgG8Q98";
                A0W = A0W(0, 0, 121);
            }
            this.A0e.A0C(this.A0c, A0W);
            this.A0R.A0V();
        }
        if (this.A0G != null && z11) {
            C0894Jg A01 = C0894Jg.A01(AdErrorType.BROKEN_MEDIA_ERROR, A0W(93, 21, 47));
            A11().A0E().A38(C0956Lu.A01(this.A00), A01.A03().getErrorCode(), A01.A04());
            this.A0G.ABs(A01);
        }
    }

    public final boolean A1f() {
        return this.A07 == null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0891Jc
    public final int A70() {
        View view = this.A06;
        if (view instanceof AdNativeComponentView) {
            View videoView = ((AdNativeComponentView) view).getAdContentsView();
            if (videoView instanceof C1081Qp) {
                return ((C1081Qp) videoView).getCurrentPosition();
            }
            return -1;
        }
        return -1;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final NativeAdBase.NativeAdLoadConfigBuilder buildLoadAdConfig(NativeAdBase nativeAdBase) {
        return new C0889Ja(this, nativeAdBase);
    }

    @Override // com.facebook.ads.Ad
    public final void destroy() {
        AbstractC0907Ju.A05(A0W(553, 7, 95), A0W(363, 19, 11), A0W(13, 8, 68));
        if (C0877Im.A1p(this.A0c)) {
            A11().A0A().AHC(this.A03);
        }
        if (!A0q()) {
            this.A0c.A0E().A3F();
        }
        if (this.A0A != null) {
            this.A0A.A0X(true);
            this.A0A.A0J();
            this.A0A = null;
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void downloadMedia() {
        if (this.A0E.equals(JQ.A05)) {
            this.A08 = AnonymousClass12.A04;
        }
        this.A0E = JQ.A04;
        A0h(this.A0a, false);
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdBodyText() {
        return A0G(true).A0I();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdCallToAction() {
        return A0G(true).A0W();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdChoicesImageUrl() {
        if (getAdChoicesIcon() == null) {
            return null;
        }
        return getAdChoicesIcon().getUrl();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdChoicesLinkUrl() {
        return A0F().A0J();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdChoicesText() {
        return A0F().A0K();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdHeadline() {
        return A0G(true).A0L();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdLinkDescription() {
        return A0G(true).A0M();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdSocialContext() {
        return A0G(true).A0Q();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdTranslation() {
        return A0G(true).A0T();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdUntrimmedBodyText() {
        return A0G(true).A0U();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdvertiserName() {
        return A0G(true).A0V();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final float getAspectRatio() {
        JU nativeAdImage;
        if (this.A0a == null || (nativeAdImage = this.A0a.A0E().A0E()) == null) {
            return 0.0f;
        }
        int width = nativeAdImage.getWidth();
        int height = nativeAdImage.getHeight();
        if (height > 0) {
            float f10 = width;
            float f11 = height;
            String[] strArr = A0m;
            if (strArr[0].charAt(21) != strArr[4].charAt(21)) {
                A0m[3] = "OUTl4BjdLTzCi4kmpI6eA9pKBM08eKMp";
                return f10 / f11;
            }
            throw new RuntimeException();
        }
        return 0.0f;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getId() {
        if (!isAdLoaded()) {
            return null;
        }
        return this.A0h;
    }

    @Override // com.facebook.ads.Ad
    public final String getPlacementId() {
        return this.A0g;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final Drawable getPreloadedIconViewDrawable() {
        JU A0F;
        Bitmap A0M;
        C1473cU adapter = this.A0a;
        if (adapter != null && (A0F = A0F().A0F()) != null && (A0M = this.A0b.A0M(A0F.getUrl())) != null) {
            return A05(A11(), A0M, A1f(), A1C());
        }
        return null;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getPromotedTranslation() {
        return A0G(true).A0P();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getSponsoredTranslation() {
        return A0G(true).A0R();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final boolean hasCallToAction() {
        return this.A0a != null && this.A0a.A0Q();
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        boolean z10 = true;
        if (this.A0A != null) {
            C0798Fh c0798Fh = this.A0A;
            String[] strArr = A0m;
            if (strArr[6].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0m;
            strArr2[2] = "gqyuy6F7WThaJUOfAsIyr4sziGGBhw0f";
            strArr2[7] = "L6lbko7Rv34huPFym8TvMBezY1vQkdWf";
            z10 = c0798Fh.A0Y();
        } else if (this.A0B != null) {
            z10 = this.A0B.A0A();
        }
        this.A0c.A0E().A5E(z10);
        return z10;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final boolean isAdLoaded() {
        return this.A0a != null && this.A0a.A0R();
    }

    @Override // com.facebook.ads.Ad
    public final void loadAd() {
        AbstractC0907Ju.A05(A0W(560, 6, 117), A0W(382, 24, 27), A0W(5, 8, 76));
        A1X(JQ.A00(NativeAdBase.MediaCacheFlag.ALL), null, new C6l(false, -1, -1));
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void loadAd(NativeAdBase.NativeLoadAdConfig nativeLoadAdConfig) {
        AbstractC0907Ju.A05(A0W(560, 6, 117), A0W(382, 24, 27), A0W(21, 8, 17));
        ((C0889Ja) nativeLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void onCtaBroadcast() {
        if (this.A05 != null) {
            this.A05.performClick();
        }
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th2) {
        if (this.A04 != null) {
            this.A04.post(new WI(this));
        }
        String str = A0W(164, 16, 48) + AbstractC0947Ll.A03(this.A0c, th2);
        A11().A0E().A38(C0956Lu.A01(this.A00), AdError.INTERNAL_ERROR_CODE, str);
        if (this.A0G != null) {
            this.A0G.ABs(new C0894Jg((int) AdError.INTERNAL_ERROR_CODE, str));
        }
    }

    @Override // com.facebook.ads.Ad
    public final void setExtraHints(ExtraHints extraHints) {
        if (extraHints == null) {
            return;
        }
        A0n(extraHints.getHints());
        this.A0T = extraHints.getMediationData();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.A02 = onTouchListener;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void unregisterView() {
        QS qs = this.A0N;
        if (qs != null) {
            ViewParent parent = qs.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(qs);
            }
            this.A0N = null;
        }
        if (this.A04 == null || this.A06 == null) {
            return;
        }
        if (!A0q()) {
            C0S A0E = this.A0c.A0E();
            String[] strArr = A0m;
            if (strArr[0].charAt(21) != strArr[4].charAt(21)) {
                A0m[3] = "w9n8TBisrss8zAM8EiwpgeUnlq2PaQ6F";
                A0E.unregisterView();
            }
            throw new RuntimeException();
        }
        if (C0877Im.A1p(this.A0c)) {
            A11().A0A().AHC(this.A03);
        }
        if (A0o.containsKey(this.A04) && A0o.get(this.A04).get() == this) {
            View view = this.A04;
            String[] strArr2 = A0m;
            if (strArr2[2].charAt(3) != strArr2[7].charAt(3)) {
                String[] strArr3 = A0m;
                strArr3[6] = "1kkuB6xtwDeF3EtU3aavEsH64nQcK";
                strArr3[1] = "rb6NM7K87kMKFcLdVL5rugEXgDuZd";
                if ((view instanceof ViewGroup) && this.A0K != null) {
                    ((ViewGroup) this.A04).removeView(this.A0K);
                    this.A0K = null;
                }
                if (this.A0a != null) {
                    this.A0a.A0J();
                }
                if (Build.VERSION.SDK_INT >= 18 && this.A0L != null) {
                    C1314Zs c1314Zs = this.A0c;
                    String[] strArr4 = A0m;
                    if (strArr4[6].length() == strArr4[1].length()) {
                        String[] strArr5 = A0m;
                        strArr5[0] = "4gE9LeNlQroHqEeWf1EzJsbNX9PRfDme";
                        strArr5[4] = "TBDkrxJbHtSaZ13hkNs0RNY8SzE0jpKy";
                        if (C0877Im.A16(c1314Zs)) {
                            this.A0L.A07();
                            this.A04.getOverlay().remove(this.A0L);
                        }
                    }
                }
                A0o.remove(this.A04);
                A0Z();
                this.A04 = null;
                this.A06 = null;
                if (this.A0R != null) {
                    this.A0R.A0V();
                    this.A0R = null;
                }
                A0c();
                this.A09 = null;
                return;
            }
            throw new RuntimeException();
        }
        throw new IllegalStateException(A0W(481, 38, 57));
    }
}
