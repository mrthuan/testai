package com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.outline;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.pdmodel.common.PDDictionaryWrapper;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class PDOutlineNode extends PDDictionaryWrapper {
    public PDOutlineNode() {
    }

    private void append(PDOutlineItem pDOutlineItem) {
        pDOutlineItem.setParent(this);
        if (!hasChildren()) {
            setFirstChild(pDOutlineItem);
        } else {
            PDOutlineItem lastChild = getLastChild();
            lastChild.setNextSibling(pDOutlineItem);
            pDOutlineItem.setPreviousSibling(lastChild);
        }
        setLastChild(pDOutlineItem);
    }

    private void prepend(PDOutlineItem pDOutlineItem) {
        pDOutlineItem.setParent(this);
        if (!hasChildren()) {
            setLastChild(pDOutlineItem);
        } else {
            PDOutlineItem firstChild = getFirstChild();
            pDOutlineItem.setNextSibling(firstChild);
            firstChild.setPreviousSibling(pDOutlineItem);
        }
        setFirstChild(pDOutlineItem);
    }

    private void switchNodeCount() {
        int i10 = -getOpenCount();
        setOpenCount(i10);
        updateParentOpenCount(i10);
    }

    public void addFirst(PDOutlineItem pDOutlineItem) {
        requireSingleNode(pDOutlineItem);
        prepend(pDOutlineItem);
        updateParentOpenCountForAddedChild(pDOutlineItem);
    }

    public void addLast(PDOutlineItem pDOutlineItem) {
        requireSingleNode(pDOutlineItem);
        append(pDOutlineItem);
        updateParentOpenCountForAddedChild(pDOutlineItem);
    }

    public Iterable<PDOutlineItem> children() {
        return new Iterable<PDOutlineItem>() { // from class: com.tom_roush.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineNode.1
            @Override // java.lang.Iterable
            public Iterator<PDOutlineItem> iterator() {
                return new PDOutlineItemIterator(PDOutlineNode.this.getFirstChild());
            }
        };
    }

    public void closeNode() {
        if (isNodeOpen()) {
            switchNodeCount();
        }
    }

    public PDOutlineItem getFirstChild() {
        return getOutlineItem(COSName.FIRST);
    }

    public PDOutlineItem getLastChild() {
        return getOutlineItem(COSName.LAST);
    }

    public int getOpenCount() {
        return getCOSObject().getInt(COSName.COUNT, 0);
    }

    public PDOutlineItem getOutlineItem(COSName cOSName) {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(cOSName);
        if (dictionaryObject instanceof COSDictionary) {
            return new PDOutlineItem((COSDictionary) dictionaryObject);
        }
        return null;
    }

    public PDOutlineNode getParent() {
        COSBase dictionaryObject = getCOSObject().getDictionaryObject(COSName.PARENT);
        if (dictionaryObject instanceof COSDictionary) {
            COSDictionary cOSDictionary = (COSDictionary) dictionaryObject;
            if (COSName.OUTLINES.equals(cOSDictionary.getCOSName(COSName.TYPE))) {
                return new PDDocumentOutline(cOSDictionary);
            }
            return new PDOutlineItem(cOSDictionary);
        }
        return null;
    }

    public boolean hasChildren() {
        if (getFirstChild() != null) {
            return true;
        }
        return false;
    }

    public boolean isNodeOpen() {
        if (getOpenCount() > 0) {
            return true;
        }
        return false;
    }

    public void openNode() {
        if (!isNodeOpen()) {
            switchNodeCount();
        }
    }

    public void requireSingleNode(PDOutlineItem pDOutlineItem) {
        if (pDOutlineItem.getNextSibling() == null && pDOutlineItem.getPreviousSibling() == null) {
            return;
        }
        throw new IllegalArgumentException("A single node with no siblings is required");
    }

    public void setFirstChild(PDOutlineNode pDOutlineNode) {
        getCOSObject().setItem(COSName.FIRST, pDOutlineNode);
    }

    public void setLastChild(PDOutlineNode pDOutlineNode) {
        getCOSObject().setItem(COSName.LAST, pDOutlineNode);
    }

    public void setOpenCount(int i10) {
        getCOSObject().setInt(COSName.COUNT, i10);
    }

    public void setParent(PDOutlineNode pDOutlineNode) {
        getCOSObject().setItem(COSName.PARENT, pDOutlineNode);
    }

    public void updateParentOpenCount(int i10) {
        PDOutlineNode parent = getParent();
        if (parent != null) {
            if (parent.isNodeOpen()) {
                parent.setOpenCount(parent.getOpenCount() + i10);
                parent.updateParentOpenCount(i10);
                return;
            }
            parent.setOpenCount(parent.getOpenCount() - i10);
        }
    }

    public void updateParentOpenCountForAddedChild(PDOutlineItem pDOutlineItem) {
        int i10 = 1;
        if (pDOutlineItem.isNodeOpen()) {
            i10 = 1 + pDOutlineItem.getOpenCount();
        }
        pDOutlineItem.updateParentOpenCount(i10);
    }

    public PDOutlineNode(COSDictionary cOSDictionary) {
        super(cOSDictionary);
    }
}
