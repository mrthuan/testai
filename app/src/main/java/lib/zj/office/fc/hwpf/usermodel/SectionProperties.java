package lib.zj.office.fc.hwpf.usermodel;

import java.lang.reflect.AccessibleObject;
import lib.zj.office.fc.hwpf.model.types.SEPAbstractType;

/* loaded from: classes3.dex */
public final class SectionProperties extends SEPAbstractType {
    public SectionProperties() {
        this.field_20_brcTop = new BorderCode();
        this.field_21_brcLeft = new BorderCode();
        this.field_22_brcBottom = new BorderCode();
        this.field_23_brcRight = new BorderCode();
        this.field_26_dttmPropRMark = new DateAndTime();
    }

    public Object clone() {
        SectionProperties sectionProperties = (SectionProperties) super.clone();
        sectionProperties.field_20_brcTop = (BorderCode) this.field_20_brcTop.clone();
        sectionProperties.field_21_brcLeft = (BorderCode) this.field_21_brcLeft.clone();
        sectionProperties.field_22_brcBottom = (BorderCode) this.field_22_brcBottom.clone();
        sectionProperties.field_23_brcRight = (BorderCode) this.field_23_brcRight.clone();
        sectionProperties.field_26_dttmPropRMark = (DateAndTime) this.field_26_dttmPropRMark.clone();
        return sectionProperties;
    }

    public boolean equals(Object obj) {
        java.lang.reflect.Field[] declaredFields = SectionProperties.class.getSuperclass().getDeclaredFields();
        AccessibleObject.setAccessible(declaredFields, true);
        for (int i10 = 0; i10 < declaredFields.length; i10++) {
            try {
                Object obj2 = declaredFields[i10].get(this);
                Object obj3 = declaredFields[i10].get(obj);
                if ((obj2 != null || obj3 != null) && !obj2.equals(obj3)) {
                    return false;
                }
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }

    public BorderCode getBottomBorder() {
        return this.field_22_brcBottom;
    }

    public BorderCode getLeftBorder() {
        return this.field_21_brcLeft;
    }

    public BorderCode getRightBorder() {
        return this.field_23_brcRight;
    }

    public int getSectionBorder() {
        return getPgbProp();
    }

    public BorderCode getTopBorder() {
        return this.field_20_brcTop;
    }
}
