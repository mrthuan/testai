package aj;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.billingclient.api.a0;
import com.google.android.gms.internal.play_billing.zzhe;
import com.google.android.gms.stats.zzd;
import com.google.android.play.core.assetpacks.p2;
import com.lib.flutter.encrypt.EngineHelper;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import gl.q;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.d0;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.flow.internal.j;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.y;
import kotlinx.coroutines.y0;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.hssf.record.UnknownRecord;
import okhttp3.x;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p4.a;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.utils.c1;
import pdf.pdfreader.viewer.editor.free.utils.s0;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import sg.e;

/* compiled from: CharsetDetector.java */
/* loaded from: classes3.dex */
public class b implements o, s6.d, h4.b, r5.a, zzd, q9.l, qe.b, okhttp3.b {

    /* renamed from: g  reason: collision with root package name */
    public static com.google.android.tools.h f559g = null;

    /* renamed from: h  reason: collision with root package name */
    public static Toast f560h = null;

    /* renamed from: q  reason: collision with root package name */
    public static boolean f569q = false;

    /* renamed from: r  reason: collision with root package name */
    public static boolean f570r = false;

    /* renamed from: s  reason: collision with root package name */
    public static cg.a f571s = null;

    /* renamed from: t  reason: collision with root package name */
    public static Boolean f572t = null;

    /* renamed from: u  reason: collision with root package name */
    public static int f573u = -1;

    /* renamed from: v  reason: collision with root package name */
    public static Integer f574v;

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f554a = {".pdf"};

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f555b = {".txt"};
    public static final String[] c = {".doc", ".docx", ".dot", ".dotx", ".dotm"};

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f556d = {".ppt", ".pptx", ".pot", ".pptm", ".potx", ".potm"};

    /* renamed from: e  reason: collision with root package name */
    public static final String[] f557e = {".xls", ".xlsx", ".xlt", ".xltx", ".xlsm", ".xltm"};

    /* renamed from: f  reason: collision with root package name */
    public static final y f558f = new y(0);

    /* renamed from: i  reason: collision with root package name */
    public static final a0 f561i = new a0("COMPLETING_ALREADY", 8);

    /* renamed from: j  reason: collision with root package name */
    public static final a0 f562j = new a0("COMPLETING_WAITING_CHILDREN", 8);

    /* renamed from: k  reason: collision with root package name */
    public static final a0 f563k = new a0("COMPLETING_RETRY", 8);

    /* renamed from: l  reason: collision with root package name */
    public static final a0 f564l = new a0("TOO_LATE_TO_CANCEL", 8);

    /* renamed from: m  reason: collision with root package name */
    public static final a0 f565m = new a0("SEALED", 8);

    /* renamed from: n  reason: collision with root package name */
    public static final m0 f566n = new m0(false);

    /* renamed from: o  reason: collision with root package name */
    public static final m0 f567o = new m0(true);

    /* renamed from: p  reason: collision with root package name */
    public static final char[] f568p = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public b() {
    }

    public static Path A(lh.e eVar, Rect rect) {
        float f10;
        float f11;
        float f12;
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
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        float f29;
        float f30;
        float f31;
        float f32;
        float f33;
        float f34;
        float f35;
        float f36;
        float f37;
        float f38;
        float f39;
        float f40;
        float f41;
        float f42;
        float f43;
        float f44;
        float f45;
        sg.e eVar2 = e.a.f29807a;
        Path d10 = eVar2.d("StarPathBuilder");
        d10.reset();
        int i10 = eVar.f20615m;
        if (i10 != 12 && i10 != 92 && i10 != 187) {
            if (i10 == 71) {
                Path d11 = eVar2.d("StarPathBuilder");
                Matrix c10 = eVar2.c("StarPathBuilder");
                d11.moveTo(66.0f, 206.0f);
                d11.lineTo(0.0f, 150.0f);
                d11.lineTo(83.0f, 134.0f);
                d11.lineTo(8.0f, 41.0f);
                d11.lineTo(128.0f, 112.0f);
                d11.lineTo(147.0f, 42.0f);
                d11.lineTo(190.0f, 103.0f);
                d11.lineTo(255.0f, 0.0f);
                d11.lineTo(250.0f, 93.0f);
                d11.lineTo(323.0f, 78.0f);
                d11.lineTo(294.0f, 128.0f);
                d11.lineTo(370.0f, 142.0f);
                d11.lineTo(310.0f, 185.0f);
                d11.lineTo(380.0f, 233.0f);
                d11.lineTo(296.0f, 228.0f);
                d11.lineTo(319.0f, 318.0f);
                d11.lineTo(247.0f, 255.0f);
                d11.lineTo(233.0f, 346.0f);
                d11.lineTo(185.0f, 263.0f);
                d11.lineTo(149.0f, 380.0f);
                d11.lineTo(135.0f, 275.0f);
                d11.lineTo(84.0f, 309.0f);
                d11.lineTo(99.0f, 245.0f);
                d11.lineTo(0.0f, 256.0f);
                d11.close();
                c10.reset();
                c10.postScale(rect.width() / 380.0f, rect.height() / 380.0f);
                d11.transform(c10);
                d11.offset(rect.left, rect.top);
                return d11;
            } else if (i10 == 72) {
                Path d12 = eVar2.d("StarPathBuilder");
                Matrix c11 = eVar2.c("StarPathBuilder");
                d12.moveTo(70.0f, 203.0f);
                d12.lineTo(20.0f, 143.0f);
                d12.lineTo(95.0f, 137.0f);
                d12.lineTo(79.0f, 64.0f);
                d12.lineTo(151.0f, 113.0f);
                d12.lineTo(170.0f, 32.0f);
                d12.lineTo(202.0f, 76.0f);
                d12.lineTo(260.0f, 0.0f);
                d12.lineTo(255.0f, 101.0f);
                d12.lineTo(316.0f, 55.0f);
                d12.lineTo(287.0f, 114.0f);
                d12.lineTo(380.0f, 115.0f);
                d12.lineTo(298.0f, 164.0f);
                d12.lineTo(321.0f, 198.0f);
                d12.lineTo(287.0f, 215.0f);
                d12.lineTo(331.0f, 273.0f);
                d12.lineTo(257.0f, 251.0f);
                d12.lineTo(262.0f, 304.0f);
                d12.lineTo(215.0f, 280.0f);
                d12.lineTo(204.0f, 330.0f);
                d12.lineTo(174.0f, 304.0f);
                d12.lineTo(153.0f, 345.0f);
                d12.lineTo(132.0f, 317.0f);
                d12.lineTo(86.0f, 380.0f);
                d12.lineTo(85.0f, 319.0f);
                d12.lineTo(23.0f, 313.0f);
                d12.lineTo(58.0f, 269.0f);
                d12.lineTo(0.0f, 225.0f);
                d12.close();
                c11.reset();
                c11.postScale(rect.width() / 380.0f, rect.height() / 380.0f);
                d12.transform(c11);
                d12.offset(rect.left, rect.top);
                return d12;
            } else {
                switch (i10) {
                    case 58:
                    case 59:
                    case 60:
                        break;
                    default:
                        switch (i10) {
                            case 235:
                            case 236:
                            case 237:
                            case 238:
                            case UnknownRecord.PHONETICPR_00EF /* 239 */:
                                break;
                            default:
                                return d10;
                        }
                }
            }
        }
        if (eVar.f20617o) {
            Matrix matrix = ch.b.f5689a;
            if (i10 != 12) {
                if (i10 == 92) {
                    Float[] fArr = eVar.f20616n;
                    float min = Math.min(rect.width(), rect.height());
                    if (fArr == null || fArr.length != 1) {
                        f24 = min * 0.368f;
                        f25 = f24;
                    } else {
                        if (fArr[0].floatValue() > 0.5f) {
                            fArr[0] = Float.valueOf(0.5f);
                        }
                        f24 = fArr[0].floatValue() * min;
                        f25 = fArr[0].floatValue() * min;
                    }
                    int i11 = ((int) min) / 2;
                    Path z10 = z(i11, i11, (int) f24, (int) f25, 24);
                    matrix.reset();
                    matrix.postScale(rect.width() / min, rect.height() / min);
                    z10.transform(matrix);
                    z10.offset(rect.centerX(), rect.centerY());
                    return z10;
                } else if (i10 != 187) {
                    switch (i10) {
                        case 58:
                            Float[] fArr2 = eVar.f20616n;
                            float min2 = Math.min(rect.width(), rect.height());
                            if (fArr2 == null || fArr2.length != 1) {
                                f28 = min2 * 0.36f;
                                f29 = f28;
                            } else {
                                if (fArr2[0].floatValue() > 0.5f) {
                                    fArr2[0] = Float.valueOf(0.5f);
                                }
                                f28 = fArr2[0].floatValue() * min2;
                                f29 = fArr2[0].floatValue() * min2;
                            }
                            int i12 = (int) (min2 / 2.0f);
                            Path z11 = z(i12, i12, (int) f28, (int) f29, 8);
                            matrix.reset();
                            matrix.postScale(rect.width() / min2, rect.height() / min2);
                            z11.transform(matrix);
                            z11.offset(rect.centerX(), rect.centerY());
                            return z11;
                        case 59:
                            Float[] fArr3 = eVar.f20616n;
                            float min3 = Math.min(rect.width(), rect.height());
                            if (fArr3 == null || fArr3.length != 1) {
                                f30 = min3 * 0.368f;
                                f31 = f30;
                            } else {
                                if (fArr3[0].floatValue() > 0.5f) {
                                    fArr3[0] = Float.valueOf(0.5f);
                                }
                                f30 = fArr3[0].floatValue() * min3;
                                f31 = fArr3[0].floatValue() * min3;
                            }
                            int i13 = ((int) min3) / 2;
                            Path z12 = z(i13, i13, (int) f30, (int) f31, 16);
                            matrix.reset();
                            matrix.postScale(rect.width() / min3, rect.height() / min3);
                            z12.transform(matrix);
                            z12.offset(rect.centerX(), rect.centerY());
                            return z12;
                        case 60:
                            Float[] fArr4 = eVar.f20616n;
                            float min4 = Math.min(rect.width(), rect.height());
                            if (fArr4 == null || fArr4.length != 1) {
                                f32 = min4 * 0.368f;
                                f33 = f32;
                            } else {
                                if (fArr4[0].floatValue() > 0.5f) {
                                    fArr4[0] = Float.valueOf(0.5f);
                                }
                                f32 = fArr4[0].floatValue() * min4;
                                f33 = fArr4[0].floatValue() * min4;
                            }
                            int i14 = ((int) min4) / 2;
                            Path z13 = z(i14, i14, (int) f32, (int) f33, 32);
                            matrix.reset();
                            matrix.postScale(rect.width() / min4, rect.height() / min4);
                            z13.transform(matrix);
                            z13.offset(rect.centerX(), rect.centerY());
                            return z13;
                        default:
                            switch (i10) {
                                case 235:
                                    break;
                                case 236:
                                    Float[] fArr5 = eVar.f20616n;
                                    float min5 = Math.min(rect.width(), rect.height());
                                    if (fArr5 == null || fArr5.length != 2) {
                                        f34 = min5 * 1.1547f;
                                        f35 = f34 * 0.28f;
                                        f36 = 0.28f * min5;
                                    } else {
                                        f34 = fArr5[1].floatValue() * min5;
                                        if (fArr5[0].floatValue() > 0.5f) {
                                            fArr5[0] = Float.valueOf(0.5f);
                                        }
                                        f35 = fArr5[0].floatValue() * f34;
                                        f36 = fArr5[0].floatValue() * min5;
                                    }
                                    Path z14 = z((int) (f34 / 2.0f), (int) (min5 / 2.0f), (int) f35, (int) f36, 6);
                                    matrix.reset();
                                    matrix.postScale(rect.width() / min5, rect.height() / min5);
                                    z14.transform(matrix);
                                    z14.offset(rect.centerX(), rect.centerY());
                                    return z14;
                                case 237:
                                    Float[] fArr6 = eVar.f20616n;
                                    float min6 = Math.min(rect.width(), rect.height());
                                    if (fArr6 == null || fArr6.length != 3) {
                                        f37 = min6 * 1.02572f;
                                        f38 = min6 * 1.0521f;
                                        f39 = f37 * 0.32f;
                                        f40 = 0.32f * f38;
                                    } else {
                                        f37 = fArr6[1].floatValue() * min6;
                                        f38 = fArr6[2].floatValue() * min6;
                                        if (fArr6[0].floatValue() > 0.5f) {
                                            fArr6[0] = Float.valueOf(0.5f);
                                        }
                                        f39 = fArr6[0].floatValue() * f37;
                                        f40 = fArr6[0].floatValue() * f38;
                                    }
                                    Path z15 = z((int) (f37 / 2.0f), (int) (f38 / 2.0f), (int) f39, (int) f40, 7);
                                    matrix.reset();
                                    matrix.postScale(rect.width() / min6, rect.height() / min6);
                                    z15.transform(matrix);
                                    z15.offset(rect.centerX(), rect.centerY());
                                    return z15;
                                case 238:
                                    Float[] fArr7 = eVar.f20616n;
                                    float min7 = Math.min(rect.width(), rect.height());
                                    if (fArr7 == null || fArr7.length != 2) {
                                        f41 = min7 * 1.05146f;
                                        f42 = f41 * 0.42f;
                                        f43 = 0.42f * min7;
                                    } else {
                                        f41 = fArr7[1].floatValue() * min7;
                                        if (fArr7[0].floatValue() > 0.5f) {
                                            fArr7[0] = Float.valueOf(0.5f);
                                        }
                                        f42 = fArr7[0].floatValue() * f41;
                                        f43 = fArr7[0].floatValue() * min7;
                                    }
                                    Path z16 = z(((int) f41) / 2, ((int) min7) / 2, (int) f42, (int) f43, 10);
                                    matrix.reset();
                                    matrix.postScale(rect.width() / min7, rect.height() / min7);
                                    z16.transform(matrix);
                                    z16.offset(rect.centerX(), rect.centerY());
                                    return z16;
                                case UnknownRecord.PHONETICPR_00EF /* 239 */:
                                    Float[] fArr8 = eVar.f20616n;
                                    float min8 = Math.min(rect.width(), rect.height());
                                    if (fArr8 == null || fArr8.length != 1) {
                                        f44 = min8 * 0.368f;
                                        f45 = f44;
                                    } else {
                                        if (fArr8[0].floatValue() > 0.5f) {
                                            fArr8[0] = Float.valueOf(0.5f);
                                        }
                                        f44 = fArr8[0].floatValue() * min8;
                                        f45 = fArr8[0].floatValue() * min8;
                                    }
                                    int i15 = ((int) min8) / 2;
                                    Path z17 = z(i15, i15, (int) f44, (int) f45, 12);
                                    matrix.reset();
                                    matrix.postScale(rect.width() / min8, rect.height() / min8);
                                    z17.transform(matrix);
                                    z17.offset(rect.centerX(), rect.centerY());
                                    return z17;
                                default:
                                    return null;
                            }
                    }
                } else {
                    Float[] fArr9 = eVar.f20616n;
                    float min9 = Math.min(rect.width(), rect.height());
                    if (fArr9 == null || fArr9.length != 1) {
                        f26 = min9 * 0.125f;
                        f27 = f26;
                    } else {
                        if (fArr9[0].floatValue() > 0.5f) {
                            fArr9[0] = Float.valueOf(0.5f);
                        }
                        f26 = fArr9[0].floatValue() * min9;
                        f27 = fArr9[0].floatValue() * min9;
                    }
                    int i16 = (int) (min9 / 2.0f);
                    Path z18 = z(i16, i16, (int) f26, (int) f27, 4);
                    matrix.reset();
                    matrix.postScale(rect.width() / min9, rect.height() / min9);
                    z18.transform(matrix);
                    z18.offset(rect.centerX(), rect.centerY());
                    return z18;
                }
            }
            Float[] fArr10 = eVar.f20616n;
            float min10 = Math.min(rect.width(), rect.height());
            if (fArr10 == null || fArr10.length != 3) {
                f20 = min10 * 1.05146f;
                f21 = min10 * 1.10557f;
                f22 = f20 * 0.2f;
                f23 = f21 * 0.2f;
            } else {
                f20 = fArr10[1].floatValue() * min10;
                f21 = fArr10[2].floatValue() * min10;
                if (fArr10[0].floatValue() > 0.5f) {
                    fArr10[0] = Float.valueOf(0.5f);
                }
                f22 = fArr10[0].floatValue() * f20;
                f23 = fArr10[0].floatValue() * f21;
            }
            Path z19 = z((int) (f20 / 2.0f), (int) (f21 / 2.0f), (int) f22, (int) f23, 5);
            matrix.reset();
            matrix.postScale(rect.width() / min10, rect.height() / min10);
            z19.transform(matrix);
            z19.offset(rect.centerX(), ((((f21 * rect.height()) / min10) - rect.height()) / 2.0f) + rect.centerY());
            return z19;
        }
        Matrix matrix2 = ch.a.f5688a;
        if (i10 != 12) {
            if (i10 == 92) {
                Float[] fArr11 = eVar.f20616n;
                float min11 = Math.min(rect.width(), rect.height());
                if (fArr11 == null || fArr11.length != 1) {
                    f10 = min11 * 0.375f;
                    f11 = f10;
                } else {
                    if (fArr11[0].floatValue() > 0.5f) {
                        fArr11[0] = Float.valueOf(0.5f);
                    }
                    f10 = (0.5f - fArr11[0].floatValue()) * min11;
                    f11 = (0.5f - fArr11[0].floatValue()) * min11;
                }
                int i17 = ((int) min11) / 2;
                Path z20 = z(i17, i17, (int) f10, (int) f11, 24);
                matrix2.reset();
                matrix2.postScale(rect.width() / min11, rect.height() / min11);
                z20.transform(matrix2);
                z20.offset(rect.centerX(), rect.centerY());
                return z20;
            } else if (i10 == 187) {
                Float[] fArr12 = eVar.f20616n;
                float min12 = Math.min(rect.width(), rect.height());
                if (fArr12 == null || fArr12.length != 1) {
                    f12 = min12 * 0.125f;
                    f13 = f12;
                } else {
                    if (fArr12[0].floatValue() > 0.5f) {
                        fArr12[0] = Float.valueOf(0.5f);
                    }
                    f12 = (0.5f - fArr12[0].floatValue()) * min12;
                    f13 = (0.5f - fArr12[0].floatValue()) * min12;
                }
                int i18 = (int) (min12 / 2.0f);
                Path z21 = z(i18, i18, (int) f12, (int) f13, 4);
                matrix2.reset();
                matrix2.postScale(rect.width() / min12, rect.height() / min12);
                z21.transform(matrix2);
                z21.offset(rect.centerX(), rect.centerY());
                return z21;
            } else if (i10 != 235) {
                switch (i10) {
                    case 58:
                        Float[] fArr13 = eVar.f20616n;
                        float min13 = Math.min(rect.width(), rect.height());
                        if (fArr13 == null || fArr13.length != 1) {
                            f14 = min13 * 0.375f;
                            f15 = f14;
                        } else {
                            if (fArr13[0].floatValue() > 0.5f) {
                                fArr13[0] = Float.valueOf(0.5f);
                            }
                            f14 = (0.5f - fArr13[0].floatValue()) * min13;
                            f15 = (0.5f - fArr13[0].floatValue()) * min13;
                        }
                        int i19 = (int) (min13 / 2.0f);
                        Path z22 = z(i19, i19, (int) f14, (int) f15, 8);
                        matrix2.reset();
                        matrix2.postScale(rect.width() / min13, rect.height() / min13);
                        z22.transform(matrix2);
                        z22.offset(rect.centerX(), rect.centerY());
                        return z22;
                    case 59:
                        Float[] fArr14 = eVar.f20616n;
                        float min14 = Math.min(rect.width(), rect.height());
                        if (fArr14 == null || fArr14.length != 1) {
                            f16 = min14 * 0.375f;
                            f17 = f16;
                        } else {
                            if (fArr14[0].floatValue() > 0.5f) {
                                fArr14[0] = Float.valueOf(0.5f);
                            }
                            f16 = (0.5f - fArr14[0].floatValue()) * min14;
                            f17 = (0.5f - fArr14[0].floatValue()) * min14;
                        }
                        int i20 = ((int) min14) / 2;
                        Path z23 = z(i20, i20, (int) f16, (int) f17, 16);
                        matrix2.reset();
                        matrix2.postScale(rect.width() / min14, rect.height() / min14);
                        z23.transform(matrix2);
                        z23.offset(rect.centerX(), rect.centerY());
                        return z23;
                    case 60:
                        Float[] fArr15 = eVar.f20616n;
                        float min15 = Math.min(rect.width(), rect.height());
                        if (fArr15 == null || fArr15.length != 1) {
                            f18 = min15 * 0.375f;
                            f19 = f18;
                        } else {
                            if (fArr15[0].floatValue() > 0.5f) {
                                fArr15[0] = Float.valueOf(0.5f);
                            }
                            f18 = (0.5f - fArr15[0].floatValue()) * min15;
                            f19 = (0.5f - fArr15[0].floatValue()) * min15;
                        }
                        int i21 = ((int) min15) / 2;
                        Path z24 = z(i21, i21, (int) f18, (int) f19, 32);
                        matrix2.reset();
                        matrix2.postScale(rect.width() / min15, rect.height() / min15);
                        z24.transform(matrix2);
                        z24.offset(rect.centerX(), rect.centerY());
                        return z24;
                    default:
                        return null;
                }
            }
        }
        float min16 = Math.min(rect.width(), rect.height());
        float f46 = 1.05146f * min16;
        float f47 = 1.10557f * min16;
        Path z25 = z((int) (f46 / 2.0f), (int) (f47 / 2.0f), (int) (f46 * 0.2f), (int) (f47 * 0.2f), 5);
        matrix2.reset();
        matrix2.postScale(rect.width() / min16, rect.height() / min16);
        z25.transform(matrix2);
        z25.offset(rect.centerX(), ((((f47 * rect.height()) / min16) - rect.height()) / 2.0f) + rect.centerY());
        return z25;
    }

    public static int B(Context context) {
        kotlin.jvm.internal.g.e(context, "context");
        Integer num = f574v;
        if (num != null) {
            ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuAG5EbjpsVCA7eUFlWWtYdDZpJC48bnQ=", "ImCRoiO8");
            return num.intValue();
        }
        f574v = Integer.valueOf((int) ((20 * context.getResources().getDisplayMetrics().density) + 0.5d));
        try {
            int identifier = context.getResources().getIdentifier(ea.a.p("PHRQdAxzaGI7chVoEGkPaHQ=", "Dr8TToDf"), ea.a.p("E2koZW4=", "YJwEqxEj"), ea.a.p("K24JcidpZA==", "9ZJmHU8l"));
            if (identifier != 0) {
                f574v = Integer.valueOf(context.getResources().getDimensionPixelSize(identifier));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        Integer num2 = f574v;
        kotlin.jvm.internal.g.c(num2, ea.a.p("I3UlbBdjMG4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiA5eTllF2s-dCRpCC59bnQ=", "ivMI7Q4d"));
        return num2.intValue();
    }

    public static void C(Context context) {
        boolean z10;
        String str;
        String str2;
        if (f572t == null) {
            c1 c1Var = c1.f28564a;
            String p10 = ea.a.p("MA==", "MHHyv27j");
            String h10 = de.e.h(c1.I, "");
            if (h10 != null && h10.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                ea.a.p("VWknZSx0G3AXX11jBm4JMXA4EmMpbiVpVCAIc3hkNGZSdSd0U28OZFJ0TXBl", "3aXQ88T8");
            } else {
                if (TextUtils.equals(ea.a.p("MQ==", "iPMb84Zs"), h10)) {
                    str = "V2V3";
                    str2 = "4G9PAWKX";
                } else {
                    str = "Bmxk";
                    str2 = "8niHsHi4";
                }
                ea.a.p(str, str2);
                p10 = h10;
            }
            f572t = Boolean.valueOf(TextUtils.equals(ea.a.p("MQ==", "oOY1CKaX"), p10));
        }
    }

    public static final boolean D(String str) {
        kotlin.jvm.internal.g.e(str, "<this>");
        String[] strArr = {ea.a.p("V29j", "meaUt51M"), ea.a.p("V28oeA==", "S9h3kYak"), ea.a.p("Km90", "4VN3fnjH"), ea.a.p("DW8OeA==", "KlizHOrm"), ea.a.p("K29FbQ==", "UufR6GFM")};
        for (int i10 = 0; i10 < 5; i10++) {
            if (kotlin.text.j.F(str, strArr[i10], true)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean E(String str) {
        kotlin.jvm.internal.g.e(str, "<this>");
        String[] strArr = {ea.a.p("CGxz", "CHpgIhw1"), ea.a.p("N2xCeA==", "8oKNAGgg"), ea.a.p("S2x0", "dxy3ElqS"), ea.a.p("N2xFeA==", "gowLswnA"), ea.a.p("S2w_bQ==", "pdBj7EaE"), ea.a.p("MGxHbQ==", "mQH4pCrn"), ea.a.p("NXN2", "kPV8ti19")};
        for (int i10 = 0; i10 < 7; i10++) {
            if (kotlin.text.j.F(str, strArr[i10], true)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean F(String str) {
        kotlin.jvm.internal.g.e(str, "<this>");
        String[] strArr = {ea.a.p("P3B0", "OPsfXybv"), ea.a.p("JnA7eA==", "YbVOhf7b"), ea.a.p("P290", "bmZUtVol"), ea.a.p("P3BFbQ==", "oOgWFLL3"), ea.a.p("SW82eA==", "eo9BBFWM"), ea.a.p("Q28_bQ==", "Yt5eSS2E")};
        for (int i10 = 0; i10 < 6; i10++) {
            if (kotlin.text.j.F(str, strArr[i10], true)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean G(String str) {
        kotlin.jvm.internal.g.e(str, "<this>");
        if (!kotlin.text.j.F(str, new String[]{ea.a.p("HXAvZg==", "dWlQvGRS")}[0], true)) {
            return false;
        }
        return true;
    }

    public static final boolean H(String str) {
        kotlin.jvm.internal.g.e(str, "<this>");
        if (!G(str) && !D(str) && !E(str) && !F(str)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void I(android.app.Activity r4, android.view.ViewGroup r5, java.lang.String r6) {
        /*
            if (r4 == 0) goto Lab
            if (r5 != 0) goto L6
            goto Lab
        L6:
            pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl r0 = pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl.c
            boolean r0 = r0.w()
            if (r0 == 0) goto L1c
            java.lang.String r4 = "Q3IubRp1DyAHc1FyRSAlay1wEnA0ZTVpBncFbx50LW1xYSVuFnJCbB1hZA=="
            java.lang.String r5 = "cGjBlcST"
            java.lang.String r4 = ea.a.p(r4, r5)
            int r5 = zk.a.f32399a
            pdf.pdfreader.viewer.editor.free.utils.t1.b(r4)
            return
        L1c:
            android.content.Context r0 = pdf.pdfreader.viewer.editor.free.ReaderPdfApplication.m()
            boolean r0 = pdf.pdfreader.viewer.editor.free.utils.c1.I(r0)
            if (r0 != 0) goto L34
            java.lang.String r4 = "P3JUdhBlQEI1dD5vGEIJbltlHCA2awxwYmEoIDlvLmQ="
            java.lang.String r5 = "6m1tBLUO"
            java.lang.String r4 = ea.a.p(r4, r5)
            int r5 = zk.a.f32399a
            pdf.pdfreader.viewer.editor.free.utils.t1.b(r4)
            return
        L34:
            gl.o r0 = gl.o.f17931a
            r0.getClass()
            gl.p r0 = gl.p.f17933p
            boolean r1 = r0.f23997k
            r2 = 0
            if (r1 != 0) goto L46
            boolean r1 = r0.j()
            if (r1 != 0) goto L53
        L46:
            gl.q r1 = gl.q.f17934p
            boolean r3 = r1.f23997k
            if (r3 != 0) goto L55
            boolean r1 = r1.j()
            if (r1 != 0) goto L53
            goto L55
        L53:
            r1 = r2
            goto L56
        L55:
            r1 = 1
        L56:
            if (r1 == 0) goto L6c
            boolean r1 = androidx.activity.s.x(r4)
            if (r1 != 0) goto L6c
            pdf.pdfreader.viewer.editor.free.ads.anim.BannerLoadingAnimation r1 = new pdf.pdfreader.viewer.editor.free.ads.anim.BannerLoadingAnimation
            r1.<init>(r4, r2)
            r5.removeAllViews()
            r5.addView(r1)
            r1.r()
        L6c:
            r0.f23986o = r6
            gl.q r0 = gl.q.f17934p
            r0.getClass()
            r0.f23986o = r6
            java.lang.String r6 = "FHIBdlFlAUIndBJvWUI2blZlICA9cl9nE2UDIDdsN3QQZRYgVG8XZA=="
            java.lang.String r0 = "J1dd8v7p"
            java.lang.String r6 = ea.a.p(r6, r0)
            int r0 = zk.a.f32399a
            pdf.pdfreader.viewer.editor.free.utils.t1.b(r6)
            com.lib.flutter.encrypt.EngineHelper r6 = com.lib.flutter.encrypt.EngineHelper.f15726a
            r6.getClass()
            com.lib.flutter.encrypt.FlutterAppApi r6 = com.lib.flutter.encrypt.EngineHelper.f15727b
            if (r6 == 0) goto L90
            java.lang.String r0 = gl.o.f17932b
            r6.a(r0)
        L90:
            boolean r6 = pdf.pdfreader.viewer.editor.free.utils.c1.D(r4)
            if (r6 == 0) goto La1
            r6 = 2131100042(0x7f06018a, float:1.7812454E38)
            int r4 = androidx.core.content.a.getColor(r4, r6)
            r5.setBackgroundColor(r4)
            goto Lab
        La1:
            r6 = 2131100041(0x7f060189, float:1.7812452E38)
            int r4 = androidx.core.content.a.getColor(r4, r6)
            r5.setBackgroundColor(r4)
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: aj.b.I(android.app.Activity, android.view.ViewGroup, java.lang.String):void");
    }

    public static void J(Context context, String str) {
        dp.a.a().getClass();
        dp.a.b(context, str);
        ea.a.p("PW8-ZzhlKnIpcw5sTXQ-Y0tIN2w5ZXI=", "HgzQTi6i");
        ea.a.p("cj0MPUQ9X2U2cC9ySGwHZz0=", "NmTBIWgi");
    }

    public static void K(String str) {
        dp.a.a().getClass();
        dp.a.c(str);
        ea.a.p("dG8kZx9lIXITc1xsEHQ_YzdIV2w2ZXI=", "SYxin38C");
        ea.a.p("Dj12PU49CmUecFFyVGw5Zz0=", "02fn7u62");
    }

    public static void L() {
        gl.o.f17931a.getClass();
        gl.p.f17933p.m();
        q.f17934p.m();
    }

    public static final String M(String str) {
        kotlin.jvm.internal.g.e(str, "<this>");
        return kotlin.text.k.l0(str, ea.a.p("Lg==", "UHe6FiDG"), str);
    }

    public static final String N(String str) {
        kotlin.jvm.internal.g.e(str, "<this>");
        String str2 = File.separator;
        kotlin.jvm.internal.g.d(str2, ea.a.p("PGVBYQthQ29y", "gmelgiev"));
        if (kotlin.text.k.O(str, str2, false)) {
            ea.a.p("QGU7YQFhFm9y", "MiM0p0A1");
            String str3 = (String) kotlin.collections.m.y0(kotlin.text.k.h0(str, new String[]{str2}, 0, 6));
            if (str3 != null) {
                return str3;
            }
        }
        return "";
    }

    public static final String O(String str) {
        kotlin.jvm.internal.g.e(str, "<this>");
        String str2 = File.separator;
        kotlin.jvm.internal.g.d(str2, ea.a.p("PGVBYQthQ29y", "fsWuo1Lb"));
        return kotlin.text.k.l0(str, str2, str);
    }

    public static final String P(String str) {
        if (G(str)) {
            return ea.a.p("Y0RG", "6Ohz5lAQ");
        }
        if (D(str)) {
            return ea.a.p("ME8jRA==", "4NgqjyHu");
        }
        if (F(str)) {
            return ea.a.p("H1BU", "86Ft4vei");
        }
        if (E(str)) {
            return ea.a.p("ClhyRUw=", "lObLw24i");
        }
        return ea.a.p("ckxM", "zoT7TX10");
    }

    public static final Object Q(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static eh.c R(Map map, Element element) {
        List elements = element.element("gsLst").elements(OperatorName.SET_GRAPHICS_STATE_PARAMS);
        if (elements == null || elements.size() == 0) {
            return null;
        }
        int size = elements.size();
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            Element element2 = (Element) elements.get(i10);
            fArr[i10] = Integer.parseInt(element2.attributeValue("pos")) / 100000.0f;
            iArr[i10] = t0.L(map, element2);
        }
        Element element3 = element.element("lin");
        if (element3 != null) {
            return new eh.d(Integer.parseInt(element3.attributeValue("ang")) / 60000, iArr, fArr);
        }
        Element element4 = element.element("path");
        if (element4 != null) {
            byte s4 = s(element);
            int w7 = w(element4.element("fillToRect"));
            if (s4 != 4 && s4 != 5 && s4 != 6) {
                return null;
            }
            return new eh.f(w7, iArr, fArr);
        }
        return new eh.d(270.0f, iArr, fArr);
    }

    public static eh.g S(jh.a aVar, Element element) {
        int i10;
        String attributeValue = element.attributeValue("flip");
        if ("x".equalsIgnoreCase(attributeValue)) {
            i10 = 1;
        } else if (OperatorName.CURVE_TO_REPLICATE_FINAL_POINT.equalsIgnoreCase(attributeValue)) {
            i10 = 2;
        } else if ("xy".equalsIgnoreCase(attributeValue)) {
            i10 = 3;
        } else {
            i10 = 0;
        }
        return new eh.g(aVar, i10, Integer.parseInt(element.attributeValue("sx")) / 100000.0f, Integer.parseInt(element.attributeValue("sy")) / 100000.0f, Math.round((Integer.parseInt(element.attributeValue("tx")) * 96.0f) / 914400.0f), Math.round((Integer.parseInt(element.attributeValue("ty")) * 96.0f) / 914400.0f));
    }

    public static final SpannableString T(int i10, String str) {
        int V = kotlin.text.k.V(str, ea.a.p("c2I-", "FPidQmdx"), 0, false, 6);
        int V2 = kotlin.text.k.V(str, ea.a.p("eC8BPg==", "rWDchjH7"), 0, false, 6) - 3;
        SpannableString spannableString = new SpannableString(kotlin.text.j.K(kotlin.text.j.K(str, ea.a.p("c2I-", "4QvUtE1c"), ""), ea.a.p("cy9TPg==", "cbEi8U3K"), ""));
        if (V >= 0 && V2 >= 0) {
            spannableString.setSpan(new ForegroundColorSpan(i10), V, V2, 17);
        }
        return spannableString;
    }

    public static final void U(ImageView imageView, String str, boolean z10, String str2) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        kotlin.jvm.internal.g.e(imageView, "imageView");
        Context context = imageView.getContext();
        kotlin.jvm.internal.g.d(context, ea.a.p("Wm0qZxZWC2UFLldvB3QzeHQ=", "07vbklr3"));
        C(context);
        Boolean bool = f572t;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (z10) {
                if (booleanValue) {
                    i15 = R.drawable.ic_home_cover_lock2;
                } else {
                    i15 = R.drawable.ic_home_cover_lock;
                }
                imageView.setImageResource(i15);
                return;
            }
            if (str2 != null) {
                int hashCode = str2.hashCode();
                if (hashCode != 79444) {
                    if (hashCode != 2670346) {
                        if (hashCode == 66411159 && str2.equals(ea.a.p("ClhyRUw=", "IMOubDNW"))) {
                            boolean z11 = false;
                            if (str != null && kotlin.text.j.F(str, ea.a.p("UHN2", "fhNZ0ewZ"), false)) {
                                z11 = true;
                            }
                            if (z11) {
                                if (booleanValue) {
                                    i14 = R.drawable.ic_home_csv2;
                                } else {
                                    i14 = R.drawable.ic_home_csv;
                                }
                                imageView.setImageResource(i14);
                                return;
                            }
                            if (booleanValue) {
                                i13 = R.drawable.ic_home_xls2;
                            } else {
                                i13 = R.drawable.ic_home_xls;
                            }
                            imageView.setImageResource(i13);
                            return;
                        }
                    } else if (str2.equals(ea.a.p("ZE8ZRA==", "R0mCdeEQ"))) {
                        if (booleanValue) {
                            i12 = R.drawable.ic_home_doc2;
                        } else {
                            i12 = R.drawable.ic_home_doc;
                        }
                        imageView.setImageResource(i12);
                        return;
                    }
                } else if (str2.equals(ea.a.p("H1BU", "AgPvGADZ"))) {
                    if (booleanValue) {
                        i11 = R.drawable.ic_home_ppt2;
                    } else {
                        i11 = R.drawable.ic_home_ppt;
                    }
                    imageView.setImageResource(i11);
                    return;
                }
            }
            if (booleanValue) {
                i10 = R.drawable.ic_home_pdf2;
            } else {
                i10 = R.drawable.ic_home_pdf;
            }
            imageView.setImageResource(i10);
        }
    }

    public static final void V(ImageView imageView, boolean z10) {
        int i10;
        int i11;
        kotlin.jvm.internal.g.e(imageView, "imageView");
        Context context = imageView.getContext();
        kotlin.jvm.internal.g.d(context, ea.a.p("Wm0qZxZWC2UFLldvB3QzeHQ=", "k5BNynzZ"));
        C(context);
        Boolean bool = f572t;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (z10) {
                if (booleanValue) {
                    i11 = R.drawable.ic_home_cover_lock2;
                } else {
                    i11 = R.drawable.ic_home_cover_lock;
                }
                imageView.setImageResource(i11);
                return;
            }
            if (booleanValue) {
                i10 = R.drawable.ic_home_pdf2;
            } else {
                i10 = R.drawable.ic_home_pdf;
            }
            imageView.setImageResource(i10);
        }
    }

    public static void W(String str, Context context, boolean z10, int i10) {
        if (context == null) {
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.view_style_toast_txt, (ViewGroup) null);
        try {
            TextView textView = (TextView) inflate.findViewById(R.id.tv);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.iv);
            if (i10 != 0) {
                imageView.setImageResource(i10);
            } else {
                imageView.setVisibility(8);
            }
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.bg_root);
            if (z10) {
                linearLayout.setBackgroundResource(R.drawable.shape_style_toast_orange);
            }
            textView.setText(str);
            if (f560h == null) {
                f560h = new Toast(context);
            }
            f560h.setView(inflate);
            f560h.setDuration(0);
            f560h.setGravity(55, 0, (int) context.getResources().getDimension(R.dimen.dp_66));
            f560h.show();
        } catch (Error e10) {
            e10.printStackTrace();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public static final ChannelFlowTransformLatest X(kotlinx.coroutines.flow.c cVar, cg.q qVar) {
        int i10 = kotlinx.coroutines.flow.l.f20129a;
        return new ChannelFlowTransformLatest(qVar, cVar, EmptyCoroutineContext.INSTANCE, -2, BufferOverflow.SUSPEND);
    }

    public static RectF Y(float[] fArr) {
        RectF rectF = new RectF(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
        for (int i10 = 1; i10 < fArr.length; i10 += 2) {
            float round = Math.round(fArr[i10 - 1] * 10.0f) / 10.0f;
            float round2 = Math.round(fArr[i10] * 10.0f) / 10.0f;
            float f10 = rectF.left;
            if (round < f10) {
                f10 = round;
            }
            rectF.left = f10;
            float f11 = rectF.top;
            if (round2 < f11) {
                f11 = round2;
            }
            rectF.top = f11;
            float f12 = rectF.right;
            if (round <= f12) {
                round = f12;
            }
            rectF.right = round;
            float f13 = rectF.bottom;
            if (round2 <= f13) {
                round2 = f13;
            }
            rectF.bottom = round2;
        }
        rectF.sort();
        return rectF;
    }

    public static final Object Z(Object obj) {
        u0 u0Var;
        kotlinx.coroutines.t0 t0Var;
        if (obj instanceof u0) {
            u0Var = (u0) obj;
        } else {
            u0Var = null;
        }
        if (u0Var != null && (t0Var = u0Var.f20270a) != null) {
            return t0Var;
        }
        return obj;
    }

    public static final int g(char c10) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if ('0' <= c10 && c10 < ':') {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return c10 - '0';
        }
        char c11 = 'a';
        if ('a' <= c10 && c10 < 'g') {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            c11 = 'A';
            if ('A' > c10 || c10 >= 'G') {
                z12 = false;
            }
            if (!z12) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c10);
            }
        }
        return (c10 - c11) + 10;
    }

    public static void h(yd.a aVar, je.a aVar2, String str, String str2, ArrayList arrayList) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        yd.a aVar3 = aVar;
        je.a aVar4 = aVar2;
        String str10 = "am1-b-";
        String str11 = "admob-nb-";
        String str12 = "admob-n-";
        String str13 = "am1-o-";
        try {
            String str14 = "am1-v-";
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            String str15 = "am1-i-";
            int i10 = 0;
            while (i10 < length) {
                int i11 = length;
                String order = jSONArray.getString(i10);
                JSONArray jSONArray2 = jSONArray;
                kotlin.jvm.internal.g.d(order, "order");
                int i12 = i10;
                if (kotlin.text.k.O(order, kotlin.text.j.K(str2, "pub", ""), false)) {
                    if (kotlin.text.j.M(order, str12, false)) {
                        t0.j(arrayList, new ie.f(kotlin.text.j.K(order, str12, "")), order, aVar4);
                    } else {
                        str3 = str12;
                        if (kotlin.text.j.M(order, str11, false)) {
                            String K = kotlin.text.j.K(order, str11, "");
                            if (TextUtils.isEmpty(K)) {
                                str6 = str10;
                                str5 = str11;
                                str8 = str14;
                                str7 = str15;
                            } else {
                                str5 = str11;
                                j3.h hVar = new j3.h(K);
                                int i13 = aVar4.f19174a;
                                if (i13 != 0) {
                                    str4 = str10;
                                    ((Bundle) hVar.c).putInt("layout_id", i13);
                                } else {
                                    str4 = str10;
                                }
                                ((Bundle) hVar.c).putInt("ad_choices_position", 1);
                                arrayList.add(new yd.c(wd.a.f31074b, order, hVar));
                                str8 = str14;
                                str7 = str15;
                                str6 = str4;
                            }
                        } else {
                            str4 = str10;
                            str5 = str11;
                            if (kotlin.text.j.M(order, "admob-b-", false)) {
                                String K2 = kotlin.text.j.K(order, "admob-b-", "");
                                if (!TextUtils.isEmpty(K2)) {
                                    arrayList.add(new yd.c(wd.a.f31073a, order, new j3.h(K2)));
                                }
                            } else if (kotlin.text.j.M(order, "admob-i-", false)) {
                                String K3 = kotlin.text.j.K(order, "admob-i-", "");
                                if (!TextUtils.isEmpty(K3)) {
                                    j3.h hVar2 = new j3.h(K3);
                                    if (aVar3 != null) {
                                        ((Bundle) hVar2.c).putString("ad_position_key", aVar3.f32114b);
                                    }
                                    arrayList.add(new yd.c(wd.a.f31075d, order, hVar2));
                                }
                            } else if (kotlin.text.j.M(order, "admob-v-", false)) {
                                String K4 = kotlin.text.j.K(order, "admob-v-", "");
                                if (!TextUtils.isEmpty(K4)) {
                                    arrayList.add(new yd.c(wd.a.f31076e, order, new j3.h(K4)));
                                }
                            } else if (kotlin.text.j.M(order, "admob-o-", false)) {
                                String K5 = kotlin.text.j.K(order, "admob-o-", "");
                                if (!TextUtils.isEmpty(K5)) {
                                    arrayList.add(new yd.c(wd.a.f31077f, order, new j3.h(K5)));
                                }
                            } else if (kotlin.text.j.M(order, "am1-n-", false)) {
                                t0.j(arrayList, new ie.f(t0.H(kotlin.text.j.K(order, "am1-n-", ""))), order, aVar4);
                            } else if (kotlin.text.j.M(order, "am1-nb-", false)) {
                                String H = t0.H(kotlin.text.j.K(order, "am1-nb-", ""));
                                if (!TextUtils.isEmpty(H)) {
                                    j3.h hVar3 = new j3.h(H);
                                    int i14 = aVar4.f19174a;
                                    if (i14 != 0) {
                                        ((Bundle) hVar3.c).putInt("layout_id", i14);
                                    }
                                    ((Bundle) hVar3.c).putInt("ad_choices_position", 1);
                                    arrayList.add(new yd.c(wd.a.f31074b, order, hVar3));
                                }
                            } else {
                                str6 = str4;
                                if (kotlin.text.j.M(order, str6, false)) {
                                    String H2 = t0.H(kotlin.text.j.K(order, str6, ""));
                                    if (!TextUtils.isEmpty(H2)) {
                                        arrayList.add(new yd.c(wd.a.f31073a, order, new j3.h(H2)));
                                    }
                                    str8 = str14;
                                    str7 = str15;
                                } else {
                                    str7 = str15;
                                    if (kotlin.text.j.M(order, str7, false)) {
                                        String H3 = t0.H(kotlin.text.j.K(order, str7, ""));
                                        if (!TextUtils.isEmpty(H3)) {
                                            j3.h hVar4 = new j3.h(H3);
                                            if (aVar3 != null) {
                                                ((Bundle) hVar4.c).putString("ad_position_key", aVar3.f32114b);
                                            }
                                            arrayList.add(new yd.c(wd.a.f31075d, order, hVar4));
                                        }
                                        str8 = str14;
                                    } else {
                                        str8 = str14;
                                        if (kotlin.text.j.M(order, str8, false)) {
                                            String H4 = t0.H(kotlin.text.j.K(order, str8, ""));
                                            if (!TextUtils.isEmpty(H4)) {
                                                arrayList.add(new yd.c(wd.a.f31076e, order, new j3.h(H4)));
                                            }
                                        } else {
                                            str9 = str13;
                                            if (kotlin.text.j.M(order, str9, false)) {
                                                String H5 = t0.H(kotlin.text.j.K(order, str9, ""));
                                                if (!TextUtils.isEmpty(H5)) {
                                                    arrayList.add(new yd.c(wd.a.f31077f, order, new j3.h(H5)));
                                                }
                                            }
                                            str14 = str8;
                                            str13 = str9;
                                            str15 = str7;
                                            length = i11;
                                            str12 = str3;
                                            str11 = str5;
                                            aVar4 = aVar2;
                                            i10 = i12 + 1;
                                            str10 = str6;
                                            jSONArray = jSONArray2;
                                            aVar3 = aVar;
                                        }
                                    }
                                }
                            }
                            str8 = str14;
                            str7 = str15;
                            str6 = str4;
                        }
                        str9 = str13;
                        str14 = str8;
                        str13 = str9;
                        str15 = str7;
                        length = i11;
                        str12 = str3;
                        str11 = str5;
                        aVar4 = aVar2;
                        i10 = i12 + 1;
                        str10 = str6;
                        jSONArray = jSONArray2;
                        aVar3 = aVar;
                    }
                }
                str6 = str10;
                str5 = str11;
                str3 = str12;
                str9 = str13;
                str8 = str14;
                str7 = str15;
                str14 = str8;
                str13 = str9;
                str15 = str7;
                length = i11;
                str12 = str3;
                str11 = str5;
                aVar4 = aVar2;
                i10 = i12 + 1;
                str10 = str6;
                jSONArray = jSONArray2;
                aVar3 = aVar;
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public static kotlinx.coroutines.flow.c i(kotlinx.coroutines.flow.c cVar, int i10) {
        boolean z10;
        int i11;
        BufferOverflow bufferOverflow;
        BufferOverflow bufferOverflow2 = BufferOverflow.SUSPEND;
        if (i10 < 0 && i10 != -2 && i10 != -1) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (i10 == -1) {
                bufferOverflow = BufferOverflow.DROP_OLDEST;
                i11 = 0;
            } else {
                i11 = i10;
                bufferOverflow = bufferOverflow2;
            }
            if (cVar instanceof kotlinx.coroutines.flow.internal.j) {
                return j.a.a((kotlinx.coroutines.flow.internal.j) cVar, null, i11, bufferOverflow, 1);
            }
            return new kotlinx.coroutines.flow.internal.e(cVar, null, i11, bufferOverflow, 2);
        }
        throw new IllegalArgumentException(b.a.c("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", i10).toString());
    }

    public static void j(Activity activity, ViewGroup viewGroup, String str, com.lib.flutter.encrypt.e eVar) {
        EngineHelper.f15726a.getClass();
        if (((com.lib.flutter.encrypt.e) EngineHelper.f15732h.get(ea.a.p("Q3IudhplFUIddEBvBEI3biplQEE6cDFlN2k2dxVvRHRcbQlhHW4HckI=", "ASW0q0ix"))) != eVar) {
            EngineHelper.h(ea.a.p("SXIjdiFlEkIndBJvWUI2blZlIEE1cERlAmkUdxNvNnRWbQRhJm4AckI=", "Mx9FHeFC"), eVar);
            if (activity.getResources().getConfiguration().orientation == 1) {
                I(activity, viewGroup, str);
            } else if (viewGroup == null) {
            } else {
                View view = gl.p.f17933p.f23989b;
                View view2 = q.f17934p.f23989b;
                ViewGroup viewGroup2 = null;
                if (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof ViewGroup) {
                        viewGroup2 = (ViewGroup) parent;
                    }
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(view);
                    }
                    viewGroup.removeAllViews();
                    viewGroup.addView(view);
                } else if (view2 != null) {
                    ViewParent parent2 = view2.getParent();
                    if (parent2 instanceof ViewGroup) {
                        viewGroup2 = (ViewGroup) parent2;
                    }
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(view2);
                    }
                    viewGroup.removeAllViews();
                    viewGroup.addView(view2);
                }
            }
        }
    }

    public static final Object k(kotlinx.coroutines.flow.c cVar, cg.p pVar, kotlin.coroutines.c cVar2) {
        Object a10 = i(kotlinx.coroutines.flow.l.a(pVar, cVar), 0).a(kotlinx.coroutines.flow.internal.l.f20124a, cVar2);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (a10 != coroutineSingletons) {
            a10 = tf.d.f30009a;
        }
        if (a10 != coroutineSingletons) {
            return tf.d.f30009a;
        }
        return a10;
    }

    public static PdfPreviewEntity l(PdfPreviewEntity pdfPreviewEntity) {
        if (pdfPreviewEntity == null) {
            return null;
        }
        PdfPreviewEntity pdfPreviewEntity2 = new PdfPreviewEntity();
        pdfPreviewEntity2.setId(pdfPreviewEntity.getId());
        pdfPreviewEntity2.setDate(pdfPreviewEntity.getDate());
        pdfPreviewEntity2.setFavorite(pdfPreviewEntity.getFavorite());
        pdfPreviewEntity2.setFavoriteDate(pdfPreviewEntity.getFavoriteDate());
        pdfPreviewEntity2.setName(pdfPreviewEntity.getName());
        pdfPreviewEntity2.setPage(pdfPreviewEntity.getPage());
        pdfPreviewEntity2.setPath(pdfPreviewEntity.getPath());
        pdfPreviewEntity2.setRecent(pdfPreviewEntity.getRecent());
        pdfPreviewEntity2.setRecentDate(pdfPreviewEntity.getRecentDate());
        pdfPreviewEntity2.setSize(pdfPreviewEntity.getSize());
        pdfPreviewEntity2.setUpdateAt(pdfPreviewEntity.getUpdateAt());
        pdfPreviewEntity2.setOtherStrOne(pdfPreviewEntity.getOtherStrOne());
        pdfPreviewEntity2.setOtherStrTwo(pdfPreviewEntity.getOtherStrTwo());
        pdfPreviewEntity2.setOtherStrThree(pdfPreviewEntity.getOtherStrThree());
        pdfPreviewEntity2.setOtherStrAll(pdfPreviewEntity.getOtherStrAll());
        pdfPreviewEntity2.setOtherBoolOne(pdfPreviewEntity.isOtherBoolOne());
        pdfPreviewEntity2.setOtherBoolTwo(pdfPreviewEntity.isOtherBoolTwo());
        pdfPreviewEntity2.setOtherBoolThree(pdfPreviewEntity.isOtherBoolThree());
        pdfPreviewEntity2.setOtherBoolFour(pdfPreviewEntity.isOtherBoolFour());
        pdfPreviewEntity2.setOtherIntOne(pdfPreviewEntity.getOtherIntOne());
        pdfPreviewEntity2.setOtherIntThree(pdfPreviewEntity.getOtherIntThree());
        pdfPreviewEntity2.setOtherIntTwo(pdfPreviewEntity.getOtherIntTwo());
        pdfPreviewEntity2.setOtherIntFour(pdfPreviewEntity.getOtherIntFour());
        pdfPreviewEntity2.setOtherLongOne(pdfPreviewEntity.getOtherLongOne());
        pdfPreviewEntity2.setOtherLongTwo(pdfPreviewEntity.getOtherLongTwo());
        pdfPreviewEntity2.setOtherLongThree(pdfPreviewEntity.getOtherLongThree());
        pdfPreviewEntity2.setOtherLongFour(pdfPreviewEntity.getOtherLongFour());
        pdfPreviewEntity2.setDeleted(pdfPreviewEntity.getDeleted());
        pdfPreviewEntity2.setDeletedTime(pdfPreviewEntity.getDeletedTime());
        pdfPreviewEntity2.setItemType(pdfPreviewEntity.getItemType());
        return pdfPreviewEntity2;
    }

    public static final Object m(kotlin.coroutines.c cVar, kotlinx.coroutines.flow.c cVar2, kotlinx.coroutines.flow.d dVar) {
        if (!(dVar instanceof d0)) {
            Object a10 = cVar2.a(dVar, cVar);
            if (a10 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                return tf.d.f30009a;
            }
            return a10;
        }
        throw ((d0) dVar).f20094a;
    }

    public static void n(Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
            return;
        }
        throw new IllegalArgumentException("Bundle must contain ".concat(str));
    }

    public static final kotlinx.coroutines.flow.c o(kotlinx.coroutines.flow.c cVar, CoroutineDispatcher coroutineDispatcher) {
        boolean z10;
        if (coroutineDispatcher.get(y0.b.f20277a) == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (!kotlin.jvm.internal.g.a(coroutineDispatcher, EmptyCoroutineContext.INSTANCE)) {
                if (cVar instanceof kotlinx.coroutines.flow.internal.j) {
                    return j.a.a((kotlinx.coroutines.flow.internal.j) cVar, coroutineDispatcher, 0, null, 6);
                }
                return new kotlinx.coroutines.flow.internal.e(cVar, coroutineDispatcher, 0, null, 12);
            }
            return cVar;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + coroutineDispatcher).toString());
    }

    public static Bitmap p(String str, Context context) {
        int i10;
        try {
            Size a10 = s0.a(str);
            float width = (a10.getWidth() * 1.0f) / a10.getHeight();
            int i11 = 4320;
            if (a10.getWidth() <= 4320 && a10.getHeight() <= 4320) {
                i11 = a10.getWidth();
                i10 = a10.getHeight();
                com.bumptech.glide.e<Bitmap> a11 = com.bumptech.glide.b.c(context).f(context).a();
                a11.F = str;
                a11.I = true;
                return (Bitmap) a11.g(v3.f.f30509a).J(i11, i10).get();
            }
            if (a10.getWidth() > a10.getHeight()) {
                i10 = (int) (4320 / width);
            } else {
                i11 = (int) (4320 * width);
                i10 = 4320;
            }
            com.bumptech.glide.e<Bitmap> a112 = com.bumptech.glide.b.c(context).f(context).a();
            a112.F = str;
            a112.I = true;
            return (Bitmap) a112.g(v3.f.f30509a).J(i11, i10).get();
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }

    public static int q(String str) {
        int i10 = 0;
        while (i10 < str.length() && (str.charAt(i10) < '0' || str.charAt(i10) > '9')) {
            i10++;
        }
        String substring = str.substring(0, i10);
        int i11 = 0;
        for (int i12 = 0; i12 < substring.length(); i12++) {
            i11 = (substring.charAt(i12) - 'A') + (i11 * 26) + 1;
        }
        return i11 - 1;
    }

    public static float[] r(RectF rectF) {
        float f10 = rectF.left;
        float f11 = rectF.top;
        float f12 = rectF.right;
        float f13 = rectF.bottom;
        return new float[]{f10, f11, f12, f11, f12, f13, f10, f13};
    }

    public static byte s(Element element) {
        Element element2;
        if (element.element("lin") == null && (element2 = element.element("path")) != null) {
            String attributeValue = element2.attributeValue("path");
            if ("circle".equalsIgnoreCase(attributeValue)) {
                return (byte) 4;
            }
            if ("rect".equalsIgnoreCase(attributeValue)) {
                return (byte) 5;
            }
            if ("shape".equalsIgnoreCase(attributeValue)) {
                return (byte) 6;
            }
        }
        return (byte) 7;
    }

    public static final String t(String type) {
        kotlin.jvm.internal.g.e(type, "type");
        if (TextUtils.equals(type, ea.a.p("G0xM", "9uZVhU4k"))) {
            return ea.a.p("G2xs", "e1zE9XwG");
        }
        if (TextUtils.equals(type, ea.a.p("Y0RG", "yPNl0C3a"))) {
            return ea.a.p("EmRm", "sRbsF7F8");
        }
        if (TextUtils.equals(type, ea.a.p("ZE8ZRA==", "0gGuTKgQ"))) {
            return ea.a.p("RG85ZA==", "nEe5QWgw");
        }
        if (TextUtils.equals(type, ea.a.p("ClhyRUw=", "xvtozDtQ"))) {
            return ea.a.p("VngoZWw=", "0syRosPo");
        }
        if (TextUtils.equals(type, ea.a.p("H1BU", "blvwty26"))) {
            return ea.a.p("P3B0", "1IxceIiU");
        }
        return ea.a.p("Lmxs", "GpUWkDGv");
    }

    public static no.e u(String str) {
        no.e eVar = new no.e();
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.optInt(ea.a.p("QG85dCd5EmU=", "Fb9ltZEa"));
                eVar.f22616a = jSONObject.optInt(ea.a.p("XHIvZQFCeQ==", "df7WnHS4"));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return eVar;
    }

    public static final kotlinx.coroutines.h v(kotlin.coroutines.c cVar) {
        kotlinx.coroutines.h hVar;
        kotlinx.coroutines.h hVar2;
        boolean z10;
        boolean z11 = true;
        if (!(cVar instanceof kotlinx.coroutines.internal.f)) {
            return new kotlinx.coroutines.h(1, cVar);
        }
        kotlinx.coroutines.internal.f fVar = (kotlinx.coroutines.internal.f) cVar;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = kotlinx.coroutines.internal.f.f20174h;
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            a0 a0Var = ge.a.f17757h;
            hVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(fVar, a0Var);
                hVar2 = null;
                break;
            } else if (obj instanceof kotlinx.coroutines.h) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(fVar, obj, a0Var)) {
                        z10 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    hVar2 = (kotlinx.coroutines.h) obj;
                    break;
                }
            } else if (obj != a0Var && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (hVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = kotlinx.coroutines.h.f20156g;
            Object obj2 = atomicReferenceFieldUpdater2.get(hVar2);
            if ((obj2 instanceof kotlinx.coroutines.o) && ((kotlinx.coroutines.o) obj2).f20216d != null) {
                hVar2.p();
                z11 = false;
            } else {
                kotlinx.coroutines.h.f20155f.set(hVar2, 536870911);
                atomicReferenceFieldUpdater2.set(hVar2, kotlinx.coroutines.b.f19988a);
            }
            if (z11) {
                hVar = hVar2;
            }
            if (hVar != null) {
                return hVar;
            }
        }
        return new kotlinx.coroutines.h(2, cVar);
    }

    public static int w(Element element) {
        if (element != null) {
            String attributeValue = element.attributeValue(OperatorName.LINE_TO);
            String attributeValue2 = element.attributeValue("t");
            String attributeValue3 = element.attributeValue("r");
            String attributeValue4 = element.attributeValue("b");
            if ("100000".equalsIgnoreCase(attributeValue3) && "100000".equalsIgnoreCase(attributeValue4)) {
                return 0;
            }
            if ("100000".equalsIgnoreCase(attributeValue) && "100000".equalsIgnoreCase(attributeValue4)) {
                return 1;
            }
            if ("100000".equalsIgnoreCase(attributeValue3) && "100000".equalsIgnoreCase(attributeValue2)) {
                return 2;
            }
            if ("100000".equalsIgnoreCase(attributeValue) && "100000".equalsIgnoreCase(attributeValue2)) {
                return 3;
            }
            if ("50000".equalsIgnoreCase(attributeValue) && "50000".equalsIgnoreCase(attributeValue2) && "50000".equalsIgnoreCase(attributeValue3) && "50000".equalsIgnoreCase(attributeValue4)) {
                return 4;
            }
        }
        return 0;
    }

    public static int x(String str) {
        int i10 = 0;
        if (str.indexOf(":") > 0) {
            str = str.substring(0, str.indexOf(":"));
        }
        while (i10 < str.length() && (str.charAt(i10) < '0' || str.charAt(i10) > '9')) {
            i10++;
        }
        return Integer.parseInt(str.substring(i10, str.length())) - 1;
    }

    public static String y(no.e eVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ea.a.p("XHIvZQFCeQ==", "T5fkLHmS"), eVar.a());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return jSONObject.toString();
    }

    public static Path z(int i10, int i11, int i12, int i13, int i14) {
        float f10;
        float tan;
        float sqrt;
        float tan2;
        float sqrt2;
        float tan3;
        int i15 = i10;
        int i16 = i11;
        int i17 = i12;
        int i18 = i13;
        Path d10 = e.a.f29807a.d("StarPathBuilder");
        float f11 = 360.0f;
        float f12 = 360.0f / (i14 * 2);
        d10.moveTo(0.0f, -i16);
        float f13 = 90.0f;
        double d11 = 3.141592653589793d;
        double d12 = 2.0d;
        if (i17 > 0 && i18 > 0) {
            float f14 = 270.0f;
            int i19 = 1;
            while (true) {
                int i20 = i19 + 1;
                if (i19 >= i14) {
                    break;
                }
                float f15 = (f14 + f12) % f11;
                int i21 = (f15 > f13 ? 1 : (f15 == f13 ? 0 : -1));
                if (i21 == 0) {
                    tan2 = i18;
                    sqrt = 0.0f;
                } else {
                    double pow = Math.pow(i18, d12);
                    double d13 = i17;
                    double d14 = (f15 * d11) / 180.0d;
                    sqrt = (float) ((i17 * i18) / Math.sqrt(Math.pow(d13 * Math.tan(d14), 2.0d) + pow));
                    if (i21 > 0 && f15 < 270.0f) {
                        sqrt = -sqrt;
                    }
                    tan2 = (float) (Math.tan(d14) * sqrt);
                }
                d10.lineTo(sqrt, tan2);
                float f16 = (f15 + f12) % 360.0f;
                int i22 = (f16 > 90.0f ? 1 : (f16 == 90.0f ? 0 : -1));
                if (i22 == 0) {
                    tan3 = i16;
                    sqrt2 = 0.0f;
                } else {
                    double d15 = (f16 * 3.141592653589793d) / 180.0d;
                    sqrt2 = (float) ((i15 * i16) / Math.sqrt(Math.pow(i15 * Math.tan(d15), 2.0d) + Math.pow(i16, 2.0d)));
                    if (i22 > 0 && f16 < 270.0f) {
                        sqrt2 = -sqrt2;
                    }
                    tan3 = (float) (Math.tan(d15) * sqrt2);
                }
                d10.lineTo(sqrt2, tan3);
                i15 = i10;
                i16 = i11;
                i17 = i12;
                f14 = f16;
                i19 = i20;
                f11 = 360.0f;
                f13 = 90.0f;
                d11 = 3.141592653589793d;
                d12 = 2.0d;
                i18 = i13;
            }
            double d16 = ((270.0f - f12) * 3.141592653589793d) / 180.0d;
            float f17 = -((float) ((i12 * i13) / Math.sqrt(Math.pow(Math.tan(d16) * i12, 2.0d) + Math.pow(i13, 2.0d))));
            d10.lineTo(f17, (float) (Math.tan(d16) * f17));
        } else {
            float f18 = 270.0f;
            int i23 = 1;
            while (true) {
                int i24 = i23 + 1;
                if (i23 >= i14) {
                    break;
                }
                d10.lineTo(0.0f, 0.0f);
                f18 = (((f18 + f12) % 360.0f) + f12) % 360.0f;
                int i25 = (f18 > 90.0f ? 1 : (f18 == 90.0f ? 0 : -1));
                if (i25 == 0) {
                    tan = i11;
                    f10 = 0.0f;
                } else {
                    double d17 = (f18 * 3.141592653589793d) / 180.0d;
                    float sqrt3 = (float) ((i10 * i11) / Math.sqrt(Math.pow(i10 * Math.tan(d17), 2.0d) + Math.pow(i11, 2.0d)));
                    if (i25 > 0 && f18 < 270.0f) {
                        sqrt3 = -sqrt3;
                    }
                    f10 = sqrt3;
                    tan = (float) (Math.tan(d17) * f10);
                }
                d10.lineTo(f10, tan);
                i23 = i24;
            }
            d10.lineTo(0.0f, 0.0f);
        }
        d10.close();
        return d10;
    }

    @Override // qe.b
    public qe.b a(boolean z10) {
        return this;
    }

    @Override // s6.d
    public Object apply(Object obj) {
        return ((zzhe) obj).zzc();
    }

    @Override // r5.a
    public boolean b(File file) {
        return false;
    }

    @Override // qe.b
    public boolean d(Canvas canvas) {
        return true;
    }

    @Override // h4.b
    public v3.l e(v3.l lVar, t3.e eVar) {
        a.b bVar;
        byte[] bArr;
        ByteBuffer asReadOnlyBuffer = ((g4.c) lVar.get()).f17630a.f17639a.f17641a.getData().asReadOnlyBuffer();
        int i10 = p4.a.f23684a;
        if (!asReadOnlyBuffer.isReadOnly() && asReadOnlyBuffer.hasArray()) {
            bVar = new a.b(asReadOnlyBuffer.array(), asReadOnlyBuffer.arrayOffset(), asReadOnlyBuffer.limit());
        } else {
            bVar = null;
        }
        if (bVar != null && bVar.f23687a == 0) {
            if (bVar.f23688b == bVar.c.length) {
                bArr = asReadOnlyBuffer.array();
                return new d4.b(bArr);
            }
        }
        ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
        byte[] bArr2 = new byte[asReadOnlyBuffer2.limit()];
        asReadOnlyBuffer2.position(0);
        asReadOnlyBuffer2.get(bArr2);
        bArr = bArr2;
        return new d4.b(bArr);
    }

    public /* synthetic */ b(int i10) {
    }

    @Override // q9.m
    public /* synthetic */ Object a() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new p2());
        o9.d.d(newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }

    @Override // qe.b
    public void c() {
    }

    @Override // qe.b
    public void destroy() {
    }

    @Override // okhttp3.b
    public void f(okhttp3.a0 a0Var, x xVar) {
    }
}
