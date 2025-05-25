package pdf.pdfreader.viewer.editor.free.pdfview;

import am.v2;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import gn.b;
import java.util.concurrent.ExecutorService;
import lib.zj.pdfeditor.PDFReaderView;
import lib.zj.pdfeditor.text.editor.EditorView;
import lib.zj.pdfeditor.text.editor.TextEditorAction;
import lib.zj.pdfeditor.text.editor.a;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.widget.AddTextColorView;
import pdf.pdfreader.viewer.editor.free.ui.widget.TextEditorChangeColorBottomSheetView;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class m implements ViewStub.OnInflateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f26446a;

    /* compiled from: ReaderPreviewActivity.java */
    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            mj.h hVar;
            lib.zj.pdfeditor.text.editor.a aVar;
            ReaderPreviewActivity readerPreviewActivity = m.this.f26446a;
            String p10 = ea.a.p("VmQidCxwBmYtdFF4HWI5eBtrUGQZYy9pU2s=", "0XXeJRHp");
            ExecutorService executorService = ReaderPreviewActivity.U5;
            readerPreviewActivity.Z4(p10);
            ReaderPreviewActivity readerPreviewActivity2 = m.this.f26446a;
            if (readerPreviewActivity2.K2) {
                ReaderPreviewActivity.i2(readerPreviewActivity2);
            } else {
                ViewStub viewStub = readerPreviewActivity2.S1;
                if (viewStub != null) {
                    kl.i.b(viewStub);
                }
                EditorView editorView = readerPreviewActivity2.f26230o2;
                if (editorView != null) {
                    editorView.setVisibility(0);
                }
                ReaderPreviewActivity.b0 b0Var = readerPreviewActivity2.f26276w1;
                if (b0Var != null && b0Var.F0 == PDFReaderView.Mode.Editor && (hVar = b0Var.L1) != null && (aVar = b0Var.M1) != null) {
                    if (hVar.f22083a == aVar.f21685e) {
                        b0Var.M1.r();
                        if (!b0Var.M1.q()) {
                            b0Var.f21421v0 = true;
                            b0Var.setDisplayedViewIndex(b0Var.L1.f22083a);
                        }
                    } else {
                        mj.h hVar2 = b0Var.L1;
                        hVar2.f22087f = TextEditorAction.INPUT_TEXT;
                        b0Var.setDisplayedViewIndex(hVar2.f22083a);
                    }
                }
            }
            TextEditorChangeColorBottomSheetView textEditorChangeColorBottomSheetView = m.this.f26446a.f26291y3;
            if (textEditorChangeColorBottomSheetView != null) {
                textEditorChangeColorBottomSheetView.C();
            }
        }
    }

    /* compiled from: ReaderPreviewActivity.java */
    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            mj.h hVar;
            lib.zj.pdfeditor.text.editor.a aVar;
            ReaderPreviewActivity.b0 b0Var = m.this.f26446a.f26276w1;
            if (b0Var != null && b0Var.F0 == PDFReaderView.Mode.Editor && (hVar = b0Var.L1) != null && (aVar = b0Var.M1) != null) {
                if (hVar.f22083a == aVar.f21685e) {
                    lib.zj.pdfeditor.text.editor.a aVar2 = b0Var.M1;
                    aVar2.getClass();
                    int i10 = a.f.f21725b[aVar2.f21680b.ordinal()];
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3 && aVar2.f21698p != null && aVar2.f21701s != null) {
                                aVar2.f21701s.boldState = !aVar2.f21701s.bold ? 1 : 0;
                                aVar2.f21701s.color = -1;
                                aVar2.f21701s.targetSize = 0.0f;
                                aVar2.K(aVar2.f21685e, aVar2.f21698p, aVar2.f21701s);
                                aVar2.k();
                            }
                        } else if (aVar2.f21698p != null && aVar2.f21700r != null) {
                            aVar2.f21700r.boldState = !aVar2.f21700r.bold ? 1 : 0;
                            aVar2.f21700r.color = -1;
                            aVar2.f21700r.targetSize = 0.0f;
                            aVar2.M(aVar2.f21685e, aVar2.f21698p, aVar2.f21700r);
                            aVar2.m();
                        }
                    } else {
                        EditorView editorView = aVar2.f21687f.getEditorView();
                        if (editorView != null) {
                            editorView.d();
                            editorView.f21670i = true;
                        }
                        if (aVar2.F != null) {
                            aVar2.F.bold = !aVar2.F.bold;
                            aVar2.z(aVar2.F);
                            aVar2.l();
                        }
                    }
                    if (!b0Var.M1.q()) {
                        b0Var.f21421v0 = true;
                        b0Var.setDisplayedViewIndex(b0Var.L1.f22083a);
                    }
                } else {
                    mj.h hVar2 = b0Var.L1;
                    hVar2.f22087f = TextEditorAction.BOLD;
                    b0Var.setDisplayedViewIndex(hVar2.f22083a);
                }
            }
            m.this.f26446a.Z4(ea.a.p("KmRYdCZwU2YFdC94AV8Kb1lkMWMpaQZr", "KvvBIBvU"));
            b.a aVar3 = gn.b.f17937a;
            String p10 = ea.a.p("KmRFXxtvW2Q=", "RXAZpBes");
            aVar3.getClass();
            gn.b.c.add(p10);
            TextEditorChangeColorBottomSheetView textEditorChangeColorBottomSheetView = m.this.f26446a.f26291y3;
            if (textEditorChangeColorBottomSheetView != null) {
                textEditorChangeColorBottomSheetView.C();
            }
        }
    }

    /* compiled from: ReaderPreviewActivity.java */
    /* loaded from: classes3.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            mj.h hVar;
            lib.zj.pdfeditor.text.editor.a aVar;
            ReaderPreviewActivity.b0 b0Var = m.this.f26446a.f26276w1;
            if (b0Var != null && b0Var.F0 == PDFReaderView.Mode.Editor && (hVar = b0Var.L1) != null && (aVar = b0Var.M1) != null) {
                if (hVar.f22083a == aVar.f21685e) {
                    lib.zj.pdfeditor.text.editor.a aVar2 = b0Var.M1;
                    aVar2.getClass();
                    int i10 = a.f.f21725b[aVar2.f21680b.ordinal()];
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3 && aVar2.f21698p != null && aVar2.f21701s != null) {
                                aVar2.f21701s.italicState = !aVar2.f21701s.italic ? 1 : 0;
                                aVar2.f21701s.color = -1;
                                aVar2.f21701s.targetSize = 0.0f;
                                aVar2.K(aVar2.f21685e, aVar2.f21698p, aVar2.f21701s);
                                aVar2.k();
                            }
                        } else if (aVar2.f21698p != null && aVar2.f21700r != null) {
                            aVar2.f21700r.italicState = !aVar2.f21700r.italic ? 1 : 0;
                            aVar2.f21700r.color = -1;
                            aVar2.f21700r.targetSize = 0.0f;
                            aVar2.M(aVar2.f21685e, aVar2.f21698p, aVar2.f21700r);
                            aVar2.m();
                        }
                    } else {
                        EditorView editorView = aVar2.f21687f.getEditorView();
                        if (editorView != null) {
                            editorView.d();
                            editorView.f21670i = true;
                        }
                        if (aVar2.F != null) {
                            aVar2.F.italic = !aVar2.F.italic;
                            aVar2.z(aVar2.F);
                            aVar2.l();
                        }
                    }
                    if (!b0Var.M1.q()) {
                        b0Var.f21421v0 = true;
                        b0Var.setDisplayedViewIndex(b0Var.L1.f22083a);
                    }
                } else {
                    mj.h hVar2 = b0Var.L1;
                    hVar2.f22087f = TextEditorAction.ITALIC;
                    b0Var.setDisplayedViewIndex(hVar2.f22083a);
                }
            }
            m.this.f26446a.Z4(ea.a.p("KmRYdCZwU2YFdC94AV8BdFRsB2MaYwlpJWs=", "8JByFefX"));
            b.a aVar3 = gn.b.f17937a;
            String p10 = ea.a.p("KmRFXxB0VmwzYw==", "bzAoMCto");
            aVar3.getClass();
            gn.b.c.add(p10);
            TextEditorChangeColorBottomSheetView textEditorChangeColorBottomSheetView = m.this.f26446a.f26291y3;
            if (textEditorChangeColorBottomSheetView != null) {
                textEditorChangeColorBottomSheetView.C();
            }
        }
    }

    /* compiled from: ReaderPreviewActivity.java */
    /* loaded from: classes3.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            mj.h hVar;
            lib.zj.pdfeditor.text.editor.a aVar;
            ReaderPreviewActivity.b0 b0Var = m.this.f26446a.f26276w1;
            if (b0Var != null && b0Var.F0 == PDFReaderView.Mode.Editor && (hVar = b0Var.L1) != null && (aVar = b0Var.M1) != null) {
                if (hVar.f22083a == aVar.f21685e) {
                    lib.zj.pdfeditor.text.editor.a aVar2 = b0Var.M1;
                    aVar2.getClass();
                    int i10 = a.f.f21725b[aVar2.f21680b.ordinal()];
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3 && aVar2.f21698p != null && aVar2.f21701s != null) {
                                aVar2.f21701s.underlineState = !aVar2.f21701s.underline ? 1 : 0;
                                aVar2.f21701s.color = -1;
                                aVar2.f21701s.targetSize = 0.0f;
                                aVar2.K(aVar2.f21685e, aVar2.f21698p, aVar2.f21701s);
                                aVar2.k();
                            }
                        } else if (aVar2.f21698p != null && aVar2.f21700r != null) {
                            aVar2.f21700r.underlineState = !aVar2.f21700r.underline ? 1 : 0;
                            aVar2.f21700r.color = -1;
                            aVar2.f21700r.targetSize = 0.0f;
                            aVar2.M(aVar2.f21685e, aVar2.f21698p, aVar2.f21700r);
                            aVar2.m();
                        }
                    } else {
                        EditorView editorView = aVar2.f21687f.getEditorView();
                        if (editorView != null) {
                            editorView.d();
                            editorView.f21670i = true;
                        }
                        if (aVar2.F != null) {
                            aVar2.F.underline = !aVar2.F.underline;
                            aVar2.z(aVar2.F);
                            aVar2.l();
                        }
                    }
                    if (!b0Var.M1.q()) {
                        b0Var.f21421v0 = true;
                        b0Var.setDisplayedViewIndex(b0Var.L1.f22083a);
                    }
                } else {
                    mj.h hVar2 = b0Var.L1;
                    hVar2.f22087f = TextEditorAction.UNDERLINE;
                    b0Var.setDisplayedViewIndex(hVar2.f22083a);
                }
            }
            m.this.f26446a.Z4(ea.a.p("KmRYdCZwU2YFdC94AV8dblFlHGwsbgBfM2wAY2s=", "pZ6hPihk"));
            b.a aVar3 = gn.b.f17937a;
            String p10 = ea.a.p("VmQ_XwZuBmUAbF1uZQ==", "pRq2qPqa");
            aVar3.getClass();
            gn.b.c.add(p10);
            TextEditorChangeColorBottomSheetView textEditorChangeColorBottomSheetView = m.this.f26446a.f26291y3;
            if (textEditorChangeColorBottomSheetView != null) {
                textEditorChangeColorBottomSheetView.C();
            }
        }
    }

    /* compiled from: ReaderPreviewActivity.java */
    /* loaded from: classes3.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            mj.h hVar;
            lib.zj.pdfeditor.text.editor.a aVar;
            ReaderPreviewActivity.b0 b0Var = m.this.f26446a.f26276w1;
            if (b0Var != null && b0Var.F0 == PDFReaderView.Mode.Editor && (hVar = b0Var.L1) != null && (aVar = b0Var.M1) != null) {
                if (hVar.f22083a == aVar.f21685e) {
                    lib.zj.pdfeditor.text.editor.a aVar2 = b0Var.M1;
                    aVar2.getClass();
                    int i10 = a.f.f21725b[aVar2.f21680b.ordinal()];
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3 && aVar2.f21698p != null && aVar2.f21701s != null && aVar2.f21701s.maxSize > 5.0f) {
                                aVar2.f21701s.targetSize = -5.0f;
                                aVar2.f21701s.color = -1;
                                aVar2.K(aVar2.f21685e, aVar2.f21698p, aVar2.f21701s);
                            }
                        } else if (aVar2.f21698p != null && aVar2.f21700r != null && aVar2.f21700r.maxSize > 5.0f) {
                            aVar2.f21700r.targetSize = -5.0f;
                            aVar2.f21700r.color = -1;
                            aVar2.M(aVar2.f21685e, aVar2.f21698p, aVar2.f21700r);
                        }
                    } else {
                        EditorView editorView = aVar2.f21687f.getEditorView();
                        if (editorView != null) {
                            editorView.d();
                            editorView.f21670i = true;
                        }
                        if (aVar2.F != null && aVar2.F.size > 5) {
                            aVar2.F.size--;
                            aVar2.z(aVar2.F);
                        }
                    }
                    if (!b0Var.M1.q()) {
                        b0Var.f21421v0 = true;
                        b0Var.setDisplayedViewIndex(b0Var.L1.f22083a);
                    }
                } else {
                    mj.h hVar2 = b0Var.L1;
                    hVar2.f22087f = TextEditorAction.REDUCE_SIZE;
                    b0Var.setDisplayedViewIndex(hVar2.f22083a);
                }
            }
            m.this.f26446a.Z4(ea.a.p("LmQzdDZwXWYXdAN4QF8xb1Z0IWkzZVJvA24uYz1pIWs=", "qNKZi9Pe"));
            b.a aVar3 = gn.b.f17937a;
            String p10 = ea.a.p("VmQ_XxVvDHQBaU5l", "Bf0ABymo");
            aVar3.getClass();
            gn.b.c.add(p10);
            TextEditorChangeColorBottomSheetView textEditorChangeColorBottomSheetView = m.this.f26446a.f26291y3;
            if (textEditorChangeColorBottomSheetView != null) {
                textEditorChangeColorBottomSheetView.C();
            }
        }
    }

    /* compiled from: ReaderPreviewActivity.java */
    /* loaded from: classes3.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            mj.h hVar;
            lib.zj.pdfeditor.text.editor.a aVar;
            ReaderPreviewActivity.b0 b0Var = m.this.f26446a.f26276w1;
            if (b0Var != null && b0Var.F0 == PDFReaderView.Mode.Editor && (hVar = b0Var.L1) != null && (aVar = b0Var.M1) != null) {
                if (hVar.f22083a == aVar.f21685e) {
                    lib.zj.pdfeditor.text.editor.a aVar2 = b0Var.M1;
                    aVar2.getClass();
                    int i10 = a.f.f21725b[aVar2.f21680b.ordinal()];
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3 && aVar2.f21698p != null && aVar2.f21701s != null && aVar2.f21701s.minSize < 50.0f) {
                                aVar2.f21701s.targetSize = 50.0f;
                                aVar2.f21701s.color = -1;
                                aVar2.K(aVar2.f21685e, aVar2.f21698p, aVar2.f21701s);
                            }
                        } else if (aVar2.f21698p != null && aVar2.f21700r != null && aVar2.f21700r.minSize < 300.0f) {
                            aVar2.f21700r.targetSize = 50.0f;
                            aVar2.f21700r.color = -1;
                            aVar2.M(aVar2.f21685e, aVar2.f21698p, aVar2.f21700r);
                        }
                    } else {
                        EditorView editorView = aVar2.f21687f.getEditorView();
                        if (editorView != null) {
                            editorView.d();
                            editorView.f21670i = true;
                        }
                        if (aVar2.F != null && aVar2.F.size < 50) {
                            aVar2.F.size++;
                            aVar2.z(aVar2.F);
                        }
                    }
                    if (!b0Var.M1.q()) {
                        b0Var.f21421v0 = true;
                        b0Var.setDisplayedViewIndex(b0Var.L1.f22083a);
                    }
                } else {
                    mj.h hVar2 = b0Var.L1;
                    hVar2.f22087f = TextEditorAction.INCREASE_SIZE;
                    b0Var.setDisplayedViewIndex(hVar2.f22083a);
                }
            }
            m.this.f26446a.Z4(ea.a.p("KmRYdCZwU2YFdC94AV8Ob1t0HWk_ZRBwBWMaaQBr", "NALyZvcU"));
            b.a aVar3 = gn.b.f17937a;
            String p10 = ea.a.p("VmQ_XxVvDHQBaU5l", "V54APSsq");
            aVar3.getClass();
            gn.b.c.add(p10);
            TextEditorChangeColorBottomSheetView textEditorChangeColorBottomSheetView = m.this.f26446a.f26291y3;
            if (textEditorChangeColorBottomSheetView != null) {
                textEditorChangeColorBottomSheetView.C();
            }
        }
    }

    /* compiled from: ReaderPreviewActivity.java */
    /* loaded from: classes3.dex */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ViewStub viewStub;
            m mVar = m.this;
            ReaderPreviewActivity readerPreviewActivity = mVar.f26446a;
            if (readerPreviewActivity.f26291y3 == null && (viewStub = readerPreviewActivity.R1) != null) {
                kl.i.b(viewStub);
            }
            mVar.f26446a.Z4(ea.a.p("KmRYdCZwU2YFdC94AV8Lb1lvHF8mbAxjaw==", "mmMVmAk3"));
            TextEditorChangeColorBottomSheetView textEditorChangeColorBottomSheetView = mVar.f26446a.f26291y3;
            if (textEditorChangeColorBottomSheetView != null) {
                if (textEditorChangeColorBottomSheetView.H()) {
                    mVar.f26446a.f26291y3.C();
                    return;
                }
                mVar.f26446a.f26291y3.I();
                ReaderPreviewActivity readerPreviewActivity2 = mVar.f26446a;
                readerPreviewActivity2.f26291y3.J(readerPreviewActivity2.f26257t2);
                ReaderPreviewActivity readerPreviewActivity3 = mVar.f26446a;
                TextEditorChangeColorBottomSheetView textEditorChangeColorBottomSheetView2 = readerPreviewActivity3.f26291y3;
                int i10 = readerPreviewActivity3.f26257t2;
                if (i10 == -1) {
                    textEditorChangeColorBottomSheetView2.getClass();
                    return;
                }
                int childCount = ((v2) textEditorChangeColorBottomSheetView2.f28172y).f1553d.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = ((v2) textEditorChangeColorBottomSheetView2.f28172y).f1553d.getChildAt(i11);
                    if ((childAt instanceof AddTextColorView) && ((AddTextColorView) childAt).getCenterColor() == i10) {
                        if (childAt.getLeft() > 0) {
                            pdf.pdfreader.viewer.editor.free.utils.extension.g.c(((v2) textEditorChangeColorBottomSheetView2.f28172y).f1552b, childAt);
                            return;
                        } else {
                            childAt.post(new com.facebook.appevents.g(26, textEditorChangeColorBottomSheetView2, childAt));
                            return;
                        }
                    }
                }
            }
        }
    }

    public m(ReaderPreviewActivity readerPreviewActivity) {
        this.f26446a = readerPreviewActivity;
    }

    @Override // android.view.ViewStub.OnInflateListener
    public final void onInflate(ViewStub viewStub, View view) {
        ea.a.p("KmUFZFJyGnItdg9lQ0E0dFF2O3R5", "DDxd7JO7");
        ea.a.p("KmRYdC1lT3QObyVsBkIJcmNzTm8rSQtmX2FCZQ==", "FBXl36z6");
        ReaderPreviewActivity readerPreviewActivity = this.f26446a;
        readerPreviewActivity.f26157b2 = view;
        readerPreviewActivity.f26183g2 = (AppCompatImageView) view.findViewById(R.id.keyboardImg);
        readerPreviewActivity.f26163c2 = view.findViewById(R.id.keyboardDividerView);
        readerPreviewActivity.f26188h2 = (AppCompatImageView) view.findViewById(R.id.boldImg);
        readerPreviewActivity.f26194i2 = (AppCompatImageView) view.findViewById(R.id.italicImg);
        readerPreviewActivity.f26200j2 = (AppCompatImageView) view.findViewById(R.id.underlineImg);
        readerPreviewActivity.f26206k2 = (AppCompatImageView) view.findViewById(R.id.sizeReduceImg);
        readerPreviewActivity.f26212l2 = (AppCompatImageView) view.findViewById(R.id.sizeIncreaseImg);
        readerPreviewActivity.f26218m2 = (FrameLayout) view.findViewById(R.id.changeColorFl);
        readerPreviewActivity.f26224n2 = (AddTextColorView) view.findViewById(R.id.changeColorView);
        AppCompatImageView appCompatImageView = readerPreviewActivity.f26183g2;
        if (appCompatImageView != null) {
            appCompatImageView.setOnClickListener(new a());
        }
        AppCompatImageView appCompatImageView2 = readerPreviewActivity.f26188h2;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setOnClickListener(new b());
        }
        AppCompatImageView appCompatImageView3 = readerPreviewActivity.f26194i2;
        if (appCompatImageView3 != null) {
            appCompatImageView3.setOnClickListener(new c());
        }
        AppCompatImageView appCompatImageView4 = readerPreviewActivity.f26200j2;
        if (appCompatImageView4 != null) {
            appCompatImageView4.setOnClickListener(new d());
        }
        AppCompatImageView appCompatImageView5 = readerPreviewActivity.f26206k2;
        if (appCompatImageView5 != null) {
            appCompatImageView5.setOnClickListener(new e());
        }
        AppCompatImageView appCompatImageView6 = readerPreviewActivity.f26212l2;
        if (appCompatImageView6 != null) {
            appCompatImageView6.setOnClickListener(new f());
        }
        FrameLayout frameLayout = readerPreviewActivity.f26218m2;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new g());
        }
    }
}
