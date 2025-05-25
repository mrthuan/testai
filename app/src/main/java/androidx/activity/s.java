package androidx.activity;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Path;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustAttribution;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.android.billingclient.api.a0;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.ads.ADRequestList;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.google.android.play.core.assetpacks.b1;
import industries.deepthought.decode.Decoder;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.zip.GZIPOutputStream;
import kotlin.Result;
import lib.zj.office.fc.ddf.AbstractEscherOptRecord;
import lib.zj.office.fc.ddf.EscherArrayProperty;
import lib.zj.office.fc.ddf.EscherComplexProperty;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.ddf.EscherOptRecord;
import lib.zj.office.fc.ddf.EscherProperties;
import lib.zj.office.fc.ddf.EscherProperty;
import lib.zj.office.fc.ddf.EscherRecord;
import lib.zj.office.fc.ddf.EscherSimpleProperty;
import lib.zj.office.fc.ddf.EscherSpRecord;
import lib.zj.office.fc.hpsf.Constants;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import lib.zj.office.fc.util.LittleEndian;
import lib.zj.office.fc.util.StringUtil;
import lib.zj.office.java.awt.Color;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.pdfeditor.ReaderPDFCore;
import okio.ByteString;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import x0.o0;

/* compiled from: ViewTreeOnBackPressedDispatcherOwner.kt */
/* loaded from: classes.dex */
public class s implements bb.e, ek.s, gf.i, com.google.android.tools.h, o0 {
    public static int c = 0;

    /* renamed from: e  reason: collision with root package name */
    public static String f1850e = "";

    /* renamed from: r  reason: collision with root package name */
    public static ReaderPDFCore f1863r = null;

    /* renamed from: s  reason: collision with root package name */
    public static boolean f1864s = false;

    /* renamed from: t  reason: collision with root package name */
    public static boolean f1865t = false;

    /* renamed from: u  reason: collision with root package name */
    public static double f1866u = 0.0d;

    /* renamed from: v  reason: collision with root package name */
    public static int f1867v = 30000;

    /* renamed from: w  reason: collision with root package name */
    public static short f1868w = 20;

    /* renamed from: b  reason: collision with root package name */
    public static final com.google.android.play.core.assetpacks.c f1848b = new com.google.android.play.core.assetpacks.c();

    /* renamed from: d  reason: collision with root package name */
    public static final s f1849d = new s();

    /* renamed from: f  reason: collision with root package name */
    public static final a0 f1851f = new a0("NO_OWNER", 8);

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f1852g = {0, 64};

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f1853h = {0, -84};

    /* renamed from: i  reason: collision with root package name */
    public static final byte[] f1854i = {0, -80};

    /* renamed from: j  reason: collision with root package name */
    public static final byte[] f1855j = {1, 0};

    /* renamed from: k  reason: collision with root package name */
    public static final byte[] f1856k = {3, 0};

    /* renamed from: l  reason: collision with root package name */
    public static final byte[] f1857l = {1, 32};

    /* renamed from: m  reason: collision with root package name */
    public static final byte[] f1858m = {0, -83};

    /* renamed from: n  reason: collision with root package name */
    public static final byte[] f1859n = {0, -81};

    /* renamed from: o  reason: collision with root package name */
    public static final byte[] f1860o = {0, -77};

    /* renamed from: p  reason: collision with root package name */
    public static final byte[] f1861p = {1, 96};

    /* renamed from: q  reason: collision with root package name */
    public static final byte[] f1862q = {0, Byte.MIN_VALUE};

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0063, code lost:
        if (r10 != false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A(java.lang.Object r7, int r8, int r9, boolean r10) {
        /*
            r0 = 268435952(0x100001f0, float:2.5245042E-29)
            r1 = 2
            r2 = -1
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r8 < r0) goto Ld
            if (r9 != r1) goto Lc
            return r2
        Lc:
            return r3
        Ld:
            r0 = 16711680(0xff0000, float:2.3418052E-38)
            r4 = 65280(0xff00, float:9.1477E-41)
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r6 = 134217728(0x8000000, float:3.85186E-34)
            if (r8 < r6) goto L94
            int r6 = r8 % r6
            if (r9 != r1) goto L4a
            lib.zj.office.fc.hslf.model.Sheet r7 = (lib.zj.office.fc.hslf.model.Sheet) r7
            if (r7 == 0) goto Lae
            if (r6 < 0) goto Lae
            r9 = 7
            if (r6 > r9) goto Lae
            lib.zj.office.fc.hslf.record.ColorSchemeAtom r7 = r7.getColorScheme()
            if (r7 == 0) goto L30
            int r6 = r7.getColor(r6)
        L30:
            if (r6 > r5) goto Lae
            r7 = r6 & 255(0xff, float:3.57E-43)
            r8 = r6 & r4
            int r8 = r8 >> 8
            r9 = r6 & r0
            int r9 = r9 >> 16
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 16
            r7 = r7 | r3
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 8
            r7 = r7 | r8
            r8 = r9 & 255(0xff, float:3.57E-43)
            goto Lab
        L4a:
            r0 = 1
            if (r9 != r0) goto L66
            r9 = 134217793(0x8000041, float:3.8518897E-34)
            if (r8 > r9) goto L63
            r9 = 64
            if (r6 < r9) goto L5a
            int r6 = r6 % 64
            int r6 = r6 + 8
        L5a:
            di.e r7 = (di.e) r7
            if (r7 == 0) goto Lae
            int r8 = r7.j(r6, r10)
            goto Lae
        L63:
            if (r10 == 0) goto L83
            goto L92
        L66:
            r7 = -256(0xffffffffffffff00, float:NaN)
            r9 = -65536(0xffffffffffff0000, float:NaN)
            r10 = -65281(0xffffffffffff00ff, float:NaN)
            r0 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            r1 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            switch(r6) {
                case 1: goto L92;
                case 2: goto L90;
                case 3: goto L8b;
                case 4: goto L89;
                case 5: goto L87;
                case 6: goto L85;
                case 7: goto L8e;
                case 8: goto L83;
                case 9: goto L90;
                case 10: goto L7f;
                case 11: goto L89;
                case 12: goto L87;
                case 13: goto L85;
                case 14: goto L8e;
                case 15: goto L7b;
                case 16: goto L77;
                default: goto L76;
            }
        L76:
            goto Lae
        L77:
            r7 = -3355444(0xffffffffffcccccc, float:NaN)
            goto L8e
        L7b:
            r7 = -7829368(0xffffffffff888888, float:NaN)
            goto L8e
        L7f:
            r7 = -12303292(0xffffffffff444444, float:-2.6088314E38)
            goto L8e
        L83:
            r8 = r2
            goto Lae
        L85:
            r8 = r9
            goto Lae
        L87:
            r8 = r10
            goto Lae
        L89:
            r8 = r0
            goto Lae
        L8b:
            r7 = -16711681(0xffffffffff00ffff, float:-1.714704E38)
        L8e:
            r8 = r7
            goto Lae
        L90:
            r8 = r1
            goto Lae
        L92:
            r8 = r3
            goto Lae
        L94:
            if (r8 > r5) goto Lae
            r7 = r8 & 255(0xff, float:3.57E-43)
            r9 = r8 & r4
            int r9 = r9 >> 8
            r8 = r8 & r0
            int r8 = r8 >> 16
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 16
            r7 = r7 | r3
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 << 8
            r7 = r7 | r9
            r8 = r8 & 255(0xff, float:3.57E-43)
        Lab:
            int r8 = r8 << 0
            r8 = r8 | r7
        Lae:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.s.A(java.lang.Object, int, int, boolean):int");
    }

    public static final void A0(Context context) {
        char c10;
        char c11;
        kotlin.jvm.internal.g.e(context, "context");
        if (Decoder.f18572a) {
            try {
                String substring = jd.a.b(context).substring(874, 905);
                kotlin.jvm.internal.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                Charset charset = kotlin.text.a.f19966b;
                byte[] bytes = substring.getBytes(charset);
                kotlin.jvm.internal.g.d(bytes, "this as java.lang.String).getBytes(charset)");
                byte[] bytes2 = "05c0041148bc0feffba5f06bdb73926".getBytes(charset);
                kotlin.jvm.internal.g.d(bytes2, "this as java.lang.String).getBytes(charset)");
                long j10 = 2;
                if (System.currentTimeMillis() % j10 == 0) {
                    int nextInt = jd.a.f19173a.nextInt(0, bytes.length / 2);
                    int i10 = 0;
                    while (true) {
                        if (i10 <= nextInt) {
                            if (bytes[i10] != bytes2[i10]) {
                                c11 = 16;
                                break;
                            }
                            i10++;
                        } else {
                            c11 = 0;
                            break;
                        }
                    }
                    if ((c11 ^ 0) != 0) {
                        jd.a.a();
                        throw null;
                    }
                } else if (!Arrays.equals(bytes2, bytes)) {
                    jd.a.a();
                    throw null;
                }
                try {
                    String substring2 = kd.a.b(context).substring(826, 857);
                    kotlin.jvm.internal.g.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    Charset charset2 = kotlin.text.a.f19966b;
                    byte[] bytes3 = substring2.getBytes(charset2);
                    kotlin.jvm.internal.g.d(bytes3, "this as java.lang.String).getBytes(charset)");
                    byte[] bytes4 = "a67d99911536dfcfc9147cc24483899".getBytes(charset2);
                    kotlin.jvm.internal.g.d(bytes4, "this as java.lang.String).getBytes(charset)");
                    if (System.currentTimeMillis() % j10 == 0) {
                        int nextInt2 = kd.a.f19732a.nextInt(0, bytes3.length / 2);
                        int i11 = 0;
                        while (true) {
                            if (i11 <= nextInt2) {
                                if (bytes3[i11] != bytes4[i11]) {
                                    c10 = 16;
                                    break;
                                }
                                i11++;
                            } else {
                                c10 = 0;
                                break;
                            }
                        }
                        if ((c10 ^ 0) != 0) {
                            kd.a.a();
                            throw null;
                        }
                        return;
                    } else if (!Arrays.equals(bytes4, bytes3)) {
                        kd.a.a();
                        throw null;
                    } else {
                        return;
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                    kd.a.a();
                    throw null;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                jd.a.a();
                throw null;
            }
        }
        ReaderPdfApplication.o(context);
    }

    public static int B(EscherContainerRecord escherContainerRecord) {
        EscherSimpleProperty escherSimpleProperty;
        EscherOptRecord escherOptRecord = (EscherOptRecord) F(escherContainerRecord, -4085);
        if (escherOptRecord != null && (escherSimpleProperty = (EscherSimpleProperty) H(escherOptRecord, 469)) != null) {
            return escherSimpleProperty.getPropertyValue();
        }
        return 1;
    }

    public static int B0(int i10) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i11 = 0; i11 < 6; i11++) {
            int i12 = iArr[i11];
            int i13 = i12 - 1;
            if (i12 != 0) {
                if (i13 == i10) {
                    return i12;
                }
            } else {
                throw null;
            }
        }
        return 1;
    }

    public static ug.a C(EscherContainerRecord escherContainerRecord, Rectangle rectangle) {
        float f10;
        float f11;
        Matrix matrix;
        ug.a aVar;
        Path path;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        lh.d dVar;
        byte[] bArr7;
        byte[] bArr8;
        float f12;
        byte[] bArr9;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        int i10;
        int i11;
        EscherOptRecord escherOptRecord = (EscherOptRecord) F(escherContainerRecord, -4085);
        escherOptRecord.addEscherProperty(new EscherSimpleProperty(EscherProperties.GEOMETRY__SHAPEPATH, 4));
        EscherArrayProperty escherArrayProperty = (EscherArrayProperty) H(escherOptRecord, 16709);
        if (escherArrayProperty == null) {
            escherArrayProperty = (EscherArrayProperty) H(escherOptRecord, 325);
        }
        EscherArrayProperty escherArrayProperty2 = (EscherArrayProperty) H(escherOptRecord, 16710);
        if (escherArrayProperty2 == null) {
            escherArrayProperty2 = (EscherArrayProperty) H(escherOptRecord, 326);
        }
        if (escherArrayProperty == null || escherArrayProperty2 == null) {
            return null;
        }
        EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) H(escherOptRecord, 322);
        EscherSimpleProperty escherSimpleProperty2 = (EscherSimpleProperty) H(escherOptRecord, 323);
        if (escherSimpleProperty != null) {
            f10 = escherSimpleProperty.getPropertyValue();
        } else {
            f10 = 0.0f;
        }
        if (escherSimpleProperty2 != null) {
            f11 = escherSimpleProperty2.getPropertyValue();
        } else {
            f11 = 0.0f;
        }
        Matrix matrix2 = new Matrix();
        if (f10 > 0.0f && f11 > 0.0f) {
            matrix2.postScale(rectangle.width / f10, rectangle.height / f11);
        }
        EscherSimpleProperty escherSimpleProperty3 = (EscherSimpleProperty) H(escherOptRecord, 465);
        if (escherSimpleProperty3 != null && escherSimpleProperty3.getPropertyValue() > 0) {
            lh.d dVar2 = new lh.d((byte) escherSimpleProperty3.getPropertyValue(), E(escherContainerRecord), B(escherContainerRecord));
            int round = Math.round(T(escherContainerRecord) * 1.3333334f);
            int numberOfElementsInArray = escherArrayProperty.getNumberOfElementsInArray();
            int numberOfElementsInArray2 = escherArrayProperty2.getNumberOfElementsInArray();
            int i12 = 0;
            int i13 = 0;
            while (true) {
                bArr = f1856k;
                bArr2 = f1855j;
                bArr3 = f1854i;
                bArr4 = f1853h;
                bArr5 = f1857l;
                matrix = matrix2;
                bArr6 = f1860o;
                dVar = dVar2;
                bArr7 = f1859n;
                bArr8 = f1858m;
                f12 = f10;
                bArr9 = f1852g;
                if (i12 >= numberOfElementsInArray2 || i13 >= numberOfElementsInArray) {
                    break;
                }
                int i14 = numberOfElementsInArray2;
                byte[] element = escherArrayProperty2.getElement(i12);
                if (Arrays.equals(element, bArr9)) {
                    i13++;
                } else if (!Arrays.equals(element, bArr8) && !Arrays.equals(element, bArr7) && !Arrays.equals(element, bArr6) && !Arrays.equals(element, bArr5)) {
                    if (!Arrays.equals(element, bArr4)) {
                        if (!Arrays.equals(element, bArr3) && !Arrays.equals(element, bArr2) && !Arrays.equals(element, bArr)) {
                        }
                    }
                    i11 = i13 + 1;
                    if (i11 > numberOfElementsInArray) {
                    }
                    i13 = i11;
                } else {
                    i11 = i13 + 3;
                    if (i11 > numberOfElementsInArray) {
                    }
                    i13 = i11;
                }
                i12++;
                f10 = f12;
                dVar2 = dVar;
                numberOfElementsInArray2 = i14;
                matrix2 = matrix;
            }
            byte[] element2 = escherArrayProperty2.getElement(i12);
            while (true) {
                if ((Arrays.equals(element2, f1861p) || Arrays.equals(element2, f1862q)) && i12 > 0) {
                    int i15 = i12 - 1;
                    byte[] element3 = escherArrayProperty2.getElement(i12);
                    i12 = i15;
                    element2 = element3;
                }
            }
            if (!Arrays.equals(element2, bArr8) && !Arrays.equals(element2, bArr7) && !Arrays.equals(element2, bArr6) && !Arrays.equals(element2, bArr5)) {
                if (Arrays.equals(element2, bArr9) || Arrays.equals(element2, bArr4) || Arrays.equals(element2, bArr3) || Arrays.equals(element2, bArr2) || Arrays.equals(element2, bArr)) {
                    byte[] element4 = escherArrayProperty.getElement(numberOfElementsInArray - 2);
                    byte[] element5 = escherArrayProperty.getElement(numberOfElementsInArray - 1);
                    if (element4.length == 8 && element5.length == 8) {
                        f21 = LittleEndian.getInt(element4, 0);
                        f22 = LittleEndian.getInt(element4, 4);
                        f23 = LittleEndian.getInt(element5, 0);
                        i10 = LittleEndian.getInt(element5, 4);
                    } else {
                        f21 = LittleEndian.getShort(element4, 0);
                        f22 = LittleEndian.getShort(element4, 2);
                        f23 = LittleEndian.getShort(element5, 0);
                        i10 = LittleEndian.getShort(element5, 2);
                    }
                    aVar = ug.b.e(f21, f22, f23, i10, dVar, (int) ((round * f12) / rectangle.width));
                }
            } else {
                byte[] element6 = escherArrayProperty.getElement(numberOfElementsInArray - 4);
                byte[] element7 = escherArrayProperty.getElement(numberOfElementsInArray - 3);
                byte[] element8 = escherArrayProperty.getElement(numberOfElementsInArray - 2);
                byte[] element9 = escherArrayProperty.getElement(numberOfElementsInArray - 1);
                if (element6.length == 8 && element7.length == 8 && element8.length == 8 && element9.length == 8) {
                    f13 = LittleEndian.getInt(element9, 4);
                    f14 = LittleEndian.getInt(element6, 4);
                    f15 = LittleEndian.getInt(element9, 0);
                    f16 = LittleEndian.getInt(element6, 0);
                    f17 = LittleEndian.getInt(element7, 4);
                    f18 = LittleEndian.getInt(element8, 4);
                    f19 = LittleEndian.getInt(element7, 0);
                    f20 = LittleEndian.getInt(element8, 0);
                } else {
                    f13 = LittleEndian.getShort(element9, 2);
                    f14 = LittleEndian.getShort(element6, 2);
                    f15 = LittleEndian.getShort(element9, 0);
                    f16 = LittleEndian.getShort(element6, 0);
                    f17 = LittleEndian.getShort(element7, 2);
                    f18 = LittleEndian.getShort(element8, 2);
                    f19 = LittleEndian.getShort(element7, 0);
                    f20 = LittleEndian.getShort(element8, 0);
                }
                aVar = ug.b.d(f16, f14, f19, f17, f20, f18, f15, f13, dVar, (int) ((round * f12) / rectangle.width));
            }
            if (aVar != null && (path = aVar.f30368a) != null) {
                path.transform(matrix);
            }
            return aVar;
        }
        matrix = matrix2;
        aVar = null;
        if (aVar != null) {
            path.transform(matrix);
        }
        return aVar;
    }

    public static int D(EscherContainerRecord escherContainerRecord) {
        EscherSimpleProperty escherSimpleProperty;
        EscherOptRecord escherOptRecord = (EscherOptRecord) F(escherContainerRecord, -4085);
        if (escherOptRecord != null && (escherSimpleProperty = (EscherSimpleProperty) H(escherOptRecord, 465)) != null && escherSimpleProperty.getPropertyValue() > 0) {
            return escherSimpleProperty.getPropertyValue();
        }
        return 0;
    }

    public static int E(EscherContainerRecord escherContainerRecord) {
        EscherSimpleProperty escherSimpleProperty;
        EscherOptRecord escherOptRecord = (EscherOptRecord) F(escherContainerRecord, -4085);
        if (escherOptRecord != null && (escherSimpleProperty = (EscherSimpleProperty) H(escherOptRecord, 468)) != null) {
            return escherSimpleProperty.getPropertyValue();
        }
        return 1;
    }

    public static EscherRecord F(EscherContainerRecord escherContainerRecord, int i10) {
        Iterator<EscherRecord> childIterator = escherContainerRecord.getChildIterator();
        while (childIterator.hasNext()) {
            EscherRecord next = childIterator.next();
            if (next.getRecordId() == i10) {
                return next;
            }
        }
        return null;
    }

    public static int G(EscherContainerRecord escherContainerRecord, short s4, int i10) {
        EscherSimpleProperty escherSimpleProperty;
        EscherOptRecord escherOptRecord = (EscherOptRecord) F(escherContainerRecord, -4085);
        if (escherOptRecord != null && (escherSimpleProperty = (EscherSimpleProperty) H(escherOptRecord, s4)) != null) {
            return escherSimpleProperty.getPropertyValue();
        }
        return i10;
    }

    public static EscherProperty H(AbstractEscherOptRecord abstractEscherOptRecord, int i10) {
        if (abstractEscherOptRecord != null) {
            for (EscherProperty escherProperty : abstractEscherOptRecord.getEscherProperties()) {
                if (escherProperty.getPropertyNumber() == i10) {
                    return escherProperty;
                }
            }
            return null;
        }
        return null;
    }

    public static int I(EscherContainerRecord escherContainerRecord) {
        EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) H((EscherOptRecord) F(escherContainerRecord, -4085), 395);
        if (escherSimpleProperty != null) {
            return (escherSimpleProperty.getPropertyValue() >> 16) % 360;
        }
        return 0;
    }

    public static int J(EscherContainerRecord escherContainerRecord) {
        EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) H((EscherOptRecord) F(escherContainerRecord, -4085), 396);
        if (escherSimpleProperty != null) {
            return escherSimpleProperty.getPropertyValue();
        }
        return 0;
    }

    public static int K(EscherContainerRecord escherContainerRecord) {
        EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) H((EscherOptRecord) F(escherContainerRecord, -4085), 384);
        if (escherSimpleProperty == null) {
            return 0;
        }
        return escherSimpleProperty.getPropertyValue();
    }

    public static Color L(EscherContainerRecord escherContainerRecord, Object obj, int i10) {
        int propertyValue;
        int propertyValue2;
        EscherOptRecord escherOptRecord = (EscherOptRecord) F(escherContainerRecord, -4085);
        EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) H(escherOptRecord, 387);
        EscherSimpleProperty escherSimpleProperty2 = (EscherSimpleProperty) H(escherOptRecord, 447);
        EscherSimpleProperty escherSimpleProperty3 = (EscherSimpleProperty) H(escherOptRecord, 388);
        if (escherSimpleProperty2 == null) {
            propertyValue = 0;
        } else {
            propertyValue = escherSimpleProperty2.getPropertyValue();
        }
        if (escherSimpleProperty3 == null) {
            propertyValue2 = 255;
        } else {
            propertyValue2 = (escherSimpleProperty3.getPropertyValue() >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC;
        }
        if (escherSimpleProperty != null && ((propertyValue & 16) != 0 || propertyValue == 0)) {
            return new Color(A(obj, escherSimpleProperty.getPropertyValue(), i10, false), propertyValue2);
        }
        if (propertyValue == 0 && i10 == 1) {
            return new Color((int) FunctionEval.FunctionID.EXTERNAL_FUNC, (int) FunctionEval.FunctionID.EXTERNAL_FUNC, (int) FunctionEval.FunctionID.EXTERNAL_FUNC);
        }
        return null;
    }

    public static boolean M(EscherContainerRecord escherContainerRecord) {
        if ((((EscherSpRecord) escherContainerRecord.getChildById(EscherSpRecord.RECORD_ID)).getFlags() & 64) != 0) {
            return true;
        }
        return false;
    }

    public static boolean N(EscherContainerRecord escherContainerRecord) {
        if ((((EscherSpRecord) escherContainerRecord.getChildById(EscherSpRecord.RECORD_ID)).getFlags() & 128) != 0) {
            return true;
        }
        return false;
    }

    public static Color O(EscherContainerRecord escherContainerRecord, Object obj, int i10) {
        int propertyValue;
        int propertyValue2;
        EscherOptRecord escherOptRecord = (EscherOptRecord) F(escherContainerRecord, -4085);
        EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) H(escherOptRecord, 385);
        EscherSimpleProperty escherSimpleProperty2 = (EscherSimpleProperty) H(escherOptRecord, 447);
        EscherSimpleProperty escherSimpleProperty3 = (EscherSimpleProperty) H(escherOptRecord, 386);
        EscherComplexProperty escherComplexProperty = (EscherComplexProperty) H(escherOptRecord, 261);
        if (escherSimpleProperty2 == null) {
            propertyValue = 0;
        } else {
            propertyValue = escherSimpleProperty2.getPropertyValue();
        }
        if (escherSimpleProperty3 == null) {
            propertyValue2 = 255;
        } else {
            propertyValue2 = (escherSimpleProperty3.getPropertyValue() * FunctionEval.FunctionID.EXTERNAL_FUNC) / 65536;
        }
        if (escherSimpleProperty != null && ((propertyValue & 16) != 0 || propertyValue == 0)) {
            return new Color(A(obj, escherSimpleProperty.getPropertyValue(), i10, false), propertyValue2);
        }
        if ((propertyValue & 16) != 0 && escherComplexProperty == null) {
            return new Color((int) FunctionEval.FunctionID.EXTERNAL_FUNC, (int) FunctionEval.FunctionID.EXTERNAL_FUNC, (int) FunctionEval.FunctionID.EXTERNAL_FUNC, propertyValue2);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0305  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Path[] P(lib.zj.office.fc.ddf.EscherContainerRecord r27, lib.zj.office.java.awt.Rectangle r28, android.graphics.PointF r29, byte r30, android.graphics.PointF r31, byte r32) {
        /*
            Method dump skipped, instructions count: 1139
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.s.P(lib.zj.office.fc.ddf.EscherContainerRecord, lib.zj.office.java.awt.Rectangle, android.graphics.PointF, byte, android.graphics.PointF, byte):android.graphics.Path[]");
    }

    public static boolean Q(EscherContainerRecord escherContainerRecord) {
        EscherSpRecord escherSpRecord;
        EscherContainerRecord escherContainerRecord2 = (EscherContainerRecord) escherContainerRecord.getChild(0);
        if (escherContainerRecord2 == null || (escherSpRecord = (EscherSpRecord) escherContainerRecord2.getChildById(EscherSpRecord.RECORD_ID)) == null || (escherSpRecord.getFlags() & 64) == 0) {
            return false;
        }
        return true;
    }

    public static boolean R(EscherContainerRecord escherContainerRecord) {
        EscherSpRecord escherSpRecord;
        EscherContainerRecord escherContainerRecord2 = (EscherContainerRecord) escherContainerRecord.getChild(0);
        if (escherContainerRecord2 == null || (escherSpRecord = (EscherSpRecord) escherContainerRecord2.getChildById(EscherSpRecord.RECORD_ID)) == null || (escherSpRecord.getFlags() & 128) == 0) {
            return false;
        }
        return true;
    }

    public static Color S(EscherContainerRecord escherContainerRecord, Object obj, int i10) {
        int propertyValue;
        EscherOptRecord escherOptRecord = (EscherOptRecord) F(escherContainerRecord, -4085);
        EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) H(escherOptRecord, 448);
        EscherSimpleProperty escherSimpleProperty2 = (EscherSimpleProperty) H(escherOptRecord, 511);
        int i11 = 0;
        if (escherSimpleProperty2 == null) {
            propertyValue = 0;
        } else {
            propertyValue = escherSimpleProperty2.getPropertyValue();
        }
        if ((propertyValue & 8) != 0) {
            if (escherSimpleProperty != null) {
                return new Color(A(obj, escherSimpleProperty.getPropertyValue(), i10, true));
            }
            return new Color(0, 0, 0);
        } else if (i10 == 2) {
            return null;
        } else {
            if (escherSimpleProperty == null && i10 != 0) {
                return null;
            }
            if (escherSimpleProperty != null) {
                i11 = escherSimpleProperty.getPropertyValue();
            }
            if (i11 >= 134217728) {
                i11 = A(obj, i11 % 134217728, i10, true);
            }
            Color color = new Color(i11, true);
            return new Color(color.getBlue(), color.getGreen(), color.getRed());
        }
    }

    public static int T(EscherContainerRecord escherContainerRecord) {
        EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) H((EscherOptRecord) F(escherContainerRecord, -4085), 459);
        if (escherSimpleProperty == null) {
            return 1;
        }
        return escherSimpleProperty.getPropertyValue() / 9525;
    }

    public static int U(EscherContainerRecord escherContainerRecord) {
        EscherOptRecord escherOptRecord = (EscherOptRecord) F(escherContainerRecord, -4085);
        EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) H(escherOptRecord, 397);
        EscherSimpleProperty escherSimpleProperty2 = (EscherSimpleProperty) H(escherOptRecord, 398);
        EscherSimpleProperty escherSimpleProperty3 = (EscherSimpleProperty) H(escherOptRecord, 399);
        EscherSimpleProperty escherSimpleProperty4 = (EscherSimpleProperty) H(escherOptRecord, 400);
        if (escherSimpleProperty != null && escherSimpleProperty.getPropertyValue() == 65536 && escherSimpleProperty3 != null && escherSimpleProperty3.getPropertyValue() == 65536 && escherSimpleProperty2 != null && escherSimpleProperty2.getPropertyValue() == 65536 && escherSimpleProperty4 != null && escherSimpleProperty4.getPropertyValue() == 65536) {
            return 3;
        }
        if (escherSimpleProperty != null && escherSimpleProperty.getPropertyValue() == 32768 && escherSimpleProperty3 != null && escherSimpleProperty3.getPropertyValue() == 32768 && escherSimpleProperty2 != null && escherSimpleProperty2.getPropertyValue() == 32768 && escherSimpleProperty4 != null && escherSimpleProperty4.getPropertyValue() == 32768) {
            return 4;
        }
        if (escherSimpleProperty != null && escherSimpleProperty.getPropertyValue() == 65536 && escherSimpleProperty3 != null && escherSimpleProperty3.getPropertyValue() == 65536) {
            return 1;
        }
        if (escherSimpleProperty2 != null && escherSimpleProperty2.getPropertyValue() == 65536 && escherSimpleProperty4 != null && escherSimpleProperty4.getPropertyValue() == 65536) {
            return 2;
        }
        return 0;
    }

    public static int[] V(EscherContainerRecord escherContainerRecord) {
        int propertyValue;
        if (l0(escherContainerRecord)) {
            EscherOptRecord escherOptRecord = (EscherOptRecord) F(escherContainerRecord, -4085);
            EscherArrayProperty escherArrayProperty = (EscherArrayProperty) H(escherOptRecord, TTAdConstant.DOWNLOAD_APP_INFO_CODE);
            EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) H(escherOptRecord, 447);
            if (escherSimpleProperty == null) {
                propertyValue = 0;
            } else {
                propertyValue = escherSimpleProperty.getPropertyValue();
            }
            if (escherArrayProperty != null) {
                int numberOfElementsInArray = escherArrayProperty.getNumberOfElementsInArray();
                int[] iArr = new int[numberOfElementsInArray];
                for (int i10 = 0; i10 < numberOfElementsInArray; i10++) {
                    byte[] element = escherArrayProperty.getElement(i10);
                    if (element.length == 8) {
                        if ((propertyValue & 16) == 0) {
                            iArr[i10] = -1;
                        } else {
                            iArr[i10] = b1.W(element[0], element[1], element[2]);
                        }
                    }
                }
                return iArr;
            }
            return null;
        }
        return null;
    }

    public static float[] W(EscherContainerRecord escherContainerRecord) {
        EscherArrayProperty escherArrayProperty;
        if (l0(escherContainerRecord) && (escherArrayProperty = (EscherArrayProperty) H((EscherOptRecord) F(escherContainerRecord, -4085), TTAdConstant.DOWNLOAD_APP_INFO_CODE)) != null) {
            int numberOfElementsInArray = escherArrayProperty.getNumberOfElementsInArray();
            float[] fArr = new float[numberOfElementsInArray];
            for (int i10 = 0; i10 < numberOfElementsInArray; i10++) {
                byte[] element = escherArrayProperty.getElement(i10);
                if (element.length == 8) {
                    fArr[i10] = LittleEndian.getInt(element, 4) / 65536.0f;
                }
            }
            return fArr;
        }
        return null;
    }

    public static String X(EscherContainerRecord escherContainerRecord) {
        EscherComplexProperty escherComplexProperty = (EscherComplexProperty) H((EscherOptRecord) F(escherContainerRecord, -4085), 896);
        if (escherComplexProperty != null) {
            return StringUtil.getFromUnicodeLE(escherComplexProperty.getComplexData());
        }
        return null;
    }

    public static int Y(EscherContainerRecord escherContainerRecord) {
        EscherSimpleProperty escherSimpleProperty;
        EscherOptRecord escherOptRecord = (EscherOptRecord) F(escherContainerRecord, -4085);
        if (escherOptRecord != null && (escherSimpleProperty = (EscherSimpleProperty) H(escherOptRecord, 467)) != null) {
            return escherSimpleProperty.getPropertyValue();
        }
        return 1;
    }

    public static ug.a Z(EscherContainerRecord escherContainerRecord, Rectangle rectangle) {
        float f10;
        float f11;
        Path path;
        float f12;
        int i10;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        int i11;
        EscherOptRecord escherOptRecord = (EscherOptRecord) F(escherContainerRecord, -4085);
        escherOptRecord.addEscherProperty(new EscherSimpleProperty(EscherProperties.GEOMETRY__SHAPEPATH, 4));
        EscherArrayProperty escherArrayProperty = (EscherArrayProperty) H(escherOptRecord, 16709);
        if (escherArrayProperty == null) {
            escherArrayProperty = (EscherArrayProperty) H(escherOptRecord, 325);
        }
        EscherArrayProperty escherArrayProperty2 = (EscherArrayProperty) H(escherOptRecord, 16710);
        if (escherArrayProperty2 == null) {
            escherArrayProperty2 = (EscherArrayProperty) H(escherOptRecord, 326);
        }
        ug.a aVar = null;
        if (escherArrayProperty == null || escherArrayProperty2 == null) {
            return null;
        }
        EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) H(escherOptRecord, 322);
        EscherSimpleProperty escherSimpleProperty2 = (EscherSimpleProperty) H(escherOptRecord, 323);
        if (escherSimpleProperty != null) {
            f10 = escherSimpleProperty.getPropertyValue();
        } else {
            f10 = 0.0f;
        }
        if (escherSimpleProperty2 != null) {
            f11 = escherSimpleProperty2.getPropertyValue();
        } else {
            f11 = 0.0f;
        }
        Matrix matrix = new Matrix();
        if (f10 > 0.0f && f11 > 0.0f) {
            matrix.postScale(rectangle.width / f10, rectangle.height / f11);
        }
        EscherSimpleProperty escherSimpleProperty3 = (EscherSimpleProperty) H(escherOptRecord, 464);
        if (escherSimpleProperty3 != null && escherSimpleProperty3.getPropertyValue() > 0) {
            lh.d dVar = new lh.d((byte) escherSimpleProperty3.getPropertyValue(), a0(escherContainerRecord), Y(escherContainerRecord));
            int round = Math.round(T(escherContainerRecord) * 1.3333334f);
            int numberOfElementsInArray = escherArrayProperty.getNumberOfElementsInArray();
            escherArrayProperty2.getNumberOfElementsInArray();
            byte[] element = escherArrayProperty.getElement(0);
            if (element.length == 8) {
                f12 = LittleEndian.getInt(element, 0);
                i10 = LittleEndian.getInt(element, 4);
            } else {
                f12 = LittleEndian.getShort(element, 0);
                i10 = LittleEndian.getShort(element, 2);
            }
            float f20 = i10;
            float f21 = f12;
            byte[] element2 = escherArrayProperty2.getElement(1);
            if (!Arrays.equals(element2, f1858m) && !Arrays.equals(element2, f1859n) && !Arrays.equals(element2, f1860o) && !Arrays.equals(element2, f1857l)) {
                if ((Arrays.equals(element2, f1853h) || Arrays.equals(element2, f1854i) || Arrays.equals(element2, f1855j) || Arrays.equals(element2, f1856k)) && 2 <= numberOfElementsInArray) {
                    byte[] element3 = escherArrayProperty.getElement(1);
                    if (element3.length == 8) {
                        f19 = LittleEndian.getInt(element3, 0);
                        i11 = LittleEndian.getInt(element3, 4);
                    } else {
                        f19 = LittleEndian.getShort(element3, 0);
                        i11 = LittleEndian.getShort(element3, 2);
                    }
                    aVar = ug.b.e(f19, i11, f21, f20, dVar, (int) ((round * f10) / rectangle.width));
                }
            } else if (4 <= numberOfElementsInArray) {
                byte[] element4 = escherArrayProperty.getElement(1);
                byte[] element5 = escherArrayProperty.getElement(2);
                byte[] element6 = escherArrayProperty.getElement(3);
                if (element4.length == 8 && element5.length == 8 && element6.length == 8) {
                    f13 = LittleEndian.getInt(element6, 0);
                    f14 = LittleEndian.getInt(element4, 4);
                    f15 = LittleEndian.getInt(element6, 4);
                    f16 = LittleEndian.getInt(element5, 4);
                    f17 = LittleEndian.getInt(element4, 0);
                    f18 = LittleEndian.getInt(element5, 0);
                } else {
                    f13 = LittleEndian.getShort(element6, 0);
                    f14 = LittleEndian.getShort(element4, 2);
                    f15 = LittleEndian.getShort(element6, 2);
                    f16 = LittleEndian.getShort(element5, 2);
                    f17 = LittleEndian.getShort(element4, 0);
                    f18 = LittleEndian.getShort(element5, 0);
                }
                aVar = ug.b.d(f13, f15, f18, f16, f17, f14, f21, f20, dVar, (int) ((round * f10) / rectangle.width));
            }
        }
        if (aVar != null && (path = aVar.f30368a) != null) {
            path.transform(matrix);
        }
        return aVar;
    }

    public static int a0(EscherContainerRecord escherContainerRecord) {
        EscherSimpleProperty escherSimpleProperty;
        EscherOptRecord escherOptRecord = (EscherOptRecord) F(escherContainerRecord, -4085);
        if (escherOptRecord != null && (escherSimpleProperty = (EscherSimpleProperty) H(escherOptRecord, 466)) != null) {
            return escherSimpleProperty.getPropertyValue();
        }
        return 1;
    }

    public static float b0(EscherContainerRecord escherContainerRecord) {
        EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) H((EscherOptRecord) F(escherContainerRecord, -4085), ShapeTypes.FLOW_CHART_PROCESS);
        if (escherSimpleProperty != null) {
            return escherSimpleProperty.getPropertyValue() / 9525.0f;
        }
        return 4.8f;
    }

    public static float c0(EscherContainerRecord escherContainerRecord) {
        EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) H((EscherOptRecord) F(escherContainerRecord, -4085), 129);
        if (escherSimpleProperty != null) {
            return escherSimpleProperty.getPropertyValue() / 9525.0f;
        }
        return 9.6f;
    }

    public static float d0(EscherContainerRecord escherContainerRecord) {
        EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) H((EscherOptRecord) F(escherContainerRecord, -4085), ShapeTypes.PLUS);
        if (escherSimpleProperty != null) {
            return escherSimpleProperty.getPropertyValue() / 9525.0f;
        }
        return 9.6f;
    }

    public static float e0(EscherContainerRecord escherContainerRecord) {
        EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) H((EscherOptRecord) F(escherContainerRecord, -4085), ShapeTypes.DOUBLE_WAVE);
        if (escherSimpleProperty != null) {
            return escherSimpleProperty.getPropertyValue() / 9525.0f;
        }
        return 4.8f;
    }

    public static String f0(EscherContainerRecord escherContainerRecord) {
        EscherComplexProperty escherComplexProperty = (EscherComplexProperty) H((EscherOptRecord) F(escherContainerRecord, -4085), 192);
        if (escherComplexProperty != null) {
            return StringUtil.getFromUnicodeLE(escherComplexProperty.getComplexData());
        }
        return null;
    }

    public static void g0(File file, InputStream inputStream) {
        GZIPOutputStream gZIPOutputStream;
        byte[] bArr = new byte[8192];
        try {
            gZIPOutputStream = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read > 0) {
                        gZIPOutputStream.write(bArr, 0, read);
                    } else {
                        gZIPOutputStream.finish();
                        try {
                            gZIPOutputStream.close();
                            return;
                        } catch (RuntimeException e10) {
                            throw e10;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (gZIPOutputStream != null) {
                        try {
                            gZIPOutputStream.close();
                        } catch (RuntimeException e11) {
                            throw e11;
                        } catch (Exception unused2) {
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            gZIPOutputStream = null;
        }
    }

    public static boolean h0(EscherContainerRecord escherContainerRecord) {
        EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) H((EscherOptRecord) F(escherContainerRecord, -4085), 511);
        if (escherSimpleProperty == null || (escherSimpleProperty.getPropertyValue() & FunctionEval.FunctionID.EXTERNAL_FUNC) != 0) {
            return true;
        }
        return false;
    }

    public static boolean i0(MotionEvent motionEvent, int i10) {
        if ((motionEvent.getSource() & i10) == i10) {
            return true;
        }
        return false;
    }

    public static q9.e j(q9.m mVar) {
        return new q9.e(mVar, 1);
    }

    public static boolean j0(EscherContainerRecord escherContainerRecord) {
        EscherSimpleProperty escherSimpleProperty;
        EscherOptRecord escherOptRecord = (EscherOptRecord) F(escherContainerRecord, -4085);
        if (escherOptRecord == null || (escherSimpleProperty = (EscherSimpleProperty) H(escherOptRecord, 959)) == null || escherSimpleProperty.getPropertyValue() != 131074) {
            return false;
        }
        return true;
    }

    public static void k(String str, ArrayList arrayList, ArrayList arrayList2) {
        yd.c cVar;
        if (str.equals(ADRequestList.PANGLE_BANNER)) {
            cVar = b.b.D(v4.b.f30540a, "r", arrayList);
        } else if (str.equals(ADRequestList.PANGLE_NATIVE)) {
            cVar = b.b.D(v4.b.c, "r", arrayList);
        } else if (str.startsWith("pg-nb-")) {
            cVar = b.b.D(v4.b.c, str, arrayList);
        } else if (str.startsWith("pg-b-")) {
            cVar = b.b.D(v4.b.f30540a, str, arrayList);
        } else {
            cVar = null;
        }
        if (cVar != null) {
            arrayList2.add(cVar);
        }
    }

    public static final boolean k0(String str) {
        boolean z10;
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return false;
        }
        if (kotlin.text.k.O(str, "apps.facebook.com", false) || kotlin.text.k.O(str, "apps.instagram.com", false)) {
            return true;
        }
        if (kotlin.text.k.O(str, "data", false) && kotlin.text.k.O(str, "nonce", false)) {
            return true;
        }
        return false;
    }

    public static void l(String str, ArrayList arrayList, ArrayList arrayList2) {
        yd.c D;
        if (str.equals(ADRequestList.ADMOB_B_H)) {
            D = b.b.D(wd.a.f31073a, "h", arrayList);
        } else if (str.equals(ADRequestList.ADMOB_B_M)) {
            D = b.b.D(wd.a.f31073a, "m", arrayList);
        } else if (str.equals(ADRequestList.ADMOB_B_R)) {
            D = b.b.D(wd.a.f31073a, "r", arrayList);
        } else if (str.equals(ADRequestList.ADMOB_N_H)) {
            D = b.b.D(wd.a.f31074b, "h", arrayList);
        } else if (str.equals(ADRequestList.ADMOB_N_M)) {
            D = b.b.D(wd.a.f31074b, "m", arrayList);
        } else if (str.equals(ADRequestList.ADMOB_N_R)) {
            D = b.b.D(wd.a.f31074b, "r", arrayList);
        } else if (!str.startsWith("am1-nb-") && !str.startsWith("admob-nb-")) {
            if (!str.startsWith("am1-b-") && !str.startsWith("admob-b-")) {
                D = null;
            } else {
                D = b.b.D(wd.a.f31073a, str, arrayList);
            }
        } else {
            D = b.b.D(wd.a.f31074b, str, arrayList);
        }
        if (D != null) {
            arrayList2.add(D);
        }
    }

    public static boolean l0(EscherContainerRecord escherContainerRecord) {
        EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) H((EscherOptRecord) F(escherContainerRecord, -4085), TTAdConstant.LANDING_PAGE_TYPE_CODE);
        if (escherSimpleProperty != null && escherSimpleProperty.getPropertyValue() > 0) {
            return true;
        }
        return false;
    }

    public static void m(String str, ArrayList arrayList, ArrayList arrayList2) {
        yd.c D;
        if (str.equals(ADRequestList.ADMOB_I_H)) {
            D = b.b.D(wd.a.f31075d, "h", arrayList);
        } else if (str.equals(ADRequestList.ADMOB_I_M)) {
            D = b.b.D(wd.a.f31075d, "m", arrayList);
        } else if (str.equals(ADRequestList.ADMOB_I_R)) {
            D = b.b.D(wd.a.f31075d, "r", arrayList);
        } else if (!str.startsWith("am1-i-") && !str.startsWith("admob-i-")) {
            D = null;
        } else {
            D = b.b.D(wd.a.f31075d, str, arrayList);
        }
        if (D != null) {
            arrayList2.add(D);
        }
    }

    public static boolean m0(EscherContainerRecord escherContainerRecord) {
        EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) H((EscherOptRecord) F(escherContainerRecord, -4085), ShapeTypes.FLOW_CHART_DECISION);
        if (escherSimpleProperty == null || escherSimpleProperty.getPropertyValue() != 2) {
            return true;
        }
        return false;
    }

    public static void n(Context context, yd.a aVar, je.a aVar2, String str, ArrayList arrayList) {
        String str2;
        boolean z10;
        yd.a aVar3 = aVar;
        String str3 = "ad_m-b-";
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            boolean z11 = false;
            int i10 = 0;
            while (i10 < length) {
                String order = jSONArray.getString(i10);
                kotlin.jvm.internal.g.d(order, "order");
                if (kotlin.text.j.M(order, str3, z11)) {
                    String K = kotlin.text.j.K(order, str3, "");
                    if (TextUtils.isEmpty(K)) {
                        str2 = str3;
                        z10 = false;
                        i10++;
                        aVar3 = aVar;
                        z11 = z10;
                        str3 = str2;
                    } else {
                        str2 = str3;
                        j3.h hVar = new j3.h(K);
                        if (aVar2 != null && !kotlin.jvm.internal.g.a("", "")) {
                            ((Bundle) hVar.c).putString("common_config", "");
                        }
                        arrayList.add(new yd.c(ud.a.f30279a, order, hVar));
                        z10 = false;
                        i10++;
                        aVar3 = aVar;
                        z11 = z10;
                        str3 = str2;
                    }
                } else {
                    str2 = str3;
                    if (kotlin.text.j.M(order, "ad_m-i-", false)) {
                        String K2 = kotlin.text.j.K(order, "ad_m-i-", "");
                        if (!TextUtils.isEmpty(K2)) {
                            j3.h hVar2 = new j3.h(K2);
                            if (aVar2 != null && !kotlin.jvm.internal.g.a("", "")) {
                                ((Bundle) hVar2.c).putString("common_config", "");
                            }
                            if (aVar3 != null) {
                                ((Bundle) hVar2.c).putString("ad_position_key", aVar3.f32114b);
                            }
                            arrayList.add(new yd.c(ud.a.f30281d, order, hVar2));
                        }
                    } else if (kotlin.text.j.M(order, "ad_m-v-", false)) {
                        String K3 = kotlin.text.j.K(order, "ad_m-v-", "");
                        if (!TextUtils.isEmpty(K3)) {
                            j3.h hVar3 = new j3.h(K3);
                            if (aVar2 != null && !kotlin.jvm.internal.g.a("", "")) {
                                ((Bundle) hVar3.c).putString("common_config", "");
                            }
                            arrayList.add(new yd.c(ud.a.f30282e, order, hVar3));
                        }
                    } else {
                        if (kotlin.text.j.M(order, "ad_m-o-", false)) {
                            String K4 = kotlin.text.j.K(order, "ad_m-o-", "");
                            kotlin.jvm.internal.g.e(context, "context");
                            if (!TextUtils.isEmpty(K4)) {
                                j3.h hVar4 = new j3.h(K4);
                                if (aVar2 != null && !kotlin.jvm.internal.g.a("", "")) {
                                    ((Bundle) hVar4.c).putString("common_config", "");
                                }
                                arrayList.add(new yd.c(ud.a.f30283f, order, hVar4));
                            }
                        } else if (kotlin.text.j.M(order, "ad_m-n-", false)) {
                            t0.i(arrayList, new ie.c(kotlin.text.j.K(order, "ad_m-n-", "")), order, aVar2);
                        } else {
                            z10 = false;
                            if (kotlin.text.j.M(order, "ad_m-nb-", false)) {
                                t0.l(arrayList, new ie.c(kotlin.text.j.K(order, "ad_m-nb-", "")), order, aVar2);
                            }
                            i10++;
                            aVar3 = aVar;
                            z11 = z10;
                            str3 = str2;
                        }
                        z10 = false;
                        i10++;
                        aVar3 = aVar;
                        z11 = z10;
                        str3 = str2;
                    }
                    z10 = false;
                    i10++;
                    aVar3 = aVar;
                    z11 = z10;
                    str3 = str2;
                }
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public static boolean n0(String str) {
        if (!InMobiNetworkValues.TITLE.equals(str) && !"ctrTitle".equals(str) && !"subTitle".equals(str) && !"body".equals(str)) {
            return false;
        }
        return true;
    }

    public static void o(je.a aVar, String str, String str2, ArrayList arrayList) {
        boolean z10;
        String str3 = "order";
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            boolean z11 = false;
            int i10 = 0;
            while (i10 < length) {
                String string = jSONArray.getString(i10);
                kotlin.jvm.internal.g.d(string, str3);
                String str4 = str3;
                boolean z12 = true;
                JSONArray jSONArray2 = jSONArray;
                if (kotlin.text.j.M(string, "pg-b-", z11)) {
                    String K = kotlin.text.j.K(string, "pg-b-", "");
                    if (K.length() != 0) {
                        z12 = false;
                    }
                    if (!z12) {
                        j3.h hVar = new j3.h(K);
                        ((Bundle) hVar.c).putString("app_id", str2);
                        ie.g gVar = aVar.c;
                        if (gVar != null) {
                            ((Bundle) hVar.c).putInt("app_icon", gVar.f18488a);
                        }
                        arrayList.add(new yd.c(v4.b.f30540a, string, hVar));
                    }
                } else if (kotlin.text.j.M(string, "pg-i-", false)) {
                    String K2 = kotlin.text.j.K(string, "pg-i-", "");
                    if (K2.length() != 0) {
                        z12 = false;
                    }
                    if (!z12) {
                        j3.h hVar2 = new j3.h(K2);
                        ((Bundle) hVar2.c).putString("app_id", str2);
                        ie.g gVar2 = aVar.c;
                        if (gVar2 != null) {
                            ((Bundle) hVar2.c).putInt("app_icon", gVar2.f18488a);
                        }
                        arrayList.add(new yd.c(v4.b.f30542d, string, hVar2));
                    }
                } else if (kotlin.text.j.M(string, "pg-v-", false)) {
                    String K3 = kotlin.text.j.K(string, "pg-v-", "");
                    if (K3.length() != 0) {
                        z12 = false;
                    }
                    if (!z12) {
                        j3.h hVar3 = new j3.h(K3);
                        ((Bundle) hVar3.c).putString("app_id", str2);
                        ie.g gVar3 = aVar.c;
                        if (gVar3 != null) {
                            ((Bundle) hVar3.c).putInt("app_icon", gVar3.f18488a);
                        }
                        arrayList.add(new yd.c(v4.b.f30543e, string, hVar3));
                    }
                } else if (kotlin.text.j.M(string, "pg-o-", false)) {
                    String K4 = kotlin.text.j.K(string, "pg-o-", "");
                    if (K4.length() != 0) {
                        z12 = false;
                    }
                    if (!z12) {
                        j3.h hVar4 = new j3.h(K4);
                        ((Bundle) hVar4.c).putString("app_id", str2);
                        ie.g gVar4 = aVar.c;
                        if (gVar4 != null) {
                            ((Bundle) hVar4.c).putInt("app_icon", gVar4.f18488a);
                        }
                        arrayList.add(new yd.c(v4.b.f30544f, string, hVar4));
                    }
                } else if (kotlin.text.j.M(string, "pg-n-", false)) {
                    t0.k(arrayList, new w4.e(str2, kotlin.text.j.K(string, "pg-n-", "")), aVar, string);
                } else {
                    z10 = false;
                    if (kotlin.text.j.M(string, "pg-nb-", false)) {
                        t0.n(arrayList, new w4.d(str2, kotlin.text.j.K(string, "pg-nb-", "")), aVar, string);
                    }
                    i10++;
                    z11 = z10;
                    str3 = str4;
                    jSONArray = jSONArray2;
                }
                z10 = false;
                i10++;
                z11 = z10;
                str3 = str4;
                jSONArray = jSONArray2;
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public static k3.a o0(com.airbnb.lottie.parser.moshi.a aVar, e3.e eVar) {
        return new k3.a(o3.o.a(1.0f, eVar, o3.e.f22705a, aVar), 0);
    }

    public static void p(String str, ArrayList arrayList, ArrayList arrayList2) {
        yd.c D;
        if (str.equals(ADRequestList.ADMOB_N_H)) {
            D = b.b.D(wd.a.c, "h", arrayList);
        } else if (str.equals(ADRequestList.ADMOB_N_M)) {
            D = b.b.D(wd.a.c, "m", arrayList);
        } else if (str.equals(ADRequestList.ADMOB_N_R)) {
            D = b.b.D(wd.a.c, "r", arrayList);
        } else if (!str.startsWith("am1-n-") && !str.startsWith("admob-n-")) {
            D = null;
        } else {
            D = b.b.D(wd.a.c, str, arrayList);
        }
        if (D != null) {
            arrayList2.add(D);
        }
    }

    public static k3.b p0(JsonReader jsonReader, e3.e eVar, boolean z10) {
        float f10;
        if (z10) {
            f10 = p3.g.c();
        } else {
            f10 = 1.0f;
        }
        return new k3.b(o3.o.a(f10, eVar, t0.f28777j, jsonReader));
    }

    public static void q(String str, ArrayList arrayList, ArrayList arrayList2) {
        yd.c D;
        if (str.equals(ADRequestList.ADMOB_S_H)) {
            D = b.b.D(wd.a.f31077f, "h", arrayList);
        } else if (str.equals(ADRequestList.ADMOB_S_M)) {
            D = b.b.D(wd.a.f31077f, "m", arrayList);
        } else if (str.equals(ADRequestList.ADMOB_S_R)) {
            D = b.b.D(wd.a.f31077f, "r", arrayList);
        } else if (!str.startsWith("am1-o-") && !str.startsWith("admob-o-")) {
            D = null;
        } else {
            D = b.b.D(wd.a.f31077f, str, arrayList);
        }
        if (D != null) {
            arrayList2.add(D);
        }
    }

    public static k3.d q0(com.airbnb.lottie.parser.moshi.a aVar, e3.e eVar) {
        return new k3.d(o3.o.a(1.0f, eVar, b1.f13191o, aVar));
    }

    public static final boolean r(byte[] a10, int i10, int i11, byte[] b10, int i12) {
        kotlin.jvm.internal.g.e(a10, "a");
        kotlin.jvm.internal.g.e(b10, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (a10[i13 + i10] != b10[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static k3.f r0(com.airbnb.lottie.parser.moshi.a aVar, e3.e eVar) {
        return new k3.f(o3.o.a(p3.g.c(), eVar, o3.s.f22729a, aVar));
    }

    public static boolean s(o9.a aVar) {
        if (aVar.f22747b != 2) {
            return false;
        }
        if (!aVar.a(1) && !aVar.a(0)) {
            return false;
        }
        return true;
    }

    public static final int s0(ByteString byteString, int i10) {
        kotlin.jvm.internal.g.e(byteString, "<this>");
        if (i10 == -1234567890) {
            return byteString.size();
        }
        return i10;
    }

    public static final int t(String str) {
        if (kotlin.text.j.M(str, "gclid", false)) {
            return 1;
        }
        if (kotlin.text.j.M(str, "applovin", false)) {
            return 4;
        }
        if (kotlin.text.j.M(str, "moloco", false)) {
            return 6;
        }
        if (k0(str)) {
            return 3;
        }
        if (kotlin.text.k.O(str, "utm_medium=organic", false) || kotlin.text.k.O(str, "utm_medium=(not%20set)", false)) {
            return 0;
        }
        return 99;
    }

    public static final void t0(View view, q onBackPressedDispatcherOwner) {
        kotlin.jvm.internal.g.e(view, "<this>");
        kotlin.jvm.internal.g.e(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, onBackPressedDispatcherOwner);
    }

    public static final void u(long j10, long j11, long j12) {
        if ((j11 | j12) >= 0 && j11 <= j10 && j10 - j11 >= j12) {
            return;
        }
        StringBuilder h10 = r.h("size=", j10, " offset=");
        h10.append(j11);
        h10.append(" byteCount=");
        h10.append(j12);
        throw new ArrayIndexOutOfBoundsException(h10.toString());
    }

    public static final void u0(Object obj) {
        if (!(obj instanceof Result.Failure)) {
            return;
        }
        throw ((Result.Failure) obj).exception;
    }

    public static final Result.Failure v(Throwable exception) {
        kotlin.jvm.internal.g.e(exception, "exception");
        return new Result.Failure(exception);
    }

    public static final void v0(Context context) {
        char c10;
        char c11;
        kotlin.jvm.internal.g.e(context, "context");
        if (Decoder.f18572a) {
            try {
                String substring = hc.a.b(context).substring(2005, 2036);
                kotlin.jvm.internal.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                Charset charset = kotlin.text.a.f19966b;
                byte[] bytes = substring.getBytes(charset);
                kotlin.jvm.internal.g.d(bytes, "this as java.lang.String).getBytes(charset)");
                byte[] bytes2 = "56eab6559989a291642e4cb6a54f6ba".getBytes(charset);
                kotlin.jvm.internal.g.d(bytes2, "this as java.lang.String).getBytes(charset)");
                long j10 = 2;
                if (System.currentTimeMillis() % j10 == 0) {
                    int nextInt = hc.a.f18144a.nextInt(0, bytes.length / 2);
                    int i10 = 0;
                    while (true) {
                        if (i10 <= nextInt) {
                            if (bytes[i10] != bytes2[i10]) {
                                c11 = 16;
                                break;
                            }
                            i10++;
                        } else {
                            c11 = 0;
                            break;
                        }
                    }
                    if ((c11 ^ 0) != 0) {
                        hc.a.a();
                        throw null;
                    }
                } else if (!Arrays.equals(bytes2, bytes)) {
                    hc.a.a();
                    throw null;
                }
                try {
                    String substring2 = fd.a.b(context).substring(1099, 1130);
                    kotlin.jvm.internal.g.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    Charset charset2 = kotlin.text.a.f19966b;
                    byte[] bytes3 = substring2.getBytes(charset2);
                    kotlin.jvm.internal.g.d(bytes3, "this as java.lang.String).getBytes(charset)");
                    byte[] bytes4 = "3815c0cabea059f4d8c0f9ba4f92a34".getBytes(charset2);
                    kotlin.jvm.internal.g.d(bytes4, "this as java.lang.String).getBytes(charset)");
                    if (System.currentTimeMillis() % j10 == 0) {
                        int nextInt2 = fd.a.f17268a.nextInt(0, bytes3.length / 2);
                        int i11 = 0;
                        while (true) {
                            if (i11 <= nextInt2) {
                                if (bytes3[i11] != bytes4[i11]) {
                                    c10 = 16;
                                    break;
                                }
                                i11++;
                            } else {
                                c10 = 0;
                                break;
                            }
                        }
                        if ((c10 ^ 0) != 0) {
                            fd.a.a();
                            throw null;
                        }
                        return;
                    } else if (!Arrays.equals(bytes4, bytes3)) {
                        fd.a.a();
                        throw null;
                    } else {
                        return;
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                    fd.a.a();
                    throw null;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                hc.a.a();
                throw null;
            }
        }
        ReaderPdfApplication.o(context);
    }

    public static String w(String str) {
        if (str.length() >= 124) {
            return str.substring(0, 124) + "...";
        }
        return str;
    }

    public static final void w0(Context context) {
        char c10;
        kotlin.jvm.internal.g.e(context, "context");
        if (Decoder.f18572a) {
            try {
                String substring = pc.a.b(context).substring(2748, 2779);
                kotlin.jvm.internal.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                Charset charset = kotlin.text.a.f19966b;
                byte[] bytes = substring.getBytes(charset);
                kotlin.jvm.internal.g.d(bytes, "this as java.lang.String).getBytes(charset)");
                byte[] bytes2 = "12ad00af63fedcc0b3fd8fa3d59f7e6".getBytes(charset);
                kotlin.jvm.internal.g.d(bytes2, "this as java.lang.String).getBytes(charset)");
                if (System.currentTimeMillis() % 2 == 0) {
                    int i10 = 0;
                    int nextInt = pc.a.f23846a.nextInt(0, bytes.length / 2);
                    while (true) {
                        if (i10 <= nextInt) {
                            if (bytes[i10] != bytes2[i10]) {
                                c10 = 16;
                                break;
                            }
                            i10++;
                        } else {
                            c10 = 0;
                            break;
                        }
                    }
                    if ((c10 ^ 0) != 0) {
                        pc.a.a();
                        throw null;
                    }
                } else if (!Arrays.equals(bytes2, bytes)) {
                    pc.a.a();
                    throw null;
                }
                qd.a.c(context);
                return;
            } catch (Exception e10) {
                e10.printStackTrace();
                pc.a.a();
                throw null;
            }
        }
        ReaderPdfApplication.o(context);
    }

    public static boolean x(Context context) {
        long j10;
        try {
            j10 = context.getResources().getInteger(R.integer.build_time) * 10000;
        } catch (Exception e10) {
            e10.printStackTrace();
            j10 = 0;
        }
        if (j10 > System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    public static final void x0(jl.a context) {
        char c10;
        char c11;
        kotlin.jvm.internal.g.e(context, "context");
        if (Decoder.f18572a) {
            try {
                String substring = uc.a.b(context).substring(2463, 2494);
                kotlin.jvm.internal.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                Charset charset = kotlin.text.a.f19966b;
                byte[] bytes = substring.getBytes(charset);
                kotlin.jvm.internal.g.d(bytes, "this as java.lang.String).getBytes(charset)");
                byte[] bytes2 = "481d39ae0d49c28e479f3e11f3603ce".getBytes(charset);
                kotlin.jvm.internal.g.d(bytes2, "this as java.lang.String).getBytes(charset)");
                long j10 = 2;
                if (System.currentTimeMillis() % j10 == 0) {
                    int nextInt = uc.a.f30278a.nextInt(0, bytes.length / 2);
                    int i10 = 0;
                    while (true) {
                        if (i10 <= nextInt) {
                            if (bytes[i10] != bytes2[i10]) {
                                c11 = 16;
                                break;
                            }
                            i10++;
                        } else {
                            c11 = 0;
                            break;
                        }
                    }
                    if ((c11 ^ 0) != 0) {
                        uc.a.a();
                        throw null;
                    }
                } else if (!Arrays.equals(bytes2, bytes)) {
                    uc.a.a();
                    throw null;
                }
                try {
                    String substring2 = mc.a.b(context).substring(30, 61);
                    kotlin.jvm.internal.g.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    Charset charset2 = kotlin.text.a.f19966b;
                    byte[] bytes3 = substring2.getBytes(charset2);
                    kotlin.jvm.internal.g.d(bytes3, "this as java.lang.String).getBytes(charset)");
                    byte[] bytes4 = "00853389ca28657d17815631b10e651".getBytes(charset2);
                    kotlin.jvm.internal.g.d(bytes4, "this as java.lang.String).getBytes(charset)");
                    if (System.currentTimeMillis() % j10 == 0) {
                        int nextInt2 = mc.a.f21990a.nextInt(0, bytes3.length / 2);
                        int i11 = 0;
                        while (true) {
                            if (i11 <= nextInt2) {
                                if (bytes3[i11] != bytes4[i11]) {
                                    c10 = 16;
                                    break;
                                }
                                i11++;
                            } else {
                                c10 = 0;
                                break;
                            }
                        }
                        if ((c10 ^ 0) != 0) {
                            mc.a.a();
                            throw null;
                        }
                        return;
                    } else if (!Arrays.equals(bytes4, bytes3)) {
                        mc.a.a();
                        throw null;
                    } else {
                        return;
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                    mc.a.a();
                    throw null;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                uc.a.a();
                throw null;
            }
        }
        ReaderPdfApplication.o(context);
    }

    public static void y() {
        int i10 = c;
        if (i10 > 0) {
            c = i10 - 1;
        }
    }

    public static final void y0(Context context) {
        char c10;
        char c11;
        kotlin.jvm.internal.g.e(context, "context");
        if (Decoder.f18572a) {
            try {
                String substring = sd.a.b(context).substring(941, 972);
                kotlin.jvm.internal.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                Charset charset = kotlin.text.a.f19966b;
                byte[] bytes = substring.getBytes(charset);
                kotlin.jvm.internal.g.d(bytes, "this as java.lang.String).getBytes(charset)");
                byte[] bytes2 = "300396bbce19842cf2607e8baa29a49".getBytes(charset);
                kotlin.jvm.internal.g.d(bytes2, "this as java.lang.String).getBytes(charset)");
                long j10 = 2;
                if (System.currentTimeMillis() % j10 == 0) {
                    int nextInt = sd.a.f29792a.nextInt(0, bytes.length / 2);
                    int i10 = 0;
                    while (true) {
                        if (i10 <= nextInt) {
                            if (bytes[i10] != bytes2[i10]) {
                                c11 = 16;
                                break;
                            }
                            i10++;
                        } else {
                            c11 = 0;
                            break;
                        }
                    }
                    if ((c11 ^ 0) != 0) {
                        sd.a.a();
                        throw null;
                    }
                } else if (!Arrays.equals(bytes2, bytes)) {
                    sd.a.a();
                    throw null;
                }
                try {
                    String substring2 = dd.a.b(context).substring(Constants.CP_WINDOWS_1257, 1288);
                    kotlin.jvm.internal.g.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    Charset charset2 = kotlin.text.a.f19966b;
                    byte[] bytes3 = substring2.getBytes(charset2);
                    kotlin.jvm.internal.g.d(bytes3, "this as java.lang.String).getBytes(charset)");
                    byte[] bytes4 = "360761750a07cc764bb2062e9b8133d".getBytes(charset2);
                    kotlin.jvm.internal.g.d(bytes4, "this as java.lang.String).getBytes(charset)");
                    if (System.currentTimeMillis() % j10 == 0) {
                        int nextInt2 = dd.a.f16188a.nextInt(0, bytes3.length / 2);
                        int i11 = 0;
                        while (true) {
                            if (i11 <= nextInt2) {
                                if (bytes3[i11] != bytes4[i11]) {
                                    c10 = 16;
                                    break;
                                }
                                i11++;
                            } else {
                                c10 = 0;
                                break;
                            }
                        }
                        if ((c10 ^ 0) != 0) {
                            dd.a.a();
                            throw null;
                        }
                        return;
                    } else if (!Arrays.equals(bytes4, bytes3)) {
                        dd.a.a();
                        throw null;
                    } else {
                        return;
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                    dd.a.a();
                    throw null;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                sd.a.a();
                throw null;
            }
        }
        ReaderPdfApplication.o(context);
    }

    public static Float[] z(EscherContainerRecord escherContainerRecord) {
        Integer num;
        EscherOptRecord escherOptRecord = (EscherOptRecord) F(escherContainerRecord, -4085);
        if (escherOptRecord != null) {
            HashMap hashMap = new HashMap();
            int i10 = 0;
            for (int i11 = 0; i11 < 10; i11++) {
                EscherSimpleProperty escherSimpleProperty = (EscherSimpleProperty) H(escherOptRecord, i11 + 327);
                if (escherSimpleProperty != null) {
                    hashMap.put(Integer.valueOf(i11), Integer.valueOf(escherSimpleProperty.getPropertyValue()));
                    if (i11 > i10) {
                        i10 = i11;
                    }
                }
            }
            if (hashMap.size() > 0) {
                Float[] fArr = new Float[i10 + 1];
                for (int i12 = 0; i12 <= i10; i12++) {
                    if (((Integer) hashMap.get(Integer.valueOf(i12))) != null) {
                        fArr[i12] = Float.valueOf(num.intValue() / 21600.0f);
                    }
                }
                return fArr;
            }
        }
        return null;
    }

    public static final void z0(OfficeReaderActivity officeReaderActivity) {
        char c10;
        if (Decoder.f18572a) {
            try {
                String substring = md.a.b(officeReaderActivity).substring(1010, 1041);
                kotlin.jvm.internal.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                Charset charset = kotlin.text.a.f19966b;
                byte[] bytes = substring.getBytes(charset);
                kotlin.jvm.internal.g.d(bytes, "this as java.lang.String).getBytes(charset)");
                byte[] bytes2 = "b7c67de77f9dc1f026989c439d945ef".getBytes(charset);
                kotlin.jvm.internal.g.d(bytes2, "this as java.lang.String).getBytes(charset)");
                if (System.currentTimeMillis() % 2 == 0) {
                    int i10 = 0;
                    int nextInt = md.a.f21991a.nextInt(0, bytes.length / 2);
                    while (true) {
                        if (i10 <= nextInt) {
                            if (bytes[i10] != bytes2[i10]) {
                                c10 = 16;
                                break;
                            }
                            i10++;
                        } else {
                            c10 = 0;
                            break;
                        }
                    }
                    if ((c10 ^ 0) != 0) {
                        md.a.a();
                        throw null;
                    }
                } else if (!Arrays.equals(bytes2, bytes)) {
                    md.a.a();
                    throw null;
                }
                yc.a.c(officeReaderActivity);
                return;
            } catch (Exception e10) {
                e10.printStackTrace();
                md.a.a();
                throw null;
            }
        }
        ReaderPdfApplication.o(officeReaderActivity);
    }

    @Override // gf.i
    public ByteBuffer b(wk.g gVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", (String) gVar.f31333a);
            jSONObject.put("args", gf.e.a(gVar.f31334b));
            Object a10 = gf.e.a(jSONObject);
            if (a10 instanceof String) {
                gf.l lVar = gf.l.f17805b;
                String quote = JSONObject.quote((String) a10);
                lVar.getClass();
                return gf.l.d(quote);
            }
            gf.l lVar2 = gf.l.f17805b;
            String obj = a10.toString();
            lVar2.getClass();
            return gf.l.d(obj);
        } catch (JSONException e10) {
            throw new IllegalArgumentException("Invalid JSON", e10);
        }
    }

    @Override // com.google.android.tools.h
    public String c() {
        boolean z10;
        try {
            AdjustAttribution attribution = Adjust.getAttribution();
            if (attribution != null) {
                String str = attribution.network;
                kotlin.jvm.internal.g.d(str, ea.a.p("LmRbdQp0dnQuciNiAHQBb1suAGUxdwpyaw==", "JFYveeoi"));
                if (str.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    ea.a.p("cmQhdQB0MURL", "1Euk3I0d");
                    String str2 = attribution.network;
                    kotlin.jvm.internal.g.d(str2, ea.a.p("OWQOdUB0GXQ8cg9iQXQ-b1YuPGU9d1lyaw==", "UzXd3XH4"));
                    return str2;
                }
                return "";
            }
            return "";
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    @Override // gf.i
    public wk.g e(ByteBuffer byteBuffer) {
        Object nextValue;
        Object obj = null;
        try {
            if (byteBuffer == null) {
                nextValue = null;
            } else {
                try {
                    gf.l.f17805b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(gf.l.c(byteBuffer));
                    nextValue = jSONTokener.nextValue();
                    if (jSONTokener.more()) {
                        throw new IllegalArgumentException("Invalid JSON");
                    }
                } catch (JSONException e10) {
                    throw new IllegalArgumentException("Invalid JSON", e10);
                }
            }
            if (nextValue instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) nextValue;
                Object obj2 = jSONObject.get("method");
                Object opt = jSONObject.opt("args");
                if (opt != JSONObject.NULL) {
                    obj = opt;
                }
                if (obj2 instanceof String) {
                    return new wk.g((String) obj2, obj);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + nextValue);
        } catch (JSONException e11) {
            throw new IllegalArgumentException("Invalid JSON", e11);
        }
    }

    @Override // gf.i
    public ByteBuffer g(Object obj) {
        JSONArray put = new JSONArray().put(gf.e.a(obj));
        if (put == null) {
            return null;
        }
        Object a10 = gf.e.a(put);
        if (a10 instanceof String) {
            gf.l lVar = gf.l.f17805b;
            String quote = JSONObject.quote((String) a10);
            lVar.getClass();
            return gf.l.d(quote);
        }
        gf.l lVar2 = gf.l.f17805b;
        String obj2 = a10.toString();
        lVar2.getClass();
        return gf.l.d(obj2);
    }

    @Override // gf.i
    public ByteBuffer h(String str, String str2) {
        JSONArray put = new JSONArray().put("error").put(gf.e.a(str)).put(gf.e.a(null)).put(gf.e.a(str2));
        if (put == null) {
            return null;
        }
        Object a10 = gf.e.a(put);
        if (a10 instanceof String) {
            gf.l lVar = gf.l.f17805b;
            String quote = JSONObject.quote((String) a10);
            lVar.getClass();
            return gf.l.d(quote);
        }
        gf.l lVar2 = gf.l.f17805b;
        String obj = a10.toString();
        lVar2.getClass();
        return gf.l.d(obj);
    }

    @Override // gf.i
    public ByteBuffer i(String str, String str2, Object obj) {
        JSONArray put = new JSONArray().put(str).put(gf.e.a(str2)).put(gf.e.a(obj));
        if (put == null) {
            return null;
        }
        Object a10 = gf.e.a(put);
        if (a10 instanceof String) {
            gf.l lVar = gf.l.f17805b;
            String quote = JSONObject.quote((String) a10);
            lVar.getClass();
            return gf.l.d(quote);
        }
        gf.l lVar2 = gf.l.f17805b;
        String obj2 = a10.toString();
        lVar2.getClass();
        return gf.l.d(obj2);
    }

    @Override // x0.o0
    public void f() {
    }

    @Override // x0.o0
    public void d(View view) {
    }
}
