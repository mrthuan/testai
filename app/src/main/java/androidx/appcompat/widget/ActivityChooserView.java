package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import pdf.pdfreader.viewer.editor.free.R;
import x0.b;

/* loaded from: classes.dex */
public class ActivityChooserView extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public final f f2215a;

    /* renamed from: b  reason: collision with root package name */
    public final g f2216b;
    public final View c;

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f2217d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f2218e;

    /* renamed from: f  reason: collision with root package name */
    public final FrameLayout f2219f;

    /* renamed from: g  reason: collision with root package name */
    public x0.b f2220g;

    /* renamed from: h  reason: collision with root package name */
    public final b f2221h;

    /* renamed from: i  reason: collision with root package name */
    public ListPopupWindow f2222i;

    /* renamed from: j  reason: collision with root package name */
    public PopupWindow.OnDismissListener f2223j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2224k;

    /* loaded from: classes.dex */
    public static class InnerLayout extends LinearLayout {

        /* renamed from: a  reason: collision with root package name */
        public static final int[] f2225a = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            Drawable drawable;
            int resourceId;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2225a);
            if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                drawable = m.a.a(context, resourceId);
            } else {
                drawable = obtainStyledAttributes.getDrawable(0);
            }
            setBackgroundDrawable(drawable);
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public class a extends DataSetObserver {
        public a() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f2215a.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.f2215a.notifyDataSetInvalidated();
        }
    }

    /* loaded from: classes.dex */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            b.a aVar;
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (activityChooserView.b()) {
                if (!activityChooserView.isShown()) {
                    activityChooserView.getListPopupWindow().dismiss();
                    return;
                }
                activityChooserView.getListPopupWindow().show();
                x0.b bVar = activityChooserView.f2220g;
                if (bVar != null && (aVar = bVar.f31420b) != null) {
                    ((androidx.appcompat.widget.c) aVar).n(true);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends View.AccessibilityDelegate {
        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCanOpenPopup(true);
        }
    }

    /* loaded from: classes.dex */
    public class d extends d0 {
        public d(FrameLayout frameLayout) {
            super(frameLayout);
        }

        @Override // androidx.appcompat.widget.d0
        public final androidx.appcompat.view.menu.q b() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        @Override // androidx.appcompat.widget.d0
        public final boolean c() {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (!activityChooserView.b() && activityChooserView.f2224k) {
                activityChooserView.f2215a.getClass();
                throw new IllegalStateException("No data model. Did you call #setDataModel?");
            }
            return true;
        }

        @Override // androidx.appcompat.widget.d0
        public final boolean d() {
            ActivityChooserView.this.a();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class e extends DataSetObserver {
        public e() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f2215a.getClass();
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public class f extends BaseAdapter {
        public f() {
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            throw null;
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i10) {
            throw null;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final int getItemViewType(int i10) {
            return 0;
        }

        @Override // android.widget.Adapter
        public final View getView(int i10, View view, ViewGroup viewGroup) {
            getItemViewType(i10);
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == null || view.getId() != R.id.list_item) {
                view = LayoutInflater.from(activityChooserView.getContext()).inflate(R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
            }
            activityChooserView.getContext().getPackageManager();
            ImageView imageView = (ImageView) view.findViewById(R.id.icon);
            getItem(i10);
            throw null;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final int getViewTypeCount() {
            return 3;
        }
    }

    /* loaded from: classes.dex */
    public class g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            FrameLayout frameLayout = activityChooserView.f2219f;
            f fVar = activityChooserView.f2215a;
            if (view != frameLayout) {
                if (view == activityChooserView.f2217d) {
                    fVar.getClass();
                    throw new IllegalStateException("No data model. Did you call #setDataModel?");
                }
                throw new IllegalArgumentException();
            }
            activityChooserView.a();
            fVar.getClass();
            throw null;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            b.a aVar;
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            PopupWindow.OnDismissListener onDismissListener = activityChooserView.f2223j;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
            x0.b bVar = activityChooserView.f2220g;
            if (bVar != null && (aVar = bVar.f31420b) != null) {
                ((androidx.appcompat.widget.c) aVar).n(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            ((f) adapterView.getAdapter()).getClass();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            activityChooserView.a();
            activityChooserView.f2215a.getClass();
            throw null;
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.f2219f) {
                activityChooserView.f2215a.getClass();
                throw null;
            }
            throw new IllegalArgumentException();
        }
    }

    public ActivityChooserView(Context context) {
        this(context, null);
    }

    public final void a() {
        if (b()) {
            getListPopupWindow().dismiss();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.f2221h);
            }
        }
    }

    public final boolean b() {
        return getListPopupWindow().a();
    }

    public androidx.appcompat.widget.d getDataModel() {
        this.f2215a.getClass();
        return null;
    }

    public ListPopupWindow getListPopupWindow() {
        if (this.f2222i == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.f2222i = listPopupWindow;
            listPopupWindow.n(this.f2215a);
            ListPopupWindow listPopupWindow2 = this.f2222i;
            listPopupWindow2.f2326o = this;
            listPopupWindow2.f2336y = true;
            listPopupWindow2.f2337z.setFocusable(true);
            ListPopupWindow listPopupWindow3 = this.f2222i;
            g gVar = this.f2216b;
            listPopupWindow3.f2327p = gVar;
            listPopupWindow3.f2337z.setOnDismissListener(gVar);
        }
        return this.f2222i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2215a.getClass();
        this.f2224k = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2215a.getClass();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f2221h);
        }
        if (b()) {
            a();
        }
        this.f2224k = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.c.layout(0, 0, i12 - i10, i13 - i11);
        if (!b()) {
            a();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.f2219f.getVisibility() != 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824);
        }
        View view = this.c;
        measureChild(view, i10, i11);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setActivityChooserModel(androidx.appcompat.widget.d dVar) {
        f fVar = this.f2215a;
        ActivityChooserView.this.f2215a.getClass();
        fVar.notifyDataSetChanged();
        if (b()) {
            a();
            if (!b() && this.f2224k) {
                fVar.getClass();
                throw new IllegalStateException("No data model. Did you call #setDataModel?");
            }
        }
    }

    public void setExpandActivityOverflowButtonContentDescription(int i10) {
        this.f2218e.setContentDescription(getContext().getString(i10));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f2218e.setImageDrawable(drawable);
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f2223j = onDismissListener;
    }

    public void setProvider(x0.b bVar) {
        this.f2220g = bVar;
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        new a();
        this.f2221h = new b();
        int[] iArr = k.a.f19432e;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        x0.f0.n(this, context, iArr, attributeSet, obtainStyledAttributes, i10);
        obtainStyledAttributes.getInt(1, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(R.layout.abc_activity_chooser_view, (ViewGroup) this, true);
        g gVar = new g();
        this.f2216b = gVar;
        View findViewById = findViewById(R.id.activity_chooser_view_content);
        this.c = findViewById;
        findViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.default_activity_button);
        this.f2219f = frameLayout;
        frameLayout.setOnClickListener(gVar);
        frameLayout.setOnLongClickListener(gVar);
        ImageView imageView = (ImageView) frameLayout.findViewById(R.id.image);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.expand_activities_button);
        frameLayout2.setOnClickListener(gVar);
        frameLayout2.setAccessibilityDelegate(new c());
        frameLayout2.setOnTouchListener(new d(frameLayout2));
        this.f2217d = frameLayout2;
        ImageView imageView2 = (ImageView) frameLayout2.findViewById(R.id.image);
        this.f2218e = imageView2;
        imageView2.setImageDrawable(drawable);
        f fVar = new f();
        this.f2215a = fVar;
        fVar.registerDataSetObserver(new e());
        Resources resources = context.getResources();
        Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
    }

    public void setDefaultActionButtonContentDescription(int i10) {
    }

    public void setInitialActivityCount(int i10) {
    }
}
