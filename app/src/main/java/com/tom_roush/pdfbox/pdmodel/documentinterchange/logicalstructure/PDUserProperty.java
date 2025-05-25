package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.PDDictionaryWrapper;

/* loaded from: classes2.dex */
public class PDUserProperty extends PDDictionaryWrapper {
    private final PDUserAttributeObject userAttributeObject;

    public PDUserProperty(PDUserAttributeObject pDUserAttributeObject) {
        this.userAttributeObject = pDUserAttributeObject;
    }

    private boolean isEntryChanged(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null) {
                return true;
            }
            return false;
        }
        return !obj.equals(obj2);
    }

    private void potentiallyNotifyChanged(Object obj, Object obj2) {
        if (isEntryChanged(obj, obj2)) {
            this.userAttributeObject.userPropertyChanged(this);
        }
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.PDDictionaryWrapper
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        PDUserProperty pDUserProperty = (PDUserProperty) obj;
        PDUserAttributeObject pDUserAttributeObject = this.userAttributeObject;
        if (pDUserAttributeObject == null) {
            if (pDUserProperty.userAttributeObject != null) {
                return false;
            }
        } else if (!pDUserAttributeObject.equals(pDUserProperty.userAttributeObject)) {
            return false;
        }
        return true;
    }

    public String getFormattedValue() {
        return getCOSObject().getString(COSName.F);
    }

    public String getName() {
        return getCOSObject().getNameAsString(COSName.N);
    }

    public COSBase getValue() {
        return getCOSObject().getDictionaryObject(COSName.V);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.PDDictionaryWrapper
    public int hashCode() {
        int hashCode;
        int hashCode2 = super.hashCode() * 31;
        PDUserAttributeObject pDUserAttributeObject = this.userAttributeObject;
        if (pDUserAttributeObject == null) {
            hashCode = 0;
        } else {
            hashCode = pDUserAttributeObject.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public boolean isHidden() {
        return getCOSObject().getBoolean(COSName.H, false);
    }

    public void setFormattedValue(String str) {
        potentiallyNotifyChanged(getFormattedValue(), str);
        getCOSObject().setString(COSName.F, str);
    }

    public void setHidden(boolean z10) {
        potentiallyNotifyChanged(Boolean.valueOf(isHidden()), Boolean.valueOf(z10));
        getCOSObject().setBoolean(COSName.H, z10);
    }

    public void setName(String str) {
        potentiallyNotifyChanged(getName(), str);
        getCOSObject().setName(COSName.N, str);
    }

    public void setValue(COSBase cOSBase) {
        potentiallyNotifyChanged(getValue(), cOSBase);
        getCOSObject().setItem(COSName.V, cOSBase);
    }

    public String toString() {
        return "Name=" + getName() + ", Value=" + getValue() + ", FormattedValue=" + getFormattedValue() + ", Hidden=" + isHidden();
    }

    public PDUserProperty(COSDictionary cOSDictionary, PDUserAttributeObject pDUserAttributeObject) {
        super(cOSDictionary);
        this.userAttributeObject = pDUserAttributeObject;
    }
}
