package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.SparseArray;
import b.a;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@KeepForSdk
@SafeParcelable.Class
/* loaded from: classes.dex */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    @KeepForSdk
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new zaq();
    @SafeParcelable.VersionField

    /* renamed from: a  reason: collision with root package name */
    public final int f11343a;
    @SafeParcelable.Field

    /* renamed from: b  reason: collision with root package name */
    public final Parcel f11344b;
    public final int c;
    @SafeParcelable.Field

    /* renamed from: d  reason: collision with root package name */
    public final zan f11345d;

    /* renamed from: e  reason: collision with root package name */
    public final String f11346e;

    /* renamed from: f  reason: collision with root package name */
    public int f11347f;

    /* renamed from: g  reason: collision with root package name */
    public int f11348g;

    @SafeParcelable.Constructor
    public SafeParcelResponse(@SafeParcelable.Param int i10, @SafeParcelable.Param Parcel parcel, @SafeParcelable.Param zan zanVar) {
        String str;
        this.f11343a = i10;
        Preconditions.j(parcel);
        this.f11344b = parcel;
        this.c = 2;
        this.f11345d = zanVar;
        if (zanVar == null) {
            str = null;
        } else {
            str = zanVar.c;
        }
        this.f11346e = str;
        this.f11347f = 2;
    }

    public static void j(StringBuilder sb2, Map map, Parcel parcel) {
        boolean z10;
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((FastJsonResponse.Field) entry.getValue()).f11338g, entry);
        }
        sb2.append('{');
        int t4 = SafeParcelReader.t(parcel);
        boolean z11 = false;
        while (parcel.dataPosition() < t4) {
            int readInt = parcel.readInt();
            Map.Entry entry2 = (Map.Entry) sparseArray.get((char) readInt);
            if (entry2 != null) {
                if (z11) {
                    sb2.append(",");
                }
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry2.getValue();
                sb2.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
                sb2.append((String) entry2.getKey());
                sb2.append("\":");
                if (field.f11342k != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                BigInteger bigInteger = null;
                BigInteger bigInteger2 = null;
                Parcel[] parcelArr = null;
                boolean[] zArr = null;
                BigDecimal[] bigDecimalArr = null;
                double[] dArr = null;
                float[] fArr = null;
                long[] jArr = null;
                BigInteger[] bigIntegerArr = null;
                Parcel parcel2 = null;
                String str = null;
                String str2 = null;
                int i10 = field.f11335d;
                if (z10) {
                    switch (i10) {
                        case 0:
                            l(sb2, field, FastJsonResponse.g(field, Integer.valueOf(SafeParcelReader.o(readInt, parcel))));
                            break;
                        case 1:
                            int r4 = SafeParcelReader.r(readInt, parcel);
                            int dataPosition = parcel.dataPosition();
                            if (r4 != 0) {
                                byte[] createByteArray = parcel.createByteArray();
                                parcel.setDataPosition(dataPosition + r4);
                                bigInteger2 = new BigInteger(createByteArray);
                            }
                            l(sb2, field, FastJsonResponse.g(field, bigInteger2));
                            break;
                        case 2:
                            l(sb2, field, FastJsonResponse.g(field, Long.valueOf(SafeParcelReader.p(readInt, parcel))));
                            break;
                        case 3:
                            l(sb2, field, FastJsonResponse.g(field, Float.valueOf(SafeParcelReader.m(readInt, parcel))));
                            break;
                        case 4:
                            SafeParcelReader.v(parcel, readInt, 8);
                            l(sb2, field, FastJsonResponse.g(field, Double.valueOf(parcel.readDouble())));
                            break;
                        case 5:
                            l(sb2, field, FastJsonResponse.g(field, SafeParcelReader.a(readInt, parcel)));
                            break;
                        case 6:
                            l(sb2, field, FastJsonResponse.g(field, Boolean.valueOf(SafeParcelReader.l(readInt, parcel))));
                            break;
                        case 7:
                            l(sb2, field, FastJsonResponse.g(field, SafeParcelReader.f(readInt, parcel)));
                            break;
                        case 8:
                        case 9:
                            l(sb2, field, FastJsonResponse.g(field, SafeParcelReader.c(readInt, parcel)));
                            break;
                        case 10:
                            Bundle b10 = SafeParcelReader.b(readInt, parcel);
                            HashMap hashMap = new HashMap();
                            for (String str3 : b10.keySet()) {
                                String string = b10.getString(str3);
                                Preconditions.j(string);
                                hashMap.put(str3, string);
                            }
                            l(sb2, field, FastJsonResponse.g(field, hashMap));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException(a.c("Unknown field out type = ", i10));
                    }
                } else {
                    boolean z12 = field.f11336e;
                    String str4 = field.f11340i;
                    if (z12) {
                        sb2.append("[");
                        switch (i10) {
                            case 0:
                                int[] d10 = SafeParcelReader.d(readInt, parcel);
                                int length = d10.length;
                                for (int i11 = 0; i11 < length; i11++) {
                                    if (i11 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(d10[i11]);
                                }
                                break;
                            case 1:
                                int r10 = SafeParcelReader.r(readInt, parcel);
                                int dataPosition2 = parcel.dataPosition();
                                if (r10 != 0) {
                                    int readInt2 = parcel.readInt();
                                    bigIntegerArr = new BigInteger[readInt2];
                                    for (int i12 = 0; i12 < readInt2; i12++) {
                                        bigIntegerArr[i12] = new BigInteger(parcel.createByteArray());
                                    }
                                    parcel.setDataPosition(dataPosition2 + r10);
                                }
                                int length2 = bigIntegerArr.length;
                                for (int i13 = 0; i13 < length2; i13++) {
                                    if (i13 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(bigIntegerArr[i13]);
                                }
                                break;
                            case 2:
                                int r11 = SafeParcelReader.r(readInt, parcel);
                                int dataPosition3 = parcel.dataPosition();
                                if (r11 != 0) {
                                    jArr = parcel.createLongArray();
                                    parcel.setDataPosition(dataPosition3 + r11);
                                }
                                int length3 = jArr.length;
                                for (int i14 = 0; i14 < length3; i14++) {
                                    if (i14 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(jArr[i14]);
                                }
                                break;
                            case 3:
                                int r12 = SafeParcelReader.r(readInt, parcel);
                                int dataPosition4 = parcel.dataPosition();
                                if (r12 != 0) {
                                    fArr = parcel.createFloatArray();
                                    parcel.setDataPosition(dataPosition4 + r12);
                                }
                                int length4 = fArr.length;
                                for (int i15 = 0; i15 < length4; i15++) {
                                    if (i15 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(fArr[i15]);
                                }
                                break;
                            case 4:
                                int r13 = SafeParcelReader.r(readInt, parcel);
                                int dataPosition5 = parcel.dataPosition();
                                if (r13 != 0) {
                                    dArr = parcel.createDoubleArray();
                                    parcel.setDataPosition(dataPosition5 + r13);
                                }
                                int length5 = dArr.length;
                                for (int i16 = 0; i16 < length5; i16++) {
                                    if (i16 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(dArr[i16]);
                                }
                                break;
                            case 5:
                                int r14 = SafeParcelReader.r(readInt, parcel);
                                int dataPosition6 = parcel.dataPosition();
                                if (r14 != 0) {
                                    int readInt3 = parcel.readInt();
                                    bigDecimalArr = new BigDecimal[readInt3];
                                    for (int i17 = 0; i17 < readInt3; i17++) {
                                        byte[] createByteArray2 = parcel.createByteArray();
                                        bigDecimalArr[i17] = new BigDecimal(new BigInteger(createByteArray2), parcel.readInt());
                                    }
                                    parcel.setDataPosition(dataPosition6 + r14);
                                }
                                int length6 = bigDecimalArr.length;
                                for (int i18 = 0; i18 < length6; i18++) {
                                    if (i18 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(bigDecimalArr[i18]);
                                }
                                break;
                            case 6:
                                int r15 = SafeParcelReader.r(readInt, parcel);
                                int dataPosition7 = parcel.dataPosition();
                                if (r15 != 0) {
                                    zArr = parcel.createBooleanArray();
                                    parcel.setDataPosition(dataPosition7 + r15);
                                }
                                int length7 = zArr.length;
                                for (int i19 = 0; i19 < length7; i19++) {
                                    if (i19 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(zArr[i19]);
                                }
                                break;
                            case 7:
                                String[] g10 = SafeParcelReader.g(readInt, parcel);
                                int length8 = g10.length;
                                for (int i20 = 0; i20 < length8; i20++) {
                                    if (i20 != 0) {
                                        sb2.append(",");
                                    }
                                    sb2.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
                                    sb2.append(g10[i20]);
                                    sb2.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
                                }
                                break;
                            case 8:
                            case 9:
                            case 10:
                                throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                            case 11:
                                int r16 = SafeParcelReader.r(readInt, parcel);
                                int dataPosition8 = parcel.dataPosition();
                                if (r16 != 0) {
                                    int readInt4 = parcel.readInt();
                                    Parcel[] parcelArr2 = new Parcel[readInt4];
                                    for (int i21 = 0; i21 < readInt4; i21++) {
                                        int readInt5 = parcel.readInt();
                                        if (readInt5 != 0) {
                                            int dataPosition9 = parcel.dataPosition();
                                            Parcel obtain = Parcel.obtain();
                                            obtain.appendFrom(parcel, dataPosition9, readInt5);
                                            parcelArr2[i21] = obtain;
                                            parcel.setDataPosition(dataPosition9 + readInt5);
                                        } else {
                                            parcelArr2[i21] = null;
                                        }
                                    }
                                    parcel.setDataPosition(dataPosition8 + r16);
                                    parcelArr = parcelArr2;
                                }
                                int length9 = parcelArr.length;
                                for (int i22 = 0; i22 < length9; i22++) {
                                    if (i22 > 0) {
                                        sb2.append(",");
                                    }
                                    parcelArr[i22].setDataPosition(0);
                                    Preconditions.j(str4);
                                    Preconditions.j(field.f11341j);
                                    Map map2 = (Map) field.f11341j.f11354b.get(str4);
                                    Preconditions.j(map2);
                                    j(sb2, map2, parcelArr[i22]);
                                }
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out.");
                        }
                        sb2.append("]");
                    } else {
                        switch (i10) {
                            case 0:
                                sb2.append(SafeParcelReader.o(readInt, parcel));
                                break;
                            case 1:
                                int r17 = SafeParcelReader.r(readInt, parcel);
                                int dataPosition10 = parcel.dataPosition();
                                if (r17 != 0) {
                                    byte[] createByteArray3 = parcel.createByteArray();
                                    parcel.setDataPosition(dataPosition10 + r17);
                                    bigInteger = new BigInteger(createByteArray3);
                                }
                                sb2.append(bigInteger);
                                break;
                            case 2:
                                sb2.append(SafeParcelReader.p(readInt, parcel));
                                break;
                            case 3:
                                sb2.append(SafeParcelReader.m(readInt, parcel));
                                break;
                            case 4:
                                SafeParcelReader.v(parcel, readInt, 8);
                                sb2.append(parcel.readDouble());
                                break;
                            case 5:
                                sb2.append(SafeParcelReader.a(readInt, parcel));
                                break;
                            case 6:
                                sb2.append(SafeParcelReader.l(readInt, parcel));
                                break;
                            case 7:
                                String f10 = SafeParcelReader.f(readInt, parcel);
                                sb2.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
                                sb2.append(JsonUtils.a(f10));
                                sb2.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
                                break;
                            case 8:
                                byte[] c = SafeParcelReader.c(readInt, parcel);
                                sb2.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
                                if (c != null) {
                                    str2 = Base64.encodeToString(c, 0);
                                }
                                sb2.append(str2);
                                sb2.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
                                break;
                            case 9:
                                byte[] c10 = SafeParcelReader.c(readInt, parcel);
                                sb2.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
                                if (c10 != null) {
                                    str = Base64.encodeToString(c10, 10);
                                }
                                sb2.append(str);
                                sb2.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
                                break;
                            case 10:
                                Bundle b11 = SafeParcelReader.b(readInt, parcel);
                                Set<String> keySet = b11.keySet();
                                sb2.append("{");
                                boolean z13 = true;
                                for (String str5 : keySet) {
                                    if (!z13) {
                                        sb2.append(",");
                                    }
                                    sb2.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
                                    sb2.append(str5);
                                    sb2.append("\":\"");
                                    sb2.append(JsonUtils.a(b11.getString(str5)));
                                    sb2.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
                                    z13 = false;
                                }
                                sb2.append("}");
                                break;
                            case 11:
                                int r18 = SafeParcelReader.r(readInt, parcel);
                                int dataPosition11 = parcel.dataPosition();
                                if (r18 != 0) {
                                    parcel2 = Parcel.obtain();
                                    parcel2.appendFrom(parcel, dataPosition11, r18);
                                    parcel.setDataPosition(dataPosition11 + r18);
                                }
                                parcel2.setDataPosition(0);
                                Preconditions.j(str4);
                                Preconditions.j(field.f11341j);
                                Map map3 = (Map) field.f11341j.f11354b.get(str4);
                                Preconditions.j(map3);
                                j(sb2, map3, parcel2);
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out");
                        }
                    }
                }
                z11 = true;
            }
        }
        if (parcel.dataPosition() == t4) {
            sb2.append('}');
            return;
        }
        throw new SafeParcelReader.ParseException(a.c("Overread allowed size end=", t4), parcel);
    }

    public static final void k(StringBuilder sb2, int i10, Object obj) {
        String str = null;
        switch (i10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb2.append(obj);
                return;
            case 7:
                sb2.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
                Preconditions.j(obj);
                sb2.append(JsonUtils.a(obj.toString()));
                sb2.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
                return;
            case 8:
                sb2.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
                byte[] bArr = (byte[]) obj;
                if (bArr != null) {
                    str = Base64.encodeToString(bArr, 0);
                }
                sb2.append(str);
                sb2.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
                return;
            case 9:
                sb2.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
                byte[] bArr2 = (byte[]) obj;
                if (bArr2 != null) {
                    str = Base64.encodeToString(bArr2, 10);
                }
                sb2.append(str);
                sb2.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
                return;
            case 10:
                Preconditions.j(obj);
                MapUtils.a(sb2, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException(a.c("Unknown type = ", i10));
        }
    }

    public static final void l(StringBuilder sb2, FastJsonResponse.Field field, Object obj) {
        boolean z10 = field.c;
        int i10 = field.f11334b;
        if (z10) {
            ArrayList arrayList = (ArrayList) obj;
            sb2.append("[");
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (i11 != 0) {
                    sb2.append(",");
                }
                k(sb2, i10, arrayList.get(i11));
            }
            sb2.append("]");
            return;
        }
        k(sb2, i10, obj);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Map<String, FastJsonResponse.Field<?, ?>> a() {
        zan zanVar = this.f11345d;
        if (zanVar == null) {
            return null;
        }
        String str = this.f11346e;
        Preconditions.j(str);
        return (Map) zanVar.f11354b.get(str);
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final Object d() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean f() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public final Parcel i() {
        int i10 = this.f11347f;
        Parcel parcel = this.f11344b;
        if (i10 != 0) {
            if (i10 == 1) {
                SafeParcelWriter.p(this.f11348g, parcel);
                this.f11347f = 2;
            }
        } else {
            int o10 = SafeParcelWriter.o(20293, parcel);
            this.f11348g = o10;
            SafeParcelWriter.p(o10, parcel);
            this.f11347f = 2;
        }
        return parcel;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final String toString() {
        zan zanVar = this.f11345d;
        Preconditions.k(zanVar, "Cannot convert to JSON on client side.");
        Parcel i10 = i();
        i10.setDataPosition(0);
        StringBuilder sb2 = new StringBuilder(100);
        String str = this.f11346e;
        Preconditions.j(str);
        Map map = (Map) zanVar.f11354b.get(str);
        Preconditions.j(map);
        j(sb2, map, i10);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        zan zanVar;
        int o10 = SafeParcelWriter.o(20293, parcel);
        SafeParcelWriter.f(parcel, 1, this.f11343a);
        Parcel i11 = i();
        if (i11 != null) {
            int o11 = SafeParcelWriter.o(2, parcel);
            parcel.appendFrom(i11, 0, i11.dataSize());
            SafeParcelWriter.p(o11, parcel);
        }
        if (this.c != 0) {
            zanVar = this.f11345d;
        } else {
            zanVar = null;
        }
        SafeParcelWriter.i(parcel, 3, zanVar, i10);
        SafeParcelWriter.p(o10, parcel);
    }
}
