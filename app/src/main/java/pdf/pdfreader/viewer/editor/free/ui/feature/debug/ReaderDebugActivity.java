package pdf.pdfreader.viewer.editor.free.ui.feature.debug;

import am.i;
import am.t1;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.activity.n;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g0;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import cg.l;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.d;
import f5.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.flow.r;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionRetainFragment;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.h;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.data.ImageFileInfo;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.widget.Pdf2ImageConvertCompletedView;
import pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask;
import pdf.pdfreader.viewer.editor.free.utils.a0;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: ReaderDebugActivity.kt */
/* loaded from: classes3.dex */
public final class ReaderDebugActivity extends androidx.appcompat.app.c {

    /* renamed from: e  reason: collision with root package name */
    public static boolean f27826e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f27827f;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f27828g;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f27829h;

    /* renamed from: i  reason: collision with root package name */
    public static boolean f27830i;

    /* renamed from: j  reason: collision with root package name */
    public static boolean f27831j;

    /* renamed from: k  reason: collision with root package name */
    public static boolean f27832k;

    /* renamed from: l  reason: collision with root package name */
    public static boolean f27833l;

    /* renamed from: m  reason: collision with root package name */
    public static boolean f27834m;

    /* renamed from: n  reason: collision with root package name */
    public static boolean f27835n;

    /* renamed from: o  reason: collision with root package name */
    public static boolean f27836o;

    /* renamed from: p  reason: collision with root package name */
    public static boolean f27837p;

    /* renamed from: q  reason: collision with root package name */
    public static boolean f27838q;

    /* renamed from: r  reason: collision with root package name */
    public static boolean f27839r;

    /* renamed from: s  reason: collision with root package name */
    public static boolean f27840s;

    /* renamed from: t  reason: collision with root package name */
    public static boolean f27841t;

    /* renamed from: u  reason: collision with root package name */
    public static boolean f27842u;

    /* renamed from: v  reason: collision with root package name */
    public static boolean f27843v;

    /* renamed from: w  reason: collision with root package name */
    public static int f27844w;

    /* renamed from: a  reason: collision with root package name */
    public i f27845a;
    public t1 c;

    /* renamed from: b  reason: collision with root package name */
    public final k0 f27846b = new k0(kotlin.jvm.internal.i.a(ReaderDebugViewModel.class), new cg.a<o0>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.ReaderDebugActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final o0 invoke() {
            o0 viewModelStore = ComponentActivity.this.getViewModelStore();
            g.d(viewModelStore, ea.a.p("RWkudz5vBmUeU0BvG2U=", "KkCg3ySg"));
            return viewModelStore;
        }
    }, new cg.a<m0.b>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.ReaderDebugActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final m0.b invoke() {
            m0.b defaultViewModelProviderFactory = ComponentActivity.this.getDefaultViewModelProviderFactory();
            g.d(defaultViewModelProviderFactory, ea.a.p("K2VXYQxsQ1YzZT1NGmQNbGVyAXYsZAByMWEydCNyeQ==", "AU1owQLD"));
            return defaultViewModelProviderFactory;
        }
    }, new cg.a<n1.a>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.ReaderDebugActivity$special$$inlined$viewModels$default$3
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
        }

        @Override // cg.a
        public final n1.a invoke() {
            n1.a aVar;
            cg.a aVar2 = cg.a.this;
            if (aVar2 == null || (aVar = (n1.a) aVar2.invoke()) == null) {
                n1.a defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                g.d(defaultViewModelCreationExtras, ea.a.p("R2gic11kB2YTdVh0P2kzdwlvVmUqQzFlBHQhb15FGnRBYXM=", "eH0bfSU6"));
                return defaultViewModelCreationExtras;
            }
            return aVar;
        }
    });

    /* renamed from: d  reason: collision with root package name */
    public final tf.c f27847d = kotlin.a.a(new cg.a<OperateExecuteTask>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.ReaderDebugActivity$operateTask$2
        @Override // cg.a
        public final OperateExecuteTask invoke() {
            return new OperateExecuteTask();
        }
    });

    /* compiled from: ReaderDebugActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a extends n {
        public a() {
            super(true);
        }

        @Override // androidx.activity.n
        public final void a() {
            Object obj;
            ConstraintLayout constraintLayout;
            ReaderDebugActivity readerDebugActivity = ReaderDebugActivity.this;
            List<Fragment> H = readerDebugActivity.getSupportFragmentManager().H();
            g.d(H, ea.a.p("PHVBcBZyQ0YoYS1tEG4cTVRuD2cgcktmGGEybSluHnM=", "sudGjULj"));
            Iterator<T> it = H.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((Fragment) obj) instanceof SubscriptionRetainFragment) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            Fragment fragment = (Fragment) obj;
            if (fragment != null) {
                g0 supportFragmentManager = readerDebugActivity.getSupportFragmentManager();
                g.d(supportFragmentManager, ea.a.p("PHVBcBZyQ0YoYS1tEG4cTVRuD2cgcg==", "MjdW4gLv"));
                ge.a.R(supportFragmentManager, fragment);
                i iVar = readerDebugActivity.f27845a;
                if (iVar != null) {
                    iVar.f965d.setVisibility(8);
                    Window window = readerDebugActivity.getWindow();
                    if (window != null) {
                        pdf.pdfreader.viewer.editor.free.utils.extension.i.e(window);
                        return;
                    }
                    return;
                }
                g.i(ea.a.p("UWklZBpuZw==", "5op4fAkf"));
                throw null;
            }
            i iVar2 = readerDebugActivity.f27845a;
            if (iVar2 != null) {
                boolean z10 = false;
                if (iVar2.f965d.getVisibility() == 0) {
                    i iVar3 = readerDebugActivity.f27845a;
                    if (iVar3 != null) {
                        iVar3.f965d.setBackgroundColor(0);
                        i iVar4 = readerDebugActivity.f27845a;
                        if (iVar4 != null) {
                            iVar4.f965d.setVisibility(8);
                            return;
                        } else {
                            g.i(ea.a.p("LWlfZBBuZw==", "gkXKRugs"));
                            throw null;
                        }
                    }
                    g.i(ea.a.p("UWklZBpuZw==", "4UTXl0JI"));
                    throw null;
                }
                t1 t1Var = readerDebugActivity.c;
                if (t1Var != null && (constraintLayout = t1Var.f1467b) != null && constraintLayout.getVisibility() == 0) {
                    z10 = true;
                }
                if (z10) {
                    ((r) ((ReaderDebugViewModel) readerDebugActivity.f27846b.getValue()).f27850d.getValue()).setValue(Boolean.FALSE);
                    return;
                } else {
                    readerDebugActivity.finish();
                    return;
                }
            }
            g.i(ea.a.p("LWlfZBBuZw==", "x8Fhzxin"));
            throw null;
        }
    }

    /* compiled from: ReaderDebugActivity.kt */
    /* loaded from: classes3.dex */
    public static final class b extends Pdf2ImageConvertCompletedView.a {
        public b() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.BasePdfConvertCompletedView.a
        public final void close() {
            ReaderDebugActivity readerDebugActivity = ReaderDebugActivity.this;
            i iVar = readerDebugActivity.f27845a;
            if (iVar != null) {
                iVar.f965d.removeAllViews();
                i iVar2 = readerDebugActivity.f27845a;
                if (iVar2 != null) {
                    iVar2.f965d.setVisibility(8);
                    return;
                } else {
                    g.i(ea.a.p("LWlfZBBuZw==", "DcYZseNP"));
                    throw null;
                }
            }
            g.i(ea.a.p("UWklZBpuZw==", "X0FcYyH0"));
            throw null;
        }
    }

    @Override // androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a0.a(this, false);
        View inflate = getLayoutInflater().inflate(R.layout.activity_debug, (ViewGroup) null, false);
        int i10 = R.id.debug_off_btn;
        Button button = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.debug_off_btn);
        if (button != null) {
            i10 = R.id.exit_page_btn;
            Button button2 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.exit_page_btn);
            if (button2 != null) {
                i10 = R.id.frameFullScreen;
                FrameLayout frameLayout = (FrameLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.frameFullScreen);
                if (frameLayout != null) {
                    i10 = R.id.loadingVS;
                    ViewStub viewStub = (ViewStub) com.google.android.play.core.assetpacks.c.u(inflate, R.id.loadingVS);
                    if (viewStub != null) {
                        i10 = R.id.tab_layout;
                        TabLayout tabLayout = (TabLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tab_layout);
                        if (tabLayout != null) {
                            i10 = R.id.view_pager;
                            ViewPager2 viewPager2 = (ViewPager2) com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_pager);
                            if (viewPager2 != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                i iVar = new i(constraintLayout, button, button2, frameLayout, viewStub, tabLayout, viewPager2);
                                ea.a.p("Wm4tbBJ0BygeYU1vHHQfbiJsU3Qjcik=", "nx7xYaF6");
                                this.f27845a = iVar;
                                setContentView(constraintLayout);
                                i iVar2 = this.f27845a;
                                if (iVar2 != null) {
                                    iVar2.f968g.setAdapter(new pdf.pdfreader.viewer.editor.free.ui.feature.debug.a(this));
                                    String[] strArr = {ea.a.p("DnBB6fyN0L2u", "Rxb1ftyi"), ea.a.p("1rn05eKKi4X_54mu", "5T4MEp0c"), ea.a.p("sq7I6dmFuYXF59uu", "n8ZjAP9c"), ea.a.p("2oDR5-yl", "zL07tgjZ"), ea.a.p("n4nN5peKsaH96fui0ZLb5YS5taqX", "VXxt9XFk"), ea.a.p("Z28qc3Q=", "Jc01GihE")};
                                    i iVar3 = this.f27845a;
                                    if (iVar3 != null) {
                                        d9.g gVar = new d9.g(strArr, 20);
                                        TabLayout tabLayout2 = iVar3.f967f;
                                        ViewPager2 viewPager22 = iVar3.f968g;
                                        d dVar = new d(tabLayout2, viewPager22, gVar);
                                        if (!dVar.f12996e) {
                                            RecyclerView.Adapter<?> adapter = viewPager22.getAdapter();
                                            dVar.f12995d = adapter;
                                            if (adapter != null) {
                                                dVar.f12996e = true;
                                                viewPager22.f(new d.c(tabLayout2));
                                                tabLayout2.a(new d.C0173d(viewPager22, true));
                                                dVar.f12995d.registerAdapterDataObserver(new d.a());
                                                dVar.a();
                                                tabLayout2.n(viewPager22.getCurrentItem(), 0.0f, true, true, true);
                                                i iVar4 = this.f27845a;
                                                if (iVar4 != null) {
                                                    iVar4.f964b.setOnClickListener(new f5.d(this, 25));
                                                    i iVar5 = this.f27845a;
                                                    if (iVar5 != null) {
                                                        iVar5.c.setOnClickListener(new e(this, 23));
                                                        i iVar6 = this.f27845a;
                                                        if (iVar6 != null) {
                                                            iVar6.f966e.setOnInflateListener(new pdf.pdfreader.viewer.editor.free.feature.scan.ui.a0(this, 1));
                                                            ((ReaderDebugViewModel) this.f27846b.getValue()).f27852f = new pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.b(this);
                                                            t0.d0(b.b.x(this), null, null, new ReaderDebugActivity$initViewModel$1(this, null), 3);
                                                            getOnBackPressedDispatcher().a(this, new a());
                                                            return;
                                                        }
                                                        g.i(ea.a.p("LWlfZBBuZw==", "wMswrU32"));
                                                        throw null;
                                                    }
                                                    g.i(ea.a.p("LWlfZBBuZw==", "ArjMf4MX"));
                                                    throw null;
                                                }
                                                g.i(ea.a.p("DmkmZBNuZw==", "QelHzCQn"));
                                                throw null;
                                            }
                                            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
                                        }
                                        throw new IllegalStateException("TabLayoutMediator is already attached");
                                    }
                                    g.i(ea.a.p("UWklZBpuZw==", "NPlAUR0L"));
                                    throw null;
                                }
                                g.i(ea.a.p("UWklZBpuZw==", "iKrnQ0d8"));
                                throw null;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(ea.a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpHWhwSQk6IA==", "VydKiPME").concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onDestroy() {
        ((OperateExecuteTask) this.f27847d.getValue()).k();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    public final void onResume() {
        super.onResume();
        ((OperateExecuteTask) this.f27847d.getValue()).l();
    }

    public final void w1(ArrayList arrayList) {
        i iVar = this.f27845a;
        if (iVar != null) {
            iVar.f965d.setVisibility(0);
            i iVar2 = this.f27845a;
            if (iVar2 != null) {
                iVar2.f965d.removeAllViews();
                LayoutInflater from = LayoutInflater.from(this);
                i iVar3 = this.f27845a;
                if (iVar3 != null) {
                    View inflate = from.inflate(R.layout.layout_ocr_test_show, (ViewGroup) iVar3.f965d, false);
                    inflate.setVisibility(0);
                    RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.ocr_rv_show);
                    recyclerView.setAdapter(new h(arrayList, new l<Integer, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.ReaderDebugActivity$showOCRWord$1$1
                        public final void invoke(int i10) {
                        }

                        @Override // cg.l
                        public /* bridge */ /* synthetic */ tf.d invoke(Integer num) {
                            invoke(num.intValue());
                            return tf.d.f30009a;
                        }
                    }, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.ReaderDebugActivity$showOCRWord$1$2
                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                        }

                        @Override // cg.a
                        public /* bridge */ /* synthetic */ tf.d invoke() {
                            invoke2();
                            return tf.d.f30009a;
                        }
                    }));
                    FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(this);
                    flexboxLayoutManager.e1(0);
                    if (flexboxLayoutManager.f9959r != 0) {
                        flexboxLayoutManager.f9959r = 0;
                        flexboxLayoutManager.z0();
                    }
                    recyclerView.setLayoutManager(flexboxLayoutManager);
                    i iVar4 = this.f27845a;
                    if (iVar4 != null) {
                        iVar4.f965d.setBackgroundColor(-1);
                        i iVar5 = this.f27845a;
                        if (iVar5 != null) {
                            iVar5.f965d.addView(inflate);
                            return;
                        } else {
                            g.i(ea.a.p("Bmk8ZC5uZw==", "qydRG61L"));
                            throw null;
                        }
                    }
                    g.i(ea.a.p("IWk0ZDtuZw==", "QPCZR9PM"));
                    throw null;
                }
                g.i(ea.a.p("LWlfZBBuZw==", "TPAIRyZN"));
                throw null;
            }
            g.i(ea.a.p("JGkMZC1uZw==", "R7FbDQh7"));
            throw null;
        }
        g.i(ea.a.p("UWklZBpuZw==", "larzFFoi"));
        throw null;
    }

    public final void x1(boolean z10) {
        i iVar = this.f27845a;
        if (iVar != null) {
            iVar.f965d.setVisibility(0);
            i iVar2 = this.f27845a;
            if (iVar2 != null) {
                iVar2.f965d.removeAllViews();
                Pdf2ImageConvertCompletedView pdf2ImageConvertCompletedView = new Pdf2ImageConvertCompletedView(this);
                i iVar3 = this.f27845a;
                if (iVar3 != null) {
                    iVar3.f965d.addView(pdf2ImageConvertCompletedView, -1, -1);
                    pdf2ImageConvertCompletedView.setChildListener(new b());
                    ArrayList arrayList = new ArrayList();
                    ImageFileInfo imageFileInfo = new ImageFileInfo();
                    imageFileInfo.setFilePath(ea.a.p("V2UpdRQvFmUBdBtwCHRo", "kUKnZmg0"));
                    imageFileInfo.setFileName(ea.a.p("K2VTdR5fQ2UpdBVuFG1l", "Nhowz42E"));
                    arrayList.add(imageFileInfo);
                    pdf2ImageConvertCompletedView.g(arrayList, z10);
                    return;
                }
                g.i(ea.a.p("LWlfZBBuZw==", "ziKdF41E"));
                throw null;
            }
            g.i(ea.a.p("UWklZBpuZw==", "VQxzSPMF"));
            throw null;
        }
        g.i(ea.a.p("UWklZBpuZw==", "T1GCRD09"));
        throw null;
    }
}
