package com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.outline;

import com.tom_roush.harmony.awt.AWTColor;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSFloat;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.PDDocument;
import com.tom_roush.pdfbox.pdmodel.PDPage;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDColor;
import com.tom_roush.pdfbox.pdmodel.graphics.color.PDDeviceRGB;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDAction;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDActionFactory;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDActionGoTo;
import com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.destination.PDDestination;
import com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.destination.PDNamedDestination;
import com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageDestination;
import com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageXYZDestination;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class PDOutlineItem extends PDOutlineNode {
    private static final int BOLD_FLAG = 2;
    private static final int ITALIC_FLAG = 1;

    public PDOutlineItem() {
    }

    public PDPage findDestinationPage(PDDocument pDDocument) {
        PDPageDestination pDPageDestination;
        int pageNumber;
        PDDestination destination = getDestination();
        if (destination == null) {
            PDAction action = getAction();
            if (action instanceof PDActionGoTo) {
                destination = ((PDActionGoTo) action).getDestination();
            }
        }
        if (destination == null) {
            return null;
        }
        if (destination instanceof PDNamedDestination) {
            pDPageDestination = pDDocument.getDocumentCatalog().findNamedDestinationPage((PDNamedDestination) destination);
            if (pDPageDestination == null) {
                return null;
            }
        } else if (destination instanceof PDPageDestination) {
            pDPageDestination = (PDPageDestination) destination;
        } else {
            throw new IOException("Error: Unknown destination type " + destination);
        }
        PDPage page = pDPageDestination.getPage();
        if (page == null && (pageNumber = pDPageDestination.getPageNumber()) != -1) {
            return pDDocument.getPage(pageNumber);
        }
        return page;
    }

    public PDAction getAction() {
        return PDActionFactory.createAction((COSDictionary) getCOSObject().getDictionaryObject(COSName.A));
    }

    public PDDestination getDestination() {
        return PDDestination.create(getCOSObject().getDictionaryObject(COSName.DEST));
    }

    public PDOutlineItem getNextSibling() {
        return getOutlineItem(COSName.NEXT);
    }

    public PDOutlineItem getPreviousSibling() {
        return getOutlineItem(COSName.PREV);
    }

    public PDStructureElement getStructureElement() {
        COSDictionary cOSDictionary = (COSDictionary) getCOSObject().getDictionaryObject(COSName.SE);
        if (cOSDictionary != null) {
            return new PDStructureElement(cOSDictionary);
        }
        return null;
    }

    public PDColor getTextColor() {
        COSDictionary cOSObject = getCOSObject();
        COSName cOSName = COSName.C;
        COSArray cOSArray = (COSArray) cOSObject.getDictionaryObject(cOSName);
        if (cOSArray == null) {
            cOSArray = new COSArray();
            cOSArray.growToSize(3, new COSFloat(0.0f));
            getCOSObject().setItem(cOSName, (COSBase) cOSArray);
        }
        return new PDColor(cOSArray, PDDeviceRGB.INSTANCE);
    }

    public String getTitle() {
        return getCOSObject().getString(COSName.TITLE);
    }

    public void insertSiblingAfter(PDOutlineItem pDOutlineItem) {
        requireSingleNode(pDOutlineItem);
        PDOutlineNode parent = getParent();
        pDOutlineItem.setParent(parent);
        PDOutlineItem nextSibling = getNextSibling();
        setNextSibling(pDOutlineItem);
        pDOutlineItem.setPreviousSibling(this);
        if (nextSibling != null) {
            pDOutlineItem.setNextSibling(nextSibling);
            nextSibling.setPreviousSibling(pDOutlineItem);
        } else if (parent != null) {
            getParent().setLastChild(pDOutlineItem);
        }
        updateParentOpenCountForAddedChild(pDOutlineItem);
    }

    public void insertSiblingBefore(PDOutlineItem pDOutlineItem) {
        requireSingleNode(pDOutlineItem);
        PDOutlineNode parent = getParent();
        pDOutlineItem.setParent(parent);
        PDOutlineItem previousSibling = getPreviousSibling();
        setPreviousSibling(pDOutlineItem);
        pDOutlineItem.setNextSibling(this);
        if (previousSibling != null) {
            previousSibling.setNextSibling(pDOutlineItem);
            pDOutlineItem.setPreviousSibling(previousSibling);
        } else if (parent != null) {
            getParent().setFirstChild(pDOutlineItem);
        }
        updateParentOpenCountForAddedChild(pDOutlineItem);
    }

    public boolean isBold() {
        return getCOSObject().getFlag(COSName.F, 2);
    }

    public boolean isItalic() {
        return getCOSObject().getFlag(COSName.F, 1);
    }

    public void setAction(PDAction pDAction) {
        getCOSObject().setItem(COSName.A, pDAction);
    }

    public void setBold(boolean z10) {
        getCOSObject().setFlag(COSName.F, 2, z10);
    }

    public void setDestination(PDDestination pDDestination) {
        getCOSObject().setItem(COSName.DEST, pDDestination);
    }

    public void setItalic(boolean z10) {
        getCOSObject().setFlag(COSName.F, 1, z10);
    }

    public void setNextSibling(PDOutlineNode pDOutlineNode) {
        getCOSObject().setItem(COSName.NEXT, pDOutlineNode);
    }

    public void setPreviousSibling(PDOutlineNode pDOutlineNode) {
        getCOSObject().setItem(COSName.PREV, pDOutlineNode);
    }

    public void setStructureElement(PDStructureElement pDStructureElement) {
        getCOSObject().setItem(COSName.SE, pDStructureElement);
    }

    public void setTextColor(PDColor pDColor) {
        getCOSObject().setItem(COSName.C, (COSBase) pDColor.toCOSArray());
    }

    public void setTitle(String str) {
        getCOSObject().setString(COSName.TITLE, str);
    }

    public PDOutlineItem(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }

    public void setDestination(PDPage pDPage) {
        PDPageXYZDestination pDPageXYZDestination;
        if (pDPage != null) {
            pDPageXYZDestination = new PDPageXYZDestination();
            pDPageXYZDestination.setPage(pDPage);
        } else {
            pDPageXYZDestination = null;
        }
        setDestination(pDPageXYZDestination);
    }

    public void setTextColor(AWTColor aWTColor) {
        COSArray cOSArray = new COSArray();
        cOSArray.add((COSBase) new COSFloat(aWTColor.getRed() / 255.0f));
        cOSArray.add((COSBase) new COSFloat(aWTColor.getGreen() / 255.0f));
        cOSArray.add((COSBase) new COSFloat(aWTColor.getBlue() / 255.0f));
        getCOSObject().setItem(COSName.C, (COSBase) cOSArray);
    }
}
