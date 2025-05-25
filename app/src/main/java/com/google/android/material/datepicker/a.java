package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.AdError;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

/* compiled from: CalendarConstraints.java */
/* loaded from: classes2.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0167a();

    /* renamed from: a  reason: collision with root package name */
    public final u f12396a;

    /* renamed from: b  reason: collision with root package name */
    public final u f12397b;
    public final c c;

    /* renamed from: d  reason: collision with root package name */
    public final u f12398d;

    /* renamed from: e  reason: collision with root package name */
    public final int f12399e;

    /* renamed from: f  reason: collision with root package name */
    public final int f12400f;

    /* renamed from: g  reason: collision with root package name */
    public final int f12401g;

    /* compiled from: CalendarConstraints.java */
    /* renamed from: com.google.android.material.datepicker.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0167a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a((u) parcel.readParcelable(u.class.getClassLoader()), (u) parcel.readParcelable(u.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (u) parcel.readParcelable(u.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* compiled from: CalendarConstraints.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: f  reason: collision with root package name */
        public static final long f12402f = d0.a(u.a(1900, 0).f12469f);

        /* renamed from: g  reason: collision with root package name */
        public static final long f12403g = d0.a(u.a(AdError.BROKEN_MEDIA_ERROR_CODE, 11).f12469f);

        /* renamed from: a  reason: collision with root package name */
        public final long f12404a;

        /* renamed from: b  reason: collision with root package name */
        public final long f12405b;
        public Long c;

        /* renamed from: d  reason: collision with root package name */
        public final int f12406d;

        /* renamed from: e  reason: collision with root package name */
        public final c f12407e;

        public b(a aVar) {
            this.f12404a = f12402f;
            this.f12405b = f12403g;
            this.f12407e = new e(Long.MIN_VALUE);
            this.f12404a = aVar.f12396a.f12469f;
            this.f12405b = aVar.f12397b.f12469f;
            this.c = Long.valueOf(aVar.f12398d.f12469f);
            this.f12406d = aVar.f12399e;
            this.f12407e = aVar.c;
        }
    }

    /* compiled from: CalendarConstraints.java */
    /* loaded from: classes2.dex */
    public interface c extends Parcelable {
        boolean c(long j10);
    }

    public a(u uVar, u uVar2, c cVar, u uVar3, int i10) {
        Objects.requireNonNull(uVar, "start cannot be null");
        Objects.requireNonNull(uVar2, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.f12396a = uVar;
        this.f12397b = uVar2;
        this.f12398d = uVar3;
        this.f12399e = i10;
        this.c = cVar;
        Calendar calendar = uVar.f12465a;
        if (uVar3 != null && calendar.compareTo(uVar3.f12465a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (uVar3 != null && uVar3.f12465a.compareTo(uVar2.f12465a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i10 >= 0 && i10 <= d0.e(null).getMaximum(7)) {
            if (calendar instanceof GregorianCalendar) {
                int i11 = uVar2.c;
                int i12 = uVar.c;
                this.f12401g = (uVar2.f12466b - uVar.f12466b) + ((i11 - i12) * 12) + 1;
                this.f12400f = (i11 - i12) + 1;
                return;
            }
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        throw new IllegalArgumentException("firstDayOfWeek is not valid");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f12396a.equals(aVar.f12396a) && this.f12397b.equals(aVar.f12397b) && w0.b.a(this.f12398d, aVar.f12398d) && this.f12399e == aVar.f12399e && this.c.equals(aVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12396a, this.f12397b, this.f12398d, Integer.valueOf(this.f12399e), this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f12396a, 0);
        parcel.writeParcelable(this.f12397b, 0);
        parcel.writeParcelable(this.f12398d, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeInt(this.f12399e);
    }
}
