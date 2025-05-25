package y0;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.emoji2.text.r;
import androidx.lifecycle.c0;
import bb.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l.m;
import lib.zj.office.fc.hpsf.Variant;
import y0.j;

/* compiled from: AccessibilityNodeInfoCompat.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: d  reason: collision with root package name */
    public static int f31950d;

    /* renamed from: a  reason: collision with root package name */
    public final AccessibilityNodeInfo f31951a;

    /* renamed from: b  reason: collision with root package name */
    public int f31952b = -1;
    public int c = -1;

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: e  reason: collision with root package name */
        public static final a f31953e = new a(1);

        /* renamed from: f  reason: collision with root package name */
        public static final a f31954f = new a(2);

        /* renamed from: g  reason: collision with root package name */
        public static final a f31955g;

        /* renamed from: h  reason: collision with root package name */
        public static final a f31956h;

        /* renamed from: i  reason: collision with root package name */
        public static final a f31957i;

        /* renamed from: j  reason: collision with root package name */
        public static final a f31958j;

        /* renamed from: k  reason: collision with root package name */
        public static final a f31959k;

        /* renamed from: l  reason: collision with root package name */
        public static final a f31960l;

        /* renamed from: m  reason: collision with root package name */
        public static final a f31961m;

        /* renamed from: n  reason: collision with root package name */
        public static final a f31962n;

        /* renamed from: o  reason: collision with root package name */
        public static final a f31963o;

        /* renamed from: a  reason: collision with root package name */
        public final Object f31964a;

        /* renamed from: b  reason: collision with root package name */
        public final int f31965b;
        public final Class<? extends j.a> c;

        /* renamed from: d  reason: collision with root package name */
        public final j f31966d;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
            new a(4);
            new a(8);
            f31955g = new a(16);
            new a(32);
            new a(64);
            new a(128);
            new a(256, j.b.class);
            new a(512, j.b.class);
            new a(1024, j.c.class);
            new a(2048, j.c.class);
            f31956h = new a(4096);
            f31957i = new a(8192);
            new a(16384);
            new a(Variant.VT_RESERVED);
            new a(65536);
            new a(131072, j.g.class);
            f31958j = new a(262144);
            f31959k = new a(524288);
            f31960l = new a(1048576);
            new a(2097152, j.h.class);
            int i10 = Build.VERSION.SDK_INT;
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null, null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, null, j.e.class);
            f31961m = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null, null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null, null);
            f31962n = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null, null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null, null);
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction20 = null;
            if (i10 >= 29) {
                accessibilityAction = com.google.android.gms.internal.ads.f.c();
            } else {
                accessibilityAction = null;
            }
            new a(accessibilityAction, 16908358, null, null, null);
            if (i10 >= 29) {
                accessibilityAction2 = c0.d();
            } else {
                accessibilityAction2 = null;
            }
            new a(accessibilityAction2, 16908359, null, null, null);
            if (i10 >= 29) {
                accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
            } else {
                accessibilityAction3 = null;
            }
            new a(accessibilityAction3, 16908360, null, null, null);
            if (i10 >= 29) {
                accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
                accessibilityAction4 = accessibilityAction19;
            } else {
                accessibilityAction4 = null;
            }
            new a(accessibilityAction4, 16908361, null, null, null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null, null);
            if (i10 >= 24) {
                accessibilityAction5 = r.g();
            } else {
                accessibilityAction5 = null;
            }
            f31963o = new a(accessibilityAction5, 16908349, null, null, j.f.class);
            if (i10 >= 26) {
                accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
                accessibilityAction6 = accessibilityAction18;
            } else {
                accessibilityAction6 = null;
            }
            new a(accessibilityAction6, 16908354, null, null, j.d.class);
            if (i10 >= 28) {
                accessibilityAction7 = androidx.window.layout.g.f();
            } else {
                accessibilityAction7 = null;
            }
            new a(accessibilityAction7, 16908356, null, null, null);
            if (i10 >= 28) {
                accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
                accessibilityAction8 = accessibilityAction17;
            } else {
                accessibilityAction8 = null;
            }
            new a(accessibilityAction8, 16908357, null, null, null);
            if (i10 >= 30) {
                accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
            } else {
                accessibilityAction9 = null;
            }
            new a(accessibilityAction9, 16908362, null, null, null);
            if (i10 >= 30) {
                accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
                accessibilityAction10 = accessibilityAction16;
            } else {
                accessibilityAction10 = null;
            }
            new a(accessibilityAction10, 16908372, null, null, null);
            if (i10 >= 32) {
                accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
            } else {
                accessibilityAction11 = null;
            }
            new a(accessibilityAction11, 16908373, null, null, null);
            if (i10 >= 32) {
                accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
                accessibilityAction12 = accessibilityAction15;
            } else {
                accessibilityAction12 = null;
            }
            new a(accessibilityAction12, 16908374, null, null, null);
            if (i10 >= 32) {
                accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
                accessibilityAction13 = accessibilityAction14;
            } else {
                accessibilityAction13 = null;
            }
            new a(accessibilityAction13, 16908375, null, null, null);
            if (i10 >= 33) {
                accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            }
            new a(accessibilityAction20, 16908376, null, null, null);
        }

        public a(int i10) {
            this(null, i10, null, null, null);
        }

        public final int a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f31964a).getId();
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            Object obj2 = ((a) obj).f31964a;
            Object obj3 = this.f31964a;
            if (obj3 == null) {
                if (obj2 != null) {
                    return false;
                }
                return true;
            } else if (!obj3.equals(obj2)) {
                return false;
            } else {
                return true;
            }
        }

        public final int hashCode() {
            Object obj = this.f31964a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public a(int i10, Class cls) {
            this(null, i10, null, null, cls);
        }

        public a(Object obj, int i10, String str, j jVar, Class cls) {
            this.f31965b = i10;
            this.f31966d = jVar;
            if (obj == null) {
                this.f31964a = new AccessibilityNodeInfo.AccessibilityAction(i10, str);
            } else {
                this.f31964a = obj;
            }
            this.c = cls;
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Object f31967a;

        public b(AccessibilityNodeInfo.CollectionInfo collectionInfo) {
            this.f31967a = collectionInfo;
        }

        public static b a(int i10, int i11, int i12) {
            return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, false, i12));
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final Object f31968a;

        public c(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
            this.f31968a = collectionItemInfo;
        }

        public static c a(int i10, int i11, int i12, boolean z10, boolean z11, int i13) {
            return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
        }
    }

    public f(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f31951a = accessibilityNodeInfo;
    }

    public final void a(int i10) {
        this.f31951a.addAction(i10);
    }

    public final void b(a aVar) {
        this.f31951a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f31964a);
    }

    public final ArrayList c(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f31951a;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    @Deprecated
    public final void d(Rect rect) {
        this.f31951a.getBoundsInParent(rect);
    }

    public final CharSequence e() {
        boolean z10 = !c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.f31951a;
        if (z10) {
            ArrayList c10 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            ArrayList c11 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            ArrayList c12 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            ArrayList c13 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
            for (int i10 = 0; i10 < c10.size(); i10++) {
                spannableString.setSpan(new y0.a(((Integer) c13.get(i10)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) c10.get(i10)).intValue(), ((Integer) c11.get(i10)).intValue(), ((Integer) c12.get(i10)).intValue());
            }
            return spannableString;
        }
        return accessibilityNodeInfo.getText();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f31951a;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.f31951a;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        if (this.c == fVar.c && this.f31952b == fVar.f31952b) {
            return true;
        }
        return false;
    }

    public final void f(int i10, boolean z10) {
        Bundle extras = this.f31951a.getExtras();
        if (extras != null) {
            int i11 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    @Deprecated
    public final void g(Rect rect) {
        this.f31951a.setBoundsInParent(rect);
    }

    public final void h(CharSequence charSequence) {
        this.f31951a.setClassName(charSequence);
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f31951a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final void i(c cVar) {
        this.f31951a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) cVar.f31968a);
    }

    public final void j(CharSequence charSequence) {
        this.f31951a.setContentDescription(charSequence);
    }

    public final void k(String str) {
        int i10 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f31951a;
        if (i10 >= 26) {
            k.q(accessibilityNodeInfo, str);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", str);
        }
    }

    public final void l(boolean z10) {
        this.f31951a.setScrollable(z10);
    }

    public final void m(CharSequence charSequence) {
        this.f31951a.setText(charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    public final String toString() {
        String string;
        ?? emptyList;
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        d(rect);
        sb2.append("; boundsInParent: " + rect);
        AccessibilityNodeInfo accessibilityNodeInfo = this.f31951a;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb2.append("; boundsInScreen: " + rect);
        sb2.append("; packageName: ");
        sb2.append(accessibilityNodeInfo.getPackageName());
        sb2.append("; className: ");
        sb2.append(accessibilityNodeInfo.getClassName());
        sb2.append("; text: ");
        sb2.append(e());
        sb2.append("; contentDescription: ");
        sb2.append(accessibilityNodeInfo.getContentDescription());
        sb2.append("; viewId: ");
        sb2.append(accessibilityNodeInfo.getViewIdResourceName());
        sb2.append("; uniqueId: ");
        if (s0.a.b()) {
            string = m.a(accessibilityNodeInfo);
        } else {
            string = accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        }
        sb2.append(string);
        sb2.append("; checkable: ");
        sb2.append(accessibilityNodeInfo.isCheckable());
        sb2.append("; checked: ");
        sb2.append(accessibilityNodeInfo.isChecked());
        sb2.append("; focusable: ");
        sb2.append(accessibilityNodeInfo.isFocusable());
        sb2.append("; focused: ");
        sb2.append(accessibilityNodeInfo.isFocused());
        sb2.append("; selected: ");
        sb2.append(accessibilityNodeInfo.isSelected());
        sb2.append("; clickable: ");
        sb2.append(accessibilityNodeInfo.isClickable());
        sb2.append("; longClickable: ");
        sb2.append(accessibilityNodeInfo.isLongClickable());
        sb2.append("; enabled: ");
        sb2.append(accessibilityNodeInfo.isEnabled());
        sb2.append("; password: ");
        sb2.append(accessibilityNodeInfo.isPassword());
        sb2.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb2.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        if (actionList != null) {
            emptyList = new ArrayList();
            int size = actionList.size();
            for (int i10 = 0; i10 < size; i10++) {
                emptyList.add(new a(actionList.get(i10), 0, null, null, null));
            }
        } else {
            emptyList = Collections.emptyList();
        }
        for (int i11 = 0; i11 < emptyList.size(); i11++) {
            a aVar = (a) emptyList.get(i11);
            int a10 = aVar.a();
            if (a10 != 1) {
                if (a10 != 2) {
                    switch (a10) {
                        case 4:
                            str = "ACTION_SELECT";
                            break;
                        case 8:
                            str = "ACTION_CLEAR_SELECTION";
                            break;
                        case 16:
                            str = "ACTION_CLICK";
                            break;
                        case 32:
                            str = "ACTION_LONG_CLICK";
                            break;
                        case 64:
                            str = "ACTION_ACCESSIBILITY_FOCUS";
                            break;
                        case 128:
                            str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                            break;
                        case 256:
                            str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                            break;
                        case 512:
                            str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                            break;
                        case 1024:
                            str = "ACTION_NEXT_HTML_ELEMENT";
                            break;
                        case 2048:
                            str = "ACTION_PREVIOUS_HTML_ELEMENT";
                            break;
                        case 4096:
                            str = "ACTION_SCROLL_FORWARD";
                            break;
                        case 8192:
                            str = "ACTION_SCROLL_BACKWARD";
                            break;
                        case 16384:
                            str = "ACTION_COPY";
                            break;
                        case Variant.VT_RESERVED /* 32768 */:
                            str = "ACTION_PASTE";
                            break;
                        case 65536:
                            str = "ACTION_CUT";
                            break;
                        case 131072:
                            str = "ACTION_SET_SELECTION";
                            break;
                        case 262144:
                            str = "ACTION_EXPAND";
                            break;
                        case 524288:
                            str = "ACTION_COLLAPSE";
                            break;
                        case 2097152:
                            str = "ACTION_SET_TEXT";
                            break;
                        case 16908354:
                            str = "ACTION_MOVE_WINDOW";
                            break;
                        default:
                            switch (a10) {
                                case 16908342:
                                    str = "ACTION_SHOW_ON_SCREEN";
                                    break;
                                case 16908343:
                                    str = "ACTION_SCROLL_TO_POSITION";
                                    break;
                                case 16908344:
                                    str = "ACTION_SCROLL_UP";
                                    break;
                                case 16908345:
                                    str = "ACTION_SCROLL_LEFT";
                                    break;
                                case 16908346:
                                    str = "ACTION_SCROLL_DOWN";
                                    break;
                                case 16908347:
                                    str = "ACTION_SCROLL_RIGHT";
                                    break;
                                case 16908348:
                                    str = "ACTION_CONTEXT_CLICK";
                                    break;
                                case 16908349:
                                    str = "ACTION_SET_PROGRESS";
                                    break;
                                default:
                                    switch (a10) {
                                        case 16908356:
                                            str = "ACTION_SHOW_TOOLTIP";
                                            break;
                                        case 16908357:
                                            str = "ACTION_HIDE_TOOLTIP";
                                            break;
                                        case 16908358:
                                            str = "ACTION_PAGE_UP";
                                            break;
                                        case 16908359:
                                            str = "ACTION_PAGE_DOWN";
                                            break;
                                        case 16908360:
                                            str = "ACTION_PAGE_LEFT";
                                            break;
                                        case 16908361:
                                            str = "ACTION_PAGE_RIGHT";
                                            break;
                                        case 16908362:
                                            str = "ACTION_PRESS_AND_HOLD";
                                            break;
                                        default:
                                            switch (a10) {
                                                case 16908372:
                                                    str = "ACTION_IME_ENTER";
                                                    break;
                                                case 16908373:
                                                    str = "ACTION_DRAG_START";
                                                    break;
                                                case 16908374:
                                                    str = "ACTION_DRAG_DROP";
                                                    break;
                                                case 16908375:
                                                    str = "ACTION_DRAG_CANCEL";
                                                    break;
                                                default:
                                                    str = "ACTION_UNKNOWN";
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    str = "ACTION_CLEAR_FOCUS";
                }
            } else {
                str = "ACTION_FOCUS";
            }
            if (str.equals("ACTION_UNKNOWN")) {
                Object obj = aVar.f31964a;
                if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                    str = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
                }
            }
            sb2.append(str);
            if (i11 != emptyList.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
