package pdf.pdfreader.viewer.editor.free.utils.extension;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.RecyclerView;
import cg.l;
import pdf.pdfreader.viewer.editor.free.ui.myview.TouchMonitorRecyclerView;
import pdf.pdfreader.viewer.editor.free.utils.l0;

/* compiled from: View.kt */
/* loaded from: classes3.dex */
public final class g {

    /* compiled from: View.kt */
    /* loaded from: classes3.dex */
    public static final class a extends l0 {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ l<View, tf.d> f28691b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super View, tf.d> lVar) {
            this.f28691b = lVar;
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.l0
        public final void a(View view) {
            if (view != null) {
                this.f28691b.invoke(view);
            }
        }
    }

    public static final void a(EditText editText) {
        InputMethodManager inputMethodManager;
        kotlin.jvm.internal.g.e(editText, "<this>");
        try {
            editText.clearFocus();
            Object systemService = editText.getContext().getSystemService(ea.a.p("Jm5BdQ1fWmUuaCVk", "oIGMsOis"));
            if (systemService instanceof InputMethodManager) {
                inputMethodManager = (InputMethodManager) systemService;
            } else {
                inputMethodManager = null;
            }
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static final void b(EditText editText) {
        InputMethodManager inputMethodManager;
        kotlin.jvm.internal.g.e(editText, "<this>");
        try {
            Object systemService = editText.getContext().getSystemService(ea.a.p("Wm47dQdfD2UGaFtk", "d9a6vh50"));
            if (systemService instanceof InputMethodManager) {
                inputMethodManager = (InputMethodManager) systemService;
            } else {
                inputMethodManager = null;
            }
            if (inputMethodManager != null && inputMethodManager.isActive()) {
                inputMethodManager.restartInput(editText);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static final void c(HorizontalScrollView horizontalScrollView, View view) {
        kotlin.jvm.internal.g.e(horizontalScrollView, "<this>");
        kotlin.jvm.internal.g.e(view, "view");
        horizontalScrollView.scrollTo(view.getLeft() - ((horizontalScrollView.getWidth() - view.getWidth()) / 2), 0);
    }

    public static final void d(int i10, TouchMonitorRecyclerView touchMonitorRecyclerView) {
        boolean z10;
        RecyclerView.m layoutManager;
        kotlin.jvm.internal.g.e(touchMonitorRecyclerView, "<this>");
        RecyclerView.Adapter adapter = touchMonitorRecyclerView.getAdapter();
        if (adapter != null) {
            boolean z11 = true;
            if (i10 >= 0 && i10 < adapter.getItemCount()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && (layoutManager = touchMonitorRecyclerView.getLayoutManager()) != null) {
                View C = layoutManager.C(i10);
                if (C != null) {
                    ea.a.p("WnQubSVpB3c=", "40yvc6Jc");
                    Rect rect = new Rect();
                    if (!C.getGlobalVisibleRect(rect) || rect.bottom - rect.top < C.getHeight()) {
                        z11 = false;
                    }
                    if (!z11) {
                        layoutManager.B0(i10);
                    }
                } else {
                    C = null;
                }
                if (C == null) {
                    layoutManager.B0(i10);
                }
            }
        }
    }

    public static final void e(View view, l<? super View, tf.d> listener) {
        kotlin.jvm.internal.g.e(view, "<this>");
        kotlin.jvm.internal.g.e(listener, "listener");
        view.setOnClickListener(new a(listener));
    }

    public static final void f(EditText editText) {
        InputMethodManager inputMethodManager;
        kotlin.jvm.internal.g.e(editText, "<this>");
        try {
            Object systemService = editText.getContext().getSystemService(ea.a.p("Wm47dQdfD2UGaFtk", "yDn0UwXW"));
            if (systemService instanceof InputMethodManager) {
                inputMethodManager = (InputMethodManager) systemService;
            } else {
                inputMethodManager = null;
            }
            if (inputMethodManager != null) {
                editText.setFocusable(true);
                editText.setFocusableInTouchMode(true);
                editText.requestFocus();
                inputMethodManager.showSoftInput(editText, 0, null);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void g(View view) {
        InputMethodManager inputMethodManager;
        kotlin.jvm.internal.g.e(view, "<this>");
        try {
            Object systemService = view.getContext().getSystemService(ea.a.p("Wm47dQdfD2UGaFtk", "0KGrIPPm"));
            if (systemService instanceof InputMethodManager) {
                inputMethodManager = (InputMethodManager) systemService;
            } else {
                inputMethodManager = null;
            }
            if (inputMethodManager != null) {
                view.setFocusable(true);
                view.requestFocus();
                inputMethodManager.showSoftInput(view, 0);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
