package pdf.pdfreader.viewer.editor.free.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Size;
import android.util.SizeF;
import android.util.TypedValue;
import android.view.View;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.google.android.gms.common.api.Api;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PushbackInputStream;
import java.io.Serializable;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.internal.ThreadContextKt;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.hpsf.Constants;
import lib.zj.office.fc.hslf.record.SlideAtom;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.openxml4j.opc.PackagePart;
import lib.zj.office.fc.openxml4j.opc.PackageRelationship;
import lib.zj.office.fc.openxml4j.opc.ZipPackage;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.enums.CompressionMethod;
import org.json.JSONArray;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.bean.ColorType;
import pdf.pdfreader.viewer.editor.free.broadcast.TimeReceiver;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.decrypt.DecryptContainer;
import pdf.pdfreader.viewer.editor.free.merge.MergePdfData;

/* compiled from: PreviewPageThread.kt */
/* loaded from: classes3.dex */
public class t0 implements o3.d0 {

    /* renamed from: a  reason: collision with root package name */
    public static ThreadPoolExecutor f28769a = null;

    /* renamed from: g  reason: collision with root package name */
    public static int f28774g = 2;

    /* renamed from: h  reason: collision with root package name */
    public static int f28775h = 16;

    /* renamed from: i  reason: collision with root package name */
    public static volatile ColorMatrixColorFilter f28776i;

    /* renamed from: k  reason: collision with root package name */
    public static TimeReceiver f28778k;

    /* renamed from: b  reason: collision with root package name */
    public static final com.android.billingclient.api.a0 f28770b = new com.android.billingclient.api.a0("REMOVED_TASK", 8);
    public static final com.android.billingclient.api.a0 c = new com.android.billingclient.api.a0("CLOSED_EMPTY", 8);

    /* renamed from: d  reason: collision with root package name */
    public static final com.android.billingclient.api.a0 f28771d = new com.android.billingclient.api.a0("NONE", 8);

    /* renamed from: e  reason: collision with root package name */
    public static final com.android.billingclient.api.a0 f28772e = new com.android.billingclient.api.a0("PENDING", 8);

    /* renamed from: f  reason: collision with root package name */
    public static final com.android.billingclient.api.a0 f28773f = new com.android.billingclient.api.a0("NO_DECISION", 8);

    /* renamed from: j  reason: collision with root package name */
    public static final t0 f28777j = new t0();

    public static float A(float f10, float f11, float f12, float f13) {
        double d10 = 0.0f - f10;
        double d11 = 0.0f - f11;
        float hypot = (float) Math.hypot(d10, d11);
        double d12 = f12 - f10;
        float hypot2 = (float) Math.hypot(d12, d11);
        double d13 = f13 - f11;
        float hypot3 = (float) Math.hypot(d12, d13);
        float hypot4 = (float) Math.hypot(d10, d13);
        if (hypot <= hypot2 || hypot <= hypot3 || hypot <= hypot4) {
            if (hypot2 > hypot3 && hypot2 > hypot4) {
                return hypot2;
            }
            if (hypot3 > hypot4) {
                return hypot3;
            }
            return hypot4;
        }
        return hypot;
    }

    public static long B(long j10) {
        int i10 = (int) ((j10 >> 5) & 63);
        int i11 = (int) ((j10 >> 11) & 31);
        int i12 = (int) ((j10 >> 16) & 31);
        int i13 = (int) (((j10 >> 21) & 15) - 1);
        int i14 = (int) (((j10 >> 25) & 127) + 1980);
        Calendar calendar = Calendar.getInstance();
        calendar.set(i14, i13, i12, i11, i10, (int) ((j10 << 1) & 62));
        calendar.set(14, 0);
        return calendar.getTime().getTime() + (j10 >> 32);
    }

    public static int C(Context context, float f10) {
        return (int) ((context.getResources().getDisplayMetrics().density * f10) + 0.5f);
    }

    public static final boolean D(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }

    public static final PdfPreviewEntity E(List list, PdfPreviewEntity entity) {
        Object obj;
        boolean z10;
        kotlin.jvm.internal.g.e(list, "<this>");
        kotlin.jvm.internal.g.e(entity, "entity");
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((PdfPreviewEntity) obj).getId() == entity.getId()) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (PdfPreviewEntity) obj;
    }

    public static String F(String str, String str2) {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray jSONArray2 = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray2.length(); i10++) {
                h(str2, jSONArray2.getString(i10), jSONArray);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (jSONArray.length() > 0) {
            return jSONArray.toString();
        }
        return str;
    }

    public static void G() {
        throw new RuntimeException("Stub!");
    }

    public static String H(String str) {
        if (str.startsWith("ca-app-pub-")) {
            return str;
        }
        return "ca-app-pub-".concat(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static lh.e I(lib.zj.office.system.f r21, lib.zj.office.fc.openxml4j.opc.ZipPackage r22, lib.zj.office.fc.openxml4j.opc.PackagePart r23, lib.zj.office.fc.dom4j.Element r24, lib.zj.office.java.awt.Rectangle r25, java.util.Map r26, int r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.utils.t0.I(lib.zj.office.system.f, lib.zj.office.fc.openxml4j.opc.ZipPackage, lib.zj.office.fc.openxml4j.opc.PackagePart, lib.zj.office.fc.dom4j.Element, lib.zj.office.java.awt.Rectangle, java.util.Map, int, boolean):lh.e");
    }

    public static int J(Context context, int i10, int i11) {
        TypedValue a10 = b9.b.a(context, i10);
        if (a10 != null) {
            int i12 = a10.resourceId;
            if (i12 != 0) {
                return androidx.core.content.a.getColor(context, i12);
            }
            return a10.data;
        }
        return i11;
    }

    public static int K(View view, int i10) {
        Context context = view.getContext();
        TypedValue c10 = b9.b.c(view.getContext(), i10, view.getClass().getCanonicalName());
        int i11 = c10.resourceId;
        if (i11 != 0) {
            return androidx.core.content.a.getColor(context, i11);
        }
        return c10.data;
    }

    public static int L(Map map, Element element) {
        int i10;
        String attributeValue;
        int parseInt;
        int i11 = -16777216;
        if (element.element("srgbClr") != null) {
            parseInt = (int) Long.parseLong(element.element("srgbClr").attributeValue("val"), 16);
        } else {
            Element element2 = element.element("scrgbClr");
            if (element2 != null) {
                return com.google.android.play.core.assetpacks.b1.X((Integer.parseInt(element2.attributeValue("r")) * FunctionEval.FunctionID.EXTERNAL_FUNC) / 100, (Integer.parseInt(element2.attributeValue(OperatorName.NON_STROKING_GRAY)) * FunctionEval.FunctionID.EXTERNAL_FUNC) / 100, (Integer.parseInt(element2.attributeValue("b")) * FunctionEval.FunctionID.EXTERNAL_FUNC) / 100);
            }
            if (element.element("schemeClr") == null && element.element("prstClr") == null) {
                if (element.element("sysClr") != null) {
                    parseInt = Integer.parseInt(element.element("sysClr").attributeValue("lastClr"), 16);
                }
            } else if (map != null && map.size() > 0) {
                Element element3 = element.element("schemeClr");
                if (element3 == null) {
                    element3 = element.element("prstClr");
                }
                String attributeValue2 = element3.attributeValue("val");
                if (!"black".equals(attributeValue2)) {
                    if ("red".equals(attributeValue2)) {
                        i11 = -65536;
                    } else if ("gray".equals(attributeValue2)) {
                        i11 = -7829368;
                    } else if ("blue".equals(attributeValue2)) {
                        i11 = -16776961;
                    } else if ("green".equals(attributeValue2)) {
                        i11 = -16711936;
                    } else {
                        i11 = -1;
                    }
                }
                if (i11 == -1) {
                    i11 = ((Integer) map.get(attributeValue2)).intValue();
                }
                if (element3.element("tint") != null) {
                    double parseInt2 = Integer.parseInt(element3.element("tint").attributeValue("val")) / 100000.0d;
                    i10 = Color.rgb(com.google.android.play.core.assetpacks.b1.o(parseInt2, Color.red(i11) & FunctionEval.FunctionID.EXTERNAL_FUNC), com.google.android.play.core.assetpacks.b1.o(parseInt2, Color.green(i11) & FunctionEval.FunctionID.EXTERNAL_FUNC), com.google.android.play.core.assetpacks.b1.o(parseInt2, Color.blue(i11) & FunctionEval.FunctionID.EXTERNAL_FUNC));
                } else if (element3.element("lumOff") != null) {
                    double parseInt3 = Integer.parseInt(element3.element("lumOff").attributeValue("val")) / 100000.0d;
                    i10 = Color.rgb(com.google.android.play.core.assetpacks.b1.o(parseInt3, Color.red(i11) & FunctionEval.FunctionID.EXTERNAL_FUNC), com.google.android.play.core.assetpacks.b1.o(parseInt3, Color.green(i11) & FunctionEval.FunctionID.EXTERNAL_FUNC), com.google.android.play.core.assetpacks.b1.o(parseInt3, Color.blue(i11) & FunctionEval.FunctionID.EXTERNAL_FUNC));
                } else if (element3.element("lumMod") != null) {
                    double parseInt4 = (Integer.parseInt(element3.element("lumMod").attributeValue("val")) / 100000.0d) - 1.0d;
                    i10 = Color.rgb(com.google.android.play.core.assetpacks.b1.o(parseInt4, Color.red(i11) & FunctionEval.FunctionID.EXTERNAL_FUNC), com.google.android.play.core.assetpacks.b1.o(parseInt4, Color.green(i11) & FunctionEval.FunctionID.EXTERNAL_FUNC), com.google.android.play.core.assetpacks.b1.o(parseInt4, Color.blue(i11) & FunctionEval.FunctionID.EXTERNAL_FUNC));
                } else if (element3.element("shade") != null) {
                    double d10 = (-Integer.parseInt(element3.element("shade").attributeValue("val"))) / 200000.0d;
                    i10 = Color.rgb(com.google.android.play.core.assetpacks.b1.o(d10, Color.red(i11) & FunctionEval.FunctionID.EXTERNAL_FUNC), com.google.android.play.core.assetpacks.b1.o(d10, Color.green(i11) & FunctionEval.FunctionID.EXTERNAL_FUNC), com.google.android.play.core.assetpacks.b1.o(d10, Color.blue(i11) & FunctionEval.FunctionID.EXTERNAL_FUNC));
                } else {
                    i10 = i11;
                }
                if (element3.element("alpha") != null && (attributeValue = element3.element("alpha").attributeValue("val")) != null) {
                    return (i10 & 16777215) | (((int) ((Integer.parseInt(attributeValue) / 100000.0f) * 255.0f)) << 24);
                }
                return i10;
            }
            return -1;
        }
        return parseInt | (-16777216);
    }

    public static ArrayList M(Context context) {
        kotlin.jvm.internal.g.e(context, "context");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new nl.f(androidx.core.content.a.getColor(context, R.color.edit_color_1), ColorType.Black));
        arrayList.add(new nl.f(androidx.core.content.a.getColor(context, R.color.edit_color_2), ColorType.White));
        arrayList.add(new nl.f(androidx.core.content.a.getColor(context, R.color.edit_color_3)));
        arrayList.add(new nl.f(androidx.core.content.a.getColor(context, R.color.edit_color_4)));
        arrayList.add(new nl.f(androidx.core.content.a.getColor(context, R.color.edit_color_5)));
        arrayList.add(new nl.f(androidx.core.content.a.getColor(context, R.color.edit_color_6)));
        arrayList.add(new nl.f(androidx.core.content.a.getColor(context, R.color.edit_color_7)));
        arrayList.add(new nl.f(androidx.core.content.a.getColor(context, R.color.edit_color_9)));
        arrayList.add(new nl.f(androidx.core.content.a.getColor(context, R.color.edit_color_10)));
        arrayList.add(new nl.f(androidx.core.content.a.getColor(context, R.color.edit_color_11)));
        arrayList.add(new nl.f(androidx.core.content.a.getColor(context, R.color.edit_color_12)));
        arrayList.add(new nl.f(androidx.core.content.a.getColor(context, R.color.edit_color_13)));
        arrayList.add(new nl.f(androidx.core.content.a.getColor(context, R.color.edit_color_14)));
        arrayList.add(new nl.f(androidx.core.content.a.getColor(context, R.color.edit_color_15)));
        return arrayList;
    }

    public static int N(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndexOrThrow("`" + str + "`");
    }

    public static CompressionMethod O(xj.b bVar) {
        CompressionMethod compressionMethod = bVar.c;
        if (compressionMethod != CompressionMethod.AES_INTERNAL_ONLY) {
            return compressionMethod;
        }
        xj.a aVar = bVar.f31830n;
        if (aVar != null) {
            return aVar.f31818d;
        }
        throw new ZipException("AesExtraDataRecord not present in local header for aes encrypted data");
    }

    public static final ArrayList P(ul.c cVar, int i10, int i11) {
        List<Float> list = cVar.f30430g;
        ArrayList arrayList = new ArrayList();
        float f10 = i10;
        float f11 = i11;
        arrayList.add(new Point((int) (list.get(0).floatValue() * f10), (int) (list.get(1).floatValue() * f11)));
        arrayList.add(new Point((int) (list.get(2).floatValue() * f10), (int) (list.get(3).floatValue() * f11)));
        arrayList.add(new Point((int) (list.get(4).floatValue() * f10), (int) (list.get(5).floatValue() * f11)));
        arrayList.add(new Point((int) (list.get(6).floatValue() * f10), (int) (list.get(7).floatValue() * f11)));
        return arrayList;
    }

    public static int Q() {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT+8"));
        int i10 = calendar.get(1);
        return ((calendar.get(2) + 1) * 100) + (i10 * Constants.CP_MAC_ROMAN) + calendar.get(5);
    }

    public static double R(Point point, Point point2) {
        return Math.sqrt(Math.pow(point.y - point2.y, 2.0d) + Math.pow(point.x - point2.x, 2.0d));
    }

    public static final int S(int i10, int i11, int i12) {
        if (i12 > 0) {
            if (i10 < i11) {
                int i13 = i11 % i12;
                if (i13 < 0) {
                    i13 += i12;
                }
                int i14 = i10 % i12;
                if (i14 < 0) {
                    i14 += i12;
                }
                int i15 = (i13 - i14) % i12;
                if (i15 < 0) {
                    i15 += i12;
                }
                return i11 - i15;
            }
            return i11;
        } else if (i12 < 0) {
            if (i10 > i11) {
                int i16 = -i12;
                int i17 = i10 % i16;
                if (i17 < 0) {
                    i17 += i16;
                }
                int i18 = i11 % i16;
                if (i18 < 0) {
                    i18 += i16;
                }
                int i19 = (i17 - i18) % i16;
                if (i19 < 0) {
                    i19 += i16;
                }
                return i11 + i19;
            }
            return i11;
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    public static Rect T(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i10;
        int i11 = iArr[0];
        int i12 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (i11 < Integer.MAX_VALUE) {
            i10 = i11;
        } else {
            i10 = Integer.MAX_VALUE;
        }
        int i13 = iArr2[0];
        if (i13 < i10) {
            i10 = i13;
        }
        int i14 = iArr3[0];
        if (i14 < i10) {
            i10 = i14;
        }
        int i15 = iArr4[0];
        if (i15 < i10) {
            i10 = i15;
        }
        int i16 = iArr[1];
        if (i16 < Integer.MAX_VALUE) {
            i12 = i16;
        }
        int i17 = iArr2[1];
        if (i17 < i12) {
            i12 = i17;
        }
        int i18 = iArr3[1];
        if (i18 < i12) {
            i12 = i18;
        }
        int i19 = iArr4[1];
        if (i19 < i12) {
            i12 = i19;
        }
        if (i11 <= Integer.MIN_VALUE) {
            i11 = Integer.MIN_VALUE;
        }
        if (i13 <= i11) {
            i13 = i11;
        }
        if (i14 <= i13) {
            i14 = i13;
        }
        if (i15 <= i14) {
            i15 = i14;
        }
        if (i16 <= Integer.MIN_VALUE) {
            i16 = Integer.MIN_VALUE;
        }
        if (i17 <= i16) {
            i17 = i16;
        }
        if (i18 <= i17) {
            i18 = i17;
        }
        if (i19 <= i18) {
            i19 = i18;
        }
        return new Rect(i10, i12, i15, i19);
    }

    public static int U(Activity activity) {
        kotlin.jvm.internal.g.e(activity, "activity");
        if (activity.getResources().getConfiguration().orientation == 1) {
            return aj.b.B(activity);
        }
        int i10 = wn.e.f31402a;
        if (i10 > 0) {
            return i10;
        }
        wn.e.f31402a = (int) ((24 * activity.getResources().getDisplayMetrics().density) + 0.5d);
        try {
            int identifier = activity.getResources().getIdentifier(ea.a.p("J3RYdAJzLmIpcjloUWkwaExfPmEnZEVjFXBl", "U9T9wqIs"), ea.a.p("HmkrZW4=", "WHzF9XUL"), ea.a.p("Um4vchxpZA==", "Q0id8mT6"));
            if (identifier != 0) {
                wn.e.f31402a = activity.getResources().getDimensionPixelSize(identifier);
            }
        } catch (Exception unused) {
        }
        return wn.e.f31402a;
    }

    public static final synchronized ExecutorService V() {
        ThreadPoolExecutor threadPoolExecutor;
        synchronized (t0.class) {
            threadPoolExecutor = f28769a;
            if (threadPoolExecutor == null) {
                ge.a z10 = ge.a.z();
                Context m10 = ReaderPdfApplication.m();
                z10.getClass();
                int[] B = ge.a.B(m10);
                ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(B[0], B[1], 60000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque());
                f28769a = threadPoolExecutor2;
                threadPoolExecutor = threadPoolExecutor2;
            }
        }
        return threadPoolExecutor;
    }

    public static long W(int i10) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, i10 / Constants.CP_MAC_ROMAN);
        calendar.set(2, (i10 % Constants.CP_MAC_ROMAN) / 100);
        calendar.set(5, i10 % 100);
        return calendar.getTimeInMillis();
    }

    public static final kotlinx.coroutines.w X(androidx.lifecycle.j0 j0Var) {
        Object obj;
        kotlin.jvm.internal.g.e(j0Var, "<this>");
        HashMap hashMap = j0Var.f4056a;
        if (hashMap == null) {
            obj = null;
        } else {
            synchronized (hashMap) {
                obj = j0Var.f4056a.get("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
            }
        }
        kotlinx.coroutines.w wVar = (kotlinx.coroutines.w) obj;
        if (wVar != null) {
            return wVar;
        }
        kotlinx.coroutines.m1 m1Var = new kotlinx.coroutines.m1(null);
        lg.b bVar = kotlinx.coroutines.j0.f20206a;
        return (kotlinx.coroutines.w) j0Var.c(new androidx.lifecycle.d(m1Var.plus(kotlinx.coroutines.internal.l.f20194a.v())), "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
    }

    public static final boolean Y(ArrayList arrayList, long j10, long j11, String path) {
        kotlin.jvm.internal.g.e(arrayList, "<this>");
        kotlin.jvm.internal.g.e(path, "path");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) it.next();
            if (pdfPreviewEntity.getId() == j10 && pdfPreviewEntity.getSize() == j11 && kotlin.jvm.internal.g.a(pdfPreviewEntity.getPath(), path)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0032, code lost:
        if (r1 == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean Z(android.graphics.RectF r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g.e(r5, r0)
            float r0 = r5.left
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L10
            r2 = r3
            goto L11
        L10:
            r2 = r4
        L11:
            if (r2 == 0) goto L34
            float r2 = r5.top
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 != 0) goto L1b
            r2 = r3
            goto L1c
        L1b:
            r2 = r4
        L1c:
            if (r2 == 0) goto L34
            float r2 = r5.right
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 != 0) goto L26
            r2 = r3
            goto L27
        L26:
            r2 = r4
        L27:
            if (r2 == 0) goto L34
            float r2 = r5.bottom
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L31
            r1 = r3
            goto L32
        L31:
            r1 = r4
        L32:
            if (r1 != 0) goto L43
        L34:
            float r1 = r5.right
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L44
            float r0 = r5.bottom
            float r5 = r5.top
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 < 0) goto L43
            goto L44
        L43:
            r3 = r4
        L44:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.utils.t0.Z(android.graphics.RectF):boolean");
    }

    public static final StateFlowImpl a(Object obj) {
        if (obj == null) {
            obj = ea.a.f16519d;
        }
        return new StateFlowImpl(obj);
    }

    public static boolean a0(int i10) {
        boolean z10;
        double pow;
        double pow2;
        double pow3;
        if (i10 != 0) {
            ThreadLocal<double[]> threadLocal = o0.a.f22637a;
            double[] dArr = threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i10);
            int green = Color.green(i10);
            int blue = Color.blue(i10);
            if (dArr.length == 3) {
                double d10 = red / 255.0d;
                if (d10 < 0.04045d) {
                    pow = d10 / 12.92d;
                } else {
                    pow = Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
                }
                double d11 = green / 255.0d;
                if (d11 < 0.04045d) {
                    pow2 = d11 / 12.92d;
                } else {
                    pow2 = Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
                }
                double d12 = blue / 255.0d;
                if (d12 < 0.04045d) {
                    pow3 = d12 / 12.92d;
                } else {
                    pow3 = Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
                }
                z10 = false;
                dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
                double d13 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
                dArr[1] = d13;
                double d14 = pow3 * 0.9505d;
                dArr[2] = (d14 + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
                if (d13 / 100.0d > 0.5d) {
                    return true;
                }
            } else {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
        } else {
            z10 = false;
        }
        return z10;
    }

    public static String b(File file) {
        if (file.getName().endsWith(".apk")) {
            String replaceFirst = file.getName().replaceFirst("(_\\d+)?\\.apk", "");
            if (replaceFirst.equals("base-master") || replaceFirst.equals("base-main")) {
                return "";
            }
            if (replaceFirst.startsWith("base-")) {
                return replaceFirst.replace("base-", "config.");
            }
            return replaceFirst.replace("-", ".config.").replace(".config.master", "").replace(".config.main", "");
        }
        throw new IllegalArgumentException("Non-apk found in splits directory.");
    }

    public static boolean b0(long j10, long j11) {
        Locale locale = Locale.ENGLISH;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", locale);
        Date date = new Date();
        date.setTime(j10);
        String format = simpleDateFormat.format(date);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd", locale);
        Date date2 = new Date();
        date2.setTime(j11);
        return format.equals(simpleDateFormat2.format(date2));
    }

    public static void c(ArrayList arrayList, ie.d dVar, String str, je.a aVar) {
        if (dVar != null && !TextUtils.isEmpty(dVar.f18490a)) {
            arrayList.add(new yd.c(wd.a.f31073a, str, new j3.h(dVar.f18490a)));
        }
    }

    public static final boolean c0(char c10) {
        if (!Character.isWhitespace(c10) && !Character.isSpaceChar(c10)) {
            return false;
        }
        return true;
    }

    public static final void d(ArrayList arrayList, w4.b bVar, je.a aVar, String order) {
        boolean z10;
        kotlin.jvm.internal.g.e(order, "order");
        if (bVar != null) {
            String str = bVar.f18490a;
            if (str != null && str.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                j3.h hVar = new j3.h(bVar.f18490a);
                ((Bundle) hVar.c).putString("app_id", bVar.f30972b);
                ie.g gVar = aVar.c;
                if (gVar != null) {
                    ((Bundle) hVar.c).putInt("app_icon", gVar.f18488a);
                }
                arrayList.add(new yd.c(v4.b.f30540a, order, hVar));
            }
        }
    }

    public static kotlinx.coroutines.l1 d0(kotlinx.coroutines.w wVar, kotlin.coroutines.a aVar, CoroutineStart coroutineStart, cg.p pVar, int i10) {
        kotlinx.coroutines.l1 l1Var;
        CoroutineContext coroutineContext = aVar;
        if ((i10 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i10 & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        CoroutineContext c10 = CoroutineContextKt.c(wVar, coroutineContext);
        if (coroutineStart.isLazy()) {
            l1Var = new kotlinx.coroutines.e1(c10, pVar);
        } else {
            l1Var = new kotlinx.coroutines.l1(c10, true);
        }
        coroutineStart.invoke(pVar, l1Var, l1Var);
        return l1Var;
    }

    public static void e(ArrayList arrayList, ie.e eVar, String str, yd.a aVar, je.a aVar2) {
        if (eVar != null && !TextUtils.isEmpty(eVar.f18490a)) {
            j3.h hVar = new j3.h(eVar.f18490a);
            ((Bundle) hVar.c).putString("ad_position_key", aVar.f32114b);
            arrayList.add(new yd.c(wd.a.f31075d, str, hVar));
        }
    }

    public static int e0(float f10, int i10, int i11) {
        return o0.a.c(o0.a.d(i11, Math.round(Color.alpha(i11) * f10)), i10);
    }

    public static final void f(ArrayList arrayList, w4.c cVar, je.a aVar, String order) {
        boolean z10;
        kotlin.jvm.internal.g.e(order, "order");
        String str = cVar.f18490a;
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            j3.h hVar = new j3.h(cVar.f18490a);
            ((Bundle) hVar.c).putString("app_id", cVar.f30972b);
            ie.g gVar = aVar.c;
            if (gVar != null) {
                ((Bundle) hVar.c).putInt("app_icon", gVar.f18488a);
            }
            arrayList.add(new yd.c(v4.b.f30542d, order, hVar));
        }
    }

    public static String[] f0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        StringBuilder sb2 = new StringBuilder();
        if (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            sb2.append(intValue);
            sb2.append(ea.a.p("LQ==", "QJg41Wux"));
            while (it.hasNext()) {
                int intValue2 = ((Number) it.next()).intValue();
                if (intValue != intValue2 + 1) {
                    sb2.append(intValue);
                    sb2.append(ea.a.p("LA==", "mBU9tnuP"));
                    sb2.append(intValue2);
                    sb2.append(ea.a.p("LQ==", "sLjEA8Ff"));
                }
                intValue = intValue2;
            }
            sb2.append(intValue);
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g.d(sb3, ea.a.p("QWU4dR90IHUbbFBlGy4ibxd0QGkoZ2sp", "RtYByO5R"));
        return new String[]{sb3};
    }

    public static final int g0(int i10) {
        if (i10 >= 0) {
            if (i10 < 3) {
                return i10 + 1;
            }
            if (i10 < 1073741824) {
                return (int) ((i10 / 0.75f) + 1.0f);
            }
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        return i10;
    }

    public static void h(String str, String str2, JSONArray jSONArray) {
        if (str2.equals("am1-") || str2.equals("admob-") || str2.equals("vk-") || str2.equals("in_m-") || str2.equals("ad_m-") || str2.equals("y_-") || str2.equals("ma-") || str2.equals("pg-") || str2.equals("vg-") || str2.equals("fan-")) {
            JSONArray jSONArray2 = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray2.length(); i10++) {
                String string = jSONArray2.getString(i10);
                if (string.startsWith(str2)) {
                    jSONArray.put(string);
                }
            }
        }
    }

    public static final Map h0(Pair pair) {
        kotlin.jvm.internal.g.e(pair, "pair");
        Map singletonMap = Collections.singletonMap(pair.getFirst(), pair.getSecond());
        kotlin.jvm.internal.g.d(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    public static final void i(ArrayList arrayList, ie.c cVar, String str, je.a aVar) {
        if (!TextUtils.isEmpty(cVar.f18490a)) {
            j3.h hVar = new j3.h(cVar.f18490a);
            if (aVar != null) {
                int i10 = aVar.f19174a;
                if (i10 != 0) {
                    ((Bundle) hVar.c).putInt("layout_id", i10);
                }
                ie.h hVar2 = aVar.f19175b;
                if (hVar2 != null && hVar2.f18489a > 0.0f) {
                    kotlin.jvm.internal.g.b(hVar2);
                    ((Bundle) hVar.c).putFloat("cover_width", hVar2.f18489a);
                }
                if (!kotlin.jvm.internal.g.a("", "")) {
                    ((Bundle) hVar.c).putString("common_config", "");
                }
                ((Bundle) hVar.c).putBoolean("ban_video", false);
                ((Bundle) hVar.c).putInt("ad_choices_position", 1);
            }
            arrayList.add(new yd.c(ud.a.c, str, hVar));
        }
    }

    public static void i0(androidx.fragment.app.u uVar) {
        if (uVar != null) {
            try {
                dp.a a10 = dp.a.a();
                String p10 = ea.a.p("XG0uQRB0C3YbdE0gBnAzbgZyXXc1ZRNkZg==", "tliI815c");
                a10.getClass();
                dp.a.b(uVar, p10);
                Intent intent = new Intent(ea.a.p("Um4vchxpBi4bbkBlB3R4YSd0W28oLgRFZl8rTxtUI05U", "2hUfWa8v"));
                intent.addCategory(ea.a.p("Lm5VchZpUy4zbj5lG3RGY1R0C2cqchwuflAnThRCJEU=", "sMCt1bUh"));
                intent.putExtra(ea.a.p("Um4vchxpBi4bbkBlB3R4ZTx0QGFoTQpNMl8HWQJFUw==", "wSRCxQLB"), v.x());
                intent.setType(ea.a.p("ZS8q", "Ep3lUGfk"));
                uVar.startActivityForResult(intent, 100);
            } catch (Exception e10) {
                e10.printStackTrace();
                dp.a.a().getClass();
                dp.a.d(uVar, e10);
                t1.c(ea.a.p("IHBUbjtyWHcpZRpkZg==", "TcxVQuRv"), e10);
            }
        }
    }

    public static void j(ArrayList arrayList, ie.f fVar, String str, je.a aVar) {
        if (fVar != null && !TextUtils.isEmpty(fVar.f18490a)) {
            j3.h hVar = new j3.h(fVar.f18490a);
            int i10 = aVar.f19174a;
            if (i10 != 0) {
                ((Bundle) hVar.c).putInt("layout_id", i10);
            }
            ie.h hVar2 = aVar.f19175b;
            if (hVar2 != null) {
                float f10 = hVar2.f18489a;
                if (f10 > 0.0f) {
                    ((Bundle) hVar.c).putFloat("cover_width", f10);
                }
            }
            ((Bundle) hVar.c).putInt("ad_choices_position", 1);
            ((Bundle) hVar.c).putBoolean("ban_video", false);
            arrayList.add(new yd.c(wd.a.c, str, hVar));
        }
    }

    public static eh.b j0(lib.zj.office.system.f fVar, ZipPackage zipPackage, PackagePart packagePart, Element element, Map map) {
        String attributeValue;
        PackageRelationship relationship;
        PackagePart part;
        String attributeValue2;
        Element element2;
        if (element != null) {
            try {
                eh.b bVar = new eh.b();
                Element element3 = element.element("solidFill");
                boolean z10 = false;
                if (element3 != null) {
                    bVar.c = (byte) 0;
                    bVar.f16571d = L(map, element3);
                    return bVar;
                }
                Element element4 = element.element("blipFill");
                if (element4 != null) {
                    Element element5 = element4.element("blip");
                    if (element5 != null && element5.attribute("embed") != null && (attributeValue = element5.attributeValue("embed")) != null && (relationship = packagePart.getRelationship(attributeValue)) != null && (part = zipPackage.getPart(relationship.getTargetURI())) != null) {
                        Element element6 = element4.element("tile");
                        if (element6 == null) {
                            bVar.c = (byte) 3;
                            Element element7 = element4.element("stretch");
                            if (element7 != null && (element2 = element7.element("fillRect")) != null) {
                                kh.c cVar = new kh.c();
                                String attributeValue3 = element2.attributeValue(OperatorName.LINE_TO);
                                boolean z11 = true;
                                if (attributeValue3 != null) {
                                    cVar.f19759a = Float.parseFloat(attributeValue3) / 100000.0f;
                                    z10 = true;
                                }
                                String attributeValue4 = element2.attributeValue("r");
                                if (attributeValue4 != null) {
                                    cVar.f19760b = Float.parseFloat(attributeValue4) / 100000.0f;
                                    z10 = true;
                                }
                                String attributeValue5 = element2.attributeValue("t");
                                if (attributeValue5 != null) {
                                    cVar.c = Float.parseFloat(attributeValue5) / 100000.0f;
                                    z10 = true;
                                }
                                String attributeValue6 = element2.attributeValue("b");
                                if (attributeValue6 != null) {
                                    cVar.f19761d = Float.parseFloat(attributeValue6) / 100000.0f;
                                } else {
                                    z11 = z10;
                                }
                                if (z11) {
                                    bVar.f16570b = cVar;
                                }
                            }
                            bVar.f16572e = fVar.o().g().d(part);
                        } else {
                            int d10 = fVar.o().g().d(part);
                            bVar.c = (byte) 2;
                            eh.g S = aj.b.S(fVar.o().g().j(d10), element6);
                            Element element8 = element5.element("alphaModFix");
                            if (element8 != null && (attributeValue2 = element8.attributeValue("amt")) != null) {
                                S.f16567a = Math.round((Integer.parseInt(attributeValue2) / 100000.0f) * 255.0f);
                            }
                            bVar.c(S);
                        }
                        return bVar;
                    }
                } else {
                    Element element9 = element.element("gradFill");
                    if (element9 != null) {
                        element9.element("gsLst");
                        bVar.c = aj.b.s(element9);
                        bVar.c(aj.b.R(map, element9));
                        return bVar;
                    }
                    Element element10 = element.element("fillRef");
                    if (element10 != null) {
                        bVar.c = (byte) 0;
                        bVar.f16571d = L(map, element10);
                        return bVar;
                    }
                    Element element11 = element.element("pattFill");
                    if (element11 != null) {
                        Element element12 = element11.element("bgClr");
                        bVar.c = (byte) 0;
                        bVar.f16571d = L(map, element12);
                        return bVar;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static final void k(ArrayList arrayList, w4.e eVar, je.a aVar, String order) {
        boolean z10;
        kotlin.jvm.internal.g.e(order, "order");
        String str = eVar.f18490a;
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            j3.h hVar = new j3.h(eVar.f18490a);
            ((Bundle) hVar.c).putString("app_id", eVar.f30972b);
            int i10 = aVar.f19174a;
            if (i10 != 0) {
                ((Bundle) hVar.c).putInt("layout_id", i10);
            }
            ie.h hVar2 = aVar.f19175b;
            if (hVar2 != null && hVar2.f18489a > 0.0f) {
                kotlin.jvm.internal.g.b(hVar2);
                ((Bundle) hVar.c).putFloat("cover_width", hVar2.f18489a);
            }
            ie.g gVar = aVar.c;
            if (gVar != null) {
                ((Bundle) hVar.c).putInt("app_icon", gVar.f18488a);
            }
            arrayList.add(new yd.c(v4.b.f30541b, order, hVar));
        }
    }

    public static int k0(InputStream inputStream, byte[] bArr, int i10, int i11) {
        if (i10 >= 0) {
            if (i11 >= 0) {
                int i12 = 0;
                if (i11 == 0) {
                    return 0;
                }
                if (i10 + i11 <= bArr.length) {
                    while (i12 != i11) {
                        int read = inputStream.read(bArr, i10 + i12, i11 - i12);
                        if (read == -1) {
                            if (i12 == 0) {
                                return -1;
                            }
                            return i12;
                        }
                        i12 += read;
                    }
                    return i12;
                }
                throw new IllegalArgumentException("Length greater than buffer size");
            }
            throw new IllegalArgumentException("Negative length");
        }
        throw new IllegalArgumentException("Negative offset");
    }

    public static final void l(ArrayList arrayList, ie.c cVar, String str, je.a aVar) {
        if (cVar != null && !TextUtils.isEmpty(cVar.f18490a)) {
            j3.h hVar = new j3.h(cVar.f18490a);
            if (aVar != null) {
                int i10 = aVar.f19174a;
                if (i10 != 0) {
                    ((Bundle) hVar.c).putInt("layout_id", i10);
                }
                if (!kotlin.jvm.internal.g.a("", "")) {
                    ((Bundle) hVar.c).putString("common_config", "");
                }
                ((Bundle) hVar.c).putInt("ad_choices_position", 1);
            }
            arrayList.add(new yd.c(ud.a.f30280b, str, hVar));
        }
    }

    public static int l0(PushbackInputStream pushbackInputStream, byte[] bArr) {
        int read = pushbackInputStream.read(bArr);
        if (read != -1) {
            if (read != bArr.length) {
                if (read >= 0) {
                    int i10 = 0;
                    if (read == 0) {
                        read = 0;
                    } else {
                        int length = bArr.length - read;
                        for (int i11 = 1; read < bArr.length && i10 != -1 && i11 < 15; i11++) {
                            i10 = pushbackInputStream.read(bArr, read, length);
                            if (i10 > 0) {
                                read += i10;
                                length -= i10;
                            }
                        }
                    }
                    if (read != bArr.length) {
                        throw new IOException("Cannot read fully into byte buffer");
                    }
                } else {
                    throw new IOException("Invalid readLength");
                }
            }
            return read;
        }
        throw new IOException("Unexpected EOF reached when trying to read stream");
    }

    public static void m(ArrayList arrayList, ie.f fVar, String str, je.a aVar) {
        if (fVar != null && !TextUtils.isEmpty(fVar.f18490a)) {
            j3.h hVar = new j3.h(fVar.f18490a);
            int i10 = aVar.f19174a;
            if (i10 != 0) {
                ((Bundle) hVar.c).putInt("layout_id", i10);
            }
            ((Bundle) hVar.c).putInt("ad_choices_position", 1);
            arrayList.add(new yd.c(wd.a.f31074b, str, hVar));
        }
    }

    public static String m0(File file) {
        Charset charset = kotlin.text.a.f19966b;
        kotlin.jvm.internal.g.e(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[8192];
            for (int read = inputStreamReader.read(cArr); read >= 0; read = inputStreamReader.read(cArr)) {
                stringWriter.write(cArr, 0, read);
            }
            String stringWriter2 = stringWriter.toString();
            kotlin.jvm.internal.g.d(stringWriter2, "buffer.toString()");
            o9.d.l(inputStreamReader, null);
            return stringWriter2;
        } finally {
        }
    }

    public static final void n(ArrayList arrayList, w4.d dVar, je.a aVar, String order) {
        boolean z10;
        kotlin.jvm.internal.g.e(order, "order");
        if (dVar != null) {
            String str = dVar.f18490a;
            if (str != null && str.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                j3.h hVar = new j3.h(dVar.f18490a);
                ((Bundle) hVar.c).putString("app_id", dVar.f30972b);
                int i10 = aVar.f19174a;
                if (i10 != 0) {
                    ((Bundle) hVar.c).putInt("layout_id", i10);
                }
                ie.g gVar = aVar.c;
                if (gVar != null) {
                    ((Bundle) hVar.c).putInt("app_icon", gVar.f18488a);
                }
                arrayList.add(new yd.c(v4.b.c, order, hVar));
            }
        }
    }

    public static final int n0(double d10) {
        if (!Double.isNaN(d10)) {
            if (d10 > 2.147483647E9d) {
                return Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            if (d10 < -2.147483648E9d) {
                return SlideAtom.USES_MASTER_SLIDE_ID;
            }
            return (int) Math.round(d10);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static kotlinx.coroutines.c0 o(kotlinx.coroutines.internal.d dVar, cg.p pVar) {
        kotlinx.coroutines.c0 c0Var;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        CoroutineContext c10 = CoroutineContextKt.c(dVar, emptyCoroutineContext);
        if (coroutineStart.isLazy()) {
            c0Var = new kotlinx.coroutines.d1(c10, pVar);
        } else {
            c0Var = new kotlinx.coroutines.c0(c10, true);
        }
        coroutineStart.invoke(pVar, c0Var, c0Var);
        return c0Var;
    }

    public static final int o0(float f10) {
        if (!Float.isNaN(f10)) {
            return Math.round(f10);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static boolean p(int i10) {
        if (i10 != 2 && i10 != 7 && i10 != 3) {
            return false;
        }
        return true;
    }

    public static int p0(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static final Bundle q(Pair... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair pair : pairArr) {
            String str = (String) pair.component1();
            Object component2 = pair.component2();
            if (component2 == null) {
                bundle.putString(str, null);
            } else if (component2 instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) component2).booleanValue());
            } else if (component2 instanceof Byte) {
                bundle.putByte(str, ((Number) component2).byteValue());
            } else if (component2 instanceof Character) {
                bundle.putChar(str, ((Character) component2).charValue());
            } else if (component2 instanceof Double) {
                bundle.putDouble(str, ((Number) component2).doubleValue());
            } else if (component2 instanceof Float) {
                bundle.putFloat(str, ((Number) component2).floatValue());
            } else if (component2 instanceof Integer) {
                bundle.putInt(str, ((Number) component2).intValue());
            } else if (component2 instanceof Long) {
                bundle.putLong(str, ((Number) component2).longValue());
            } else if (component2 instanceof Short) {
                bundle.putShort(str, ((Number) component2).shortValue());
            } else if (component2 instanceof Bundle) {
                bundle.putBundle(str, (Bundle) component2);
            } else if (component2 instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) component2);
            } else if (component2 instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) component2);
            } else if (component2 instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) component2);
            } else if (component2 instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) component2);
            } else if (component2 instanceof char[]) {
                bundle.putCharArray(str, (char[]) component2);
            } else if (component2 instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) component2);
            } else if (component2 instanceof float[]) {
                bundle.putFloatArray(str, (float[]) component2);
            } else if (component2 instanceof int[]) {
                bundle.putIntArray(str, (int[]) component2);
            } else if (component2 instanceof long[]) {
                bundle.putLongArray(str, (long[]) component2);
            } else if (component2 instanceof short[]) {
                bundle.putShortArray(str, (short[]) component2);
            } else if (component2 instanceof Object[]) {
                Class<?> componentType = component2.getClass().getComponentType();
                kotlin.jvm.internal.g.b(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) component2);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) component2);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) component2);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(str, (Serializable) component2);
                } else {
                    throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                }
            } else if (component2 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) component2);
            } else if (component2 instanceof IBinder) {
                s0.b.a(bundle, str, (IBinder) component2);
            } else if (component2 instanceof Size) {
                s0.c.a(bundle, str, (Size) component2);
            } else if (component2 instanceof SizeF) {
                s0.c.b(bundle, str, (SizeF) component2);
            } else {
                throw new IllegalArgumentException("Illegal value type " + component2.getClass().getCanonicalName() + " for key \"" + str + '\"');
            }
        }
        return bundle;
    }

    public static final void q0(View view, androidx.lifecycle.p pVar) {
        kotlin.jvm.internal.g.e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, pVar);
    }

    public static boolean r(int i10, int i11) {
        if (i10 == 5) {
            if (i11 != 5) {
                return true;
            }
            i10 = 5;
        }
        if (i10 == 6) {
            if (i11 != 6 && i11 != 5) {
                return true;
            }
            i10 = 6;
        }
        if (i10 == 4 && i11 != 4) {
            return true;
        }
        if (i10 == 3 && (i11 == 2 || i11 == 7 || i11 == 1 || i11 == 8)) {
            return true;
        }
        if (i10 == 2) {
            if (i11 == 1 || i11 == 8) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final void r0(View view, z1.c cVar) {
        kotlin.jvm.internal.g.e(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, cVar);
    }

    public static void s(String str, boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public static vf.a s0(boolean z10, cg.a aVar, int i10) {
        int i11;
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 16) != 0) {
            i11 = -1;
        } else {
            i11 = 0;
        }
        vf.a aVar2 = new vf.a(aVar);
        if (i11 > 0) {
            aVar2.setPriority(i11);
        }
        if (z10) {
            aVar2.start();
        }
        return aVar2;
    }

    public static void t(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static final MergePdfData t0(DecryptContainer decryptContainer) {
        kotlin.jvm.internal.g.e(decryptContainer, "<this>");
        PdfPreviewEntity l10 = aj.b.l(decryptContainer.getPdfPreviewEntity());
        kotlin.jvm.internal.g.d(l10, ea.a.p("LG8CeT5kNlA6ZRBpUXcSbkxpJnlhdF5pBy4BZDdQMGU5aRd3K24kaTx5KQ==", "UrOrnP9V"));
        return new MergePdfData(l10, true, decryptContainer.getNewPath(), 0L, 8, null);
    }

    public static nl.f u(Context context, int i10) {
        Object obj;
        boolean z10;
        kotlin.jvm.internal.g.e(context, "context");
        Iterator it = M(context).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((nl.f) obj).f22603a == i10) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        nl.f fVar = (nl.f) obj;
        if (fVar == null) {
            return new nl.f(androidx.core.content.a.getColor(context, R.color.edit_color_1), ColorType.Black);
        }
        return fVar;
    }

    public static final Map u0(AbstractMap abstractMap) {
        kotlin.jvm.internal.g.e(abstractMap, "<this>");
        Map.Entry entry = (Map.Entry) abstractMap.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        kotlin.jvm.internal.g.d(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    public static void v(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }

    public static final boolean v0(List list, PdfPreviewEntity entity) {
        boolean z10;
        kotlin.jvm.internal.g.e(list, "<this>");
        kotlin.jvm.internal.g.e(entity, "entity");
        Iterator it = list.iterator();
        int i10 = 0;
        while (true) {
            if (it.hasNext()) {
                if (((PdfPreviewEntity) it.next()).getId() == entity.getId()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            return false;
        }
        list.set(i10, entity);
        return true;
    }

    public static final void w(int i10) {
        if (new hg.c(2, 36).b(i10)) {
            return;
        }
        StringBuilder e10 = androidx.appcompat.view.menu.d.e("radix ", i10, " was not in valid range ");
        e10.append(new hg.c(2, 36));
        throw new IllegalArgumentException(e10.toString());
    }

    public static final Object w0(CoroutineContext coroutineContext, cg.p pVar, kotlin.coroutines.c cVar) {
        CoroutineContext a10;
        Object Z;
        CoroutineContext context = cVar.getContext();
        boolean z10 = false;
        if (!CoroutineContextKt.b(coroutineContext)) {
            a10 = context.plus(coroutineContext);
        } else {
            a10 = CoroutineContextKt.a(context, coroutineContext, false);
        }
        b.b.s(a10);
        if (a10 == context) {
            kotlinx.coroutines.internal.p pVar2 = new kotlinx.coroutines.internal.p(cVar, a10);
            Z = ea.a.A(pVar2, pVar2, pVar);
        } else {
            d.a aVar = d.a.f19936a;
            if (kotlin.jvm.internal.g.a(a10.get(aVar), context.get(aVar))) {
                kotlinx.coroutines.q1 q1Var = new kotlinx.coroutines.q1(cVar, a10);
                CoroutineContext coroutineContext2 = q1Var.c;
                Object c10 = ThreadContextKt.c(coroutineContext2, null);
                try {
                    Object A = ea.a.A(q1Var, q1Var, pVar);
                    ThreadContextKt.a(coroutineContext2, c10);
                    Z = A;
                } catch (Throwable th2) {
                    ThreadContextKt.a(coroutineContext2, c10);
                    throw th2;
                }
            } else {
                kotlinx.coroutines.f0 f0Var = new kotlinx.coroutines.f0(cVar, a10);
                kg.a.a(pVar, f0Var, f0Var);
                while (true) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = kotlinx.coroutines.f0.f20048e;
                    int i10 = atomicIntegerFieldUpdater.get(f0Var);
                    if (i10 != 0) {
                        if (i10 != 2) {
                            throw new IllegalStateException("Already suspended".toString());
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(f0Var, 0, 1)) {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    Z = CoroutineSingletons.COROUTINE_SUSPENDED;
                } else {
                    Z = aj.b.Z(f0Var.S());
                    if (Z instanceof kotlinx.coroutines.p) {
                        throw ((kotlinx.coroutines.p) Z).f20226a;
                    }
                }
            }
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return Z;
    }

    public static int x(int i10, int i11) {
        return o0.a.d(i10, (Color.alpha(i10) * i11) / FunctionEval.FunctionID.EXTERNAL_FUNC);
    }

    public static final Object x0(CoroutineContext coroutineContext, Object obj, Object obj2, cg.p pVar, kotlin.coroutines.c frame) {
        Object c10 = ThreadContextKt.c(coroutineContext, obj2);
        try {
            kotlinx.coroutines.flow.internal.n nVar = new kotlinx.coroutines.flow.internal.n(frame, coroutineContext);
            kotlin.jvm.internal.k.c(2, pVar);
            Object invoke = pVar.invoke(obj, nVar);
            ThreadContextKt.a(coroutineContext, c10);
            if (invoke == CoroutineSingletons.COROUTINE_SUSPENDED) {
                kotlin.jvm.internal.g.e(frame, "frame");
            }
            return invoke;
        } catch (Throwable th2) {
            ThreadContextKt.a(coroutineContext, c10);
            throw th2;
        }
    }

    public static byte[] y(char[] cArr, boolean z10) {
        int i10 = 0;
        if (z10) {
            try {
                ByteBuffer encode = zj.b.f32398b.encode(CharBuffer.wrap(cArr));
                byte[] bArr = new byte[encode.limit()];
                encode.get(bArr);
                return bArr;
            } catch (Exception unused) {
                byte[] bArr2 = new byte[cArr.length];
                while (i10 < cArr.length) {
                    bArr2[i10] = (byte) cArr[i10];
                    i10++;
                }
                return bArr2;
            }
        }
        byte[] bArr3 = new byte[cArr.length];
        while (i10 < cArr.length) {
            bArr3[i10] = (byte) cArr[i10];
            i10++;
        }
        return bArr3;
    }

    public static final PdfPreviewEntity z(String path, PdfPreviewEntity pdfPreviewEntity) {
        kotlin.jvm.internal.g.e(pdfPreviewEntity, "<this>");
        kotlin.jvm.internal.g.e(path, "path");
        PdfPreviewEntity pdfPreviewEntity2 = new PdfPreviewEntity();
        pdfPreviewEntity2.setId(pdfPreviewEntity.getId());
        pdfPreviewEntity2.setName(pdfPreviewEntity.getName());
        pdfPreviewEntity2.setSize(pdfPreviewEntity.getSize());
        pdfPreviewEntity2.setDate(pdfPreviewEntity.getDate());
        pdfPreviewEntity2.setFavorite(pdfPreviewEntity.getFavorite());
        pdfPreviewEntity2.setFavoriteDate(pdfPreviewEntity.getFavoriteDate());
        pdfPreviewEntity2.setRecent(pdfPreviewEntity.getRecent());
        pdfPreviewEntity2.setRecentDate(pdfPreviewEntity.getRecentDate());
        pdfPreviewEntity2.setHighlightOnce(pdfPreviewEntity.isHighlightOnce());
        pdfPreviewEntity2.setPath(path);
        pdfPreviewEntity2.setOtherBoolOne(pdfPreviewEntity.isOtherBoolOne());
        pdfPreviewEntity2.setOtherStrOne(pdfPreviewEntity.getOtherStrOne());
        pdfPreviewEntity2.setOtherStrTwo(pdfPreviewEntity.getOtherStrTwo());
        return pdfPreviewEntity2;
    }

    @Override // o3.d0
    public Object g(JsonReader jsonReader, float f10) {
        return Float.valueOf(o3.m.d(jsonReader) * f10);
    }
