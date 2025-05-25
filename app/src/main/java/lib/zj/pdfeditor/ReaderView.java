package lib.zj.pdfeditor;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Scroller;
import androidx.appcompat.widget.y0;
import com.google.android.gms.common.api.Api;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import lib.zj.pdfeditor.i;
import lib.zj.pdfeditor.model.FitMode;
import lib.zj.pdfeditor.text.PDFFreeTextEditView;
import ng.b;
import oj.a;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pj.a;

/* loaded from: classes3.dex */
public class ReaderView extends AdapterView<Adapter> implements GestureDetector.OnGestureListener, b.a, Runnable, GestureDetector.OnDoubleTapListener, og.b {
    public static boolean A0 = true;
    public static boolean B0 = true;
    public static int C0 = 0;

    /* renamed from: y0  reason: collision with root package name */
    public static boolean f21377y0 = true;

    /* renamed from: z0  reason: collision with root package name */
    public static boolean f21378z0 = false;
    public final ArrayList<Float> A;
    public final ArrayList<Float> B;
    public int C;
    public int D;
    public int E;
    public float F;
    public float G;
    public boolean H;
    public boolean I;
    public boolean J;
    public qg.c K;
    public long L;
    public long M;
    public float N;
    public og.a O;
    public int P;
    public int Q;
    public boolean R;
    public boolean S;
    public int T;
    public int U;
    public boolean V;
    public i W;

    /* renamed from: a  reason: collision with root package name */
    public Adapter f21379a;

    /* renamed from: a0  reason: collision with root package name */
    public qg.e f21380a0;

    /* renamed from: b  reason: collision with root package name */
    public int f21381b;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f21382b0;
    public boolean c;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f21383c0;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<ij.d, View> f21384d;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f21385d0;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList<WeakReference<View>> f21386e;

    /* renamed from: e0  reason: collision with root package name */
    public float f21387e0;

    /* renamed from: f  reason: collision with root package name */
    public boolean f21388f;

    /* renamed from: f0  reason: collision with root package name */
    public float f21389f0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f21390g;

    /* renamed from: g0  reason: collision with root package name */
    public View f21391g0;

    /* renamed from: h  reason: collision with root package name */
    public float f21392h;

    /* renamed from: h0  reason: collision with root package name */
    public int f21393h0;

    /* renamed from: i  reason: collision with root package name */
    public int f21394i;

    /* renamed from: i0  reason: collision with root package name */
    public int f21395i0;

    /* renamed from: j  reason: collision with root package name */
    public int f21396j;

    /* renamed from: j0  reason: collision with root package name */
    public final b f21397j0;

    /* renamed from: k  reason: collision with root package name */
    public int f21398k;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f21399k0;

    /* renamed from: l  reason: collision with root package name */
    public int f21400l;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f21401l0;

    /* renamed from: m  reason: collision with root package name */
    public GestureDetector f21402m;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f21403m0;

    /* renamed from: n  reason: collision with root package name */
    public ng.b f21404n;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f21405n0;

    /* renamed from: o  reason: collision with root package name */
    public Scroller f21406o;

    /* renamed from: o0  reason: collision with root package name */
    public int f21407o0;

    /* renamed from: p  reason: collision with root package name */
    public r0 f21408p;

    /* renamed from: p0  reason: collision with root package name */
    public qg.d f21409p0;

    /* renamed from: q  reason: collision with root package name */
    public int f21410q;

    /* renamed from: q0  reason: collision with root package name */
    public qg.f f21411q0;

    /* renamed from: r  reason: collision with root package name */
    public int f21412r;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f21413r0;

    /* renamed from: s  reason: collision with root package name */
    public float f21414s;

    /* renamed from: s0  reason: collision with root package name */
    public h f21415s0;

    /* renamed from: t  reason: collision with root package name */
    public float f21416t;

    /* renamed from: t0  reason: collision with root package name */
    public g f21417t0;

    /* renamed from: u  reason: collision with root package name */
    public jj.b f21418u;

    /* renamed from: u0  reason: collision with root package name */
    public final RectF f21419u0;

    /* renamed from: v  reason: collision with root package name */
    public boolean f21420v;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f21421v0;

    /* renamed from: w  reason: collision with root package name */
    public boolean f21422w;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f21423w0;

    /* renamed from: x  reason: collision with root package name */
    public int f21424x;

    /* renamed from: x0  reason: collision with root package name */
    public int f21425x0;

    /* renamed from: y  reason: collision with root package name */
    public boolean f21426y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f21427z;

    /* loaded from: classes3.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            ReaderView readerView = ReaderView.this;
            int i10 = readerView.getResources().getConfiguration().orientation;
            if (i10 == 2) {
                readerView.f21393h0 = 2;
                readerView.f21395i0 = 30;
            } else if (i10 == 1) {
                readerView.f21393h0 = 5;
                readerView.f21395i0 = 100;
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReaderView readerView = ReaderView.this;
            View view = readerView.f21391g0;
            if (view == null) {
                return;
            }
            if (readerView.f21389f0 > 0.0f && readerView.getHeight() - view.getTop() > view.getHeight()) {
                readerView.f21389f0 = 0.0f;
            }
            if (view.getTop() >= 0) {
                float f10 = readerView.f21389f0;
                if (f10 < 0.0f) {
                    readerView.f21396j = (int) (readerView.f21396j - view.getTop());
                } else {
                    readerView.f21396j = (int) (readerView.f21396j - (f10 * readerView.f21393h0));
                }
            } else {
                float f11 = readerView.f21389f0;
                if (f11 < 0.0f) {
                    if (f11 * readerView.f21393h0 < view.getTop()) {
                        readerView.f21396j = (int) (readerView.f21396j - view.getTop());
                    } else {
                        readerView.f21396j = (int) (readerView.f21396j - (readerView.f21389f0 * readerView.f21393h0));
                    }
                } else {
                    readerView.f21396j = (int) (readerView.f21396j - (f11 * readerView.f21393h0));
                }
            }
            if (readerView.f21387e0 > 0.0f && readerView.getWidth() - view.getLeft() > view.getWidth()) {
                readerView.f21387e0 = 0.0f;
            }
            if (view.getLeft() >= 0) {
                float f12 = readerView.f21387e0;
                if (f12 < 0.0f) {
                    readerView.f21394i = (int) (readerView.f21394i - view.getLeft());
                } else {
                    readerView.f21394i = (int) (readerView.f21394i - (f12 * 2.0f));
                }
            } else {
                float f13 = readerView.f21387e0;
                if (f13 < 0.0f) {
                    if (f13 * 2.0f < view.getLeft()) {
                        readerView.f21394i = (int) (readerView.f21394i - view.getLeft());
                    } else {
                        readerView.f21394i = (int) (readerView.f21394i - (readerView.f21387e0 * 2.0f));
                    }
                } else {
                    readerView.f21394i = (int) (readerView.f21394i - (f13 * 2.0f));
                }
            }
            if (ReaderView.B0) {
                long j10 = readerView.M;
                if (j10 > 0 && ((float) j10) * readerView.f21392h < readerView.getWidth()) {
                    readerView.f21394i = 0;
                }
                long j11 = readerView.L;
                if (j11 > 0 && ((float) j11) * readerView.f21392h < readerView.getHeight()) {
                    readerView.f21396j = 0;
                }
            } else {
                int max = Math.max((readerView.getWidth() - view.getMeasuredWidth()) / 2, 0);
                int min = Math.min((view.getMeasuredWidth() + readerView.getWidth()) / 2, readerView.getWidth());
                int max2 = Math.max((readerView.getHeight() - view.getMeasuredHeight()) / 2, 0);
                int min2 = Math.min((view.getMeasuredHeight() + readerView.getHeight()) / 2, readerView.getHeight());
                if (ReaderView.f21377y0) {
                    if (readerView.f21381b == 0 && view.getLeft() >= max && readerView.f21387e0 < 0.0f) {
                        readerView.f21394i = 0;
                    } else if (readerView.f21381b == readerView.f21379a.getCount() - 1 && view.getRight() <= min && readerView.f21387e0 > 0.0f) {
                        readerView.f21394i = 0;
                    }
                }
                if (ReaderView.f21378z0) {
                    if (readerView.f21381b == 0 && view.getTop() >= max2 && readerView.f21389f0 < 0.0f) {
                        readerView.f21396j = 0;
                    } else if (readerView.f21381b == readerView.f21379a.getCount() - 1 && view.getBottom() <= min2 && readerView.f21389f0 > 0.0f) {
                        readerView.f21396j = 0;
                    }
                }
            }
            readerView.requestLayout();
            if (!readerView.f21385d0) {
                readerView.postDelayed(readerView.f21397j0, 30L);
            } else {
                readerView.f21383c0 = false;
            }
        }
    }

    /* loaded from: classes3.dex */
    public class c implements DialogInterface.OnClickListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
            ReaderView.this.f21403m0 = false;
        }
    }

    /* loaded from: classes3.dex */
    public class d implements qg.b {
        public d() {
        }
    }

    /* loaded from: classes3.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReaderView readerView = ReaderView.this;
            for (Map.Entry<ij.d, View> entry : readerView.f21384d.entrySet()) {
                if (entry.getKey().f18533a) {
                    View value = entry.getValue();
                    readerView.Y(value, Float.valueOf(readerView.f21392h));
                    ReaderView.this.Z(value);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f21433a;

        public f(View view) {
            this.f21433a = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReaderView.this.a0(this.f21433a);
        }
    }

    /* loaded from: classes3.dex */
    public interface g {
    }

    /* loaded from: classes3.dex */
    public interface h {
        void a(boolean z10);
    }

    /* loaded from: classes3.dex */
    public interface i {
        void a();

        void b();
    }

    public ReaderView(Context context) {
        super(context);
        this.f21384d = new HashMap<>();
        this.f21386e = new ArrayList<>();
        this.f21392h = 1.0f;
        this.f21426y = false;
        this.f21427z = false;
        this.A = new ArrayList<>();
        this.B = new ArrayList<>();
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0.0f;
        this.G = 0.0f;
        this.L = -1L;
        this.M = -1L;
        this.Q = 0;
        this.R = false;
        this.S = false;
        this.T = 0;
        this.U = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.V = true;
        this.f21382b0 = false;
        this.f21383c0 = false;
        this.f21385d0 = true;
        this.f21387e0 = 0.0f;
        this.f21389f0 = 0.0f;
        this.f21393h0 = 5;
        this.f21395i0 = 100;
        this.f21397j0 = new b();
        this.f21403m0 = false;
        this.f21405n0 = false;
        this.f21407o0 = 0;
        this.f21419u0 = new RectF();
        this.f21421v0 = false;
        this.f21423w0 = false;
        this.f21425x0 = -1;
        L(context);
    }

    private View getCacheView() {
        while (true) {
            ArrayList<WeakReference<View>> arrayList = this.f21386e;
            if (!arrayList.isEmpty()) {
                WeakReference<View> remove = arrayList.remove(0);
                if (remove != null && remove.get() != null) {
                    return remove.get();
                }
            } else {
                return null;
            }
        }
    }

    private List<View> getNextViews() {
        int width;
        int measuredWidth;
        ArrayList arrayList = new ArrayList();
        if (B0) {
            if (f21378z0) {
                width = getHeight();
            } else {
                width = getWidth();
            }
            int i10 = width * 2;
            int i11 = this.f21381b;
            while (true) {
                i11++;
                if (i10 <= 0 || i11 >= this.f21379a.getCount()) {
                    break;
                }
                View E = E(i11);
                if (f21378z0) {
                    if (E.getMeasuredHeight() == 0) {
                        return arrayList;
                    }
                    measuredWidth = E.getMeasuredHeight();
                } else if (E.getMeasuredWidth() == 0) {
                    return arrayList;
                } else {
                    measuredWidth = E.getMeasuredWidth();
                }
                i10 -= measuredWidth;
                arrayList.add(E);
            }
        } else if (this.f21413r0) {
            if (this.f21381b + 1 < this.f21379a.getCount()) {
                arrayList.add(E(this.f21381b + 1));
            }
        } else {
            if (this.f21381b + 1 < this.f21379a.getCount()) {
                arrayList.add(E(this.f21381b + 1));
            }
            if (this.f21381b + 2 < this.f21379a.getCount()) {
                arrayList.add(E(this.f21381b + 2));
            }
        }
        return arrayList;
    }

    private List<View> getPreviousViews() {
        int width;
        int measuredWidth;
        ArrayList arrayList = new ArrayList();
        if (B0) {
            if (f21378z0) {
                width = getHeight();
            } else {
                width = getWidth();
            }
            int i10 = width * 2;
            for (int i11 = this.f21381b - 1; i10 > 0 && i11 >= 0; i11--) {
                View E = E(i11);
                if (f21378z0) {
                    if (E.getMeasuredHeight() == 0) {
                        return arrayList;
                    }
                    measuredWidth = E.getMeasuredHeight();
                } else if (E.getMeasuredWidth() == 0) {
                    return arrayList;
                } else {
                    measuredWidth = E.getMeasuredWidth();
                }
                i10 -= measuredWidth;
                arrayList.add(E);
            }
        } else if (this.f21413r0) {
            int i12 = this.f21381b;
            if (i12 - 1 >= 0) {
                arrayList.add(E(i12 - 1));
            }
        } else {
            int i13 = this.f21381b;
            if (i13 - 1 >= 0) {
                arrayList.add(E(i13 - 1));
            }
            int i14 = this.f21381b;
            if (i14 - 2 >= 0) {
                arrayList.add(E(i14 - 2));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e6, code lost:
        if (r9.getLeft() == 0) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a4 A[Catch: OutOfMemoryError -> 0x048a, TryCatch #0 {OutOfMemoryError -> 0x048a, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0012, B:9:0x0016, B:11:0x001a, B:13:0x001e, B:15:0x0024, B:16:0x0028, B:20:0x0034, B:24:0x0042, B:26:0x004a, B:28:0x0050, B:30:0x0059, B:31:0x005b, B:33:0x0061, B:36:0x0066, B:38:0x006c, B:40:0x0072, B:42:0x0076, B:46:0x0093, B:48:0x0097, B:61:0x00c9, B:63:0x00cf, B:65:0x00d5, B:74:0x00ed, B:76:0x00f5, B:78:0x00fc, B:79:0x0101, B:81:0x0105, B:83:0x010b, B:84:0x0114, B:86:0x011c, B:88:0x0120, B:90:0x0131, B:91:0x013d, B:95:0x014a, B:97:0x014e, B:99:0x015a, B:100:0x0162, B:101:0x019e, B:103:0x01a4, B:105:0x01ae, B:107:0x01b2, B:109:0x01b6, B:111:0x01e7, B:113:0x01eb, B:115:0x01ef, B:116:0x0214, B:118:0x0218, B:120:0x021c, B:122:0x024f, B:124:0x0253, B:126:0x0257, B:129:0x0298, B:131:0x02a5, B:138:0x02e7, B:139:0x02f2, B:141:0x02f8, B:143:0x0300, B:145:0x0304, B:147:0x0308, B:148:0x032b, B:150:0x032f, B:152:0x0333, B:153:0x0356, B:155:0x035a, B:157:0x035e, B:158:0x0390, B:160:0x0394, B:162:0x0398, B:163:0x03ca, B:165:0x03d1, B:168:0x03dd, B:170:0x03e7, B:172:0x0402, B:174:0x0406, B:176:0x040d, B:178:0x0417, B:180:0x0421, B:171:0x03f9, B:182:0x0426, B:184:0x042a, B:186:0x0435, B:187:0x0447, B:189:0x044b, B:191:0x044f, B:193:0x0453, B:195:0x0457, B:199:0x0463, B:206:0x0478, B:200:0x0469, B:205:0x0473, B:207:0x047d, B:208:0x0486, B:133:0x02a9, B:134:0x02b6, B:136:0x02bc, B:137:0x02e2, B:68:0x00dc, B:70:0x00e2, B:43:0x007b, B:45:0x0092, B:44:0x0085, B:49:0x009e, B:51:0x00a7, B:53:0x00ad, B:55:0x00b1, B:58:0x00c1, B:60:0x00c5, B:57:0x00bd), top: B:273:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02a5 A[Catch: OutOfMemoryError -> 0x048a, TryCatch #0 {OutOfMemoryError -> 0x048a, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0012, B:9:0x0016, B:11:0x001a, B:13:0x001e, B:15:0x0024, B:16:0x0028, B:20:0x0034, B:24:0x0042, B:26:0x004a, B:28:0x0050, B:30:0x0059, B:31:0x005b, B:33:0x0061, B:36:0x0066, B:38:0x006c, B:40:0x0072, B:42:0x0076, B:46:0x0093, B:48:0x0097, B:61:0x00c9, B:63:0x00cf, B:65:0x00d5, B:74:0x00ed, B:76:0x00f5, B:78:0x00fc, B:79:0x0101, B:81:0x0105, B:83:0x010b, B:84:0x0114, B:86:0x011c, B:88:0x0120, B:90:0x0131, B:91:0x013d, B:95:0x014a, B:97:0x014e, B:99:0x015a, B:100:0x0162, B:101:0x019e, B:103:0x01a4, B:105:0x01ae, B:107:0x01b2, B:109:0x01b6, B:111:0x01e7, B:113:0x01eb, B:115:0x01ef, B:116:0x0214, B:118:0x0218, B:120:0x021c, B:122:0x024f, B:124:0x0253, B:126:0x0257, B:129:0x0298, B:131:0x02a5, B:138:0x02e7, B:139:0x02f2, B:141:0x02f8, B:143:0x0300, B:145:0x0304, B:147:0x0308, B:148:0x032b, B:150:0x032f, B:152:0x0333, B:153:0x0356, B:155:0x035a, B:157:0x035e, B:158:0x0390, B:160:0x0394, B:162:0x0398, B:163:0x03ca, B:165:0x03d1, B:168:0x03dd, B:170:0x03e7, B:172:0x0402, B:174:0x0406, B:176:0x040d, B:178:0x0417, B:180:0x0421, B:171:0x03f9, B:182:0x0426, B:184:0x042a, B:186:0x0435, B:187:0x0447, B:189:0x044b, B:191:0x044f, B:193:0x0453, B:195:0x0457, B:199:0x0463, B:206:0x0478, B:200:0x0469, B:205:0x0473, B:207:0x047d, B:208:0x0486, B:133:0x02a9, B:134:0x02b6, B:136:0x02bc, B:137:0x02e2, B:68:0x00dc, B:70:0x00e2, B:43:0x007b, B:45:0x0092, B:44:0x0085, B:49:0x009e, B:51:0x00a7, B:53:0x00ad, B:55:0x00b1, B:58:0x00c1, B:60:0x00c5, B:57:0x00bd), top: B:273:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02bc A[Catch: OutOfMemoryError -> 0x048a, LOOP:2: B:134:0x02b6->B:136:0x02bc, LOOP_END, TryCatch #0 {OutOfMemoryError -> 0x048a, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0012, B:9:0x0016, B:11:0x001a, B:13:0x001e, B:15:0x0024, B:16:0x0028, B:20:0x0034, B:24:0x0042, B:26:0x004a, B:28:0x0050, B:30:0x0059, B:31:0x005b, B:33:0x0061, B:36:0x0066, B:38:0x006c, B:40:0x0072, B:42:0x0076, B:46:0x0093, B:48:0x0097, B:61:0x00c9, B:63:0x00cf, B:65:0x00d5, B:74:0x00ed, B:76:0x00f5, B:78:0x00fc, B:79:0x0101, B:81:0x0105, B:83:0x010b, B:84:0x0114, B:86:0x011c, B:88:0x0120, B:90:0x0131, B:91:0x013d, B:95:0x014a, B:97:0x014e, B:99:0x015a, B:100:0x0162, B:101:0x019e, B:103:0x01a4, B:105:0x01ae, B:107:0x01b2, B:109:0x01b6, B:111:0x01e7, B:113:0x01eb, B:115:0x01ef, B:116:0x0214, B:118:0x0218, B:120:0x021c, B:122:0x024f, B:124:0x0253, B:126:0x0257, B:129:0x0298, B:131:0x02a5, B:138:0x02e7, B:139:0x02f2, B:141:0x02f8, B:143:0x0300, B:145:0x0304, B:147:0x0308, B:148:0x032b, B:150:0x032f, B:152:0x0333, B:153:0x0356, B:155:0x035a, B:157:0x035e, B:158:0x0390, B:160:0x0394, B:162:0x0398, B:163:0x03ca, B:165:0x03d1, B:168:0x03dd, B:170:0x03e7, B:172:0x0402, B:174:0x0406, B:176:0x040d, B:178:0x0417, B:180:0x0421, B:171:0x03f9, B:182:0x0426, B:184:0x042a, B:186:0x0435, B:187:0x0447, B:189:0x044b, B:191:0x044f, B:193:0x0453, B:195:0x0457, B:199:0x0463, B:206:0x0478, B:200:0x0469, B:205:0x0473, B:207:0x047d, B:208:0x0486, B:133:0x02a9, B:134:0x02b6, B:136:0x02bc, B:137:0x02e2, B:68:0x00dc, B:70:0x00e2, B:43:0x007b, B:45:0x0092, B:44:0x0085, B:49:0x009e, B:51:0x00a7, B:53:0x00ad, B:55:0x00b1, B:58:0x00c1, B:60:0x00c5, B:57:0x00bd), top: B:273:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02f8 A[Catch: OutOfMemoryError -> 0x048a, TryCatch #0 {OutOfMemoryError -> 0x048a, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0012, B:9:0x0016, B:11:0x001a, B:13:0x001e, B:15:0x0024, B:16:0x0028, B:20:0x0034, B:24:0x0042, B:26:0x004a, B:28:0x0050, B:30:0x0059, B:31:0x005b, B:33:0x0061, B:36:0x0066, B:38:0x006c, B:40:0x0072, B:42:0x0076, B:46:0x0093, B:48:0x0097, B:61:0x00c9, B:63:0x00cf, B:65:0x00d5, B:74:0x00ed, B:76:0x00f5, B:78:0x00fc, B:79:0x0101, B:81:0x0105, B:83:0x010b, B:84:0x0114, B:86:0x011c, B:88:0x0120, B:90:0x0131, B:91:0x013d, B:95:0x014a, B:97:0x014e, B:99:0x015a, B:100:0x0162, B:101:0x019e, B:103:0x01a4, B:105:0x01ae, B:107:0x01b2, B:109:0x01b6, B:111:0x01e7, B:113:0x01eb, B:115:0x01ef, B:116:0x0214, B:118:0x0218, B:120:0x021c, B:122:0x024f, B:124:0x0253, B:126:0x0257, B:129:0x0298, B:131:0x02a5, B:138:0x02e7, B:139:0x02f2, B:141:0x02f8, B:143:0x0300, B:145:0x0304, B:147:0x0308, B:148:0x032b, B:150:0x032f, B:152:0x0333, B:153:0x0356, B:155:0x035a, B:157:0x035e, B:158:0x0390, B:160:0x0394, B:162:0x0398, B:163:0x03ca, B:165:0x03d1, B:168:0x03dd, B:170:0x03e7, B:172:0x0402, B:174:0x0406, B:176:0x040d, B:178:0x0417, B:180:0x0421, B:171:0x03f9, B:182:0x0426, B:184:0x042a, B:186:0x0435, B:187:0x0447, B:189:0x044b, B:191:0x044f, B:193:0x0453, B:195:0x0457, B:199:0x0463, B:206:0x0478, B:200:0x0469, B:205:0x0473, B:207:0x047d, B:208:0x0486, B:133:0x02a9, B:134:0x02b6, B:136:0x02bc, B:137:0x02e2, B:68:0x00dc, B:70:0x00e2, B:43:0x007b, B:45:0x0092, B:44:0x0085, B:49:0x009e, B:51:0x00a7, B:53:0x00ad, B:55:0x00b1, B:58:0x00c1, B:60:0x00c5, B:57:0x00bd), top: B:273:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03d1 A[Catch: OutOfMemoryError -> 0x048a, TryCatch #0 {OutOfMemoryError -> 0x048a, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0012, B:9:0x0016, B:11:0x001a, B:13:0x001e, B:15:0x0024, B:16:0x0028, B:20:0x0034, B:24:0x0042, B:26:0x004a, B:28:0x0050, B:30:0x0059, B:31:0x005b, B:33:0x0061, B:36:0x0066, B:38:0x006c, B:40:0x0072, B:42:0x0076, B:46:0x0093, B:48:0x0097, B:61:0x00c9, B:63:0x00cf, B:65:0x00d5, B:74:0x00ed, B:76:0x00f5, B:78:0x00fc, B:79:0x0101, B:81:0x0105, B:83:0x010b, B:84:0x0114, B:86:0x011c, B:88:0x0120, B:90:0x0131, B:91:0x013d, B:95:0x014a, B:97:0x014e, B:99:0x015a, B:100:0x0162, B:101:0x019e, B:103:0x01a4, B:105:0x01ae, B:107:0x01b2, B:109:0x01b6, B:111:0x01e7, B:113:0x01eb, B:115:0x01ef, B:116:0x0214, B:118:0x0218, B:120:0x021c, B:122:0x024f, B:124:0x0253, B:126:0x0257, B:129:0x0298, B:131:0x02a5, B:138:0x02e7, B:139:0x02f2, B:141:0x02f8, B:143:0x0300, B:145:0x0304, B:147:0x0308, B:148:0x032b, B:150:0x032f, B:152:0x0333, B:153:0x0356, B:155:0x035a, B:157:0x035e, B:158:0x0390, B:160:0x0394, B:162:0x0398, B:163:0x03ca, B:165:0x03d1, B:168:0x03dd, B:170:0x03e7, B:172:0x0402, B:174:0x0406, B:176:0x040d, B:178:0x0417, B:180:0x0421, B:171:0x03f9, B:182:0x0426, B:184:0x042a, B:186:0x0435, B:187:0x0447, B:189:0x044b, B:191:0x044f, B:193:0x0453, B:195:0x0457, B:199:0x0463, B:206:0x0478, B:200:0x0469, B:205:0x0473, B:207:0x047d, B:208:0x0486, B:133:0x02a9, B:134:0x02b6, B:136:0x02bc, B:137:0x02e2, B:68:0x00dc, B:70:0x00e2, B:43:0x007b, B:45:0x0092, B:44:0x0085, B:49:0x009e, B:51:0x00a7, B:53:0x00ad, B:55:0x00b1, B:58:0x00c1, B:60:0x00c5, B:57:0x00bd), top: B:273:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0426 A[Catch: OutOfMemoryError -> 0x048a, TryCatch #0 {OutOfMemoryError -> 0x048a, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0012, B:9:0x0016, B:11:0x001a, B:13:0x001e, B:15:0x0024, B:16:0x0028, B:20:0x0034, B:24:0x0042, B:26:0x004a, B:28:0x0050, B:30:0x0059, B:31:0x005b, B:33:0x0061, B:36:0x0066, B:38:0x006c, B:40:0x0072, B:42:0x0076, B:46:0x0093, B:48:0x0097, B:61:0x00c9, B:63:0x00cf, B:65:0x00d5, B:74:0x00ed, B:76:0x00f5, B:78:0x00fc, B:79:0x0101, B:81:0x0105, B:83:0x010b, B:84:0x0114, B:86:0x011c, B:88:0x0120, B:90:0x0131, B:91:0x013d, B:95:0x014a, B:97:0x014e, B:99:0x015a, B:100:0x0162, B:101:0x019e, B:103:0x01a4, B:105:0x01ae, B:107:0x01b2, B:109:0x01b6, B:111:0x01e7, B:113:0x01eb, B:115:0x01ef, B:116:0x0214, B:118:0x0218, B:120:0x021c, B:122:0x024f, B:124:0x0253, B:126:0x0257, B:129:0x0298, B:131:0x02a5, B:138:0x02e7, B:139:0x02f2, B:141:0x02f8, B:143:0x0300, B:145:0x0304, B:147:0x0308, B:148:0x032b, B:150:0x032f, B:152:0x0333, B:153:0x0356, B:155:0x035a, B:157:0x035e, B:158:0x0390, B:160:0x0394, B:162:0x0398, B:163:0x03ca, B:165:0x03d1, B:168:0x03dd, B:170:0x03e7, B:172:0x0402, B:174:0x0406, B:176:0x040d, B:178:0x0417, B:180:0x0421, B:171:0x03f9, B:182:0x0426, B:184:0x042a, B:186:0x0435, B:187:0x0447, B:189:0x044b, B:191:0x044f, B:193:0x0453, B:195:0x0457, B:199:0x0463, B:206:0x0478, B:200:0x0469, B:205:0x0473, B:207:0x047d, B:208:0x0486, B:133:0x02a9, B:134:0x02b6, B:136:0x02bc, B:137:0x02e2, B:68:0x00dc, B:70:0x00e2, B:43:0x007b, B:45:0x0092, B:44:0x0085, B:49:0x009e, B:51:0x00a7, B:53:0x00ad, B:55:0x00b1, B:58:0x00c1, B:60:0x00c5, B:57:0x00bd), top: B:273:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0435 A[Catch: OutOfMemoryError -> 0x048a, TryCatch #0 {OutOfMemoryError -> 0x048a, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0012, B:9:0x0016, B:11:0x001a, B:13:0x001e, B:15:0x0024, B:16:0x0028, B:20:0x0034, B:24:0x0042, B:26:0x004a, B:28:0x0050, B:30:0x0059, B:31:0x005b, B:33:0x0061, B:36:0x0066, B:38:0x006c, B:40:0x0072, B:42:0x0076, B:46:0x0093, B:48:0x0097, B:61:0x00c9, B:63:0x00cf, B:65:0x00d5, B:74:0x00ed, B:76:0x00f5, B:78:0x00fc, B:79:0x0101, B:81:0x0105, B:83:0x010b, B:84:0x0114, B:86:0x011c, B:88:0x0120, B:90:0x0131, B:91:0x013d, B:95:0x014a, B:97:0x014e, B:99:0x015a, B:100:0x0162, B:101:0x019e, B:103:0x01a4, B:105:0x01ae, B:107:0x01b2, B:109:0x01b6, B:111:0x01e7, B:113:0x01eb, B:115:0x01ef, B:116:0x0214, B:118:0x0218, B:120:0x021c, B:122:0x024f, B:124:0x0253, B:126:0x0257, B:129:0x0298, B:131:0x02a5, B:138:0x02e7, B:139:0x02f2, B:141:0x02f8, B:143:0x0300, B:145:0x0304, B:147:0x0308, B:148:0x032b, B:150:0x032f, B:152:0x0333, B:153:0x0356, B:155:0x035a, B:157:0x035e, B:158:0x0390, B:160:0x0394, B:162:0x0398, B:163:0x03ca, B:165:0x03d1, B:168:0x03dd, B:170:0x03e7, B:172:0x0402, B:174:0x0406, B:176:0x040d, B:178:0x0417, B:180:0x0421, B:171:0x03f9, B:182:0x0426, B:184:0x042a, B:186:0x0435, B:187:0x0447, B:189:0x044b, B:191:0x044f, B:193:0x0453, B:195:0x0457, B:199:0x0463, B:206:0x0478, B:200:0x0469, B:205:0x0473, B:207:0x047d, B:208:0x0486, B:133:0x02a9, B:134:0x02b6, B:136:0x02bc, B:137:0x02e2, B:68:0x00dc, B:70:0x00e2, B:43:0x007b, B:45:0x0092, B:44:0x0085, B:49:0x009e, B:51:0x00a7, B:53:0x00ad, B:55:0x00b1, B:58:0x00c1, B:60:0x00c5, B:57:0x00bd), top: B:273:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x044b A[Catch: OutOfMemoryError -> 0x048a, TryCatch #0 {OutOfMemoryError -> 0x048a, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0012, B:9:0x0016, B:11:0x001a, B:13:0x001e, B:15:0x0024, B:16:0x0028, B:20:0x0034, B:24:0x0042, B:26:0x004a, B:28:0x0050, B:30:0x0059, B:31:0x005b, B:33:0x0061, B:36:0x0066, B:38:0x006c, B:40:0x0072, B:42:0x0076, B:46:0x0093, B:48:0x0097, B:61:0x00c9, B:63:0x00cf, B:65:0x00d5, B:74:0x00ed, B:76:0x00f5, B:78:0x00fc, B:79:0x0101, B:81:0x0105, B:83:0x010b, B:84:0x0114, B:86:0x011c, B:88:0x0120, B:90:0x0131, B:91:0x013d, B:95:0x014a, B:97:0x014e, B:99:0x015a, B:100:0x0162, B:101:0x019e, B:103:0x01a4, B:105:0x01ae, B:107:0x01b2, B:109:0x01b6, B:111:0x01e7, B:113:0x01eb, B:115:0x01ef, B:116:0x0214, B:118:0x0218, B:120:0x021c, B:122:0x024f, B:124:0x0253, B:126:0x0257, B:129:0x0298, B:131:0x02a5, B:138:0x02e7, B:139:0x02f2, B:141:0x02f8, B:143:0x0300, B:145:0x0304, B:147:0x0308, B:148:0x032b, B:150:0x032f, B:152:0x0333, B:153:0x0356, B:155:0x035a, B:157:0x035e, B:158:0x0390, B:160:0x0394, B:162:0x0398, B:163:0x03ca, B:165:0x03d1, B:168:0x03dd, B:170:0x03e7, B:172:0x0402, B:174:0x0406, B:176:0x040d, B:178:0x0417, B:180:0x0421, B:171:0x03f9, B:182:0x0426, B:184:0x042a, B:186:0x0435, B:187:0x0447, B:189:0x044b, B:191:0x044f, B:193:0x0453, B:195:0x0457, B:199:0x0463, B:206:0x0478, B:200:0x0469, B:205:0x0473, B:207:0x047d, B:208:0x0486, B:133:0x02a9, B:134:0x02b6, B:136:0x02bc, B:137:0x02e2, B:68:0x00dc, B:70:0x00e2, B:43:0x007b, B:45:0x0092, B:44:0x0085, B:49:0x009e, B:51:0x00a7, B:53:0x00ad, B:55:0x00b1, B:58:0x00c1, B:60:0x00c5, B:57:0x00bd), top: B:273:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x047d A[Catch: OutOfMemoryError -> 0x048a, TryCatch #0 {OutOfMemoryError -> 0x048a, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0012, B:9:0x0016, B:11:0x001a, B:13:0x001e, B:15:0x0024, B:16:0x0028, B:20:0x0034, B:24:0x0042, B:26:0x004a, B:28:0x0050, B:30:0x0059, B:31:0x005b, B:33:0x0061, B:36:0x0066, B:38:0x006c, B:40:0x0072, B:42:0x0076, B:46:0x0093, B:48:0x0097, B:61:0x00c9, B:63:0x00cf, B:65:0x00d5, B:74:0x00ed, B:76:0x00f5, B:78:0x00fc, B:79:0x0101, B:81:0x0105, B:83:0x010b, B:84:0x0114, B:86:0x011c, B:88:0x0120, B:90:0x0131, B:91:0x013d, B:95:0x014a, B:97:0x014e, B:99:0x015a, B:100:0x0162, B:101:0x019e, B:103:0x01a4, B:105:0x01ae, B:107:0x01b2, B:109:0x01b6, B:111:0x01e7, B:113:0x01eb, B:115:0x01ef, B:116:0x0214, B:118:0x0218, B:120:0x021c, B:122:0x024f, B:124:0x0253, B:126:0x0257, B:129:0x0298, B:131:0x02a5, B:138:0x02e7, B:139:0x02f2, B:141:0x02f8, B:143:0x0300, B:145:0x0304, B:147:0x0308, B:148:0x032b, B:150:0x032f, B:152:0x0333, B:153:0x0356, B:155:0x035a, B:157:0x035e, B:158:0x0390, B:160:0x0394, B:162:0x0398, B:163:0x03ca, B:165:0x03d1, B:168:0x03dd, B:170:0x03e7, B:172:0x0402, B:174:0x0406, B:176:0x040d, B:178:0x0417, B:180:0x0421, B:171:0x03f9, B:182:0x0426, B:184:0x042a, B:186:0x0435, B:187:0x0447, B:189:0x044b, B:191:0x044f, B:193:0x0453, B:195:0x0457, B:199:0x0463, B:206:0x0478, B:200:0x0469, B:205:0x0473, B:207:0x047d, B:208:0x0486, B:133:0x02a9, B:134:0x02b6, B:136:0x02bc, B:137:0x02e2, B:68:0x00dc, B:70:0x00e2, B:43:0x007b, B:45:0x0092, B:44:0x0085, B:49:0x009e, B:51:0x00a7, B:53:0x00ad, B:55:0x00b1, B:58:0x00c1, B:60:0x00c5, B:57:0x00bd), top: B:273:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0097 A[Catch: OutOfMemoryError -> 0x048a, TryCatch #0 {OutOfMemoryError -> 0x048a, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0012, B:9:0x0016, B:11:0x001a, B:13:0x001e, B:15:0x0024, B:16:0x0028, B:20:0x0034, B:24:0x0042, B:26:0x004a, B:28:0x0050, B:30:0x0059, B:31:0x005b, B:33:0x0061, B:36:0x0066, B:38:0x006c, B:40:0x0072, B:42:0x0076, B:46:0x0093, B:48:0x0097, B:61:0x00c9, B:63:0x00cf, B:65:0x00d5, B:74:0x00ed, B:76:0x00f5, B:78:0x00fc, B:79:0x0101, B:81:0x0105, B:83:0x010b, B:84:0x0114, B:86:0x011c, B:88:0x0120, B:90:0x0131, B:91:0x013d, B:95:0x014a, B:97:0x014e, B:99:0x015a, B:100:0x0162, B:101:0x019e, B:103:0x01a4, B:105:0x01ae, B:107:0x01b2, B:109:0x01b6, B:111:0x01e7, B:113:0x01eb, B:115:0x01ef, B:116:0x0214, B:118:0x0218, B:120:0x021c, B:122:0x024f, B:124:0x0253, B:126:0x0257, B:129:0x0298, B:131:0x02a5, B:138:0x02e7, B:139:0x02f2, B:141:0x02f8, B:143:0x0300, B:145:0x0304, B:147:0x0308, B:148:0x032b, B:150:0x032f, B:152:0x0333, B:153:0x0356, B:155:0x035a, B:157:0x035e, B:158:0x0390, B:160:0x0394, B:162:0x0398, B:163:0x03ca, B:165:0x03d1, B:168:0x03dd, B:170:0x03e7, B:172:0x0402, B:174:0x0406, B:176:0x040d, B:178:0x0417, B:180:0x0421, B:171:0x03f9, B:182:0x0426, B:184:0x042a, B:186:0x0435, B:187:0x0447, B:189:0x044b, B:191:0x044f, B:193:0x0453, B:195:0x0457, B:199:0x0463, B:206:0x0478, B:200:0x0469, B:205:0x0473, B:207:0x047d, B:208:0x0486, B:133:0x02a9, B:134:0x02b6, B:136:0x02bc, B:137:0x02e2, B:68:0x00dc, B:70:0x00e2, B:43:0x007b, B:45:0x0092, B:44:0x0085, B:49:0x009e, B:51:0x00a7, B:53:0x00ad, B:55:0x00b1, B:58:0x00c1, B:60:0x00c5, B:57:0x00bd), top: B:273:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a7 A[Catch: OutOfMemoryError -> 0x048a, TryCatch #0 {OutOfMemoryError -> 0x048a, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0012, B:9:0x0016, B:11:0x001a, B:13:0x001e, B:15:0x0024, B:16:0x0028, B:20:0x0034, B:24:0x0042, B:26:0x004a, B:28:0x0050, B:30:0x0059, B:31:0x005b, B:33:0x0061, B:36:0x0066, B:38:0x006c, B:40:0x0072, B:42:0x0076, B:46:0x0093, B:48:0x0097, B:61:0x00c9, B:63:0x00cf, B:65:0x00d5, B:74:0x00ed, B:76:0x00f5, B:78:0x00fc, B:79:0x0101, B:81:0x0105, B:83:0x010b, B:84:0x0114, B:86:0x011c, B:88:0x0120, B:90:0x0131, B:91:0x013d, B:95:0x014a, B:97:0x014e, B:99:0x015a, B:100:0x0162, B:101:0x019e, B:103:0x01a4, B:105:0x01ae, B:107:0x01b2, B:109:0x01b6, B:111:0x01e7, B:113:0x01eb, B:115:0x01ef, B:116:0x0214, B:118:0x0218, B:120:0x021c, B:122:0x024f, B:124:0x0253, B:126:0x0257, B:129:0x0298, B:131:0x02a5, B:138:0x02e7, B:139:0x02f2, B:141:0x02f8, B:143:0x0300, B:145:0x0304, B:147:0x0308, B:148:0x032b, B:150:0x032f, B:152:0x0333, B:153:0x0356, B:155:0x035a, B:157:0x035e, B:158:0x0390, B:160:0x0394, B:162:0x0398, B:163:0x03ca, B:165:0x03d1, B:168:0x03dd, B:170:0x03e7, B:172:0x0402, B:174:0x0406, B:176:0x040d, B:178:0x0417, B:180:0x0421, B:171:0x03f9, B:182:0x0426, B:184:0x042a, B:186:0x0435, B:187:0x0447, B:189:0x044b, B:191:0x044f, B:193:0x0453, B:195:0x0457, B:199:0x0463, B:206:0x0478, B:200:0x0469, B:205:0x0473, B:207:0x047d, B:208:0x0486, B:133:0x02a9, B:134:0x02b6, B:136:0x02bc, B:137:0x02e2, B:68:0x00dc, B:70:0x00e2, B:43:0x007b, B:45:0x0092, B:44:0x0085, B:49:0x009e, B:51:0x00a7, B:53:0x00ad, B:55:0x00b1, B:58:0x00c1, B:60:0x00c5, B:57:0x00bd), top: B:273:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bd A[Catch: OutOfMemoryError -> 0x048a, TryCatch #0 {OutOfMemoryError -> 0x048a, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0012, B:9:0x0016, B:11:0x001a, B:13:0x001e, B:15:0x0024, B:16:0x0028, B:20:0x0034, B:24:0x0042, B:26:0x004a, B:28:0x0050, B:30:0x0059, B:31:0x005b, B:33:0x0061, B:36:0x0066, B:38:0x006c, B:40:0x0072, B:42:0x0076, B:46:0x0093, B:48:0x0097, B:61:0x00c9, B:63:0x00cf, B:65:0x00d5, B:74:0x00ed, B:76:0x00f5, B:78:0x00fc, B:79:0x0101, B:81:0x0105, B:83:0x010b, B:84:0x0114, B:86:0x011c, B:88:0x0120, B:90:0x0131, B:91:0x013d, B:95:0x014a, B:97:0x014e, B:99:0x015a, B:100:0x0162, B:101:0x019e, B:103:0x01a4, B:105:0x01ae, B:107:0x01b2, B:109:0x01b6, B:111:0x01e7, B:113:0x01eb, B:115:0x01ef, B:116:0x0214, B:118:0x0218, B:120:0x021c, B:122:0x024f, B:124:0x0253, B:126:0x0257, B:129:0x0298, B:131:0x02a5, B:138:0x02e7, B:139:0x02f2, B:141:0x02f8, B:143:0x0300, B:145:0x0304, B:147:0x0308, B:148:0x032b, B:150:0x032f, B:152:0x0333, B:153:0x0356, B:155:0x035a, B:157:0x035e, B:158:0x0390, B:160:0x0394, B:162:0x0398, B:163:0x03ca, B:165:0x03d1, B:168:0x03dd, B:170:0x03e7, B:172:0x0402, B:174:0x0406, B:176:0x040d, B:178:0x0417, B:180:0x0421, B:171:0x03f9, B:182:0x0426, B:184:0x042a, B:186:0x0435, B:187:0x0447, B:189:0x044b, B:191:0x044f, B:193:0x0453, B:195:0x0457, B:199:0x0463, B:206:0x0478, B:200:0x0469, B:205:0x0473, B:207:0x047d, B:208:0x0486, B:133:0x02a9, B:134:0x02b6, B:136:0x02bc, B:137:0x02e2, B:68:0x00dc, B:70:0x00e2, B:43:0x007b, B:45:0x0092, B:44:0x0085, B:49:0x009e, B:51:0x00a7, B:53:0x00ad, B:55:0x00b1, B:58:0x00c1, B:60:0x00c5, B:57:0x00bd), top: B:273:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c5 A[Catch: OutOfMemoryError -> 0x048a, TryCatch #0 {OutOfMemoryError -> 0x048a, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0012, B:9:0x0016, B:11:0x001a, B:13:0x001e, B:15:0x0024, B:16:0x0028, B:20:0x0034, B:24:0x0042, B:26:0x004a, B:28:0x0050, B:30:0x0059, B:31:0x005b, B:33:0x0061, B:36:0x0066, B:38:0x006c, B:40:0x0072, B:42:0x0076, B:46:0x0093, B:48:0x0097, B:61:0x00c9, B:63:0x00cf, B:65:0x00d5, B:74:0x00ed, B:76:0x00f5, B:78:0x00fc, B:79:0x0101, B:81:0x0105, B:83:0x010b, B:84:0x0114, B:86:0x011c, B:88:0x0120, B:90:0x0131, B:91:0x013d, B:95:0x014a, B:97:0x014e, B:99:0x015a, B:100:0x0162, B:101:0x019e, B:103:0x01a4, B:105:0x01ae, B:107:0x01b2, B:109:0x01b6, B:111:0x01e7, B:113:0x01eb, B:115:0x01ef, B:116:0x0214, B:118:0x0218, B:120:0x021c, B:122:0x024f, B:124:0x0253, B:126:0x0257, B:129:0x0298, B:131:0x02a5, B:138:0x02e7, B:139:0x02f2, B:141:0x02f8, B:143:0x0300, B:145:0x0304, B:147:0x0308, B:148:0x032b, B:150:0x032f, B:152:0x0333, B:153:0x0356, B:155:0x035a, B:157:0x035e, B:158:0x0390, B:160:0x0394, B:162:0x0398, B:163:0x03ca, B:165:0x03d1, B:168:0x03dd, B:170:0x03e7, B:172:0x0402, B:174:0x0406, B:176:0x040d, B:178:0x0417, B:180:0x0421, B:171:0x03f9, B:182:0x0426, B:184:0x042a, B:186:0x0435, B:187:0x0447, B:189:0x044b, B:191:0x044f, B:193:0x0453, B:195:0x0457, B:199:0x0463, B:206:0x0478, B:200:0x0469, B:205:0x0473, B:207:0x047d, B:208:0x0486, B:133:0x02a9, B:134:0x02b6, B:136:0x02bc, B:137:0x02e2, B:68:0x00dc, B:70:0x00e2, B:43:0x007b, B:45:0x0092, B:44:0x0085, B:49:0x009e, B:51:0x00a7, B:53:0x00ad, B:55:0x00b1, B:58:0x00c1, B:60:0x00c5, B:57:0x00bd), top: B:273:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cf A[Catch: OutOfMemoryError -> 0x048a, TryCatch #0 {OutOfMemoryError -> 0x048a, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0012, B:9:0x0016, B:11:0x001a, B:13:0x001e, B:15:0x0024, B:16:0x0028, B:20:0x0034, B:24:0x0042, B:26:0x004a, B:28:0x0050, B:30:0x0059, B:31:0x005b, B:33:0x0061, B:36:0x0066, B:38:0x006c, B:40:0x0072, B:42:0x0076, B:46:0x0093, B:48:0x0097, B:61:0x00c9, B:63:0x00cf, B:65:0x00d5, B:74:0x00ed, B:76:0x00f5, B:78:0x00fc, B:79:0x0101, B:81:0x0105, B:83:0x010b, B:84:0x0114, B:86:0x011c, B:88:0x0120, B:90:0x0131, B:91:0x013d, B:95:0x014a, B:97:0x014e, B:99:0x015a, B:100:0x0162, B:101:0x019e, B:103:0x01a4, B:105:0x01ae, B:107:0x01b2, B:109:0x01b6, B:111:0x01e7, B:113:0x01eb, B:115:0x01ef, B:116:0x0214, B:118:0x0218, B:120:0x021c, B:122:0x024f, B:124:0x0253, B:126:0x0257, B:129:0x0298, B:131:0x02a5, B:138:0x02e7, B:139:0x02f2, B:141:0x02f8, B:143:0x0300, B:145:0x0304, B:147:0x0308, B:148:0x032b, B:150:0x032f, B:152:0x0333, B:153:0x0356, B:155:0x035a, B:157:0x035e, B:158:0x0390, B:160:0x0394, B:162:0x0398, B:163:0x03ca, B:165:0x03d1, B:168:0x03dd, B:170:0x03e7, B:172:0x0402, B:174:0x0406, B:176:0x040d, B:178:0x0417, B:180:0x0421, B:171:0x03f9, B:182:0x0426, B:184:0x042a, B:186:0x0435, B:187:0x0447, B:189:0x044b, B:191:0x044f, B:193:0x0453, B:195:0x0457, B:199:0x0463, B:206:0x0478, B:200:0x0469, B:205:0x0473, B:207:0x047d, B:208:0x0486, B:133:0x02a9, B:134:0x02b6, B:136:0x02bc, B:137:0x02e2, B:68:0x00dc, B:70:0x00e2, B:43:0x007b, B:45:0x0092, B:44:0x0085, B:49:0x009e, B:51:0x00a7, B:53:0x00ad, B:55:0x00b1, B:58:0x00c1, B:60:0x00c5, B:57:0x00bd), top: B:273:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00dc A[Catch: OutOfMemoryError -> 0x048a, TryCatch #0 {OutOfMemoryError -> 0x048a, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0012, B:9:0x0016, B:11:0x001a, B:13:0x001e, B:15:0x0024, B:16:0x0028, B:20:0x0034, B:24:0x0042, B:26:0x004a, B:28:0x0050, B:30:0x0059, B:31:0x005b, B:33:0x0061, B:36:0x0066, B:38:0x006c, B:40:0x0072, B:42:0x0076, B:46:0x0093, B:48:0x0097, B:61:0x00c9, B:63:0x00cf, B:65:0x00d5, B:74:0x00ed, B:76:0x00f5, B:78:0x00fc, B:79:0x0101, B:81:0x0105, B:83:0x010b, B:84:0x0114, B:86:0x011c, B:88:0x0120, B:90:0x0131, B:91:0x013d, B:95:0x014a, B:97:0x014e, B:99:0x015a, B:100:0x0162, B:101:0x019e, B:103:0x01a4, B:105:0x01ae, B:107:0x01b2, B:109:0x01b6, B:111:0x01e7, B:113:0x01eb, B:115:0x01ef, B:116:0x0214, B:118:0x0218, B:120:0x021c, B:122:0x024f, B:124:0x0253, B:126:0x0257, B:129:0x0298, B:131:0x02a5, B:138:0x02e7, B:139:0x02f2, B:141:0x02f8, B:143:0x0300, B:145:0x0304, B:147:0x0308, B:148:0x032b, B:150:0x032f, B:152:0x0333, B:153:0x0356, B:155:0x035a, B:157:0x035e, B:158:0x0390, B:160:0x0394, B:162:0x0398, B:163:0x03ca, B:165:0x03d1, B:168:0x03dd, B:170:0x03e7, B:172:0x0402, B:174:0x0406, B:176:0x040d, B:178:0x0417, B:180:0x0421, B:171:0x03f9, B:182:0x0426, B:184:0x042a, B:186:0x0435, B:187:0x0447, B:189:0x044b, B:191:0x044f, B:193:0x0453, B:195:0x0457, B:199:0x0463, B:206:0x0478, B:200:0x0469, B:205:0x0473, B:207:0x047d, B:208:0x0486, B:133:0x02a9, B:134:0x02b6, B:136:0x02bc, B:137:0x02e2, B:68:0x00dc, B:70:0x00e2, B:43:0x007b, B:45:0x0092, B:44:0x0085, B:49:0x009e, B:51:0x00a7, B:53:0x00ad, B:55:0x00b1, B:58:0x00c1, B:60:0x00c5, B:57:0x00bd), top: B:273:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f5 A[Catch: OutOfMemoryError -> 0x048a, TryCatch #0 {OutOfMemoryError -> 0x048a, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0012, B:9:0x0016, B:11:0x001a, B:13:0x001e, B:15:0x0024, B:16:0x0028, B:20:0x0034, B:24:0x0042, B:26:0x004a, B:28:0x0050, B:30:0x0059, B:31:0x005b, B:33:0x0061, B:36:0x0066, B:38:0x006c, B:40:0x0072, B:42:0x0076, B:46:0x0093, B:48:0x0097, B:61:0x00c9, B:63:0x00cf, B:65:0x00d5, B:74:0x00ed, B:76:0x00f5, B:78:0x00fc, B:79:0x0101, B:81:0x0105, B:83:0x010b, B:84:0x0114, B:86:0x011c, B:88:0x0120, B:90:0x0131, B:91:0x013d, B:95:0x014a, B:97:0x014e, B:99:0x015a, B:100:0x0162, B:101:0x019e, B:103:0x01a4, B:105:0x01ae, B:107:0x01b2, B:109:0x01b6, B:111:0x01e7, B:113:0x01eb, B:115:0x01ef, B:116:0x0214, B:118:0x0218, B:120:0x021c, B:122:0x024f, B:124:0x0253, B:126:0x0257, B:129:0x0298, B:131:0x02a5, B:138:0x02e7, B:139:0x02f2, B:141:0x02f8, B:143:0x0300, B:145:0x0304, B:147:0x0308, B:148:0x032b, B:150:0x032f, B:152:0x0333, B:153:0x0356, B:155:0x035a, B:157:0x035e, B:158:0x0390, B:160:0x0394, B:162:0x0398, B:163:0x03ca, B:165:0x03d1, B:168:0x03dd, B:170:0x03e7, B:172:0x0402, B:174:0x0406, B:176:0x040d, B:178:0x0417, B:180:0x0421, B:171:0x03f9, B:182:0x0426, B:184:0x042a, B:186:0x0435, B:187:0x0447, B:189:0x044b, B:191:0x044f, B:193:0x0453, B:195:0x0457, B:199:0x0463, B:206:0x0478, B:200:0x0469, B:205:0x0473, B:207:0x047d, B:208:0x0486, B:133:0x02a9, B:134:0x02b6, B:136:0x02bc, B:137:0x02e2, B:68:0x00dc, B:70:0x00e2, B:43:0x007b, B:45:0x0092, B:44:0x0085, B:49:0x009e, B:51:0x00a7, B:53:0x00ad, B:55:0x00b1, B:58:0x00c1, B:60:0x00c5, B:57:0x00bd), top: B:273:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0105 A[Catch: OutOfMemoryError -> 0x048a, TryCatch #0 {OutOfMemoryError -> 0x048a, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0012, B:9:0x0016, B:11:0x001a, B:13:0x001e, B:15:0x0024, B:16:0x0028, B:20:0x0034, B:24:0x0042, B:26:0x004a, B:28:0x0050, B:30:0x0059, B:31:0x005b, B:33:0x0061, B:36:0x0066, B:38:0x006c, B:40:0x0072, B:42:0x0076, B:46:0x0093, B:48:0x0097, B:61:0x00c9, B:63:0x00cf, B:65:0x00d5, B:74:0x00ed, B:76:0x00f5, B:78:0x00fc, B:79:0x0101, B:81:0x0105, B:83:0x010b, B:84:0x0114, B:86:0x011c, B:88:0x0120, B:90:0x0131, B:91:0x013d, B:95:0x014a, B:97:0x014e, B:99:0x015a, B:100:0x0162, B:101:0x019e, B:103:0x01a4, B:105:0x01ae, B:107:0x01b2, B:109:0x01b6, B:111:0x01e7, B:113:0x01eb, B:115:0x01ef, B:116:0x0214, B:118:0x0218, B:120:0x021c, B:122:0x024f, B:124:0x0253, B:126:0x0257, B:129:0x0298, B:131:0x02a5, B:138:0x02e7, B:139:0x02f2, B:141:0x02f8, B:143:0x0300, B:145:0x0304, B:147:0x0308, B:148:0x032b, B:150:0x032f, B:152:0x0333, B:153:0x0356, B:155:0x035a, B:157:0x035e, B:158:0x0390, B:160:0x0394, B:162:0x0398, B:163:0x03ca, B:165:0x03d1, B:168:0x03dd, B:170:0x03e7, B:172:0x0402, B:174:0x0406, B:176:0x040d, B:178:0x0417, B:180:0x0421, B:171:0x03f9, B:182:0x0426, B:184:0x042a, B:186:0x0435, B:187:0x0447, B:189:0x044b, B:191:0x044f, B:193:0x0453, B:195:0x0457, B:199:0x0463, B:206:0x0478, B:200:0x0469, B:205:0x0473, B:207:0x047d, B:208:0x0486, B:133:0x02a9, B:134:0x02b6, B:136:0x02bc, B:137:0x02e2, B:68:0x00dc, B:70:0x00e2, B:43:0x007b, B:45:0x0092, B:44:0x0085, B:49:0x009e, B:51:0x00a7, B:53:0x00ad, B:55:0x00b1, B:58:0x00c1, B:60:0x00c5, B:57:0x00bd), top: B:273:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014e A[Catch: OutOfMemoryError -> 0x048a, TryCatch #0 {OutOfMemoryError -> 0x048a, blocks: (B:3:0x0004, B:5:0x000a, B:7:0x0012, B:9:0x0016, B:11:0x001a, B:13:0x001e, B:15:0x0024, B:16:0x0028, B:20:0x0034, B:24:0x0042, B:26:0x004a, B:28:0x0050, B:30:0x0059, B:31:0x005b, B:33:0x0061, B:36:0x0066, B:38:0x006c, B:40:0x0072, B:42:0x0076, B:46:0x0093, B:48:0x0097, B:61:0x00c9, B:63:0x00cf, B:65:0x00d5, B:74:0x00ed, B:76:0x00f5, B:78:0x00fc, B:79:0x0101, B:81:0x0105, B:83:0x010b, B:84:0x0114, B:86:0x011c, B:88:0x0120, B:90:0x0131, B:91:0x013d, B:95:0x014a, B:97:0x014e, B:99:0x015a, B:100:0x0162, B:101:0x019e, B:103:0x01a4, B:105:0x01ae, B:107:0x01b2, B:109:0x01b6, B:111:0x01e7, B:113:0x01eb, B:115:0x01ef, B:116:0x0214, B:118:0x0218, B:120:0x021c, B:122:0x024f, B:124:0x0253, B:126:0x0257, B:129:0x0298, B:131:0x02a5, B:138:0x02e7, B:139:0x02f2, B:141:0x02f8, B:143:0x0300, B:145:0x0304, B:147:0x0308, B:148:0x032b, B:150:0x032f, B:152:0x0333, B:153:0x0356, B:155:0x035a, B:157:0x035e, B:158:0x0390, B:160:0x0394, B:162:0x0398, B:163:0x03ca, B:165:0x03d1, B:168:0x03dd, B:170:0x03e7, B:172:0x0402, B:174:0x0406, B:176:0x040d, B:178:0x0417, B:180:0x0421, B:171:0x03f9, B:182:0x0426, B:184:0x042a, B:186:0x0435, B:187:0x0447, B:189:0x044b, B:191:0x044f, B:193:0x0453, B:195:0x0457, B:199:0x0463, B:206:0x0478, B:200:0x0469, B:205:0x0473, B:207:0x047d, B:208:0x0486, B:133:0x02a9, B:134:0x02b6, B:136:0x02bc, B:137:0x02e2, B:68:0x00dc, B:70:0x00e2, B:43:0x007b, B:45:0x0092, B:44:0x0085, B:49:0x009e, B:51:0x00a7, B:53:0x00ad, B:55:0x00b1, B:58:0x00c1, B:60:0x00c5, B:57:0x00bd), top: B:273:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(boolean r23) {
        /*
            Method dump skipped, instructions count: 1750
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.pdfeditor.ReaderView.A(boolean):void");
    }

    public final View D(int i10, boolean z10) {
        for (Map.Entry<ij.d, View> entry : this.f21384d.entrySet()) {
            if (entry.getKey().f18534b == i10) {
                if (z10) {
                    entry.getKey().f18533a = true;
                }
                return entry.getValue();
            }
        }
        return null;
    }

    public final View E(int i10) {
        View D = D(i10, true);
        if (D != null) {
            return D;
        }
        View view = this.f21379a.getView(i10, getCacheView(), this);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        addViewInLayout(view, 0, layoutParams, true);
        this.f21384d.put(new ij.d(i10), view);
        P(view);
        S(view, i10);
        Y(view, Float.valueOf(this.f21392h));
        if (view instanceof PageView) {
            ((PageView) view).setOnPageOperateListener(this.K);
        }
        return view;
    }

    public final float G(int i10) {
        float f10;
        if (f21378z0) {
            ArrayList<Float> arrayList = this.A;
            if (!arrayList.isEmpty() && i10 < arrayList.size()) {
                return arrayList.get(i10).floatValue();
            }
            f10 = this.G;
        } else {
            ArrayList<Float> arrayList2 = this.B;
            if (!arrayList2.isEmpty() && i10 < arrayList2.size()) {
                return arrayList2.get(i10).floatValue();
            }
            f10 = this.F;
        }
        return f10 * i10;
    }

    public final Rect H(View view) {
        if (view.getLeft() == 0 && view.getTop() == 0 && view.getTop() == 0 && view.getBottom() == 0) {
            return new Rect(0, 0, 0, 0);
        }
        int left = view.getLeft() + this.f21394i;
        int top = view.getTop() + this.f21396j;
        int measuredWidth = view.getMeasuredWidth() + view.getLeft() + this.f21394i;
        int measuredHeight = view.getMeasuredHeight() + view.getTop() + this.f21396j;
        if ((measuredWidth - left) / this.f21392h < getWidth() && B0) {
            float f10 = (left + measuredWidth) / 2;
            measuredWidth = (int) (((getWidth() / 2) * this.f21392h) + f10);
            left = (int) (f10 - ((getWidth() / 2) * this.f21392h));
        }
        if ((measuredHeight - top) / this.f21392h < getHeight() && B0) {
            float f11 = (top + measuredHeight) / 2;
            top = (int) (f11 - ((getHeight() / 2) * this.f21392h));
            measuredHeight = (int) (((getHeight() / 2) * this.f21392h) + f11);
        }
        int width = getWidth() - measuredWidth;
        int i10 = -left;
        int height = getHeight() - measuredHeight;
        int i11 = -top;
        if (width > i10) {
            width = (width + i10) / 2;
            i10 = width;
        }
        if (height > i11) {
            height = (height + i11) / 2;
            i11 = height;
        }
        return new Rect(width, height, i10, i11);
    }

    public final Rect I(View view, int i10, int i11, int i12, int i13) {
        int max;
        int max2;
        if (view.getMeasuredWidth() == 0 && view.getMeasuredHeight() == 0) {
            return new Rect(0, 0, 0, 0);
        }
        if (B0) {
            if (f21378z0) {
                if (view.getMeasuredWidth() > getWidth()) {
                    if (i10 > 0) {
                        i12 -= i10;
                        i10 = 0;
                    }
                    if (i12 < getWidth()) {
                        i10 += getWidth() - i12;
                        i12 = getWidth();
                    }
                } else {
                    int width = (getWidth() - view.getMeasuredWidth()) / 2;
                    if (i10 != width) {
                        i12 += width - i10;
                        i10 = width;
                    }
                }
                if (this.f21381b == 0) {
                    long j10 = this.L;
                    if (j10 > 0 && ((float) j10) * this.f21392h < getHeight()) {
                        i11 = (int) ((getHeight() - (((float) this.L) * this.f21392h)) / 2.0f);
                        i13 = view.getMeasuredHeight() + i11;
                    } else if (i11 > 0) {
                        i13 -= i11;
                        i11 = 0;
                    }
                }
                if (this.f21381b == this.f21379a.getCount() - 1) {
                    long j11 = this.L;
                    if (j11 > 0 && ((float) j11) * this.f21392h < getHeight()) {
                        i13 = (int) (((((float) this.L) * this.f21392h) + getHeight()) / 2.0f);
                        i11 = i13 - view.getMeasuredHeight();
                    } else {
                        int height = getHeight();
                        if (i13 < height) {
                            i11 += height - i13;
                            i13 = height;
                        }
                    }
                }
            } else {
                if (view.getMeasuredHeight() > getHeight()) {
                    if (i11 > 0) {
                        i13 -= i11;
                        i11 = 0;
                    }
                    if (i13 < getHeight()) {
                        i11 += getHeight() - i13;
                        i13 = getHeight();
                    }
                } else {
                    int height2 = (getHeight() - view.getMeasuredHeight()) / 2;
                    if (i11 != height2) {
                        i13 += height2 - i11;
                        i11 = height2;
                    }
                }
                if (this.f21381b == 0) {
                    long j12 = this.M;
                    if (j12 > 0 && ((float) j12) * this.f21392h < getWidth()) {
                        i10 = (int) ((getWidth() - (((float) this.M) * this.f21392h)) / 2.0f);
                        i12 = view.getMeasuredWidth() + i10;
                    } else if (i10 > 0) {
                        i12 -= i10;
                        i10 = 0;
                    }
                }
                if (this.f21381b == this.f21379a.getCount() - 1) {
                    long j13 = this.M;
                    if (j13 > 0 && ((float) j13) * this.f21392h < getWidth()) {
                        i12 = (int) (((((float) this.M) * this.f21392h) + getWidth()) / 2.0f);
                        i10 = i12 - view.getMeasuredWidth();
                    } else {
                        int width2 = getWidth();
                        if (i12 < width2) {
                            i10 += width2 - i12;
                            i12 = width2;
                        }
                    }
                }
            }
        } else {
            if (f21378z0) {
                if (view.getMeasuredWidth() > getWidth()) {
                    if (i10 > 0) {
                        i12 -= i10;
                        i10 = 0;
                    }
                    if (i12 < getWidth()) {
                        i10 += getWidth() - i12;
                        i12 = getWidth();
                    }
                } else {
                    int width3 = (getWidth() - view.getMeasuredWidth()) / 2;
                    if (i10 != width3) {
                        i12 += width3 - i10;
                        i10 = width3;
                    }
                }
                if ((this.f21381b == 0 || this.H || this.I) && (i11 > (max2 = Math.max((getHeight() - view.getMeasuredHeight()) / 2, 0)) || this.H || (this.I && max2 > 0))) {
                    i13 -= i11 - max2;
                    i11 = max2;
                }
                if (this.f21381b == this.f21379a.getCount() - 1) {
                    int min = Math.min((view.getMeasuredHeight() + getHeight()) / 2, getHeight());
                    if (i13 < min) {
                        i11 = (min - i13) + i11;
                        i13 = min;
                    }
                }
            } else {
                if (view.getMeasuredHeight() > getHeight()) {
                    if (i11 > 0) {
                        i13 -= i11;
                        i11 = 0;
                    }
                    if (i13 < getHeight()) {
                        i11 += getHeight() - i13;
                        i13 = getHeight();
                    }
                } else {
                    int height3 = (getHeight() - view.getMeasuredHeight()) / 2;
                    if (i11 != height3) {
                        i13 += height3 - i11;
                        i11 = height3;
                    }
                }
                if ((this.f21381b == 0 || this.H || this.I) && (i10 > (max = Math.max((getWidth() - view.getMeasuredWidth()) / 2, 0)) || this.H || (this.I && max > 0))) {
                    i12 -= i10 - max;
                    i10 = max;
                }
                if (this.f21381b == this.f21379a.getCount() - 1) {
                    int min2 = Math.min((view.getMeasuredWidth() + getWidth()) / 2, getWidth());
                    if (i12 < min2) {
                        i10 = (min2 - i12) + i10;
                        i12 = min2;
                    }
                }
            }
            this.H = false;
            this.I = false;
        }
        return new Rect(i10, i11, i12, i13);
    }

    public final ij.g J(int i10) {
        int measuredWidth;
        int left;
        int width;
        float f10;
        View D = D(i10, false);
        if (D != null) {
            float G = G(i10);
            if (f21378z0) {
                measuredWidth = D.getMeasuredHeight();
                left = D.getTop();
            } else {
                measuredWidth = D.getMeasuredWidth();
                left = D.getLeft();
            }
            int i11 = i10 + 1;
            if (i11 < this.f21379a.getCount()) {
                f10 = G(i11);
            } else {
                if (f21378z0) {
                    width = getHeight();
                } else {
                    width = getWidth();
                }
                f10 = width;
            }
            float f11 = measuredWidth - (f10 - G);
            float f12 = G - left;
            if (i10 != 0) {
                int i12 = this.C;
                f11 += i12;
                f12 += i12;
            }
            return new ij.g(f12, f11);
        }
        return new ij.g(0.0f, 1.0f);
    }

    public final View K(float f10, float f11) {
        View value;
        for (Map.Entry<ij.d, View> entry : this.f21384d.entrySet()) {
            if (entry.getKey().f18533a && (value = entry.getValue()) != null && f10 > value.getLeft() && f10 < value.getRight() && f11 > value.getTop() && f11 < value.getBottom()) {
                return value;
            }
        }
        return getDisplayedView();
    }

    public final void L(Context context) {
        this.f21402m = new GestureDetector(this);
        this.f21404n = new ng.b(context, this);
        this.f21402m.setIsLongpressEnabled(false);
        this.f21406o = new Scroller(context);
        this.f21408p = new r0(this, this);
        this.f21407o0 = context.getResources().getConfiguration().orientation;
        this.C = context.getResources().getDimensionPixelSize(R.dimen.dp_4);
        this.D = context.getResources().getDimensionPixelSize(R.dimen.dp_50);
        og.a aVar = new og.a();
        this.O = aVar;
        aVar.f23056a = this;
        C0 = context.getResources().getDisplayMetrics().densityDpi;
        this.P = context.getResources().getDimensionPixelSize(R.dimen.dp_60);
        this.E = context.getResources().getDimensionPixelSize(R.dimen.dp_20);
        getViewTreeObserver().addOnGlobalLayoutListener(new a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
        if ((((float) r4) * r6.f21392h) < getHeight()) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean M() {
        /*
            r6 = this;
            boolean r0 = lib.zj.pdfeditor.ReaderView.B0
            r1 = 0
            if (r0 == 0) goto L36
            boolean r0 = lib.zj.pdfeditor.ReaderView.f21378z0
            r2 = 0
            if (r0 == 0) goto L1e
            long r4 = r6.L
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1e
            float r0 = (float) r4
            float r4 = r6.f21392h
            float r0 = r0 * r4
            int r4 = r6.getHeight()
            float r4 = (float) r4
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L35
        L1e:
            boolean r0 = lib.zj.pdfeditor.ReaderView.f21378z0
            if (r0 != 0) goto L36
            long r4 = r6.M
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L36
            float r0 = (float) r4
            float r2 = r6.f21392h
            float r0 = r0 * r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L36
        L35:
            r1 = 1
        L36:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.pdfeditor.ReaderView.M():boolean");
    }

    public final boolean N() {
        Adapter adapter;
        if (M() || (adapter = this.f21379a) == null || adapter.getCount() <= 1) {
            return false;
        }
        return true;
    }

    public final void O() {
        for (Map.Entry<ij.d, View> entry : this.f21384d.entrySet()) {
            entry.getKey().f18533a = false;
        }
    }

    public final void P(View view) {
        int height;
        if (i.a.f21508a.f21507d && (view instanceof PageView)) {
            int width = ((int) (getWidth() * this.f21392h)) | 1073741824;
            PageView pageView = (PageView) view;
            if (pageView.getReflowHeight() > 0) {
                height = pageView.getReflowHeight();
            } else {
                height = getHeight();
            }
            view.measure(width, 1073741824 | ((int) (height * this.f21392h)));
        } else {
            view.measure(0, 0);
            view.measure(((int) (view.getMeasuredWidth() * this.f21392h)) | 1073741824, 1073741824 | ((int) (view.getMeasuredHeight() * this.f21392h)));
        }
        Y(view, Float.valueOf(this.f21392h));
    }

    public boolean Q() {
        return false;
    }

    public boolean R() {
        return false;
    }

    public void W(int i10) {
        Adapter adapter = this.f21379a;
        if (adapter instanceof PDFPageAdapter) {
            ((PDFPageAdapter) adapter).onMoveToChild(i10);
        }
    }

    public final void X() {
        for (Map.Entry<ij.d, View> entry : this.f21384d.entrySet()) {
            if (entry.getKey().f18533a) {
                View value = entry.getValue();
                if (value instanceof PDFPageView) {
                    PDFPageView pDFPageView = (PDFPageView) value;
                    Iterator it = pDFPageView.B.iterator();
                    while (it.hasNext()) {
                        PDFFreeTextEditView pDFFreeTextEditView = (PDFFreeTextEditView) it.next();
                        if (pDFFreeTextEditView.getVisibility() != 8) {
                            pDFFreeTextEditView.setVisibility(0);
                        }
                    }
                    ViewParent parent = pDFPageView.getParent();
                    if (parent instanceof PDFReaderView) {
                        PDFReaderView pDFReaderView = (PDFReaderView) parent;
                        pDFReaderView.getScale();
                        if (!pDFReaderView.E1 && pDFReaderView.J0 != null && Float.compare(1.0f, pDFReaderView.getScale()) == 0) {
                            pDFReaderView.V0();
                            Annotation annotation = pDFReaderView.K0;
                            if (annotation != null) {
                                pDFReaderView.J0.x1(pDFReaderView.L0, annotation);
                            } else {
                                RectF rectF = pDFReaderView.P0;
                                if (rectF != null) {
                                    pDFReaderView.J0.setItemSelectBox(rectF);
                                } else {
                                    PageView pageView = pDFReaderView.J0;
                                    if (pageView.f21309w != null || pageView.f21313y != null) {
                                        pageView.q1();
                                    }
                                }
                            }
                        }
                        pDFReaderView.F1 = false;
                    }
                }
            }
        }
    }

    public void b(ng.b bVar) {
        boolean z10;
        int i10;
        boolean z11 = false;
        this.f21390g = false;
        lib.zj.pdfeditor.i iVar = i.a.f21508a;
        if (iVar.f21507d) {
            this.f21401l0 = false;
            this.f21392h = 1.0f;
            this.R = true;
            if (this.f21426y && (i10 = iVar.c) < 5) {
                iVar.c = i10 + 1;
                iVar.a();
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f21427z) {
                int i11 = iVar.c;
                if (i11 > 0) {
                    iVar.c = i11 - 1;
                    iVar.a();
                    z11 = true;
                }
                z10 = z11;
            }
            if (z10) {
                post(new y0(this, 18));
                return;
            }
            return;
        }
        X();
        b0();
    }

    public final void b0() {
        if (this.f21420v) {
            return;
        }
        post(new e());
    }

    public final void c0(View view) {
        post(new f(view));
    }

    public final void d0() {
        for (Map.Entry<ij.d, View> entry : this.f21384d.entrySet()) {
            if (entry.getKey().f18533a) {
                View value = entry.getValue();
                if (value instanceof PDFPageView) {
                    ((PDFPageView) value).setDisplayMode(A0);
                }
            }
        }
        ArrayList<WeakReference<View>> arrayList = this.f21386e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            View view = arrayList.get(size).get();
            if (view instanceof PDFPageView) {
                ((PDFPageView) view).setDisplayMode(A0);
            }
        }
    }

    public void e(ng.b bVar) {
        this.f21390g = true;
        this.f21399k0 = false;
        this.f21396j = 0;
        this.f21394i = 0;
        this.f21416t = -1.0f;
        this.f21414s = -1.0f;
        for (Map.Entry<ij.d, View> entry : this.f21384d.entrySet()) {
            if (entry.getKey().f18533a) {
                View value = entry.getValue();
                if (value instanceof PDFPageView) {
                    Iterator it = ((PDFPageView) value).B.iterator();
                    while (it.hasNext()) {
                        PDFFreeTextEditView pDFFreeTextEditView = (PDFFreeTextEditView) it.next();
                        if (pDFFreeTextEditView.getVisibility() != 8) {
                            pDFFreeTextEditView.setVisibility(4);
                        }
                    }
                }
            }
        }
        this.f21426y = false;
        this.f21427z = false;
        this.f21401l0 = false;
    }

    public final void e0(boolean z10) {
        PageView pageView = (PageView) getDisplayedView();
        boolean z11 = this.f21413r0;
        HashMap<ij.d, View> hashMap = this.f21384d;
        if (z11) {
            if (pageView != null) {
                pageView.H1(z10);
            }
            for (Map.Entry<ij.d, View> entry : hashMap.entrySet()) {
                if (entry.getKey().f18533a) {
                    View value = entry.getValue();
                    if (value instanceof PDFPageView) {
                        PDFPageView pDFPageView = (PDFPageView) value;
                        if (this.f21381b != pDFPageView.getPage()) {
                            pDFPageView.H1(z10);
                        }
                    }
                }
            }
            return;
        }
        if (pageView != null) {
            pageView.h1();
        }
        for (Map.Entry<ij.d, View> entry2 : hashMap.entrySet()) {
            if (entry2.getKey().f18533a) {
                View value2 = entry2.getValue();
                if (value2 instanceof PDFPageView) {
                    PDFPageView pDFPageView2 = (PDFPageView) value2;
                    if (this.f21381b != pDFPageView2.getPage()) {
                        pDFPageView2.h1();
                    }
                }
            }
        }
    }

    public final void f() {
        nj.b.a();
        pg.a.c().a().getClass();
        aj.b.K("abortTask");
        for (Map.Entry<ij.d, View> entry : this.f21384d.entrySet()) {
            if (entry.getKey().f18533a) {
                View value = entry.getValue();
                if (value instanceof PDFPageView) {
                    ((PDFPageView) value).K0();
                }
            }
        }
        Iterator<WeakReference<View>> it = this.f21386e.iterator();
        while (it.hasNext()) {
            View view = it.next().get();
            if (view instanceof PDFPageView) {
                ((PDFPageView) view).K0();
            }
        }
    }

    public final void f0() {
        FitMode fitMode;
        View D;
        Adapter adapter = this.f21379a;
        if (adapter instanceof PDFPageAdapter) {
            boolean z10 = true;
            if (!B0) {
                fitMode = FitMode.ANY;
                int count = adapter.getCount() - 1;
                int i10 = this.f21381b;
                if (count == i10 && (D = D(i10, false)) != null) {
                    o0(D);
                }
            } else {
                fitMode = f21378z0 ? FitMode.WIDTH : this.f21407o0 == 1 ? FitMode.ANY : FitMode.HEIGHT;
            }
            if (fitMode == ((PDFPageAdapter) this.f21379a).getRepository().f21744d) {
                z10 = false;
            }
            if (z10) {
                z repository = ((PDFPageAdapter) this.f21379a).getRepository();
                synchronized (repository) {
                    repository.f21744d = fitMode;
                    SparseArray<ij.c> sparseArray = repository.f21742a;
                    int size = sparseArray.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        ij.c valueAt = sparseArray.valueAt(i11);
                        if (valueAt != null) {
                            repository.a(valueAt);
                        }
                    }
                }
                j0();
                h0();
                i0();
            }
        }
    }

    public final void g(u0 u0Var) {
        for (Map.Entry<ij.d, View> entry : this.f21384d.entrySet()) {
            if (entry.getKey().f18533a) {
                u0Var.e(entry.getValue());
            }
        }
    }

    public final void g0() {
        for (Map.Entry<ij.d, View> entry : this.f21384d.entrySet()) {
            if (entry.getKey().f18533a) {
                S(entry.getValue(), entry.getKey().f18534b);
            }
        }
    }

    @Override // android.widget.AdapterView
    public Adapter getAdapter() {
        return this.f21379a;
    }

    public HashMap<ij.d, View> getAllCacheViews() {
        return this.f21384d;
    }

    public View getCurEditPage() {
        return getDisplayedView();
    }

    public g getDeleteAnnotation() {
        return this.f21417t0;
    }

    public View getDisplayedView() {
        return D(this.f21381b, false);
    }

    public int getDisplayedViewIndex() {
        return this.f21381b;
    }

    public View getFocusView() {
        return D(this.f21381b, false);
    }

    public int getPageCount() {
        Adapter adapter = this.f21379a;
        if (adapter == null) {
            return 0;
        }
        return adapter.getCount();
    }

    public float getScale() {
        return this.f21392h;
    }

    @Override // android.widget.AdapterView
    public View getSelectedView() {
        return null;
    }

    public final void h0() {
        ij.c cVar;
        Adapter adapter = this.f21379a;
        if ((adapter instanceof PDFPageAdapter) && adapter.getCount() <= 20) {
            SparseArray<ij.c> sparseArray = ((PDFPageAdapter) this.f21379a).getRepository().f21742a;
            int size = sparseArray.size();
            long j10 = 0;
            this.M = 0L;
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                ij.c valueAt = sparseArray.valueAt(i11);
                if (valueAt != null) {
                    i10 += valueAt.f18531d;
                }
            }
            if (size == 1) {
                this.M = i10;
            } else {
                this.M = ((size - 1) * this.C) + i10;
            }
            if (i10 == 0) {
                this.F = getWidth() / this.f21379a.getCount();
                return;
            }
            ArrayList<Float> arrayList = this.B;
            arrayList.clear();
            for (int i12 = 0; i12 < size; i12++) {
                if (sparseArray.get(i12) != null) {
                    arrayList.add(Float.valueOf((((float) j10) / i10) * getWidth()));
                    j10 += cVar.f18531d;
                }
            }
        }
    }

    public final void i0() {
        Adapter adapter;
        ij.c b10;
        for (Map.Entry<ij.d, View> entry : this.f21384d.entrySet()) {
            PageView pageView = (PageView) entry.getValue();
            if (pageView != null && (adapter = this.f21379a) != null && (adapter instanceof PDFPageAdapter) && (b10 = ((PDFPageAdapter) adapter).getRepository().b(entry.getKey().f18534b)) != null) {
                pageView.C1(new Point(b10.f18531d, b10.f18532e), b10.c, this.f21420v);
                P(pageView);
            }
        }
    }

    public final void j() {
        Iterator<Map.Entry<ij.d, View>> it = this.f21384d.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<ij.d, View> next = it.next();
            if (!next.getKey().f18533a) {
                View value = next.getValue();
                removeViewInLayout(value);
                ArrayList<WeakReference<View>> arrayList = this.f21386e;
                if (arrayList.size() < 100) {
                    ((PageView) value).G1();
                    arrayList.add(new WeakReference<>(value));
                }
                it.remove();
            }
        }
    }

    public final void j0() {
        ij.c cVar;
        Adapter adapter = this.f21379a;
        if ((adapter instanceof PDFPageAdapter) && adapter.getCount() <= 20) {
            SparseArray<ij.c> sparseArray = ((PDFPageAdapter) this.f21379a).getRepository().f21742a;
            int size = sparseArray.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                ij.c valueAt = sparseArray.valueAt(i11);
                if (valueAt != null) {
                    i10 += valueAt.f18532e;
                }
            }
            if (size == 1) {
                this.L = i10;
            } else {
                this.L = ((size - 1) * this.C) + i10;
            }
            if (i10 == 0) {
                this.G = getHeight() / this.f21379a.getCount();
                return;
            }
            ArrayList<Float> arrayList = this.A;
            arrayList.clear();
            long j10 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                if (sparseArray.get(i12) != null) {
                    arrayList.add(Float.valueOf((((float) j10) / i10) * getHeight()));
                    j10 += cVar.f18532e;
                }
            }
        }
    }

    public final void k0(int i10, boolean z10) {
        if (i10 >= 0 && i10 < this.f21379a.getCount()) {
            Scroller scroller = this.f21406o;
            if (scroller != null && !scroller.isFinished()) {
                this.f21406o.forceFinished(true);
            }
            this.V = z10;
            V();
            o(i10);
            this.c = true;
            requestLayout();
        }
    }

    public final void l0(ReaderPDFCore readerPDFCore, boolean z10) {
        Adapter adapter = this.f21379a;
        if (adapter instanceof PDFPageAdapter) {
            ((PDFPageAdapter) adapter).setNewCore(readerPDFCore);
        }
        HashMap<ij.d, View> hashMap = this.f21384d;
        for (Map.Entry<ij.d, View> entry : hashMap.entrySet()) {
            if (entry.getKey().f18533a) {
                View value = entry.getValue();
                if (value instanceof PDFPageView) {
                    ((PDFPageView) value).setNewCore(readerPDFCore);
                }
            }
        }
        Iterator<WeakReference<View>> it = this.f21386e.iterator();
        while (it.hasNext()) {
            View view = it.next().get();
            if (view instanceof PDFPageView) {
                ((PDFPageView) view).setNewCore(readerPDFCore);
            }
        }
        if (z10) {
            for (Map.Entry<ij.d, View> entry2 : hashMap.entrySet()) {
                if (entry2.getKey().f18533a) {
                    View value2 = entry2.getValue();
                    if (value2 instanceof PageView) {
                        PageView pageView = (PageView) value2;
                        pageView.D1(false);
                        if (pageView.f21283j == null) {
                            c0 c0Var = new c0(pageView);
                            pageView.f21283j = c0Var;
                            c0Var.c(new Void[0]);
                        }
                        pageView.R1();
                        pageView.W1(true, true);
                    }
                }
            }
        }
    }

    public final void m(View view) {
        Point p02 = p0(view);
        boolean z10 = f21377y0;
        if (z10 && !B0) {
            if (this.f21394i < 0) {
                if (view.getMeasuredWidth() + view.getLeft() + p02.x + this.f21394i <= getWidth() / 2.0f && this.f21381b + 1 < this.f21379a.getCount()) {
                    c0(view);
                    this.f21408p.a();
                    V();
                    o(this.f21381b + 1);
                    return;
                }
                return;
            } else if ((view.getLeft() - p02.x) + this.f21394i >= getWidth() / 2.0f && this.f21381b > 0) {
                c0(view);
                this.f21408p.a();
                V();
                o(this.f21381b - 1);
                return;
            } else {
                return;
            }
        }
        boolean z11 = f21378z0;
        if (z11 && !B0) {
            if (this.f21396j < 0) {
                if (view.getBottom() + p02.y + this.f21396j <= getHeight() / 2.0f && this.f21381b + 1 < this.f21379a.getCount()) {
                    c0(view);
                    this.f21408p.a();
                    V();
                    o(this.f21381b + 1);
                }
            } else if ((view.getTop() - p02.y) + this.f21396j >= getHeight() / 2.0f && this.f21381b > 0 && this.f21396j > 0) {
                c0(view);
                this.f21408p.a();
                V();
                o(this.f21381b - 1);
            }
        } else if (z10) {
            if (this.f21394i < 0) {
                if (this.f21381b + 1 < this.f21379a.getCount()) {
                    if (view.getRight() - this.f21394i <= G(this.f21381b + 1)) {
                        c0(view);
                        this.f21408p.a();
                        V();
                        o(this.f21381b + 1);
                        return;
                    }
                    return;
                }
                return;
            }
            int i10 = this.f21381b;
            if (i10 > 0) {
                if (view.getLeft() + this.f21394i >= G(i10)) {
                    c0(view);
                    this.f21408p.a();
                    V();
                    o(this.f21381b - 1);
                }
            }
        } else if (z11) {
            if (this.f21396j < 0) {
                if (this.f21381b + 1 < this.f21379a.getCount()) {
                    if (view.getBottom() - this.f21396j <= G(this.f21381b + 1)) {
                        c0(view);
                        this.f21408p.a();
                        V();
                        o(this.f21381b + 1);
                        return;
                    }
                    return;
                }
                return;
            }
            int i11 = this.f21381b;
            if (i11 > 0) {
                if (view.getTop() + this.f21396j >= G(i11)) {
                    c0(view);
                    this.f21408p.a();
                    V();
                    o(this.f21381b - 1);
                }
            }
        }
    }

    public final boolean m0(boolean z10) {
        boolean z11 = false;
        for (Map.Entry<ij.d, View> entry : this.f21384d.entrySet()) {
            if (entry.getKey().f18533a) {
                View value = entry.getValue();
                if ((value instanceof PDFPageView) && ((PDFPageView) value).n2(z10)) {
                    z11 = true;
                }
            }
        }
        return z11;
    }

    public final void n0(float f10, boolean z10) {
        int i10;
        if (this.f21379a == null) {
            return;
        }
        qg.e eVar = this.f21380a0;
        if (eVar != null) {
            eVar.c();
        }
        this.V = z10;
        h hVar = this.f21415s0;
        if (hVar != null) {
            hVar.a(!z10);
        }
        int floor = (int) Math.floor(f10);
        if (B0) {
            int i11 = this.f21381b;
            if (floor <= i11 + 1 && floor >= i11 - 1) {
                float f11 = f10 - floor;
                if (f11 == 0.0f) {
                    if (floor == this.f21379a.getCount()) {
                        floor--;
                    }
                    k0(floor, z10);
                    return;
                } else if (D(floor, false) != null) {
                    ij.g J = J(floor);
                    float f12 = (J.f18544b - f11) * J.f18543a;
                    if (f21378z0) {
                        this.f21396j = (int) f12;
                    } else {
                        this.f21394i = (int) f12;
                    }
                    requestLayout();
                    return;
                } else {
                    k0(floor, z10);
                    return;
                }
            }
        }
        if (floor >= 0 && floor < this.f21379a.getCount()) {
            k0(floor, z10);
        } else if (floor == this.f21379a.getCount() && this.f21381b != floor - 1) {
            k0(i10, z10);
        }
    }

    public final void o(int i10) {
        qg.e eVar;
        if (this.f21381b != i10 && (eVar = this.f21380a0) != null) {
            eVar.b(i10);
        }
        this.f21381b = i10;
        W(i10);
    }

    public final void o0(View view) {
        Rect H = H(view);
        Point point = new Point(Math.min(Math.max(0, H.left), H.right), Math.min(Math.max(0, H.top), H.bottom));
        this.f21412r = 0;
        this.f21410q = 0;
        if (this.f21379a.getCount() > 2) {
            int i10 = point.x;
            if ((i10 != 0 && f21377y0) || (f21378z0 && point.y != 0)) {
                this.f21406o.startScroll(0, 0, i10, point.y, 400);
                this.f21408p.a();
                return;
            }
            return;
        }
        int i11 = point.x;
        if (i11 != 0 || point.y != 0) {
            this.f21406o.startScroll(0, 0, i11, point.y, 400);
            this.f21408p.a();
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        this.f21382b0 = true;
        pg.a.c().a().getClass();
        aj.b.K("ReaderView onConfigurationChanged");
        int i10 = this.f21407o0;
        int i11 = configuration.orientation;
        if (i10 != i11) {
            this.f21407o0 = i11;
            f0();
            float f10 = this.f21392h;
            float f11 = this.N;
            if (f11 != 0.0f && f10 != f11) {
                this.f21392h = f11;
            }
            this.N = this.f21392h;
            this.c = true;
            this.f21405n0 = true;
            qg.d dVar = this.f21409p0;
            if (dVar != null) {
                ((ReaderPreviewActivity.k0) dVar).a();
            }
        }
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f21409p0 = null;
        this.K = null;
        nj.b.a();
        pg.a.c().a().getClass();
        aj.b.K("releaseTasks");
        for (Map.Entry<ij.d, View> entry : this.f21384d.entrySet()) {
            if (entry.getKey().f18533a) {
                View value = entry.getValue();
                if (value instanceof PDFPageView) {
                    ((PDFPageView) value).G1();
                }
            }
        }
        Iterator<WeakReference<View>> it = this.f21386e.iterator();
        while (it.hasNext()) {
            View view = it.next().get();
            if (view instanceof PDFPageView) {
                ((PDFPageView) view).G1();
            }
        }
        pj.a aVar = a.C0362a.f28967a;
        if (aVar.c == null) {
            aVar.c = new LinkedBlockingQueue<>();
        }
        LinkedBlockingQueue<Runnable> linkedBlockingQueue = aVar.c;
        ThreadPoolExecutor threadPoolExecutor = aVar.f28965a;
        linkedBlockingQueue.addAll(threadPoolExecutor.getQueue());
        threadPoolExecutor.getQueue().clear();
        Iterator<Runnable> it2 = aVar.c.iterator();
        while (it2.hasNext()) {
            Runnable next = it2.next();
            if (next instanceof qj.a) {
                qj.a aVar2 = (qj.a) next;
                aVar2.f29357a.set(true);
                aVar2.a();
            }
        }
        aVar.c.clear();
        aVar.f28966b.removeCallbacksAndMessages(null);
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        boolean z10;
        lib.zj.pdfeditor.i iVar = i.a.f21508a;
        boolean z11 = false;
        if (iVar.f21507d) {
            int a10 = a.C0318a.f23099a.a(this.f21381b);
            if (a10 > 1) {
                int i10 = iVar.c;
                if (i10 < 5) {
                    iVar.c = i10 + 1;
                    iVar.a();
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    iVar.c = 0;
                    iVar.a();
                }
                e0(false);
            }
            qg.f fVar = this.f21411q0;
            if (fVar != null) {
                if (a10 > 1) {
                    z11 = true;
                }
                ReaderPreviewActivity.h0 h0Var = (ReaderPreviewActivity.h0) fVar;
                if (!z11) {
                    ExecutorService executorService = ReaderPreviewActivity.U5;
                    ReaderPreviewActivity.this.F4();
                }
            }
            return true;
        }
        float f10 = this.f21392h;
        float f11 = 1.0f;
        if (f10 >= 1.0f && f10 < 1.8f) {
            f11 = 1.8f;
        } else if (f10 >= 1.8f && f10 < 4.0f) {
            f11 = 4.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        j jVar = new j(motionEvent.getX(), motionEvent.getY());
        ofFloat.addUpdateListener(jVar);
        ofFloat.addListener(jVar);
        ofFloat.setDuration(350L);
        ofFloat.start();
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onDown(MotionEvent motionEvent) {
        this.f21406o.forceFinished(true);
        this.f21422w = true;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x01c1, code lost:
        if (r3.bottom >= 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01cc, code lost:
        if (r3.top <= 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01d1, code lost:
        if (r3.right >= 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01d6, code lost:
        if (r3.left <= 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01d8, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01da, code lost:
        r5 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onFling(android.view.MotionEvent r22, android.view.MotionEvent r23, float r24, float r25) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.pdfeditor.ReaderView.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (getWidth() > 0 && getHeight() > 0 && getWidth() <= getContext().getResources().getDisplayMetrics().widthPixels * 3 && getHeight() <= getContext().getResources().getDisplayMetrics().heightPixels * 3) {
            A(z10);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            P(getChildAt(i12));
        }
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        View K;
        Rect rect;
        float f12;
        this.f21382b0 = false;
        if (this.f21390g || motionEvent2 == null || motionEvent == null || (K = K(motionEvent.getX(), motionEvent.getY())) == null || R()) {
            return true;
        }
        qg.e eVar = this.f21380a0;
        if (eVar != null) {
            eVar.a();
        }
        boolean Q = Q();
        b bVar = this.f21397j0;
        float f13 = 0.0f;
        if (Q) {
            getHitRect(new Rect());
            if (f21377y0 && (motionEvent2.getX() - 100.0f <= rect.left || motionEvent2.getX() + 100.0f >= rect.right)) {
                if (this.f21383c0) {
                    this.f21385d0 = true;
                    this.f21383c0 = false;
                    removeCallbacks(bVar);
                }
                return true;
            } else if (motionEvent2.getX() > rect.left + this.f21395i0 && motionEvent2.getX() < rect.right - this.f21395i0 && motionEvent2.getY() > rect.top + this.f21395i0 && motionEvent2.getY() < rect.bottom - this.f21395i0) {
                if (this.f21383c0) {
                    this.f21385d0 = true;
                    this.f21383c0 = false;
                    removeCallbacks(bVar);
                }
                return true;
            } else {
                if (motionEvent2.getX() < rect.left + this.f21395i0) {
                    f12 = -10.0f;
                } else if (motionEvent2.getX() > rect.right - this.f21395i0) {
                    f12 = 10.0f;
                } else {
                    f12 = 0.0f;
                }
                if (motionEvent2.getY() < rect.top + this.f21395i0) {
                    if (K.getTop() < 0) {
                        f13 = -10.0f;
                    }
                } else if (motionEvent2.getY() > rect.bottom - this.f21395i0 && getHeight() - K.getTop() <= K.getHeight()) {
                    f13 = 10.0f;
                }
                this.f21387e0 = f12;
                this.f21389f0 = f13;
                if ((motionEvent2.getX() < rect.left + this.f21395i0 || motionEvent2.getX() > rect.right - this.f21395i0 || motionEvent2.getY() < rect.top + this.f21395i0 || motionEvent2.getY() > rect.bottom - this.f21395i0) && !this.f21383c0) {
                    this.f21383c0 = true;
                    this.f21385d0 = false;
                    this.f21391g0 = K;
                    post(bVar);
                }
            }
        } else {
            if (this.f21383c0) {
                this.f21385d0 = true;
                this.f21383c0 = false;
                removeCallbacks(bVar);
            }
            this.f21394i = (int) (this.f21394i - f10);
            this.f21396j = (int) (this.f21396j - f11);
            if (B0) {
                long j10 = this.M;
                if (j10 > 0 && ((float) j10) * this.f21392h < getWidth()) {
                    this.f21394i = 0;
                }
                long j11 = this.L;
                if (j11 > 0 && ((float) j11) * this.f21392h < getHeight()) {
                    this.f21396j = 0;
                }
            } else {
                int max = Math.max((getWidth() - K.getMeasuredWidth()) / 2, 0);
                int min = Math.min((K.getMeasuredWidth() + getWidth()) / 2, getWidth());
                int max2 = Math.max((getHeight() - K.getMeasuredHeight()) / 2, 0);
                int min2 = Math.min((K.getMeasuredHeight() + getHeight()) / 2, getHeight());
                if (f21377y0) {
                    if (this.f21381b == 0 && K.getLeft() >= max && f10 < 0.0f) {
                        this.f21394i = 0;
                    } else if (this.f21381b == this.f21379a.getCount() - 1 && K.getRight() <= min && f10 > 0.0f) {
                        this.f21394i = 0;
                    }
                }
                if (f21378z0) {
                    if (this.f21381b == 0 && K.getTop() >= max2 && f11 < 0.0f) {
                        this.f21396j = 0;
                    } else if (this.f21381b == this.f21379a.getCount() - 1 && K.getBottom() <= min2 && f11 > 0.0f) {
                        this.f21396j = 0;
                    }
                }
            }
            requestLayout();
        }
        return true;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        boolean z10;
        ij.c b10;
        View displayedView;
        super.onSizeChanged(i10, i11, i12, i13);
        PageView.P1(getContext(), i10, i11);
        C0 = getContext().getResources().getDisplayMetrics().densityDpi;
        int i14 = 0;
        if (this.f21407o0 != getContext().getResources().getConfiguration().orientation) {
            this.f21407o0 = getContext().getResources().getConfiguration().orientation;
            this.c = true;
            this.f21405n0 = true;
            qg.d dVar = this.f21409p0;
            if (dVar != null) {
                ((ReaderPreviewActivity.k0) dVar).a();
            }
            z10 = true;
        } else {
            if (!this.f21419u0.isEmpty()) {
                this.f21421v0 = true;
            }
            z10 = false;
        }
        this.f21400l = 0;
        this.f21398k = 0;
        if (this.f21405n0 && this.c && (displayedView = getDisplayedView()) != null && i12 != 0) {
            float f10 = (i10 * 1.0f) / i12;
            this.f21400l = (int) (displayedView.getLeft() * f10);
            this.f21398k = (int) (f10 * displayedView.getTop());
        }
        Adapter adapter = this.f21379a;
        if (adapter instanceof PDFPageAdapter) {
            z repository = ((PDFPageAdapter) adapter).getRepository();
            synchronized (repository) {
                repository.f21743b = i10;
                repository.c = i11;
                SparseArray<ij.c> sparseArray = repository.f21742a;
                int size = sparseArray.size();
                for (int i15 = 0; i15 < size; i15++) {
                    ij.c valueAt = sparseArray.valueAt(i15);
                    if (valueAt != null) {
                        repository.a(valueAt);
                    }
                }
            }
        }
        Adapter adapter2 = this.f21379a;
        if (adapter2 != null && adapter2.getCount() > 20) {
            if (i10 != i12) {
                this.F = i10 / this.f21379a.getCount();
                this.B.clear();
            }
            if (i11 != i13) {
                this.G = i11 / this.f21379a.getCount();
                this.A.clear();
            }
        } else {
            h0();
            j0();
        }
        if (i10 != i12 || i11 != i13) {
            if (i.a.f21508a.f21507d && i10 != i12) {
                for (Map.Entry<ij.d, View> entry : this.f21384d.entrySet()) {
                    PageView pageView = (PageView) entry.getValue();
                    if (pageView != null) {
                        pageView.measure(i10 | 1073741824, 1073741824 | i11);
                        Adapter adapter3 = this.f21379a;
                        if (adapter3 != null && (adapter3 instanceof PDFPageAdapter) && (b10 = ((PDFPageAdapter) adapter3).getRepository().b(entry.getKey().f18534b)) != null) {
                            pageView.C1(new Point(b10.f18531d, b10.f18532e), b10.c, true);
                        }
                    }
                }
                e0(true);
            }
            if (!i.a.f21508a.f21507d) {
                View displayedView2 = getDisplayedView();
                if (displayedView2 != null) {
                    i14 = displayedView2.getMeasuredHeight();
                }
                i0();
                if (displayedView2 != null && displayedView2.getMeasuredHeight() != i14 && i14 != 0) {
                    this.J = true;
                    float measuredHeight = (displayedView2.getMeasuredHeight() * 1.0f) / i14;
                    this.f21400l = (int) (displayedView2.getLeft() * measuredHeight);
                    this.f21398k = (int) (measuredHeight * displayedView2.getTop());
                    if (!B0) {
                        if (displayedView2.getMeasuredWidth() + this.f21400l < i10) {
                            this.f21400l = i10 - displayedView2.getMeasuredWidth();
                        }
                        if (displayedView2.getMeasuredHeight() + this.f21398k < i11) {
                            this.f21398k = i11 - displayedView2.getMeasuredHeight();
                        }
                    }
                }
            }
        }
        if (z10) {
            this.H = true;
        } else {
            this.I = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
        if (r11 != false) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0266  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 805
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.pdfeditor.ReaderView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        View D;
        if (!M() && B0 && (D = D(this.f21379a.getCount() - 1, false)) != null) {
            if (f21378z0) {
                if (D.getBottom() < getHeight()) {
                    this.f21396j = getHeight() - D.getBottom();
                }
            } else if (D.getRight() < getWidth()) {
                this.f21394i = getWidth() - D.getRight();
            }
        }
    }

    public final Point p0(View view) {
        return new Point(Math.max((getWidth() - view.getMeasuredWidth()) / 2, 0), Math.max((getHeight() - view.getMeasuredHeight()) / 2, 0));
    }

    public final Point q0(View view, int i10) {
        return new Point(Math.max((getWidth() - view.getMeasuredWidth()) / 2, i10), Math.max((getHeight() - view.getMeasuredHeight()) / 2, i10));
    }

    public final Point r0(View view, int i10) {
        return new Point(Math.max((getWidth() - view.getMeasuredWidth()) / 2, i10), (getHeight() - view.getMeasuredHeight()) / 2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f21406o.isFinished()) {
            this.f21406o.computeScrollOffset();
            int currX = this.f21406o.getCurrX();
            int currY = this.f21406o.getCurrY();
            this.f21394i = (currX - this.f21410q) + this.f21394i;
            this.f21396j = (currY - this.f21412r) + this.f21396j;
            this.f21410q = currX;
            this.f21412r = currY;
            requestLayout();
            this.f21408p.a();
        } else if (!this.f21388f) {
            qg.e eVar = this.f21380a0;
            if (eVar != null) {
                eVar.e();
            }
            b0();
        }
    }

    public final Point s0(View view, int i10) {
        return new Point((getWidth() - view.getMeasuredWidth()) / 2, Math.max((getHeight() - view.getMeasuredHeight()) / 2, i10));
    }

    @Override // android.widget.AdapterView
    public void setAdapter(Adapter adapter) {
        this.f21379a = adapter;
        f0();
        Adapter adapter2 = this.f21379a;
        if (adapter2 instanceof PDFPageAdapter) {
            ((PDFPageAdapter) adapter2).setPageCallbacks(this.O);
            ((PDFPageAdapter) this.f21379a).loadAllPageSizeIfNeed(20, new d());
        }
    }

    public void setDeleteAnnotation(g gVar) {
        this.f21417t0 = gVar;
    }

    public void setDisplayedViewIndex(int i10) {
        k0(i10, true);
    }

    public void setListener(h hVar) {
        this.f21415s0 = hVar;
    }

    public void setNewCore(ReaderPDFCore readerPDFCore) {
        l0(readerPDFCore, false);
    }

    public void setOnPageOperateListener(qg.c cVar) {
        this.K = cVar;
    }

    public void setOnPageOrientationChangeListener(qg.d dVar) {
        this.f21409p0 = dVar;
    }

    public void setOnPageScrollListener(qg.e eVar) {
        this.f21380a0 = eVar;
    }

    public void setOnReflowStateChangeListener(qg.f fVar) {
        this.f21411q0 = fVar;
    }

    public void setOnScrollListener(i iVar) {
        this.W = iVar;
    }

    public void setReflow(boolean z10) {
        boolean z11;
        if (this.f21413r0 != z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f21413r0 = z10;
        lib.zj.pdfeditor.i iVar = i.a.f21508a;
        iVar.f21507d = z10;
        iVar.c = 1;
        this.Q = this.f21381b;
        this.T = 0;
        if (z10) {
            B0 = false;
            f21378z0 = true;
            f21377y0 = false;
        }
        this.f21392h = 1.0f;
        if (z11) {
            e0(true);
            this.c = true;
            requestLayout();
        }
    }

    @Override // android.widget.AdapterView
    public void setSelection(int i10) {
        throw new UnsupportedOperationException(getContext().getString(R.string.arg_res_0x7f1302d3));
    }

    public void setSkipLoad(boolean z10) {
        this.f21420v = z10;
    }

    public final Point t0(View view) {
        return new Point((getWidth() - view.getMeasuredWidth()) / 2, (getHeight() - view.getMeasuredHeight()) / 2);
    }

    public final void u0(boolean z10) {
        for (Map.Entry<ij.d, View> entry : this.f21384d.entrySet()) {
            if (entry.getKey().f18533a) {
                View value = entry.getValue();
                if (value instanceof PDFPageView) {
                    PDFPageView pDFPageView = (PDFPageView) value;
                    pDFPageView.G();
                    if (z10) {
                        pDFPageView.q1();
                    }
                }
            }
        }
    }

    public final void y() {
        for (Map.Entry<ij.d, View> entry : this.f21384d.entrySet()) {
            if (entry.getKey().f18533a) {
                View value = entry.getValue();
                if (value instanceof PDFPageView) {
                    PageView pageView = (PageView) value;
                    if (pageView.f21298q0 != null || pageView.f21300r0 != null) {
                        pageView.f21298q0 = null;
                        pageView.f21300r0 = null;
                        pageView.q1();
                    }
                }
            }
        }
    }

    public void T() {
    }

    public void U() {
    }

    public void V() {
    }

    /* loaded from: classes3.dex */
    public class j implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final float f21435a;

        /* renamed from: b  reason: collision with root package name */
        public final float f21436b;

        /* loaded from: classes3.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ReaderView.this.T();
            }
        }

        public j(float f10, float f11) {
            this.f21435a = f10;
            this.f21436b = f11;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ReaderView readerView = ReaderView.this;
            View D = readerView.D(readerView.f21381b, false);
            if (readerView.f21392h == 1.0f && !ReaderView.B0 && D != null) {
                readerView.o0(D);
            }
            readerView.b0();
            readerView.post(new a());
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            ReaderView.this.U();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ReaderView readerView = ReaderView.this;
            float f10 = readerView.f21392h;
            readerView.f21392h = floatValue;
            float f11 = floatValue / f10;
            View D = readerView.D(readerView.f21381b, false);
            if (D != null) {
                int left = ((int) this.f21435a) - (D.getLeft() + readerView.f21394i);
                int top = D.getTop();
                int i10 = readerView.f21396j;
                int i11 = ((int) this.f21436b) - (top + i10);
                float f12 = left;
                readerView.f21394i = (int) ((f12 - (f12 * f11)) + readerView.f21394i);
                float f13 = i11;
                readerView.f21396j = (int) ((f13 - (f11 * f13)) + i10);
                readerView.requestLayout();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }
    }

    public void Z(View view) {
    }

    public void a0(View view) {
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    public ReaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21384d = new HashMap<>();
        this.f21386e = new ArrayList<>();
        this.f21392h = 1.0f;
        this.f21426y = false;
        this.f21427z = false;
        this.A = new ArrayList<>();
        this.B = new ArrayList<>();
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0.0f;
        this.G = 0.0f;
        this.L = -1L;
        this.M = -1L;
        this.Q = 0;
        this.R = false;
        this.S = false;
        this.T = 0;
        this.U = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.V = true;
        this.f21382b0 = false;
        this.f21383c0 = false;
        this.f21385d0 = true;
        this.f21387e0 = 0.0f;
        this.f21389f0 = 0.0f;
        this.f21393h0 = 5;
        this.f21395i0 = 100;
        this.f21397j0 = new b();
        this.f21403m0 = false;
        this.f21405n0 = false;
        this.f21407o0 = 0;
        this.f21419u0 = new RectF();
        this.f21421v0 = false;
        this.f21423w0 = false;
        this.f21425x0 = -1;
        if (isInEditMode()) {
            this.f21402m = null;
            this.f21404n = null;
            this.f21406o = null;
            this.f21408p = null;
            return;
        }
        L(context);
    }

    public void S(View view, int i10) {
    }

    public void Y(View view, Float f10) {
    }

    public ReaderView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f21384d = new HashMap<>();
        this.f21386e = new ArrayList<>();
        this.f21392h = 1.0f;
        this.f21426y = false;
        this.f21427z = false;
        this.A = new ArrayList<>();
        this.B = new ArrayList<>();
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0.0f;
        this.G = 0.0f;
        this.L = -1L;
        this.M = -1L;
        this.Q = 0;
        this.R = false;
        this.S = false;
        this.T = 0;
        this.U = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.V = true;
        this.f21382b0 = false;
        this.f21383c0 = false;
        this.f21385d0 = true;
        this.f21387e0 = 0.0f;
        this.f21389f0 = 0.0f;
        this.f21393h0 = 5;
        this.f21395i0 = 100;
        this.f21397j0 = new b();
        this.f21403m0 = false;
        this.f21405n0 = false;
        this.f21407o0 = 0;
        this.f21419u0 = new RectF();
        this.f21421v0 = false;
        this.f21423w0 = false;
        this.f21425x0 = -1;
        L(context);
    }
}
