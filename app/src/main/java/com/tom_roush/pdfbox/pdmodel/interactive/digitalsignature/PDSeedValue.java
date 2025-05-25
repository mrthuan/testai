package com.tom_roush.pdfbox.pdmodel.interactive.digitalsignature;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.COSArrayList;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class PDSeedValue implements COSObjectable {
    public static final int FLAG_ADD_REV_INFO = 32;
    public static final int FLAG_DIGEST_METHOD = 64;
    public static final int FLAG_FILTER = 1;
    public static final int FLAG_LEGAL_ATTESTATION = 16;
    public static final int FLAG_REASON = 8;
    public static final int FLAG_SUBFILTER = 2;
    public static final int FLAG_V = 4;
    private final COSDictionary dictionary;

    public PDSeedValue() {
        COSDictionary cOSDictionary = new COSDictionary();
        this.dictionary = cOSDictionary;
        cOSDictionary.setItem(COSName.TYPE, (COSBase) COSName.SV);
        cOSDictionary.setDirect(true);
    }

    public List<String> getDigestMethod() {
        COSArray cOSArray = (COSArray) this.dictionary.getDictionaryObject(COSName.DIGEST_METHOD);
        if (cOSArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < cOSArray.size(); i10++) {
                String name = cOSArray.getName(i10);
                if (name != null) {
                    arrayList.add(name);
                }
            }
            return new COSArrayList(arrayList, cOSArray);
        }
        return null;
    }

    public String getFilter() {
        return this.dictionary.getNameAsString(COSName.FILTER);
    }

    public List<String> getLegalAttestation() {
        COSArray cOSArray = (COSArray) this.dictionary.getDictionaryObject(COSName.LEGAL_ATTESTATION);
        if (cOSArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < cOSArray.size(); i10++) {
                String string = cOSArray.getString(i10);
                if (string != null) {
                    arrayList.add(string);
                }
            }
            return new COSArrayList(arrayList, cOSArray);
        }
        return null;
    }

    public PDSeedValueMDP getMDP() {
        COSDictionary cOSDictionary = this.dictionary.getCOSDictionary(COSName.MDP);
        if (cOSDictionary != null) {
            return new PDSeedValueMDP(cOSDictionary);
        }
        return null;
    }

    public List<String> getReasons() {
        COSArray cOSArray = (COSArray) this.dictionary.getDictionaryObject(COSName.REASONS);
        if (cOSArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < cOSArray.size(); i10++) {
                String string = cOSArray.getString(i10);
                if (string != null) {
                    arrayList.add(string);
                }
            }
            return new COSArrayList(arrayList, cOSArray);
        }
        return null;
    }

    public PDSeedValueCertificate getSeedValueCertificate() {
        COSBase dictionaryObject = this.dictionary.getDictionaryObject(COSName.CERT);
        if (dictionaryObject instanceof COSDictionary) {
            return new PDSeedValueCertificate((COSDictionary) dictionaryObject);
        }
        return null;
    }

    public List<String> getSubFilter() {
        COSArray cOSArray = (COSArray) this.dictionary.getDictionaryObject(COSName.SUB_FILTER);
        if (cOSArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < cOSArray.size(); i10++) {
                String name = cOSArray.getName(i10);
                if (name != null) {
                    arrayList.add(name);
                }
            }
            return new COSArrayList(arrayList, cOSArray);
        }
        return null;
    }

    public PDSeedValueTimeStamp getTimeStamp() {
        COSDictionary cOSDictionary = this.dictionary.getCOSDictionary(COSName.TIME_STAMP);
        if (cOSDictionary != null) {
            return new PDSeedValueTimeStamp(cOSDictionary);
        }
        return null;
    }

    public float getV() {
        return this.dictionary.getFloat(COSName.V);
    }

    public boolean isAddRevInfoRequired() {
        return getCOSObject().getFlag(COSName.FF, 32);
    }

    public boolean isDigestMethodRequired() {
        return getCOSObject().getFlag(COSName.FF, 64);
    }

    public boolean isFilterRequired() {
        return getCOSObject().getFlag(COSName.FF, 1);
    }

    public boolean isLegalAttestationRequired() {
        return getCOSObject().getFlag(COSName.FF, 16);
    }

    public boolean isReasonRequired() {
        return getCOSObject().getFlag(COSName.FF, 8);
    }

    public boolean isSubFilterRequired() {
        return getCOSObject().getFlag(COSName.FF, 2);
    }

    public boolean isVRequired() {
        return getCOSObject().getFlag(COSName.FF, 4);
    }

    public void setAddRevInfoRequired(boolean z10) {
        getCOSObject().setFlag(COSName.FF, 32, z10);
    }

    public void setDigestMethod(List<COSName> list) {
        for (COSName cOSName : list) {
            if (!cOSName.equals(COSName.DIGEST_SHA1) && !cOSName.equals(COSName.DIGEST_SHA256) && !cOSName.equals(COSName.DIGEST_SHA384) && !cOSName.equals(COSName.DIGEST_SHA512) && !cOSName.equals(COSName.DIGEST_RIPEMD160)) {
                throw new IllegalArgumentException("Specified digest " + cOSName.getName() + " isn't allowed.");
            }
        }
        this.dictionary.setItem(COSName.DIGEST_METHOD, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    public void setDigestMethodRequired(boolean z10) {
        getCOSObject().setFlag(COSName.FF, 64, z10);
    }

    public void setFilter(COSName cOSName) {
        this.dictionary.setItem(COSName.FILTER, (COSBase) cOSName);
    }

    public void setFilterRequired(boolean z10) {
        getCOSObject().setFlag(COSName.FF, 1, z10);
    }

    public void setLegalAttestation(List<String> list) {
        this.dictionary.setItem(COSName.LEGAL_ATTESTATION, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    public void setLegalAttestationRequired(boolean z10) {
        getCOSObject().setFlag(COSName.FF, 16, z10);
    }

    public void setMPD(PDSeedValueMDP pDSeedValueMDP) {
        if (pDSeedValueMDP != null) {
            this.dictionary.setItem(COSName.MDP, (COSBase) pDSeedValueMDP.getCOSObject());
        }
    }

    public void setReasonRequired(boolean z10) {
        getCOSObject().setFlag(COSName.FF, 8, z10);
    }

    public void setReasons(List<String> list) {
        this.dictionary.setItem(COSName.REASONS, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    @Deprecated
    public void setReasonsd(List<String> list) {
        setReasons(list);
    }

    public void setSeedValueCertificate(PDSeedValueCertificate pDSeedValueCertificate) {
        this.dictionary.setItem(COSName.CERT, pDSeedValueCertificate);
    }

    public void setSubFilter(List<COSName> list) {
        this.dictionary.setItem(COSName.SUB_FILTER, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    public void setSubFilterRequired(boolean z10) {
        getCOSObject().setFlag(COSName.FF, 2, z10);
    }

    public void setTimeStamp(PDSeedValueTimeStamp pDSeedValueTimeStamp) {
        if (pDSeedValueTimeStamp != null) {
            this.dictionary.setItem(COSName.TIME_STAMP, (COSBase) pDSeedValueTimeStamp.getCOSObject());
        }
    }

    public void setV(float f10) {
        this.dictionary.setFloat(COSName.V, f10);
    }

    public void setVRequired(boolean z10) {
        getCOSObject().setFlag(COSName.FF, 4, z10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.dictionary;
    }

    public PDSeedValue(COSDictionary cOSDictionary) {
        this.dictionary = cOSDictionary;
        cOSDictionary.setDirect(true);
    }
}
