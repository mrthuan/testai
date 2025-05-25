package x0;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;
import y0.f;
import y0.j;

/* compiled from: AccessibilityDelegateCompat.java */
/* loaded from: classes.dex */
public class a {
    public static final View.AccessibilityDelegate c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    public final View.AccessibilityDelegate f31416a;

    /* renamed from: b  reason: collision with root package name */
    public final C0399a f31417b;

    /* compiled from: AccessibilityDelegateCompat.java */
    /* renamed from: x0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0399a extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final a f31418a;

        public C0399a(a aVar) {
            this.f31418a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f31418a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            y0.g b10 = this.f31418a.b(view);
            if (b10 != null) {
                return (AccessibilityNodeProvider) b10.f31969a;
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f31418a.c(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            boolean z10;
            Object tag;
            boolean z11;
            boolean z12;
            Object tag2;
            boolean z13;
            boolean z14;
            Object tag3;
            int i10;
            y0.f fVar = new y0.f(accessibilityNodeInfo);
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            boolean z15 = true;
            int i11 = 0;
            if (Build.VERSION.SDK_INT >= 28) {
                z10 = true;
            } else {
                z10 = false;
            }
            ClickableSpan[] clickableSpanArr = null;
            if (z10) {
                tag = Boolean.valueOf(f0.m.d(view));
            } else {
                tag = view.getTag(R.id.tag_screen_reader_focusable);
                if (!Boolean.class.isInstance(tag)) {
                    tag = null;
                }
            }
            Boolean bool = (Boolean) tag;
            if (bool != null && bool.booleanValue()) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 28) {
                androidx.window.layout.g.l(accessibilityNodeInfo, z11);
            } else {
                fVar.f(1, z11);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                tag2 = Boolean.valueOf(f0.m.c(view));
            } else {
                tag2 = view.getTag(R.id.tag_accessibility_heading);
                if (!Boolean.class.isInstance(tag2)) {
                    tag2 = null;
                }
            }
            Boolean bool2 = (Boolean) tag2;
            if (bool2 != null && bool2.booleanValue()) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (i12 >= 28) {
                androidx.emoji2.text.u.g(accessibilityNodeInfo, z13);
            } else {
                fVar.f(2, z13);
            }
            CharSequence e10 = f0.e(view);
            if (i12 >= 28) {
                accessibilityNodeInfo.setPaneTitle(e10);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", e10);
            }
            if (Build.VERSION.SDK_INT >= 30) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                tag3 = f0.o.a(view);
            } else {
                tag3 = view.getTag(R.id.tag_state_description);
                if (!CharSequence.class.isInstance(tag3)) {
                    tag3 = null;
                }
            }
            CharSequence charSequence = (CharSequence) tag3;
            if (i12 < 30) {
                z15 = false;
            }
            if (z15) {
                accessibilityNodeInfo.setStateDescription(charSequence);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
            }
            this.f31418a.d(view, fVar);
            CharSequence text = accessibilityNodeInfo.getText();
            if (i12 < 26) {
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                        if (((WeakReference) sparseArray.valueAt(i13)).get() == null) {
                            arrayList.add(Integer.valueOf(i13));
                        }
                    }
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        sparseArray.remove(((Integer) arrayList.get(i14)).intValue());
                    }
                }
                if (text instanceof Spanned) {
                    clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                }
                if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                    fVar.f31951a.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                    SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                    }
                    int i15 = 0;
                    while (i15 < clickableSpanArr.length) {
                        ClickableSpan clickableSpan = clickableSpanArr[i15];
                        int i16 = i11;
                        while (true) {
                            if (i16 < sparseArray2.size()) {
                                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i16)).get())) {
                                    i10 = sparseArray2.keyAt(i16);
                                    break;
                                }
                                i16++;
                            } else {
                                i10 = y0.f.f31950d;
                                y0.f.f31950d = i10 + 1;
                                break;
                            }
                        }
                        sparseArray2.put(i10, new WeakReference(clickableSpanArr[i15]));
                        ClickableSpan clickableSpan2 = clickableSpanArr[i15];
                        Spanned spanned = (Spanned) text;
                        fVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        fVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        fVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        fVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
                        i15++;
                        i11 = 0;
                    }
                }
            }
            List list = (List) view.getTag(R.id.tag_accessibility_actions);
            if (list == null) {
                list = Collections.emptyList();
            }
            for (int i17 = 0; i17 < list.size(); i17++) {
                fVar.b((f.a) list.get(i17));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f31418a.e(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f31418a.f(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f31418a.g(view, i10, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEvent(View view, int i10) {
            this.f31418a.h(view, i10);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f31418a.i(view, accessibilityEvent);
        }
    }

    /* compiled from: AccessibilityDelegateCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public static AccessibilityNodeProvider a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        public static boolean b(View.AccessibilityDelegate accessibilityDelegate, View view, int i10, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i10, bundle);
        }
    }

    public a() {
        this(c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f31416a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public y0.g b(View view) {
        AccessibilityNodeProvider a10 = b.a(this.f31416a, view);
        if (a10 != null) {
            return new y0.g(a10);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f31416a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, y0.f fVar) {
        this.f31416a.onInitializeAccessibilityNodeInfo(view, fVar.f31951a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f31416a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f31416a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i10, Bundle bundle) {
        boolean z10;
        WeakReference weakReference;
        boolean z11;
        ClickableSpan[] clickableSpanArr;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z12 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= list.size()) {
                break;
            }
            f.a aVar = (f.a) list.get(i11);
            if (aVar.a() == i10) {
                y0.j jVar = aVar.f31966d;
                if (jVar != null) {
                    Class<? extends j.a> cls = aVar.c;
                    if (cls != null) {
                        try {
                            cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]).getClass();
                        } catch (Exception unused) {
                        }
                    }
                    z10 = jVar.a(view);
                }
            } else {
                i11++;
            }
        }
        z10 = false;
        if (!z10) {
            z10 = b.b(this.f31416a, view, i10, bundle);
        }
        if (!z10 && i10 == R.id.accessibility_action_clickable_span && bundle != null) {
            int i12 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i12)) != null) {
                ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
                if (clickableSpan != null) {
                    CharSequence text = view.createAccessibilityNodeInfo().getText();
                    if (text instanceof Spanned) {
                        clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                    } else {
                        clickableSpanArr = null;
                    }
                    for (int i13 = 0; clickableSpanArr != null && i13 < clickableSpanArr.length; i13++) {
                        if (clickableSpan.equals(clickableSpanArr[i13])) {
                            z11 = true;
                            break;
                        }
                    }
                }
                z11 = false;
                if (z11) {
                    clickableSpan.onClick(view);
                    z12 = true;
                }
            }
            return z12;
        }
        return z10;
    }

    public void h(View view, int i10) {
        this.f31416a.sendAccessibilityEvent(view, i10);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f31416a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f31416a = accessibilityDelegate;
        this.f31417b = new C0399a(this);
    }
}
