package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.Calendar;
import java.util.Iterator;
import lib.zj.office.fc.hslf.record.SlideAtom;
import pdf.pdfreader.viewer.editor.free.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MaterialCalendarGridView extends GridView {

    /* renamed from: a  reason: collision with root package name */
    public final Calendar f12394a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f12395b;

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

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: a */
    public final v getAdapter2() {
        return (v) super.getAdapter();
    }

    public final View b(int i10) {
        return getChildAt(i10 - getFirstVisiblePosition());
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter2().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        v vVar;
        Iterator<w0.c<Long, Long>> it;
        int i10;
        int i11;
        boolean z10;
        int b10;
        int width;
        int b11;
        int width2;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z11;
        boolean z12;
        int left;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        v adapter2 = getAdapter2();
        d<?> dVar = adapter2.f12474b;
        c cVar = adapter2.f12475d;
        int max = Math.max(adapter2.b(), getFirstVisiblePosition());
        int b12 = adapter2.b();
        u uVar = adapter2.f12473a;
        int min = Math.min((b12 + uVar.f12468e) - 1, getLastVisiblePosition());
        Long item = adapter2.getItem(max);
        Long item2 = adapter2.getItem(min);
        Iterator<w0.c<Long, Long>> it2 = dVar.t().iterator();
        while (it2.hasNext()) {
            w0.c<Long, Long> next = it2.next();
            Long l10 = next.f30902a;
            if (l10 != null) {
                Long l11 = next.f30903b;
                if (l11 != null) {
                    long longValue = l10.longValue();
                    long longValue2 = l11.longValue();
                    Long valueOf = Long.valueOf(longValue);
                    Long valueOf2 = Long.valueOf(longValue2);
                    if (item != null && item2 != null && valueOf != null && valueOf2 != null && valueOf.longValue() <= item2.longValue() && valueOf2.longValue() >= item.longValue()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (!z10) {
                        boolean e10 = w8.w.e(this);
                        int i16 = (longValue > item.longValue() ? 1 : (longValue == item.longValue() ? 0 : -1));
                        Calendar calendar = materialCalendarGridView.f12394a;
                        if (i16 < 0) {
                            if (max % uVar.f12467d == 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                left = 0;
                            } else if (!e10) {
                                left = materialCalendarGridView.b(max - 1).getRight();
                            } else {
                                left = materialCalendarGridView.b(max - 1).getLeft();
                            }
                            width = left;
                            b10 = max;
                        } else {
                            calendar.setTimeInMillis(longValue);
                            b10 = adapter2.b() + (calendar.get(5) - 1);
                            View b13 = materialCalendarGridView.b(b10);
                            width = (b13.getWidth() / 2) + b13.getLeft();
                        }
                        if (longValue2 > item2.longValue()) {
                            if ((min + 1) % uVar.f12467d == 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                width2 = getWidth();
                            } else if (!e10) {
                                width2 = materialCalendarGridView.b(min).getRight();
                            } else {
                                width2 = materialCalendarGridView.b(min).getLeft();
                            }
                            b11 = min;
                        } else {
                            calendar.setTimeInMillis(longValue2);
                            b11 = adapter2.b() + (calendar.get(5) - 1);
                            View b14 = materialCalendarGridView.b(b11);
                            width2 = (b14.getWidth() / 2) + b14.getLeft();
                        }
                        int itemId = (int) adapter2.getItemId(b10);
                        i10 = max;
                        i11 = min;
                        int itemId2 = (int) adapter2.getItemId(b11);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            v vVar2 = adapter2;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View b15 = materialCalendarGridView.b(numColumns);
                            int top = b15.getTop() + cVar.f12413a.f12408a.top;
                            Iterator<w0.c<Long, Long>> it3 = it2;
                            int bottom = b15.getBottom() - cVar.f12413a.f12408a.bottom;
                            if (!e10) {
                                if (numColumns > b10) {
                                    i14 = 0;
                                } else {
                                    i14 = width;
                                }
                                if (b11 > numColumns2) {
                                    i15 = getWidth();
                                } else {
                                    i15 = width2;
                                }
                            } else {
                                if (b11 > numColumns2) {
                                    i12 = 0;
                                } else {
                                    i12 = width2;
                                }
                                if (numColumns > b10) {
                                    i13 = getWidth();
                                } else {
                                    i13 = width;
                                }
                                int i17 = i13;
                                i14 = i12;
                                i15 = i17;
                            }
                            canvas.drawRect(i14, top, i15, bottom, cVar.f12419h);
                            itemId++;
                            materialCalendarGridView = this;
                            itemId2 = itemId2;
                            adapter2 = vVar2;
                            it2 = it3;
                        }
                        vVar = adapter2;
                        it = it2;
                    }
                }
            } else {
                vVar = adapter2;
                it = it2;
                i10 = max;
                i11 = min;
            }
            materialCalendarGridView = this;
            max = i10;
            min = i11;
            adapter2 = vVar;
            it2 = it;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        if (z10) {
            if (i10 == 33) {
                v adapter2 = getAdapter2();
                setSelection((adapter2.b() + adapter2.f12473a.f12468e) - 1);
                return;
            } else if (i10 == 130) {
                setSelection(getAdapter2().b());
                return;
            } else {
                super.onFocusChanged(true, i10, rect);
                return;
            }
        }
        super.onFocusChanged(false, i10, rect);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!super.onKeyDown(i10, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter2().b()) {
            return true;
        }
        if (19 != i10) {
            return false;
        }
        setSelection(getAdapter2().b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.f12395b) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(16777215, SlideAtom.USES_MASTER_SLIDE_ID));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i10) {
        if (i10 < getAdapter2().b()) {
            super.setSelection(getAdapter2().b());
        } else {
            super.setSelection(i10);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12394a = d0.e(null);
        if (p.u0(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.f12395b = p.v0(getContext(), R.attr.nestedScrollable);
        x0.f0.o(this, new a());
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof v) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), v.class.getCanonicalName()));
    }
}
