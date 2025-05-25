package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.p;
import java.util.Calendar;
import java.util.GregorianCalendar;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes2.dex */
public final class MaterialCalendar<S> extends z<S> {

    /* renamed from: m0  reason: collision with root package name */
    public static final /* synthetic */ int f12379m0 = 0;
    public int Z;

    /* renamed from: a0  reason: collision with root package name */
    public com.google.android.material.datepicker.d<S> f12380a0;

    /* renamed from: b0  reason: collision with root package name */
    public com.google.android.material.datepicker.a f12381b0;

    /* renamed from: c0  reason: collision with root package name */
    public f f12382c0;

    /* renamed from: d0  reason: collision with root package name */
    public u f12383d0;

    /* renamed from: e0  reason: collision with root package name */
    public CalendarSelector f12384e0;

    /* renamed from: f0  reason: collision with root package name */
    public com.google.android.material.datepicker.c f12385f0;

    /* renamed from: g0  reason: collision with root package name */
    public RecyclerView f12386g0;

    /* renamed from: h0  reason: collision with root package name */
    public RecyclerView f12387h0;

    /* renamed from: i0  reason: collision with root package name */
    public View f12388i0;

    /* renamed from: j0  reason: collision with root package name */
    public View f12389j0;

    /* renamed from: k0  reason: collision with root package name */
    public View f12390k0;

    /* renamed from: l0  reason: collision with root package name */
    public View f12391l0;

    /* loaded from: classes2.dex */
    public enum CalendarSelector {
        DAY,
        YEAR
    }

    /* loaded from: classes2.dex */
    public class a extends x0.a {
        @Override // x0.a
        public final void d(View view, y0.f fVar) {
            View.AccessibilityDelegate accessibilityDelegate = this.f31416a;
            AccessibilityNodeInfo accessibilityNodeInfo = fVar.f31951a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCollectionInfo(null);
        }
    }

    /* loaded from: classes2.dex */
    public class b extends b0 {
        public final /* synthetic */ int E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, int i11) {
            super(i10);
            this.E = i11;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void O0(RecyclerView.y yVar, int[] iArr) {
            int i10 = this.E;
            MaterialCalendar materialCalendar = MaterialCalendar.this;
            if (i10 == 0) {
                iArr[0] = materialCalendar.f12387h0.getWidth();
                iArr[1] = materialCalendar.f12387h0.getWidth();
                return;
            }
            iArr[0] = materialCalendar.f12387h0.getHeight();
            iArr[1] = materialCalendar.f12387h0.getHeight();
        }
    }

    /* loaded from: classes2.dex */
    public class c implements d {
        public c() {
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
    }

    @Override // androidx.fragment.app.Fragment
    public final void M(Bundle bundle) {
        super.M(bundle);
        if (bundle == null) {
            bundle = this.f3674g;
        }
        this.Z = bundle.getInt("THEME_RES_ID_KEY");
        this.f12380a0 = (com.google.android.material.datepicker.d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f12381b0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f12382c0 = (f) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f12383d0 = (u) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View N(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        g gVar;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(r(), this.Z);
        this.f12385f0 = new com.google.android.material.datepicker.c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        u uVar = this.f12381b0.f12396a;
        if (p.u0(contextThemeWrapper)) {
            i10 = R.layout.mtrl_calendar_vertical;
            i11 = 1;
        } else {
            i10 = R.layout.mtrl_calendar_horizontal;
            i11 = 0;
        }
        View inflate = cloneInContext.inflate(i10, viewGroup, false);
        Resources resources = g0().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i12 = v.f12471g;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i12 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i12) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        x0.f0.o(gridView, new a());
        int i13 = this.f12381b0.f12399e;
        if (i13 > 0) {
            gVar = new g(i13);
        } else {
            gVar = new g();
        }
        gridView.setAdapter((ListAdapter) gVar);
        gridView.setNumColumns(uVar.f12467d);
        gridView.setEnabled(false);
        this.f12387h0 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        r();
        this.f12387h0.setLayoutManager(new b(i11, i11));
        this.f12387h0.setTag("MONTHS_VIEW_GROUP_TAG");
        x xVar = new x(contextThemeWrapper, this.f12380a0, this.f12381b0, this.f12382c0, new c());
        this.f12387h0.setAdapter(xVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f12386g0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f12386g0.setLayoutManager(new GridLayoutManager(integer, 0));
            this.f12386g0.setAdapter(new f0(this));
            this.f12386g0.q(new k(this));
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            x0.f0.o(materialButton, new l(this));
            View findViewById = inflate.findViewById(R.id.month_navigation_previous);
            this.f12388i0 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(R.id.month_navigation_next);
            this.f12389j0 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f12390k0 = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.f12391l0 = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            r0(CalendarSelector.DAY);
            materialButton.setText(this.f12383d0.d());
            this.f12387h0.s(new m(this, xVar, materialButton));
            materialButton.setOnClickListener(new n(this));
            this.f12389j0.setOnClickListener(new o(this, xVar));
            this.f12388i0.setOnClickListener(new h(this, xVar));
        }
        if (!p.u0(contextThemeWrapper)) {
            new androidx.recyclerview.widget.c0().a(this.f12387h0);
        }
        RecyclerView recyclerView2 = this.f12387h0;
        u uVar2 = this.f12383d0;
        u uVar3 = xVar.f12480d.f12396a;
        if (uVar3.f12465a instanceof GregorianCalendar) {
            recyclerView2.r0((uVar2.f12466b - uVar3.f12466b) + ((uVar2.c - uVar3.c) * 12));
            x0.f0.o(this.f12387h0, new j());
            return inflate;
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // androidx.fragment.app.Fragment
    public final void X(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.Z);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f12380a0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f12381b0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f12382c0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f12383d0);
    }

    @Override // com.google.android.material.datepicker.z
    public final boolean p0(p.d dVar) {
        return super.p0(dVar);
    }

    public final void q0(u uVar) {
        boolean z10;
        u uVar2 = ((x) this.f12387h0.getAdapter()).f12480d.f12396a;
        Calendar calendar = uVar2.f12465a;
        if (calendar instanceof GregorianCalendar) {
            int i10 = uVar.c;
            int i11 = uVar2.c;
            int i12 = uVar.f12466b;
            int i13 = uVar2.f12466b;
            int i14 = (i12 - i13) + ((i10 - i11) * 12);
            u uVar3 = this.f12383d0;
            if (calendar instanceof GregorianCalendar) {
                int i15 = i14 - ((uVar3.f12466b - i13) + ((uVar3.c - i11) * 12));
                boolean z11 = true;
                if (Math.abs(i15) > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i15 <= 0) {
                    z11 = false;
                }
                this.f12383d0 = uVar;
                if (z10 && z11) {
                    this.f12387h0.r0(i14 - 3);
                    this.f12387h0.post(new i(this, i14));
                    return;
                } else if (z10) {
                    this.f12387h0.r0(i14 + 3);
                    this.f12387h0.post(new i(this, i14));
                    return;
                } else {
                    this.f12387h0.post(new i(this, i14));
                    return;
                }
            }
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public final void r0(CalendarSelector calendarSelector) {
        this.f12384e0 = calendarSelector;
        if (calendarSelector == CalendarSelector.YEAR) {
            this.f12386g0.getLayoutManager().B0(this.f12383d0.c - ((f0) this.f12386g0.getAdapter()).f12426d.f12381b0.f12396a.c);
            this.f12390k0.setVisibility(0);
            this.f12391l0.setVisibility(8);
            this.f12388i0.setVisibility(8);
            this.f12389j0.setVisibility(8);
        } else if (calendarSelector == CalendarSelector.DAY) {
            this.f12390k0.setVisibility(8);
            this.f12391l0.setVisibility(0);
            this.f12388i0.setVisibility(0);
            this.f12389j0.setVisibility(0);
            q0(this.f12383d0);
        }
    }
}
