package io.flutter.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import ff.a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lib.zj.office.fc.hpsf.Variant;

/* loaded from: classes.dex */
public final class AccessibilityBridge extends AccessibilityNodeProvider {

    /* renamed from: a  reason: collision with root package name */
    public final View f18834a;

    /* renamed from: b  reason: collision with root package name */
    public final ff.a f18835b;
    public final AccessibilityManager c;

    /* renamed from: d  reason: collision with root package name */
    public final AccessibilityViewEmbedder f18836d;

    /* renamed from: e  reason: collision with root package name */
    public final io.flutter.plugin.platform.h f18837e;

    /* renamed from: f  reason: collision with root package name */
    public final ContentResolver f18838f;

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f18839g;

    /* renamed from: h  reason: collision with root package name */
    public final HashMap f18840h;

    /* renamed from: i  reason: collision with root package name */
    public h f18841i;

    /* renamed from: j  reason: collision with root package name */
    public Integer f18842j;

    /* renamed from: k  reason: collision with root package name */
    public Integer f18843k;

    /* renamed from: l  reason: collision with root package name */
    public int f18844l;

    /* renamed from: m  reason: collision with root package name */
    public h f18845m;

    /* renamed from: n  reason: collision with root package name */
    public h f18846n;

    /* renamed from: o  reason: collision with root package name */
    public h f18847o;

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList f18848p;

    /* renamed from: q  reason: collision with root package name */
    public int f18849q;

    /* renamed from: r  reason: collision with root package name */
    public Integer f18850r;

    /* renamed from: s  reason: collision with root package name */
    public g f18851s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f18852t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f18853u;

    /* renamed from: v  reason: collision with root package name */
    public final a f18854v;

    /* renamed from: w  reason: collision with root package name */
    public final b f18855w;
    @TargetApi(19)

    /* renamed from: x  reason: collision with root package name */
    public final io.flutter.view.a f18856x;

    /* renamed from: y  reason: collision with root package name */
    public final c f18857y;

    /* renamed from: z  reason: collision with root package name */
    public static final int f18833z = ((Action.SCROLL_RIGHT.value | Action.SCROLL_LEFT.value) | Action.SCROLL_UP.value) | Action.SCROLL_DOWN.value;
    public static final int A = ((((((((((Flag.HAS_CHECKED_STATE.value | Flag.IS_CHECKED.value) | Flag.IS_SELECTED.value) | Flag.IS_TEXT_FIELD.value) | Flag.IS_FOCUSED.value) | Flag.HAS_ENABLED_STATE.value) | Flag.IS_ENABLED.value) | Flag.IS_IN_MUTUALLY_EXCLUSIVE_GROUP.value) | Flag.HAS_TOGGLED_STATE.value) | Flag.IS_TOGGLED.value) | Flag.IS_FOCUSABLE.value) | Flag.IS_SLIDER.value;
    public static final int B = 267386881;

    /* loaded from: classes.dex */
    public enum AccessibilityFeature {
        ACCESSIBLE_NAVIGATION(1),
        INVERT_COLORS(2),
        DISABLE_ANIMATIONS(4),
        BOLD_TEXT(8),
        REDUCE_MOTION(16),
        HIGH_CONTRAST(32),
        ON_OFF_SWITCH_LABELS(64);
        
        final int value;

        AccessibilityFeature(int i10) {
            this.value = i10;
        }
    }

    /* loaded from: classes.dex */
    public enum Action {
        TAP(1),
        LONG_PRESS(2),
        SCROLL_LEFT(4),
        SCROLL_RIGHT(8),
        SCROLL_UP(16),
        SCROLL_DOWN(32),
        INCREASE(64),
        DECREASE(128),
        SHOW_ON_SCREEN(256),
        MOVE_CURSOR_FORWARD_BY_CHARACTER(512),
        MOVE_CURSOR_BACKWARD_BY_CHARACTER(1024),
        SET_SELECTION(2048),
        COPY(4096),
        CUT(8192),
        PASTE(16384),
        DID_GAIN_ACCESSIBILITY_FOCUS(Variant.VT_RESERVED),
        DID_LOSE_ACCESSIBILITY_FOCUS(65536),
        CUSTOM_ACTION(131072),
        DISMISS(262144),
        MOVE_CURSOR_FORWARD_BY_WORD(524288),
        MOVE_CURSOR_BACKWARD_BY_WORD(1048576),
        SET_TEXT(2097152);
        
        public final int value;

        Action(int i10) {
            this.value = i10;
        }
    }

    /* loaded from: classes.dex */
    public enum Flag {
        HAS_CHECKED_STATE(1),
        IS_CHECKED(2),
        IS_SELECTED(4),
        IS_BUTTON(8),
        IS_TEXT_FIELD(16),
        IS_FOCUSED(32),
        HAS_ENABLED_STATE(64),
        IS_ENABLED(128),
        IS_IN_MUTUALLY_EXCLUSIVE_GROUP(256),
        IS_HEADER(512),
        IS_OBSCURED(1024),
        SCOPES_ROUTE(2048),
        NAMES_ROUTE(4096),
        IS_HIDDEN(8192),
        IS_IMAGE(16384),
        IS_LIVE_REGION(Variant.VT_RESERVED),
        HAS_TOGGLED_STATE(65536),
        IS_TOGGLED(131072),
        HAS_IMPLICIT_SCROLLING(262144),
        IS_MULTILINE(524288),
        IS_READ_ONLY(1048576),
        IS_FOCUSABLE(2097152),
        IS_LINK(4194304),
        IS_SLIDER(8388608),
        IS_KEYBOARD_KEY(16777216),
        IS_CHECK_STATE_MIXED(33554432);
        
        final int value;

        Flag(int i10) {
            this.value = i10;
        }
    }

    /* loaded from: classes.dex */
    public enum StringAttributeType {
        SPELLOUT,
        LOCALE
    }

    /* loaded from: classes.dex */
    public enum TextDirection {
        UNKNOWN,
        LTR,
        RTL;

        public static TextDirection fromInt(int i10) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return UNKNOWN;
                }
                return LTR;
            }
            return RTL;
        }
    }

    /* loaded from: classes.dex */
    public class a implements a.b {
        public a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:200:0x040f, code lost:
            if (r11 != 0) goto L236;
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x0222, code lost:
            r13 = r13.getWindow().getAttributes().layoutInDisplayCutoutMode;
         */
        /* JADX WARN: Removed duplicated region for block: B:205:0x0426  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(java.nio.ByteBuffer r17, java.lang.String[] r18, java.nio.ByteBuffer[] r19) {
            /*
                Method dump skipped, instructions count: 1457
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.AccessibilityBridge.a.a(java.nio.ByteBuffer, java.lang.String[], java.nio.ByteBuffer[]):void");
        }
    }

    /* loaded from: classes.dex */
    public class b implements AccessibilityManager.AccessibilityStateChangeListener {
        public b() {
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public final void onAccessibilityStateChanged(boolean z10) {
            AccessibilityBridge accessibilityBridge = AccessibilityBridge.this;
            if (accessibilityBridge.f18853u) {
                return;
            }
            boolean z11 = true;
            ff.a aVar = accessibilityBridge.f18835b;
            if (z10) {
                a aVar2 = accessibilityBridge.f18854v;
                aVar.f17272b = aVar2;
                aVar.f17271a.setAccessibilityDelegate(aVar2);
                aVar.f17271a.setSemanticsEnabled(true);
            } else {
                accessibilityBridge.i(false);
                aVar.f17272b = null;
                aVar.f17271a.setAccessibilityDelegate(null);
                aVar.f17271a.setSemanticsEnabled(false);
            }
            g gVar = accessibilityBridge.f18851s;
            if (gVar != null) {
                boolean isTouchExplorationEnabled = accessibilityBridge.c.isTouchExplorationEnabled();
                int i10 = FlutterView.f18906n;
                FlutterView flutterView = FlutterView.this;
                if (!flutterView.f18917l) {
                    if (z10 || isTouchExplorationEnabled) {
                        z11 = false;
                    }
                    flutterView.setWillNotDraw(z11);
                    return;
                }
                flutterView.setWillNotDraw(false);
            }
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18866a;

        static {
            int[] iArr = new int[StringAttributeType.values().length];
            f18866a = iArr;
            try {
                iArr[StringAttributeType.SPELLOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18866a[StringAttributeType.LOCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public int f18867a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f18868b = -1;
        public int c = -1;

        /* renamed from: d  reason: collision with root package name */
        public String f18869d;

        /* renamed from: e  reason: collision with root package name */
        public String f18870e;
    }

    /* loaded from: classes.dex */
    public static class f extends j {

        /* renamed from: d  reason: collision with root package name */
        public String f18871d;
    }

    /* loaded from: classes.dex */
    public interface g {
    }

    /* loaded from: classes.dex */
    public static class h {
        public int B;
        public int C;
        public int D;
        public int E;
        public float F;
        public String G;
        public String H;
        public float I;
        public float J;
        public float K;
        public float L;
        public float[] M;
        public h N;
        public ArrayList Q;
        public e R;
        public e S;
        public float[] U;
        public float[] W;
        public Rect X;

        /* renamed from: a  reason: collision with root package name */
        public final AccessibilityBridge f18872a;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f18874d;

        /* renamed from: e  reason: collision with root package name */
        public int f18875e;

        /* renamed from: f  reason: collision with root package name */
        public int f18876f;

        /* renamed from: g  reason: collision with root package name */
        public int f18877g;

        /* renamed from: h  reason: collision with root package name */
        public int f18878h;

        /* renamed from: i  reason: collision with root package name */
        public int f18879i;

        /* renamed from: j  reason: collision with root package name */
        public int f18880j;

        /* renamed from: k  reason: collision with root package name */
        public int f18881k;

        /* renamed from: l  reason: collision with root package name */
        public float f18882l;

        /* renamed from: m  reason: collision with root package name */
        public float f18883m;

        /* renamed from: n  reason: collision with root package name */
        public float f18884n;

        /* renamed from: o  reason: collision with root package name */
        public String f18885o;

        /* renamed from: p  reason: collision with root package name */
        public ArrayList f18886p;

        /* renamed from: q  reason: collision with root package name */
        public String f18887q;

        /* renamed from: r  reason: collision with root package name */
        public List<j> f18888r;

        /* renamed from: s  reason: collision with root package name */
        public String f18889s;

        /* renamed from: t  reason: collision with root package name */
        public ArrayList f18890t;

        /* renamed from: u  reason: collision with root package name */
        public String f18891u;

        /* renamed from: v  reason: collision with root package name */
        public ArrayList f18892v;

        /* renamed from: w  reason: collision with root package name */
        public String f18893w;

        /* renamed from: x  reason: collision with root package name */
        public ArrayList f18894x;

        /* renamed from: y  reason: collision with root package name */
        public String f18895y;

        /* renamed from: b  reason: collision with root package name */
        public int f18873b = -1;

        /* renamed from: z  reason: collision with root package name */
        public int f18896z = -1;
        public boolean A = false;
        public final ArrayList O = new ArrayList();
        public final ArrayList P = new ArrayList();
        public boolean T = true;
        public boolean V = true;

        public h(AccessibilityBridge accessibilityBridge) {
            this.f18872a = accessibilityBridge;
        }

        public static boolean a(h hVar, Action action) {
            if ((hVar.f18874d & action.value) != 0) {
                return true;
            }
            return false;
        }

        @TargetApi(21)
        public static SpannableString c(String str, List list) {
            if (str == null) {
                return null;
            }
            SpannableString spannableString = new SpannableString(str);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    j jVar = (j) it.next();
                    int i10 = d.f18866a[jVar.c.ordinal()];
                    if (i10 != 1) {
                        if (i10 == 2) {
                            spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((f) jVar).f18871d)), jVar.f18897a, jVar.f18898b, 0);
                        }
                    } else {
                        spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), jVar.f18897a, jVar.f18898b, 0);
                    }
                }
            }
            return spannableString;
        }

        public static ArrayList e(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
            int i10 = byteBuffer.getInt();
            if (i10 == -1) {
                return null;
            }
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = byteBuffer.getInt();
                int i13 = byteBuffer.getInt();
                StringAttributeType stringAttributeType = StringAttributeType.values()[byteBuffer.getInt()];
                int i14 = d.f18866a[stringAttributeType.ordinal()];
                if (i14 != 1) {
                    if (i14 == 2) {
                        ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                        f fVar = new f();
                        fVar.f18897a = i12;
                        fVar.f18898b = i13;
                        fVar.c = stringAttributeType;
                        fVar.f18871d = Charset.forName("UTF-8").decode(byteBuffer2).toString();
                        arrayList.add(fVar);
                    }
                } else {
                    byteBuffer.getInt();
                    i iVar = new i(0);
                    iVar.f18897a = i12;
                    iVar.f18898b = i13;
                    iVar.c = stringAttributeType;
                    arrayList.add(iVar);
                }
            }
            return arrayList;
        }

        public static void i(float[] fArr, float[] fArr2, float[] fArr3) {
            Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
            float f10 = fArr[3];
            fArr[0] = fArr[0] / f10;
            fArr[1] = fArr[1] / f10;
            fArr[2] = fArr[2] / f10;
            fArr[3] = 0.0f;
        }

        public final void b(ArrayList arrayList) {
            if (f(Flag.SCOPES_ROUTE)) {
                arrayList.add(this);
            }
            Iterator it = this.O.iterator();
            while (it.hasNext()) {
                ((h) it.next()).b(arrayList);
            }
        }

        public final String d() {
            String str;
            if (f(Flag.NAMES_ROUTE) && (str = this.f18885o) != null && !str.isEmpty()) {
                return this.f18885o;
            }
            Iterator it = this.O.iterator();
            while (it.hasNext()) {
                String d10 = ((h) it.next()).d();
                if (d10 != null && !d10.isEmpty()) {
                    return d10;
                }
            }
            return null;
        }

        public final boolean f(Flag flag) {
            if ((flag.value & this.c) != 0) {
                return true;
            }
            return false;
        }

        public final h g(float[] fArr, boolean z10) {
            float f10 = fArr[3];
            boolean z11 = false;
            float f11 = fArr[0] / f10;
            float f12 = fArr[1] / f10;
            if (f11 >= this.I && f11 < this.K && f12 >= this.J && f12 < this.L) {
                float[] fArr2 = new float[4];
                Iterator it = this.P.iterator();
                while (it.hasNext()) {
                    h hVar = (h) it.next();
                    if (!hVar.f(Flag.IS_HIDDEN)) {
                        if (hVar.T) {
                            hVar.T = false;
                            if (hVar.U == null) {
                                hVar.U = new float[16];
                            }
                            if (!Matrix.invertM(hVar.U, 0, hVar.M, 0)) {
                                Arrays.fill(hVar.U, 0.0f);
                            }
                        }
                        Matrix.multiplyMV(fArr2, 0, hVar.U, 0, fArr, 0);
                        h g10 = hVar.g(fArr2, z10);
                        if (g10 != null) {
                            return g10;
                        }
                    }
                }
                if (z10 && this.f18879i != -1) {
                    z11 = true;
                }
                if (h() || z11) {
                    return this;
                }
            }
            return null;
        }

        public final boolean h() {
            String str;
            String str2;
            String str3;
            if (f(Flag.SCOPES_ROUTE)) {
                return false;
            }
            if (f(Flag.IS_FOCUSABLE)) {
                return true;
            }
            if ((this.f18874d & (~AccessibilityBridge.f18833z)) == 0 && (this.c & AccessibilityBridge.A) == 0 && (((str = this.f18885o) == null || str.isEmpty()) && (((str2 = this.f18887q) == null || str2.isEmpty()) && ((str3 = this.f18893w) == null || str3.isEmpty())))) {
                return false;
            }
            return true;
        }

        public final void j(float[] fArr, HashSet hashSet, boolean z10) {
            hashSet.add(this);
            if (this.V) {
                z10 = true;
            }
            if (z10) {
                if (this.W == null) {
                    this.W = new float[16];
                }
                if (this.M == null) {
                    this.M = new float[16];
                }
                Matrix.multiplyMM(this.W, 0, fArr, 0, this.M, 0);
                float[] fArr2 = {this.I, this.J, 0.0f, 1.0f};
                float[] fArr3 = new float[4];
                float[] fArr4 = new float[4];
                float[] fArr5 = new float[4];
                float[] fArr6 = new float[4];
                i(fArr3, this.W, fArr2);
                fArr2[0] = this.K;
                fArr2[1] = this.J;
                i(fArr4, this.W, fArr2);
                fArr2[0] = this.K;
                fArr2[1] = this.L;
                i(fArr5, this.W, fArr2);
                fArr2[0] = this.I;
                fArr2[1] = this.L;
                i(fArr6, this.W, fArr2);
                if (this.X == null) {
                    this.X = new Rect();
                }
                this.X.set(Math.round(Math.min(fArr3[0], Math.min(fArr4[0], Math.min(fArr5[0], fArr6[0])))), Math.round(Math.min(fArr3[1], Math.min(fArr4[1], Math.min(fArr5[1], fArr6[1])))), Math.round(Math.max(fArr3[0], Math.max(fArr4[0], Math.max(fArr5[0], fArr6[0])))), Math.round(Math.max(fArr3[1], Math.max(fArr4[1], Math.max(fArr5[1], fArr6[1])))));
                this.V = false;
            }
            Iterator it = this.O.iterator();
            int i10 = -1;
            while (it.hasNext()) {
                h hVar = (h) it.next();
                hVar.f18896z = i10;
                i10 = hVar.f18873b;
                hVar.j(this.W, hashSet, z10);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class i extends j {
        public i(int i10) {
        }
    }

    /* loaded from: classes.dex */
    public static class j {

        /* renamed from: a  reason: collision with root package name */
        public int f18897a;

        /* renamed from: b  reason: collision with root package name */
        public int f18898b;
        public StringAttributeType c;
    }

    public AccessibilityBridge(View view, ff.a aVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.j jVar) {
        int i10;
        AccessibilityViewEmbedder accessibilityViewEmbedder = new AccessibilityViewEmbedder(view, 65536);
        this.f18839g = new HashMap();
        this.f18840h = new HashMap();
        boolean z10 = false;
        this.f18844l = 0;
        this.f18848p = new ArrayList();
        this.f18849q = 0;
        this.f18850r = 0;
        this.f18852t = false;
        this.f18853u = false;
        this.f18854v = new a();
        b bVar = new b();
        this.f18855w = bVar;
        c cVar = new c(new Handler());
        this.f18857y = cVar;
        this.f18834a = view;
        this.f18835b = aVar;
        this.c = accessibilityManager;
        this.f18838f = contentResolver;
        this.f18836d = accessibilityViewEmbedder;
        this.f18837e = jVar;
        bVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(bVar);
        int i11 = Build.VERSION.SDK_INT;
        io.flutter.view.a aVar2 = new io.flutter.view.a(this, accessibilityManager);
        this.f18856x = aVar2;
        aVar2.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(aVar2);
        cVar.onChange(false, null);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, cVar);
        if (i11 >= 31 && view != null && view.getResources() != null) {
            i10 = view.getResources().getConfiguration().fontWeightAdjustment;
            if (i10 != Integer.MAX_VALUE && i10 >= 300) {
                z10 = true;
            }
            if (z10) {
                this.f18844l |= AccessibilityFeature.BOLD_TEXT.value;
            } else {
                this.f18844l &= AccessibilityFeature.BOLD_TEXT.value;
            }
            aVar.f17271a.setAccessibilityFeatures(this.f18844l);
        }
        jVar.f18817g.f18796a = this;
    }

    @SuppressLint({"SwitchIntDef"})
    public final boolean a(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        AccessibilityViewEmbedder accessibilityViewEmbedder = this.f18836d;
        if (!accessibilityViewEmbedder.requestSendAccessibilityEvent(view, view2, accessibilityEvent) || (recordFlutterId = accessibilityViewEmbedder.getRecordFlutterId(view, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType != 8) {
            if (eventType != 128) {
                if (eventType != 32768) {
                    if (eventType == 65536) {
                        this.f18843k = null;
                        this.f18842j = null;
                        return true;
                    }
                    return true;
                }
                this.f18842j = recordFlutterId;
                this.f18841i = null;
                return true;
            }
            this.f18847o = null;
            return true;
        }
        this.f18843k = recordFlutterId;
        this.f18845m = null;
        return true;
    }

    public final e b(int i10) {
        HashMap hashMap = this.f18840h;
        e eVar = (e) hashMap.get(Integer.valueOf(i10));
        if (eVar == null) {
            e eVar2 = new e();
            eVar2.f18868b = i10;
            eVar2.f18867a = B + i10;
            hashMap.put(Integer.valueOf(i10), eVar2);
            return eVar2;
        }
        return eVar;
    }

    public final h c(int i10) {
        HashMap hashMap = this.f18839g;
        h hVar = (h) hashMap.get(Integer.valueOf(i10));
        if (hVar == null) {
            h hVar2 = new h(this);
            hVar2.f18873b = i10;
            hashMap.put(Integer.valueOf(i10), hVar2);
            return hVar2;
        }
        return hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:233:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0498  */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int r19) {
        /*
            Method dump skipped, instructions count: 1222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.AccessibilityBridge.createAccessibilityNodeInfo(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    public final AccessibilityEvent d(int i10, int i11) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i11);
        View view = this.f18834a;
        obtain.setPackageName(view.getContext().getPackageName());
        obtain.setSource(view, i10);
        return obtain;
    }

    public final boolean e(MotionEvent motionEvent, boolean z10) {
        h g10;
        if (!this.c.isTouchExplorationEnabled()) {
            return false;
        }
        HashMap hashMap = this.f18839g;
        if (hashMap.isEmpty()) {
            return false;
        }
        h g11 = ((h) hashMap.get(0)).g(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z10);
        if (g11 != null && g11.f18879i != -1) {
            if (z10) {
                return false;
            }
            return this.f18836d.onAccessibilityHoverEvent(g11.f18873b, motionEvent);
        }
        if (motionEvent.getAction() != 9 && motionEvent.getAction() != 7) {
            if (motionEvent.getAction() == 10) {
                h hVar = this.f18847o;
                if (hVar != null) {
                    g(hVar.f18873b, 256);
                    this.f18847o = null;
                }
            } else {
                motionEvent.toString();
                return false;
            }
        } else {
            float x4 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (!hashMap.isEmpty() && (g10 = ((h) hashMap.get(0)).g(new float[]{x4, y10, 0.0f, 1.0f}, z10)) != this.f18847o) {
                if (g10 != null) {
                    g(g10.f18873b, 128);
                }
                h hVar2 = this.f18847o;
                if (hVar2 != null) {
                    g(hVar2.f18873b, 256);
                }
                this.f18847o = g10;
            }
        }
        return true;
    }

    @TargetApi(18)
    public final boolean f(h hVar, int i10, Bundle bundle, boolean z10) {
        int i11;
        int i12 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z11 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i13 = hVar.f18877g;
        int i14 = hVar.f18878h;
        if (i14 >= 0 && i13 >= 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 4) {
                        if (i12 == 8 || i12 == 16) {
                            if (z10) {
                                hVar.f18878h = hVar.f18887q.length();
                            } else {
                                hVar.f18878h = 0;
                            }
                        }
                    } else if (z10 && i14 < hVar.f18887q.length()) {
                        Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(hVar.f18887q.substring(hVar.f18878h));
                        if (matcher.find()) {
                            hVar.f18878h += matcher.start(1);
                        } else {
                            hVar.f18878h = hVar.f18887q.length();
                        }
                    } else if (!z10 && hVar.f18878h > 0) {
                        Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(hVar.f18887q.substring(0, hVar.f18878h));
                        if (matcher2.find()) {
                            hVar.f18878h = matcher2.start(1);
                        } else {
                            hVar.f18878h = 0;
                        }
                    }
                } else if (z10 && i14 < hVar.f18887q.length()) {
                    Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(hVar.f18887q.substring(hVar.f18878h));
                    matcher3.find();
                    if (matcher3.find()) {
                        hVar.f18878h += matcher3.start(1);
                    } else {
                        hVar.f18878h = hVar.f18887q.length();
                    }
                } else if (!z10 && hVar.f18878h > 0) {
                    Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(hVar.f18887q.substring(0, hVar.f18878h));
                    if (matcher4.find()) {
                        hVar.f18878h = matcher4.start(1);
                    }
                }
            } else if (z10 && i14 < hVar.f18887q.length()) {
                hVar.f18878h++;
            } else if (!z10 && (i11 = hVar.f18878h) > 0) {
                hVar.f18878h = i11 - 1;
            }
            if (!z11) {
                hVar.f18877g = hVar.f18878h;
            }
        }
        if (i13 != hVar.f18877g || i14 != hVar.f18878h) {
            String str = hVar.f18887q;
            if (str == null) {
                str = "";
            }
            AccessibilityEvent d10 = d(hVar.f18873b, 8192);
            d10.getText().add(str);
            d10.setFromIndex(hVar.f18877g);
            d10.setToIndex(hVar.f18878h);
            d10.setItemCount(str.length());
            h(d10);
        }
        ff.a aVar = this.f18835b;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 4 || i12 == 8 || i12 == 16) {
                    return true;
                }
            } else {
                if (z10) {
                    Action action = Action.MOVE_CURSOR_FORWARD_BY_WORD;
                    if (h.a(hVar, action)) {
                        aVar.b(i10, action, Boolean.valueOf(z11));
                        return true;
                    }
                }
                if (!z10) {
                    Action action2 = Action.MOVE_CURSOR_BACKWARD_BY_WORD;
                    if (h.a(hVar, action2)) {
                        aVar.b(i10, action2, Boolean.valueOf(z11));
                        return true;
                    }
                }
            }
        } else {
            if (z10) {
                Action action3 = Action.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (h.a(hVar, action3)) {
                    aVar.b(i10, action3, Boolean.valueOf(z11));
                    return true;
                }
            }
            if (!z10) {
                Action action4 = Action.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
                if (h.a(hVar, action4)) {
                    aVar.b(i10, action4, Boolean.valueOf(z11));
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return null;
            }
        } else {
            h hVar = this.f18845m;
            if (hVar != null) {
                return createAccessibilityNodeInfo(hVar.f18873b);
            }
            Integer num = this.f18843k;
            if (num != null) {
                return createAccessibilityNodeInfo(num.intValue());
            }
        }
        h hVar2 = this.f18841i;
        if (hVar2 != null) {
            return createAccessibilityNodeInfo(hVar2.f18873b);
        }
        Integer num2 = this.f18842j;
        if (num2 != null) {
            return createAccessibilityNodeInfo(num2.intValue());
        }
        return null;
    }

    public final void g(int i10, int i11) {
        if (!this.c.isEnabled()) {
            return;
        }
        h(d(i10, i11));
    }

    public final void h(AccessibilityEvent accessibilityEvent) {
        if (!this.c.isEnabled()) {
            return;
        }
        View view = this.f18834a;
        view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public final void i(boolean z10) {
        if (this.f18852t == z10) {
            return;
        }
        this.f18852t = z10;
        if (z10) {
            this.f18844l |= AccessibilityFeature.ACCESSIBLE_NAVIGATION.value;
        } else {
            this.f18844l &= ~AccessibilityFeature.ACCESSIBLE_NAVIGATION.value;
        }
        this.f18835b.f17271a.setAccessibilityFeatures(this.f18844l);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j(io.flutter.view.AccessibilityBridge.h r6) {
        /*
            r5 = this;
            int r0 = r6.f18880j
            r1 = 0
            if (r0 <= 0) goto L3f
            io.flutter.view.AccessibilityBridge$h r0 = r5.f18841i
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L1f
            io.flutter.view.AccessibilityBridge$h r0 = r0.N
        Ld:
            if (r0 == 0) goto L1a
            if (r0 != r6) goto L13
            r4 = r3
            goto L14
        L13:
            r4 = r1
        L14:
            if (r4 == 0) goto L17
            goto L1b
        L17:
            io.flutter.view.AccessibilityBridge$h r0 = r0.N
            goto Ld
        L1a:
            r0 = r2
        L1b:
            if (r0 == 0) goto L1f
            r6 = r3
            goto L20
        L1f:
            r6 = r1
        L20:
            if (r6 != 0) goto L3e
            io.flutter.view.AccessibilityBridge$h r6 = r5.f18841i
            if (r6 == 0) goto L3b
            io.flutter.view.AccessibilityBridge$h r6 = r6.N
        L28:
            if (r6 == 0) goto L37
            io.flutter.view.AccessibilityBridge$Flag r0 = io.flutter.view.AccessibilityBridge.Flag.HAS_IMPLICIT_SCROLLING
            boolean r0 = r6.f(r0)
            if (r0 == 0) goto L34
            r2 = r6
            goto L37
        L34:
            io.flutter.view.AccessibilityBridge$h r6 = r6.N
            goto L28
        L37:
            if (r2 == 0) goto L3b
            r6 = r3
            goto L3c
        L3b:
            r6 = r1
        L3c:
            if (r6 != 0) goto L3f
        L3e:
            r1 = r3
        L3f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.AccessibilityBridge.j(io.flutter.view.AccessibilityBridge$h):boolean");
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        String str;
        if (i10 >= 65536) {
            boolean performAction = this.f18836d.performAction(i10, i11, bundle);
            if (performAction && i11 == 128) {
                this.f18842j = null;
            }
            return performAction;
        }
        HashMap hashMap = this.f18839g;
        h hVar = (h) hashMap.get(Integer.valueOf(i10));
        boolean z10 = false;
        if (hVar == null) {
            return false;
        }
        ff.a aVar = this.f18835b;
        switch (i11) {
            case 16:
                aVar.a(i10, Action.TAP);
                return true;
            case 32:
                aVar.a(i10, Action.LONG_PRESS);
                return true;
            case 64:
                if (this.f18841i == null) {
                    this.f18834a.invalidate();
                }
                this.f18841i = hVar;
                aVar.a(i10, Action.DID_GAIN_ACCESSIBILITY_FOCUS);
                g(i10, Variant.VT_RESERVED);
                if (h.a(hVar, Action.INCREASE) || h.a(hVar, Action.DECREASE)) {
                    g(i10, 4);
                }
                return true;
            case 128:
                h hVar2 = this.f18841i;
                if (hVar2 != null && hVar2.f18873b == i10) {
                    this.f18841i = null;
                }
                Integer num = this.f18842j;
                if (num != null && num.intValue() == i10) {
                    this.f18842j = null;
                }
                aVar.a(i10, Action.DID_LOSE_ACCESSIBILITY_FOCUS);
                g(i10, 65536);
                return true;
            case 256:
                return f(hVar, i10, bundle, true);
            case 512:
                return f(hVar, i10, bundle, false);
            case 4096:
                Action action = Action.SCROLL_UP;
                if (h.a(hVar, action)) {
                    aVar.a(i10, action);
                } else {
                    Action action2 = Action.SCROLL_LEFT;
                    if (h.a(hVar, action2)) {
                        aVar.a(i10, action2);
                    } else {
                        Action action3 = Action.INCREASE;
                        if (!h.a(hVar, action3)) {
                            return false;
                        }
                        hVar.f18887q = hVar.f18889s;
                        hVar.f18888r = hVar.f18890t;
                        g(i10, 4);
                        aVar.a(i10, action3);
                    }
                }
                return true;
            case 8192:
                Action action4 = Action.SCROLL_DOWN;
                if (h.a(hVar, action4)) {
                    aVar.a(i10, action4);
                } else {
                    Action action5 = Action.SCROLL_RIGHT;
                    if (h.a(hVar, action5)) {
                        aVar.a(i10, action5);
                    } else {
                        Action action6 = Action.DECREASE;
                        if (!h.a(hVar, action6)) {
                            return false;
                        }
                        hVar.f18887q = hVar.f18891u;
                        hVar.f18888r = hVar.f18892v;
                        g(i10, 4);
                        aVar.a(i10, action6);
                    }
                }
                return true;
            case 16384:
                aVar.a(i10, Action.COPY);
                return true;
            case Variant.VT_RESERVED /* 32768 */:
                aVar.a(i10, Action.PASTE);
                return true;
            case 65536:
                aVar.a(i10, Action.CUT);
                return true;
            case 131072:
                HashMap hashMap2 = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    z10 = true;
                }
                if (z10) {
                    hashMap2.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    hashMap2.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                } else {
                    hashMap2.put("base", Integer.valueOf(hVar.f18878h));
                    hashMap2.put("extent", Integer.valueOf(hVar.f18878h));
                }
                aVar.b(i10, Action.SET_SELECTION, hashMap2);
                h hVar3 = (h) hashMap.get(Integer.valueOf(i10));
                hVar3.f18877g = ((Integer) hashMap2.get("base")).intValue();
                hVar3.f18878h = ((Integer) hashMap2.get("extent")).intValue();
                return true;
            case 1048576:
                aVar.a(i10, Action.DISMISS);
                return true;
            case 2097152:
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) {
                    str = bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                } else {
                    str = "";
                }
                aVar.b(i10, Action.SET_TEXT, str);
                hVar.f18887q = str;
                hVar.f18888r = null;
                return true;
            case 16908342:
                aVar.a(i10, Action.SHOW_ON_SCREEN);
                return true;
            default:
                e eVar = (e) this.f18840h.get(Integer.valueOf(i11 - B));
                if (eVar == null) {
                    return false;
                }
                aVar.b(i10, Action.CUSTOM_ACTION, Integer.valueOf(eVar.f18868b));
                return true;
        }
    }

    /* loaded from: classes.dex */
    public class c extends ContentObserver {
        public c(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z10, Uri uri) {
            AccessibilityBridge accessibilityBridge = AccessibilityBridge.this;
            if (accessibilityBridge.f18853u) {
                return;
            }
            String string = Settings.Global.getString(accessibilityBridge.f18838f, "transition_animation_scale");
            if (string != null && string.equals(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES)) {
                accessibilityBridge.f18844l = AccessibilityFeature.DISABLE_ANIMATIONS.value | accessibilityBridge.f18844l;
            } else {
                accessibilityBridge.f18844l = (~AccessibilityFeature.DISABLE_ANIMATIONS.value) & accessibilityBridge.f18844l;
            }
            accessibilityBridge.f18835b.f17271a.setAccessibilityFeatures(accessibilityBridge.f18844l);
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z10) {
            onChange(z10, null);
        }
    }
}
