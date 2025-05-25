package com.google.android.material.datepicker;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* compiled from: Month.java */
/* loaded from: classes2.dex */
public final class u implements Comparable<u>, Parcelable {
    public static final Parcelable.Creator<u> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Calendar f12465a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12466b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f12467d;

    /* renamed from: e  reason: collision with root package name */
    public final int f12468e;

    /* renamed from: f  reason: collision with root package name */
    public final long f12469f;

    /* renamed from: g  reason: collision with root package name */
    public String f12470g;

    /* compiled from: Month.java */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<u> {
        @Override // android.os.Parcelable.Creator
        public final u createFromParcel(Parcel parcel) {
            return u.a(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final u[] newArray(int i10) {
            return new u[i10];
        }
    }

    public u(Calendar calendar) {
        calendar.set(5, 1);
        Calendar c = d0.c(calendar);
        this.f12465a = c;
        this.f12466b = c.get(2);
        this.c = c.get(1);
        this.f12467d = c.getMaximum(7);
        this.f12468e = c.getActualMaximum(5);
        this.f12469f = c.getTimeInMillis();
    }

    public static u a(int i10, int i11) {
        Calendar e10 = d0.e(null);
        e10.set(1, i10);
        e10.set(2, i11);
        return new u(e10);
    }

    public static u b(long j10) {
        Calendar e10 = d0.e(null);
        e10.setTimeInMillis(j10);
        return new u(e10);
    }

    @Override // java.lang.Comparable
    public final int compareTo(u uVar) {
        return this.f12465a.compareTo(uVar.f12465a);
    }

    public final String d() {
        String formatDateTime;
        if (this.f12470g == null) {
            long timeInMillis = this.f12465a.getTimeInMillis();
            if (Build.VERSION.SDK_INT >= 24) {
                formatDateTime = d0.b("yMMMM", Locale.getDefault()).format(new Date(timeInMillis));
            } else {
                formatDateTime = DateUtils.formatDateTime(null, timeInMillis, 8228);
            }
            this.f12470g = formatDateTime;
        }
        return this.f12470g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f12466b == uVar.f12466b && this.c == uVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12466b), Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.f12466b);
    }
}
