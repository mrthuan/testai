package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes.dex */
public abstract class FastJsonResponse {

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @SafeParcelable.Class
    @ShowFirstParty
    @KeepForSdk
    /* loaded from: classes.dex */
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final zaj CREATOR = new zaj();
        @SafeParcelable.VersionField

        /* renamed from: a  reason: collision with root package name */
        public final int f11333a;
        @SafeParcelable.Field

        /* renamed from: b  reason: collision with root package name */
        public final int f11334b;
        @SafeParcelable.Field
        public final boolean c;
        @SafeParcelable.Field

        /* renamed from: d  reason: collision with root package name */
        public final int f11335d;
        @SafeParcelable.Field

        /* renamed from: e  reason: collision with root package name */
        public final boolean f11336e;
        @SafeParcelable.Field

        /* renamed from: f  reason: collision with root package name */
        public final String f11337f;
        @SafeParcelable.Field

        /* renamed from: g  reason: collision with root package name */
        public final int f11338g;

        /* renamed from: h  reason: collision with root package name */
        public final Class f11339h;
        @SafeParcelable.Field

        /* renamed from: i  reason: collision with root package name */
        public final String f11340i;

        /* renamed from: j  reason: collision with root package name */
        public zan f11341j;
        @SafeParcelable.Field

        /* renamed from: k  reason: collision with root package name */
        public final StringToIntConverter f11342k;

        @SafeParcelable.Constructor
        public Field(@SafeParcelable.Param int i10, @SafeParcelable.Param int i11, @SafeParcelable.Param boolean z10, @SafeParcelable.Param int i12, @SafeParcelable.Param boolean z11, @SafeParcelable.Param String str, @SafeParcelable.Param int i13, @SafeParcelable.Param String str2, @SafeParcelable.Param zaa zaaVar) {
            this.f11333a = i10;
            this.f11334b = i11;
            this.c = z10;
            this.f11335d = i12;
            this.f11336e = z11;
            this.f11337f = str;
            this.f11338g = i13;
            if (str2 == null) {
                this.f11339h = null;
                this.f11340i = null;
            } else {
                this.f11339h = SafeParcelResponse.class;
                this.f11340i = str2;
            }
            if (zaaVar == null) {
                this.f11342k = null;
                return;
            }
            StringToIntConverter stringToIntConverter = zaaVar.f11330b;
            if (stringToIntConverter != null) {
                this.f11342k = stringToIntConverter;
                return;
            }
            throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
        }

        public final String toString() {
            Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
            toStringHelper.a(Integer.valueOf(this.f11333a), "versionCode");
            toStringHelper.a(Integer.valueOf(this.f11334b), "typeIn");
            toStringHelper.a(Boolean.valueOf(this.c), "typeInArray");
            toStringHelper.a(Integer.valueOf(this.f11335d), "typeOut");
            toStringHelper.a(Boolean.valueOf(this.f11336e), "typeOutArray");
            toStringHelper.a(this.f11337f, "outputFieldName");
            toStringHelper.a(Integer.valueOf(this.f11338g), "safeParcelFieldId");
            String str = this.f11340i;
            if (str == null) {
                str = null;
            }
            toStringHelper.a(str, "concreteTypeName");
            Class cls = this.f11339h;
            if (cls != null) {
                toStringHelper.a(cls.getCanonicalName(), "concreteType.class");
            }
            if (this.f11342k != null) {
                toStringHelper.a(StringToIntConverter.class.getCanonicalName(), "converterName");
            }
            return toStringHelper.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            int o10 = SafeParcelWriter.o(20293, parcel);
            SafeParcelWriter.f(parcel, 1, this.f11333a);
            SafeParcelWriter.f(parcel, 2, this.f11334b);
            SafeParcelWriter.a(parcel, 3, this.c);
            SafeParcelWriter.f(parcel, 4, this.f11335d);
            SafeParcelWriter.a(parcel, 5, this.f11336e);
            SafeParcelWriter.j(parcel, 6, this.f11337f);
            SafeParcelWriter.f(parcel, 7, this.f11338g);
            zaa zaaVar = null;
            String str = this.f11340i;
            if (str == null) {
                str = null;
            }
            SafeParcelWriter.j(parcel, 8, str);
            StringToIntConverter stringToIntConverter = this.f11342k;
            if (stringToIntConverter != null) {
                zaaVar = new zaa(stringToIntConverter);
            }
            SafeParcelWriter.i(parcel, 9, zaaVar, i10);
            SafeParcelWriter.p(o10, parcel);
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @ShowFirstParty
    /* loaded from: classes.dex */
    public interface FieldConverter<I, O> {
    }

    public static final Object g(Field field, Object obj) {
        StringToIntConverter stringToIntConverter = field.f11342k;
        if (stringToIntConverter != null) {
            String str = (String) stringToIntConverter.c.get(((Integer) obj).intValue());
            if (str == null && stringToIntConverter.f11328b.containsKey("gms_unknown")) {
                return "gms_unknown";
            }
            return str;
        }
        return obj;
    }

    public static final void h(StringBuilder sb2, Field field, Object obj) {
        int i10 = field.f11334b;
        if (i10 != 11) {
            if (i10 == 7) {
                sb2.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
                sb2.append(JsonUtils.a((String) obj));
                sb2.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
                return;
            }
            sb2.append(obj);
            return;
        }
        Class cls = field.f11339h;
        Preconditions.j(cls);
        sb2.append(((FastJsonResponse) cls.cast(obj)).toString());
    }

    @KeepForSdk
    public abstract Map<String, Field<?, ?>> a();

    @KeepForSdk
    public final Object b(Field field) {
        boolean z10;
        if (field.f11339h != null) {
            if (d() == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            String str = field.f11337f;
            Object[] objArr = {str};
            if (z10) {
                try {
                    return getClass().getMethod("get" + Character.toUpperCase(str.charAt(0)) + str.substring(1), new Class[0]).invoke(this, new Object[0]);
                } catch (Exception e10) {
                    throw new RuntimeException(e10);
                }
            }
            throw new IllegalStateException(String.format("Concrete field shouldn't be value object: %s", objArr));
        }
        return d();
    }

    @KeepForSdk
    public abstract Object d();

    @KeepForSdk
    public final boolean e(Field field) {
        if (field.f11335d == 11) {
            if (field.f11336e) {
                throw new UnsupportedOperationException("Concrete type arrays not supported");
            }
            throw new UnsupportedOperationException("Concrete types not supported");
        }
        return f();
    }

    @KeepForSdk
    public abstract boolean f();

    @KeepForSdk
    public String toString() {
        Map<String, Field<?, ?>> a10 = a();
        StringBuilder sb2 = new StringBuilder(100);
        for (String str : a10.keySet()) {
            Field<?, ?> field = a10.get(str);
            if (e(field)) {
                Object g10 = g(field, b(field));
                if (sb2.length() == 0) {
                    sb2.append("{");
                } else {
                    sb2.append(",");
                }
                sb2.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
                sb2.append(str);
                sb2.append("\":");
                if (g10 == null) {
                    sb2.append("null");
                } else {
                    switch (field.f11335d) {
                        case 8:
                            sb2.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
                            sb2.append(Base64.encodeToString((byte[]) g10, 0));
                            sb2.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
                            continue;
                        case 9:
                            sb2.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
                            sb2.append(Base64.encodeToString((byte[]) g10, 10));
                            sb2.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
                            continue;
                        case 10:
                            MapUtils.a(sb2, (HashMap) g10);
                            continue;
                        default:
                            if (field.c) {
                                ArrayList arrayList = (ArrayList) g10;
                                sb2.append("[");
                                int size = arrayList.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    if (i10 > 0) {
                                        sb2.append(",");
                                    }
                                    Object obj = arrayList.get(i10);
                                    if (obj != null) {
                                        h(sb2, field, obj);
                                    }
                                }
                                sb2.append("]");
                                break;
                            } else {
                                h(sb2, field, g10);
                                continue;
                            }
                    }
                }
            }
        }
        if (sb2.length() > 0) {
            sb2.append("}");
        } else {
            sb2.append("{}");
        }
        return sb2.toString();
    }
}
