package com.facebook.ads.redexgen.X;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.util.Arrays;
import lib.zj.office.fc.hpsf.Constants;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: assets/audience_network.dex */
public final class JE {
    public static byte[] A01;
    public static String[] A02 = {"am7j6uScRjgCcPqqGN06IL2NdGqCY6Pl", "w2ZRrlRUUsiRMX9SKs", "YXk4XDe5B5k7k4iyVx", "HQJJvXTTm7JfU3rwkPa2kdaJgQaSJ1wQ", "CAcSGcaxdMqfnhSDV62pp9c6tORR9BLO", "RFt9Cff9se89ZLPQ3aPSv6xdx8CuSNuI", "50wRnqLOESyReC73zJKGvVAEIeXW1ukc", "sHFX2DnzluM9Fq3mqMt8R8eeRnZzCLqn"};
    public static final /* synthetic */ JE[] A03;
    public static final JE A04;
    public static final JE A05;
    public static final JE A06;
    public static final JE A07;
    public static final JE A08;
    public static final JE A09;
    public static final JE A0A;
    public static final JE A0B;
    public static final JE A0C;
    public static final JE A0D;
    public static final JE A0E;
    public static final JE A0F;
    public static final JE A0G;
    public static final JE A0H;
    public static final JE A0I;
    public static final JE A0J;
    public static final JE A0K;
    public static final JE A0L;
    public static final JE A0M;
    public static final JE A0N;
    public static final JE A0O;
    public static final JE A0P;
    public static final JE A0Q;
    public static final JE A0R;
    public static final JE A0S;
    public static final JE A0T;
    public static final JE A0U;
    public static final JE A0V;
    public static final JE A0W;
    public static final JE A0X;
    public static final JE A0Y;
    public static final JE A0Z;
    public static final JE A0a;
    public static final JE A0b;
    public static final JE A0c;
    public static final JE A0d;
    public static final JE A0e;
    public static final JE A0f;
    public static final JE A0g;
    public static final JE A0h;
    public static final JE A0i;
    public static final JE A0j;
    public static final JE A0k;
    public static final JE A0l;
    public static final JE A0m;
    public static final JE A0n;
    public static final JE A0o;
    public static final JE A0p;
    public static final JE A0q;
    public static final JE A0r;
    public static final JE A0s;
    public static final JE A0t;
    public static final JE A0u;
    public static final JE A0v;
    public static final JE A0w;
    public static final JE A0x;
    public final String A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 76);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-17, -14, -17, -2, 2, -13, 0, 13, 2, -9, -5, -13, -3, 3, 2, -111, -108, -81, -109, -104, -97, -103, -109, -107, -93, -81, -109, -100, -103, -109, -101, -107, -108, -90, -87, -60, -88, -79, -76, -72, -86, -87, -82, -79, -52, -80, -71, -68, -64, -78, -52, -80, -71, -74, -80, -72, -78, -79, -101, -98, -71, -90, -87, -101, -98, -97, -98, -71, -99, -101, -90, -90, -100, -101, -99, -91, -75, -72, -45, -58, -71, -60, -61, -58, -56, -71, -72, -62, -59, -32, -45, -58, -47, -48, -45, -43, -32, -60, -51, -54, -60, -52, -58, -59, -27, -24, 3, -10, -23, -12, -13, -10, -8, 3, -15, -27, -14, -27, -21, -23, 3, -12, -10, -23, -22, -9, 3, -25, -16, -19, -25, -17, -23, -24, -97, -94, -67, -80, -93, -82, -83, -80, -78, -67, -75, -90, -73, -67, -79, -93, -93, -89, -84, -91, -67, -78, -90, -89, -79, -67, -95, -86, -89, -95, -87, -93, -94, -52, -49, -22, -35, -48, -34, -37, -38, -39, -34, -48, -22, -35, -48, -50, -48, -44, -31, -48, -49, -61, -46, -46, -31, -49, -47, -40, -57, -58, -31, -42, -47, -31, -60, -61, -59, -51, -55, -44, -47, -41, -48, -58, -104, -89, -89, -74, -87, -100, -85, -84, -87, -91, -100, -101, -74, -85, -90, -74, -99, -90, -87, -100, -98, -87, -90, -84, -91, -101, -40, -42, -40, -35, -38, -12, -37, -42, -34, -31, -22, -25, -38, -78, -80, -78, -73, -76, -50, -62, -60, -78, -78, -76, -62, -62, -10, -1, -4, -10, -2, -6, 8, -12, 5, -9, 18, -10, -1, -4, -10, -2, -64, -47, -66, -36, -64, -55, -58, -64, -56, -62, -63, -92, -91, -74, -87, -93, -91, -65, -78, -81, -76, -95, -76, -91, -92, -45, -30, -37, -18, -44, -27, -48, -37, -28, -48, -29, -44, -18, -39, -30, -25, -10, -17, 2, -20, -15, -9, -11, -14, 2, -28, -15, -20, -16, -28, -9, -20, -14, -15, 2, -24, -15, -25, -24, -25, -91, -76, -83, -64, -85, -76, -64, -90, -77, -77, -80, -77, -102, -87, -94, -75, -87, -101, -86, -75, -85, -88, -94, -6, 9, 2, 21, 10, 8, -9, 4, 9, -4, 5, 8, 3, 21, -9, 9, 9, -5, 10, 9, -93, -78, -85, -66, -74, -92, -95, -66, -75, -88, -92, -74, -66, -92, -79, -79, -82, -79, 10, 25, 18, Field.PAGEREF, 29, 11, 8, Field.PAGEREF, Field.NUMCHARS, 15, 11, 29, Field.PAGEREF, 18, 21, 7, 10, 11, 10, -109, -100, -110, -83, -111, -113, -96, -110, -83, -95, -106, -99, -91, -100, -8, -4, -1, 1, -12, 2, 2, -8, -2, -3, -80, -75, -69, -71, -74, -58, -86, -88, -71, -85, -58, -70, -81, -74, -66, -75, 13, 6, 20, 20, 32, 20, 21, 19, 10, 4, 21, 32, 20, 6, 4, 16, 15, 5, 32, 4, 9, 2, 15, 15, 6, 13, 32, 10, 14, 17, 19, 6, 20, 20, 10, 16, 15, 7, 4, 9, 6, 26, -2, 7, 4, -2, 6, -75, -88, -67, -80, -82, -88, -69, -80, -74, -75, -7, -16, -16, 9, -2, -21, -4, -15, -17, -2, 9, -19, -10, -13, -19, -11, -6, -21, -19, -11, -21, -15, -17, 9, -21, -10, -4, -17, -21, -18, 3, 9, -13, -8, -3, -2, -21, -10, -10, -17, -18, 9, -4, -17, 1, -21, -4, -18, 9, -15, -4, -21, -8, -2, -17, -18, -46, -61, -59, -51, -61, -55, -57, -31, -53, -48, -43, -42, -61, -50, -50, -57, -58, -31, -44, -57, -39, -61, -44, -58, -31, -55, -44, -61, -48, -42, -57, -58, 8, 4, -7, 17, -7, -6, 4, -3, 23, -5, 12, -7, 23, -5, 4, 1, -5, 3, -3, -4, -9, -7, -20, 6, -7, -20, -2, -24, -7, -21, 6, -22, -5, -24, 6, -22, -13, -16, -22, -14, -20, -21, -78, -76, -89, -63, -76, -89, -71, -93, -76, -90, -63, -75, -86, -79, -71, -80, -3, -1, -14, 12, -1, -14, 4, -18, -1, -15, 12, 4, -18, 1, -16, -11, 12, -6, -18, -10, -5, 12, -18, -15, 12, -16, -7, -10, -16, -8, -14, -15, -25, -38, -20, -42, -25, -39, -12, -40, -28, -29, -21, -38, -25, -24, -34, -28, -29, -12, -36, -25, -42, -29, -23, -38, -39, -69, -83, -85, -73, -74, -84, -57, -85, -80, -87, -74, -74, -83, -76, -57, -79, -75, -72, -70, -83, -69, -69, -79, -73, -74, -77, -91, -93, -81, -82, -92, -65, -93, -88, -95, -82, -82, -91, -84, -65, -74, -87, -92, -91, -81, 21, 10, 17, 25, 33, 3, 6, 33, 5, 3, 14, 14, 7, 6, 1, -3, 3, -4, -14, 13, -16, 3, 2, 2, -3, -4, 13, -2, 0, -13, 1, 1, -13, -14, -64, -68, -62, -69, -79, -52, -68, -77, -77, 13, 9, 15, 8, -2, 25, 9, 8, -93, -92, -97, -94, -107, -81, -109, -100, -103, -109, -101, -64, -60, -74, -67, -78, -52, -63, -68, -52, -80, -71, -74, -80, -72, -33, -30, -38, -22, -34, -33, -48, -37, -22, -50, -52, -39, -50, -48, -41, -22, -50, -41, -44, -50, -42, -19, -16, -24, -8, -20, -19, -34, -23, -8, -36, -27, -30, -36, -28, 10, -3, -8, -7, 3, 19, -9, 3, 1, 4, 0, -7, 8, -7, -8, -25, -38, -43, -42, -32, -16, -42, -29, -29, -32, -29, -19, -32, -37, -36, -26, -10, -32, -37, -29, -36, -25, -38, -43, -42, -32, -16, -31, -46, -26, -28, -42, -43, 16, 3, -2, -1, 9, 25, 10, 6, -5, 19, -23, -36, -41, -40, -30, -14, -29, -33, -44, -20, -14, -29, -44, -24, -26, -40, -14, -42, -33, -36, -42, -34, -40, -41, -48, -61, -66, -65, -55, -39, -54, -52, -65, -54, -69, -52, -65, -66, -90, -103, -108, -107, -97, -81, -93, -101, -103, -96, -81, -109, -100, -103, -109, -101, -107, -108, -39, -36, -41, -37, -32, -25, -31, 
        -37, -35, -21, -41, -37, -28, -31, -37, -29, -35, -36, -23, -20, -25, -21, -12, -9, -5, -19, -25, -21, -12, -15, -21, -13, -19, -20, -52, -49, -54, -50, -41, -38, -34, -48, -49, Field.DATA, 43, Field.ASK, Field.MACROBUTTON, Field.AUTONUM, Field.DATA, 43, 44, 43, Field.ASK, 42, Field.DATA, Field.MACROBUTTON, Field.MACROBUTTON, 41, Field.DATA, 42, Field.GOTOBUTTON, -29, -26, -31, -12, -25, -14, -15, -12, -10, -31, -27, -18, -21, -27, -19, -25, -26, -2, 1, -4, 15, 2, 13, 12, 15, 17, -4, 10, -2, 11, -2, 4, 2, -4, 13, 15, 2, 3, 16, -4, 0, 9, 6, 0, 8, 2, 1, -4, -1, -6, 13, 0, 11, 10, 13, 15, -6, 18, 3, 20, -6, 14, 0, 0, 4, 9, 2, -6, 15, 3, 4, 14, -6, -2, 7, 4, -2, 6, 0, -1, 14, 17, 12, 31, 18, 29, Field.NUMCHARS, 31, 33, 18, 17, -17, -14, -19, 0, -13, 1, -2, -3, -4, 1, -13, -19, 0, -13, -15, -13, -9, 4, -13, -14, -6, -3, -6, 9, 13, -2, 11, -8, 13, 2, 6, -2, 8, 14, 13, 30, Field.DDE, Field.DDE, Field.NUMCHARS, 42, 44, Field.MACROBUTTON, 34, 33, Field.NUMCHARS, Field.EQ, 44, Field.NUMCHARS, 31, 30, 32, Field.DATA, 36, Field.GLOSSARY, 44, Field.GOTOBUTTON, 43, 33, 42, Field.SYMBOL, Field.SYMBOL, Field.DATA, 59, Field.DDEAUTO, 61, Field.USERADDRESS, 59, Field.IMPORT, Field.DDEAUTO, Field.DDE, Field.DATA, 61, 56, Field.DATA, Field.GLOSSARY, 56, 59, Field.DDEAUTO, 48, 59, 56, Field.USERADDRESS, Field.IMPORT, Field.DDE, 30, Field.NUMCHARS, 30, Field.QUOTE, 32, 26, 33, Field.NUMCHARS, 36, Field.FILLIN, 48, Field.DDE, 32, Field.FILLIN, Field.PAGEREF, Field.FILLIN, 44, 41, Field.QUOTE, Field.IMPORT, Field.SYMBOL, Field.FILLIN, Field.FILLIN, 41, Field.IMPORT, Field.IMPORT, -59, -50, -53, -59, -51, -55, -41, -61, -44, -58, -63, -59, -50, -53, -59, -51, -16, 1, -18, -20, -16, -7, -10, -16, -8, -14, -15, -65, -64, -47, -60, -66, -64, -70, -51, -54, -49, -68, -49, -64, -65, 36, Field.MACROBUTTON, 44, 31, Field.PAGEREF, Field.AUTONUM, 33, 44, Field.AUTONUMLGL, 33, Field.AUTONUMOUT, Field.PAGEREF, 31, 42, 33, Field.AUTONUM, 33, Field.MACROBUTTON, Field.QUOTE, Field.GOTOBUTTON, 41, 48, Field.AUTONUMOUT, -77, -62, -69, -82, -72, -67, -61, -63, -66, -82, -80, -67, -72, -68, -80, -61, -72, -66, -67, -82, -76, -67, -77, -76, -77, -32, -17, -24, -37, -26, -17, -37, -31, -18, -18, -21, -18, -28, -13, -20, -33, -13, -27, -12, -33, -11, -14, -20, Field.DDEAUTO, 61, Field.AUTONUM, 41, Field.USERADDRESS, 60, 43, 56, 61, 48, Field.SYMBOL, 60, Field.IMPORT, 41, 43, 61, 61, Field.GLOSSARY, Field.USERADDRESS, 61, 6, 21, 14, 1, 25, 7, 4, 1, 24, 11, 7, 25, 1, 7, 20, 20, 17, 20, -25, -10, -17, -30, -6, -24, -27, -30, -7, -20, -24, -6, -30, -17, -14, -28, -25, -24, -25, -7, 2, -8, -13, -9, -11, 6, -8, -13, 7, -4, 3, 11, 2, -48, -44, -41, -39, -52, -38, -38, -48, -42, -43, -67, -62, -56, -58, -61, -77, -73, -75, -58, -72, -77, -57, -68, -61, -53, -62, -32, -39, -25, -25, -45, -25, -24, -26, -35, -41, -24, -45, -25, -39, -41, -29, -30, -40, -45, -41, -36, -43, -30, -30, -39, -32, -45, -35, -31, -28, -26, -39, -25, -25, -35, -29, -30, 32, 29, 34, 31, 19, 23, 32, 29, 23, 31, 21, 8, 29, 16, 14, 8, Field.NUMWORDS, 16, 22, 21, -20, -29, -29, -36, -15, -34, -17, -28, -30, -15, -36, -32, -23, -26, -32, -24, -33, -48, -46, -38, -48, -42, -44, -50, -48, -37, -31, -44, -48, -45, -24, -50, -40, -35, -30, -29, -48, -37, -37, -44, -45, -50, -31, -44, -26, -48, -31, -45, -50, -42, -31, -48, -35, -29, -44, -45, Field.SYMBOL, 42, 44, Field.AUTONUMOUT, 42, 48, Field.DDEAUTO, Field.DATA, Field.GOTOBUTTON, Field.IMPORT, 60, 61, 42, Field.AUTONUMLGL, Field.AUTONUMLGL, Field.DDEAUTO, Field.DDE, Field.DATA, 59, Field.DDEAUTO, 64, 42, 59, Field.DDE, Field.DATA, 48, 59, 42, Field.IMPORT, 61, Field.DDEAUTO, Field.DDE, 8, 4, -7, 17, -7, -6, 4, -3, -9, -5, 12, -7, -9, -5, 4, 1, -5, 3, -3, -4, 17, 19, 6, 0, 19, 6, 24, 2, 19, 5, 0, 4, 21, 2, 0, 4, 13, 10, 4, 12, 6, 5, 48, Field.GOTOBUTTON, Field.PAGEREF, 31, Field.GOTOBUTTON, Field.PAGEREF, Field.IMPORT, 33, Field.GOTOBUTTON, 36, 31, Field.MACROBUTTON, Field.DATA, Field.GLOSSARY, Field.IMPORT, Field.DDEAUTO, Field.DDE, Field.GLOSSARY, 34, Field.NUMCHARS, Field.GLOSSARY, 34, Field.AUTONUMOUT, 30, Field.GLOSSARY, 33, Field.NUMCHARS, Field.AUTONUMOUT, 30, Field.EQ, 32, Field.PAGEREF, Field.NUMCHARS, 42, 30, Field.ASK, 43, Field.NUMCHARS, 30, 33, Field.NUMCHARS, 32, 41, Field.ASK, 32, Field.DATA, 34, 33, -39, -52, -34, -56, -39, -53, -58, -54, -42, -43, -35, -52, -39, -38, -48, -42, -43, -58, -50, -39, -56, -43, -37, -52, -53, 14, 0, -2, 10, 9, -1, -6, -2, 3, -4, 9, 9, 0, 7, -6, 4, 8, 11, 13, 0, 14, 14, 4, 10, 9, -10, -24, -26, -14, -15, -25, -30, -26, -21, -28, -15, -15, -24, -17, -30, -7, -20, -25, -24, -14, -56, -67, -60, -52, -76, -74, -71, -76, -72, -74, -63, -63, -70, -71, 11, 7, 13, 6, -4, -9, -6, 12, 6, -9, 8, 10, -3, 11, 11, -3, -4, Field.DATA, 36, 42, Field.QUOTE, 25, 20, 36, Field.NUMWORDS, Field.NUMWORDS, -24, -28, -22, -29, -39, -44, -28, -29, 8, 9, 4, 7, -6, -12, -8, 1, -2, -8, 0, Field.AUTONUMLGL, Field.SYMBOL, 43, Field.GOTOBUTTON, Field.FILLIN, 33, Field.AUTONUM, Field.EQ, 33, Field.PAGEREF, Field.DDEAUTO, 43, Field.PAGEREF, Field.DDE, Field.DATA, 43, Field.QUOTE, 19, Field.FILLIN, Field.DATA, 25, 36, 19, 23, 21, 34, 23, 25, 32, 19, 23, 32, 29, 23, 31, Field.USERADDRESS, Field.SECTION, Field.SYMBOL, 41, 61, Field.USERADDRESS, Field.GLOSSARY, 58, 41, Field.DDE, Field.AUTONUM, Field.MACROBUTTON, Field.DDE, Field.AUTONUMLGL, -54, -67, -72, -71, -61, -77, -73, -61, -63, -60, -64, -71, -56, -71, -72, -1, -14, -19, -18, -8, -24, -18, -5, -5, -8, -5, 64, Field.MACROBUTTON, Field.DDEAUTO, Field.GLOSSARY, Field.SYMBOL, 41, Field.MACROBUTTON, Field.DDEAUTO, Field.AUTONUM, Field.GLOSSARY, Field.PAGEREF, 24, 19, 20, 30, 14, 31, 16, 36, 34, 20, 19, -41, -54, -59, -58, -48, -64, -47, -51, -62, -38, -37, -50, -55, -54, -44, -60, -43, -47, -58, -34, -60, -43, -58, -38, -40, -54, -60, -56, -47, -50, -56, -48, -54, -55, -36, -49, -54, -53, -43, -59, -42, -40, -53, -42, -57, -40, -53, -54, 5, -8, -13, -12, -2, -18, 2, -6, -8, -1, -18, -14, -5, -8, -14, -6, -12, -13};
    }

    static {
        A01();
        A0D = new JE(A00(ShapeTypes.ACTION_BUTTON_END, 20, 63), 0, A00(1145, 20, 66));
        A08 = new JE(A00(58, 18, 14), 1, A00(1036, 18, 123));
        A04 = new JE(A00(0, 15, 98), 2, A00(1165, 15, 77));
        A0H = new JE(A00(249, 13, 35), 3, A00(1242, 13, 120));
        A0G = new JE(A00(236, 13, 73), 4, A00(1229, 13, 111));
        A0i = new JE(A00(768, 14, 118), 5, A00(1769, 14, 9));
        A0T = new JE(A00(437, 10, 99), 6, A00(1438, 10, 27));
        A0g = new JE(A00(723, 25, 28), 7, A00(1724, 25, 79));
        A0h = new JE(A00(748, 20, 20), 8, A00(1749, 20, 55));
        A0V = new JE(A00(463, 37, 117), 9, A00(1464, 37, 40));
        A06 = new JE(A00(33, 9, 25), 10, A00(1027, 9, 31));
        A07 = new JE(A00(42, 16, 33), 11, A00(1011, 16, 60));
        A0X = new JE(A00(510, 10, 27), 12, A00(1511, 10, 91));
        A0n = new JE(A00(830, 14, 33), 13, A00(1828, 14, 118));
        A0m = new JE(A00(819, 11, 4), 14, A00(1817, 11, 73));
        A0W = new JE(A00(OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM, 10, 111), 15, A00(1501, 10, 104));
        A0I = new JE(A00(262, 16, 103), 16, A00(Constants.CP_WINDOWS_1255, 16, 22));
        A0p = new JE(A00(865, 14, 77), 17, A00(1863, 14, 126));
        A0o = new JE(A00(844, 21, 63), 18, A00(1842, 21, 104));
        A0Y = new JE(A00(520, 16, 94), 19, A00(1521, 16, 49));
        A0J = new JE(A00(278, 11, 49), 20, A00(1271, 11, 65));
        A0b = new JE(A00(608, 20, 108), 21, A00(1609, 20, 76));
        A0U = new JE(A00(447, 16, 27), 22, A00(1448, 16, 8));
        A0S = new JE(A00(423, 14, 2), 23, A00(1424, 14, 72));
        A0w = new JE(A00(961, 14, 46), 24, A00(1959, 14, 26));
        A0r = new JE(A00(894, 11, 69), 25, A00(1892, 11, 61));
        A0q = new JE(A00(879, 15, 104), 26, A00(1877, 15, 8));
        A0s = new JE(A00(905, 10, 75), 27, A00(1903, 10, 126));
        A0u = new JE(A00(927, 10, 110), 28, A00(1925, 10, 21));
        A0t = new JE(A00(915, 12, 69), 29, A00(1913, 12, 99));
        A0v = new JE(A00(937, 24, 71), 30, A00(1935, 24, 25));
        A0l = new JE(A00(811, 8, 110), 31, A00(1809, 8, 41));
        A0k = new JE(A00(802, 9, 33), 32, A00(1800, 9, 105));
        A0j = new JE(A00(782, 20, 98), 33, A00(1783, 17, 76));
        A0x = new JE(A00(975, 18, 4), 34, A00(1973, 18, 67));
        A05 = new JE(A00(15, 18, 4), 35, A00(993, 18, 44));
        A0A = new JE(A00(87, 17, 53), 36, A00(1054, 17, 54));
        A0C = new JE(A00(ShapeTypes.FLOW_CHART_INPUT_OUTPUT, 33, 18), 37, A00(1101, 33, 79));
        A0B = new JE(A00(104, 30, 88), 38, A00(1071, 30, 81));
        A09 = new JE(A00(76, 11, 40), 39, A00(1134, 11, 97));
        A0E = new JE(A00(ShapeTypes.CHART_PLUS, 23, 54), 40, A00(1180, 23, 113));
        A0F = new JE(A00(210, 26, 11), 41, A00(1203, 26, 125));
        A0K = new JE(A00(289, 14, 20), 42, A00(1282, 14, 15));
        A0P = new JE(A00(366, 20, 106), 43, A00(1367, 20, 126));
        A0O = new JE(A00(355, 11, 10), 44, A00(1356, 11, 52));
        A0R = new JE(A00(TTAdConstant.DEEPLINK_FALLBACK_CODE, 19, 122), 45, A00(1405, 19, 55));
        A0M = new JE(A00(318, 25, 87), 46, A00(1319, 25, 3));
        A0L = new JE(A00(303, 15, 67), 47, A00(1296, 23, 116));
        A0Q = new JE(A00(386, 18, 19), 48, A00(1387, 18, 86));
        A0N = new JE(A00(343, 12, 21), 49, A00(1344, 12, 48));
        A0c = new JE(A00(628, 22, 91), 50, A00(1629, 22, 85));
        A0e = new JE(A00(TTAdConstant.STYLE_SIZE_RADIO_2_3, 32, 97), 51, A00(1667, 32, 113));
        A0a = new JE(A00(576, 32, 54), 52, A00(1577, 32, 125));
        A0Z = new JE(A00(536, 40, 94), 53, A00(1537, 40, 35));
        A0d = new JE(A00(650, 16, 22), 54, A00(1651, 16, 116));
        A0f = new JE(A00(698, 25, 73), 55, A00(1699, 25, 27));
        A03 = A02();
    }

    public JE(String str, int i10, String str2) {
        this.A00 = str2;
    }

    public static /* synthetic */ JE[] A02() {
        JE[] jeArr = new JE[56];
        jeArr[0] = A0D;
        jeArr[1] = A08;
        jeArr[2] = A04;
        jeArr[3] = A0H;
        jeArr[4] = A0G;
        jeArr[5] = A0i;
        jeArr[6] = A0T;
        jeArr[7] = A0g;
        jeArr[8] = A0h;
        jeArr[9] = A0V;
        jeArr[10] = A06;
        jeArr[11] = A07;
        jeArr[12] = A0X;
        jeArr[13] = A0n;
        jeArr[14] = A0m;
        jeArr[15] = A0W;
        jeArr[16] = A0I;
        jeArr[17] = A0p;
        jeArr[18] = A0o;
        jeArr[19] = A0Y;
        jeArr[20] = A0J;
        jeArr[21] = A0b;
        jeArr[22] = A0U;
        jeArr[23] = A0S;
        jeArr[24] = A0w;
        jeArr[25] = A0r;
        jeArr[26] = A0q;
        jeArr[27] = A0s;
        jeArr[28] = A0u;
        jeArr[29] = A0t;
        jeArr[30] = A0v;
        jeArr[31] = A0l;
        jeArr[32] = A0k;
        jeArr[33] = A0j;
        jeArr[34] = A0x;
        jeArr[35] = A05;
        jeArr[36] = A0A;
        jeArr[37] = A0C;
        jeArr[38] = A0B;
        jeArr[39] = A09;
        jeArr[40] = A0E;
        jeArr[41] = A0F;
        jeArr[42] = A0K;
        jeArr[43] = A0P;
        jeArr[44] = A0O;
        jeArr[45] = A0R;
        jeArr[46] = A0M;
        jeArr[47] = A0L;
        if (A02[0].charAt(23) != 'L') {
            A02[3] = "wMas9DWZ40J0dvpslMT24maZaRvhGZfF";
            jeArr[48] = A0Q;
            jeArr[49] = A0N;
            jeArr[50] = A0c;
            jeArr[51] = A0e;
            jeArr[52] = A0a;
            jeArr[53] = A0Z;
            jeArr[54] = A0d;
            jeArr[55] = A0f;
            return jeArr;
        }
        throw new RuntimeException();
    }

    public final String A03() {
        return this.A00;
    }

    public static JE valueOf(String str) {
        return (JE) Enum.valueOf(JE.class, str);
    }

    public static JE[] values() {
        return (JE[]) A03.clone();
    }
}
