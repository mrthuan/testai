package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;

/* loaded from: classes.dex */
public class AppCompatSpinner extends Spinner {
    @SuppressLint({"ResourceType"})

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f2261i = {16843505};

    /* renamed from: a  reason: collision with root package name */
    public final androidx.appcompat.widget.e f2262a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f2263b;
    public final p c;

    /* renamed from: d  reason: collision with root package name */
    public SpinnerAdapter f2264d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f2265e;

    /* renamed from: f  reason: collision with root package name */
    public final i f2266f;

    /* renamed from: g  reason: collision with root package name */
    public int f2267g;

    /* renamed from: h  reason: collision with root package name */
    public final Rect f2268h;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            if (!appCompatSpinner.getInternalPopup().a()) {
                appCompatSpinner.f2266f.l(c.b(appCompatSpinner), c.a(appCompatSpinner));
            }
            ViewTreeObserver viewTreeObserver = appCompatSpinner.getViewTreeObserver();
            if (viewTreeObserver != null) {
                b.a(viewTreeObserver, this);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public static void a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public static int a(View view) {
            return view.getTextAlignment();
        }

        public static int b(View view) {
            return view.getTextDirection();
        }

        public static void c(View view, int i10) {
            view.setTextAlignment(i10);
        }

        public static void d(View view, int i10) {
            view.setTextDirection(i10);
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (!w0.b.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class f implements ListAdapter, SpinnerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final SpinnerAdapter f2273a;

        /* renamed from: b  reason: collision with root package name */
        public final ListAdapter f2274b;

        public f(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f2273a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f2274b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    d.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof q0) {
                    q0 q0Var = (q0) spinnerAdapter;
                    if (q0Var.getDropDownViewTheme() == null) {
                        q0Var.a();
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f2274b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            SpinnerAdapter spinnerAdapter = this.f2273a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f2273a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f2273a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f2273a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i10);
        }

        @Override // android.widget.Adapter
        public final int getItemViewType(int i10) {
            return 0;
        }

        @Override // android.widget.Adapter
        public final View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public final boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f2273a;
            if (spinnerAdapter != null && spinnerAdapter.hasStableIds()) {
                return true;
            }
            return false;
        }

        @Override // android.widget.Adapter
        public final boolean isEmpty() {
            if (getCount() == 0) {
                return true;
            }
            return false;
        }

        @Override // android.widget.ListAdapter
        public final boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f2274b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f2273a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f2273a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* loaded from: classes.dex */
    public class g extends ListPopupWindow implements i {
        public CharSequence D;
        public ListAdapter E;
        public final Rect F;
        public int G;

        /* loaded from: classes.dex */
        public class a implements AdapterView.OnItemClickListener {
            public a() {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                g gVar = g.this;
                AppCompatSpinner.this.setSelection(i10);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    AppCompatSpinner.this.performItemClick(view, i10, gVar.E.getItemId(i10));
                }
                gVar.dismiss();
            }
        }

        /* loaded from: classes.dex */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                boolean z10;
                g gVar = g.this;
                AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                gVar.getClass();
                WeakHashMap<View, x0.n0> weakHashMap = x0.f0.f31435a;
                if (f0.g.b(appCompatSpinner) && appCompatSpinner.getGlobalVisibleRect(gVar.F)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    gVar.dismiss();
                    return;
                }
                gVar.q();
                gVar.show();
            }
        }

        /* loaded from: classes.dex */
        public class c implements PopupWindow.OnDismissListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f2277a;

            public c(b bVar) {
                this.f2277a = bVar;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f2277a);
                }
            }
        }

        public g(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.F = new Rect();
            this.f2326o = AppCompatSpinner.this;
            this.f2336y = true;
            this.f2337z.setFocusable(true);
            this.f2327p = new a();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public final CharSequence e() {
            return this.D;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public final void g(CharSequence charSequence) {
            this.D = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public final void k(int i10) {
            this.G = i10;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public final void l(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean a10 = a();
            q();
            l lVar = this.f2337z;
            lVar.setInputMethodMode(2);
            show();
            b0 b0Var = this.c;
            b0Var.setChoiceMode(1);
            c.d(b0Var, i10);
            c.c(b0Var, i11);
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
            b0 b0Var2 = this.c;
            if (a() && b0Var2 != null) {
                b0Var2.setListSelectionHidden(false);
                b0Var2.setSelection(selectedItemPosition);
                if (b0Var2.getChoiceMode() != 0) {
                    b0Var2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (!a10 && (viewTreeObserver = appCompatSpinner.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                lVar.setOnDismissListener(new c(bVar));
            }
        }

        @Override // androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.widget.AppCompatSpinner.i
        public final void n(ListAdapter listAdapter) {
            super.n(listAdapter);
            this.E = listAdapter;
        }

        public final void q() {
            int i10;
            int i11;
            Drawable background = getBackground();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            if (background != null) {
                background.getPadding(appCompatSpinner.f2268h);
                if (d1.a(appCompatSpinner)) {
                    i10 = appCompatSpinner.f2268h.right;
                } else {
                    i10 = -appCompatSpinner.f2268h.left;
                }
            } else {
                Rect rect = appCompatSpinner.f2268h;
                rect.right = 0;
                rect.left = 0;
                i10 = 0;
            }
            int paddingLeft = appCompatSpinner.getPaddingLeft();
            int paddingRight = appCompatSpinner.getPaddingRight();
            int width = appCompatSpinner.getWidth();
            int i12 = appCompatSpinner.f2267g;
            if (i12 == -2) {
                int a10 = appCompatSpinner.a((SpinnerAdapter) this.E, getBackground());
                int i13 = appCompatSpinner.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = appCompatSpinner.f2268h;
                int i14 = (i13 - rect2.left) - rect2.right;
                if (a10 > i14) {
                    a10 = i14;
                }
                p(Math.max(a10, (width - paddingLeft) - paddingRight));
            } else if (i12 == -1) {
                p((width - paddingLeft) - paddingRight);
            } else {
                p(i12);
            }
            if (d1.a(appCompatSpinner)) {
                i11 = (((width - paddingRight) - this.f2316e) - this.G) + i10;
            } else {
                i11 = paddingLeft + this.G + i10;
            }
            this.f2317f = i11;
        }
    }

    /* loaded from: classes.dex */
    public static class h extends View.BaseSavedState {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public boolean f2279a;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<h> {
            @Override // android.os.Parcelable.Creator
            public final h createFromParcel(Parcel parcel) {
                return new h(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final h[] newArray(int i10) {
                return new h[i10];
            }
        }

        public h(Parcel parcel) {
            super(parcel);
            boolean z10;
            if (parcel.readByte() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f2279a = z10;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f2279a ? (byte) 1 : (byte) 0);
        }
    }

    /* loaded from: classes.dex */
    public interface i {
        boolean a();

        int b();

        void d(int i10);

        void dismiss();

        CharSequence e();

        void g(CharSequence charSequence);

        Drawable getBackground();

        void h(Drawable drawable);

        void j(int i10);

        void k(int i10);

        void l(int i10, int i11);

        int m();

        void n(ListAdapter listAdapter);
    }

    public AppCompatSpinner(Context context) {
        this(context, null);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i11 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        if (drawable != null) {
            Rect rect = this.f2268h;
            drawable.getPadding(rect);
            return i11 + rect.left + rect.right;
        }
        return i11;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.e eVar = this.f2262a;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        i iVar = this.f2266f;
        if (iVar != null) {
            return iVar.b();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        i iVar = this.f2266f;
        if (iVar != null) {
            return iVar.m();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f2266f != null) {
            return this.f2267g;
        }
        return super.getDropDownWidth();
    }

    public final i getInternalPopup() {
        return this.f2266f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        i iVar = this.f2266f;
        if (iVar != null) {
            return iVar.getBackground();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f2263b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        i iVar = this.f2266f;
        if (iVar != null) {
            return iVar.e();
        }
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.e eVar = this.f2262a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.e eVar = this.f2262a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i iVar = this.f2266f;
        if (iVar != null && iVar.a()) {
            iVar.dismiss();
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f2266f != null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.getSuperState());
        if (hVar.f2279a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new a());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z10;
        h hVar = new h(super.onSaveInstanceState());
        i iVar = this.f2266f;
        if (iVar != null && iVar.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        hVar.f2279a = z10;
        return hVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        p pVar = this.c;
        if (pVar != null && pVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        i iVar = this.f2266f;
        if (iVar != null) {
            if (!iVar.a()) {
                iVar.l(c.b(this), c.a(this));
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.e eVar = this.f2262a;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        androidx.appcompat.widget.e eVar = this.f2262a;
        if (eVar != null) {
            eVar.f(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        i iVar = this.f2266f;
        if (iVar != null) {
            iVar.k(i10);
            iVar.d(i10);
            return;
        }
        super.setDropDownHorizontalOffset(i10);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        i iVar = this.f2266f;
        if (iVar != null) {
            iVar.j(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f2266f != null) {
            this.f2267g = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        i iVar = this.f2266f;
        if (iVar != null) {
            iVar.h(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(m.a.a(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        i iVar = this.f2266f;
        if (iVar != null) {
            iVar.g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        androidx.appcompat.widget.e eVar = this.f2262a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        androidx.appcompat.widget.e eVar = this.f2262a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.spinnerStyle);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f2265e) {
            this.f2264d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        i iVar = this.f2266f;
        if (iVar != null) {
            Context context = this.f2263b;
            if (context == null) {
                context = getContext();
            }
            iVar.n(new f(spinnerAdapter, context.getTheme()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
        if (r5 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppCompatSpinner(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            r10.<init>(r11, r12, r13)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.f2268h = r0
            android.content.Context r0 = r10.getContext()
            androidx.appcompat.widget.p0.a(r0, r10)
            int[] r0 = k.a.f19451x
            r1 = 0
            android.content.res.TypedArray r2 = r11.obtainStyledAttributes(r12, r0, r13, r1)
            androidx.appcompat.widget.e r3 = new androidx.appcompat.widget.e
            r3.<init>(r10)
            r10.f2262a = r3
            r3 = 4
            int r3 = r2.getResourceId(r3, r1)
            if (r3 == 0) goto L2e
            q.c r4 = new q.c
            r4.<init>(r11, r3)
            r10.f2263b = r4
            goto L30
        L2e:
            r10.f2263b = r11
        L30:
            r3 = -1
            r4 = 0
            int[] r5 = androidx.appcompat.widget.AppCompatSpinner.f2261i     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L4d
            android.content.res.TypedArray r5 = r11.obtainStyledAttributes(r12, r5, r13, r1)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L4d
            boolean r6 = r5.hasValue(r1)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L4e
            if (r6 == 0) goto L50
            int r3 = r5.getInt(r1, r1)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L4e
            goto L50
        L43:
            r11 = move-exception
            r4 = r5
            goto L47
        L46:
            r11 = move-exception
        L47:
            if (r4 == 0) goto L4c
            r4.recycle()
        L4c:
            throw r11
        L4d:
            r5 = r4
        L4e:
            if (r5 == 0) goto L53
        L50:
            r5.recycle()
        L53:
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L8b
            if (r3 == r6) goto L5a
            goto L98
        L5a:
            androidx.appcompat.widget.AppCompatSpinner$g r3 = new androidx.appcompat.widget.AppCompatSpinner$g
            android.content.Context r7 = r10.f2263b
            r3.<init>(r7, r12, r13)
            android.content.Context r7 = r10.f2263b
            androidx.appcompat.widget.u0 r0 = androidx.appcompat.widget.u0.m(r7, r12, r0, r13, r1)
            android.content.res.TypedArray r7 = r0.f2688b
            r8 = 3
            r9 = -2
            int r7 = r7.getLayoutDimension(r8, r9)
            r10.f2267g = r7
            android.graphics.drawable.Drawable r7 = r0.e(r6)
            r3.h(r7)
            java.lang.String r5 = r2.getString(r5)
            r3.D = r5
            r0.n()
            r10.f2266f = r3
            androidx.appcompat.widget.p r0 = new androidx.appcompat.widget.p
            r0.<init>(r10, r10, r3)
            r10.c = r0
            goto L98
        L8b:
            androidx.appcompat.widget.AppCompatSpinner$e r0 = new androidx.appcompat.widget.AppCompatSpinner$e
            r0.<init>()
            r10.f2266f = r0
            java.lang.String r3 = r2.getString(r5)
            r0.c = r3
        L98:
            java.lang.CharSequence[] r0 = r2.getTextArray(r1)
            if (r0 == 0) goto Laf
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r11, r3, r0)
            r11 = 2131558937(0x7f0d0219, float:1.8743204E38)
            r1.setDropDownViewResource(r11)
            r10.setAdapter(r1)
        Laf:
            r2.recycle()
            r10.f2265e = r6
            android.widget.SpinnerAdapter r11 = r10.f2264d
            if (r11 == 0) goto Lbd
            r10.setAdapter(r11)
            r10.f2264d = r4
        Lbd:
            androidx.appcompat.widget.e r11 = r10.f2262a
            r11.d(r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* loaded from: classes.dex */
    public class e implements i, DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public androidx.appcompat.app.b f2270a;

        /* renamed from: b  reason: collision with root package name */
        public ListAdapter f2271b;
        public CharSequence c;

        public e() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public final boolean a() {
            androidx.appcompat.app.b bVar = this.f2270a;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public final int b() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public final void dismiss() {
            androidx.appcompat.app.b bVar = this.f2270a;
            if (bVar != null) {
                bVar.dismiss();
                this.f2270a = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public final CharSequence e() {
            return this.c;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public final void g(CharSequence charSequence) {
            this.c = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public final Drawable getBackground() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public final void l(int i10, int i11) {
            if (this.f2271b == null) {
                return;
            }
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            b.a aVar = new b.a(appCompatSpinner.getPopupContext());
            CharSequence charSequence = this.c;
            AlertController.b bVar = aVar.f1918a;
            if (charSequence != null) {
                bVar.f1899d = charSequence;
            }
            ListAdapter listAdapter = this.f2271b;
            int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
            bVar.f1909n = listAdapter;
            bVar.f1910o = this;
            bVar.f1912q = selectedItemPosition;
            bVar.f1911p = true;
            androidx.appcompat.app.b a10 = aVar.a();
            this.f2270a = a10;
            AlertController.RecycleListView recycleListView = a10.f1917f.f1874g;
            c.d(recycleListView, i10);
            c.c(recycleListView, i11);
            this.f2270a.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public final int m() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public final void n(ListAdapter listAdapter) {
            this.f2271b = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            appCompatSpinner.setSelection(i10);
            if (appCompatSpinner.getOnItemClickListener() != null) {
                appCompatSpinner.performItemClick(null, i10, this.f2271b.getItemId(i10));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public final void d(int i10) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public final void h(Drawable drawable) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public final void j(int i10) {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.i
        public final void k(int i10) {
        }
    }
}
