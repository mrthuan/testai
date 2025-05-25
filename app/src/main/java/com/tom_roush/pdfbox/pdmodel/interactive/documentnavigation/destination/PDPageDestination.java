package com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.destination;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.PDPageTree;

/* loaded from: classes2.dex */
public abstract class PDPageDestination extends PDDestination {
    protected COSArray array;

    public PDPageDestination() {
        this.array = new COSArray();
    }

    private int indexOfPageTree(COSDictionary cOSDictionary) {
        COSDictionary cOSDictionary2 = cOSDictionary;
        while (true) {
            COSName cOSName = COSName.PARENT;
            COSName cOSName2 = COSName.P;
            if (!(cOSDictionary2.getDictionaryObject(cOSName, cOSName2) instanceof COSDictionary)) {
                break;
            }
            cOSDictionary2 = (COSDictionary) cOSDictionary2.getDictionaryObject(cOSName, cOSName2);
        }
        if (cOSDictionary2.containsKey(COSName.KIDS) && COSName.PAGES.equals(cOSDictionary2.getItem(COSName.TYPE))) {
            return new PDPageTree(cOSDictionary2).indexOf(new PDPage(cOSDictionary));
        }
        return -1;
    }

    @Deprecated
    public int findPageNumber() {
        if (this.array.size() > 0) {
            COSBase object = this.array.getObject(0);
            if (object instanceof COSNumber) {
                return ((COSNumber) object).intValue();
            }
            if (object instanceof COSDictionary) {
                COSBase cOSBase = object;
                while (true) {
                    COSDictionary cOSDictionary = (COSDictionary) cOSBase;
                    COSName cOSName = COSName.PARENT;
                    COSName cOSName2 = COSName.P;
                    if (cOSDictionary.getDictionaryObject(cOSName, cOSName2) != null) {
                        cOSBase = cOSDictionary.getDictionaryObject(cOSName, cOSName2);
                    } else {
                        return new PDPageTree(cOSDictionary).indexOf(new PDPage((COSDictionary) object)) + 1;
                    }
                }
            }
        }
        return -1;
    }

    public PDPage getPage() {
        if (this.array.size() > 0) {
            COSBase object = this.array.getObject(0);
            if (object instanceof COSDictionary) {
                return new PDPage((COSDictionary) object);
            }
        }
        return null;
    }

    public int getPageNumber() {
        if (this.array.size() > 0) {
            COSBase object = this.array.getObject(0);
            if (object instanceof COSNumber) {
                return ((COSNumber) object).intValue();
            }
        }
        return -1;
    }

    public int retrievePageNumber() {
        if (this.array.size() > 0) {
            COSBase object = this.array.getObject(0);
            if (object instanceof COSNumber) {
                return ((COSNumber) object).intValue();
            }
            if (object instanceof COSDictionary) {
                return indexOfPageTree((COSDictionary) object);
            }
        }
        return -1;
    }

    public void setPage(PDPage pDPage) {
        this.array.set(0, pDPage);
    }

    public void setPageNumber(int i10) {
        this.array.set(0, i10);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSArray getCOSObject() {
        return this.array;
    }

    public PDPageDestination(COSArray cOSArray) {
        this.array = cOSArray;
    }
}
