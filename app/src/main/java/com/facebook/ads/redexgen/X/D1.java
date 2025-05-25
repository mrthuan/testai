package com.facebook.ads.redexgen.X;

import android.graphics.Point;
import android.text.TextUtils;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class D1 extends XB {
    public static byte[] A02;
    public static String[] A03 = {"Khlodgv4nm1JN7pvDudzhLshYnVFJMYj", "c7ah86gyOlUD", "JoZr7ruM8P1CDzAkdNZ", "HjL2B3NAdMNeR5iFqDiYNYNkxiWEx", "oQm2ks6hNiY41q9vro", "ayV7y67njefchB5PWBkMMUfanflb38Cr", "oO7X36UNtbffgy2V6l3ztlPOg46Wx", "Y52Q59EloTeftRYp1OS0iD4QyyXWfCYD"};
    public static final int[] A04;
    public final InterfaceC0823Gk A00;
    public final AtomicReference<DefaultTrackSelector$Parameters> A01;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static int A03(TrackGroup trackGroup, int[] iArr, int i10, String str, int i11, int i12, int i13, List<Integer> list) {
        int i14 = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            int intValue = list.get(i15).intValue();
            if (A0L(trackGroup.A01(intValue), str, iArr[intValue], i10, i11, i12, i13)) {
                i14++;
            }
        }
        return i14;
    }

    public static String A0C(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A0E() {
        A02 = new byte[]{7, Field.NUMCHARS, 22};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static void A0F(TrackGroup trackGroup, int[] iArr, int i10, String str, int i11, int i12, int i13, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = list.get(size).intValue();
            if (!A0L(trackGroup.A01(intValue), str, iArr[intValue], i10, i11, i12, i13)) {
                list.remove(size);
            }
        }
    }

    static {
        A0E();
        A04 = new int[0];
    }

    public D1() {
        this(null);
    }

    public D1(InterfaceC0823Gk interfaceC0823Gk) {
        this.A00 = interfaceC0823Gk;
        this.A01 = new AtomicReference<>(DefaultTrackSelector$Parameters.A0J);
    }

    public static int A00(int i10, int i11) {
        if (i10 == -1) {
            return i11 == -1 ? 0 : -1;
        } else if (i11 == -1) {
            return 1;
        } else {
            return i10 - i11;
        }
    }

    public static int A01(int i10, int i11) {
        if (i10 > i11) {
            return 1;
        }
        return i11 > i10 ? -1 : 0;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A04(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup r4, int[] r5, com.facebook.ads.redexgen.X.C0816Gb r6) {
        /*
            r3 = 0
            r2 = 0
        L2:
            int r0 = r4.A01
            if (r2 >= r0) goto L17
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r1 = r4.A01(r2)
            r0 = r5[r2]
            boolean r0 = A0J(r1, r0, r6)
            if (r0 == 0) goto L14
            int r3 = r3 + 1
        L14:
            int r2 = r2 + 1
            goto L2
        L17:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.D1.A04(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup, int[], com.facebook.ads.redexgen.X.Gb):int");
    }

    public static Point A05(boolean z10, int tempViewportWidth, int i10, int i11, int i12) {
        if (z10) {
            if ((i11 > i12) != (tempViewportWidth > i10)) {
                tempViewportWidth = i10;
                i10 = tempViewportWidth;
            }
        }
        if (i11 * i10 >= i12 * tempViewportWidth) {
            return new Point(tempViewportWidth, IK.A04(tempViewportWidth * i12, i11));
        }
        return new Point(IK.A04(i10 * i11, i12), i10);
    }

    private final C0734Ci A06(int i10, TrackGroupArray trackGroupArray, int[][] iArr, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) throws C06589h {
        TrackGroup trackGroup = null;
        int trackIndex = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < trackGroupArray.A01; i12++) {
            TrackGroup trackGroup2 = trackGroupArray.A01(i12);
            int[] iArr2 = iArr[i12];
            for (int groupIndex = 0; groupIndex < trackGroup2.A01; groupIndex++) {
                if (A0H(iArr2[groupIndex], defaultTrackSelector$Parameters.A0B)) {
                    int selectedTrackScore = (trackGroup2.A01(groupIndex).A0D & 1) != 0 ? 2 : 1;
                    boolean isDefault = A0H(iArr2[groupIndex], false);
                    String[] strArr = A03;
                    if (strArr[6].length() != strArr[3].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A03;
                    strArr2[0] = "dNPOXoA5s2XMMA0mWcPJLidwRtPmHQYg";
                    strArr2[7] = "mpqhGybSHlFRTMufKuA4cMMwx1NmszYZ";
                    if (isDefault) {
                        selectedTrackScore += 1000;
                    }
                    if (selectedTrackScore > i11) {
                        trackGroup = trackGroup2;
                        trackIndex = groupIndex;
                        i11 = selectedTrackScore;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new C0734Ci(trackGroup, trackIndex);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
        if (r1 <= r21.A02) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b5, code lost:
        if (r15 < 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b7, code lost:
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d0, code lost:
        if (r15 < 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d3, code lost:
        r0 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x007c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.X.C0734Ci A07(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray r19, int[][] r20, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters r21) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.D1.A07(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray, int[][], com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters):com.facebook.ads.redexgen.X.Ci");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c7, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ab A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.facebook.ads.redexgen.X.C0734Ci A08(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray r18, int[][] r19, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters r20) throws com.facebook.ads.redexgen.X.C06589h {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.D1.A08(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray, int[][], com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters):com.facebook.ads.redexgen.X.Ci");
    }

    public static InterfaceC0824Gl A09(TrackGroupArray trackGroupArray, int[][] iArr, int i10, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, InterfaceC0823Gk interfaceC0823Gk) throws C06589h {
        int i11;
        if (defaultTrackSelector$Parameters.A0A) {
            i11 = 24;
        } else {
            i11 = 16;
        }
        boolean z10 = defaultTrackSelector$Parameters.A09 && (i10 & i11) != 0;
        for (int i12 = 0; i12 < trackGroupArray.A01; i12++) {
            TrackGroup A01 = trackGroupArray.A01(i12);
            int[] A0O = A0O(A01, iArr[i12], z10, i11, defaultTrackSelector$Parameters.A03, defaultTrackSelector$Parameters.A02, defaultTrackSelector$Parameters.A01, defaultTrackSelector$Parameters.A06, defaultTrackSelector$Parameters.A05, defaultTrackSelector$Parameters.A0F);
            if (A0O.length > 0) {
                return ((InterfaceC0823Gk) AbstractC0844Hf.A01(interfaceC0823Gk)).A5A(A01, A0O);
            }
        }
        return null;
    }

    /* JADX WARN: Incorrect condition in loop: B:11:0x0032 */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0006 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.facebook.ads.redexgen.X.InterfaceC0824Gl A0A(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray r11, int[][] r12, int r13, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters r14, com.facebook.ads.redexgen.X.InterfaceC0823Gk r15) throws com.facebook.ads.redexgen.X.C06589h {
        /*
            r10 = this;
            r3 = -1
            r4 = -1
            r7 = 0
            r6 = 0
        L4:
            int r0 = r11.A01
            if (r6 >= r0) goto L5a
            com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup r5 = r11.A01(r6)
            r9 = r12[r6]
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.D1.A03
            r0 = 0
            r1 = r2[r0]
            r0 = 7
            r2 = r2[r0]
            r0 = 30
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L28
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L28:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.D1.A03
            java.lang.String r1 = "5kgCAopkMsZg7F4ZV1xgY9"
            r0 = 4
            r2[r0] = r1
            r0 = 0
        L30:
            int r1 = r5.A01
            if (r0 >= r1) goto L57
            r2 = r9[r0]
            boolean r1 = r14.A0B
            boolean r1 = A0H(r2, r1)
            if (r1 == 0) goto L54
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r8 = r5.A01(r0)
            com.facebook.ads.redexgen.X.Gc r2 = new com.facebook.ads.redexgen.X.Gc
            r1 = r9[r0]
            r2.<init>(r8, r14, r1)
            if (r7 == 0) goto L51
            int r1 = r2.A00(r7)
            if (r1 <= 0) goto L54
        L51:
            r4 = r6
            r3 = r0
            r7 = r2
        L54:
            int r0 = r0 + 1
            goto L30
        L57:
            int r6 = r6 + 1
            goto L4
        L5a:
            r5 = -1
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.D1.A03
            r0 = 0
            r1 = r2[r0]
            r0 = 7
            r2 = r2[r0]
            r0 = 30
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L75
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L75:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.D1.A03
            java.lang.String r1 = "M5FLJD12PT3lmaOUQ9XFglzutSHDLZYg"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "9xRNKXhRIKwGRNoeZY9pf18L4ABxNHYN"
            r0 = 7
            r2[r0] = r1
            if (r4 != r5) goto L85
            r0 = 0
            return r0
        L85:
            com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup r2 = r11.A01(r4)
            boolean r0 = r14.A0D
            if (r0 != 0) goto L9f
            if (r15 == 0) goto L9f
            r1 = r12[r4]
            boolean r0 = r14.A09
            int[] r1 = A0N(r2, r1, r0)
            int r0 = r1.length
            if (r0 <= 0) goto L9f
            com.facebook.ads.redexgen.X.Gl r0 = r15.A5A(r2, r1)
            return r0
        L9f:
            com.facebook.ads.redexgen.X.Ci r0 = new com.facebook.ads.redexgen.X.Ci
            r0.<init>(r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.D1.A0A(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray, int[][], int, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters, com.facebook.ads.redexgen.X.Gk):com.facebook.ads.redexgen.X.Gl");
    }

    private final InterfaceC0824Gl A0B(TrackGroupArray trackGroupArray, int[][] iArr, int i10, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, InterfaceC0823Gk interfaceC0823Gk) throws C06589h {
        InterfaceC0824Gl interfaceC0824Gl = null;
        if (!defaultTrackSelector$Parameters.A0D && interfaceC0823Gk != null) {
            interfaceC0824Gl = A09(trackGroupArray, iArr, i10, defaultTrackSelector$Parameters, interfaceC0823Gk);
        }
        if (interfaceC0824Gl == null) {
            return A07(trackGroupArray, iArr, defaultTrackSelector$Parameters);
        }
        return interfaceC0824Gl;
    }

    public static List<Integer> A0D(TrackGroup trackGroup, int i10, int i11, boolean z10) {
        ArrayList arrayList = new ArrayList(trackGroup.A01);
        for (int i12 = 0; i12 < trackGroup.A01; i12++) {
            arrayList.add(Integer.valueOf(i12));
        }
        if (i10 == Integer.MAX_VALUE || i11 == Integer.MAX_VALUE) {
            return arrayList;
        }
        int i13 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i14 = 0; i14 < trackGroup.A01; i14++) {
            Format A01 = trackGroup.A01(i14);
            if (A03[1].length() == 16) {
                throw new RuntimeException();
            }
            A03[4] = "AsRc";
            if (A01.A0F > 0 && A01.A08 > 0) {
                Point A05 = A05(z10, i10, i11, A01.A0F, A01.A08);
                int i15 = A01.A0F * A01.A08;
                if (A01.A0F >= ((int) (A05.x * 0.98f)) && A01.A08 >= ((int) (A05.y * 0.98f)) && i15 < i13) {
                    i13 = i15;
                }
            }
        }
        if (i13 != Integer.MAX_VALUE) {
            int size = arrayList.size();
            if (A03[2].length() != 19) {
                throw new RuntimeException();
            }
            A03[4] = "XusxMXAKD";
            for (int i16 = size - 1; i16 >= 0; i16--) {
                int i17 = ((Integer) arrayList.get(i16)).intValue();
                int maxVideoPixelsToRetain = trackGroup.A01(i17).A0E();
                if (maxVideoPixelsToRetain == -1 || maxVideoPixelsToRetain > i13) {
                    arrayList.remove(i16);
                }
            }
        }
        return arrayList;
    }

    public static void A0G(C0822Gj c0822Gj, int[][][] iArr, AG[] agArr, InterfaceC0824Gl[] interfaceC0824GlArr, int i10) {
        if (i10 == 0) {
            return;
        }
        int i11 = -1;
        int i12 = -1;
        boolean z10 = true;
        int i13 = 0;
        while (true) {
            int tunnelingAudioRendererIndex = c0822Gj.A00();
            boolean z11 = true;
            if (i13 >= tunnelingAudioRendererIndex) {
                break;
            }
            int i14 = c0822Gj.A01(i13);
            InterfaceC0824Gl interfaceC0824Gl = interfaceC0824GlArr[i13];
            if ((i14 == 1 || i14 == 2) && interfaceC0824Gl != null) {
                boolean A0M = A0M(iArr[i13], c0822Gj.A02(i13), interfaceC0824Gl);
                int tunnelingVideoRendererIndex = A03[1].length();
                if (tunnelingVideoRendererIndex == 16) {
                    throw new RuntimeException();
                }
                A03[1] = "";
                if (!A0M) {
                    continue;
                } else if (i14 == 1) {
                    if (i11 != -1) {
                        z10 = false;
                        break;
                    }
                    i11 = i13;
                } else if (i12 != -1) {
                    z10 = false;
                    break;
                } else {
                    i12 = i13;
                }
            }
            i13++;
        }
        if (z10 & ((i11 == -1 || i12 == -1) ? false : false)) {
            AG ag2 = new AG(i10);
            agArr[i11] = ag2;
            agArr[i12] = ag2;
        }
    }

    public static boolean A0H(int i10, boolean z10) {
        int i11 = i10 & 7;
        return i11 == 4 || (z10 && i11 == 3);
    }

    public static boolean A0I(Format format) {
        return TextUtils.isEmpty(format.A0N) || A0K(format, A0C(0, 3, 61));
    }

    public static boolean A0J(Format format, int i10, C0816Gb c0816Gb) {
        if (A0H(i10, false) && format.A05 == c0816Gb.A00) {
            int i11 = format.A0C;
            String[] strArr = A03;
            if (strArr[6].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            A03[5] = "i1Rv3RXs3qomVMYLbBToUnjZJyACCjVo";
            if (i11 == c0816Gb.A01) {
                return c0816Gb.A02 == null || TextUtils.equals(c0816Gb.A02, format.A0O);
            }
            return false;
        }
        return false;
    }

    public static boolean A0K(Format format, String str) {
        return str != null && TextUtils.equals(str, IK.A0L(format.A0N));
    }

    public static boolean A0L(Format format, String str, int i10, int i11, int i12, int i13, int i14) {
        if (!A0H(i10, false) || (i10 & i11) == 0) {
            return false;
        }
        if (str == null || IK.A0g(format.A0O, str)) {
            if (format.A0F == -1 || format.A0F <= i12) {
                if (format.A08 == -1 || format.A08 <= i13) {
                    return format.A04 == -1 || format.A04 <= i14;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean A0M(int[][] iArr, TrackGroupArray trackGroupArray, InterfaceC0824Gl interfaceC0824Gl) {
        if (interfaceC0824Gl == null) {
            return false;
        }
        int A00 = trackGroupArray.A00(interfaceC0824Gl.A8Y());
        for (int i10 = 0; i10 < interfaceC0824Gl.length(); i10++) {
            int trackGroupIndex = iArr[A00][interfaceC0824Gl.A7a(i10)] & 32;
            if (trackGroupIndex != 32) {
                return false;
            }
        }
        int trackGroupIndex2 = A03[5].charAt(17);
        if (trackGroupIndex2 != 66) {
            throw new RuntimeException();
        }
        A03[5] = "tG1y1zDJKZkfF9elCBgE5pr6FloJMK6B";
        return true;
    }

    /* JADX WARN: Incorrect condition in loop: B:23:0x0053 */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] A0N(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup r9, int[] r10, boolean r11) {
        /*
            r8 = 0
            r7 = 0
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            r4 = 0
        L8:
            int r0 = r9.A01
            if (r4 >= r0) goto L4a
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = r9.A01(r4)
            com.facebook.ads.redexgen.X.Gb r6 = new com.facebook.ads.redexgen.X.Gb
            int r2 = r0.A05
            int r1 = r0.A0C
            if (r11 == 0) goto L41
            r0 = 0
        L19:
            r6.<init>(r2, r1, r0)
            boolean r0 = r5.add(r6)
            if (r0 == 0) goto L3e
            int r3 = A04(r9, r10, r6)
            if (r3 <= r8) goto L3e
            r7 = r6
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.D1.A03
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 30
            if (r1 == r0) goto L44
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.D1.A03
            java.lang.String r1 = "QSRO8bxNHUTwbsCCzbG"
            r0 = 2
            r2[r0] = r1
            r8 = r3
        L3e:
            int r4 = r4 + 1
            goto L8
        L41:
            java.lang.String r0 = r0.A0O
            goto L19
        L44:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L4a:
            r0 = 1
            if (r8 <= r0) goto L70
            int[] r5 = new int[r8]
            r4 = 0
            r3 = 0
        L51:
            int r0 = r9.A01
            if (r3 >= r0) goto L6f
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r2 = r9.A01(r3)
            r1 = r10[r3]
            java.lang.Object r0 = com.facebook.ads.redexgen.X.AbstractC0844Hf.A01(r7)
            com.facebook.ads.redexgen.X.Gb r0 = (com.facebook.ads.redexgen.X.C0816Gb) r0
            boolean r0 = A0J(r2, r1, r0)
            if (r0 == 0) goto L6c
            int r0 = r4 + 1
            r5[r4] = r3
            r4 = r0
        L6c:
            int r3 = r3 + 1
            goto L51
        L6f:
            return r5
        L70:
            int[] r0 = com.facebook.ads.redexgen.X.D1.A04
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.D1.A0N(com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup, int[], boolean):int[]");
    }

    public static int[] A0O(TrackGroup trackGroup, int[] iArr, boolean z10, int i10, int i11, int selectedMimeTypeTrackCount, int i12, int i13, int i14, boolean z11) {
        int countForMimeType;
        if (trackGroup.A01 >= 2) {
            List<Integer> A0D = A0D(trackGroup, i13, i14, z11);
            if (A0D.size() < 2) {
                return A04;
            }
            String selectedMimeType = null;
            if (!z10) {
                HashSet hashSet = new HashSet();
                int i15 = 0;
                for (int selectedMimeTypeTrackCount2 = 0; selectedMimeTypeTrackCount2 < A0D.size(); selectedMimeTypeTrackCount2++) {
                    String str = trackGroup.A01(A0D.get(selectedMimeTypeTrackCount2).intValue()).A0O;
                    if (hashSet.add(str) && (countForMimeType = A03(trackGroup, iArr, i10, str, i11, selectedMimeTypeTrackCount, i12, A0D)) > i15) {
                        selectedMimeType = str;
                        i15 = countForMimeType;
                    }
                }
            }
            A0F(trackGroup, iArr, i10, selectedMimeType, i11, selectedMimeTypeTrackCount, i12, A0D);
            return A0D.size() < 2 ? A04 : IK.A0j(A0D);
        }
        return A04;
    }

    private final InterfaceC0824Gl[] A0P(C0822Gj c0822Gj, int[][][] iArr, int[] iArr2, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) throws C06589h {
        int A00 = c0822Gj.A00();
        InterfaceC0824Gl[] interfaceC0824GlArr = new InterfaceC0824Gl[A00];
        boolean seenVideoRendererWithMappedTracks = false;
        boolean z10 = false;
        for (int i10 = 0; i10 < A00; i10++) {
            if (2 == c0822Gj.A01(i10)) {
                if (!z10) {
                    interfaceC0824GlArr[i10] = A0B(c0822Gj.A02(i10), iArr[i10], iArr2[i10], defaultTrackSelector$Parameters, this.A00);
                    z10 = interfaceC0824GlArr[i10] != null;
                }
                seenVideoRendererWithMappedTracks |= c0822Gj.A02(i10).A01 > 0;
            }
        }
        boolean z11 = false;
        int rendererCount = 0;
        for (int i11 = 0; i11 < A00; i11++) {
            int A01 = c0822Gj.A01(i11);
            switch (A01) {
                case 1:
                    if (z11) {
                        break;
                    } else {
                        TrackGroupArray A022 = c0822Gj.A02(i11);
                        int[][] iArr3 = iArr[i11];
                        int i12 = iArr2[i11];
                        interfaceC0824GlArr[i11] = A0A(A022, iArr3, i12, defaultTrackSelector$Parameters, seenVideoRendererWithMappedTracks ? null : this.A00);
                        if (interfaceC0824GlArr[i11] != null) {
                            z11 = true;
                            break;
                        } else {
                            z11 = false;
                            break;
                        }
                    }
                case 2:
                    break;
                case 3:
                    if (rendererCount == 0) {
                        interfaceC0824GlArr[i11] = A08(c0822Gj.A02(i11), iArr[i11], defaultTrackSelector$Parameters);
                        InterfaceC0824Gl interfaceC0824Gl = interfaceC0824GlArr[i11];
                        if (A03[4].length() != 30) {
                            A03[4] = "uYzutQ7tTIwb8kcWwqH9k";
                            if (interfaceC0824Gl != null) {
                                rendererCount = 1;
                                break;
                            } else {
                                rendererCount = 0;
                                break;
                            }
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        continue;
                    }
                default:
                    interfaceC0824GlArr[i11] = A06(A01, c0822Gj.A02(i11), iArr[i11], defaultTrackSelector$Parameters);
                    break;
            }
        }
        return interfaceC0824GlArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    @Override // com.facebook.ads.redexgen.X.XB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair<com.facebook.ads.redexgen.X.AG[], com.facebook.ads.redexgen.X.InterfaceC0824Gl[]> A0V(com.facebook.ads.redexgen.X.C0822Gj r12, int[][][] r13, int[] r14) throws com.facebook.ads.redexgen.X.C06589h {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.D1.A0V(com.facebook.ads.redexgen.X.Gj, int[][][], int[]):android.util.Pair");
    }
}
