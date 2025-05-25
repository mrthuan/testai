package com.google.android.material.search;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.y0;
import androidx.appcompat.widget.z0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.search.SearchView;
import d9.f;
import d9.g;
import d9.h;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p0.a;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import u4.j;
import w8.s;
import w8.t;
import w8.w;
import x0.f0;
import x0.n0;
import x0.s0;
import x0.u;

/* loaded from: classes2.dex */
public class SearchView extends FrameLayout implements CoordinatorLayout.b {
    public static final /* synthetic */ int A = 0;

    /* renamed from: a */
    public final View f12803a;

    /* renamed from: b */
    public final ClippableRoundedCornerLayout f12804b;
    public final View c;

    /* renamed from: d */
    public final View f12805d;

    /* renamed from: e */
    public final FrameLayout f12806e;

    /* renamed from: f */
    public final FrameLayout f12807f;

    /* renamed from: g */
    public final MaterialToolbar f12808g;

    /* renamed from: h */
    public final Toolbar f12809h;

    /* renamed from: i */
    public final TextView f12810i;

    /* renamed from: j */
    public final EditText f12811j;

    /* renamed from: k */
    public final ImageButton f12812k;

    /* renamed from: l */
    public final View f12813l;

    /* renamed from: m */
    public final TouchObserverFrameLayout f12814m;

    /* renamed from: n */
    public final boolean f12815n;

    /* renamed from: o */
    public final e f12816o;

    /* renamed from: p */
    public final t8.a f12817p;

    /* renamed from: q */
    public final LinkedHashSet f12818q;

    /* renamed from: r */
    public SearchBar f12819r;

    /* renamed from: s */
    public int f12820s;

    /* renamed from: t */
    public boolean f12821t;

    /* renamed from: u */
    public boolean f12822u;

    /* renamed from: v */
    public boolean f12823v;

    /* renamed from: w */
    public boolean f12824w;

    /* renamed from: x */
    public boolean f12825x;

    /* renamed from: y */
    public TransitionState f12826y;

    /* renamed from: z */
    public HashMap f12827z;

    /* loaded from: classes2.dex */
    public static class Behavior extends CoordinatorLayout.c<SearchView> {
        public Behavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean d(CoordinatorLayout coordinatorLayout, SearchView searchView, View view) {
            boolean z10;
            SearchView searchView2 = searchView;
            if (searchView2.f12819r != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && (view instanceof SearchBar)) {
                searchView2.setupWithSearchBar((SearchBar) view);
            }
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes2.dex */
    public enum TransitionState {
        HIDING,
        HIDDEN,
        SHOWING,
        SHOWN
    }

    /* loaded from: classes2.dex */
    public static class a extends c1.a {
        public static final Parcelable.Creator<a> CREATOR = new C0171a();
        public String c;

        /* renamed from: d */
        public int f12829d;

        /* renamed from: com.google.android.material.search.SearchView$a$a */
        /* loaded from: classes2.dex */
        public class C0171a implements Parcelable.ClassLoaderCreator<a> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new a[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new a(parcel, null);
            }
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readString();
            this.f12829d = parcel.readInt();
        }

        @Override // c1.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f5506a, i10);
            parcel.writeString(this.c);
            parcel.writeInt(this.f12829d);
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a();
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(SearchView searchView, s0 s0Var) {
        boolean z10;
        searchView.getClass();
        int e10 = s0Var.e();
        searchView.setUpStatusBarSpacer(e10);
        if (!searchView.f12825x) {
            if (e10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            searchView.setStatusBarSpacerEnabledInternal(z10);
        }
    }

    private Window getActivityWindow() {
        Activity activity;
        Context context = getContext();
        while (true) {
            if (context instanceof ContextWrapper) {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                activity = null;
                break;
            }
        }
        if (activity == null) {
            return null;
        }
        return activity.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.f12819r;
        if (searchBar != null) {
            return searchBar.getCompatElevation();
        }
        return getResources().getDimension(R.dimen.m3_searchview_elevation);
    }

    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private void setStatusBarSpacerEnabledInternal(boolean z10) {
        int i10;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f12805d.setVisibility(i10);
    }

    private void setUpBackgroundViewElevationOverlay(float f10) {
        View view;
        t8.a aVar = this.f12817p;
        if (aVar != null && (view = this.c) != null) {
            view.setBackgroundColor(aVar.a(f10, aVar.f29973d));
        }
    }

    private void setUpHeaderLayout(int i10) {
        if (i10 != -1) {
            LayoutInflater from = LayoutInflater.from(getContext());
            FrameLayout frameLayout = this.f12806e;
            frameLayout.addView(from.inflate(i10, (ViewGroup) frameLayout, false));
            frameLayout.setVisibility(0);
        }
    }

    private void setUpStatusBarSpacer(int i10) {
        View view = this.f12805d;
        if (view.getLayoutParams().height != i10) {
            view.getLayoutParams().height = i10;
            view.requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.f12815n) {
            this.f12814m.addView(view, i10, layoutParams);
        } else {
            super.addView(view, i10, layoutParams);
        }
    }

    public final void b() {
        this.f12811j.post(new z0(this, 2));
    }

    public final boolean c() {
        if (this.f12820s == 48) {
            return true;
        }
        return false;
    }

    public final void d() {
        if (this.f12823v) {
            this.f12811j.postDelayed(new y0(this, 4), 100L);
        }
    }

    @SuppressLint({"InlinedApi"})
    public final void e(ViewGroup viewGroup, boolean z10) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != this) {
                if (childAt.findViewById(this.f12804b.getId()) != null) {
                    e((ViewGroup) childAt, z10);
                } else if (!z10) {
                    HashMap hashMap = this.f12827z;
                    if (hashMap != null && hashMap.containsKey(childAt)) {
                        int intValue = ((Integer) this.f12827z.get(childAt)).intValue();
                        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                        f0.d.s(childAt, intValue);
                    }
                } else {
                    this.f12827z.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    WeakHashMap<View, n0> weakHashMap2 = f0.f31435a;
                    f0.d.s(childAt, 4);
                }
            }
        }
    }

    public final void f() {
        int i10;
        ImageButton b10 = t.b(this.f12808g);
        if (b10 == null) {
            return;
        }
        if (this.f12804b.getVisibility() == 0) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        Drawable d10 = p0.a.d(b10.getDrawable());
        if (d10 instanceof n.d) {
            n.d dVar = (n.d) d10;
            float f10 = i10;
            if (dVar.f22267i != f10) {
                dVar.f22267i = f10;
                dVar.invalidateSelf();
            }
        }
        if (d10 instanceof w8.d) {
            ((w8.d) d10).a(i10);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<SearchView> getBehavior() {
        return new Behavior();
    }

    public TransitionState getCurrentTransitionState() {
        return this.f12826y;
    }

    public EditText getEditText() {
        return this.f12811j;
    }

    public CharSequence getHint() {
        return this.f12811j.getHint();
    }

    public TextView getSearchPrefix() {
        return this.f12810i;
    }

    public CharSequence getSearchPrefixText() {
        return this.f12810i.getText();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.f12820s;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        return this.f12811j.getText();
    }

    public Toolbar getToolbar() {
        return this.f12808g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b.b.X(this);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.f12820s = activityWindow.getAttributes().softInputMode;
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        boolean z10;
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f5506a);
        setText(aVar.c);
        if (aVar.f12829d == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setVisible(z10);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        String charSequence;
        a aVar = new a(super.onSaveInstanceState());
        Editable text = getText();
        if (text == null) {
            charSequence = null;
        } else {
            charSequence = text.toString();
        }
        aVar.c = charSequence;
        aVar.f12829d = this.f12804b.getVisibility();
        return aVar;
    }

    public void setAnimatedNavigationIcon(boolean z10) {
        this.f12821t = z10;
    }

    public void setAutoShowKeyboard(boolean z10) {
        this.f12823v = z10;
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        setUpBackgroundViewElevationOverlay(f10);
    }

    public void setHint(CharSequence charSequence) {
        this.f12811j.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z10) {
        this.f12822u = z10;
    }

    public void setModalForAccessibility(boolean z10) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z10) {
            this.f12827z = new HashMap(viewGroup.getChildCount());
        }
        e(viewGroup, z10);
        if (!z10) {
            this.f12827z = null;
        }
    }

    public void setOnMenuItemClickListener(Toolbar.h hVar) {
        this.f12808g.setOnMenuItemClickListener(hVar);
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        int i10;
        TextView textView = this.f12810i;
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        textView.setVisibility(i10);
    }

    public void setStatusBarSpacerEnabled(boolean z10) {
        this.f12825x = true;
        setStatusBarSpacerEnabledInternal(z10);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(CharSequence charSequence) {
        this.f12811j.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z10) {
        this.f12808g.setTouchscreenBlocksFocus(z10);
    }

    public void setTransitionState(TransitionState transitionState) {
        if (this.f12826y.equals(transitionState)) {
            return;
        }
        this.f12826y = transitionState;
        for (b bVar : new LinkedHashSet(this.f12818q)) {
            bVar.a();
        }
    }

    public void setUseWindowInsetsController(boolean z10) {
        this.f12824w = z10;
    }

    public void setVisible(boolean z10) {
        boolean z11;
        TransitionState transitionState;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.f12804b;
        int i10 = 0;
        if (clippableRoundedCornerLayout.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10) {
            i10 = 8;
        }
        clippableRoundedCornerLayout.setVisibility(i10);
        f();
        if (z11 != z10) {
            setModalForAccessibility(z10);
        }
        if (z10) {
            transitionState = TransitionState.SHOWN;
        } else {
            transitionState = TransitionState.HIDDEN;
        }
        setTransitionState(transitionState);
    }

    public void setupWithSearchBar(SearchBar searchBar) {
        this.f12819r = searchBar;
        this.f12816o.f12845m = searchBar;
        if (searchBar != null) {
            searchBar.setOnClickListener(new j(this, 1));
        }
        MaterialToolbar materialToolbar = this.f12808g;
        if (materialToolbar != null && !(p0.a.d(materialToolbar.getNavigationIcon()) instanceof n.d)) {
            if (this.f12819r == null) {
                materialToolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24);
            } else {
                Drawable mutate = m.a.a(getContext(), R.drawable.ic_arrow_back_black_24).mutate();
                if (materialToolbar.getNavigationIconTint() != null) {
                    a.b.g(mutate, materialToolbar.getNavigationIconTint().intValue());
                }
                materialToolbar.setNavigationIcon(new w8.d(this.f12819r.getNavigationIcon(), mutate));
                f();
            }
        }
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchViewStyle);
    }

    public void setHint(int i10) {
        this.f12811j.setHint(i10);
    }

    public void setText(int i10) {
        this.f12811j.setText(i10);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(l9.a.a(context, attributeSet, i10, 2132018175), attributeSet, i10);
        this.f12818q = new LinkedHashSet();
        this.f12820s = 16;
        this.f12826y = TransitionState.HIDDEN;
        Context context2 = getContext();
        TypedArray d10 = s.d(context2, attributeSet, e8.a.U, i10, 2132018175, new int[0]);
        int resourceId = d10.getResourceId(14, -1);
        int resourceId2 = d10.getResourceId(0, -1);
        String string = d10.getString(3);
        String string2 = d10.getString(4);
        String string3 = d10.getString(22);
        boolean z10 = d10.getBoolean(25, false);
        this.f12821t = d10.getBoolean(8, true);
        this.f12822u = d10.getBoolean(7, true);
        boolean z11 = d10.getBoolean(15, false);
        this.f12823v = d10.getBoolean(9, true);
        d10.recycle();
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_view, this);
        this.f12815n = true;
        this.f12803a = findViewById(R.id.search_view_scrim);
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) findViewById(R.id.search_view_root);
        this.f12804b = clippableRoundedCornerLayout;
        this.c = findViewById(R.id.search_view_background);
        View findViewById = findViewById(R.id.search_view_status_bar_spacer);
        this.f12805d = findViewById;
        this.f12806e = (FrameLayout) findViewById(R.id.search_view_header_container);
        this.f12807f = (FrameLayout) findViewById(R.id.search_view_toolbar_container);
        MaterialToolbar materialToolbar = (MaterialToolbar) findViewById(R.id.search_view_toolbar);
        this.f12808g = materialToolbar;
        this.f12809h = (Toolbar) findViewById(R.id.search_view_dummy_toolbar);
        this.f12810i = (TextView) findViewById(R.id.search_view_search_prefix);
        EditText editText = (EditText) findViewById(R.id.search_view_edit_text);
        this.f12811j = editText;
        ImageButton imageButton = (ImageButton) findViewById(R.id.search_view_clear_button);
        this.f12812k = imageButton;
        View findViewById2 = findViewById(R.id.search_view_divider);
        this.f12813l = findViewById2;
        TouchObserverFrameLayout touchObserverFrameLayout = (TouchObserverFrameLayout) findViewById(R.id.search_view_content_container);
        this.f12814m = touchObserverFrameLayout;
        this.f12816o = new e(this);
        this.f12817p = new t8.a(context2);
        clippableRoundedCornerLayout.setOnTouchListener(new d9.d());
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
        setUpHeaderLayout(resourceId);
        setSearchPrefixText(string3);
        if (resourceId2 != -1) {
            editText.setTextAppearance(resourceId2);
        }
        editText.setText(string);
        editText.setHint(string2);
        if (z11) {
            materialToolbar.setNavigationIcon((Drawable) null);
        } else {
            materialToolbar.setNavigationOnClickListener(new f5.e(this, 1));
            if (z10) {
                n.d dVar = new n.d(getContext());
                int K = t0.K(this, R.attr.colorOnSurface);
                Paint paint = dVar.f22260a;
                if (K != paint.getColor()) {
                    paint.setColor(K);
                    dVar.invalidateSelf();
                }
                materialToolbar.setNavigationIcon(dVar);
            }
        }
        imageButton.setOnClickListener(new f(this, 0));
        editText.addTextChangedListener(new h(this));
        touchObserverFrameLayout.setOnTouchListener(new d9.c(this, 0));
        w.a(materialToolbar, new g(this, 0));
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById2.getLayoutParams();
        final int i11 = marginLayoutParams.leftMargin;
        final int i12 = marginLayoutParams.rightMargin;
        u uVar = new u() { // from class: d9.e
            @Override // x0.u
            public final s0 m(View view, s0 s0Var) {
                int i13 = SearchView.A;
                int c = s0Var.c() + i11;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = c;
                marginLayoutParams2.rightMargin = s0Var.d() + i12;
                return s0Var;
            }
        };
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        f0.i.u(findViewById2, uVar);
        setUpStatusBarSpacer(getStatusBarHeight());
        f0.i.u(findViewById, new h5.e(this, 3));
    }
}
