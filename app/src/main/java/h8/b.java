package h8;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import b9.c;
import java.io.IOException;
import java.util.Locale;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import org.xmlpull.v1.XmlPullParserException;
import pdf.pdfreader.viewer.editor.free.R;
import w8.s;

/* compiled from: BadgeState.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final a f18078a;

    /* renamed from: b  reason: collision with root package name */
    public final a f18079b = new a();
    public final float c;

    /* renamed from: d  reason: collision with root package name */
    public final float f18080d;

    /* renamed from: e  reason: collision with root package name */
    public final float f18081e;

    /* renamed from: f  reason: collision with root package name */
    public final float f18082f;

    /* renamed from: g  reason: collision with root package name */
    public final float f18083g;

    /* renamed from: h  reason: collision with root package name */
    public final float f18084h;

    /* renamed from: i  reason: collision with root package name */
    public final float f18085i;

    /* renamed from: j  reason: collision with root package name */
    public final int f18086j;

    /* renamed from: k  reason: collision with root package name */
    public final int f18087k;

    /* renamed from: l  reason: collision with root package name */
    public final int f18088l;

    public b(Context context, a aVar) {
        a aVar2;
        AttributeSet attributeSet;
        int i10;
        int i11;
        boolean z10;
        int intValue;
        int intValue2;
        int intValue3;
        int intValue4;
        int intValue5;
        int intValue6;
        int i12;
        int intValue7;
        int intValue8;
        int intValue9;
        int intValue10;
        int intValue11;
        int intValue12;
        Locale locale;
        Locale.Category category;
        int next;
        if (aVar == null) {
            aVar2 = new a();
        } else {
            aVar2 = aVar;
        }
        int i13 = aVar2.f18089a;
        if (i13 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i13);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    if (TextUtils.equals(xml.getName(), "badge")) {
                        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                        i10 = asAttributeSet.getStyleAttribute();
                        attributeSet = asAttributeSet;
                    } else {
                        throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (IOException | XmlPullParserException e10) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i13));
                notFoundException.initCause(e10);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            i10 = 0;
        }
        if (i10 == 0) {
            i11 = 2132018218;
        } else {
            i11 = i10;
        }
        TypedArray d10 = s.d(context, attributeSet, e8.a.c, R.attr.badgeStyle, i11, new int[0]);
        Resources resources = context.getResources();
        this.c = d10.getDimensionPixelSize(3, -1);
        this.f18085i = d10.getDimensionPixelSize(8, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding));
        this.f18086j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.f18087k = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.f18080d = d10.getDimensionPixelSize(11, -1);
        this.f18081e = d10.getDimension(9, resources.getDimension(R.dimen.m3_badge_size));
        this.f18083g = d10.getDimension(14, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f18082f = d10.getDimension(2, resources.getDimension(R.dimen.m3_badge_size));
        this.f18084h = d10.getDimension(10, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f18088l = d10.getInt(19, 1);
        a aVar3 = this.f18079b;
        int i14 = aVar2.f18096i;
        aVar3.f18096i = i14 == -2 ? FunctionEval.FunctionID.EXTERNAL_FUNC : i14;
        CharSequence charSequence = aVar2.f18100m;
        aVar3.f18100m = charSequence == null ? context.getString(R.string.arg_res_0x7f130269) : charSequence;
        a aVar4 = this.f18079b;
        int i15 = aVar2.f18101n;
        aVar4.f18101n = i15 == 0 ? R.plurals.mtrl_badge_content_description : i15;
        int i16 = aVar2.f18102o;
        aVar4.f18102o = i16 == 0 ? R.string.arg_res_0x7f130276 : i16;
        Boolean bool = aVar2.f18104q;
        if (bool != null && !bool.booleanValue()) {
            z10 = false;
        } else {
            z10 = true;
        }
        aVar4.f18104q = Boolean.valueOf(z10);
        a aVar5 = this.f18079b;
        int i17 = aVar2.f18098k;
        aVar5.f18098k = i17 == -2 ? d10.getInt(17, 4) : i17;
        int i18 = aVar2.f18097j;
        if (i18 != -2) {
            this.f18079b.f18097j = i18;
        } else if (d10.hasValue(18)) {
            this.f18079b.f18097j = d10.getInt(18, 0);
        } else {
            this.f18079b.f18097j = -1;
        }
        a aVar6 = this.f18079b;
        Integer num = aVar2.f18092e;
        if (num == null) {
            intValue = d10.getResourceId(4, 2132017543);
        } else {
            intValue = num.intValue();
        }
        aVar6.f18092e = Integer.valueOf(intValue);
        a aVar7 = this.f18079b;
        Integer num2 = aVar2.f18093f;
        if (num2 == null) {
            intValue2 = d10.getResourceId(5, 0);
        } else {
            intValue2 = num2.intValue();
        }
        aVar7.f18093f = Integer.valueOf(intValue2);
        a aVar8 = this.f18079b;
        Integer num3 = aVar2.f18094g;
        if (num3 == null) {
            intValue3 = d10.getResourceId(12, 2132017543);
        } else {
            intValue3 = num3.intValue();
        }
        aVar8.f18094g = Integer.valueOf(intValue3);
        a aVar9 = this.f18079b;
        Integer num4 = aVar2.f18095h;
        if (num4 == null) {
            intValue4 = d10.getResourceId(13, 0);
        } else {
            intValue4 = num4.intValue();
        }
        aVar9.f18095h = Integer.valueOf(intValue4);
        a aVar10 = this.f18079b;
        Integer num5 = aVar2.f18090b;
        if (num5 == null) {
            intValue5 = c.a(context, d10, 0).getDefaultColor();
        } else {
            intValue5 = num5.intValue();
        }
        aVar10.f18090b = Integer.valueOf(intValue5);
        a aVar11 = this.f18079b;
        Integer num6 = aVar2.f18091d;
        if (num6 == null) {
            intValue6 = d10.getResourceId(6, 2132017701);
        } else {
            intValue6 = num6.intValue();
        }
        aVar11.f18091d = Integer.valueOf(intValue6);
        Integer num7 = aVar2.c;
        if (num7 != null) {
            this.f18079b.c = num7;
        } else if (d10.hasValue(7)) {
            this.f18079b.c = Integer.valueOf(c.a(context, d10, 7).getDefaultColor());
        } else {
            int intValue13 = this.f18079b.f18091d.intValue();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(intValue13, e8.a.f16479d0);
            obtainStyledAttributes.getDimension(0, 0.0f);
            ColorStateList a10 = c.a(context, obtainStyledAttributes, 3);
            c.a(context, obtainStyledAttributes, 4);
            c.a(context, obtainStyledAttributes, 5);
            obtainStyledAttributes.getInt(2, 0);
            obtainStyledAttributes.getInt(1, 1);
            if (obtainStyledAttributes.hasValue(12)) {
                i12 = 12;
            } else {
                i12 = 10;
            }
            obtainStyledAttributes.getResourceId(i12, 0);
            obtainStyledAttributes.getString(i12);
            obtainStyledAttributes.getBoolean(14, false);
            c.a(context, obtainStyledAttributes, 6);
            obtainStyledAttributes.getFloat(7, 0.0f);
            obtainStyledAttributes.getFloat(8, 0.0f);
            obtainStyledAttributes.getFloat(9, 0.0f);
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(intValue13, e8.a.I);
            obtainStyledAttributes2.hasValue(0);
            obtainStyledAttributes2.getFloat(0, 0.0f);
            obtainStyledAttributes2.recycle();
            this.f18079b.c = Integer.valueOf(a10.getDefaultColor());
        }
        a aVar12 = this.f18079b;
        Integer num8 = aVar2.f18103p;
        if (num8 == null) {
            intValue7 = d10.getInt(1, 8388661);
        } else {
            intValue7 = num8.intValue();
        }
        aVar12.f18103p = Integer.valueOf(intValue7);
        a aVar13 = this.f18079b;
        Integer num9 = aVar2.f18105r;
        if (num9 == null) {
            intValue8 = d10.getDimensionPixelOffset(15, 0);
        } else {
            intValue8 = num9.intValue();
        }
        aVar13.f18105r = Integer.valueOf(intValue8);
        a aVar14 = this.f18079b;
        Integer num10 = aVar2.f18106s;
        if (num10 == null) {
            intValue9 = d10.getDimensionPixelOffset(20, 0);
        } else {
            intValue9 = num10.intValue();
        }
        aVar14.f18106s = Integer.valueOf(intValue9);
        a aVar15 = this.f18079b;
        Integer num11 = aVar2.f18107t;
        if (num11 == null) {
            intValue10 = d10.getDimensionPixelOffset(16, aVar15.f18105r.intValue());
        } else {
            intValue10 = num11.intValue();
        }
        aVar15.f18107t = Integer.valueOf(intValue10);
        a aVar16 = this.f18079b;
        Integer num12 = aVar2.f18108u;
        if (num12 == null) {
            intValue11 = d10.getDimensionPixelOffset(21, aVar16.f18106s.intValue());
        } else {
            intValue11 = num12.intValue();
        }
        aVar16.f18108u = Integer.valueOf(intValue11);
        a aVar17 = this.f18079b;
        Integer num13 = aVar2.f18109v;
        if (num13 == null) {
            intValue12 = 0;
        } else {
            intValue12 = num13.intValue();
        }
        aVar17.f18109v = Integer.valueOf(intValue12);
        a aVar18 = this.f18079b;
        Integer num14 = aVar2.f18110w;
        aVar18.f18110w = Integer.valueOf(num14 != null ? num14.intValue() : 0);
        d10.recycle();
        Locale locale2 = aVar2.f18099l;
        if (locale2 == null) {
            a aVar19 = this.f18079b;
            if (Build.VERSION.SDK_INT >= 24) {
                category = Locale.Category.FORMAT;
                locale = Locale.getDefault(category);
            } else {
                locale = Locale.getDefault();
            }
            aVar19.f18099l = locale;
        } else {
            this.f18079b.f18099l = locale2;
        }
        this.f18078a = aVar2;
    }

    public final boolean a() {
        if (this.f18079b.f18097j != -1) {
            return true;
        }
        return false;
    }

    /* compiled from: BadgeState.java */
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0243a();

        /* renamed from: a  reason: collision with root package name */
        public int f18089a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f18090b;
        public Integer c;

        /* renamed from: d  reason: collision with root package name */
        public Integer f18091d;

        /* renamed from: e  reason: collision with root package name */
        public Integer f18092e;

        /* renamed from: f  reason: collision with root package name */
        public Integer f18093f;

        /* renamed from: g  reason: collision with root package name */
        public Integer f18094g;

        /* renamed from: h  reason: collision with root package name */
        public Integer f18095h;

        /* renamed from: i  reason: collision with root package name */
        public int f18096i;

        /* renamed from: j  reason: collision with root package name */
        public int f18097j;

        /* renamed from: k  reason: collision with root package name */
        public int f18098k;

        /* renamed from: l  reason: collision with root package name */
        public Locale f18099l;

        /* renamed from: m  reason: collision with root package name */
        public CharSequence f18100m;

        /* renamed from: n  reason: collision with root package name */
        public int f18101n;

        /* renamed from: o  reason: collision with root package name */
        public int f18102o;

        /* renamed from: p  reason: collision with root package name */
        public Integer f18103p;

        /* renamed from: q  reason: collision with root package name */
        public Boolean f18104q;

        /* renamed from: r  reason: collision with root package name */
        public Integer f18105r;

        /* renamed from: s  reason: collision with root package name */
        public Integer f18106s;

        /* renamed from: t  reason: collision with root package name */
        public Integer f18107t;

        /* renamed from: u  reason: collision with root package name */
        public Integer f18108u;

        /* renamed from: v  reason: collision with root package name */
        public Integer f18109v;

        /* renamed from: w  reason: collision with root package name */
        public Integer f18110w;

        /* compiled from: BadgeState.java */
        /* renamed from: h8.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0243a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i10) {
                return new a[i10];
            }
        }

        public a() {
            this.f18096i = FunctionEval.FunctionID.EXTERNAL_FUNC;
            this.f18097j = -2;
            this.f18098k = -2;
            this.f18104q = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            String charSequence;
            parcel.writeInt(this.f18089a);
            parcel.writeSerializable(this.f18090b);
            parcel.writeSerializable(this.c);
            parcel.writeSerializable(this.f18091d);
            parcel.writeSerializable(this.f18092e);
            parcel.writeSerializable(this.f18093f);
            parcel.writeSerializable(this.f18094g);
            parcel.writeSerializable(this.f18095h);
            parcel.writeInt(this.f18096i);
            parcel.writeInt(this.f18097j);
            parcel.writeInt(this.f18098k);
            CharSequence charSequence2 = this.f18100m;
            if (charSequence2 == null) {
                charSequence = null;
            } else {
                charSequence = charSequence2.toString();
            }
            parcel.writeString(charSequence);
            parcel.writeInt(this.f18101n);
            parcel.writeSerializable(this.f18103p);
            parcel.writeSerializable(this.f18105r);
            parcel.writeSerializable(this.f18106s);
            parcel.writeSerializable(this.f18107t);
            parcel.writeSerializable(this.f18108u);
            parcel.writeSerializable(this.f18109v);
            parcel.writeSerializable(this.f18110w);
            parcel.writeSerializable(this.f18104q);
            parcel.writeSerializable(this.f18099l);
        }

        public a(Parcel parcel) {
            this.f18096i = FunctionEval.FunctionID.EXTERNAL_FUNC;
            this.f18097j = -2;
            this.f18098k = -2;
            this.f18104q = Boolean.TRUE;
            this.f18089a = parcel.readInt();
            this.f18090b = (Integer) parcel.readSerializable();
            this.c = (Integer) parcel.readSerializable();
            this.f18091d = (Integer) parcel.readSerializable();
            this.f18092e = (Integer) parcel.readSerializable();
            this.f18093f = (Integer) parcel.readSerializable();
            this.f18094g = (Integer) parcel.readSerializable();
            this.f18095h = (Integer) parcel.readSerializable();
            this.f18096i = parcel.readInt();
            this.f18097j = parcel.readInt();
            this.f18098k = parcel.readInt();
            this.f18100m = parcel.readString();
            this.f18101n = parcel.readInt();
            this.f18103p = (Integer) parcel.readSerializable();
            this.f18105r = (Integer) parcel.readSerializable();
            this.f18106s = (Integer) parcel.readSerializable();
            this.f18107t = (Integer) parcel.readSerializable();
            this.f18108u = (Integer) parcel.readSerializable();
            this.f18109v = (Integer) parcel.readSerializable();
            this.f18110w = (Integer) parcel.readSerializable();
            this.f18104q = (Boolean) parcel.readSerializable();
            this.f18099l = (Locale) parcel.readSerializable();
        }
    }
}
