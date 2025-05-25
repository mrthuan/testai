package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cursoradapter.widget.CursorAdapter;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;

/* loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements q.b {

    /* renamed from: g0  reason: collision with root package name */
    public static final o f2365g0;
    public final Rect A;
    public final int[] B;
    public final int[] C;
    public final ImageView D;
    public final Drawable E;
    public final int F;
    public final int G;
    public final Intent H;
    public final Intent I;
    public final CharSequence J;
    public View.OnFocusChangeListener K;
    public View.OnClickListener L;
    public boolean M;
    public boolean N;
    public CursorAdapter O;
    public boolean P;
    public CharSequence Q;
    public boolean R;
    public boolean S;
    public int T;
    public boolean U;
    public CharSequence V;
    public boolean W;

    /* renamed from: a0  reason: collision with root package name */
    public int f2366a0;

    /* renamed from: b0  reason: collision with root package name */
    public SearchableInfo f2367b0;

    /* renamed from: c0  reason: collision with root package name */
    public Bundle f2368c0;

    /* renamed from: d0  reason: collision with root package name */
    public final b f2369d0;

    /* renamed from: e0  reason: collision with root package name */
    public final c f2370e0;

    /* renamed from: f0  reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f2371f0;

    /* renamed from: p  reason: collision with root package name */
    public final SearchAutoComplete f2372p;

    /* renamed from: q  reason: collision with root package name */
    public final View f2373q;

    /* renamed from: r  reason: collision with root package name */
    public final View f2374r;

    /* renamed from: s  reason: collision with root package name */
    public final View f2375s;

    /* renamed from: t  reason: collision with root package name */
    public final ImageView f2376t;

    /* renamed from: u  reason: collision with root package name */
    public final ImageView f2377u;

    /* renamed from: v  reason: collision with root package name */
    public final ImageView f2378v;

    /* renamed from: w  reason: collision with root package name */
    public final ImageView f2379w;

    /* renamed from: x  reason: collision with root package name */
    public final View f2380x;

    /* renamed from: y  reason: collision with root package name */
    public q f2381y;

    /* renamed from: z  reason: collision with root package name */
    public final Rect f2382z;

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* renamed from: e  reason: collision with root package name */
        public int f2383e;

        /* renamed from: f  reason: collision with root package name */
        public SearchView f2384f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f2385g;

        /* renamed from: h  reason: collision with root package name */
        public final a f2386h;

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f2385g) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f2385g = false;
                }
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 < 600) {
                if (i10 < 640 || i11 < 480) {
                    return 160;
                }
                return 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                k.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            o oVar = SearchView.f2365g0;
            oVar.getClass();
            o.a();
            Method method = oVar.c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            if (this.f2383e > 0 && !super.enoughToFilter()) {
                return false;
            }
            return true;
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f2385g) {
                a aVar = this.f2386h;
                removeCallbacks(aVar);
                post(aVar);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            SearchView searchView = this.f2384f;
            searchView.y(searchView.N);
            searchView.post(searchView.f2369d0);
            if (searchView.f2372p.hasFocus()) {
                searchView.n();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f2384f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f2384f.hasFocus() && getVisibility() == 0) {
                boolean z11 = true;
                this.f2385g = true;
                Context context = getContext();
                o oVar = SearchView.f2365g0;
                if (context.getResources().getConfiguration().orientation != 2) {
                    z11 = false;
                }
                if (z11) {
                    a();
                }
            }
        }

        public void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            a aVar = this.f2386h;
            if (!z10) {
                this.f2385g = false;
                removeCallbacks(aVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f2385g = false;
                removeCallbacks(aVar);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f2385g = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f2384f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f2383e = i10;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f2386h = new a();
            this.f2383e = getThreshold();
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SearchView.this.u();
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            CursorAdapter cursorAdapter = SearchView.this.O;
            if (cursorAdapter instanceof o0) {
                cursorAdapter.changeCursor(null);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.K;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            int i18;
            int i19;
            SearchView searchView = SearchView.this;
            View view2 = searchView.f2380x;
            if (view2.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.f2374r.getPaddingLeft();
                Rect rect = new Rect();
                boolean a10 = d1.a(searchView);
                if (searchView.M) {
                    i18 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
                } else {
                    i18 = 0;
                }
                SearchAutoComplete searchAutoComplete = searchView.f2372p;
                searchAutoComplete.getDropDownBackground().getPadding(rect);
                if (a10) {
                    i19 = -rect.left;
                } else {
                    i19 = paddingLeft - (rect.left + i18);
                }
                searchAutoComplete.setDropDownHorizontalOffset(i19);
                searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + i18) - paddingLeft);
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String flattenToShortString;
            SearchView searchView = SearchView.this;
            ImageView imageView = searchView.f2376t;
            SearchAutoComplete searchAutoComplete = searchView.f2372p;
            if (view == imageView) {
                searchView.y(false);
                searchAutoComplete.requestFocus();
                searchAutoComplete.setImeVisibility(true);
                View.OnClickListener onClickListener = searchView.L;
                if (onClickListener != null) {
                    onClickListener.onClick(searchView);
                }
            } else if (view == searchView.f2378v) {
                searchView.o();
            } else if (view == searchView.f2377u) {
                searchView.s();
            } else if (view == searchView.f2379w) {
                SearchableInfo searchableInfo = searchView.f2367b0;
                if (searchableInfo != null) {
                    try {
                        if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                            Intent intent = new Intent(searchView.H);
                            ComponentName searchActivity = searchableInfo.getSearchActivity();
                            if (searchActivity == null) {
                                flattenToShortString = null;
                            } else {
                                flattenToShortString = searchActivity.flattenToShortString();
                            }
                            intent.putExtra("calling_package", flattenToShortString);
                            searchView.getContext().startActivity(intent);
                        } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                            searchView.getContext().startActivity(searchView.m(searchView.I, searchableInfo));
                        }
                    } catch (ActivityNotFoundException unused) {
                    }
                }
            } else if (view == searchAutoComplete) {
                searchView.n();
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements View.OnKeyListener {
        public g() {
        }

        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
            boolean z10;
            int length;
            SearchView searchView = SearchView.this;
            if (searchView.f2367b0 == null) {
                return false;
            }
            SearchAutoComplete searchAutoComplete = searchView.f2372p;
            if (searchAutoComplete.isPopupShowing() && searchAutoComplete.getListSelection() != -1) {
                if (searchView.f2367b0 == null || searchView.O == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                    return false;
                }
                if (i10 != 66 && i10 != 84 && i10 != 61) {
                    if (i10 != 21 && i10 != 22) {
                        if (i10 != 19) {
                            return false;
                        }
                        searchAutoComplete.getListSelection();
                        return false;
                    }
                    if (i10 == 21) {
                        length = 0;
                    } else {
                        length = searchAutoComplete.length();
                    }
                    searchAutoComplete.setSelection(length);
                    searchAutoComplete.setListSelection(0);
                    searchAutoComplete.clearListSelection();
                    searchAutoComplete.a();
                } else {
                    searchView.p(searchAutoComplete.getListSelection());
                }
                return true;
            }
            if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                return false;
            }
            view.cancelLongPress();
            searchView.getContext().startActivity(searchView.l("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.s();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.p(i10);
        }
    }

    /* loaded from: classes.dex */
    public static class k {
        public static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        public static void b(SearchAutoComplete searchAutoComplete, int i10) {
            searchAutoComplete.setInputMethodMode(i10);
        }
    }

    /* loaded from: classes.dex */
    public interface l {
    }

    /* loaded from: classes.dex */
    public interface m {
    }

    /* loaded from: classes.dex */
    public interface n {
    }

    /* loaded from: classes.dex */
    public static class o {

        /* renamed from: a  reason: collision with root package name */
        public final Method f2398a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f2399b;
        public final Method c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public o() {
            this.f2398a = null;
            this.f2399b = null;
            this.c = null;
            a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f2398a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f2399b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void a() {
            if (Build.VERSION.SDK_INT < 29) {
                return;
            }
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }

    /* loaded from: classes.dex */
    public static class p extends c1.a {
        public static final Parcelable.Creator<p> CREATOR = new a();
        public boolean c;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<p> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new p(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new p[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new p(parcel, null);
            }
        }

        public p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public final String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.c + "}";
        }

        @Override // c1.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f5506a, i10);
            parcel.writeValue(Boolean.valueOf(this.c));
        }
    }

    /* loaded from: classes.dex */
    public static class q extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final View f2400a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f2401b;
        public final Rect c;

        /* renamed from: d  reason: collision with root package name */
        public final Rect f2402d;

        /* renamed from: e  reason: collision with root package name */
        public final int f2403e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f2404f;

        public q(Rect rect, Rect rect2, SearchAutoComplete searchAutoComplete) {
            super(rect, searchAutoComplete);
            int scaledTouchSlop = ViewConfiguration.get(searchAutoComplete.getContext()).getScaledTouchSlop();
            this.f2403e = scaledTouchSlop;
            Rect rect3 = new Rect();
            this.f2401b = rect3;
            Rect rect4 = new Rect();
            this.f2402d = rect4;
            Rect rect5 = new Rect();
            this.c = rect5;
            rect3.set(rect);
            rect4.set(rect);
            int i10 = -scaledTouchSlop;
            rect4.inset(i10, i10);
            rect5.set(rect2);
            this.f2400a = searchAutoComplete;
        }

        @Override // android.view.TouchDelegate
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            boolean z11;
            int x4 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z12 = true;
            if (action != 0) {
                if (action != 1 && action != 2) {
                    if (action == 3) {
                        z11 = this.f2404f;
                        this.f2404f = false;
                    }
                    z10 = true;
                    z12 = false;
                } else {
                    z11 = this.f2404f;
                    if (z11 && !this.f2402d.contains(x4, y10)) {
                        z12 = z11;
                        z10 = false;
                    }
                }
                z12 = z11;
                z10 = true;
            } else {
                if (this.f2401b.contains(x4, y10)) {
                    this.f2404f = true;
                    z10 = true;
                }
                z10 = true;
                z12 = false;
            }
            if (!z12) {
                return false;
            }
            Rect rect = this.c;
            View view = this.f2400a;
            if (z10 && !rect.contains(x4, y10)) {
                motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
            } else {
                motionEvent.setLocation(x4 - rect.left, y10 - rect.top);
            }
            return view.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        o oVar;
        if (Build.VERSION.SDK_INT < 29) {
            oVar = new o();
        } else {
            oVar = null;
        }
        f2365g0 = oVar;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        int length;
        SearchAutoComplete searchAutoComplete = this.f2372p;
        searchAutoComplete.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        searchAutoComplete.setSelection(length);
    }

    @Override // q.b
    public final void b() {
        if (this.W) {
            return;
        }
        this.W = true;
        SearchAutoComplete searchAutoComplete = this.f2372p;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f2366a0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.S = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f2372p;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.S = false;
    }

    @Override // q.b
    public final void d() {
        SearchAutoComplete searchAutoComplete = this.f2372p;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.V = "";
        clearFocus();
        y(true);
        searchAutoComplete.setImeOptions(this.f2366a0);
        this.W = false;
    }

    public int getImeOptions() {
        return this.f2372p.getImeOptions();
    }

    public int getInputType() {
        return this.f2372p.getInputType();
    }

    public int getMaxWidth() {
        return this.T;
    }

    public CharSequence getQuery() {
        return this.f2372p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.Q;
        if (charSequence == null) {
            SearchableInfo searchableInfo = this.f2367b0;
            if (searchableInfo != null && searchableInfo.getHintId() != 0) {
                return getContext().getText(this.f2367b0.getHintId());
            }
            return this.J;
        }
        return charSequence;
    }

    public int getSuggestionCommitIconResId() {
        return this.G;
    }

    public int getSuggestionRowLayout() {
        return this.F;
    }

    public CursorAdapter getSuggestionsAdapter() {
        return this.O;
    }

    public final Intent l(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.V);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f2368c0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f2367b0.getSearchActivity());
        return intent;
    }

    public final Intent m(Intent intent, SearchableInfo searchableInfo) {
        String str;
        String str2;
        String str3;
        int i10;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2368c0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
        } else {
            str = "free_form";
        }
        String str4 = null;
        if (searchableInfo.getVoicePromptTextId() != 0) {
            str2 = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            str2 = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            str3 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            str3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i10 = searchableInfo.getVoiceMaxResults();
        } else {
            i10 = 1;
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", str2);
        intent3.putExtra("android.speech.extra.LANGUAGE", str3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i10);
        if (searchActivity != null) {
            str4 = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str4);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void n() {
        int i10 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f2372p;
        if (i10 >= 29) {
            k.a(searchAutoComplete);
            return;
        }
        o oVar = f2365g0;
        oVar.getClass();
        o.a();
        Method method = oVar.f2398a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        oVar.getClass();
        o.a();
        Method method2 = oVar.f2399b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public final void o() {
        SearchAutoComplete searchAutoComplete = this.f2372p;
        if (TextUtils.isEmpty(searchAutoComplete.getText())) {
            if (this.M) {
                clearFocus();
                y(true);
                return;
            }
            return;
        }
        searchAutoComplete.setText("");
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f2369d0);
        post(this.f2370e0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            SearchAutoComplete searchAutoComplete = this.f2372p;
            int[] iArr = this.B;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.C;
            getLocationInWindow(iArr2);
            int i14 = iArr[1] - iArr2[1];
            int i15 = iArr[0] - iArr2[0];
            Rect rect = this.f2382z;
            rect.set(i15, i14, searchAutoComplete.getWidth() + i15, searchAutoComplete.getHeight() + i14);
            int i16 = rect.left;
            int i17 = rect.right;
            int i18 = i13 - i11;
            Rect rect2 = this.A;
            rect2.set(i16, 0, i17, i18);
            q qVar = this.f2381y;
            if (qVar == null) {
                q qVar2 = new q(rect2, rect, searchAutoComplete);
                this.f2381y = qVar2;
                setTouchDelegate(qVar2);
                return;
            }
            qVar.f2401b.set(rect2);
            Rect rect3 = qVar.f2402d;
            rect3.set(rect2);
            int i19 = -qVar.f2403e;
            rect3.inset(i19, i19);
            qVar.c.set(rect);
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.N) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824 && (i12 = this.T) > 0) {
                    size = Math.min(i12, size);
                }
            } else {
                size = this.T;
                if (size <= 0) {
                    size = getPreferredWidth();
                }
            }
        } else {
            int i13 = this.T;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                size2 = getPreferredHeight();
            }
        } else {
            size2 = Math.min(getPreferredHeight(), size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.f5506a);
        y(pVar.c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.c = this.N;
        return pVar;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        post(this.f2369d0);
    }

    public final void p(int i10) {
        Uri parse;
        String e10;
        Cursor cursor = this.O.getCursor();
        if (cursor != null && cursor.moveToPosition(i10)) {
            Intent intent = null;
            try {
                try {
                    int i11 = o0.f2627n;
                    String e11 = o0.e(cursor, cursor.getColumnIndex("suggest_intent_action"));
                    if (e11 == null) {
                        e11 = this.f2367b0.getSuggestIntentAction();
                    }
                    if (e11 == null) {
                        e11 = "android.intent.action.SEARCH";
                    }
                    String e12 = o0.e(cursor, cursor.getColumnIndex("suggest_intent_data"));
                    if (e12 == null) {
                        e12 = this.f2367b0.getSuggestIntentData();
                    }
                    if (e12 != null && (e10 = o0.e(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                        e12 = e12 + PackagingURIHelper.FORWARD_SLASH_STRING + Uri.encode(e10);
                    }
                    if (e12 == null) {
                        parse = null;
                    } else {
                        parse = Uri.parse(e12);
                    }
                    intent = l(e11, parse, o0.e(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), o0.e(cursor, cursor.getColumnIndex("suggest_intent_query")));
                } catch (RuntimeException unused) {
                    cursor.getPosition();
                }
            } catch (RuntimeException unused2) {
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException unused3) {
                    intent.toString();
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f2372p;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void q(int i10) {
        Editable text = this.f2372p.getText();
        Cursor cursor = this.O.getCursor();
        if (cursor != null) {
            if (cursor.moveToPosition(i10)) {
                CharSequence convertToString = this.O.convertToString(cursor);
                if (convertToString != null) {
                    setQuery(convertToString);
                    return;
                } else {
                    setQuery(text);
                    return;
                }
            }
            setQuery(text);
        }
    }

    public final void r(CharSequence charSequence) {
        setQuery(charSequence);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i10, Rect rect) {
        if (this.S || !isFocusable()) {
            return false;
        }
        if (!this.N) {
            boolean requestFocus = this.f2372p.requestFocus(i10, rect);
            if (requestFocus) {
                y(false);
            }
            return requestFocus;
        }
        return super.requestFocus(i10, rect);
    }

    public final void s() {
        SearchAutoComplete searchAutoComplete = this.f2372p;
        Editable text = searchAutoComplete.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f2367b0 != null) {
                getContext().startActivity(l("android.intent.action.SEARCH", null, null, text.toString()));
            }
            searchAutoComplete.setImeVisibility(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    public void setAppSearchData(Bundle bundle) {
        this.f2368c0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            o();
            return;
        }
        y(false);
        SearchAutoComplete searchAutoComplete = this.f2372p;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.L;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.M == z10) {
            return;
        }
        this.M = z10;
        y(z10);
        v();
    }

    public void setImeOptions(int i10) {
        this.f2372p.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f2372p.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.T = i10;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.K = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.L = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.Q = charSequence;
        v();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        int i10;
        this.R = z10;
        CursorAdapter cursorAdapter = this.O;
        if (cursorAdapter instanceof o0) {
            o0 o0Var = (o0) cursorAdapter;
            if (z10) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            o0Var.f2632f = i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0095, code lost:
        if (getContext().getPackageManager().resolveActivity(r3, 65536) != null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setSearchableInfo(android.app.SearchableInfo r8) {
        /*
            r7 = this;
            r7.f2367b0 = r8
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r7.f2372p
            r1 = 1
            r2 = 65536(0x10000, float:9.1835E-41)
            r3 = 0
            if (r8 == 0) goto L68
            int r8 = r8.getSuggestThreshold()
            r0.setThreshold(r8)
            android.app.SearchableInfo r8 = r7.f2367b0
            int r8 = r8.getImeOptions()
            r0.setImeOptions(r8)
            android.app.SearchableInfo r8 = r7.f2367b0
            int r8 = r8.getInputType()
            r4 = r8 & 15
            if (r4 != r1) goto L34
            r4 = -65537(0xfffffffffffeffff, float:NaN)
            r8 = r8 & r4
            android.app.SearchableInfo r4 = r7.f2367b0
            java.lang.String r4 = r4.getSuggestAuthority()
            if (r4 == 0) goto L34
            r8 = r8 | r2
            r4 = 524288(0x80000, float:7.34684E-40)
            r8 = r8 | r4
        L34:
            r0.setInputType(r8)
            androidx.cursoradapter.widget.CursorAdapter r8 = r7.O
            if (r8 == 0) goto L3e
            r8.changeCursor(r3)
        L3e:
            android.app.SearchableInfo r8 = r7.f2367b0
            java.lang.String r8 = r8.getSuggestAuthority()
            if (r8 == 0) goto L65
            androidx.appcompat.widget.o0 r8 = new androidx.appcompat.widget.o0
            android.content.Context r4 = r7.getContext()
            android.app.SearchableInfo r5 = r7.f2367b0
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r6 = r7.f2371f0
            r8.<init>(r4, r7, r5, r6)
            r7.O = r8
            r0.setAdapter(r8)
            androidx.cursoradapter.widget.CursorAdapter r8 = r7.O
            androidx.appcompat.widget.o0 r8 = (androidx.appcompat.widget.o0) r8
            boolean r4 = r7.R
            if (r4 == 0) goto L62
            r4 = 2
            goto L63
        L62:
            r4 = r1
        L63:
            r8.f2632f = r4
        L65:
            r7.v()
        L68:
            android.app.SearchableInfo r8 = r7.f2367b0
            if (r8 == 0) goto L98
            boolean r8 = r8.getVoiceSearchEnabled()
            if (r8 == 0) goto L98
            android.app.SearchableInfo r8 = r7.f2367b0
            boolean r8 = r8.getVoiceSearchLaunchWebSearch()
            if (r8 == 0) goto L7d
            android.content.Intent r3 = r7.H
            goto L87
        L7d:
            android.app.SearchableInfo r8 = r7.f2367b0
            boolean r8 = r8.getVoiceSearchLaunchRecognizer()
            if (r8 == 0) goto L87
            android.content.Intent r3 = r7.I
        L87:
            if (r3 == 0) goto L98
            android.content.Context r8 = r7.getContext()
            android.content.pm.PackageManager r8 = r8.getPackageManager()
            android.content.pm.ResolveInfo r8 = r8.resolveActivity(r3, r2)
            if (r8 == 0) goto L98
            goto L99
        L98:
            r1 = 0
        L99:
            r7.U = r1
            if (r1 == 0) goto La2
            java.lang.String r8 = "nm"
            r0.setPrivateImeOptions(r8)
        La2:
            boolean r8 = r7.N
            r7.y(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.P = z10;
        y(this.N);
    }

    public void setSuggestionsAdapter(CursorAdapter cursorAdapter) {
        this.O = cursorAdapter;
        this.f2372p.setAdapter(cursorAdapter);
    }

    public final void t() {
        int[] iArr;
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f2372p.getText());
        int i10 = 0;
        if (!z11 && (!this.M || this.W)) {
            z10 = false;
        }
        if (!z10) {
            i10 = 8;
        }
        ImageView imageView = this.f2378v;
        imageView.setVisibility(i10);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            if (z11) {
                iArr = ViewGroup.ENABLED_STATE_SET;
            } else {
                iArr = ViewGroup.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    public final void u() {
        int[] iArr;
        if (this.f2372p.hasFocus()) {
            iArr = ViewGroup.FOCUSED_STATE_SET;
        } else {
            iArr = ViewGroup.EMPTY_STATE_SET;
        }
        Drawable background = this.f2374r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f2375s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void v() {
        Drawable drawable;
        SpannableStringBuilder queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z10 = this.M;
        SearchAutoComplete searchAutoComplete = this.f2372p;
        if (z10 && (drawable = this.E) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void w() {
        boolean z10;
        int i10 = 0;
        if ((this.P || this.U) && !this.N) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || (this.f2377u.getVisibility() != 0 && this.f2379w.getVisibility() != 0)) {
            i10 = 8;
        }
        this.f2375s.setVisibility(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x001e, code lost:
        if (r2.U == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.P
            if (r0 == 0) goto L21
            r1 = 0
            if (r0 != 0) goto Lb
            boolean r0 = r2.U
            if (r0 == 0) goto L11
        Lb:
            boolean r0 = r2.N
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = r1
        L12:
            if (r0 == 0) goto L21
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L21
            if (r3 != 0) goto L23
            boolean r3 = r2.U
            if (r3 != 0) goto L21
            goto L23
        L21:
            r1 = 8
        L23:
            android.widget.ImageView r3 = r2.f2377u
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.x(boolean):void");
    }

    public final void y(boolean z10) {
        int i10;
        int i11;
        int i12;
        this.N = z10;
        int i13 = 0;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        boolean z11 = !TextUtils.isEmpty(this.f2372p.getText());
        this.f2376t.setVisibility(i10);
        x(z11);
        if (z10) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        this.f2373q.setVisibility(i11);
        ImageView imageView = this.D;
        if (imageView.getDrawable() != null && !this.M) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        imageView.setVisibility(i12);
        t();
        boolean z12 = !z11;
        if (this.U && !this.N && z12) {
            this.f2377u.setVisibility(8);
        } else {
            i13 = 8;
        }
        this.f2379w.setVisibility(i13);
        w();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2382z = new Rect();
        this.A = new Rect();
        this.B = new int[2];
        this.C = new int[2];
        this.f2369d0 = new b();
        this.f2370e0 = new c();
        this.f2371f0 = new WeakHashMap<>();
        f fVar = new f();
        g gVar = new g();
        h hVar = new h();
        i iVar = new i();
        j jVar = new j();
        a aVar = new a();
        int[] iArr = k.a.f19450w;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        u0 u0Var = new u0(context, obtainStyledAttributes);
        x0.f0.n(this, context, iArr, attributeSet, obtainStyledAttributes, i10);
        LayoutInflater.from(context).inflate(u0Var.i(17, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f2372p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f2373q = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f2374r = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f2375s = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f2376t = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f2377u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f2378v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f2379w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.D = imageView5;
        f0.d.q(findViewById, u0Var.e(18));
        f0.d.q(findViewById2, u0Var.e(23));
        imageView.setImageDrawable(u0Var.e(21));
        imageView2.setImageDrawable(u0Var.e(13));
        imageView3.setImageDrawable(u0Var.e(10));
        imageView4.setImageDrawable(u0Var.e(26));
        imageView5.setImageDrawable(u0Var.e(21));
        this.E = u0Var.e(20);
        x0.a(imageView, getResources().getString(R.string.arg_res_0x7f130016));
        this.F = u0Var.i(24, R.layout.abc_search_dropdown_item_icons_2line);
        this.G = u0Var.i(11, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(aVar);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(gVar);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(u0Var.a(16, true));
        int d10 = u0Var.d(2, -1);
        if (d10 != -1) {
            setMaxWidth(d10);
        }
        this.J = u0Var.k(12);
        this.Q = u0Var.k(19);
        int h10 = u0Var.h(6, -1);
        if (h10 != -1) {
            setImeOptions(h10);
        }
        int h11 = u0Var.h(5, -1);
        if (h11 != -1) {
            setInputType(h11);
        }
        setFocusable(u0Var.a(1, true));
        u0Var.n();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.I = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f2380x = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        y(this.M);
        v();
    }

    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.f2372p.getText();
            searchView.V = text;
            boolean z10 = !TextUtils.isEmpty(text);
            searchView.x(z10);
            boolean z11 = !z10;
            int i13 = 8;
            if (searchView.U && !searchView.N && z11) {
                searchView.f2377u.setVisibility(8);
                i13 = 0;
            }
            searchView.f2379w.setVisibility(i13);
            searchView.t();
            searchView.w();
            charSequence.toString();
            searchView.getClass();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* loaded from: classes.dex */
    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.q(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public void setOnCloseListener(l lVar) {
    }

    public void setOnQueryTextListener(m mVar) {
    }

    public void setOnSuggestionListener(n nVar) {
    }
}
