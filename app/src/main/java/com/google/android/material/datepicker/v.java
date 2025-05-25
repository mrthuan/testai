package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: MonthAdapter.java */
/* loaded from: classes2.dex */
public final class v extends BaseAdapter {

    /* renamed from: g  reason: collision with root package name */
    public static final int f12471g = d0.e(null).getMaximum(4);

    /* renamed from: h  reason: collision with root package name */
    public static final int f12472h = (d0.e(null).getMaximum(7) + d0.e(null).getMaximum(5)) - 1;

    /* renamed from: a  reason: collision with root package name */
    public final u f12473a;

    /* renamed from: b  reason: collision with root package name */
    public final d<?> f12474b;
    public Collection<Long> c;

    /* renamed from: d  reason: collision with root package name */
    public c f12475d;

    /* renamed from: e  reason: collision with root package name */
    public final a f12476e;

    /* renamed from: f  reason: collision with root package name */
    public final f f12477f;

    public v(u uVar, d<?> dVar, a aVar, f fVar) {
        this.f12473a = uVar;
        this.f12474b = dVar;
        this.f12476e = aVar;
        this.f12477f = fVar;
        this.c = dVar.Y();
    }

    public final int b() {
        int i10 = this.f12476e.f12399e;
        u uVar = this.f12473a;
        Calendar calendar = uVar.f12465a;
        int i11 = calendar.get(7);
        if (i10 <= 0) {
            i10 = calendar.getFirstDayOfWeek();
        }
        int i12 = i11 - i10;
        if (i12 < 0) {
            return i12 + uVar.f12467d;
        }
        return i12;
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public final Long getItem(int i10) {
        if (i10 >= b()) {
            int b10 = b();
            u uVar = this.f12473a;
            if (i10 <= (b10 + uVar.f12468e) - 1) {
                Calendar c = d0.c(uVar.f12465a);
                c.set(5, (i10 - b()) + 1);
                return Long.valueOf(c.getTimeInMillis());
            }
            return null;
        }
        return null;
    }

    public final void d(TextView textView, long j10, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        String format;
        b bVar;
        boolean z14;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        boolean z15 = true;
        if (d0.d().getTimeInMillis() == j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        d<?> dVar = this.f12474b;
        Iterator<w0.c<Long, Long>> it = dVar.t().iterator();
        while (true) {
            if (it.hasNext()) {
                Long l10 = it.next().f30902a;
                if (l10 != null && l10.longValue() == j10) {
                    z11 = true;
                    break;
                }
            } else {
                z11 = false;
                break;
            }
        }
        Iterator<w0.c<Long, Long>> it2 = dVar.t().iterator();
        while (true) {
            if (it2.hasNext()) {
                Long l11 = it2.next().f30903b;
                if (l11 != null && l11.longValue() == j10) {
                    z12 = true;
                    break;
                }
            } else {
                z12 = false;
                break;
            }
        }
        Calendar d10 = d0.d();
        Calendar e10 = d0.e(null);
        e10.setTimeInMillis(j10);
        if (d10.get(1) == e10.get(1)) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            Locale locale = Locale.getDefault();
            if (Build.VERSION.SDK_INT >= 24) {
                format = d0.b("MMMEd", locale).format(new Date(j10));
            } else {
                DateFormat dateInstance = DateFormat.getDateInstance(0, locale);
                dateInstance.setTimeZone(TimeZone.getTimeZone("UTC"));
                format = dateInstance.format(new Date(j10));
            }
        } else {
            Locale locale2 = Locale.getDefault();
            if (Build.VERSION.SDK_INT >= 24) {
                format = d0.b("yMMMEd", locale2).format(new Date(j10));
            } else {
                DateFormat dateInstance2 = DateFormat.getDateInstance(0, locale2);
                dateInstance2.setTimeZone(TimeZone.getTimeZone("UTC"));
                format = dateInstance2.format(new Date(j10));
            }
        }
        if (z10) {
            format = String.format(context.getString(R.string.arg_res_0x7f130298), format);
        }
        if (z11) {
            format = String.format(context.getString(R.string.arg_res_0x7f130291), format);
        } else if (z12) {
            format = String.format(context.getString(R.string.arg_res_0x7f130283), format);
        }
        textView.setContentDescription(format);
        if (this.f12476e.c.c(j10)) {
            textView.setEnabled(true);
            Iterator<Long> it3 = dVar.Y().iterator();
            while (true) {
                if (it3.hasNext()) {
                    if (d0.a(j10) == d0.a(it3.next().longValue())) {
                        z14 = true;
                        break;
                    }
                } else {
                    z14 = false;
                    break;
                }
            }
            textView.setSelected(z14);
            if (z14) {
                bVar = this.f12475d.f12414b;
            } else {
                if (d0.d().getTimeInMillis() != j10) {
                    z15 = false;
                }
                if (z15) {
                    bVar = this.f12475d.c;
                } else {
                    bVar = this.f12475d.f12413a;
                }
            }
        } else {
            textView.setEnabled(false);
            bVar = this.f12475d.f12418g;
        }
        if (this.f12477f != null && i10 != -1) {
            int i11 = this.f12473a.c;
            bVar.b(textView);
            textView.setCompoundDrawables(null, null, null, null);
            textView.setContentDescription(format);
            return;
        }
        bVar.b(textView);
    }

    public final void e(MaterialCalendarGridView materialCalendarGridView, long j10) {
        u b10 = u.b(j10);
        u uVar = this.f12473a;
        if (b10.equals(uVar)) {
            Calendar c = d0.c(uVar.f12465a);
            c.setTimeInMillis(j10);
            int i10 = c.get(5);
            d((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.getAdapter2().b() + (i10 - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j10, i10);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f12472h;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10 / this.f12473a.f12467d;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            com.google.android.material.datepicker.c r1 = r5.f12475d
            if (r1 != 0) goto Lf
            com.google.android.material.datepicker.c r1 = new com.google.android.material.datepicker.c
            r1.<init>(r0)
            r5.f12475d = r1
        Lf:
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1f
            r7 = 2131558849(0x7f0d01c1, float:1.8743025E38)
            android.view.View r7 = androidx.activity.f.i(r8, r7, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1f:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L55
            com.google.android.material.datepicker.u r8 = r5.f12473a
            int r2 = r8.f12468e
            if (r7 < r2) goto L2e
            goto L55
        L2e:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L5e
        L55:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
            r7 = -1
        L5e:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L65
            goto L6c
        L65:
            long r1 = r6.longValue()
            r5.d(r0, r1, r7)
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.v.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
