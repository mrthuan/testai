package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Region;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* loaded from: assets/audience_network.dex */
public final class GC {
    public static byte[] A07;
    public static String[] A08 = {"8ynjxGuvqhEK6HfwGz4huo4aEJumTbl9", "NQLxoEekrmTrbdkQbYiEmw9U8A", "A7wePrDRFUe5oDe3z7CQumm14hMskdd5", "dWtbDx1", "U1JmOT8CtllLd5omv4HbWcgryxPwPNTJ", "82VKBP1", "VTB1AgJpGnH13J8WHYKYhxqoccEXo0Al", "jD6Ac3Tj6h7jGdKoRkcqzsP79IKcaoo7"};
    public static final byte[] A09;
    public static final byte[] A0A;
    public static final byte[] A0B;
    public Bitmap A00;
    public final Canvas A01;
    public final Paint A02 = new Paint();
    public final Paint A03;
    public final G4 A04;
    public final G5 A05;
    public final GB A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static G4 A04(I3 i32, int i10) {
        int A04;
        int A042;
        int A043;
        int A044;
        int i11 = 8;
        int A045 = i32.A04(8);
        i32.A08(8);
        int i12 = i10 - 2;
        int[] A0F = A0F();
        int[] A0G = A0G();
        int[] A0H = A0H();
        while (i12 > 0) {
            int A046 = i32.A04(i11);
            int A047 = i32.A04(i11);
            int i13 = i12 - 2;
            int[] iArr = (A047 & 128) != 0 ? A0F : (A047 & 64) != 0 ? A0G : A0H;
            if ((A047 & 1) != 0) {
                A04 = i32.A04(i11);
                A042 = i32.A04(i11);
                A043 = i32.A04(i11);
                A044 = i32.A04(i11);
                i12 = i13 - 4;
            } else {
                A04 = i32.A04(6) << 2;
                A042 = i32.A04(4) << 4;
                A043 = i32.A04(4) << 4;
                A044 = i32.A04(2) << 6;
                i12 = i13 - 2;
            }
            if (A04 == 0) {
                A042 = 0;
                A043 = 0;
                A044 = FunctionEval.FunctionID.EXTERNAL_FUNC;
            }
            iArr[A046] = A00((byte) (255 - (A044 & FunctionEval.FunctionID.EXTERNAL_FUNC)), IK.A06((int) (A04 + ((A042 - 128) * 1.402d)), 0, FunctionEval.FunctionID.EXTERNAL_FUNC), IK.A06((int) ((A04 - ((A043 - 128) * 0.34414d)) - ((A042 - 128) * 0.71414d)), 0, FunctionEval.FunctionID.EXTERNAL_FUNC), IK.A06((int) (A04 + ((A043 - 128) * 1.772d)), 0, FunctionEval.FunctionID.EXTERNAL_FUNC));
            i11 = 8;
        }
        return new G4(A045, A0F, A0G, A0H);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static G5 A05(I3 i32) {
        int i10;
        int i11;
        int i12;
        int i13;
        i32.A08(4);
        boolean A0F = i32.A0F();
        i32.A08(3);
        int A04 = i32.A04(16);
        int A042 = i32.A04(16);
        if (A0F) {
            i10 = i32.A04(16);
            i13 = i32.A04(16);
            i11 = i32.A04(16);
            i12 = i32.A04(16);
        } else {
            i10 = 0;
            i11 = 0;
            i12 = A042;
            i13 = A04;
        }
        return new G5(A04, A042, i10, i13, i11, i12);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 28 out of bounds for length 28
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static G9 A08(I3 i32, int i10) {
        int i11 = 8;
        int A04 = i32.A04(8);
        i32.A08(4);
        boolean A0F = i32.A0F();
        i32.A08(3);
        int A042 = i32.A04(16);
        int A043 = i32.A04(16);
        int A044 = i32.A04(3);
        int A045 = i32.A04(3);
        i32.A08(2);
        int A046 = i32.A04(8);
        int A047 = i32.A04(8);
        int A048 = i32.A04(4);
        int A049 = i32.A04(2);
        i32.A08(2);
        int i12 = i10 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i12 > 0) {
            int A0410 = i32.A04(16);
            int A0411 = i32.A04(2);
            int A0412 = i32.A04(2);
            int A0413 = i32.A04(12);
            i32.A08(4);
            int A0414 = i32.A04(12);
            i12 -= 6;
            int i13 = 0;
            int i14 = 0;
            if (A0411 == 1 || A0411 == 2) {
                i13 = i32.A04(i11);
                i14 = i32.A04(i11);
                i12 -= 2;
                String[] strArr = A08;
                if (strArr[5].length() != strArr[3].length()) {
                    throw new RuntimeException();
                }
                A08[1] = "TVBzy0qXZAp8MmoWSjJzaLxcgs";
            }
            sparseArray.put(A0410, new GA(A0411, A0412, A0413, A0414, i13, i14));
            i11 = 8;
        }
        return new G9(A04, A0F, A042, A043, A044, A045, A046, A047, A048, A049, sparseArray);
    }

    public static String A09(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 2);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{121, -106, -87, -106, Field.DOCPROPERTY, -101, -98, -102, -95, -103, Field.DOCPROPERTY, -95, -102, -93, -100, -87, -99, Field.DOCPROPERTY, -102, -83, -104, -102, -102, -103, -88, Field.DOCPROPERTY, -95, -98, -94, -98, -87, -74, -24, -44, -62, -45, -28, -27, -41, -28};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 28 out of bounds for length 23
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final List<C0807Fs> A0I(byte[] bArr, int i10) {
        I3 i32 = new I3(bArr, i10);
        while (i32.A01() >= 48 && i32.A04(8) == 15) {
            A0C(i32, this.A06);
        }
        if (this.A06.A01 == null) {
            return Collections.emptyList();
        }
        G5 g52 = this.A06.A00 != null ? this.A06.A00 : this.A05;
        if (this.A00 == null || g52.A05 + 1 != this.A00.getWidth() || g52.A00 + 1 != this.A00.getHeight()) {
            this.A00 = Bitmap.createBitmap(g52.A05 + 1, g52.A00 + 1, Bitmap.Config.ARGB_8888);
            this.A01.setBitmap(this.A00);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<G8> sparseArray = this.A06.A01.A03;
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            G8 valueAt = sparseArray.valueAt(i11);
            G9 g92 = this.A06.A08.get(sparseArray.keyAt(i11));
            int i12 = valueAt.A00 + g52.A02;
            int i13 = valueAt.A01 + g52.A04;
            int min = Math.min(g92.A08 + i12, g52.A01);
            int i14 = g92.A02 + i13;
            int i15 = g52.A03;
            if (A08[4].charAt(24) == 'N') {
                throw new RuntimeException();
            }
            A08[4] = "3k1bLSmeVMMbgOcaW30zy1SdV300Zn1R";
            this.A01.clipRect(i12, i13, min, Math.min(i14, i15), Region.Op.REPLACE);
            G4 g42 = this.A06.A06.get(g92.A00);
            if (g42 == null && (g42 = this.A06.A04.get(g92.A00)) == null) {
                g42 = this.A04;
            }
            SparseArray<GA> sparseArray2 = g92.A09;
            String[] strArr = A08;
            if (strArr[5].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            A08[1] = "JjoMguGs1qt7GN1pTvjIzDQaCf";
            int i16 = 0;
            while (i16 < sparseArray2.size()) {
                int keyAt = sparseArray2.keyAt(i16);
                GA valueAt2 = sparseArray2.valueAt(i16);
                G6 g62 = this.A06.A07.get(keyAt);
                if (g62 == null) {
                    g62 = this.A06.A05.get(keyAt);
                }
                if (g62 != null) {
                    A0B(g62, g42, g92.A01, i12 + valueAt2.A02, i13 + valueAt2.A05, g62.A01 ? null : this.A02, this.A01);
                }
                i16++;
                if (A08[2].charAt(19) != '3') {
                    String[] strArr2 = A08;
                    strArr2[5] = "xSTCNLC";
                    strArr2[3] = "SHujbXn";
                } else {
                    A08[6] = "3gGlAGYtRyGpn5rL0vQCRHGDsmQahIPQ";
                }
            }
            if (g92.A0A) {
                this.A03.setColor(g92.A01 == 3 ? g42.A03[g92.A07] : g92.A01 == 2 ? g42.A02[g92.A06] : g42.A01[g92.A05]);
                this.A01.drawRect(i12, i13, g92.A08 + i12, g92.A02 + i13, this.A03);
            }
            arrayList.add(new C0807Fs(Bitmap.createBitmap(this.A00, i12, i13, g92.A08, g92.A02), i12 / g52.A05, 0, i13 / g52.A00, 0, g92.A08 / g52.A05, g92.A02 / g52.A00));
            this.A01.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        return arrayList;
    }

    static {
        A0A();
        A09 = new byte[]{0, 7, 8, 15};
        A0A = new byte[]{0, 119, -120, -1};
        A0B = new byte[]{0, 17, 34, Field.MACROBUTTON, Field.INCLUDETEXT, Field.DOCPROPERTY, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    }

    public GC(int i10, int i11) {
        this.A02.setStyle(Paint.Style.FILL_AND_STROKE);
        this.A02.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.A02.setPathEffect(null);
        this.A03 = new Paint();
        this.A03.setStyle(Paint.Style.FILL);
        this.A03.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        this.A03.setPathEffect(null);
        this.A01 = new Canvas();
        this.A05 = new G5(719, 575, 0, 719, 0, 575);
        this.A04 = new G4(0, A0F(), A0G(), A0H());
        this.A06 = new GB(i10, i11);
    }

    public static int A00(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    public static int A01(I3 i32, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        int i12 = i10;
        boolean z10 = false;
        do {
            int i13 = 0;
            byte A04 = i32.A04(2);
            if (A08[4].charAt(24) != 'N') {
                A08[4] = "HrbNpNFlv98dQSYIGN1QikeC8F3JgSwg";
                if (A04 != 0) {
                    i13 = 1;
                } else if (i32.A0F()) {
                    i13 = i32.A04(3) + 3;
                    A04 = i32.A04(2);
                } else if (i32.A0F()) {
                    i13 = 1;
                    if (A08[2].charAt(19) != '3') {
                        A08[4] = "HLIBFdOcBcQ13vsz9vC4X3h7S8RvBqZM";
                        A04 = 0;
                    }
                } else {
                    switch (i32.A04(2)) {
                        case 0:
                            z10 = true;
                            A04 = 0;
                            break;
                        case 1:
                            i13 = 2;
                            A04 = 0;
                            break;
                        case 2:
                            i13 = i32.A04(4) + 12;
                            A04 = i32.A04(2);
                            break;
                        case 3:
                            i13 = i32.A04(8) + 29;
                            A04 = i32.A04(2);
                            break;
                        default:
                            A04 = 0;
                            break;
                    }
                }
                if (i13 != 0 && paint != null) {
                    if (bArr != null) {
                        A04 = bArr[A04];
                    }
                    paint.setColor(iArr[A04]);
                    canvas.drawRect(i12, i11, i12 + i13, i11 + 1, paint);
                }
                i12 += i13;
            }
            throw new RuntimeException();
        } while (!z10);
        return i12;
    }

    public static int A02(I3 i32, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        int i12 = i10;
        boolean z10 = false;
        do {
            int peek = 0;
            byte A04 = i32.A04(4);
            if (A04 != 0) {
                peek = 1;
            } else if (!i32.A0F()) {
                int A042 = i32.A04(3);
                if (A042 != 0) {
                    peek = A042 + 2;
                    A04 = 0;
                } else {
                    z10 = true;
                    A04 = 0;
                }
            } else if (!i32.A0F()) {
                peek = i32.A04(2) + 4;
                A04 = i32.A04(4);
            } else {
                switch (i32.A04(2)) {
                    case 0:
                        peek = 1;
                        A04 = 0;
                        break;
                    case 1:
                        peek = 2;
                        A04 = 0;
                        break;
                    case 2:
                        peek = i32.A04(4) + 9;
                        A04 = i32.A04(4);
                        break;
                    case 3:
                        peek = i32.A04(8) + 25;
                        A04 = i32.A04(4);
                        break;
                    default:
                        A04 = 0;
                        break;
                }
            }
            if (peek != 0 && paint != null) {
                if (bArr != null) {
                    A04 = bArr[A04];
                }
                int i13 = iArr[A04];
                String[] strArr = A08;
                if (strArr[5].length() != strArr[3].length()) {
                    throw new RuntimeException();
                }
                A08[6] = "99qTAMz5ObSXEsnosFsE0iIiJXmhlgSb";
                paint.setColor(i13);
                canvas.drawRect(i12, i11, i12 + peek, i11 + 1, paint);
            }
            i12 += peek;
        } while (!z10);
        return i12;
    }

    public static int A03(I3 i32, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        int A04;
        boolean z10 = false;
        do {
            byte A042 = i32.A04(8);
            if (A042 != 0) {
                A04 = 1;
            } else if (!i32.A0F()) {
                A04 = i32.A04(7);
                if (A04 != 0) {
                    A042 = 0;
                } else {
                    z10 = true;
                    A04 = 0;
                    A042 = 0;
                }
            } else {
                A04 = i32.A04(7);
                A042 = i32.A04(8);
            }
            if (A04 != 0 && paint != null) {
                if (bArr != null) {
                    A042 = bArr[A042];
                }
                paint.setColor(iArr[A042]);
                canvas.drawRect(i10, i11, i10 + A04, i11 + 1, paint);
            }
            i10 += A04;
            if (A08[2].charAt(19) == '3') {
                throw new RuntimeException();
            }
            A08[6] = "VUlHAiRwnKVSYNNIm22gyVEFvpJ5tK4N";
        } while (!z10);
        return i10;
    }

    public static G6 A06(I3 i32) {
        int A04 = i32.A04(16);
        i32.A08(4);
        int objectCodingMethod = i32.A04(2);
        boolean A0F = i32.A0F();
        i32.A08(1);
        byte[] bottomFieldData = null;
        byte[] bArr = null;
        if (objectCodingMethod == 1) {
            int numberOfCodes = i32.A04(8);
            i32.A08(numberOfCodes * 16);
        } else if (objectCodingMethod == 0) {
            int A042 = i32.A04(16);
            int topFieldDataLength = i32.A04(16);
            if (A042 > 0) {
                bottomFieldData = new byte[A042];
                int objectId = A08[2].charAt(19);
                if (objectId == 51) {
                    throw new RuntimeException();
                }
                A08[6] = "RKYJA8yEMhap3nvsTUFIJMEemn1r9hAW";
                i32.A0E(bottomFieldData, 0, A042);
            }
            if (topFieldDataLength > 0) {
                bArr = new byte[topFieldDataLength];
                i32.A0E(bArr, 0, topFieldDataLength);
            } else {
                bArr = bottomFieldData;
            }
        }
        return new G6(A04, A0F, bottomFieldData, bArr);
    }

    public static G7 A07(I3 i32, int i10) {
        int A04 = i32.A04(8);
        int A042 = i32.A04(4);
        int A043 = i32.A04(2);
        i32.A08(2);
        int i11 = i10 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i11 > 0) {
            int remainingLength = i32.A04(8);
            i32.A08(8);
            int version = i32.A04(16);
            int timeoutSecs = i32.A04(16);
            i11 -= 6;
            sparseArray.put(remainingLength, new G8(version, timeoutSecs));
        }
        return new G7(A04, A042, A043, sparseArray);
    }

    public static void A0B(G6 g62, G4 g42, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i10 == 3) {
            iArr = g42.A03;
        } else if (i10 == 2) {
            iArr = g42.A02;
        } else {
            iArr = g42.A01;
        }
        A0D(g62.A03, iArr, i10, i11, i12, paint, canvas);
        A0D(g62.A02, iArr, i10, i11, i12 + 1, paint, canvas);
    }

    public static void A0C(I3 i32, GB gb2) {
        int pageId = i32.A04(8);
        int A04 = i32.A04(16);
        int A042 = i32.A04(16);
        int dataFieldLimit = i32.A02() + A042;
        int dataFieldLength = A042 * 8;
        int segmentType = i32.A01();
        if (dataFieldLength > segmentType) {
            Log.w(A09(31, 9, 112), A09(0, 31, 51));
            int segmentType2 = i32.A01();
            i32.A08(segmentType2);
            return;
        }
        switch (pageId) {
            case 16:
                int segmentType3 = gb2.A03;
                if (A04 == segmentType3) {
                    G7 g72 = gb2.A01;
                    G7 A072 = A07(i32, A042);
                    int segmentType4 = A072.A00;
                    if (segmentType4 != 0) {
                        gb2.A01 = A072;
                        gb2.A08.clear();
                        gb2.A06.clear();
                        gb2.A07.clear();
                        break;
                    } else if (g72 != null) {
                        int dataFieldLength2 = g72.A02;
                        int segmentType5 = A072.A02;
                        if (dataFieldLength2 != segmentType5) {
                            gb2.A01 = A072;
                            break;
                        }
                    }
                }
                break;
            case 17:
                G7 pageComposition = gb2.A01;
                int i10 = gb2.A03;
                String[] strArr = A08;
                String str = strArr[5];
                String str2 = strArr[3];
                int dataFieldLength3 = str.length();
                int segmentType6 = str2.length();
                if (dataFieldLength3 == segmentType6) {
                    A08[4] = "q1WJVeOMaGnpbtvlIttdST2Iz5tS8l4c";
                    if (A04 == i10 && pageComposition != null) {
                        G9 A082 = A08(i32, A042);
                        int segmentType7 = pageComposition.A00;
                        if (segmentType7 == 0) {
                            SparseArray<G9> sparseArray = gb2.A08;
                            int segmentType8 = A082.A03;
                            A082.A00(sparseArray.get(segmentType8));
                        }
                        SparseArray<G9> sparseArray2 = gb2.A08;
                        int segmentType9 = A082.A03;
                        sparseArray2.put(segmentType9, A082);
                        break;
                    }
                } else {
                    throw new RuntimeException();
                }
                break;
            case 18:
                int segmentType10 = gb2.A03;
                if (A04 == segmentType10) {
                    G4 A043 = A04(i32, A042);
                    SparseArray<G4> sparseArray3 = gb2.A06;
                    int segmentType11 = A043.A00;
                    sparseArray3.put(segmentType11, A043);
                    break;
                } else {
                    int segmentType12 = gb2.A02;
                    if (A04 == segmentType12) {
                        G4 A044 = A04(i32, A042);
                        SparseArray<G4> sparseArray4 = gb2.A04;
                        int segmentType13 = A044.A00;
                        sparseArray4.put(segmentType13, A044);
                        break;
                    }
                }
                break;
            case 19:
                int segmentType14 = gb2.A03;
                if (A04 == segmentType14) {
                    G6 A06 = A06(i32);
                    SparseArray<G6> sparseArray5 = gb2.A07;
                    int segmentType15 = A06.A00;
                    sparseArray5.put(segmentType15, A06);
                    break;
                } else {
                    int segmentType16 = gb2.A02;
                    if (A04 == segmentType16) {
                        G6 A062 = A06(i32);
                        SparseArray<G6> sparseArray6 = gb2.A05;
                        int segmentType17 = A062.A00;
                        sparseArray6.put(segmentType17, A062);
                        break;
                    }
                }
                break;
            case 20:
                int segmentType18 = gb2.A03;
                if (A04 == segmentType18) {
                    gb2.A00 = A05(i32);
                    break;
                }
                break;
        }
        int segmentType19 = i32.A02();
        i32.A09(dataFieldLimit - segmentType19);
    }

    public static void A0D(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        byte[] clutMapTable4To8;
        byte[] clutMapTable4To82;
        int line = i12;
        I3 i32 = new I3(bArr);
        byte[] clutMapTable2To8 = null;
        byte[] clutMapTable2To4 = null;
        int column = i11;
        while (i32.A01() != 0) {
            switch (i32.A04(8)) {
                case 16:
                    if (i10 == 3) {
                        clutMapTable4To8 = clutMapTable2To4 == null ? A0A : clutMapTable2To4;
                    } else if (i10 == 2) {
                        clutMapTable4To8 = clutMapTable2To8 == null ? A09 : clutMapTable2To8;
                    } else {
                        clutMapTable4To8 = null;
                    }
                    column = A01(i32, iArr, clutMapTable4To8, column, line, paint, canvas);
                    i32.A05();
                    break;
                case 17:
                    if (i10 == 3) {
                        clutMapTable4To82 = 0 == 0 ? A0B : null;
                    } else {
                        clutMapTable4To82 = null;
                    }
                    column = A02(i32, iArr, clutMapTable4To82, column, line, paint, canvas);
                    i32.A05();
                    break;
                case 18:
                    column = A03(i32, iArr, null, column, line, paint, canvas);
                    break;
                case 32:
                    clutMapTable2To8 = A0E(4, 4, i32);
                    break;
                case 33:
                    clutMapTable2To4 = A0E(4, 8, i32);
                    break;
                case 34:
                    clutMapTable2To4 = A0E(16, 8, i32);
                    break;
                case 240:
                    line += 2;
                    column = i11;
                    break;
            }
        }
    }

    public static byte[] A0E(int i10, int i11, I3 i32) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) i32.A04(i11);
        }
        return bArr;
    }

    public static int[] A0F() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    public static int[] A0G() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < iArr.length; i10++) {
            if (i10 < 8) {
                int i11 = (i10 & 1) != 0 ? FunctionEval.FunctionID.EXTERNAL_FUNC : 0;
                iArr[i10] = A00(FunctionEval.FunctionID.EXTERNAL_FUNC, i11, (i10 & 2) != 0 ? FunctionEval.FunctionID.EXTERNAL_FUNC : 0, (i10 & 4) != 0 ? FunctionEval.FunctionID.EXTERNAL_FUNC : 0);
            } else {
                int i12 = i10 & 1;
                int i13 = ShapeTypes.VERTICAL_SCROLL;
                int i14 = i12 != 0 ? ShapeTypes.VERTICAL_SCROLL : 0;
                int i15 = (i10 & 2) != 0 ? ShapeTypes.VERTICAL_SCROLL : 0;
                if ((i10 & 4) == 0) {
                    i13 = 0;
                }
                iArr[i10] = A00(FunctionEval.FunctionID.EXTERNAL_FUNC, i14, i15, i13);
            }
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x016b, code lost:
        if (r9 != 0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x016f, code lost:
        if ((r5 & 64) == 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0171, code lost:
        r6[r5] = A00(lib.zj.office.fc.hssf.formula.eval.FunctionEval.FunctionID.EXTERNAL_FUNC, r8, r7, r3 + r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0179, code lost:
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x017b, code lost:
        if (r9 != 0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x017e, code lost:
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0191, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0191, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0092, code lost:
        if (r9 != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0094, code lost:
        r1 = 43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c0, code lost:
        if (r9 != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c3, code lost:
        r1 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] A0H() {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.GC.A0H():int[]");
    }

    public final void A0J() {
        this.A06.A00();
    }
}
