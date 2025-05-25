package pdf.pdfreader.viewer.editor.free.pdfview;

import am.a3;
import am.k2;
import am.z2;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Pair;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.libconvert.helper.NativeSoLoaderHelper;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ao.b2;
import ao.c2;
import ao.d2;
import ao.f2;
import ao.g2;
import ao.h2;
import ao.i2;
import ao.l2;
import com.airbnb.lottie.LottieAnimationView;
import com.lib.flutter.encrypt.EngineHelper;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import eightbitlab.com.blurview.BlurView;
import fn.c;
import gn.b;
import hj.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import jl.a;
import lib.zj.office.fc.hslf.record.SlideAtom;
import lib.zj.pdfeditor.Annotation;
import lib.zj.pdfeditor.AsyncTask;
import lib.zj.pdfeditor.Hit;
import lib.zj.pdfeditor.PDFAlert;
import lib.zj.pdfeditor.PDFPageAdapter;
import lib.zj.pdfeditor.PDFPageView;
import lib.zj.pdfeditor.PDFReaderView;
import lib.zj.pdfeditor.PDFReflowAdapter;
import lib.zj.pdfeditor.PageView;
import lib.zj.pdfeditor.ReaderPDFCore;
import lib.zj.pdfeditor.ReaderView;
import lib.zj.pdfeditor.i;
import lib.zj.pdfeditor.model.AnalyticsEvent;
import lib.zj.pdfeditor.p0;
import lib.zj.pdfeditor.scroll.PDFScrollHandle;
import lib.zj.pdfeditor.text.editor.EditorView;
import lib.zj.pdfeditor.text.editor.TextEditorAction;
import lib.zj.pdfeditor.text.editor.TextEditorState;
import lib.zj.reflow.ReflowLoadingView;
import lj.b;
import lm.e;
import oj.a;
import org.greenrobot.eventbus.ThreadMode;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.AppOpenManager;
import pdf.pdfreader.viewer.editor.free.ads.FullScreenManage;
import pdf.pdfreader.viewer.editor.free.ads.a;
import pdf.pdfreader.viewer.editor.free.ads.anim.BannerLoadingAnimation;
import pdf.pdfreader.viewer.editor.free.bean.ColorType;
import pdf.pdfreader.viewer.editor.free.bean.PreviewGuideType;
import pdf.pdfreader.viewer.editor.free.bean.ThirdOpenBean;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.widget.PreviewCreateEditGuideView;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.dialog.ChooseConvertImageTypeDialog;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper.PDF2WordHelper;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.PreviewPDF2WordStateView;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.PreviewPageManageGuideView;
import pdf.pdfreader.viewer.editor.free.feature.pdf_editor.ui.dialog.EditorFreeSaveDialog;
import pdf.pdfreader.viewer.editor.free.feature.pdf_editor.ui.dialog.PreviewUseEditorGuideDialog;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.thumb.ThumbLoadCenter;
import pdf.pdfreader.viewer.editor.free.thumb.adapter.ThumbnailAdapter;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.OperateInterceptDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.OperatePdfFailedDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenClearDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenDefaultDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PreviewAddTextDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PreviewViewSettingsDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.e2;
import pdf.pdfreader.viewer.editor.free.ui.dialog.g3;
import pdf.pdfreader.viewer.editor.free.ui.dialog.i3;
import pdf.pdfreader.viewer.editor.free.ui.dialog.j2;
import pdf.pdfreader.viewer.editor.free.ui.dialog.o3;
import pdf.pdfreader.viewer.editor.free.ui.dialog.r2;
import pdf.pdfreader.viewer.editor.free.ui.dialog.t2;
import pdf.pdfreader.viewer.editor.free.ui.dialog.x2;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.ReaderDebugActivity;
import pdf.pdfreader.viewer.editor.free.ui.myview.InterceptRecyclerView;
import pdf.pdfreader.viewer.editor.free.ui.myview.InterceptTouchFrameLayout;
import pdf.pdfreader.viewer.editor.free.ui.widget.AddTextChangeColorBottomSheetView;
import pdf.pdfreader.viewer.editor.free.ui.widget.AddTextChangeSizeBottomSheetView;
import pdf.pdfreader.viewer.editor.free.ui.widget.AddTextColorView;
import pdf.pdfreader.viewer.editor.free.ui.widget.DrawSignView;
import pdf.pdfreader.viewer.editor.free.ui.widget.GraffitiIconView;
import pdf.pdfreader.viewer.editor.free.ui.widget.MagnifierContainer;
import pdf.pdfreader.viewer.editor.free.ui.widget.Pdf2WordProgress;
import pdf.pdfreader.viewer.editor.free.ui.widget.PdfReaderViewContainer;
import pdf.pdfreader.viewer.editor.free.ui.widget.PreviewEditGuideView;
import pdf.pdfreader.viewer.editor.free.ui.widget.ProgressView;
import pdf.pdfreader.viewer.editor.free.ui.widget.SignSizeBottomSheetView;
import pdf.pdfreader.viewer.editor.free.ui.widget.TextEditorChangeColorBottomSheetView;
import pdf.pdfreader.viewer.editor.free.ui.widget.h;
import pdf.pdfreader.viewer.editor.free.ui.widget.preview.GraffitiBottomSheetView;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.SignColorBottomSheetView;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.SignCreateView;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.SignatureImageView;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.data.SignAction;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.data.SignActionInfo;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.db.SignPathActionInfo;
import pdf.pdfreader.viewer.editor.free.utils.ReaderActBroadCastReceiver;
import pdf.pdfreader.viewer.editor.free.utils.event.AIEventCenter;
import pdf.pdfreader.viewer.editor.free.utils.event.AppCoreFilterEvent;
import pdf.pdfreader.viewer.editor.free.utils.event.AppOpenSource;
import pdf.pdfreader.viewer.editor.free.utils.event.ConvertEventCenter;
import pdf.pdfreader.viewer.editor.free.utils.event.EventCenter;
import pdf.pdfreader.viewer.editor.free.utils.event.PDF2WordEventCenter;
import pdf.pdfreader.viewer.editor.free.utils.g1;
import pdf.pdfreader.viewer.editor.free.utils.share.ThirdOpenParseManager;
import pdf.pdfreader.viewer.editor.free.utils.share.ThirdOpenStatus;
import x0.f0;
import xo.g;
import yo.c;

/* loaded from: classes3.dex */
public class ReaderPreviewActivity extends jl.a implements lib.zj.pdfeditor.d, View.OnClickListener, qg.i, g1.a, ReaderActBroadCastReceiver.a, qg.a, a.d, a.d, pdf.pdfreader.viewer.editor.free.fnbridge.b, pdf.pdfreader.viewer.editor.free.thumb.adapter.a, pdf.pdfreader.viewer.editor.free.ui.dialog.a, c.InterfaceC0423c {
    public static final ExecutorService U5;
    public PopupWindow A;
    public View A0;
    public AcceptMode A1;
    public TextView A3;
    public AnimatorSet A5;
    public AppCompatImageView B;
    public FrameLayout B0;
    public AppCompatImageView B1;
    public int B2;
    public TextView B3;
    public PopupWindow B5;
    public pdf.pdfreader.viewer.editor.free.utils.g1<ReaderPreviewActivity> C;
    public AppCompatImageView C0;
    public AppCompatImageView C1;
    public TextView C3;
    public pdf.pdfreader.viewer.editor.free.utils.f0 C4;
    public final ao.p C5;
    public AppCompatImageView D0;
    public EditText D1;
    public ThumbnailAdapter D2;
    public View D3;
    public View D5;
    public ReaderActBroadCastReceiver<ReaderPreviewActivity> E;
    public View E0;
    public l0 E1;
    public String E2;
    public View E3;
    public ValueAnimator E4;
    public View E5;
    public AppCompatImageView F;
    public View F0;
    public TextView F1;
    public boolean F2;
    public RelativeLayout F3;
    public View F5;
    public ImageView G;
    public AddTextColorView G0;
    public TextView G1;
    public MagnifierContainer G2;
    public RelativeLayout G3;
    public ObjectAnimator G4;
    public TextView G5;
    public ImageView H;
    public g3 H0;
    public AlertDialog.Builder H1;
    public FrameLayout H2;
    public RelativeLayout H3;
    public boolean H5;
    public ImageView I;
    public InterceptTouchFrameLayout I2;
    public RelativeLayout I3;
    public boolean I5;
    public boolean J;
    public PreviewUseEditorGuideDialog J0;
    public pdf.pdfreader.viewer.editor.free.feature.bridge.c J2;
    public LinearLayout J3;
    public PdfPreviewEntity J5;
    public int K;
    public AddTextColorView K0;
    public t0 K1;
    public RelativeLayout K3;
    public int K4;
    public ObjectAnimator K5;
    public View L0;
    public AlertDialog L1;
    public AddTextColorView L3;
    public boolean L5;
    public boolean M;
    public View M0;
    public Group M1;
    public StringBuilder M2;
    public GraffitiIconView M3;
    public b.InterfaceC0288b M4;
    public j2 M5;
    public boolean N;
    public View N0;
    public ViewStub N1;
    public Group N3;
    public b.a N4;
    public boolean N5;
    public FrameLayout O;
    public Bitmap O0;
    public ViewStub O1;
    public AppCompatImageView O3;
    public boolean O5;
    public RelativeLayout P;
    public ViewStub P1;
    public boolean P2;
    public AppCompatImageView P3;
    public OperateInterceptDialog P5;
    public Uri Q;
    public ViewStub Q1;
    public AppCompatImageView Q3;
    public OperatePdfFailedDialog Q5;
    public e2 R;
    public ViewStub R1;
    public RelativeLayout R3;
    public long R5;
    public pdf.pdfreader.viewer.editor.free.ui.dialog.g0 S;
    public ViewStub S1;
    public ImageView S3;
    public EditorFreeSaveDialog S5;
    public FrameLayout T;
    public ViewStub T1;
    public ProgressView T3;
    public final CopyOnWriteArraySet<String> T5;
    public InterceptTouchFrameLayout U;
    public ViewStub U1;
    public boolean U2;
    public ViewGroup U3;
    public String V;
    public View V1;
    public ViewGroup V3;
    public ConstraintLayout W1;
    public pdf.pdfreader.viewer.editor.free.ui.dialog.s W3;
    public r2 X;
    public TextView X1;
    public ViewGroup X3;
    public PreviewEditGuideView X4;
    public SparseIntArray Y;
    public ValueAnimator Y1;
    public AppCompatImageView Y3;
    public PreviewCreateEditGuideView Y4;
    public hp.e Z;
    public ValueAnimator Z1;
    public InterceptRecyclerView Z3;
    public View Z4;

    /* renamed from: a0  reason: collision with root package name */
    public Boolean f26151a0;

    /* renamed from: a2  reason: collision with root package name */
    public View f26152a2;

    /* renamed from: a4  reason: collision with root package name */
    public AppCompatImageView f26154a4;

    /* renamed from: a5  reason: collision with root package name */
    public boolean f26155a5;

    /* renamed from: b2  reason: collision with root package name */
    public View f26157b2;

    /* renamed from: b4  reason: collision with root package name */
    public AppCompatImageView f26159b4;

    /* renamed from: c2  reason: collision with root package name */
    public View f26163c2;

    /* renamed from: c4  reason: collision with root package name */
    public AppCompatImageView f26165c4;

    /* renamed from: d2  reason: collision with root package name */
    public AppCompatImageView f26168d2;

    /* renamed from: d4  reason: collision with root package name */
    public PreviewPDF2WordStateView f26170d4;

    /* renamed from: e0  reason: collision with root package name */
    public View f26172e0;

    /* renamed from: e2  reason: collision with root package name */
    public AppCompatImageView f26173e2;

    /* renamed from: e4  reason: collision with root package name */
    public ImageView f26175e4;

    /* renamed from: f0  reason: collision with root package name */
    public FrameLayout f26177f0;

    /* renamed from: f2  reason: collision with root package name */
    public AppCompatImageView f26178f2;

    /* renamed from: f3  reason: collision with root package name */
    public boolean f26179f3;

    /* renamed from: f4  reason: collision with root package name */
    public AppCompatImageView f26180f4;

    /* renamed from: f5  reason: collision with root package name */
    public t2 f26181f5;

    /* renamed from: g0  reason: collision with root package name */
    public ImageView f26182g0;

    /* renamed from: g2  reason: collision with root package name */
    public AppCompatImageView f26183g2;

    /* renamed from: g3  reason: collision with root package name */
    public ValueAnimator f26184g3;

    /* renamed from: g4  reason: collision with root package name */
    public TextView f26185g4;

    /* renamed from: h0  reason: collision with root package name */
    public ImageView f26187h0;

    /* renamed from: h2  reason: collision with root package name */
    public AppCompatImageView f26188h2;

    /* renamed from: h3  reason: collision with root package name */
    public ValueAnimator f26189h3;

    /* renamed from: h4  reason: collision with root package name */
    public View f26190h4;

    /* renamed from: h5  reason: collision with root package name */
    public AnimatorSet f26191h5;

    /* renamed from: i0  reason: collision with root package name */
    public ImageView f26192i0;

    /* renamed from: i2  reason: collision with root package name */
    public AppCompatImageView f26194i2;

    /* renamed from: i3  reason: collision with root package name */
    public int f26195i3;

    /* renamed from: i4  reason: collision with root package name */
    public View f26196i4;

    /* renamed from: j0  reason: collision with root package name */
    public ImageView f26198j0;

    /* renamed from: j2  reason: collision with root package name */
    public AppCompatImageView f26200j2;

    /* renamed from: j3  reason: collision with root package name */
    public int f26201j3;

    /* renamed from: j4  reason: collision with root package name */
    public View f26202j4;

    /* renamed from: k2  reason: collision with root package name */
    public AppCompatImageView f26206k2;

    /* renamed from: k3  reason: collision with root package name */
    public int f26207k3;

    /* renamed from: k4  reason: collision with root package name */
    public ImageView f26208k4;

    /* renamed from: k5  reason: collision with root package name */
    public SignatureImageView f26209k5;

    /* renamed from: l0  reason: collision with root package name */
    public View f26210l0;

    /* renamed from: l1  reason: collision with root package name */
    public float f26211l1;

    /* renamed from: l2  reason: collision with root package name */
    public AppCompatImageView f26212l2;

    /* renamed from: l3  reason: collision with root package name */
    public Point f26213l3;

    /* renamed from: l4  reason: collision with root package name */
    public View f26214l4;

    /* renamed from: m0  reason: collision with root package name */
    public PreviewPageManageGuideView f26216m0;

    /* renamed from: m1  reason: collision with root package name */
    public float f26217m1;

    /* renamed from: m2  reason: collision with root package name */
    public FrameLayout f26218m2;

    /* renamed from: m3  reason: collision with root package name */
    public boolean f26219m3;

    /* renamed from: m4  reason: collision with root package name */
    public FrameLayout f26220m4;

    /* renamed from: n0  reason: collision with root package name */
    public ProgressView f26222n0;

    /* renamed from: n2  reason: collision with root package name */
    public AddTextColorView f26224n2;

    /* renamed from: n3  reason: collision with root package name */
    public ValueAnimator f26225n3;

    /* renamed from: n4  reason: collision with root package name */
    public Pdf2WordProgress f26226n4;

    /* renamed from: n5  reason: collision with root package name */
    public final Rect f26227n5;

    /* renamed from: o0  reason: collision with root package name */
    public TextView f26228o0;

    /* renamed from: o2  reason: collision with root package name */
    public EditorView f26230o2;

    /* renamed from: o3  reason: collision with root package name */
    public ConstraintLayout f26231o3;

    /* renamed from: o5  reason: collision with root package name */
    public final f f26233o5;

    /* renamed from: p0  reason: collision with root package name */
    public int f26234p0;

    /* renamed from: p2  reason: collision with root package name */
    public Space f26236p2;

    /* renamed from: p3  reason: collision with root package name */
    public View f26237p3;

    /* renamed from: p5  reason: collision with root package name */
    public ArrayList f26239p5;

    /* renamed from: q2  reason: collision with root package name */
    public View f26241q2;

    /* renamed from: q3  reason: collision with root package name */
    public ViewGroup f26242q3;
    public SignActionInfo q5;

    /* renamed from: r0  reason: collision with root package name */
    public DrawSignView f26244r0;

    /* renamed from: r1  reason: collision with root package name */
    public PdfPreviewEntity f26245r1;

    /* renamed from: r3  reason: collision with root package name */
    public ViewGroup f26247r3;

    /* renamed from: r5  reason: collision with root package name */
    public PopupWindow f26248r5;

    /* renamed from: s0  reason: collision with root package name */
    public SignCreateView f26249s0;

    /* renamed from: s1  reason: collision with root package name */
    public nl.b f26250s1;

    /* renamed from: s3  reason: collision with root package name */
    public ImageView f26252s3;

    /* renamed from: s5  reason: collision with root package name */
    public View f26253s5;

    /* renamed from: t  reason: collision with root package name */
    public PdfReaderViewContainer f26254t;

    /* renamed from: t0  reason: collision with root package name */
    public ImageView f26255t0;

    /* renamed from: t1  reason: collision with root package name */
    public ReaderPDFCore f26256t1;

    /* renamed from: t3  reason: collision with root package name */
    public PDFScrollHandle f26258t3;
    public ChooseConvertImageTypeDialog t4;

    /* renamed from: t5  reason: collision with root package name */
    public final ConcurrentHashMap<Long, Integer> f26259t5;

    /* renamed from: u  reason: collision with root package name */
    public ConstraintLayout f26260u;

    /* renamed from: u0  reason: collision with root package name */
    public TextView f26261u0;

    /* renamed from: u1  reason: collision with root package name */
    public String f26262u1;

    /* renamed from: u2  reason: collision with root package name */
    public ij.f f26263u2;

    /* renamed from: u3  reason: collision with root package name */
    public LottieAnimationView f26264u3;

    /* renamed from: u5  reason: collision with root package name */
    public final ConcurrentHashMap<Long, Integer> f26266u5;

    /* renamed from: v  reason: collision with root package name */
    public pdf.pdfreader.viewer.editor.free.ui.dialog.v f26267v;

    /* renamed from: v0  reason: collision with root package name */
    public SignSizeBottomSheetView f26268v0;

    /* renamed from: v1  reason: collision with root package name */
    public String f26269v1;

    /* renamed from: v3  reason: collision with root package name */
    public View f26271v3;

    /* renamed from: v5  reason: collision with root package name */
    public boolean f26273v5;

    /* renamed from: w  reason: collision with root package name */
    public x2 f26274w;

    /* renamed from: w0  reason: collision with root package name */
    public SignColorBottomSheetView f26275w0;

    /* renamed from: w1  reason: collision with root package name */
    public b0 f26276w1;

    /* renamed from: w2  reason: collision with root package name */
    public boolean f26277w2;

    /* renamed from: w3  reason: collision with root package name */
    public AddTextChangeSizeBottomSheetView f26278w3;

    /* renamed from: w4  reason: collision with root package name */
    public boolean f26279w4;

    /* renamed from: w5  reason: collision with root package name */
    public boolean f26280w5;

    /* renamed from: x0  reason: collision with root package name */
    public GraffitiBottomSheetView f26282x0;

    /* renamed from: x1  reason: collision with root package name */
    public View f26283x1;

    /* renamed from: x2  reason: collision with root package name */
    public pdf.pdfreader.viewer.editor.free.ui.dialog.d f26284x2;

    /* renamed from: x3  reason: collision with root package name */
    public AddTextChangeColorBottomSheetView f26285x3;
    public boolean x4;

    /* renamed from: x5  reason: collision with root package name */
    public boolean f26286x5;

    /* renamed from: y  reason: collision with root package name */
    public o3 f26287y;

    /* renamed from: y0  reason: collision with root package name */
    public LinearLayout f26288y0;

    /* renamed from: y3  reason: collision with root package name */
    public TextEditorChangeColorBottomSheetView f26291y3;

    /* renamed from: y5  reason: collision with root package name */
    public boolean f26293y5;

    /* renamed from: z  reason: collision with root package name */
    public PreviewViewSettingsDialog f26294z;

    /* renamed from: z0  reason: collision with root package name */
    public ConstraintLayout f26295z0;

    /* renamed from: z2  reason: collision with root package name */
    public wn.c f26297z2;

    /* renamed from: z3  reason: collision with root package name */
    public ConstraintLayout f26298z3;

    /* renamed from: z5  reason: collision with root package name */
    public ObjectAnimator f26300z5;

    /* renamed from: x  reason: collision with root package name */
    public boolean f26281x = false;
    public final Handler D = new Handler(Looper.getMainLooper());
    public PDFTextEditorMode L = PDFTextEditorMode.NONE;
    public String W = "";

    /* renamed from: b0  reason: collision with root package name */
    public boolean f26156b0 = false;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f26161c0 = false;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f26167d0 = false;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f26204k0 = false;

    /* renamed from: q0  reason: collision with root package name */
    public int f26240q0 = 20;
    public final androidx.activity.result.c<String[]> I0 = registerForActivityResult(new j.b(), new ao.j(this));
    public int P0 = 200;

    /* renamed from: c1  reason: collision with root package name */
    public int f26162c1 = 100;

    /* renamed from: i1  reason: collision with root package name */
    public final int[] f26193i1 = new int[2];

    /* renamed from: j1  reason: collision with root package name */
    public PreviewAddTextDialog f26199j1 = null;

    /* renamed from: k1  reason: collision with root package name */
    public lib.zj.pdfeditor.a0 f26205k1 = null;

    /* renamed from: n1  reason: collision with root package name */
    public String f26223n1 = "";

    /* renamed from: o1  reason: collision with root package name */
    public String f26229o1 = "";

    /* renamed from: p1  reason: collision with root package name */
    public final i0 f26235p1 = new i0();
    public boolean q1 = true;

    /* renamed from: y1  reason: collision with root package name */
    public boolean f26289y1 = true;

    /* renamed from: z1  reason: collision with root package name */
    public TopBarMode f26296z1 = TopBarMode.Main;
    public boolean I1 = false;
    public boolean J1 = false;

    /* renamed from: r2  reason: collision with root package name */
    public String f26246r2 = "";

    /* renamed from: s2  reason: collision with root package name */
    public int f26251s2 = -1;

    /* renamed from: t2  reason: collision with root package name */
    public int f26257t2 = -1;

    /* renamed from: v2  reason: collision with root package name */
    public final d1 f26270v2 = new d1();

    /* renamed from: y2  reason: collision with root package name */
    public boolean f26290y2 = true;
    public boolean A2 = false;
    public final ThumbLoadCenter C2 = new ThumbLoadCenter();
    public boolean K2 = false;
    public int L2 = 1;
    public final w N2 = new w();
    public final y O2 = new y();
    public boolean Q2 = true;
    public boolean R2 = false;
    public boolean S2 = false;
    public final z T2 = new z();
    public boolean V2 = false;
    public boolean W2 = false;
    public long X2 = 0;
    public boolean Y2 = false;
    public boolean Z2 = false;

    /* renamed from: a3  reason: collision with root package name */
    public boolean f26153a3 = false;

    /* renamed from: b3  reason: collision with root package name */
    public final AtomicBoolean f26158b3 = new AtomicBoolean(true);

    /* renamed from: c3  reason: collision with root package name */
    public final Object f26164c3 = new Object();

    /* renamed from: d3  reason: collision with root package name */
    public String f26169d3 = "";

    /* renamed from: e3  reason: collision with root package name */
    public String f26174e3 = "";

    /* renamed from: o4  reason: collision with root package name */
    public boolean f26232o4 = true;

    /* renamed from: p4  reason: collision with root package name */
    public final g1 f26238p4 = new g1();

    /* renamed from: q4  reason: collision with root package name */
    public int f26243q4 = 0;
    public int r4 = 0;
    public final h1 s4 = new h1();

    /* renamed from: u4  reason: collision with root package name */
    public boolean f26265u4 = false;

    /* renamed from: v4  reason: collision with root package name */
    public boolean f26272v4 = false;

    /* renamed from: y4  reason: collision with root package name */
    public final ArrayList f26292y4 = new ArrayList();

    /* renamed from: z4  reason: collision with root package name */
    public boolean f26299z4 = false;
    public volatile boolean A4 = false;
    public volatile long B4 = 0;
    public ArrayList D4 = null;
    public final float F4 = 1.7f;
    public boolean H4 = false;
    public oo.g I4 = null;
    public boolean J4 = false;
    public float L4 = 7.0f;
    public boolean O4 = false;
    public int P4 = -1;
    public boolean Q4 = false;
    public boolean R4 = false;
    public final t1 S4 = new t1();
    public final u1 T4 = new u1();
    public final w1 U4 = new w1();
    public boolean V4 = false;
    public final PriorityQueue<PreviewGuideType> W4 = new PriorityQueue<>(4, new x1());

    /* renamed from: b5  reason: collision with root package name */
    public boolean f26160b5 = false;

    /* renamed from: c5  reason: collision with root package name */
    public final y1 f26166c5 = new y1();

    /* renamed from: d5  reason: collision with root package name */
    public final a f26171d5 = new a();

    /* renamed from: e5  reason: collision with root package name */
    public boolean f26176e5 = true;

    /* renamed from: g5  reason: collision with root package name */
    public int f26186g5 = OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT;

    /* renamed from: i5  reason: collision with root package name */
    public final AtomicBoolean f26197i5 = new AtomicBoolean(false);

    /* renamed from: j5  reason: collision with root package name */
    public final AtomicBoolean f26203j5 = new AtomicBoolean(false);

    /* renamed from: l5  reason: collision with root package name */
    public int f26215l5 = -1;

    /* renamed from: m5  reason: collision with root package name */
    public int f26221m5 = 0;

    /* loaded from: classes3.dex */
    public enum AcceptMode {
        Highlight,
        Underline,
        StrikeOut,
        Ink,
        CopyText,
        AddText
    }

    /* loaded from: classes3.dex */
    public enum TopBarMode {
        Main,
        Search,
        Annot,
        Delete,
        More,
        Accept
    }

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ExecutorService executorService = ReaderPreviewActivity.U5;
            ReaderPreviewActivity.this.m3();
        }
    }

    /* loaded from: classes3.dex */
    public class a0 implements Runnable {
        public a0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            tf.c cVar = FullScreenManage.f23914a;
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            readerPreviewActivity.S2 = !FullScreenManage.d(readerPreviewActivity, null, 3, true);
        }
    }

    /* loaded from: classes3.dex */
    public class a1 extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f26305a;

        public a1(boolean z10) {
            this.f26305a = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            b.InterfaceC0288b interfaceC0288b;
            super.onAnimationEnd(animator);
            if (this.f26305a && (interfaceC0288b = ReaderPreviewActivity.this.M4) != null) {
                ((lib.zj.pdfeditor.p) interfaceC0288b).a();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class a2 {

        /* renamed from: a  reason: collision with root package name */
        public static long f26307a = -1;

        /* renamed from: b  reason: collision with root package name */
        public static boolean f26308b;
    }

    /* loaded from: classes3.dex */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ReaderPreviewActivity.this.W1.setVisibility(8);
        }
    }

    /* loaded from: classes3.dex */
    public class b0 extends PDFReaderView {
        public b0(Context context) {
            super(context);
        }

        @Override // lib.zj.pdfeditor.PDFReaderView
        public final boolean C0() {
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            TextView textView = readerPreviewActivity.A3;
            if (textView != null && textView.getVisibility() == 0 && readerPreviewActivity.A3.isSelected()) {
                return true;
            }
            return false;
        }

        @Override // lib.zj.pdfeditor.PDFReaderView
        public final boolean D0() {
            if (C0()) {
                return false;
            }
            TopBarMode topBarMode = ReaderPreviewActivity.this.f26296z1;
            if (topBarMode != TopBarMode.Annot && topBarMode != TopBarMode.Delete) {
                return false;
            }
            return true;
        }

        @Override // lib.zj.pdfeditor.PDFReaderView
        public final void L0() {
            ea.a.p("YC0ULU8tGnItdg9lQyAzb1tWO2U-IFluMG8STT50K29u", "66M9bjzY");
            String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
            a2.f26308b = true;
            ea.a.p("IG51bxpNWHQzb24=", "yxcdGwTb");
            ExecutorService executorService = ReaderPreviewActivity.U5;
            ReaderPreviewActivity.this.getClass();
        }

        @Override // lib.zj.pdfeditor.PDFReaderView
        public final void M0() {
            ea.a.p("Hi1mLV4tEnIXdl1lHiAybydWW2UxICxuBm8yU1huMmxWQydpEGs=", "BQ1USOba");
            String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            if (!readerPreviewActivity.f26289y1) {
                readerPreviewActivity.x4();
                ea.a.p("YWUqZBZyMnIXdl1lHkE1dC12W3R5", "zaEXTqbQ");
                ea.a.p("XG4PbxBTC24VbFFDBWk1a34gQWgpdw==", "5IqhnC9P");
            } else if (readerPreviewActivity.f26296z1 == TopBarMode.Main) {
                tn.a.d(ReaderPdfApplication.m(), ea.a.p("RWkudw==", "pdIZaQhb"), ea.a.p("IWkod2tmQ2wkXxVoW3c=", "6qWM467D"), ea.a.p("Q2Rm", "57Z3136z"), false);
                readerPreviewActivity.l3();
                ea.a.p("FGU0ZD9yZHItdg9lQ0E0dFF2O3R5", "KeFUZ4W9");
                ea.a.p("NW5zbyhTP24vbANDWGk0awJoO2QsIA==", "MTZ7KVfb");
            }
        }

        @Override // lib.zj.pdfeditor.PDFReaderView
        public final void O0() {
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            if (readerPreviewActivity.f26288y0 != null) {
                readerPreviewActivity.I4(true);
            }
            RelativeLayout relativeLayout = readerPreviewActivity.K3;
            if (relativeLayout != null) {
                relativeLayout.setEnabled(true);
            }
        }

        @Override // lib.zj.pdfeditor.PDFReaderView
        public final void P0() {
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            if (readerPreviewActivity.f26288y0 != null) {
                readerPreviewActivity.I4(false);
            }
            RelativeLayout relativeLayout = readerPreviewActivity.K3;
            if (relativeLayout != null) {
                relativeLayout.setEnabled(false);
            }
            GraffitiBottomSheetView graffitiBottomSheetView = readerPreviewActivity.f26282x0;
            if (graffitiBottomSheetView != null && graffitiBottomSheetView.H()) {
                readerPreviewActivity.f26282x0.C();
            }
        }

        @Override // lib.zj.pdfeditor.PDFReaderView
        public final void Q0(Hit hit) {
            ea.a.p("Yi0cLVQtR3I_diNlAiAMb1ZWB2UyIApuAWk7dA==", "iFXgIULZ");
            String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
            int[] iArr = s.f26385d;
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            int i10 = iArr[readerPreviewActivity.f26296z1.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    readerPreviewActivity.f26296z1 = TopBarMode.Annot;
                }
            } else if (hit == Hit.Annotation) {
                readerPreviewActivity.f26296z1 = TopBarMode.Delete;
            }
        }

        @Override // lib.zj.pdfeditor.PDFReaderView
        public final void R0(View view, float f10, float f11) {
            b0 b0Var;
            if (i.a.f21508a.f21507d) {
                return;
            }
            ea.a.p("YC1fLXUtM3Itdg9lQyAzb1tWO2U-IFluOG8fZwFyJ3M-IB9UN3ABYTpNCWRRPQ==", "RwMrXCHT");
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            Objects.toString(readerPreviewActivity.f26296z1);
            String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
            super.R0(view, f10, f11);
            if (readerPreviewActivity.X3 != null) {
                if (readerPreviewActivity.f26296z1 == TopBarMode.Main) {
                    View inflate = LayoutInflater.from(readerPreviewActivity).inflate(R.layout.choose_function_popu_layout, (ViewGroup) null);
                    inflate.measure(-2, -2);
                    int dimensionPixelSize = readerPreviewActivity.getResources().getDimensionPixelSize(R.dimen.dp_12);
                    h.a aVar = new h.a();
                    aVar.f28407f[0] = androidx.core.content.a.getColor(readerPreviewActivity, R.color.colorPrimaryOld);
                    aVar.f28403a = dimensionPixelSize;
                    aVar.f28404b = androidx.core.content.a.getColor(readerPreviewActivity, R.color.colorPopuShadow);
                    aVar.c = dimensionPixelSize;
                    aVar.f28405d = 0;
                    aVar.f28406e = 0;
                    pdf.pdfreader.viewer.editor.free.ui.widget.h hVar = new pdf.pdfreader.viewer.editor.free.ui.widget.h(aVar.f28407f, aVar.f28403a, aVar.f28404b, aVar.c, aVar.f28405d, aVar.f28406e);
                    inflate.setLayerType(1, null);
                    WeakHashMap<View, x0.n0> weakHashMap = x0.f0.f31435a;
                    f0.d.q(inflate, hVar);
                    PopupWindow popupWindow = new PopupWindow(inflate, -2, -2);
                    readerPreviewActivity.A = popupWindow;
                    popupWindow.setOutsideTouchable(true);
                    readerPreviewActivity.A.setBackgroundDrawable(androidx.core.content.a.getDrawable(readerPreviewActivity, R.color.no_color));
                    inflate.findViewById(R.id.ll_edit).setOnClickListener(new b2(readerPreviewActivity));
                    inflate.findViewById(R.id.ll_annotate).setOnClickListener(new c2(readerPreviewActivity));
                    inflate.findViewById(R.id.ll_draw).setOnClickListener(new d2(readerPreviewActivity));
                    inflate.findViewById(R.id.ll_add_text).setOnClickListener(new ao.e2(readerPreviewActivity));
                    View findViewById = inflate.findViewById(R.id.iv_more_edit_signature_red_dot);
                    if (pdf.pdfreader.viewer.editor.free.utils.q0.s(readerPreviewActivity)) {
                        findViewById.setVisibility(0);
                    } else {
                        findViewById.setVisibility(8);
                    }
                    inflate.findViewById(R.id.ll_signature).setOnClickListener(new f2(readerPreviewActivity, findViewById));
                    if (readerPreviewActivity.f26276w1 != null) {
                        int B = aj.b.B(readerPreviewActivity);
                        int measuredWidth = inflate.getMeasuredWidth();
                        int measuredHeight = inflate.getMeasuredHeight();
                        int[] iArr = new int[2];
                        readerPreviewActivity.f26276w1.getLocationInWindow(iArr);
                        int i10 = (int) ((f10 + iArr[0]) - measuredWidth);
                        int i11 = iArr[1];
                        int i12 = ((int) ((f11 + i11) - measuredHeight)) - B;
                        int i13 = i11 + B;
                        if (i12 < i13) {
                            i12 = i13;
                        }
                        tn.a.b(ReaderPdfApplication.m(), ea.a.p("RWkudw==", "ZZcnSSL6"), ea.a.p("RWkudyxwDXAHcGtzAW93", "0l5GDyfC"));
                        readerPreviewActivity.A.showAtLocation(readerPreviewActivity.f26276w1, 0, i10, i12);
                        b0 b0Var2 = readerPreviewActivity.f26276w1;
                        if (b0Var2 != null) {
                            b0Var2.performHapticFeedback(1, 2);
                        }
                    }
                } else if (!readerPreviewActivity.f26153a3 && D0() && (b0Var = readerPreviewActivity.f26276w1) != null && readerPreviewActivity.K == 1) {
                    b0Var.performHapticFeedback(1, 2);
                    readerPreviewActivity.p4(view, f10, f11);
                    MagnifierContainer magnifierContainer = readerPreviewActivity.G2;
                    if (magnifierContainer != null) {
                        magnifierContainer.invalidate();
                    }
                }
            }
        }

        @Override // lib.zj.pdfeditor.PDFReaderView
        public final void U0() {
            ea.a.p("Yi0cLVQtR3I_diNlAiAMb1ZWB2UyIApuCHIxdhBvNnMBZUl0OmxeY2s=", "Gh4zXTyC");
            String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
            a2.f26308b = true;
        }

        /* JADX WARN: Removed duplicated region for block: B:77:0x018b  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x019d  */
        @Override // lib.zj.pdfeditor.PDFReaderView, lib.zj.pdfeditor.ReaderView
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void W(int r13) {
            /*
                Method dump skipped, instructions count: 421
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity.b0.W(int):void");
        }

        @Override // lib.zj.pdfeditor.PDFReaderView
        public final void X0() {
            ea.a.p("Hi1mLV4tEnIXdl1lHiAybydWW2UxICxuJ2EFTQRpXkRcYwpyFmE=", "sue08qwx");
            String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
            ea.a.p("YWUqZBZyMnIXdl1lHkE1dC12W3R5", "JfBj5AGy");
            ea.a.p("XG4fYQNNA2kcRFtjKHIzYX4gDz17PX49UD1uPQ==", "mSXfQhLb");
            PdfPreviewEntity pdfPreviewEntity = ReaderPreviewActivity.this.f26245r1;
            String str2 = pdf.pdfreader.viewer.editor.free.utils.p.f28740a;
        }

        @Override // lib.zj.pdfeditor.PDFReaderView
        public final void Y0() {
            ea.a.p("Yi0cLVQtR3I_diNlAiAMb1ZWB2UyIApuPm8PYxhGHmkhZw==", "nww2jzpr");
            String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
            a2.f26308b = true;
            ea.a.p("YWUqZBZyMnIXdl1lHkE1dC12W3R5", "l0P8TT3p");
            ea.a.p("IG5lbwxjX0Y2aSRn", "eypsxeIM");
        }

        @Override // lib.zj.pdfeditor.PDFReaderView
        public final void Z0(String str) {
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            if (readerPreviewActivity.isFinishing() || TextUtils.isEmpty(str) || readerPreviewActivity.M) {
                return;
            }
            new pdf.pdfreader.viewer.editor.free.ui.dialog.b0(readerPreviewActivity, str, new ao.q(this, 1)).show();
        }

        @Override // lib.zj.pdfeditor.PDFReaderView, lib.zj.pdfeditor.ReaderView, android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            SignSizeBottomSheetView signSizeBottomSheetView;
            boolean z10;
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            SignColorBottomSheetView signColorBottomSheetView = readerPreviewActivity.f26275w0;
            if ((signColorBottomSheetView != null && signColorBottomSheetView.getVisibility() == 0) || ((signSizeBottomSheetView = readerPreviewActivity.f26268v0) != null && signSizeBottomSheetView.getVisibility() == 0)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                readerPreviewActivity.v3();
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 || action == 3) {
                    readerPreviewActivity.I2();
                }
            } else {
                readerPreviewActivity.f26221m5 = 0;
                readerPreviewActivity.d4(null);
            }
            return super.onTouchEvent(motionEvent);
        }
    }

    /* loaded from: classes3.dex */
    public class b1 extends AnimatorListenerAdapter {
        public b1() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            b0 b0Var = readerPreviewActivity.f26276w1;
            if (b0Var != null) {
                b0Var.setSkipLoad(false);
                readerPreviewActivity.f26276w1.requestLayout();
            }
            if (!readerPreviewActivity.isFinishing()) {
                if (readerPreviewActivity.f26289y1) {
                    readerPreviewActivity.K3(true);
                    readerPreviewActivity.m3();
                    FrameLayout frameLayout = readerPreviewActivity.O;
                    if (frameLayout != null) {
                        frameLayout.setVisibility(0);
                    }
                    readerPreviewActivity.K4();
                    return;
                }
                Handler handler = readerPreviewActivity.D;
                w wVar = readerPreviewActivity.N2;
                handler.removeCallbacks(wVar);
                handler.postDelayed(wVar, 2000L);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            ViewGroup viewGroup;
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            if (readerPreviewActivity.f26213l3 == null && (viewGroup = readerPreviewActivity.f26242q3) != null) {
                viewGroup.setPadding(0, 0, 0, 0);
            }
            b0 b0Var = readerPreviewActivity.f26276w1;
            if (b0Var != null) {
                b0Var.setSkipLoad(true);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class c implements oj.c {
        public c() {
        }

        public final void a(int i10) {
            boolean z10;
            ExecutorService executorService = ReaderPreviewActivity.U5;
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            readerPreviewActivity.getClass();
            ea.a.p("LG5NZSBSDGYkbxEgQHgjQ1d1PHQg", "UXI9RiU2");
            no.f.b(readerPreviewActivity).getClass();
            pdf.pdfreader.viewer.editor.free.utils.d1 b10 = pdf.pdfreader.viewer.editor.free.utils.d1.b(readerPreviewActivity);
            String str = no.f.f22624o;
            if (!b10.a(str, true) && !ReaderDebugActivity.f27830i) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10 && i10 > 1) {
                no.f.b(readerPreviewActivity).getClass();
                pdf.pdfreader.viewer.editor.free.utils.d1.b(readerPreviewActivity).c(str, false);
                t2 t2Var = new t2(readerPreviewActivity, new ao.r(readerPreviewActivity));
                readerPreviewActivity.f26181f5 = t2Var;
                readerPreviewActivity.f26176e5 = false;
                t2Var.setOnDismissListener(new ao.s());
                readerPreviewActivity.f26181f5.show();
                tn.a.d(readerPreviewActivity, ea.a.p("PWVXbBZ3", "Oz3BOOXY"), ea.a.p("KmUWbFZ3bmc9aQJla3M_b3c=", "3iXp91GD"), ea.a.p("Q2Rm", "86SGaita"), false);
            }
            if (!z10 && i10 <= 1) {
                readerPreviewActivity.f26176e5 = false;
                readerPreviewActivity.F4();
            }
            readerPreviewActivity.L3(true);
            readerPreviewActivity.T2();
        }
    }

    /* loaded from: classes3.dex */
    public class c1 implements ValueAnimator.AnimatorUpdateListener {
        public c1() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup viewGroup;
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            RelativeLayout relativeLayout = readerPreviewActivity.P;
            if (relativeLayout != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) relativeLayout.getLayoutParams();
                marginLayoutParams.topMargin = (int) (-(readerPreviewActivity.f26195i3 * floatValue));
                readerPreviewActivity.P.setLayoutParams(marginLayoutParams);
            }
            Point point = readerPreviewActivity.f26213l3;
            if (point != null && (viewGroup = readerPreviewActivity.f26242q3) != null) {
                viewGroup.setPadding((int) (point.x * floatValue), (int) (point.y * floatValue), 0, 0);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f26315a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f26316b;

        public d(boolean z10, View view) {
            this.f26315a = z10;
            this.f26316b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            boolean z10 = this.f26315a;
            View view = this.f26316b;
            if (z10) {
                view.setVisibility(4);
            } else {
                view.setVisibility(8);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class d0 implements ReaderView.g {
        public d0() {
        }

        public final void a(int i10, int[] iArr, kj.b bVar, float f10) {
            SignActionInfo signActionInfo = new SignActionInfo();
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            readerPreviewActivity.q5 = signActionInfo;
            signActionInfo.setStampAnnotData(new kj.b(bVar));
            readerPreviewActivity.q5.setPageViewInt(iArr);
            readerPreviewActivity.q5.setPdfPageIndex(i10);
            readerPreviewActivity.q5.setScale(f10);
            SignPathActionInfo signPathActionInfo = g.a.f31902a.f31901a.get(Long.valueOf(bVar.f19799a));
            readerPreviewActivity.q5.setSignPathActionInfo(signPathActionInfo);
            readerPreviewActivity.q5.setAction(SignAction.Move);
            ReaderPreviewActivity.g2(ReaderPreviewActivity.this, i10, iArr, bVar, signPathActionInfo, f10);
            readerPreviewActivity.I2();
        }
    }

    /* loaded from: classes3.dex */
    public class d1 implements androidx.lifecycle.x<nl.g> {
        public d1() {
        }

        @Override // androidx.lifecycle.x
        public final void m(nl.g gVar) {
            nl.g gVar2 = gVar;
            if (gVar2 != null) {
                ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
                if (!gVar2.f22606b.equals(readerPreviewActivity.f26246r2) && !readerPreviewActivity.B3() && !readerPreviewActivity.C3()) {
                    Context m10 = ReaderPdfApplication.m();
                    if (eo.e.c(m10) == 2) {
                        eo.e.n(m10, 1);
                    }
                    if (eo.e.k(m10) == 2) {
                        eo.e.s(m10, 1);
                    }
                    readerPreviewActivity.Z2();
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class e implements x0.u {
        public e() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
            r7 = r7.getDisplayCutout();
         */
        @Override // x0.u
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final x0.s0 m(android.view.View r7, x0.s0 r8) {
            /*
                r6 = this;
                r7 = 7
                o0.b r7 = r8.a(r7)
                r0 = 2
                o0.b r0 = r8.a(r0)
                pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity r1 = pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity.this
                boolean r2 = r1.hasWindowFocus()
                if (r2 != 0) goto L17
                int r7 = r7.f22640b
                if (r7 != 0) goto L17
                return r8
            L17:
                pdf.pdfreader.viewer.editor.free.ui.myview.InterceptTouchFrameLayout r7 = r1.I2
                r2 = 0
                if (r7 == 0) goto L3b
                boolean r3 = r1.f26167d0
                if (r3 != 0) goto L29
                boolean r4 = r1.f19294h
                if (r4 != 0) goto L25
                goto L29
            L25:
                r7.setPadding(r2, r2, r2, r2)
                goto L3b
            L29:
                if (r3 == 0) goto L30
                int r3 = r0.f22641d
                if (r3 != 0) goto L30
                return r8
            L30:
                int r3 = r0.f22639a
                int r4 = r0.f22641d
                int r5 = r0.f22640b
                int r0 = r0.c
                r7.setPadding(r3, r5, r0, r4)
            L3b:
                android.view.View r7 = r1.f26283x1
                if (r7 == 0) goto L9d
                int r7 = android.os.Build.VERSION.SDK_INT
                r0 = 28
                if (r7 < r0) goto L9d
                android.view.Window r7 = r1.getWindow()
                if (r7 == 0) goto L9d
                android.view.View r7 = r7.getDecorView()
                android.view.WindowInsets r7 = r7.getRootWindowInsets()
                if (r7 != 0) goto L56
                goto L9d
            L56:
                android.view.DisplayCutout r7 = androidx.window.layout.e.f(r7)
                if (r7 != 0) goto L5d
                goto L9d
            L5d:
                android.view.ViewGroup r0 = r1.f26242q3
                if (r0 == 0) goto L9d
                int r0 = r1.getRequestedOrientation()
                r3 = 1
                if (r0 != r3) goto L98
                boolean r0 = r1.f26289y1
                if (r0 != 0) goto L98
                boolean r0 = pdf.pdfreader.viewer.editor.free.utils.a0.i(r1)
                if (r0 != 0) goto L98
                android.view.ViewGroup r0 = r1.f26242q3
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
                int r3 = r0.getMarginStart()
                int r0 = r0.topMargin
                int r4 = androidx.window.layout.f.c(r7)
                int r7 = androidx.window.layout.e.b(r7)
                int r4 = r4 - r0
                int r7 = r7 - r3
                android.view.ViewGroup r0 = r1.f26242q3
                int r7 = java.lang.Math.max(r7, r2)
                int r1 = java.lang.Math.max(r4, r2)
                r0.setPadding(r7, r1, r2, r2)
                goto L9d
            L98:
                android.view.ViewGroup r7 = r1.f26242q3
                r7.setPadding(r2, r2, r2, r2)
            L9d:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity.e.m(android.view.View, x0.s0):x0.s0");
        }
    }

    /* loaded from: classes3.dex */
    public class e0 implements ReaderView.i {
        public e0() {
        }

        @Override // lib.zj.pdfeditor.ReaderView.i
        public final void a() {
            ExecutorService executorService = ReaderPreviewActivity.U5;
            ReaderPreviewActivity.this.l3();
        }

        @Override // lib.zj.pdfeditor.ReaderView.i
        public final void b() {
            ExecutorService executorService = ReaderPreviewActivity.U5;
            ReaderPreviewActivity.this.x4();
        }
    }

    /* loaded from: classes3.dex */
    public class e1 implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public int f26321a = -1;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f26322b;

        public e1(int i10) {
            this.f26322b = i10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            float f10 = 1.0f - floatValue;
            boolean z10 = i.a.f21508a.f21507d;
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            if (z10) {
                View view = readerPreviewActivity.f26172e0;
                if (view != null) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    layoutParams.height = (int) (f10 * this.f26322b);
                    readerPreviewActivity.f26172e0.setLayoutParams(layoutParams);
                    return;
                }
                return;
            }
            InterceptRecyclerView interceptRecyclerView = readerPreviewActivity.Z3;
            if (interceptRecyclerView != null && readerPreviewActivity.X3 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) interceptRecyclerView.getLayoutParams();
                marginLayoutParams.topMargin = (int) (floatValue * readerPreviewActivity.f26201j3);
                readerPreviewActivity.Z3.setLayoutParams(marginLayoutParams);
                AppCompatImageView appCompatImageView = readerPreviewActivity.Y3;
                if (appCompatImageView != null) {
                    ViewGroup.LayoutParams layoutParams2 = appCompatImageView.getLayoutParams();
                    int i10 = readerPreviewActivity.f26207k3;
                    layoutParams2.width = (int) (i10 * f10);
                    layoutParams2.height = (int) (i10 * f10);
                    readerPreviewActivity.Y3.setLayoutParams(layoutParams2);
                }
                if (this.f26321a <= 0) {
                    this.f26321a = readerPreviewActivity.r4 - readerPreviewActivity.f26243q4;
                }
                FrameLayout frameLayout = readerPreviewActivity.O;
                if (frameLayout != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
                    if (ReaderView.f21378z0) {
                        marginLayoutParams2.bottomMargin = ((int) (f10 * this.f26321a)) + readerPreviewActivity.f26243q4;
                    } else {
                        marginLayoutParams2.setMarginEnd(((int) (f10 * this.f26321a)) + readerPreviewActivity.f26243q4);
                    }
                    readerPreviewActivity.O.setLayoutParams(marginLayoutParams2);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class f extends xo.a {
        public f() {
        }

        @Override // xo.a
        public final void c() {
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            SignActionInfo signActionInfo = new SignActionInfo(readerPreviewActivity.q5);
            readerPreviewActivity.Q3();
            SignActionInfo signActionInfo2 = new SignActionInfo(readerPreviewActivity.q5);
            signActionInfo2.setAction(SignAction.Move);
            c.a.f32211a.a(signActionInfo, signActionInfo2);
            readerPreviewActivity.q5 = new SignActionInfo(signActionInfo2);
        }

        @Override // xo.a, android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 1 || action == 3) {
                ExecutorService executorService = ReaderPreviewActivity.U5;
                ReaderPreviewActivity.this.F2();
            }
            return super.onTouch(view, motionEvent);
        }
    }

    /* loaded from: classes3.dex */
    public class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ zn.d f26326a;

        public g(zn.d dVar) {
            this.f26326a = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SignatureImageView signatureImageView;
            AtomicBoolean atomicBoolean;
            KeyEvent.Callback callback;
            zn.d dVar = this.f26326a;
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            int[] iArr = new int[2];
            try {
                try {
                    signatureImageView = readerPreviewActivity.f26209k5;
                    atomicBoolean = readerPreviewActivity.f26197i5;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    ea.a.p("NGE4ZXxkGXQhbgFTQGE6cHluPG90", "XKGN9plJ");
                    ea.a.p("QXUlOlNyB20ddlFWAGUhICFyQCA=", "maqdkO3m");
                    e10.toString();
                    readerPreviewActivity.f26197i5.set(false);
                    if (dVar == null) {
                        return;
                    }
                }
                if (signatureImageView != null && signatureImageView.isAttachedToWindow()) {
                    if (atomicBoolean.get()) {
                        ea.a.p("HWVQZBxyZ3I_diNlAkELdFx2B3R5", "RbIGvTcF");
                        ea.a.p("KmEUZTdkJ3QhbgFTQGE6cHluPG89IEVhAmkfZwJ0I20pQQxuHXRuaTsgEnJBZQ==", "CqYbrNNv");
                        atomicBoolean.set(false);
                        if (dVar != null) {
                            dVar.a();
                            return;
                        }
                        return;
                    }
                    atomicBoolean.set(true);
                    if (readerPreviewActivity.f26209k5.getSignPathActionInfo() != null) {
                        readerPreviewActivity.f26209k5.setImageBitmap(readerPreviewActivity.f26209k5.h());
                    }
                    if (readerPreviewActivity.f26215l5 < 0) {
                        ea.a.p("YWUqZBZyMnIXdl1lHkE1dC12W3R5", "C5AGOZOb");
                        ea.a.p("PGFHZTxkXnQzbi1TAWEFcHRuAG8xIAhFIGk6aSlnJ2koblB0DHJSUDtnL0kbZA14FTxOMA==", "btgtDNGt");
                        readerPreviewActivity.F2();
                    }
                    readerPreviewActivity.a4(readerPreviewActivity.f26215l5);
                    RectF d32 = readerPreviewActivity.d3();
                    float centerX = d32.centerX();
                    float centerY = d32.centerY();
                    ea.a.p("YWUqZBZyMnIXdl1lHkE1dC12W3R5", "20TMPtp7");
                    ea.a.p("UGUldBZyOjo=", "LWLI75eV");
                    ea.a.p("Y2NUbg1lRVk6", "XApONQnR");
                    float width = readerPreviewActivity.f26209k5.getWidth();
                    float height = readerPreviewActivity.f26209k5.getHeight();
                    float[] fArr = {centerX - ((readerPreviewActivity.f26209k5.getScaleX() * width) / 2.0f), centerY - ((readerPreviewActivity.f26209k5.getScaleY() * height) / 2.0f)};
                    ea.a.p("YWUqZBZyMnIXdl1lHkE1dC12W3R5", "S8Pb78ys");
                    ea.a.p("PGlWbjBuQzE6", "pTRkJcyT");
                    Arrays.toString(fArr);
                    fArr[0] = (readerPreviewActivity.f26209k5.getContentLeft() * readerPreviewActivity.f26209k5.getScaleX()) + fArr[0];
                    fArr[1] = (readerPreviewActivity.f26209k5.getContentTop() * readerPreviewActivity.f26209k5.getScaleY()) + fArr[1];
                    ea.a.p("YWUqZBZyMnIXdl1lHkE1dC12W3R5", "5mjNZ8fc");
                    ea.a.p("PGlWbjBuQzI6", "dvGkjoVy");
                    Arrays.toString(fArr);
                    ea.a.p("YWUqZBZyMnIXdl1lHkE1dC12W3R5", "6l60b2L0");
                    ea.a.p("QDo=", "9A79YWQk");
                    readerPreviewActivity.f26209k5.getWidth();
                    ea.a.p("T2g6", "EdclCqlk");
                    readerPreviewActivity.f26209k5.getHeight();
                    RectF rectF = new RectF();
                    float f10 = fArr[0];
                    rectF.set(f10, fArr[1], (((width - readerPreviewActivity.f26209k5.getContentLeft()) - readerPreviewActivity.f26209k5.getContentLeft()) * readerPreviewActivity.f26209k5.getScaleX()) + f10, (((height - readerPreviewActivity.f26209k5.getContentTop()) - readerPreviewActivity.f26209k5.getContentTop()) * readerPreviewActivity.f26209k5.getScaleY()) + fArr[1]);
                    ea.a.p("YWUqZBZyMnIXdl1lHkE1dC12W3R5", "0OSCONWS");
                    ea.a.p("PGlWbhh0QnI_Ui9jATo=", "yRLU4Wcc");
                    rectF.toString();
                    b0 b0Var = readerPreviewActivity.f26276w1;
                    PDFPageView pDFPageView = null;
                    if (b0Var != null) {
                        for (Map.Entry<ij.d, View> entry : b0Var.getAllCacheViews().entrySet()) {
                            if (entry.getKey().f18534b == readerPreviewActivity.f26215l5) {
                                callback = (View) entry.getValue();
                                break;
                            }
                        }
                    }
                    callback = null;
                    ea.a.p("YWUqZBZyMnIXdl1lHkE1dC12W3R5", "SDUVGnXv");
                    ea.a.p("QGE9ZTZkC3QbblNTHWE7cAVuXG8yIC5FHGlFaSNnNWlUbip0BnIHUBNnUUkHZDN4ZD0g", "x1MfrSz8");
                    if (callback instanceof PDFPageView) {
                        pDFPageView = (PDFPageView) callback;
                    }
                    if (pDFPageView == null) {
                        ea.a.p("HWVQZBxyZ3I_diNlAkELdFx2B3R5", "VgwTtUbO");
                        ea.a.p("PGFHZTxkXnQzbi1TAWEFcHRuAG8xIARkCVMgZwhhJHU9ZWFhHmUXaSkgJHUZbA==", "dmjomIfP");
                        atomicBoolean.set(false);
                        if (dVar != null) {
                            dVar.a();
                            return;
                        }
                        return;
                    }
                    pDFPageView.getLocationOnScreen(iArr);
                    ea.a.p("HWVQZBxyZ3I_diNlAkELdFx2B3R5", "jkDYeuke");
                    ea.a.p("P2FWZS9pUncTbj46", "QcghQXmD");
                    ea.a.p("LA==", "oGLpO71t");
                    float[] fArr2 = {fArr[0] - iArr[0], fArr[1] - iArr[1]};
                    ea.a.p("YWUqZBZyMnIXdl1lHkE1dC12W3R5", "O5urGoVV");
                    ea.a.p("V2k4UB9hG0kcdDo=", "exBTHva1");
                    ea.a.p("LA==", "iynAs5LJ");
                    float width2 = (rectF.width() / 2.0f) + fArr2[0];
                    float height2 = (rectF.height() / 2.0f) + fArr2[1];
                    float rotation = readerPreviewActivity.f26209k5.getRotation();
                    RectF buildRectF = ReaderPDFCore.buildRectF(width2, height2, rectF.width(), rectF.height(), rotation);
                    ea.a.p("HWVQZBxyZ3I_diNlAkELdFx2B3R5", "wRIIGLNp");
                    ea.a.p("V2k4UB9hG1IXY0BGOg==", "9DuBiSVs");
                    Objects.toString(buildRectF);
                    ea.a.p("Y3c9", "YdtsJTK3");
                    buildRectF.width();
                    ea.a.p("H2g9", "oq3ZgftW");
                    buildRectF.height();
                    kj.b stampAnnotData = readerPreviewActivity.f26209k5.getStampAnnotData();
                    if (stampAnnotData == null) {
                        stampAnnotData = new kj.b();
                        stampAnnotData.f19802e = "";
                        stampAnnotData.f19801d = -16777216;
                    }
                    int i10 = stampAnnotData.f19804g;
                    int i11 = readerPreviewActivity.f26215l5;
                    if (i10 != i11) {
                        stampAnnotData.f19804g = i11;
                        stampAnnotData.f19805h = true;
                    }
                    stampAnnotData.c = Integer.valueOf((int) rotation);
                    stampAnnotData.f19800b = readerPreviewActivity.f26209k5.getCenterXYRotationScale().f28468a;
                    stampAnnotData.f19803f = pDFPageView.U1(buildRectF);
                    ea.a.p("YWUqZBZyMnIXdl1lHkE1dC12W3R5", "yamweQEy");
                    ea.a.p("J2EVZRxkUHQhbgFTQGE6cHluPG89IERlF3Q6", "l2TcY98h");
                    Objects.toString(stampAnnotData.f19803f);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) readerPreviewActivity.f26209k5.getLayoutParams();
                    stampAnnotData.a();
                    pDFPageView.O0(stampAnnotData);
                    try {
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(pDFPageView.getPageStampData());
                        ReaderPDFCore.addPageStampAnnotDataMap(Integer.valueOf(readerPreviewActivity.f26215l5), arrayList);
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.addAll(pDFPageView.getSavedStampData());
                        ReaderPDFCore.addSavedPageStampAnnotMap(Integer.valueOf(readerPreviewActivity.f26215l5), arrayList2);
                    } catch (Exception e11) {
                        dp.a.a().getClass();
                        dp.a.e(e11);
                    }
                    ea.a.p("QGE9ZTZkC3QbblNTHWE7cAVuXG90", "w6Em5ija");
                    ea.a.p("NnU6OlVyJ20ndgNWXWV3", "VYDTuBzq");
                    readerPreviewActivity.U3();
                    readerPreviewActivity.f26215l5 = -1;
                    readerPreviewActivity.f26221m5 = stampAnnotData.hashCode();
                    atomicBoolean.set(false);
                    if (dVar == null) {
                        return;
                    }
                    dVar.a();
                    return;
                }
                ea.a.p("YWUqZBZyMnIXdl1lHkE1dC12W3R5", "65yOp1jb");
                ea.a.p("QGE9ZTZkC3QbblNTHWE7cAVuXG8yIDBpUG4SdAFyUEleYSxlJWkHd1JpRyAHdTps", "7st5r13i");
                atomicBoolean.set(false);
                if (dVar != null) {
                    dVar.a();
                }
            } catch (Throwable th2) {
                readerPreviewActivity.f26197i5.set(false);
                if (dVar != null) {
                    dVar.a();
                }
                throw th2;
            }
        }
    }

    /* loaded from: classes3.dex */
    public class g0 implements qg.c {
        public g0() {
        }

        @Override // qg.c
        public final void a() {
            ExecutorService executorService = ReaderPreviewActivity.U5;
            ReaderPreviewActivity.this.L4();
        }

        @Override // qg.c
        public final void b(int i10) {
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            if (readerPreviewActivity.f26277w2) {
                a();
                return;
            }
            if (readerPreviewActivity.D2 != null) {
                int dimensionPixelSize = readerPreviewActivity.getResources().getDimensionPixelSize(R.dimen.dp_50);
                int dimensionPixelSize2 = readerPreviewActivity.getResources().getDimensionPixelSize(R.dimen.dp_66);
                ThumbnailAdapter callback = readerPreviewActivity.D2;
                ThumbLoadCenter thumbLoadCenter = readerPreviewActivity.C2;
                thumbLoadCenter.getClass();
                kotlin.jvm.internal.g.e(callback, "callback");
                thumbLoadCenter.c(i10, dimensionPixelSize, dimensionPixelSize2, null, callback, true);
            }
            readerPreviewActivity.f26156b0 = true;
            readerPreviewActivity.f26296z1 = TopBarMode.Annot;
            if (readerPreviewActivity.R3 != null) {
                readerPreviewActivity.N4();
                readerPreviewActivity.R3.setEnabled(true);
                readerPreviewActivity.R3.setAlpha(1.0f);
                ImageView imageView = readerPreviewActivity.S3;
                if (imageView != null) {
                    imageView.setAlpha(1.0f);
                }
            }
        }

        @Override // qg.c
        public final boolean isReadOnly() {
            return ReaderPreviewActivity.this.f26277w2;
        }
    }

    /* loaded from: classes3.dex */
    public class g1 implements Runnable {
        public g1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            TextEditorChangeColorBottomSheetView textEditorChangeColorBottomSheetView = readerPreviewActivity.f26291y3;
            if (textEditorChangeColorBottomSheetView != null && textEditorChangeColorBottomSheetView.H()) {
                readerPreviewActivity.f26291y3.C();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SignatureImageView f26330a;

        public h(SignatureImageView signatureImageView) {
            this.f26330a = signatureImageView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            if (!readerPreviewActivity.isFinishing() && !readerPreviewActivity.isDestroyed()) {
                SignatureImageView signatureImageView = this.f26330a;
                if (!signatureImageView.isAttachedToWindow()) {
                    return;
                }
                Rect externalRect = signatureImageView.getExternalRect();
                int[] iArr = new int[2];
                ConstraintLayout constraintLayout = readerPreviewActivity.f26231o3;
                if (constraintLayout != null) {
                    constraintLayout.getLocationOnScreen(iArr);
                }
                int i10 = (-readerPreviewActivity.f26253s5.getMeasuredWidth()) / 2;
                int i11 = -readerPreviewActivity.f26253s5.getMeasuredHeight();
                int dimensionPixelSize = readerPreviewActivity.getResources().getDimensionPixelSize(R.dimen.dp_56) + iArr[1];
                if (externalRect.bottom < dimensionPixelSize || externalRect.right < 0) {
                    return;
                }
                double d10 = readerPreviewActivity.getResources().getDisplayMetrics().widthPixels;
                androidx.activity.s.f1866u = d10;
                if (externalRect.left > d10) {
                    return;
                }
                int[] iArr2 = new int[2];
                SignCreateView signCreateView = readerPreviewActivity.f26249s0;
                if (signCreateView != null) {
                    signCreateView.getLocationOnScreen(iArr2);
                }
                int i12 = externalRect.top;
                if (i12 > iArr2[1]) {
                    return;
                }
                if (i12 + i11 < dimensionPixelSize) {
                    int[] iArr3 = new int[2];
                    SignCreateView signCreateView2 = readerPreviewActivity.f26249s0;
                    if (signCreateView2 != null) {
                        signCreateView2.getLocationOnScreen(iArr3);
                    }
                    if (readerPreviewActivity.getResources().getDimensionPixelOffset(R.dimen.dp_40) + externalRect.bottom <= iArr3[1]) {
                        readerPreviewActivity.f26248r5.showAtLocation(signatureImageView, 0, ((externalRect.left + externalRect.right) / 2) + i10, externalRect.bottom);
                        readerPreviewActivity.R3();
                        return;
                    }
                }
                readerPreviewActivity.f26248r5.showAtLocation(signatureImageView, 0, ((externalRect.left + externalRect.right) / 2) + i10, Math.max(externalRect.top + i11, dimensionPixelSize));
                readerPreviewActivity.R3();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class h0 implements qg.f {
        public h0() {
        }
    }

    /* loaded from: classes3.dex */
    public class h1 extends pdf.pdfreader.viewer.editor.free.utils.l0 {
        public h1() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.l0
        public final void a(View view) {
            b0 b0Var;
            b0 b0Var2;
            ExecutorService executorService = ReaderPreviewActivity.U5;
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            readerPreviewActivity.getClass();
            readerPreviewActivity.p3();
            boolean z10 = true;
            switch (view.getId()) {
                case R.id.editButtonContainer /* 2131362491 */:
                    if (readerPreviewActivity.I5) {
                        readerPreviewActivity.h(view.getResources().getString(R.string.arg_res_0x7f1300d4));
                        return;
                    }
                    readerPreviewActivity.f26169d3 = ea.a.p("VmR0", "jHMEekaw");
                    readerPreviewActivity.f26223n1 = ea.a.p("VmQidA==", "K3SgoW1p");
                    readerPreviewActivity.f26229o1 = ea.a.p("VmQidA==", "ro2kHv30");
                    readerPreviewActivity.f26174e3 = ea.a.p("KmRYdA==", "MkCGMkKj");
                    readerPreviewActivity.K = pdf.pdfreader.viewer.editor.free.utils.q0.l(readerPreviewActivity, 2, "pdf_edit_type_in_158");
                    ReaderPreviewActivity.k2(readerPreviewActivity);
                    return;
                case R.id.iv_ai_assistant /* 2131362885 */:
                    AIEventCenter.f28648a.getClass();
                    AIEventCenter.b();
                    tn.a.d(readerPreviewActivity, ea.a.p("RWkudw==", "vLwurKhS"), ea.a.p("RWkudyxhC18RbF1jaw==", "78WwsC58"), ea.a.p("JmRm", "RRVKFYqw"), false);
                    if (ReaderPreviewActivity.f2(readerPreviewActivity)) {
                        e.a.b(readerPreviewActivity, readerPreviewActivity.f26246r2, 701, 602, ea.a.p("RWkudw==", "Rmtp0Gpu"), ea.a.p("RWkudw==", "oZ58WVAd"), false);
                    }
                    if (pdf.pdfreader.viewer.editor.free.utils.q0.C(readerPreviewActivity)) {
                        pdf.pdfreader.viewer.editor.free.utils.q0.v(readerPreviewActivity);
                    }
                    AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
                    AppCoreFilterEvent.g(ea.a.p("UmkUZR10B3ItY1hpCms=", "701ER7Uc"));
                    return;
                case R.id.iv_open_reflow /* 2131362940 */:
                    androidx.activity.s.x0(readerPreviewActivity);
                    readerPreviewActivity.f26155a5 = true;
                    b0 b0Var3 = readerPreviewActivity.f26276w1;
                    if (b0Var3 != null) {
                        b0Var3.f();
                    }
                    if (pdf.pdfreader.viewer.editor.free.utils.q0.f(readerPreviewActivity, ea.a.p("Q2QtXwNyB3YbZUNfG2UwbCt3bXApaS10", "O04ZNWVj"), true)) {
                        pdf.pdfreader.viewer.editor.free.utils.q0.w(readerPreviewActivity, ea.a.p("Q2QtXwNyB3YbZUNfG2UwbCt3bXApaS10", "HbavU3vK"), false);
                    }
                    View view2 = readerPreviewActivity.f26210l0;
                    if (view2 != null && view2.getVisibility() == 0) {
                        readerPreviewActivity.f26210l0.setVisibility(8);
                    }
                    readerPreviewActivity.M3(true);
                    tn.a.d(readerPreviewActivity, ea.a.p("OWlUdw==", "mRCQZ3CK"), ea.a.p("RWkudyxyB2Yeb0NfCmw_Y2s=", "Aueeo0uv"), ReaderPreviewActivity.h2(readerPreviewActivity) + ea.a.p("Xw==", "AU6NZCdx") + ea.a.p("Q2Rm", "L6j6dD0m"), false);
                    return;
                case R.id.iv_reflow_edit_size_enlarge /* 2131362961 */:
                    lib.zj.pdfeditor.i iVar = i.a.f21508a;
                    if (iVar.f21507d && !readerPreviewActivity.f26204k0 && (b0Var = readerPreviewActivity.f26276w1) != null) {
                        if (a.C0318a.f23099a.a(b0Var.getDisplayedViewIndex()) > 1) {
                            int i10 = iVar.c;
                            if (i10 < 5) {
                                iVar.c = i10 + 1;
                                iVar.a();
                            }
                            b0 b0Var4 = readerPreviewActivity.f26276w1;
                            if (b0Var4 != null) {
                                b0Var4.e0(false);
                            }
                            readerPreviewActivity.K2();
                        } else {
                            readerPreviewActivity.F4();
                        }
                        tn.a.d(readerPreviewActivity, ea.a.p("QWUtbBx3", "8lC9TD0o"), ea.a.p("PWVXbBZ3aGY1bj5fHG4LclBhHWUaYwlpD2s=", "VjsElNmD"), ea.a.p("Q2Rm", "Bkda8rXn"), false);
                        return;
                    }
                    return;
                case R.id.iv_reflow_edit_size_reduce /* 2131362962 */:
                    lib.zj.pdfeditor.i iVar2 = i.a.f21508a;
                    if (iVar2.f21507d && !readerPreviewActivity.f26204k0 && (b0Var2 = readerPreviewActivity.f26276w1) != null) {
                        if (a.C0318a.f23099a.a(b0Var2.getDisplayedViewIndex()) > 1) {
                            int i11 = iVar2.c;
                            if (i11 > 0) {
                                iVar2.c = i11 - 1;
                                iVar2.a();
                            }
                            b0 b0Var5 = readerPreviewActivity.f26276w1;
                            if (b0Var5 != null) {
                                b0Var5.e0(false);
                            }
                            readerPreviewActivity.K2();
                        } else {
                            readerPreviewActivity.F4();
                        }
                        tn.a.d(readerPreviewActivity, ea.a.p("SmUpbD53", "b78OQVgJ"), ea.a.p("PWVXbBZ3aGY1bj5fB2UMdUZlMWMpaQZr", "sfTDxoID"), ea.a.p("RmRm", "qj6xrUgh"), false);
                        return;
                    }
                    return;
                case R.id.moreIv /* 2131363247 */:
                    androidx.activity.s.x0(readerPreviewActivity);
                    pdf.pdfreader.viewer.editor.free.utils.p.s(readerPreviewActivity, readerPreviewActivity.f26245r1, readerPreviewActivity.M);
                    ReaderPreviewActivity.q2(readerPreviewActivity);
                    return;
                case R.id.pageGotoLl /* 2131363459 */:
                    androidx.activity.s.x0(readerPreviewActivity);
                    if (readerPreviewActivity.R2 || readerPreviewActivity.f26251s2 <= 1 || readerPreviewActivity.J) {
                        return;
                    }
                    ReaderPreviewActivity.p2(readerPreviewActivity, false);
                    return;
                case R.id.pdf_toolbar_3_edit_use_guide /* 2131363585 */:
                    readerPreviewActivity.Z4(ea.a.p("KmRYdCZwU2YFaC9sBWMccmpjAmkmaw==", "QUZzmrsw"));
                    readerPreviewActivity.A4();
                    return;
                case R.id.searchIv /* 2131363874 */:
                    readerPreviewActivity.p3();
                    androidx.activity.s.x0(readerPreviewActivity);
                    PdfPreviewEntity pdfPreviewEntity = readerPreviewActivity.f26245r1;
                    String str = pdf.pdfreader.viewer.editor.free.utils.p.f28740a;
                    pdf.pdfreader.viewer.editor.free.utils.p.b(readerPreviewActivity, ea.a.p("RWkudw==", "w25mw6ca"), ea.a.p("PmkSdw5zLWE6Yw5fV2w-Y2s=", "wRHwQHiC"), pdf.pdfreader.viewer.editor.free.utils.p.d(pdfPreviewEntity));
                    readerPreviewActivity.D1.setVisibility(0);
                    readerPreviewActivity.B.setVisibility(8);
                    readerPreviewActivity.N3.setVisibility(8);
                    readerPreviewActivity.s4(8);
                    readerPreviewActivity.f26258t3.setVisibility(8);
                    readerPreviewActivity.f26258t3.setForceDismiss(true);
                    ea.a.p("HWVQZBxyZ3I_diNlAkELdFx2B3R5", "PTWNFXEb");
                    ea.a.p("IG5ybBBjXDp6cy9hB2No", "hCohOo8b");
                    String str2 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                    readerPreviewActivity.D1.setText("");
                    readerPreviewActivity.g4();
                    return;
                case R.id.shareIv /* 2131363947 */:
                    androidx.activity.s.x0(readerPreviewActivity);
                    pdf.pdfreader.viewer.editor.free.utils.t1.b(ea.a.p("Ri1ZLVgtJWUpZANyZHIydlFlJUEqdF92HXQIICJoI3IOSQIgEG4jaTx5PQ==", "4HktuWIs") + readerPreviewActivity.f26245r1 + ea.a.p("HyAmdQFpPQ==", "5QHJlFmc") + readerPreviewActivity.Q);
                    pdf.pdfreader.viewer.editor.free.utils.p.r(readerPreviewActivity, readerPreviewActivity.f26245r1, readerPreviewActivity.M);
                    PdfPreviewEntity pdfPreviewEntity2 = readerPreviewActivity.f26245r1;
                    if (pdfPreviewEntity2 != null) {
                        pdf.pdfreader.viewer.editor.free.utils.e1.e(readerPreviewActivity, pdfPreviewEntity2);
                        return;
                    }
                    return;
                case R.id.viewSetting /* 2131364608 */:
                    pdf.pdfreader.viewer.editor.free.utils.p.b(readerPreviewActivity, ea.a.p("OWlUdw==", "iIVwNDye"), ea.a.p("RWkudyx2C2UFc1F0NmM6aSdr", "0IrLmHCH"), pdf.pdfreader.viewer.editor.free.utils.p.d(readerPreviewActivity.f26245r1));
                    if (readerPreviewActivity.f26256t1 != null) {
                        boolean z11 = readerPreviewActivity.M;
                        int countPages = readerPreviewActivity.f26256t1.countPages();
                        if (readerPreviewActivity.getResources().getConfiguration().orientation != 1) {
                            z10 = false;
                        }
                        PreviewViewSettingsDialog previewViewSettingsDialog = new PreviewViewSettingsDialog(readerPreviewActivity, 1, z11, countPages, z10);
                        readerPreviewActivity.f26294z = previewViewSettingsDialog;
                        previewViewSettingsDialog.C = new ao.r1(readerPreviewActivity);
                        previewViewSettingsDialog.D = new ao.s1(readerPreviewActivity);
                        previewViewSettingsDialog.E = new ao.u1(readerPreviewActivity);
                        readerPreviewActivity.W1(previewViewSettingsDialog);
                        pdf.pdfreader.viewer.editor.free.utils.p.b(readerPreviewActivity, ea.a.p("QWktdw==", "oO7Hb3C3"), ea.a.p("RWkudyx2C2UFc1F0NnM-b3c=", "LDq75TC8"), pdf.pdfreader.viewer.editor.free.utils.p.d(readerPreviewActivity.f26245r1));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* loaded from: classes3.dex */
    public class i implements androidx.lifecycle.x<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Bundle f26334a;

        public i(Bundle bundle) {
            this.f26334a = bundle;
        }

        @Override // androidx.lifecycle.x
        public final void m(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 == null) {
                ea.a.p("HHBdYQpoe287ZCNuEkYaYVJtC250", "G24l1lOn");
                ea.a.p("B3A6YUpoAkkbdAd0USA5dVRs", "3htV9Wj2");
                return;
            }
            ea.a.p("YHAnYQBoLm8TZF1uDkYkYSNtV250", "aXU1vzpC");
            ea.a.p("PHBdYQpoYkkJdCt0ECA=", "kExPXmrr");
            if (!bool2.booleanValue()) {
                ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
                FrameLayout frameLayout = readerPreviewActivity.H2;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                Bundle bundle = this.f26334a;
                if (!readerPreviewActivity.J2(bundle) && !readerPreviewActivity.G2(bundle)) {
                    readerPreviewActivity.z3(bundle);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class i0 implements com.lib.flutter.encrypt.e {
        public i0() {
        }

        @Override // com.lib.flutter.encrypt.e
        public final void a(String str) {
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            if (pdf.pdfreader.viewer.editor.free.utils.extension.a.c(readerPreviewActivity)) {
                if (BillingConfigImpl.c.w()) {
                    String p10 = ea.a.p("P3JUbRB1WiAvcy9yWSAba1xwTnA3ZRNpEXcBbxt0Nm0NYV9uHHIXczJvdw==", "8KcztCoY");
                    int i10 = zk.a.f32399a;
                    pdf.pdfreader.viewer.editor.free.utils.t1.b(p10);
                    return;
                }
                ViewGroup viewGroup = readerPreviewActivity.U3;
                if (viewGroup != null) {
                    gl.o.f17931a.getClass();
                    gl.o.a(str, viewGroup);
                    gl.o.b();
                }
            }
        }

        @Override // com.lib.flutter.encrypt.e
        public final void b() {
            ViewGroup viewGroup;
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            if (pdf.pdfreader.viewer.editor.free.utils.extension.a.c(readerPreviewActivity) && (viewGroup = readerPreviewActivity.U3) != null && viewGroup.getChildCount() > 0 && (readerPreviewActivity.U3.getChildAt(0) instanceof BannerLoadingAnimation)) {
                readerPreviewActivity.U3.removeAllViews();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class i1 extends androidx.fragment.app.w {
        public i1() {
        }

        @Override // oo.a
        public final void a() {
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            if (readerPreviewActivity.f26284x2 == null) {
                pdf.pdfreader.viewer.editor.free.ui.dialog.d dVar = new pdf.pdfreader.viewer.editor.free.ui.dialog.d(readerPreviewActivity, false);
                readerPreviewActivity.f26284x2 = dVar;
                dVar.a(R.string.arg_res_0x7f1303a6);
            }
            readerPreviewActivity.W1(readerPreviewActivity.f26284x2);
            pdf.pdfreader.viewer.editor.free.utils.t0.V().execute(new ao.o(readerPreviewActivity, 1));
        }
    }

    /* loaded from: classes3.dex */
    public class j extends AnimatorListenerAdapter {
        public j() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            LinearLayout linearLayout = readerPreviewActivity.f26288y0;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            LinearLayout linearLayout2 = readerPreviewActivity.J3;
            if (linearLayout2 != null && !linearLayout2.isSelected()) {
                FrameLayout frameLayout = readerPreviewActivity.B0;
                if (frameLayout != null) {
                    frameLayout.setSelected(false);
                }
                AppCompatImageView appCompatImageView = readerPreviewActivity.C0;
                if (appCompatImageView != null) {
                    appCompatImageView.setImageTintList(ColorStateList.valueOf(androidx.core.content.a.getColor(readerPreviewActivity, R.color.colorSurface)));
                }
                ConstraintLayout constraintLayout = readerPreviewActivity.f26295z0;
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(4);
                }
                View view = readerPreviewActivity.E3;
                if (view != null) {
                    view.setBackgroundColor(androidx.core.content.a.getColor(readerPreviewActivity, R.color.colorEditDivider));
                }
                View view2 = readerPreviewActivity.E0;
                if (view2 != null) {
                    view2.setVisibility(4);
                }
                AppCompatImageView appCompatImageView2 = readerPreviewActivity.D0;
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setVisibility(0);
                    readerPreviewActivity.D0.setAlpha(1.0f);
                }
                View view3 = readerPreviewActivity.A0;
                if (view3 != null) {
                    view3.setVisibility(4);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class j0 implements ReaderView.h {
        public j0() {
        }

        @Override // lib.zj.pdfeditor.ReaderView.h
        public final void a(boolean z10) {
            b0 b0Var;
            boolean z11;
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            FrameLayout frameLayout = readerPreviewActivity.O;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            if (!readerPreviewActivity.isFinishing() && (b0Var = readerPreviewActivity.f26276w1) != null && readerPreviewActivity.f26283x1 != null) {
                boolean z12 = !b0Var.N();
                readerPreviewActivity.R2 = z12;
                boolean z13 = readerPreviewActivity.f26289y1;
                Handler handler = readerPreviewActivity.D;
                if (!z13) {
                    if (!readerPreviewActivity.J) {
                        readerPreviewActivity.K3(!z10);
                    }
                    w wVar = readerPreviewActivity.N2;
                    handler.removeCallbacks(wVar);
                    handler.postDelayed(wVar, 2000L);
                } else if (!readerPreviewActivity.J) {
                    if (!z12 && !z10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    readerPreviewActivity.K3(z11);
                }
                if (z10) {
                    if (readerPreviewActivity.J) {
                        ConstraintLayout constraintLayout = readerPreviewActivity.W1;
                        if (constraintLayout != null) {
                            constraintLayout.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    if (readerPreviewActivity.W1 == null) {
                        TextView textView = readerPreviewActivity.f26185g4;
                        if (textView != null && textView.getVisibility() == 0) {
                            ViewGroup viewGroup = readerPreviewActivity.f26242q3;
                            if (viewGroup != null) {
                                viewGroup.setVisibility(4);
                            }
                            w1 w1Var = readerPreviewActivity.U4;
                            w1Var.run();
                            handler.removeCallbacks(w1Var);
                        }
                        try {
                            ViewStub viewStub = readerPreviewActivity.O1;
                            if (viewStub != null) {
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) viewStub.inflate();
                                readerPreviewActivity.W1 = constraintLayout2;
                                TextView textView2 = (TextView) constraintLayout2.findViewById(R.id.preview_current_page_number_tv);
                                readerPreviewActivity.X1 = textView2;
                                Locale locale = Locale.ENGLISH;
                                textView2.setText(String.format(locale, ea.a.p("bGQg", "bBInvrqZ"), Integer.valueOf(readerPreviewActivity.B2 + 1)));
                                TextView textView3 = (TextView) readerPreviewActivity.W1.findViewById(R.id.preview_total_page_number_tv);
                                if (readerPreviewActivity.f26251s2 > 0) {
                                    textView3.setText(String.format(locale, ea.a.p("FmQg", "uAxj5rmV"), Integer.valueOf(readerPreviewActivity.f26251s2)));
                                }
                            }
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                    ConstraintLayout constraintLayout3 = readerPreviewActivity.W1;
                    if (constraintLayout3 != null && constraintLayout3.getVisibility() != 0) {
                        readerPreviewActivity.W1.setAlpha(1.0f);
                        readerPreviewActivity.W1.setVisibility(0);
                    }
                    a aVar = readerPreviewActivity.f26171d5;
                    handler.removeCallbacks(aVar);
                    handler.postDelayed(aVar, 200L);
                    return;
                }
                readerPreviewActivity.m3();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class j1 implements x0.u {
        public j1() {
        }

        @Override // x0.u
        public final x0.s0 m(View view, x0.s0 s0Var) {
            o0.b a10 = s0Var.a(7);
            ExecutorService executorService = ReaderPreviewActivity.U5;
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            Handler handler = readerPreviewActivity.D;
            ao.p pVar = readerPreviewActivity.C5;
            handler.removeCallbacks(pVar);
            handler.post(pVar);
            if (!readerPreviewActivity.hasWindowFocus() && a10.f22640b == 0) {
                return s0Var;
            }
            FrameLayout frameLayout = readerPreviewActivity.H2;
            if (frameLayout != null) {
                int i10 = a10.f22640b;
                if (i10 <= 0) {
                    i10 = frameLayout.getPaddingTop();
                }
                int i11 = a10.f22641d;
                if (i11 <= 0) {
                    i11 = readerPreviewActivity.H2.getPaddingBottom();
                }
                frameLayout.setPadding(0, i10, 0, i11);
            }
            return s0Var;
        }
    }

    /* loaded from: classes3.dex */
    public class k implements a.d {
        public k() {
        }

        @Override // jl.a.d
        public final void B(boolean z10) {
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            if (z10) {
                ExecutorService executorService = ReaderPreviewActivity.U5;
                readerPreviewActivity.z3(null);
                return;
            }
            ExecutorService executorService2 = ReaderPreviewActivity.U5;
            readerPreviewActivity.Z2();
        }
    }

    /* loaded from: classes3.dex */
    public class k0 implements qg.d {
        public k0() {
        }

        public final void a() {
            PageView pageView;
            androidx.activity.f.q("HWVQZBxyZ3I_diNlAkELdFx2B3Q8YgBmW3IhQ15hNmdl", "fXfj4D6X", dp.a.a());
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            b0 b0Var = readerPreviewActivity.f26276w1;
            if (b0Var != null && (pageView = (PageView) b0Var.getDisplayedView()) != null) {
                if (readerPreviewActivity.A1 == AcceptMode.CopyText) {
                    pageView.b();
                } else {
                    pageView.b1();
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class k1 extends androidx.fragment.app.w {
        public k1() {
        }

        @Override // oo.a
        public final void a() {
            ExecutorService executorService = ReaderPreviewActivity.U5;
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            readerPreviewActivity.getClass();
            readerPreviewActivity.d4(new pdf.pdfreader.viewer.editor.free.pdfview.c(readerPreviewActivity, 1));
        }

        @Override // androidx.fragment.app.w, oo.a
        public final void cancel() {
            ExecutorService executorService = ReaderPreviewActivity.U5;
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            readerPreviewActivity.U3();
            ReaderPDFCore readerPDFCore = readerPreviewActivity.f26256t1;
            if (readerPDFCore != null) {
                readerPDFCore.setSkipStamp(-1);
            }
            b0 b0Var = readerPreviewActivity.f26276w1;
            if (b0Var != null) {
                for (Map.Entry<ij.d, View> entry : b0Var.getAllCacheViews().entrySet()) {
                    entry.getKey().getClass();
                    View value = entry.getValue();
                    Rect rect = new Rect();
                    value.getLocalVisibleRect(rect);
                    if (rect.height() > 0 && (value instanceof PDFPageView)) {
                        PDFPageView pDFPageView = (PDFPageView) value;
                        pDFPageView.setMode(PDFReaderView.Mode.Viewing);
                        ea.a.p("KXk2RT1U", "lJdbnh9T");
                        ea.a.p("IG5zYRprZ3I_czllESAbZUFNAWQgIDZ0U20eICJwIGE7ZQ==", "pYZK2nWD");
                        String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                        pDFPageView.G();
                    }
                }
            }
            readerPreviewActivity.S3();
            readerPreviewActivity.o4();
            readerPreviewActivity.U4();
            readerPreviewActivity.H2();
            readerPreviewActivity.B1(readerPreviewActivity.f26274w);
        }
    }

    /* loaded from: classes3.dex */
    public class l implements g3.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f26344a;

        public l(int i10) {
            this.f26344a = i10;
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.g3.a
        public final void a() {
            int i10 = this.f26344a;
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            readerPreviewActivity.P4 = i10;
            BaseSubscriptionActivity.a aVar = BaseSubscriptionActivity.L;
            String p10 = ea.a.p("QGksbg==", "Pu5bReVE");
            aVar.getClass();
            BaseSubscriptionActivity.a.a(readerPreviewActivity, p10);
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.g3.a
        public final void b() {
            ExecutorService executorService = ReaderPreviewActivity.U5;
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            readerPreviewActivity.U3();
            readerPreviewActivity.S3();
            b0 b0Var = readerPreviewActivity.f26276w1;
            if (b0Var != null) {
                b0Var.u0(true);
            }
            readerPreviewActivity.O3(this.f26344a);
        }
    }

    /* loaded from: classes3.dex */
    public class l0 extends lib.zj.pdfeditor.p0 {
        public l0(Context context, ReaderPDFCore readerPDFCore) {
            super(context, readerPDFCore);
        }

        @Override // lib.zj.pdfeditor.p0
        public final void b(lib.zj.pdfeditor.q0 q0Var, boolean z10) {
            int i10;
            View view;
            boolean z11;
            ea.a.p("HWVQZBxyZ3I_diNlAkELdFx2B3R5", "r6zOzWVR");
            ea.a.p("XG4fZQt0JG8HblAyWzog", "etn36Ip5");
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            if (!z10) {
                if (q0Var != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ExecutorService executorService = ReaderPreviewActivity.U5;
                readerPreviewActivity.O4(z11, true);
            }
            if (readerPreviewActivity.M1 == null && (view = readerPreviewActivity.f26283x1) != null) {
                readerPreviewActivity.M1 = (Group) view.findViewById(R.id.emptyGroup);
            }
            if (q0Var == null) {
                ea.a.p("KGVYZBRyEnItdg9lQ0E0dFF2O3R5", "uYz9qBDT");
                ea.a.p("XG4fZQt0JG8HblA6Sef_ug==", "DH0PG086");
                String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                if (!readerPreviewActivity.Z2 && !readerPreviewActivity.Y2 && !z10) {
                    ReaderPreviewActivity.o2(readerPreviewActivity, true);
                    return;
                }
                return;
            }
            ReaderPreviewActivity.o2(readerPreviewActivity, false);
            lib.zj.pdfeditor.q0.f21567d = q0Var;
            ea.a.p("1ZDX58eihbvh5qqc", "3Z6bo3ES");
            ea.a.p("cC0g", "zXPiqW7I");
            if (!z10) {
                long[] b10 = pdf.pdfreader.viewer.editor.free.utils.q0.b(readerPreviewActivity, null);
                if (b10 != null && b10.length == 3) {
                    i10 = (int) b10[0];
                } else {
                    i10 = -1;
                }
                int i11 = q0Var.f21569b;
                if (-1 == i10 || i10 != i11) {
                    readerPreviewActivity.f26276w1.setDisplayedViewIndex(i11);
                }
            }
            b0 b0Var = readerPreviewActivity.f26276w1;
            if (b0Var != null) {
                b0Var.g0();
            }
            if (readerPreviewActivity.Y2 && readerPreviewActivity.X2 == 0 && !z10) {
                long[] b11 = pdf.pdfreader.viewer.editor.free.utils.q0.b(readerPreviewActivity, null);
                if (b11 != null && b11.length == 3) {
                    ea.a.p("XG4fZQt0JG8HblA6SWI3Yy_kio2vh87nxK6Mvbjnja4g", "yh50zCFQ");
                } else {
                    readerPreviewActivity.X2 = q0Var.c.length - 1;
                    ea.a.p("C24WZSp0JW89bgI6FObHnN-08OXBsNG75-bvnDNhIWtEbCNzJi0=", "lwdBRcHr");
                    long j10 = readerPreviewActivity.X2;
                    b0 b0Var2 = readerPreviewActivity.f26276w1;
                    if (b0Var2 != null) {
                        b0Var2.setCurrentSearchBoxIdx(j10);
                    }
                }
            } else if (readerPreviewActivity.Z2 && readerPreviewActivity.X2 > 0 && !z10) {
                long[] b12 = pdf.pdfreader.viewer.editor.free.utils.q0.b(readerPreviewActivity, null);
                if (b12 != null && b12.length == 3) {
                    ea.a.p("Hm4sZTt0Km89bgI6FGYgZBjk6o2gh7vnya6Vvdzn_64g", "sCqxCll6");
                } else {
                    readerPreviewActivity.X2 = 0L;
                    ea.a.p("XG4fZQt0JG8HblA6SebGnKO0kOXOsKS72ebZnCJ3EiBVaTlzBy0=", "JGDvkup0");
                    long j11 = readerPreviewActivity.X2;
                    b0 b0Var3 = readerPreviewActivity.f26276w1;
                    if (b0Var3 != null) {
                        b0Var3.setCurrentSearchBoxIdx(j11);
                    }
                }
            }
            if (!z10) {
                if (readerPreviewActivity.Y2 || readerPreviewActivity.Z2) {
                    ea.a.p("2p3V5vqLh4ra5o-RjIr-7_iM1rjS5tuv1IKN5e67n7eV5cSzlZPv5M-c", "34iz5Ium");
                    readerPreviewActivity.N2();
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class l1 implements oo.a {
        public l1() {
        }

        @Override // oo.a
        public final void a() {
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            readerPreviewActivity.V2(1, readerPreviewActivity.K);
        }

        @Override // oo.a
        public final void cancel() {
            pdf.pdfreader.viewer.editor.free.utils.w0.a().c.execute(new b1.e(this, 24));
        }
    }

    /* loaded from: classes3.dex */
    public class m implements a.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Bundle f26348a;

        public m(Bundle bundle) {
            this.f26348a = bundle;
        }

        @Override // jl.a.d
        public final void B(boolean z10) {
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            if (z10) {
                ExecutorService executorService = ReaderPreviewActivity.U5;
                readerPreviewActivity.z3(this.f26348a);
                return;
            }
            ExecutorService executorService2 = ReaderPreviewActivity.U5;
            readerPreviewActivity.Z2();
        }
    }

    /* loaded from: classes3.dex */
    public class m1 implements a.e {
        public m1() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.ads.a.e
        public final void d(Dialog dialog) {
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            readerPreviewActivity.B1(dialog);
            ea.a.p("YWUqZBZyMnIXdl1lHkE1dC12W3R5", "cinaKYBq");
            ea.a.p("Hi1mcxtvFUEWcxktSWw5YSBpXGcHZDBGIW4scwAyVzIeLWYtLQ==", "HEhe0Pdv");
            String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
            readerPreviewActivity.O4 = true;
            tf.c cVar = FullScreenManage.f23914a;
            FullScreenManage.h(readerPreviewActivity, ea.a.p("PnVYdA==", "RJfCdKFv"), false);
            pdf.pdfreader.viewer.editor.free.fnbridge.b bVar = ea.a.f16524i;
            if (bVar != null) {
                bVar.n();
            }
            pdf.pdfreader.viewer.editor.free.fnbridge.b bVar2 = ea.a.f16525j;
            if (bVar2 != null) {
                bVar2.n();
            }
            ea.a.f16525j = null;
        }
    }

    /* loaded from: classes3.dex */
    public class n0 implements TextView.OnEditorActionListener {
        public n0() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            if (i10 == 3) {
                ExecutorService executorService = ReaderPreviewActivity.U5;
                ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
                readerPreviewActivity.q3();
                if (!TextUtils.isEmpty(readerPreviewActivity.D1.getText().toString().trim())) {
                    readerPreviewActivity.Y2 = false;
                    readerPreviewActivity.Z2 = false;
                    a2.f26308b = false;
                    readerPreviewActivity.N2();
                    long j10 = 0;
                    readerPreviewActivity.X2 = j10;
                    b0 b0Var = readerPreviewActivity.f26276w1;
                    if (b0Var != null) {
                        b0Var.setCurrentSearchBoxIdx(j10);
                    }
                    ea.a.p("0IfZ5uSwsJDU59Ki27zb5YWTt4nE6Ze1", "NH9TrV99");
                    ReaderPreviewActivity.l2(readerPreviewActivity);
                    readerPreviewActivity.W2 = true;
                }
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public class n1 implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f26355a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewGroup.LayoutParams f26356b;
        public final /* synthetic */ int c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ boolean f26357d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ boolean f26358e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ViewGroup.LayoutParams f26359f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ int f26360g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ boolean f26361h;

        public n1(boolean z10, ViewGroup.LayoutParams layoutParams, int i10, boolean z11, boolean z12, ViewGroup.LayoutParams layoutParams2, int i11, boolean z13) {
            this.f26355a = z10;
            this.f26356b = layoutParams;
            this.c = i10;
            this.f26357d = z11;
            this.f26358e = z12;
            this.f26359f = layoutParams2;
            this.f26360g = i11;
            this.f26361h = z13;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            boolean z10 = this.f26355a;
            int i10 = this.c;
            ViewGroup.LayoutParams layoutParams = this.f26356b;
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            if (z10) {
                layoutParams.height = (int) (((i10 - readerPreviewActivity.f26152a2.getHeight()) * floatValue) + readerPreviewActivity.f26152a2.getHeight());
            }
            if (this.f26357d) {
                layoutParams.height = (int) ((1.0f - floatValue) * readerPreviewActivity.f26152a2.getHeight());
            }
            boolean z11 = this.f26358e;
            ViewGroup.LayoutParams layoutParams2 = this.f26359f;
            if (z11) {
                layoutParams2.height = (int) (((this.f26360g - readerPreviewActivity.T.getHeight()) * floatValue) + readerPreviewActivity.T.getHeight());
            }
            if (this.f26361h) {
                layoutParams2.height = (int) ((1.0f - floatValue) * readerPreviewActivity.T.getHeight());
            }
            readerPreviewActivity.f26152a2.setLayoutParams(layoutParams);
            readerPreviewActivity.T.setLayoutParams(layoutParams2);
            View view = readerPreviewActivity.f26157b2;
            if (view != null && view.getVisibility() == 0) {
                ViewGroup.LayoutParams layoutParams3 = readerPreviewActivity.f26157b2.getLayoutParams();
                layoutParams3.height = (int) ((1.0f - floatValue) * i10);
                readerPreviewActivity.f26157b2.setLayoutParams(layoutParams3);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            PreviewPDF2WordStateView previewPDF2WordStateView = readerPreviewActivity.f26170d4;
            if (previewPDF2WordStateView != null) {
                previewPDF2WordStateView.d();
            }
            readerPreviewActivity.I5 = false;
        }
    }

    /* loaded from: classes3.dex */
    public class o0 implements View.OnClickListener {
        public o0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            ReaderPreviewActivity.o2(readerPreviewActivity, false);
            readerPreviewActivity.Y2 = false;
            readerPreviewActivity.Z2 = false;
            a2.f26308b = false;
            readerPreviewActivity.W2 = false;
            EditText editText = readerPreviewActivity.D1;
            if (editText != null && !TextUtils.isEmpty(editText.getText().toString())) {
                readerPreviewActivity.X2 = 0L;
                readerPreviewActivity.D1.setText("");
                readerPreviewActivity.B.setVisibility(8);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o1 extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f26365a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f26366b;

        public o1(boolean z10, boolean z11) {
            this.f26365a = z10;
            this.f26366b = z11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            boolean z10 = this.f26365a;
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            if (z10) {
                readerPreviewActivity.f26152a2.setVisibility(8);
            }
            if (this.f26366b) {
                readerPreviewActivity.T.setVisibility(8);
            }
            View view = readerPreviewActivity.f26157b2;
            if (view != null && view.getVisibility() == 0) {
                readerPreviewActivity.f26157b2.setVisibility(8);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class p implements androidx.lifecycle.x<Boolean> {
        public p() {
        }

        @Override // androidx.lifecycle.x
        public final void m(Boolean bool) {
            boolean z10;
            Boolean bool2 = bool;
            ExecutorService executorService = ReaderPreviewActivity.U5;
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            if (readerPreviewActivity.f26175e4 != null) {
                BillingConfigImpl billingConfigImpl = BillingConfigImpl.c;
                if (billingConfigImpl.z() && !billingConfigImpl.w() && BillingConfigImpl.u()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    readerPreviewActivity.f26175e4.setVisibility(0);
                } else {
                    readerPreviewActivity.f26175e4.setVisibility(8);
                }
            }
            if (bool2 != null && bool2.booleanValue()) {
                ViewGroup viewGroup = readerPreviewActivity.U3;
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                    readerPreviewActivity.U3.setVisibility(8);
                }
                gl.o.f17931a.getClass();
                gl.p.f17933p.e(readerPreviewActivity);
                gl.q.f17934p.e(readerPreviewActivity);
                ImageView imageView = readerPreviewActivity.f26255t0;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class p0 implements View.OnClickListener {

        /* loaded from: classes3.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                p0 p0Var = p0.this;
                ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
                b0 b0Var = readerPreviewActivity.f26276w1;
                if (b0Var != null) {
                    b0Var.setCurrentSearchBoxIdx(readerPreviewActivity.X2);
                }
                ReaderPreviewActivity.l2(ReaderPreviewActivity.this);
            }
        }

        public p0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            RectF[] rectFArr;
            int length;
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            readerPreviewActivity.Y2 = true;
            readerPreviewActivity.Z2 = false;
            a2.f26308b = false;
            long[] b10 = pdf.pdfreader.viewer.editor.free.utils.q0.b(readerPreviewActivity, null);
            if (b10 != null && b10.length == 3 && readerPreviewActivity.f26276w1 != null) {
                a2.f26307a = b10[0];
                long j10 = b10[1];
                readerPreviewActivity.X2 = j10;
                long j11 = b10[2] - 1;
                if (j10 > j11) {
                    readerPreviewActivity.X2 = j11;
                }
                long j12 = readerPreviewActivity.X2;
                if (j12 > 0) {
                    readerPreviewActivity.X2 = j12 - 1;
                }
                ea.a.p("DWFSa1nmtqK_pMfo27CNvaDn9ISsodDn-IGWksDp8Zirup8g", "OnnzXsLZ");
                ea.a.p("LA==", "gc8O6QNg");
                readerPreviewActivity.f26276w1.setDisplayedViewIndex((int) a2.f26307a);
                readerPreviewActivity.f26276w1.post(new a());
                return;
            }
            readerPreviewActivity.N2();
            ea.a.p("cWEoa1Pl1aaXj4cg", "VwsK930s");
            lib.zj.pdfeditor.q0 q0Var = lib.zj.pdfeditor.q0.f21567d;
            if (q0Var != null && (rectFArr = q0Var.c) != null && (length = rectFArr.length) > 0) {
                long j13 = readerPreviewActivity.X2;
                if (j13 > 0 && j13 <= length - 1) {
                    long j14 = j13 - 1;
                    readerPreviewActivity.X2 = j14;
                    b0 b0Var = readerPreviewActivity.f26276w1;
                    if (b0Var != null) {
                        b0Var.setCurrentSearchBoxIdx(j14);
                    }
                } else {
                    readerPreviewActivity.f4(-1, false);
                }
                ea.a.p("UWEoa0kg", "a84bXMDC");
                ea.a.p("RGxcbi0=", "jEd9IVmg");
            }
        }
    }

    /* loaded from: classes3.dex */
    public class p1 implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f26370a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewGroup.LayoutParams f26371b;
        public final /* synthetic */ int c;

        public p1(boolean z10, ViewGroup.LayoutParams layoutParams, int i10) {
            this.f26370a = z10;
            this.f26371b = layoutParams;
            this.c = i10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            if (readerPreviewActivity.f26152a2 != null && readerPreviewActivity.f26157b2 != null && !pdf.pdfreader.viewer.editor.free.utils.extension.a.b(readerPreviewActivity)) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                boolean z10 = this.f26370a;
                int i10 = this.c;
                ViewGroup.LayoutParams layoutParams = this.f26371b;
                if (z10) {
                    layoutParams.height = (int) ((1.0f - floatValue) * i10);
                } else {
                    layoutParams.height = (int) (i10 * floatValue);
                }
                readerPreviewActivity.f26157b2.setLayoutParams(layoutParams);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class q implements fn.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f26373a;

        /* loaded from: classes3.dex */
        public class a implements g3.a {
            public a() {
            }

            @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.g3.a
            public final void a() {
                q qVar = q.this;
                ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
                readerPreviewActivity.P4 = qVar.f26373a;
                BaseSubscriptionActivity.a aVar = BaseSubscriptionActivity.L;
                String p10 = ea.a.p("PGQsdA==", "f9YEwfQX");
                aVar.getClass();
                BaseSubscriptionActivity.a.a(readerPreviewActivity, p10);
            }

            @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.g3.a
            public final void b() {
                q qVar = q.this;
                ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
                ExecutorService executorService = ReaderPreviewActivity.U5;
                readerPreviewActivity.M2();
                ReaderPreviewActivity.this.O3(qVar.f26373a);
            }
        }

        public q(int i10) {
            this.f26373a = i10;
        }

        @Override // fn.a
        public final void a(c.a.C0222a c0222a) {
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            if (readerPreviewActivity.S5 == null) {
                readerPreviewActivity.S5 = new EditorFreeSaveDialog(readerPreviewActivity);
            }
            readerPreviewActivity.S5.I(false);
            EditorFreeSaveDialog editorFreeSaveDialog = readerPreviewActivity.S5;
            editorFreeSaveDialog.f25616y = new pdf.pdfreader.viewer.editor.free.pdfview.g(this, c0222a);
            editorFreeSaveDialog.show();
        }

        @Override // fn.a
        public final void b() {
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            if (readerPreviewActivity.H0 == null) {
                readerPreviewActivity.H0 = new g3(readerPreviewActivity);
            }
            readerPreviewActivity.H0.f27599y = ea.a.p("VmQidANkZg==", "zyWSz7DT");
            g3 g3Var = readerPreviewActivity.H0;
            g3Var.f27600z = new a();
            g3Var.show();
        }
    }

    /* loaded from: classes3.dex */
    public class q0 implements View.OnClickListener {

        /* loaded from: classes3.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                q0 q0Var = q0.this;
                ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
                b0 b0Var = readerPreviewActivity.f26276w1;
                if (b0Var != null) {
                    b0Var.setCurrentSearchBoxIdx(readerPreviewActivity.X2);
                }
                ReaderPreviewActivity.l2(ReaderPreviewActivity.this);
            }
        }

        public q0() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            RectF[] rectFArr;
            int length;
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            readerPreviewActivity.Y2 = false;
            readerPreviewActivity.Z2 = true;
            a2.f26308b = false;
            long[] b10 = pdf.pdfreader.viewer.editor.free.utils.q0.b(readerPreviewActivity, null);
            if (b10 != null && b10.length == 3 && readerPreviewActivity.f26276w1 != null) {
                a2.f26307a = b10[0];
                long j10 = b10[1];
                readerPreviewActivity.X2 = j10;
                long j11 = b10[2];
                if (j10 >= 0) {
                    readerPreviewActivity.X2 = j10 + 1;
                }
                long j12 = j11 - 1;
                if (readerPreviewActivity.X2 > j12) {
                    readerPreviewActivity.X2 = j12;
                }
                ea.a.p("dXcvIJWBwOXWjdyu2eXrlaOatunntaSgyeWrjJmrruSJriA=", "H9p66Xai");
                ea.a.p("LA==", "RMJI5JOk");
                ea.a.p("LA==", "w3cCimcR");
                readerPreviewActivity.f26276w1.setDisplayedViewIndex((int) a2.f26307a);
                readerPreviewActivity.f26276w1.post(new a());
                return;
            }
            readerPreviewActivity.N2();
            ea.a.p("BHcXILS3kuXHsyA=", "9MBsQ49h");
            lib.zj.pdfeditor.q0 q0Var = lib.zj.pdfeditor.q0.f21567d;
            if (q0Var != null && (rectFArr = q0Var.c) != null && (length = rectFArr.length) > 0) {
                long j13 = readerPreviewActivity.X2;
                if (j13 >= 0 && j13 < length - 1) {
                    long j14 = j13 + 1;
                    readerPreviewActivity.X2 = j14;
                    b0 b0Var = readerPreviewActivity.f26276w1;
                    if (b0Var != null) {
                        b0Var.setCurrentSearchBoxIdx(j14);
                    }
                } else {
                    readerPreviewActivity.f4(1, false);
                }
                ea.a.p("KXdVOiA=", "XDyIWJtf");
                ea.a.p("E2wubi0=", "ZGTBrSVi");
            }
        }
    }

    /* loaded from: classes3.dex */
    public class q1 extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f26378a;

        public q1(boolean z10) {
            this.f26378a = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            View view;
            super.onAnimationEnd(animator);
            if (this.f26378a && (view = ReaderPreviewActivity.this.f26157b2) != null) {
                view.setVisibility(8);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class r extends androidx.fragment.app.w {
        public r() {
        }

        @Override // oo.a
        public final void a() {
            ExecutorService executorService = ReaderPreviewActivity.U5;
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            readerPreviewActivity.c4(1, null);
            readerPreviewActivity.B1(readerPreviewActivity.f26274w);
        }

        @Override // androidx.fragment.app.w, oo.a
        public final void cancel() {
            ExecutorService executorService = ReaderPreviewActivity.U5;
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            readerPreviewActivity.M2();
            readerPreviewActivity.W3();
            readerPreviewActivity.H2();
            readerPreviewActivity.B1(readerPreviewActivity.f26274w);
        }
    }

    /* loaded from: classes3.dex */
    public class r1 implements View.OnClickListener {
        public r1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            DrawSignView drawSignView = ReaderPreviewActivity.this.f26244r0;
            drawSignView.f28183a.f1044m.C();
            drawSignView.f28183a.c.C();
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class s {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f26383a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f26384b;
        public static final /* synthetic */ int[] c;

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ int[] f26385d;

        /* renamed from: e  reason: collision with root package name */
        public static final /* synthetic */ int[] f26386e;

        /* renamed from: f  reason: collision with root package name */
        public static final /* synthetic */ int[] f26387f;

        static {
            int[] iArr = new int[PDFTextEditorMode.values().length];
            f26387f = iArr;
            try {
                iArr[PDFTextEditorMode.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26387f[PDFTextEditorMode.TEXT_AND_IMG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26387f[PDFTextEditorMode.ADD_TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[TextEditorState.values().length];
            f26386e = iArr2;
            try {
                iArr2[TextEditorState.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26386e[TextEditorState.ADJUST_IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26386e[TextEditorState.ADJUST_TEXT_BLOCK.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26386e[TextEditorState.EDIT_TEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26386e[TextEditorState.SELECT_TEXT.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[TopBarMode.values().length];
            f26385d = iArr3;
            try {
                iArr3[TopBarMode.Annot.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f26385d[TopBarMode.Delete.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr4 = new int[PDFAlert.ButtonGroupType.values().length];
            c = iArr4;
            try {
                iArr4[PDFAlert.ButtonGroupType.OkCancel.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                c[PDFAlert.ButtonGroupType.Ok.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                c[PDFAlert.ButtonGroupType.YesNoCancel.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                c[PDFAlert.ButtonGroupType.YesNo.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr5 = new int[PDFAlert.IconType.values().length];
            f26384b = iArr5;
            try {
                iArr5[PDFAlert.IconType.Error.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f26384b[PDFAlert.IconType.Warning.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f26384b[PDFAlert.IconType.Question.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f26384b[PDFAlert.IconType.Status.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr6 = new int[AnalyticsEvent.values().length];
            f26383a = iArr6;
            try {
                iArr6[AnalyticsEvent.COPY_SHOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f26383a[AnalyticsEvent.COPY_CLICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f26383a[AnalyticsEvent.DELETE_SHOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f26383a[AnalyticsEvent.COPY_DELETE_SHOW.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f26383a[AnalyticsEvent.DELETE_POP_CLICK.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f26383a[AnalyticsEvent.COPY_DELETE_CLICK_DEL.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f26383a[AnalyticsEvent.COPY_DELETE_CLICK_COPY.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f26383a[AnalyticsEvent.SELECT_POP_SHOW.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f26383a[AnalyticsEvent.SELECT_POP_CLICK_COPY.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f26383a[AnalyticsEvent.SELECT_POP_CLICK_HIGH_LIGHT.ordinal()] = 10;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f26383a[AnalyticsEvent.SELECT_POP_CLICK_UNDER_LINE.ordinal()] = 11;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f26383a[AnalyticsEvent.SELECT_POP_CLICK_STRIKE_LINE.ordinal()] = 12;
            } catch (NoSuchFieldError unused30) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public class s0 implements Runnable {
        public s0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            int i10 = readerPreviewActivity.B2;
            a2.f26307a = i10;
            ReaderPreviewActivity.s2(readerPreviewActivity, i10);
        }
    }

    /* loaded from: classes3.dex */
    public class s1 implements cg.l<Boolean, tf.d> {
        public s1() {
        }

        @Override // cg.l
        public final tf.d invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            if (booleanValue) {
                if (readerPreviewActivity.I5) {
                    readerPreviewActivity.h(readerPreviewActivity.getResources().getString(R.string.arg_res_0x7f1300d4));
                } else {
                    readerPreviewActivity.f26229o1 = ea.a.p("J2VdcB1sZw==", "RMYeBPjV");
                    if (readerPreviewActivity.K != 2) {
                        readerPreviewActivity.Q2();
                    } else if (!readerPreviewActivity.f26277w2) {
                        readerPreviewActivity.u2(PDFTextEditorMode.TEXT_AND_IMG);
                    }
                    readerPreviewActivity.r3(false, false);
                    readerPreviewActivity.Z4(ea.a.p("AWQZdA5wMmYXaANsRGQ7Z2d0IHknb0FfF2wYY2s=", "gqdpQVh2"));
                }
            } else {
                String p10 = ea.a.p("KmRYdCZwU2YFaC9sBWQEZ2pzBWk1XwZsLmNr", "dsPOGKtJ");
                ExecutorService executorService = ReaderPreviewActivity.U5;
                readerPreviewActivity.Z4(p10);
            }
            ExecutorService executorService2 = ReaderPreviewActivity.U5;
            readerPreviewActivity.v4();
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public class t implements androidx.lifecycle.x<ym.b> {
        public t() {
        }

        @Override // androidx.lifecycle.x
        public final void m(ym.b bVar) {
            PdfPreviewEntity pdfPreviewEntity;
            RecyclerView.m layoutManager;
            String str;
            ym.b bVar2 = bVar;
            if (bVar2 != null && (pdfPreviewEntity = bVar2.c) != null) {
                ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
                PdfPreviewEntity pdfPreviewEntity2 = readerPreviewActivity.f26245r1;
                if (pdfPreviewEntity2 != null) {
                    pdfPreviewEntity2.setRecentDate(pdfPreviewEntity.getRecentDate());
                }
                readerPreviewActivity.b4(bVar2.f32187a);
                if (bVar2.f32188b) {
                    PdfPreviewEntity pdfPreviewEntity3 = bVar2.c;
                    if (pdfPreviewEntity3 != null) {
                        PdfPreviewEntity pdfPreviewEntity4 = readerPreviewActivity.f26245r1;
                        if (pdfPreviewEntity4 != null) {
                            pdfPreviewEntity3.setOtherStrTwo(pdfPreviewEntity4.getOtherStrTwo());
                        }
                        if (bVar2.c.getPath() != null) {
                            str = bVar2.c.getPath();
                        } else {
                            str = "";
                        }
                        pdf.pdfreader.viewer.editor.free.utils.k0.c(readerPreviewActivity, str, bVar2.c, readerPreviewActivity.W, ea.a.p("dVIETSxQI0c3X3lBJ0ERRVI=", "0Ots69Cd"));
                        readerPreviewActivity.finish();
                    }
                } else {
                    readerPreviewActivity.D3();
                    int i10 = readerPreviewActivity.B2;
                    InterceptRecyclerView interceptRecyclerView = readerPreviewActivity.Z3;
                    if (interceptRecyclerView != null && (layoutManager = interceptRecyclerView.getLayoutManager()) != null) {
                        layoutManager.B0(i10);
                    }
                    ThumbnailAdapter thumbnailAdapter = readerPreviewActivity.D2;
                    if (thumbnailAdapter != null) {
                        thumbnailAdapter.h(i10 + 1);
                    }
                }
                an.a.f1703f.j(null);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class t0 extends AsyncTask<Void, Void, PDFAlert> {
        public t0() {
        }

        @Override // lib.zj.pdfeditor.AsyncTask
        public final PDFAlert b(Void[] voidArr) {
            ReaderPDFCore readerPDFCore;
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            if (readerPreviewActivity.I1 && (readerPDFCore = readerPreviewActivity.f26256t1) != null) {
                return readerPDFCore.waitForAlert();
            }
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
            if (r5 != 4) goto L15;
         */
        @Override // lib.zj.pdfeditor.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void f(lib.zj.pdfeditor.PDFAlert r12) {
            /*
                r11 = this;
                lib.zj.pdfeditor.PDFAlert r12 = (lib.zj.pdfeditor.PDFAlert) r12
                if (r12 != 0) goto L6
                goto Laf
            L6:
                r0 = 3
                lib.zj.pdfeditor.PDFAlert$ButtonPressed[] r1 = new lib.zj.pdfeditor.PDFAlert.ButtonPressed[r0]
                r2 = 0
                r3 = r2
            Lb:
                if (r3 >= r0) goto L14
                lib.zj.pdfeditor.PDFAlert$ButtonPressed r4 = lib.zj.pdfeditor.PDFAlert.ButtonPressed.None
                r1[r3] = r4
                int r3 = r3 + 1
                goto Lb
            L14:
                pdf.pdfreader.viewer.editor.free.pdfview.h r3 = new pdf.pdfreader.viewer.editor.free.pdfview.h
                r3.<init>(r11, r12, r1)
                pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity r4 = pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity.this
                android.app.AlertDialog$Builder r5 = r4.H1
                android.app.AlertDialog r5 = r5.create()
                r4.L1 = r5
                java.lang.String r6 = r12.f21161d
                r5.setTitle(r6)
                android.app.AlertDialog r5 = r4.L1
                java.lang.String r6 = r12.f21159a
                r5.setMessage(r6)
                int[] r5 = pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity.s.f26384b
                lib.zj.pdfeditor.PDFAlert$IconType r6 = r12.f21160b
                int r6 = r6.ordinal()
                r5 = r5[r6]
                int[] r5 = pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity.s.c
                lib.zj.pdfeditor.PDFAlert$ButtonGroupType r6 = r12.c
                int r6 = r6.ordinal()
                r5 = r5[r6]
                r6 = 1
                r7 = 2131952500(0x7f130374, float:1.9541445E38)
                r8 = -2
                r9 = -1
                if (r5 == r6) goto L83
                r10 = 2
                if (r5 == r10) goto L90
                if (r5 == r0) goto L54
                r0 = 4
                if (r5 == r0) goto L62
                goto La0
            L54:
                android.app.AlertDialog r0 = r4.L1
                r5 = -3
                java.lang.String r7 = r4.getString(r7)
                r0.setButton(r5, r7, r3)
                lib.zj.pdfeditor.PDFAlert$ButtonPressed r0 = lib.zj.pdfeditor.PDFAlert.ButtonPressed.Cancel
                r1[r10] = r0
            L62:
                android.app.AlertDialog r0 = r4.L1
                r5 = 2131953056(0x7f1305a0, float:1.9542572E38)
                java.lang.String r5 = r4.getString(r5)
                r0.setButton(r9, r5, r3)
                lib.zj.pdfeditor.PDFAlert$ButtonPressed r0 = lib.zj.pdfeditor.PDFAlert.ButtonPressed.Yes
                r1[r2] = r0
                android.app.AlertDialog r0 = r4.L1
                r2 = 2131952320(0x7f1302c0, float:1.954108E38)
                java.lang.String r2 = r4.getString(r2)
                r0.setButton(r8, r2, r3)
                lib.zj.pdfeditor.PDFAlert$ButtonPressed r0 = lib.zj.pdfeditor.PDFAlert.ButtonPressed.No
                r1[r6] = r0
                goto La0
            L83:
                android.app.AlertDialog r0 = r4.L1
                java.lang.String r5 = r4.getString(r7)
                r0.setButton(r8, r5, r3)
                lib.zj.pdfeditor.PDFAlert$ButtonPressed r0 = lib.zj.pdfeditor.PDFAlert.ButtonPressed.Cancel
                r1[r6] = r0
            L90:
                android.app.AlertDialog r0 = r4.L1
                r5 = 2131952359(0x7f1302e7, float:1.9541159E38)
                java.lang.String r5 = r4.getString(r5)
                r0.setButton(r9, r5, r3)
                lib.zj.pdfeditor.PDFAlert$ButtonPressed r0 = lib.zj.pdfeditor.PDFAlert.ButtonPressed.Ok
                r1[r2] = r0
            La0:
                android.app.AlertDialog r0 = r4.L1
                pdf.pdfreader.viewer.editor.free.pdfview.i r1 = new pdf.pdfreader.viewer.editor.free.pdfview.i
                r1.<init>(r11, r12)
                r0.setOnCancelListener(r1)
                android.app.AlertDialog r12 = r4.L1
                r4.W1(r12)
            Laf:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity.t0.f(java.lang.Object):void");
        }
    }

    /* loaded from: classes3.dex */
    public class t1 implements Runnable {
        public t1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            if (readerPreviewActivity.J) {
                PreviewUseEditorGuideDialog previewUseEditorGuideDialog = readerPreviewActivity.J0;
                if (previewUseEditorGuideDialog == null || !previewUseEditorGuideDialog.isShowing()) {
                    fn.c.c.getClass();
                    if (pdf.pdfreader.viewer.editor.free.utils.q0.g(readerPreviewActivity, 83, ea.a.p("WnMUcxtvFV8CclF2AGUhXyVkVl8yZTt0KG0VditfEXVaZC5fGm49MUUw", "wzNvbX08"))) {
                        if (readerPreviewActivity.K == 2) {
                            AppCompatImageView appCompatImageView = readerPreviewActivity.f26173e2;
                            if (appCompatImageView != null) {
                                appCompatImageView.post(new androidx.fragment.app.g(21, readerPreviewActivity, appCompatImageView));
                            }
                        } else {
                            TextView textView = readerPreviewActivity.A3;
                            if (textView != null) {
                                textView.post(new androidx.fragment.app.g(21, readerPreviewActivity, textView));
                            }
                        }
                        Handler handler = readerPreviewActivity.D;
                        u1 u1Var = readerPreviewActivity.T4;
                        handler.removeCallbacks(u1Var);
                        handler.postDelayed(u1Var, 3000L);
                    }
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class u implements androidx.lifecycle.x<Map<Uri, ip.c>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ThirdOpenBean f26393a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Intent f26394b;
        public final /* synthetic */ Bundle c;

        public u(ThirdOpenBean thirdOpenBean, Intent intent, Bundle bundle) {
            this.f26393a = thirdOpenBean;
            this.f26394b = intent;
            this.c = bundle;
        }

        @Override // androidx.lifecycle.x
        public final void m(Map<Uri, ip.c> map) {
            Map<Uri, ip.c> map2 = map;
            if (map2 != null) {
                ea.a.p("G2hYch1PR2U0UCtyBmUlYVthCWVy", "DNOX8PYm");
                ea.a.p("IG5yaBhuUGU-IA==", "ZYctBTYn");
                map2.toString();
                ip.c cVar = map2.get(this.f26393a.getUri());
                ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
                if (cVar != null) {
                    ThirdOpenStatus thirdOpenStatus = ThirdOpenStatus.PARSE;
                    ThirdOpenStatus thirdOpenStatus2 = cVar.f18970b;
                    if (thirdOpenStatus2 != thirdOpenStatus) {
                        if (thirdOpenStatus2 != ThirdOpenStatus.DONE) {
                            pdf.pdfreader.viewer.editor.free.utils.t1.b(ea.a.p("SWQBUD9lNWktd0Z0XGklZHdwN25pcFdyB2U0ciNvMDE=", "bA9gMCIq"));
                            ExecutorService executorService = ReaderPreviewActivity.U5;
                            readerPreviewActivity.B4();
                        } else {
                            ExecutorService executorService2 = ReaderPreviewActivity.U5;
                            ViewGroup viewGroup = (ViewGroup) readerPreviewActivity.findViewById(16908290);
                            if (viewGroup != null) {
                                readerPreviewActivity.A2 = false;
                                viewGroup.removeView(readerPreviewActivity.findViewById(R.id.loadingRoot));
                            }
                            PdfPreviewEntity pdfPreviewEntity = cVar.c;
                            if (pdfPreviewEntity != null) {
                                String p10 = ea.a.p("PGhedyZwU2Y=", "WmzltjCT");
                                Intent intent = this.f26394b;
                                intent.putExtra(p10, pdfPreviewEntity);
                                intent.setData(Uri.fromFile(new File(pdfPreviewEntity.getPath())));
                                if (!readerPreviewActivity.G2(this.c)) {
                                    readerPreviewActivity.z3(null);
                                }
                            } else {
                                pdf.pdfreader.viewer.editor.free.utils.t1.b(ea.a.p("Q2QtUAFlFGkXdxR0AWkkZAtwV25mcCJyMGV2ch9vRjI=", "C3m40KoR"));
                                readerPreviewActivity.B4();
                            }
                        }
                        ThirdOpenParseManager.f28764f.i(this);
                        return;
                    }
                }
                pdf.pdfreader.viewer.editor.free.utils.t1.b(ea.a.p("P2RXUAtlQWk_d2p0HWkaZHpwC25lcARyS2Urcj5vGTA=", "XXCf8nLk"));
                ExecutorService executorService3 = ReaderPreviewActivity.U5;
                ViewGroup viewGroup2 = (ViewGroup) readerPreviewActivity.findViewById(16908290);
                if (viewGroup2 != null) {
                    readerPreviewActivity.A2 = true;
                    View inflate = LayoutInflater.from(readerPreviewActivity).inflate(R.layout.layout_preview_loading, viewGroup2, false);
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) inflate.findViewById(R.id.loadingLottie);
                    ((TextView) inflate.findViewById(R.id.loadingText)).setText(readerPreviewActivity.getString(R.string.arg_res_0x7f130338, ea.a.p("Y0RG", "9GkMKSze")));
                    ((ImageView) inflate.findViewById(R.id.loadingBack)).setOnClickListener(new qb.j0(readerPreviewActivity, 14));
                    viewGroup2.addView(inflate, new FrameLayout.LayoutParams(-1, -1));
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class u0 implements Runnable {
        public u0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            if (readerPreviewActivity.J) {
                readerPreviewActivity.J = false;
                ReaderPreviewActivity.k2(readerPreviewActivity);
                return;
            }
            pdf.pdfreader.viewer.editor.free.utils.p.x(readerPreviewActivity, ReaderPreviewActivity.h2(readerPreviewActivity), readerPreviewActivity.f26245r1);
        }
    }

    /* loaded from: classes3.dex */
    public class u1 implements Runnable {
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0009, code lost:
            if (r0.isShowing() == true) goto L5;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                r2 = this;
                android.widget.PopupWindow r0 = com.google.android.play.core.assetpacks.b1.f13188l
                if (r0 == 0) goto Lc
                boolean r0 = r0.isShowing()
                r1 = 1
                if (r0 != r1) goto Lc
                goto Ld
            Lc:
                r1 = 0
            Ld:
                if (r1 == 0) goto L16
                android.widget.PopupWindow r0 = com.google.android.play.core.assetpacks.b1.f13188l     // Catch: java.lang.Exception -> L16
                if (r0 == 0) goto L16
                r0.dismiss()     // Catch: java.lang.Exception -> L16
            L16:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity.u1.run():void");
        }
    }

    /* loaded from: classes3.dex */
    public class v implements ViewTreeObserver.OnGlobalLayoutListener {
        public v() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            PreviewPageManageGuideView previewPageManageGuideView = readerPreviewActivity.f26216m0;
            if (previewPageManageGuideView != null) {
                previewPageManageGuideView.s(readerPreviewActivity.f26165c4);
            }
            readerPreviewActivity.f26165c4.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* loaded from: classes3.dex */
    public class v0 implements Runnable {
        public v0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            if (readerPreviewActivity.f26276w1 != null && !readerPreviewActivity.isFinishing() && !readerPreviewActivity.J && !readerPreviewActivity.M) {
                readerPreviewActivity.C2();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class v1 extends AnimatorListenerAdapter {
        public v1() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ReaderPreviewActivity.this.f26242q3.setVisibility(4);
        }
    }

    /* loaded from: classes3.dex */
    public class w implements Runnable {
        public w() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            if (!readerPreviewActivity.f26289y1 && com.google.android.play.core.assetpacks.c.W(readerPreviewActivity)) {
                readerPreviewActivity.K3(false);
                readerPreviewActivity.O.setVisibility(4);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class w0 extends AnimatorListenerAdapter {
        public w0() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            FrameLayout frameLayout = readerPreviewActivity.f26177f0;
            if (frameLayout != null && !readerPreviewActivity.U2) {
                frameLayout.setVisibility(8);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class w1 implements Runnable {

        /* loaded from: classes3.dex */
        public class a extends AnimatorListenerAdapter {
            public a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                w1 w1Var = w1.this;
                ReaderPreviewActivity.this.f26196i4.setVisibility(8);
                ReaderPreviewActivity.this.f26185g4.setVisibility(8);
                ReaderPreviewActivity.this.f26242q3.setVisibility(4);
            }
        }

        public w1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            if (readerPreviewActivity.f26196i4 != null && readerPreviewActivity.f26185g4 != null && readerPreviewActivity.F1 != null) {
                if (readerPreviewActivity.f26242q3.getVisibility() == 4) {
                    readerPreviewActivity.f26196i4.setVisibility(8);
                    readerPreviewActivity.f26185g4.setVisibility(8);
                } else if (readerPreviewActivity.F1.getVisibility() == 0) {
                    readerPreviewActivity.f26196i4.setVisibility(8);
                    readerPreviewActivity.f26185g4.setVisibility(8);
                    readerPreviewActivity.K3(true);
                } else {
                    readerPreviewActivity.f26242q3.setAlpha(1.0f);
                    readerPreviewActivity.f26242q3.animate().alpha(0.0f).setDuration(500L).setListener(new a()).start();
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class x implements fn.a {
        public x() {
        }

        @Override // fn.a
        public final void a(c.a.C0222a c0222a) {
            fn.c.c.getClass();
            int b10 = c.a.b();
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            TextView textView = readerPreviewActivity.f26261u0;
            if (textView != null) {
                textView.setVisibility(0);
                TextView textView2 = readerPreviewActivity.f26261u0;
                textView2.setText("" + b10);
            }
            ImageView imageView = readerPreviewActivity.f26255t0;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        }

        @Override // fn.a
        public final void b() {
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            TextView textView = readerPreviewActivity.f26261u0;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = readerPreviewActivity.f26255t0;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class x0 implements Runnable {
        public x0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            lo.d.b(ReaderPreviewActivity.this.E2);
        }
    }

    /* loaded from: classes3.dex */
    public class x1 implements Comparator<PreviewGuideType> {
        @Override // java.util.Comparator
        public final int compare(PreviewGuideType previewGuideType, PreviewGuideType previewGuideType2) {
            return previewGuideType.getPriority() - previewGuideType2.getPriority();
        }
    }

    /* loaded from: classes3.dex */
    public class y implements Runnable {
        public y() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            if (readerPreviewActivity.J && com.google.android.play.core.assetpacks.c.W(readerPreviewActivity)) {
                readerPreviewActivity.K3(false);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class y0 implements Runnable {
        public y0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            ReaderPDFCore readerPDFCore = readerPreviewActivity.f26256t1;
            if (readerPDFCore != null) {
                readerPDFCore.onDestroy();
                readerPreviewActivity.f26256t1 = null;
            }
        }
    }

    /* loaded from: classes3.dex */
    public class y1 implements Runnable {
        public y1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            View view = ReaderPreviewActivity.this.V1;
            if (view != null) {
                view.animate().alpha(0.0f).setDuration(300L).withEndAction(new b7.g(this, 28)).start();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class z implements Runnable {
        public z() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ExecutorService executorService = ReaderPreviewActivity.U5;
            ReaderPreviewActivity.this.s3();
        }
    }

    /* loaded from: classes3.dex */
    public class z0 implements ValueAnimator.AnimatorUpdateListener {
        public z0() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) readerPreviewActivity.P.getLayoutParams();
            marginLayoutParams.topMargin = (int) (-(readerPreviewActivity.f26195i3 * floatValue));
            readerPreviewActivity.P.setLayoutParams(marginLayoutParams);
        }
    }

    /* loaded from: classes3.dex */
    public class z1 implements x0.u {
        public z1() {
        }

        @Override // x0.u
        public final x0.s0 m(View view, x0.s0 s0Var) {
            int i10;
            o0.b a10 = s0Var.a(7);
            o0.b a11 = s0Var.a(2);
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            if (!readerPreviewActivity.hasWindowFocus() && a10.f22640b == 0) {
                return s0Var;
            }
            if (readerPreviewActivity.f26244r0 != null) {
                if (readerPreviewActivity.f26167d0 && a11.f22641d == 0) {
                    return s0Var;
                }
                x0.d e10 = s0Var.f31498a.e();
                if (e10 != null) {
                    i10 = e10.a();
                    e10.b();
                } else {
                    i10 = 0;
                }
                DrawSignView drawSignView = readerPreviewActivity.f26244r0;
                int i11 = a11.f22640b;
                k2 k2Var = drawSignView.f28183a;
                if (k2Var != null) {
                    ConstraintLayout constraintLayout = k2Var.f1034b;
                    int i12 = a11.c;
                    int i13 = a11.f22641d;
                    constraintLayout.setPadding(i10, i11, i12, i13);
                    SignSizeBottomSheetView signSizeBottomSheetView = drawSignView.f28183a.f1044m;
                    T t4 = signSizeBottomSheetView.f28172y;
                    if (t4 != 0) {
                        ((a3) t4).f719d.setPadding(i10, i11, i12, i13);
                        ((a3) signSizeBottomSheetView.f28172y).f722g.setPadding(i10, i11, i12, i13);
                    }
                    SignColorBottomSheetView signColorBottomSheetView = drawSignView.f28183a.c;
                    T t10 = signColorBottomSheetView.f28172y;
                    if (t10 != 0) {
                        ((z2) t10).c.setPadding(i10, i11, i12, i13);
                        ((z2) signColorBottomSheetView.f28172y).f1698b.setPadding(i10, i11, i12, i13);
                    }
                }
            }
            return s0Var;
        }
    }

    static {
        ea.a.p("YWUqZBZyMnIXdl1lHkE1dC12W3R5", "DaBcrcwZ");
        U5 = Executors.newSingleThreadExecutor();
    }

    public ReaderPreviewActivity() {
        new AtomicBoolean(false);
        this.f26227n5 = new Rect();
        this.f26233o5 = new f();
        this.f26239p5 = new ArrayList();
        this.f26259t5 = new ConcurrentHashMap<>();
        this.f26266u5 = new ConcurrentHashMap<>();
        this.f26273v5 = false;
        this.f26280w5 = false;
        this.f26286x5 = false;
        this.f26293y5 = false;
        this.f26300z5 = null;
        this.A5 = null;
        this.C5 = new ao.p(this, 1);
        this.K5 = null;
        this.N5 = false;
        this.O5 = false;
        this.R5 = 0L;
        this.T5 = new CopyOnWriteArraySet<>();
    }

    public static void V3() {
        AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
        AppCoreFilterEvent.a(ea.a.p("Lm5fbw1hQ2UFcyJvdw==", "FecINTLh"), ea.a.p("Um4lbwdhFmUtc1FsDGN0", "TYIajIZp"), ea.a.p("Um4lbwdhFmUtYVBk", "T6GaSUgS"));
    }

    public static void W4() {
        X4();
        AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
        AppCoreFilterEvent.h(ea.a.p("IG4pbyFhIGUXYQJk", "eqAGUTUC"));
    }

    private void X1(boolean z10) {
        j2 j2Var = new j2(this);
        this.M5 = j2Var;
        if (z10) {
            j2Var.c(1);
        } else {
            j2Var.c(0);
        }
        j2 j2Var2 = this.M5;
        j2Var2.f27638i = new n(z10);
        j2Var2.show();
    }

    public static void X4() {
        AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
        AppCoreFilterEvent.h(ea.a.p("Lm5fbw1hQ2UFcyJvdw==", "lgCkO2N8"));
        AppCoreFilterEvent.h(ea.a.p("OW4abw5hBGUXcwNsUWN0", "DzXtzpqK"));
    }

    public static void Z3() {
        AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
        AppCoreFilterEvent.a(ea.a.p("O2VJdCZzX293", "YP8csuoF"), ea.a.p("MGUbdCVzLWwtY3Q=", "8ODczHQ2"), ea.a.p("R2UzdCxhBmQ=", "T4gSVB43"));
    }

    public static /* synthetic */ void a2(ReaderPreviewActivity readerPreviewActivity, MotionEvent motionEvent) {
        readerPreviewActivity.getClass();
        if (motionEvent != null && motionEvent.getActionMasked() == 0 && readerPreviewActivity.f26296z1 == TopBarMode.Search && readerPreviewActivity.D1 != null) {
            readerPreviewActivity.q3();
        }
        if (motionEvent != null) {
            motionEvent.getActionMasked();
        }
    }

    public static void a5() {
        AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
        AppCoreFilterEvent.h(ea.a.p("Q2QtXxZkC3Qtc1xvdw==", "qIiuT5e1"));
        AppCoreFilterEvent.h(ea.a.p("Q2QtXxZkC3QtdUdl", "G3DMaT8o"));
        AppCoreFilterEvent.g(ea.a.p("P2RXXxxkXnQFcyt2ZQ==", "bj8kYN8U"));
        AppCoreFilterEvent.a(ea.a.p("Q2QtXxZkC3Qtc1xvdw==", "jacNt7Wc"), ea.a.p("Q2QtXxZkC3QtdUdl", "5uw9akdt"));
    }

    public static /* synthetic */ void b2(ReaderPreviewActivity readerPreviewActivity, Map map) {
        boolean z10;
        readerPreviewActivity.getClass();
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                    z10 = false;
                    break;
                }
            } else {
                z10 = true;
                break;
            }
        }
        if (!z10) {
            if (!k0.b.b(readerPreviewActivity, ea.a.p("Lm4GciNpNS44ZRRtXXMkaVdufFIMQXJfMVglRQNOA0wQUzZPHkEWRQ==", "RXObLQ9g")) && !k0.b.b(readerPreviewActivity, ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFcXSTFFCUUIVClSD0EDX2JUNlJ2R0U=", "lciJVPlA"))) {
                readerPreviewActivity.X1(true);
            } else {
                readerPreviewActivity.X1(false);
            }
        }
    }

    public static void b5() {
        AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
        AppCoreFilterEvent.h(ea.a.p("O2VJdCZzX293", "b4d3VMkD"));
        AppCoreFilterEvent.h(ea.a.p("O2VJdCZzUmw_Y3Q=", "xXolMt8P"));
    }

    public static void c2(ReaderPreviewActivity readerPreviewActivity, String str, SignPathActionInfo signPathActionInfo) {
        ReflowLoadingView reflowLoadingView;
        readerPreviewActivity.I2();
        AtomicBoolean atomicBoolean = readerPreviewActivity.f26203j5;
        boolean z10 = true;
        atomicBoolean.set(true);
        if (readerPreviewActivity.f26276w1 == null) {
            atomicBoolean.set(false);
            return;
        }
        if (readerPreviewActivity.f3() != null) {
            PageView f32 = readerPreviewActivity.f3();
            if (!f32.E && ((reflowLoadingView = f32.F) == null || reflowLoadingView.getVisibility() != 0)) {
                z10 = false;
            }
            if (z10) {
                ea.a.p("UmQvUxpnDGEGdUZlSVA3ZyFWW2UxICpzQUweYTdpV2c=", "aqS9RAJE");
                atomicBoolean.set(false);
                return;
            }
        }
        AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
        AppCoreFilterEvent.h(ea.a.p("PGlWbiZzX293", "u3pBWJLg"));
        AppCoreFilterEvent.h(ea.a.p("AmkdbjphEmQ=", "92qzevRg"));
        readerPreviewActivity.n4();
        readerPreviewActivity.d4(new pdf.pdfreader.viewer.editor.free.pdfview.b(readerPreviewActivity, str, signPathActionInfo));
    }

    public static void d2(ReaderPreviewActivity readerPreviewActivity, int i10) {
        readerPreviewActivity.getClass();
        if (i10 == 2) {
            tn.a.d(readerPreviewActivity, ea.a.p("RWkudyxtDWRl", "4Ps6crK5"), ea.a.p("OWlUdwplQ185bCNjaw==", "A3AQKWLC"), ea.a.p("MG9GXyBvbg==", "BXx4CqUN"), false);
            ReaderView.f21377y0 = true;
            ReaderView.f21378z0 = false;
            ReaderView.B0 = true;
        } else if (3 == i10) {
            tn.a.d(readerPreviewActivity, ea.a.p("RWkudyxtDWRl", "eaIPkulQ"), ea.a.p("RWkudwBlFl8RbF1jaw==", "9rqigj0K"), ea.a.p("cW8aXxNpF2Mnbg==", "O69hwdBc"), false);
            ReaderView.f21377y0 = true;
            ReaderView.f21378z0 = false;
            ReaderView.B0 = false;
        } else if (i10 == 0) {
            tn.a.d(readerPreviewActivity, ea.a.p("H2kmdzJtHWRl", "EHiCmrYz"), ea.a.p("OWlUdwplQ185bCNjaw==", "1WiEQOfl"), ea.a.p("ZWU5XxBvbg==", "hu00MI9D"), false);
            ReaderView.f21377y0 = false;
            ReaderView.f21378z0 = true;
            ReaderView.B0 = true;
        } else if (1 == i10) {
            tn.a.d(readerPreviewActivity, ea.a.p("OWlUdyZtWGRl", "IbmKkOLB"), ea.a.p("RWkudwBlFl8RbF1jaw==", "HSUr9EuJ"), ea.a.p("GWVDXx1pRGM1bg==", "xMDcLOlg"), false);
            ReaderView.f21377y0 = false;
            ReaderView.f21378z0 = true;
            ReaderView.B0 = false;
        } else {
            ReaderView.f21377y0 = true;
            ReaderView.f21378z0 = false;
            ReaderView.B0 = true;
        }
        PDFScrollHandle pDFScrollHandle = readerPreviewActivity.f26258t3;
        if (pDFScrollHandle != null) {
            pDFScrollHandle.g();
        }
        readerPreviewActivity.Y3();
        b0 b0Var = readerPreviewActivity.f26276w1;
        if (b0Var != null) {
            b0Var.d0();
            readerPreviewActivity.f26276w1.f0();
            readerPreviewActivity.f26276w1.post(new ao.g(readerPreviewActivity, 1));
        }
    }

    public static void e2(ReaderPreviewActivity readerPreviewActivity, int i10) {
        ReaderPDFCore readerPDFCore;
        boolean z10;
        readerPreviewActivity.getClass();
        if (i.a.f21508a.f21507d && (readerPDFCore = readerPreviewActivity.f26256t1) != null) {
            int countPages = readerPDFCore.countPages();
            ImageView imageView = readerPreviewActivity.f26198j0;
            boolean z11 = false;
            if (imageView != null) {
                if (i10 < countPages - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                imageView.setEnabled(z10);
            }
            ImageView imageView2 = readerPreviewActivity.f26192i0;
            if (imageView2 != null) {
                if (i10 > 0) {
                    z11 = true;
                }
                imageView2.setEnabled(z11);
            }
        }
    }

    public static boolean f2(ReaderPreviewActivity readerPreviewActivity) {
        boolean z10;
        PdfPreviewEntity pdfPreviewEntity = readerPreviewActivity.f26245r1;
        if (pdfPreviewEntity == null) {
            return true;
        }
        if (pdfPreviewEntity.isOtherBoolOne()) {
            tn.a.d(readerPreviewActivity, ea.a.p("T2kxdw==", "9N9TQIOP"), ea.a.p("QmlSd2xhGGU6cglfR2g4dw==", "4K473qoE"), ea.a.p("I29Saw==", "nTdlEjoy"), false);
            readerPreviewActivity.E4(readerPreviewActivity.getString(R.string.arg_res_0x7f130116));
        } else {
            long size = readerPreviewActivity.f26245r1.getSize();
            if (lm.e.f21773a && size > 10485760) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return true;
            }
            tn.a.d(readerPreviewActivity, ea.a.p("RWkudw==", "SKgCa2Gc"), ea.a.p("RWkRdzxhHmU6cglfR2g4dw==", "FH3tcwyu"), ea.a.p("QGkxZQ==", "Sm4TkZfm"), false);
            readerPreviewActivity.E4(readerPreviewActivity.getString(R.string.arg_res_0x7f13014f, "10".concat(ea.a.p("AkI=", "OYMiFYhm"))));
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g2(pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity r19, int r20, int[] r21, kj.b r22, pdf.pdfreader.viewer.editor.free.ui.widget.sign.db.SignPathActionInfo r23, float r24) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity.g2(pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity, int, int[], kj.b, pdf.pdfreader.viewer.editor.free.ui.widget.sign.db.SignPathActionInfo, float):void");
    }

    public static String h2(ReaderPreviewActivity readerPreviewActivity) {
        readerPreviewActivity.getClass();
        ea.a.p("FWULaw==", "QsqxFGjW");
        if (TextUtils.equals(ea.a.p("CVJ-TSZBSQ==", "nUyLvmNJ"), readerPreviewActivity.V)) {
            return ea.a.p("LmlSaBh0", "YbgAsImt");
        }
        if (readerPreviewActivity.B3()) {
            return ea.a.p("FmhecmQ=", "7kb7OVLQ");
        }
        if (readerPreviewActivity.C3()) {
            return ea.a.p("QGgkcgdjF3Q=", "OKwolyH5");
        }
        return ea.a.p("K2VCaw==", "3zeBFrVU");
    }

    public static void i2(ReaderPreviewActivity readerPreviewActivity) {
        mj.h hVar;
        lib.zj.pdfeditor.text.editor.a aVar;
        ViewStub viewStub = readerPreviewActivity.S1;
        if (viewStub != null) {
            kl.i.b(viewStub);
        }
        EditorView editorView = readerPreviewActivity.f26230o2;
        boolean z10 = false;
        if (editorView != null) {
            editorView.setVisibility(0);
        }
        b0 b0Var = readerPreviewActivity.f26276w1;
        if (b0Var != null && b0Var.F0 == PDFReaderView.Mode.Editor && (hVar = b0Var.L1) != null && (aVar = b0Var.M1) != null) {
            if (hVar.f22083a == aVar.f21685e) {
                lib.zj.pdfeditor.text.editor.a aVar2 = b0Var.M1;
                EditorView editorView2 = aVar2.f21687f.getEditorView();
                if (editorView2 != null) {
                    editorView2.d();
                    editorView2.c();
                    aVar2.A();
                    TextEditorState textEditorState = aVar2.f21680b;
                    TextEditorState textEditorState2 = TextEditorState.ADJUST_TEXT_BLOCK;
                    if (textEditorState != textEditorState2 && aVar2.f21680b != TextEditorState.EDIT_TEXT) {
                        z10 = true;
                    }
                    aVar2.f21706x = z10;
                    if (aVar2.f21680b == TextEditorState.EDIT_TEXT) {
                        aVar2.g(textEditorState2);
                    }
                    if (aVar2.f21680b == textEditorState2) {
                        aVar2.j();
                    }
                }
                if (!b0Var.M1.q()) {
                    b0Var.f21421v0 = true;
                    b0Var.setDisplayedViewIndex(b0Var.L1.f22083a);
                    return;
                }
                return;
            }
            mj.h hVar2 = b0Var.L1;
            hVar2.f22087f = TextEditorAction.EXIT_INPUT_MODE;
            b0Var.setDisplayedViewIndex(hVar2.f22083a);
        }
    }

    public static void i4(String str) {
        tn.a.d(ReaderPdfApplication.m(), ea.a.p("LmRVXw1lT3Q=", "ofQbIUeP"), ea.a.p("R2UzdCxpDHAHdGtzAW93", "CpP3P0Q6"), ea.a.p("O29FYWw=", "wggyQice"), false);
        tn.a.d(ReaderPdfApplication.m(), ea.a.p("UmQvXwdlGnQ=", "8o4Y9Iz5"), ea.a.p("HmUydGlpH3A9dDlzXG93", "bEjJ6qdw"), str, false);
    }

    public static void j2(final ReaderPreviewActivity readerPreviewActivity, final boolean z10, final boolean z11, final int i10) {
        readerPreviewActivity.getClass();
        long currentTimeMillis = System.currentTimeMillis() - readerPreviewActivity.R5;
        readerPreviewActivity.R5 = 0L;
        Handler handler = readerPreviewActivity.D;
        if (z11) {
            handler.postDelayed(new Runnable() { // from class: ao.i
                @Override // java.lang.Runnable
                public final void run() {
                    ReaderPreviewActivity readerPreviewActivity2 = ReaderPreviewActivity.this;
                    FrameLayout frameLayout = readerPreviewActivity2.f26220m4;
                    if (frameLayout != null) {
                        frameLayout.setVisibility(8);
                    }
                    if (!z11) {
                        Handler handler2 = readerPreviewActivity2.D;
                        if (z10) {
                            readerPreviewActivity2.I5 = false;
                            readerPreviewActivity2.H5 = true;
                            handler2.post(new y0(readerPreviewActivity2));
                            PDF2WordHelper.f25574a.getClass();
                            PDF2WordHelper.c = null;
                            PDF2WordHelper.f25579g.removeCallbacksAndMessages(null);
                            PDF2WordEventCenter pDF2WordEventCenter = PDF2WordEventCenter.f28672a;
                            String p10 = ea.a.p("KmQLMiNvB2QXYwluQmUldGdzJ2MqZUVz", "cUZmTu9p");
                            String p11 = ea.a.p("O29FYWw=", "LUFU6zGT");
                            pDF2WordEventCenter.getClass();
                            PDF2WordEventCenter.a(p10, p11);
                            PDF2WordEventCenter.a(ea.a.p("Q2QtMgRvEGQtY1tuH2UkdBtzR2MlZTBz", "U5XU4Mc3"), ea.a.p("Q3Iudhpldw==", "oScjRtTx"));
                            return;
                        }
                        PDF2WordEventCenter pDF2WordEventCenter2 = PDF2WordEventCenter.f28672a;
                        pDF2WordEventCenter2.getClass();
                        PDF2WordEventCenter.a(ea.a.p("Q2QtMgRvEGQtY1tuH2UkdBtmU2ls", "0slGYiAc"), ea.a.p("P3JUdhBlQF8=", "wAKEACuz") + i10);
                        readerPreviewActivity2.y4();
                        handler2.post(new pdf.pdfreader.viewer.editor.free.pdfview.e(readerPreviewActivity2));
                    }
                }
            }, 0L);
        } else if (currentTimeMillis > 500) {
            Pdf2WordProgress pdf2WordProgress = readerPreviewActivity.f26226n4;
            if (pdf2WordProgress != null) {
                pdf2WordProgress.setCurrentProgress(100);
            }
            handler.postDelayed(new Runnable() { // from class: ao.i
                @Override // java.lang.Runnable
                public final void run() {
                    ReaderPreviewActivity readerPreviewActivity2 = ReaderPreviewActivity.this;
                    FrameLayout frameLayout = readerPreviewActivity2.f26220m4;
                    if (frameLayout != null) {
                        frameLayout.setVisibility(8);
                    }
                    if (!z11) {
                        Handler handler2 = readerPreviewActivity2.D;
                        if (z10) {
                            readerPreviewActivity2.I5 = false;
                            readerPreviewActivity2.H5 = true;
                            handler2.post(new y0(readerPreviewActivity2));
                            PDF2WordHelper.f25574a.getClass();
                            PDF2WordHelper.c = null;
                            PDF2WordHelper.f25579g.removeCallbacksAndMessages(null);
                            PDF2WordEventCenter pDF2WordEventCenter = PDF2WordEventCenter.f28672a;
                            String p10 = ea.a.p("KmQLMiNvB2QXYwluQmUldGdzJ2MqZUVz", "cUZmTu9p");
                            String p11 = ea.a.p("O29FYWw=", "LUFU6zGT");
                            pDF2WordEventCenter.getClass();
                            PDF2WordEventCenter.a(p10, p11);
                            PDF2WordEventCenter.a(ea.a.p("Q2QtMgRvEGQtY1tuH2UkdBtzR2MlZTBz", "U5XU4Mc3"), ea.a.p("Q3Iudhpldw==", "oScjRtTx"));
                            return;
                        }
                        PDF2WordEventCenter pDF2WordEventCenter2 = PDF2WordEventCenter.f28672a;
                        pDF2WordEventCenter2.getClass();
                        PDF2WordEventCenter.a(ea.a.p("Q2QtMgRvEGQtY1tuH2UkdBtmU2ls", "0slGYiAc"), ea.a.p("P3JUdhBlQF8=", "wAKEACuz") + i10);
                        readerPreviewActivity2.y4();
                        handler2.post(new pdf.pdfreader.viewer.editor.free.pdfview.e(readerPreviewActivity2));
                    }
                }
            }, 100L);
        } else {
            handler.postDelayed(new Runnable() { // from class: ao.i
                @Override // java.lang.Runnable
                public final void run() {
                    ReaderPreviewActivity readerPreviewActivity2 = ReaderPreviewActivity.this;
                    FrameLayout frameLayout = readerPreviewActivity2.f26220m4;
                    if (frameLayout != null) {
                        frameLayout.setVisibility(8);
                    }
                    if (!z11) {
                        Handler handler2 = readerPreviewActivity2.D;
                        if (z10) {
                            readerPreviewActivity2.I5 = false;
                            readerPreviewActivity2.H5 = true;
                            handler2.post(new y0(readerPreviewActivity2));
                            PDF2WordHelper.f25574a.getClass();
                            PDF2WordHelper.c = null;
                            PDF2WordHelper.f25579g.removeCallbacksAndMessages(null);
                            PDF2WordEventCenter pDF2WordEventCenter = PDF2WordEventCenter.f28672a;
                            String p10 = ea.a.p("KmQLMiNvB2QXYwluQmUldGdzJ2MqZUVz", "cUZmTu9p");
                            String p11 = ea.a.p("O29FYWw=", "LUFU6zGT");
                            pDF2WordEventCenter.getClass();
                            PDF2WordEventCenter.a(p10, p11);
                            PDF2WordEventCenter.a(ea.a.p("Q2QtMgRvEGQtY1tuH2UkdBtzR2MlZTBz", "U5XU4Mc3"), ea.a.p("Q3Iudhpldw==", "oScjRtTx"));
                            return;
                        }
                        PDF2WordEventCenter pDF2WordEventCenter2 = PDF2WordEventCenter.f28672a;
                        pDF2WordEventCenter2.getClass();
                        PDF2WordEventCenter.a(ea.a.p("Q2QtMgRvEGQtY1tuH2UkdBtmU2ls", "0slGYiAc"), ea.a.p("P3JUdhBlQF8=", "wAKEACuz") + i10);
                        readerPreviewActivity2.y4();
                        handler2.post(new pdf.pdfreader.viewer.editor.free.pdfview.e(readerPreviewActivity2));
                    }
                }
            }, 500 - currentTimeMillis);
        }
    }

    public static void k2(ReaderPreviewActivity readerPreviewActivity) {
        if (!readerPreviewActivity.J) {
            String str = pdf.pdfreader.viewer.editor.free.utils.p.f28740a;
            pdf.pdfreader.viewer.editor.free.utils.p.b(readerPreviewActivity, ea.a.p("EGkRdw==", "n6ftn9fF"), ea.a.p("NGlSdztlK2k8XwVsXWNr", "j4B7dOdn"), null);
            if (readerPreviewActivity.K == 2) {
                if (readerPreviewActivity.L == PDFTextEditorMode.ADD_TEXT) {
                    EventCenter.f28660g = ea.a.p("BWU0dA==", "FZqLfYfu");
                } else {
                    EventCenter.f28660g = ea.a.p("PWRQdBpkZg==", "3UX9jMnb");
                }
            } else {
                EventCenter.f28660g = ea.a.p("Um4lbwdhFmU=", "N0bL5rLY");
            }
            readerPreviewActivity.B(true);
        }
    }

    public static void l2(ReaderPreviewActivity readerPreviewActivity) {
        readerPreviewActivity.q3();
        b0 b0Var = readerPreviewActivity.f26276w1;
        if (b0Var != null) {
            int displayedViewIndex = b0Var.getDisplayedViewIndex();
            ea.a.p("QGUqchBoIXUAclFuHVA3ZyE6IA==", "jDOQ5Nm7");
            EditText editText = readerPreviewActivity.D1;
            if (editText != null) {
                readerPreviewActivity.E1.a(editText.getText().toString(), 1, displayedViewIndex, -1, false);
            }
        }
    }

    public static void m2(ReaderPreviewActivity readerPreviewActivity, String str) {
        if (!readerPreviewActivity.f26286x5) {
            readerPreviewActivity.f26286x5 = true;
            tn.a.d(readerPreviewActivity, ea.a.p("U24Cb0NhM2U=", "yy2l7GPG"), ea.a.p("Um4lbyxlEGEBZUZfGmV0", "QRSAUB4u"), ea.a.p("BmkwZTZ0J3QpbF8=", "hDuJiH9h").concat(str), false);
        }
    }

    public static void n2(ReaderPreviewActivity readerPreviewActivity, RectF rectF) {
        int i10;
        int i11;
        int[] iArr = new int[2];
        ConstraintLayout constraintLayout = readerPreviewActivity.f26231o3;
        if (constraintLayout != null) {
            constraintLayout.getLocationOnScreen(iArr);
        }
        View view = readerPreviewActivity.L0;
        if (view != null) {
            i10 = (-view.getMeasuredWidth()) / 2;
            i11 = -readerPreviewActivity.L0.getMeasuredHeight();
        } else {
            i10 = 0;
            i11 = 0;
        }
        float dimensionPixelSize = readerPreviewActivity.getResources().getDimensionPixelSize(R.dimen.dp_56) + iArr[1];
        if (rectF.bottom >= dimensionPixelSize && rectF.right >= 0.0f) {
            double d10 = readerPreviewActivity.getResources().getDisplayMetrics().widthPixels;
            androidx.activity.s.f1866u = d10;
            if (rectF.left <= d10) {
                int[] iArr2 = new int[2];
                View view2 = readerPreviewActivity.f26271v3;
                if (view2 != null) {
                    view2.getLocationOnScreen(iArr2);
                }
                float f10 = rectF.top;
                if (f10 <= iArr2[1]) {
                    float f11 = i11;
                    if (f10 + f11 < dimensionPixelSize && rectF.bottom + readerPreviewActivity.getResources().getDimensionPixelOffset(R.dimen.dp_40) <= iArr2[1]) {
                        if (readerPreviewActivity.B5.isShowing()) {
                            readerPreviewActivity.B5.update(readerPreviewActivity.G2, (int) (((rectF.left + rectF.right) / 2.0f) + i10), (int) rectF.bottom, -1, -1);
                        } else {
                            readerPreviewActivity.B5.showAtLocation(readerPreviewActivity.G2, 0, (int) (((rectF.left + rectF.right) / 2.0f) + i10), (int) rectF.bottom);
                        }
                        readerPreviewActivity.P3(readerPreviewActivity.f26234p0);
                        return;
                    }
                    if (readerPreviewActivity.B5.isShowing()) {
                        readerPreviewActivity.B5.update(readerPreviewActivity.G2, (int) (((rectF.left + rectF.right) / 2.0f) + i10), (int) Math.max(rectF.top + f11, dimensionPixelSize), -1, -1);
                    } else {
                        readerPreviewActivity.B5.showAtLocation(readerPreviewActivity.G2, 0, (int) (((rectF.left + rectF.right) / 2.0f) + i10), (int) Math.max(rectF.top + f11, dimensionPixelSize));
                    }
                    readerPreviewActivity.P3(readerPreviewActivity.f26234p0);
                }
            }
        }
    }

    public static void o2(ReaderPreviewActivity readerPreviewActivity, boolean z10) {
        int i10;
        readerPreviewActivity.getClass();
        try {
            Group group = readerPreviewActivity.M1;
            int i11 = 0;
            if (group != null) {
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                group.setVisibility(i10);
            }
            PdfReaderViewContainer pdfReaderViewContainer = readerPreviewActivity.f26254t;
            if (pdfReaderViewContainer != null) {
                if (z10) {
                    i11 = 8;
                }
                pdfReaderViewContainer.setVisibility(i11);
            }
            ea.a.p("QGgkdzZtEnQLTFV5BnUiOiA=", "dVwLaaJX");
            String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
            PDFScrollHandle pDFScrollHandle = readerPreviewActivity.f26258t3;
            if (pDFScrollHandle != null) {
                pDFScrollHandle.setVisibility(8);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void p2(ReaderPreviewActivity readerPreviewActivity, boolean z10) {
        String str;
        String str2;
        b0 b0Var = readerPreviewActivity.f26276w1;
        if (b0Var != null && !b0Var.N()) {
            pdf.pdfreader.viewer.editor.free.utils.j1.b(readerPreviewActivity, readerPreviewActivity.getString(R.string.arg_res_0x7f130049));
            return;
        }
        if (readerPreviewActivity.W3 == null && readerPreviewActivity.f26256t1 != null) {
            readerPreviewActivity.W3 = new pdf.pdfreader.viewer.editor.free.ui.dialog.s(readerPreviewActivity, readerPreviewActivity.f26256t1.countPages());
        }
        pdf.pdfreader.viewer.editor.free.ui.dialog.s sVar = readerPreviewActivity.W3;
        if (sVar != null) {
            sVar.f27742t = new ao.w1(readerPreviewActivity, z10);
            PdfPreviewEntity pdfPreviewEntity = readerPreviewActivity.f26245r1;
            if (i.a.f21508a.f21507d) {
                str = "PWVXbBZ3";
                str2 = "GprQODrT";
            } else {
                str = "XW85bRJs";
                str2 = "0ZWgBgOt";
            }
            pdf.pdfreader.viewer.editor.free.utils.p.h(readerPreviewActivity, pdfPreviewEntity, z10, ea.a.p(str, str2));
            readerPreviewActivity.W1(readerPreviewActivity.W3);
            readerPreviewActivity.B2();
        }
    }

    public static void q2(ReaderPreviewActivity readerPreviewActivity) {
        int i10;
        if (readerPreviewActivity.f26245r1 != null) {
            if (readerPreviewActivity.R == null) {
                e2 e2Var = new e2(readerPreviewActivity, readerPreviewActivity.f26245r1, new ao.n1(readerPreviewActivity));
                readerPreviewActivity.R = e2Var;
                e2Var.f27545f0 = new ao.o1(readerPreviewActivity);
            }
            e2 e2Var2 = readerPreviewActivity.R;
            e2Var2.f27547z = readerPreviewActivity.f26245r1;
            if (e2Var2.f23541s) {
                e2Var2.J();
            }
            readerPreviewActivity.y1(readerPreviewActivity);
            readerPreviewActivity.W1(readerPreviewActivity.R);
            PdfPreviewEntity pdfPreviewEntity = readerPreviewActivity.f26245r1;
            String str = pdf.pdfreader.viewer.editor.free.utils.p.f28740a;
            pdf.pdfreader.viewer.editor.free.utils.p.b(readerPreviewActivity, ea.a.p("OWlUdyZtWHJl", "xoXXsQh8"), ea.a.p("RWkudx5vEGUtc1xvdw==", "fE5uEVWY"), pdf.pdfreader.viewer.editor.free.utils.p.d(pdfPreviewEntity));
            int i11 = readerPreviewActivity.f26251s2;
            if (readerPreviewActivity.R2) {
                i11 = 1;
            }
            e2 e2Var3 = readerPreviewActivity.R;
            TextView textView = e2Var3.T;
            if (textView != null) {
                if (i11 <= 1) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                textView.setVisibility(i10);
                e2Var3.I();
                if (i11 > 1) {
                    pdf.pdfreader.viewer.editor.free.utils.p.b(e2Var3.getContext(), ea.a.p("OWlUdyZtWHJl", "L883c3ek"), ea.a.p("RWkudx5vEGUtcFVnDF8laCt3", "NCEAE2eS"), pdf.pdfreader.viewer.editor.free.utils.p.d(e2Var3.f27547z));
                }
            }
            readerPreviewActivity.R.getClass();
        }
    }

    public static void r2(ReaderPreviewActivity readerPreviewActivity, boolean z10) {
        if (z10) {
            if (readerPreviewActivity.A0 != null && readerPreviewActivity.C0 != null && readerPreviewActivity.B0 != null && readerPreviewActivity.f26295z0 != null && readerPreviewActivity.E0 != null && readerPreviewActivity.D0 != null) {
                AnimatorSet animatorSet = readerPreviewActivity.A5;
                if (animatorSet != null && animatorSet.isRunning()) {
                    readerPreviewActivity.A5.cancel();
                }
                readerPreviewActivity.A0.setVisibility(0);
                readerPreviewActivity.B0.setSelected(true);
                readerPreviewActivity.f26295z0.setVisibility(0);
                readerPreviewActivity.E0.setVisibility(0);
                View view = readerPreviewActivity.E3;
                if (view != null) {
                    view.setBackgroundColor(androidx.core.content.a.getColor(readerPreviewActivity, R.color.color_100_303235_f4f7f9));
                }
                Keyframe ofFloat = Keyframe.ofFloat(0.0f, 1.0f);
                Keyframe ofFloat2 = Keyframe.ofFloat(0.25f, 0.95f);
                Keyframe ofFloat3 = Keyframe.ofFloat(0.5f, 1.0f);
                Keyframe ofFloat4 = Keyframe.ofFloat(1.0f, 1.0f);
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(readerPreviewActivity.D0, PropertyValuesHolder.ofKeyframe(ea.a.p("NmNYbC9Y", "2tE9Jyj6"), ofFloat, ofFloat2, ofFloat3, ofFloat4), PropertyValuesHolder.ofKeyframe(ea.a.p("PGNQbBxZ", "bltA18j2"), ofFloat, ofFloat2, ofFloat3, ofFloat4));
                ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(readerPreviewActivity.D0, PropertyValuesHolder.ofKeyframe(ea.a.p("LmxBaGE=", "1wAmQpO3"), Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.25f, 1.0f), Keyframe.ofFloat(0.5f, 0.0f), Keyframe.ofFloat(1.0f, 0.0f)));
                ValueAnimator ofPropertyValuesHolder3 = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofKeyframe(ea.a.p("UG8nbwFGEGERdF1vbg==", "v8Yi0n5l"), Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.25f, 0.0f), Keyframe.ofFloat(0.5f, 1.0f), Keyframe.ofFloat(1.0f, 1.0f)));
                ofPropertyValuesHolder3.setInterpolator(new LinearInterpolator());
                ofPropertyValuesHolder3.addUpdateListener(new ao.m0(readerPreviewActivity));
                PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe(ea.a.p("UGwEaGE=", "JK1thtD9"), Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.5f, 0.0f), Keyframe.ofFloat(1.0f, 1.0f));
                ObjectAnimator ofPropertyValuesHolder4 = ObjectAnimator.ofPropertyValuesHolder(readerPreviewActivity.f26295z0, ofKeyframe);
                ObjectAnimator ofPropertyValuesHolder5 = ObjectAnimator.ofPropertyValuesHolder(readerPreviewActivity.A0, ofKeyframe);
                ObjectAnimator ofPropertyValuesHolder6 = ObjectAnimator.ofPropertyValuesHolder(readerPreviewActivity.E0, ofKeyframe);
                AnimatorSet animatorSet2 = new AnimatorSet();
                readerPreviewActivity.A5 = animatorSet2;
                animatorSet2.setDuration(500L);
                readerPreviewActivity.A5.playTogether(ofPropertyValuesHolder, ofPropertyValuesHolder2, ofPropertyValuesHolder3, ofPropertyValuesHolder4, ofPropertyValuesHolder5, ofPropertyValuesHolder6);
                readerPreviewActivity.A5.addListener(new ao.n0(readerPreviewActivity));
                readerPreviewActivity.A5.start();
            }
        } else if (readerPreviewActivity.A0 != null && readerPreviewActivity.C0 != null && readerPreviewActivity.B0 != null && readerPreviewActivity.f26295z0 != null && readerPreviewActivity.E0 != null && readerPreviewActivity.D0 != null) {
            AnimatorSet animatorSet3 = readerPreviewActivity.A5;
            if (animatorSet3 != null && animatorSet3.isRunning()) {
                readerPreviewActivity.A5.cancel();
            }
            readerPreviewActivity.B0.setSelected(false);
            readerPreviewActivity.D0.setVisibility(0);
            PropertyValuesHolder ofKeyframe2 = PropertyValuesHolder.ofKeyframe(ea.a.p("DWwcaGE=", "qellt9vz"), Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.5f, 0.0f), Keyframe.ofFloat(1.0f, 0.0f));
            ObjectAnimator ofPropertyValuesHolder7 = ObjectAnimator.ofPropertyValuesHolder(readerPreviewActivity.f26295z0, ofKeyframe2);
            ObjectAnimator ofPropertyValuesHolder8 = ObjectAnimator.ofPropertyValuesHolder(readerPreviewActivity.A0, ofKeyframe2);
            ObjectAnimator ofPropertyValuesHolder9 = ObjectAnimator.ofPropertyValuesHolder(readerPreviewActivity.E0, ofKeyframe2);
            ValueAnimator ofPropertyValuesHolder10 = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofKeyframe(ea.a.p("Im8Kbx9GP2ErdA9vbg==", "JHAfmMYJ"), Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.5f, 0.0f), Keyframe.ofFloat(0.75f, 1.0f), Keyframe.ofFloat(1.0f, 1.0f)));
            ofPropertyValuesHolder10.setInterpolator(new LinearInterpolator());
            ofPropertyValuesHolder10.addUpdateListener(new ao.o0(readerPreviewActivity));
            ObjectAnimator ofPropertyValuesHolder11 = ObjectAnimator.ofPropertyValuesHolder(readerPreviewActivity.D0, PropertyValuesHolder.ofKeyframe(ea.a.p("LmxBaGE=", "FiNYxxer"), Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.5f, 0.0f), Keyframe.ofFloat(0.75f, 1.0f), Keyframe.ofFloat(1.0f, 1.0f)));
            Keyframe ofFloat5 = Keyframe.ofFloat(0.0f, 1.0f);
            Keyframe ofFloat6 = Keyframe.ofFloat(0.5f, 1.0f);
            Keyframe ofFloat7 = Keyframe.ofFloat(0.75f, 0.95f);
            Keyframe ofFloat8 = Keyframe.ofFloat(1.0f, 1.0f);
            ObjectAnimator ofPropertyValuesHolder12 = ObjectAnimator.ofPropertyValuesHolder(readerPreviewActivity.D0, PropertyValuesHolder.ofKeyframe(ea.a.p("PGNQbBxY", "yrY8IUkh"), ofFloat5, ofFloat6, ofFloat7, ofFloat8), PropertyValuesHolder.ofKeyframe(ea.a.p("QGMqbBZZ", "kn5P4yYU"), ofFloat5, ofFloat6, ofFloat7, ofFloat8));
            AnimatorSet animatorSet4 = new AnimatorSet();
            readerPreviewActivity.A5 = animatorSet4;
            animatorSet4.setDuration(500L);
            readerPreviewActivity.A5.playTogether(ofPropertyValuesHolder12, ofPropertyValuesHolder11, ofPropertyValuesHolder10, ofPropertyValuesHolder7, ofPropertyValuesHolder8, ofPropertyValuesHolder9);
            readerPreviewActivity.A5.addListener(new ao.p0(readerPreviewActivity));
            readerPreviewActivity.A5.start();
        }
    }

    public static void s2(ReaderPreviewActivity readerPreviewActivity, int i10) {
        PageView f32 = readerPreviewActivity.f3();
        if (f32 != null && i10 >= 0) {
            ea.a.p("1rzL5dSLiqfR5qqQjqz6IA==", "SzGoN7zF");
            ea.a.p("E-nqtZSa5nQKdA==", "iEiJ7VTS");
            f32.i1(readerPreviewActivity, i10);
            return;
        }
        ea.a.p("PHRQcg1FT3QoYSl0IXgcIFt1Amwg", "uXc2KYry");
        readerPreviewActivity.C.postDelayed(new ao.g1(readerPreviewActivity, i10), 150L);
    }

    public final void A2(Boolean bool, boolean z10) {
        int i10;
        AppCompatImageView appCompatImageView = this.P3;
        if (appCompatImageView != null) {
            appCompatImageView.setEnabled(z10);
            if (bool != null && bool.booleanValue()) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            if (this.P3.getVisibility() != i10) {
                if (bool != null && bool.booleanValue()) {
                    tn.a.b(this, ea.a.p("H2QHdBVyZQ==", "K7znJRhA"), ea.a.p("VmQidCxyB3YdY1V0AG84XzdoXXc=", "bTXIaXAT"));
                } else {
                    this.f26292y4.clear();
                }
            }
            this.P3.setVisibility(i10);
        }
    }

    public final void A3() {
        this.f26184g3.addListener(new b1());
        this.f26184g3.addUpdateListener(new c1());
        this.f26184g3.setInterpolator(new LinearInterpolator());
        this.f26184g3.setDuration(200L);
    }

    public final void A4() {
        if (this.J0 == null) {
            this.J0 = new PreviewUseEditorGuideDialog(this);
        }
        PreviewUseEditorGuideDialog previewUseEditorGuideDialog = this.J0;
        previewUseEditorGuideDialog.f25619z = new s1();
        previewUseEditorGuideDialog.show();
    }

    @Override // jl.a.d
    public final void B(boolean z10) {
        j2 j2Var;
        pdf.pdfreader.viewer.editor.free.utils.t1.b(ea.a.p("QWU6dRZzFkMTbFhCCGM9Og==", "Ws72P0S7") + z10);
        if (z10) {
            v2();
            if (!isFinishing() && (j2Var = this.f19291e) != null && j2Var.isShowing()) {
                this.f19291e.dismiss();
                return;
            }
            return;
        }
        s4(0);
    }

    public final void B2() {
        boolean z10;
        pdf.pdfreader.viewer.editor.free.ui.dialog.s sVar = this.W3;
        if (sVar != null && sVar.isShowing()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f26167d0 = z10;
        T4();
    }

    public final boolean B3() {
        return ea.a.p("L1IOTWZUDEkaRA==", "GviA9DvC").equals(this.V);
    }

    public final void B4() {
        Resources resources = getResources();
        i3 i3Var = new i3(this, resources.getString(R.string.arg_res_0x7f130391), resources.getString(R.string.arg_res_0x7f130390), null);
        i3Var.setCanceledOnTouchOutside(false);
        i3Var.setCancelable(true);
        i3Var.setOnCancelListener(new pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.v0(this, 3));
        W1(i3Var);
    }

    @Override // qg.a
    public final boolean C() {
        AddTextChangeSizeBottomSheetView addTextChangeSizeBottomSheetView;
        AddTextChangeColorBottomSheetView addTextChangeColorBottomSheetView = this.f26285x3;
        if ((addTextChangeColorBottomSheetView == null || addTextChangeColorBottomSheetView.getVisibility() != 0) && ((addTextChangeSizeBottomSheetView = this.f26278w3) == null || addTextChangeSizeBottomSheetView.getVisibility() != 0)) {
            return false;
        }
        r3(false, false);
        return true;
    }

    public final void C2() {
        PriorityQueue<PreviewGuideType> priorityQueue = this.W4;
        priorityQueue.clear();
        if (!this.N) {
            if (pdf.pdfreader.viewer.editor.free.utils.q0.g(this, 83, "preview_edit_mode_guide_show_in_170")) {
                priorityQueue.add(PreviewGuideType.EditModeGuide);
            }
            wm.a.c.getClass();
            if (pdf.pdfreader.viewer.editor.free.utils.q0.g(this, 86, ea.a.p("WnMUcxtvFV8CclF2AGUhXzRkVF82YSRlKm0JbidnBl9UdSJkFl8Lbi0xAzM=", "uhFc0ONm"))) {
                priorityQueue.add(PreviewGuideType.PDFPageManageGuide);
            }
            if (TextUtils.equals(ea.a.p("P2FWZSZwU2YFYzhlFHQHcg==", "ObMjtFYr"), this.V) && pdf.pdfreader.viewer.editor.free.utils.q0.f(this, ea.a.p("WnMUcxtvFV8CclF2AGUhXzRkVF8lciZhQWU7ZQFpEl9UdSJkFl8Lbi0xAzM=", "5defVmIV"), true)) {
                priorityQueue.add(PreviewGuideType.PDFCreateEditGuide);
            }
        }
        K4();
    }

    public final boolean C3() {
        return ea.a.p("P2FWZSZ3XmQ9ZXQ=", "zpgEoA4r").equals(this.V);
    }

    public final void C4(String str) {
        pdf.pdfreader.viewer.editor.free.utils.j1.e(this, str, false, null, k3());
    }

    public final void D2() {
        if (this.U3 != null && !this.V2 && getResources().getConfiguration().orientation == 1) {
            this.V2 = true;
            aj.b.I(this, this.U3, ea.a.p("P2Rm", "EfGW4iKB"));
        }
    }

    public final void D3() {
        ReaderPDFCore readerPDFCore;
        nl.b bVar;
        y3();
        if (this.f26245r1 != null && (readerPDFCore = this.f26256t1) != null && (bVar = this.f26250s1) != null) {
            this.B2 = bVar.f22595p - 1;
            int countPages = readerPDFCore.countPages();
            this.f26251s2 = countPages;
            int i10 = this.B2;
            if (i10 < 0 || i10 >= countPages) {
                this.B2 = 0;
                this.f26250s1.f22595p = 1;
            }
            b0 b0Var = this.f26276w1;
            if (b0Var != null) {
                b0Var.setDisplayedViewIndex(this.B2);
            }
            nl.b bVar2 = this.f26250s1;
            bVar2.f22594o = this.f26251s2;
            bVar2.f22592m = false;
            com.google.android.play.core.assetpacks.c.P(bVar2, this.f26245r1);
            fo.a.a(this.f26245r1.getId(), this.f26245r1.getOtherStrOne(), this.f26245r1.getOtherStrTwo());
            bm.c.b(this).i(this.f26245r1);
        }
    }

    public final void D4(int i10, String str) {
        if (isFinishing()) {
            return;
        }
        pdf.pdfreader.viewer.editor.free.utils.j1.c(i10, k3(), this, str, true);
    }

    @Override // qg.a
    public final void E(ij.f fVar) {
        this.f26263u2 = fVar;
    }

    @Override // jl.a
    public final int E1() {
        return 0;
    }

    public final void E2(boolean z10) {
        oo.g gVar;
        if (this.f26245r1 != null && B3() && C3()) {
            PdfReaderOpenDefaultDialog.a aVar = PdfReaderOpenDefaultDialog.J;
            String path = this.f26245r1.getPath();
            aVar.getClass();
            int d10 = PdfReaderOpenDefaultDialog.a.d(path);
            if (d10 == 0) {
                w4();
                return;
            }
            int a10 = PdfReaderOpenDefaultDialog.a.a(this, d10, !z10);
            if (a10 == 3) {
                w4();
                return;
            } else if (a10 == 2) {
                if (z10 && ((gVar = this.I4) == null || !gVar.isShowing())) {
                    PdfReaderOpenClearDialog pdfReaderOpenClearDialog = new PdfReaderOpenClearDialog(this, d10);
                    pdfReaderOpenClearDialog.K = new d9.g(this, 15);
                    this.I4 = pdfReaderOpenClearDialog;
                    if (M1()) {
                        this.I4.show();
                    }
                }
                this.H4 = true;
                return;
            } else {
                oo.g gVar2 = this.I4;
                if (gVar2 != null && gVar2.isShowing()) {
                    if (this.I4 instanceof PdfReaderOpenClearDialog) {
                        tn.a.d(this, ea.a.p("UHURZGU=", "FF7x1sVT"), ea.a.p("UGwuYQFfEGUBZUBfDW84ZQ==", "RDLBz0yY"), ((PdfReaderOpenClearDialog) this.I4).I(), false);
                    }
                    this.J4 = true;
                    this.I4.cancel();
                }
                this.I4 = new PdfReaderOpenDefaultDialog(this, d10, ea.a.p("OWlUdw==", "tVymcleP"), new ao.a(this));
                if (M1()) {
                    this.I4.show();
                    return;
                }
                return;
            }
        }
        w4();
    }

    public final void E3(TextView textView) {
        View view;
        if (textView != null && (view = this.D3) != null) {
            if (view.getWidth() != 0 && textView.getWidth() != 0) {
                float width = ((textView.getWidth() - this.D3.getWidth()) / 2.0f) + textView.getX();
                if (width != this.D3.getX()) {
                    ObjectAnimator objectAnimator = this.G4;
                    if (objectAnimator != null && objectAnimator.isRunning()) {
                        this.G4.cancel();
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.D3, ea.a.p("eA==", "nHN54ZMJ"), width);
                    this.G4 = ofFloat;
                    ofFloat.setDuration(200L);
                    this.G4.start();
                    return;
                }
                return;
            }
            androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
            aVar.f(this.f26298z3);
            aVar.g(6, textView.getId(), 6);
            aVar.g(7, textView.getId(), 7);
            aVar.b(this.f26298z3);
        }
    }

    public final void E4(String str) {
        if (isFinishing()) {
            return;
        }
        pdf.pdfreader.viewer.editor.free.utils.j1.e(this, str, true, null, k3());
    }

    public final void F2() {
        b0 b0Var = this.f26276w1;
        if (b0Var != null) {
            HashMap<ij.d, View> allCacheViews = b0Var.getAllCacheViews();
            RectF d32 = d3();
            Rect rect = new Rect((int) d32.left, (int) d32.top, (int) d32.right, (int) d32.bottom);
            ea.a.p("UGguYxhFBmkGaVpnOmkxbiV0R3IjUCJnJCA2ZUJFUWlHaSVnIGkFbhN0QXIMUjNjMCA6", "AQ65bEEA");
            rect.toString();
            Rect rect2 = new Rect();
            for (Map.Entry<ij.d, View> entry : allCacheViews.entrySet()) {
                int i10 = entry.getKey().f18534b;
                View value = entry.getValue();
                if (value != null) {
                    int[] iArr = new int[2];
                    value.getLocationOnScreen(iArr);
                    ea.a.p("UGguYxhFBmkGaVpnOmkxbiV0R3IjUCJnUSBFYShlHWNBZS5uP28BYQZpW25JPSA=", "45ONEQT7");
                    Arrays.toString(iArr);
                    Rect rect3 = new Rect();
                    int i11 = iArr[0];
                    rect3.set(i11, iArr[1], value.getWidth() + i11, value.getHeight() + iArr[1]);
                    ea.a.p("UGguYxhFBmkGaVpnOmkxbiV0R3IjUCJnLSAfYTdlMmNBZS5uIWUBdFI9IA==", "HoPazTjl");
                    rect3.toString();
                    Rect rect4 = new Rect();
                    if (Rect.intersects(rect3, rect) && rect3.intersect(rect)) {
                        rect4.set(rect3);
                    }
                    if (rect4.height() > rect2.height()) {
                        rect2.set(rect4);
                        this.f26215l5 = i10;
                    }
                }
            }
            P4(this.f26209k5);
            ea.a.p("XkUvaQdpDGchaVNuCHQjciFQU2cjSS1kFHhXPSA=", "qwO9laWY");
        }
    }

    public final void F3(Bundle bundle) {
        ReaderPDFCore readerPDFCore;
        if (bundle == null && !TextUtils.equals(this.V, ea.a.p("P2FWZSZ3XmQ9ZXQ=", "ylbe62Rr"))) {
            tn.a.d(this, ea.a.p("QHAnYQBo", "ihi5V1tN"), ea.a.p("P3JUdhBlQF81bilyEGEcZQ==", "LGQniZoX"), wn.b.e(), false);
        }
        ReaderPDFCore readerPDFCore2 = this.f26256t1;
        if (readerPDFCore2 != null && readerPDFCore2.needsPassword()) {
            if (!TextUtils.isEmpty(this.W) && (readerPDFCore = this.f26256t1) != null && readerPDFCore.authenticatePassword(this.W)) {
                S2(bundle);
                return;
            }
            pdf.pdfreader.viewer.editor.free.ui.dialog.v vVar = new pdf.pdfreader.viewer.editor.free.ui.dialog.v(this);
            this.f26267v = vVar;
            vVar.f23532h = new ao.f1(this, bundle);
            tn.a.b(this, ea.a.p("LGkUdw==", "kCZqJqTo"), ea.a.p("RWkudyxwEXcWX0doBnc=", "mrxyOY5Q"));
            W1(this.f26267v);
            return;
        }
        ReaderPDFCore readerPDFCore3 = this.f26256t1;
        if (readerPDFCore3 != null && readerPDFCore3.countPages() == 0) {
            this.f26256t1 = null;
        }
        if (this.f26256t1 == null) {
            B4();
            if (B3()) {
                tn.a.d(this, ea.a.p("OWlUdw==", "4bClDO1x"), ea.a.p("RWkudyxlEHIdcg==", "tzZWxSlY"), ea.a.p("R2gichdfEmRm", "r2Zgt0FL"), false);
                return;
            } else {
                tn.a.d(this, ea.a.p("OWlUdw==", "N6z4DtkO"), ea.a.p("OWlUdyZlRXI1cg==", "iMP42m6V"), ea.a.p("K2U5a2dwNWY=", "qNOJ8Q4t"), false);
                return;
            }
        }
        ea.a.p("IG5ychxhQ2VgIClyEGEcZWBJ", "X4JXxKIQ");
        String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        S2(bundle);
        Uri uri = this.Q;
        y1(this);
        if (uri != null) {
            String decode = Uri.decode(uri.getEncodedPath());
            if (decode == null) {
                decode = uri.toString();
            }
            File file = new File(decode);
            if (file.exists() && !file.canWrite()) {
                this.f26277w2 = true;
                if (this.C == null) {
                    this.C = new pdf.pdfreader.viewer.editor.free.utils.g1<>(this);
                }
            }
        }
        if (this.f26290y2) {
            int k10 = eo.e.k(this);
            ea.a.p("YWE_ZTtlDnAXcg==", "5EoGjZB6");
            ea.a.p("XG4IchZhFmVIINK15ujxiCA=", "NPj7X56b");
            eo.e.s(this, k10 + 1);
        }
        this.f26290y2 = false;
    }

    public final void F4() {
        String string = getString(R.string.arg_res_0x7f13055e);
        if (!isFinishing()) {
            pdf.pdfreader.viewer.editor.free.utils.j1.e(this, string, true, null, -1);
        }
        tn.a.d(this, ea.a.p("PWVXbBZ3", "ux3pAzyT"), ea.a.p("PWVXbBZ3aGM7bj5fAW8Jc3Q=", "8NvNucyk"), ea.a.p("KWRm", "98YpyzHY"), false);
    }

    public final boolean G2(Bundle bundle) {
        Intent intent;
        Uri data;
        if (C3() && !pdf.pdfreader.viewer.editor.free.utils.extension.c.g(this)) {
            Intent intent2 = getIntent();
            if (intent2 == null) {
                return false;
            }
            String stringExtra = intent2.getStringExtra(ea.a.p("NmlaZWhwE3Ro", "KbP67rId"));
            if (TextUtils.isEmpty(stringExtra)) {
                return false;
            }
            File file = new File(stringExtra);
            if (file.exists() && file.canRead()) {
                return false;
            }
            R1(new k());
            return true;
        } else if (pdf.pdfreader.viewer.editor.free.utils.extension.c.g(this) || pdf.pdfreader.viewer.editor.free.utils.h1.c() || (intent = getIntent()) == null || (data = intent.getData()) == null) {
            return false;
        } else {
            String decode = Uri.decode(data.getEncodedPath());
            ea.a.p("LGhUYxJOUmU-UC9yGGkbc1xvACxlZgxsD1AldBw9", "JRWBjDtU");
            if (!TextUtils.isEmpty(decode) && !decode.contains(getPackageName())) {
                ea.a.p("UGguYxhOB2UWUFFyBGklcy1vXCxmbTZzHiBHZUh1BHNHUC5yHmkRcxtvWiAPaSRzdA==", "j59ahE1H");
                if (wn.b.f31389e && AppCoreFilterEvent.f28650a == AppOpenSource.Desk) {
                    AppCoreFilterEvent.h(ea.a.p("Q2U5bRpfFGkXdw==", "3HHQqx0L"));
                }
                R1(new m(bundle));
                return true;
            }
            return false;
        }
    }

    public final void G3() {
        boolean z10 = true;
        K3(!this.R2);
        this.D.removeCallbacks(this.T4);
        PopupWindow popupWindow = com.google.android.play.core.assetpacks.b1.f13188l;
        if ((popupWindow == null || !popupWindow.isShowing()) ? false : false) {
            try {
                PopupWindow popupWindow2 = com.google.android.play.core.assetpacks.b1.f13188l;
                if (popupWindow2 != null) {
                    popupWindow2.dismiss();
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void G4(boolean z10) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.bottom_edit_mode_layout_height);
        View view = this.f26157b2;
        if (view == null) {
            return;
        }
        if (!z10 || view.getVisibility() != 8) {
            if (!z10 && this.f26157b2.getVisibility() == 0 && this.f26157b2.getMeasuredHeight() == dimensionPixelSize) {
                return;
            }
            ValueAnimator valueAnimator = this.Z1;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.Z1.cancel();
            }
            this.f26157b2.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = this.f26157b2.getLayoutParams();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.Z1 = ofFloat;
            ofFloat.setDuration(200L);
            this.Z1.addUpdateListener(new p1(z10, layoutParams, dimensionPixelSize));
            this.Z1.addListener(new q1(z10));
            this.Z1.start();
        }
    }

    public final void H2() {
        SignCreateView signCreateView;
        View view;
        View view2;
        EditText editText = this.D1;
        if (editText != null && editText.getVisibility() == 0) {
            this.W2 = false;
            J4();
            PDFScrollHandle pDFScrollHandle = this.f26258t3;
            if (pDFScrollHandle != null) {
                pDFScrollHandle.setVisibility(0);
                this.f26258t3.setForceDismiss(false);
            }
            EditText editText2 = this.D1;
            if (editText2 != null) {
                editText2.setVisibility(8);
            }
            AppCompatImageView appCompatImageView = this.B;
            if (appCompatImageView != null) {
                appCompatImageView.setVisibility(8);
            }
            s4(0);
            this.J = false;
            AppCompatImageView appCompatImageView2 = this.O3;
            if (appCompatImageView2 != null) {
                appCompatImageView2.setVisibility(8);
            }
            G3();
            View view3 = this.f26241q2;
            if (view3 != null) {
                view3.setVisibility(8);
            }
            if (this.f26296z1 == TopBarMode.Search) {
                this.f26296z1 = TopBarMode.Main;
                q3();
                lib.zj.pdfeditor.q0.f21567d = null;
                b0 b0Var = this.f26276w1;
                if (b0Var != null) {
                    b0Var.g0();
                }
                this.f26219m3 = false;
            }
            N2();
            b0 b0Var2 = this.f26276w1;
            if (b0Var2 != null) {
                b0Var2.setCurrentSearchBoxIdx(-1L);
                return;
            }
            return;
        }
        FrameLayout frameLayout = this.T;
        if ((frameLayout != null && frameLayout.getVisibility() == 0) || (((signCreateView = this.f26249s0) != null && signCreateView.getVisibility() == 0) || (((view = this.f26152a2) != null && view.getVisibility() == 0) || ((view2 = this.f26157b2) != null && view2.getVisibility() == 0)))) {
            hp.e eVar = this.Z;
            if (eVar != null) {
                eVar.f18399e = false;
            }
            if (this.f26296z1 == TopBarMode.Annot) {
                ea.a.p("R2U4dHQ=", "mKYuHlSp");
                ea.a.p("IG5ybBBjXDp66PWUkJv274mMi4X26fKtgbzD6IaRFm8gbFNhC--LjLyY9OfRugVvR2U=", "U3uyfU8b");
                String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                s4(0);
                this.J = false;
                AppCompatImageView appCompatImageView3 = this.O3;
                if (appCompatImageView3 != null) {
                    appCompatImageView3.setVisibility(8);
                }
                k4(null);
                G3();
                Y3();
                LottieAnimationView lottieAnimationView = this.f26264u3;
                if (lottieAnimationView != null) {
                    lottieAnimationView.setAnimation(R.raw.closetoarrow);
                    this.f26264u3.setFrame(0);
                }
                PDFScrollHandle pDFScrollHandle2 = this.f26258t3;
                if (pDFScrollHandle2 != null) {
                    pDFScrollHandle2.setVisibility(0);
                    this.f26258t3.setForceDismiss(false);
                }
                Group group = this.N3;
                if (group != null) {
                    group.setVisibility(8);
                }
                FrameLayout frameLayout2 = this.T;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(8);
                }
                View view4 = this.f26152a2;
                if (view4 != null) {
                    view4.setVisibility(8);
                }
                View view5 = this.f26157b2;
                if (view5 != null) {
                    view5.setVisibility(8);
                }
                EditorView editorView = this.f26230o2;
                if (editorView != null) {
                    editorView.setVisibility(8);
                }
                TextView textView = this.A3;
                if (textView != null && textView.isSelected()) {
                    pdf.pdfreader.viewer.editor.free.utils.q0.x(this, 2, "pdf_edit_type_in_158");
                } else {
                    SignCreateView signCreateView2 = this.f26249s0;
                    if (signCreateView2 != null && signCreateView2.getVisibility() == 0) {
                        pdf.pdfreader.viewer.editor.free.utils.q0.x(this, 4, "pdf_edit_type_in_158");
                    } else {
                        pdf.pdfreader.viewer.editor.free.utils.q0.x(this, 1, "pdf_edit_type_in_158");
                    }
                }
                u2(PDFTextEditorMode.NONE);
                l4(null);
                View view6 = this.f26271v3;
                if (view6 != null) {
                    view6.setVisibility(8);
                }
                ConstraintLayout constraintLayout = this.f26298z3;
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(8);
                }
                Space space = this.f26236p2;
                if (space != null) {
                    space.setVisibility(8);
                }
                SignCreateView signCreateView3 = this.f26249s0;
                if (signCreateView3 != null) {
                    signCreateView3.setVisibility(8);
                }
                t3();
                ProgressView progressView = this.T3;
                if (progressView != null) {
                    progressView.setVisibility(8);
                }
                this.f26296z1 = TopBarMode.Main;
                b0 b0Var3 = this.f26276w1;
                if (b0Var3 != null) {
                    b0Var3.setMode(PDFReaderView.Mode.Viewing);
                }
                ReaderPDFCore readerPDFCore = this.f26256t1;
                if (readerPDFCore != null) {
                    readerPDFCore.resetData();
                }
                this.f26219m3 = false;
                b0 b0Var4 = this.f26276w1;
                if (b0Var4 != null) {
                    b0Var4.setCanSelectDelete(false);
                    this.f26276w1.setEditorMode(false);
                    this.f26276w1.setOnTextParamChangedListener(null);
                    b0 b0Var5 = this.f26276w1;
                    if (b0Var5.f21245u1) {
                        b0Var5.setAddTextMode(false);
                        this.f26276w1.u0(true);
                    }
                }
            } else {
                ea.a.p("O2VCdHQ=", "GlfvgUyr");
                ea.a.p("I24NbCdjIzpo6NmU0ZvJ74SMsJ3F5bmYloaS", "xyLNNHX8");
                String str2 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                b0 b0Var6 = this.f26276w1;
                if (b0Var6 != null && b0Var6.getMode() == PDFReaderView.Mode.Drawing) {
                    this.f26276w1.y();
                }
                U4();
            }
            if (this.N) {
                C2();
                this.N = false;
            }
        }
    }

    public final void H3() {
        if (this.P != null) {
            w3(false);
        }
        b0 b0Var = this.f26276w1;
        if (b0Var != null && b0Var.getMode() != PDFReaderView.Mode.Editor) {
            this.f26276w1.setCanSelectDelete(true);
            this.f26276w1.setEditorMode(true);
            this.f26276w1.setMode(PDFReaderView.Mode.AdjustText);
        }
        ViewGroup viewGroup = this.V3;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H4(boolean r13, boolean r14) {
        /*
            r12 = this;
            android.content.res.Resources r0 = r12.getResources()
            r1 = 2131165276(0x7f07005c, float:1.7944765E38)
            int r6 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r0 = r12.getResources()
            r1 = 2131165275(0x7f07005b, float:1.7944763E38)
            int r10 = r0.getDimensionPixelSize(r1)
            android.view.View r0 = r12.f26152a2
            if (r0 != 0) goto L21
            android.view.ViewStub r0 = r12.P1
            if (r0 == 0) goto L21
            kl.i.b(r0)
        L21:
            android.view.View r0 = r12.f26152a2
            if (r0 == 0) goto Lce
            android.widget.FrameLayout r1 = r12.T
            if (r1 != 0) goto L2b
            goto Lce
        L2b:
            r1 = 8
            r2 = 1
            r3 = 0
            if (r13 == 0) goto L42
            int r13 = r0.getVisibility()
            if (r13 != 0) goto L3f
            android.view.View r13 = r12.f26152a2
            int r13 = r13.getHeight()
            if (r13 == r6) goto L4b
        L3f:
            r4 = r2
            r13 = r3
            goto L4d
        L42:
            int r13 = r0.getVisibility()
            if (r13 == r1) goto L4b
            r13 = r2
            r4 = r3
            goto L4d
        L4b:
            r13 = r3
            r4 = r13
        L4d:
            if (r14 == 0) goto L62
            android.widget.FrameLayout r14 = r12.T
            int r14 = r14.getVisibility()
            if (r14 != 0) goto L5f
            android.widget.FrameLayout r14 = r12.T
            int r14 = r14.getHeight()
            if (r14 == r10) goto L6d
        L5f:
            r8 = r2
            r14 = r3
            goto L6f
        L62:
            android.widget.FrameLayout r14 = r12.T
            int r14 = r14.getVisibility()
            if (r14 == r1) goto L6d
            r14 = r2
            r8 = r3
            goto L6f
        L6d:
            r14 = r3
            r8 = r14
        L6f:
            if (r4 != 0) goto L77
            if (r13 != 0) goto L77
            if (r8 != 0) goto L77
            if (r14 == 0) goto Lce
        L77:
            android.animation.ValueAnimator r0 = r12.Y1
            if (r0 == 0) goto L86
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L86
            android.animation.ValueAnimator r0 = r12.Y1
            r0.cancel()
        L86:
            if (r4 == 0) goto L8d
            android.view.View r0 = r12.f26152a2
            r0.setVisibility(r3)
        L8d:
            if (r8 == 0) goto L94
            android.widget.FrameLayout r0 = r12.T
            r0.setVisibility(r3)
        L94:
            android.view.View r0 = r12.f26152a2
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.FrameLayout r0 = r12.T
            android.view.ViewGroup$LayoutParams r9 = r0.getLayoutParams()
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x00d0: FILL_ARRAY_DATA  , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            r12.Y1 = r0
            r1 = 200(0xc8, double:9.9E-322)
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r12.Y1
            pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity$n1 r1 = new pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity$n1
            r2 = r1
            r3 = r12
            r7 = r13
            r11 = r14
            r2.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r0.addUpdateListener(r1)
            android.animation.ValueAnimator r0 = r12.Y1
            pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity$o1 r1 = new pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity$o1
            r1.<init>(r13, r14)
            r0.addListener(r1)
            android.animation.ValueAnimator r13 = r12.Y1
            r13.start()
        Lce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity.H4(boolean, boolean):void");
    }

    public final void I2() {
        b0 b0Var;
        View D;
        if (!isDestroyed() && !isFinishing() && (b0Var = this.f26276w1) != null && (D = b0Var.D(this.f26215l5, false)) != null && this.f26256t1 != null) {
            HashMap<ij.d, View> allCacheViews = this.f26276w1.getAllCacheViews();
            ea.a.p("MGwcQyljOmUeaQN3Ry4kaUJleilpPSA=", "13QpHRld");
            allCacheViews.size();
            int[] iArr = new int[2];
            D.getLocationOnScreen(iArr);
            int i10 = iArr[0];
            int height = D.getHeight() + iArr[1];
            Rect rect = this.f26227n5;
            rect.set(i10, iArr[1], D.getWidth() + i10, height);
            ea.a.p("XlMiZx1hFnUAZXByCGcUbzFuViB7IA==", "k52pMjgY");
            Objects.toString(rect);
        }
    }

    public final void I3(String str, int i10, int i11, long j10, boolean z10) {
        if (!isFinishing() && this.f26276w1 != null) {
            if (z10) {
                this.f26223n1 = ea.a.p("Jm5BdXQ=", "rd4r1C68");
                h4(true);
            }
            ReaderPDFCore readerPDFCore = this.f26256t1;
            if (readerPDFCore != null) {
                readerPDFCore.updateCurEditPDFPageView(this.f26205k1);
            }
            this.f26276w1.getMode();
            if (this.f26276w1.getMode() != PDFReaderView.Mode.Editor) {
                this.f26276w1.setMode(PDFReaderView.Mode.AdjustText);
            }
            if (z10) {
                x2(i10);
                r4(i11);
                lib.zj.pdfeditor.a0 a0Var = this.f26205k1;
                if (a0Var != null) {
                    a0Var.A(str, i10, i11, null, j10, this.f26211l1, this.f26217m1);
                    return;
                }
                return;
            }
            lib.zj.pdfeditor.a0 a0Var2 = this.f26205k1;
            if (a0Var2 != null) {
                a0Var2.y(j10);
            }
        }
    }

    public final void I4(boolean z10) {
        if (z10) {
            if (this.f26288y0 != null) {
                ObjectAnimator objectAnimator = this.f26300z5;
                if (objectAnimator != null && objectAnimator.isRunning()) {
                    this.f26300z5.cancel();
                }
                if (this.f26288y0.getVisibility() == 0) {
                    this.f26288y0.setAlpha(1.0f);
                    return;
                }
                this.f26288y0.setVisibility(0);
                ObjectAnimator duration = ObjectAnimator.ofFloat(this.f26288y0, ea.a.p("LmxBaGE=", "iVXRElW6"), 0.0f, 1.0f).setDuration(200L);
                this.f26300z5 = duration;
                duration.start();
            }
        } else if (this.f26288y0 != null) {
            ObjectAnimator objectAnimator2 = this.f26300z5;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                this.f26300z5.cancel();
            }
            if (this.f26288y0.getVisibility() == 8) {
                return;
            }
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f26288y0, ea.a.p("Umw7aGE=", "s7r4PvxS"), 1.0f, 0.0f).setDuration(200L);
            this.f26300z5 = duration2;
            duration2.addListener(new j());
            this.f26300z5.start();
        }
    }

    @Override // qg.a
    public final void J0(lib.zj.pdfeditor.a0 a0Var, float f10, float f11, int i10) {
        if (this.f26277w2) {
            L4();
        } else if (a0Var == null) {
        } else {
            PreviewAddTextDialog previewAddTextDialog = this.f26199j1;
            if ((previewAddTextDialog != null && previewAddTextDialog.isShowing()) || this.U3 == null) {
                return;
            }
            if (i10 == 2) {
                tn.a.b(ReaderPdfApplication.m(), ea.a.p("LmRVXw1lT3Q=", "PmsPnkcW"), ea.a.p("R2UzdCxhBmotYVBkC3UidCtubWMqaSBr", "iMj1kdST"));
            } else if (i10 == 3) {
                tn.a.b(ReaderPdfApplication.m(), ea.a.p("UmQvXwdlGnQ=", "uaLNIXl9"), ea.a.p("R2UzdCxhBmotYVBkC2w3bi9fUWwvY2s=", "SifHiEQ0"));
            }
            if (this.P != null) {
                w3(true);
            }
            ViewGroup viewGroup = this.V3;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            this.f26211l1 = f10;
            this.f26217m1 = f11;
            this.f26205k1 = a0Var;
            PreviewAddTextDialog previewAddTextDialog2 = new PreviewAddTextDialog(this, this.U3, this.f26234p0, this.f26240q0);
            this.f26199j1 = previewAddTextDialog2;
            previewAddTextDialog2.f27457i = this;
            previewAddTextDialog2.setOnDismissListener(new pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.a(this, 2));
            if (i10 == 3) {
                i4(ea.a.p("UWwqbms=", "yhgqRvQ5"));
            } else if (i10 == 2) {
                i4(ea.a.p("NWRk", "9KTvVsNN"));
            }
            r3(false, false);
            this.f26199j1.show();
        }
    }

    public final boolean J2(Bundle bundle) {
        ThirdOpenBean thirdOpenBean;
        Intent intent = getIntent();
        if (intent == null || (thirdOpenBean = (ThirdOpenBean) getIntent().getParcelableExtra(ea.a.p("WmUgXyJoDXIsXxVoVXJl", "Dp1YVdvH"))) == null) {
            return false;
        }
        ThirdOpenParseManager.f28764f.e(this, new u(thirdOpenBean, intent, bundle));
        return true;
    }

    public final void J3() {
        b0 b0Var = this.f26276w1;
        if (b0Var != null) {
            b0Var.setMode(PDFReaderView.Mode.Viewing);
            this.f26276w1.setCanSelectDelete(true);
            this.f26276w1.setEditorMode(true);
        }
        this.f26296z1 = TopBarMode.Annot;
        this.A1 = null;
        w2();
    }

    public final void J4() {
        try {
            Group group = this.M1;
            if (group != null) {
                group.setVisibility(8);
            }
            PdfReaderViewContainer pdfReaderViewContainer = this.f26254t;
            if (pdfReaderViewContainer != null) {
                pdfReaderViewContainer.setVisibility(0);
            }
            ViewGroup viewGroup = this.X3;
            if (viewGroup != null) {
                int visibility = viewGroup.getVisibility();
                PDFScrollHandle pDFScrollHandle = this.f26258t3;
                if (pDFScrollHandle != null) {
                    pDFScrollHandle.setVisibility(visibility);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void K2() {
        boolean z10;
        lib.zj.pdfeditor.i iVar = i.a.f21508a;
        if (iVar.f21507d) {
            ImageView imageView = this.f26187h0;
            boolean z11 = false;
            if (imageView != null) {
                if (iVar.c == 5) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                imageView.setEnabled(!z10);
            }
            ImageView imageView2 = this.f26182g0;
            if (imageView2 != null) {
                if (iVar.c == 0) {
                    z11 = true;
                }
                imageView2.setEnabled(!z11);
            }
        }
    }

    public final void K3(boolean z10) {
        boolean z11;
        ViewGroup viewGroup = this.f26242q3;
        if (viewGroup != null) {
            if (z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (this.R2 || this.f26251s2 <= 1) {
                z11 = true;
            }
            if (!z11) {
                if (viewGroup.getVisibility() != 0) {
                    this.f26242q3.setAlpha(0.0f);
                    this.f26242q3.animate().alpha(1.0f).setDuration(500L).setListener(null).start();
                    TextView textView = this.F1;
                    if (textView != null) {
                        textView.setVisibility(0);
                    }
                    View view = this.f26190h4;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    TextView textView2 = this.G1;
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                    }
                    this.f26242q3.setVisibility(0);
                    if (this.f26247r3 != null && this.f26242q3.getMeasuredWidth() > 0 && this.f26247r3.getMeasuredHeight() > 0) {
                        TextView textView3 = this.F1;
                        if (textView3 != null) {
                            textView3.measure(View.MeasureSpec.makeMeasureSpec(this.f26242q3.getMeasuredWidth(), SlideAtom.USES_MASTER_SLIDE_ID), View.MeasureSpec.makeMeasureSpec(this.f26247r3.getMeasuredHeight(), SlideAtom.USES_MASTER_SLIDE_ID));
                        }
                        this.f26247r3.measure(View.MeasureSpec.makeMeasureSpec(this.f26242q3.getMeasuredWidth(), SlideAtom.USES_MASTER_SLIDE_ID), View.MeasureSpec.makeMeasureSpec(this.f26247r3.getMeasuredHeight(), 1073741824));
                        this.f26242q3.invalidate();
                        this.f26242q3.requestLayout();
                    }
                }
            } else if (viewGroup.getVisibility() != 4) {
                TextView textView4 = this.f26185g4;
                if (textView4 != null && textView4.getVisibility() == 0) {
                    TextView textView5 = this.F1;
                    if (textView5 != null) {
                        textView5.setVisibility(8);
                    }
                    View view2 = this.f26190h4;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                    TextView textView6 = this.G1;
                    if (textView6 != null) {
                        textView6.setVisibility(8);
                    }
                    View view3 = this.f26196i4;
                    if (view3 != null) {
                        view3.setVisibility(8);
                        return;
                    }
                    return;
                }
                this.f26242q3.setAlpha(1.0f);
                this.f26242q3.animate().alpha(0.0f).setDuration(500L).setListener(new v1()).start();
            }
        }
    }

    public final void K4() {
        PreviewGuideType poll;
        t2 t2Var;
        PriorityQueue<PreviewGuideType> priorityQueue = this.W4;
        if (priorityQueue.isEmpty() || pdf.pdfreader.viewer.editor.free.utils.extension.a.b(this) || !this.f26289y1) {
            return;
        }
        AnimatorSet animatorSet = this.f26191h5;
        if (animatorSet != null && animatorSet.isRunning()) {
            return;
        }
        if ((!this.M || (t2Var = this.f26181f5) == null || !t2Var.isShowing()) && (poll = priorityQueue.poll()) != null) {
            PreviewGuideType previewGuideType = PreviewGuideType.PDFPageManageGuide;
            Handler handler = this.D;
            if (poll == previewGuideType) {
                wm.a.c.getClass();
                if (pdf.pdfreader.viewer.editor.free.utils.q0.g(this, 86, ea.a.p("WnMUcxtvFV8CclF2AGUhXzRkVF82YSRlKm0JbidnBl9UdSJkFl8Lbi0xAzM=", "uhFc0ONm"))) {
                    handler.postDelayed(new ao.o(this, 0), 1000L);
                } else {
                    K4();
                }
            } else if (poll == PreviewGuideType.PDFCreateEditGuide) {
                wm.a.c.getClass();
                if (pdf.pdfreader.viewer.editor.free.utils.q0.f(this, ea.a.p("WnMUcxtvFV8CclF2AGUhXzRkVF8lciZhQWU7ZQFpEl9UdSJkFl8Lbi0xAzM=", "5defVmIV"), true)) {
                    handler.postDelayed(new ao.p(this, 0), 1000L);
                } else {
                    K4();
                }
            } else if (poll == PreviewGuideType.EditModeGuide) {
                if (pdf.pdfreader.viewer.editor.free.utils.q0.g(this, 83, "preview_edit_mode_guide_show_in_170")) {
                    if (!this.J && !this.M) {
                        ViewStub viewStub = this.T1;
                        if (viewStub != null) {
                            kl.i.b(viewStub);
                        }
                        PreviewEditGuideView previewEditGuideView = this.X4;
                        if (previewEditGuideView != null) {
                            previewEditGuideView.setVisibility(0);
                        }
                        if (this.X4 != null && this.Z4 != null) {
                            priorityQueue.clear();
                            this.X4.setVisibility(0);
                            pdf.pdfreader.viewer.editor.free.utils.q0.w(this, "preview_edit_mode_guide_show_in_170", false);
                            this.Z4.setVisibility(0);
                            this.Z4.setOnClickListener(new f5.e(this, 16));
                            this.X4.setOnCloseClickListener(new l2(this));
                            return;
                        }
                        return;
                    }
                    return;
                }
                K4();
            }
        }
    }

    @Override // jl.a
    public final void L1() {
        BillingConfigImpl.c.getClass();
        BillingConfigImpl.x().e(this, new p());
        an.a.f1704g.e(this, new t());
    }

    public final void L2() {
        if (this.f26210l0 != null && pdf.pdfreader.viewer.editor.free.utils.c1.L(this)) {
            if (!pdf.pdfreader.viewer.editor.free.utils.q0.g(this, 65, ea.a.p("Q2QtXwNyB3YbZUNfG2UwbCt3bXApaS10", "hQsbb10K")) && !ReaderDebugActivity.f27831j) {
                this.f26210l0.setVisibility(8);
            } else {
                this.f26210l0.setVisibility(0);
            }
        }
    }

    public final void L3(boolean z10) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        ObjectAnimator objectAnimator3;
        ObjectAnimator objectAnimator4;
        ObjectAnimator objectAnimator5;
        ObjectAnimator objectAnimator6;
        final boolean z11;
        int i10;
        int i11;
        boolean z12;
        ObjectAnimator ofFloat;
        ObjectAnimator objectAnimator7;
        ObjectAnimator objectAnimator8;
        ObjectAnimator objectAnimator9;
        s3();
        dp.a.a().getClass();
        dp.a.c(ea.a.p("YWUqZBZyMnIXdl1lHkE1dC12W3Q_IDNvAnQaZVZsNXcg", "qH0Zv3Pf") + z10);
        if (this.f26276w1 != null) {
            this.M = z10;
            if (z10) {
                View view = this.D5;
                if (view != null && view.getVisibility() == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f26160b5 = z12;
                t4(false);
                AnimatorSet animatorSet = this.f26191h5;
                if (animatorSet != null && animatorSet.isRunning()) {
                    this.f26191h5.cancel();
                }
                LottieAnimationView lottieAnimationView = this.f26264u3;
                if (lottieAnimationView != null) {
                    lottieAnimationView.setAnimation(R.raw.closetoarrow);
                    this.f26264u3.j();
                }
                ObjectAnimator g32 = g3(this.f26252s3, true);
                ObjectAnimator g33 = g3(this.f26180f4, true);
                PreviewPDF2WordStateView previewPDF2WordStateView = this.f26170d4;
                ObjectAnimator i32 = i3(previewPDF2WordStateView, previewPDF2WordStateView);
                ObjectAnimator i33 = i3(this.f26175e4, this.f26170d4);
                ImageView imageView = this.f26252s3;
                ObjectAnimator i34 = i3(imageView, imageView);
                ImageView imageView2 = this.f26208k4;
                if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(this)) {
                    ofFloat = ObjectAnimator.ofFloat(imageView2, ea.a.p("R3IqbgBsA3Qbb1pY", "3TFaCNsO"), imageView2.getTranslationX(), (-imageView2.getWidth()) * 2);
                } else {
                    ofFloat = ObjectAnimator.ofFloat(imageView2, ea.a.p("R3IqbgBsA3Qbb1pY", "15F80gz8"), imageView2.getTranslationX(), imageView2.getWidth() * 2);
                }
                ObjectAnimator g34 = g3(this.X3, false);
                ObjectAnimator g35 = g3(this.Z3, false);
                if (this.Z3 != null) {
                    objectAnimator7 = ObjectAnimator.ofFloat(this.X3, ea.a.p("R3IqbgBsA3Qbb1pZ", "54u8S1cU"), this.Z3.getTranslationY(), this.Z3.getHeight());
                    objectAnimator8 = ObjectAnimator.ofFloat(this.Z3, ea.a.p("O3JQbgpsVnQzbyRZ", "1wdk4EsM"), this.Z3.getTranslationY(), this.Z3.getHeight());
                } else {
                    objectAnimator7 = null;
                    objectAnimator8 = null;
                }
                int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp_55);
                View view2 = this.f26172e0;
                if (view2 != null) {
                    objectAnimator9 = h3(view2);
                } else {
                    objectAnimator9 = null;
                }
                if (objectAnimator9 != null) {
                    objectAnimator9.addUpdateListener(new ao.t(this, dimensionPixelSize));
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.addListener(new ao.u(this));
                Animator[] animatorArr = {g32, g33, i32, i33, ofFloat, i34, g34, g35, objectAnimator7, objectAnimator8, objectAnimator9};
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < 11; i12++) {
                    Animator animator = animatorArr[i12];
                    if (animator != null) {
                        arrayList.add(animator);
                    }
                }
                animatorSet2.playTogether(arrayList);
                animatorSet2.setDuration(this.f26186g5);
                animatorSet2.start();
                animatorSet2.setInterpolator(new LinearInterpolator());
                this.f26191h5 = animatorSet2;
            } else {
                if (this.f26160b5) {
                    t4(true);
                }
                AnimatorSet animatorSet3 = this.f26191h5;
                if (animatorSet3 != null && animatorSet3.isRunning()) {
                    this.f26191h5.cancel();
                }
                LottieAnimationView lottieAnimationView2 = this.f26264u3;
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setAnimation(R.raw.arrowtoclose);
                    this.f26264u3.j();
                }
                ImageView imageView3 = this.f26252s3;
                if (imageView3 != null) {
                    objectAnimator = h3(imageView3);
                } else {
                    objectAnimator = null;
                }
                AppCompatImageView appCompatImageView = this.f26180f4;
                if (appCompatImageView != null) {
                    objectAnimator2 = h3(appCompatImageView);
                } else {
                    objectAnimator2 = null;
                }
                ObjectAnimator j32 = j3(this.f26170d4);
                ObjectAnimator j33 = j3(this.f26175e4);
                ObjectAnimator j34 = j3(this.f26208k4);
                ViewGroup viewGroup = this.X3;
                if (viewGroup != null) {
                    objectAnimator3 = h3(viewGroup);
                } else {
                    objectAnimator3 = null;
                }
                InterceptRecyclerView interceptRecyclerView = this.Z3;
                if (interceptRecyclerView != null) {
                    objectAnimator4 = h3(interceptRecyclerView);
                    objectAnimator5 = ObjectAnimator.ofFloat(this.X3, ea.a.p("R3IqbgBsA3Qbb1pZ", "9OZ5y9Hy"), this.Z3.getTranslationY(), 0.0f);
                    objectAnimator6 = ObjectAnimator.ofFloat(this.Z3, ea.a.p("EnICbjpsB3QhbwhZ", "hBfcIfKq"), this.Z3.getTranslationY(), 0.0f);
                } else {
                    objectAnimator4 = null;
                    objectAnimator5 = null;
                    objectAnimator6 = null;
                }
                int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.dp_55);
                View view3 = this.f26172e0;
                if (view3 != null) {
                    view3.setVisibility(0);
                }
                ObjectAnimator j35 = j3(this.f26252s3);
                ObjectAnimator g36 = g3(this.f26172e0, false);
                if (!this.f26289y1) {
                    if (getRequestedOrientation() == 1 && !pdf.pdfreader.viewer.editor.free.utils.a0.i(this)) {
                        if (this.f26213l3 == null) {
                            this.f26213l3 = a3();
                        }
                    } else {
                        this.f26213l3 = null;
                    }
                }
                g36.addUpdateListener(new ao.v(this, dimensionPixelSize2));
                AnimatorSet animatorSet4 = new AnimatorSet();
                Animator[] animatorArr2 = {objectAnimator, objectAnimator2, j32, j33, j34, j35, objectAnimator3, objectAnimator4, objectAnimator5, objectAnimator6, g36};
                ArrayList arrayList2 = new ArrayList();
                for (int i13 = 0; i13 < 11; i13++) {
                    Animator animator2 = animatorArr2[i13];
                    if (animator2 != null) {
                        arrayList2.add(animator2);
                    }
                }
                animatorSet4.playTogether(arrayList2);
                animatorSet4.setInterpolator(new LinearInterpolator());
                animatorSet4.setDuration(this.f26186g5);
                animatorSet4.start();
                animatorSet4.addListener(new ao.w(this));
                this.f26191h5 = animatorSet4;
            }
            View view4 = this.f26210l0;
            if (view4 != null) {
                z11 = z10;
                if (z11) {
                    i10 = 8;
                    view4.setVisibility(8);
                } else {
                    i10 = 8;
                    L2();
                }
            } else {
                z11 = z10;
                i10 = 8;
            }
            if (this.f26202j4 != null) {
                if (pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this)) {
                    this.f26202j4.setVisibility(i10);
                } else {
                    View view5 = this.f26202j4;
                    if (z11) {
                        i11 = i10;
                    } else {
                        i11 = 0;
                    }
                    view5.setVisibility(i11);
                }
            }
            this.f26276w1.setReflow(z11);
            e4(z10);
            PDFScrollHandle pDFScrollHandle = this.f26258t3;
            if (pDFScrollHandle != null) {
                pDFScrollHandle.setForceDismiss(true);
            }
            FrameLayout frameLayout = this.O;
            if (frameLayout != null) {
                frameLayout.setVisibility(4);
            }
            PDFScrollHandle pDFScrollHandle2 = this.f26258t3;
            if (pDFScrollHandle2 != null) {
                pDFScrollHandle2.g();
            }
            this.f26276w1.f0();
            Y3();
            this.f26276w1.post(new Runnable() { // from class: ao.k
                @Override // java.lang.Runnable
                public final void run() {
                    ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
                    int displayedViewIndex = readerPreviewActivity.f26276w1.getDisplayedViewIndex();
                    if (ReaderView.B0 && displayedViewIndex > 0 && displayedViewIndex < readerPreviewActivity.f26276w1.getPageCount() - 1) {
                        readerPreviewActivity.f26276w1.n0(displayedViewIndex, true);
                    } else if (displayedViewIndex >= readerPreviewActivity.f26276w1.getPageCount() - 1) {
                        ReaderPreviewActivity.b0 b0Var = readerPreviewActivity.f26276w1;
                        b0Var.n0(b0Var.getPageCount(), true);
                    } else {
                        readerPreviewActivity.f26276w1.n0(displayedViewIndex, true);
                    }
                    readerPreviewActivity.f26276w1.requestLayout();
                    if (!readerPreviewActivity.J) {
                        PDFScrollHandle pDFScrollHandle3 = readerPreviewActivity.f26258t3;
                        if (pDFScrollHandle3 != null) {
                            pDFScrollHandle3.setForceDismiss(false);
                        }
                        FrameLayout frameLayout2 = readerPreviewActivity.O;
                        if (frameLayout2 != null) {
                            frameLayout2.setVisibility(0);
                        }
                    }
                    if (z11) {
                        tn.a.d(readerPreviewActivity, ea.a.p("PWVXbBZ3", "xvpcLbyR"), ea.a.p("QWUtbBx3PXMab3c=", "paNavgFN"), ea.a.p("Q2Rm", "nsyW2wl5"), false);
                    }
                }
            });
        }
    }

    public final void L4() {
        if (this.X == null) {
            r2 r2Var = new r2(this);
            this.X = r2Var;
            r2Var.f23542t = new i1();
        }
        W1(this.X);
    }

    public final void M2() {
        ea.a.p("UGwuYQFFBmkGVFF4HUQ3dGE=", "TbELoa1R");
        if (this.f26156b0 && this.f26276w1 != null) {
            u2(PDFTextEditorMode.NONE);
        }
        N0(0, false, false);
        this.f26156b0 = false;
        pdf.pdfreader.viewer.editor.free.utils.w0.a().c.execute(new ao.m(this, 1));
    }

    public final void M3(boolean z10) {
        ReaderPDFCore readerPDFCore;
        int i10;
        if (this.f26276w1 == null || (readerPDFCore = this.f26256t1) == null || (i10 = this.B2) < 0) {
            return;
        }
        if (!z10) {
            L3(false);
        } else {
            readerPDFCore.queryReflowInfo(i10, new c());
        }
    }

    public final void M4() {
        this.U2 = true;
        FrameLayout frameLayout = this.f26177f0;
        if (frameLayout != null) {
            ViewPropertyAnimator animate = frameLayout.animate();
            animate.cancel();
            if (this.f26177f0.getVisibility() == 0) {
                animate.setListener(null);
                this.f26177f0.setAlpha(1.0f);
                return;
            }
            this.f26177f0.setAlpha(0.0f);
            this.f26177f0.setVisibility(0);
            animate.alpha(1.0f).setDuration(500L).setListener(null).start();
        }
    }

    @Override // qg.i
    public final void N0(int i10, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        ReaderPDFCore readerPDFCore;
        if (!z10 && i10 <= 0 && (!z11 || (readerPDFCore = this.f26256t1) == null || !readerPDFCore.hasDroppedUndo())) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.f26156b0 = z12;
        if (!z10 && !z11) {
            z13 = false;
        } else {
            z13 = true;
        }
        A2(Boolean.valueOf(z13), z10);
        z2(Boolean.valueOf(z13), z11);
        if (this.R3 != null) {
            if (!z13 && !this.f26156b0) {
                t3();
                return;
            }
            N4();
            if (this.f26156b0) {
                this.R3.setEnabled(true);
                this.R3.setAlpha(1.0f);
                ImageView imageView = this.S3;
                if (imageView != null) {
                    imageView.setAlpha(1.0f);
                    return;
                }
                return;
            }
            this.R3.setEnabled(false);
            if (pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this)) {
                this.R3.setAlpha(0.4f);
                return;
            }
            ImageView imageView2 = this.S3;
            if (imageView2 != null) {
                imageView2.setAlpha(0.4f);
            }
        }
    }

    public final void N2() {
        pdf.pdfreader.viewer.editor.free.utils.q0.b(this, "");
    }

    public final void N3(int i10) {
        String p10;
        String p11;
        if (!TextUtils.isEmpty(this.f26169d3) && this.J) {
            int i11 = this.K;
            if (i11 == 1 || i11 == 3) {
                String p12 = ea.a.p("Um4lbwdhFmU=", "8FwYeNq0");
                String p13 = ea.a.p("EW4tby9zIG93", "tHpCpHql");
                if (i10 > 0) {
                    p10 = ea.a.p("WQ==", "EJC2h4Po");
                } else {
                    p10 = ea.a.p("Tg==", "6p4pCxL9");
                }
                tn.a.d(this, p12, p13, p10.concat(ea.a.p("HHQ5dFds", "qRCV6CHd")), false);
                String p14 = ea.a.p("LG43bzZhDGU=", "vAMYBx7M");
                String p15 = ea.a.p("Um4lbyxzCm93", "Tyvzfyza");
                StringBuilder sb2 = new StringBuilder();
                if (i10 > 0) {
                    p11 = ea.a.p("WQ==", "Ty7cZDCl");
                } else {
                    p11 = ea.a.p("Tg==", "mgCjdauD");
                }
                sb2.append(p11);
                sb2.append(ea.a.p("Xw==", "9h81EXIJ"));
                sb2.append(this.f26169d3);
                tn.a.d(this, p14, p15, sb2.toString(), false);
            }
        }
    }

    public final void N4() {
        RelativeLayout relativeLayout = this.R3;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
        AppCoreFilterEvent.h(ea.a.p("Q2QtXxZkC3Qtc1xvdw==", "HhlfdV00"));
        AppCoreFilterEvent.h(ea.a.p("P2RXXxxkXnQFdTll", "c664EPy8"));
        if (2 == this.K) {
            b5();
            AppCoreFilterEvent.h(ea.a.p("R2UzdCxhBmQ=", "sgupWK5R"));
            c.a aVar = fn.c.c;
            x xVar = new x();
            aVar.getClass();
            if (c.a.a(this, xVar)) {
                TextView textView = this.f26261u0;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f26255t0;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            }
        }
    }

    @Override // jl.a
    public final void O1(boolean z10) {
        ea.a.p("XG4AZQpiDWEAZGd0CHQzQyxhXGcjZGNpQ1MPbwBLAnlRbypyFzo=", "0gwgGNN0");
        this.K2 = z10;
        AppCompatImageView appCompatImageView = this.f26183g2;
        if (appCompatImageView != null) {
            appCompatImageView.setSelected(z10);
        }
        Handler handler = this.D;
        ao.p pVar = this.C5;
        handler.removeCallbacks(pVar);
        handler.post(pVar);
    }

    public final void O2() {
        b0 b0Var = this.f26276w1;
        if (b0Var != null) {
            b0Var.setMode(PDFReaderView.Mode.Viewing);
            this.f26276w1.setCanSelectDelete(true);
            this.f26276w1.setEditorMode(true);
        }
        if (this.f26256t1 != null && this.f26156b0) {
            V2(4, this.K);
        } else {
            t3();
            ReaderPDFCore readerPDFCore = this.f26256t1;
            if (readerPDFCore != null) {
                readerPDFCore.resetData();
            }
            A2(null, false);
            z2(null, false);
        }
        this.f26174e3 = ea.a.p("R2Fw", "KTkYpvJ5");
        this.K = 1;
        this.f26296z1 = TopBarMode.Annot;
        this.A1 = null;
        Boolean bool = this.f26151a0;
        if (bool != null) {
            N3(bool.booleanValue() ? 1 : 0);
        }
        r3(false, false);
        H4(false, true);
        l4(this.B3);
        SignCreateView signCreateView = this.f26249s0;
        if (signCreateView != null) {
            signCreateView.setVisibility(8);
        }
        ImageView imageView = this.f26255t0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        if (this.f26277w2) {
            L4();
        }
    }

    public final void O3(int i10) {
        if (this.K == 4 && !(!c.a.f32211a.c.isEmpty())) {
            d4(null);
            S3();
        }
        S0(false, false);
        if (i10 == 1) {
            O2();
        } else if (i10 == 2) {
            this.f26229o1 = ea.a.p("Q2Fi", "T97RWvbl");
            Q2();
        } else if (i10 == 4) {
            P2();
        }
    }

    public final void O4(boolean z10, boolean z11) {
        int i10 = 8;
        if (z11) {
            View view = this.f26241q2;
            if (view != null && !this.Y2 && !this.Z2) {
                if (z10) {
                    i10 = 0;
                }
                view.setVisibility(i10);
            }
            if (!z10 && lib.zj.pdfeditor.q0.f21567d != null) {
                pdf.pdfreader.viewer.editor.free.utils.j1.e(this, getString(R.string.arg_res_0x7f1303b7), false, null, k3());
                return;
            }
            return;
        }
        View view2 = this.f26241q2;
        if (view2 != null) {
            if (z10) {
                i10 = 0;
            }
            view2.setVisibility(i10);
        }
    }

    public void OnCopyTextButtonClick(View view) {
        this.f26296z1 = TopBarMode.Accept;
        this.A1 = AcceptMode.CopyText;
        b0 b0Var = this.f26276w1;
        if (b0Var != null) {
            b0Var.setMode(PDFReaderView.Mode.COPY);
            lib.zj.pdfeditor.a0 a0Var = (lib.zj.pdfeditor.a0) this.f26276w1.getDisplayedView();
            if (a0Var != null) {
                a0Var.b();
            }
        }
        C4(getString(R.string.arg_res_0x7f13034c));
    }

    public void OnHighlightButtonClick(View view) {
        this.f26296z1 = TopBarMode.Accept;
        this.A1 = AcceptMode.Highlight;
        b0 b0Var = this.f26276w1;
        if (b0Var != null) {
            b0Var.setMode(PDFReaderView.Mode.HIGHLINE);
        }
        C4(getString(R.string.arg_res_0x7f13034c));
    }

    public void OnStrikeOutButtonClick(View view) {
        this.f26296z1 = TopBarMode.Accept;
        this.A1 = AcceptMode.StrikeOut;
        b0 b0Var = this.f26276w1;
        if (b0Var != null) {
            b0Var.setMode(PDFReaderView.Mode.STRIKEOUTLINE);
        }
        C4(getString(R.string.arg_res_0x7f13034c));
    }

    public void OnUnderlineButtonClick(View view) {
        this.f26296z1 = TopBarMode.Accept;
        this.A1 = AcceptMode.Underline;
        b0 b0Var = this.f26276w1;
        if (b0Var != null) {
            b0Var.setMode(PDFReaderView.Mode.UNDERLINE);
        }
        C4(getString(R.string.arg_res_0x7f13034c));
    }

    public final void P2() {
        TextView textView = this.B3;
        if (textView != null && textView.isSelected()) {
            tn.a.b(ReaderPdfApplication.m(), ea.a.p("Lm5fbw1hQ2U=", "FGlQu3vx"), ea.a.p("Lm5fbyZzXmc0XylsHGNr", "RtAbxurt"));
        }
        if (this.f26256t1 != null && this.f26156b0) {
            V2(5, this.K);
        } else {
            t3();
            b0 b0Var = this.f26276w1;
            if (b0Var != null) {
                b0Var.y();
            }
            ReaderPDFCore readerPDFCore = this.f26256t1;
            if (readerPDFCore != null) {
                readerPDFCore.resetData();
            }
            A2(null, false);
            z2(null, false);
        }
        this.K = 4;
        R4();
        if (pdf.pdfreader.viewer.editor.free.utils.q0.s(this)) {
            pdf.pdfreader.viewer.editor.free.utils.q0.w(this, "sign_update_red_dot_in_160", false);
        }
        n4();
        SignCreateView signCreateView = this.f26249s0;
        if (signCreateView != null) {
            signCreateView.setVisibility(0);
        }
        k4(null);
        H4(false, false);
        l4(this.C3);
        if (this.f26277w2) {
            L4();
        }
    }

    public final void P3(int i10) {
        if (this.K0 == null) {
            return;
        }
        if (androidx.core.content.a.getColor(this, R.color.edit_color_1) == i10) {
            this.K0.c(i10, androidx.core.content.a.getColor(this, R.color.color_100_7B7C7E), 0);
        } else {
            this.K0.c(i10, i10, 0);
        }
    }

    public final void P4(SignatureImageView signatureImageView) {
        if (signatureImageView != null && signatureImageView.isAttachedToWindow()) {
            if (signatureImageView.getSignPathActionInfo() == null) {
                View view = this.M0;
                if (view != null) {
                    view.setVisibility(8);
                }
                View view2 = this.N0;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            } else {
                View view3 = this.M0;
                if (view3 != null) {
                    view3.setVisibility(0);
                }
                View view4 = this.N0;
                if (view4 != null) {
                    view4.setVisibility(0);
                }
            }
            this.f26253s5.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            signatureImageView.post(new h(signatureImageView));
        }
    }

    @Override // qg.a
    public final void Q0() {
        E4(getString(R.string.arg_res_0x7f13044f));
    }

    public final void Q2() {
        ViewStub viewStub = this.P1;
        if (viewStub != null) {
            kl.i.b(viewStub);
        }
        l4(this.A3);
        if (!this.f26277w2) {
            u2(PDFTextEditorMode.TEXT_AND_IMG);
        }
        if (this.f26256t1 != null && this.f26156b0) {
            V2(3, this.K);
        } else {
            t3();
            b0 b0Var = this.f26276w1;
            if (b0Var != null) {
                b0Var.y();
            }
            ReaderPDFCore readerPDFCore = this.f26256t1;
            if (readerPDFCore != null) {
                readerPDFCore.resetData();
            }
            A2(null, false);
            z2(null, false);
        }
        this.f26174e3 = ea.a.p("R2UzdA==", "OWlQ2NAS");
        this.K = 2;
        k4(null);
        H4(true, false);
        SignCreateView signCreateView = this.f26249s0;
        if (signCreateView != null) {
            signCreateView.setVisibility(8);
        }
        ImageView imageView = this.f26255t0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        fn.c.c.getClass();
        if (c.a.c(this)) {
            c.a.d(this);
        }
        if (this.f26277w2) {
            L4();
        }
    }

    public final void Q3() {
        KeyEvent.Callback callback;
        I2();
        SignatureImageView signatureImageView = this.f26209k5;
        if (signatureImageView != null && signatureImageView.isAttachedToWindow()) {
            if (this.f26215l5 < 0) {
                ea.a.p("OGEkZTxkIXQhbgFTQGE6cHluPG89IFtFEGkFaT9nEWksbjN0DHItUClnA0laZDJ4GDxyMA==", "gkKRyHxR");
                F2();
            }
            a4(this.f26215l5);
            RectF d32 = d3();
            float centerX = d32.centerX();
            float centerY = d32.centerY();
            ea.a.p("LGVfdBxybzo=", "xNANoh6K");
            ea.a.p("Y2NUbg1lRVk6", "glJeyYbQ");
            float width = this.f26209k5.getWidth();
            float height = this.f26209k5.getHeight();
            float[] fArr = {centerX - ((this.f26209k5.getScaleX() * width) / 2.0f), centerY - ((this.f26209k5.getScaleY() * height) / 2.0f)};
            ea.a.p("QGkibjhuEjE6", "WF3EqfCi");
            Arrays.toString(fArr);
            fArr[0] = (this.f26209k5.getScaleX() * this.f26209k5.getContentLeft()) + fArr[0];
            fArr[1] = (this.f26209k5.getScaleY() * this.f26209k5.getContentTop()) + fArr[1];
            ea.a.p("QGksbjpuFjI6", "SXgrjUPd");
            Arrays.toString(fArr);
            ea.a.p("ODo=", "X4MwGGvd");
            this.f26209k5.getWidth();
            ea.a.p("H2g6", "DaYKjSE5");
            this.f26209k5.getHeight();
            RectF rectF = new RectF();
            float f10 = fArr[0];
            rectF.set(f10, fArr[1], (this.f26209k5.getScaleX() * ((width - this.f26209k5.getContentLeft()) - this.f26209k5.getContentLeft())) + f10, (this.f26209k5.getScaleY() * ((height - this.f26209k5.getContentTop()) - this.f26209k5.getContentTop())) + fArr[1]);
            ea.a.p("QGksbhJ0F3IXUlFjHTo=", "vp5sMc5a");
            rectF.toString();
            int[] iArr = new int[2];
            b0 b0Var = this.f26276w1;
            PDFPageView pDFPageView = null;
            if (b0Var != null) {
                for (Map.Entry<ij.d, View> entry : b0Var.getAllCacheViews().entrySet()) {
                    if (entry.getKey().f18534b == this.f26215l5) {
                        callback = (View) entry.getValue();
                        break;
                    }
                }
            }
            callback = null;
            ea.a.p("PGFHZTxkXnQzbi1TAWEFcHRuAG8xIAhFKGkYaTZnFmkoblB0DHJSUDtnL0kbZA14FT0g", "YOWlLlXE");
            if (callback instanceof PDFPageView) {
                pDFPageView = (PDFPageView) callback;
            }
            if (pDFPageView == null) {
                ea.a.p("NWEeZSNkBXQhbgFTQGE6cHluPG89IFdkEFMYZz9hNnU0ZThhAWVMaTsgCHVYbA==", "m3Fhfl9q");
                return;
            }
            pDFPageView.getLocationOnScreen(iArr);
            ea.a.p("F2E1ZWdpKXcBbhI6", "QigR1LHh");
            ea.a.p("LA==", "1SVXAxp8");
            float[] fArr2 = {fArr[0] - iArr[0], fArr[1] - iArr[1]};
            ea.a.p("V2k4UB9hG0kcdDo=", "hO9C7adq");
            ea.a.p("LA==", "Pp9nffay");
            float width2 = (rectF.width() / 2.0f) + fArr2[0];
            float height2 = (rectF.height() / 2.0f) + fArr2[1];
            float rotation = this.f26209k5.getRotation();
            RectF buildRectF = ReaderPDFCore.buildRectF(width2, height2, rectF.width(), rectF.height(), rotation);
            ea.a.p("K2lCUBVhTlI_Yz5GOg==", "J4bMpiD2");
            Objects.toString(buildRectF);
            ea.a.p("H3c9", "3BY0jCZB");
            buildRectF.width();
            ea.a.p("Y2g9", "QBIBBkwk");
            buildRectF.height();
            kj.b stampAnnotData = this.f26209k5.getStampAnnotData();
            if (stampAnnotData == null) {
                stampAnnotData = new kj.b();
                stampAnnotData.f19802e = "";
                stampAnnotData.f19801d = -16777216;
            }
            int i10 = stampAnnotData.f19804g;
            int i11 = this.f26215l5;
            if (i10 != i11) {
                stampAnnotData.f19804g = i11;
                stampAnnotData.f19805h = true;
            }
            stampAnnotData.c = Integer.valueOf((int) rotation);
            stampAnnotData.f19800b = this.f26209k5.getCenterXYRotationScale().f28468a;
            stampAnnotData.f19803f = pDFPageView.U1(buildRectF);
            ea.a.p("PGFHZTxkXnQzbi1TAWEFcHRuAG8xIBdlDHQ6", "PXClonLN");
            Objects.toString(stampAnnotData.f19803f);
            stampAnnotData.a();
            this.f26209k5.setStampAnnotData(stampAnnotData);
            if (this.q5 == null) {
                this.q5 = new SignActionInfo();
            }
            this.q5.setStampAnnotData(new kj.b(stampAnnotData));
            this.q5.setPageViewInt(iArr);
            this.q5.setPdfPageIndex(this.f26215l5);
            this.q5.setScale(this.f26276w1.getScale());
            this.q5.setSignPathActionInfo(this.f26209k5.getSignPathActionInfo());
            return;
        }
        ea.a.p("QGE9ZTZkC3QbblNTHWE7cAVuXG8yIDBpF24OdBRyXUleYSxlJWkHd1JpRyAHdTps", "poa807A3");
    }

    public final void Q4(String str, boolean z10, Drawable drawable) {
        if (this.V1 == null) {
            try {
                ViewStub viewStub = this.N1;
                if (viewStub != null) {
                    this.V1 = viewStub.inflate();
                }
            } catch (Exception unused) {
            }
        }
        if (this.V1 != null) {
            Handler handler = this.D;
            y1 y1Var = this.f26166c5;
            handler.removeCallbacks(y1Var);
            pdf.pdfreader.viewer.editor.free.utils.j1.g(this.V1, str, z10, drawable);
            handler.postDelayed(y1Var, 2000L);
        }
    }

    @Override // qg.a
    public final void R() {
        PdfReaderViewContainer pdfReaderViewContainer = this.f26254t;
        if (pdfReaderViewContainer != null) {
            pdfReaderViewContainer.postInvalidate();
        }
    }

    public final void R2() {
        this.I1 = true;
        t0 t0Var = this.K1;
        if (t0Var != null) {
            t0Var.a();
            this.K1 = null;
        }
        x1(this.L1);
        this.L1 = null;
        t0 t0Var2 = new t0();
        this.K1 = t0Var2;
        t0Var2.d(new pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.n1(1), new Void[0]);
    }

    public final void R3() {
        SignatureImageView signatureImageView = this.f26209k5;
        if (signatureImageView == null) {
            return;
        }
        nl.f u7 = pdf.pdfreader.viewer.editor.free.utils.t0.u(this, signatureImageView.getCurrentPathSignColor());
        ColorType colorType = ColorType.Black;
        ColorType colorType2 = u7.f22604b;
        int i10 = u7.f22603a;
        if (colorType2 == colorType) {
            AddTextColorView addTextColorView = this.G0;
            if (addTextColorView != null) {
                addTextColorView.c(i10, androidx.core.content.a.getColor(this, R.color.color_100_7B7C7E), 0);
                return;
            }
            return;
        }
        AddTextColorView addTextColorView2 = this.G0;
        if (addTextColorView2 != null) {
            addTextColorView2.c(i10, i10, 0);
        }
    }

    public final void R4() {
        if (TextUtils.isEmpty(this.f26174e3)) {
            return;
        }
        tn.a.d(this, ea.a.p("PGlWbg==", "J1cu8Pun"), ea.a.p("QGksbixhBmoHc0BfGmg5dw==", "qwSvvPct"), ea.a.p("O29FYWw=", "x4pwXJNC"), false);
        tn.a.d(this, ea.a.p("HWlTbg==", "3cn4z7uE"), ea.a.p("PGlWbiZhU2ovcz5fBmgHdw==", "xhZTUpKZ"), this.f26174e3, false);
    }

    @Override // yo.c.InterfaceC0423c
    public final void S0(boolean z10, boolean z11) {
        if (!isFinishing() && !isDestroyed()) {
            BillingConfigImpl billingConfigImpl = BillingConfigImpl.c;
            if (billingConfigImpl.z() && BillingConfigImpl.y() && !billingConfigImpl.w()) {
                ImageView imageView = this.f26255t0;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
            } else {
                ImageView imageView2 = this.f26255t0;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                }
            }
            if (z10) {
                if (this.R3 != null) {
                    N4();
                    this.R3.setEnabled(true);
                    this.R3.setAlpha(1.0f);
                }
                ImageView imageView3 = this.S3;
                if (imageView3 != null) {
                    imageView3.setAlpha(1.0f);
                }
            } else if (z11) {
                if (this.R3 != null) {
                    N4();
                    this.R3.setEnabled(false);
                }
                if (pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this)) {
                    RelativeLayout relativeLayout = this.R3;
                    if (relativeLayout != null) {
                        relativeLayout.setAlpha(0.4f);
                    }
                } else {
                    ImageView imageView4 = this.S3;
                    if (imageView4 != null) {
                        imageView4.setAlpha(0.4f);
                    }
                }
            } else {
                t3();
            }
            if (!z10 && !z11) {
                AppCompatImageView appCompatImageView = this.P3;
                if (appCompatImageView != null) {
                    appCompatImageView.setVisibility(8);
                }
                AppCompatImageView appCompatImageView2 = this.Q3;
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setVisibility(8);
                    return;
                }
                return;
            }
            AppCompatImageView appCompatImageView3 = this.P3;
            if (appCompatImageView3 != null) {
                appCompatImageView3.setVisibility(0);
                this.P3.setEnabled(z10);
            }
            AppCompatImageView appCompatImageView4 = this.Q3;
            if (appCompatImageView4 != null) {
                appCompatImageView4.setVisibility(0);
                this.Q3.setEnabled(z11);
            }
        }
    }

    public final void S2(Bundle bundle) {
        String str;
        LottieAnimationView lottieAnimationView;
        boolean z10;
        if (this.f26256t1 == null) {
            return;
        }
        ReaderView.A0 = !e3();
        this.f26161c0 = true;
        if (TextUtils.isEmpty(this.f26262u1)) {
            this.E2 = lo.d.e(this, String.valueOf(System.currentTimeMillis()));
        } else {
            this.E2 = lo.d.e(this, this.f26262u1);
        }
        this.C2.e(new ao.k2(this));
        if (pdf.pdfreader.viewer.editor.free.utils.extension.c.g(this)) {
            pdf.pdfreader.viewer.editor.free.utils.q0.u();
        }
        pdf.pdfreader.viewer.editor.free.utils.q0.t();
        boolean B3 = B3();
        Handler handler = this.D;
        if (!B3 && !C3()) {
            this.S2 = !FullScreenManage.d(this, null, 3, true);
        } else {
            handler.postDelayed(new a0(), 2000L);
        }
        wn.c cVar = this.f26297z2;
        if (cVar != null) {
            cVar.f31396b = true;
            cVar.c = true;
            cVar.c();
        }
        if (bundle == null) {
            wn.b.b();
        }
        Context m10 = ReaderPdfApplication.m();
        zl.a.c.getClass();
        ig.h<Object>[] hVarArr = zl.a.f32400d;
        ig.h<Object> hVar = hVarArr[0];
        pdf.pdfreader.viewer.editor.free.datasource.sp.a aVar = zl.a.f32401e;
        if (!pdf.pdfreader.viewer.editor.free.utils.t0.b0(((Number) aVar.b(hVar)).longValue(), System.currentTimeMillis())) {
            tn.a.a(m10, ea.a.p("UG85ZSx2C2UFX0doBnc=", "OSOF39Cj"));
            aVar.c(hVarArr[0], Long.valueOf(System.currentTimeMillis()));
        }
        if (this.f26256t1 != null) {
            ea.a.p("O2VCdHQ=", "ntMo41ii");
            ea.a.p("UHIuYQdlN0lIY1t1B3QGYSNlQSA=", "IsqSHkPG");
            this.f26256t1.countPages();
            String str2 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        }
        b0 b0Var = new b0(this);
        this.f26276w1 = b0Var;
        b0Var.setTextEditorOperateCallback(new c0());
        this.f26276w1.setDeleteAnnotation(new d0());
        this.f26276w1.setOnScrollListener(new e0());
        this.f26276w1.setOnPageScrollListener(new f0());
        this.f26276w1.setUnReDoStateListener(null);
        this.f26276w1.setUnReDoStateListener(this);
        this.f26276w1.setOnPageOperateListener(new g0());
        this.f26276w1.setOnReflowStateChangeListener(new h0());
        this.f26276w1.setListener(new j0());
        this.f26276w1.setAdapter(new PDFPageAdapter(this, this, this.f26256t1));
        this.f26276w1.setOnPageOrientationChangeListener(new k0());
        this.E1 = new l0(this, this.f26256t1);
        View inflate = getLayoutInflater().inflate(R.layout.layout_pdf_view_editor2, (ViewGroup) null);
        this.f26283x1 = inflate;
        View findViewById = inflate.findViewById(R.id.viewOverlayTop);
        this.F0 = findViewById;
        findViewById.setOnClickListener(this);
        this.f26260u = (ConstraintLayout) this.f26283x1.findViewById(R.id.rootView);
        this.f26220m4 = (FrameLayout) this.f26283x1.findViewById(R.id.fl_pdf2word_progress);
        this.f26226n4 = (Pdf2WordProgress) this.f26283x1.findViewById(R.id.pdf2word_progressbar);
        RelativeLayout relativeLayout = (RelativeLayout) this.f26283x1.findViewById(R.id.top_ll);
        this.P = relativeLayout;
        relativeLayout.addOnLayoutChangeListener(new pdf.pdfreader.viewer.editor.free.pdfview.k());
        this.f26172e0 = this.f26283x1.findViewById(R.id.fl_bottom_reflow_edit_container);
        this.f26187h0 = (ImageView) this.f26283x1.findViewById(R.id.iv_reflow_edit_size_enlarge);
        this.f26182g0 = (ImageView) this.f26283x1.findViewById(R.id.iv_reflow_edit_size_reduce);
        this.f26192i0 = (ImageView) this.f26283x1.findViewById(R.id.iv_reflow_page_previous);
        this.f26198j0 = (ImageView) this.f26283x1.findViewById(R.id.iv_reflow_page_next);
        this.f26177f0 = (FrameLayout) this.f26283x1.findViewById(R.id.reflow_load_fl);
        this.f26222n0 = (ProgressView) this.f26283x1.findViewById(R.id.reflow_zoom_progress);
        this.f26228o0 = (TextView) this.f26283x1.findViewById(R.id.reflow_zoom_tv_scale);
        ImageView imageView = this.f26182g0;
        h1 h1Var = this.s4;
        if (imageView != null) {
            imageView.setOnClickListener(h1Var);
        }
        ImageView imageView2 = this.f26187h0;
        if (imageView2 != null) {
            imageView2.setOnClickListener(h1Var);
        }
        ImageView imageView3 = this.f26192i0;
        if (imageView3 != null) {
            imageView3.setOnClickListener(this);
        }
        ImageView imageView4 = this.f26198j0;
        if (imageView4 != null) {
            imageView4.setOnClickListener(this);
        }
        View view = this.f26283x1;
        if (view != null) {
            this.f26278w3 = (AddTextChangeSizeBottomSheetView) view.findViewById(R.id.add_text_change_size_bottom_sheet);
            this.f26285x3 = (AddTextChangeColorBottomSheetView) this.f26283x1.findViewById(R.id.add_text_change_color_bottom_sheet);
            this.f26271v3 = this.f26283x1.findViewById(R.id.view_edit_operate);
            this.f26298z3 = (ConstraintLayout) this.f26283x1.findViewById(R.id.ll_bottom_edit_type);
            this.A3 = (TextView) this.f26283x1.findViewById(R.id.tv_edit_type_editor);
            this.B3 = (TextView) this.f26283x1.findViewById(R.id.tv_edit_type_annotate);
            this.C3 = (TextView) this.f26283x1.findViewById(R.id.tv_edit_type_signature);
            this.D3 = this.f26283x1.findViewById(R.id.viewMarkEditType);
        }
        View inflate2 = LayoutInflater.from(this).inflate(R.layout.pop_add_text_edit_again, (ViewGroup) null);
        inflate2.measure(-2, -2);
        PopupWindow popupWindow = new PopupWindow(inflate2, -2, -2);
        this.B5 = popupWindow;
        popupWindow.setOutsideTouchable(false);
        this.B5.setBackgroundDrawable(androidx.core.content.a.getDrawable(this, R.color.no_color));
        View findViewById2 = inflate2.findViewById(R.id.add_text_cl_root);
        this.L0 = findViewById2;
        findViewById2.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        View findViewById3 = inflate2.findViewById(R.id.add_text_tv_delete);
        View findViewById4 = inflate2.findViewById(R.id.add_text_ll_color);
        this.K0 = (AddTextColorView) inflate2.findViewById(R.id.add_text_iv_color);
        ((TextView) inflate2.findViewById(R.id.add_text_tv_size)).setOnClickListener(new ao.q0(this));
        findViewById3.setOnClickListener(new ao.r0(this));
        findViewById4.setOnClickListener(new ao.s0(this));
        AddTextChangeSizeBottomSheetView addTextChangeSizeBottomSheetView = this.f26278w3;
        if (addTextChangeSizeBottomSheetView != null) {
            addTextChangeSizeBottomSheetView.setOnCallBackListener(new ao.t0(this));
        }
        AddTextChangeColorBottomSheetView addTextChangeColorBottomSheetView = this.f26285x3;
        if (addTextChangeColorBottomSheetView != null) {
            addTextChangeColorBottomSheetView.setOnCallBackListener(new ao.u0(this));
        }
        x2(this.f26234p0);
        TextView textView = this.B3;
        if (textView != null) {
            textView.addOnLayoutChangeListener(new pdf.pdfreader.viewer.editor.free.feature.billing.ui.b(this, 3));
        }
        TextView textView2 = this.B3;
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
        TextView textView3 = this.A3;
        if (textView3 != null) {
            textView3.setOnClickListener(this);
        }
        TextView textView4 = this.C3;
        if (textView4 != null) {
            textView4.setOnClickListener(this);
        }
        PdfReaderViewContainer pdfReaderViewContainer = (PdfReaderViewContainer) this.f26283x1.findViewById(R.id.pdfView);
        this.f26254t = pdfReaderViewContainer;
        ij.f fVar = this.f26263u2;
        if (fVar != null) {
            pdfReaderViewContainer.setPageParam(fVar);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) this.f26283x1.findViewById(R.id.actionBarView);
        this.f26231o3 = constraintLayout;
        constraintLayout.setOnClickListener(this);
        this.f26237p3 = this.f26283x1.findViewById(R.id.viewStatusBarSpace);
        this.f26242q3 = (ViewGroup) this.f26283x1.findViewById(R.id.bgPageToast);
        ViewGroup viewGroup = (ViewGroup) this.f26283x1.findViewById(R.id.pageGotoLl);
        this.f26247r3 = viewGroup;
        viewGroup.setOnClickListener(h1Var);
        ImageView imageView5 = (ImageView) this.f26283x1.findViewById(R.id.iv_open_reflow);
        this.f26252s3 = imageView5;
        imageView5.setOnClickListener(h1Var);
        this.Z4 = this.f26283x1.findViewById(R.id.editButtonGuide);
        this.f26208k4 = (ImageView) this.f26283x1.findViewById(R.id.iv_ai_assistant);
        this.f26214l4 = this.f26283x1.findViewById(R.id.ai_assistant_guide_btn_bg);
        ImageView imageView6 = this.f26208k4;
        if (imageView6 != null) {
            imageView6.setOnClickListener(h1Var);
        }
        View view2 = this.f26283x1;
        if (view2 != null) {
            this.f26268v0 = (SignSizeBottomSheetView) view2.findViewById(R.id.preview_sign_size_sheet_view);
            this.f26275w0 = (SignColorBottomSheetView) this.f26283x1.findViewById(R.id.preview_sign_color_sheet_view);
        }
        SignSizeBottomSheetView signSizeBottomSheetView = this.f26268v0;
        if (signSizeBottomSheetView != null) {
            signSizeBottomSheetView.setHasSign(true);
        }
        View inflate3 = LayoutInflater.from(this).inflate(R.layout.pop_sign_edit_again, (ViewGroup) null);
        inflate3.measure(-2, -2);
        PopupWindow popupWindow2 = new PopupWindow(inflate3, -2, -2);
        this.f26248r5 = popupWindow2;
        popupWindow2.setOutsideTouchable(false);
        this.f26248r5.setBackgroundDrawable(androidx.core.content.a.getDrawable(this, R.color.no_color));
        View findViewById5 = inflate3.findViewById(R.id.sign_ll_root);
        this.f26253s5 = findViewById5;
        findViewById5.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.M0 = inflate3.findViewById(R.id.sign_iv_size);
        this.N0 = inflate3.findViewById(R.id.sign_ll_color);
        View findViewById6 = inflate3.findViewById(R.id.sign_tv_delete);
        this.G0 = (AddTextColorView) inflate3.findViewById(R.id.sign_iv_color);
        this.f26268v0.setOnSizeChangeCallBack(new ao.x(this));
        SignColorBottomSheetView signColorBottomSheetView = this.f26275w0;
        if (signColorBottomSheetView != null) {
            signColorBottomSheetView.setOnColorItemClickListener(new ao.y(this));
        }
        findViewById6.setOnClickListener(new ao.z(this));
        View view3 = this.M0;
        if (view3 != null) {
            view3.setOnClickListener(new ao.a0(this));
        }
        View view4 = this.N0;
        if (view4 != null) {
            view4.setOnClickListener(new ao.b0(this));
        }
        R3();
        View view5 = this.f26283x1;
        if (view5 != null) {
            this.D5 = view5.findViewById(R.id.ll_preview_word2pdf_completed_container);
            this.G5 = (TextView) this.f26283x1.findViewById(R.id.tv_preview_word2pdf_completed_tips);
            this.E5 = this.f26283x1.findViewById(R.id.tv_preview_word2pdf_completed_view);
            this.F5 = this.f26283x1.findViewById(R.id.iv_preview_word2pdf_completed_close);
            this.f26216m0 = (PreviewPageManageGuideView) this.f26283x1.findViewById(R.id.pdf2word_pop_guide_container);
            ((BlurView) this.f26283x1.findViewById(R.id.blur_extract_success_bg)).b(this.G2, new qe.g(this)).f29293a = 3.52f;
        }
        PreviewPageManageGuideView previewPageManageGuideView = this.f26216m0;
        if (previewPageManageGuideView != null) {
            previewPageManageGuideView.setOnPageManageGuideClickListener(new ao.v0(this));
        }
        View view6 = this.E5;
        if (view6 != null) {
            view6.setOnClickListener(new ao.w0(this));
        }
        View view7 = this.F5;
        if (view7 != null) {
            view7.setOnClickListener(new ao.x0(this));
        }
        DrawSignView drawSignView = this.f26244r0;
        if (drawSignView != null) {
            drawSignView.setOnDrawSignViewListener(new ao.i1(this));
        }
        j4(0);
        if (pdf.pdfreader.viewer.editor.free.utils.c1.L(this)) {
            this.f26232o4 = true;
            this.f26252s3.setVisibility(0);
        } else {
            this.f26232o4 = false;
            this.f26252s3.setVisibility(8);
        }
        this.f26210l0 = this.f26283x1.findViewById(R.id.v_reflow_hint);
        L2();
        this.M1 = (Group) this.f26283x1.findViewById(R.id.emptyGroup);
        this.U3 = (ViewGroup) this.f26283x1.findViewById(R.id.ad_layout);
        this.V3 = (ViewGroup) this.f26283x1.findViewById(R.id.bottomAdContainer);
        ViewGroup viewGroup2 = (ViewGroup) this.f26283x1.findViewById(R.id.editButtonContainer);
        this.X3 = viewGroup2;
        viewGroup2.setOnClickListener(h1Var);
        this.Y3 = (AppCompatImageView) this.f26283x1.findViewById(R.id.edit_img);
        this.f26207k3 = getResources().getDimensionPixelSize(R.dimen.dp_50);
        InterceptRecyclerView interceptRecyclerView = (InterceptRecyclerView) this.f26283x1.findViewById(R.id.thumb_rv);
        this.Z3 = interceptRecyclerView;
        interceptRecyclerView.setTopTouchListener(new ao.a(this));
        this.f26202j4 = this.f26283x1.findViewById(R.id.thumb_dividing_line);
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.f26283x1.findViewById(R.id.shareIv);
        this.f26154a4 = appCompatImageView;
        appCompatImageView.setOnClickListener(h1Var);
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) this.f26283x1.findViewById(R.id.viewSetting);
        this.f26159b4 = appCompatImageView2;
        appCompatImageView2.setOnClickListener(h1Var);
        AppCompatImageView appCompatImageView3 = (AppCompatImageView) this.f26283x1.findViewById(R.id.moreIv);
        this.f26165c4 = appCompatImageView3;
        appCompatImageView3.setOnClickListener(h1Var);
        this.f26170d4 = (PreviewPDF2WordStateView) this.f26283x1.findViewById(R.id.pdf2WordView);
        this.f26175e4 = (ImageView) this.f26283x1.findViewById(R.id.pdf2wordIv_vip);
        PreviewPDF2WordStateView previewPDF2WordStateView = this.f26170d4;
        if (previewPDF2WordStateView != null) {
            previewPDF2WordStateView.setOnClickListener(this);
        }
        if (this.f26175e4 != null) {
            BillingConfigImpl billingConfigImpl = BillingConfigImpl.c;
            if (billingConfigImpl.z() && !billingConfigImpl.w() && BillingConfigImpl.u()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f26175e4.setVisibility(0);
            } else {
                this.f26175e4.setVisibility(8);
            }
        }
        NativeSoLoaderHelper.f1942k.e(this, new ao.j1(this));
        AppCompatImageView appCompatImageView4 = (AppCompatImageView) this.f26283x1.findViewById(R.id.searchIv);
        this.f26180f4 = appCompatImageView4;
        appCompatImageView4.setOnClickListener(h1Var);
        this.f26196i4 = this.f26283x1.findViewById(R.id.pageToastLine);
        this.f26190h4 = this.f26283x1.findViewById(R.id.pageSlash);
        TextView textView5 = (TextView) this.f26283x1.findViewById(R.id.fileNameTv);
        this.f26185g4 = textView5;
        textView5.setText(this.f26269v1);
        ViewGroup viewGroup3 = this.f26242q3;
        if (viewGroup3 != null) {
            viewGroup3.setVisibility(0);
        }
        this.O = (FrameLayout) this.f26283x1.findViewById(R.id.slideContainer);
        this.f26264u3 = (LottieAnimationView) this.f26283x1.findViewById(R.id.backIv);
        if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(this) && (lottieAnimationView = this.f26264u3) != null) {
            lottieAnimationView.setRotation(-180.0f);
        }
        LottieAnimationView lottieAnimationView2 = this.f26264u3;
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.setOnClickListener(this);
        }
        boolean isDestroyed = isDestroyed();
        w1 w1Var = this.U4;
        if (!isDestroyed && !isFinishing() && !this.J) {
            FrameLayout frameLayout = this.O;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            PDFScrollHandle pDFScrollHandle = this.f26258t3;
            if (pDFScrollHandle != null) {
                pDFScrollHandle.i();
            }
            handler.removeCallbacks(w1Var);
            handler.postDelayed(w1Var, 2000L);
        }
        PDFScrollHandle pDFScrollHandle2 = (PDFScrollHandle) this.f26283x1.findViewById(R.id.scrollHandle);
        this.f26258t3 = pDFScrollHandle2;
        pDFScrollHandle2.setVisibility(0);
        this.F1 = (TextView) this.f26283x1.findViewById(R.id.currentPageTv);
        this.G1 = (TextView) this.f26283x1.findViewById(R.id.totalPageTv);
        this.N3 = (Group) this.f26283x1.findViewById(R.id.editToolGroup);
        AppCompatImageView appCompatImageView5 = (AppCompatImageView) this.f26283x1.findViewById(R.id.pdf_toolbar_3_edit_use_guide);
        this.O3 = appCompatImageView5;
        appCompatImageView5.setOnClickListener(h1Var);
        this.P3 = (AppCompatImageView) this.f26283x1.findViewById(R.id.pdf_toolbar_3_undo);
        A2(null, false);
        AppCompatImageView appCompatImageView6 = this.P3;
        if (appCompatImageView6 != null) {
            appCompatImageView6.setOnClickListener(this);
        }
        this.Q3 = (AppCompatImageView) this.f26283x1.findViewById(R.id.pdf_toolbar_3_redo);
        z2(null, false);
        AppCompatImageView appCompatImageView7 = this.Q3;
        if (appCompatImageView7 != null) {
            appCompatImageView7.setOnClickListener(this);
        }
        this.S3 = (ImageView) this.f26283x1.findViewById(R.id.pdf_toolbar_3_ok_icon);
        this.R3 = (RelativeLayout) this.f26283x1.findViewById(R.id.pdf_toolbar_3_ok);
        this.f26255t0 = (ImageView) this.f26283x1.findViewById(R.id.save_iv_vip);
        this.f26261u0 = (TextView) this.f26283x1.findViewById(R.id.save_tv_free_count);
        RelativeLayout relativeLayout2 = this.R3;
        if (relativeLayout2 != null) {
            relativeLayout2.setOnClickListener(this);
        }
        this.F3 = (RelativeLayout) this.f26283x1.findViewById(R.id.pdf_bottom_1_edit_copy);
        this.E3 = this.f26283x1.findViewById(R.id.pdf_bottom_1_edit_top_line);
        this.F3.setOnClickListener(this);
        RelativeLayout relativeLayout3 = (RelativeLayout) this.f26283x1.findViewById(R.id.pdf_bottom_1_edit_under);
        this.G3 = relativeLayout3;
        relativeLayout3.setOnClickListener(this);
        RelativeLayout relativeLayout4 = (RelativeLayout) this.f26283x1.findViewById(R.id.pdf_bottom_1_edit_middle);
        this.H3 = relativeLayout4;
        relativeLayout4.setOnClickListener(this);
        RelativeLayout relativeLayout5 = (RelativeLayout) this.f26283x1.findViewById(R.id.pdf_bottom_1_edit_highlight);
        this.I3 = relativeLayout5;
        relativeLayout5.setOnClickListener(this);
        LinearLayout linearLayout = (LinearLayout) this.f26283x1.findViewById(R.id.pdf_bottom_1_edit_draw);
        this.J3 = linearLayout;
        linearLayout.setOnClickListener(this);
        View view8 = this.f26283x1;
        if (view8 != null) {
            this.f26282x0 = (GraffitiBottomSheetView) view8.findViewById(R.id.graffiti_color_size_sheet_view);
            this.K3 = (RelativeLayout) this.f26283x1.findViewById(R.id.rl_graffiti_color);
            this.L3 = (AddTextColorView) this.f26283x1.findViewById(R.id.view_graffiti_change_color);
            this.M3 = (GraffitiIconView) this.f26283x1.findViewById(R.id.view_graffiti);
            zl.b.c.getClass();
            m4(zl.b.h());
        }
        RelativeLayout relativeLayout6 = this.K3;
        if (relativeLayout6 != null) {
            relativeLayout6.setOnClickListener(new ao.c0(this));
        }
        GraffitiBottomSheetView graffitiBottomSheetView = this.f26282x0;
        if (graffitiBottomSheetView != null) {
            graffitiBottomSheetView.setOnSheetViewStateChangedListener(new ao.d0(this));
            this.f26282x0.setOnColorItemClickListener(new ao.e0(this));
            this.f26282x0.setOnSizeChangeCallBack(new ao.f0(this));
        }
        View view9 = this.f26283x1;
        if (view9 != null) {
            this.B0 = (FrameLayout) view9.findViewById(R.id.fl_eraser);
            this.f26288y0 = (LinearLayout) this.f26283x1.findViewById(R.id.eraser_root);
            this.f26295z0 = (ConstraintLayout) this.f26283x1.findViewById(R.id.con_eraser_size_container);
            ConstraintLayout constraintLayout2 = (ConstraintLayout) this.f26283x1.findViewById(R.id.con_eraser_container);
            this.A0 = this.f26283x1.findViewById(R.id.con_eraser_container_bg);
            this.C0 = (AppCompatImageView) this.f26283x1.findViewById(R.id.iv_eraser);
            this.D0 = (AppCompatImageView) this.f26283x1.findViewById(R.id.iv_eraser_bg);
            this.E0 = this.f26283x1.findViewById(R.id.view_eraser_line);
            LinearLayout linearLayout2 = (LinearLayout) this.f26283x1.findViewById(R.id.ll_eraser_size1);
            LinearLayout linearLayout3 = (LinearLayout) this.f26283x1.findViewById(R.id.ll_eraser_size2);
            LinearLayout linearLayout4 = (LinearLayout) this.f26283x1.findViewById(R.id.ll_eraser_size3);
            LinearLayout linearLayout5 = (LinearLayout) this.f26283x1.findViewById(R.id.ll_eraser_size4);
            LinearLayout linearLayout6 = (LinearLayout) this.f26283x1.findViewById(R.id.ll_eraser_size5);
            linearLayout3.setSelected(true);
            a.C0246a.f18352a.c = (int) ((getResources().getDisplayMetrics().density * 30.0f) + 0.5d);
            FrameLayout frameLayout2 = this.B0;
            if (frameLayout2 != null) {
                frameLayout2.setOnClickListener(new ao.g0(this));
            }
            linearLayout2.setOnClickListener(new ao.h0(this, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6));
            linearLayout3.setOnClickListener(new ao.i0(this, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6));
            linearLayout4.setOnClickListener(new ao.j0(this, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6));
            linearLayout5.setOnClickListener(new ao.k0(this, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6));
            linearLayout6.setOnClickListener(new ao.l0(this, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6));
        }
        this.T3 = (ProgressView) this.f26283x1.findViewById(R.id.save_anim);
        InterceptTouchFrameLayout interceptTouchFrameLayout = (InterceptTouchFrameLayout) this.f26283x1.findViewById(R.id.intercept_fl);
        this.U = interceptTouchFrameLayout;
        interceptTouchFrameLayout.setTopTouchListener(new h5.a(this, 16));
        InterceptTouchFrameLayout interceptTouchFrameLayout2 = this.I2;
        if (interceptTouchFrameLayout2 != null) {
            interceptTouchFrameLayout2.setTopTouchListener(new ao.j(this));
        }
        ViewStub viewStub = (ViewStub) this.f26283x1.findViewById(R.id.editToolsBarVS);
        this.P1 = viewStub;
        if (viewStub != null) {
            viewStub.setOnInflateListener(new pdf.pdfreader.viewer.editor.free.pdfview.l(this));
        }
        ViewStub viewStub2 = (ViewStub) this.f26283x1.findViewById(R.id.editTextToolsBarVS);
        this.Q1 = viewStub2;
        if (viewStub2 != null) {
            viewStub2.setOnInflateListener(new pdf.pdfreader.viewer.editor.free.pdfview.m(this));
        }
        ViewStub viewStub3 = (ViewStub) this.f26283x1.findViewById(R.id.editTextChangeColorVS);
        this.R1 = viewStub3;
        if (viewStub3 != null) {
            viewStub3.setOnInflateListener(new pdf.pdfreader.viewer.editor.free.pdfview.n(this));
        }
        ViewStub viewStub4 = (ViewStub) this.f26283x1.findViewById(R.id.editTextEditorInputVS);
        this.S1 = viewStub4;
        if (viewStub4 != null) {
            viewStub4.setOnInflateListener(new ao.x1(this));
        }
        this.f26236p2 = (Space) this.f26283x1.findViewById(R.id.keyboardSpace);
        this.T = (FrameLayout) this.f26283x1.findViewById(R.id.fl_bottom_edit_container);
        this.F = (AppCompatImageView) this.f26283x1.findViewById(R.id.iv_copy);
        this.T1 = (ViewStub) this.f26283x1.findViewById(R.id.vs_preview_edit_guide);
        this.U1 = (ViewStub) this.f26283x1.findViewById(R.id.vs_preview_create_edit_guide);
        ViewStub viewStub5 = this.T1;
        if (viewStub5 != null) {
            viewStub5.setOnInflateListener(new ao.y1(this));
        }
        ViewStub viewStub6 = this.U1;
        if (viewStub6 != null) {
            viewStub6.setOnInflateListener(new ao.a2(this));
        }
        SignCreateView signCreateView = (SignCreateView) this.f26283x1.findViewById(R.id.sign_create_view);
        this.f26249s0 = signCreateView;
        signCreateView.setOnSignCreateViewClickListener(new ao.k1(this));
        this.G = (ImageView) this.f26283x1.findViewById(R.id.iv_underline);
        this.H = (ImageView) this.f26283x1.findViewById(R.id.iv_deleteline);
        this.I = (ImageView) this.f26283x1.findViewById(R.id.iv_highlight);
        this.B1 = (AppCompatImageView) this.f26283x1.findViewById(R.id.searchBackIv);
        this.C1 = (AppCompatImageView) this.f26283x1.findViewById(R.id.searchForwardIv);
        EditText editText = (EditText) this.f26283x1.findViewById(R.id.searchEditText);
        this.D1 = editText;
        editText.setHint(" " + getString(R.string.arg_res_0x7f1303e8));
        this.D1.setImeOptions(268435459);
        this.B = (AppCompatImageView) this.f26283x1.findViewById(R.id.searchClearIv);
        this.f26241q2 = this.f26283x1.findViewById(R.id.searchJumpGroup);
        ViewStub viewStub7 = (ViewStub) this.f26283x1.findViewById(R.id.reflow_continue_tip_vs);
        this.O1 = (ViewStub) this.f26283x1.findViewById(R.id.preview_page_number_vs);
        this.N1 = (ViewStub) this.f26283x1.findViewById(R.id.toast_vs);
        O4(false, false);
        T4();
        Y3();
        o9.d.s(ea.a.p("cWElbhZyI2Qxb1p0G29s", "vQbScOUI"), ea.a.p("Q3IudhplFSACYVNlSW84QzZlU3QjIC9vU2Q=", "21ba2L88"));
        D2();
        EditText editText2 = this.D1;
        if (editText2 != null) {
            editText2.addTextChangedListener(new m0());
        }
        EditText editText3 = this.D1;
        if (editText3 != null) {
            editText3.setOnEditorActionListener(new n0());
        }
        AppCompatImageView appCompatImageView8 = this.B;
        if (appCompatImageView8 != null) {
            appCompatImageView8.setOnClickListener(new o0());
        }
        AppCompatImageView appCompatImageView9 = this.B1;
        if (appCompatImageView9 != null) {
            appCompatImageView9.setOnClickListener(new p0());
        }
        AppCompatImageView appCompatImageView10 = this.C1;
        if (appCompatImageView10 != null) {
            appCompatImageView10.setOnClickListener(new q0());
        }
        D3();
        if (bundle != null && bundle.getBoolean(ea.a.p("PGUtcjdoFG8sZQ==", "RMoLTYDH"), false)) {
            g4();
        }
        if (bundle != null && bundle.getBoolean(ea.a.p("K2U_bDd3OW8sZQ==", "V1yYXt9g"), false)) {
            this.J1 = true;
            b0 b0Var2 = this.f26276w1;
            if (b0Var2 != null) {
                b0Var2.setAdapter(new PDFReflowAdapter(this, this.f26256t1));
            }
            b0 b0Var3 = this.f26276w1;
            if (b0Var3 != null) {
                b0Var3.setLinksEnabled(false);
            }
            b0 b0Var4 = this.f26276w1;
            if (b0Var4 != null) {
                b0Var4.c = true;
                b0Var4.f21392h = 1.0f;
                b0Var4.f21396j = 0;
                b0Var4.f21394i = 0;
                b0Var4.requestLayout();
            }
        }
        ReaderPDFCore readerPDFCore = this.f26256t1;
        if (readerPDFCore != null) {
            int countPages = readerPDFCore.countPages();
            this.f26251s2 = countPages;
            if (countPages <= 1) {
                K3(false);
                FrameLayout frameLayout3 = this.O;
                if (frameLayout3 != null) {
                    frameLayout3.setVisibility(8);
                }
            } else {
                TextView textView6 = this.G1;
                if (textView6 != null) {
                    textView6.setText(String.format(ea.a.p("anM=", "2c6CtlPI"), Integer.valueOf(this.f26251s2)));
                }
            }
        }
        PDFScrollHandle pDFScrollHandle3 = this.f26258t3;
        if (pDFScrollHandle3 != null) {
            pDFScrollHandle3.setOnTouchListener(new r0());
        }
        if (this.J) {
            s4(8);
            PDFScrollHandle pDFScrollHandle4 = this.f26258t3;
            if (pDFScrollHandle4 != null) {
                pDFScrollHandle4.setVisibility(8);
                this.f26258t3.setForceDismiss(true);
            }
            K3(false);
            handler.postDelayed(w1Var, 2000L);
        } else if (this.M) {
            this.f26186g5 = 0;
            M3(true);
        }
        b0 b0Var5 = this.f26276w1;
        b0Var5.f21418u = this.f26258t3;
        PdfReaderViewContainer pdfReaderViewContainer2 = this.f26254t;
        if (pdfReaderViewContainer2 != null) {
            pdfReaderViewContainer2.addView(b0Var5, 0);
        }
        InterceptTouchFrameLayout interceptTouchFrameLayout3 = this.I2;
        if (interceptTouchFrameLayout3 != null) {
            interceptTouchFrameLayout3.addView(this.f26283x1, -1, -1);
        }
        FrameLayout frameLayout4 = this.H2;
        if (frameLayout4 != null) {
            frameLayout4.setVisibility(8);
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0);
        InterceptRecyclerView interceptRecyclerView2 = this.Z3;
        if (interceptRecyclerView2 != null) {
            interceptRecyclerView2.setLayoutManager(linearLayoutManager);
        }
        ThumbnailAdapter thumbnailAdapter = new ThumbnailAdapter(this, this.C2, true, new pdf.pdfreader.viewer.editor.free.thumb.adapter.b(this.E2, this.f26251s2), false, this);
        this.D2 = thumbnailAdapter;
        thumbnailAdapter.f26593r = !e3();
        InterceptRecyclerView interceptRecyclerView3 = this.Z3;
        if (interceptRecyclerView3 != null) {
            interceptRecyclerView3.setAdapter(this.D2);
        }
        linearLayoutManager.B0(this.B2);
        this.D2.h(this.B2 + 1);
        InterceptRecyclerView interceptRecyclerView4 = this.Z3;
        if (interceptRecyclerView4 != null) {
            interceptRecyclerView4.setVisibility(0);
        }
        View view10 = this.f26202j4;
        if (view10 != null) {
            view10.setVisibility(0);
        }
        if (!this.F2) {
            pdf.pdfreader.viewer.editor.free.utils.p.w(this, ea.a.p("OGRm", "euHKdgn6"));
        }
        c.a.f32211a.f32208a.add(this);
        ReaderPDFCore readerPDFCore2 = this.f26256t1;
        if (readerPDFCore2 != null) {
            str = readerPDFCore2.fileFormat();
        } else {
            str = null;
        }
        if (ea.a.p("D1A2TyVG", "PuHdjvF4").equals(str)) {
            this.f26276w1.setDisplayedViewIndex(getIntent().getIntExtra(ea.a.p("G3QGcjxpA2cYYQFl", "MyhgHmfi"), 0));
        }
        this.C.postDelayed(new s0(), 300L);
        this.f26276w1.postDelayed(new u0(), 150L);
        this.f26276w1.postDelayed(new v0(), 10L);
    }

    public final void S3() {
        ReaderPDFCore.clearPageStampAnnotDataMap();
        yo.c cVar = c.a.f32211a;
        cVar.f32210d.clear();
        cVar.c.clear();
        g.a.f31902a.f31901a.clear();
        this.f26259t5.clear();
        this.f26266u5.clear();
    }

    public final void S4(int i10) {
        yo.c cVar = c.a.f32211a;
        if (!cVar.c.isEmpty()) {
            BillingConfigImpl billingConfigImpl = BillingConfigImpl.c;
            if (billingConfigImpl.z() && BillingConfigImpl.y() && !billingConfigImpl.w()) {
                if (this.H0 == null) {
                    this.H0 = new g3(this);
                }
                this.H0.f27599y = ea.a.p("QGksbg==", "Banh7S4O");
                g3 g3Var = this.H0;
                g3Var.f27600z = new l(i10);
                g3Var.show();
                return;
            }
        }
        if (!cVar.c.isEmpty()) {
            d4(new pdf.pdfreader.viewer.editor.free.pdfview.c(this, 3));
        }
        O3(i10);
    }

    public final void T2() {
        PopupWindow popupWindow = this.A;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.A.dismiss();
        }
    }

    public final void T3() {
        if (!this.f26281x) {
            eo.e.n(this, eo.e.c(this) + 1);
        }
        this.f26281x = true;
        try {
            ReaderPDFCore readerPDFCore = new ReaderPDFCore(this, this.f26246r2);
            if (readerPDFCore.needsPassword() && !TextUtils.isEmpty(this.W)) {
                readerPDFCore.authenticatePassword(this.W);
            }
            readerPDFCore.countPages();
            readerPDFCore.transportData(this.f26256t1);
            q4(readerPDFCore);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062 A[Catch: Exception -> 0x0072, TRY_LEAVE, TryCatch #0 {Exception -> 0x0072, blocks: (B:3:0x0003, B:5:0x000c, B:10:0x0014, B:12:0x0018, B:15:0x001f, B:18:0x0028, B:20:0x002e, B:22:0x003a, B:24:0x0043, B:25:0x005b, B:26:0x005e, B:28:0x0062), top: B:33:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T4() {
        /*
            r5 = this;
            r0 = 2131099813(0x7f0600a5, float:1.781199E38)
            int r0 = androidx.core.content.a.getColor(r5, r0)     // Catch: java.lang.Exception -> L72
            boolean r1 = r5.f26167d0     // Catch: java.lang.Exception -> L72
            r2 = 0
            if (r1 != 0) goto L13
            boolean r1 = r5.f19294h     // Catch: java.lang.Exception -> L72
            if (r1 != 0) goto L11
            goto L13
        L11:
            r1 = r2
            goto L14
        L13:
            r1 = 1
        L14:
            pdf.pdfreader.viewer.editor.free.ui.widget.DrawSignView r3 = r5.f26244r0     // Catch: java.lang.Exception -> L72
            if (r3 == 0) goto L1f
            int r3 = r3.getVisibility()     // Catch: java.lang.Exception -> L72
            if (r3 != 0) goto L1f
            r1 = r2
        L1f:
            pdf.pdfreader.viewer.editor.free.utils.h1.g(r5, r0, r1)     // Catch: java.lang.Exception -> L72
            pdf.pdfreader.viewer.editor.free.ui.myview.InterceptTouchFrameLayout r0 = r5.I2     // Catch: java.lang.Exception -> L72
            if (r0 == 0) goto L5e
            if (r1 == 0) goto L5b
            android.view.Window r0 = r5.getWindow()     // Catch: java.lang.Exception -> L72
            if (r0 == 0) goto L5e
            android.view.View r0 = r0.getDecorView()     // Catch: java.lang.Exception -> L72
            java.util.WeakHashMap<android.view.View, x0.n0> r1 = x0.f0.f31435a     // Catch: java.lang.Exception -> L72
            x0.s0 r0 = x0.f0.j.a(r0)     // Catch: java.lang.Exception -> L72
            if (r0 == 0) goto L5e
            r1 = 2
            o0.b r0 = r0.a(r1)     // Catch: java.lang.Exception -> L72
            int r1 = r0.f22641d     // Catch: java.lang.Exception -> L72
            if (r1 <= 0) goto L5e
            pdf.pdfreader.viewer.editor.free.ui.myview.InterceptTouchFrameLayout r1 = r5.I2     // Catch: java.lang.Exception -> L72
            int r2 = r1.getPaddingLeft()     // Catch: java.lang.Exception -> L72
            pdf.pdfreader.viewer.editor.free.ui.myview.InterceptTouchFrameLayout r3 = r5.I2     // Catch: java.lang.Exception -> L72
            int r3 = r3.getPaddingTop()     // Catch: java.lang.Exception -> L72
            pdf.pdfreader.viewer.editor.free.ui.myview.InterceptTouchFrameLayout r4 = r5.I2     // Catch: java.lang.Exception -> L72
            int r4 = r4.getPaddingRight()     // Catch: java.lang.Exception -> L72
            int r0 = r0.f22641d     // Catch: java.lang.Exception -> L72
            r1.setPadding(r2, r3, r4, r0)     // Catch: java.lang.Exception -> L72
            goto L5e
        L5b:
            r0.setPadding(r2, r2, r2, r2)     // Catch: java.lang.Exception -> L72
        L5e:
            android.view.View r0 = r5.f26237p3     // Catch: java.lang.Exception -> L72
            if (r0 == 0) goto L76
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()     // Catch: java.lang.Exception -> L72
            int r1 = pdf.pdfreader.viewer.editor.free.utils.t0.U(r5)     // Catch: java.lang.Exception -> L72
            r0.height = r1     // Catch: java.lang.Exception -> L72
            android.view.View r1 = r5.f26237p3     // Catch: java.lang.Exception -> L72
            r1.setLayoutParams(r0)     // Catch: java.lang.Exception -> L72
            goto L76
        L72:
            r0 = move-exception
            r0.printStackTrace()
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity.T4():void");
    }

    @Override // qg.i
    public final void U0() {
        b0 b0Var = this.f26276w1;
        if (b0Var != null && !b0Var.f21382b0) {
            b0Var.setSelectTextLocation(b0Var.b1());
        }
    }

    public final void U2() {
        lib.zj.pdfeditor.a0 a0Var;
        b0 b0Var = this.f26276w1;
        if (b0Var != null && (a0Var = (lib.zj.pdfeditor.a0) b0Var.getDisplayedView()) != null) {
            a0Var.b();
        }
    }

    public final void U3() {
        try {
            PdfReaderViewContainer pdfReaderViewContainer = this.f26254t;
            if (pdfReaderViewContainer != null) {
                pdfReaderViewContainer.removeView(this.f26209k5);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        PopupWindow popupWindow = this.f26248r5;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.f26248r5.dismiss();
        }
    }

    public final void U4() {
        ea.a.p("PHdYdBpoY28qYityOG8MZXRjDWU1dFdBL24YdA==", "WCdQAw6W");
        String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        b0 b0Var = this.f26276w1;
        if (b0Var != null && b0Var.U1 != null) {
            b0Var.U1 = null;
        }
        t3();
        ProgressView progressView = this.T3;
        if (progressView != null) {
            progressView.setVisibility(8);
        }
        this.f26296z1 = TopBarMode.Annot;
        b0 b0Var2 = this.f26276w1;
        if (b0Var2 != null && b0Var2.getMode() != PDFReaderView.Mode.AddText && this.f26276w1.getMode() != PDFReaderView.Mode.AdjustText && this.f26276w1.getMode() != PDFReaderView.Mode.Stamp && this.f26276w1.getMode() != PDFReaderView.Mode.Editor) {
            o4();
            this.A1 = null;
            b0 b0Var3 = this.f26276w1;
            if (b0Var3 != null) {
                b0Var3.setMode(PDFReaderView.Mode.Viewing);
            }
        }
        ReaderPDFCore readerPDFCore = this.f26256t1;
        if (readerPDFCore != null) {
            readerPDFCore.resetData();
        }
        k4(null);
        U2();
        A2(null, false);
        z2(null, false);
        u3();
        b0 b0Var4 = this.f26276w1;
        if (b0Var4 != null) {
            b0Var4.setCanSelectDelete(true);
            this.f26276w1.setEditorMode(true);
        }
    }

    public final void V2(final int i10, final int i11) {
        if (this.f26256t1 == null) {
            return;
        }
        ea.a.p("K29iYQ9lZ2Q8ICNzJmEeaVtnPmQjIFgg", "fDFcgA88");
        boolean z10 = this.f26272v4;
        String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        if (z10) {
            return;
        }
        b0 b0Var = this.f26276w1;
        if (b0Var != null && b0Var.getMode() == PDFReaderView.Mode.Drawing) {
            this.f26276w1.y();
        }
        r3(false, false);
        ea.a.p("AG8iYTxlY2QuIBV0VXJ0", "FKdqJ3Nh");
        this.f26272v4 = true;
        if (this.D4 == null) {
            this.D4 = new ArrayList();
        }
        this.D4.clear();
        List<String> saveEditType = this.f26256t1.getSaveEditType();
        if (saveEditType != null && !saveEditType.isEmpty()) {
            this.D4.addAll(saveEditType);
        }
        this.B4 = 0L;
        this.A4 = false;
        this.f26256t1.setSavingPdf(true);
        b0 b0Var2 = this.f26276w1;
        if (b0Var2 != null) {
            b0Var2.setSavingPdf(true);
        }
        AddTextChangeSizeBottomSheetView addTextChangeSizeBottomSheetView = this.f26278w3;
        if (addTextChangeSizeBottomSheetView != null) {
            addTextChangeSizeBottomSheetView.setSaving(true);
        }
        if (i10 != 1) {
            this.D.postDelayed(new ao.c(this, 1), 200L);
        }
        if (i10 == 1 || i10 == 2) {
            r3(false, false);
        }
        pdf.pdfreader.viewer.editor.free.utils.w0.a().c.execute(new Runnable() { // from class: ao.d
            /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00ab A[ADDED_TO_REGION] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    r10 = this;
                    pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity r0 = pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity.this
                    int r1 = r2
                    int r2 = r3
                    pdf.pdfreader.viewer.editor.free.utils.f0 r3 = r0.C4
                    if (r3 != 0) goto L11
                    pdf.pdfreader.viewer.editor.free.utils.f0 r3 = new pdf.pdfreader.viewer.editor.free.utils.f0
                    r3.<init>()
                    r0.C4 = r3
                L11:
                    lib.zj.pdfeditor.ReaderPDFCore r3 = r0.f26256t1
                    r4 = 0
                    r5 = 1
                    if (r3 == 0) goto La5
                    boolean r3 = r3.hasChanges()
                    java.lang.String r6 = "V28YYQVlMmQUIFxhGkM5ciFDWmEoZyZkWT0g"
                    java.lang.String r7 = "yr949asL"
                    ea.a.p(r6, r7)
                    java.lang.String r6 = "Zi1aIDF8FHAsZi5hR0M_YVZnN2Q9"
                    java.lang.String r7 = "VzKwM49v"
                    ea.a.p(r6, r7)
                    boolean r6 = r0.f26156b0
                    java.lang.String r7 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a
                    if (r3 != 0) goto L32
                    if (r6 == 0) goto La5
                L32:
                    java.lang.String r3 = r0.f26246r2
                    boolean r3 = android.text.TextUtils.isEmpty(r3)
                    if (r3 != 0) goto L74
                    java.io.File r3 = new java.io.File
                    java.lang.String r6 = r0.f26246r2
                    r3.<init>(r6)
                    boolean r6 = r3.exists()
                    if (r6 == 0) goto L74
                    long r6 = r3.length()
                    r8 = 2
                    long r6 = r6 * r8
                    double r6 = (double) r6
                    r8 = 4607632778762754458(0x3ff199999999999a, double:1.1)
                    double r6 = r6 * r8
                    pdf.pdfreader.viewer.editor.free.utils.f0 r3 = r0.C4
                    r3.getClass()
                    long r8 = pdf.pdfreader.viewer.editor.free.utils.f0.b()
                    float r3 = (float) r8
                    java.lang.String r8 = "F280YU9lAWQuIAByUWUEaUJlcj0g"
                    java.lang.String r9 = "IBsg9Qsg"
                    ea.a.p(r8, r9)
                    java.lang.String r8 = "ey0ZLTplEmQbaRxlPQ=="
                    java.lang.String r9 = "n7V4TwRR"
                    ea.a.p(r8, r9)
                    double r8 = (double) r3
                    int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                    if (r3 >= 0) goto L74
                    r3 = r4
                    goto L75
                L74:
                    r3 = r5
                L75:
                    java.lang.String r6 = "K29iYQ9lZ2Q8IDlwFGMNRVtvG2ctIFgg"
                    java.lang.String r7 = "OIOyAKpt"
                    ea.a.p(r6, r7)
                    if (r3 == 0) goto La3
                    lib.zj.pdfeditor.ReaderPDFCore r6 = r0.f26256t1
                    if (r6 == 0) goto L9e
                    if (r6 == 0) goto L8f
                    pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity$b0 r7 = r0.f26276w1
                    if (r7 == 0) goto L8f
                    float r7 = r7.getScale()
                    r6.saveTextInkAnnotations(r7)
                L8f:
                    lib.zj.pdfeditor.ReaderPDFCore r6 = r0.f26256t1
                    boolean r6 = r6.save()
                    java.lang.String r7 = "FW8gYUJlPWQuIA9zZ2EhZWt1MWMsc0UgSSA="
                    java.lang.String r8 = "voqs4mV1"
                    ea.a.p(r7, r8)
                    goto L9f
                L9e:
                    r6 = r4
                L9f:
                    r0.T3()
                    goto La7
                La3:
                    r6 = r4
                    goto La7
                La5:
                    r6 = r4
                    r3 = r5
                La7:
                    r0.A4 = r5
                    if (r3 == 0) goto Lae
                    if (r6 == 0) goto Lae
                    r4 = r5
                Lae:
                    java.lang.String r3 = "V28YYQVlMmQUIEdhH2UEZTd1XnRmPSA="
                    java.lang.String r5 = "aUYDYiIB"
                    ea.a.p(r3, r5)
                    java.lang.String r3 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a
                    android.os.Handler r3 = r0.D
                    ao.f r5 = new ao.f
                    r5.<init>()
                    long r0 = r0.b3()
                    r3.postDelayed(r5, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ao.d.run():void");
            }
        });
    }

    public final void V4(SignActionInfo signActionInfo, SignActionInfo signActionInfo2, c.b bVar) {
        if (signActionInfo != null && signActionInfo2 != null) {
            v3();
            SignatureImageView signatureImageView = this.f26209k5;
            if (signatureImageView != null && signatureImageView.getStampAnnotData() != null && signActionInfo.getStampAnnotData().f19799a == this.f26209k5.getStampAnnotData().f19799a) {
                U3();
            }
            d4(new pdf.pdfreader.viewer.editor.free.pdfview.d(this, signActionInfo, bVar, signActionInfo2));
        }
    }

    @Override // qg.a
    public final void W(AnalyticsEvent analyticsEvent) {
        if (analyticsEvent != null) {
            switch (s.f26383a[analyticsEvent.ordinal()]) {
                case 1:
                    tn.a.b(this, ea.a.p("Um4lbwdhFmU=", "NxD0VozN"), ea.a.p("D24_bztjG3AxYhNiVmwyX0toPXc=", "9wnQdtMk"));
                    return;
                case 2:
                    tn.a.b(this, ea.a.p("Um4lbwdhFmU=", "Sodm6seY"), ea.a.p("Lm5fbyZjWHAjYj9iF2wNX1ZsB2Nr", "VgdGoXbT"));
                    tn.a.d(this, ea.a.p("Vm4jbwRhRWU=", "DO7Mp17w"), ea.a.p("DG48b25jCXAxdAlhR3QIc1Bvdw==", "qNmR1fXG"), ea.a.p("PmFi", "7LJrGJBC"), false);
                    W4();
                    return;
                case 3:
                    tn.a.d(this, ea.a.p("Um4lbwdhFmU=", "w5d4JpR8"), ea.a.p("Um4lbyxhDnIXYVB5GW8mXzdoXXc=", "5iZUK6HC"), ea.a.p("Tg==", "Tnw1HY2V"), false);
                    return;
                case 4:
                    tn.a.d(this, ea.a.p("Lm5fbw1hQ2U=", "FG4LhiWQ"), ea.a.p("Um4lbyxhDnIXYVB5GW8mXzdoXXc=", "A3V5WjSo"), ea.a.p("WQ==", "wccr5U8Q"), false);
                    return;
                case 5:
                case 6:
                    tn.a.b(this, ea.a.p("Um4lbwdhFmU=", "aSiQON4V"), ea.a.p("Lm5fbyZhW3I_YS55EWUEZWpjAmkmaw==", "ehV3kk2s"));
                    return;
                case 7:
                    tn.a.b(this, ea.a.p("Um4lbwdhFmU=", "qmGXz80x"), ea.a.p("Um4lbyxhDnIXYVB5Cm8meRtjXmklaw==", "3CdhViaE"));
                    tn.a.d(this, ea.a.p("GG4mbx5hIGU=", "PUyHjT9g"), ea.a.p("Um4lbyxjDXALdFthGnQJcyxvdw==", "pf10MJzf"), ea.a.p("Km83dXA=", "y7ZGgMlw"), false);
                    return;
                case 8:
                    tn.a.b(this, ea.a.p("Lm5fbw1hQ2U=", "BnONDltz"), ea.a.p("Um4lbyxwDXAHcGtzAW93", "RZ6P10cJ"));
                    return;
                case 9:
                    tn.a.d(this, ea.a.p("EG4abwdhHWU=", "zLqtsiZB"), ea.a.p("Um4lbyxjDXALX1dsAGNr", "FIJ1oWSN"), ea.a.p("R28_YWw=", "kqb7655y"), false);
                    tn.a.d(this, ea.a.p("Lm5fbw1hQ2U=", "Qb8BF4Qs"), ea.a.p("Lm5fbyZjWHAjXylsHGNr", "PMMGJXsJ"), ea.a.p("G28qdXA=", "qOkZgpl7"), false);
                    tn.a.d(this, ea.a.p("Lm5fbw1hQ2U=", "vGEWUJCW"), ea.a.p("Bm4Nb2djPXAxdAlhR3QIc1Bvdw==", "2Hgc8Rxw"), ea.a.p("P29BdXA=", "2QP6tdj4"), false);
                    return;
                case 10:
                    tn.a.d(this, ea.a.p("Um4lbwdhFmU=", "AajcEErA"), ea.a.p("Lm5fbyZoXmcybCNnHXQ3Y1lpDWs=", "k1YKrkFr"), ea.a.p("O29FYWw=", "MBlhkIDm"), false);
                    tn.a.d(this, ea.a.p("Vm4nbxhhEWU=", "lN7IleO1"), ea.a.p("Lm5fbyZoXmcybCNnHXQ3Y1lpDWs=", "GoxNxtAZ"), ea.a.p("Q287dXA=", "GIpU0G4t"), false);
                    return;
                case 11:
                    tn.a.d(this, ea.a.p("Lm5fbw1hQ2U=", "lfZDYApA"), ea.a.p("OG4vbzF1H2QtcgppWmUIY1RpMWs=", "7eYAnqgr"), ea.a.p("PG82YWw=", "n3HBLYe3"), false);
                    tn.a.d(this, ea.a.p("Um4lbwdhFmU=", "wtCE00oP"), ea.a.p("Jm45byV1K2QtcgppWmUIY1RpMWs=", "yQGWzE9X"), ea.a.p("Q287dXA=", "JaJ1X33v"), false);
                    return;
                case 12:
                    tn.a.d(this, ea.a.p("Um4ebzVhPGU=", "zd3pAHhb"), ea.a.p("WG47bxtzJnIhawN0XHI4dV9oDWMlaVVr", "Rd9UDR1u"), ea.a.p("BW8xYWw=", "GXqEYKcT"), false);
                    tn.a.d(this, ea.a.p("OG4_bxNhAGU=", "H8YQgtcq"), ea.a.p("Lm5fbyZzQ3Izay90HXIHdVJoMWMpaQZr", "dg62Ret8"), ea.a.p("JW8pdXA=", "z6UYdL9H"), false);
                    return;
                default:
                    return;
            }
        }
    }

    public final void W2(int i10) {
        if (this.f26156b0) {
            c.a aVar = fn.c.c;
            q qVar = new q(i10);
            aVar.getClass();
            if (c.a.a(this, qVar)) {
                c4(3, null);
                O3(i10);
                return;
            }
            return;
        }
        M2();
        O3(i10);
    }

    public final void W3() {
        AppCompatImageView appCompatImageView = this.f26173e2;
        if (appCompatImageView != null) {
            appCompatImageView.setSelected(false);
        }
        b0 b0Var = this.f26276w1;
        if (b0Var != null) {
            b0Var.N0(true);
        }
        G4(true);
    }

    public final void X2() {
        if (!pdf.pdfreader.viewer.editor.free.utils.extension.c.i(this)) {
            hp.e eVar = this.Z;
            if (eVar != null) {
                eVar.f18399e = true;
            }
            setRequestedOrientation(1);
        }
    }

    public final void X3(boolean z10) {
        MagnifierContainer magnifierContainer;
        b0 b0Var;
        Bitmap bitmap = this.O0;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.O0.recycle();
            this.O0 = null;
        }
        MagnifierContainer magnifierContainer2 = this.G2;
        if (magnifierContainer2 != null && (b0Var = this.f26276w1) != null) {
            magnifierContainer2.a(this.O0, -1.0f, -1.0f, this.P0, this.f26162c1, 0, 1.3f + b0Var.getScale());
        }
        if (z10 && (magnifierContainer = this.G2) != null) {
            magnifierContainer.requestLayout();
        }
    }

    public final void Y2() {
        this.f26296z1 = TopBarMode.Annot;
        this.A1 = null;
        b0 b0Var = this.f26276w1;
        if (b0Var != null) {
            b0Var.setMode(PDFReaderView.Mode.Viewing);
        }
        EditorView editorView = this.f26230o2;
        if (editorView != null) {
            editorView.setVisibility(8);
        }
        b0 b0Var2 = this.f26276w1;
        if (b0Var2 != null) {
            b0Var2.N0(true);
        }
    }

    public final void Y3() {
        if (this.r4 == 0 || this.f26243q4 == 0) {
            this.f26243q4 = getResources().getDimensionPixelSize(R.dimen.dp_6);
            this.r4 = getResources().getDimensionPixelSize(R.dimen.dp_77);
        }
        if (this.O != null && this.f26260u != null) {
            androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
            aVar.f(this.f26260u);
            lib.zj.pdfeditor.i iVar = i.a.f21508a;
            if (!iVar.f21507d && !this.J) {
                aVar.h(R.id.slideContainer, 4, R.id.thumb_rv, 3);
                if (ReaderView.f21378z0) {
                    aVar.s(7, 0);
                    if (this.f26289y1) {
                        aVar.s(4, this.r4);
                    } else {
                        aVar.s(4, this.f26243q4);
                    }
                } else {
                    aVar.s(4, 0);
                    if (this.f26289y1) {
                        aVar.s(7, this.r4);
                    } else {
                        aVar.s(7, this.f26243q4);
                    }
                }
                if (ReaderView.f21378z0 && ReaderView.B0) {
                    aVar.h(R.id.intercept_fl, 4, 0, 4);
                } else {
                    aVar.h(R.id.intercept_fl, 4, R.id.thumb_rv, 3);
                }
            } else {
                aVar.s(4, this.f26243q4);
                aVar.s(7, 0);
                if (iVar.f21507d) {
                    aVar.h(R.id.slideContainer, 4, R.id.fl_bottom_reflow_edit_container, 3);
                    aVar.h(R.id.intercept_fl, 4, R.id.fl_bottom_reflow_edit_container, 3);
                } else {
                    aVar.h(R.id.slideContainer, 4, R.id.con_edit_bottom_container, 3);
                    aVar.h(R.id.intercept_fl, 4, R.id.con_edit_bottom_container, 3);
                }
            }
            aVar.b(this.f26260u);
        }
    }

    public final void Y4(String str, String str2) {
        CopyOnWriteArraySet<String> copyOnWriteArraySet = this.T5;
        if (!copyOnWriteArraySet.contains(str2)) {
            tn.a.a(ReaderPdfApplication.m(), str);
            tn.a.a(ReaderPdfApplication.m(), str2);
            copyOnWriteArraySet.add(str2);
        }
    }

    public final void Z2() {
        runOnUiThread(new ao.c(this, 0));
    }

    public final void Z4(String str) {
        gn.b.f17937a.getClass();
        CopyOnWriteArraySet<String> copyOnWriteArraySet = EventCenter.f28668o;
        if (!copyOnWriteArraySet.contains(str)) {
            tn.a.b(this, ea.a.p("VmQidCxwBmY=", "JDl1vava"), str);
            copyOnWriteArraySet.add(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
        r0 = r0.getDisplayCutout();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Point a3() {
        /*
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r2 = 0
            if (r0 < r1) goto L48
            android.view.Window r0 = r4.getWindow()
            if (r0 == 0) goto L48
            android.view.View r0 = r0.getDecorView()
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 != 0) goto L18
            return r2
        L18:
            android.view.DisplayCutout r0 = androidx.window.layout.e.f(r0)
            if (r0 != 0) goto L1f
            return r2
        L1f:
            android.view.ViewGroup r1 = r4.f26242q3
            if (r1 == 0) goto L48
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r2 = r1.getMarginStart()
            int r1 = r1.topMargin
            int r3 = androidx.window.layout.f.c(r0)
            int r0 = androidx.window.layout.e.b(r0)
            int r3 = r3 - r1
            int r0 = r0 - r2
            android.graphics.Point r1 = new android.graphics.Point
            r2 = 0
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = java.lang.Math.max(r3, r2)
            r1.<init>(r0, r2)
            return r1
        L48:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity.a3():android.graphics.Point");
    }

    public final void a4(int i10) {
        try {
            if (this.f26239p5 == null) {
                this.f26239p5 = new ArrayList();
            }
            int i11 = i10 + 1;
            if (!this.f26239p5.contains(Integer.valueOf(i11))) {
                this.f26239p5.add(Integer.valueOf(i11));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // yo.c.InterfaceC0423c
    public final void b1(SignActionInfo signActionInfo, SignActionInfo signActionInfo2, yo.a aVar) {
        V4(signActionInfo, signActionInfo2, aVar);
    }

    public final long b3() {
        if (this.B4 <= 0) {
            return 0L;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.B4;
        if (currentTimeMillis >= 200) {
            return 0L;
        }
        return 200 - currentTimeMillis;
    }

    public final void b4(int i10) {
        nl.b bVar;
        y3();
        PdfPreviewEntity pdfPreviewEntity = this.f26245r1;
        if (pdfPreviewEntity != null && (bVar = this.f26250s1) != null) {
            bVar.f22595p = i10 + 1;
            bVar.f22592m = false;
            com.google.android.play.core.assetpacks.c.P(bVar, pdfPreviewEntity);
            fo.a.a(this.f26245r1.getId(), this.f26245r1.getOtherStrOne(), this.f26245r1.getOtherStrTwo());
            bm.c.b(this).i(this.f26245r1);
        }
    }

    public final String c3() {
        TextView textView = this.A3;
        if (textView != null && textView.isSelected()) {
            return ea.a.p("VmQidANkZg==", "TCiO5az5");
        }
        TextView textView2 = this.B3;
        if (textView2 != null && textView2.isSelected()) {
            return ea.a.p("Lm5fbw1hQ2U=", "zmrbuPye");
        }
        return ea.a.p("QGksbg==", "LsY2t2aD");
    }

    public final void c4(int i10, fn.b bVar) {
        ea.a.p("PGE8ZQdkP3QcZR50cGEjYQ==", "bwOJBVMq");
        if (this.f26256t1 == null) {
            return;
        }
        ea.a.p("QGE9ZTZkC3QmZUx0LWEiYWRpQVMndipuD1AzZkc9IA==", "hWg8fkIa");
        if (this.f26272v4) {
            return;
        }
        if (this.D4 == null) {
            this.D4 = new ArrayList();
        }
        this.D4.clear();
        List<String> saveEditType = this.f26256t1.getSaveEditType();
        if (saveEditType != null && !saveEditType.isEmpty()) {
            this.D4.addAll(saveEditType);
        }
        this.f26272v4 = true;
        this.B4 = 0L;
        this.A4 = false;
        this.f26256t1.setSavingPdf(true);
        b0 b0Var = this.f26276w1;
        if (b0Var != null) {
            b0Var.setSavingPdf(true);
        }
        AddTextChangeSizeBottomSheetView addTextChangeSizeBottomSheetView = this.f26278w3;
        if (addTextChangeSizeBottomSheetView != null) {
            addTextChangeSizeBottomSheetView.setSaving(true);
        }
        if (i10 == 2) {
            this.D.postDelayed(new ao.c(this, 1), 200L);
            r3(false, false);
        }
        pdf.pdfreader.viewer.editor.free.utils.w0.a().c.execute(new rh.g(this, i10, bVar, 2));
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.ReaderActBroadCastReceiver.a
    public final void d0(String str, Intent intent) {
        boolean z10;
        if (str.equals(ea.a.p("dkNiSTlODkUQVDRBd1QIVGBUDUUHRA==", "ul76vQtE"))) {
            int intExtra = intent.getIntExtra(ea.a.p("DHhNU196ZQ==", "pMx96ToV"), 0);
            ea.a.p("p6eS5ueQ0LvJ5tScIA==", "tgEGJOLz");
            int intExtra2 = intent.getIntExtra(ea.a.p("P2FWZTd1bQ==", "CxonU1yJ"), 0);
            if (this.Y == null) {
                this.Y = new SparseIntArray();
            }
            if (intExtra > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f26151a0 = Boolean.valueOf(z10);
            this.Y.put(intExtra2, intExtra);
            b0 b0Var = this.f26276w1;
            if (b0Var != null && intExtra2 == b0Var.getDisplayedViewIndex()) {
                if (intExtra > 0) {
                    AppCompatImageView appCompatImageView = this.f26180f4;
                    if (appCompatImageView != null) {
                        appCompatImageView.setEnabled(true);
                        this.f26180f4.setImageTintList(androidx.core.content.a.getColorStateList(this, R.color.colorSurface));
                    }
                    AppCompatImageView appCompatImageView2 = this.F;
                    if (appCompatImageView2 != null) {
                        appCompatImageView2.setImageResource(R.drawable.ic_edit_copy);
                    }
                    ImageView imageView = this.G;
                    if (imageView != null) {
                        imageView.setImageResource(R.drawable.ic_edit_underline);
                    }
                    ImageView imageView2 = this.H;
                    if (imageView2 != null) {
                        imageView2.setImageResource(R.drawable.ic_edit_delete);
                    }
                    ImageView imageView3 = this.I;
                    if (imageView3 != null) {
                        imageView3.setImageResource(R.drawable.ic_edit_highlight);
                    }
                    this.f26153a3 = false;
                } else {
                    AppCompatImageView appCompatImageView3 = this.f26180f4;
                    if (appCompatImageView3 != null) {
                        appCompatImageView3.setEnabled(false);
                        this.f26180f4.setImageTintList(androidx.core.content.a.getColorStateList(this, R.color.colorSurfacePrimaryUnable));
                    }
                    U2();
                    AppCompatImageView appCompatImageView4 = this.F;
                    if (appCompatImageView4 != null) {
                        appCompatImageView4.setImageResource(R.drawable.ic_edit_copy_unable);
                        this.F.setImageTintList(null);
                    }
                    ImageView imageView4 = this.G;
                    if (imageView4 != null) {
                        imageView4.setImageResource(R.drawable.ic_edit_underline_unable);
                    }
                    ImageView imageView5 = this.H;
                    if (imageView5 != null) {
                        imageView5.setImageResource(R.drawable.ic_edit_delete_unable);
                    }
                    ImageView imageView6 = this.I;
                    if (imageView6 != null) {
                        imageView6.setImageResource(R.drawable.ic_edit_highlight_unable);
                    }
                    this.f26153a3 = true;
                }
            }
            synchronized (this.f26164c3) {
                if (this.f26158b3.get()) {
                    this.f26158b3.set(false);
                    AppCompatImageView appCompatImageView5 = this.f26180f4;
                    if (appCompatImageView5 != null && appCompatImageView5.getVisibility() == 0 && this.f26180f4.isEnabled()) {
                        pdf.pdfreader.viewer.editor.free.utils.p.u(this, this.f26245r1);
                    }
                    N3(intExtra);
                }
            }
        }
    }

    public final RectF d3() {
        float f10;
        SignatureImageView signatureImageView = this.f26209k5;
        if (signatureImageView == null) {
            return new RectF();
        }
        int[] iArr = new int[2];
        float[] fArr = new float[2];
        float[] fArr2 = new float[2];
        float[] fArr3 = new float[2];
        int width = signatureImageView.getWidth();
        int height = this.f26209k5.getHeight();
        this.f26209k5.getLocationOnScreen(iArr);
        ea.a.p("PmkWbjtlUnQcbxY6", "1cMqw4lB");
        Arrays.toString(iArr);
        float rotation = this.f26209k5.getRotation();
        if (rotation > 180.0f) {
            rotation -= 360.0f;
        } else if (rotation < -180.0f) {
            rotation += 360.0f;
        }
        double radians = Math.toRadians(rotation);
        ea.a.p("LWUMclJlOg==", "DwIk7BAk");
        float f11 = width;
        fArr[0] = (float) ((Math.cos(radians) * this.f26209k5.getScaleX() * f11) + iArr[0]);
        fArr[1] = (float) android.support.v4.media.session.h.a(radians, this.f26209k5.getScaleX() * f11, iArr[1]);
        ea.a.p("NmkObjlpBGg8VAlwOg==", "rtEikcUH");
        Arrays.toString(fArr);
        float f12 = height;
        fArr2[0] = (float) (iArr[0] - (Math.sin(radians) * (this.f26209k5.getScaleY() * f12)));
        fArr2[1] = (float) ((Math.cos(radians) * this.f26209k5.getScaleY() * f12) + iArr[1]);
        ea.a.p("PGlWbjVlUXQYbz50Gm06", "nOeyXKh3");
        Arrays.toString(fArr2);
        fArr3[0] = (float) (((Math.cos(radians) * (this.f26209k5.getScaleX() * f11)) + iArr[0]) - (Math.sin(radians) * (this.f26209k5.getScaleY() * f12)));
        fArr3[1] = (float) ((Math.cos(radians) * this.f26209k5.getScaleY() * f12) + android.support.v4.media.session.h.a(radians, this.f26209k5.getScaleX() * f11, iArr[1]));
        ea.a.p("PGlWbitpUGguQiV0AW8FOg==", "GReIGniz");
        Arrays.toString(fArr3);
        float f13 = iArr[0];
        float f14 = iArr[1];
        float f15 = 2.1474836E9f;
        if (f13 < 2.1474836E9f) {
            f10 = f13;
        } else {
            f10 = 2.1474836E9f;
        }
        float f16 = fArr[0];
        if (f16 < f10) {
            f10 = f16;
        }
        float f17 = fArr2[0];
        if (f17 < f10) {
            f10 = f17;
        }
        float f18 = fArr3[0];
        if (f18 < f10) {
            f10 = f18;
        }
        if (f14 < 2.1474836E9f) {
            f15 = f14;
        }
        float f19 = fArr[1];
        if (f19 < f15) {
            f15 = f19;
        }
        float f20 = fArr2[1];
        if (f20 < f15) {
            f15 = f20;
        }
        float f21 = fArr3[1];
        if (f21 < f15) {
            f15 = f21;
        }
        if (f13 <= -2.1474836E9f) {
            f13 = -2.1474836E9f;
        }
        if (f16 <= f13) {
            f16 = f13;
        }
        if (f17 <= f16) {
            f17 = f16;
        }
        if (f18 <= f17) {
            f18 = f17;
        }
        if (f14 <= -2.1474836E9f) {
            f14 = -2.1474836E9f;
        }
        if (f19 <= f14) {
            f19 = f14;
        }
        if (f20 <= f19) {
            f20 = f19;
        }
        if (f21 <= f20) {
            f21 = f20;
        }
        RectF rectF = new RectF(f10, f15, f18, f21);
        ea.a.p("QWUodDVyDW0ib11uHTo=", "YETpgdS4");
        rectF.toString();
        return rectF;
    }

    public final void d4(zn.d dVar) {
        PdfReaderViewContainer pdfReaderViewContainer = this.f26254t;
        if (pdfReaderViewContainer != null) {
            pdfReaderViewContainer.post(new g(dVar));
        }
    }

    public final boolean e3() {
        if (pdf.pdfreader.viewer.editor.free.utils.q0.l(this, 0, "pdf_inversion_type") != 2) {
            return false;
        }
        return true;
    }

    public final void e4(boolean z10) {
        y3();
        nl.b bVar = this.f26250s1;
        if (bVar != null && bVar.f22596q != z10) {
            bVar.f22596q = z10;
            PdfPreviewEntity pdfPreviewEntity = this.f26245r1;
            if (pdfPreviewEntity != null) {
                com.google.android.play.core.assetpacks.c.P(bVar, pdfPreviewEntity);
                fo.a.a(this.f26245r1.getId(), this.f26245r1.getOtherStrOne(), this.f26245r1.getOtherStrTwo());
                bm.c.b(this).i(this.f26245r1);
            }
        }
    }

    public final PageView f3() {
        b0 b0Var = this.f26276w1;
        if (b0Var == null) {
            return null;
        }
        return (PageView) b0Var.getDisplayedView();
    }

    public final void f4(int i10, boolean z10) {
        int i11;
        ea.a.p("PGVQchpo", "gREZ2mYg");
        q3();
        b0 b0Var = this.f26276w1;
        if (b0Var == null) {
            return;
        }
        int displayedViewIndex = b0Var.getDisplayedViewIndex();
        lib.zj.pdfeditor.q0 q0Var = lib.zj.pdfeditor.q0.f21567d;
        if (q0Var != null) {
            i11 = q0Var.f21569b;
        } else {
            i11 = -1;
        }
        int i12 = i11;
        if (q0Var != null) {
            ea.a.p("UmlHcCphNlApZwM6IA==", "fs64FOnq");
            ea.a.p("Ey0g", "U3b5X68F");
            ea.a.p("b3BQZxxOQm0t", "3TxYEiyu");
        }
        EditText editText = this.D1;
        if (editText != null) {
            this.E1.a(editText.getText().toString(), i10, displayedViewIndex, i12, z10);
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        c.a.f32211a.f32208a.remove(this);
        if (this.J) {
            U4();
            H2();
            b0 b0Var = this.f26276w1;
            if (b0Var != null) {
                b0Var.y();
            }
            ReaderPDFCore readerPDFCore = this.f26256t1;
            if (readerPDFCore != null) {
                readerPDFCore.resetData();
            }
        }
        b0 b0Var2 = this.f26276w1;
        if (b0Var2 != null) {
            b0Var2.f();
            this.f26276w1.setOnPageOperateListener(null);
            this.f26276w1.setOnPageScrollListener(null);
            this.f26276w1.setOnReflowStateChangeListener(null);
            this.f26276w1.setOnPageOrientationChangeListener(null);
        }
        ReaderPDFCore readerPDFCore2 = this.f26256t1;
        if (readerPDFCore2 != null) {
            readerPDFCore2.abort();
        }
        if (TextUtils.equals(this.V, ea.a.p("CVJ-TSZUeE8WUw==", "WYUxF3og")) && this.f26161c0) {
            Intent intent = new Intent(this, ReaderHomeActivity.class);
            intent.putExtra(ea.a.p("JGVIXxdlQF8zbj5lG3Q3ZFpfAG8xaAxuZw==", "OpFBoWzA"), true);
            intent.putExtra(ea.a.p("XGU7XwBlMF8hbhJlWnQIdFdvPnMWZVJpdA==", "zH7BnGH9"), this.f26281x);
            startActivity(intent);
        }
        if (this.f26281x || ea.a.p("DlIpTQ5QM0cNXytBekEQRQ==", "bAHfQrGX").equals(this.V)) {
            wn.b.f31387b.j(1);
            pdf.pdfreader.viewer.editor.free.utils.q0.x(this, 5, "home_page_last_index");
            qo.l lVar = new qo.l(this.V, this.f26246r2);
            PdfPreviewEntity pdfPreviewEntity = this.f26245r1;
            if (pdfPreviewEntity != null) {
                long id2 = pdfPreviewEntity.getId();
                a0.d dVar = new a0.d();
                FileRepository.f24155a.getClass();
                FileRepository.k().execute(new pdf.pdfreader.viewer.editor.free.data.b(0, id2, dVar));
            }
            wk.b.b().e(lVar);
            this.f26281x = false;
        }
        qo.a aVar = new qo.a();
        aVar.f29391a = this.f26245r1;
        wk.b.b().e(aVar);
        pdf.pdfreader.viewer.editor.free.utils.t1.b(ea.a.p("F2U0IDtyLWc6ZRVzDiAncl12O2U-IFBpGmkCaA==", "juePKB7X"));
        this.D.removeCallbacksAndMessages(null);
        DrawSignView drawSignView = this.f26244r0;
        if (drawSignView != null) {
            drawSignView.setOnDrawSignViewListener(null);
        }
        super.finish();
    }

    public final ObjectAnimator g3(View view, boolean z10) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, ea.a.p("Umw7aGE=", "4o50M8Vk"), view.getAlpha(), 0.0f);
        ofFloat.addListener(new d(z10, view));
        return ofFloat;
    }

    public final void g4() {
        TopBarMode topBarMode = this.f26296z1;
        TopBarMode topBarMode2 = TopBarMode.Search;
        if (topBarMode != topBarMode2) {
            this.f26296z1 = topBarMode2;
            EditText editText = this.D1;
            if (editText != null) {
                editText.requestFocus();
            }
            InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(ea.a.p("Wm47dQdfD2UGaFtk", "mNFSBWt7"));
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(this.D1, 0);
            }
            this.f26219m3 = true;
            x4();
        }
    }

    @Override // qg.a
    public final void h(String str) {
        Drawable drawable;
        if (!TextUtils.equals(str, getString(R.string.arg_res_0x7f13036a)) && !TextUtils.equals(str, getString(R.string.arg_res_0x7f1303e5))) {
            drawable = null;
        } else {
            drawable = androidx.core.content.a.getDrawable(this, R.drawable.ic_copy_success);
        }
        pdf.pdfreader.viewer.editor.free.utils.j1.e(this, str, false, drawable, k3());
    }

    public final ObjectAnimator h3(View view) {
        view.setVisibility(0);
        return ObjectAnimator.ofFloat(view, ea.a.p("LmxBaGE=", "EJJv1wiQ"), view.getAlpha(), 1.0f);
    }

    public final void h4(boolean z10) {
        if (!z10 && !this.x4) {
            return;
        }
        this.x4 = false;
        tn.a.d(ReaderPdfApplication.m(), ea.a.p("LmRVXw1lT3Q=", "B1GJVrIo"), ea.a.p("I2U5dGlhDWo9cxJfR2g4dw==", "o7WA6idK"), ea.a.p("TW8fYWw=", "cC9kfbPo"), false);
        if (TextUtils.isEmpty(this.f26223n1)) {
            return;
        }
        tn.a.d(ReaderPdfApplication.m(), ea.a.p("E2QvX01lPHQ=", "DVrK9Dlq"), ea.a.p("PGVJdAVhM2o9cxJfR2g4dw==", "IjH1ZWoE"), this.f26223n1, false);
    }

    public final ObjectAnimator i3(View view, View view2) {
        if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(this)) {
            return ObjectAnimator.ofFloat(view, ea.a.p("DXIgbgZsB3QhbwhY", "tcyAufI7"), view2.getTranslationX(), -view2.getWidth());
        }
        return ObjectAnimator.ofFloat(view, ea.a.p("O3JQbgpsVnQzbyRY", "1INOntkE"), view2.getTranslationX(), view2.getWidth());
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
        if (r4.f26276w1.J0() == false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    @Override // qg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j1(lib.zj.pdfeditor.PageView r5, int r6, lib.zj.pdfeditor.PDFReaderView.Mode r7, android.view.MotionEvent r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity.j1(lib.zj.pdfeditor.PageView, int, lib.zj.pdfeditor.PDFReaderView$Mode, android.view.MotionEvent, boolean):void");
    }

    public final ObjectAnimator j3(View view) {
        return ObjectAnimator.ofFloat(view, ea.a.p("O3JQbgpsVnQzbyRY", "iB3tGCF1"), view.getTranslationX(), 0.0f);
    }

    public final void j4(int i10) {
        if (this.f26208k4 != null) {
            if (pdf.pdfreader.viewer.editor.free.utils.c1.E(this)) {
                if (i10 == 0) {
                    this.f26208k4.setVisibility(0);
                    if (!this.V4) {
                        this.V4 = true;
                        AIEventCenter.f28648a.getClass();
                        AIEventCenter.c();
                        tn.a.d(this, ea.a.p("OWlUdw==", "hTemPy3d"), ea.a.p("OWlUdyZhXl8paCV3", "e8FTdOlX"), ea.a.p("Q2Rm", "eF50M1Ir"), false);
                        return;
                    }
                    return;
                }
                this.f26208k4.setVisibility(8);
                return;
            }
            this.f26208k4.setVisibility(8);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.fnbridge.b
    public final void k() {
        pdf.pdfreader.viewer.editor.free.ads.g m10 = pdf.pdfreader.viewer.editor.free.ads.g.m();
        m10.getClass();
        if (BillingConfigImpl.c.w()) {
            String p10 = ea.a.p("P3JUbRB1WiAvcy9yWSAba1xwTnA3ZRNpAXcjdThsKWRvbF5hZA==", "sNyPdeTh");
            int i10 = zk.a.f32399a;
            pdf.pdfreader.viewer.editor.free.utils.t1.b(p10);
            return;
        }
        m10.f23921e = null;
        m10.h(this);
    }

    public final int k3() {
        PdfReaderViewContainer pdfReaderViewContainer = this.f26254t;
        if (pdfReaderViewContainer == null) {
            return -1;
        }
        int[] iArr = new int[2];
        pdfReaderViewContainer.getLocationInWindow(iArr);
        int U = iArr[1] - pdf.pdfreader.viewer.editor.free.utils.t0.U(this);
        if (U < 0) {
            return -1;
        }
        return (int) (getResources().getDimension(R.dimen.dp_6) + U);
    }

    public final void k4(ViewGroup viewGroup) {
        float f10;
        float f11;
        float f12;
        float f13;
        RelativeLayout relativeLayout = this.F3;
        if (relativeLayout != null) {
            relativeLayout.setSelected(false);
        }
        RelativeLayout relativeLayout2 = this.G3;
        if (relativeLayout2 != null) {
            relativeLayout2.setSelected(false);
        }
        RelativeLayout relativeLayout3 = this.H3;
        if (relativeLayout3 != null) {
            relativeLayout3.setSelected(false);
        }
        RelativeLayout relativeLayout4 = this.I3;
        if (relativeLayout4 != null) {
            relativeLayout4.setSelected(false);
        }
        LinearLayout linearLayout = this.J3;
        if (linearLayout != null) {
            linearLayout.setSelected(false);
        }
        if (viewGroup != null) {
            viewGroup.setSelected(true);
        }
        LinearLayout linearLayout2 = this.J3;
        if (linearLayout2 != null && this.K3 != null && this.f26288y0 != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout2.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.K3.getLayoutParams();
            ValueAnimator valueAnimator = this.E4;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.E4.cancel();
            }
            if (viewGroup == this.J3) {
                AppCompatImageView appCompatImageView = this.C0;
                if (appCompatImageView != null) {
                    appCompatImageView.setImageTintList(ColorStateList.valueOf(androidx.core.content.a.getColor(this, R.color.colorSurface)));
                }
                I4(true);
                f10 = layoutParams.weight;
                f11 = layoutParams2.weight;
                f13 = this.F4;
                f12 = 1.0f;
            } else {
                I4(false);
                f10 = layoutParams.weight;
                f11 = layoutParams2.weight;
                f12 = 0.0f;
                f13 = 1.0f;
            }
            if (f10 == f13) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.E4 = ofFloat;
            ofFloat.setDuration(200L);
            this.E4.addUpdateListener(new g2(this, layoutParams, f10, f13, layoutParams2, f11, f12));
            this.E4.start();
        }
    }

    public final void l3() {
        if (this.P != null && this.Z3 != null && this.X3 != null && this.f26289y1 && !this.f26219m3) {
            p3();
            if (this.f26184g3 == null) {
                this.f26184g3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                A3();
            }
            if (this.f26189h3 == null) {
                this.f26189h3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                x3();
            }
            ValueAnimator valueAnimator = this.f26184g3;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                return;
            }
            ValueAnimator valueAnimator2 = this.f26189h3;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                return;
            }
            if (getRequestedOrientation() == 1 && !pdf.pdfreader.viewer.editor.free.utils.a0.i(this)) {
                if (this.f26213l3 == null) {
                    this.f26213l3 = a3();
                }
            } else {
                this.f26213l3 = null;
            }
            this.f26195i3 = this.P.getHeight();
            this.f26201j3 = getResources().getDimensionPixelSize(R.dimen.dp_90);
            this.f26289y1 = false;
            this.f26184g3.start();
            this.f26189h3.start();
        }
    }

    public final void l4(TextView textView) {
        TextView textView2 = this.B3;
        if (textView2 != null && this.A3 != null && this.C3 != null) {
            textView2.setSelected(false);
            this.A3.setSelected(false);
            this.C3.setSelected(false);
            if (textView != null) {
                textView.setSelected(true);
                if (this.A3.isSelected()) {
                    hp.e eVar = this.Z;
                    if (eVar != null) {
                        eVar.f18399e = false;
                    }
                    this.f26279w4 = true;
                    this.x4 = true;
                    gn.b.f17937a.getClass();
                    EventCenter.f28668o.clear();
                    gn.b.f17938b.clear();
                    gn.b.c.clear();
                    Y4(ea.a.p("Wm8AZQ5lC2l0", "Ph9rQoXJ"), ea.a.p("UG85ZSx0B3h0", "QdSR56y9"));
                    E3(this.A3);
                    TextView textView3 = this.A3;
                    textView3.setTextAppearance(textView3.getContext(), R.style.font_medium);
                    TextView textView4 = this.B3;
                    textView4.setTextAppearance(textView4.getContext(), R.style.font_regular);
                    this.C3.setTextAppearance(this.B3.getContext(), R.style.font_regular);
                    AppCompatImageView appCompatImageView = this.O3;
                    if (appCompatImageView != null) {
                        appCompatImageView.setVisibility(0);
                    }
                    Z4(ea.a.p("UmQZdCdwBmYXaANsRGMjcmdzOm93", "kQ7pxbEV"));
                    Z3();
                    AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
                    AppCoreFilterEvent.h(ea.a.p("O2VJdCZzX293", "b4d3VMkD"));
                } else if (this.B3.isSelected()) {
                    hp.e eVar2 = this.Z;
                    if (eVar2 != null) {
                        eVar2.f18399e = false;
                    }
                    Y4(ea.a.p("UG85ZSxlBml0", "uNSSlEE0"), ea.a.p("LG9DZSZhWW5v", "PNGrvYGK"));
                    E3(this.B3);
                    TextView textView5 = this.B3;
                    textView5.setTextAppearance(textView5.getContext(), R.style.font_medium);
                    TextView textView6 = this.A3;
                    textView6.setTextAppearance(textView6.getContext(), R.style.font_regular);
                    this.C3.setTextAppearance(this.B3.getContext(), R.style.font_regular);
                    AppCompatImageView appCompatImageView2 = this.O3;
                    if (appCompatImageView2 != null) {
                        appCompatImageView2.setVisibility(8);
                    }
                    V3();
                    AppOpenSource appOpenSource2 = AppCoreFilterEvent.f28650a;
                    AppCoreFilterEvent.h(ea.a.p("Lm5fbw1hQ2UFcyJvdw==", "lgCkO2N8"));
                } else {
                    Y4(ea.a.p("LG9DZSZlU2l0", "R1Ylrht2"), ea.a.p("LG9DZSZzXmdu", "JroFZ1gh"));
                    if (!pdf.pdfreader.viewer.editor.free.utils.extension.c.i(this)) {
                        hp.e eVar3 = this.Z;
                        if (eVar3 != null) {
                            eVar3.f18399e = true;
                        }
                        setRequestedOrientation(1);
                    }
                    E3(this.C3);
                    TextView textView7 = this.B3;
                    textView7.setTextAppearance(textView7.getContext(), R.style.font_regular);
                    TextView textView8 = this.A3;
                    textView8.setTextAppearance(textView8.getContext(), R.style.font_regular);
                    this.C3.setTextAppearance(this.B3.getContext(), R.style.font_medium);
                    AppCompatImageView appCompatImageView3 = this.O3;
                    if (appCompatImageView3 != null) {
                        appCompatImageView3.setVisibility(8);
                    }
                    AppOpenSource appOpenSource3 = AppCoreFilterEvent.f28650a;
                    AppCoreFilterEvent.a(ea.a.p("PGlWbiZzX293", "EyyREQzc"), ea.a.p("QGksbixhBmQ=", "YSQ9H1S3"));
                    AppCoreFilterEvent.h(ea.a.p("PGlWbiZzX293", "u3pBWJLg"));
                }
            }
        }
    }

    @Override // yo.c.InterfaceC0423c
    public final void m0(SignActionInfo signActionInfo, SignActionInfo signActionInfo2, yo.b bVar) {
        V4(signActionInfo, signActionInfo2, bVar);
    }

    public final void m3() {
        ConstraintLayout constraintLayout = this.W1;
        if (constraintLayout != null && constraintLayout.getVisibility() != 8) {
            K3(true);
            this.W1.setAlpha(1.0f);
            this.W1.animate().alpha(0.0f).setDuration(100L).setListener(new b()).start();
        }
    }

    public final void m4(int i10) {
        if (androidx.core.content.a.getColor(this, R.color.edit_color_2) == i10 && !pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this)) {
            GraffitiIconView graffitiIconView = this.M3;
            if (graffitiIconView != null) {
                graffitiIconView.a(i10, androidx.core.content.a.getColor(this, R.color.color_CBCCD1), true);
            }
            AddTextColorView addTextColorView = this.L3;
            if (addTextColorView != null) {
                addTextColorView.c(i10, androidx.core.content.a.getColor(this, R.color.color_CBCCD1), 0);
            }
        } else if (androidx.core.content.a.getColor(this, R.color.edit_color_1) == i10 && pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this)) {
            GraffitiIconView graffitiIconView2 = this.M3;
            if (graffitiIconView2 != null) {
                graffitiIconView2.a(i10, androidx.core.content.a.getColor(this, R.color.color_100_61626C), true);
            }
            AddTextColorView addTextColorView2 = this.L3;
            if (addTextColorView2 != null) {
                addTextColorView2.c(i10, androidx.core.content.a.getColor(this, R.color.color_100_61626C), 0);
            }
        } else {
            GraffitiIconView graffitiIconView3 = this.M3;
            if (graffitiIconView3 != null) {
                graffitiIconView3.a(i10, 0, false);
            }
            AddTextColorView addTextColorView3 = this.L3;
            if (addTextColorView3 != null) {
                addTextColorView3.c(i10, i10, 0);
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.fnbridge.b
    public final void n() {
        pdf.pdfreader.viewer.editor.free.ads.g.m().n(this, this);
    }

    public final void n3() {
        ViewStub viewStub = this.U1;
        if (viewStub != null) {
            kl.i.b(viewStub);
        }
        PreviewCreateEditGuideView previewCreateEditGuideView = this.Y4;
        if (previewCreateEditGuideView != null) {
            previewCreateEditGuideView.r();
        }
        View view = this.Z4;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public final void n4() {
        b0 b0Var = this.f26276w1;
        if (b0Var != null) {
            b0Var.setMode(PDFReaderView.Mode.Stamp);
            this.f26276w1.setCanSelectDelete(false);
        }
        X2();
    }

    @Override // pdf.pdfreader.viewer.editor.free.thumb.adapter.a
    public final void o1(int i10) {
        if (this.q1 && !this.F2) {
            this.q1 = false;
            pdf.pdfreader.viewer.editor.free.utils.p.v(this, ea.a.p("NmRm", "NHFRlkuK"));
        }
        b0 b0Var = this.f26276w1;
        if (b0Var != null) {
            b0Var.setDisplayedViewIndex(i10 - 1);
        }
        l3();
    }

    public final void o3() {
        ViewStub viewStub = this.T1;
        if (viewStub != null) {
            kl.i.b(viewStub);
        }
        PreviewEditGuideView previewEditGuideView = this.X4;
        if (previewEditGuideView != null) {
            previewEditGuideView.setVisibility(0);
        }
        PreviewEditGuideView previewEditGuideView2 = this.X4;
        if (previewEditGuideView2 != null) {
            previewEditGuideView2.setVisibility(8);
        }
        View view = this.Z4;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public final void o4() {
        b0 b0Var = this.f26276w1;
        if (b0Var != null) {
            b0Var.setMode(PDFReaderView.Mode.Viewing);
        }
    }

    @Override // jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        b0 b0Var;
        b0 b0Var2;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 == 200 && i11 == -1) {
                    String stringExtra = intent.getStringExtra(ea.a.p("PWVCdRV0Z2EuaA==", "rt1dZrC3"));
                    if (!TextUtils.isEmpty(stringExtra) && (b0Var2 = this.f26276w1) != null) {
                        for (Map.Entry<ij.d, View> entry : b0Var2.f21384d.entrySet()) {
                            if (entry.getKey().f18533a) {
                                ((PDFPageView) entry.getValue()).n2(false);
                            }
                        }
                        PDFPageView pDFPageView = b0Var2.K1;
                        if (pDFPageView != null && ReaderView.B0) {
                            lib.zj.pdfeditor.text.editor.a aVar = pDFPageView.f21180l1;
                            aVar.getClass();
                            if (!TextUtils.isEmpty(stringExtra)) {
                                aVar.u(new mj.o(aVar, aVar.f21685e, stringExtra));
                            }
                        } else {
                            View displayedView = b0Var2.getDisplayedView();
                            if (displayedView instanceof PDFPageView) {
                                lib.zj.pdfeditor.text.editor.a aVar2 = ((PDFPageView) displayedView).f21180l1;
                                aVar2.getClass();
                                if (!TextUtils.isEmpty(stringExtra)) {
                                    aVar2.u(new mj.o(aVar2, aVar2.f21685e, stringExtra));
                                }
                            }
                        }
                    }
                }
            } else if (i11 == 0) {
                C4(getString(R.string.arg_res_0x7f130352));
            }
        } else if (i11 >= 0 && (b0Var = this.f26276w1) != null) {
            b0Var.setDisplayedViewIndex(i11);
        }
        super.onActivityResult(i10, i11, intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x010c  */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onBackPressed() {
        /*
            Method dump skipped, instructions count: 1136
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity.onBackPressed():void");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        b0 b0Var;
        TopBarMode topBarMode;
        TopBarMode topBarMode2;
        boolean z10;
        boolean z11;
        if (view.getId() != R.id.pdf2WordView) {
            this.O5 = false;
        }
        ea.a.p("HWVQZBxyZ3I_diNlAkELdFx2B3Q8IEgtSS0sbjlsG2MkLRwtVC0=", "LBdpdCzr");
        String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        y1(this);
        if (this.f26272v4) {
            Q0();
            ea.a.p("AGUGZC1yO3Itdg9lQ0E0dFF2O3QwIBstWS1cZD4gMWEkaQlnZS1GLS0=", "HkRgHkbW");
            return;
        }
        view.getId();
        if ((!this.f26153a3 || (view.getId() != R.id.pdf_bottom_1_edit_copy && view.getId() != R.id.pdf_bottom_1_edit_under && view.getId() != R.id.pdf_bottom_1_edit_middle && view.getId() != R.id.pdf_bottom_1_edit_highlight)) && (b0Var = this.f26276w1) != null && ((topBarMode = this.f26296z1) == (topBarMode2 = TopBarMode.Annot) || topBarMode == TopBarMode.Delete)) {
            if (b0Var.F0(b0Var.Y1) && b0Var.K0 == null && b0Var.P0 == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                this.f26296z1 = topBarMode2;
                this.f26276w1.a1();
                if (view.getId() == R.id.backIv) {
                    ea.a.p("ZmURZDJyBXItdg9lQ0E0dFF2O3QwIBstWS1cbjRlJiBGZQNlIyAmZSRlBXQUcyNhTGV_LWQtLQ==", "ww4pWUqc");
                    return;
                }
            }
        }
        int id2 = view.getId();
        ArrayList arrayList = this.f26292y4;
        switch (id2) {
            case R.id.backIv /* 2131362083 */:
                ea.a.p("HWVQZBxyZ3I_diNlAkELdFx2B3Q8IEgtdS1JYgNjICAsbFhjEi0aLXct", "y8yAXdbK");
                if (this.J && !rj.a.a(view.getId(), 500L)) {
                    String c32 = c3();
                    if (!TextUtils.isEmpty(c32)) {
                        tn.a.d(this, ea.a.p("KmRYdCZzVnZl", "iGCouk3k"), ea.a.p("XGRfdBxhT2UXYQJqa2M7b0tlDWMlaVVr", "rA96o9oY"), c32, false);
                    }
                }
                onBackPressed();
                return;
            case R.id.iv_reflow_page_next /* 2131362963 */:
                b0 b0Var2 = this.f26276w1;
                if (b0Var2 != null) {
                    b0Var2.setDisplayedViewIndex(this.B2 + 1);
                    View displayedView = this.f26276w1.getDisplayedView();
                    if (displayedView instanceof PageView) {
                        u4(((PageView) displayedView).p1());
                    }
                    tn.a.d(this, ea.a.p("PWVXbBZ3", "pm2VuKuf"), ea.a.p("OWUXbFh3Hm4teBJwVWcyX1tsO2Nr", "yQKq7AEZ"), ea.a.p("P2Rm", "83DN4AWc"), false);
                    return;
                }
                return;
            case R.id.iv_reflow_page_previous /* 2131362964 */:
                b0 b0Var3 = this.f26276w1;
                if (b0Var3 != null) {
                    b0Var3.setDisplayedViewIndex(this.B2 - 1);
                    View displayedView2 = this.f26276w1.getDisplayedView();
                    if (displayedView2 instanceof PageView) {
                        u4(((PageView) displayedView2).p1());
                    }
                    tn.a.d(this, ea.a.p("PWVXbBZ3", "MYzhOYEZ"), ea.a.p("PWVXbBZ3aHAoZTphEmU3Y1lpDWs=", "J1RNPrBR"), ea.a.p("Q2Rm", "lsfEeiK5"), false);
                    return;
                }
                return;
            case R.id.pdf2WordView /* 2131363517 */:
                p3();
                tn.a.b(this, ea.a.p("RWkudw==", "gsahMFS3"), ea.a.p("PGlWd2hwPmZ6dwlyUF80bFFjaw==", "Y8J37ZpI"));
                if (this.H5) {
                    View view2 = this.D5;
                    if (view2 != null && view2.getVisibility() == 0) {
                        if (this.D5 != null) {
                            ObjectAnimator objectAnimator = this.K5;
                            if (objectAnimator != null && objectAnimator.isRunning()) {
                                this.K5.cancel();
                            }
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.D5, ea.a.p("THIibidsO3QhbwhY", "1q8CTZTf"), 0.0f, 10.0f, -10.0f, 10.0f, -10.0f, 5.0f, -5.0f, 0.0f);
                            this.K5 = ofFloat;
                            ofFloat.setDuration(300L);
                            this.K5.start();
                        }
                    } else {
                        TextView textView = this.G5;
                        if (textView != null) {
                            textView.setText(R.string.arg_res_0x7f130055);
                        }
                    }
                    t4(true);
                    return;
                } else if (!this.I5) {
                    AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
                    AppCoreFilterEvent.g(ea.a.p("PTIVX1NuJmU6XwVsXWNr", "V9Mb6R2m"));
                    AppCoreFilterEvent.g(ea.a.p("QzI8XwVpB3c=", "FRQISDZZ"));
                    if (!pdf.pdfreader.viewer.editor.free.utils.h1.c() && !pdf.pdfreader.viewer.editor.free.utils.extension.c.g(this)) {
                        this.I0.a(new String[]{ea.a.p("DG4HcgdpKC44ZRRtXXMkaVdufFIMQXJfMVglRQNOA0wyUzdPOkELRQ==", "qXmchLbn"), ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFcXSTFFJkUUVDNSBEEDX2JUNlJ2R0U=", "bQsdyLvJ")});
                        return;
                    }
                    BillingConfigImpl billingConfigImpl = BillingConfigImpl.c;
                    if (billingConfigImpl.w()) {
                        PDF2WordHelper.Companion companion = PDF2WordHelper.f25574a;
                        ao.q qVar = new ao.q(this, 0);
                        ao.b bVar = new ao.b(this, 0);
                        androidx.activity.c cVar = new androidx.activity.c(this, 1);
                        NativeSoLoaderHelper.DownloadSource downloadSource = NativeSoLoaderHelper.DownloadSource.FromPreview;
                        companion.getClass();
                        PDF2WordHelper.Companion.d(this, qVar, bVar, cVar, downloadSource);
                        return;
                    }
                    if (billingConfigImpl.z() && !billingConfigImpl.w() && BillingConfigImpl.u()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        this.N5 = true;
                        BaseSubscriptionActivity.a aVar = BaseSubscriptionActivity.L;
                        String p10 = ea.a.p("GWQXMjVvI2Q=", "8qiqBQDn");
                        aVar.getClass();
                        BaseSubscriptionActivity.a.a(this, p10);
                        return;
                    }
                    PDF2WordHelper.Companion companion2 = PDF2WordHelper.f25574a;
                    ao.q qVar2 = new ao.q(this, 0);
                    ao.b bVar2 = new ao.b(this, 0);
                    androidx.activity.c cVar2 = new androidx.activity.c(this, 1);
                    NativeSoLoaderHelper.DownloadSource downloadSource2 = NativeSoLoaderHelper.DownloadSource.FromPreview;
                    companion2.getClass();
                    PDF2WordHelper.Companion.d(this, qVar2, bVar2, cVar2, downloadSource2);
                    return;
                } else {
                    return;
                }
            case R.id.pdf_bottom_1_edit_copy /* 2131363531 */:
                tn.a.d(this, ea.a.p("Lm5fbw1hQ2U=", "hFebDOCT"), ea.a.p("Um4lbyxjDXALX1dsAGNr", "bU5Mur0l"), ea.a.p("BG84YWw=", "UcpLqXcr"), false);
                tn.a.d(this, ea.a.p("Lm5fbw1hQ2U=", "FOj1wEvQ"), ea.a.p("Lm5fbyZjWHAjXylsHGNr", "LdeXZIn2"), ea.a.p("UWFy", "02xdLKTp"), false);
                if (this.f26153a3) {
                    D4(-1, getString(R.string.arg_res_0x7f1303b9));
                    return;
                }
                X4();
                RelativeLayout relativeLayout = this.F3;
                if (relativeLayout != null && relativeLayout.isSelected()) {
                    J3();
                    k4(null);
                    return;
                }
                w2();
                k4(this.F3);
                OnCopyTextButtonClick(this.F3);
                return;
            case R.id.pdf_bottom_1_edit_draw /* 2131363532 */:
                if (this.f26277w2) {
                    L4();
                    return;
                }
                X4();
                o4();
                if (!this.R4) {
                    tn.a.d(this, ea.a.p("Um4lbwdhFmU=", "qaNf5oa5"), ea.a.p("Lm5fbyZnRWE8ZiN0HF8LbFxjaw==", "bm1zNW6L"), ea.a.p("O29FYWw=", "BNu1g8zT"), false);
                    tn.a.d(this, ea.a.p("Lm5fbw1hQ2U=", "DDgGbrib"), ea.a.p("A25cbxFnQ2EuZg90XV80bFFjaw==", "I7b2N1LF"), ea.a.p("LWFy", "xUTBWGxE"), false);
                } else {
                    this.R4 = false;
                }
                LinearLayout linearLayout = this.J3;
                if (linearLayout != null && linearLayout.isSelected()) {
                    J3();
                    k4(null);
                    return;
                }
                hj.a aVar2 = a.C0246a.f18352a;
                aVar2.f18350a = this.K4;
                aVar2.f18351b = (int) (((this.L4 / 2.0f) * getResources().getDisplayMetrics().density) + 0.5d);
                k4(this.J3);
                U2();
                t2(PDFReaderView.Mode.Drawing);
                return;
            case R.id.pdf_bottom_1_edit_highlight /* 2131363533 */:
                if (this.f26277w2) {
                    L4();
                    return;
                }
                tn.a.d(this, ea.a.p("Um4lbwdhFmU=", "USItYhsT"), ea.a.p("Um4lbyxoC2cabF1nAXQJYyhpUWs=", "VY4a2eMi"), ea.a.p("O29FYWw=", "pLnG2Trd"), false);
                tn.a.d(this, ea.a.p("Um4lbwdhFmU=", "ybhrNQ0Y"), ea.a.p("Lm5fbyZoXmcybCNnHXQ3Y1lpDWs=", "Au3LUuTg"), ea.a.p("UWFy", "OSgfjGmf"), false);
                X4();
                if (this.f26153a3) {
                    D4(-1, getString(R.string.arg_res_0x7f1303b9));
                    return;
                }
                RelativeLayout relativeLayout2 = this.I3;
                if (relativeLayout2 != null && relativeLayout2.isSelected()) {
                    J3();
                    k4(null);
                    U2();
                    return;
                }
                o4();
                w2();
                k4(this.I3);
                U2();
                OnHighlightButtonClick(this.I3);
                return;
            case R.id.pdf_bottom_1_edit_middle /* 2131363534 */:
                if (this.f26277w2) {
                    L4();
                    return;
                }
                X4();
                tn.a.d(this, ea.a.p("O24Mbx9hHGU=", "IFZbkhXH"), ea.a.p("Lm5fbyZzQ3Izay90HXIHdVJoMWMpaQZr", "yAzFpDMO"), ea.a.p("O29FYWw=", "dOA1IX8z"), false);
                tn.a.d(this, ea.a.p("Lm5fbw1hQ2U=", "22EXIg3p"), ea.a.p("Um4lbyxzFnIba1F0AXI5dSNobWMqaSBr", "j3Jq2tkS"), ea.a.p("UWFy", "qY3b19ww"), false);
                if (this.f26153a3) {
                    D4(-1, getString(R.string.arg_res_0x7f1303b9));
                    return;
                }
                RelativeLayout relativeLayout3 = this.H3;
                if (relativeLayout3 != null && relativeLayout3.isSelected()) {
                    J3();
                    k4(null);
                    U2();
                    return;
                }
                o4();
                w2();
                k4(this.H3);
                U2();
                OnStrikeOutButtonClick(this.H3);
                return;
            case R.id.pdf_bottom_1_edit_under /* 2131363536 */:
                if (this.f26277w2) {
                    L4();
                    return;
                }
                X4();
                tn.a.d(this, ea.a.p("Um4lbwdhFmU=", "Yaouy7FT"), ea.a.p("Lm5fbyZ1WWQ_ciZpG2U3Y1lpDWs=", "rgyQWAPn"), ea.a.p("R28_YWw=", "bOpGSdp8"), false);
                tn.a.d(this, ea.a.p("Um4lbwdhFmU=", "o5cR8CGq"), ea.a.p("L24Gb2d1OGQtcgppWmUIY1RpMWs=", "91Nh8VkF"), ea.a.p("LWFy", "b4yMoQUg"), false);
                if (this.f26153a3) {
                    D4(-1, getString(R.string.arg_res_0x7f1303b9));
                    return;
                }
                RelativeLayout relativeLayout4 = this.G3;
                if (relativeLayout4 != null && relativeLayout4.isSelected()) {
                    J3();
                    k4(null);
                    U2();
                    return;
                }
                o4();
                w2();
                k4(this.G3);
                U2();
                OnUnderlineButtonClick(this.G3);
                return;
            case R.id.pdf_toolbar_3_ok /* 2131363586 */:
                String c33 = c3();
                if (!TextUtils.isEmpty(c33)) {
                    tn.a.d(this, ea.a.p("KmRYdCZzVnZl", "svrFT2vZ"), ea.a.p("E2QzdB1hImUXYQJqa3M2dl1fMWwgY2s=", "JbvZnT9w"), c33, false);
                }
                int i10 = this.K;
                if (i10 == 4) {
                    BillingConfigImpl billingConfigImpl2 = BillingConfigImpl.c;
                    if (billingConfigImpl2.z() && BillingConfigImpl.y() && !billingConfigImpl2.w()) {
                        this.f26179f3 = true;
                        BaseSubscriptionActivity.a aVar3 = BaseSubscriptionActivity.L;
                        String p11 = ea.a.p("PGlWbg==", "jcNPGyGp");
                        aVar3.getClass();
                        BaseSubscriptionActivity.a.a(this, p11);
                        return;
                    }
                    d4(new pdf.pdfreader.viewer.editor.free.pdfview.c(this, 2));
                    return;
                } else if (i10 == 2) {
                    c.a aVar4 = fn.c.c;
                    ao.c1 c1Var = new ao.c1(this);
                    aVar4.getClass();
                    if (c.a.a(this, c1Var)) {
                        c4(2, null);
                        W3();
                        return;
                    }
                    return;
                } else {
                    V2(2, i10);
                    return;
                }
            case R.id.pdf_toolbar_3_redo /* 2131363588 */:
                if (this.K == 4) {
                    tn.a.b(this, ea.a.p("PGlWbg==", "BCcml3Zd"), ea.a.p("N2kvbm1yA2MndgNya2Ezak1zdA==", "ctDH2fA8"));
                    yo.c cVar3 = c.a.f32211a;
                    AtomicBoolean atomicBoolean = cVar3.f32209b;
                    if (atomicBoolean.get()) {
                        atomicBoolean.set(false);
                        Pair<SignActionInfo, SignActionInfo> pollLast = cVar3.f32210d.pollLast();
                        if (pollLast == null) {
                            atomicBoolean.set(true);
                            return;
                        }
                        Iterator<c.InterfaceC0423c> it = cVar3.f32208a.iterator();
                        while (it.hasNext()) {
                            it.next().b1((SignActionInfo) pollLast.first, (SignActionInfo) pollLast.second, new yo.a(cVar3));
                        }
                        return;
                    }
                    return;
                } else if (this.f26276w1 != null && this.f26256t1 != null) {
                    if (!arrayList.contains(ea.a.p("KmRYdCZyUmM1di9yKmMEaVZr", "wWMxEFII"))) {
                        tn.a.b(this, ea.a.p("VmQidCxyZQ==", "Zxgavska"), ea.a.p("LmQQdBVyAGMndgNya2M7aVtr", "ClKyJejH"));
                        arrayList.add(ea.a.p("VmQidCxyB2MddlFyNmM6aSdr", "d1kaZcUX"));
                    }
                    r3(false, false);
                    b0 b0Var4 = this.f26276w1;
                    ij.b redoAnnotation = this.f26256t1.redoAnnotation();
                    b0Var4.getClass();
                    Objects.toString(redoAnnotation);
                    if (redoAnnotation != null) {
                        int i11 = redoAnnotation.f18518a;
                        Annotation.Type type = redoAnnotation.f18519b;
                        if (type != null) {
                            type.name();
                        }
                        if (i11 >= 0) {
                            b0Var4.K0();
                            PDFPageView pDFPageView = (PDFPageView) b0Var4.E(i11);
                            pDFPageView.toString();
                            if (redoAnnotation.f18526j) {
                                pDFPageView.i2();
                                pDFPageView.T1();
                                return;
                            }
                            pDFPageView.G();
                            pDFPageView.Z0();
                            pDFPageView.x2(redoAnnotation);
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case R.id.pdf_toolbar_3_undo /* 2131363589 */:
                if (this.K == 4) {
                    tn.a.b(this, ea.a.p("PGlWbg==", "328uoEWA"), ea.a.p("PGkvbjlyKnYnYwd0XW85X1lkOHU6dA==", "2IOHfOew"));
                    yo.c cVar4 = c.a.f32211a;
                    AtomicBoolean atomicBoolean2 = cVar4.f32209b;
                    if (atomicBoolean2.get()) {
                        atomicBoolean2.set(false);
                        Pair<SignActionInfo, SignActionInfo> pollLast2 = cVar4.c.pollLast();
                        if (pollLast2 == null) {
                            atomicBoolean2.set(true);
                            return;
                        }
                        Iterator<c.InterfaceC0423c> it2 = cVar4.f32208a.iterator();
                        while (it2.hasNext()) {
                            it2.next().m0((SignActionInfo) pollLast2.first, (SignActionInfo) pollLast2.second, new yo.b(cVar4));
                        }
                        return;
                    }
                    return;
                } else if (this.f26276w1 != null && this.f26256t1 != null) {
                    if (!arrayList.contains(ea.a.p("FGQgdClyJ3YnYwd0XW85X1tsO2Nr", "8hqIvBCl"))) {
                        tn.a.b(this, ea.a.p("EGQRdApyZQ==", "HeuxUhlI"), ea.a.p("KmRYdCZyUnY1Yyt0HG8GX1ZsB2Nr", "nzwMIGxl"));
                        arrayList.add(ea.a.p("VmQidCxyB3YdY1V0AG84XydsW2Nr", "apjsCLz0"));
                    }
                    if (this.f26256t1 != null) {
                        r3(false, false);
                        b0 b0Var5 = this.f26276w1;
                        ij.b undoAnnotation = this.f26256t1.undoAnnotation();
                        b0Var5.getClass();
                        Objects.toString(undoAnnotation);
                        if (undoAnnotation != null) {
                            int i12 = undoAnnotation.f18518a;
                            Annotation.Type type2 = undoAnnotation.f18519b;
                            if (type2 != null) {
                                type2.name();
                            }
                            if (i12 >= 0) {
                                b0Var5.K0();
                                PDFPageView pDFPageView2 = (PDFPageView) b0Var5.E(i12);
                                pDFPageView2.toString();
                                if (undoAnnotation.f18526j) {
                                    pDFPageView2.i2();
                                    pDFPageView2.T1();
                                    return;
                                }
                                pDFPageView2.G();
                                pDFPageView2.Z0();
                                pDFPageView2.A2(undoAnnotation);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case R.id.tv_edit_type_annotate /* 2131364363 */:
                TextView textView2 = this.B3;
                if (textView2 != null && !textView2.isSelected()) {
                    int i13 = this.K;
                    if (i13 == 2) {
                        W2(1);
                        return;
                    } else if (i13 == 4) {
                        S4(1);
                        return;
                    } else {
                        O2();
                        return;
                    }
                }
                return;
            case R.id.tv_edit_type_editor /* 2131364364 */:
                TextView textView3 = this.A3;
                if (textView3 != null && !textView3.isSelected()) {
                    if (this.K == 4) {
                        S4(2);
                        return;
                    }
                    this.f26229o1 = ea.a.p("O2Fi", "eU8I8fQY");
                    Q2();
                    return;
                }
                return;
            case R.id.tv_edit_type_signature /* 2131364365 */:
                TextView textView4 = this.C3;
                if (textView4 != null && !textView4.isSelected()) {
                    if (this.K == 2) {
                        W2(4);
                        return;
                    } else {
                        P2();
                        return;
                    }
                }
                return;
            case R.id.viewOverlayTop /* 2131364601 */:
                GraffitiBottomSheetView graffitiBottomSheetView = this.f26282x0;
                if (graffitiBottomSheetView != null && graffitiBottomSheetView.H()) {
                    this.f26282x0.C();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // androidx.appcompat.app.c, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        PopupWindow popupWindow;
        AppCompatImageView appCompatImageView;
        boolean z10;
        boolean z11;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation != getResources().getConfiguration().orientation) {
            getResources().updateConfiguration(configuration, null);
        }
        PreviewViewSettingsDialog previewViewSettingsDialog = this.f26294z;
        boolean z12 = true;
        if (previewViewSettingsDialog != null) {
            if (configuration.orientation == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            previewViewSettingsDialog.J(z11);
        }
        if (this.f26265u4) {
            this.f26265u4 = false;
            PreviewViewSettingsDialog previewViewSettingsDialog2 = this.f26294z;
            if (previewViewSettingsDialog2 != null && previewViewSettingsDialog2.isShowing()) {
                this.f26294z.cancel();
            }
        }
        pdf.pdfreader.viewer.editor.free.utils.a0.a(this, true);
        T2();
        androidx.activity.f.q("YWUqZBZyMnIXdl1lHkE1dC12W3Q_by1DHW40aQJ1F2FHaSRuMGgDbhVlZA==", "rReeb8RS", dp.a.a());
        if (this.L2 != configuration.orientation) {
            if (i.a.f21508a.f21507d) {
                this.f26176e5 = false;
                pdf.pdfreader.viewer.editor.free.utils.g1<ReaderPreviewActivity> g1Var = this.C;
                if (g1Var != null) {
                    g1Var.removeCallbacks(this.T2);
                }
                FrameLayout frameLayout = this.f26177f0;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
            }
            this.L2 = configuration.orientation;
            View view = this.f26237p3;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = pdf.pdfreader.viewer.editor.free.utils.t0.U(this);
                this.f26237p3.setLayoutParams(layoutParams);
            }
            AppCompatImageView appCompatImageView2 = this.f26183g2;
            Handler handler = this.D;
            if (appCompatImageView2 != null && appCompatImageView2.isSelected()) {
                handler.postDelayed(new ao.m(this, 0), 800L);
                handler.postDelayed(new ao.l(this, 1), 1600L);
            } else if (this.f19294h) {
                handler.postDelayed(new ao.n(this, 0), 2300L);
            }
            P1();
            PopupWindow popupWindow2 = com.google.android.play.core.assetpacks.b1.f13188l;
            if (popupWindow2 != null && popupWindow2.isShowing()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                try {
                    PopupWindow popupWindow3 = com.google.android.play.core.assetpacks.b1.f13188l;
                    if (popupWindow3 != null) {
                        popupWindow3.dismiss();
                    }
                } catch (Exception unused) {
                }
            }
        }
        if (configuration.orientation == 1) {
            D2();
            GraffitiBottomSheetView graffitiBottomSheetView = this.f26282x0;
            if (graffitiBottomSheetView != null) {
                graffitiBottomSheetView.setHorizontalPadding(0);
            }
        } else {
            GraffitiBottomSheetView graffitiBottomSheetView2 = this.f26282x0;
            if (graffitiBottomSheetView2 != null) {
                graffitiBottomSheetView2.setHorizontalPadding(getResources().getDimensionPixelSize(R.dimen.dp_40));
            }
        }
        GraffitiBottomSheetView graffitiBottomSheetView3 = this.f26282x0;
        if (graffitiBottomSheetView3 != null && graffitiBottomSheetView3.H()) {
            GraffitiBottomSheetView graffitiBottomSheetView4 = this.f26282x0;
            zl.b.c.getClass();
            graffitiBottomSheetView4.K(zl.b.h());
        }
        EditText editText = this.D1;
        if (editText != null) {
            if (configuration.orientation == 1) {
                editText.setImeOptions(268435459);
            } else {
                editText.setImeOptions(3);
            }
            pdf.pdfreader.viewer.editor.free.utils.extension.g.b(this.D1);
        }
        oo.g gVar = this.I4;
        if (gVar != null && gVar.isShowing()) {
            oo.g gVar2 = this.I4;
            if (gVar2 instanceof PdfReaderOpenClearDialog) {
                ((PdfReaderOpenClearDialog) gVar2).H();
            } else if (gVar2 instanceof PdfReaderOpenDefaultDialog) {
                ((PdfReaderOpenDefaultDialog) gVar2).H();
            }
        }
        PreviewPageManageGuideView previewPageManageGuideView = this.f26216m0;
        if (previewPageManageGuideView == null || previewPageManageGuideView.getVisibility() != 0) {
            z12 = false;
        }
        if (z12 && (appCompatImageView = this.f26165c4) != null) {
            appCompatImageView.getViewTreeObserver().addOnGlobalLayoutListener(new v());
        }
        t2 t2Var = this.f26181f5;
        if (t2Var != null && t2Var.isShowing()) {
            this.f26181f5.c();
        }
        PreviewUseEditorGuideDialog previewUseEditorGuideDialog = this.J0;
        if (previewUseEditorGuideDialog != null && previewUseEditorGuideDialog.isShowing()) {
            this.J0.dismiss();
            this.J0 = null;
            A4();
        }
        if (this.J && (popupWindow = this.B5) != null && popupWindow.isShowing()) {
            this.B5.dismiss();
            b.InterfaceC0288b interfaceC0288b = this.M4;
            if (interfaceC0288b != null) {
                ((lib.zj.pdfeditor.p) interfaceC0288b).a();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0276, code lost:
        if (getSupportFragmentManager().D(ea.a.p("HHBdYQpoe287ZCNuEkYaYVJtC250", "mYzinrXd")) != null) goto L51;
     */
    @Override // jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    @android.annotation.SuppressLint({"SourceLockedOrientationActivity"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 976
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity.onCreate(android.os.Bundle):void");
    }

    @Override // jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onDestroy() {
        boolean z10;
        boolean z11;
        c.a.f32211a.f32208a.remove(this);
        ThumbLoadCenter thumbLoadCenter = this.C2;
        thumbLoadCenter.e(null);
        thumbLoadCenter.f();
        pdf.pdfreader.viewer.editor.free.utils.t0.V().execute(new x0());
        EngineHelper.f15726a.getClass();
        EngineHelper.e(this.f26235p1);
        ea.a.f16525j = ea.a.f16524i;
        ea.a.f16524i = null;
        pdf.pdfreader.viewer.editor.free.utils.t1.b(ea.a.p("A2U0ZFxyKnItdg9lQ0E0dFF2O3QwIFluMGUCdCNveQ==", "RfQU9zNw"));
        t0 t0Var = this.K1;
        if (t0Var != null) {
            t0Var.a();
            this.K1 = null;
        }
        pdf.pdfreader.viewer.editor.free.ui.dialog.v vVar = this.f26267v;
        if (vVar != null && vVar.isShowing()) {
            this.f26267v.cancel();
        }
        o3 o3Var = this.f26287y;
        if (o3Var != null && o3Var.isShowing()) {
            this.f26287y.cancel();
        }
        AlertDialog alertDialog = this.L1;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.L1.cancel();
        }
        x2 x2Var = this.f26274w;
        if (x2Var != null && x2Var.isShowing()) {
            this.f26274w.cancel();
        }
        pdf.pdfreader.viewer.editor.free.ui.dialog.s sVar = this.W3;
        if (sVar != null && sVar.isShowing()) {
            this.W3.cancel();
        }
        AnimatorSet animatorSet = this.A5;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.A5.cancel();
        }
        ObjectAnimator objectAnimator = this.f26300z5;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.f26300z5.cancel();
        }
        Handler handler = this.D;
        handler.removeCallbacks(this.T4);
        PopupWindow popupWindow = com.google.android.play.core.assetpacks.b1.f13188l;
        if (popupWindow != null && popupWindow.isShowing()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            try {
                PopupWindow popupWindow2 = com.google.android.play.core.assetpacks.b1.f13188l;
                if (popupWindow2 != null) {
                    popupWindow2.dismiss();
                }
            } catch (Exception unused) {
            }
        }
        T2();
        ValueAnimator valueAnimator = this.E4;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.E4.cancel();
        }
        PreviewAddTextDialog previewAddTextDialog = this.f26199j1;
        if (previewAddTextDialog != null && previewAddTextDialog.isShowing()) {
            this.f26199j1.cancel();
        }
        ValueAnimator valueAnimator2 = this.Y1;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.Y1.cancel();
        }
        ValueAnimator valueAnimator3 = this.Z1;
        if (valueAnimator3 != null && valueAnimator3.isRunning()) {
            this.Z1.cancel();
        }
        ValueAnimator valueAnimator4 = this.f26225n3;
        if (valueAnimator4 != null && valueAnimator4.isRunning()) {
            this.f26225n3.cancel();
        }
        ObjectAnimator objectAnimator2 = this.G4;
        if (objectAnimator2 != null && objectAnimator2.isRunning()) {
            this.G4.cancel();
        }
        PreviewViewSettingsDialog previewViewSettingsDialog = this.f26294z;
        if (previewViewSettingsDialog != null && previewViewSettingsDialog.isShowing()) {
            this.f26294z.cancel();
        }
        ChooseConvertImageTypeDialog chooseConvertImageTypeDialog = this.t4;
        if (chooseConvertImageTypeDialog != null && chooseConvertImageTypeDialog.isShowing()) {
            this.t4.cancel();
        }
        PreviewUseEditorGuideDialog previewUseEditorGuideDialog = this.J0;
        if (previewUseEditorGuideDialog != null && previewUseEditorGuideDialog.isShowing()) {
            this.J0.cancel();
        }
        EditorFreeSaveDialog editorFreeSaveDialog = this.S5;
        if (editorFreeSaveDialog != null && editorFreeSaveDialog.isShowing()) {
            this.S5.cancel();
        }
        g3 g3Var = this.H0;
        if (g3Var != null && g3Var.isShowing()) {
            this.H0.cancel();
        }
        PopupWindow popupWindow3 = this.f26248r5;
        if (popupWindow3 != null) {
            try {
                popupWindow3.dismiss();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        InterceptTouchFrameLayout interceptTouchFrameLayout = this.U;
        if (interceptTouchFrameLayout != null) {
            interceptTouchFrameLayout.setTopTouchListener(null);
        }
        pdf.pdfreader.viewer.editor.free.utils.g1<ReaderPreviewActivity> g1Var = this.C;
        if (g1Var != null) {
            g1Var.removeCallbacksAndMessages(null);
        }
        if (this.E != null) {
            p1.a.a(this).d(this.E);
        }
        handler.removeCallbacksAndMessages(null);
        PopupWindow popupWindow4 = com.google.android.play.core.assetpacks.b1.f13188l;
        if (popupWindow4 != null && popupWindow4.isShowing()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            try {
                PopupWindow popupWindow5 = com.google.android.play.core.assetpacks.b1.f13188l;
                if (popupWindow5 != null) {
                    popupWindow5.dismiss();
                }
            } catch (Exception unused2) {
            }
        }
        ReaderPdfApplication.k().f28148e.i(this.f26270v2);
        pdf.pdfreader.viewer.editor.free.utils.t0.V().execute(new y0());
        this.X2 = 0L;
        this.Y2 = false;
        this.Z2 = false;
        lib.zj.pdfeditor.a.a();
        FullScreenManage.g(3);
        super.onDestroy();
        this.f26290y2 = true;
        ea.a.p("XG4PZQB0EG8LOiA=", "6bN8aMbK");
        String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        x1(this.R);
        x1(this.S);
        x1(this.X);
        a2.f26307a = -1L;
        a2.f26308b = false;
        wn.c cVar = this.f26297z2;
        if (cVar != null && cVar.c) {
            tn.a.d(ReaderPdfApplication.m(), ea.a.p("RWkudw==", "G097yX5w"), ea.a.p("OWlUdyZ0Xm1l", "CwERyGyW"), ea.a.p("Q2QtXw==", "KlbbCFam") + this.f26297z2.a(), false);
        }
        a.C0318a.f23099a.f23098a.clear();
        lib.zj.pdfeditor.i iVar = i.a.f21508a;
        iVar.f21505a.clear();
        iVar.f21506b.clear();
        iVar.f21507d = false;
        iVar.c = 1;
        if (this.I5) {
            PDF2WordHelper.f25574a.getClass();
            PDF2WordHelper.Companion.c(this);
        }
    }

    @wk.i(threadMode = ThreadMode.MAIN)
    public void onOperatePdfStart(qo.i iVar) {
        this.f26299z4 = true;
        onBackPressed();
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onPause() {
        b0 b0Var;
        p0.a aVar;
        hp.e eVar;
        androidx.activity.f.q("YWUxZC1yF3Itdg9lQ0E0dFF2O3QwIFluJGEEc2U=", "Gd3PHGMM", dp.a.a());
        pdf.pdfreader.viewer.editor.free.feature.bridge.c cVar = this.J2;
        if (cVar != null && !cVar.d() && (eVar = this.Z) != null) {
            eVar.d();
        }
        super.onPause();
        this.O5 = false;
        l0 l0Var = this.E1;
        if (l0Var != null && (aVar = l0Var.f21557f) != null) {
            try {
                aVar.interrupt();
            } catch (Exception unused) {
            }
        }
        if (this.f26262u1 != null && (b0Var = this.f26276w1) != null) {
            b4(b0Var.getDisplayedViewIndex());
        }
        wn.c cVar2 = this.f26297z2;
        if (cVar2 != null) {
            cVar2.b();
        }
        gl.o.f17931a.getClass();
        gl.p.f17933p.l();
        gl.q.f17934p.l();
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f26245r1 = (PdfPreviewEntity) bundle.getSerializable(ea.a.p("Vm4_aQd5", "rXbzI5R3"));
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onResume() {
        hp.e eVar;
        dp.a a10 = dp.a.a();
        String p10 = ea.a.p("HWVQZBxyZ3I_diNlAkELdFx2B3Q8IApuBWU6dQpl", "ssMRWIgt");
        a10.getClass();
        dp.a.c(p10);
        pdf.pdfreader.viewer.editor.free.utils.t1.b(ea.a.p("YWUqZBZyMnIXdl1lHkE1dC12W3Q_ICxuJ2UcdQdl", "uojs7ow5"));
        AppOpenManager.c().f23907g = true;
        pdf.pdfreader.viewer.editor.free.feature.bridge.c cVar = this.J2;
        if (cVar != null && !cVar.d() && (eVar = this.Z) != null) {
            eVar.c();
        }
        super.onResume();
        x2 x2Var = this.f26274w;
        if (x2Var != null) {
            x2Var.J();
        }
        if (this.N5) {
            this.N5 = false;
            if (BillingConfigImpl.c.w()) {
                this.O5 = false;
                pdf.pdfreader.viewer.editor.free.utils.t0.V().execute(new pdf.pdfreader.viewer.editor.free.pdfview.f(this));
            }
        }
        if (this.f26179f3) {
            this.f26179f3 = false;
            if (BillingConfigImpl.c.w()) {
                int i10 = this.K;
                if (i10 == 4) {
                    d4(new pdf.pdfreader.viewer.editor.free.pdfview.c(this, 2));
                } else if (i10 == 2) {
                    c4(2, null);
                    W3();
                }
            }
        }
        if (this.P4 != -1) {
            if (BillingConfigImpl.c.w()) {
                if (this.K == 4) {
                    d4(new pdf.pdfreader.viewer.editor.free.pdfview.c(this, 3));
                }
                if (this.K == 2) {
                    c4(3, null);
                }
                O3(this.P4);
            }
            this.P4 = -1;
        }
        androidx.activity.s.A0(this);
        aj.b.j(this, this.U3, ea.a.p("Q2Rm", "JYa8NSPZ"), this.f26235p1);
        aj.b.L();
        if (this.O4) {
            this.O4 = false;
            new Handler().postDelayed(new ao.l(this, 0), 10L);
            return;
        }
        if (this.H4) {
            this.H4 = false;
            E2(false);
        }
        wn.c cVar2 = this.f26297z2;
        if (cVar2 != null) {
            cVar2.c();
        }
        if (this.S2) {
            this.S2 = !FullScreenManage.d(this, null, 3, true);
        }
    }

    @Override // jl.a, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        Handler handler;
        try {
            bundle.putSerializable(ea.a.p("EW46aRZ5", "bJtNbAqc"), this.f26245r1);
            bundle.putBoolean(ea.a.p("IXMBbgNlEEUsaRJNW2Rl", "N6HDwbws"), this.J);
            bundle.putInt(ea.a.p("Km5FZQtFU2kuVDNwZQ==", "AFB1WngY"), this.K);
            bundle.putString(ea.a.p("D3IbbQ==", "UvitwIPH"), this.V);
            bundle.putParcelable(ea.a.p("OnJp", "Y3dnXRJf"), this.Q);
            bundle.putString(ea.a.p("Q2E4cwRvEGQ=", "BbIaXVcn"), this.W);
            bundle.putBoolean(ea.a.p("W2E4QxthDGcXZA==", "A89VVJQ5"), this.f26156b0);
            bundle.putBoolean(ea.a.p("WnMYYQVlJmEGYQ==", "0ir5uFRN"), this.f26281x);
            bundle.putBoolean(ea.a.p("QWUqZApKF20CSFttDE84UiFzR21l", "tCR0k8rN"), this.O4);
            bundle.putBoolean(ea.a.p("WnMObgdlEFIXZlhvHk05ZGU=", "M0o2XrM4"), this.M);
            if (this.f26297z2 != null) {
                bundle.putLong(ea.a.p("PWVQZC1pWmU=", "r8CJBl62"), this.f26297z2.f31395a);
                this.f26297z2.c = false;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (this.f26262u1 != null && this.f26276w1 != null) {
            bundle.putString(ea.a.p("dWknZT1hD2U=", "bCxiQ1JS"), this.f26262u1);
            b4(this.f26276w1.getDisplayedViewIndex());
        }
        if (this.f26296z1 == TopBarMode.Search) {
            bundle.putBoolean(ea.a.p("A2UgclRoPW8sZQ==", "UOPA7ph6"), true);
        }
        if (this.J1) {
            bundle.putBoolean(ea.a.p("GmUlbBl3Gm8sZQ==", "WgHCvW1c"), true);
        }
        w1 w1Var = this.U4;
        if (w1Var != null && (handler = this.D) != null) {
            handler.removeCallbacks(w1Var);
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onStart() {
        ReaderPDFCore readerPDFCore = this.f26256t1;
        if (readerPDFCore != null) {
            readerPDFCore.startAlerts();
            R2();
        }
        super.onStart();
    }

    @Override // jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onStop() {
        if (this.f26256t1 != null) {
            this.I1 = false;
            x1(this.L1);
            this.L1 = null;
            t0 t0Var = this.K1;
            if (t0Var != null) {
                t0Var.a();
                this.K1 = null;
            }
            this.f26256t1.stopAlerts();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            p3();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // jl.a, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        pdf.pdfreader.viewer.editor.free.feature.bridge.c cVar = this.J2;
        if (cVar != null) {
            cVar.e(z10);
            if (z10 && !this.J2.d()) {
                B2();
            }
        }
    }

    public final void p3() {
        o3();
        n3();
    }

    public final void p4(View view, float f10, float f11) {
        if (this.f26276w1 != null && !this.f26153a3 && (view instanceof PDFPageView)) {
            PDFPageView pDFPageView = (PDFPageView) view;
            Bitmap bitmap = this.O0;
            if (bitmap == null || bitmap.isRecycled()) {
                int i10 = this.P0;
                this.O0 = Bitmap.createBitmap(i10, i10, Bitmap.Config.ARGB_8888);
            }
            Canvas canvas = new Canvas(this.O0);
            boolean z10 = false;
            canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
            if (this.f26276w1.getMode() == PDFReaderView.Mode.Editor) {
                PDFPageView pDFPageView2 = this.f26276w1.K1;
                if (pDFPageView2 != null) {
                    lib.zj.pdfeditor.text.editor.a aVar = pDFPageView2.f21180l1;
                    if (aVar.W && !aVar.Y.isEmpty()) {
                        z10 = true;
                    }
                }
                if (z10) {
                    canvas.translate(-((f10 - pDFPageView.getLeft()) - (this.P0 / 2.0f)), -(((this.f26162c1 / 16.0f) * 7.0f) + ((f11 - pDFPageView.getTop()) - (this.P0 / 2.0f))));
                } else if (this.f26276w1.J0()) {
                    canvas.translate(-((f10 - pDFPageView.getLeft()) - (this.P0 / 2.0f)), -((this.f26162c1 / 10.0f) + ((f11 - pDFPageView.getTop()) - (this.P0 / 2.0f))));
                }
            } else {
                b0 b0Var = this.f26276w1;
                if (b0Var.f21238m1) {
                    canvas.translate(-((f10 - pDFPageView.getLeft()) - (this.P0 / 2.0f)), -((f11 - pDFPageView.getTop()) - ((this.P0 - this.f26162c1) / 2.0f)));
                } else if (b0Var.f21239n1) {
                    canvas.translate(-((f10 - pDFPageView.getLeft()) - (this.P0 / 2.0f)), -((this.f26162c1 / 9.0f) + ((f11 - pDFPageView.getTop()) - (this.P0 / 2.0f))));
                } else {
                    canvas.translate(-((f10 - pDFPageView.getLeft()) - (this.P0 / 2.0f)), -((this.f26162c1 / 3.0f) + ((f11 - pDFPageView.getTop()) - (this.P0 / 2.0f))));
                }
            }
            pDFPageView.draw(canvas);
            if (this.G2 != null) {
                b0 b0Var2 = this.f26276w1;
                int[] iArr = this.f26193i1;
                b0Var2.getLocationInWindow(iArr);
                this.G2.a(this.O0, f10, f11, this.P0, this.f26162c1, iArr[1], this.f26276w1.getScale() + 1.3f);
            }
        }
    }

    public final void q3() {
        EditText editText;
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(ea.a.p("BW5DdSxfIGU8aAlk", "Uol3XMqV"));
        if (inputMethodManager != null && (editText = this.D1) != null) {
            inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
    }

    public final void q4(ReaderPDFCore readerPDFCore) {
        ReaderPDFCore readerPDFCore2 = this.f26256t1;
        if (readerPDFCore2 != null) {
            readerPDFCore2.onDestroy();
        }
        this.f26256t1 = readerPDFCore;
        readerPDFCore.setStateListener(this);
        this.D.post(new eb.c(2, this, true));
    }

    public final void r3(boolean z10, boolean z11) {
        AddTextChangeColorBottomSheetView addTextChangeColorBottomSheetView = this.f26285x3;
        if (addTextChangeColorBottomSheetView != null) {
            if (z10) {
                addTextChangeColorBottomSheetView.I();
            } else {
                addTextChangeColorBottomSheetView.C();
            }
        }
        AddTextChangeSizeBottomSheetView addTextChangeSizeBottomSheetView = this.f26278w3;
        if (addTextChangeSizeBottomSheetView != null) {
            if (z11) {
                addTextChangeSizeBottomSheetView.I();
            } else {
                addTextChangeSizeBottomSheetView.C();
            }
        }
    }

    public final void r4(int i10) {
        ea.a.p("LmRVVBx4dA==", "c41I3D2M");
        ea.a.p("Yi0cLVQtR3I_by1yEHMbPQ==", "cUjXTs2w");
        String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        if (this.f26240q0 != i10) {
            this.f26240q0 = i10;
            pdf.pdfreader.viewer.editor.free.utils.q0.x(this, i10, "add_text_size_in_158");
        }
        AddTextChangeSizeBottomSheetView addTextChangeSizeBottomSheetView = this.f26278w3;
        if (addTextChangeSizeBottomSheetView != null) {
            if (i10 < ((am.a2) addTextChangeSizeBottomSheetView.f28172y).f716b.getMinProgress()) {
                i10 = ((am.a2) addTextChangeSizeBottomSheetView.f28172y).f716b.getMinProgress();
            } else if (i10 > ((am.a2) addTextChangeSizeBottomSheetView.f28172y).f716b.getMaxProgress()) {
                i10 = ((am.a2) addTextChangeSizeBottomSheetView.f28172y).f716b.getMaxProgress();
            }
            TextView textView = ((am.a2) addTextChangeSizeBottomSheetView.f28172y).c;
            textView.setText(i10 + "");
            ((am.a2) addTextChangeSizeBottomSheetView.f28172y).f716b.c(i10, true, false);
        }
    }

    public final void s3() {
        FrameLayout frameLayout = this.f26177f0;
        if (frameLayout != null && frameLayout.getVisibility() == 0) {
            this.U2 = false;
            this.f26177f0.animate().alpha(0.0f).setDuration(500L).setListener(new w0()).start();
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void s4(int i10) {
        ThumbnailAdapter thumbnailAdapter;
        if (this.Z3 == null) {
            return;
        }
        ViewGroup viewGroup = this.X3;
        if (viewGroup != null) {
            viewGroup.setVisibility(i10);
        }
        AppCompatImageView appCompatImageView = this.f26165c4;
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(i10);
        }
        AppCompatImageView appCompatImageView2 = this.f26154a4;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setVisibility(i10);
        }
        AppCompatImageView appCompatImageView3 = this.f26159b4;
        if (appCompatImageView3 != null) {
            appCompatImageView3.setVisibility(i10);
        }
        AppCompatImageView appCompatImageView4 = this.f26180f4;
        if (appCompatImageView4 != null) {
            appCompatImageView4.setVisibility(i10);
        }
        PreviewPDF2WordStateView previewPDF2WordStateView = this.f26170d4;
        if (previewPDF2WordStateView != null) {
            previewPDF2WordStateView.setVisibility(i10);
        }
        if (this.f26232o4) {
            ImageView imageView = this.f26252s3;
            if (imageView != null) {
                imageView.setVisibility(i10);
            }
        } else {
            ImageView imageView2 = this.f26252s3;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        j4(i10);
        View view = this.f26210l0;
        if (view != null) {
            if (i10 == 0) {
                L2();
            } else {
                view.setVisibility(i10);
            }
        }
        InterceptRecyclerView interceptRecyclerView = this.Z3;
        if (interceptRecyclerView != null) {
            int visibility = interceptRecyclerView.getVisibility();
            if (this.M && i10 == 8) {
                this.Z3.setVisibility(8);
                View view2 = this.f26202j4;
                if (view2 != null) {
                    view2.setVisibility(8);
                    return;
                }
                return;
            }
            this.Z3.setVisibility(i10);
            if (this.f26202j4 != null) {
                if (pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this)) {
                    this.f26202j4.setVisibility(8);
                } else {
                    this.f26202j4.setVisibility(i10);
                }
            }
            if (visibility != i10) {
                androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
                aVar.f(this.f26260u);
                if (this.M) {
                    aVar.h(R.id.intercept_fl, 4, 0, 4);
                } else if (!this.J) {
                    if (i10 == 0) {
                        if (ReaderView.f21378z0 && ReaderView.B0) {
                            aVar.h(R.id.intercept_fl, 4, 0, 4);
                        } else {
                            aVar.h(R.id.intercept_fl, 4, R.id.thumb_rv, 3);
                        }
                    } else {
                        aVar.h(R.id.intercept_fl, 4, 0, 4);
                    }
                }
                aVar.b(this.f26260u);
            }
            if (i10 == 0 && (thumbnailAdapter = this.D2) != null) {
                thumbnailAdapter.notifyDataSetChanged();
            }
        }
    }

    public final void t2(PDFReaderView.Mode mode) {
        this.f26296z1 = TopBarMode.Accept;
        this.A1 = AcceptMode.Ink;
        b0 b0Var = this.f26276w1;
        if (b0Var != null) {
            b0Var.setMode(mode);
        }
    }

    public final void t3() {
        RelativeLayout relativeLayout = this.R3;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        TextView textView = this.f26261u0;
        if (textView != null) {
            textView.setVisibility(8);
        }
        ImageView imageView = this.f26255t0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    public final void t4(boolean z10) {
        View view = this.D5;
        if (view != null) {
            if (z10) {
                tn.a.d(this, ea.a.p("MWkNdw==", "9WGhGjnv"), ea.a.p("RWkudyxjDW4EZUZiCG44ZTZfQWgpdw==", "XH8Ht56k"), ConvertEventCenter.f28654b, false);
                if (!this.L5) {
                    AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
                    AppCoreFilterEvent.g(ea.a.p("QzI8XxVpDGkBaA==", "CaviwOVu"));
                    this.L5 = true;
                }
                this.D5.setVisibility(0);
                return;
            }
            view.setVisibility(8);
        }
    }

    public final void u2(PDFTextEditorMode pDFTextEditorMode) {
        boolean z10;
        boolean z11;
        if (this.f26168d2 != null && this.f26173e2 != null && this.f26178f2 != null) {
            int i10 = s.f26387f[pDFTextEditorMode.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        if (this.f26277w2) {
                            return;
                        }
                        if (this.L == PDFTextEditorMode.TEXT_AND_IMG) {
                            Y2();
                        }
                        b0 b0Var = this.f26276w1;
                        if (b0Var != null) {
                            b0Var.setCanSelectDelete(true);
                            this.f26276w1.setEditorMode(true);
                            this.f26276w1.setAddTextMode(true);
                        }
                        this.Q2 = true;
                        this.f26174e3 = ea.a.p("O2VJdA==", "pK6sKFzI");
                        this.K = 2;
                        this.f26296z1 = TopBarMode.Annot;
                        this.A1 = AcceptMode.AddText;
                        if (this.f26276w1 != null) {
                            if (pdf.pdfreader.viewer.editor.free.utils.q0.f(this, "is_need_show_add_text_guide_in_158", true) && pdf.pdfreader.viewer.editor.free.utils.q0.J(this)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                pdf.pdfreader.viewer.editor.free.utils.q0.w(this, "is_need_show_add_text_guide_in_158", false);
                            }
                            if (pdf.pdfreader.viewer.editor.free.utils.q0.D(this)) {
                                pdf.pdfreader.viewer.editor.free.utils.q0.w(this, "add_text_red_dot_show_in_158", false);
                            }
                            if (pdf.pdfreader.viewer.editor.free.utils.q0.f(this, "tools_red_dot_show_in_158", true) && pdf.pdfreader.viewer.editor.free.utils.q0.J(this)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                pdf.pdfreader.viewer.editor.free.utils.q0.w(this, "tools_red_dot_show_in_158", false);
                            }
                            this.f26276w1.setMode(PDFReaderView.Mode.AdjustText);
                            b0 b0Var2 = this.f26276w1;
                            if (b0Var2 != null && b0Var2.getOnTextParamChangedListener() == null) {
                                this.f26276w1.setOnTextParamChangedListener(new i2(this));
                            }
                            this.f26276w1.post(new h2(this));
                        }
                        SignCreateView signCreateView = this.f26249s0;
                        if (signCreateView != null) {
                            signCreateView.setVisibility(8);
                        }
                        h(getString(R.string.arg_res_0x7f130031));
                        this.f26168d2.setSelected(false);
                        this.f26173e2.setSelected(true);
                        this.f26178f2.setSelected(false);
                        h4(false);
                        b5();
                    }
                } else if (this.f26277w2) {
                    return;
                } else {
                    if (this.L == PDFTextEditorMode.ADD_TEXT) {
                        this.f26296z1 = TopBarMode.Annot;
                        this.A1 = null;
                        b0 b0Var3 = this.f26276w1;
                        if (b0Var3 != null) {
                            b0Var3.setMode(PDFReaderView.Mode.Viewing);
                        }
                    }
                    ReaderPDFCore readerPDFCore = this.f26256t1;
                    if (readerPDFCore != null) {
                        readerPDFCore.startTextExecutor();
                    }
                    b0 b0Var4 = this.f26276w1;
                    if (b0Var4 != null) {
                        b0Var4.setCanSelectDelete(false);
                        this.f26276w1.setEditorMode(true);
                        this.f26276w1.setMode(PDFReaderView.Mode.Editor);
                    }
                    b0 b0Var5 = this.f26276w1;
                    if (b0Var5 != null && b0Var5.getOnTextParamChangedListener() == null) {
                        this.f26276w1.setOnTextParamChangedListener(new i2(this));
                    }
                    ViewStub viewStub = this.S1;
                    if (viewStub != null) {
                        kl.i.b(viewStub);
                    }
                    EditorView editorView = this.f26230o2;
                    if (editorView != null) {
                        editorView.setVisibility(0);
                    }
                    if (this.f26279w4) {
                        tn.a.d(this, ea.a.p("VmQidCxwBmY=", "NQNC0rBP"), ea.a.p("VmQidCxwBmYtc1xvdw==", "8ym5w3SQ"), ea.a.p("GG8XYWw=", "x9lcHhYt"), false);
                        if (!TextUtils.isEmpty(this.f26229o1)) {
                            tn.a.d(this, ea.a.p("VmQidCxwBmY=", "2zyEeSoN"), ea.a.p("VmQidCxwBmYtc1xvdw==", "U0SgvlaD"), this.f26229o1, false);
                        }
                        this.f26279w4 = false;
                    }
                    this.f26168d2.setSelected(true);
                    this.f26173e2.setSelected(false);
                    this.f26178f2.setSelected(false);
                    b5();
                }
            } else {
                PDFTextEditorMode pDFTextEditorMode2 = this.L;
                if (pDFTextEditorMode2 == PDFTextEditorMode.TEXT_AND_IMG) {
                    Y2();
                } else if (pDFTextEditorMode2 == PDFTextEditorMode.ADD_TEXT) {
                    this.f26296z1 = TopBarMode.Annot;
                    this.A1 = null;
                    b0 b0Var6 = this.f26276w1;
                    if (b0Var6 != null) {
                        b0Var6.setMode(PDFReaderView.Mode.Viewing);
                    }
                }
                this.f26168d2.setSelected(false);
                this.f26173e2.setSelected(false);
                this.f26178f2.setSelected(false);
            }
            this.L = pDFTextEditorMode;
        }
    }

    public final void u3() {
        ProgressView progressView = this.T3;
        if (progressView != null) {
            progressView.setVisibility(8);
            this.T3.d();
        }
    }

    public final void u4(boolean z10) {
        if (z10) {
            if (i.a.f21508a.f21507d && a.C0318a.f23099a.a(this.B2) > 1) {
                K2();
                return;
            }
            ImageView imageView = this.f26187h0;
            if (imageView != null) {
                imageView.setEnabled(false);
            }
            ImageView imageView2 = this.f26182g0;
            if (imageView2 != null) {
                imageView2.setEnabled(false);
                return;
            }
            return;
        }
        ImageView imageView3 = this.f26187h0;
        if (imageView3 != null) {
            imageView3.setEnabled(false);
        }
        ImageView imageView4 = this.f26182g0;
        if (imageView4 != null) {
            imageView4.setEnabled(false);
        }
    }

    public final void v2() {
        boolean z10;
        int i10;
        ViewStub viewStub;
        boolean z11;
        boolean z12;
        this.T5.clear();
        AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
        AppCoreFilterEvent.a(ea.a.p("PGQ_Xw9kGHQXdRVl", "ACLYjqpB"), ea.a.p("Q2QtXxZkC3Qtc1xvdw==", "rJulHMSR"));
        AppCoreFilterEvent.h(ea.a.p("Q2QtXxZkC3Qtc1xvdw==", "3D0DcF3S"));
        this.J = true;
        this.f26219m3 = true;
        x4();
        LottieAnimationView lottieAnimationView = this.f26264u3;
        if (lottieAnimationView != null) {
            lottieAnimationView.setAnimation(R.raw.arrowtoclose);
            this.f26264u3.setFrame(0);
        }
        ConstraintLayout constraintLayout = this.f26298z3;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
        Space space = this.f26236p2;
        if (space != null) {
            space.setVisibility(0);
            Space space2 = this.f26236p2;
            kotlin.jvm.internal.g.e(space2, "<this>");
            ViewGroup.LayoutParams layoutParams = space2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = 0;
                space2.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        View view = this.f26271v3;
        if (view != null) {
            view.setVisibility(0);
        }
        K3(false);
        m3();
        PDFScrollHandle pDFScrollHandle = this.f26258t3;
        if (pDFScrollHandle != null) {
            pDFScrollHandle.setVisibility(8);
            this.f26258t3.setForceDismiss(true);
        }
        View view2 = this.f26241q2;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        ea.a.p("LW4HbB1jPDpoZQJpdA==", "g9BDtW4c");
        String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        EditText editText = this.D1;
        if (editText != null) {
            editText.setVisibility(8);
        }
        AppCompatImageView appCompatImageView = this.B;
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(8);
        }
        s4(8);
        Y3();
        t3();
        this.f26296z1 = TopBarMode.Annot;
        p3();
        if (pdf.pdfreader.viewer.editor.free.utils.q0.g(this, 83, "preview_edit_mode_guide_show_in_170")) {
            pdf.pdfreader.viewer.editor.free.utils.q0.w(this, "preview_edit_mode_guide_show_in_170", false);
        }
        if (pdf.pdfreader.viewer.editor.free.utils.q0.f(this, "is_need_show_add_text_guide_in_158", true) && pdf.pdfreader.viewer.editor.free.utils.q0.J(this)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            pdf.pdfreader.viewer.editor.free.utils.q0.w(this, "is_need_show_add_text_guide_in_158", false);
        }
        fn.c.c.getClass();
        if (pdf.pdfreader.viewer.editor.free.utils.q0.f(this, ea.a.p("WnMUcxtvFV8CclF2AGUhXzRkVF8zcyZfDWRbdB5yL2dGaS9lLGkMX0M3MA==", "h2qpSGhe"), true)) {
            A4();
            pdf.pdfreader.viewer.editor.free.utils.q0.w(this, ea.a.p("WnMUcxtvFV8CclF2AGUhXzRkVF8zcyZfAWQzdFxyCWdGaS9lLGkMX0M3MA==", "dZ3VCE0y"), false);
        } else {
            v4();
        }
        int i11 = this.K;
        if (i11 == 4) {
            if (pdf.pdfreader.viewer.editor.free.utils.q0.s(this)) {
                pdf.pdfreader.viewer.editor.free.utils.q0.w(this, "sign_update_red_dot_in_160", false);
            }
            R4();
            n4();
            SignCreateView signCreateView = this.f26249s0;
            if (signCreateView != null) {
                signCreateView.setVisibility(0);
            }
            if (BillingConfigImpl.c.w()) {
                ImageView imageView = this.f26255t0;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            } else {
                ImageView imageView2 = this.f26255t0;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
            }
            l4(this.C3);
        } else if (i11 == 2) {
            ImageView imageView3 = this.f26255t0;
            if (imageView3 != null) {
                imageView3.setVisibility(8);
            }
            if (this.f26152a2 == null && (viewStub = this.P1) != null) {
                kl.i.b(viewStub);
            }
            View view3 = this.f26152a2;
            if (view3 != null) {
                ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                layoutParams2.height = getResources().getDimensionPixelSize(R.dimen.bottom_edit_mode_layout_height);
                this.f26152a2.setLayoutParams(layoutParams2);
                this.f26152a2.setVisibility(0);
            }
            l4(this.A3);
            u2(this.L);
            if (c.a.c(this)) {
                c.a.d(this);
            }
        } else {
            ImageView imageView4 = this.f26255t0;
            if (imageView4 != null) {
                imageView4.setVisibility(8);
            }
            synchronized (this.f26164c3) {
                if (this.f26151a0 != null) {
                    this.f26158b3.set(false);
                    if (this.f26151a0.booleanValue()) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    N3(i10);
                }
            }
            FrameLayout frameLayout = this.T;
            if (frameLayout != null) {
                ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
                layoutParams3.height = getResources().getDimensionPixelSize(R.dimen.bottom_annotate_edit_layout_height);
                this.T.setLayoutParams(layoutParams3);
                this.T.setVisibility(0);
            }
            if (this.K == 3) {
                this.R4 = true;
                LinearLayout linearLayout = this.J3;
                if (linearLayout != null) {
                    linearLayout.performClick();
                }
                tn.a.d(this, ea.a.p("Um4lbwdhFmU=", "N9YZzaEf"), ea.a.p("KW5Ybx1nNmEuZg90XV80bFFjaw==", "vIH6BDbW"), ea.a.p("R28_YWw=", "g48KskLa"), false);
                tn.a.d(this, ea.a.p("Lm5fbw1hQ2U=", "u3iZFiys"), ea.a.p("Um4lbyxnEGEUZl10AF81bC1jaw==", "C8QMae6c"), ea.a.p("RWkudwNvEnVw", "P4zNVISa"), false);
            }
            l4(this.B3);
        }
        b0 b0Var = this.f26276w1;
        if (b0Var != null) {
            if (this.K != 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            b0Var.setCanSelectDelete(z11);
            b0 b0Var2 = this.f26276w1;
            if (this.K != 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            b0Var2.setEditorMode(z12);
            this.f26276w1.setAddTextMode(true);
            this.f26276w1.u0(false);
        }
        v4();
    }

    public final void v3() {
        SignColorBottomSheetView signColorBottomSheetView = this.f26275w0;
        if (signColorBottomSheetView != null) {
            signColorBottomSheetView.C();
        }
        SignSizeBottomSheetView signSizeBottomSheetView = this.f26268v0;
        if (signSizeBottomSheetView != null) {
            signSizeBottomSheetView.C();
        }
    }

    public final void v4() {
        if (pdf.pdfreader.viewer.editor.free.utils.extension.a.b(this)) {
            return;
        }
        fn.c.c.getClass();
        if (pdf.pdfreader.viewer.editor.free.utils.q0.g(this, 83, ea.a.p("WnMUcxtvFV8CclF2AGUhXyVkVl8yZTt0KG0VditfEXVaZC5fGm49MUUw", "wzNvbX08"))) {
            Handler handler = this.D;
            t1 t1Var = this.S4;
            handler.removeCallbacks(t1Var);
            handler.postDelayed(t1Var, 500L);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a.d
    public final void w(boolean z10) {
        if (!z10) {
            Z2();
        }
    }

    public final void w2() {
        for (Map.Entry<Integer, ArrayList<ij.a>> entry : lib.zj.pdfeditor.a.f21462a.entrySet()) {
            int intValue = entry.getKey().intValue();
            b0 b0Var = this.f26276w1;
            if (b0Var != null) {
                ea.a.p("A2FfUBhnUkM7billbA==", "gk6QTQYu");
                String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                ((PDFPageView) b0Var.E(intValue)).q1();
            }
        }
        lib.zj.pdfeditor.a.a();
        synchronized (lib.zj.pdfeditor.a.class) {
            lib.zj.pdfeditor.a.f21463b.clear();
        }
        o4();
    }

    public final void w3(boolean z10) {
        RelativeLayout relativeLayout = this.P;
        if (relativeLayout == null) {
            return;
        }
        this.f26195i3 = relativeLayout.getHeight();
        ValueAnimator valueAnimator = this.f26225n3;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f26225n3.cancel();
        }
        if (this.f26225n3 == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f26225n3 = ofFloat;
            ofFloat.addUpdateListener(new z0());
            this.f26225n3.addListener(new a1(z10));
            this.f26225n3.setInterpolator(new LinearInterpolator());
            this.f26225n3.setDuration(250L);
        }
        if (z10) {
            this.f26225n3.start();
        } else {
            this.f26225n3.reverse();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w4() {
        /*
            r4 = this;
            java.lang.String r0 = "Si0UczFvE0Esc0stGS16LS0="
            java.lang.String r1 = "NNg9Ydws"
            ea.a.p(r0, r1)
            java.lang.String r0 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a
            pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl r0 = pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl.c
            boolean r0 = r0.w()
            if (r0 == 0) goto L22
            java.lang.String r0 = "Q3IubRp1DyAHc1FyRSAlay1wEnA0ZTVpCHcvdT9scmQTcyNvdw=="
            java.lang.String r1 = "miS30Jea"
            java.lang.String r0 = ea.a.p(r0, r1)
            int r1 = zk.a.f32399a
            pdf.pdfreader.viewer.editor.free.utils.t1.b(r0)
            r4.Z2()
            return
        L22:
            boolean r0 = eo.d.b(r4)
            if (r0 != 0) goto L70
            boolean r0 = pdf.pdfreader.viewer.editor.free.utils.extension.c.g(r4)
            r1 = 0
            if (r0 != 0) goto L30
            goto L49
        L30:
            boolean r0 = pdf.pdfreader.viewer.editor.free.utils.q0.e(r4)
            if (r0 == 0) goto L37
            goto L49
        L37:
            long r2 = eo.e.e(r4)
            boolean r0 = eo.e.l(r4)
            if (r0 != 0) goto L49
            boolean r0 = pdf.pdfreader.viewer.editor.free.utils.i1.a(r2)
            if (r0 != 0) goto L49
            r0 = 1
            goto L4a
        L49:
            r0 = r1
        L4a:
            if (r0 != 0) goto L70
            boolean r0 = pdf.pdfreader.viewer.editor.free.utils.AdUtils.b(r4)
            if (r0 == 0) goto L70
            tf.c r0 = pdf.pdfreader.viewer.editor.free.ads.FullScreenManage.f23914a
            r0 = 3
            boolean r0 = pdf.pdfreader.viewer.editor.free.ads.FullScreenManage.c(r0, r4, r1)
            if (r0 == 0) goto L70
            java.lang.String r0 = "Hi1mcxtvFUEWcxktSWw5YSBpXGcHZDBGEG5Zcw0xfDEeLWYtLQ=="
            java.lang.String r1 = "y0eMIVFe"
            ea.a.p(r0, r1)
            pdf.pdfreader.viewer.editor.free.ads.g r0 = pdf.pdfreader.viewer.editor.free.ads.g.m()
            pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity$m1 r1 = new pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity$m1
            r1.<init>()
            r0.k(r4, r1)
            goto L73
        L70:
            r4.Z2()
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity.w4():void");
    }

    @Override // lib.zj.pdfeditor.d
    public final void x() {
        C4(ea.a.p("IW9FIAp1R3A1cnQ=", "GWTfbA4B"));
    }

    public final void x2(int i10) {
        ea.a.p("UmQvVBZ4dA==", "G84vS2hN");
        ea.a.p("Yi0cLVQtVG82bzg9", "psbGlxmC");
        String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        AddTextChangeColorBottomSheetView addTextChangeColorBottomSheetView = this.f26285x3;
        if (addTextChangeColorBottomSheetView != null) {
            int childCount = ((am.z1) addTextChangeColorBottomSheetView.f28172y).c.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = ((am.z1) addTextChangeColorBottomSheetView.f28172y).c.getChildAt(i11);
                if (childAt instanceof AddTextColorView) {
                    AddTextColorView addTextColorView = (AddTextColorView) childAt;
                    if (addTextColorView.f28165h) {
                        addTextColorView.setColorChecked(false);
                    }
                    if (addTextColorView.getCenterColor() == i10) {
                        addTextColorView.setColorChecked(true);
                    }
                }
            }
            AddTextChangeColorBottomSheetView.b bVar = addTextChangeColorBottomSheetView.B;
            if (bVar != null) {
                ((ao.u0) bVar).a(i10, false);
            }
        }
    }

    public final void x3() {
        this.f26189h3.addUpdateListener(new e1(getResources().getDimensionPixelSize(R.dimen.dp_55)));
        this.f26189h3.addListener(new f1());
        this.f26189h3.setInterpolator(new LinearInterpolator());
        this.f26189h3.setDuration(200L);
    }

    public final void x4() {
        ViewGroup viewGroup;
        if (this.P != null && this.Z3 != null && (viewGroup = this.X3) != null && !this.f26289y1) {
            if (!this.M) {
                viewGroup.setVisibility(0);
            }
            if (this.f26184g3 == null) {
                this.f26184g3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                A3();
            }
            if (this.f26189h3 == null) {
                this.f26189h3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                x3();
            }
            ValueAnimator valueAnimator = this.f26184g3;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                return;
            }
            ValueAnimator valueAnimator2 = this.f26189h3;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                return;
            }
            if (getRequestedOrientation() == 1 && !pdf.pdfreader.viewer.editor.free.utils.a0.i(this)) {
                if (this.f26213l3 == null) {
                    this.f26213l3 = a3();
                }
            } else {
                this.f26213l3 = null;
            }
            this.f26195i3 = this.P.getHeight();
            this.f26201j3 = getResources().getDimensionPixelSize(R.dimen.dp_90);
            this.f26289y1 = true;
            this.f26184g3.reverse();
            this.f26189h3.reverse();
        }
    }

    public final void y2() {
        Window window;
        ViewGroup viewGroup;
        final int i10;
        int measuredHeight;
        int measuredHeight2;
        if (pdf.pdfreader.viewer.editor.free.utils.extension.a.b(this) || (window = getWindow()) == null) {
            return;
        }
        View decorView = window.getDecorView();
        WeakHashMap<View, x0.n0> weakHashMap = x0.f0.f31435a;
        x0.s0 a10 = f0.j.a(decorView);
        if (a10 == null) {
            return;
        }
        o0.b a11 = a10.a(7);
        o0.b a12 = a10.a(8);
        if (this.J && this.f26157b2 != null && (viewGroup = this.V3) != null && this.f26298z3 != null && this.f26236p2 != null) {
            int i11 = a12.f22641d;
            if (i11 > 0) {
                if (this.f19294h) {
                    measuredHeight = i11 - viewGroup.getMeasuredHeight();
                    measuredHeight2 = this.f26298z3.getMeasuredHeight();
                } else {
                    measuredHeight = (i11 - a11.f22641d) - viewGroup.getMeasuredHeight();
                    measuredHeight2 = this.f26298z3.getMeasuredHeight();
                }
                i10 = measuredHeight - measuredHeight2;
            } else {
                i10 = 0;
            }
            if (i10 != this.f26236p2.getHeight()) {
                com.google.android.play.core.assetpacks.c.V(this.f26236p2, new cg.l() { // from class: ao.e
                    @Override // cg.l
                    public final Object invoke(Object obj) {
                        ExecutorService executorService = ReaderPreviewActivity.U5;
                        ((ViewGroup.LayoutParams) obj).height = i10;
                        return null;
                    }
                });
            }
        }
    }

    public final void y3() {
        PdfPreviewEntity pdfPreviewEntity;
        if (this.f26250s1 == null && (pdfPreviewEntity = this.f26245r1) != null) {
            this.f26250s1 = com.google.android.play.core.assetpacks.c.w(pdfPreviewEntity);
        }
    }

    public final void y4() {
        this.D.post(new o());
    }

    @Override // qg.i
    public final void z0(boolean z10) {
        runOnUiThread(new qb.i1(this, z10, 1));
    }

    public final void z2(Boolean bool, boolean z10) {
        int i10;
        AppCompatImageView appCompatImageView = this.Q3;
        if (appCompatImageView != null) {
            appCompatImageView.setEnabled(z10);
            if (bool != null && bool.booleanValue()) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            if (this.Q3.getVisibility() != i10) {
                if (bool != null && bool.booleanValue()) {
                    tn.a.b(this, ea.a.p("XGQZdAhyZQ==", "169pW7Ee"), ea.a.p("VmQidCxyB2MddlFyNnM-b3c=", "D7Ti07Yn"));
                } else {
                    this.f26292y4.clear();
                }
            }
            this.Q3.setVisibility(i10);
        }
    }

    public final void z3(Bundle bundle) {
        long j10;
        int i10;
        T4();
        a2.f26307a = -1L;
        a2.f26308b = false;
        this.C = new pdf.pdfreader.viewer.editor.free.utils.g1<>(this);
        this.E = new ReaderActBroadCastReceiver<>(this);
        p1.a.a(this).b(this.E, new IntentFilter(ea.a.p("KkNjST5OLEUQVDRBd1QIVGBUDUUHRA==", "QNk7qsee")));
        this.H1 = new AlertDialog.Builder(this);
        b.b.Z(this);
        ea.a.p("XG4IchZhFmUBYUJlDUk4czBhXGMjUzdhI2VtPVh1OGwJIA==", "WP6TDB40");
        String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        String str2 = "";
        if (bundle != null) {
            this.f26245r1 = (PdfPreviewEntity) bundle.getSerializable(ea.a.p("Km5FaQ15", "jzDOKtus"));
            this.J = bundle.getBoolean(ea.a.p("JnN0bg1lRUU-aT5NGmRl", "2CzlFBJX"));
            this.K = bundle.getInt(ea.a.p("MG5GZRBFMGk8VB9wZQ==", "OMU2bT9u"));
            this.Q = (Uri) bundle.getParcelable(ea.a.p("RnJp", "DjxV0h13"));
            this.W = bundle.getString(ea.a.p("P2FCcw5vRWQ=", "4y3spNzg"), "");
            j10 = bundle.getLong(ea.a.p("QWUqZCdpD2U=", "m2p5LKKM"));
            this.M = bundle.getBoolean(ea.a.p("WnMObgdlEFIXZlhvHk05ZGU=", "5FS0nukW"));
            if (bundle.containsKey(ea.a.p("dWknZT1hD2U=", "RquPH4rS"))) {
                this.f26262u1 = bundle.getString(ea.a.p("DGk2ZT5hXmU=", "bqJZp3y6"));
            }
        } else {
            j10 = 0;
        }
        this.f26297z2 = new wn.c(j10);
        androidx.lifecycle.w<ArrayList<PdfPreviewEntity>> wVar = wn.b.f31386a;
        wn.b.a(false, B3());
        oj.e.f23109g = pdf.pdfreader.viewer.editor.free.utils.c1.B();
        ea.a.p("Nm57cjJhPGVyIA==", "xLY8WHHp");
        if (this.f26256t1 == null) {
            Intent intent = getIntent();
            if (ea.a.p("Um4vchxpBi4bbkBlB3R4YSd0W28oLhVJIFc=", "ev01uHh7").equals(intent.getAction())) {
                if (intent.getBooleanExtra(ea.a.p("WnMFbwdpBGkRYUBpBm4=", "eCdWSX7X"), false)) {
                    U1();
                    String stringExtra = intent.getStringExtra(ea.a.p("VWknZSNhFmg=", "U4HDBDla"));
                    this.f26245r1 = new PdfPreviewEntity(new File(stringExtra));
                    if (!TextUtils.isEmpty(stringExtra)) {
                        pdf.pdfreader.viewer.editor.free.utils.t0.V().execute(new androidx.fragment.app.g(22, this, stringExtra));
                    }
                } else {
                    this.f26245r1 = (PdfPreviewEntity) intent.getSerializableExtra(ea.a.p("QGgkdyxwBmY=", "Eaisf7U1"));
                }
                y3();
                nl.b bVar = this.f26250s1;
                if (bVar != null && (i10 = bVar.f22593n) != -1) {
                    yn.a.h0(this, i10);
                    this.f26250s1.f22593n = -1;
                    this.f26245r1.setSize(new File(this.f26250s1.f22582b).length());
                    this.f26245r1.setRecent(1);
                    this.f26245r1.setRecentDate(System.currentTimeMillis());
                }
                ea.a.p("XG4IchZhFmVIIN2H5ObAsKG-peXOsCZuAmkEeQ==", "vp5OyYTv");
                String stringExtra2 = intent.getStringExtra(ea.a.p("P2FCcw5vRWQ=", "c6JbIcs6"));
                this.W = stringExtra2;
                if (stringExtra2 == null) {
                    this.W = "";
                }
                this.J = intent.getBooleanExtra(ea.a.p("KmRYdA==", "mLhpCy6X"), false);
                int intExtra = intent.getIntExtra(ea.a.p("C2RbdCV5QWU=", "nOn2q1z2"), 0);
                this.K = intExtra;
                if (this.J) {
                    if (intExtra == 2) {
                        this.L = PDFTextEditorMode.ADD_TEXT;
                    } else if (intExtra == 5) {
                        this.K = 2;
                        this.L = PDFTextEditorMode.TEXT_AND_IMG;
                    } else if (intExtra == 0) {
                        this.K = pdf.pdfreader.viewer.editor.free.utils.q0.l(this, 2, "pdf_edit_type_in_158");
                    }
                }
                boolean z10 = this.J;
                this.N = z10;
                if (z10) {
                    this.f26219m3 = true;
                    String stringExtra3 = getIntent().getStringExtra(ea.a.p("VXIkbQ==", "gKWtB45L"));
                    if (TextUtils.equals(stringExtra3, ea.a.p("CVJ-TSZUeE8WUw==", "RCsEFJpY"))) {
                        this.f26169d3 = ea.a.p("O29ebHM=", "Icx4rYh2");
                        this.f26223n1 = ea.a.p("R28kbHM=", "ign0gkv2");
                        this.f26229o1 = ea.a.p("O29ebHM=", "eRhWmWQr");
                        this.f26174e3 = ea.a.p("G29ebHM=", "yRGIfD2w");
                    } else if (!TextUtils.equals(stringExtra3, ea.a.p("dVIETSxMK1MmX3lPO0U=", "caNhDULa")) && !TextUtils.equals(stringExtra3, ea.a.p("CVJ-TSZTckEIQ0g=", "4BitZ12m"))) {
                        if (TextUtils.equals(stringExtra3, ea.a.p("dVIETSxDLU4kRWZUNlITUxFMVA==", "ZYDnyOal"))) {
                            this.f26174e3 = ea.a.p("UWEoaw==", "72Ffc425");
                            this.f26223n1 = ea.a.p("MGEGaw==", "DvReHKQn");
                            this.f26169d3 = ea.a.p("M2Eraw==", "6fQHlDHK");
                        } else if (TextUtils.equals(stringExtra3, ea.a.p("CVJ-TSZIeE0fXw9EPFQ3R2BJKkU=", "pspxLKIs"))) {
                            this.f26229o1 = ea.a.p("W28mZRR1C2Rl", "dGX50KBL");
                        }
                    } else {
                        this.f26169d3 = ea.a.p("Im9DZQ==", "C6RI2PKc");
                        this.f26223n1 = ea.a.p("I2lCdBRvRWU=", "sF3fuRmz");
                        this.f26229o1 = ea.a.p("X2k4dB5vEGU=", "0RAxKfRc");
                    }
                }
                if (this.Q == null) {
                    this.Q = intent.getData();
                }
                Uri uri = this.Q;
                if (uri != null && (str2 = Uri.decode(uri.getEncodedPath())) == null) {
                    pdf.pdfreader.viewer.editor.free.utils.t1.b(ea.a.p("FnIRdihlIiA4YRJoFHA2dFAgbz1pbkNsbA==", "IQftAU7e"));
                    str2 = this.Q.toString();
                }
                lib.zj.pdfeditor.q0.f21567d = null;
                this.f26246r2 = str2;
                String p10 = pdf.pdfreader.viewer.editor.free.utils.v.p(str2);
                this.f26269v1 = p10;
                this.f26262u1 = pdf.pdfreader.viewer.editor.free.utils.v.r(p10);
                ReaderPdfApplication.k().f28148e.f(this.f26270v2);
                pdf.pdfreader.viewer.editor.free.utils.t1.b(ea.a.p("XkYibBZOA20XV110AUUudDo=", "B7WbARDS") + this.f26269v1 + ea.a.p("byBcRhBsUk47bS86", "nMmzFvgb") + this.f26262u1);
                dp.a.a().getClass();
                dp.a.c(ea.a.p("IkZYbBxOVm0_VyN0HUUQdDo=", "M1mfBbR8") + this.f26269v1 + ea.a.p("EyAmRhpsB04TbVE6", "JU5O5sI7") + this.f26262u1);
                pdf.pdfreader.viewer.editor.free.utils.t0.V().execute(new pdf.pdfreader.viewer.editor.free.pdfview.j(this, str2, bundle));
            } else {
                ea.a.p("XG4IchZhFmVIIFVjHWk5bqC4v-berzVpAHc=", "eBTMS5AR");
            }
            ea.a.p("IG5ychxhQ2VgIA==", "z1JyrhkL");
            return;
        }
        ea.a.p("XG4IchZhFmVSZVpkUyA=", "ToohqSQW");
        F3(bundle);
    }

    public final void z4(boolean z10) {
        x2 x2Var = this.f26274w;
        if (x2Var == null || !x2Var.isShowing()) {
            x2 x2Var2 = new x2(this, ea.a.p("VmQidA==", "3ShqF1qa"), z10);
            this.f26274w = x2Var2;
            x2Var2.f23542t = new r();
            W1(this.f26274w);
        }
    }

    /* loaded from: classes3.dex */
    public class c0 implements mj.b0 {
        public c0() {
        }

        @Override // mj.b0
        public final void B() {
            String p10 = ea.a.p("KmQudC1wMGYXZBRhZw==", "7IOGrTFw");
            ExecutorService executorService = ReaderPreviewActivity.U5;
            ReaderPreviewActivity.this.Z4(p10);
            b.a aVar = gn.b.f17937a;
            String p11 = ea.a.p("VmQ_XxdyA2c=", "Rjb01KK7");
            aVar.getClass();
            gn.b.c.add(p11);
        }

        @Override // mj.b0
        public final void C() {
            String p10 = ea.a.p("KmRYdCZwU2YFdC94AWIHeGpzGnIgdAZoB2MOaRNr", "dZ2MXbp3");
            ExecutorService executorService = ReaderPreviewActivity.U5;
            ReaderPreviewActivity.this.Z4(p10);
            b.a aVar = gn.b.f17937a;
            String p11 = ea.a.p("KmRFXwp0RWUuY2g=", "6Z4rpsxL");
            aVar.getClass();
            gn.b.c.add(p11);
        }

        @Override // mj.b0
        public final void F() {
            String p10 = ea.a.p("VmQidCxwBmYtdFF4HWI5eBtkV2wjdCZfMmxfY2s=", "Q6p22s5K");
            ExecutorService executorService = ReaderPreviewActivity.U5;
            ReaderPreviewActivity.this.Z4(p10);
            b.a aVar = gn.b.f17937a;
            String p11 = ea.a.p("VmQ_XxdlbA==", "LaSJ8HUH");
            aVar.getClass();
            gn.b.c.add(p11);
        }

        @Override // mj.b0
        public final void a(RectF rectF) {
            String p10 = ea.a.p("VmQidCxwBmYtZltjHHMJdCF4RmIpeA==", "caQjtokt");
            ExecutorService executorService = ReaderPreviewActivity.U5;
            ReaderPreviewActivity.this.Z4(p10);
        }

        @Override // mj.b0
        public final void c(ReaderPDFCore.SelectInfo selectInfo) {
            boolean z10;
            ea.a.p("YWUqZBZyMnIXdl1lHkE1dC12W3R5", "hqYaKeCH");
            ea.a.p("QWUtchZzClQXeEBTHXk6ZWRzV2wjYzdJN2Y_IEkxZCA=", "YPxYVSA0");
            Objects.toString(selectInfo);
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            if (readerPreviewActivity.f26157b2 != null) {
                AppCompatImageView appCompatImageView = readerPreviewActivity.f26188h2;
                if (appCompatImageView != null) {
                    appCompatImageView.setSelected(selectInfo.bold);
                }
                AppCompatImageView appCompatImageView2 = readerPreviewActivity.f26194i2;
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setSelected(selectInfo.italic);
                }
                AppCompatImageView appCompatImageView3 = readerPreviewActivity.f26200j2;
                if (appCompatImageView3 != null) {
                    appCompatImageView3.setSelected(selectInfo.underline);
                }
                int i10 = selectInfo.colorWithAlpha;
                boolean z11 = false;
                if (i10 == -1) {
                    AddTextColorView addTextColorView = readerPreviewActivity.f26224n2;
                    if (addTextColorView != null) {
                        addTextColorView.c(i10, androidx.core.content.a.getColor(readerPreviewActivity, R.color.color_20_black_100_white), 0);
                    }
                } else {
                    if (i10 == 0) {
                        i10 = -16777216;
                    }
                    AddTextColorView addTextColorView2 = readerPreviewActivity.f26224n2;
                    if (addTextColorView2 != null) {
                        addTextColorView2.c(i10, i10, 0);
                    }
                }
                AppCompatImageView appCompatImageView4 = readerPreviewActivity.f26206k2;
                if (appCompatImageView4 != null) {
                    if (selectInfo.maxSize > 5.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    appCompatImageView4.setEnabled(z10);
                }
                AppCompatImageView appCompatImageView5 = readerPreviewActivity.f26212l2;
                if (appCompatImageView5 != null) {
                    if (selectInfo.minSize < 50.0f) {
                        z11 = true;
                    }
                    appCompatImageView5.setEnabled(z11);
                }
            }
            int i11 = selectInfo.colorWithAlpha;
            readerPreviewActivity.f26257t2 = i11;
            TextEditorChangeColorBottomSheetView textEditorChangeColorBottomSheetView = readerPreviewActivity.f26291y3;
            if (textEditorChangeColorBottomSheetView != null) {
                textEditorChangeColorBottomSheetView.J(i11);
            }
        }

        @Override // mj.b0
        public final void d() {
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            if (pdf.pdfreader.viewer.editor.free.utils.extension.a.c(readerPreviewActivity)) {
                readerPreviewActivity.h(readerPreviewActivity.getResources().getString(R.string.arg_res_0x7f1304d0));
            }
        }

        @Override // mj.b0
        public final void h() {
            String p10 = ea.a.p("VmQidCxwBmYtdFF4HWI5eBtlVmkyXyBsKmNr", "C5uHcnp9");
            ExecutorService executorService = ReaderPreviewActivity.U5;
            ReaderPreviewActivity.this.Z4(p10);
        }

        @Override // mj.b0
        public final void i() {
            String p10 = ea.a.p("VmQidCxwBmYtaVlnNmQzbCF0V18lbCpjaw==", "DJvMZ0tM");
            ExecutorService executorService = ReaderPreviewActivity.U5;
            ReaderPreviewActivity.this.Z4(p10);
            b.a aVar = gn.b.f17937a;
            String p11 = ea.a.p("KmRFXx1lbA==", "DJAXDVAN");
            aVar.getClass();
            gn.b.c.add(p11);
        }

        @Override // mj.b0
        public final void k(ReaderPDFCore.FontInfo fontInfo) {
            boolean z10;
            ea.a.p("J2U1ZC9yFnItdg9lQ0E0dFF2O3R5", "qUuTJF6U");
            ea.a.p("PWVXchxzX1Q_eD5TAXkEZRVmAW4xSQtmNSBeIA==", "gJioZcRj");
            Objects.toString(fontInfo);
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            if (readerPreviewActivity.f26157b2 != null) {
                AppCompatImageView appCompatImageView = readerPreviewActivity.f26188h2;
                if (appCompatImageView != null) {
                    appCompatImageView.setSelected(fontInfo.bold);
                }
                AppCompatImageView appCompatImageView2 = readerPreviewActivity.f26194i2;
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setSelected(fontInfo.italic);
                }
                AppCompatImageView appCompatImageView3 = readerPreviewActivity.f26200j2;
                if (appCompatImageView3 != null) {
                    appCompatImageView3.setSelected(fontInfo.underline);
                }
                int i10 = fontInfo.colorWithAlpha;
                boolean z11 = false;
                if (i10 == -1) {
                    AddTextColorView addTextColorView = readerPreviewActivity.f26224n2;
                    if (addTextColorView != null) {
                        addTextColorView.c(i10, androidx.core.content.a.getColor(readerPreviewActivity, R.color.color_20_black_100_white), 0);
                    }
                } else {
                    if (i10 == 0) {
                        i10 = -16777216;
                    }
                    AddTextColorView addTextColorView2 = readerPreviewActivity.f26224n2;
                    if (addTextColorView2 != null) {
                        addTextColorView2.c(i10, i10, 0);
                    }
                }
                AppCompatImageView appCompatImageView4 = readerPreviewActivity.f26206k2;
                if (appCompatImageView4 != null) {
                    if (fontInfo.size > 5) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    appCompatImageView4.setEnabled(z10);
                }
                AppCompatImageView appCompatImageView5 = readerPreviewActivity.f26212l2;
                if (appCompatImageView5 != null) {
                    if (fontInfo.size < 50) {
                        z11 = true;
                    }
                    appCompatImageView5.setEnabled(z11);
                }
            }
            int i11 = fontInfo.colorWithAlpha;
            readerPreviewActivity.f26257t2 = i11;
            TextEditorChangeColorBottomSheetView textEditorChangeColorBottomSheetView = readerPreviewActivity.f26291y3;
            if (textEditorChangeColorBottomSheetView != null) {
                textEditorChangeColorBottomSheetView.J(i11);
            }
        }

        @Override // mj.b0
        public final void q() {
            String p10 = ea.a.p("VmQidCxwBmYtdFF4HWI5eBtkXXUkbCZfUmw6Y2s=", "1S078ceE");
            ExecutorService executorService = ReaderPreviewActivity.U5;
            ReaderPreviewActivity.this.Z4(p10);
        }

        @Override // mj.b0
        public final void s(TextEditorState textEditorState) {
            ea.a.p("HWVQZBxyZ3I_diNlAkELdFx2B3R5", "llgCVbLw");
            ea.a.p("IG50ZBB0WHIJdCt0EEMAYVtnC2RlcxFhMGVPPSA=", "kP1gDoXB");
            Objects.toString(textEditorState);
            int i10 = s.f26386e[textEditorState.ordinal()];
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3 || i10 == 4 || i10 == 5) {
                    ViewStub viewStub = readerPreviewActivity.Q1;
                    if (viewStub != null) {
                        kl.i.b(viewStub);
                    }
                    readerPreviewActivity.G4(false);
                    return;
                }
                return;
            }
            if (readerPreviewActivity.f26157b2 != null) {
                AppCompatImageView appCompatImageView = readerPreviewActivity.f26188h2;
                if (appCompatImageView != null) {
                    appCompatImageView.setSelected(false);
                }
                AppCompatImageView appCompatImageView2 = readerPreviewActivity.f26194i2;
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setSelected(false);
                }
                AppCompatImageView appCompatImageView3 = readerPreviewActivity.f26200j2;
                if (appCompatImageView3 != null) {
                    appCompatImageView3.setSelected(false);
                }
                AddTextColorView addTextColorView = readerPreviewActivity.f26224n2;
                if (addTextColorView != null) {
                    addTextColorView.setCenterColor(-16777216);
                }
                AddTextColorView addTextColorView2 = readerPreviewActivity.f26224n2;
                if (addTextColorView2 != null) {
                    addTextColorView2.setOutSideStrokeColor(-16777216);
                }
                AppCompatImageView appCompatImageView4 = readerPreviewActivity.f26206k2;
                if (appCompatImageView4 != null) {
                    appCompatImageView4.setEnabled(true);
                }
                AppCompatImageView appCompatImageView5 = readerPreviewActivity.f26212l2;
                if (appCompatImageView5 != null) {
                    appCompatImageView5.setEnabled(true);
                }
            }
            TextEditorChangeColorBottomSheetView textEditorChangeColorBottomSheetView = readerPreviewActivity.f26291y3;
            if (textEditorChangeColorBottomSheetView != null) {
                textEditorChangeColorBottomSheetView.J(0);
                readerPreviewActivity.f26291y3.C();
            }
            ReaderPreviewActivity.i2(readerPreviewActivity);
            readerPreviewActivity.G4(true);
        }

        @Override // mj.b0
        public final void u() {
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            if (pdf.pdfreader.viewer.editor.free.utils.extension.a.c(readerPreviewActivity)) {
                readerPreviewActivity.h(readerPreviewActivity.getResources().getString(R.string.arg_res_0x7f1300c9));
            }
        }

        @Override // mj.b0
        public final void v() {
            String p10 = ea.a.p("VmQidCxwBmYtaVlnNnMiciF0UWgZYy9pNGs=", "WLah3XlZ");
            ExecutorService executorService = ReaderPreviewActivity.U5;
            ReaderPreviewActivity.this.Z4(p10);
            b.a aVar = gn.b.f17937a;
            String p11 = ea.a.p("X20XXw5vJ20=", "g76ptHkQ");
            aVar.getClass();
            gn.b.c.add(p11);
        }

        @Override // mj.b0
        public final void w() {
            String p10 = ea.a.p("VmQidCxwBmYtaVlnNnI5dCV0V18lbCpjaw==", "0avUGpcI");
            ExecutorService executorService = ReaderPreviewActivity.U5;
            ReaderPreviewActivity.this.Z4(p10);
            b.a aVar = gn.b.f17937a;
            String p11 = ea.a.p("Wm0sXwFvFmEGZQ==", "k3fuB0Gm");
            aVar.getClass();
            gn.b.c.add(p11);
        }

        @Override // mj.b0
        public final void x(String str) {
            String p10 = ea.a.p("VmQidCxwBmYtdFF4HWI5eBtjXXA_XyBsBGNr", "mSuq6SsU");
            ExecutorService executorService = ReaderPreviewActivity.U5;
            ReaderPreviewActivity.this.Z4(p10);
            b.a aVar = gn.b.f17937a;
            String p11 = ea.a.p("KmRFXxpvR3k=", "EczbRzzT");
            aVar.getClass();
            gn.b.c.add(p11);
        }

        @Override // mj.b0
        public final void z(RectF rectF) {
            String p10 = ea.a.p("VmQidCxwBmYtZltjHHMJaSln", "uvd0aFJr");
            ExecutorService executorService = ReaderPreviewActivity.U5;
            ReaderPreviewActivity.this.Z4(p10);
        }

        @Override // mj.b0
        public final void t() {
        }

        @Override // mj.b0
        public final void n(RectF rectF) {
        }

        @Override // mj.b0
        public final void r(String str) {
        }
    }

    /* loaded from: classes3.dex */
    public class f0 implements qg.e {
        public f0() {
        }

        @Override // qg.e
        public final void a() {
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            readerPreviewActivity.P2 = true;
            if (i.a.f21508a.f21507d) {
                pdf.pdfreader.viewer.editor.free.utils.g1<ReaderPreviewActivity> g1Var = readerPreviewActivity.C;
                if (g1Var != null) {
                    g1Var.removeCallbacks(readerPreviewActivity.T2);
                }
                readerPreviewActivity.s3();
            } else if (readerPreviewActivity.J) {
                pdf.pdfreader.viewer.editor.free.utils.g1<ReaderPreviewActivity> g1Var2 = readerPreviewActivity.C;
                if (g1Var2 != null) {
                    g1Var2.removeCallbacks(readerPreviewActivity.O2);
                }
                readerPreviewActivity.K3(true);
                PopupWindow popupWindow = readerPreviewActivity.B5;
                if (popupWindow != null && popupWindow.isShowing()) {
                    readerPreviewActivity.B5.dismiss();
                }
            }
        }

        @Override // qg.e
        public final void b(int i10) {
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            readerPreviewActivity.f26176e5 = true;
            ReaderPreviewActivity.e2(readerPreviewActivity, i10);
            if (i.a.f21508a.f21507d) {
                pdf.pdfreader.viewer.editor.free.utils.g1<ReaderPreviewActivity> g1Var = readerPreviewActivity.C;
                if (g1Var != null) {
                    g1Var.removeCallbacks(readerPreviewActivity.T2);
                }
                readerPreviewActivity.s3();
                if (a.C0318a.f23099a.a(i10) <= 1) {
                    ImageView imageView = readerPreviewActivity.f26187h0;
                    if (imageView != null) {
                        imageView.setEnabled(false);
                    }
                    ImageView imageView2 = readerPreviewActivity.f26182g0;
                    if (imageView2 != null) {
                        imageView2.setEnabled(false);
                        return;
                    }
                    return;
                }
                readerPreviewActivity.K2();
            }
        }

        @Override // qg.e
        public final void e() {
            b.InterfaceC0288b interfaceC0288b;
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            b0 b0Var = readerPreviewActivity.f26276w1;
            if (b0Var != null) {
                b0Var.W0();
                if (i.a.f21508a.f21507d) {
                    View displayedView = readerPreviewActivity.f26276w1.getDisplayedView();
                    if (displayedView instanceof PageView) {
                        if (((PageView) displayedView).p1()) {
                            readerPreviewActivity.u4(true);
                        } else {
                            readerPreviewActivity.u4(false);
                        }
                    }
                    readerPreviewActivity.P2 = false;
                } else if (readerPreviewActivity.J) {
                    pdf.pdfreader.viewer.editor.free.utils.g1<ReaderPreviewActivity> g1Var = readerPreviewActivity.C;
                    if (g1Var != null) {
                        g1Var.postDelayed(readerPreviewActivity.O2, 1000L);
                    }
                    if (readerPreviewActivity.K == 2 && readerPreviewActivity.P2 && (interfaceC0288b = readerPreviewActivity.M4) != null) {
                        ((lib.zj.pdfeditor.p) interfaceC0288b).a();
                    }
                    readerPreviewActivity.P2 = false;
                }
            }
        }

        @Override // qg.e
        public final void c() {
        }

        @Override // qg.e
        public final void d() {
        }
    }

    /* loaded from: classes3.dex */
    public class n implements xn.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f26352a;

        public n(boolean z10) {
            this.f26352a = z10;
        }

        @Override // xn.b
        public final void a() {
            boolean z10 = this.f26352a;
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            if (z10) {
                pdf.pdfreader.viewer.editor.free.utils.h1.i(readerPreviewActivity);
            } else {
                readerPreviewActivity.I0.a(new String[]{ea.a.p("EG4Tcj5pFC44ZRRtXXMkaVdufFIMQXJfMVglRQNOA0wuUyNPA0E3RQ==", "g7qwQpyd"), ea.a.p("Um4vchxpBi4CZUZtAHMlaStuHFcUSRdFLkUyVCdSe0F_XxhUPFIjR0U=", "qjb5WrIH")});
            }
        }

        @Override // xn.b
        public final void b() {
        }
    }

    /* loaded from: classes3.dex */
    public class r0 implements jj.a {
        public r0() {
        }

        @Override // jj.a
        public final void c() {
            b0 b0Var = ReaderPreviewActivity.this.f26276w1;
            if (b0Var != null) {
                for (Map.Entry<ij.d, View> entry : b0Var.f21384d.entrySet()) {
                    if (entry.getKey().f18533a) {
                        ((lib.zj.pdfeditor.a0) entry.getValue()).m();
                    }
                }
            }
        }

        @Override // jj.a
        public final void a() {
        }

        @Override // jj.a
        public final void b() {
        }
    }

    @Override // jl.a
    public final void C1() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a.d
    public final void J() {
    }

    @Override // jl.a
    public final void K1() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a.d
    public final void a0() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a.d
    public final void close() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a.d
    public final void d() {
    }

    /* loaded from: classes3.dex */
    public class f1 implements Animator.AnimatorListener {
        public f1() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ViewGroup viewGroup;
            if (!i.a.f21508a.f21507d) {
                ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
                if (readerPreviewActivity.f26189h3.getAnimatedFraction() == 1.0f && (viewGroup = readerPreviewActivity.X3) != null) {
                    viewGroup.setVisibility(4);
                }
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.g1.a
    public final void Q(Message message) {
    }

    /* loaded from: classes3.dex */
    public class m0 implements TextWatcher {
        public m0() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
            EditText editText = readerPreviewActivity.D1;
            if (editText != null && editText.getVisibility() == 0) {
                if (lib.zj.pdfeditor.q0.f21567d != null && !readerPreviewActivity.D1.getText().toString().equals(lib.zj.pdfeditor.q0.f21567d.f21568a)) {
                    lib.zj.pdfeditor.q0.f21567d = null;
                    readerPreviewActivity.f26276w1.g0();
                }
                if (TextUtils.isEmpty(editable.toString().trim())) {
                    ReaderPreviewActivity.o2(readerPreviewActivity, false);
                    AppCompatImageView appCompatImageView = readerPreviewActivity.B;
                    if (appCompatImageView != null) {
                        appCompatImageView.setVisibility(8);
                    }
                } else {
                    AppCompatImageView appCompatImageView2 = readerPreviewActivity.B;
                    if (appCompatImageView2 != null) {
                        appCompatImageView2.setVisibility(0);
                    }
                }
                readerPreviewActivity.O4(false, false);
                readerPreviewActivity.W2 = false;
                a2.f26308b = false;
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
