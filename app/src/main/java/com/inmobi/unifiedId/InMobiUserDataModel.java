package com.inmobi.unifiedId;

import java.util.HashMap;
import kotlin.jvm.internal.g;

/* loaded from: classes2.dex */
public final class InMobiUserDataModel {

    /* renamed from: a  reason: collision with root package name */
    public final InMobiUserDataTypes f15717a;

    /* renamed from: b  reason: collision with root package name */
    public final InMobiUserDataTypes f15718b;
    public final HashMap c;

    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public InMobiUserDataTypes f15719a;

        /* renamed from: b  reason: collision with root package name */
        public InMobiUserDataTypes f15720b;
        public HashMap c;

        public final InMobiUserDataModel build() {
            return new InMobiUserDataModel(this.f15719a, this.f15720b, this.c);
        }

        public final Builder emailId(InMobiUserDataTypes inMobiUserDataTypes) {
            this.f15720b = inMobiUserDataTypes;
            return this;
        }

        public final Builder extras(HashMap<String, String> hashMap) {
            this.c = hashMap;
            return this;
        }

        public final Builder phoneNumber(InMobiUserDataTypes inMobiUserDataTypes) {
            this.f15719a = inMobiUserDataTypes;
            return this;
        }
    }

    public InMobiUserDataModel(InMobiUserDataTypes inMobiUserDataTypes, InMobiUserDataTypes inMobiUserDataTypes2, HashMap<String, String> hashMap) {
        this.f15717a = inMobiUserDataTypes;
        this.f15718b = inMobiUserDataTypes2;
        this.c = hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InMobiUserDataModel copy$default(InMobiUserDataModel inMobiUserDataModel, InMobiUserDataTypes inMobiUserDataTypes, InMobiUserDataTypes inMobiUserDataTypes2, HashMap hashMap, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            inMobiUserDataTypes = inMobiUserDataModel.f15717a;
        }
        if ((i10 & 2) != 0) {
            inMobiUserDataTypes2 = inMobiUserDataModel.f15718b;
        }
        if ((i10 & 4) != 0) {
            hashMap = inMobiUserDataModel.c;
        }
        return inMobiUserDataModel.copy(inMobiUserDataTypes, inMobiUserDataTypes2, hashMap);
    }

    public final InMobiUserDataTypes component1() {
        return this.f15717a;
    }

    public final InMobiUserDataTypes component2() {
        return this.f15718b;
    }

    public final HashMap<String, String> component3() {
        return this.c;
    }

    public final InMobiUserDataModel copy(InMobiUserDataTypes inMobiUserDataTypes, InMobiUserDataTypes inMobiUserDataTypes2, HashMap<String, String> hashMap) {
        return new InMobiUserDataModel(inMobiUserDataTypes, inMobiUserDataTypes2, hashMap);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InMobiUserDataModel)) {
            return false;
        }
        InMobiUserDataModel inMobiUserDataModel = (InMobiUserDataModel) obj;
        if (g.a(this.f15717a, inMobiUserDataModel.f15717a) && g.a(this.f15718b, inMobiUserDataModel.f15718b) && g.a(this.c, inMobiUserDataModel.c)) {
            return true;
        }
        return false;
    }

    public final InMobiUserDataTypes getEmailId() {
        return this.f15718b;
    }

    public final HashMap<String, String> getExtras() {
        return this.c;
    }

    public final InMobiUserDataTypes getPhoneNumber() {
        return this.f15717a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        InMobiUserDataTypes inMobiUserDataTypes = this.f15717a;
        int i10 = 0;
        if (inMobiUserDataTypes == null) {
            hashCode = 0;
        } else {
            hashCode = inMobiUserDataTypes.hashCode();
        }
        int i11 = hashCode * 31;
        InMobiUserDataTypes inMobiUserDataTypes2 = this.f15718b;
        if (inMobiUserDataTypes2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = inMobiUserDataTypes2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        HashMap hashMap = this.c;
        if (hashMap != null) {
            i10 = hashMap.hashCode();
        }
        return i12 + i10;
    }

    public String toString() {
        return "InMobiUserDataModel(phoneNumber=" + this.f15717a + ", emailId=" + this.f15718b + ", extras=" + this.c + ')';
    }
}
