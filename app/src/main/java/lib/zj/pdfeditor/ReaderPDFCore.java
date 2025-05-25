package lib.zj.pdfeditor;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import androidx.annotation.Keep;
import ij.a;
import java.io.Closeable;
import java.io.File;
import java.io.FileDescriptor;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import lib.zj.office.fc.codec.CharEncoding;
import lib.zj.pdfeditor.Annotation;
import lib.zj.pdfeditor.text.AdjustAction;
import lib.zj.pdfeditor.text.AdjustActionInfo;
import lib.zj.pdfeditor.text.PDFFreeTextEditView;
import nj.a;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.utils.c1;
import pj.a;

/* loaded from: classes3.dex */
public class ReaderPDFCore {
    public static final String PDF_FOLDER = "AZ Read";
    public static final String PDF_NEW_FOLDER = "PDF Reader";
    private static boolean isSoLoadSuccess;
    private static ConcurrentHashMap<Integer, ArrayList<kj.b>> sPageStampAnnotMap;
    private static HashMap<Integer, ArrayList<kj.b>> sSavedPageStampAnnotMap;
    private a0 curEditPDFPageView;
    private byte[] fileBuffer;
    private String fileName;
    private String file_format;
    private long globals;
    private boolean isUnencryptedPDF;
    private volatile qg.i listener;
    private float pageHeight;
    private volatile qg.h pageManagerListener;
    private float pageWidth;
    private oj.e reflowHelper;
    private z repository;
    protected volatile Map<Integer, ArrayList<ij.b>> savedUpdateEditActionList;
    protected volatile Map<Integer, ArrayList<lj.a>> translateFreeTextAnnotationDatas;
    private List<String> usedFunctions;
    private boolean wasOpenedFromBuffer;
    private int numPages = -1;
    private final HashSet<c> RCacheSet = new HashSet<>();
    private final AtomicBoolean isDestroying = new AtomicBoolean(false);
    private final ConcurrentHashMap<Integer, Long> pointerHandler = new ConcurrentHashMap<>();
    private final LinkedBlockingDeque<ij.b> pageDoEditActionQueueList = new LinkedBlockingDeque<>();
    private final LinkedBlockingDeque<ij.b> pageUndoEditActionQueueList = new LinkedBlockingDeque<>();
    private final LinkedBlockingDeque<ij.e> pageManagerDoQueueList = new LinkedBlockingDeque<>();
    private final LinkedBlockingDeque<ij.e> pageManagerUndoQueueList = new LinkedBlockingDeque<>();
    private volatile boolean isSavingPdf = false;
    private final LinkedHashMap<Long, ij.a> saveDrawPathLinkedHashMap = new LinkedHashMap<>();
    private final LinkedHashMap<Long, ij.a> drawPathLinkedHashMap = new LinkedHashMap<>();
    private volatile int deleteAnnotationCnt = 0;
    private LinkedHashMap<Long, ij.b> tmpNeedSaveTextMap = new LinkedHashMap<>();
    private int skipStamp = -1;
    private final mj.g textEditorExecutor = new mj.g();

    /* loaded from: classes3.dex */
    public static class BaseCookie {

        /* renamed from: a  reason: collision with root package name */
        public volatile long f21366a = 0;

        /* renamed from: b  reason: collision with root package name */
        public volatile boolean f21367b = false;

        public final synchronized void a() {
            if (this.f21366a != 0) {
                ReaderPDFCore.abortCookie(this.f21366a);
            }
            this.f21367b = true;
        }

        @Keep
        public synchronized boolean isAborted() {
            return this.f21367b;
        }

        @Keep
        public synchronized void setCookiePtr(long j10) {
            this.f21366a = j10;
        }
    }

    /* loaded from: classes3.dex */
    public enum CX_Status {
        CX_None,
        CX_Start,
        CX_End,
        CX_Middle,
        CX_All,
        CX_Max
    }

    /* loaded from: classes3.dex */
    public class Cookie extends BaseCookie {
    }

    @Keep
    /* loaded from: classes3.dex */
    public static class DotInfo {
        public static final int DIR_BACK = -1;
        public static final int DIR_CURR = 0;
        public static final int DIR_FORWARD = 1;
        public RectF box;
        public int direction;

        public DotInfo(float f10, float f11, float f12, float f13, int i10) {
            RectF rectF = new RectF();
            this.box = rectF;
            rectF.left = f10;
            rectF.top = f11;
            rectF.right = f12;
            rectF.bottom = f13;
            this.direction = i10;
        }
    }

    @Keep
    /* loaded from: classes3.dex */
    public static class FontInfo {
        public boolean bold;
        public int color;
        public int colorWithAlpha;
        public boolean italic;
        public String name;
        public boolean serif;
        public int size;
        public boolean underline;

        public FontInfo(String str, int i10, boolean z10, boolean z11, boolean z12, int i11, boolean z13) {
            int i12;
            this.name = str;
            this.size = i10;
            this.serif = z10;
            this.bold = z11;
            this.italic = z12;
            this.color = i11;
            if (i11 == -1) {
                i12 = 0;
            } else {
                i12 = (-16777216) | i11;
            }
            this.colorWithAlpha = i12;
            this.underline = z13;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("FontInfo{name='");
            sb2.append(this.name);
            sb2.append("', size=");
            sb2.append(this.size);
            sb2.append(", serif=");
            sb2.append(this.serif);
            sb2.append(", bold=");
            sb2.append(this.bold);
            sb2.append(", italic=");
            sb2.append(this.italic);
            sb2.append(", color=");
            sb2.append(this.color);
            sb2.append(", colorWithAlpha=");
            return androidx.activity.f.n(sb2, this.colorWithAlpha, '}');
        }
    }

    @Keep
    /* loaded from: classes3.dex */
    public static class SelectInfo {
        public RectF[] area;
        public boolean bold;
        public int color;
        public int colorWithAlpha;
        public boolean italic;
        public float maxSize;
        public float minSize;
        public String name;
        public float targetSize;
        public boolean underline;
        public int boldState = -1;
        public int italicState = -1;
        public int underlineState = -1;

        public SelectInfo(String str, float f10, float f11, boolean z10, boolean z11, int i10, boolean z12) {
            int i11;
            this.name = str;
            this.maxSize = f10;
            this.minSize = f11;
            this.bold = z10;
            this.italic = z11;
            this.color = i10;
            if (i10 == -1) {
                i11 = 0;
            } else {
                i11 = (-16777216) | i10;
            }
            this.colorWithAlpha = i11;
            this.underline = z12;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("SelectInfo{name='");
            sb2.append(this.name);
            sb2.append("', maxSize=");
            sb2.append(this.maxSize);
            sb2.append(", minSize=");
            sb2.append(this.minSize);
            sb2.append(", targetSize=");
            sb2.append(this.targetSize);
            sb2.append(", bold=");
            sb2.append(this.bold);
            sb2.append(", boldState=");
            sb2.append(this.boldState);
            sb2.append(", italic=");
            sb2.append(this.italic);
            sb2.append(", italicState=");
            sb2.append(this.italicState);
            sb2.append(", underline=");
            sb2.append(this.underline);
            sb2.append(", underlineState=");
            sb2.append(this.underlineState);
            sb2.append(", color=");
            sb2.append(this.color);
            sb2.append(", colorWithAlpha=");
            sb2.append(this.colorWithAlpha);
            sb2.append(", area=");
            return androidx.activity.r.f(sb2, Arrays.toString(this.area), '}');
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21369a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f21370b;

        static {
            int[] iArr = new int[WidgetType.values().length];
            f21370b = iArr;
            try {
                iArr[WidgetType.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21370b[WidgetType.LISTBOX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21370b[WidgetType.COMBOBOX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21370b[WidgetType.SIGNATURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Annotation.Type.values().length];
            f21369a = iArr2;
            try {
                iArr2[Annotation.Type.FREETEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21369a[Annotation.Type.HIGHLIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21369a[Annotation.Type.UNDERLINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21369a[Annotation.Type.STRIKEOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21369a[Annotation.Type.INK.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Closeable {

        /* renamed from: a  reason: collision with root package name */
        public long f21371a;

        public b(long j10) {
            this.f21371a = j10;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            long j10 = this.f21371a;
            if (j10 != 0) {
                ReaderPDFCore.this.endPage(j10);
                this.f21371a = 0L;
            }
        }
    }

    /* loaded from: classes3.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        public volatile long f21373a;

        public c(long j10) {
            this.f21373a = j10;
            ReaderPDFCore.this.addRCache(this);
        }

        public static void a(c cVar) {
            synchronized (ReaderPDFCore.this) {
                if (cVar.f21373a != 0) {
                    ReaderPDFCore.this.destroyReflowCache(cVar.f21373a);
                    cVar.f21373a = 0L;
                }
            }
        }

        public final d b(Integer num, Integer num2, Integer num3, Float f10, Float f11, Cookie cookie) {
            synchronized (ReaderPDFCore.this) {
                if (this.f21373a == 0) {
                    return null;
                }
                if (ReaderPDFCore.this.isDestroyed()) {
                    return null;
                }
                return d.a(ReaderPDFCore.this.doReflowPage(this.f21373a, num, num2, num3, f10, f11, cookie));
            }
        }

        public final int[] c() {
            synchronized (ReaderPDFCore.this) {
                if (this.f21373a == 0) {
                    return null;
                }
                if (!ReaderPDFCore.this.isDestroyed()) {
                    Object cacheInfo = ReaderPDFCore.this.getCacheInfo(this.f21373a, "dst_bmp_info");
                    if (!(cacheInfo instanceof int[])) {
                        return null;
                    }
                    return (int[]) cacheInfo;
                }
                return null;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f21375a;

        /* renamed from: b  reason: collision with root package name */
        public final Bitmap f21376b;
        public final int c;

        public d(Bitmap bitmap, int i10, int i11) {
            this.f21375a = i10;
            this.f21376b = bitmap;
            this.c = i11;
        }

        public static d a(Object[] objArr) {
            if (objArr != null && objArr.length == 3) {
                Object obj = objArr[0];
                if (obj instanceof Integer) {
                    Object obj2 = objArr[1];
                    if ((obj2 == null || (obj2 instanceof Bitmap)) && (objArr[2] instanceof Integer)) {
                        return new d((Bitmap) objArr[1], ((Integer) obj).intValue(), ((Integer) objArr[2]).intValue());
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
    }

    static {
        try {
            System.out.println("Loading dll");
            System.loadLibrary("zjpdf");
            System.out.println("Loaded dll");
            isSoLoadSuccess = true;
        } catch (Throwable unused) {
            isSoLoadSuccess = false;
            a.C0300a.f22499a.a();
        }
        sPageStampAnnotMap = new ConcurrentHashMap<>();
        sSavedPageStampAnnotMap = new HashMap<>();
    }

    public ReaderPDFCore(Context context) {
        this.fileName = "null";
        if (!isSoLoadSuccess) {
            nj.a aVar = a.C0300a.f22499a;
            new IllegalStateException("ReaderPDFCore openFile so load fail");
            aVar.a();
            return;
        }
        this.fileName = "created";
        long createDoc = createDoc();
        this.globals = createDoc;
        if (createDoc != 0) {
            pg.a.c().b().getClass();
            setUndoRedoMaxCount(c1.v(context));
            this.file_format = fileFormatInternal();
            this.isUnencryptedPDF = isUnencryptedPDFInternal();
            this.wasOpenedFromBuffer = true;
            return;
        }
        throw new Exception(String.format(context.getString(R.string.arg_res_0x7f13009a), this.fileName));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void abandonWriter(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void abortCookie(long j10);

    private native void addInkAnnotationInternal(PointF[][] pointFArr, int[] iArr, float[] fArr);

    private native void addMarkupAnnotationInternal(PointF[] pointFArr, int i10);

    private synchronized void addNewTextRecord(int i10, PDFFreeTextEditView pDFFreeTextEditView, AdjustActionInfo adjustActionInfo, float f10, float f11) {
        if (adjustActionInfo == null) {
            return;
        }
        ij.b bVar = new ij.b(Annotation.Type.FREETEXT, pDFFreeTextEditView, adjustActionInfo, f10, f11);
        bVar.f18518a = i10;
        this.pageDoEditActionQueueList.offer(bVar);
    }

    public static void addPageStampAnnotDataMap(Integer num, ArrayList<kj.b> arrayList) {
        sPageStampAnnotMap.put(num, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRCache(c cVar) {
        synchronized (this.RCacheSet) {
            this.RCacheSet.add(cVar);
        }
    }

    public static void addSavedPageStampAnnotMap(Integer num, ArrayList<kj.b> arrayList) {
        sSavedPageStampAnnotMap.put(num, arrayList);
    }

    private native void addTextAnnotationInternal(float[] fArr, String str, int i10, float f10);

    private native void addTextAnnotationInternal2(float[] fArr, String str, int i10, float f10, Bitmap bitmap);

    private native boolean adjustPageInternal(int[] iArr, float f10, float f11, int i10, int i11, int i12, boolean z10);

    private native boolean adjustPageInternalBySize(int[] iArr, float f10, float f11, int i10, int i11, int i12, boolean z10);

    private native boolean authenticatePasswordInternal(String str);

    private native long beginPage(float f10, float f11);

    public static RectF buildRectF(float f10, float f11, float f12, float f13, float f14) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(f10, f11);
        matrix.preRotate(f14);
        RectF rectF = new RectF((-f12) / 2.0f, (-f13) / 2.0f, f12 / 2.0f, f13 / 2.0f);
        matrix.mapRect(rectF);
        return rectF;
    }

    private native String checkFocusedSignatureInternal();

    private native synchronized long checkReflowPage(int i10, int i11, int i12, int i13, int i14, int i15, float f10, float f11, Cookie cookie);

    public static void clearPageStampAnnotDataMap() {
        sPageStampAnnotMap.clear();
        sSavedPageStampAnnotMap.clear();
    }

    private native boolean clearUndoRedoInternal();

    public static int compressPdf(String str, String str2, String str3, int i10, PDFListener pDFListener) {
        String str4;
        if (i10 > 0) {
            str4 = "yes";
        } else {
            str4 = "no";
        }
        StringBuilder f10 = android.support.v4.media.session.h.f("encrypt=no,garbage=2,compress=", str4, ",compress-fonts=", str4, ",compress-images=");
        f10.append(str4);
        f10.append(",compress-rate=");
        f10.append(i10);
        f10.append(",owner-password=");
        return createPdfInternal(str, str2, androidx.activity.f.o(f10, str3, ",user-password=", str3), pDFListener);
    }

    private native int controlSepOnPageInternal(int i10, int i11, boolean z10);

    private native int countPagesInternal();

    private synchronized int countPagesSynchronized() {
        if (isDestroyed()) {
            return 0;
        }
        return countPagesInternal();
    }

    private native long createDoc();

    private native boolean createFile(String str, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17);

    public static int createPdf(String str, String str2, String str3, boolean z10, PDFListener pDFListener) {
        String str4;
        StringBuilder sb2 = new StringBuilder("encrypt=");
        if (z10) {
            str4 = "yes";
        } else {
            str4 = "no";
        }
        a6.h.l(sb2, str4, ",owner-password=", str3, ",user-password=");
        sb2.append(str3);
        return createPdfInternal(str, str2, sb2.toString(), pDFListener);
    }

    private static native int createPdfInternal(String str, String str2, String str3, PDFListener pDFListener);

    private native boolean delPageImg(int i10, int i11, int i12, String str);

    private native void deleteAnnotationInternal(int i10);

    private native int deleteAnnotationsInternal(int[] iArr, int i10);

    private void deleteDoEdition(ij.b bVar) {
        if (bVar == null) {
            return;
        }
        LinkedBlockingDeque<ij.b> linkedBlockingDeque = this.pageDoEditActionQueueList;
        if (linkedBlockingDeque != null && !linkedBlockingDeque.isEmpty()) {
            this.pageDoEditActionQueueList.remove(bVar);
        }
        this.pageUndoEditActionQueueList.offer(bVar);
        doStateCallback();
    }

    private native boolean deletePageInternal(int[] iArr);

    /* JADX INFO: Access modifiers changed from: private */
    public native synchronized void destroyReflowCache(long j10);

    private native void destroying();

    /* JADX INFO: Access modifiers changed from: private */
    public native synchronized Object[] doReflowPage(long j10, Integer num, Integer num2, Integer num3, Float f10, Float f11, Cookie cookie);

    private native boolean drawPageInternal(Bitmap bitmap, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Cookie cookie);

    public static int drawPdf(String str, String str2, List<Integer> list, String str3, PDFListener pDFListener, BaseCookie baseCookie) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("draw");
        arrayList.add("-o");
        arrayList.add(str);
        arrayList.add("-r 216");
        arrayList.add("-p");
        arrayList.add(getAcceptedPassword(str3));
        arrayList.add(str2);
        StringBuilder sb2 = new StringBuilder();
        for (Integer num : list) {
            if (sb2.length() > 0) {
                sb2.append(",");
            }
            sb2.append(num);
        }
        arrayList.add(sb2.toString());
        return drawPdfInternal((String[]) arrayList.toArray(new String[arrayList.size()]), pDFListener, baseCookie);
    }

    private static native int drawPdfInternal(String[] strArr, PDFListener pDFListener, BaseCookie baseCookie);

    private native boolean duplicatePageInternal(int[] iArr, int i10);

    private native int editorAdjustBlockBoundsInternal(int i10, int i11, float f10, float f11, float f12);

    private native float editorBlockFontMaxSizeInternal(int i10, int i11);

    private native float editorBlockFontMinSizeInternal(int i10, int i11);

    private native int editorCanRedoInternal();

    private native int editorCanUndoInternal();

    private native void editorClearSelectInternal();

    private native int editorDeleteBlockInternal(int i10, int i11);

    private native int editorDeleteCharInternal(int i10);

    private native int editorDeleteNCharsInternal(int i10, int i11);

    private native int editorDeleteSelectCharsInternal(int i10);

    private native int editorDuplicateBlockInternal(int i10, int i11, float f10, float f11);

    private native int editorFocusLastCharInternal(int i10, int i11);

    private native RectF editorGetBlockBoxInternal(int i10, int i11);

    private native int editorGetBlockLenInternal(int i10);

    private native DotInfo editorGetDotInfoInternal();

    private native FontInfo editorGetFontInfoInternal();

    private native RectF[] editorGetSelectAreaInternal();

    private native SelectInfo editorGetSelectInfoInternal();

    private native int editorInputUcsAndSaveInternal(int i10, int[] iArr);

    private native int editorInsertCharInternal(int i10, int i11);

    private native boolean editorIsBlockVerticalInternal(int i10, int i11);

    private native int editorMakeBlockInternal(int i10);

    private native int editorNewlineInternal(int i10);

    private native boolean editorPageEditableInternal(int i10);

    private native boolean editorRedoInternal();

    private native void editorSaveContentInternal(int i10);

    private native RectF[] editorSelectBlockInternal(int i10, int i11, boolean z10);

    private native RectF[] editorSelectInternal(int i10, int i11, float f10, float f11, float f12, float f13);

    private native RectF editorSelectLineInternal();

    private native void editorSelectSetFontStyleInternal(int i10, String str, int i11, float f10, int i12, int i13, int i14);

    private native String editorSelectToStringInternal();

    private native RectF editorSelectWordInternal();

    private native int editorSetFontInternal(FontInfo fontInfo);

    private native int editorTranslateBlockInternal(int i10, int i11, float f10, float f11);

    private native boolean editorUndoInternal();

    /* JADX INFO: Access modifiers changed from: private */
    public native void endPage(long j10);

    private native boolean extractPagesInternal(String str, int[] iArr);

    private native String fileFormatInternal();

    private TextChar[][] filterPageText(TextChar[][] textCharArr) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        if (textCharArr != null) {
            for (TextChar[] textCharArr2 : textCharArr) {
                Iterator it = arrayList.iterator();
                while (true) {
                    z10 = false;
                    while (it.hasNext()) {
                        TextChar[] textCharArr3 = (TextChar[]) it.next();
                        if (Arrays.equals(textCharArr3, textCharArr2)) {
                            for (int i10 = 0; i10 < textCharArr3.length; i10++) {
                                if (textCharArr3[i10].c != textCharArr2[i10].c) {
                                    break;
                                }
                            }
                            z10 = true;
                        }
                    }
                }
                if (!z10) {
                    arrayList.add(textCharArr2);
                }
            }
        }
        return (TextChar[][]) arrayList.toArray(new TextChar[arrayList.size()]);
    }

    private static String getAcceptedPassword(String str) {
        try {
            String charBuffer = StandardCharsets.ISO_8859_1.decode(ByteBuffer.wrap(str.getBytes(StandardCharsets.ISO_8859_1))).toString();
            str.equals(charBuffer);
            return charBuffer;
        } catch (Exception unused) {
            return str;
        }
    }

    private native Annotation[] getAnnotationsInternal(int i10, int i11);

    @Keep
    private synchronized Bitmap getBitmapARGB(int i10, int i11) {
        return Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native synchronized Object getCacheInfo(long j10, String str);

    private native String[] getFocusedWidgetChoiceOptions();

    private native String[] getFocusedWidgetChoiceSelected();

    private native int getFocusedWidgetSignatureState();

    private native String getFocusedWidgetTextInternal();

    private native int getFocusedWidgetTypeInternal();

    private native Bitmap getImgBySourceID(Bitmap bitmap, int i10);

    public static CX_Status getLineCrossRectStatus(float f10, float f11, float f12, float f13, float[] fArr, float[] fArr2) {
        int lineCrossRectStatusInternal = getLineCrossRectStatusInternal(f10, f11, f12, f13, fArr, fArr2);
        if (lineCrossRectStatusInternal != 0) {
            if (lineCrossRectStatusInternal != 1) {
                if (lineCrossRectStatusInternal != 2) {
                    if (lineCrossRectStatusInternal != 3) {
                        if (lineCrossRectStatusInternal != 4) {
                            log(b.a.c("getLineCrossRectStatus: error status ", lineCrossRectStatusInternal));
                            return CX_Status.CX_None;
                        }
                        return CX_Status.CX_All;
                    }
                    return CX_Status.CX_Middle;
                }
                return CX_Status.CX_End;
            }
            return CX_Status.CX_Start;
        }
        return CX_Status.CX_None;
    }

    private static native int getLineCrossRectStatusInternal(float f10, float f11, float f12, float f13, float[] fArr, float[] fArr2);

    public static boolean getLineIntersection(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float[] fArr) {
        int lineIntersectionInternal = getLineIntersectionInternal(f10, f11, f12, f13, f14, f15, f16, f17, fArr);
        if (lineIntersectionInternal < 0) {
            log(b.a.c("getLineIntersection: error ", lineIntersectionInternal));
        }
        if (lineIntersectionInternal > 0) {
            return true;
        }
        return false;
    }

    private static native int getLineIntersectionInternal(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float[] fArr);

    private native int getNumSepsOnPageInternal(int i10);

    private native OutlineItem[] getOutlineInternal();

    private native float[] getPageBackgroundColorInternal(int i10);

    private native float getPageHeight();

    private native Annotation[] getPageImg(int i10);

    private native LinkInfo[] getPageLinksInternal(int i10);

    private native int getPageRotateInternal(int i10);

    public static ArrayList<kj.b> getPageStampAnnotData(int i10) {
        return sPageStampAnnotMap.get(Integer.valueOf(i10));
    }

    public static ConcurrentHashMap<Integer, ArrayList<kj.b>> getPageStampAnnotMap() {
        return sPageStampAnnotMap;
    }

    private native float getPageWidth();

    private float getPixelFontSize(float f10, float f11, float f12) {
        return f10 / (f11 * f12);
    }

    public static native String getPixelsHash(Bitmap bitmap);

    public static boolean getRectFromLineSegment(float f10, float f11, float f12, float f13, float f14, boolean z10, float[] fArr) {
        int rectFromLineSegmentInternal = getRectFromLineSegmentInternal(f10, f11, f12, f13, f14, z10, fArr);
        if (rectFromLineSegmentInternal < 0) {
            log(b.a.c("getRectFromLineSegment: error ", rectFromLineSegmentInternal));
        }
        if (rectFromLineSegmentInternal > 0) {
            return true;
        }
        return false;
    }

    private static native int getRectFromLineSegmentInternal(float f10, float f11, float f12, float f13, float f14, boolean z10, float[] fArr);

    public static HashMap<Integer, ArrayList<kj.b>> getSavedPageStampAnnotMap() {
        return sSavedPageStampAnnotMap;
    }

    private native Separation getSepInternal(int i10, int i11);

    @Keep
    private String getStringFromBytes(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        String[] strArr = {"UTF-8", "GB18030", "Big5", "EUC-JP", "Shift_JIS", "EUC-KR", CharEncoding.ISO_8859_1, "windows-1252", "windows-1251"};
        for (int i10 = 0; i10 < 9; i10++) {
            try {
                return Charset.forName(strArr[i10]).newDecoder().decode(wrap).toString();
            } catch (CharacterCodingException unused) {
                wrap.rewind();
            }
        }
        return "";
    }

    private native RectF[] getWidgetAreasInternal(int i10);

    private native float getZoom();

    private native void gotoPageInternal(int i10);

    private native boolean handleImgByMatrix(int i10, int i11, int i12, String str, float[] fArr);

    private native boolean hasChangesInternal();

    private native boolean hasDroppedUndoInternal();

    private native boolean hasOutlineInternal();

    private native boolean hidePageImg(int i10, int i11, String str, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native float[] holderPathToPdfPath(float[] fArr);

    private native void initTextEditorHandleInternal(int i10);

    private native boolean insertBlankPagesInternal(Rect rect, int i10, int i11, int i12, int i13, int i14, int i15, int i16);

    private native int insertFilesInternal(String[] strArr, int i10);

    public static native boolean isCompressEnabled();

    public static native boolean isPointInRect(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17);

    private native boolean isRedoableInternal();

    public static native boolean isReflowEnabled();

    public static native boolean isToPdfEnabled();

    private native boolean isUndoableInternal();

    private native boolean isUnencryptedPDFInternal();

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$doPageManagerStateCallback$1() {
        LinkedBlockingDeque<ij.e> linkedBlockingDeque;
        LinkedBlockingDeque<ij.e> linkedBlockingDeque2;
        if (this.pageManagerListener != null) {
            try {
                boolean isUndoable = isUndoable();
                boolean isRedoable = isRedoable();
                if (!isUndoable && (linkedBlockingDeque2 = this.pageManagerDoQueueList) != null) {
                    linkedBlockingDeque2.clear();
                }
                if (!isRedoable && (linkedBlockingDeque = this.pageManagerUndoQueueList) != null) {
                    linkedBlockingDeque.clear();
                }
                PDFPageManagerActivity pDFPageManagerActivity = (PDFPageManagerActivity) ((a1.e) this.pageManagerListener).f18b;
                PDFPageManagerActivity.a aVar = PDFPageManagerActivity.H0;
                kotlin.jvm.internal.g.e(pDFPageManagerActivity, ea.a.p("O2hYc10w", "LEw6F3z8"));
                pDFPageManagerActivity.N2(isUndoable, isRedoable);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doStateCallback$0() {
        if (this.listener != null) {
            try {
                this.listener.N0(this.deleteAnnotationCnt, isUndoEnable(), isReDoEnable());
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$2() {
        this.listener = null;
        this.pageManagerListener = null;
    }

    public static native int loadPixelsFromFile(Bitmap bitmap, String str);

    private native RectF locateCharFromPointInternal(int i10, PointF pointF, int i11);

    public static int makeAnnotFlag(Annotation.Type type) {
        return 1 << type.ordinal();
    }

    public static int mergePdf(String str, String[] strArr, PDFListener pDFListener) {
        return mergePdf(str, strArr, null, pDFListener);
    }

    private static native int mergePdfInternal(String str, String[] strArr, String[] strArr2, PDFListener pDFListener);

    private native boolean movePageInternal(int[] iArr, int i10);

    private native boolean needsPasswordInternal();

    private native long openBuffer(String str);

    private native long openFile(String str);

    /* JADX INFO: Access modifiers changed from: private */
    public native boolean pageClipPath(long j10, float[] fArr, float[] fArr2);

    /* JADX INFO: Access modifiers changed from: private */
    public native boolean pageClipRect(long j10, float f10, float f11, float f12, float f13, float[] fArr);

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0007, code lost:
        if (r3 <= (r2.numPages - 1)) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized boolean pageIndexLegal(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 < 0) goto Ld
            int r0 = r2.numPages     // Catch: java.lang.Throwable -> La
            r1 = 1
            int r0 = r0 - r1
            if (r3 > r0) goto Ld
            goto Le
        La:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        Ld:
            r1 = 0
        Le:
            monitor-exit(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.pdfeditor.ReaderPDFCore.pageIndexLegal(int):boolean");
    }

    private native boolean pageInsertImgByMatrix(int i10, String str, float[] fArr);

    /* JADX INFO: Access modifiers changed from: private */
    public native boolean pagePopClip(long j10);

    private boolean pageSizeLegal(Bitmap bitmap, int i10, int i11, int i12, int i13, int i14, int i15) {
        if (bitmap == null || bitmap.isRecycled() || i10 < i12 + i14 || i11 < i13 + i15 || bitmap.getWidth() < i14 || bitmap.getHeight() < i15) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native boolean pageWriteBmp(long j10, Bitmap bitmap, float f10, float f11, float f12, float f13, int i10, float[] fArr, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public native boolean pageWriteLine(long j10, float f10, float f11, float f12, float f13, float f14, int i10, float[] fArr);

    /* JADX INFO: Access modifiers changed from: private */
    public native boolean pageWritePath(long j10, float[] fArr, int i10, float f10, int i11, float[] fArr2);

    /* JADX INFO: Access modifiers changed from: private */
    public native boolean pageWriteRect(long j10, float f10, float f11, float f12, float f13, int i10, float f14, int i11, float[] fArr);

    /* JADX INFO: Access modifiers changed from: private */
    public native boolean pageWriteText(long j10, String str, float f10, float f11, float f12, int i10, String str2, boolean z10, boolean z11, float[] fArr);

    private native int passClickEventInternal(int i10, float f10, float f11);

    private synchronized void recordInkData(int i10, ij.a aVar) {
        ij.b bVar = new ij.b(Annotation.Type.INK, aVar);
        bVar.f18518a = i10;
        this.pageDoEditActionQueueList.offer(bVar);
    }

    private synchronized void recordMarkData(int i10, PointF[] pointFArr, Annotation.Type type, RectF rectF) {
        ij.b bVar = new ij.b(type, pointFArr);
        bVar.f18518a = i10;
        bVar.f18520d = rectF;
        this.pageDoEditActionQueueList.offer(bVar);
    }

    private native boolean redoInternal();

    private void removeAllRCache() {
        synchronized (this.RCacheSet) {
            Iterator<c> it = this.RCacheSet.iterator();
            while (it.hasNext()) {
                c.a(it.next());
                it.remove();
            }
        }
    }

    private native int removeMarkupAnnotationInternal(PointF[] pointFArr, int i10, boolean z10);

    private void removeRCache(c cVar) {
        synchronized (this.RCacheSet) {
            this.RCacheSet.remove(cVar);
        }
    }

    private native void replyToAlertInternal(PDFAlertInternal pDFAlertInternal);

    private native void resetNameInternal(String str);

    private native boolean rotatePageInternal(int[] iArr, int i10);

    private native boolean saveInternal(PDFListener pDFListener);

    public static native int savePixelsToFile(Bitmap bitmap, String str);

    private native boolean saveToFdInternal(FileDescriptor fileDescriptor, boolean z10, PDFListener pDFListener);

    private native boolean saveToInternal(String str, PDFListener pDFListener);

    private native RectF[] searchPage(String str);

    private native void setFocusedWidgetChoiceSelectedInternal(String[] strArr);

    private native int setFocusedWidgetTextInternal(String str);

    private static native int setLangArray(String[] strArr);

    private native void setSaveOptions(String str);

    private native boolean setUndoRedoMaxCount(int i10);

    private native boolean signFocusedSignatureInternal(String str, String str2);

    private native void startAlertsInternal();

    private native void stopAlertsInternal();

    private native TextChar[][][][] text();

    private native byte[] textAsHtml();

    private native boolean undoInternal();

    private native int updateInkAnnotationStroke(int[] iArr, PointF[][][] pointFArr);

    private native boolean updatePageInternal(Bitmap bitmap, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Cookie cookie);

    private native PDFAlertInternal waitForAlertInternal();

    public void abort() {
        this.isDestroying.set(true);
    }

    public synchronized void addDoEditActionList(int i10, ij.b bVar) {
        if (bVar == null) {
            return;
        }
        bVar.f18518a = i10;
        this.pageDoEditActionQueueList.offer(bVar);
        doStateCallback();
    }

    public void addFunctions(String str) {
        if (this.usedFunctions == null) {
            this.usedFunctions = new ArrayList();
        }
        if (!this.usedFunctions.contains(str)) {
            this.usedFunctions.add(str);
        }
    }

    public synchronized void addInkAnnotation(int i10, ij.a aVar) {
        if (!isDestroyed() && pageIndexLegal(i10)) {
            recordInkData(i10, aVar);
            LinkedBlockingDeque<ij.b> linkedBlockingDeque = this.pageUndoEditActionQueueList;
            if (linkedBlockingDeque != null) {
                linkedBlockingDeque.clear();
            }
            doStateCallback();
        }
    }

    public synchronized void addMarkupAnnotation(int i10, PointF[] pointFArr, Annotation.Type type, RectF rectF) {
        if (!isDestroyed() && pageIndexLegal(i10) && pointFArr != null && type != null) {
            gotoPage(i10);
            LinkedBlockingDeque<ij.b> linkedBlockingDeque = this.pageUndoEditActionQueueList;
            if (linkedBlockingDeque != null) {
                linkedBlockingDeque.clear();
            }
            recordMarkData(i10, pointFArr, type, rectF);
            addMarkupAnnotationInternal(pointFArr, type.ordinal());
            doStateCallback();
        }
    }

    public synchronized void addPageManagerAction(ij.e eVar) {
        LinkedBlockingDeque<ij.e> linkedBlockingDeque;
        if (eVar == null) {
            return;
        }
        if (!isRedoable() && (linkedBlockingDeque = this.pageManagerUndoQueueList) != null) {
            linkedBlockingDeque.clear();
        }
        this.pageManagerDoQueueList.offer(eVar);
    }

    public void addSavedUpdateEditActionData(int i10, ij.b bVar) {
        if (this.savedUpdateEditActionList == null) {
            this.savedUpdateEditActionList = new HashMap();
        }
        ArrayList<ij.b> arrayList = this.savedUpdateEditActionList.get(Integer.valueOf(i10));
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.savedUpdateEditActionList.put(Integer.valueOf(i10), arrayList);
        }
        arrayList.add(bVar);
    }

    public synchronized void addStamp(int i10, RectF rectF, String str, int i11, int i12) {
        if (isDestroyed()) {
            return;
        }
        gotoPage(i10);
        addStampInternal(new float[]{rectF.left, rectF.top, rectF.right, rectF.bottom}, str, i11, i12);
    }

    public synchronized void addStamp2(int i10, RectF rectF, String str, int i11, int i12, Bitmap bitmap) {
        if (isDestroyed()) {
            return;
        }
        gotoPage(i10);
        addStampInternal2(new float[]{rectF.left, rectF.top, rectF.right, rectF.bottom}, str, i11, i12, bitmap);
    }

    public native void addStampInternal(float[] fArr, String str, int i10, int i11);

    public native void addStampInternal2(float[] fArr, String str, int i10, int i11, Bitmap bitmap);

    public synchronized void addTextAnnotation(int i10, PDFFreeTextEditView pDFFreeTextEditView, AdjustActionInfo adjustActionInfo, float f10, float f11) {
        LinkedBlockingDeque<ij.b> linkedBlockingDeque;
        if (isDestroyed()) {
            return;
        }
        gotoPage(i10);
        if (adjustActionInfo != null && (linkedBlockingDeque = this.pageUndoEditActionQueueList) != null) {
            linkedBlockingDeque.clear();
        }
        addNewTextRecord(i10, pDFFreeTextEditView, adjustActionInfo, f10, f11);
        doStateCallback();
    }

    public synchronized void addTextAnnotation2(int i10, RectF rectF, String str, int i11, float f10, Bitmap bitmap) {
        if (isDestroyed()) {
            return;
        }
        gotoPage(i10);
        addTextAnnotationInternal2(new float[]{rectF.left, rectF.top, rectF.right, rectF.bottom}, str, i11, f10, bitmap);
    }

    public synchronized void addTextAnnotationForSaved(int i10, PDFFreeTextEditView pDFFreeTextEditView, AdjustActionInfo adjustActionInfo, float f10, float f11) {
        if (isDestroyed()) {
            return;
        }
        gotoPage(i10);
        if (adjustActionInfo == null) {
            return;
        }
        ij.b bVar = new ij.b(Annotation.Type.FREETEXT, pDFFreeTextEditView, adjustActionInfo, f10, f11);
        bVar.f18518a = i10;
        addSavedUpdateEditActionData(i10, bVar);
    }

    public synchronized void addTextAnnotationForUpdate(int i10, PDFFreeTextEditView pDFFreeTextEditView, AdjustActionInfo adjustActionInfo, float f10, float f11) {
        LinkedBlockingDeque<ij.b> linkedBlockingDeque;
        if (isDestroyed()) {
            return;
        }
        gotoPage(i10);
        if (adjustActionInfo != null && (linkedBlockingDeque = this.pageUndoEditActionQueueList) != null) {
            linkedBlockingDeque.clear();
        }
        addNewTextRecord(i10, pDFFreeTextEditView, adjustActionInfo, f10, f11);
        doStateCallback();
    }

    public void addTranslateFreeTextAnnotationData(int i10, lj.a aVar) {
        if (this.translateFreeTextAnnotationDatas == null) {
            this.translateFreeTextAnnotationDatas = new HashMap();
        }
        ArrayList<lj.a> arrayList = this.translateFreeTextAnnotationDatas.get(Integer.valueOf(i10));
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.translateFreeTextAnnotationDatas.put(Integer.valueOf(i10), arrayList);
        }
        arrayList.add(aVar);
    }

    public synchronized void addUndoEditActionList(int i10, ij.b bVar) {
        if (bVar == null) {
            return;
        }
        bVar.f18518a = i10;
        this.pageUndoEditActionQueueList.offer(bVar);
        doStateCallback();
    }

    public synchronized boolean adjustPage(int[] iArr, float f10, float f11, int i10, int i11, int i12, boolean z10) {
        if (isDestroyed()) {
            return false;
        }
        boolean adjustPageInternal = adjustPageInternal(iArr, f10, f11, i10, i11, i12, z10);
        doPageManagerStateCallback();
        return adjustPageInternal;
    }

    public synchronized boolean adjustPageBySize(int[] iArr, float f10, float f11, int i10, int i11, int i12, boolean z10) {
        if (isDestroyed()) {
            return false;
        }
        boolean adjustPageInternalBySize = adjustPageInternalBySize(iArr, f10, f11, i10, i11, i12, z10);
        doPageManagerStateCallback();
        return adjustPageInternalBySize;
    }

    public synchronized boolean authenticatePassword(String str) {
        if (isDestroyed()) {
            return false;
        }
        if (!authenticatePasswordInternal(str)) {
            return authenticatePasswordInternal(getAcceptedPassword(str));
        }
        return true;
    }

    public synchronized c cacheReflow(int i10, int i11, int i12, int i13, float f10, float f11, Cookie cookie) {
        return cacheReflow(i10, i11, i12, i13, 0, 0, f10, f11, cookie);
    }

    public synchronized String checkFocusedSignature() {
        if (isDestroyed()) {
            return null;
        }
        return checkFocusedSignatureInternal();
    }

    public void clearAnnotations() {
        if (this.pageDoEditActionQueueList.isEmpty()) {
            return;
        }
        HashMap hashMap = new HashMap();
        Iterator<ij.b> it = this.pageDoEditActionQueueList.iterator();
        while (it.hasNext()) {
            ij.b next = it.next();
            Integer num = (Integer) hashMap.get(Integer.valueOf(next.f18518a));
            if (num != null && num.intValue() != 0) {
                hashMap.put(Integer.valueOf(next.f18518a), Integer.valueOf(num.intValue() + 1));
            } else {
                hashMap.put(Integer.valueOf(next.f18518a), 1);
            }
        }
        if (hashMap.isEmpty()) {
            return;
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            Integer num2 = (Integer) entry.getKey();
            gotoPage(num2.intValue());
            Integer num3 = (Integer) entry.getValue();
            Annotation[] annotationsInternal = getAnnotationsInternal(num2.intValue(), -1);
            int[] iArr = new int[num3.intValue()];
            if (annotationsInternal.length >= num3.intValue()) {
                int i10 = 0;
                while (i10 < num3.intValue()) {
                    int i11 = i10 + 1;
                    iArr[i10] = annotationsInternal.length - i11;
                    i10 = i11;
                }
                deleteAnnotationsInternal(iArr, -1);
            }
        }
    }

    public void clearSavedUpdateAnnotationsList() {
        if (this.savedUpdateEditActionList != null) {
            this.savedUpdateEditActionList.clear();
        }
    }

    public void clearTranslateFreeTextAnnotationDatas() {
        if (this.translateFreeTextAnnotationDatas != null) {
            this.translateFreeTextAnnotationDatas.clear();
        }
    }

    public synchronized boolean clearUndoRedo() {
        boolean clearUndoRedoInternal;
        if (isDestroyed()) {
            clearUndoRedoInternal = false;
        } else {
            clearUndoRedoInternal = clearUndoRedoInternal();
        }
        return clearUndoRedoInternal;
    }

    public synchronized int controlSepOnPage(int i10, int i11, boolean z10) {
        if (isDestroyed()) {
            return 0;
        }
        return controlSepOnPageInternal(i10, i11, z10);
    }

    public int countPages() {
        if (this.numPages < 0) {
            this.numPages = countPagesSynchronized();
        }
        return this.numPages;
    }

    public b createPage(float f10, float f11) {
        return new b(beginPage(f10, f11));
    }

    public synchronized boolean createPdfFile(String str, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (isDestroyed()) {
            return false;
        }
        return createFile(str, i10, i11, i12, i13, i14, i15, i16, i17);
    }

    public synchronized boolean delPageImageInfo(int i10, int i11, int i12, String str) {
        return isDestroyed() ? false : delPageImg(i10, i11, i12, str);
    }

    public synchronized void deleteAnnotation(int i10, int i11) {
        if (isDestroyed()) {
            return;
        }
        gotoPage(i10);
        deleteAnnotationInternal(i11);
    }

    public synchronized int deleteAnnotations(int i10, int[] iArr, int i11) {
        if (isDestroyed()) {
            return -1;
        }
        gotoPage(i10);
        return deleteAnnotationsInternal(iArr, i11);
    }

    public synchronized boolean deletePage(int[] iArr) {
        if (isDestroyed()) {
            return false;
        }
        boolean deletePageInternal = deletePageInternal(iArr);
        this.numPages = countPagesSynchronized();
        doPageManagerStateCallback();
        return deletePageInternal;
    }

    public synchronized void doPageManagerStateCallback() {
        pj.a aVar = a.C0362a.f28967a;
        aVar.f28966b.post(new androidx.activity.k(this, 15));
    }

    public synchronized void doStateCallback() {
        pj.a aVar = a.C0362a.f28967a;
        aVar.f28966b.post(new androidx.activity.i(this, 18));
    }

    public synchronized void drawPage(Bitmap bitmap, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Cookie cookie) {
        drawPage(bitmap, i10, i11, i12, i13, i14, i15, i16, -1, cookie);
    }

    public synchronized oj.b drawReflow(int i10, int i11, int i12, int i13, float f10, float f11, Cookie cookie) {
        log("drawReflow");
        if (isDestroyed()) {
            return null;
        }
        if (this.reflowHelper == null) {
            this.reflowHelper = new oj.e();
        }
        if (i10 >= 0 && i10 < countPages()) {
            return this.reflowHelper.b(i10, i11, i12, i13, f10, f11, cookie, this);
        }
        return null;
    }

    public synchronized boolean duplicatePage(int[] iArr, int i10) {
        boolean duplicatePageInternal;
        if (isDestroyed()) {
            duplicatePageInternal = false;
        } else {
            duplicatePageInternal = duplicatePageInternal(iArr, i10);
        }
        return duplicatePageInternal;
    }

    public synchronized int editorAdjustBlockBounds(int i10, int i11, float f10, float f11, float f12) {
        if (isDestroyed()) {
            return -1;
        }
        return editorAdjustBlockBoundsInternal(i10, i11, f10, f11, f12);
    }

    public synchronized int editorAdjustBlockBoundsAndSave(int i10, int i11, float f10, float f11, float f12) {
        if (isDestroyed()) {
            return -1;
        }
        int editorAdjustBlockBoundsInternal = editorAdjustBlockBoundsInternal(i10, i11, f10, f11, f12);
        if (editorAdjustBlockBoundsInternal == 0) {
            editorSaveContentInternal(i10);
        }
        return editorAdjustBlockBoundsInternal;
    }

    public synchronized float editorBlockFontMaxSize(int i10, int i11) {
        if (isDestroyed()) {
            return -1.0f;
        }
        return editorBlockFontMaxSizeInternal(i10, i11);
    }

    public synchronized float editorBlockFontMinSize(int i10, int i11) {
        if (isDestroyed()) {
            return -1.0f;
        }
        return editorBlockFontMinSizeInternal(i10, i11);
    }

    public synchronized void editorClearSelect() {
        if (isDestroyed()) {
            return;
        }
        editorClearSelectInternal();
    }

    public synchronized int editorDeleteBlock(int i10, int i11) {
        if (isDestroyed()) {
            return -1;
        }
        return editorDeleteBlockInternal(i10, i11);
    }

    public synchronized int editorDeleteBlockAndSave(int i10, int i11) {
        if (isDestroyed()) {
            return -1;
        }
        int editorDeleteBlockInternal = editorDeleteBlockInternal(i10, i11);
        if (editorDeleteBlockInternal == 0) {
            editorSaveContentInternal(i10);
        }
        return editorDeleteBlockInternal;
    }

    public synchronized int editorDeleteChar(int i10) {
        if (isDestroyed()) {
            return -1;
        }
        return editorDeleteCharInternal(i10);
    }

    public synchronized int editorDeleteCharAndSave(int i10) {
        if (isDestroyed()) {
            return -1;
        }
        int editorDeleteCharInternal = editorDeleteCharInternal(i10);
        if (editorDeleteCharInternal >= 0) {
            editorSaveContentInternal(i10);
        }
        return editorDeleteCharInternal;
    }

    public synchronized int editorDeleteNChars(int i10, int i11) {
        return editorDeleteNCharsInternal(i10, i11);
    }

    public synchronized int editorDeleteSelectChars(int i10) {
        if (isDestroyed()) {
            return -1;
        }
        return editorDeleteSelectCharsInternal(i10);
    }

    public synchronized int editorDeleteSelectCharsAndSave(int i10) {
        if (isDestroyed()) {
            return -1;
        }
        int editorDeleteSelectCharsInternal = editorDeleteSelectCharsInternal(i10);
        if (editorDeleteSelectCharsInternal == 0) {
            editorSaveContentInternal(i10);
        }
        return editorDeleteSelectCharsInternal;
    }

    public synchronized int editorDuplicateBlock(int i10, int i11, float f10, float f11) {
        if (isDestroyed()) {
            return -1;
        }
        return editorDuplicateBlockInternal(i10, i11, f10, f11);
    }

    public synchronized int editorDuplicateBlockAndSave(int i10, int i11, float f10, float f11) {
        if (isDestroyed()) {
            return -1;
        }
        int editorDuplicateBlockInternal = editorDuplicateBlockInternal(i10, i11, f10, f11);
        if (editorDuplicateBlockInternal >= 0) {
            editorSaveContentInternal(i10);
        }
        return editorDuplicateBlockInternal;
    }

    public synchronized int editorFocusLastChar(int i10, int i11) {
        if (isDestroyed()) {
            return -1;
        }
        return editorFocusLastCharInternal(i10, i11);
    }

    public synchronized RectF editorGetBlockBox(int i10, int i11) {
        if (isDestroyed()) {
            return null;
        }
        return editorGetBlockBoxInternal(i10, i11);
    }

    public synchronized int editorGetBlockLen(int i10) {
        if (isDestroyed()) {
            return -1;
        }
        return editorGetBlockLenInternal(i10);
    }

    public synchronized DotInfo editorGetDotInfo() {
        if (isDestroyed()) {
            return null;
        }
        return editorGetDotInfoInternal();
    }

    public synchronized FontInfo editorGetFontInfo() {
        if (isDestroyed()) {
            return null;
        }
        return editorGetFontInfoInternal();
    }

    public synchronized RectF[] editorGetSelectArea() {
        if (isDestroyed()) {
            return null;
        }
        return editorGetSelectAreaInternal();
    }

    public synchronized SelectInfo editorGetSelectInfo() {
        if (isDestroyed()) {
            return null;
        }
        return editorGetSelectInfoInternal();
    }

    public synchronized int editorInputUcsAndSave(int i10, int[] iArr) {
        if (isDestroyed()) {
            return -1;
        }
        return editorInputUcsAndSaveInternal(i10, iArr);
    }

    public synchronized int editorInsertChar(int i10, int i11) {
        if (isDestroyed()) {
            return -1;
        }
        return editorInsertCharInternal(i10, i11);
    }

    public synchronized int editorInsertCharAndSave(int i10, int i11) {
        if (isDestroyed()) {
            return -1;
        }
        int editorInsertCharInternal = editorInsertCharInternal(i10, i11);
        if (editorInsertCharInternal == 0) {
            editorSaveContentInternal(i10);
        }
        return editorInsertCharInternal;
    }

    public synchronized boolean editorIsBlockVertical(int i10, int i11) {
        if (isDestroyed()) {
            return false;
        }
        return editorIsBlockVerticalInternal(i10, i11);
    }

    public synchronized int editorMakeBlock(int i10) {
        if (isDestroyed()) {
            return -1;
        }
        return editorMakeBlockInternal(i10);
    }

    public synchronized int editorMakeBlockAndSave(int i10) {
        if (isDestroyed()) {
            return -1;
        }
        int editorMakeBlockInternal = editorMakeBlockInternal(i10);
        if (editorMakeBlockInternal == 0) {
            editorSaveContentInternal(i10);
        }
        return editorMakeBlockInternal;
    }

    public synchronized int editorNewline(int i10) {
        if (isDestroyed()) {
            return -1;
        }
        return editorNewlineInternal(i10);
    }

    public synchronized int editorNewlineAndSave(int i10) {
        if (isDestroyed()) {
            return -1;
        }
        int editorNewlineInternal = editorNewlineInternal(i10);
        if (editorNewlineInternal == 0) {
            editorSaveContentInternal(i10);
        }
        return editorNewlineInternal;
    }

    public synchronized boolean editorPageEditable(int i10) {
        if (isDestroyed()) {
            return false;
        }
        return editorPageEditableInternal(i10);
    }

    public synchronized void editorSaveContent(int i10) {
        if (isDestroyed()) {
            return;
        }
        editorSaveContentInternal(i10);
    }

    public synchronized RectF[] editorSelect(int i10, int i11, float f10, float f11, float f12, float f13) {
        if (isDestroyed()) {
            return null;
        }
        return editorSelectInternal(i10, i11, f10, f11, f12, f13);
    }

    public synchronized RectF[] editorSelectBlock(int i10, int i11, boolean z10) {
        if (isDestroyed()) {
            return null;
        }
        return editorSelectBlockInternal(i10, i11, z10);
    }

    public synchronized SelectInfo editorSelectBlockWithInfo(int i10, int i11) {
        SelectInfo selectInfo = null;
        if (isDestroyed()) {
            return null;
        }
        RectF[] editorSelectBlock = editorSelectBlock(i10, i11, false);
        if (editorSelectBlock != null && (selectInfo = editorGetSelectInfo()) != null) {
            selectInfo.area = editorSelectBlock;
        }
        return selectInfo;
    }

    public synchronized RectF editorSelectLine() {
        if (isDestroyed()) {
            return null;
        }
        return editorSelectLineInternal();
    }

    public synchronized SelectInfo editorSelectLineWithInfo() {
        SelectInfo selectInfo = null;
        if (isDestroyed()) {
            return null;
        }
        RectF editorSelectLine = editorSelectLine();
        if (editorSelectLine != null && (selectInfo = editorGetSelectInfo()) != null) {
            selectInfo.area = new RectF[]{editorSelectLine};
        }
        return selectInfo;
    }

    public synchronized void editorSelectSetFontStyle(int i10, String str, int i11, float f10, int i12, int i13, int i14) {
        if (isDestroyed()) {
            return;
        }
        editorSelectSetFontStyleInternal(i10, str, i11, f10, i12, i13, i14);
    }

    public synchronized void editorSelectSetFontStyleAndSave(int i10, String str, int i11, float f10, int i12, int i13, int i14) {
        if (isDestroyed()) {
            return;
        }
        editorSelectSetFontStyle(i10, str, i11, f10, i12, i13, i14);
        editorSaveContentInternal(i10);
    }

    public synchronized String editorSelectToString() {
        if (isDestroyed()) {
            return "";
        }
        return editorSelectToStringInternal();
    }

    public synchronized SelectInfo editorSelectWithInfo(int i10, int i11, float f10, float f11, float f12, float f13) {
        SelectInfo selectInfo = null;
        if (isDestroyed()) {
            return null;
        }
        RectF[] editorSelect = editorSelect(i10, i11, f10, f11, f12, f13);
        if (editorSelect != null && (selectInfo = editorGetSelectInfo()) != null) {
            selectInfo.area = editorSelect;
        }
        return selectInfo;
    }

    public synchronized RectF editorSelectWord() {
        if (isDestroyed()) {
            return null;
        }
        return editorSelectWordInternal();
    }

    public synchronized SelectInfo editorSelectWordWithInfo() {
        SelectInfo selectInfo = null;
        if (isDestroyed()) {
            return null;
        }
        RectF editorSelectWord = editorSelectWord();
        if (editorSelectWord != null && (selectInfo = editorGetSelectInfo()) != null) {
            selectInfo.area = new RectF[]{editorSelectWord};
        }
        return selectInfo;
    }

    public synchronized int editorSetFont(FontInfo fontInfo) {
        if (isDestroyed()) {
            return -1;
        }
        return editorSetFontInternal(fontInfo);
    }

    public synchronized int editorTranslateBlock(int i10, int i11, float f10, float f11) {
        if (isDestroyed()) {
            return -1;
        }
        return editorTranslateBlockInternal(i10, i11, f10, f11);
    }

    public synchronized int editorTranslateBlockAndSave(int i10, int i11, float f10, float f11) {
        if (isDestroyed()) {
            return -1;
        }
        int editorTranslateBlockInternal = editorTranslateBlockInternal(i10, i11, f10, f11);
        if (editorTranslateBlockInternal == 0) {
            editorSaveContentInternal(i10);
        }
        return editorTranslateBlockInternal;
    }

    public synchronized boolean extractPages(String str, int[] iArr) {
        boolean extractPagesInternal;
        if (isDestroyed()) {
            extractPagesInternal = false;
        } else {
            extractPagesInternal = extractPagesInternal(str, iArr);
        }
        return extractPagesInternal;
    }

    public String fileFormat() {
        return this.file_format;
    }

    public synchronized Annotation[] getAnnotations(int i10) {
        return getAnnotations(i10, -1);
    }

    public int getAnnotationsInternalCnt(int i10) {
        Annotation[] annotationsInternal = getAnnotationsInternal(i10, -1);
        if (annotationsInternal != null) {
            return annotationsInternal.length;
        }
        return 0;
    }

    public a0 getCurEditPDFPageView() {
        return this.curEditPDFPageView;
    }

    public synchronized String getFormatPassword(String str) {
        if (isDestroyed()) {
            return str;
        }
        if (!authenticatePasswordInternal(str)) {
            str = getAcceptedPassword(str);
        }
        return str;
    }

    public synchronized Bitmap getImageBySourceID(Bitmap bitmap, int i10) {
        Bitmap imgBySourceID;
        if (isDestroyed()) {
            imgBySourceID = null;
        } else {
            imgBySourceID = getImgBySourceID(bitmap, i10);
        }
        return imgBySourceID;
    }

    public synchronized int getNumSepsOnPage(int i10) {
        if (isDestroyed()) {
            return 0;
        }
        return getNumSepsOnPageInternal(i10);
    }

    public synchronized OutlineItem[] getOutline() {
        if (isDestroyed()) {
            return null;
        }
        return getOutlineInternal();
    }

    public synchronized float[] getPageBackgroundColor(int i10) {
        float[] pageBackgroundColorInternal;
        if (isDestroyed()) {
            pageBackgroundColorInternal = null;
        } else {
            pageBackgroundColorInternal = getPageBackgroundColorInternal(i10);
        }
        return pageBackgroundColorInternal;
    }

    public List<ij.b> getPageEditActionList(int i10, Annotation.Type type) {
        ArrayList arrayList = null;
        if (type == null) {
            return null;
        }
        if (i10 >= 0 && i10 <= this.numPages - 1) {
            arrayList = new ArrayList();
            LinkedBlockingDeque<ij.b> linkedBlockingDeque = this.pageDoEditActionQueueList;
            if (linkedBlockingDeque != null && !linkedBlockingDeque.isEmpty()) {
                Iterator<ij.b> it = this.pageDoEditActionQueueList.iterator();
                while (it.hasNext()) {
                    ij.b next = it.next();
                    if (next != null && next.f18518a == i10 && next.f18519b == type) {
                        arrayList.add(next);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized Annotation[] getPageImageInfo(int i10) {
        if (isDestroyed()) {
            return null;
        }
        gotoPage(i10);
        return getPageImg(i10);
    }

    public List<ij.a> getPageInks(int i10, boolean z10) {
        if (this.pageDoEditActionQueueList == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        this.drawPathLinkedHashMap.clear();
        Iterator<ij.b> it = this.pageDoEditActionQueueList.iterator();
        while (it.hasNext()) {
            ij.b next = it.next();
            if (next != null && next.f18518a == i10 && next.f18519b == Annotation.Type.INK) {
                Iterator<ij.a> it2 = next.f18521e.iterator();
                while (it2.hasNext()) {
                    ij.a next2 = it2.next();
                    if (next2 != null) {
                        this.drawPathLinkedHashMap.put(Long.valueOf(next2.f18508a), next2);
                    }
                }
            }
        }
        for (Map.Entry<Long, ij.a> entry : this.drawPathLinkedHashMap.entrySet()) {
            if (z10) {
                ij.a value = entry.getValue();
                value.getClass();
                ij.a aVar = new ij.a();
                aVar.f18508a = value.f18508a;
                aVar.f18510d = value.f18510d;
                aVar.f18511e = value.f18511e;
                aVar.c = new ArrayList<>();
                Iterator<a.b> it3 = value.c.iterator();
                while (it3.hasNext()) {
                    aVar.c.add(it3.next().clone());
                }
                arrayList.add(aVar);
            } else {
                arrayList.add(entry.getValue());
            }
        }
        return arrayList;
    }

    public synchronized LinkInfo[] getPageLinks(int i10) {
        if (isDestroyed()) {
            return null;
        }
        return getPageLinksInternal(i10);
    }

    public synchronized int getPageRotate(int i10) {
        if (isDestroyed()) {
            return 0;
        }
        return getPageRotateInternal(i10);
    }

    public synchronized PointF getPageSize(int i10) {
        if (isDestroyed()) {
            return new PointF(1000.0f, 1000.0f);
        }
        gotoPage(i10);
        return new PointF(this.pageWidth, this.pageHeight);
    }

    public oj.e getReflowHelper() {
        return this.reflowHelper;
    }

    public z getRepository() {
        if (this.repository == null) {
            this.repository = new z();
        }
        return this.repository;
    }

    public List<String> getSaveEditType() {
        Annotation.Type type;
        if (this.usedFunctions == null) {
            this.usedFunctions = new ArrayList();
        }
        LinkedBlockingDeque<ij.b> linkedBlockingDeque = this.pageDoEditActionQueueList;
        if (linkedBlockingDeque != null && !linkedBlockingDeque.isEmpty()) {
            Iterator<ij.b> it = this.pageDoEditActionQueueList.iterator();
            while (it.hasNext()) {
                ij.b next = it.next();
                if (next != null && (type = next.f18519b) != null) {
                    int i10 = a.f21369a[type.ordinal()];
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 != 4) {
                                    if (i10 == 5 && !this.usedFunctions.contains("doodle")) {
                                        this.usedFunctions.add("doodle");
                                    }
                                } else if (!this.usedFunctions.contains("strikethrough")) {
                                    this.usedFunctions.add("strikethrough");
                                }
                            } else if (!this.usedFunctions.contains("under")) {
                                this.usedFunctions.add("under");
                            }
                        } else if (!this.usedFunctions.contains("hign")) {
                            this.usedFunctions.add("hign");
                        }
                    } else {
                        AdjustActionInfo adjustActionInfo = next.f18522f;
                        if (adjustActionInfo != null) {
                            if (adjustActionInfo.getAction() == AdjustAction.Delete) {
                                if (!this.usedFunctions.contains("dele")) {
                                    this.usedFunctions.add("dele");
                                }
                            } else if (adjustActionInfo.getAction() == AdjustAction.TextSize) {
                                if (!this.usedFunctions.contains("size")) {
                                    this.usedFunctions.add("size");
                                }
                            } else if (adjustActionInfo.getAction() == AdjustAction.TextColor) {
                                if (!this.usedFunctions.contains("color")) {
                                    this.usedFunctions.add("color");
                                }
                            } else if (adjustActionInfo.getAction() == AdjustAction.Typeset) {
                                if (!this.usedFunctions.contains("type")) {
                                    this.usedFunctions.add("type");
                                }
                            } else if (adjustActionInfo.getAction() == AdjustAction.Scale) {
                                if (!this.usedFunctions.contains("zoom")) {
                                    this.usedFunctions.add("zoom");
                                }
                            } else if (adjustActionInfo.getAction() == AdjustAction.Copy && !this.usedFunctions.contains("copy2")) {
                                this.usedFunctions.add("copy2");
                            }
                        }
                    }
                }
            }
        }
        return this.usedFunctions;
    }

    public List<String> getSavePageManagerType() {
        if (this.usedFunctions == null) {
            this.usedFunctions = new ArrayList();
        }
        LinkedBlockingDeque<ij.e> linkedBlockingDeque = this.pageManagerDoQueueList;
        if (linkedBlockingDeque != null && !linkedBlockingDeque.isEmpty()) {
            Iterator<ij.e> it = this.pageManagerDoQueueList.iterator();
            while (it.hasNext()) {
                ij.e next = it.next();
                if (next != null) {
                    int i10 = next.f18535a;
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 != 4) {
                                    if (i10 == 5 && !this.usedFunctions.contains("pageset")) {
                                        this.usedFunctions.add("pageset");
                                    }
                                } else if (!this.usedFunctions.contains("rotate")) {
                                    this.usedFunctions.add("rotate");
                                }
                            } else if (!this.usedFunctions.contains("reorder")) {
                                this.usedFunctions.add("reorder");
                            }
                        } else if (!this.usedFunctions.contains("delete")) {
                            this.usedFunctions.add("delete");
                        }
                    } else if (!this.usedFunctions.contains("insert")) {
                        this.usedFunctions.add("insert");
                    }
                }
            }
        }
        return this.usedFunctions;
    }

    public ArrayList<ij.b> getSavedUpdateEditActionData(int i10) {
        if (this.savedUpdateEditActionList == null) {
            return null;
        }
        return this.savedUpdateEditActionList.get(Integer.valueOf(i10));
    }

    public ij.b getSelectAnnotRectF(Annotation.Type type, RectF rectF) {
        RectF rectF2;
        if (rectF == null) {
            return null;
        }
        Iterator<ij.b> it = this.pageDoEditActionQueueList.iterator();
        while (it.hasNext()) {
            ij.b next = it.next();
            if (next != null && next.f18519b == type && (rectF2 = next.f18520d) != null && RectF.intersects(rectF, rectF2)) {
                return next;
            }
        }
        return null;
    }

    public synchronized Separation getSep(int i10, int i11) {
        if (isDestroyed()) {
            return null;
        }
        return getSepInternal(i10, i11);
    }

    public int getSkipStamp() {
        return this.skipStamp;
    }

    public lj.a getTranslateFreeTextAnnotationData(int i10, int i11, lj.a aVar) {
        ArrayList<lj.a> arrayList;
        if (this.translateFreeTextAnnotationDatas == null || aVar == null || (arrayList = this.translateFreeTextAnnotationDatas.get(Integer.valueOf(i10))) == null) {
            return null;
        }
        Iterator<lj.a> it = arrayList.iterator();
        while (it.hasNext()) {
            lj.a next = it.next();
            if (next != null && i11 == next.f21753g && next.f21751e != null && aVar.f21751e != null && TextUtils.equals(next.f21750d, aVar.f21750d)) {
                RectF rectF = next.f21751e;
                float f10 = rectF.left;
                RectF rectF2 = aVar.f21751e;
                if (f10 == rectF2.left && rectF.top == rectF2.top && rectF.right == rectF2.right && rectF.bottom == rectF2.bottom) {
                    return next;
                }
            }
        }
        return null;
    }

    public synchronized RectF[] getWidgetAreas(int i10) {
        if (isDestroyed()) {
            return null;
        }
        return getWidgetAreasInternal(i10);
    }

    public synchronized float getZoomInfo() {
        float zoom;
        if (isDestroyed()) {
            zoom = 1.0f;
        } else {
            zoom = getZoom();
        }
        return zoom;
    }

    public void gotoPage(int i10) {
        int i11 = this.numPages;
        if (i10 > i11 - 1) {
            i10 = i11 - 1;
        } else if (i10 < 0) {
            i10 = 0;
        }
        gotoPageInternal(i10);
        this.pageWidth = getPageWidth();
        this.pageHeight = getPageHeight();
    }

    public synchronized boolean handleImageByMatrix(int i10, int i11, int i12, String str, float[] fArr) {
        return isDestroyed() ? false : handleImgByMatrix(i10, i11, i12, str, fArr);
    }

    public synchronized boolean hasChanges() {
        if (isDestroyed()) {
            return false;
        }
        return hasChangesInternal();
    }

    public synchronized boolean hasDroppedUndo() {
        boolean z10;
        if (!isDestroyed()) {
            if (hasDroppedUndoInternal()) {
                z10 = true;
            }
        }
        z10 = false;
        return z10;
    }

    public synchronized boolean hasOutline() {
        if (isDestroyed()) {
            return false;
        }
        return hasOutlineInternal();
    }

    public synchronized boolean hasPdfChanged() {
        boolean z10;
        if (!isUndoEnable()) {
            if (this.deleteAnnotationCnt <= 0) {
                z10 = false;
            }
        }
        z10 = true;
        return z10;
    }

    public boolean hasPdfEdit() {
        if (!isReDoEnable() && !isUndoEnable() && this.deleteAnnotationCnt <= 0) {
            return false;
        }
        return true;
    }

    public synchronized boolean hidePageImage(int i10, int i11, String str, boolean z10) {
        if (isDestroyed()) {
            return false;
        }
        gotoPage(i10);
        return hidePageImg(i10, i11, str, z10);
    }

    public synchronized byte[] html(int i10) {
        if (isDestroyed()) {
            return null;
        }
        gotoPage(i10);
        return textAsHtml();
    }

    public synchronized void initTextEditorHandle(int i10) {
        if (isDestroyed()) {
            return;
        }
        initTextEditorHandleInternal(i10);
    }

    public synchronized boolean insertBlankPages(Rect rect, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        if (isDestroyed()) {
            return false;
        }
        boolean insertBlankPagesInternal = insertBlankPagesInternal(rect, i10, i11, i12, i13, i14, i15, i16);
        this.numPages = countPagesSynchronized();
        doPageManagerStateCallback();
        return insertBlankPagesInternal;
    }

    public synchronized int insertFiles(String[] strArr, int i10) {
        if (isDestroyed()) {
            return 0;
        }
        int insertFilesInternal = insertFilesInternal(strArr, i10);
        this.numPages = countPagesSynchronized();
        doPageManagerStateCallback();
        return insertFilesInternal;
    }

    public synchronized boolean insertImgToPageByMatrix(int i10, String str, float[] fArr) {
        if (isDestroyed()) {
            return false;
        }
        gotoPage(i10);
        return pageInsertImgByMatrix(i10, str, fArr);
    }

    public boolean isDestroyed() {
        if (this.globals != 0 && !this.isDestroying.get()) {
            return false;
        }
        pg.a.c().a().getClass();
        aj.b.K("core globals destroyed!");
        return true;
    }

    public synchronized boolean isReDoEnable() {
        boolean z10;
        LinkedBlockingDeque<ij.b> linkedBlockingDeque = this.pageUndoEditActionQueueList;
        if (linkedBlockingDeque != null) {
            if (!linkedBlockingDeque.isEmpty()) {
                z10 = true;
            }
        }
        z10 = false;
        return z10;
    }

    public synchronized boolean isRedoable() {
        boolean isRedoableInternal;
        if (isDestroyed()) {
            isRedoableInternal = false;
        } else {
            isRedoableInternal = isRedoableInternal();
        }
        return isRedoableInternal;
    }

    public boolean isSavingPdf() {
        return this.isSavingPdf;
    }

    public synchronized boolean isUndoEnable() {
        boolean z10;
        LinkedBlockingDeque<ij.b> linkedBlockingDeque = this.pageDoEditActionQueueList;
        if (linkedBlockingDeque != null) {
            if (!linkedBlockingDeque.isEmpty()) {
                z10 = true;
            }
        }
        z10 = false;
        return z10;
    }

    public synchronized boolean isUndoable() {
        boolean isUndoableInternal;
        if (isDestroyed()) {
            isUndoableInternal = false;
        } else {
            isUndoableInternal = isUndoableInternal();
        }
        return isUndoableInternal;
    }

    public boolean isUnencryptedPDF() {
        return this.isUnencryptedPDF;
    }

    public native boolean javascriptSupported();

    public synchronized RectF locateCharFromPoint(int i10, PointF pointF) {
        if (isDestroyed()) {
            return null;
        }
        return locateCharFromPointInternal(i10, pointF, -1);
    }

    public int makeAnnotsFlag(Annotation.Type... typeArr) {
        int i10 = 0;
        for (Annotation.Type type : typeArr) {
            i10 |= 1 << type.ordinal();
        }
        return i10;
    }

    public synchronized boolean movePage(int[] iArr, int i10) {
        if (isDestroyed()) {
            return false;
        }
        boolean movePageInternal = movePageInternal(iArr, i10);
        doPageManagerStateCallback();
        return movePageInternal;
    }

    public synchronized boolean needsPassword() {
        if (isDestroyed()) {
            return false;
        }
        return needsPasswordInternal();
    }

    public void notifyTask(mj.d0 d0Var) {
        if (isDestroyed()) {
            return;
        }
        mj.g gVar = this.textEditorExecutor;
        if (!mj.g.f22080f) {
            gVar.a();
        }
        gVar.f22082b.offer(d0Var);
        Object obj = mj.g.f22079e;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    public synchronized void onDestroy() {
        pg.a.c().a().getClass();
        aj.b.K("core destroy " + this.fileName);
        this.isDestroying.set(true);
        release();
        pg.a.c().a().getClass();
        aj.b.K("core not destroy " + this.fileName);
        removeAllRCache();
        destroying();
        this.globals = 0L;
    }

    public synchronized g0 passClickEvent(int i10, float f10, float f11) {
        boolean z10;
        if (isDestroyed()) {
            return null;
        }
        if (passClickEventInternal(i10, f10, f11) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = a.f21370b[WidgetType.values()[getFocusedWidgetTypeInternal()].ordinal()];
        if (i11 != 1) {
            if (i11 != 2 && i11 != 3) {
                if (i11 != 4) {
                    return new g0(z10);
                }
                return new i0(z10, getFocusedWidgetSignatureState());
            }
            String[] focusedWidgetChoiceOptions = getFocusedWidgetChoiceOptions();
            getFocusedWidgetChoiceSelected();
            return new h0(z10, focusedWidgetChoiceOptions);
        }
        return new j0(z10, getFocusedWidgetTextInternal());
    }

    public synchronized void queryReflowInfo(int i10, oj.c cVar) {
        log("queryReflowInfo");
        if (isDestroyed()) {
            return;
        }
        if (this.reflowHelper == null) {
            this.reflowHelper = new oj.e();
        }
        if (i10 >= 0 && i10 < countPages()) {
            oj.e eVar = this.reflowHelper;
            if (eVar.f23112d.get()) {
                ((ReaderPreviewActivity.c) cVar).a(0);
            } else {
                c cVar2 = eVar.c.get(Integer.valueOf(i10));
                if (cVar2 == null) {
                    eVar.f23110a.execute(new oj.d(eVar, i10, this, cVar));
                } else {
                    oj.e.a(cVar2.c(), cVar);
                }
            }
        }
        ((ReaderPreviewActivity.c) cVar).a(1);
    }

    public synchronized void recordEditorTextOrImageAction(int i10) {
        int i11;
        if (!isDestroyed() && pageIndexLegal(i10)) {
            LinkedBlockingDeque<ij.b> linkedBlockingDeque = this.pageUndoEditActionQueueList;
            if (linkedBlockingDeque != null) {
                linkedBlockingDeque.clear();
            }
            LinkedBlockingDeque<ij.b> linkedBlockingDeque2 = this.pageDoEditActionQueueList;
            if (linkedBlockingDeque2 != null) {
                ij.b peekLast = linkedBlockingDeque2.peekLast();
                if (peekLast != null && peekLast.f18526j && peekLast.f18518a == i10) {
                    int i12 = peekLast.f18528l;
                    if (i12 > 0 && (i11 = peekLast.f18527k) > i12) {
                        peekLast.f18527k = i11 - i12;
                        peekLast.f18528l = 0;
                    }
                    peekLast.f18527k++;
                } else {
                    ij.b bVar = new ij.b();
                    bVar.f18518a = i10;
                    bVar.f18526j = true;
                    bVar.f18527k++;
                    this.pageDoEditActionQueueList.offer(bVar);
                }
                doStateCallback();
            }
        }
    }

    public synchronized boolean redo() {
        boolean redoInternal;
        if (isDestroyed()) {
            redoInternal = false;
        } else {
            redoInternal = redoInternal();
        }
        return redoInternal;
    }

    public synchronized ij.b redoAnnotation() {
        int i10;
        LinkedBlockingDeque<ij.b> linkedBlockingDeque = this.pageUndoEditActionQueueList;
        if (linkedBlockingDeque != null && !linkedBlockingDeque.isEmpty() && !isDestroyed()) {
            ij.b peekLast = this.pageUndoEditActionQueueList.peekLast();
            if (peekLast != null && peekLast.f18526j) {
                if (editorRedoInternal()) {
                    peekLast.f18528l--;
                    LinkedBlockingDeque<ij.b> linkedBlockingDeque2 = this.pageDoEditActionQueueList;
                    if (linkedBlockingDeque2 != null && linkedBlockingDeque2.peekLast() != peekLast) {
                        this.pageDoEditActionQueueList.offer(peekLast);
                    }
                    if (peekLast.f18528l <= 0) {
                        this.pageUndoEditActionQueueList.pollLast();
                    }
                }
                doStateCallback();
                return peekLast;
            }
            ij.b pollLast = this.pageUndoEditActionQueueList.pollLast();
            if (pollLast == null) {
                return null;
            }
            gotoPage(pollLast.f18518a);
            if (pollLast.f18519b == Annotation.Type.FREETEXT) {
                doStateCallback();
                return pollLast;
            }
            LinkedBlockingDeque<ij.b> linkedBlockingDeque3 = this.pageDoEditActionQueueList;
            if (linkedBlockingDeque3 != null) {
                linkedBlockingDeque3.offer(pollLast);
            }
            Annotation.Type type = pollLast.f18519b;
            if (type != null && ((i10 = a.f21369a[type.ordinal()]) == 2 || i10 == 3 || i10 == 4)) {
                addMarkupAnnotationInternal(pollLast.c, pollLast.f18519b.ordinal());
            }
            doStateCallback();
            return pollLast;
        }
        return null;
    }

    public synchronized ij.e redoPageManageAction() {
        LinkedBlockingDeque<ij.e> linkedBlockingDeque;
        LinkedBlockingDeque<ij.e> linkedBlockingDeque2 = this.pageManagerUndoQueueList;
        if (linkedBlockingDeque2 != null && !linkedBlockingDeque2.isEmpty() && !isDestroyed()) {
            if (!redo()) {
                return null;
            }
            this.numPages = countPagesSynchronized();
            ij.e pollLast = this.pageManagerUndoQueueList.pollLast();
            if (pollLast != null && (linkedBlockingDeque = this.pageManagerDoQueueList) != null && linkedBlockingDeque.peekLast() != pollLast) {
                this.pageManagerDoQueueList.offer(pollLast);
            }
            doPageManagerStateCallback();
            return pollLast;
        }
        return null;
    }

    public void release() {
        pj.a aVar = a.C0362a.f28967a;
        aVar.f28966b.post(new b1.e(this, 11));
        LinkedBlockingDeque<ij.b> linkedBlockingDeque = this.pageDoEditActionQueueList;
        if (linkedBlockingDeque != null && !linkedBlockingDeque.isEmpty()) {
            this.pageDoEditActionQueueList.clear();
        }
        LinkedBlockingDeque<ij.b> linkedBlockingDeque2 = this.pageUndoEditActionQueueList;
        if (linkedBlockingDeque2 != null && !linkedBlockingDeque2.isEmpty()) {
            this.pageUndoEditActionQueueList.clear();
        }
        LinkedBlockingDeque<ij.e> linkedBlockingDeque3 = this.pageManagerDoQueueList;
        if (linkedBlockingDeque3 != null && !linkedBlockingDeque3.isEmpty()) {
            this.pageManagerDoQueueList.clear();
        }
        LinkedBlockingDeque<ij.e> linkedBlockingDeque4 = this.pageManagerUndoQueueList;
        if (linkedBlockingDeque4 != null && !linkedBlockingDeque4.isEmpty()) {
            this.pageManagerUndoQueueList.clear();
        }
        List<String> list = this.usedFunctions;
        if (list != null) {
            list.clear();
        }
        clearTranslateFreeTextAnnotationDatas();
        clearSavedUpdateAnnotationsList();
        if (this.listener != null) {
            try {
                this.listener.z0(true);
            } catch (Exception unused) {
            }
        }
        stopTextExecutor();
    }

    public synchronized int removeMarkupAnnotation(int i10, PointF[] pointFArr, Annotation.Type type, boolean z10) {
        if (isDestroyed()) {
            return 0;
        }
        gotoPage(i10);
        return removeMarkupAnnotationInternal(pointFArr, type.ordinal(), z10);
    }

    public void replyToAlert(PDFAlert pDFAlert) {
        if (isDestroyed()) {
            return;
        }
        replyToAlertInternal(new PDFAlertInternal(pDFAlert));
    }

    public void resetData() {
        LinkedBlockingDeque<ij.e> linkedBlockingDeque;
        LinkedBlockingDeque<ij.b> linkedBlockingDeque2 = this.pageDoEditActionQueueList;
        if (linkedBlockingDeque2 != null && !linkedBlockingDeque2.isEmpty()) {
            this.pageDoEditActionQueueList.clear();
        }
        LinkedBlockingDeque<ij.b> linkedBlockingDeque3 = this.pageUndoEditActionQueueList;
        if (linkedBlockingDeque3 != null && !linkedBlockingDeque3.isEmpty()) {
            this.pageUndoEditActionQueueList.clear();
        }
        LinkedBlockingDeque<ij.e> linkedBlockingDeque4 = this.pageManagerDoQueueList;
        if ((linkedBlockingDeque4 != null && !linkedBlockingDeque4.isEmpty()) || ((linkedBlockingDeque = this.pageManagerUndoQueueList) != null && !linkedBlockingDeque.isEmpty())) {
            LinkedBlockingDeque<ij.e> linkedBlockingDeque5 = this.pageManagerDoQueueList;
            if (linkedBlockingDeque5 != null && !linkedBlockingDeque5.isEmpty()) {
                this.pageManagerDoQueueList.clear();
            }
            LinkedBlockingDeque<ij.e> linkedBlockingDeque6 = this.pageManagerUndoQueueList;
            if (linkedBlockingDeque6 != null && !linkedBlockingDeque6.isEmpty()) {
                this.pageManagerUndoQueueList.clear();
            }
            clearUndoRedo();
        }
        List<String> list = this.usedFunctions;
        if (list != null) {
            list.clear();
        }
        clearTranslateFreeTextAnnotationDatas();
        clearSavedUpdateAnnotationsList();
        if (this.listener != null) {
            try {
                this.listener.z0(true);
            } catch (Exception unused) {
            }
        }
        this.deleteAnnotationCnt = 0;
    }

    public synchronized void resetName(String str) {
        if (isDestroyed()) {
            return;
        }
        resetData();
        resetNameInternal(str);
    }

    public void resetSelectRectF() {
        if (this.listener != null) {
            try {
                this.listener.U0();
            } catch (Exception unused) {
            }
        }
    }

    public synchronized boolean reversePageImageInfo(int i10, Annotation annotation, boolean z10) {
        if (annotation != null) {
            if (!isDestroyed()) {
                gotoPage(i10);
                return false;
            }
        }
        return false;
    }

    public synchronized boolean rotatePage(int[] iArr, int i10) {
        if (isDestroyed()) {
            return false;
        }
        boolean rotatePageInternal = rotatePageInternal(iArr, i10);
        doPageManagerStateCallback();
        return rotatePageInternal;
    }

    public synchronized boolean save() {
        if (isDestroyed()) {
            return false;
        }
        resetData();
        if (saveInternal(null)) {
            this.isDestroying.set(true);
            return true;
        }
        return false;
    }

    public synchronized void saveTextInkAnnotations(float f10) {
        PDFFreeTextEditView pDFFreeTextEditView;
        w4.a g10;
        PDFFreeTextEditView pDFFreeTextEditView2;
        try {
            this.saveDrawPathLinkedHashMap.clear();
            Iterator<ij.b> it = this.pageDoEditActionQueueList.iterator();
            while (it.hasNext()) {
                ij.b next = it.next();
                if (next != null && next.f18519b == Annotation.Type.INK) {
                    Iterator<ij.a> it2 = next.f18521e.iterator();
                    while (it2.hasNext()) {
                        ij.a next2 = it2.next();
                        if (next2 != null) {
                            next2.f18509b = next.f18518a;
                            this.saveDrawPathLinkedHashMap.put(Long.valueOf(next2.f18508a), next2);
                        }
                    }
                }
            }
            for (Map.Entry<Long, ij.a> entry : this.saveDrawPathLinkedHashMap.entrySet()) {
                ij.a value = entry.getValue();
                if (value != null && value.a()) {
                    gotoPage(value.f18509b);
                    addInkAnnotationInternal(value.f18512f, value.f18513g, value.f18514h);
                }
            }
            this.tmpNeedSaveTextMap.clear();
            while (!this.pageDoEditActionQueueList.isEmpty()) {
                ij.b pollFirst = this.pageDoEditActionQueueList.pollFirst();
                if (pollFirst != null && pollFirst.f18519b == Annotation.Type.FREETEXT && (pDFFreeTextEditView2 = pollFirst.f18523g) != null) {
                    this.tmpNeedSaveTextMap.put(Long.valueOf(pDFFreeTextEditView2.get_id()), pollFirst);
                }
            }
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            for (Map.Entry<Long, ij.b> entry2 : this.tmpNeedSaveTextMap.entrySet()) {
                ij.b value2 = entry2.getValue();
                if (value2 != null) {
                    value2.f18525i = f10;
                    PDFFreeTextEditView pDFFreeTextEditView3 = value2.f18523g;
                    if (pDFFreeTextEditView3 != null && pDFFreeTextEditView3.f21611d0 && pDFFreeTextEditView3.getSavedTextIndexInFreeTextAnnotationDatas() != -1) {
                        if (value2.f18522f.getAction() != AdjustAction.Saved) {
                            AdjustActionInfo adjustActionInfo = value2.f18522f;
                            if (adjustActionInfo != null && adjustActionInfo.getAction() == AdjustAction.Delete) {
                                ArrayList arrayList2 = (ArrayList) hashMap.get(Integer.valueOf(value2.f18518a));
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                    hashMap.put(Integer.valueOf(value2.f18518a), arrayList2);
                                }
                                arrayList2.add(Integer.valueOf(value2.f18523g.getSavedTextIndexInFreeTextAnnotationDatas()));
                            } else {
                                w4.a g11 = value2.f18523g.g(value2.f18524h, value2.f18525i);
                                if (g11 != null) {
                                    updateTextAnnotation2(value2.f18518a, value2.f18523g.getSavedTextIndexInFreeTextAnnotationDatas(), (RectF) g11.f30971b, value2.f18523g.getText(), Integer.valueOf(value2.f18523g.getTextColor()), Float.valueOf(getPixelFontSize(value2.f18523g.getFontSize(), value2.f18524h, value2.f18525i)), (Bitmap) g11.f30970a);
                                }
                            }
                        }
                    } else {
                        arrayList.add(value2);
                    }
                }
            }
            if (!hashMap.isEmpty()) {
                for (Map.Entry entry3 : hashMap.entrySet()) {
                    ArrayList arrayList3 = (ArrayList) entry3.getValue();
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int[] iArr = new int[size];
                        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                            iArr[i10] = ((Integer) arrayList3.get(i10)).intValue();
                        }
                        if (size > 0) {
                            deleteAnnotations(((Integer) entry3.getKey()).intValue(), iArr, makeAnnotFlag(Annotation.Type.FREETEXT));
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ij.b bVar = (ij.b) it3.next();
                    AdjustActionInfo adjustActionInfo2 = bVar.f18522f;
                    if (adjustActionInfo2 != null && adjustActionInfo2.getAction() != AdjustAction.Delete && (g10 = (pDFFreeTextEditView = bVar.f18523g).g(bVar.f18524h, bVar.f18525i)) != null) {
                        addTextAnnotation2(bVar.f18518a, (RectF) g10.f30971b, pDFFreeTextEditView.getText(), pDFFreeTextEditView.getTextColor(), getPixelFontSize(pDFFreeTextEditView.getFontSize(), bVar.f18524h, bVar.f18525i), (Bitmap) g10.f30970a);
                    }
                }
            }
            updateEndClearCache();
            this.pageDoEditActionQueueList.clear();
            this.tmpNeedSaveTextMap.clear();
            List<String> list = this.usedFunctions;
            if (list != null) {
                list.clear();
            }
            clearTranslateFreeTextAnnotationDatas();
            clearSavedUpdateAnnotationsList();
            if (this.listener != null) {
                try {
                    this.listener.z0(false);
                } catch (Exception unused) {
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public synchronized boolean saveTo(String str, PDFListener pDFListener) {
        if (isDestroyed()) {
            return false;
        }
        return saveToInternal(str, pDFListener);
    }

    public synchronized boolean saveToFd(FileDescriptor fileDescriptor, boolean z10, PDFListener pDFListener) {
        if (isDestroyed()) {
            return false;
        }
        return saveToFdInternal(fileDescriptor, z10, pDFListener);
    }

    public synchronized RectF[] searchPage(int i10, String str) {
        if (isDestroyed()) {
            return null;
        }
        gotoPage(i10);
        return searchPage(str);
    }

    public void setDocSaveOptions(boolean z10) {
        if (isDestroyed()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("compress=yes,compress-fonts=yes,compress-images=yes");
        }
        setSaveOptions(sb2.toString());
    }

    public synchronized void setFocusedWidgetChoiceSelected(String[] strArr) {
        if (isDestroyed()) {
            return;
        }
        setFocusedWidgetChoiceSelectedInternal(strArr);
    }

    public synchronized boolean setFocusedWidgetText(int i10, String str) {
        boolean z10 = false;
        if (isDestroyed()) {
            return false;
        }
        gotoPage(i10);
        if (setFocusedWidgetTextInternal(str) != 0) {
            z10 = true;
        }
        return z10;
    }

    public synchronized void setPageManagerStateListener(qg.h hVar) {
        this.pageManagerListener = hVar;
    }

    public void setSavingPdf(boolean z10) {
        this.isSavingPdf = z10;
    }

    public void setSkipStamp(int i10) {
        this.skipStamp = i10;
    }

    public synchronized void setStateListener(qg.i iVar) {
        this.listener = iVar;
    }

    public synchronized boolean signFocusedSignature(String str, String str2) {
        if (isDestroyed()) {
            return false;
        }
        return signFocusedSignatureInternal(str, str2);
    }

    public void startAlerts() {
        if (isDestroyed()) {
            return;
        }
        startAlertsInternal();
    }

    public void startTextExecutor() {
        if (isDestroyed()) {
            return;
        }
        this.textEditorExecutor.a();
    }

    public void stopAlerts() {
        if (isDestroyed()) {
            return;
        }
        stopAlertsInternal();
    }

    public void stopTextExecutor() {
        mj.g gVar = this.textEditorExecutor;
        if (gVar.f22081a) {
            gVar.f22081a = false;
            mj.g.f22080f = false;
            gVar.f22082b.clear();
            gVar.c.removeCallbacksAndMessages(null);
            Object obj = mj.g.f22079e;
            synchronized (obj) {
                obj.notifyAll();
            }
        }
    }

    public synchronized TextChar[][] textLines(int i10) {
        if (isDestroyed()) {
            return new TextChar[0];
        }
        gotoPage(i10);
        TextChar[][][][] text = text();
        ArrayList arrayList = new ArrayList();
        for (TextChar[][][] textCharArr : text) {
            if (textCharArr != null) {
                for (TextChar[][] textCharArr2 : textCharArr) {
                    ArrayList arrayList2 = new ArrayList();
                    for (TextChar[] textCharArr3 : textCharArr2) {
                        arrayList2.addAll(Arrays.asList(textCharArr3));
                    }
                    if (arrayList2.size() > 0) {
                        arrayList.add((TextChar[]) arrayList2.toArray(new TextChar[arrayList2.size()]));
                    }
                }
            }
        }
        return filterPageText((TextChar[][]) arrayList.toArray(new TextChar[arrayList.size()]));
    }

    public Bitmap thumbPageOnce(int i10, int i11, int i12, int i13) {
        PointF pageSize = getPageSize(i13);
        if (pageSize != null) {
            float f10 = pageSize.x;
            if (f10 != 0.0f) {
                float f11 = pageSize.y;
                if (f11 != 0.0f) {
                    float max = Math.max(i10 / f10, i11 / f11);
                    Point point = new Point((int) (pageSize.x * max), (int) (pageSize.y * max));
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    float f12 = pageSize.x;
                    float f13 = pageSize.y;
                    float f14 = f12 / f13;
                    if (f14 < 0.5d || f14 > 2.0f) {
                        i12 *= 2;
                    }
                    if (point.x > i12) {
                        point.x = i12;
                        point.y = (int) ((f13 * i12) / f12);
                    } else if (point.y > i12) {
                        point.y = i12;
                        point.x = (int) ((f12 * i12) / f13);
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(point.x, point.y, config);
                    int i14 = point.x;
                    int i15 = point.y;
                    drawPage(createBitmap, i13, i14, i15, 0, 0, i14, i15, new Cookie());
                    return createBitmap;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public void transportData(ReaderPDFCore readerPDFCore) {
        if (readerPDFCore == null) {
            return;
        }
        this.repository = readerPDFCore.getRepository();
    }

    public synchronized boolean undo() {
        boolean undoInternal;
        if (isDestroyed()) {
            undoInternal = false;
        } else {
            undoInternal = undoInternal();
        }
        return undoInternal;
    }

    public synchronized ij.b undoAnnotation() {
        int annotationsInternalCnt;
        LinkedBlockingDeque<ij.b> linkedBlockingDeque = this.pageDoEditActionQueueList;
        if (linkedBlockingDeque != null && !linkedBlockingDeque.isEmpty() && !isDestroyed()) {
            ij.b peekLast = this.pageDoEditActionQueueList.peekLast();
            if (peekLast != null && peekLast.f18526j) {
                int editorCanUndoInternal = editorCanUndoInternal();
                if (editorUndoInternal()) {
                    peekLast.f18528l++;
                    LinkedBlockingDeque<ij.b> linkedBlockingDeque2 = this.pageUndoEditActionQueueList;
                    if (linkedBlockingDeque2 != null && linkedBlockingDeque2.peekLast() != peekLast) {
                        this.pageUndoEditActionQueueList.offer(peekLast);
                    }
                    int i10 = peekLast.f18528l;
                    int i11 = peekLast.f18527k;
                    if (i10 >= i11 || editorCanUndoInternal == 1) {
                        if (editorCanUndoInternal == 1 && i11 > i10) {
                            peekLast.f18527k = i10;
                        }
                        this.pageDoEditActionQueueList.pollLast();
                    }
                    if (editorCanUndoInternal == 1 && !this.pageDoEditActionQueueList.isEmpty()) {
                        Iterator<ij.b> it = this.pageDoEditActionQueueList.iterator();
                        while (it.hasNext()) {
                            ij.b next = it.next();
                            if (next != null && next.f18526j) {
                                it.remove();
                            }
                        }
                    }
                }
                doStateCallback();
                return peekLast;
            }
            ij.b pollLast = this.pageDoEditActionQueueList.pollLast();
            if (pollLast == null) {
                return null;
            }
            int i12 = pollLast.f18518a;
            gotoPage(i12);
            if (pollLast.f18519b == Annotation.Type.FREETEXT) {
                doStateCallback();
                return pollLast;
            }
            LinkedBlockingDeque<ij.b> linkedBlockingDeque3 = this.pageUndoEditActionQueueList;
            if (linkedBlockingDeque3 != null) {
                linkedBlockingDeque3.offer(pollLast);
            }
            if (pollLast.f18519b != Annotation.Type.INK && (annotationsInternalCnt = getAnnotationsInternalCnt(i12)) > 0) {
                deleteAnnotationInternal(annotationsInternalCnt - 1);
            }
            doStateCallback();
            return pollLast;
        }
        return null;
    }

    public synchronized ij.e undoPageManageAction() {
        LinkedBlockingDeque<ij.e> linkedBlockingDeque;
        LinkedBlockingDeque<ij.e> linkedBlockingDeque2 = this.pageManagerDoQueueList;
        if (linkedBlockingDeque2 != null && !linkedBlockingDeque2.isEmpty() && !isDestroyed()) {
            if (!undo()) {
                return null;
            }
            this.numPages = countPagesSynchronized();
            ij.e pollLast = this.pageManagerDoQueueList.pollLast();
            if (pollLast != null && (linkedBlockingDeque = this.pageManagerUndoQueueList) != null && linkedBlockingDeque.peekLast() != pollLast) {
                this.pageManagerUndoQueueList.offer(pollLast);
            }
            doPageManagerStateCallback();
            return pollLast;
        }
        return null;
    }

    public void updateCurEditPDFPageView(a0 a0Var) {
        this.curEditPDFPageView = a0Var;
    }

    public native int updateEndClearCache();

    public synchronized void updateEndClearCache(int i10) {
        if (isDestroyed()) {
            return;
        }
        gotoPage(i10);
        updateEndClearCache();
    }

    public native int updateFreeTextInternal2(int i10, float[] fArr, String str, Integer num, Float f10, Bitmap bitmap);

    public synchronized void updateInkAnnotation(int i10, List<ij.a> list) {
        if (!isDestroyed() && pageIndexLegal(i10)) {
            LinkedBlockingDeque<ij.b> linkedBlockingDeque = this.pageUndoEditActionQueueList;
            if (linkedBlockingDeque != null) {
                linkedBlockingDeque.clear();
            }
            ij.b bVar = new ij.b(Annotation.Type.INK, list);
            bVar.f18518a = i10;
            this.pageDoEditActionQueueList.offer(bVar);
            doStateCallback();
        }
    }

    public synchronized int updateOneStamp(int i10, int i11, RectF rectF, String str, Integer num, Integer num2, Bitmap bitmap) {
        if (isDestroyed()) {
            return -1;
        }
        gotoPage(i10);
        return updateOneStampInternal(i11, rectF != null ? new float[]{rectF.left, rectF.top, rectF.right, rectF.bottom} : null, str, num, num2, bitmap);
    }

    public native int updateOneStampInternal(int i10, float[] fArr, String str, Integer num, Integer num2, Bitmap bitmap);

    public synchronized void updatePage(Bitmap bitmap, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Cookie cookie) {
        updatePage(bitmap, i10, i11, i12, i13, i14, i15, i16, -1, cookie);
    }

    public synchronized int updateTextAnnotation2(int i10, int i11, RectF rectF, String str, Integer num, Float f10, Bitmap bitmap) {
        if (isDestroyed()) {
            return -1;
        }
        gotoPage(i10);
        return updateFreeTextInternal2(i11, rectF != null ? new float[]{rectF.left, rectF.top, rectF.right, rectF.bottom} : null, str, num, f10, bitmap);
    }

    public PDFAlert waitForAlert() {
        PDFAlertInternal waitForAlertInternal;
        if (isDestroyed() || (waitForAlertInternal = waitForAlertInternal()) == null) {
            return null;
        }
        return waitForAlertInternal.toAlert();
    }

    public boolean wasOpenedFromBuffer() {
        return this.wasOpenedFromBuffer;
    }

    public static int mergePdf(String str, String[] strArr, String[] strArr2, PDFListener pDFListener) {
        if (strArr2 != null && strArr2.length != strArr.length) {
            strArr2 = null;
        }
        return mergePdfInternal(new File(str).getAbsolutePath(), strArr, strArr2, pDFListener);
    }

    public synchronized c cacheReflow(int i10, int i11, int i12, int i13, int i14, int i15, float f10, float f11, Cookie cookie) {
        if (isDestroyed()) {
            return null;
        }
        long checkReflowPage = checkReflowPage(i10, i11, i12, i13, i14, i15, f10, f11, cookie);
        if (checkReflowPage != 0) {
            return new c(checkReflowPage);
        }
        return null;
    }

    public synchronized boolean delPageImageInfo(int i10, Annotation annotation) {
        if (annotation != null) {
            if (!isDestroyed()) {
                gotoPage(i10);
                return delPageImg(i10, annotation.getImgRenderObjID(), annotation.getImgIndex(), annotation.getImgName());
            }
        }
        return false;
    }

    public synchronized Annotation[] getAnnotations(int i10, int i11) {
        if (isDestroyed()) {
            return null;
        }
        return getAnnotationsInternal(i10, i11);
    }

    public synchronized boolean handleImageByMatrix(int i10, Annotation annotation, float[] fArr) {
        if (annotation != null) {
            if (!isDestroyed()) {
                gotoPage(i10);
                return handleImgByMatrix(i10, annotation.getImgRenderObjID(), annotation.getImgIndex(), annotation.getImgName(), fArr);
            }
        }
        return false;
    }

    public synchronized void drawPage(Bitmap bitmap, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Cookie cookie) {
        if (isDestroyed()) {
            return;
        }
        if (pageSizeLegal(bitmap, i11, i12, i13, i14, i15, i16)) {
            gotoPage(i10);
            drawPageInternal(bitmap, i11, i12, i13, i14, i15, i16, i17, cookie);
        } else {
            pg.a.c().a().getClass();
            aj.b.K("drawPage pageSize not legal");
        }
    }

    public synchronized RectF locateCharFromPoint(int i10, PointF pointF, int i11) {
        if (isDestroyed()) {
            return null;
        }
        return locateCharFromPointInternal(i10, pointF, i11);
    }

    public synchronized void updatePage(Bitmap bitmap, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Cookie cookie) {
        if (isDestroyed()) {
            return;
        }
        if (pageSizeLegal(bitmap, i11, i12, i13, i14, i15, i16)) {
            gotoPage(i10);
            updatePageInternal(bitmap, i10, i11, i12, i13, i14, i15, i16, i17, cookie);
        } else {
            pg.a.c().a().getClass();
            aj.b.K("updatePage pageSize not legal");
        }
    }

    public synchronized void deleteAnnotation(int i10, int i11, ij.b bVar) {
        if (!isDestroyed() && pageIndexLegal(i10)) {
            gotoPage(i10);
            deleteDoEdition(bVar);
            deleteAnnotationInternal(i11);
            if (bVar == null) {
                this.deleteAnnotationCnt++;
            }
        }
    }

    public synchronized void editorSelectSetFontStyleAndSave(int i10, SelectInfo selectInfo) {
        if (isDestroyed()) {
            return;
        }
        editorSelectSetFontStyleInternal(i10, "", selectInfo.color, selectInfo.targetSize, selectInfo.boldState, selectInfo.italicState, selectInfo.underlineState);
        editorSaveContentInternal(i10);
    }

    public synchronized boolean hidePageImage(int i10, Annotation annotation, boolean z10) {
        if (!isDestroyed() && annotation != null) {
            gotoPage(i10);
            return hidePageImg(i10, annotation.getImgIndex(), annotation.getImgName(), z10);
        }
        return false;
    }

    public synchronized boolean save(PDFListener pDFListener) {
        if (isDestroyed()) {
            return false;
        }
        if (saveInternal(pDFListener)) {
            this.isDestroying.set(true);
            return true;
        }
        return false;
    }

    public synchronized void addTextAnnotation(int i10, RectF rectF, String str, int i11, float f10) {
        log("addTextAnnotation");
        if (isDestroyed()) {
            return;
        }
        gotoPage(i10);
        addTextAnnotationInternal(new float[]{rectF.left, rectF.top, rectF.right, rectF.bottom}, str, i11, f10);
    }

    public synchronized int updateInkAnnotation(int i10, int[] iArr, PointF[][][] pointFArr) {
        if (isDestroyed()) {
            return -1;
        }
        gotoPage(i10);
        return updateInkAnnotationStroke(iArr, pointFArr);
    }

    public ReaderPDFCore(Context context, String str) {
        String str2;
        this.fileName = "null";
        if (!isSoLoadSuccess) {
            nj.a aVar = a.C0300a.f22499a;
            new IllegalStateException("ReaderPDFCore openFile so load fail");
            aVar.a();
            return;
        }
        long openFile = openFile(str);
        this.globals = openFile;
        if (openFile != 0) {
            try {
            } catch (Exception e10) {
                pg.a.c().b().getClass();
                dp.a.a().getClass();
                dp.a.d(context, e10);
                pg.a.c().a().getClass();
                aj.b.K("PDFCore create Trying to open globals=" + this.globals + " fileName " + str);
            }
            if (!new File(str).exists()) {
                if (str.contains(PDF_FOLDER)) {
                    str2 = str.replace(PDF_FOLDER, PDF_NEW_FOLDER);
                } else if (str.contains(PDF_NEW_FOLDER)) {
                    str2 = str.replace(PDF_NEW_FOLDER, PDF_FOLDER);
                }
                File file = new File(str2);
                this.fileName = str2;
                pg.a.c().a().getClass();
                aj.b.K("PDFCore create Trying to open file length=" + file.length() + " fileName " + str);
                pg.a.c().b().getClass();
                setUndoRedoMaxCount(c1.v(context));
                this.file_format = fileFormatInternal();
                this.isUnencryptedPDF = isUnencryptedPDFInternal();
                this.wasOpenedFromBuffer = false;
                return;
            }
            str2 = str;
            File file2 = new File(str2);
            this.fileName = str2;
            pg.a.c().a().getClass();
            aj.b.K("PDFCore create Trying to open file length=" + file2.length() + " fileName " + str);
            pg.a.c().b().getClass();
            setUndoRedoMaxCount(c1.v(context));
            this.file_format = fileFormatInternal();
            this.isUnencryptedPDF = isUnencryptedPDFInternal();
            this.wasOpenedFromBuffer = false;
            return;
        }
        throw new Exception(String.format(context.getString(R.string.arg_res_0x7f13009a), str));
    }

    private static void log(String str) {
    }

    public ReaderPDFCore(Context context, byte[] bArr, String str) {
        this.fileName = "null";
        if (!isSoLoadSuccess) {
            nj.a aVar = a.C0300a.f22499a;
            new IllegalStateException("ReaderPDFCore openBuffer so load fail");
            aVar.a();
            return;
        }
        this.fileBuffer = bArr;
        this.fileName = "buffer open";
        long openBuffer = openBuffer(str == null ? "" : str);
        this.globals = openBuffer;
        if (openBuffer != 0) {
            pg.a.c().b().getClass();
            setUndoRedoMaxCount(c1.v(context));
            this.file_format = fileFormatInternal();
            this.isUnencryptedPDF = isUnencryptedPDFInternal();
            this.wasOpenedFromBuffer = true;
            return;
        }
        throw new Exception(context.getString(R.string.arg_res_0x7f130099));
    }
}
